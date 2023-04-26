public class gx {
   static int ut;
   public short[] ac;
   public short[] aw;

   gx(int var1) {
      ObjType var2 = HeadbarUpdate.getObjType(var1);
      if (var2.ak()) {
         this.aw = new short[var2.recol_d.length];
         System.arraycopy(var2.recol_d, 0, this.aw, 0, this.aw.length);
      }

      if (var2.az()) {
         this.ac = new short[var2.retex_d.length];
         System.arraycopy(var2.retex_d, 0, this.ac, 0, this.ac.length);
      }

   }

   public static int bw_renamed(String var0) {
      return var0.length() + 2;
   }

   static Sprite at_renamed() {
      Sprite var1 = new Sprite();
      var1.width = -822007097 * tx.an;
      var1.height = tx.aw * 378525975;
      var1.yOffset = tx.ac[0];
      var1.xOffset = ar.au[0];
      var1.subWidth = dd.ab[0];
      var1.subHeight = fd.aq[0];
      int var2 = var1.subHeight * var1.subWidth;
      byte[] var3 = VarBitType.at[0];
      var1.pixels = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var1.pixels[var4] = pc.al[var3[var4] & 255];
      }

      pk.ay_renamed();
      return var1;
   }

   public static void ac_renamed(Packet var0, int var1) {
      if (null != gc.randomDat) {
         try {
            gc.randomDat.seek(0L);
            gc.randomDat.write(var0.array, var1, 24);
         } catch (Exception var4) {
         }
      }

   }
}
