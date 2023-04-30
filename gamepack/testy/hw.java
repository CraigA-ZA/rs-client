import accessors.RSMapElementType;

public class hw extends rk implements RSMapElementType {
   int[] ah;
   static hw[] an;
   static kh ac = new kh(256);
   public final int au;
   public int at;
   int aq;
   public String al;
   public String[] ai;
   public int aa;
   static final int ay = 0;
   public boolean ao;
   int ar;
   public boolean ax;
   public hn ak;
   public String ag;
   public int ab;
   static nm af;
   int am;
   int as;
   public hd aj;
   int av;
   int[] az;
   byte[] ad;
   public int ae;
   static int uv;

   public int ak() {
      return this.au * 219774827;
   }

   void aw(sg var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (var3 == 0) {
               return;
            }

            this.ac(var1, var3, 1073520708);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hw.aw(" + ')');
      }
   }

   void ag(sg var1, int var2) {
      if (var2 == 1) {
         this.ab = var1.do(549622661) * -771758991;
      } else if (var2 == 2) {
         this.aq = var1.do(696975810) * 1486786935;
      } else if (var2 == 3) {
         this.al = var1.cw((byte)0);
      } else if (var2 == 4) {
         this.at = var1.cr(-775187784) * 578146139;
      } else if (var2 == 5) {
         var1.cr(1952843278);
      } else if (6 == var2) {
         this.aa = var1.cm((byte)7) * 485929563;
      } else {
         int var3;
         if (7 == var2) {
            var3 = var1.cm((byte)7);
            if ((var3 & 1) == 0) {
               this.ao = false;
            }

            if ((var3 & 2) == 2) {
               this.ax = true;
            }
         } else if (8 == var2) {
            var1.cm((byte)7);
         } else if (var2 >= 10 && var2 <= 14) {
            this.ai[var2 - 10] = var1.cw((byte)0);
         } else if (var2 == 15) {
            var3 = var1.cm((byte)7);
            this.ah = new int[2 * var3];

            int var4;
            for(var4 = 0; var4 < 2 * var3; ++var4) {
               this.ah[var4] = var1.cg((byte)-58);
            }

            var1.cx(-2103697005);
            var4 = var1.cm((byte)7);
            this.az = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.az.length; ++var5) {
               this.az[var5] = var1.cx(-1945807398);
            }

            this.ad = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.ad[var5] = var1.cf(435772489);
            }
         } else if (16 != var2) {
            if (17 == var2) {
               this.ag = var1.cw((byte)0);
            } else if (18 == var2) {
               var1.do(1995269976);
            } else if (19 == var2) {
               this.ae = var1.cl(320886332) * -627392423;
            } else if (var2 == 21) {
               var1.cx(-985220343);
            } else if (22 == var2) {
               var1.cx(-1988467718);
            } else if (23 == var2) {
               var1.cm((byte)7);
               var1.cm((byte)7);
               var1.cm((byte)7);
            } else if (var2 == 24) {
               var1.cg((byte)-22);
               var1.cg((byte)-2);
            } else if (25 == var2) {
               var1.do(1345373408);
            } else if (var2 == 28) {
               var1.cm((byte)7);
            } else if (29 == var2) {
               this.aj = (hd)ht.af(su.au((byte)-45), var1.cm((byte)7), (short)173);
            } else if (30 == var2) {
               hn[] var6 = new hn[]{hn.aw, hn.an, hn.af};
               this.ak = (hn)ht.af(var6, var1.cm((byte)7), (short)173);
            }
         }
      }

   }

   void au(int var1) {
      try {
         if (this.ah != null) {
            if (var1 != 262144) {
               throw new IllegalStateException();
            }

            for(int var2 = 0; var2 < this.ah.length; var2 += 2) {
               if (this.ah[var2] < 2140325741 * this.av) {
                  if (var1 != 262144) {
                     throw new IllegalStateException();
                  }

                  this.av = this.ah[var2] * -251176347;
               } else if (this.ah[var2] > this.am * -1897586587) {
                  if (var1 != 262144) {
                     throw new IllegalStateException();
                  }

                  this.am = this.ah[var2] * -281505427;
               }

               if (this.ah[var2 + 1] < this.ar * -1117233973) {
                  if (var1 != 262144) {
                     throw new IllegalStateException();
                  }

                  this.ar = this.ah[var2 + 1] * -517855005;
               } else if (this.ah[var2 + 1] > -2068879661 * this.as) {
                  if (var1 != 262144) {
                     throw new IllegalStateException();
                  }

                  this.as = this.ah[var2 + 1] * -1539448485;
               }
            }
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "hw.au(" + ')');
      }
   }

   public tq ab(boolean var1, int var2) {
      try {
         int var10000;
         if (var1) {
            if (var2 != -16711936) {
               throw new IllegalStateException();
            }

            var10000 = this.aq * 2035390535;
         } else {
            var10000 = 1458003089 * this.ab;
         }

         int var3 = var10000;
         return this.aq(var3, 685104861);
      } catch (RuntimeException var4) {
         throw db.an(var4, "hw.ab(" + ')');
      }
   }

   hw(int var1) {
      try {
         super();
         this.ab = 771758991;
         this.aq = -1486786935;
         this.aa = 0;
         this.ao = true;
         this.ax = false;
         this.ai = new String[5];
         this.av = -1896307301;
         this.ar = -1629628643;
         this.am = Integer.MIN_VALUE;
         this.as = Integer.MIN_VALUE;
         this.aj = hd.an;
         this.ak = hn.an;
         this.ae = 627392423;
         this.au = -1846037181 * var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "hw.<init>(" + ')');
      }
   }

   public int al(int var1) {
      try {
         return this.au * 219774827;
      } catch (RuntimeException var2) {
         throw db.an(var2, "hw.al(" + ')');
      }
   }

   static final void ia(byte var0) {
      try {
         if (dc.sv) {
            if (var0 != 1) {
               throw new IllegalStateException();
            }

            for(int var1 = 0; var1 < -2010934433 * ds.ab; ++var1) {
               dv var2 = client.mc[ds.aq[var1]];
               var2.ai(453146982);
            }

            dc.sv = false;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "hw.ia(" + ')');
      }
   }

   public static boolean aa(nm var0, nm var1) {
      af = var1;
      if (!var0.cc((short)128)) {
         return false;
      } else {
         mo.aw = var0.cq(35, (byte)40) * 827991417;
         an = new hw[mo.aw * -1703136055];

         for(int var2 = 0; var2 < mo.aw * -1703136055; ++var2) {
            byte[] var3 = var0.bh(35, var2, (byte)-28);
            an[var2] = new hw(var2);
            if (var3 != null) {
               an[var2].aw(new sg(var3), -1056093346);
               an[var2].au(262144);
            }
         }

         return true;
      }
   }

   public static hw ay(int var0) {
      return var0 >= 0 && var0 < an.length && an[var0] != null ? an[var0] : new hw(var0);
   }

   public static hw ao(int var0) {
      return var0 >= 0 && var0 < an.length && an[var0] != null ? an[var0] : new hw(var0);
   }

   void ax(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.ac(var1, var2, 2070639109);
      }
   }

   void ai(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.ac(var1, var2, 1522254283);
      }
   }

   public static void ae() {
      ac.ac();
   }

   void ah() {
      if (this.ah != null) {
         for(int var1 = 0; var1 < this.ah.length; var1 += 2) {
            if (this.ah[var1] < 2140325741 * this.av) {
               this.av = this.ah[var1] * -251176347;
            } else if (this.ah[var1] > this.am * -1897586587) {
               this.am = this.ah[var1] * -281505427;
            }

            if (this.ah[var1 + 1] < this.ar * -1117233973) {
               this.ar = this.ah[var1 + 1] * -517855005;
            } else if (this.ah[var1 + 1] > -2068879661 * this.as) {
               this.as = this.ah[var1 + 1] * -1539448485;
            }
         }
      }

   }

   void av() {
      if (this.ah != null) {
         for(int var1 = 0; var1 < this.ah.length; var1 += 2) {
            if (this.ah[var1] < 2140325741 * this.av) {
               this.av = this.ah[var1] * -251176347;
            } else if (this.ah[var1] > this.am * -1897586587) {
               this.am = this.ah[var1] * -281505427;
            }

            if (this.ah[var1 + 1] < this.ar * -1117233973) {
               this.ar = this.ah[var1 + 1] * -517855005;
            } else if (this.ah[var1 + 1] > -2068879661 * this.as) {
               this.as = this.ah[var1 + 1] * -1539448485;
            }
         }
      }

   }

   void ar() {
      if (this.ah != null) {
         for(int var1 = 0; var1 < this.ah.length; var1 += 2) {
            if (this.ah[var1] < 2140325741 * this.av) {
               this.av = this.ah[var1] * -787885789;
            } else if (this.ah[var1] > this.am * -1897586587) {
               this.am = this.ah[var1] * -281505427;
            }

            if (this.ah[var1 + 1] < this.ar * -1117233973) {
               this.ar = this.ah[var1 + 1] * -517855005;
            } else if (this.ah[var1 + 1] > -2068879661 * this.as) {
               this.as = this.ah[var1 + 1] * -1539448485;
            }
         }
      }

   }

   public tq am(boolean var1) {
      int var2 = var1 ? this.aq * 2035390535 : 1458003089 * this.ab;
      return this.aq(var2, 685104861);
   }

   tq as(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         tq var2 = (tq)ac.af((long)var1);
         if (null != var2) {
            return var2;
         } else {
            var2 = sc.aw(af, var1, 0, -1965970692);
            if (null != var2) {
               ac.aw(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   tq aj(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         tq var2 = (tq)ac.af((long)var1);
         if (null != var2) {
            return var2;
         } else {
            var2 = sc.aw(af, var1, 0, 1829126473);
            if (null != var2) {
               ac.aw(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   public int az() {
      return this.au * 219774827;
   }

   tq aq(int var1, int var2) {
      try {
         if (var1 < 0) {
            if (var2 != 685104861) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            tq var3 = (tq)ac.af((long)var1);
            if (null != var3) {
               if (var2 != 685104861) {
                  throw new IllegalStateException();
               } else {
                  return var3;
               }
            } else {
               var3 = sc.aw(af, var1, 0, -420746264);
               if (null != var3) {
                  ac.aw(var3, (long)var1);
               }

               return var3;
            }
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "hw.aq(" + ')');
      }
   }

   public static void ad() {
      ac.ac();
   }

   void ac(sg var1, int var2, int var3) {
      try {
         if (var2 == 1) {
            if (var3 == 1750672475) {
               throw new IllegalStateException();
            }

            this.ab = var1.do(422350142) * -771758991;
         } else if (var2 == 2) {
            if (var3 == 1750672475) {
               return;
            }

            this.aq = var1.do(478002223) * 1486786935;
         } else if (var2 == 3) {
            this.al = var1.cw((byte)0);
         } else if (var2 == 4) {
            if (var3 == 1750672475) {
               return;
            }

            this.at = var1.cr(990802201) * 578146139;
         } else if (var2 == 5) {
            var1.cr(-836391510);
         } else if (6 == var2) {
            if (var3 == 1750672475) {
               return;
            }

            this.aa = var1.cm((byte)7) * 485929563;
         } else {
            int var4;
            if (7 == var2) {
               var4 = var1.cm((byte)7);
               if ((var4 & 1) == 0) {
                  if (var3 == 1750672475) {
                     return;
                  }

                  this.ao = false;
               }

               if ((var4 & 2) == 2) {
                  if (var3 == 1750672475) {
                     return;
                  }

                  this.ax = true;
               }
            } else if (8 == var2) {
               var1.cm((byte)7);
            } else {
               if (var2 >= 10) {
                  if (var3 == 1750672475) {
                     return;
                  }

                  if (var2 <= 14) {
                     this.ai[var2 - 10] = var1.cw((byte)0);
                     return;
                  }
               }

               if (var2 == 15) {
                  if (var3 == 1750672475) {
                     throw new IllegalStateException();
                  }

                  var4 = var1.cm((byte)7);
                  this.ah = new int[2 * var4];

                  int var5;
                  for(var5 = 0; var5 < 2 * var4; ++var5) {
                     if (var3 == 1750672475) {
                        return;
                     }

                     this.ah[var5] = var1.cg((byte)-119);
                  }

                  var1.cx(-1978085384);
                  var5 = var1.cm((byte)7);
                  this.az = new int[var5];

                  int var6;
                  for(var6 = 0; var6 < this.az.length; ++var6) {
                     if (var3 == 1750672475) {
                        throw new IllegalStateException();
                     }

                     this.az[var6] = var1.cx(-1896571749);
                  }

                  this.ad = new byte[var4];

                  for(var6 = 0; var6 < var4; ++var6) {
                     if (var3 == 1750672475) {
                        throw new IllegalStateException();
                     }

                     this.ad[var6] = var1.cf(435772489);
                  }
               } else if (16 == var2) {
                  if (var3 == 1750672475) {
                     throw new IllegalStateException();
                  }
               } else if (17 == var2) {
                  this.ag = var1.cw((byte)0);
               } else if (18 == var2) {
                  if (var3 == 1750672475) {
                     throw new IllegalStateException();
                  }

                  var1.do(-66916527);
               } else if (19 == var2) {
                  this.ae = var1.cl(-1959309969) * -627392423;
               } else if (var2 == 21) {
                  if (var3 == 1750672475) {
                     throw new IllegalStateException();
                  }

                  var1.cx(-1819704685);
               } else if (22 == var2) {
                  if (var3 == 1750672475) {
                     throw new IllegalStateException();
                  }

                  var1.cx(-1240763908);
               } else if (23 == var2) {
                  if (var3 == 1750672475) {
                     throw new IllegalStateException();
                  }

                  var1.cm((byte)7);
                  var1.cm((byte)7);
                  var1.cm((byte)7);
               } else if (var2 == 24) {
                  if (var3 == 1750672475) {
                     throw new IllegalStateException();
                  }

                  var1.cg((byte)-47);
                  var1.cg((byte)-12);
               } else if (25 == var2) {
                  if (var3 == 1750672475) {
                     throw new IllegalStateException();
                  }

                  var1.do(2129948577);
               } else if (var2 == 28) {
                  if (var3 == 1750672475) {
                     throw new IllegalStateException();
                  }

                  var1.cm((byte)7);
               } else if (29 == var2) {
                  this.aj = (hd)ht.af(su.au((byte)-126), var1.cm((byte)7), (short)173);
               } else if (30 == var2) {
                  if (var3 == 1750672475) {
                     throw new IllegalStateException();
                  }

                  hn[] var8 = new hn[]{hn.aw, hn.an, hn.af};
                  this.ak = (hn)ht.af(var8, var1.cm((byte)7), (short)173);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "hw.ac(" + ')');
      }
   }
}
