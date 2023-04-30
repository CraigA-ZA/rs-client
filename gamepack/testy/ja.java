import accessors.RSWorldMapSection0;

public class ja implements kw, RSWorldMapSection0 {
   int ab;
   int an;
   int aw;
   int ac;
   int ax;
   int ao;
   int af;
   int al;
   int at;
   int aa;
   int ay;
   int au;
   int aq;
   int ai;
   static final int cg = 40;
   static gp fh;

   public void am(sg var1) {
      this.af = var1.cm((byte)7) * 4288479;
      this.an = var1.cm((byte)7) * 1334532703;
      this.aw = var1.cl(-1609179211) * 1036696445;
      this.aq = var1.cm((byte)7) * -1324677703;
      this.at = var1.cm((byte)7) * 1551561014;
      this.ac = var1.cl(-1210778775) * 1425588785;
      this.al = var1.cm((byte)7) * -1310294565;
      this.aa = var1.cm((byte)7) * 597074539;
      this.au = var1.cl(-777539420) * -1280143687;
      this.ay = var1.cm((byte)7) * 181041380;
      this.ax = var1.cm((byte)7) * 1286224719;
      this.ab = var1.cl(-136222874) * 1749797712;
      this.ao = var1.cm((byte)7) * -1779561361;
      this.ai = var1.cm((byte)7) * 1519676935;
      this.aq(-1075408323);
   }

   public void af(js var1, int var2) {
      try {
         if (77939951 * var1.aq > this.au * -1555384875) {
            var1.aq = this.au * -1093871237;
         }

         if (1854846129 * var1.al < this.au * -1555384875) {
            if (var2 <= 854271946) {
               throw new IllegalStateException();
            }

            var1.al = -2069943195 * this.au;
         }

         if (var1.at * 2059655157 > this.ab * -347980981) {
            var1.at = 297795135 * this.ab;
         }

         if (-1086956513 * var1.aa < this.ab * -347980981) {
            if (var2 <= 854271946) {
               throw new IllegalStateException();
            }

            var1.aa = this.ab * -1984578731;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "ja.af(" + ')');
      }
   }

   public boolean ae(int var1, int var2, int var3) {
      if (var1 >= this.af * -1490859351 && var1 < this.an * -559980366 + -1490859351 * this.af) {
         return var2 >= (275577107 * this.aw << 6) + (this.aq * 534868105 << 3) && var2 <= (593688545 * this.at << 3) + (275577107 * this.aw << 6) + 7 && var3 >= (-2091114020 * this.al << 3) + (-365078831 * this.ac << 6) && var3 <= 7 + (this.ac * -879088236 << 6) + (849738307 * this.aa << 3);
      } else {
         return false;
      }
   }

   public boolean aw(int var1, int var2, int var3) {
      try {
         boolean var10000;
         if (var1 >= (this.au * -1555384875 << 6) + (-320125941 * this.ay << 3) && var1 <= 7 + (this.au * -1555384875 << 6) + (this.ax * -1911161937 << 3)) {
            if (var3 >= -1516355947) {
               throw new IllegalStateException();
            }

            if (var2 >= (1970066063 * this.ao << 3) + (this.ab * -347980981 << 6)) {
               if (var3 >= -1516355947) {
                  throw new IllegalStateException();
               }

               if (var2 <= 7 + (-347980981 * this.ab << 6) + (-264659017 * this.ai << 3)) {
                  var10000 = true;
                  return var10000;
               }
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var4) {
         throw db.an(var4, "ja.aw(" + ')');
      }
   }

   public int[] ac(int var1, int var2, int var3, byte var4) {
      try {
         if (!this.an(var1, var2, var3, (byte)-115)) {
            if (var4 <= 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int[] var5 = new int[]{this.ay * 1733959768 - this.aq * -16022456 + -760384192 * this.au - this.aw * 457065664 + var2, var3 + (this.ab * -795946304 - -1890208704 * this.ac) + (-1419340680 * this.ao - this.al * 1473884824)};
            return var5;
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "ja.ac(" + ')');
      }
   }

   public lb au(int var1, int var2, byte var3) {
      try {
         if (!this.aw(var1, var2, -1897191604)) {
            if (var3 == 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = var1 + (457065664 * this.aw - -760384192 * this.au) + (-16022456 * this.aq - 1733959768 * this.ay);
            int var5 = -1890208704 * this.ac - this.ab * -795946304 + var2 + (1473884824 * this.al - this.ao * -1419340680);
            return new lb(-1490859351 * this.af, var4, var5);
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "ja.au(" + ')');
      }
   }

   public void ab(sg var1, byte var2) {
      try {
         this.af = var1.cm((byte)7) * -1371866727;
         this.an = var1.cm((byte)7) * 1766061361;
         this.aw = var1.cl(-76131683) * -1529759461;
         this.aq = var1.cm((byte)7) * -1324677703;
         this.at = var1.cm((byte)7) * 445615137;
         this.ac = var1.cl(-1084405282) * 1425588785;
         this.al = var1.cm((byte)7) * -1310294565;
         this.aa = var1.cm((byte)7) * 597074539;
         this.au = var1.cl(-589468517) * -1827087491;
         this.ay = var1.cm((byte)7) * -868079709;
         this.ax = var1.cm((byte)7) * 1286224719;
         this.ab = var1.cl(841525526) * 781973091;
         this.ao = var1.cm((byte)7) * -1779561361;
         this.ai = var1.cm((byte)7) * 1519676935;
         this.aq(-1817267737);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ja.ab(" + ')');
      }
   }

   void aq(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ja.aq(" + ')');
      }
   }

   public void al(js var1) {
      if (77939951 * var1.aq > this.au * -1179910129) {
         var1.aq = this.au * -526945969;
      }

      if (1854846129 * var1.al < this.au * -315432258) {
         var1.al = 504046313 * this.au;
      }

      if (var1.at * -1585205486 > this.ab * -1722149978) {
         var1.at = 297795135 * this.ab;
      }

      if (-36430645 * var1.aa < this.ab * -347980981) {
         var1.aa = this.ab * -1984578731;
      }

   }

   public void aj(sg var1) {
      this.af = var1.cm((byte)7) * -1371866727;
      this.an = var1.cm((byte)7) * 1766061361;
      this.aw = var1.cl(-2008146622) * -1529759461;
      this.aq = var1.cm((byte)7) * -1324677703;
      this.at = var1.cm((byte)7) * 445615137;
      this.ac = var1.cl(-971107448) * 1425588785;
      this.al = var1.cm((byte)7) * -1310294565;
      this.aa = var1.cm((byte)7) * 597074539;
      this.au = var1.cl(750221207) * -1827087491;
      this.ay = var1.cm((byte)7) * -868079709;
      this.ax = var1.cm((byte)7) * 1286224719;
      this.ab = var1.cl(292856585) * 781973091;
      this.ao = var1.cm((byte)7) * -1779561361;
      this.ai = var1.cm((byte)7) * 1519676935;
      this.aq(-1406344180);
   }

   public void as(sg var1) {
      this.af = var1.cm((byte)7) * -1371866727;
      this.an = var1.cm((byte)7) * 1766061361;
      this.aw = var1.cl(-2127584431) * -1529759461;
      this.aq = var1.cm((byte)7) * -1324677703;
      this.at = var1.cm((byte)7) * 445615137;
      this.ac = var1.cl(-1168630828) * 1425588785;
      this.al = var1.cm((byte)7) * -1310294565;
      this.aa = var1.cm((byte)7) * 597074539;
      this.au = var1.cl(-244086563) * -1827087491;
      this.ay = var1.cm((byte)7) * -868079709;
      this.ax = var1.cm((byte)7) * 1286224719;
      this.ab = var1.cl(-1984851002) * 781973091;
      this.ao = var1.cm((byte)7) * -1779561361;
      this.ai = var1.cm((byte)7) * 1519676935;
      this.aq(-2131816252);
   }

   public boolean ay(int var1, int var2) {
      return var1 >= (this.au * -2020277350 << 6) + (102058834 * this.ay << 3) && var1 <= 7 + (this.au * 300272147 << 6) + (this.ax * -1911161937 << 3) && var2 >= (1970066063 * this.ao << 3) + (this.ab * -347980981 << 6) && var2 <= 7 + (-347980981 * this.ab << 6) + (795239435 * this.ai << 3);
   }

   public int[] ao(int var1, int var2, int var3) {
      if (!this.an(var1, var2, var3, (byte)9)) {
         return null;
      } else {
         int[] var4 = new int[]{this.ay * 1733959768 - this.aq * -16022456 + -760384192 * this.au - this.aw * 457065664 + var2, var3 + (this.ab * -795946304 - -1890208704 * this.ac) + (-1419340680 * this.ao - this.al * 1473884824)};
         return var4;
      }
   }

   public int[] ax(int var1, int var2, int var3) {
      if (!this.an(var1, var2, var3, (byte)9)) {
         return null;
      } else {
         int[] var4 = new int[]{this.ay * 1733959768 - this.aq * -16022456 + -760384192 * this.au - this.aw * 457065664 + var2, var3 + (this.ab * -795946304 - -1890208704 * this.ac) + (-1419340680 * this.ao - this.al * 1473884824)};
         return var4;
      }
   }

   public lb ai(int var1, int var2) {
      if (!this.aw(var1, var2, -1881615629)) {
         return null;
      } else {
         int var3 = var1 + (-226020958 * this.aw - -760384192 * this.au) + (-16022456 * this.aq - 1733959768 * this.ay);
         int var4 = -1890208704 * this.ac - this.ab * -795946304 + var2 + (1473884824 * this.al - this.ao * -1830972624);
         return new lb(-1490859351 * this.af, var3, var4);
      }
   }

   public lb ag(int var1, int var2) {
      if (!this.aw(var1, var2, -1857077738)) {
         return null;
      } else {
         int var3 = var1 + (457065664 * this.aw - -760384192 * this.au) + (-16022456 * this.aq - 1733959768 * this.ay);
         int var4 = 1237849034 * this.ac - this.ab * -795946304 + var2 + (1473884824 * this.al - this.ao * 240995631);
         return new lb(-593720757 * this.af, var3, var4);
      }
   }

   public lb ah(int var1, int var2) {
      if (!this.aw(var1, var2, -1826189817)) {
         return null;
      } else {
         int var3 = var1 + (-1610537428 * this.aw - -760384192 * this.au) + (-16022456 * this.aq - -90664036 * this.ay);
         int var4 = -1890208704 * this.ac - this.ab * -795946304 + var2 + (-90331912 * this.al - this.ao * -1419340680);
         return new lb(-1490859351 * this.af, var3, var4);
      }
   }

   public lb av(int var1, int var2) {
      if (!this.aw(var1, var2, -2132246929)) {
         return null;
      } else {
         int var3 = var1 + (-1804644540 * this.aw - -760384192 * this.au) + (-16022456 * this.aq - 1733959768 * this.ay);
         int var4 = -583122439 * this.ac - this.ab * -621876151 + var2 + (1306418391 * this.al - this.ao * 1430819487);
         return new lb(182968927 * this.af, var3, var4);
      }
   }

   public void at(js var1) {
      if (77939951 * var1.aq > this.au * -1555384875) {
         var1.aq = this.au * -1093871237;
      }

      if (1854846129 * var1.al < this.au * -1555384875) {
         var1.al = -2069943195 * this.au;
      }

      if (var1.at * 2059655157 > this.ab * -347980981) {
         var1.at = 297795135 * this.ab;
      }

      if (-1086956513 * var1.aa < this.ab * -347980981) {
         var1.aa = this.ab * -1984578731;
      }

   }

   public boolean an(int var1, int var2, int var3, byte var4) {
      try {
         if (var1 >= this.af * -1490859351) {
            if (var4 >= 10) {
               throw new IllegalStateException();
            }

            if (var1 < this.an * -1180089391 + -1490859351 * this.af) {
               boolean var10000;
               if (var2 >= (275577107 * this.aw << 6) + (this.aq * 534868105 << 3)) {
                  if (var4 >= 10) {
                     throw new IllegalStateException();
                  }

                  if (var2 <= (593688545 * this.at << 3) + (275577107 * this.aw << 6) + 7) {
                     if (var4 >= 10) {
                        throw new IllegalStateException();
                     }

                     if (var3 >= (1257977427 * this.al << 3) + (-365078831 * this.ac << 6)) {
                        if (var4 >= 10) {
                           throw new IllegalStateException();
                        }

                        if (var3 <= 7 + (this.ac * -365078831 << 6) + (849738307 * this.aa << 3)) {
                           if (var4 >= 10) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                           return var10000;
                        }
                     }
                  }
               }

               var10000 = false;
               return var10000;
            }

            if (var4 >= 10) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw db.an(var5, "ja.an(" + ')');
      }
   }

   public void aa(js var1) {
      if (77939951 * var1.aq > this.au * -1555384875) {
         var1.aq = this.au * -1093871237;
      }

      if (1854846129 * var1.al < this.au * -1555384875) {
         var1.al = -2069943195 * this.au;
      }

      if (var1.at * 2059655157 > this.ab * -347980981) {
         var1.at = 297795135 * this.ab;
      }

      if (-1086956513 * var1.aa < this.ab * -347980981) {
         var1.aa = this.ab * -1984578731;
      }

   }

   public void ar(sg var1) {
      this.af = var1.cm((byte)7) * -1371866727;
      this.an = var1.cm((byte)7) * 1766061361;
      this.aw = var1.cl(-293462134) * -115865431;
      this.aq = var1.cm((byte)7) * -456653161;
      this.at = var1.cm((byte)7) * -1475281645;
      this.ac = var1.cl(-161779812) * 1425588785;
      this.al = var1.cm((byte)7) * -396836404;
      this.aa = var1.cm((byte)7) * 174253662;
      this.au = var1.cl(589144994) * -1827087491;
      this.ay = var1.cm((byte)7) * -868079709;
      this.ax = var1.cm((byte)7) * -192826393;
      this.ab = var1.cl(871561754) * -315988723;
      this.ao = var1.cm((byte)7) * -1779561361;
      this.ai = var1.cm((byte)7) * 1519676935;
      this.aq(-737225708);
   }

   public boolean ad(int var1, int var2, int var3) {
      if (var1 >= this.af * -1490859351 && var1 < this.an * -1180089391 + -1490859351 * this.af) {
         return var2 >= (1300722649 * this.aw << 6) + (this.aq * 534868105 << 3) && var2 <= (1356533933 * this.at << 3) + (275577107 * this.aw << 6) + 7 && var3 >= (1257977427 * this.al << 3) + (-365078831 * this.ac << 6) && var3 <= 7 + (this.ac * -365078831 << 6) + (849738307 * this.aa << 3);
      } else {
         return false;
      }
   }

   ja() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ja.<init>(" + ')');
      }
   }

   public boolean ap(int var1, int var2, int var3) {
      if (var1 >= this.af * -1490859351 && var1 < this.an * -1180089391 + -699382887 * this.af) {
         return var2 >= (-138360826 * this.aw << 6) + (this.aq * -1596325374 << 3) && var2 <= (919605371 * this.at << 3) + (-1484419998 * this.aw << 6) + 7 && var3 >= (1257977427 * this.al << 3) + (-365078831 * this.ac << 6) && var3 <= 7 + (this.ac * -365078831 << 6) + (197772170 * this.aa << 3);
      } else {
         return false;
      }
   }

   void ak() {
   }

   void az() {
   }
}
