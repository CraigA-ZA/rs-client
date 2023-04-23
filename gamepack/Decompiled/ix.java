public class ix {
   public static boolean ac = false;
   public static boolean af = false;
   public static int ai = 0;
   public static int an = 0;
   public static int aw = 0;
   public static long[] ag = new long[1000];
   static int al;
   static int ao;
   static int aq;
   static int au;
   static String hv;

   ix() throws Throwable {
      throw new Error();
   }

   static int an_renamed(int var0) {
      return bi.KeyHandler_keyCodes[var0];
   }

   static final void updateInterface(Component[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var9 = 0; var9 < var0.length; ++var9) {
         Component var10 = var0[var9];
         if (null != var10 && var1 == var10.parentId * 913615679 && (var10.am() || KeyHandler.getComponentClickMask(var10) != 0 || var10 == Client.pf)) {
            if (var10.isIf3) {
               if (pm.isComponentHidden(var10)) {
                  continue;
               }
            } else if (0 == var10.bg * 883712245 && MidiPcmStream.oh != var10 && pm.isComponentHidden(var10)) {
               continue;
            }

            if (11 == var10.bg * 883712245) {
               if (var10.bz(ag.urlRequester)) {
                  if (var10.by()) {
                     fw.ma_renamed(var10);
                     WallDecoration.lz_renamed(var10.children, var10, true);
                  }

                  if (var10.gw != null) {
                     ClientScriptEvent var11 = new ClientScriptEvent();
                     var11.aw = var10;
                     var11.args0 = var10.gw;
                     Client.rq.addFirst(var11);
                  }
               }
            } else if (883712245 * var10.bg == 12 && var10.bu()) {
               fw.ma_renamed(var10);
            }

            int var27 = 262951665 * var10.x + var6;
            int var12 = -747355095 * var10.y + var7;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (9 == 883712245 * var10.bg) {
               var17 = var27;
               var18 = var12;
               var19 = -794961409 * var10.width + var27;
               int var20 = var10.height * 1473950221 + var12;
               if (var19 < var27) {
                  var17 = var19;
                  var19 = var27;
               }

               if (var20 < var12) {
                  var18 = var20;
                  var20 = var12;
               }

               ++var19;
               ++var20;
               var13 = var17 > var2 ? var17 : var2;
               var14 = var18 > var3 ? var18 : var3;
               var15 = var19 < var4 ? var19 : var4;
               var16 = var20 < var5 ? var20 : var5;
            } else {
               var17 = var27 + var10.width * -794961409;
               var18 = var12 + var10.height * 1473950221;
               var13 = var27 > var2 ? var27 : var2;
               var14 = var12 > var3 ? var12 : var3;
               var15 = var17 < var4 ? var17 : var4;
               var16 = var18 < var5 ? var18 : var5;
            }

            if (var10 == Client.pr) {
               Client.px = true;
               Client.ph = 463567197 * var27;
               Client.pv = 551918419 * var12;
            }

            boolean var28 = false;
            if (var10.el) {
               switch (Client.pc * -1722511035) {
                  case 0:
                     var28 = true;
                  case 1:
                  default:
                     break;
                  case 2:
                     if (-842617159 * Client.pp == var10.id * 1713081171 >>> 16) {
                        var28 = true;
                     }
                     break;
                  case 3:
                     if (Client.pp * -842617159 == var10.id * 1713081171) {
                        var28 = true;
                     }
               }
            }

            if (var28 || !var10.isIf3 || var13 < var15 && var14 < var16) {
               if (var10.isIf3) {
                  ClientScriptEvent var29;
                  if (var10.noClickThrough) {
                     if (-2063363905 * MouseHandler.ay >= var13 && -1224153235 * MouseHandler.ao >= var14 && -2063363905 * MouseHandler.ay < var15 && MouseHandler.ao * -1224153235 < var16) {
                        for(var29 = (ClientScriptEvent)Client.rq.last(); null != var29; var29 = (ClientScriptEvent)Client.rq.previous()) {
                           if (var29.boolean1) {
                              var29.remove();
                              var29.aw.hw = false;
                           }
                        }

                        jh.jq_renamed();
                        if (0 == Formatting.qe * 1993201275) {
                           Client.pr = null;
                           Client.pf = null;
                        }

                        if (!Client.isMiniMenuOpen) {
                           gr.kw_renamed();
                        }
                     }
                  } else if (var10.hl && MouseHandler.ay * -2063363905 >= var13 && -1224153235 * MouseHandler.ao >= var14 && MouseHandler.ay * -2063363905 < var15 && -1224153235 * MouseHandler.ao < var16) {
                     for(var29 = (ClientScriptEvent)Client.rq.last(); null != var29; var29 = (ClientScriptEvent)Client.rq.previous()) {
                        if (var29.boolean1 && var29.args0 == var29.aw.onMouseLeave) {
                           var29.remove();
                        }
                     }
                  }
               }

               var18 = MouseHandler.ay * -2063363905;
               var19 = MouseHandler.ao * -1224153235;
               if (-1222491879 * MouseHandler.ar != 0) {
                  var18 = MouseHandler.MouseHandler_lastButton * 2020601481;
                  var19 = MouseHandler.as * 1163896205;
               }

               boolean var30 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
               if (1021339961 * var10.clientCode == 1337) {
                  if (!Client.da && !Client.isMiniMenuOpen && var30) {
                     ClientScriptFrame.ls_renamed(var18, var19, var13, var14);
                  }
               } else if (1338 == 1021339961 * var10.clientCode) {
                  MusicPatchNode.iw_renamed(var10, var27, var12);
               } else {
                  if (1400 == var10.clientCode * 1021339961) {
                     ey.worldMap0.onCycle(-2063363905 * MouseHandler.ay, MouseHandler.ao * -1224153235, var30, var27, var12, var10.width * -794961409, var10.height * 1473950221);
                  }

                  if (!Client.isMiniMenuOpen && var30) {
                     if (1021339961 * var10.clientCode == 1400) {
                        ey.worldMap0.cs(var27, var12, -794961409 * var10.width, 1473950221 * var10.height, var18, var19);
                     } else {
                        my.lo_renamed(var10);
                     }
                  }

                  boolean var22;
                  int var24;
                  if (var28) {
                     for(int var21 = 0; var21 < var10.en.length; ++var21) {
                        var22 = false;
                        boolean var23 = false;
                        if (!var22 && var10.en[var21] != null) {
                           for(var24 = 0; var24 < var10.en[var21].length; ++var24) {
                              boolean var25 = false;
                              if (null != var10.hs) {
                                 var25 = Client.sh.av(var10.en[var21][var24]);
                              }

                              if (do.mz_renamed(var10.en[var21][var24]) || var25) {
                                 var22 = true;
                                 if (null != var10.hs && var10.hs[var21] > -1886224337 * Client.ep) {
                                    break;
                                 }

                                 byte var26 = var10.er[var21][var24];
                                 if (var26 == 0 || ((var26 & 8) == 0 || !Client.sh.av(86) && !Client.sh.av(82) && !Client.sh.av(81)) && ((var26 & 2) == 0 || Client.sh.av(86)) && ((var26 & 1) == 0 || Client.sh.av(82)) && (0 == (var26 & 4) || Client.sh.av(81))) {
                                    var23 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var23) {
                           if (var21 < 10) {
                              Message.ks_renamed(1 + var21, var10.id * 1713081171, var10.childIndex * 55577617, -2006098851 * var10.itemId, "");
                           } else if (var21 == 10) {
                              gy.kp_renamed();
                              am.kh_renamed(var10.id * 1713081171, 55577617 * var10.childIndex, hc.af_renamed(KeyHandler.getComponentClickMask(var10)), -2006098851 * var10.itemId);
                              Client.oj = MusicPatchNode.nu_renamed(var10);
                              if (Client.oj == null) {
                                 Client.oj = Strings.Strings_null;
                              }

                              Client.selectedSpellName = var10.opbase + oa.colorStartTag(16777215);
                           }

                           var24 = var10.eg[var21];
                           if (null == var10.hs) {
                              var10.hs = new int[var10.en.length];
                           }

                           if (var10.ed == null) {
                              var10.ed = new int[var10.en.length];
                           }

                           if (0 != var24) {
                              if (0 == var10.hs[var21]) {
                                 var10.hs[var21] = -1886224337 * Client.ep + var24 + var10.ed[var21];
                              } else {
                                 var10.hs[var21] = var24 + Client.ep * -1886224337;
                              }
                           } else {
                              var10.hs[var21] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var22 && null != var10.hs) {
                           var10.hs[var21] = 0;
                        }
                     }
                  }

                  if (var10.isIf3) {
                     if (-2063363905 * MouseHandler.ay >= var13 && -1224153235 * MouseHandler.ao >= var14 && MouseHandler.ay * -2063363905 < var15 && MouseHandler.ao * -1224153235 < var16) {
                        var30 = true;
                     } else {
                        var30 = false;
                     }

                     boolean var31 = false;
                     if ((1 == MouseHandler.MouseHandler_currentButton * 114417019 || !su.ev && 4 == 114417019 * MouseHandler.MouseHandler_currentButton) && var30) {
                        var31 = true;
                     }

                     var22 = false;
                     if ((1 == -1222491879 * MouseHandler.ar || !su.ev && MouseHandler.ar * -1222491879 == 4) && MouseHandler.MouseHandler_lastButton * 2020601481 >= var13 && MouseHandler.as * 1163896205 >= var14 && 2020601481 * MouseHandler.MouseHandler_lastButton < var15 && 1163896205 * MouseHandler.as < var16) {
                        var22 = true;
                     }

                     if (var22) {
                        ol.mm_renamed(var10, MouseHandler.MouseHandler_lastButton * 2020601481 - var27, 1163896205 * MouseHandler.as - var12);
                     }

                     if (var10.isVisible()) {
                        if (var22) {
                           Client.re.addFirst(new hf(0, -2063363905 * MouseHandler.ay - var27, -1224153235 * MouseHandler.ao - var12, var10));
                        }

                        if (var31) {
                           Client.re.addFirst(new hf(1, -2063363905 * MouseHandler.ay - var27, MouseHandler.ao * -1224153235 - var12, var10));
                        }
                     }

                     if (1021339961 * var10.clientCode == 1400) {
                        ey.worldMap0.ac(var18, var19, var30 & var31, var30 & var22);
                     }

                     if (null != Client.pr && var10 != Client.pr && var30 && MusicPatchNode.aw_renamed(KeyHandler.getComponentClickMask(var10))) {
                        Client.pz = var10;
                     }

                     if (var10 == Client.pf) {
                        Client.pq = true;
                        Client.pi = -1150287901 * var27;
                        Client.pb = 68006725 * var12;
                     }

                     if (var10.hasListener) {
                        ClientScriptEvent var32;
                        if (var30 && 0 != -121753353 * Client.mouseWheelRotation && null != var10.onMouseLeave) {
                           var32 = new ClientScriptEvent();
                           var32.boolean1 = true;
                           var32.aw = var10;
                           var32.au = 835807251 * Client.mouseWheelRotation;
                           var32.args0 = var10.onMouseLeave;
                           Client.rq.addFirst(var32);
                        }

                        if (null != Client.pr || Client.isMiniMenuOpen) {
                           var22 = false;
                           var31 = false;
                           var30 = false;
                        }

                        if (!var10.hi && var22) {
                           var10.hi = true;
                           if (var10.onClickRepeat != null) {
                              var32 = new ClientScriptEvent();
                              var32.boolean1 = true;
                              var32.aw = var10;
                              var32.ac = (MouseHandler.MouseHandler_lastButton * 2020601481 - var27) * -2011830585;
                              var32.au = 1126405829 * (MouseHandler.as * 1163896205 - var12);
                              var32.args0 = var10.onClickRepeat;
                              Client.rq.addFirst(var32);
                           }
                        }

                        if (var10.hi && var31 && null != var10.onRelease) {
                           var32 = new ClientScriptEvent();
                           var32.boolean1 = true;
                           var32.aw = var10;
                           var32.ac = (-2063363905 * MouseHandler.ay - var27) * -2011830585;
                           var32.au = (-1224153235 * MouseHandler.ao - var12) * 1126405829;
                           var32.args0 = var10.onRelease;
                           Client.rq.addFirst(var32);
                        }

                        if (var10.hi && !var31) {
                           var10.hi = false;
                           if (null != var10.onTargetLeave) {
                              var32 = new ClientScriptEvent();
                              var32.boolean1 = true;
                              var32.aw = var10;
                              var32.ac = (-2063363905 * MouseHandler.ay - var27) * -2011830585;
                              var32.au = (MouseHandler.ao * -1224153235 - var12) * 1126405829;
                              var32.args0 = var10.onTargetLeave;
                              Client.rp.addFirst(var32);
                           }
                        }

                        if (var31 && null != var10.onDrag) {
                           var32 = new ClientScriptEvent();
                           var32.boolean1 = true;
                           var32.aw = var10;
                           var32.ac = (-2063363905 * MouseHandler.ay - var27) * -2011830585;
                           var32.au = 1126405829 * (MouseHandler.ao * -1224153235 - var12);
                           var32.args0 = var10.onDrag;
                           Client.rq.addFirst(var32);
                        }

                        if (!var10.hw && var30) {
                           var10.hw = true;
                           if (null != var10.onInvTransmit) {
                              var32 = new ClientScriptEvent();
                              var32.boolean1 = true;
                              var32.aw = var10;
                              var32.ac = (-2063363905 * MouseHandler.ay - var27) * -2011830585;
                              var32.au = (MouseHandler.ao * -1224153235 - var12) * 1126405829;
                              var32.args0 = var10.onInvTransmit;
                              Client.rq.addFirst(var32);
                           }
                        }

                        if (var10.hw && var30 && null != var10.onHold) {
                           var32 = new ClientScriptEvent();
                           var32.boolean1 = true;
                           var32.aw = var10;
                           var32.ac = -2011830585 * (-2063363905 * MouseHandler.ay - var27);
                           var32.au = (MouseHandler.ao * -1224153235 - var12) * 1126405829;
                           var32.args0 = var10.onHold;
                           Client.rq.addFirst(var32);
                        }

                        if (var10.hw && !var30) {
                           var10.hw = false;
                           if (null != var10.onTargetEnter) {
                              var32 = new ClientScriptEvent();
                              var32.boolean1 = true;
                              var32.aw = var10;
                              var32.ac = -2011830585 * (MouseHandler.ay * -2063363905 - var27);
                              var32.au = (-1224153235 * MouseHandler.ao - var12) * 1126405829;
                              var32.args0 = var10.onTargetEnter;
                              Client.rp.addFirst(var32);
                           }
                        }

                        if (null != var10.onClick) {
                           var32 = new ClientScriptEvent();
                           var32.aw = var10;
                           var32.args0 = var10.onClick;
                           Client.rt.addFirst(var32);
                        }

                        int var35;
                        ClientScriptEvent var37;
                        int var38;
                        if (var10.onOp != null && -261310919 * Client.qx > var10.hm * -1285197923) {
                           if (null != var10.invTransmitTriggers && Client.qx * -261310919 - -1285197923 * var10.hm <= 32) {
                              label965:
                              for(var38 = -1285197923 * var10.hm; var38 < -261310919 * Client.qx; ++var38) {
                                 var24 = Client.qr[var38 & 31];

                                 for(var35 = 0; var35 < var10.invTransmitTriggers.length; ++var35) {
                                    if (var24 == var10.invTransmitTriggers[var35]) {
                                       var37 = new ClientScriptEvent();
                                       var37.aw = var10;
                                       var37.args0 = var10.onOp;
                                       Client.rq.addFirst(var37);
                                       break label965;
                                    }
                                 }
                              }
                           } else {
                              var32 = new ClientScriptEvent();
                              var32.aw = var10;
                              var32.args0 = var10.onOp;
                              Client.rq.addFirst(var32);
                           }

                           var10.hm = Client.qx * 1401123917;
                        }

                        if (null != var10.onMouseRepeat && Client.qc * -710491461 > -320567063 * var10.hu) {
                           if (null != var10.statTransmitTriggers && -710491461 * Client.qc - var10.hu * -320567063 <= 32) {
                              label941:
                              for(var38 = var10.hu * -320567063; var38 < -710491461 * Client.qc; ++var38) {
                                 var24 = Client.qj[var38 & 31];

                                 for(var35 = 0; var35 < var10.statTransmitTriggers.length; ++var35) {
                                    if (var24 == var10.statTransmitTriggers[var35]) {
                                       var37 = new ClientScriptEvent();
                                       var37.aw = var10;
                                       var37.args0 = var10.onMouseRepeat;
                                       Client.rq.addFirst(var37);
                                       break label941;
                                    }
                                 }
                              }
                           } else {
                              var32 = new ClientScriptEvent();
                              var32.aw = var10;
                              var32.args0 = var10.onMouseRepeat;
                              Client.rq.addFirst(var32);
                           }

                           var10.hu = 1811343363 * Client.qc;
                        }

                        if (null != var10.onVarTransmit && Client.qf * -744210295 > var10.hx * 610184185) {
                           if (var10.varTransmitTriggers != null && Client.qf * -744210295 - var10.hx * 610184185 <= 32) {
                              label917:
                              for(var38 = var10.hx * 610184185; var38 < -744210295 * Client.qf; ++var38) {
                                 var24 = Client.qs[var38 & 31];

                                 for(var35 = 0; var35 < var10.varTransmitTriggers.length; ++var35) {
                                    if (var10.varTransmitTriggers[var35] == var24) {
                                       var37 = new ClientScriptEvent();
                                       var37.aw = var10;
                                       var37.args0 = var10.onVarTransmit;
                                       Client.rq.addFirst(var37);
                                       break label917;
                                    }
                                 }
                              }
                           } else {
                              var32 = new ClientScriptEvent();
                              var32.aw = var10;
                              var32.args0 = var10.onVarTransmit;
                              Client.rq.addFirst(var32);
                           }

                           var10.hx = -1736131311 * Client.qf;
                        }

                        if (-620063003 * Client.qb > -288310997 * var10.hj && null != var10.ft) {
                           var32 = new ClientScriptEvent();
                           var32.aw = var10;
                           var32.args0 = var10.ft;
                           Client.rq.addFirst(var32);
                        }

                        if (-421621503 * Client.qg > var10.hj * -288310997 && null != var10.gs) {
                           var32 = new ClientScriptEvent();
                           var32.aw = var10;
                           var32.args0 = var10.gs;
                           Client.rq.addFirst(var32);
                        }

                        if (-1685007587 * Client.qd > -288310997 * var10.hj && null != var10.gj) {
                           var32 = new ClientScriptEvent();
                           var32.aw = var10;
                           var32.args0 = var10.gj;
                           Client.rq.addFirst(var32);
                        }

                        if (Client.qy * -1127640293 > var10.hj * -288310997 && var10.gg != null) {
                           var32 = new ClientScriptEvent();
                           var32.aw = var10;
                           var32.args0 = var10.gg;
                           Client.rq.addFirst(var32);
                        }

                        if (Client.qz * 2059493293 > -288310997 * var10.hj && var10.ge != null) {
                           var32 = new ClientScriptEvent();
                           var32.aw = var10;
                           var32.args0 = var10.ge;
                           Client.rq.addFirst(var32);
                        }

                        if (Client.qq * -1835030315 > var10.hj * -288310997 && null != var10.gy) {
                           var32 = new ClientScriptEvent();
                           var32.aw = var10;
                           var32.args0 = var10.gy;
                           Client.rq.addFirst(var32);
                        }

                        if (Client.qv * -2057735521 > var10.hj * -288310997 && null != var10.gd) {
                           var32 = new ClientScriptEvent();
                           var32.aw = var10;
                           var32.args0 = var10.gd;
                           Client.rq.addFirst(var32);
                        }

                        if (Client.qa * -440718331 > var10.hj * -288310997 && var10.ga != null) {
                           var32 = new ClientScriptEvent();
                           var32.aw = var10;
                           var32.args0 = var10.ga;
                           Client.rq.addFirst(var32);
                        }

                        var10.hj = -1390983529 * Client.qu;
                        if (null != var10.fu) {
                           for(var38 = 0; var38 < -1685179677 * Client.sm; ++var38) {
                              ClientScriptEvent var36 = new ClientScriptEvent();
                              var36.aw = var10;
                              var36.al = -422970289 * Client.sz[var38];
                              var36.at = 1753443767 * Client.sk[var38];
                              var36.args0 = var10.fu;
                              Client.rq.addFirst(var36);
                           }
                        }

                        ClientScriptEvent var39;
                        int[] var40;
                        if (var10.gr != null) {
                           var40 = Client.sh.am();

                           for(var24 = 0; var24 < var40.length; ++var24) {
                              var39 = new ClientScriptEvent();
                              var39.aw = var10;
                              var39.al = -422970289 * var40[var24];
                              var39.args0 = var10.gr;
                              Client.rq.addFirst(var39);
                           }
                        }

                        if (var10.go != null) {
                           var40 = Client.sh.as();

                           for(var24 = 0; var24 < var40.length; ++var24) {
                              var39 = new ClientScriptEvent();
                              var39.aw = var10;
                              var39.al = var40[var24] * -422970289;
                              var39.args0 = var10.go;
                              Client.rq.addFirst(var39);
                           }
                        }
                     }
                  }

                  if (!var10.isIf3) {
                     if (null != Client.pr || Client.isMiniMenuOpen) {
                        continue;
                     }

                     if ((-529297769 * var10.mouseOverRedirect >= 0 || 0 != var10.mouseOverColor * 1614966389) && -2063363905 * MouseHandler.ay >= var13 && MouseHandler.ao * -1224153235 >= var14 && MouseHandler.ay * -2063363905 < var15 && -1224153235 * MouseHandler.ao < var16) {
                        if (var10.mouseOverRedirect * -529297769 >= 0) {
                           MidiPcmStream.oh = var0[var10.mouseOverRedirect * -529297769];
                        } else {
                           MidiPcmStream.oh = var10;
                        }
                     }

                     if (8 == 883712245 * var10.bg && MouseHandler.ay * -2063363905 >= var13 && MouseHandler.ao * -1224153235 >= var14 && MouseHandler.ay * -2063363905 < var15 && -1224153235 * MouseHandler.ao < var16) {
                        fe.os = var10;
                     }

                     if (var10.scrollHeight * -1273374131 > var10.height * 1473950221) {
                        gy.ll_renamed(var10, var27 + var10.width * -794961409, var12, var10.height * 1473950221, var10.scrollHeight * -1273374131, -2063363905 * MouseHandler.ay, MouseHandler.ao * -1224153235);
                     }
                  }

                  if (0 == 883712245 * var10.bg) {
                     updateInterface(var0, 1713081171 * var10.id, var13, var14, var15, var16, var27 - var10.scrollX * -1469632775, var12 - 1223232735 * var10.scrollY);
                     if (null != var10.children) {
                        updateInterface(var10.children, var10.id * 1713081171, var13, var14, var15, var16, var27 - var10.scrollX * -1469632775, var12 - 1223232735 * var10.scrollY);
                     }

                     InterfaceParent var33 = (InterfaceParent)Client.interfaceParents.get((long)(var10.id * 1713081171));
                     if (var33 != null) {
                        if (0 == -1702664641 * var33.an && -2063363905 * MouseHandler.ay >= var13 && MouseHandler.ao * -1224153235 >= var14 && MouseHandler.ay * -2063363905 < var15 && -1224153235 * MouseHandler.ao < var16 && !Client.isMiniMenuOpen) {
                           for(ClientScriptEvent var34 = (ClientScriptEvent)Client.rq.last(); null != var34; var34 = (ClientScriptEvent)Client.rq.previous()) {
                              if (var34.boolean1) {
                                 var34.remove();
                                 var34.aw.hw = false;
                              }
                           }

                           if (Formatting.qe * 1993201275 == 0) {
                              Client.pr = null;
                              Client.pf = null;
                           }

                           if (!Client.isMiniMenuOpen) {
                              gr.kw_renamed();
                           }
                        }

                        ReflectionCheck.mt_renamed(944864121 * var33.af, var13, var14, var15, var16, var27, var12);
                     }
                  }
               }
            }
         }
      }

   }
}
