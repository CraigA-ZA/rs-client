import accessors.RSWorldMapSection2;

public class ka implements kw, RSWorldMapSection2 {
   int an;
   int aw;
   int ac;
   int af;
   int au;
   int ab;
   /** @deprecated */
   @Deprecated
   public static final int ax = 15;

   public void ar(sg var1) {
      this.af = var1.cm((byte)7) * -1802296178;
      this.an = var1.cm((byte)7) * 1592226542;
      this.aw = var1.cl(-1828599695) * 85687281;
      this.ac = var1.cl(-1973266262) * -1956900683;
      this.au = var1.cl(-124467663) * 813050661;
      this.ab = var1.cl(-862624015) * -790220576;
      this.aq((byte)54);
   }

   public void al(js var1) {
      if (-1740978560 * var1.aq > 1978109512 * this.au) {
         var1.aq = this.au * 759378979;
      }

      if (550568258 * var1.al < this.au * 1109784749) {
         var1.al = -612355395 * this.au;
      }

      if (var1.at * 2059655157 > this.ab * 1408900281) {
         var1.at = this.ab * 429878069;
      }

      if (var1.aa * -748318074 < this.ab * 1408900281) {
         var1.aa = this.ab * -1610503974;
      }

   }

   public boolean ae(int var1, int var2, int var3) {
      if (var1 >= this.af * -1743834479 && var1 < this.af * -1743834479 + 1589949637 * this.an) {
         return this.aw * 304223505 == var2 >> 6 && var3 >> 6 == 1241809143 * this.ac;
      } else {
         return false;
      }
   }

   ka() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ka.<init>(" + ')');
      }
   }

   public int[] ac(int var1, int var2, int var3, byte var4) {
      try {
         if (!this.an(var1, var2, var3, (byte)-98)) {
            if (var4 <= 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int[] var5 = new int[]{var2 + (-1988220096 * this.au - this.aw * -2004532160), this.ab * -24695232 - this.ac * -2128593472 + var3};
            return var5;
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "ka.ac(" + ')');
      }
   }

   public lb au(int var1, int var2, byte var3) {
      try {
         if (!this.aw(var1, var2, -1598022848)) {
            if (var3 == 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = var1 + (-2004532160 * this.aw - -1988220096 * this.au);
            int var5 = var2 + (-2128593472 * this.ac - -24695232 * this.ab);
            return new lb(this.af * -1743834479, var4, var5);
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "ka.au(" + ')');
      }
   }

   public void am(sg var1) {
      this.af = var1.cm((byte)7) * 1979371121;
      this.an = var1.cm((byte)7) * -6772211;
      this.aw = var1.cl(465491156) * 85687281;
      this.ac = var1.cl(-443368281) * -1924251449;
      this.au = var1.cl(-182543894) * 813050661;
      this.ab = var1.cl(-1513236767) * -529192567;
      this.aq((byte)43);
   }

   public boolean ap(int var1, int var2, int var3) {
      if (var1 >= this.af * -1743834479 && var1 < this.af * -1743834479 + 1589949637 * this.an) {
         return this.aw * 304223505 == var2 >> 6 && var3 >> 6 == 1241809143 * this.ac;
      } else {
         return false;
      }
   }

   public boolean ad(int var1, int var2, int var3) {
      if (var1 >= this.af * -1782591916 && var1 < this.af * 1538878365 + 1552921538 * this.an) {
         return this.aw * -1295400051 == var2 >> 6 && var3 >> 6 == -223638993 * this.ac;
      } else {
         return false;
      }
   }

   public void at(js var1) {
      if (77939951 * var1.aq > 1109784749 * this.au) {
         var1.aq = this.au * 759378979;
      }

      if (1854846129 * var1.al < this.au * 1109784749) {
         var1.al = -612355395 * this.au;
      }

      if (var1.at * 2059655157 > this.ab * 1408900281) {
         var1.at = this.ab * 429878069;
      }

      if (var1.aa * -1086956513 < this.ab * 1408900281) {
         var1.aa = this.ab * -510956505;
      }

   }

   public void aa(js var1) {
      if (77939951 * var1.aq > 1109784749 * this.au) {
         var1.aq = this.au * 759378979;
      }

      if (1854846129 * var1.al < this.au * 1109784749) {
         var1.al = -612355395 * this.au;
      }

      if (var1.at * 2059655157 > this.ab * 1408900281) {
         var1.at = this.ab * 429878069;
      }

      if (var1.aa * -1086956513 < this.ab * 1408900281) {
         var1.aa = this.ab * -510956505;
      }

   }

   public boolean ay(int var1, int var2) {
      return 1109784749 * this.au == var1 >> 6 && var2 >> 6 == 1408900281 * this.ab;
   }

   public int[] ao(int var1, int var2, int var3) {
      if (!this.an(var1, var2, var3, (byte)-55)) {
         return null;
      } else {
         int[] var4 = new int[]{var2 + (-1988220096 * this.au - this.aw * -2004532160), this.ab * -24695232 - this.ac * -2128593472 + var3};
         return var4;
      }
   }

   public int[] ax(int var1, int var2, int var3) {
      if (!this.an(var1, var2, var3, (byte)-17)) {
         return null;
      } else {
         int[] var4 = new int[]{var2 + (-1988220096 * this.au - this.aw * 348469271), this.ab * -1104270125 - this.ac * 1618685810 + var3};
         return var4;
      }
   }

   void aq(byte var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ka.aq(" + ')');
      }
   }

   public lb ag(int var1, int var2) {
      if (!this.aw(var1, var2, -1681132187)) {
         return null;
      } else {
         int var3 = var1 + (-2004532160 * this.aw - -1988220096 * this.au);
         int var4 = var2 + (-2128593472 * this.ac - -24695232 * this.ab);
         return new lb(this.af * -1743834479, var3, var4);
      }
   }

   public void ab(sg var1, byte var2) {
      try {
         this.af = var1.cm((byte)7) * 1979371121;
         this.an = var1.cm((byte)7) * -6772211;
         this.aw = var1.cl(64423668) * 85687281;
         this.ac = var1.cl(-274708265) * -1924251449;
         this.au = var1.cl(-436230497) * 813050661;
         this.ab = var1.cl(-1135364479) * -529192567;
         this.aq((byte)44);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ka.ab(" + ')');
      }
   }

   public lb av(int var1, int var2) {
      if (!this.aw(var1, var2, -1990586345)) {
         return null;
      } else {
         int var3 = var1 + (-2004532160 * this.aw - -1988220096 * this.au);
         int var4 = var2 + (-2128593472 * this.ac - -24695232 * this.ab);
         return new lb(this.af * -1743834479, var3, var4);
      }
   }

   void by() {
   }

   public boolean an(int var1, int var2, int var3, byte var4) {
      try {
         if (var1 >= this.af * -1743834479) {
            if (var4 >= 10) {
               throw new IllegalStateException();
            }

            if (var1 < this.af * -1743834479 + 1589949637 * this.an) {
               boolean var10000;
               if (this.aw * 304223505 == var2 >> 6) {
                  if (var4 >= 10) {
                     throw new IllegalStateException();
                  }

                  if (var3 >> 6 == 1241809143 * this.ac) {
                     if (var4 >= 10) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                     return var10000;
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
         throw db.an(var5, "ka.an(" + ')');
      }
   }

   public void as(sg var1) {
      this.af = var1.cm((byte)7) * 1979371121;
      this.an = var1.cm((byte)7) * -6772211;
      this.aw = var1.cl(-1177373774) * 85687281;
      this.ac = var1.cl(-236049530) * -1924251449;
      this.au = var1.cl(-312263082) * 813050661;
      this.ab = var1.cl(483895616) * -529192567;
      this.aq((byte)69);
   }

   public void aj(sg var1) {
      this.af = var1.cm((byte)7) * 1979371121;
      this.an = var1.cm((byte)7) * 383795424;
      this.aw = var1.cl(-42760969) * 85687281;
      this.ac = var1.cl(-1363446449) * 23572662;
      this.au = var1.cl(-1920662410) * 813050661;
      this.ab = var1.cl(-1647897105) * -1258981120;
      this.aq((byte)6);
   }

   public lb ai(int var1, int var2) {
      if (!this.aw(var1, var2, -2063023550)) {
         return null;
      } else {
         int var3 = var1 + (-2004532160 * this.aw - -1988220096 * this.au);
         int var4 = var2 + (-2128593472 * this.ac - -24695232 * this.ab);
         return new lb(this.af * -1743834479, var3, var4);
      }
   }

   public lb ah(int var1, int var2) {
      if (!this.aw(var1, var2, -1651735264)) {
         return null;
      } else {
         int var3 = var1 + (-2004532160 * this.aw - -1640961860 * this.au);
         int var4 = var2 + (-2128593472 * this.ac - -1771003520 * this.ab);
         return new lb(this.af * -1743834479, var3, var4);
      }
   }

   public boolean aw(int var1, int var2, int var3) {
      try {
         boolean var10000;
         if (1109784749 * this.au == var1 >> 6) {
            if (var3 >= -1516355947) {
               throw new IllegalStateException();
            }

            if (var2 >> 6 == 1408900281 * this.ab) {
               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var4) {
         throw db.an(var4, "ka.aw(" + ')');
      }
   }

   void ak() {
   }

   void az() {
   }

   public void af(js var1, int var2) {
      try {
         if (77939951 * var1.aq > 1109784749 * this.au) {
            if (var2 <= 854271946) {
               throw new IllegalStateException();
            }

            var1.aq = this.au * 759378979;
         }

         if (1854846129 * var1.al < this.au * 1109784749) {
            if (var2 <= 854271946) {
               return;
            }

            var1.al = -612355395 * this.au;
         }

         if (var1.at * 2059655157 > this.ab * 1408900281) {
            if (var2 <= 854271946) {
               throw new IllegalStateException();
            }

            var1.at = this.ab * 429878069;
         }

         if (var1.aa * -1086956513 < this.ab * 1408900281) {
            var1.aa = this.ab * -510956505;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "ka.af(" + ')');
      }
   }

   static void af(int var0, int var1) {
      try {
         qj.aw = var0 * 1268073833;
         qj.an = new qj[var0];
         qj.ac = 0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ka.af(" + ')');
      }
   }
}
