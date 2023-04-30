import accessors.RSFloorUnderlayType;

public class hr extends rk implements RSFloorUnderlayType {
   static final int sd = 2160;
   int aw = 0;
   public int ac;
   public static nm af;
   public int au;
   public static kh an = new kh(64);
   public int aq;
   public int ab;
   static int cw;
   static nd fr;
   static final int mr = 1;
   static tf sn;

   public static String aw(long var0) {
      try {
         if (var0 > 0L && var0 < 6582952005840035281L) {
            if (var0 % 37L == 0L) {
               return null;
            } else {
               int var2 = 0;

               for(long var3 = var0; 0L != var3; var3 /= 37L) {
                  ++var2;
               }

               StringBuilder var5;
               char var8;
               for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
                  long var6 = var0;
                  var0 /= 37L;
                  var8 = oy.af[(int)(var6 - var0 * 37L)];
                  if ('_' == var8) {
                     int var9 = var5.length() - 1;
                     var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                     var8 = 160;
                  }
               }

               var5.reverse();
               var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
               return var5.toString();
            }
         } else {
            return null;
         }
      } catch (RuntimeException var10) {
         throw db.an(var10, "hr.aw(" + ')');
      }
   }

   public void an(int var1) {
      try {
         this.au(this.aw * 86825461, -2063363905);
      } catch (RuntimeException var2) {
         throw db.an(var2, "hr.an(" + ')');
      }
   }

   void av(sg var1, int var2, int var3) {
      if (var2 == 1) {
         this.aw = var1.cr(-1655542395) * 1952729693;
      }

   }

   void ac(sg var1, int var2, int var3, byte var4) {
      try {
         if (var2 == 1) {
            if (var4 >= 8) {
               throw new IllegalStateException();
            }

            this.aw = var1.cr(407373802) * 1952729693;
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "hr.ac(" + ')');
      }
   }

   void au(int var1, int var2) {
      try {
         double var3 = (double)(var1 >> 16 & 255) / 256.0;
         double var5 = (double)(var1 >> 8 & 255) / 256.0;
         double var7 = (double)(var1 & 255) / 256.0;
         double var9 = var3;
         if (var5 < var3) {
            if (var2 != -2063363905) {
               throw new IllegalStateException();
            }

            var9 = var5;
         }

         if (var7 < var9) {
            if (var2 != -2063363905) {
               return;
            }

            var9 = var7;
         }

         double var11 = var3;
         if (var5 > var3) {
            if (var2 != -2063363905) {
               throw new IllegalStateException();
            }

            var11 = var5;
         }

         if (var7 > var11) {
            if (var2 != -2063363905) {
               throw new IllegalStateException();
            }

            var11 = var7;
         }

         double var13 = 0.0;
         double var15 = 0.0;
         double var17 = (var11 + var9) / 2.0;
         if (var9 != var11) {
            if (var2 != -2063363905) {
               throw new IllegalStateException();
            }

            if (var17 < 0.5) {
               if (var2 != -2063363905) {
                  throw new IllegalStateException();
               }

               var15 = (var11 - var9) / (var9 + var11);
            }

            if (var17 >= 0.5) {
               if (var2 != -2063363905) {
                  throw new IllegalStateException();
               }

               var15 = (var11 - var9) / (2.0 - var11 - var9);
            }

            if (var3 == var11) {
               if (var2 != -2063363905) {
                  throw new IllegalStateException();
               }

               var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
               if (var2 != -2063363905) {
                  throw new IllegalStateException();
               }

               var13 = (var7 - var3) / (var11 - var9) + 2.0;
            } else if (var7 == var11) {
               if (var2 != -2063363905) {
                  throw new IllegalStateException();
               }

               var13 = 4.0 + (var3 - var5) / (var11 - var9);
            }
         }

         var13 /= 6.0;
         this.au = (int)(var15 * 256.0) * 479912699;
         this.ab = (int)(var17 * 256.0) * 239606945;
         if (1058265139 * this.au < 0) {
            if (var2 != -2063363905) {
               return;
            }

            this.au = 0;
         } else if (this.au * 1058265139 > 255) {
            if (var2 != -2063363905) {
               return;
            }

            this.au = 2118653957;
         }

         if (this.ab * -1527986335 < 0) {
            if (var2 != -2063363905) {
               throw new IllegalStateException();
            }

            this.ab = 0;
         } else if (-1527986335 * this.ab > 255) {
            if (var2 != -2063363905) {
               throw new IllegalStateException();
            }

            this.ab = 970228831;
         }

         if (var17 > 0.5) {
            if (var2 != -2063363905) {
               throw new IllegalStateException();
            }

            this.aq = 335859721 * (int)((1.0 - var17) * var15 * 512.0);
         } else {
            this.aq = (int)(512.0 * var17 * var15) * 335859721;
         }

         if (this.aq * -2012234183 < 1) {
            if (var2 != -2063363905) {
               throw new IllegalStateException();
            }

            this.aq = 335859721;
         }

         this.ac = 1936467539 * (int)((double)(this.aq * -2012234183) * var13);
      } catch (RuntimeException var19) {
         throw db.an(var19, "hr.au(" + ')');
      }
   }

   public void ax(sg var1, int var2) {
      while(true) {
         int var3 = var1.cm((byte)7);
         if (var3 == 0) {
            return;
         }

         this.ac(var1, var3, var2, (byte)-74);
      }
   }

   public void al() {
      this.au(this.aw * 1052940758, -2063363905);
   }

   public void aa() {
      this.au(this.aw * 86825461, -2063363905);
   }

   public void ay() {
      this.au(this.aw * 86825461, -2063363905);
   }

   public void ao() {
      this.au(this.aw * 86825461, -2063363905);
   }

   public static void aq(nm var0) {
      af = var0;
   }

   public void aw(sg var1, int var2, int var3) {
      try {
         while(true) {
            int var4 = var1.cm((byte)7);
            if (var4 == 0) {
               if (var3 >= -1642659271) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ac(var1, var4, var2, (byte)-64);
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "hr.aw(" + ')');
      }
   }

   public void ag(sg var1, int var2) {
      while(true) {
         int var3 = var1.cm((byte)7);
         if (var3 == 0) {
            return;
         }

         this.ac(var1, var3, var2, (byte)4);
      }
   }

   void ah(sg var1, int var2, int var3) {
      if (var2 == 1) {
         this.aw = var1.cr(170052587) * 1952729693;
      }

   }

   public static void au(int var0) {
      try {
         sa.ac.ao((byte)37);
         ly.au = -626822165;
         ly.ab = null;
      } catch (RuntimeException var1) {
         throw db.an(var1, "hr.au(" + ')');
      }
   }

   void ar(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0;
      double var4 = (double)(var1 >> 8 & 255) / 256.0;
      double var6 = (double)(var1 & 255) / 256.0;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = (var10 + var8) / 2.0;
      if (var8 != var10) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0;
         } else if (var6 == var10) {
            var12 = 4.0 + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0;
      this.au = (int)(var14 * 256.0) * 479912699;
      this.ab = (int)(var16 * 256.0) * 239606945;
      if (1058265139 * this.au < 0) {
         this.au = 0;
      } else if (this.au * 1058265139 > 255) {
         this.au = 2118653957;
      }

      if (this.ab * -1527986335 < 0) {
         this.ab = 0;
      } else if (-1527986335 * this.ab > 255) {
         this.ab = 970228831;
      }

      if (var16 > 0.5) {
         this.aq = 335859721 * (int)((1.0 - var16) * var14 * 512.0);
      } else {
         this.aq = (int)(512.0 * var16 * var14) * 335859721;
      }

      if (this.aq * -2012234183 < 1) {
         this.aq = 335859721;
      }

      this.ac = 1936467539 * (int)((double)(this.aq * -2012234183) * var12);
   }

   void am(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0;
      double var4 = (double)(var1 >> 8 & 255) / 256.0;
      double var6 = (double)(var1 & 255) / 256.0;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = (var10 + var8) / 2.0;
      if (var8 != var10) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0;
         } else if (var6 == var10) {
            var12 = 4.0 + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0;
      this.au = (int)(var14 * 256.0) * 479912699;
      this.ab = (int)(var16 * 256.0) * 239606945;
      if (1058265139 * this.au < 0) {
         this.au = 0;
      } else if (this.au * 1058265139 > 255) {
         this.au = 2118653957;
      }

      if (this.ab * -1527986335 < 0) {
         this.ab = 0;
      } else if (-1527986335 * this.ab > 255) {
         this.ab = 970228831;
      }

      if (var16 > 0.5) {
         this.aq = 335859721 * (int)((1.0 - var16) * var14 * 512.0);
      } else {
         this.aq = (int)(512.0 * var16 * var14) * 335859721;
      }

      if (this.aq * -2012234183 < 1) {
         this.aq = 335859721;
      }

      this.ac = 1936467539 * (int)((double)(this.aq * -2012234183) * var12);
   }

   public static void as() {
      an.ac();
   }

   public static void aj() {
      an.ac();
   }

   public void at() {
      this.au(this.aw * 86825461, -2063363905);
   }

   public void ai(sg var1, int var2) {
      while(true) {
         int var3 = var1.cm((byte)7);
         if (var3 == 0) {
            return;
         }

         this.ac(var1, var3, var2, (byte)-78);
      }
   }
}
