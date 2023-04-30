import accessors.RSAnimFrame;

public class il implements RSAnimFrame {
   static int[] aw = new int[500];
   int[] at;
   boolean ay = false;
   static int[] ac = new int[500];
   ik au = null;
   int ab = -1;
   int[] aq;
   int[] al;
   int[] aa;
   static int[] an = new int[500];
   static int[] af = new int[500];

   il(byte[] var1, ik var2) {
      this.au = var2;
      sg var3 = new sg(var1);
      sg var4 = new sg(var1);
      var3.at = 1262255402;
      int var5 = var3.cm((byte)7);
      int var6 = -1;
      int var7 = 0;
      var4.at = (var3.at * -1633313603 + var5) * -1516355947;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.cm((byte)7);
         if (var9 > 0) {
            if (this.au.al[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if (this.au.al[var10] == 0) {
                     af[var7] = var10;
                     an[var7] = 0;
                     aw[var7] = 0;
                     ac[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            af[var7] = var8;
            short var11 = 0;
            if (this.au.al[var8] == 3) {
               var11 = 128;
            }

            if ((var9 & 1) != 0) {
               an[var7] = var4.cp(1570572456);
            } else {
               an[var7] = var11;
            }

            if ((var9 & 2) != 0) {
               aw[var7] = var4.cp(1757814522);
            } else {
               aw[var7] = var11;
            }

            if ((var9 & 4) != 0) {
               ac[var7] = var4.cp(2032808326);
            } else {
               ac[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if (this.au.al[var8] == 5) {
               this.ay = true;
            }
         }
      }

      if (var4.at * -1633313603 != var1.length) {
         throw new RuntimeException();
      } else {
         this.ab = var7;
         this.aq = new int[var7];
         this.al = new int[var7];
         this.at = new int[var7];
         this.aa = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.aq[var8] = af[var8];
            this.al[var8] = an[var8];
            this.at[var8] = aw[var8];
            this.aa[var8] = ac[var8];
         }

      }
   }
}
