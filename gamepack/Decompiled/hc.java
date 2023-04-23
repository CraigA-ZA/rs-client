public class hc extends DualNode {
   static Archive archive10;

   public static int af_renamed(int var0) {
      return var0 >> 11 & 63;
   }

   static {
      new EvictingDualNodeHashTable(64);
   }

   hc() throws Throwable {
      throw new Error();
   }

   public static void af_renamed(AbstractArchive var0) {
      ParamType.af = var0;
   }

   public static StructType an_renamed(int var0) {
      StructType var2 = (StructType)StructType.an.get((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = StructType.af.takeFile(34, var0);
         var2 = new StructType();
         if (null != var3) {
            var2.decode(new Packet(var3));
         }

         var2.postDecode();
         StructType.an.put(var2, (long)var0);
         return var2;
      }
   }

   static final boolean aj_renamed(int var0, int var1) {
      LocType var3 = fw.an_renamed(var0);
      if (11 == var1) {
         var1 = 10;
      }

      if (var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var3.loadModelType(var1);
   }
}
