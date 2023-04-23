public class ClientScriptFrame {
   static Client bc;
   static int ug;
   ClientScript af;
   int an = 1031782053;
   int[] aw;
   String[] ac;

   ClientScriptFrame() {
   }

   public static int ab_renamed(int var0) {
      return hs.aq(ix.ag[var0]);
   }

   static final void ls_renamed(int var0, int var1, int var2, int var3) {
      if (-303899309 * Client.oq == 0 && !Client.om) {
         MiniMenuEntry.kz_renamed(Strings.gc, "", 23, 0, var0 - var2, var1 - var3);
      }

      long var5 = -1L;
      long var7 = -1L;

      int var9;
      for(var9 = 0; var9 < KeyHandler.af_renamed(); ++var9) {
         long var10 = bk.ac_renamed(var9);
         if (var7 != var10) {
            var7 = var10;
            int var12 = ir.au_renamed(var9);
            int var13 = ab_renamed(var9);
            int var14 = TextureProvider.al(ix.ag[var9]);
            int var16 = InterfaceParent.at(ix.ag[var9]);
            int var17 = var16;
            int var21;
            int var22;
            if (2 == var14 && bx.js.bk(GameShell.mh * -1727408401, var12, var13, var10) >= 0) {
               hq var18 = fw.an_renamed(var16);
               if (null != var18.bu) {
                  var18 = var18.ao();
               }

               if (null == var18) {
                  continue;
               }

               dg var19 = null;

               for(dg var20 = (dg)Client.nn.last(); var20 != null; var20 = (dg)Client.nn.previous()) {
                  if (593068225 * var20.af == -1727408401 * GameShell.mh && var20.aw * 68300005 == var12 && 800888185 * var20.ac == var13 && var17 == 552715177 * var20.al) {
                     var19 = var20;
                     break;
                  }
               }

               if (1 == -303899309 * Client.oq) {
                  MiniMenuEntry.kz_renamed(Strings.gu, Client.it + " " + Formatting.ab + " " + oa.colorStartTag(65535) + var18.ao, 1, var17, var12, var13);
               } else if (Client.om) {
                  if ((SecureRandomFuture.oo * 1457791911 & 4) == 4) {
                     MiniMenuEntry.kz_renamed(Client.oj, Client.ob + " " + Formatting.ab + " " + oa.colorStartTag(65535) + var18.ao, 2, var17, var12, var13);
                  }
               } else {
                  String[] var29 = var18.bi;
                  if (var29 != null) {
                     for(var21 = 4; var21 >= 0; --var21) {
                        if ((var19 == null || var19.hasAlphaTransform(var21)) && null != var29[var21]) {
                           var22 = 0;
                           if (0 == var21) {
                              var22 = 3;
                           }

                           if (var21 == 1) {
                              var22 = 4;
                           }

                           if (var21 == 2) {
                              var22 = 5;
                           }

                           if (var21 == 3) {
                              var22 = 6;
                           }

                           if (var21 == 4) {
                              var22 = 1001;
                           }

                           MiniMenuEntry.kz_renamed(var29[var21], oa.colorStartTag(65535) + var18.ao, var22, var17, var12, var13);
                        }
                     }
                  }

                  MiniMenuEntry.kz_renamed(Strings.gh, oa.colorStartTag(65535) + var18.ao, 1002, -1529817365 * var18.at, var12, var13);
               }
            }

            int var28;
            Npc var30;
            int[] var31;
            Player var35;
            if (1 == var14) {
               Npc var25 = Client.iu[var17];
               if (null == var25) {
                  continue;
               }

               if (var25.af.al * 1458410691 == 1 && 64 == (var25.bx * 1144428983 & 127) && 64 == (var25.bo * -411750205 & 127)) {
                  for(var28 = 0; var28 < 265474485 * Client.iw; ++var28) {
                     var30 = Client.iu[Client.iy[var28]];
                     if (null != var30 && var25 != var30 && 1458410691 * var30.af.al == 1 && var25.bx * 1144428983 == var30.bx * 1144428983 && -411750205 * var25.bo == -411750205 * var30.bo) {
                        InvType.lf_renamed(var30, Client.iy[var28], var12, var13);
                     }
                  }

                  var28 = ds.ab * -2010934433;
                  var31 = ds.aq;

                  for(var21 = 0; var21 < var28; ++var21) {
                     var35 = Client.mc[var31[var21]];
                     if (null != var35 && 1144428983 * var35.bx == 1144428983 * var25.bx && -411750205 * var35.bo == var25.bo * -411750205) {
                        DynamicObject.addPlayerToMenu(var35, var31[var21], var12, var13);
                     }
                  }
               }

               InvType.lf_renamed(var25, var17, var12, var13);
            }

            if (0 == var14) {
               Player var26 = Client.mc[var17];
               if (null == var26) {
                  continue;
               }

               if (64 == (1144428983 * var26.bx & 127) && 64 == (-411750205 * var26.bo & 127)) {
                  for(var28 = 0; var28 < Client.iw * 265474485; ++var28) {
                     var30 = Client.iu[Client.iy[var28]];
                     if (var30 != null && 1458410691 * var30.af.al == 1 && 1144428983 * var26.bx == var30.bx * 1144428983 && var30.bo * -411750205 == var26.bo * -411750205) {
                        InvType.lf_renamed(var30, Client.iy[var28], var12, var13);
                     }
                  }

                  var28 = ds.ab * -2010934433;
                  var31 = ds.aq;

                  for(var21 = 0; var21 < var28; ++var21) {
                     var35 = Client.mc[var31[var21]];
                     if (null != var35 && var26 != var35 && 1144428983 * var26.bx == var35.bx * 1144428983 && -411750205 * var35.bo == -411750205 * var26.bo) {
                        DynamicObject.addPlayerToMenu(var35, var31[var21], var12, var13);
                     }
                  }
               }

               if (var17 != Client.nl * -1565733637) {
                  DynamicObject.addPlayerToMenu(var26, var17, var12, var13);
               } else {
                  var5 = var10;
               }
            }

            if (var14 == 3) {
               NodeDeque var27 = Client.nr[-1727408401 * GameShell.mh][var12][var13];
               if (null != var27) {
                  for(Obj var32 = (Obj)var27.first(); null != var32; var32 = (Obj)var27.next()) {
                     ObjType var33 = HeadbarUpdate.getObjType(176307405 * var32.af);
                     if (1 == Client.oq * -303899309) {
                        MiniMenuEntry.kz_renamed(Strings.gu, Client.it + " " + Formatting.ab + " " + oa.colorStartTag(16748608) + var33.ah, 16, var32.af * 176307405, var12, var13);
                     } else if (Client.om) {
                        if (1 == (1457791911 * SecureRandomFuture.oo & 1)) {
                           MiniMenuEntry.kz_renamed(Client.oj, Client.ob + " " + Formatting.ab + " " + oa.colorStartTag(16748608) + var33.ah, 17, 176307405 * var32.af, var12, var13);
                        }
                     } else {
                        String[] var34 = var33.bm;

                        for(var22 = 4; var22 >= 0; --var22) {
                           if (var32.aw(var22)) {
                              if (var34 != null && var34[var22] != null) {
                                 byte var23 = 0;
                                 if (var22 == 0) {
                                    var23 = 18;
                                 }

                                 if (var22 == 1) {
                                    var23 = 19;
                                 }

                                 if (var22 == 2) {
                                    var23 = 20;
                                 }

                                 if (var22 == 3) {
                                    var23 = 21;
                                 }

                                 if (4 == var22) {
                                    var23 = 22;
                                 }

                                 MiniMenuEntry.kz_renamed(var34[var22], oa.colorStartTag(16748608) + var33.ah, var23, 176307405 * var32.af, var12, var13);
                              } else if (var22 == 2) {
                                 MiniMenuEntry.kz_renamed(Strings.an, oa.colorStartTag(16748608) + var33.ah, 20, 176307405 * var32.af, var12, var13);
                              }
                           }
                        }

                        MiniMenuEntry.kz_renamed(Strings.gh, oa.colorStartTag(16748608) + var33.ah, 1004, var32.af * 176307405, var12, var13);
                     }
                  }
               }
            }
         }
      }

      if (var5 != -1L) {
         var9 = (int)(var5 >>> 0 & 127L);
         int var11 = hs.aq(var5);
         Player var24 = Client.mc[Client.nl * -1565733637];
         DynamicObject.addPlayerToMenu(var24, -1565733637 * Client.nl, var9, var11);
      }

   }

   static final void mg(double var0) {
      am.an(var0);
      ((TextureProvider)in.ab.aq).setBrightness(var0);
      ec.aj_renamed();
      aj.vb.ah(var0);
   }

   static void nt_renamed(String var0) {
      ef.cm = var0;

      try {
         String var2 = bc.getParameter(Integer.toString(18));
         String var3 = bc.getParameter(Integer.toString(13));
         String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
         if (var0.length() == 0) {
            var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            var4 = var4 + "; Expires=" + fo.af(Formatting.af_renamed() + 94608000000L) + "; Max-Age=" + 94608000L;
         }

         by.af_renamed(bc, "document.cookie=\"" + var4 + "\"");
      } catch (Throwable var5) {
      }

   }
}
