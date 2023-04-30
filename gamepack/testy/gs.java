public class gs extends fb {
   // $FF: synthetic field
   final fa this$0;
   int af;
   static tc ag;

   void ac(sg var1) {
      this.af = var1.cl(-163425855) * -536303009;
   }

   void af(sg var1, int var2) {
      try {
         this.af = var1.cl(-279562647) * -536303009;
      } catch (RuntimeException var3) {
         throw db.an(var3, "gs.af(" + ')');
      }
   }

   void an(fj var1, int var2) {
      try {
         var1.ax(1899901343 * this.af, (byte)-1);
      } catch (RuntimeException var3) {
         throw db.an(var3, "gs.an(" + ')');
      }
   }

   gs(fa var1) {
      try {
         this.this$0 = var1;
         super();
         this.af = 536303009;
      } catch (RuntimeException var2) {
         throw db.an(var2, "gs.<init>(" + ')');
      }
   }

   public static hg an(int var0, int var1) {
      try {
         hg var2 = (hg)hg.an.af((long)var0);
         if (var2 != null) {
            if (var1 >= 107410892) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = hg.af.bh(14, var0, (byte)-77);
            var2 = new hg();
            if (var3 != null) {
               if (var1 >= 107410892) {
                  throw new IllegalStateException();
               }

               var2.aw(new sg(var3), -27344201);
            }

            hg.an.aw(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "gs.an(" + ')');
      }
   }

   void aw(fj var1) {
      var1.ax(1899901343 * this.af, (byte)-1);
   }

   void au(sg var1) {
      this.af = var1.cl(-823282392) * -536303009;
   }

   static void lq(mq var0, int var1, int var2, boolean var3, int var4) {
      try {
         int var5 = var0.cs * -794961409;
         int var6 = var0.cc * 1473950221;
         if (var0.bv * 241981169 == 0) {
            var0.cs = -1212957085 * var0.bh;
         } else if (241981169 * var0.bv == 1) {
            if (var4 >= -2093290365) {
               throw new IllegalStateException();
            }

            var0.cs = 1774069247 * (var1 - var0.bh * -1960603747);
         } else if (var0.bv * 241981169 == 2) {
            if (var4 >= -2093290365) {
               throw new IllegalStateException();
            }

            var0.cs = 1774069247 * (var1 * var0.bh * -1960603747 >> 14);
         }

         if (-480604969 * var0.bl == 0) {
            var0.cc = 1850345051 * var0.bw;
         } else if (-480604969 * var0.bl == 1) {
            if (var4 >= -2093290365) {
               return;
            }

            var0.cc = 60157125 * (var2 - 1756076191 * var0.bw);
         } else if (var0.bl * -480604969 == 2) {
            if (var4 >= -2093290365) {
               throw new IllegalStateException();
            }

            var0.cc = 60157125 * (var2 * 1756076191 * var0.bw >> 14);
         }

         if (var0.bv * 241981169 == 4) {
            if (var4 >= -2093290365) {
               throw new IllegalStateException();
            }

            var0.cs = 1774069247 * (var0.cn * 640195305 * 1473950221 * var0.cc / (276729069 * var0.ca));
         }

         if (4 == var0.bl * -480604969) {
            if (var4 >= -2093290365) {
               throw new IllegalStateException();
            }

            var0.cc = var0.ca * 276729069 * var0.cs * -794961409 / (var0.cn * 640195305) * 60157125;
         }

         if (1337 == 1021339961 * var0.bf) {
            if (var4 >= -2093290365) {
               throw new IllegalStateException();
            }

            client.ps = var0;
         }

         if (12 == var0.bg * 883712245) {
            if (var4 >= -2093290365) {
               throw new IllegalStateException();
            }

            var0.bj((byte)-78).aq(var0.cs * -794961409, 1473950221 * var0.cc, (byte)63);
         }

         if (var3) {
            if (var4 >= -2093290365) {
               throw new IllegalStateException();
            }

            if (null != var0.gh) {
               if (var0.cs * -794961409 == var5) {
                  if (var4 >= -2093290365) {
                     throw new IllegalStateException();
                  }

                  if (var0.cc * 1473950221 == var6) {
                     return;
                  }
               }

               dr var7 = new dr();
               var7.aw = var0;
               var7.af = var0.gh;
               client.rq.an(var7);
            }
         }

      } catch (RuntimeException var8) {
         throw db.an(var8, "gs.lq(" + ')');
      }
   }

   static void af(byte var0) {
      try {
         if (gd.af.toLowerCase().indexOf("microsoft") != -1) {
            if (var0 != 4) {
               throw new IllegalStateException();
            }

            bi.dt[186] = 57;
            bi.dt[187] = 27;
            bi.dt[188] = 71;
            bi.dt[189] = 26;
            bi.dt[190] = 72;
            bi.dt[191] = 73;
            bi.dt[192] = 58;
            bi.dt[219] = 42;
            bi.dt[220] = 74;
            bi.dt[221] = 43;
            bi.dt[222] = 59;
            bi.dt[223] = 28;
         } else {
            bi.dt[44] = 71;
            bi.dt[45] = 26;
            bi.dt[46] = 72;
            bi.dt[47] = 73;
            bi.dt[59] = 57;
            bi.dt[61] = 27;
            bi.dt[91] = 42;
            bi.dt[92] = 74;
            bi.dt[93] = 43;
            bi.dt[192] = 28;
            bi.dt[222] = 58;
            bi.dt[520] = 59;
         }

      } catch (RuntimeException var1) {
         throw db.an(var1, "gs.af(" + ')');
      }
   }
}
