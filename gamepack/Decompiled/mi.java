public class mi {
   static final mi af = new mi(51, 27, 800, 0, 16, 16);
   static final mi an = new mi(25, 28, 800, 656, 40, 40);
   final int ac;
   final int aw;

   public static PacketBitNode an_renamed(ClientProt var0, Isaac var1) {
      PacketBitNode var3 = SpotType.af_renamed();
      var3.af = var0;
      var3.an = -474143459 * var0.length;
      if (-1 == var3.an * -1245059367) {
         var3.bit = new PacketBit(260);
      } else if (var3.an * -1245059367 == -2) {
         var3.bit = new PacketBit(10000);
      } else if (var3.an * -1245059367 <= 18) {
         var3.bit = new PacketBit(20);
      } else if (-1245059367 * var3.an <= 98) {
         var3.bit = new PacketBit(100);
      } else {
         var3.bit = new PacketBit(260);
      }

      var3.bit.an(var1);
      var3.bit.pIsaac1(1546470819 * var3.af.id);
      var3.ac = 0;
      return var3;
   }

   mi(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.aw = -383400655 * var5;
      this.ac = 1549082123 * var6;
   }

   static void ac_renamed(PacketBit var0, int var1) {
      boolean var3 = var0.gBit(1) == 1;
      if (var3) {
         ds.ai[(ds.ax += 1362331411) * 1474255643 - 1] = var1;
      }

      int var4 = var0.gBit(2);
      Player var5 = Client.players[var1];
      if (var4 == 0) {
         if (var3) {
            var5.isUnanimated = false;
         } else if (-549033243 * Client.localPlayerIndex == var1) {
            throw new RuntimeException();
         } else {
            ds.Players_regions[var1] = (jm.ib * -1232093375 + var5.pathX[0] >> 13 << 14) + (var5.ad * -1900490645 << 28) + (var5.pathY[0] + Scenery.jc * 827352769 >> 13);
            if (var5.size * -283165269 != -1) {
               ds.ay[var1] = var5.size * -283165269;
            } else {
               ds.ay[var1] = -1751341433 * var5.dd;
            }

            ds.ao[var1] = var5.sequenceFrameCycle * 1005900761;
            Client.players[var1] = null;
            if (var0.gBit(1) != 0) {
               kb.updateExternalPlayer(var0, var1);
            }

         }
      } else {
         int var6;
         int var7;
         int var8;
         if (var4 == 1) {
            var6 = var0.gBit(3);
            var7 = var5.pathX[0];
            var8 = var5.pathY[0];
            if (0 == var6) {
               --var7;
               --var8;
            } else if (1 == var6) {
               --var8;
            } else if (2 == var6) {
               ++var7;
               --var8;
            } else if (3 == var6) {
               --var7;
            } else if (var6 == 4) {
               ++var7;
            } else if (var6 == 5) {
               --var7;
               ++var8;
            } else if (6 == var6) {
               ++var8;
            } else if (7 == var6) {
               ++var7;
               ++var8;
            }

            if (var1 == -549033243 * Client.localPlayerIndex && (1144428983 * var5.bx < 1536 || -411750205 * var5.bo < 1536 || var5.bx * 1144428983 >= 11776 || var5.bo * -411750205 >= 11776)) {
               var5.resetPath(var7, var8);
               var5.isUnanimated = false;
            } else if (var3) {
               var5.isUnanimated = true;
               var5.tileX = -700518347 * var7;
               var5.tileY = var8 * -1699085727;
            } else {
               var5.isUnanimated = false;
               var5.av(var7, var8, ds.ac[var1]);
            }

         } else if (var4 == 2) {
            var6 = var0.gBit(4);
            var7 = var5.pathX[0];
            var8 = var5.pathY[0];
            if (var6 == 0) {
               var7 -= 2;
               var8 -= 2;
            } else if (var6 == 1) {
               --var7;
               var8 -= 2;
            } else if (var6 == 2) {
               var8 -= 2;
            } else if (var6 == 3) {
               ++var7;
               var8 -= 2;
            } else if (4 == var6) {
               var7 += 2;
               var8 -= 2;
            } else if (5 == var6) {
               var7 -= 2;
               --var8;
            } else if (var6 == 6) {
               var7 += 2;
               --var8;
            } else if (var6 == 7) {
               var7 -= 2;
            } else if (8 == var6) {
               var7 += 2;
            } else if (9 == var6) {
               var7 -= 2;
               ++var8;
            } else if (10 == var6) {
               var7 += 2;
               ++var8;
            } else if (11 == var6) {
               var7 -= 2;
               var8 += 2;
            } else if (12 == var6) {
               --var7;
               var8 += 2;
            } else if (13 == var6) {
               var8 += 2;
            } else if (var6 == 14) {
               ++var7;
               var8 += 2;
            } else if (15 == var6) {
               var7 += 2;
               var8 += 2;
            }

            if (var1 == Client.localPlayerIndex * -549033243 && (1144428983 * var5.bx < 1536 || var5.bo * -411750205 < 1536 || var5.bx * 1144428983 >= 11776 || var5.bo * -411750205 >= 11776)) {
               var5.resetPath(var7, var8);
               var5.isUnanimated = false;
            } else if (var3) {
               var5.isUnanimated = true;
               var5.tileX = -700518347 * var7;
               var5.tileY = -1699085727 * var8;
            } else {
               var5.isUnanimated = false;
               var5.av(var7, var8, ds.ac[var1]);
            }

         } else {
            var6 = var0.gBit(1);
            int var9;
            int var10;
            int var11;
            int var12;
            if (0 == var6) {
               var7 = var0.gBit(12);
               var8 = var7 >> 10;
               var9 = var7 >> 5 & 31;
               if (var9 > 15) {
                  var9 -= 32;
               }

               var10 = var7 & 31;
               if (var10 > 15) {
                  var10 -= 32;
               }

               var11 = var9 + var5.pathX[0];
               var12 = var5.pathY[0] + var10;
               if (-549033243 * Client.localPlayerIndex == var1 && (1144428983 * var5.bx < 1536 || var5.bo * -411750205 < 1536 || var5.bx * 1144428983 >= 11776 || -411750205 * var5.bo >= 11776)) {
                  var5.resetPath(var11, var12);
                  var5.isUnanimated = false;
               } else if (var3) {
                  var5.isUnanimated = true;
                  var5.tileX = -700518347 * var11;
                  var5.tileY = -1699085727 * var12;
               } else {
                  var5.isUnanimated = false;
                  var5.av(var11, var12, ds.ac[var1]);
               }

               var5.ad = (byte)(-1900490645 * var5.ad + var8 & 3) * -1829675965;
               if (var1 == Client.localPlayerIndex * -549033243) {
                  GameShell.plane = var5.ad * 1128021573;
               }

            } else {
               var7 = var0.gBit(30);
               var8 = var7 >> 28;
               var9 = var7 >> 14 & 16383;
               var10 = var7 & 16383;
               var11 = (var9 + var5.pathX[0] + -1232093375 * jm.ib & 16383) - -1232093375 * jm.ib;
               var12 = (var10 + var5.pathY[0] + 827352769 * Scenery.jc & 16383) - Scenery.jc * 827352769;
               if (-549033243 * Client.localPlayerIndex != var1 || var5.bx * 1144428983 >= 1536 && -411750205 * var5.bo >= 1536 && var5.bx * 1144428983 < 11776 && var5.bo * -411750205 < 11776) {
                  if (var3) {
                     var5.isUnanimated = true;
                     var5.tileX = -700518347 * var11;
                     var5.tileY = -1699085727 * var12;
                  } else {
                     var5.isUnanimated = false;
                     var5.av(var11, var12, ds.ac[var1]);
                  }
               } else {
                  var5.resetPath(var11, var12);
                  var5.isUnanimated = false;
               }

               var5.ad = -1829675965 * (byte)(var8 + var5.ad * -1900490645 & 3);
               if (-549033243 * Client.localPlayerIndex == var1) {
                  GameShell.plane = var5.ad * 1128021573;
               }

            }
         }
      }
   }

   static int az_renamed() {
      return cz.ce * 1145608355;
   }
}
