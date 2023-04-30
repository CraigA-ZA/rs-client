import java.io.File;
import java.io.RandomAccessFile;

public class fd extends fb {
   public static final int ad = 6;
   static final int bb = 2;
   static int uu;
   static final int ac = 3500;
   public static final float al = 75.0F;
   // $FF: synthetic field
   final fa this$0;
   int af;
   static final int dc = 0;
   public static final int be = 4096;
   public static int[] aq;

   static double af(double var0) {
      try {
         return Math.exp(var0 * -var0 / 2.0) / Math.sqrt(6.283185307179586);
      } catch (RuntimeException var2) {
         throw db.an(var2, "fd.af(" + ')');
      }
   }

   void af(sg var1, int var2) {
      try {
         this.af = var1.cl(348040909) * -1030741753;
      } catch (RuntimeException var3) {
         throw db.an(var3, "fd.af(" + ')');
      }
   }

   void an(fj var1, int var2) {
      try {
         var1.al(this.af * -469795657, (byte)-122);
      } catch (RuntimeException var3) {
         throw db.an(var3, "fd.an(" + ')');
      }
   }

   static final void km(String var0, String var1, int var2, int var3, int var4, int var5, int var6, short var7) {
      try {
         jc.lv(var0, var1, var2, var3, var4, var5, var6, false, (byte)126);
      } catch (RuntimeException var8) {
         throw db.an(var8, "fd.km(" + ')');
      }
   }

   static final void kv(cb var0, int var1, int var2, byte var3) {
      try {
         if (var0 != null) {
            ar.ke(68640743 * var0.af, var0.an * 1427372077, 532700261 * var0.aw, 1480765569 * var0.ac, 680599237 * var0.au, var0.ab, var0.aq, var1, var2, -1502367933);
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "fd.kv(" + ')');
      }
   }

   void au(sg var1) {
      this.af = var1.cl(-867857503) * -1030741753;
   }

   public static File af(String var0, int var1) {
      try {
         if (!gm.af) {
            if (var1 >= -214580013) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            File var2 = (File)gm.aw.get(var0);
            if (null != var2) {
               return var2;
            } else {
               File var3 = new File(tl.an, var0);
               RandomAccessFile var4 = null;

               try {
                  File var5 = new File(var3.getParent());
                  if (!var5.exists()) {
                     if (var1 >= -214580013) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException("");
                     }
                  } else {
                     var4 = new RandomAccessFile(var3, "rw");
                     int var6 = var4.read();
                     var4.seek(0L);
                     var4.write(var6);
                     var4.seek(0L);
                     var4.close();
                     gm.aw.put(var0, var3);
                     return var3;
                  }
               } catch (Exception var8) {
                  try {
                     if (null != var4) {
                        if (var1 >= -214580013) {
                           throw new IllegalStateException();
                        }

                        var4.close();
                        var4 = null;
                     }
                  } catch (Exception var7) {
                  }

                  throw new RuntimeException();
               }
            }
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "fd.af(" + ')');
      }
   }

   static void hi(int var0, int var1) {
      try {
         if (client.dw * -1275976559 == var0) {
            if (var1 > 372776577) {
               ;
            }
         } else {
            if (-1275976559 * client.dw == 30) {
               if (var1 <= 372776577) {
                  return;
               }

               client.si.ag((byte)-85);
            }

            if (0 == -1275976559 * client.dw) {
               if (var1 <= 372776577) {
                  throw new IllegalStateException();
               }

               ck.bc.bs(-274523606);
            }

            label147: {
               if (var0 != 20) {
                  if (var1 <= 372776577) {
                     throw new IllegalStateException();
                  }

                  if (40 != var0) {
                     if (var1 <= 372776577) {
                        throw new IllegalStateException();
                     }

                     if (45 != var0) {
                        if (var1 <= 372776577) {
                           throw new IllegalStateException();
                        }

                        if (var0 != 50) {
                           break label147;
                        }

                        if (var1 <= 372776577) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }

               kz.og(0, 2044655506);
               client.ga = 0;
               client.gt = 0;
               client.ie.aw(var0, (byte)13);
               if (var0 != 20) {
                  if (var1 <= 372776577) {
                     throw new IllegalStateException();
                  }

                  ag.hb(false, -1713084686);
               }
            }

            if (var0 != 20) {
               if (var1 <= 372776577) {
                  throw new IllegalStateException();
               }

               if (var0 != 40) {
                  if (var1 <= 372776577) {
                     throw new IllegalStateException();
                  }

                  if (null != ml.ic) {
                     ml.ic.aq(143996603);
                     ml.ic = null;
                  }
               }
            }

            if (client.dw * -1275976559 == 25) {
               if (var1 <= 372776577) {
                  return;
               }

               client.je = 0;
               client.jx = 0;
               client.jo = -1903772507;
               client.jk = 0;
               client.jq = -1711800473;
            }

            label156: {
               byte var10000;
               byte var2;
               if (var0 != 5) {
                  if (10 != var0) {
                     if (20 == var0) {
                        if (var1 <= 372776577) {
                           return;
                        }

                        if (11 == -1275976559 * client.dw) {
                           if (var1 <= 372776577) {
                              throw new IllegalStateException();
                           }

                           var10000 = 4;
                        } else {
                           var10000 = 0;
                        }

                        var2 = var10000;
                        ap.an(no.fc, rr.fv, false, var2, (byte)-37);
                     } else if (11 == var0) {
                        if (var1 <= 372776577) {
                           return;
                        }

                        ap.an(no.fc, rr.fv, false, 4, (byte)-115);
                     } else if (50 == var0) {
                        if (var1 <= 372776577) {
                           throw new IllegalStateException();
                        }

                        he.ax("", "Updating date of birth...", "", -1811264707);
                        ap.an(no.fc, rr.fv, false, 7, (byte)-123);
                     } else {
                        dv.au(1198190304);
                     }
                     break label156;
                  }

                  if (var1 <= 372776577) {
                     throw new IllegalStateException();
                  }
               }

               if (fl.oi((byte)68)) {
                  if (var1 <= 372776577) {
                     throw new IllegalStateException();
                  }

                  var10000 = 0;
               } else {
                  var10000 = 12;
               }

               var2 = var10000;
               ap.an(no.fc, rr.fv, true, var2, (byte)-43);
            }

            client.dw = 188619889 * var0;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "fd.hi(" + ')');
      }
   }

   void ac(sg var1) {
      this.af = var1.cl(-640146078) * -1030741753;
   }

   fd(fa var1) {
      try {
         this.this$0 = var1;
         super();
         this.af = 1030741753;
      } catch (RuntimeException var2) {
         throw db.an(var2, "fd.<init>(" + ')');
      }
   }

   static void am(byte var0) {
      try {
         cz.di = false;
         ex.at.ay(cz.aw * 578342931, 0);
         ho.aa.ay(578342931 * cz.aw + 382, 0);
         ad.ay.aw(cz.aw * 578342931 + 382 - ad.ay.aw / 2, 18);
      } catch (RuntimeException var1) {
         throw db.an(var1, "fd.am(" + ')');
      }
   }

   void aw(fj var1) {
      var1.al(this.af * -469795657, (byte)-36);
   }

   public static void aw(String[] var0, int[] var1, int var2, int var3, byte var4) {
      try {
         if (var2 < var3) {
            if (var4 != 1) {
               throw new IllegalStateException();
            }

            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            int var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for(int var9 = var2; var9 < var3; ++var9) {
               if (var4 != 1) {
                  return;
               }

               if (null != var7) {
                  if (var0[var9] == null) {
                     continue;
                  }

                  if (var4 != 1) {
                     throw new IllegalStateException();
                  }

                  if (var0[var9].compareTo(var7) >= (var9 & 1)) {
                     continue;
                  }

                  if (var4 != 1) {
                     throw new IllegalStateException();
                  }
               }

               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            aw(var0, var1, var2, var6 - 1, (byte)1);
            aw(var0, var1, 1 + var6, var3, (byte)1);
         }

      } catch (RuntimeException var12) {
         throw db.an(var12, "fd.aw(" + ')');
      }
   }
}
