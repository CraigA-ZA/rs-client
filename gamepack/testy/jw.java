import accessors.RSWorldMapSection3;

public class jw implements kw, RSWorldMapSection3 {
   static mq[] qk;
   int aq;
   int af;
   int aw;
   int au;
   int ab;
   int ac;
   int al;
   int at;
   int an;
   int aa;

   void az() {
   }

   public void af(js var1, int var2) {
      try {
         if (var1.aq * 77939951 > 1704678507 * this.aq) {
            if (var2 <= 854271946) {
               throw new IllegalStateException();
            }

            var1.aq = this.aq * 829177925;
         }

         if (var1.al * 1854846129 < 758652409 * this.at) {
            var1.al = this.at * 652996553;
         }

         if (var1.at * 2059655157 > this.al * 710831151) {
            var1.at = 1834070291 * this.al;
         }

         if (var1.aa * -1086956513 < -422674435 * this.aa) {
            if (var2 <= 854271946) {
               throw new IllegalStateException();
            }

            var1.aa = this.aa * 1310400611;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "jw.af(" + ')');
      }
   }

   public boolean an(int var1, int var2, int var3, byte var4) {
      try {
         if (var1 >= 2017495751 * this.af) {
            if (var4 >= 10) {
               throw new IllegalStateException();
            }

            if (var1 < this.af * 2017495751 + 737827993 * this.an) {
               boolean var10000;
               if (var2 >> 6 >= 2029294685 * this.aw) {
                  if (var4 >= 10) {
                     throw new IllegalStateException();
                  }

                  if (var2 >> 6 <= this.au * 1316670953) {
                     if (var4 >= 10) {
                        throw new IllegalStateException();
                     }

                     if (var3 >> 6 >= this.ac * 1330856607 && var3 >> 6 <= 140125345 * this.ab) {
                        var10000 = true;
                        return var10000;
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
         throw db.an(var5, "jw.an(" + ')');
      }
   }

   public boolean ae(int var1, int var2, int var3) {
      if (var1 >= 2017495751 * this.af && var1 < this.af * 2017495751 + 737827993 * this.an) {
         return var2 >> 6 >= 2029294685 * this.aw && var2 >> 6 <= this.au * 1316670953 && var3 >> 6 >= this.ac * 1330856607 && var3 >> 6 <= 140125345 * this.ab;
      } else {
         return false;
      }
   }

   public boolean ad(int var1, int var2, int var3) {
      if (var1 >= 2017495751 * this.af && var1 < this.af * 2017495751 + 737827993 * this.an) {
         return var2 >> 6 >= 2029294685 * this.aw && var2 >> 6 <= this.au * 1316670953 && var3 >> 6 >= this.ac * 1330856607 && var3 >> 6 <= 140125345 * this.ab;
      } else {
         return false;
      }
   }

   public lb au(int var1, int var2, byte var3) {
      try {
         if (!this.aw(var1, var2, -1784349865)) {
            if (var3 == 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = 1025840960 * this.aw - 1725242048 * this.aq + var1;
            int var5 = var2 + (-724523072 * this.ac - this.al * -1751446592);
            return new lb(2017495751 * this.af, var4, var5);
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "jw.au(" + ')');
      }
   }

   public void aj(sg var1) {
      this.af = var1.cm((byte)7) * 726282644;
      this.an = var1.cm((byte)7) * -856410199;
      this.aw = var1.cl(647481882) * -932847627;
      this.ac = var1.cl(-923421050) * 1332114333;
      this.au = var1.cl(-2108927711) * -1672842594;
      this.ab = var1.cl(-1791988310) * 781656406;
      this.aq = var1.cl(52832330) * 864905705;
      this.al = var1.cl(-2024978238) * 1907796729;
      this.at = var1.cl(837036376) * -941091767;
      this.aa = var1.cl(-350773947) * 380922611;
      this.aq(344912093);
   }

   public boolean aw(int var1, int var2, int var3) {
      try {
         boolean var10000;
         if (var1 >> 6 >= this.aq * 1704678507) {
            if (var3 >= -1516355947) {
               throw new IllegalStateException();
            }

            if (var1 >> 6 <= 758652409 * this.at) {
               if (var3 >= -1516355947) {
                  throw new IllegalStateException();
               }

               if (var2 >> 6 >= 710831151 * this.al) {
                  if (var3 >= -1516355947) {
                     throw new IllegalStateException();
                  }

                  if (var2 >> 6 <= -422674435 * this.aa) {
                     if (var3 >= -1516355947) {
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
      } catch (RuntimeException var4) {
         throw db.an(var4, "jw.aw(" + ')');
      }
   }

   public void al(js var1) {
      if (var1.aq * 77939951 > 1704678507 * this.aq) {
         var1.aq = this.aq * 829177925;
      }

      if (var1.al * 1854846129 < 758652409 * this.at) {
         var1.al = this.at * 652996553;
      }

      if (var1.at * 2059655157 > this.al * 710831151) {
         var1.at = 1834070291 * this.al;
      }

      if (var1.aa * -1086956513 < -422674435 * this.aa) {
         var1.aa = this.aa * 1310400611;
      }

   }

   public lb av(int var1, int var2) {
      if (!this.aw(var1, var2, -1652886866)) {
         return null;
      } else {
         int var3 = 1025840960 * this.aw - 1725242048 * this.aq + var1;
         int var4 = var2 + (-724523072 * this.ac - this.al * -1751446592);
         return new lb(2017495751 * this.af, var3, var4);
      }
   }

   public void aa(js var1) {
      if (var1.aq * 77939951 > 1704678507 * this.aq) {
         var1.aq = this.aq * 829177925;
      }

      if (var1.al * 1781289575 < 1346938244 * this.at) {
         var1.al = this.at * -2050606310;
      }

      if (var1.at * -419265587 > this.al * 710831151) {
         var1.at = 1834070291 * this.al;
      }

      if (var1.aa * -1086956513 < 1636249090 * this.aa) {
         var1.aa = this.aa * 2046277510;
      }

   }

   public boolean ay(int var1, int var2) {
      return var1 >> 6 >= this.aq * 1704678507 && var1 >> 6 <= -1767286016 * this.at && var2 >> 6 >= 710831151 * this.al && var2 >> 6 <= -422674435 * this.aa;
   }

   void aq(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "jw.aq(" + ')');
      }
   }

   public int[] ax(int var1, int var2, int var3) {
      if (!this.an(var1, var2, var3, (byte)-125)) {
         return null;
      } else {
         int[] var4 = new int[]{var2 + (this.aq * -672612057 - 1025840960 * this.aw), 1104879798 * this.al - this.ac * 1823588154 + var3};
         return var4;
      }
   }

   public lb ai(int var1, int var2) {
      if (!this.aw(var1, var2, -2103759804)) {
         return null;
      } else {
         int var3 = 1220717737 * this.aw - 1591158798 * this.aq + var1;
         int var4 = var2 + (1068337342 * this.ac - this.al * -894931480);
         return new lb(-772430433 * this.af, var3, var4);
      }
   }

   public lb ag(int var1, int var2) {
      if (!this.aw(var1, var2, -1713609814)) {
         return null;
      } else {
         int var3 = 1025840960 * this.aw - 843708821 * this.aq + var1;
         int var4 = var2 + (-724523072 * this.ac - this.al * 426586987);
         return new lb(2017495751 * this.af, var3, var4);
      }
   }

   public lb ah(int var1, int var2) {
      if (!this.aw(var1, var2, -2063551580)) {
         return null;
      } else {
         int var3 = 1025840960 * this.aw - 1725242048 * this.aq + var1;
         int var4 = var2 + (-724523072 * this.ac - this.al * -1751446592);
         return new lb(2017495751 * this.af, var3, var4);
      }
   }

   jw() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "jw.<init>(" + ')');
      }
   }

   public void ar(sg var1) {
      this.af = var1.cm((byte)7) * -1653194698;
      this.an = var1.cm((byte)7) * -856410199;
      this.aw = var1.cl(-967844449) * -932847627;
      this.ac = var1.cl(-1279246073) * 1701796191;
      this.au = var1.cl(-414389472) * -58271143;
      this.ab = var1.cl(-1315294345) * -1126232063;
      this.aq = var1.cl(-297291011) * -704333757;
      this.al = var1.cl(-867706415) * 1891785423;
      this.at = var1.cl(713808058) * -941091767;
      this.aa = var1.cl(-1704209797) * -2070234314;
      this.aq(344912093);
   }

   public void am(sg var1) {
      this.af = var1.cm((byte)7) * -1899292937;
      this.an = var1.cm((byte)7) * -856410199;
      this.aw = var1.cl(675887796) * -932847627;
      this.ac = var1.cl(136248921) * -308413167;
      this.au = var1.cl(-678759215) * -940441052;
      this.ab = var1.cl(740688582) * -21466973;
      this.aq = var1.cl(-613077146) * -704333757;
      this.al = var1.cl(-467641773) * -22713238;
      this.at = var1.cl(-1337000430) * 975640348;
      this.aa = var1.cl(785903560) * 1771376671;
      this.aq(344912093);
   }

   public void as(sg var1) {
      this.af = var1.cm((byte)7) * 2079767220;
      this.an = var1.cm((byte)7) * 1486281987;
      this.aw = var1.cl(-103110496) * 328719439;
      this.ac = var1.cl(-1692911648) * 1906673788;
      this.au = var1.cl(-1950929475) * 474849618;
      this.ab = var1.cl(-1880819192) * -1214689094;
      this.aq = var1.cl(796173665) * -704333757;
      this.al = var1.cl(-1372287269) * 284846182;
      this.at = var1.cl(-1278871725) * 1179542563;
      this.aa = var1.cl(-914464013) * 615243557;
      this.aq(344912093);
   }

   public int[] ao(int var1, int var2, int var3) {
      if (!this.an(var1, var2, var3, (byte)-85)) {
         return null;
      } else {
         int[] var4 = new int[]{var2 + (this.aq * 1725242048 - 1025840960 * this.aw), -1751446592 * this.al - this.ac * -724523072 + var3};
         return var4;
      }
   }

   void ak() {
   }

   public int[] ac(int var1, int var2, int var3, byte var4) {
      try {
         if (!this.an(var1, var2, var3, (byte)-52)) {
            if (var4 <= 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int[] var5 = new int[]{var2 + (this.aq * 1725242048 - 1025840960 * this.aw), -1751446592 * this.al - this.ac * -724523072 + var3};
            return var5;
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "jw.ac(" + ')');
      }
   }

   public void ab(sg var1, byte var2) {
      try {
         this.af = var1.cm((byte)7) * -1899292937;
         this.an = var1.cm((byte)7) * -856410199;
         this.aw = var1.cl(384056814) * -932847627;
         this.ac = var1.cl(-391423841) * 1701796191;
         this.au = var1.cl(-557089183) * -58271143;
         this.ab = var1.cl(-218111752) * -1039876255;
         this.aq = var1.cl(58427976) * -704333757;
         this.al = var1.cl(519713274) * 1891785423;
         this.at = var1.cl(-2107975946) * -941091767;
         this.aa = var1.cl(-1312429574) * 643487061;
         this.aq(344912093);
      } catch (RuntimeException var3) {
         throw db.an(var3, "jw.ab(" + ')');
      }
   }

   public void at(js var1) {
      if (var1.aq * 77939951 > 1210512068 * this.aq) {
         var1.aq = this.aq * 829177925;
      }

      if (var1.al * -1929477692 < 758652409 * this.at) {
         var1.al = this.at * 652996553;
      }

      if (var1.at * 2059655157 > this.al * 710831151) {
         var1.at = -46432480 * this.al;
      }

      if (var1.aa * -1086956513 < -422674435 * this.aa) {
         var1.aa = this.aa * 1310400611;
      }

   }

   public boolean ap(int var1, int var2, int var3) {
      if (var1 >= 2017495751 * this.af && var1 < this.af * 2017495751 + 737827993 * this.an) {
         return var2 >> 6 >= 2029294685 * this.aw && var2 >> 6 <= this.au * 1316670953 && var3 >> 6 >= this.ac * 1330856607 && var3 >> 6 <= 140125345 * this.ab;
      } else {
         return false;
      }
   }
}
