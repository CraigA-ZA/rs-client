public class ec implements Enumerated {
   static int gc;
   static final ec aa = new ec(9, 9, (String)null, 8);
   static final ec ab = new ec(5, 5, (String)null, 4);
   static final ec ac = new ec(3, 3, (String)null, 2);
   static final ec af = new ec(0, 0, (String)null, -1);
   static final ec ag = new ec(14, 14, (String)null, 4);
   static final ec ah = new ec(15, 15, (String)null, 5);
   static final ec ai = new ec(13, 13, (String)null, 3);
   static final ec al = new ec(7, 7, (String)null, 6);
   static final ec an = new ec(1, 1, (String)null, 0);
   static final ec ao = new ec(11, 11, (String)null, 1);
   static final ec aq = new ec(6, 6, (String)null, 5);
   static final ec at = new ec(8, 8, (String)null, 7);
   static final ec au = new ec(4, 4, (String)null, 3);
   static final ec av = new ec(16, 16, (String)null, 0);
   static final ec aw = new ec(2, 2, (String)null, 1);
   static final ec ax = new ec(12, 12, (String)null, 2);
   static final ec ay = new ec(10, 10, (String)null, 0);
   final int am;
   final int ar;
   final int as;

   ec(int var1, int var2, String var3, int var4) {
      this.ar = 40879509 * var1;
      this.am = 1377749943 * var2;
      this.as = var4 * 1121387767;
   }

   public int ordinal() {
      return -1158217209 * this.am;
   }

   int ab() {
      return 1204354247 * this.as;
   }

   static void ac_renamed(int var0, boolean var1, int var2, boolean var3) {
      if (bx.worlds != null) {
         ai.au_renamed(0, bx.worlds.length - 1, var0, var1, var2, var3);
      }

   }

   public static void aj_renamed() {
      ObjType.Sprite_cached.clear();
   }

   static final void loadRegions(boolean var0, PacketBit var1) {
      Client.isInInstance = var0;
      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      if (!Client.isInInstance) {
         var3 = var1.da();
         int var4 = var1.da();
         var5 = var1.cl();
         Scenery.xteaKeys = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               Scenery.xteaKeys[var6][var7] = var1.g4s();
            }
         }

         WorldMapAreaData.jj = new int[var5];
         FontName.jm = new int[var5];
         Archive.jn = new int[var5];
         au.jf = new byte[var5][];
         LocSound.jw = new byte[var5][];
         var5 = 0;

         for(var6 = (var4 - 6) / 8; var6 <= (var4 + 6) / 8; ++var6) {
            for(var7 = (var3 - 6) / 8; var7 <= (6 + var3) / 8; ++var7) {
               var8 = (var6 << 8) + var7;
               WorldMapAreaData.jj[var5] = var8;
               FontName.jm[var5] = TotalQuantityComparator.archive5.getGroupId("m" + var6 + "_" + var7);
               Archive.jn[var5] = TotalQuantityComparator.archive5.getGroupId("l" + var6 + "_" + var7);
               ++var5;
            }
         }

         Decimator.jr_renamed(var4, var3, true);
      } else {
         var3 = var1.da();
         boolean var22 = var1.g1() == 1;
         var5 = var1.eo();
         var6 = var1.cl();
         var1.importIndex();

         int var9;
         int var10;
         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = var1.gBit(1);
                  if (var10 == 1) {
                     Client.instanceChunkTemplates[var7][var8][var9] = var1.gBit(26);
                  } else {
                     Client.instanceChunkTemplates[var7][var8][var9] = -1;
                  }
               }
            }
         }

         var1.exportIndex();
         Scenery.xteaKeys = new int[var6][4];

         for(var7 = 0; var7 < var6; ++var7) {
            for(var8 = 0; var8 < 4; ++var8) {
               Scenery.xteaKeys[var7][var8] = var1.g4s();
            }
         }

         WorldMapAreaData.jj = new int[var6];
         FontName.jm = new int[var6];
         Archive.jn = new int[var6];
         au.jf = new byte[var6][];
         LocSound.jw = new byte[var6][];
         var6 = 0;

         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = Client.instanceChunkTemplates[var7][var8][var9];
                  if (-1 != var10) {
                     int var11 = var10 >> 14 & 1023;
                     int var12 = var10 >> 3 & 2047;
                     int var13 = (var11 / 8 << 8) + var12 / 8;

                     int var14;
                     for(var14 = 0; var14 < var6; ++var14) {
                        if (WorldMapAreaData.jj[var14] == var13) {
                           var13 = -1;
                           break;
                        }
                     }

                     if (var13 != -1) {
                        WorldMapAreaData.jj[var6] = var13;
                        var14 = var13 >> 8 & 255;
                        int var15 = var13 & 255;
                        FontName.jm[var6] = TotalQuantityComparator.archive5.getGroupId("m" + var14 + "_" + var15);
                        Archive.jn[var6] = TotalQuantityComparator.archive5.getGroupId("l" + var14 + "_" + var15);
                        ++var6;
                     }
                  }
               }
            }
         }

         Decimator.jr_renamed(var3, var5, !var22);
      }

   }

   static final void mu_renamed(int var0, int var1) {
      if (SoundSystem.loadInterface(var0)) {
         fy.mq_renamed(hn.interfaceComponents[var0], var1);
      }
   }
}
