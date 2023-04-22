import java.io.IOException;

public final class Tile extends Node {
   Wall aq;
   int aj;
   int y;
   int originalPlane;
   boolean drawPrimary;
   TileModel ab;
   boolean drawScenery;
   WallDecoration al;
   FloorDecoration at;
   int plane;
   int ay;
   Scenery[] scenery = new Scenery[5];
   int[] sceneryEdgeMasks = new int[5];
   int ai = 0;
   int ag;
   int drawSceneryEdges;
   int x;
   boolean drawSecondary;
   TilePaint au;
   int as;
   ObjStack aa;
   int ak;
   Tile az;

   public static boolean af_renamed() {
      long var1 = Formatting.af_renamed();
      int var3 = (int)(var1 - -2114584129517998633L * NetCache.aw);
      NetCache.aw = -6047020038529116697L * var1;
      if (var3 > 200) {
         var3 = 200;
      }

      NetCache.an += var3 * -425972525;
      if (NetCache.ao * -1651605431 == 0 && 0 == NetCache.aq * -1952694793 && 0 == -32010957 * NetCache.aa && 0 == NetCache.au * -1171541559) {
         return true;
      } else if (NetCache.af == null) {
         return false;
      } else {
         try {
            if (NetCache.an * -942339237 > 30000) {
               throw new IOException();
            } else {
               NetFileRequest var4;
               Packet var5;
               while(-1952694793 * NetCache.aq < 200 && NetCache.au * -1171541559 > 0) {
                  var4 = (NetFileRequest)NetCache.ac.first();
                  var5 = new Packet(4);
                  var5.bu(1);
                  var5.bq((int)var4.hr);
                  NetCache.af.ab(var5.array, 0, 4);
                  NetCache.ab.put(var4, var4.hr);
                  NetCache.au -= -1320339335;
                  NetCache.aq += -1677618233;
               }

               while(NetCache.ao * -1651605431 < 200 && NetCache.aa * -32010957 > 0) {
                  var4 = (NetFileRequest)NetCache.al.last();
                  var5 = new Packet(4);
                  var5.bu(0);
                  var5.bq((int)var4.hr);
                  NetCache.af.ab(var5.array, 0, 4);
                  var4.fs();
                  NetCache.ay.put(var4, var4.hr);
                  NetCache.aa -= -2069940741;
                  NetCache.ao += -979537415;
               }

               for(int var19 = 0; var19 < 100; ++var19) {
                  int var20 = NetCache.af.aw();
                  if (var20 < 0) {
                     throw new IOException();
                  }

                  if (0 == var20) {
                     break;
                  }

                  NetCache.an = 0;
                  byte var6 = 0;
                  if (ClientScript.NetCache_currentResponse == null) {
                     var6 = 8;
                  } else if (0 == NetCache.av * -1961769541) {
                     var6 = 1;
                  }

                  int var7;
                  int var8;
                  int var9;
                  int var11;
                  byte[] var10000;
                  int var10001;
                  Packet var23;
                  if (var6 > 0) {
                     var7 = var6 - NetCache.ag.index * -1633313603;
                     if (var7 > var20) {
                        var7 = var20;
                     }

                     NetCache.af.au(NetCache.ag.array, -1633313603 * NetCache.ag.index, var7);
                     if (0 != NetCache.ad) {
                        for(var8 = 0; var8 < var7; ++var8) {
                           var10000 = NetCache.ag.array;
                           var10001 = -1633313603 * NetCache.ag.index + var8;
                           var10000[var10001] ^= NetCache.ad;
                        }
                     }

                     var23 = NetCache.ag;
                     var23.index += var7 * -1516355947;
                     if (-1633313603 * NetCache.ag.index < var6) {
                        break;
                     }

                     if (null == ClientScript.NetCache_currentResponse) {
                        NetCache.ag.index = 0;
                        var8 = NetCache.ag.g1();
                        var9 = NetCache.ag.cl();
                        int var10 = NetCache.ag.g1();
                        var11 = NetCache.ag.g4s();
                        long var12 = (long)((var8 << 16) + var9);
                        NetFileRequest var14 = (NetFileRequest)NetCache.ab.get(var12);
                        NetCache.ax = true;
                        if (var14 == null) {
                           var14 = (NetFileRequest)NetCache.ay.get(var12);
                           NetCache.ax = false;
                        }

                        if (null == var14) {
                           throw new IOException();
                        }

                        int var15 = 0 == var10 ? 5 : 9;
                        ClientScript.NetCache_currentResponse = var14;
                        NetCache.ah = new Packet(var15 + var11 + ClientScript.NetCache_currentResponse.padding);
                        NetCache.ah.bu(var10);
                        NetCache.ah.ba(var11);
                        NetCache.av = -598099048;
                        NetCache.ag.index = 0;
                     } else if (NetCache.av * -1961769541 == 0) {
                        if (-1 == NetCache.ag.array[0]) {
                           NetCache.av = -74762381;
                           NetCache.ag.index = 0;
                        } else {
                           ClientScript.NetCache_currentResponse = null;
                        }
                     }
                  } else {
                     var7 = NetCache.ah.array.length - ClientScript.NetCache_currentResponse.padding;
                     var8 = 512 - NetCache.av * -1961769541;
                     if (var8 > var7 - NetCache.ah.index * -1633313603) {
                        var8 = var7 - NetCache.ah.index * -1633313603;
                     }

                     if (var8 > var20) {
                        var8 = var20;
                     }

                     NetCache.af.au(NetCache.ah.array, NetCache.ah.index * -1633313603, var8);
                     if (0 != NetCache.ad) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10000 = NetCache.ah.array;
                           var10001 = var9 + -1633313603 * NetCache.ah.index;
                           var10000[var10001] ^= NetCache.ad;
                        }
                     }

                     var23 = NetCache.ah;
                     var23.index += var8 * -1516355947;
                     NetCache.av += -74762381 * var8;
                     if (var7 == NetCache.ah.index * -1633313603) {
                        if (ClientScript.NetCache_currentResponse.hr == 16711935L) {
                           cz.NetCache_reference = NetCache.ah;

                           for(var9 = 0; var9 < 256; ++var9) {
                              Archive var21 = NetCache.NetCache_archives[var9];
                              if (var21 != null) {
                                 cz.NetCache_reference.index = var9 * 754054312 + 1008154857;
                                 if (-1633313603 * cz.NetCache_reference.index >= cz.NetCache_reference.array.length) {
                                    if (!var21.ah) {
                                       throw new RuntimeException("");
                                    }

                                    var21.au();
                                 } else {
                                    var11 = cz.NetCache_reference.g4s();
                                    int var22 = cz.NetCache_reference.g4s();
                                    var21.loadIndex(var11, var22);
                                 }
                              }
                           }
                        } else {
                           NetCache.NetCache_crc.reset();
                           NetCache.NetCache_crc.update(NetCache.ah.array, 0, var7);
                           var9 = (int)NetCache.NetCache_crc.getValue();
                           if (var9 != ClientScript.NetCache_currentResponse.crc * -75260527) {
                              try {
                                 NetCache.af.aq();
                              } catch (Exception var17) {
                              }

                              NetCache.NetCache_crcMismatches += 372675253;
                              NetCache.af = null;
                              NetCache.ad = (byte)((int)(Math.random() * 255.0 + 1.0));
                              return false;
                           }

                           NetCache.NetCache_crcMismatches = 0;
                           NetCache.NetCache_ioExceptions = 0;
                           ClientScript.NetCache_currentResponse.archive.write((int)(ClientScript.NetCache_currentResponse.hr & 65535L), NetCache.ah.array, 16711680L == (ClientScript.NetCache_currentResponse.hr & 16711680L), NetCache.ax);
                        }

                        ClientScript.NetCache_currentResponse.ga();
                        if (NetCache.ax) {
                           NetCache.aq -= -1677618233;
                        } else {
                           NetCache.ao -= -979537415;
                        }

                        NetCache.av = 0;
                        ClientScript.NetCache_currentResponse = null;
                        NetCache.ah = null;
                     } else {
                        if (-1961769541 * NetCache.av != 512) {
                           break;
                        }

                        NetCache.av = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var18) {
            try {
               NetCache.af.aq();
            } catch (Exception var16) {
            }

            NetCache.NetCache_ioExceptions += -161323731;
            NetCache.af = null;
            return false;
         }
      }
   }

   Tile(int var1, int var2, int var3) {
      this.originalPlane = (this.plane = -1846949283 * var1) * 1251513827;
      this.x = var2 * 960127795;
      this.y = var3 * 210148197;
   }
}
