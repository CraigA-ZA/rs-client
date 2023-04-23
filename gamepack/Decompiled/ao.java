import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

class ao implements TlsAuthentication {
   static UrlRequest aa;
   // $FF: synthetic field
   final ai this$2;

   ao(ai var1) {
      this.this$2 = var1;
   }

   public void notifyServerCertificate(Certificate var1) throws IOException {
      try {
         CertificateFactory var2 = CertificateFactory.getInstance("X.509");
         LinkedList var3 = new LinkedList();
         org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

         for(int var5 = 0; var5 < var4.length; ++var5) {
            org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
            var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
         }

         this.this$2.this$1.af = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
      } catch (CertificateException var7) {
         throw new IOException(var7);
      }
   }

   public void af(Certificate var1) throws IOException {
      try {
         CertificateFactory var2 = CertificateFactory.getInstance("X.509");
         LinkedList var3 = new LinkedList();
         org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

         for(int var5 = 0; var5 < var4.length; ++var5) {
            org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
            var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
         }

         this.this$2.this$1.af = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
      } catch (CertificateException var7) {
         throw new IOException(var7);
      }
   }

   public void aw(Certificate var1) throws IOException {
      try {
         CertificateFactory var2 = CertificateFactory.getInstance("X.509");
         LinkedList var3 = new LinkedList();
         org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

         for(int var5 = 0; var5 < var4.length; ++var5) {
            org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
            var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
         }

         this.this$2.this$1.af = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
      } catch (CertificateException var7) {
         throw new IOException(var7);
      }
   }

   public void an(Certificate var1) throws IOException {
      try {
         CertificateFactory var2 = CertificateFactory.getInstance("X.509");
         LinkedList var3 = new LinkedList();
         org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

         for(int var5 = 0; var5 < var4.length; ++var5) {
            org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
            var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
         }

         this.this$2.this$1.af = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
      } catch (CertificateException var7) {
         throw new IOException(var7);
      }
   }

   public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
      return null;
   }

   public TlsCredentials ac(CertificateRequest var1) throws IOException {
      return null;
   }

   public TlsCredentials au(CertificateRequest var1) throws IOException {
      return null;
   }

   static final void drawInterface(Component[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
      am.ao_renamed();

      for(int var10 = 0; var10 < var0.length; ++var10) {
         Component var11 = var0[var10];
         if (var11 != null && (var11.cu * 913615679 == var1 || var1 == -1412584499 && Client.pr == var11)) {
            int var12;
            if (var8 == -1) {
               Client.rh[Client.rr * -356793645] = var6 + 262951665 * var11.ce;
               Client.rb[-356793645 * Client.rr] = var11.ci * -747355095 + var7;
               Client.ra[-356793645 * Client.rr] = -794961409 * var11.cs;
               Client.ri[-356793645 * Client.rr] = 1473950221 * var11.cc;
               var12 = (Client.rr += 1127867739) * -356793645 - 1;
            } else {
               var12 = var8;
            }

            var11.hd = var12 * -1548573671;
            var11.hv = -95399417 * Client.ep;
            if (!var11.bn || !pm.isComponentHidden(var11)) {
               if (1021339961 * var11.bf > 0) {
                  MouseHandler.mr_renamed(var11);
               }

               int var13 = var6 + 262951665 * var11.ce;
               int var14 = var7 + -747355095 * var11.ci;
               int var15 = 1634279623 * var11.co;
               int var16;
               int var17;
               if (var11 == Client.pr) {
                  if (-1412584499 != var1 && !var11.ee) {
                     WorldMapSection3.qk = var0;
                     id.qp = var6 * -774716861;
                     dy.qw = 389070991 * var7;
                     continue;
                  }

                  if (Client.pn && Client.pq) {
                     var16 = -2063363905 * MouseHandler.ay;
                     var17 = MouseHandler.ao * -1224153235;
                     var16 -= Client.pd * -1789924433;
                     var17 -= 1902621241 * Client.pw;
                     if (var16 < 1084046795 * Client.pi) {
                        var16 = Client.pi * 1084046795;
                     }

                     if (var16 + -794961409 * var11.cs > -794961409 * Client.pf.cs + 1084046795 * Client.pi) {
                        var16 = 1084046795 * Client.pi + Client.pf.cs * -794961409 - var11.cs * -794961409;
                     }

                     if (var17 < Client.pb * -746723443) {
                        var17 = Client.pb * -746723443;
                     }

                     if (1473950221 * var11.cc + var17 > Client.pf.cc * 1473950221 + -746723443 * Client.pb) {
                        var17 = Client.pf.cc * 1473950221 + Client.pb * -746723443 - 1473950221 * var11.cc;
                     }

                     var13 = var16;
                     var14 = var17;
                  }

                  if (!var11.ee) {
                     var15 = 128;
                  }
               }

               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               int var23;
               if (9 == var11.bg * 883712245) {
                  var20 = var13;
                  var21 = var14;
                  var22 = var13 + -794961409 * var11.cs;
                  var23 = var11.cc * 1473950221 + var14;
                  if (var22 < var13) {
                     var20 = var22;
                     var22 = var13;
                  }

                  if (var23 < var14) {
                     var21 = var23;
                     var23 = var14;
                  }

                  ++var22;
                  ++var23;
                  var16 = var20 > var2 ? var20 : var2;
                  var17 = var21 > var3 ? var21 : var3;
                  var18 = var22 < var4 ? var22 : var4;
                  var19 = var23 < var5 ? var23 : var5;
               } else {
                  var20 = var11.cs * -794961409 + var13;
                  var21 = var11.cc * 1473950221 + var14;
                  var16 = var13 > var2 ? var13 : var2;
                  var17 = var14 > var3 ? var14 : var3;
                  var18 = var20 < var4 ? var20 : var4;
                  var19 = var21 < var5 ? var21 : var5;
               }

               if (!var11.bn || var16 < var18 && var17 < var19) {
                  if (var11.bf * 1021339961 != 0) {
                     if (1021339961 * var11.bf == 1336) {
                        if (aj.vb.ax()) {
                           var14 += 15;
                           WallDecoration.io.drawRightAligned("Fps:" + Client.aa * 1913114939, var13 + -794961409 * var11.cs, var14, 16776960, -1);
                           var14 += 15;
                           Runtime var45 = Runtime.getRuntime();
                           var21 = (int)((var45.totalMemory() - var45.freeMemory()) / 1024L);
                           var22 = 16776960;
                           if (var21 > 327680 && !Client.cu) {
                              var22 = 16711680;
                           }

                           WallDecoration.io.drawRightAligned("Mem:" + var21 + "k", var13 + -794961409 * var11.cs, var14, var22, -1);
                           var14 += 15;
                        }
                        continue;
                     }

                     if (var11.bf * 1021339961 == 1337) {
                        Client.of = var13 * 563689483;
                        Client.oy = var14 * 2111961447;
                        am.drawActors2d(var13, var14, var11.cs * -794961409, var11.cc * 1473950221);
                        Client.rf[var11.hd * 372799529] = true;
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (1021339961 * var11.bf == 1338) {
                        fu.mb_renamed(var11, var13, var14, var12);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (1339 == var11.bf * 1021339961) {
                        DynamicObject.nz_renamed(var11, var13, var14, var12);
                        Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.bf * 1021339961 == 1400) {
                        ey.wt.draw(var13, var14, -794961409 * var11.cs, var11.cc * 1473950221, Client.ep * -1886224337);
                     }

                     if (1401 == 1021339961 * var11.bf) {
                        ey.wt.az(var13, var14, var11.cs * -794961409, 1473950221 * var11.cc);
                     }

                     if (var11.bf * 1021339961 == 1402) {
                        em.av.aw(var13, Client.ep * -1886224337);
                     }
                  }

                  if (0 == 883712245 * var11.bg) {
                     if (!var11.bn && pm.isComponentHidden(var11) && MidiPcmStream.oh != var11) {
                        continue;
                     }

                     if (!var11.bn) {
                        if (var11.cm * 1223232735 > var11.cl * -1273374131 - var11.cc * 1473950221) {
                           var11.cm = var11.cl * 1941770835 - var11.cc * 978547347;
                        }

                        if (1223232735 * var11.cm < 0) {
                           var11.cm = 0;
                        }
                     }

                     drawInterface(var0, var11.bs * 1713081171, var16, var17, var18, var19, var13 - var11.cq * -1469632775, var14 - 1223232735 * var11.cm, var12);
                     if (var11.gz != null) {
                        drawInterface(var11.gz, var11.bs * 1713081171, var16, var17, var18, var19, var13 - var11.cq * -1469632775, var14 - var11.cm * 1223232735, var12);
                     }

                     InterfaceParent var29 = (InterfaceParent)Client.oc.get((long)(1713081171 * var11.bs));
                     if (null != var29) {
                        ai.lk_renamed(var29.af * 944864121, var16, var17, var18, var19, var13, var14, var12);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                     am.ao_renamed();
                  } else if (11 == var11.bg * 883712245) {
                     if (pm.isComponentHidden(var11) && MidiPcmStream.oh != var11) {
                        continue;
                     }

                     if (var11.gz != null) {
                        drawInterface(var11.gz, var11.bs * 1713081171, var16, var17, var18, var19, var13 - -1469632775 * var11.cq, var14 - 1223232735 * var11.cm, var12);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                     am.ao_renamed();
                  }

                  if (Client.ro || Client.rw[var12] || -1928160607 * Client.rg > 1) {
                     if (0 == 883712245 * var11.bg && !var11.bn && var11.cl * -1273374131 > var11.cc * 1473950221) {
                        da.le_renamed(var13 + var11.cs * -794961409, var14, var11.cm * 1223232735, 1473950221 * var11.cc, -1273374131 * var11.cl);
                     }

                     if (1 != var11.bg * 883712245) {
                        if (883712245 * var11.bg == 3) {
                           if (rr.runCs1(var11)) {
                              var20 = var11.cr * 1449039161;
                              if (var11 == MidiPcmStream.oh && 1780253209 * var11.cx != 0) {
                                 var20 = 1780253209 * var11.cx;
                              }
                           } else {
                              var20 = var11.cg * 1409091639;
                              if (var11 == MidiPcmStream.oh && 0 != var11.cy * 1614966389) {
                                 var20 = var11.cy * 1614966389;
                              }
                           }

                           if (var11.cv) {
                              switch (var11.cb.ac * -894516731) {
                                 case 1:
                                    Rasterizer2D.ew_renamed(var13, var14, -794961409 * var11.cs, 1473950221 * var11.cc, 1409091639 * var11.cg, var11.cr * 1449039161);
                                    break;
                                 case 2:
                                    Rasterizer2D.ex_renamed(var13, var14, -794961409 * var11.cs, 1473950221 * var11.cc, var11.cg * 1409091639, var11.cr * 1449039161, 255 - (var11.co * 1634279623 & 255), 255 - (var11.cz * 122284991 & 255));
                                    break;
                                 default:
                                    if (var15 == 0) {
                                       Rasterizer2D.Rasterizer2D_fillRectangle(var13, var14, var11.cs * -794961409, var11.cc * 1473950221, var20);
                                    } else {
                                       Rasterizer2D.ev_renamed(var13, var14, -794961409 * var11.cs, 1473950221 * var11.cc, var20, 256 - (var15 & 255));
                                    }
                              }
                           } else if (var15 == 0) {
                              Rasterizer2D.Rasterizer2D_drawRectangle(var13, var14, var11.cs * -794961409, 1473950221 * var11.cc, var20);
                           } else {
                              Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var13, var14, var11.cs * -794961409, 1473950221 * var11.cc, var20, 256 - (var15 & 255));
                           }
                        } else if (883712245 * var11.bg == 4) {
                           Font var37 = var11.getFont();
                           if (var37 == null) {
                              if (Component.bj) {
                                 fw.ma_renamed(var11);
                              }
                           } else {
                              String var44 = var11.ds;
                              if (rr.runCs1(var11)) {
                                 var21 = var11.cr * 1449039161;
                                 if (MidiPcmStream.oh == var11 && var11.cx * 1780253209 != 0) {
                                    var21 = var11.cx * 1780253209;
                                 }

                                 if (var11.da.length() > 0) {
                                    var44 = var11.da;
                                 }
                              } else {
                                 var21 = var11.cg * 1409091639;
                                 if (var11 == MidiPcmStream.oh && 0 != 1614966389 * var11.cy) {
                                    var21 = var11.cy * 1614966389;
                                 }
                              }

                              if (var11.bn && -1 != var11.gn * -2006098851) {
                                 ObjType var46 = HeadbarUpdate.getObjType(-2006098851 * var11.gn);
                                 var44 = var46.ah;
                                 if (var44 == null) {
                                    var44 = Strings.at;
                                 }

                                 if ((1 == 1552863327 * var46.bi || 1 != 1336975799 * var11.gv) && -1 != 1336975799 * var11.gv) {
                                    var44 = oa.colorStartTag(16748608) + var44 + Formatting.al + " " + 'x' + ArchiveDiskAction.ly_renamed(var11.gv * 1336975799);
                                 }
                              }

                              if (var11 == Client.pg) {
                                 var44 = Strings.gi;
                                 var21 = 1409091639 * var11.cg;
                              }

                              if (!var11.bn) {
                                 var44 = em.lp_renamed(var44, var11);
                              }

                              var37.az(var44, var13, var14, var11.cs * -794961409, var11.cc * 1473950221, var21, var11.et ? 0 : -1, Decimator.an_renamed(1634279623 * var11.co), var11.eo * 1002257489, var11.eq * -1553957401, -931338759 * var11.ep);
                           }
                        } else {
                           int var25;
                           int var26;
                           int var41;
                           if (5 == 883712245 * var11.bg) {
                              Rasterizer3D var35;
                              if (!var11.bn) {
                                 var35 = var11.at(rr.runCs1(var11), ag.iq);
                                 if (var35 != null) {
                                    var35.ax(var13, var14);
                                 } else if (Component.bj) {
                                    fw.ma_renamed(var11);
                                 }
                              } else {
                                 if (-1 != -2006098851 * var11.gn) {
                                    var35 = WorldMapSection1.ay_renamed(var11.gn * -2006098851, var11.gv * 1336975799, var11.dw * 1638912775, -353676735 * var11.dc, var11.dn * -1681772717, false);
                                 } else {
                                    var35 = var11.at(false, ag.iq);
                                 }

                                 if (null == var35) {
                                    if (Component.bj) {
                                       fw.ma_renamed(var11);
                                    }
                                 } else {
                                    var21 = var35.ab;
                                    var22 = var35.aq;
                                    if (!var11.dm) {
                                       var23 = -576720896 * var11.cs / var21;
                                       if (var11.cd * -738051099 != 0) {
                                          var35.bx(var11.cs * -794961409 / 2 + var13, var11.cc * 1473950221 / 2 + var14, var11.cd * -738051099, var23);
                                       } else if (var15 != 0) {
                                          var35.aj(var13, var14, var11.cs * -794961409, var11.cc * 1473950221, 256 - (var15 & 255));
                                       } else if (var11.cs * -794961409 == var21 && var22 == var11.cc * 1473950221) {
                                          var35.ax(var13, var14);
                                       } else {
                                          var35.ag(var13, var14, -794961409 * var11.cs, var11.cc * 1473950221);
                                       }
                                    } else {
                                       Rasterizer2D.Rasterizer2D_expandClip(var13, var14, var11.cs * -794961409 + var13, var11.cc * 1473950221 + var14);
                                       var23 = (var11.cs * -794961409 + (var21 - 1)) / var21;
                                       var41 = (var22 - 1 + var11.cc * 1473950221) / var22;

                                       for(var25 = 0; var25 < var23; ++var25) {
                                          for(var26 = 0; var26 < var41; ++var26) {
                                             if (var11.cd * -738051099 != 0) {
                                                var35.bx(var25 * var21 + var13 + var21 / 2, var22 / 2 + var14 + var26 * var22, var11.cd * -738051099, 4096);
                                             } else if (var15 != 0) {
                                                var35.am(var13 + var21 * var25, var22 * var26 + var14, 256 - (var15 & 255));
                                             } else {
                                                var35.ax(var25 * var21 + var13, var14 + var22 * var26);
                                             }
                                          }
                                       }

                                       Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              int var27;
                              if (883712245 * var11.bg == 6) {
                                 boolean var33 = rr.runCs1(var11);
                                 if (var33) {
                                    var21 = var11.dz * -717228843;
                                 } else {
                                    var21 = -1526544909 * var11.dv;
                                 }

                                 it var36 = null;
                                 var23 = 0;
                                 if (-1 != -2006098851 * var11.gn) {
                                    ObjType var38 = HeadbarUpdate.getObjType(-2006098851 * var11.gn);
                                    if (var38 != null) {
                                       var38 = var38.getCountObj(var11.gv * 1336975799);
                                       var36 = var38.at(1);
                                       if (null != var36) {
                                          var36.ai();
                                          var23 = 1550732737 * var36.et / 2;
                                       } else {
                                          fw.ma_renamed(var11);
                                       }
                                    }
                                 } else if (var11.dr * -123768459 == 5) {
                                    if (0 == -168077555 * var11.dl) {
                                       var36 = Client.vh.aa((SeqType)null, -1, (SeqType)null, -1);
                                    } else {
                                       var36 = MusicPatchNode.mi.getModel();
                                    }
                                 } else if (-123768459 * var11.dr == 7) {
                                    var36 = var11.dd.aa((SeqType)null, -1, Inventory.getSeqType(MusicPatchNode.mi.bt * 1590591885, (byte)121), 424813829 * MusicPatchNode.mi.cw);
                                 } else {
                                    hs var39 = null;
                                    hv var40 = null;
                                    if (6 == -123768459 * var11.dr) {
                                       var26 = var11.dl * -168077555;
                                       if (var26 >= 0 && var26 < Client.iu.length) {
                                          Npc var43 = Client.iu[var26];
                                          if (var43 != null) {
                                             var39 = var43.af;
                                             var40 = var43.ar();
                                          }
                                       }
                                    }

                                    SeqType var42 = null;
                                    var27 = -1;
                                    if (var21 != -1) {
                                       var42 = Inventory.getSeqType(var21, (byte)25);
                                       var27 = 1575517389 * var11.gx;
                                    }

                                    var36 = var11.ag(var42, var27, var33, MusicPatchNode.mi.aw, var39, var40);
                                    if (var36 == null && Component.bj) {
                                       fw.ma_renamed(var11);
                                    }
                                 }

                                 WorldMapArea.ai_renamed(var13 + var11.cs * -794961409 / 2, var11.cc * 1473950221 / 2 + var14);
                                 var41 = var11.db * 942674363 * in.ac[797932055 * var11.dh] >> 16;
                                 var25 = 942674363 * var11.db * in.au[797932055 * var11.dh] >> 16;
                                 if (var36 != null) {
                                    if (!var11.bn) {
                                       var36.bx(0, var11.dp * -480949115, 0, var11.dh * 797932055, 0, var41, var25);
                                    } else {
                                       var36.ai();
                                       if (var11.dj) {
                                          var36.bo(0, -480949115 * var11.dp, -1023931993 * var11.du, 797932055 * var11.dh, var11.dg * 1909456039, var11.de * 844501061 + var41 + var23, var25 + var11.de * 844501061, 942674363 * var11.db);
                                       } else {
                                          var36.bx(0, var11.dp * -480949115, -1023931993 * var11.du, 797932055 * var11.dh, var11.dg * 1909456039, var11.de * 844501061 + var41 + var23, 844501061 * var11.de + var25);
                                       }
                                    }
                                 }

                                 Tiles.ax_renamed();
                              } else {
                                 Font var31;
                                 if (8 == var11.bg * 883712245 && fe.os == var11 && Client.on * 1239377975 == Client.oe * 215597333) {
                                    var20 = 0;
                                    var21 = 0;
                                    var31 = WallDecoration.io;
                                    String var34 = var11.ds;

                                    String var24;
                                    for(var34 = em.lp_renamed(var34, var11); var34.length() > 0; var21 += 1 + var31.al) {
                                       var25 = var34.indexOf(Formatting.aq);
                                       if (-1 != var25) {
                                          var24 = var34.substring(0, var25);
                                          var34 = var34.substring(4 + var25);
                                       } else {
                                          var24 = var34;
                                          var34 = "";
                                       }

                                       var26 = var31.stringWidth(var24);
                                       if (var26 > var20) {
                                          var20 = var26;
                                       }
                                    }

                                    var20 += 6;
                                    var21 += 7;
                                    var25 = var13 + var11.cs * -794961409 - 5 - var20;
                                    var26 = var11.cc * 1473950221 + var14 + 5;
                                    if (var25 < 5 + var13) {
                                       var25 = 5 + var13;
                                    }

                                    if (var20 + var25 > var4) {
                                       var25 = var4 - var20;
                                    }

                                    if (var26 + var21 > var5) {
                                       var26 = var5 - var21;
                                    }

                                    Rasterizer2D.Rasterizer2D_fillRectangle(var25, var26, var20, var21, 16777120);
                                    Rasterizer2D.Rasterizer2D_drawRectangle(var25, var26, var20, var21, 0);
                                    var34 = var11.ds;
                                    var27 = var26 + var31.al + 2;

                                    for(var34 = em.lp_renamed(var34, var11); var34.length() > 0; var27 += 1 + var31.al) {
                                       int var28 = var34.indexOf(Formatting.aq);
                                       if (-1 != var28) {
                                          var24 = var34.substring(0, var28);
                                          var34 = var34.substring(4 + var28);
                                       } else {
                                          var24 = var34;
                                          var34 = "";
                                       }

                                       var31.draw(var24, var25 + 3, var27, 0, -1);
                                    }
                                 }

                                 if (9 == var11.bg * 883712245) {
                                    if (var11.cj) {
                                       var20 = var13;
                                       var21 = var14 + 1473950221 * var11.cc;
                                       var22 = var13 + var11.cs * -794961409;
                                       var23 = var14;
                                    } else {
                                       var20 = var13;
                                       var21 = var14;
                                       var22 = -794961409 * var11.cs + var13;
                                       var23 = 1473950221 * var11.cc + var14;
                                    }

                                    if (1354778849 * var11.cw == 1) {
                                       Rasterizer2D.Rasterizer2D_drawLine(var20, var21, var22, var23, 1409091639 * var11.cg);
                                    } else {
                                       bt.la_renamed(var20, var21, var22, var23, var11.cg * 1409091639, 1354778849 * var11.cw);
                                    }
                                 } else if (var11.bg * 883712245 == 12) {
                                    mz var30 = var11.bj();
                                    FaceNormal var32 = var11.bn();
                                    if (var30 != null && var32 != null && var30.ca()) {
                                       var31 = var11.getFont();
                                       if (null != var31) {
                                          Client.rl.af(var13, var14, var11.cs * -794961409, 1473950221 * var11.cc, var30.cu(), var30.ck(), var30.cc(), var30.cn(), var30.cs());
                                          var23 = var11.et ? var11.dc * -353676735 : -1;
                                          if (!var30.ce() && var30.bc().aw()) {
                                             Client.rl.an(var32.aw * 1912484269, var23, var32.af * -90398499, 216034339 * var32.an);
                                             Client.rl.aw(var30.bh(), var31);
                                          } else {
                                             Client.rl.an(var11.cg * 1409091639, var23, -90398499 * var32.af, 216034339 * var32.an);
                                             Client.rl.aw(var30.bc(), var31);
                                          }

                                          Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
