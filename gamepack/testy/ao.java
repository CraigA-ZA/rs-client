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
   static final int af = 0;
   static final int tc = 512;
   static final int bl = 2;
   // $FF: synthetic field
   final ai this$2;
   static ez aa;
   public static final int ak = 1;

   public void notifyServerCertificate(Certificate var1) throws IOException {
      try {
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
      } catch (RuntimeException var8) {
         throw db.an(var8, "ao.notifyServerCertificate(" + ')');
      }
   }

   ao(ai var1) {
      this.this$2 = var1;
   }

   public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
      try {
         return null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ao.getClientCredentials(" + ')');
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

   static final void lh(mq[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         th.es(var2, var3, var4, var5);
         am.ao(1601417771);

         for(int var10 = 0; var10 < var0.length; ++var10) {
            if (var9 != -465475629) {
               throw new IllegalStateException();
            }

            mq var11 = var0[var10];
            if (var11 == null) {
               if (var9 != -465475629) {
                  throw new IllegalStateException();
               }
            } else {
               if (var11.cu * 913615679 != var1) {
                  if (var9 != -465475629) {
                     return;
                  }

                  if (var1 != -1412584499) {
                     continue;
                  }

                  if (var9 != -465475629) {
                     throw new IllegalStateException();
                  }

                  if (client.pr != var11) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }
                     continue;
                  }
               }

               int var12;
               if (var8 == -1) {
                  client.rh[client.rr * -356793645] = var6 + 262951665 * var11.ce;
                  client.rb[-356793645 * client.rr] = var11.ci * -747355095 + var7;
                  client.ra[-356793645 * client.rr] = -794961409 * var11.cs;
                  client.ri[-356793645 * client.rr] = 1473950221 * var11.cc;
                  var12 = (client.rr += 1127867739) * -356793645 - 1;
               } else {
                  var12 = var8;
               }

               var11.hd = var12 * -1548573671;
               var11.hv = -95399417 * client.ep;
               if (var11.bn) {
                  if (var9 != -465475629) {
                     throw new IllegalStateException();
                  }

                  if (pm.ny(var11, (byte)1)) {
                     if (var9 != -465475629) {
                        return;
                     }
                     continue;
                  }
               }

               if (1021339961 * var11.bf > 0) {
                  if (var9 != -465475629) {
                     throw new IllegalStateException();
                  }

                  bd.mr(var11, 1973631354);
               }

               int var13 = var6 + 262951665 * var11.ce;
               int var14 = var7 + -747355095 * var11.ci;
               int var15 = 1634279623 * var11.co;
               int var16;
               int var17;
               if (var11 == client.pr) {
                  if (var9 != -465475629) {
                     throw new IllegalStateException();
                  }

                  if (-1412584499 != var1) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     if (!var11.ee) {
                        if (var9 != -465475629) {
                           throw new IllegalStateException();
                        }

                        jw.qk = var0;
                        id.qp = var6 * -774716861;
                        dy.qw = 389070991 * var7;
                        continue;
                     }
                  }

                  if (client.pn) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     if (client.pq) {
                        if (var9 != -465475629) {
                           throw new IllegalStateException();
                        }

                        var16 = -2063363905 * bd.ay;
                        var17 = bd.ao * -1224153235;
                        var16 -= client.pd * -1789924433;
                        var17 -= 1902621241 * client.pw;
                        if (var16 < 1084046795 * client.pi) {
                           var16 = client.pi * 1084046795;
                        }

                        if (var16 + -794961409 * var11.cs > -794961409 * client.pf.cs + 1084046795 * client.pi) {
                           if (var9 != -465475629) {
                              throw new IllegalStateException();
                           }

                           var16 = 1084046795 * client.pi + client.pf.cs * -794961409 - var11.cs * -794961409;
                        }

                        if (var17 < client.pb * -746723443) {
                           if (var9 != -465475629) {
                              throw new IllegalStateException();
                           }

                           var17 = client.pb * -746723443;
                        }

                        if (1473950221 * var11.cc + var17 > client.pf.cc * 1473950221 + -746723443 * client.pb) {
                           if (var9 != -465475629) {
                              return;
                           }

                           var17 = client.pf.cc * 1473950221 + client.pb * -746723443 - 1473950221 * var11.cc;
                        }

                        var13 = var16;
                        var14 = var17;
                     }
                  }

                  if (!var11.ee) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     var15 = 128;
                  }
               }

               int var10000;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               int var23;
               if (9 == var11.bg * 883712245) {
                  if (var9 != -465475629) {
                     throw new IllegalStateException();
                  }

                  var20 = var13;
                  var21 = var14;
                  var22 = var13 + -794961409 * var11.cs;
                  var23 = var11.cc * 1473950221 + var14;
                  if (var22 < var13) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     var20 = var22;
                     var22 = var13;
                  }

                  if (var23 < var14) {
                     var21 = var23;
                     var23 = var14;
                  }

                  ++var22;
                  ++var23;
                  if (var20 > var2) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     var10000 = var20;
                  } else {
                     var10000 = var2;
                  }

                  var16 = var10000;
                  if (var21 > var3) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     var10000 = var21;
                  } else {
                     var10000 = var3;
                  }

                  var17 = var10000;
                  var18 = var22 < var4 ? var22 : var4;
                  if (var23 < var5) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     var10000 = var23;
                  } else {
                     var10000 = var5;
                  }

                  var19 = var10000;
               } else {
                  var20 = var11.cs * -794961409 + var13;
                  var21 = var11.cc * 1473950221 + var14;
                  var16 = var13 > var2 ? var13 : var2;
                  if (var14 > var3) {
                     if (var9 != -465475629) {
                        return;
                     }

                     var10000 = var14;
                  } else {
                     var10000 = var3;
                  }

                  var17 = var10000;
                  if (var20 < var4) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     var10000 = var20;
                  } else {
                     var10000 = var4;
                  }

                  var18 = var10000;
                  if (var21 < var5) {
                     if (var9 != -465475629) {
                        return;
                     }

                     var10000 = var21;
                  } else {
                     var10000 = var5;
                  }

                  var19 = var10000;
               }

               if (var11.bn) {
                  if (var16 >= var18) {
                     continue;
                  }

                  if (var9 != -465475629) {
                     return;
                  }

                  if (var17 >= var19) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }
                     continue;
                  }
               }

               if (var11.bf * 1021339961 != 0) {
                  if (1021339961 * var11.bf == 1336) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     if (aj.vb.ax((short)-12734)) {
                        if (var9 != -465475629) {
                           return;
                        }

                        var14 += 15;
                        je.io.as("Fps:" + client.aa * 1913114939, var13 + -794961409 * var11.cs, var14, 16776960, -1);
                        var14 += 15;
                        Runtime var46 = Runtime.getRuntime();
                        var21 = (int)((var46.totalMemory() - var46.freeMemory()) / 1024L);
                        var22 = 16776960;
                        if (var21 > 327680 && !client.cu) {
                           if (var9 != -465475629) {
                              throw new IllegalStateException();
                           }

                           var22 = 16711680;
                        }

                        je.io.as("Mem:" + var21 + "k", var13 + -794961409 * var11.cs, var14, var22, -1);
                        var14 += 15;
                     }
                     continue;
                  }

                  if (var11.bf * 1021339961 == 1337) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     client.of = var13 * 563689483;
                     client.oy = var14 * 2111961447;
                     am.id(var13, var14, var11.cs * -794961409, var11.cc * 1473950221, -1135729474);
                     client.rf[var11.hd * 372799529] = true;
                     th.es(var2, var3, var4, var5);
                     continue;
                  }

                  if (1021339961 * var11.bf == 1338) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     fu.mb(var11, var13, var14, var12, 715793835);
                     th.es(var2, var3, var4, var5);
                     continue;
                  }

                  if (1339 == var11.bf * 1021339961) {
                     if (var9 != -465475629) {
                        return;
                     }

                     ct.nz(var11, var13, var14, var12, 759225225);
                     th.es(var2, var3, var4, var5);
                     continue;
                  }

                  if (var11.bf * 1021339961 == 1400) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     ey.wt.as(var13, var14, -794961409 * var11.cs, var11.cc * 1473950221, client.ep * -1886224337, -2111380198);
                  }

                  if (1401 == 1021339961 * var11.bf) {
                     ey.wt.az(var13, var14, var11.cs * -794961409, 1473950221 * var11.cc, (byte)19);
                  }

                  if (var11.bf * 1021339961 == 1402) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     em.av.aw(var13, client.ep * -1886224337, -1861911069);
                  }
               }

               if (0 == 883712245 * var11.bg) {
                  if (!var11.bn) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     if (pm.ny(var11, (byte)1)) {
                        if (var9 != -465475629) {
                           throw new IllegalStateException();
                        }

                        if (ln.oh != var11) {
                           if (var9 != -465475629) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }
                     }
                  }

                  if (!var11.bn) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     if (var11.cm * 1223232735 > var11.cl * -1273374131 - var11.cc * 1473950221) {
                        if (var9 != -465475629) {
                           throw new IllegalStateException();
                        }

                        var11.cm = var11.cl * 1941770835 - var11.cc * 978547347;
                     }

                     if (1223232735 * var11.cm < 0) {
                        if (var9 != -465475629) {
                           return;
                        }

                        var11.cm = 0;
                     }
                  }

                  lh(var0, var11.bs * 1713081171, var16, var17, var18, var19, var13 - var11.cq * -1469632775, var14 - 1223232735 * var11.cm, var12, -465475629);
                  if (var11.gz != null) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     lh(var11.gz, var11.bs * 1713081171, var16, var17, var18, var19, var13 - var11.cq * -1469632775, var14 - var11.cm * 1223232735, var12, -465475629);
                  }

                  di var30 = (di)client.oc.af((long)(1713081171 * var11.bs));
                  if (null != var30) {
                     ai.lk(var30.af * 944864121, var16, var17, var18, var19, var13, var14, var12, (byte)-123);
                  }

                  th.es(var2, var3, var4, var5);
                  am.ao(1351667699);
               } else if (11 == var11.bg * 883712245) {
                  if (var9 != -465475629) {
                     return;
                  }

                  if (pm.ny(var11, (byte)1)) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     if (ln.oh != var11) {
                        if (var9 != -465475629) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }

                  if (var11.gz != null) {
                     lh(var11.gz, var11.bs * 1713081171, var16, var17, var18, var19, var13 - -1469632775 * var11.cq, var14 - 1223232735 * var11.cm, var12, -465475629);
                  }

                  th.es(var2, var3, var4, var5);
                  am.ao(2059125706);
               }

               if (!client.ro && !client.rw[var12] && -1928160607 * client.rg <= 1) {
                  if (var9 != -465475629) {
                     throw new IllegalStateException();
                  }
               } else {
                  if (0 == 883712245 * var11.bg) {
                     if (var9 != -465475629) {
                        throw new IllegalStateException();
                     }

                     if (!var11.bn) {
                        if (var9 != -465475629) {
                           throw new IllegalStateException();
                        }

                        if (var11.cl * -1273374131 > var11.cc * 1473950221) {
                           da.le(var13 + var11.cs * -794961409, var14, var11.cm * 1223232735, 1473950221 * var11.cc, -1273374131 * var11.cl, (byte)0);
                        }
                     }
                  }

                  if (1 != var11.bg * 883712245) {
                     if (883712245 * var11.bg == 3) {
                        if (rr.lb(var11, 1111534297)) {
                           var20 = var11.cr * 1449039161;
                           if (var11 == ln.oh) {
                              if (var9 != -465475629) {
                                 throw new IllegalStateException();
                              }

                              if (1780253209 * var11.cx != 0) {
                                 if (var9 != -465475629) {
                                    throw new IllegalStateException();
                                 }

                                 var20 = 1780253209 * var11.cx;
                              }
                           }
                        } else {
                           var20 = var11.cg * 1409091639;
                           if (var11 == ln.oh) {
                              if (var9 != -465475629) {
                                 throw new IllegalStateException();
                              }

                              if (0 != var11.cy * 1614966389) {
                                 if (var9 != -465475629) {
                                    return;
                                 }

                                 var20 = var11.cy * 1614966389;
                              }
                           }
                        }

                        if (var11.cv) {
                           if (var9 != -465475629) {
                              return;
                           }

                           switch (var11.cb.ac * -894516731) {
                              case 1:
                                 th.ew(var13, var14, -794961409 * var11.cs, 1473950221 * var11.cc, 1409091639 * var11.cg, var11.cr * 1449039161);
                                 break;
                              case 2:
                                 th.ex(var13, var14, -794961409 * var11.cs, 1473950221 * var11.cc, var11.cg * 1409091639, var11.cr * 1449039161, 255 - (var11.co * 1634279623 & 255), 255 - (var11.cz * 122284991 & 255));
                                 break;
                              default:
                                 if (var15 == 0) {
                                    if (var9 != -465475629) {
                                       throw new IllegalStateException();
                                    }

                                    th.em(var13, var14, var11.cs * -794961409, var11.cc * 1473950221, var20);
                                 } else {
                                    th.ev(var13, var14, -794961409 * var11.cs, 1473950221 * var11.cc, var20, 256 - (var15 & 255));
                                 }
                           }
                        } else if (var15 == 0) {
                           if (var9 != -465475629) {
                              return;
                           }

                           th.ek(var13, var14, var11.cs * -794961409, 1473950221 * var11.cc, var20);
                        } else {
                           th.ey(var13, var14, var11.cs * -794961409, 1473950221 * var11.cc, var20, 256 - (var15 & 255));
                        }
                     } else if (883712245 * var11.bg == 4) {
                        if (var9 != -465475629) {
                           throw new IllegalStateException();
                        }

                        on var38 = var11.ai(-1026608542);
                        if (var38 == null) {
                           if (var9 != -465475629) {
                              throw new IllegalStateException();
                           }

                           if (mq.bj) {
                              if (var9 != -465475629) {
                                 throw new IllegalStateException();
                              }

                              fw.ma(var11, -1138378183);
                           }
                        } else {
                           String var45 = var11.ds;
                           if (rr.lb(var11, -1469903597)) {
                              if (var9 != -465475629) {
                                 return;
                              }

                              var21 = var11.cr * 1449039161;
                              if (ln.oh == var11) {
                                 if (var9 != -465475629) {
                                    throw new IllegalStateException();
                                 }

                                 if (var11.cx * 1780253209 != 0) {
                                    if (var9 != -465475629) {
                                       return;
                                    }

                                    var21 = var11.cx * 1780253209;
                                 }
                              }

                              if (var11.da.length() > 0) {
                                 if (var9 != -465475629) {
                                    return;
                                 }

                                 var45 = var11.da;
                              }
                           } else {
                              var21 = var11.cg * 1409091639;
                              if (var11 == ln.oh) {
                                 if (var9 != -465475629) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 != 1614966389 * var11.cy) {
                                    if (var9 != -465475629) {
                                       throw new IllegalStateException();
                                    }

                                    var21 = var11.cy * 1614966389;
                                 }
                              }
                           }

                           if (var11.bn && -1 != var11.gn * -2006098851) {
                              label1138: {
                                 if (var9 != -465475629) {
                                    throw new IllegalStateException();
                                 }

                                 hz var47 = dh.af(-2006098851 * var11.gn, (byte)84);
                                 var45 = var47.ah;
                                 if (var45 == null) {
                                    if (var9 != -465475629) {
                                       throw new IllegalStateException();
                                    }

                                    var45 = mk.at;
                                 }

                                 if (1 != 1552863327 * var47.bi) {
                                    if (var9 != -465475629) {
                                       throw new IllegalStateException();
                                    }

                                    if (1 == 1336975799 * var11.gv) {
                                       break label1138;
                                    }
                                 }

                                 if (-1 != 1336975799 * var11.gv) {
                                    var45 = oa.an(16748608, 381910630) + var45 + dq.al + " " + 'x' + nw.ly(var11.gv * 1336975799, (short)13178);
                                 }
                              }
                           }

                           if (var11 == client.pg) {
                              if (var9 != -465475629) {
                                 throw new IllegalStateException();
                              }

                              var45 = mk.gi;
                              var21 = 1409091639 * var11.cg;
                           }

                           if (!var11.bn) {
                              var45 = em.lp(var45, var11, (short)-1115);
                           }

                           int var10004 = var11.cs * -794961409;
                           int var10005 = var11.cc * 1473950221;
                           byte var10007;
                           if (var11.et) {
                              if (var9 != -465475629) {
                                 return;
                              }

                              var10007 = 0;
                           } else {
                              var10007 = -1;
                           }

                           var38.az(var45, var13, var14, var10004, var10005, var21, var10007, cc.an(1634279623 * var11.co, -1509749765), var11.eo * 1002257489, var11.eq * -1553957401, -931338759 * var11.ep);
                        }
                     } else {
                        int var25;
                        int var26;
                        int var42;
                        if (5 == 883712245 * var11.bg) {
                           if (var9 != -465475629) {
                              return;
                           }

                           tq var36;
                           if (!var11.bn) {
                              if (var9 != -465475629) {
                                 return;
                              }

                              var36 = var11.at(rr.lb(var11, -926085801), ag.iq, (byte)0);
                              if (var36 != null) {
                                 if (var9 != -465475629) {
                                    return;
                                 }

                                 var36.ax(var13, var14);
                              } else if (mq.bj) {
                                 if (var9 != -465475629) {
                                    throw new IllegalStateException();
                                 }

                                 fw.ma(var11, -1641665110);
                              }
                           } else {
                              if (-1 != -2006098851 * var11.gn) {
                                 if (var9 != -465475629) {
                                    throw new IllegalStateException();
                                 }

                                 var36 = jy.ay(var11.gn * -2006098851, var11.gv * 1336975799, var11.dw * 1638912775, -353676735 * var11.dc, var11.dn * -1681772717, false, 13705148);
                              } else {
                                 var36 = var11.at(false, ag.iq, (byte)0);
                              }

                              if (null == var36) {
                                 if (mq.bj) {
                                    if (var9 != -465475629) {
                                       throw new IllegalStateException();
                                    }

                                    fw.ma(var11, -2116643428);
                                 }
                              } else {
                                 if (var9 != -465475629) {
                                    throw new IllegalStateException();
                                 }

                                 var21 = var36.ab;
                                 var22 = var36.aq;
                                 if (!var11.dm) {
                                    var23 = -576720896 * var11.cs / var21;
                                    if (var11.cd * -738051099 != 0) {
                                       var36.bx(var11.cs * -794961409 / 2 + var13, var11.cc * 1473950221 / 2 + var14, var11.cd * -738051099, var23);
                                    } else if (var15 != 0) {
                                       if (var9 != -465475629) {
                                          throw new IllegalStateException();
                                       }

                                       var36.aj(var13, var14, var11.cs * -794961409, var11.cc * 1473950221, 256 - (var15 & 255));
                                    } else {
                                       if (var11.cs * -794961409 == var21) {
                                          if (var9 != -465475629) {
                                             throw new IllegalStateException();
                                          }

                                          if (var22 == var11.cc * 1473950221) {
                                             var36.ax(var13, var14);
                                             continue;
                                          }

                                          if (var9 != -465475629) {
                                             return;
                                          }
                                       }

                                       var36.ag(var13, var14, -794961409 * var11.cs, var11.cc * 1473950221);
                                    }
                                 } else {
                                    th.eb(var13, var14, var11.cs * -794961409 + var13, var11.cc * 1473950221 + var14);
                                    var23 = (var11.cs * -794961409 + (var21 - 1)) / var21;
                                    var42 = (var22 - 1 + var11.cc * 1473950221) / var22;

                                    for(var25 = 0; var25 < var23; ++var25) {
                                       if (var9 != -465475629) {
                                          throw new IllegalStateException();
                                       }

                                       for(var26 = 0; var26 < var42; ++var26) {
                                          if (var9 != -465475629) {
                                             throw new IllegalStateException();
                                          }

                                          if (var11.cd * -738051099 != 0) {
                                             if (var9 != -465475629) {
                                                return;
                                             }

                                             var36.bx(var25 * var21 + var13 + var21 / 2, var22 / 2 + var14 + var26 * var22, var11.cd * -738051099, 4096);
                                          } else if (var15 != 0) {
                                             if (var9 != -465475629) {
                                                throw new IllegalStateException();
                                             }

                                             var36.am(var13 + var21 * var25, var22 * var26 + var14, 256 - (var15 & 255));
                                          } else {
                                             var36.ax(var25 * var21 + var13, var14 + var22 * var26);
                                          }
                                       }
                                    }

                                    th.es(var2, var3, var4, var5);
                                 }
                              }
                           }
                        } else {
                           int var27;
                           if (883712245 * var11.bg == 6) {
                              if (var9 != -465475629) {
                                 throw new IllegalStateException();
                              }

                              boolean var34 = rr.lb(var11, 1287761873);
                              if (var34) {
                                 if (var9 != -465475629) {
                                    throw new IllegalStateException();
                                 }

                                 var21 = var11.dz * -717228843;
                              } else {
                                 var21 = -1526544909 * var11.dv;
                              }

                              it var37 = null;
                              var23 = 0;
                              if (-1 != -2006098851 * var11.gn) {
                                 if (var9 != -465475629) {
                                    throw new IllegalStateException();
                                 }

                                 hz var39 = dh.af(-2006098851 * var11.gn, (byte)97);
                                 if (var39 != null) {
                                    if (var9 != -465475629) {
                                       return;
                                    }

                                    var39 = var39.aa(var11.gv * 1336975799, -1245507934);
                                    var37 = var39.at(1, -891415962);
                                    if (null != var37) {
                                       if (var9 != -465475629) {
                                          throw new IllegalStateException();
                                       }

                                       var37.ai();
                                       var23 = 1550732737 * var37.et / 2;
                                    } else {
                                       fw.ma(var11, -2080051144);
                                    }
                                 }
                              } else if (var11.dr * -123768459 == 5) {
                                 if (var9 != -465475629) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 == -168077555 * var11.dl) {
                                    if (var9 != -465475629) {
                                       throw new IllegalStateException();
                                    }

                                    var37 = client.vh.aa((ha)null, -1, (ha)null, -1, (byte)42);
                                 } else {
                                    var37 = lq.mi.an((byte)-112);
                                 }
                              } else if (-123768459 * var11.dr == 7) {
                                 if (var9 != -465475629) {
                                    throw new IllegalStateException();
                                 }

                                 var37 = var11.dd.aa((ha)null, -1, dc.an(lq.mi.bt * 1590591885, (byte)121), 424813829 * lq.mi.cw, (byte)25);
                              } else {
                                 hs var40 = null;
                                 hv var41 = null;
                                 if (6 == -123768459 * var11.dr) {
                                    if (var9 != -465475629) {
                                       throw new IllegalStateException();
                                    }

                                    var26 = var11.dl * -168077555;
                                    if (var26 >= 0) {
                                       if (var9 != -465475629) {
                                          throw new IllegalStateException();
                                       }

                                       if (var26 < client.iu.length) {
                                          if (var9 != -465475629) {
                                             throw new IllegalStateException();
                                          }

                                          df var44 = client.iu[var26];
                                          if (var44 != null) {
                                             if (var9 != -465475629) {
                                                throw new IllegalStateException();
                                             }

                                             var40 = var44.af;
                                             var41 = var44.ar(-767962512);
                                          }
                                       }
                                    }
                                 }

                                 ha var43 = null;
                                 var27 = -1;
                                 if (var21 != -1) {
                                    if (var9 != -465475629) {
                                       throw new IllegalStateException();
                                    }

                                    var43 = dc.an(var21, (byte)25);
                                    var27 = 1575517389 * var11.gx;
                                 }

                                 var37 = var11.ag(var43, var27, var34, lq.mi.aw, var40, var41, 764440828);
                                 if (var37 == null) {
                                    if (var9 != -465475629) {
                                       throw new IllegalStateException();
                                    }

                                    if (mq.bj) {
                                       fw.ma(var11, -851541316);
                                    }
                                 }
                              }

                              js.ai(var13 + var11.cs * -794961409 / 2, var11.cc * 1473950221 / 2 + var14, (byte)32);
                              var42 = var11.db * 942674363 * in.ac[797932055 * var11.dh] >> 16;
                              var25 = 942674363 * var11.db * in.au[797932055 * var11.dh] >> 16;
                              if (var37 != null) {
                                 if (var9 != -465475629) {
                                    throw new IllegalStateException();
                                 }

                                 if (!var11.bn) {
                                    if (var9 != -465475629) {
                                       return;
                                    }

                                    var37.bx(0, var11.dp * -480949115, 0, var11.dh * 797932055, 0, var42, var25);
                                 } else {
                                    var37.ai();
                                    if (var11.dj) {
                                       if (var9 != -465475629) {
                                          throw new IllegalStateException();
                                       }

                                       var37.bo(0, -480949115 * var11.dp, -1023931993 * var11.du, 797932055 * var11.dh, var11.dg * 1909456039, var11.de * 844501061 + var42 + var23, var25 + var11.de * 844501061, 942674363 * var11.db);
                                    } else {
                                       var37.bx(0, var11.dp * -480949115, -1023931993 * var11.du, 797932055 * var11.dh, var11.dg * 1909456039, var11.de * 844501061 + var42 + var23, 844501061 * var11.de + var25);
                                    }
                                 }
                              }

                              cd.ax(1441948024);
                           } else {
                              on var33;
                              if (8 == var11.bg * 883712245) {
                                 if (var9 != -465475629) {
                                    return;
                                 }

                                 if (fe.os == var11) {
                                    if (var9 != -465475629) {
                                       throw new IllegalStateException();
                                    }

                                    if (client.on * 1239377975 == client.oe * 215597333) {
                                       if (var9 != -465475629) {
                                          throw new IllegalStateException();
                                       }

                                       var20 = 0;
                                       var21 = 0;
                                       var33 = je.io;
                                       String var35 = var11.ds;

                                       String var24;
                                       for(var35 = em.lp(var35, var11, (short)-6684); var35.length() > 0; var21 += 1 + var33.al) {
                                          var25 = var35.indexOf(dq.aq);
                                          if (-1 != var25) {
                                             var24 = var35.substring(0, var25);
                                             var35 = var35.substring(4 + var25);
                                          } else {
                                             var24 = var35;
                                             var35 = "";
                                          }

                                          var26 = var33.ao(var24);
                                          if (var26 > var20) {
                                             if (var9 != -465475629) {
                                                throw new IllegalStateException();
                                             }

                                             var20 = var26;
                                          }
                                       }

                                       var20 += 6;
                                       var21 += 7;
                                       var25 = var13 + var11.cs * -794961409 - 5 - var20;
                                       var26 = var11.cc * 1473950221 + var14 + 5;
                                       if (var25 < 5 + var13) {
                                          if (var9 != -465475629) {
                                             throw new IllegalStateException();
                                          }

                                          var25 = 5 + var13;
                                       }

                                       if (var20 + var25 > var4) {
                                          if (var9 != -465475629) {
                                             throw new IllegalStateException();
                                          }

                                          var25 = var4 - var20;
                                       }

                                       if (var26 + var21 > var5) {
                                          if (var9 != -465475629) {
                                             throw new IllegalStateException();
                                          }

                                          var26 = var5 - var21;
                                       }

                                       th.em(var25, var26, var20, var21, 16777120);
                                       th.ek(var25, var26, var20, var21, 0);
                                       var35 = var11.ds;
                                       var27 = var26 + var33.al + 2;

                                       for(var35 = em.lp(var35, var11, (short)-19863); var35.length() > 0; var27 += 1 + var33.al) {
                                          if (var9 != -465475629) {
                                             throw new IllegalStateException();
                                          }

                                          int var28 = var35.indexOf(dq.aq);
                                          if (-1 != var28) {
                                             if (var9 != -465475629) {
                                                throw new IllegalStateException();
                                             }

                                             var24 = var35.substring(0, var28);
                                             var35 = var35.substring(4 + var28);
                                          } else {
                                             var24 = var35;
                                             var35 = "";
                                          }

                                          var33.ar(var24, var25 + 3, var27, 0, -1);
                                       }
                                    }
                                 }
                              }

                              if (9 == var11.bg * 883712245) {
                                 if (var9 != -465475629) {
                                    return;
                                 }

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
                                    th.fp(var20, var21, var22, var23, 1409091639 * var11.cg);
                                 } else {
                                    bt.la(var20, var21, var22, var23, var11.cg * 1409091639, 1354778849 * var11.cw, (byte)109);
                                 }
                              } else if (var11.bg * 883712245 == 12) {
                                 mz var31 = var11.bj((byte)-11);
                                 lo var32 = var11.bn(-1740765458);
                                 if (var31 != null) {
                                    if (var9 != -465475629) {
                                       throw new IllegalStateException();
                                    }

                                    if (var32 != null) {
                                       if (var9 != -465475629) {
                                          throw new IllegalStateException();
                                       }

                                       if (var31.ca(32293634)) {
                                          if (var9 != -465475629) {
                                             throw new IllegalStateException();
                                          }

                                          var33 = var11.ai(-2008044162);
                                          if (null != var33) {
                                             if (var9 != -465475629) {
                                                throw new IllegalStateException();
                                             }

                                             client.rl.af(var13, var14, var11.cs * -794961409, 1473950221 * var11.cc, var31.cu(-57692379), var31.ck(-91399205), var31.cc(-483082370), var31.cn(-1050882526), var31.cs((byte)-30), 1599579546);
                                             if (var11.et) {
                                                if (var9 != -465475629) {
                                                   throw new IllegalStateException();
                                                }

                                                var10000 = var11.dc * -353676735;
                                             } else {
                                                var10000 = -1;
                                             }

                                             label1079: {
                                                var23 = var10000;
                                                if (!var31.ce(1797956020)) {
                                                   if (var9 != -465475629) {
                                                      return;
                                                   }

                                                   if (var31.bc(-1995273155).aw(-1182697415)) {
                                                      if (var9 != -465475629) {
                                                         throw new IllegalStateException();
                                                      }

                                                      client.rl.an(var32.aw * 1912484269, var23, var32.af * -90398499, 216034339 * var32.an, 561435765);
                                                      client.rl.aw(var31.bh((byte)-94), var33, (byte)-20);
                                                      break label1079;
                                                   }
                                                }

                                                client.rl.an(var11.cg * 1409091639, var23, -90398499 * var32.af, 216034339 * var32.an, -379953391);
                                                client.rl.aw(var31.bc(-1580027563), var33, (byte)-24);
                                             }

                                             th.es(var2, var3, var4, var5);
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

      } catch (RuntimeException var29) {
         throw db.an(var29, "ao.lh(" + ')');
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

   public TlsCredentials ac(CertificateRequest var1) throws IOException {
      return null;
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

   public TlsCredentials au(CertificateRequest var1) throws IOException {
      return null;
   }
}
