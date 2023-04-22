public class gx {
   public short[] ac;
   public short[] aw;
   static int ut;

   public static int bw_renamed(String var0) {
      return var0.length() + 2;
   }

   gx(int var1) {
      ObjType var2 = HeadbarUpdate.getObjType(var1);
      if (var2.ak()) {
         this.aw = new short[var2.ar.length];
         System.arraycopy(var2.ar, 0, this.aw, 0, this.aw.length);
      }

      if (var2.az()) {
         this.ac = new short[var2.as.length];
         System.arraycopy(var2.as, 0, this.ac, 0, this.ac.length);
      }

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

   static Rasterizer3D at_renamed() {
      Rasterizer3D var1 = new Rasterizer3D();
      var1.ab = -822007097 * tx.an;
      var1.aq = tx.aw * 378525975;
      var1.ac = tx.ac[0];
      var1.au = ar.au[0];
      var1.an = dd.ab[0];
      var1.aw = fd.aq[0];
      int var2 = var1.aw * var1.an;
      byte[] var3 = VarBitType.at[0];
      var1.af = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var1.af[var4] = pc.al[var3[var4] & 255];
      }

      pk.ay_renamed();
      return var1;
   }
}
