import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Tiles {
   static byte[][][] ab;
   static byte[][][] al;
   static byte[][][] Tiles_renderFlags = new byte[4][104][104];
   static byte[][][] aq;
   static int ae = ((int)(Math.random() * 17.0) - 8) * 1514061769;
   static int ap = ((int)(Math.random() * 33.0) - 16) * 1193325609;
   static int aw = -256673141;
   static int[] ay;
   static int[][] at;
   static int[][][] Tiles_heights = new int[4][105][105];
   static short[][][] au;
   static final int[] ad = new int[]{-1, -1, 1, 1};
   static final int[] aj = new int[]{1, 0, -1, 0};
   static final int[] ak = new int[]{0, -1, 0, 1};
   static final int[] am = new int[]{1, 2, 4, 8};
   static final int[] as = new int[]{16, 32, 64, 128};
   static final int[] az = new int[]{1, -1, -1, 1};

   Tiles() throws Throwable {
      throw new Error();
   }

   public static void ax_renamed() {
      Rasterizer3D.ab.af();
   }

   public static void aw_renamed() {
      try {
         File var1 = new File(hd.userHomeDirectory, "random.dat");
         int var3;
         if (var1.exists()) {
            gc.randomDat = new BufferedFile(new AccessFile(var1, "rw", 25L), 24, 0);
         } else {
            label40:
            for(int var2 = 0; var2 < Formatting.ar.length; ++var2) {
               for(var3 = 0; var3 < fe.cacheDirectoryLocations.length; ++var3) {
                  File var4 = new File(fe.cacheDirectoryLocations[var3] + Formatting.ar[var2] + File.separatorChar + "random.dat");
                  if (var4.exists()) {
                     gc.randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0);
                     break label40;
                  }
               }
            }
         }

         if (gc.randomDat == null) {
            RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
            var3 = var6.read();
            var6.seek(0L);
            var6.write(var3);
            var6.seek(0L);
            var6.close();
            gc.randomDat = new BufferedFile(new AccessFile(var1, "rw", 25L), 24, 0);
         }
      } catch (IOException var5) {
      }

   }

   static final void aa(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
      Packet var10 = new Packet(var0);
      int var11 = -1;

      while(true) {
         int var12 = var10.dw();
         if (var12 == 0) {
            return;
         }

         var11 += var12;
         int var13 = 0;

         while(true) {
            int var14 = var10.cd();
            if (var14 == 0) {
               break;
            }

            var13 += var14 - 1;
            int var15 = var13 & 63;
            int var16 = var13 >> 6 & 63;
            int var17 = var13 >> 12;
            int var18 = var10.g1();
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
               LocType var21 = fw.an_renamed(var11);
               int var24 = var16 & 7;
               int var25 = var15 & 7;
               int var27 = -1339930361 * var21.width;
               int var28 = -1659393955 * var21.length;
               int var29;
               if (1 == (var20 & 1)) {
                  var29 = var27;
                  var27 = var28;
                  var28 = var29;
               }

               int var26 = var7 & 3;
               int var23;
               if (var26 == 0) {
                  var23 = var24;
               } else if (var26 == 1) {
                  var23 = var25;
               } else if (2 == var26) {
                  var23 = 7 - var24 - (var27 - 1);
               } else {
                  var23 = 7 - var25 - (var28 - 1);
               }

               var29 = var2 + var23;
               int var32 = var16 & 7;
               int var33 = var15 & 7;
               int var35 = -1339930361 * var21.width;
               int var36 = -1659393955 * var21.length;
               int var37;
               if (1 == (var20 & 1)) {
                  var37 = var35;
                  var35 = var36;
                  var36 = var37;
               }

               int var34 = var7 & 3;
               int var31;
               if (var34 == 0) {
                  var31 = var33;
               } else if (var34 == 1) {
                  var31 = 7 - var32 - (var35 - 1);
               } else if (2 == var34) {
                  var31 = 7 - var33 - (var36 - 1);
               } else {
                  var31 = var32;
               }

               var37 = var3 + var31;
               if (var29 > 0 && var37 > 0 && var29 < 103 && var37 < 103) {
                  int var38 = var1;
                  if (2 == (Tiles_renderFlags[1][var29][var37] & 2)) {
                     var38 = var1 - 1;
                  }

                  CollisionMap var39 = null;
                  if (var38 >= 0) {
                     var39 = var9[var38];
                  }

                  hy.ay_renamed(var1, var29, var37, var11, var20 + var7 & 3, var19, var8, var39);
               }
            }
         }
      }
   }
}
