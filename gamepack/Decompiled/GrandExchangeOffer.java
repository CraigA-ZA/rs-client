public class GrandExchangeOffer {
   static String worldsUrl;
   byte state;
   public int currentQuantity;
   public int id;
   public int unitPrice;
   public int totalQuantity;
   public int currentPrice;

   public static void af_renamed(String[] var0, short[] var1) {
      FaceNormal.an_renamed(var0, var1, 0, var0.length - 1);
   }

   public GrandExchangeOffer() {
   }

   public GrandExchangeOffer(Packet var1, boolean var2) {
      this.state = var1.g1s();
      this.unitPrice = var1.cl() * -2000800301;
      this.currentPrice = var1.g4s() * 945098885;
      this.id = var1.g4s() * 275172041;
      this.totalQuantity = var1.g4s() * 832101099;
      this.currentQuantity = var1.g4s() * 2084457045;
      if (var2) {
         this.an(ArchiveDiskActionHandler.af_renamed(var1));
      }

   }

   public static ta[] au_renamed() {
      return new ta[]{ta.aw, ta.af, ta.an};
   }

   public static int an_renamed(byte[] var0, int var1, CharSequence var2) {
      int var4 = var2.length();
      int var5 = var1;

      for(int var6 = 0; var6 < var4; ++var6) {
         char var7 = var2.charAt(var6);
         if (var7 <= 127) {
            var0[var5++] = (byte)var7;
         } else if (var7 <= 2047) {
            var0[var5++] = (byte)(192 | var7 >> 6);
            var0[var5++] = (byte)(128 | var7 & 63);
         } else {
            var0[var5++] = (byte)(224 | var7 >> 12);
            var0[var5++] = (byte)(128 | var7 >> 6 & 63);
            var0[var5++] = (byte)(128 | var7 & 63);
         }
      }

      return var5 - var1;
   }

   void an(Integer var1) {
   }

   public int status() {
      return this.state & 7;
   }

   public int type() {
      return (this.state & 8) == 8 ? 1 : 0;
   }

   void au(int var1) {
      this.state &= -8;
      this.state = (byte)(this.state | var1 & 7);
   }

   void ab(int var1) {
      this.state &= -9;
      if (var1 == 1) {
         this.state = (byte)(this.state | 8);
      }

   }
}
