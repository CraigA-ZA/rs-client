public final class kc {
   static final int dk = 5;
   static final int af = 4096;
   public static final int av = 33;
   static final int aw = 1;
   static final int ag = 16384;
   final int[] an;
   static final int aq = 6;

   public static String af(CharSequence[] var0, int var1, int var2, byte var3) {
      try {
         if (0 == var2) {
            if (var3 != 20) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else if (1 == var2) {
            if (var3 != 20) {
               throw new IllegalStateException();
            } else {
               CharSequence var10 = var0[var1];
               if (null == var10) {
                  if (var3 != 20) {
                     throw new IllegalStateException();
                  } else {
                     return "null";
                  }
               } else {
                  return var10.toString();
               }
            }
         } else {
            int var4 = var1 + var2;
            int var5 = 0;

            for(int var6 = var1; var6 < var4; ++var6) {
               if (var3 != 20) {
                  throw new IllegalStateException();
               }

               CharSequence var7 = var0[var6];
               if (null == var7) {
                  var5 += 4;
               } else {
                  var5 += var7.length();
               }
            }

            StringBuilder var11 = new StringBuilder(var5);

            for(int var12 = var1; var12 < var4; ++var12) {
               if (var3 != 20) {
                  throw new IllegalStateException();
               }

               CharSequence var8 = var0[var12];
               if (null == var8) {
                  if (var3 != 20) {
                     throw new IllegalStateException();
                  }

                  var11.append("null");
               } else {
                  var11.append(var8);
               }
            }

            return var11.toString();
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "kc.af(" + ')');
      }
   }

   kc(int[] var1) {
      try {
         super();
         this.an = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "kc.<init>(" + ')');
      }
   }

   kc() {
      try {
         super();
         this.an = new int[4096];
      } catch (RuntimeException var1) {
         throw db.an(var1, "kc.<init>(" + ')');
      }
   }

   final int an(int var1, int var2) {
      return this.an[64 * var2 + var1];
   }

   final int aw(int var1, int var2) {
      return this.an[64 * var2 + var1];
   }

   final int af(int var1, int var2, int var3) {
      try {
         return this.an[64 * var2 + var1];
      } catch (RuntimeException var4) {
         throw db.an(var4, "kc.af(" + ')');
      }
   }

   public static int au(CharSequence var0, int var1, int var2, byte[] var3, int var4, byte var5) {
      try {
         int var6 = var2 - var1;

         for(int var7 = 0; var7 < var6; ++var7) {
            if (var5 == 0) {
               throw new IllegalStateException();
            }

            char var8;
            label216: {
               var8 = var0.charAt(var7 + var1);
               if (var8 > 0) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  if (var8 < 128) {
                     break label216;
                  }

                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }
               }

               if (var8 >= 160) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  if (var8 <= 255) {
                     break label216;
                  }
               }

               if (var8 == 8364) {
                  var3[var7 + var4] = -128;
               } else if (var8 == 8218) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -126;
               } else if (402 == var8) {
                  var3[var7 + var4] = -125;
               } else if (var8 == 8222) {
                  var3[var4 + var7] = -124;
               } else if (var8 == 8230) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -123;
               } else if (8224 == var8) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -122;
               } else if (var8 == 8225) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -121;
               } else if (710 == var8) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -120;
               } else if (8240 == var8) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -119;
               } else if (352 == var8) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -118;
               } else if (8249 == var8) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -117;
               } else if (338 == var8) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -116;
               } else if (381 == var8) {
                  var3[var4 + var7] = -114;
               } else if (var8 == 8216) {
                  var3[var4 + var7] = -111;
               } else if (8217 == var8) {
                  var3[var7 + var4] = -110;
               } else if (8220 == var8) {
                  var3[var7 + var4] = -109;
               } else if (var8 == 8221) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -108;
               } else if (8226 == var8) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -107;
               } else if (var8 == 8211) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -106;
               } else if (8212 == var8) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -105;
               } else if (732 == var8) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -104;
               } else if (var8 == 8482) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -103;
               } else if (var8 == 353) {
                  var3[var7 + var4] = -102;
               } else if (var8 == 8250) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -101;
               } else if (var8 == 339) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -100;
               } else if (382 == var8) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -98;
               } else if (var8 == 376) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -97;
               } else {
                  var3[var4 + var7] = 63;
               }
               continue;
            }

            var3[var7 + var4] = (byte)var8;
         }

         return var6;
      } catch (RuntimeException var9) {
         throw db.an(var9, "kc.au(" + ')');
      }
   }

   final int ac(int var1, int var2) {
      return this.an[1037976743 * var2 + var1];
   }
}
