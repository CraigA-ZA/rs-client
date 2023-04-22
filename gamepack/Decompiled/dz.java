public class dz {
   static WorldMap worldMap() {
      return ey.worldMap0;
   }

   dz() throws Throwable {
      throw new Error();
   }

   static final boolean an_renamed(int var0, int var1, ia var2, CollisionMap var3) {
      int var5 = var0;
      int var6 = var1;
      int var7 = 64;
      int var8 = 64;
      int var9 = var0 - var7;
      int var10 = var1 - var8;
      iw.aw[var7][var8] = 99;
      iw.ac[var7][var8] = 0;
      int var11 = 0;
      int var12 = 0;
      iw.al[var11] = var0;
      iw.at[var11++] = var1;
      int[][] var13 = var3.flags;

      while(var12 != var11) {
         var5 = iw.al[var12];
         var6 = iw.at[var12];
         var12 = var12 + 1 & 4095;
         var7 = var5 - var9;
         var8 = var6 - var10;
         int var14 = var5 - var3.bz * 1724654229;
         int var15 = var6 - -216630539 * var3.bm;
         if (var2.af(1, var5, var6, var3)) {
            am.au = var5 * -617213805;
            pg.ab = 1169106949 * var6;
            return true;
         }

         int var16 = 1 + iw.ac[var7][var8];
         if (var7 > 0 && iw.aw[var7 - 1][var8] == 0 && 0 == (var13[var14 - 1][var15] & 19136776)) {
            iw.al[var11] = var5 - 1;
            iw.at[var11] = var6;
            var11 = 1 + var11 & 4095;
            iw.aw[var7 - 1][var8] = 2;
            iw.ac[var7 - 1][var8] = var16;
         }

         if (var7 < 127 && 0 == iw.aw[1 + var7][var8] && 0 == (var13[1 + var14][var15] & 19136896)) {
            iw.al[var11] = var5 + 1;
            iw.at[var11] = var6;
            var11 = 1 + var11 & 4095;
            iw.aw[1 + var7][var8] = 8;
            iw.ac[var7 + 1][var8] = var16;
         }

         if (var8 > 0 && iw.aw[var7][var8 - 1] == 0 && 0 == (var13[var14][var15 - 1] & 19136770)) {
            iw.al[var11] = var5;
            iw.at[var11] = var6 - 1;
            var11 = var11 + 1 & 4095;
            iw.aw[var7][var8 - 1] = 1;
            iw.ac[var7][var8 - 1] = var16;
         }

         if (var8 < 127 && 0 == iw.aw[var7][1 + var8] && 0 == (var13[var14][var15 + 1] & 19136800)) {
            iw.al[var11] = var5;
            iw.at[var11] = var6 + 1;
            var11 = 1 + var11 & 4095;
            iw.aw[var7][1 + var8] = 4;
            iw.ac[var7][1 + var8] = var16;
         }

         if (var7 > 0 && var8 > 0 && 0 == iw.aw[var7 - 1][var8 - 1] && (var13[var14 - 1][var15 - 1] & 19136782) == 0 && (var13[var14 - 1][var15] & 19136776) == 0 && (var13[var14][var15 - 1] & 19136770) == 0) {
            iw.al[var11] = var5 - 1;
            iw.at[var11] = var6 - 1;
            var11 = var11 + 1 & 4095;
            iw.aw[var7 - 1][var8 - 1] = 3;
            iw.ac[var7 - 1][var8 - 1] = var16;
         }

         if (var7 < 127 && var8 > 0 && iw.aw[1 + var7][var8 - 1] == 0 && 0 == (var13[var14 + 1][var15 - 1] & 19136899) && (var13[var14 + 1][var15] & 19136896) == 0 && (var13[var14][var15 - 1] & 19136770) == 0) {
            iw.al[var11] = 1 + var5;
            iw.at[var11] = var6 - 1;
            var11 = 1 + var11 & 4095;
            iw.aw[1 + var7][var8 - 1] = 9;
            iw.ac[1 + var7][var8 - 1] = var16;
         }

         if (var7 > 0 && var8 < 127 && 0 == iw.aw[var7 - 1][1 + var8] && (var13[var14 - 1][var15 + 1] & 19136824) == 0 && (var13[var14 - 1][var15] & 19136776) == 0 && (var13[var14][var15 + 1] & 19136800) == 0) {
            iw.al[var11] = var5 - 1;
            iw.at[var11] = 1 + var6;
            var11 = var11 + 1 & 4095;
            iw.aw[var7 - 1][var8 + 1] = 6;
            iw.ac[var7 - 1][1 + var8] = var16;
         }

         if (var7 < 127 && var8 < 127 && iw.aw[var7 + 1][var8 + 1] == 0 && 0 == (var13[var14 + 1][var15 + 1] & 19136992) && (var13[1 + var14][var15] & 19136896) == 0 && 0 == (var13[var14][var15 + 1] & 19136800)) {
            iw.al[var11] = 1 + var5;
            iw.at[var11] = var6 + 1;
            var11 = 1 + var11 & 4095;
            iw.aw[var7 + 1][1 + var8] = 12;
            iw.ac[var7 + 1][1 + var8] = var16;
         }
      }

      am.au = -617213805 * var5;
      pg.ab = var6 * 1169106949;
      return false;
   }
}
