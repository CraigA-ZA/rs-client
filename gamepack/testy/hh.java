import accessors.RSSpotType;

public class hh extends rk implements RSSpotType {
   int au;
   short[] ay;
   short[] at;
   public static kh ac = new kh(30);
   int ab;
   static nm af;
   public int aq;
   short[] al;
   int ai;
   public static kh aw = new kh(64);
   short[] aa;
   int ao;
   int ax;
   static nm an;
   int ag;
   int ah;

   public final it as() {
      it var1 = (it)ac.af((long)(this.au * -190570391));
      if (var1 == null) {
         iz var2 = iz.af(an, this.ab * -170244579, 0);
         if (var2 == null) {
            return null;
         }

         int var3;
         if (null != this.al) {
            for(var3 = 0; var3 < this.al.length; ++var3) {
               var2.as(this.al[var3], this.at[var3]);
            }
         }

         if (this.aa != null) {
            for(var3 = 0; var3 < this.aa.length; ++var3) {
               var2.aj(this.aa[var3], this.ay[var3]);
            }
         }

         var1 = var2.bb(this.ag * 742442999 + 1807148956, 850 + this.ah * -138140925, 1917261223, -15417995, 1665631501);
         ac.aw(var1, (long)(-190570391 * this.au));
      }

      return var1;
   }

   hh() {
      try {
         super();
         this.aq = -1861808927;
         this.ao = 122094464;
         this.ax = -370064768;
         this.ai = 0;
         this.ag = 0;
         this.ah = 0;
      } catch (RuntimeException var1) {
         throw db.an(var1, "hh.<init>(" + ')');
      }
   }

   void ac(sg var1, int var2, byte var3) {
      try {
         if (1 == var2) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            this.ab = var1.cl(-148790003) * -1354453963;
         } else if (var2 == 2) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            this.aq = var1.cl(-1816793442) * 1861808927;
         } else if (var2 == 4) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            this.ao = var1.cl(-1000416008) * -636580345;
         } else if (5 == var2) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            this.ax = var1.cl(-721114990) * -1110187387;
         } else if (var2 == 6) {
            this.ai = var1.cl(-1690091831) * -1376904751;
         } else if (7 == var2) {
            this.ag = var1.cm((byte)7) * 399649223;
         } else if (var2 == 8) {
            if (var3 <= 1) {
               return;
            }

            this.ah = var1.cm((byte)7) * 1837096875;
         } else {
            int var4;
            int var5;
            if (var2 == 40) {
               var4 = var1.cm((byte)7);
               this.al = new short[var4];
               this.at = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  this.al[var5] = (short)var1.cl(-699499278);
                  this.at[var5] = (short)var1.cl(-1037040176);
               }
            } else if (var2 == 41) {
               var4 = var1.cm((byte)7);
               this.aa = new short[var4];
               this.ay = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  this.aa[var5] = (short)var1.cl(-1792662823);
                  this.ay[var5] = (short)var1.cl(353372987);
               }
            }
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "hh.ac(" + ')');
      }
   }

   public final it au(int var1, int var2) {
      try {
         it var3 = this.ab(-972501101);
         it var4;
         if (this.aq * 374130911 != -1 && var1 != -1) {
            if (var2 == 1971549177) {
               throw new IllegalStateException();
            }

            var4 = dc.an(this.aq * 374130911, (byte)74).al(var3, var1, -1926546328);
         } else {
            var4 = var3.ay(true);
         }

         label63: {
            if (128 == -1761247305 * this.ao) {
               if (128 == this.ax * -1083521459) {
                  break label63;
               }

               if (var2 == 1971549177) {
                  throw new IllegalStateException();
               }
            }

            var4.bk(-1761247305 * this.ao, this.ax * -1083521459, this.ao * -1761247305);
         }

         if (-906961103 * this.ai != 0) {
            if (var2 == 1971549177) {
               throw new IllegalStateException();
            }

            if (this.ai * -906961103 == 90) {
               if (var2 == 1971549177) {
                  throw new IllegalStateException();
               }

               var4.ap();
            }

            if (this.ai * -906961103 == 180) {
               if (var2 == 1971549177) {
                  throw new IllegalStateException();
               }

               var4.ap();
               var4.ap();
            }

            if (this.ai * -906961103 == 270) {
               if (var2 == 1971549177) {
                  throw new IllegalStateException();
               }

               var4.ap();
               var4.ap();
               var4.ap();
            }
         }

         return var4;
      } catch (RuntimeException var5) {
         throw db.an(var5, "hh.au(" + ')');
      }
   }

   public final it ab(int var1) {
      try {
         it var2 = (it)ac.af((long)(this.au * -190570391));
         if (var2 == null) {
            if (var1 <= Integer.MIN_VALUE) {
               throw new IllegalStateException();
            }

            iz var3 = iz.af(an, this.ab * -170244579, 0);
            if (var3 == null) {
               if (var1 <= Integer.MIN_VALUE) {
                  throw new IllegalStateException();
               }

               return null;
            }

            int var4;
            if (null != this.al) {
               if (var1 <= Integer.MIN_VALUE) {
                  throw new IllegalStateException();
               }

               for(var4 = 0; var4 < this.al.length; ++var4) {
                  if (var1 <= Integer.MIN_VALUE) {
                     throw new IllegalStateException();
                  }

                  var3.as(this.al[var4], this.at[var4]);
               }
            }

            if (this.aa != null) {
               if (var1 <= Integer.MIN_VALUE) {
                  throw new IllegalStateException();
               }

               for(var4 = 0; var4 < this.aa.length; ++var4) {
                  if (var1 <= Integer.MIN_VALUE) {
                     throw new IllegalStateException();
                  }

                  var3.aj(this.aa[var4], this.ay[var4]);
               }
            }

            var2 = var3.bb(this.ag * 742442999 + 64, 850 + this.ah * -138140925, -30, -50, -30);
            ac.aw(var2, (long)(-190570391 * this.au));
         }

         return var2;
      } catch (RuntimeException var5) {
         throw db.an(var5, "hh.ab(" + ')');
      }
   }

   void aw(sg var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (0 == var3) {
               return;
            }

            this.ac(var1, var3, (byte)4);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hh.aw(" + ')');
      }
   }

   public static void al(nm var0, nm var1) {
      af = var0;
      an = var1;
   }

   public final it ah(int var1) {
      it var2 = this.ab(1515185329);
      it var3;
      if (this.aq * 374130911 != -1 && var1 != -1) {
         var3 = dc.an(this.aq * 374130911, (byte)11).al(var2, var1, 11138431);
      } else {
         var3 = var2.ay(true);
      }

      if (128 != -1761247305 * this.ao || 128 != this.ax * -1083521459) {
         var3.bk(-1761247305 * this.ao, this.ax * -1083521459, this.ao * -1761247305);
      }

      if (-906961103 * this.ai != 0) {
         if (this.ai * -906961103 == 90) {
            var3.ap();
         }

         if (this.ai * -906961103 == 180) {
            var3.ap();
            var3.ap();
         }

         if (this.ai * -906961103 == 270) {
            var3.ap();
            var3.ap();
            var3.ap();
         }
      }

      return var3;
   }

   public static hh aa(int var0) {
      hh var1 = (hh)aw.af((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = af.bh(13, var0, (byte)-105);
         var1 = new hh();
         var1.au = var0 * 446010286;
         if (var2 != null) {
            var1.aw(new sg(var2), (byte)26);
         }

         aw.aw(var1, (long)var0);
         return var1;
      }
   }

   void ao(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         this.ac(var1, var2, (byte)115);
      }
   }

   public final it ag(int var1) {
      it var2 = this.ab(-1620276070);
      it var3;
      if (this.aq * 374130911 != -1 && var1 != -1) {
         var3 = dc.an(this.aq * 374130911, (byte)85).al(var2, var1, -1114979702);
      } else {
         var3 = var2.ay(true);
      }

      if (128 != -1761247305 * this.ao || 128 != this.ax * -1083521459) {
         var3.bk(-1761247305 * this.ao, this.ax * -1083521459, this.ao * -1761247305);
      }

      if (-906961103 * this.ai != 0) {
         if (this.ai * -906961103 == 90) {
            var3.ap();
         }

         if (this.ai * -906961103 == 180) {
            var3.ap();
            var3.ap();
         }

         if (this.ai * -906961103 == 270) {
            var3.ap();
            var3.ap();
            var3.ap();
         }
      }

      return var3;
   }

   void ax(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         this.ac(var1, var2, (byte)66);
      }
   }

   void ai(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         this.ac(var1, var2, (byte)72);
      }
   }

   static lg af(byte var0) {
      try {
         if (lg.ab * 380401923 == 0) {
            if (var0 != 0) {
               throw new IllegalStateException();
            } else {
               return new lg();
            }
         } else {
            return lg.au[(lg.ab -= -1882670677) * 380401923];
         }
      } catch (RuntimeException var1) {
         throw db.an(var1, "hh.af(" + ')');
      }
   }

   public static void aq(nm var0, nm var1) {
      af = var0;
      an = var1;
   }

   public static hh ay(int var0) {
      hh var1 = (hh)aw.af((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = af.bh(13, var0, (byte)-80);
         var1 = new hh();
         var1.au = var0 * 903573465;
         if (var2 != null) {
            var1.aw(new sg(var2), (byte)-83);
         }

         aw.aw(var1, (long)var0);
         return var1;
      }
   }

   public final it ar(int var1) {
      it var2 = this.ab(-907584259);
      it var3;
      if (this.aq * 374130911 != -1 && var1 != -1) {
         var3 = dc.an(this.aq * 374130911, (byte)58).al(var2, var1, -976120299);
      } else {
         var3 = var2.ay(true);
      }

      if (128 != -1161812646 * this.ao || 1320847730 != this.ax * -1083521459) {
         var3.bk(-772687482 * this.ao, this.ax * -1083521459, this.ao * -1509503606);
      }

      if (251617364 * this.ai != 0) {
         if (this.ai * -906961103 == 90) {
            var3.ap();
         }

         if (this.ai * -906961103 == 180) {
            var3.ap();
            var3.ap();
         }

         if (this.ai * -906961103 == 275420136) {
            var3.ap();
            var3.ap();
            var3.ap();
         }
      }

      return var3;
   }

   public final it am() {
      it var1 = (it)ac.af((long)(this.au * 779651160));
      if (var1 == null) {
         iz var2 = iz.af(an, this.ab * -1640205174, 0);
         if (var2 == null) {
            return null;
         }

         int var3;
         if (null != this.al) {
            for(var3 = 0; var3 < this.al.length; ++var3) {
               var2.as(this.al[var3], this.at[var3]);
            }
         }

         if (this.aa != null) {
            for(var3 = 0; var3 < this.aa.length; ++var3) {
               var2.aj(this.aa[var3], this.ay[var3]);
            }
         }

         var1 = var2.bb(this.ag * -681541055 + -1666433828, 1811753035 + this.ah * -138140925, 196752769, -50, -730911673);
         ac.aw(var1, (long)(-190570391 * this.au));
      }

      return var1;
   }

   public static void at(nm var0, nm var1) {
      af = var0;
      an = var1;
   }

   public final it av(int var1) {
      it var2 = this.ab(-1560238880);
      it var3;
      if (this.aq * 374130911 != -1 && var1 != -1) {
         var3 = dc.an(this.aq * 374130911, (byte)66).al(var2, var1, -1658298068);
      } else {
         var3 = var2.ay(true);
      }

      if (128 != -1761247305 * this.ao || 128 != this.ax * -1083521459) {
         var3.bk(-1761247305 * this.ao, this.ax * -1083521459, this.ao * -1761247305);
      }

      if (-906961103 * this.ai != 0) {
         if (this.ai * -906961103 == 90) {
            var3.ap();
         }

         if (this.ai * -906961103 == 180) {
            var3.ap();
            var3.ap();
         }

         if (this.ai * -906961103 == 270) {
            var3.ap();
            var3.ap();
            var3.ap();
         }
      }

      return var3;
   }
}
