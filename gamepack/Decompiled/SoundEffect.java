public class SoundEffect {
   Instrument[] an = new Instrument[10];
   int ac;
   int aw;

   public static SoundEffect readSoundEffect(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.takeFile(var1, var2);
      return var3 == null ? null : new SoundEffect(new Packet(var3));
   }

   SoundEffect(Packet var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.g1();
         if (var3 != 0) {
            var1.at -= -1516355947;
            this.an[var2] = new Instrument();
            this.an[var2].decode(var1);
         }
      }

      this.aw = var1.cl();
      this.ac = var1.cl();
   }

   public RawSound toRawSound() {
      byte[] var1 = this.mix();
      return new RawSound(22050, var1, 22050 * this.aw / 1000, 22050 * this.ac / 1000);
   }

   public final int aw() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.an[var2] != null && this.an[var2].av / 20 < var1) {
            var1 = this.an[var2].av / 20;
         }
      }

      if (this.aw < this.ac && this.aw / 20 < var1) {
         var1 = this.aw / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.an[var2] != null) {
               Instrument var10000 = this.an[var2];
               var10000.av -= var1 * 20;
            }
         }

         if (this.aw < this.ac) {
            this.aw -= var1 * 20;
            this.ac -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] mix() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.an[var2] != null && this.an[var2].ah + this.an[var2].av > var1) {
            var1 = this.an[var2].ah + this.an[var2].av;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.an[var4] != null) {
               int var5 = this.an[var4].ah * 22050 / 1000;
               int var6 = this.an[var4].av * 22050 / 1000;
               int[] var7 = this.an[var4].synthesize(var5, this.an[var4].ah);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }
}
