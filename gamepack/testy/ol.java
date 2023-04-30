public class ol {
   public static sj[] ag;
   static char[] an;
   static char[] aw;
   static char[] af = new char[64];
   static int[] ac;
   static final int wp = 4;

   ol() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ol.<init>(" + ')');
      }
   }

   public static String au(byte[] var0) {
      return fw.an(var0, 0, var0.length, -171102712);
   }

   public static String aw(byte[] var0) {
      return fw.an(var0, 0, var0.length, -1782734500);
   }

   static String al(byte[] var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      for(int var4 = var1; var4 < var2 + var1; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(af[var5 >>> 2]);
         if (var4 < var2 - 1) {
            int var6 = var0[1 + var4] & 255;
            var3.append(af[(var5 & 3) << 4 | var6 >>> 4]);
            if (var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(af[(var6 & 15) << 2 | var7 >>> 6]).append(af[var7 & 63]);
            } else {
               var3.append(af[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(af[(var5 & 3) << 4]).append("==");
         }
      }

      return var3.toString();
   }

   static String ab(byte[] var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      for(int var4 = var1; var4 < var2 + var1; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(af[var5 >>> 2]);
         if (var4 < var2 - 1) {
            int var6 = var0[1 + var4] & 255;
            var3.append(af[(var5 & 3) << 4 | var6 >>> 4]);
            if (var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 1556686435;
               var3.append(af[(var6 & 15) << 2 | var7 >>> 6]).append(af[var7 & 63]);
            } else {
               var3.append(af[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(af[(var5 & 3) << 4]).append("==");
         }
      }

      return var3.toString();
   }

   public static String ac(byte[] var0) {
      return fw.an(var0, 0, var0.length, -1964648139);
   }

   static String aq(byte[] var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      for(int var4 = var1; var4 < var2 + var1; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(af[var5 >>> 2]);
         if (var4 < var2 - 1) {
            int var6 = var0[1 + var4] & 255;
            var3.append(af[(var5 & 3) << 4 | var6 >>> 4]);
            if (var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(af[(var6 & 15) << 2 | var7 >>> 6]).append(af[var7 & 63]);
            } else {
               var3.append(af[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(af[(var5 & 3) << 4]).append("==");
         }
      }

      return var3.toString();
   }

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         af[var0] = (char)(65 + var0);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         af[var0] = (char)(97 + var0 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         af[var0] = (char)(var0 + 48 - 52);
      }

      af[62] = '+';
      af[63] = '/';
      an = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         an[var0] = (char)(65 + var0);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         an[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         an[var0] = (char)(48 + var0 - 52);
      }

      an[62] = '*';
      an[63] = '-';
      aw = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         aw[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         aw[var0] = (char)(97 + var0 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         aw[var0] = (char)(var0 + 48 - 52);
      }

      aw[62] = '-';
      aw[63] = '_';
      ac = new int[128];

      for(var0 = 0; var0 < ac.length; ++var0) {
         ac[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         ac[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         ac[var0] = 26 + (var0 - 97);
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         ac[var0] = 52 + (var0 - 48);
      }

      int[] var2 = ac;
      ac[43] = 62;
      var2[42] = 62;
      int[] var1 = ac;
      ac[47] = 63;
      var1[45] = 63;
   }

   static String at(byte[] var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      for(int var4 = var1; var4 < var2 + var1; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(af[var5 >>> 2]);
         if (var4 < var2 - 1) {
            int var6 = var0[1 + var4] & 255;
            var3.append(af[(var5 & 3) << 4 | var6 >>> 4]);
            if (var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(af[(var6 & 15) << 2 | var7 >>> 6]).append(af[var7 & 63]);
            } else {
               var3.append(af[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(af[(var5 & 3) << 4]).append("==");
         }
      }

      return var3.toString();
   }

   static final void mm(mq var0, int var1, int var2, int var3) {
      try {
         if (client.pr == null) {
            if (var3 >= -1795081153) {
               throw new IllegalStateException();
            }

            if (!client.nt) {
               if (var0 != null) {
                  if (var3 >= -1795081153) {
                     throw new IllegalStateException();
                  }

                  mq var6 = var0;
                  int var7 = ht.an(ap.ng(var0, 1550671601), 1014749016);
                  mq var5;
                  int var8;
                  if (0 == var7) {
                     if (var3 >= -1795081153) {
                        return;
                     }

                     var5 = null;
                  } else {
                     label138: {
                        for(var8 = 0; var8 < var7; ++var8) {
                           if (var3 >= -1795081153) {
                              throw new IllegalStateException();
                           }

                           var6 = gh.an(var6.cu * 913615679, (byte)5);
                           if (var6 == null) {
                              if (var3 >= -1795081153) {
                                 return;
                              }

                              var5 = null;
                              break label138;
                           }
                        }

                        var5 = var6;
                     }
                  }

                  mq var10 = var5;
                  if (null == var5) {
                     if (var3 >= -1795081153) {
                        return;
                     }

                     var10 = var0.ey;
                  }

                  if (var10 != null) {
                     if (var3 >= -1795081153) {
                        throw new IllegalStateException();
                     }

                     client.pr = var0;
                     var6 = var0;
                     var7 = ht.an(ap.ng(var0, 610789584), -1713305302);
                     if (0 == var7) {
                        if (var3 >= -1795081153) {
                           return;
                        }

                        var5 = null;
                     } else {
                        label136: {
                           for(var8 = 0; var8 < var7; ++var8) {
                              if (var3 >= -1795081153) {
                                 throw new IllegalStateException();
                              }

                              var6 = gh.an(var6.cu * 913615679, (byte)5);
                              if (var6 == null) {
                                 var5 = null;
                                 break label136;
                              }
                           }

                           var5 = var6;
                        }
                     }

                     var10 = var5;
                     if (var5 == null) {
                        if (var3 >= -1795081153) {
                           throw new IllegalStateException();
                        }

                        var10 = var0.ey;
                     }

                     client.pf = var10;
                     client.pd = -489272497 * var1;
                     client.pw = var2 * 1757453321;
                     dq.qe = 0;
                     client.pn = false;
                     int var11 = ct.lm((short)-15047);
                     if (var11 != -1) {
                        if (var3 >= -1795081153) {
                           throw new IllegalStateException();
                        }

                        lm.mv(var11, (byte)-87);
                     }

                     return;
                  }
               }

               return;
            }
         }

      } catch (RuntimeException var9) {
         throw db.an(var9, "ol.mm(" + ')');
      }
   }
}
