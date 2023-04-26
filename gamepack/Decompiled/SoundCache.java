public class SoundCache {
   AbstractArchive af;
   AbstractArchive an;
   NodeHashTable ac = new NodeHashTable(256);
   NodeHashTable aw = new NodeHashTable(256);

   public SoundCache(AbstractArchive var1, AbstractArchive var2) {
      this.af = var1;
      this.an = var2;
   }

   RawSound af(int var1, int var2, int[] var3) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5;
      RawSound var8 = (RawSound)this.ac.get(var6);
      if (var8 != null) {
         return var8;
      } else if (null != var3 && var3[0] <= 0) {
         return null;
      } else {
         SoundEffect var9 = SoundEffect.readSoundEffect(this.af, var1, var2);
         if (var9 == null) {
            return null;
         } else {
            var8 = var9.toRawSound();
            this.ac.put(var8, var6);
            if (var3 != null) {
               var3[0] -= var8.samples.length;
            }

            return var8;
         }
      }
   }

   RawSound an(int var1, int var2, int[] var3) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5 ^ 4294967296L;
      RawSound var8 = (RawSound)this.ac.get(var6);
      if (null != var8) {
         return var8;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         VorbisSample var9 = (VorbisSample)this.aw.get(var6);
         if (null == var9) {
            var9 = VorbisSample.readVorbisSample(this.an, var1, var2);
            if (var9 == null) {
               return null;
            }

            this.aw.put(var9, var6);
         }

         var8 = var9.toRawSound(var3);
         if (var8 == null) {
            return null;
         } else {
            var9.remove();
            this.ac.put(var8, var6);
            return var8;
         }
      }
   }

   public RawSound aw(int var1, int[] var2) {
      if (this.af.cm() == 1) {
         return this.af(0, var1, var2);
      } else if (this.af.cq(var1) == 1) {
         return this.af(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   public RawSound ac(int var1, int[] var2) {
      if (this.an.cm() == 1) {
         return this.an(0, var1, var2);
      } else if (this.an.cq(var1) == 1) {
         return this.an(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }
}
