public class bz {
   int aq;
   int al;
   static int lg;

   boolean af(be var1) {
      if (null == var1) {
         return false;
      } else {
         switch (1162709731 * this.aq) {
            case 1:
               return var1.af(234892017 * this.al);
            case 2:
               return var1.an(this.al * 234892017);
            case 3:
               return var1.aw((char)(234892017 * this.al));
            case 4:
               return var1.ac(1 == this.al * 234892017);
            default:
               return false;
         }
      }
   }

   static final void ay_renamed() {
      hn.at_renamed(Strings.hj);
   }

   static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return Byte.TYPE;
      } else if (var0.equals("I")) {
         return Integer.TYPE;
      } else if (var0.equals("S")) {
         return Short.TYPE;
      } else if (var0.equals("J")) {
         return Long.TYPE;
      } else if (var0.equals("Z")) {
         return Boolean.TYPE;
      } else if (var0.equals("F")) {
         return Float.TYPE;
      } else if (var0.equals("D")) {
         return Double.TYPE;
      } else if (var0.equals("C")) {
         return Character.TYPE;
      } else {
         return var0.equals("void") ? Void.TYPE : Class.forName(var0);
      }
   }

   static LoginProt[] af_renamed() {
      return new LoginProt[]{LoginProt.ac, LoginProt.ab, LoginProt.an, LoginProt.aw, LoginProt.af, LoginProt.au};
   }

   static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 != null && var0.isVisible()) {
         if (var0 instanceof Npc) {
            hs var7 = ((Npc)var0).af;
            if (null != var7.bn) {
               var7 = var7.at();
            }

            if (null == var7) {
               return;
            }
         }

         int var76 = ds.ab * -2010934433;
         int[] var8 = ds.aq;
         boolean var9 = var1 < var76;
         int var10 = -2;
         int var11;
         if (var0.overheadText != null && (!var9 || !var0.ci && (Client.sj * -1963411823 == 4 || !var0.ce && (0 == -1963411823 * Client.sj || Client.sj * -1963411823 == 3 || Client.sj * -1963411823 == 1 && ((Player)var0).aw())))) {
            var11 = -767387641 * var0.de;
            ot.worldToScreen(var0.bx * 1144428983, -411750205 * var0.bo, var11);
            if (Client.mz * -1848743379 > -1 && Client.overheadTextCount * 734988573 < 1025553311 * Client.lq) {
               Client.overheadTextXOffsets[734988573 * Client.overheadTextCount] = fx.fontBold12.ao(var0.overheadText) / 2;
               Client.le[Client.overheadTextCount * 734988573] = fx.fontBold12.al;
               Client.lj[734988573 * Client.overheadTextCount] = -1848743379 * Client.mz;
               Client.ll[Client.overheadTextCount * 734988573] = 318977283 * Client.mu - var10;
               Client.lx[Client.overheadTextCount * 734988573] = var0.movementFrame * -1337884343;
               Client.lo[734988573 * Client.overheadTextCount] = var0.walkBackSequence * 819594233;
               Client.lw[Client.overheadTextCount * 734988573] = -536830723 * var0.movementSequence;
               Client.overheadText[Client.overheadTextCount * 734988573] = var0.overheadText;
               Client.overheadTextCount += -1973288651;
               var10 += 12;
            }
         }

         int var16;
         int var23;
         int var24;
         if (!var0.headbars.at()) {
            eg.jd_renamed(var0, -767387641 * var0.de + 15);

            for(Headbar var77 = (Headbar)var0.headbars.last(); null != var77; var77 = (Headbar)var0.headbars.previous()) {
               HeadbarUpdate var12 = var77.get(-1886224337 * Client.ep);
               if (null == var12) {
                  if (var77.isEmpty()) {
                     var77.ga();
                  }
               } else {
                  HeadbarType var13 = var77.type;
                  Rasterizer3D var14 = var13.ac();
                  Rasterizer3D var15 = var13.aw();
                  int var17 = 0;
                  if (var14 != null && var15 != null) {
                     if (var13.widthPadding * 166630382 < var15.an) {
                        var17 = -2064168457 * var13.widthPadding;
                     }

                     var16 = var15.an - var17 * 2;
                  } else {
                     var16 = 279738407 * var13.width;
                  }

                  int var18 = 255;
                  boolean var19 = true;
                  int var20 = -1886224337 * Client.ep - var12.health2 * -1225111563;
                  int var21 = var12.health * -2028064551 * var16 / (var13.width * 279738407);
                  int var22;
                  int var91;
                  if (var12.cycleOffset * -2116244499 > var20) {
                     var22 = var13.int4 * 294055185 == 0 ? 0 : 294055185 * var13.int4 * (var20 / (294055185 * var13.int4));
                     var23 = var16 * 1250696899 * var12.cycle / (279738407 * var13.width);
                     var91 = var23 + var22 * (var21 - var23) / (-2116244499 * var12.cycleOffset);
                  } else {
                     var91 = var21;
                     var22 = var13.int5 * -407931959 + var12.cycleOffset * -2116244499 - var20;
                     if (var13.int3 * -471494485 >= 0) {
                        var18 = (var22 << 8) / (var13.int5 * -407931959 - -471494485 * var13.int3);
                     }
                  }

                  if (-2028064551 * var12.health > 0 && var91 < 1) {
                     var91 = 1;
                  }

                  if (var14 != null && var15 != null) {
                     if (var16 == var91) {
                        var91 += 2 * var17;
                     } else {
                        var91 += var17;
                     }

                     var22 = var14.aw;
                     var10 += var22;
                     var23 = -1848743379 * Client.mz + var2 - (var16 >> 1);
                     var24 = Client.mu * 318977283 + var3 - var10;
                     var23 -= var17;
                     if (var18 >= 0 && var18 < 255) {
                        var14.am(var23, var24, var18);
                        Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var91, var24 + var22);
                        var15.am(var23, var24, var18);
                     } else {
                        var14.ax(var23, var24);
                        Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var91 + var23, var24 + var22);
                        var15.ax(var23, var24);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4 + var2, var3 + var5);
                     var10 += 2;
                  } else {
                     var10 += 5;
                     if (-1848743379 * Client.mz > -1) {
                        var22 = var2 + -1848743379 * Client.mz - (var16 >> 1);
                        var23 = Client.mu * 318977283 + var3 - var10;
                        Rasterizer2D.Rasterizer2D_fillRectangle(var22, var23, var91, 5, 65280);
                        Rasterizer2D.Rasterizer2D_fillRectangle(var22 + var91, var23, var16 - var91, 5, 16711680);
                     }

                     var10 += 2;
                  }
               }
            }
         }

         if (-2 == var10) {
            var10 += 7;
         }

         Player var78;
         int var79;
         if (var9 && var0.bd * -1532330627 == Client.ep * -1886224337 && ai.jj_renamed((Player)var0)) {
            var78 = (Player)var0;
            if (var9) {
               var79 = 15 + -767387641 * var0.de;
               ot.worldToScreen(1144428983 * var0.bx, -411750205 * var0.bo, var79);
               AbstractFont var81 = (AbstractFont)Client.im.get(FontName.FontName_plain12);
               var10 += 4;
               var81.drawCentered(var78.username.af(), Client.mz * -1848743379 + var2, Client.mu * 318977283 + var3 - var10, 16777215, 0);
               var10 += 18;
            }
         }

         if (var9) {
            var78 = (Player)var0;
            if (var78.az) {
               return;
            }

            if (-1 != var78.combatLevel * -1875167049 || -1 != -1905401649 * var78.headIconPk) {
               var79 = 15 + -767387641 * var0.de;
               ot.worldToScreen(var0.bx * 1144428983, -411750205 * var0.bo, var79);
               if (-1848743379 * Client.mz > -1) {
                  if (-1875167049 * var78.combatLevel != -1) {
                     var10 += 25;
                     bt.jl[var78.combatLevel * -1875167049].ax(var2 + Client.mz * -1848743379 - 12, 318977283 * Client.mu + var3 - var10);
                  }

                  if (-1905401649 * var78.headIconPk != -1) {
                     var10 += 25;
                     qj.kc[-1905401649 * var78.headIconPk].ax(Client.mz * -1848743379 + var2 - 12, var3 + Client.mu * 318977283 - var10);
                  }
               }
            }

            if (var1 >= 0 && 10 == 633821975 * Client.eu && Client.eb * 561980131 == var8[var1]) {
               var79 = -767387641 * var0.de + 15;
               ot.worldToScreen(var0.bx * 1144428983, -411750205 * var0.bo, var79);
               if (-1848743379 * Client.mz > -1) {
                  var10 += IDKType.ku[1].aw;
                  IDKType.ku[1].ax(var2 + Client.mz * -1848743379 - 12, 318977283 * Client.mu + var3 - var10);
               }
            }
         } else {
            Npc var80 = (Npc)var0;
            int[] var82 = var80.ao();
            short[] var83 = var80.ax();
            int var85;
            if (var83 != null && null != var82) {
               for(var85 = 0; var85 < var83.length; ++var85) {
                  if (var83[var85] >= 0 && var82[var85] >= 0) {
                     long var86 = (long)var82[var85] << 8 | (long)var83[var85];
                     Rasterizer3D var89 = (Rasterizer3D)Client.wx.an(var86);
                     if (var89 == null) {
                        Rasterizer3D[] var90 = eb.an_renamed(rr.archive7, var82[var85], 0);
                        if (null != var90 && var83[var85] < var90.length) {
                           var89 = var90[var83[var85]];
                           Client.wx.aw(var86, var89);
                        }
                     }

                     if (null != var89) {
                        eg.jd_renamed(var0, var0.de * -767387641 + 15);
                        if (-1848743379 * Client.mz > -1) {
                           var89.ax(-1848743379 * Client.mz + var2 - (var89.an >> 1), 318977283 * Client.mu + (var3 - var89.aw) - 4);
                        }
                     }
                  }
               }
            }

            if (1 == Client.eu * 633821975 && 920558921 * Client.es == Client.iy[var1 - var76] && Client.ep * -1886224337 % 20 < 10) {
               var85 = 15 + -767387641 * var0.de;
               ot.worldToScreen(var0.bx * 1144428983, -411750205 * var0.bo, var85);
               if (-1848743379 * Client.mz > -1) {
                  IDKType.ku[0].ax(var2 + Client.mz * -1848743379 - 12, 318977283 * Client.mu + var3 - 28);
               }
            }
         }

         for(var11 = 0; var11 < 4; ++var11) {
            var79 = var0.hitmarkCycles[var11];
            int var84 = var0.hitmarkTypes[var11];
            HitmarkType var87 = null;
            int var88 = 0;
            if (var84 >= 0) {
               if (var79 <= -1886224337 * Client.ep) {
                  continue;
               }

               var87 = ew.getHitmarkType(var0.hitmarkTypes[var11]);
               var88 = 292771999 * var87.ai;
               if (var87 != null && null != var87.transforms) {
                  var87 = var87.transform();
                  if (var87 == null) {
                     var0.hitmarkCycles[var11] = -1;
                     continue;
                  }
               }
            } else if (var79 < 0) {
               continue;
            }

            var16 = var0.hitmarkValues2[var11];
            HitmarkType var93 = null;
            if (var16 >= 0) {
               var93 = ew.getHitmarkType(var16);
               if (null != var93 && var93.transforms != null) {
                  var93 = var93.transform();
               }
            }

            if (var79 - var88 <= -1886224337 * Client.ep) {
               if (null == var87) {
                  var0.hitmarkCycles[var11] = -1;
               } else {
                  eg.jd_renamed(var0, var0.de * -767387641 / 2);
                  if (Client.mz * -1848743379 > -1) {
                     boolean var92 = true;
                     if (1 == var11) {
                        Client.mu -= -2135862948;
                     }

                     if (var11 == 2) {
                        Client.mz -= 187425963;
                        Client.mu -= 1079552174;
                     }

                     if (3 == var11) {
                        Client.mz += 187425963;
                        Client.mu -= 1079552174;
                     }

                     Rasterizer3D var96 = null;
                     Rasterizer3D var94 = null;
                     Rasterizer3D var95 = null;
                     Rasterizer3D var97 = null;
                     var23 = 0;
                     var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     int var30 = 0;
                     Rasterizer3D var31 = null;
                     Rasterizer3D var32 = null;
                     Rasterizer3D var33 = null;
                     Rasterizer3D var34 = null;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     int var43 = 0;
                     var96 = var87.ab();
                     int var44;
                     if (null != var96) {
                        var23 = var96.an;
                        var44 = var96.aw;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var27 = var96.ac;
                     }

                     var94 = var87.aq();
                     if (null != var94) {
                        var24 = var94.an;
                        var44 = var94.aw;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var28 = var94.ac;
                     }

                     var95 = var87.al();
                     if (var95 != null) {
                        var25 = var95.an;
                        var44 = var95.aw;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var29 = var95.ac;
                     }

                     var97 = var87.at();
                     if (var97 != null) {
                        var26 = var97.an;
                        var44 = var97.aw;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var30 = var97.ac;
                     }

                     if (var93 != null) {
                        var31 = var93.ab();
                        if (var31 != null) {
                           var35 = var31.an;
                           var44 = var31.aw;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var39 = var31.ac;
                        }

                        var32 = var93.aq();
                        if (var32 != null) {
                           var36 = var32.an;
                           var44 = var32.aw;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var40 = var32.ac;
                        }

                        var33 = var93.al();
                        if (null != var33) {
                           var37 = var33.an;
                           var44 = var33.aw;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var41 = var33.ac;
                        }

                        var34 = var93.at();
                        if (null != var34) {
                           var38 = var34.an;
                           var44 = var34.aw;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var42 = var34.ac;
                        }
                     }

                     Font var98 = var87.getFont();
                     if (null == var98) {
                        var98 = Language.fontPlain11;
                     }

                     Font var45;
                     if (null != var93) {
                        var45 = var93.getFont();
                        if (var45 == null) {
                           var45 = Language.fontPlain11;
                        }
                     } else {
                        var45 = Language.fontPlain11;
                     }

                     String var46 = null;
                     String var47 = null;
                     boolean var48 = false;
                     int var49 = 0;
                     var46 = var87.getString(var0.hitmarkValues[var11]);
                     int var99 = var98.ao(var46);
                     if (var93 != null) {
                        var47 = var93.getString(var0.hitmarkTypes2[var11]);
                        var49 = var45.ao(var47);
                     }

                     int var50 = 0;
                     int var51 = 0;
                     if (var24 > 0) {
                        if (null == var95 && var97 == null) {
                           var50 = 1;
                        } else {
                           var50 = 1 + var99 / var24;
                        }
                     }

                     if (null != var93 && var36 > 0) {
                        if (null == var33 && var34 == null) {
                           var51 = 1;
                        } else {
                           var51 = var49 / var36 + 1;
                        }
                     }

                     int var52 = 0;
                     int var53 = var52;
                     if (var23 > 0) {
                        var52 += var23;
                     }

                     var52 += 2;
                     int var54 = var52;
                     if (var25 > 0) {
                        var52 += var25;
                     }

                     int var55 = var52;
                     int var56 = var52;
                     int var57;
                     if (var24 > 0) {
                        var57 = var50 * var24;
                        var52 += var57;
                        var56 += (var57 - var99) / 2;
                     } else {
                        var52 += var99;
                     }

                     var57 = var52;
                     if (var26 > 0) {
                        var52 += var26;
                     }

                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61 = 0;
                     int var62 = 0;
                     int var63;
                     if (var93 != null) {
                        var52 += 2;
                        var58 = var52;
                        if (var35 > 0) {
                           var52 += var35;
                        }

                        var52 += 2;
                        var59 = var52;
                        if (var37 > 0) {
                           var52 += var37;
                        }

                        var60 = var52;
                        var62 = var52;
                        if (var36 > 0) {
                           var63 = var36 * var51;
                           var52 += var63;
                           var62 += (var63 - var49) / 2;
                        } else {
                           var52 += var49;
                        }

                        var61 = var52;
                        if (var38 > 0) {
                           var52 += var38;
                        }
                     }

                     var63 = var0.hitmarkCycles[var11] - -1886224337 * Client.ep;
                     int var64 = var87.transformVarbit * 895105585 - 895105585 * var87.transformVarbit * var63 / (292771999 * var87.ai);
                     int var65 = 498242719 * var87.as * var63 / (var87.ai * 292771999) + -(var87.as * 498242719);
                     int var66 = var2 + -1848743379 * Client.mz - (var52 >> 1) + var64;
                     int var67 = var3 + Client.mu * 318977283 - 12 + var65;
                     int var68 = var67;
                     int var69 = var67 + var43;
                     int var70 = var67 + 15 + 1785373205 * var87.ad;
                     int var71 = var70 - var98.at;
                     int var72 = var98.aa + var70;
                     if (var71 < var67) {
                        var68 = var71;
                     }

                     if (var72 > var69) {
                        var69 = var72;
                     }

                     int var73 = 0;
                     int var74;
                     int var75;
                     if (null != var93) {
                        var73 = 1785373205 * var93.ad + var67 + 15;
                        var74 = var73 - var45.at;
                        var75 = var73 + var45.aa;
                        if (var74 < var68) {
                           ;
                        }

                        if (var75 > var69) {
                           ;
                        }
                     }

                     var74 = 255;
                     if (-1413310139 * var87.aj >= 0) {
                        var74 = (var63 << 8) / (var87.ai * 292771999 - var87.aj * -1413310139);
                     }

                     if (var74 >= 0 && var74 < 255) {
                        if (var96 != null) {
                           var96.am(var66 + var53 - var27, var67, var74);
                        }

                        if (null != var95) {
                           var95.am(var54 + var66 - var29, var67, var74);
                        }

                        if (var94 != null) {
                           for(var75 = 0; var75 < var50; ++var75) {
                              var94.am(var75 * var24 + (var55 + var66 - var28), var67, var74);
                           }
                        }

                        if (var97 != null) {
                           var97.am(var66 + var57 - var30, var67, var74);
                        }

                        var98.am(var46, var56 + var66, var70, var87.ax * -2000718353, 0, var74);
                        if (null != var93) {
                           if (null != var31) {
                              var31.am(var58 + var66 - var39, var67, var74);
                           }

                           if (var33 != null) {
                              var33.am(var59 + var66 - var41, var67, var74);
                           }

                           if (null != var32) {
                              for(var75 = 0; var75 < var51; ++var75) {
                                 var32.am(var66 + var60 - var40 + var36 * var75, var67, var74);
                              }
                           }

                           if (var34 != null) {
                              var34.am(var61 + var66 - var42, var67, var74);
                           }

                           var45.am(var47, var66 + var62, var73, var93.ax * -2000718353, 0, var74);
                        }
                     } else {
                        if (var96 != null) {
                           var96.ax(var53 + var66 - var27, var67);
                        }

                        if (null != var95) {
                           var95.ax(var54 + var66 - var29, var67);
                        }

                        if (null != var94) {
                           for(var75 = 0; var75 < var50; ++var75) {
                              var94.ax(var24 * var75 + (var55 + var66 - var28), var67);
                           }
                        }

                        if (var97 != null) {
                           var97.ax(var66 + var57 - var30, var67);
                        }

                        var98.ar(var46, var66 + var56, var70, var87.ax * -2000718353 | -16777216, 0);
                        if (null != var93) {
                           if (var31 != null) {
                              var31.ax(var58 + var66 - var39, var67);
                           }

                           if (var33 != null) {
                              var33.ax(var59 + var66 - var41, var67);
                           }

                           if (var32 != null) {
                              for(var75 = 0; var75 < var51; ++var75) {
                                 var32.ax(var66 + var60 - var40 + var75 * var36, var67);
                              }
                           }

                           if (null != var34) {
                              var34.ax(var66 + var61 - var42, var67);
                           }

                           var45.ar(var47, var66 + var62, var73, var93.ax * -2000718353 | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   static int az_renamed(int var0, ClientScript var1, boolean var2) {
      Component var4 = gh.an_renamed(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
      if (2800 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = hc.af_renamed(KeyHandler.getComponentClickMask(var4));
         return 1;
      } else if (var0 != 2801) {
         if (2802 == var0) {
            if (null == var4.opbase) {
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
            } else {
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4.opbase;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         --var5;
         if (var4.ops != null && var5 < var4.ops.length && null != var4.ops[var5]) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var4.ops[var5];
         } else {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
         }

         return 1;
      }
   }

   static ClientScript loadClientScript(byte[] var0) {
      ClientScript var2 = new ClientScript();
      Packet var3 = new Packet(var0);
      var3.index = -1516355947 * (var3.array.length - 2);
      int var4 = var3.cl();
      int var5 = var3.array.length - 2 - var4 - 12;
      var3.index = -1516355947 * var5;
      int var6 = var3.g4s();
      var2.ab = var3.cl() * -140315817;
      var2.aq = var3.cl() * -1816416047;
      var2.al = var3.cl() * -603637105;
      var2.at = var3.cl() * -751032223;
      int var7 = var3.g1();
      int var8;
      int var9;
      if (var7 > 0) {
         var2.switches = var2.au(var7);

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var3.cl();
            IterableNodeHashTable var10 = new IterableNodeHashTable(var9 > 0 ? co.ab_renamed(var9) : 1);
            var2.switches[var8] = var10;

            while(var9-- > 0) {
               int var11 = var3.g4s();
               int var12 = var3.g4s();
               var10.put(new IntegerNode(var12), (long)var11);
            }
         }
      }

      var3.index = 0;
      var2.an = var3.cz();
      var2.aw = new int[var6];
      var2.ac = new int[var6];
      var2.stringOperands = new String[var6];

      for(var8 = 0; -1633313603 * var3.index < var5; var2.aw[var8++] = var9) {
         var9 = var3.cl();
         if (var9 == 3) {
            var2.stringOperands[var8] = var3.cw();
         } else if (var9 < 100 && var9 != 21 && var9 != 38 && 39 != var9) {
            var2.ac[var8] = var3.g4s();
         } else {
            var2.ac[var8] = var3.g1();
         }
      }

      return var2;
   }

   static final void jz_renamed(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      dg var11 = null;

      for(dg var12 = (dg)Client.nn.last(); null != var12; var12 = (dg)Client.nn.previous()) {
         if (var12.af * 593068225 == var0 && var12.aw * 68300005 == var1 && var2 == 800888185 * var12.ac && var3 == -1586499579 * var12.an) {
            var11 = var12;
            break;
         }
      }

      if (var11 == null) {
         var11 = new dg();
         var11.af = -1417998527 * var0;
         var11.an = var3 * 2090818765;
         var11.aw = var1 * -1524387603;
         var11.ac = var2 * -1930509111;
         var11.ay = 620279391;
         Messages.kc_renamed(var11);
         Client.nn.addFirst(var11);
      }

      var11.al = 1572573337 * var4;
      var11.aa = 192741763 * var5;
      var11.at = 1233957891 * var6;
      var11.ai = var8 * 237969965;
      var11.ag = var9 * 376812409;
      var11.af(var7);
   }

   public static boolean af_renamed(AbstractArchive var0, AbstractArchive var1) {
      MapElementType.af = var1;
      if (!var0.cc()) {
         return false;
      } else {
         mo.MapElementType_count = var0.cq(35) * 827991417;
         MapElementType.MapElementType_cached = new MapElementType[mo.MapElementType_count * -1703136055];

         for(int var3 = 0; var3 < mo.MapElementType_count * -1703136055; ++var3) {
            byte[] var4 = var0.takeFile(35, var3);
            MapElementType.MapElementType_cached[var3] = new MapElementType(var3);
            if (var4 != null) {
               MapElementType.MapElementType_cached[var3].decode(new Packet(var4));
               MapElementType.MapElementType_cached[var3].au();
            }
         }

         return true;
      }
   }

   static void ag_renamed(GameShell var0) {
      hy var2 = Client.sh;
      hy var3 = var2;

      while(var3.ag()) {
         if (546317845 * var3.ai == 13) {
            fd.am_renamed();
            return;
         }

         if (var3.ai * 546317845 == 96) {
            if (1246310743 * cz.dh > 0 && null != PlayerType.dz) {
               cz.dh -= -1379513753;
            }
         } else if (97 == 546317845 * var3.ai && cz.dh * 1246310743 < 1959698517 * cz.dp && null != ai.dg) {
            cz.dh += -1379513753;
         }
      }

      if (1 == -1222491879 * MouseHandler.ar || !su.ev && -1222491879 * MouseHandler.ar == 4) {
         int var4 = cz.aw * 578342931 + 280;
         if (MouseHandler.MouseHandler_lastButton * 2020601481 >= var4 && MouseHandler.MouseHandler_lastButton * 2020601481 <= var4 + 14 && 1163896205 * MouseHandler.as >= 4 && MouseHandler.as * 1163896205 <= 18) {
            ta.an_renamed(0, 0);
            return;
         }

         if (2020601481 * MouseHandler.MouseHandler_lastButton >= 15 + var4 && MouseHandler.MouseHandler_lastButton * 2020601481 <= var4 + 80 && 1163896205 * MouseHandler.as >= 4 && 1163896205 * MouseHandler.as <= 18) {
            ta.an_renamed(0, 1);
            return;
         }

         int var5 = 390 + 578342931 * cz.aw;
         if (MouseHandler.MouseHandler_lastButton * 2020601481 >= var5 && MouseHandler.MouseHandler_lastButton * 2020601481 <= var5 + 14 && 1163896205 * MouseHandler.as >= 4 && MouseHandler.as * 1163896205 <= 18) {
            ta.an_renamed(1, 0);
            return;
         }

         if (MouseHandler.MouseHandler_lastButton * 2020601481 >= var5 + 15 && 2020601481 * MouseHandler.MouseHandler_lastButton <= var5 + 80 && MouseHandler.as * 1163896205 >= 4 && 1163896205 * MouseHandler.as <= 18) {
            ta.an_renamed(1, 1);
            return;
         }

         int var6 = 500 + cz.aw * 578342931;
         if (MouseHandler.MouseHandler_lastButton * 2020601481 >= var6 && 2020601481 * MouseHandler.MouseHandler_lastButton <= var6 + 14 && 1163896205 * MouseHandler.as >= 4 && 1163896205 * MouseHandler.as <= 18) {
            ta.an_renamed(2, 0);
            return;
         }

         if (2020601481 * MouseHandler.MouseHandler_lastButton >= var6 + 15 && MouseHandler.MouseHandler_lastButton * 2020601481 <= 80 + var6 && MouseHandler.as * 1163896205 >= 4 && MouseHandler.as * 1163896205 <= 18) {
            ta.an_renamed(2, 1);
            return;
         }

         int var7 = cz.aw * 578342931 + 610;
         if (MouseHandler.MouseHandler_lastButton * 2020601481 >= var7 && MouseHandler.MouseHandler_lastButton * 2020601481 <= var7 + 14 && 1163896205 * MouseHandler.as >= 4 && MouseHandler.as * 1163896205 <= 18) {
            ta.an_renamed(3, 0);
            return;
         }

         if (2020601481 * MouseHandler.MouseHandler_lastButton >= 15 + var7 && MouseHandler.MouseHandler_lastButton * 2020601481 <= 80 + var7 && MouseHandler.as * 1163896205 >= 4 && MouseHandler.as * 1163896205 <= 18) {
            ta.an_renamed(3, 1);
            return;
         }

         if (2020601481 * MouseHandler.MouseHandler_lastButton >= 708 + cz.aw * 578342931 && MouseHandler.as * 1163896205 >= 4 && 2020601481 * MouseHandler.MouseHandler_lastButton <= 708 + cz.aw * 578342931 + 50 && 1163896205 * MouseHandler.as <= 20) {
            fd.am_renamed();
            return;
         }

         if (cz.de * 248569915 != -1) {
            World var8 = bx.worlds[248569915 * cz.de];
            FloorOverlayType.ah_renamed(var8);
            fd.am_renamed();
            return;
         }

         if (cz.dh * 1246310743 > 0 && null != PlayerType.dz && 2020601481 * MouseHandler.MouseHandler_lastButton >= 0 && MouseHandler.MouseHandler_lastButton * 2020601481 <= PlayerType.dz.subWidth && 1163896205 * MouseHandler.as >= 1658005443 * kd.ak / 2 - 50 && 1163896205 * MouseHandler.as <= 1658005443 * kd.ak / 2 + 50) {
            cz.dh -= -1379513753;
         }

         if (1246310743 * cz.dh < cz.dp * 1959698517 && null != ai.dg && MouseHandler.MouseHandler_lastButton * 2020601481 >= GameShell.aj * -1687260435 - ai.dg.subWidth - 5 && MouseHandler.MouseHandler_lastButton * 2020601481 <= GameShell.aj * -1687260435 && MouseHandler.as * 1163896205 >= kd.ak * 1658005443 / 2 - 50 && MouseHandler.as * 1163896205 <= kd.ak * 1658005443 / 2 + 50) {
            cz.dh += -1379513753;
         }
      }

   }

   static int aw_renamed(int var0, ClientScript var1, boolean var2) {
      if (var0 < 1000) {
         return dp.ac_renamed(var0, var1, var2);
      } else if (var0 < 1100) {
         return fs.au_renamed(var0, var1, var2);
      } else if (var0 < 1200) {
         return bx.ab_renamed(var0, var1, var2);
      } else if (var0 < 1300) {
         return Varcs.aq_renamed(var0, var1, var2);
      } else if (var0 < 1400) {
         return StructType.al_renamed(var0, var1, var2);
      } else if (var0 < 1500) {
         return em.ao_renamed(var0, var1, var2, (byte)-1);
      } else if (var0 < 1600) {
         return jn.ax_renamed(var0, var1, var2);
      } else if (var0 < 1700) {
         return AbstractUserComparator.ai_renamed(var0, var1, var2);
      } else if (var0 < 1800) {
         return DefaultsGroup.ag_renamed(var0, var1, var2);
      } else if (var0 < 1900) {
         return in.ar_renamed(var0, var1, var2);
      } else if (var0 < 2000) {
         return ai.am_renamed(var0, var1, var2);
      } else if (var0 < 2100) {
         return fs.au_renamed(var0, var1, var2);
      } else if (var0 < 2200) {
         return bx.ab_renamed(var0, var1, var2);
      } else if (var0 < 2300) {
         return Varcs.aq_renamed(var0, var1, var2);
      } else if (var0 < 2400) {
         return StructType.al_renamed(var0, var1, var2);
      } else if (var0 < 2500) {
         return em.ao_renamed(var0, var1, var2, (byte)-1);
      } else if (var0 < 2600) {
         return bx.as_renamed(var0, var1, var2);
      } else if (var0 < 2700) {
         return MouseHandler.aj_renamed(var0, var1, var2);
      } else if (var0 < 2800) {
         return TilePaint.ak_renamed(var0, var1, var2);
      } else if (var0 < 2900) {
         return az_renamed(var0, var1, var2);
      } else if (var0 < 3000) {
         return ai.am_renamed(var0, var1, var2);
      } else if (var0 < 3200) {
         return NetFileRequest.ad_renamed(var0, var1, var2);
      } else if (var0 < 3300) {
         return hq.ae_renamed(var0, var1, var2);
      } else if (var0 < 3400) {
         return fe.ap_renamed(var0, var1, var2);
      } else if (var0 < 3500) {
         return ow.by_renamed(var0, var1, var2);
      } else if (var0 < 3600) {
         return HitmarkType.bb_renamed(var0, var1, var2);
      } else if (var0 < 3700) {
         return WorldMapAreaData.bi_renamed(var0, var1, var2);
      } else if (var0 < 3800) {
         return FloorOverlayType.be_renamed(var0, var1, var2);
      } else if (var0 < 3900) {
         return sh.bk_renamed(var0, var1, var2);
      } else if (var0 < 4000) {
         return am.bx_renamed(var0, var1, var2);
      } else if (var0 < 4100) {
         return eb.bo_renamed(var0, var1, var2);
      } else if (var0 < 4200) {
         return cm.bz_renamed(var0, var1, var2);
      } else if (var0 < 4300) {
         return MusicPatchPcmStream.bm_renamed(var0, var1, var2);
      } else if (var0 < 5100) {
         return eg.bd_renamed(var0, var1, var2);
      } else if (var0 < 5400) {
         return ej.bt_renamed(var0, var1, var2);
      } else if (var0 < 5600) {
         return TaskHandler.bj_renamed(var0, var1, var2);
      } else if (var0 < 5700) {
         return Client.bn_renamed(var0, var1, var2);
      } else if (var0 < 6300) {
         return mg.bg_renamed(var0, var1, var2);
      } else if (var0 < 6600) {
         return WorldMapArea.bu_renamed(var0, var1, var2);
      } else if (var0 < 6700) {
         return MouseRecorder.bf_renamed(var0, var1, var2);
      } else if (var0 < 6800) {
         return ks.bq_renamed(var0, var1, var2);
      } else if (var0 < 6900) {
         return NetFileRequest.ba_renamed(var0, var1, var2);
      } else if (var0 < 7000) {
         return eu.bv_renamed(var0, var1, var2);
      } else if (var0 < 7100) {
         return SoundSystem.bl_renamed(var0, var1, var2);
      } else if (var0 < 7200) {
         return gt.bp_renamed(var0, var1, var2);
      } else if (var0 < 7300) {
         return av.bc_renamed(var0, var1, var2);
      } else if (var0 < 7500) {
         return ey.bh_renamed(var0, var1, var2);
      } else if (var0 < 7600) {
         return fw.bw_renamed(var0, var1, var2);
      } else {
         return var0 < 7700 ? FriendSystem.ce_renamed(var0, var1, var2) : 2;
      }
   }

   public static ParamType getParamType(int var0) {
      ParamType var2 = (ParamType)ParamType.ParamType_cached.get((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = ParamType.af.takeFile(11, var0);
         var2 = new ParamType();
         if (var3 != null) {
            var2.decode(new Packet(var3));
         }

         var2.postDecode();
         ParamType.ParamType_cached.put(var2, (long)var0);
         return var2;
      }
   }

   bz(int var1, int var2) {
      this.aq = 426904267 * var1;
      this.al = 1169393169 * var2;
   }
}
