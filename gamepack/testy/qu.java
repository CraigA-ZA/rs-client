import accessors.RSBounds;

public class qu implements RSBounds {
   public int aw;
   public int an;
   public int af;
   public int ac;
   static final int be = 4;

   public void an(int var1, int var2, byte var3) {
      try {
         this.aw = -1469434281 * var1;
         this.ac = 149296003 * var2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "qu.an(" + ')');
      }
   }

   void ae(qu var1, qu var2) {
      var2.an = this.an * 1;
      var2.ac = this.ac * 1;
      if (this.an * 1864020389 < var1.an * 1185074375) {
         var2.ac -= var1.an * -2067814222 - -1743378833 * this.an;
         var2.an = var1.an * 1;
      }

      if (var2.al(120916243) > var1.al(152799872)) {
         var2.ac -= (var2.al(102815854) - var1.al(1514630260)) * 754110042;
      }

      if (var2.ac * -1376251093 < 0) {
         var2.ac = 0;
      }

   }

   public void af(int var1, int var2, byte var3) {
      try {
         this.af = var1 * 775648579;
         this.an = -1859334611 * var2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "qu.af(" + ')');
      }
   }

   public qu(int var1, int var2) {
      try {
         this(0, 0, var1, var2);
      } catch (RuntimeException var3) {
         throw db.an(var3, "qu.<init>(" + ')');
      }
   }

   public boolean aw(int var1, int var2, int var3) {
      try {
         boolean var10000;
         if (var1 >= -844906645 * this.af) {
            if (var3 != 917820097) {
               throw new IllegalStateException();
            }

            if (var1 < this.aw * 944313703 + this.af * -844906645 && var2 >= this.an * 1864020389) {
               if (var3 != 917820097) {
                  throw new IllegalStateException();
               }

               if (var2 < this.an * 1864020389 + this.ac * -1376251093) {
                  if (var3 != 917820097) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
                  return var10000;
               }
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var4) {
         throw db.an(var4, "qu.aw(" + ')');
      }
   }

   public String toString() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw db.an(var1, "qu.toString(" + ')');
      }
   }

   public void at(int var1, int var2) {
      this.af = var1 * 1143845385;
      this.an = -1560821123 * var2;
   }

   void au(qu var1, qu var2, byte var3) {
      try {
         var2.af = 1 * this.af;
         var2.aw = this.aw * 1;
         if (this.af * -844906645 < var1.af * -844906645) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            var2.aw -= -413884579 * var1.af - this.af * -413884579;
            var2.af = 1 * var1.af;
         }

         if (var2.aq(-1027665402) > var1.aq(-1487897572)) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            var2.aw -= (var2.aq(-843873593) - var1.aq(-1576542452)) * -1469434281;
         }

         if (var2.aw * 944313703 < 0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            var2.aw = 0;
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "qu.au(" + ')');
      }
   }

   void ab(qu var1, qu var2, int var3) {
      try {
         var2.an = this.an * 1;
         var2.ac = this.ac * 1;
         if (this.an * 1864020389 < var1.an * 1864020389) {
            if (var3 <= 361198680) {
               throw new IllegalStateException();
            }

            var2.ac -= var1.an * -1743378833 - -1743378833 * this.an;
            var2.an = var1.an * 1;
         }

         if (var2.al(-1021516763) > var1.al(489798675)) {
            if (var3 <= 361198680) {
               return;
            }

            var2.ac -= (var2.al(1277023159) - var1.al(193755423)) * 149296003;
         }

         if (var2.ac * -1376251093 < 0) {
            if (var3 <= 361198680) {
               throw new IllegalStateException();
            }

            var2.ac = 0;
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "qu.ab(" + ')');
      }
   }

   int by() {
      return this.aw * 944313703 + this.af * -844906645;
   }

   public void ao(int var1, int var2) {
      this.af = var1 * 775648579;
      this.an = -257279276 * var2;
   }

   int aq(int var1) {
      try {
         return this.aw * 944313703 + this.af * -844906645;
      } catch (RuntimeException var2) {
         throw db.an(var2, "qu.aq(" + ')');
      }
   }

   public String ahp() {
      return null;
   }

   public String ahj() {
      return null;
   }

   public boolean ah(int var1, int var2) {
      return var1 >= -844906645 * this.af && var1 < this.aw * 66323274 + this.af * -1343173498 && var2 >= this.an * 1864020389 && var2 < this.an * -361531024 + this.ac * -1964892236;
   }

   public void aa(int var1, int var2) {
      this.af = var1 * 1576861074;
      this.an = 736238671 * var2;
   }

   public void ay(int var1, int var2) {
      this.af = var1 * 775648579;
      this.an = -1859334611 * var2;
   }

   int bi() {
      return this.aw * 944313703 + this.af * -844906645;
   }

   public void ax(int var1, int var2) {
      this.aw = -1469434281 * var1;
      this.ac = 149296003 * var2;
   }

   public void ai(int var1, int var2) {
      this.aw = -1469434281 * var1;
      this.ac = 149296003 * var2;
   }

   public boolean ag(int var1, int var2) {
      return var1 >= 1064874956 * this.af && var1 < this.aw * -1938263083 + this.af * -844906645 && var2 >= this.an * 1864020389 && var2 < this.an * 974593113 + this.ac * 217736541;
   }

   public void ac(qu var1, qu var2, int var3) {
      try {
         this.au(var1, var2, (byte)0);
         this.ab(var1, var2, 924152232);
      } catch (RuntimeException var4) {
         throw db.an(var4, "qu.ac(" + ')');
      }
   }

   public void av(qu var1, qu var2) {
      this.au(var1, var2, (byte)0);
      this.ab(var1, var2, 910499503);
   }

   public void ar(qu var1, qu var2) {
      this.au(var1, var2, (byte)0);
      this.ab(var1, var2, 1986923708);
   }

   public void am(qu var1, qu var2) {
      this.au(var1, var2, (byte)0);
      this.ab(var1, var2, 1571426217);
   }

   public void as(qu var1, qu var2) {
      this.au(var1, var2, (byte)0);
      this.ab(var1, var2, 2085508364);
   }

   public void aj(qu var1, qu var2) {
      this.au(var1, var2, (byte)0);
      this.ab(var1, var2, 493499641);
   }

   void ak(qu var1, qu var2) {
      var2.af = 1 * this.af;
      var2.aw = this.aw * 1;
      if (this.af * -844906645 < var1.af * 1391467150) {
         var2.aw -= -413884579 * var1.af - this.af * -413884579;
         var2.af = 1 * var1.af;
      }

      if (var2.aq(-1676819418) > var1.aq(-1097583638)) {
         var2.aw -= (var2.aq(-2051828765) - var1.aq(-1550621307)) * -1469434281;
      }

      if (var2.aw * -856095918 < 0) {
         var2.aw = 0;
      }

   }

   void az(qu var1, qu var2) {
      var2.af = 1 * this.af;
      var2.aw = this.aw * 1;
      if (this.af * 34251409 < var1.af * -844906645) {
         var2.aw -= -413884579 * var1.af - this.af * 1869520668;
         var2.af = 1 * var1.af;
      }

      if (var2.aq(-754605833) > var1.aq(-1155966035)) {
         var2.aw -= (var2.aq(-636542870) - var1.aq(-1670318508)) * 188872299;
      }

      if (var2.aw * 944313703 < 0) {
         var2.aw = 0;
      }

   }

   void ad(qu var1, qu var2) {
      var2.an = this.an * 1;
      var2.ac = this.ac * 1;
      if (this.an * 1864020389 < var1.an * 1864020389) {
         var2.ac -= var1.an * -358215864 - -1743378833 * this.an;
         var2.an = var1.an * 1;
      }

      if (var2.al(-1514074453) > var1.al(1387288411)) {
         var2.ac -= (var2.al(-1463015597) - var1.al(627281680)) * -1580049788;
      }

      if (var2.ac * -1893192023 < 0) {
         var2.ac = 0;
      }

   }

   public String ahm() {
      return null;
   }

   void ap(qu var1, qu var2) {
      var2.an = this.an * 1;
      var2.ac = this.ac * 1;
      if (this.an * 1864020389 < var1.an * 1864020389) {
         var2.ac -= var1.an * -1743378833 - -1743378833 * this.an;
         var2.an = var1.an * 1;
      }

      if (var2.al(1605813274) > var1.al(-839749680)) {
         var2.ac -= (var2.al(-596322548) - var1.al(-1413304287)) * 149296003;
      }

      if (var2.ac * -1376251093 < 0) {
         var2.ac = 0;
      }

   }

   int al(int var1) {
      try {
         return -1376251093 * this.ac + this.an * 1864020389;
      } catch (RuntimeException var2) {
         throw db.an(var2, "qu.al(" + ')');
      }
   }

   int bb() {
      return this.aw * 944313703 + this.af * -844906645;
   }

   public qu(int var1, int var2, int var3, int var4) {
      try {
         super();
         this.af(var1, var2, (byte)26);
         this.an(var3, var4, (byte)-6);
      } catch (RuntimeException var5) {
         throw db.an(var5, "qu.<init>(" + ')');
      }
   }

   int be() {
      return -1376251093 * this.ac + this.an * 1368661512;
   }

   int bk() {
      return -1376251093 * this.ac + this.an * 1864020389;
   }
}
