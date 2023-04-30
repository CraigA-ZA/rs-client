import accessors.RSGraphicsObject;

public final class cx extends iv implements RSGraphicsObject {
   int at;
   int an;
   int aw;
   boolean aa;
   int au;
   int ab;
   ha aq;
   int ac;
   int af;
   int al;
   static boolean sl;
   public static final int am = 1;

   cx(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         super();
         this.al = 0;
         this.at = 0;
         this.aa = false;
         this.af = var1 * -1726780687;
         this.aw = 1295796889 * var2;
         this.ac = var3 * -620581055;
         this.au = -652580511 * var4;
         this.ab = 186790935 * var5;
         this.an = 1889540095 * (var7 + var6);
         int var8 = dc.an(-1107802607 * this.af, 1435340581).aq * 374130911;
         if (var8 != -1) {
            this.aa = false;
            this.aq = dc.an(var8, (byte)52);
         } else {
            this.aa = true;
         }

      } catch (RuntimeException var9) {
         throw db.an(var9, "cx.<init>(" + ')');
      }
   }

   static final void ao(long var0) {
      try {
         ix.ag[(ix.ai += -429048361) * -1048050201 - 1] = var0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "cx.ao(" + ')');
      }
   }

   protected final it an(byte var1) {
      try {
         hh var2 = dc.an(-1107802607 * this.af, 1610312952);
         it var3;
         if (!this.aa) {
            if (var1 >= 14) {
               throw new IllegalStateException();
            }

            var3 = var2.au(158616165 * this.al, -1066689699);
         } else {
            var3 = var2.au(-1, -475437354);
         }

         return var3 == null ? null : var3;
      } catch (RuntimeException var4) {
         throw db.an(var4, "cx.an(" + ')');
      }
   }

   final void aw(int var1) {
      if (!this.aa) {
         this.at += var1 * -1180781567;
         if (!this.aq.ao(-1813380146)) {
            while(this.at * -1243891993 > this.aq.av[this.al * 158616165]) {
               this.at -= this.aq.av[158616165 * this.al] * -1521037169;
               this.al += 639915885;
               if (417765595 * this.al >= this.aq.ag.length) {
                  this.aa = true;
                  break;
               }
            }
         } else {
            this.al += var1 * 639915885;
            if (this.al * 1632887508 >= this.aq.ax(1442750497)) {
               this.aa = true;
            }
         }

      }
   }

   final void ac(int var1) {
      if (!this.aa) {
         this.at += var1 * 735964010;
         if (!this.aq.ao(-1555634472)) {
            while(this.at * 770512108 > this.aq.av[this.al * 1976896309]) {
               this.at -= this.aq.av[257322877 * this.al] * 1582072345;
               this.al += -267696178;
               if (158616165 * this.al >= this.aq.ag.length) {
                  this.aa = true;
                  break;
               }
            }
         } else {
            this.al += var1 * -976513309;
            if (this.al * 158616165 >= this.aq.ax(-750177324)) {
               this.aa = true;
            }
         }

      }
   }

   final void af(int var1, byte var2) {
      try {
         if (this.aa) {
            if (var2 < 1) {
               ;
            }
         } else {
            this.at += var1 * -1521037169;
            if (!this.aq.ao(1292413671)) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               while(this.at * -1355788689 > this.aq.av[this.al * 158616165]) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  this.at -= this.aq.av[158616165 * this.al] * -1521037169;
                  this.al += 639915885;
                  if (158616165 * this.al >= this.aq.ag.length) {
                     if (var2 >= 1) {
                        return;
                     }

                     this.aa = true;
                     break;
                  }
               }
            } else {
               this.al += var1 * 639915885;
               if (this.al * 158616165 >= this.aq.ax(-1150407276)) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  this.aa = true;
               }
            }

         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "cx.af(" + ')');
      }
   }

   protected final it ab() {
      hh var1 = dc.an(-396197054 * this.af, -514724979);
      it var2;
      if (!this.aa) {
         var2 = var1.au(392700909 * this.al, -263321838);
      } else {
         var2 = var1.au(-1, -1862547635);
      }

      return var2 == null ? null : var2;
   }

   protected final it aq() {
      hh var1 = dc.an(-1107802607 * this.af, 2030099362);
      it var2;
      if (!this.aa) {
         var2 = var1.au(158616165 * this.al, 1485185385);
      } else {
         var2 = var1.au(-1, 935601683);
      }

      return var2 == null ? null : var2;
   }

   protected final it al() {
      hh var1 = dc.an(-1107802607 * this.af, 1487649072);
      it var2;
      if (!this.aa) {
         var2 = var1.au(137446941 * this.al, 904021857);
      } else {
         var2 = var1.au(-1, -691670703);
      }

      return var2 == null ? null : var2;
   }

   protected final it au() {
      hh var1 = dc.an(-1107802607 * this.af, 197066114);
      it var2;
      if (!this.aa) {
         var2 = var1.au(158616165 * this.al, -547956671);
      } else {
         var2 = var1.au(-1, 1677567410);
      }

      return var2 == null ? null : var2;
   }

   public static void an(short var0) {
      try {
         if (bd.ac != null) {
            if (var0 != 152) {
               throw new IllegalStateException();
            }

            synchronized(bd.ac) {
               bd.ac = null;
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "cx.an(" + ')');
      }
   }

   static final void is(int var0, int var1, byte var2) {
      try {
         if (var0 < 128) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            var0 = 128;
         } else if (var0 > 383) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            var0 = 383;
         }

         if (1897923909 * jb.ky < var0) {
            jb.ky += 528729485 * (hw.uv * 942361787 * (var0 - jb.ky * 1897923909) / 1000 + 1039880989 * nd.up);
            if (1897923909 * jb.ky > var0) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               jb.ky = 528729485 * var0;
            }
         } else if (1897923909 * jb.ky > var0) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            jb.ky -= (hw.uv * 942361787 * (jb.ky * 1897923909 - var0) / 1000 + nd.up * 1039880989) * 528729485;
            if (jb.ky * 1897923909 < var0) {
               if (var2 <= 0) {
                  return;
               }

               jb.ky = var0 * 528729485;
            }
         }

         var1 &= 2047;
         int var3 = var1 - ek.kh * -1010818347;
         if (var3 > 1024) {
            var3 -= 2048;
         } else if (var3 < -1024) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            var3 += 2048;
         }

         if (var3 > 0) {
            ek.kh += -1545206147 * (var3 * 942361787 * hw.uv / 1000 + 1039880989 * nd.up);
            ek.kh = (ek.kh * -1010818347 & 2047) * -1545206147;
         } else if (var3 < 0) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            ek.kh -= -1545206147 * (1039880989 * nd.up + -var3 * 942361787 * hw.uv / 1000);
            ek.kh = (ek.kh * -1010818347 & 2047) * -1545206147;
         }

         int var4 = var1 - ek.kh * -1010818347;
         if (var4 > 1024) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            var4 -= 2048;
         } else if (var4 < -1024) {
            var4 += 2048;
         }

         label115: {
            if (var4 < 0) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               if (var3 > 0) {
                  break label115;
               }

               if (var2 <= 0) {
                  throw new IllegalStateException();
               }
            }

            if (var4 <= 0 || var3 >= 0) {
               return;
            }

            if (var2 <= 0) {
               throw new IllegalStateException();
            }
         }

         ek.kh = var1 * -1545206147;
      } catch (RuntimeException var5) {
         throw db.an(var5, "cx.is(" + ')');
      }
   }
}
