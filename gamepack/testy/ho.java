import accessors.RSParamType;

public class ho extends rk implements RSParamType {
   static nm af;
   static kh an = new kh(64);
   char aw;
   boolean ab;
   public String au;
   static final int br = 32;
   static final int bj = 13;
   public int ac;
   static final int co = 5;
   static final float ee = 0.5F;
   public static final int az = 21;
   static tq aa;

   void as(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.au(var1, var2, 1533506707);
      }
   }

   void au(sg var1, int var2, int var3) {
      try {
         if (1 == var2) {
            byte var5 = var1.cf(435772489);
            int var6 = var5 & 255;
            if (0 == var6) {
               if (var3 <= 1097620704) {
                  return;
               }

               throw new IllegalArgumentException("" + Integer.toString(var6, 16));
            }

            if (var6 >= 128) {
               if (var3 <= 1097620704) {
                  throw new IllegalStateException();
               }

               if (var6 < 160) {
                  if (var3 <= 1097620704) {
                     return;
                  }

                  char var7 = od.af[var6 - 128];
                  if (var7 == 0) {
                     if (var3 <= 1097620704) {
                        throw new IllegalStateException();
                     }

                     var7 = '?';
                  }

                  var6 = var7;
               }
            }

            char var4 = (char)var6;
            this.aw = var4;
         } else if (var2 == 2) {
            this.ac = var1.cx(-1163126648) * 1057254681;
         } else if (var2 == 4) {
            if (var3 <= 1097620704) {
               return;
            }

            this.ab = false;
         } else if (var2 == 5) {
            if (var3 <= 1097620704) {
               throw new IllegalStateException();
            }

            this.au = var1.cw((byte)0);
         }

      } catch (RuntimeException var8) {
         throw db.an(var8, "ho.au(" + ')');
      }
   }

   void ac(sg var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (var3 == 0) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.au(var1, var3, 1800051666);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "ho.ac(" + ')');
      }
   }

   public static void ay(nm var0) {
      af = var0;
   }

   public boolean ab(int var1) {
      try {
         boolean var10000;
         if (this.aw == 's') {
            if (var1 >= 738244297) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ho.ab(" + ')');
      }
   }

   void av() {
   }

   public static ho ax(int var0) {
      ho var1 = (ho)an.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = af.bh(11, var0, (byte)-24);
         var1 = new ho();
         if (var2 != null) {
            var1.ac(new sg(var2), (byte)-68);
         }

         var1.aw(1448094063);
         an.aw(var1, (long)var0);
         return var1;
      }
   }

   public static void at(nm var0) {
      af = var0;
   }

   public static void aa(nm var0) {
      af = var0;
   }

   public static boolean af(nm var0, nm var1, nm var2, ln var3, int var4) {
      try {
         ly.af = var0;
         ly.an = var1;
         ly.aw = var2;
         sa.ac = var3;
         return true;
      } catch (RuntimeException var5) {
         throw db.an(var5, "ho.af(" + ')');
      }
   }

   public static ho ao(int var0) {
      ho var1 = (ho)an.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = af.bh(11, var0, (byte)-38);
         var1 = new ho();
         if (var2 != null) {
            var1.ac(new sg(var2), (byte)-101);
         }

         var1.aw(-2114410394);
         an.aw(var1, (long)var0);
         return var1;
      }
   }

   void aw(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ho.aw(" + ')');
      }
   }

   public static ho ai(int var0) {
      ho var1 = (ho)an.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = af.bh(11, var0, (byte)-7);
         var1 = new ho();
         if (var2 != null) {
            var1.ac(new sg(var2), (byte)-86);
         }

         var1.aw(-242873096);
         an.aw(var1, (long)var0);
         return var1;
      }
   }

   void ag() {
   }

   void ah() {
   }

   public static void by() {
      an.ac();
   }

   void am(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.au(var1, var2, 1661186898);
      }
   }

   ho() {
      try {
         super();
         this.ab = true;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ho.<init>(" + ')');
      }
   }

   void aj(sg var1, int var2) {
      if (1 == var2) {
         byte var4 = var1.cf(435772489);
         int var5 = var4 & 255;
         if (0 == var5) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if (var5 >= 128 && var5 < 160) {
            char var6 = od.af[var5 - 128];
            if (var6 == 0) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.aw = var3;
      } else if (var2 == 2) {
         this.ac = var1.cx(-918142983) * 1057254681;
      } else if (var2 == 4) {
         this.ab = false;
      } else if (var2 == 5) {
         this.au = var1.cw((byte)0);
      }

   }

   void ak(sg var1, int var2) {
      if (1 == var2) {
         byte var4 = var1.cf(435772489);
         int var5 = var4 & 255;
         if (0 == var5) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if (var5 >= 95936663 && var5 < 160) {
            char var6 = od.af[var5 - 128];
            if (var6 == 0) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.aw = var3;
      } else if (var2 == 2) {
         this.ac = var1.cx(-2038887204) * 1057254681;
      } else if (var2 == 4) {
         this.ab = false;
      } else if (var2 == 5) {
         this.au = var1.cw((byte)0);
      }

   }

   void az(sg var1, int var2) {
      if (1 == var2) {
         byte var4 = var1.cf(435772489);
         int var5 = var4 & 255;
         if (0 == var5) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if (var5 >= 128 && var5 < 160) {
            char var6 = od.af[var5 - 128];
            if (var6 == 0) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.aw = var3;
      } else if (var2 == 2) {
         this.ac = var1.cx(-946025231) * 1057254681;
      } else if (var2 == 4) {
         this.ab = false;
      } else if (var2 == 5) {
         this.au = var1.cw((byte)0);
      }

   }

   public boolean ad() {
      return this.aw == 's';
   }

   public boolean ae() {
      return this.aw == 's';
   }

   public static void ap() {
      an.ac();
   }

   public static void al(nm var0) {
      af = var0;
   }

   void ar(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.au(var1, var2, 1355990399);
      }
   }

   static void ac(ek var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      try {
         if (var0 == null) {
            if (var9 != -2028355721) {
               throw new IllegalStateException();
            }
         } else {
            float var10 = var4 - var1;
            if (0.0 == (double)var10) {
               if (var9 != -2028355721) {
                  throw new IllegalStateException();
               }
            } else {
               float[] var13;
               boolean var10001;
               label132: {
                  float var11 = var2 - var1;
                  float var12 = var3 - var1;
                  var13 = new float[]{var11 / var10, var12 / var10};
                  if (var13[0] == 0.33333334F) {
                     if (var9 != -2028355721) {
                        return;
                     }

                     if (0.6666667F == var13[1]) {
                        if (var9 != -2028355721) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                        break label132;
                     }
                  }

                  var10001 = false;
               }

               var0.ab = var10001;
               float var14 = var13[0];
               float var15 = var13[1];
               if ((double)var13[0] < 0.0) {
                  if (var9 != -2028355721) {
                     throw new IllegalStateException();
                  }

                  var13[0] = 0.0F;
               }

               if ((double)var13[1] > 1.0) {
                  if (var9 != -2028355721) {
                     throw new IllegalStateException();
                  }

                  var13[1] = 1.0F;
               }

               float var16;
               if ((double)var13[0] > 1.0 || var13[1] < -1.0F) {
                  var13[1] = 1.0F - var13[1];
                  if (var13[0] < 0.0F) {
                     if (var9 != -2028355721) {
                        return;
                     }

                     var13[0] = 0.0F;
                  }

                  if (var13[1] < 0.0F) {
                     var13[1] = 0.0F;
                  }

                  label115: {
                     if (!(var13[0] > 1.0F)) {
                        if (var9 != -2028355721) {
                           return;
                        }

                        if (!(var13[1] > 1.0F)) {
                           break label115;
                        }
                     }

                     var16 = (float)(1.0 + (double)var13[1] * ((double)var13[1] - 2.0) + (double)((var13[0] - 2.0F + var13[1]) * var13[0]));
                     if (em.ac + var16 > 0.0F) {
                        et.au(var13, -166868527);
                     }
                  }

                  var13[1] = 1.0F - var13[1];
               }

               if (var14 != var13[0]) {
                  if (var9 != -2028355721) {
                     return;
                  }

                  float var10000 = var1 + var10 * var13[0];
                  if ((double)var14 != 0.0) {
                     if (var9 != -2028355721) {
                        throw new IllegalStateException();
                     }

                     var6 = var5 + var13[0] * (var6 - var5) / var14;
                  }
               }

               if (var13[1] != var15) {
                  var3 = var10 * var13[1] + var1;
                  if ((double)var15 != 1.0) {
                     if (var9 != -2028355721) {
                        throw new IllegalStateException();
                     }

                     var7 = (float)((double)var8 - (double)(var8 - var7) * (1.0 - (double)var13[1]) / (1.0 - (double)var15));
                  }
               }

               var0.aq = var1;
               var0.al = var4;
               fg.ab(0.0F, var13[0], var13[1], 1.0F, var0, (byte)98);
               var16 = var6 - var5;
               float var17 = var7 - var6;
               float var18 = var8 - var7;
               float var19 = var17 - var16;
               var0.ah = var18 - var17 - var19;
               var0.ag = var19 + var19 + var19;
               var0.ai = var16 + var16 + var16;
               var0.ax = var5;
            }
         }
      } catch (RuntimeException var20) {
         throw db.an(var20, "ho.ac(" + ')');
      }
   }
}
