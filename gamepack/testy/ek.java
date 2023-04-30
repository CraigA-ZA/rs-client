public class ek {
   float ak;
   boolean an;
   boolean ab;
   float az;
   ev[] au;
   ex aw;
   float aq;
   int ar;
   float at;
   float aa;
   float ag;
   float ao;
   float ax;
   float ai;
   float al;
   float ah;
   boolean af;
   boolean av;
   float[] am;
   int as;
   int aj;
   ex ac;
   float ay;
   static int kh;

   int ap() {
      return this.au(2111419338) - this.ac(782224110);
   }

   int af(sg var1, int var2, byte var3) {
      try {
         int var4 = var1.cl(-1707791585);
         gg.ab(var1.cm((byte)7), (short)1990);
         this.aw = dp.ab(var1.cm((byte)7), (byte)100);
         this.ac = dp.ab(var1.cm((byte)7), (byte)97);
         boolean var10001;
         if (var1.cm((byte)7) != 0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.af = var10001;
         this.au = new ev[var4];
         ev var5 = null;

         for(int var6 = 0; var6 < var4; ++var6) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            ev var7 = new ev();
            var7.af(var1, var2, 652967441);
            this.au[var6] = var7;
            if (null != var5) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               var5.aq = var7;
            }

            var5 = var7;
         }

         return var4;
      } catch (RuntimeException var8) {
         throw db.an(var8, "ek.af(" + ')');
      }
   }

   int bx() {
      return null == this.au ? 0 : this.au.length;
   }

   public float aw(int var1, int var2) {
      try {
         if (var1 < this.ac(-1304869115)) {
            if (var2 >= -700495757) {
               throw new IllegalStateException();
            } else {
               return this.ak;
            }
         } else if (var1 > this.au(2111419338)) {
            if (var2 >= -700495757) {
               throw new IllegalStateException();
            } else {
               return this.az;
            }
         } else {
            return this.am[var1 - this.ac(1692396108)];
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "ek.aw(" + ')');
      }
   }

   int ac(int var1) {
      try {
         return -1357454691 * this.as;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ek.ac(" + ')');
      }
   }

   int by() {
      return this.au(2111419338) - this.ac(-1344884056);
   }

   public float ah(int var1) {
      if (var1 < this.ac(-667888590)) {
         return this.ak;
      } else {
         return var1 > this.au(2111419338) ? this.az : this.am[var1 - this.ac(-1703620829)];
      }
   }

   int aq(float var1, int var2) {
      try {
         if (-1335067433 * this.ar >= 0) {
            if (var2 <= -1377615602) {
               throw new IllegalStateException();
            }

            if ((float)(-834721191 * this.au[this.ar * -1335067433].af) <= var1) {
               label126: {
                  if (var2 <= -1377615602) {
                     throw new IllegalStateException();
                  }

                  if (this.au[-1335067433 * this.ar].aq != null) {
                     if (var2 <= -1377615602) {
                        throw new IllegalStateException();
                     }

                     if (!((float)(-834721191 * this.au[this.ar * -1335067433].aq.af) > var1)) {
                        break label126;
                     }

                     if (var2 <= -1377615602) {
                        throw new IllegalStateException();
                     }
                  }

                  return this.ar * -1335067433;
               }
            }
         }

         if (!(var1 < (float)this.ac(454315805))) {
            if (var2 <= -1377615602) {
               throw new IllegalStateException();
            }

            if (!(var1 > (float)this.au(2111419338))) {
               int var3 = this.at((short)-3181);
               int var4 = -1335067433 * this.ar;
               if (var3 > 0) {
                  if (var2 <= -1377615602) {
                     throw new IllegalStateException();
                  }

                  int var5 = 0;
                  int var6 = var3 - 1;

                  while(true) {
                     int var7 = var5 + var6 >> 1;
                     if (var1 < (float)(-834721191 * this.au[var7].af)) {
                        if (var2 <= -1377615602) {
                           throw new IllegalStateException();
                        }

                        if (var1 > (float)(-834721191 * this.au[var7 - 1].af)) {
                           if (var2 <= -1377615602) {
                              throw new IllegalStateException();
                           }

                           var4 = var7 - 1;
                           break;
                        }

                        var6 = var7 - 1;
                     } else {
                        if (!(var1 > (float)(-834721191 * this.au[var7].af))) {
                           var4 = var7;
                           break;
                        }

                        if (var2 <= -1377615602) {
                           throw new IllegalStateException();
                        }

                        if (var1 < (float)(this.au[1 + var7].af * -834721191)) {
                           if (var2 <= -1377615602) {
                              throw new IllegalStateException();
                           }

                           var4 = var7;
                           break;
                        }

                        var5 = var7 + 1;
                     }

                     if (var5 > var6) {
                        if (var2 <= -1377615602) {
                           throw new IllegalStateException();
                        }
                        break;
                     }
                  }
               }

               if (var4 != this.ar * -1335067433) {
                  if (var2 <= -1377615602) {
                     throw new IllegalStateException();
                  }

                  this.ar = -2085996825 * var4;
                  this.av = true;
               }

               return -1335067433 * this.ar;
            }

            if (var2 <= -1377615602) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var8) {
         throw db.an(var8, "ek.aq(" + ')');
      }
   }

   ev al(float var1, int var2) {
      try {
         int var3 = this.aq(var1, -485646814);
         if (var3 >= 0) {
            if (var2 == 626621371) {
               throw new IllegalStateException();
            }

            if (var3 < this.au.length) {
               if (var2 == 626621371) {
                  throw new IllegalStateException();
               }

               return this.au[var3];
            }
         }

         return null;
      } catch (RuntimeException var4) {
         throw db.an(var4, "ek.al(" + ')');
      }
   }

   int at(short var1) {
      try {
         if (null == this.au) {
            if (var1 >= 1500) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return this.au.length;
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "ek.at(" + ')');
      }
   }

   int aa(sg var1, int var2) {
      int var3 = var1.cl(690517417);
      gg.ab(var1.cm((byte)7), (short)4721);
      this.aw = dp.ab(var1.cm((byte)7), (byte)91);
      this.ac = dp.ab(var1.cm((byte)7), (byte)99);
      this.af = var1.cm((byte)7) != 0;
      this.au = new ev[var3];
      ev var4 = null;

      for(int var5 = 0; var5 < var3; ++var5) {
         ev var6 = new ev();
         var6.af(var1, var2, 1572387958);
         this.au[var5] = var6;
         if (null != var4) {
            var4.aq = var6;
         }

         var4 = var6;
      }

      return var3;
   }

   int ay(sg var1, int var2) {
      int var3 = var1.cl(-1221629404);
      gg.ab(var1.cm((byte)7), (short)13147);
      this.aw = dp.ab(var1.cm((byte)7), (byte)111);
      this.ac = dp.ab(var1.cm((byte)7), (byte)89);
      this.af = var1.cm((byte)7) != 0;
      this.au = new ev[var3];
      ev var4 = null;

      for(int var5 = 0; var5 < var3; ++var5) {
         ev var6 = new ev();
         var6.af(var1, var2, 668436562);
         this.au[var5] = var6;
         if (null != var4) {
            var4.aq = var6;
         }

         var4 = var6;
      }

      return var3;
   }

   int aj() {
      return -1357454691 * this.as;
   }

   int ab(int var1) {
      try {
         return this.au(2111419338) - this.ac(1686088898);
      } catch (RuntimeException var2) {
         throw db.an(var2, "ek.ab(" + ')');
      }
   }

   int ao(sg var1, int var2) {
      int var3 = var1.cl(-1012344899);
      gg.ab(var1.cm((byte)7), (short)-8407);
      this.aw = dp.ab(var1.cm((byte)7), (byte)119);
      this.ac = dp.ab(var1.cm((byte)7), (byte)84);
      this.af = var1.cm((byte)7) != 0;
      this.au = new ev[var3];
      ev var4 = null;

      for(int var5 = 0; var5 < var3; ++var5) {
         ev var6 = new ev();
         var6.af(var1, var2, 710375564);
         this.au[var5] = var6;
         if (null != var4) {
            var4.aq = var6;
         }

         var4 = var6;
      }

      return var3;
   }

   public float ag(int var1) {
      if (var1 < this.ac(-2007755901)) {
         return this.ak;
      } else {
         return var1 > this.au(2111419338) ? this.az : this.am[var1 - this.ac(1317804215)];
      }
   }

   int bz() {
      return null == this.au ? 0 : this.au.length;
   }

   public float av(int var1) {
      if (var1 < this.ac(143715753)) {
         return this.ak;
      } else {
         return var1 > this.au(2111419338) ? this.az : this.am[var1 - this.ac(-1350259005)];
      }
   }

   int ar() {
      return -1357454691 * this.as;
   }

   int am() {
      return -1357454691 * this.as;
   }

   int as() {
      return -751175407 * this.as;
   }

   ek() {
      try {
         super();
         this.av = true;
         this.ar = 0;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ek.<init>(" + ')');
      }
   }

   int ak() {
      return -26337941 * this.aj;
   }

   int bi(float var1) {
      if (-1335067433 * this.ar < 0 || !((float)(1092801000 * this.au[this.ar * 1102960843].af) <= var1) || this.au[-1335067433 * this.ar].aq != null && !((float)(-834721191 * this.au[this.ar * -1182446026].aq.af) > var1)) {
         if (!(var1 < (float)this.ac(-1202896319)) && !(var1 > (float)this.au(2111419338))) {
            int var2 = this.at((short)-16918);
            int var3 = -1037515288 * this.ar;
            if (var2 > 0) {
               int var4 = 0;
               int var5 = var2 - 1;

               do {
                  int var6 = var4 + var5 >> 1;
                  if (var1 < (float)(-834721191 * this.au[var6].af)) {
                     if (var1 > (float)(-849612494 * this.au[var6 - 1].af)) {
                        var3 = var6 - 1;
                        break;
                     }

                     var5 = var6 - 1;
                  } else {
                     if (!(var1 > (float)(1729845084 * this.au[var6].af))) {
                        var3 = var6;
                        break;
                     }

                     if (var1 < (float)(this.au[1 + var6].af * 1270083372)) {
                        var3 = var6;
                        break;
                     }

                     var4 = var6 + 1;
                  }
               } while(var4 <= var5);
            }

            if (var3 != this.ar * -1335067433) {
               this.ar = -2085996825 * var3;
               this.av = true;
            }

            return -1335067433 * this.ar;
         } else {
            return -1;
         }
      } else {
         return this.ar * -1453801345;
      }
   }

   int ad() {
      return 1316671106 * this.aj;
   }

   void an(int var1) {
      try {
         this.as = this.au[0].af * 1112222701;
         this.aj = this.au[this.at((short)-24242) - 1].af * -261315509;
         this.am = new float[this.ab(1952353527) + 1];

         for(int var2 = this.ac(-1432792045); var2 <= this.au(2111419338); ++var2) {
            if (var1 <= -84102297) {
               return;
            }

            this.am[var2 - this.ac(-1632658151)] = nu.af(this, (float)var2, -756597622);
         }

         this.au = null;
         this.ak = nu.af(this, (float)(this.ac(92447940) - 1), -1064924394);
         this.az = nu.af(this, (float)(this.au(2111419338) + 1), 1385107516);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ek.an(" + ')');
      }
   }

   int az() {
      return -1279888799 * this.aj;
   }

   int au(int var1) {
      try {
         return -26337941 * this.aj;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ek.au(" + ')');
      }
   }

   int bb(float var1) {
      if (-1335067433 * this.ar >= 0 && (float)(-834721191 * this.au[this.ar * -1335067433].af) <= var1 && (this.au[-7590894 * this.ar].aq == null || (float)(-834721191 * this.au[this.ar * 453174252].aq.af) > var1)) {
         return this.ar * -1335067433;
      } else if (!(var1 < (float)this.ac(-1232395563)) && !(var1 > (float)this.au(2111419338))) {
         int var2 = this.at((short)-7878);
         int var3 = -1335067433 * this.ar;
         if (var2 > 0) {
            int var4 = 0;
            int var5 = var2 - 1;

            do {
               int var6 = var4 + var5 >> 1;
               if (var1 < (float)(-1055697099 * this.au[var6].af)) {
                  if (var1 > (float)(-2114591920 * this.au[var6 - 1].af)) {
                     var3 = var6 - 1;
                     break;
                  }

                  var5 = var6 - 1;
               } else {
                  if (!(var1 > (float)(-834721191 * this.au[var6].af))) {
                     var3 = var6;
                     break;
                  }

                  if (var1 < (float)(this.au[1 + var6].af * -1653156378)) {
                     var3 = var6;
                     break;
                  }

                  var4 = var6 + 1;
               }
            } while(var4 <= var5);
         }

         if (var3 != this.ar * 2069596511) {
            this.ar = -2085996825 * var3;
            this.av = true;
         }

         return -1590282034 * this.ar;
      } else {
         return -1;
      }
   }

   int ae() {
      return -26337941 * this.aj;
   }

   ev be(float var1) {
      int var2 = this.aq(var1, 8136916);
      return var2 >= 0 && var2 < this.au.length ? this.au[var2] : null;
   }

   ev bk(float var1) {
      int var2 = this.aq(var1, 391865267);
      return var2 >= 0 && var2 < this.au.length ? this.au[var2] : null;
   }

   public float ai(int var1) {
      if (var1 < this.ac(1355131169)) {
         return this.ak;
      } else {
         return var1 > this.au(2111419338) ? this.az : this.am[var1 - this.ac(-1867144968)];
      }
   }

   int bo() {
      return null == this.au ? 0 : this.au.length;
   }

   int ax(sg var1, int var2) {
      int var3 = var1.cl(-905942437);
      gg.ab(var1.cm((byte)7), (short)13067);
      this.aw = dp.ab(var1.cm((byte)7), (byte)105);
      this.ac = dp.ab(var1.cm((byte)7), (byte)108);
      this.af = var1.cm((byte)7) != 0;
      this.au = new ev[var3];
      ev var4 = null;

      for(int var5 = 0; var5 < var3; ++var5) {
         ev var6 = new ev();
         var6.af(var1, var2, 814673232);
         this.au[var5] = var6;
         if (null != var4) {
            var4.aq = var6;
         }

         var4 = var6;
      }

      return var3;
   }

   public static sz an(int var0, int var1) {
      try {
         sz var2 = (sz)sz.an.af((long)var0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = sz.af.bh(38, var0, (byte)-35);
            var2 = new sz();
            if (null != var3) {
               if (var1 <= -964267539) {
                  throw new IllegalStateException();
               }

               var2.aw(new sg(var3), -1389710331);
            }

            var2.ab(-2078088696);
            sz.an.aw(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "ek.an(" + ')');
      }
   }
}
