package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.Digest;

public class DigestRandomGenerator implements RandomGenerator {
   Digest digest;
   long stateCounter;
   long seedCounter;
   byte[] seed;
   byte[] state;
   static long CYCLE_COUNT = 10L;

   public void addSeedMaterial(byte[] var1) {
      synchronized(this) {
         this.digestUpdate(var1);
         this.digestUpdate(this.seed);
         this.digestDoFinal(this.seed);
      }
   }

   void generateState() {
      this.digestAddCounter((long)(this.stateCounter++));
      this.digestUpdate(this.state);
      this.digestUpdate(this.seed);
      this.digestDoFinal(this.state);
      if (this.stateCounter % CYCLE_COUNT == 0L) {
         this.cycleSeed();
      }

   }

   void digestUpdate(byte[] var1) {
      this.digest.update(var1, 0, var1.length);
   }

   void digestAddCounter(long var1) {
      for(int var3 = 0; var3 != 8; ++var3) {
         this.digest.update((byte)((int)var1));
         var1 >>>= 8;
      }

   }

   public void nextBytes(byte[] var1, int var2, int var3) {
      synchronized(this) {
         int var5 = 0;
         this.generateState();
         int var6 = var2 + var3;

         for(int var7 = var2; var7 != var6; ++var7) {
            if (var5 == this.state.length) {
               this.generateState();
               var5 = 0;
            }

            var1[var7] = this.state[var5++];
         }

      }
   }

   void cycleSeed() {
      this.digestUpdate(this.seed);
      this.digestAddCounter((long)(this.seedCounter++));
      this.digestDoFinal(this.seed);
   }

   public void nextBytes(byte[] var1) {
      this.nextBytes(var1, 0, var1.length);
   }

   public void addSeedMaterial(long var1) {
      synchronized(this) {
         this.digestAddCounter(var1);
         this.digestUpdate(this.seed);
         this.digestDoFinal(this.seed);
      }
   }

   public DigestRandomGenerator(Digest var1) {
      this.digest = var1;
      this.seed = new byte[var1.getDigestSize()];
      this.seedCounter = 1L;
      this.state = new byte[var1.getDigestSize()];
      this.stateCounter = 1L;
   }

   void digestDoFinal(byte[] var1) {
      this.digest.doFinal(var1, 0);
   }
}
