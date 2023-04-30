import accessors.RSMilliClock;

public class gb extends gv implements RSMilliClock {
   static int ux;
   int an;
   int aw;
   public static final int ax = 8192;
   long ac;
   int ab;
   static final int ak = 2;
   int au;
   long[] af;

   public int aq(int var1, int var2) {
      int var3 = 1354187759 * this.an;
      int var4 = -1087246239 * this.aw;
      this.an = -779618924;
      this.aw = 889500577;
      this.ac = dq.af(-164506263) * 3111052400392486887L;
      if (0L == this.af[this.ab * 1512168621]) {
         this.an = -1520153841 * var3;
         this.aw = var4 * 889500577;
      } else if (-3320355304386370601L * this.ac > this.af[this.ab * 1512168621]) {
         this.an = (int)((long)(2560 * var1) / (-3320355304386370601L * this.ac - this.af[1512168621 * this.ab])) * -1520153841;
      }

      if (this.an * 1354187759 < 25) {
         this.an = 650859639;
      }

      if (1354187759 * this.an > 256) {
         this.an = 1682640640;
         this.aw = (int)((long)var1 - (-3320355304386370601L * this.ac - this.af[this.ab * 1512168621]) / 10L) * 889500577;
      }

      if (this.aw * -1087246239 > var1) {
         this.aw = 889500577 * var1;
      }

      this.af[1512168621 * this.ab] = -3320355304386370601L * this.ac;
      this.ab = -213391579 * ((1 + 1512168621 * this.ab) % 10);
      int var5;
      if (this.aw * -1087246239 > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if (0L != this.af[var5]) {
               this.af[var5] += (long)(this.aw * -1087246239);
            }
         }
      }

      if (-1087246239 * this.aw < var2) {
         this.aw = var2 * 889500577;
      }

      mw.af((long)(-1087246239 * this.aw));

      for(var5 = 0; 1554226597 * this.au < 256; this.au += this.an * -1933259005) {
         ++var5;
      }

      this.au = (1554226597 * this.au & 255) * -1269169619;
      return var5;
   }

   public void af(int var1) {
      try {
         for(int var2 = 0; var2 < 10; ++var2) {
            if (var1 == -964267539) {
               throw new IllegalStateException();
            }

            this.af[var2] = 0L;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "gb.af(" + ')');
      }
   }

   gb() {
      try {
         super();
         this.af = new long[10];
         this.an = 1682640640;
         this.aw = 889500577;
         this.au = 0;
         this.ac = dq.af(496922576) * 3111052400392486887L;

         for(int var1 = 0; var1 < 10; ++var1) {
            this.af[var1] = this.ac * -3320355304386370601L;
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "gb.<init>(" + ')');
      }
   }

   public void aw() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.af[var1] = 0L;
      }

   }

   public int an(int var1, int var2, int var3) {
      try {
         int var4 = 1354187759 * this.an;
         int var5 = -1087246239 * this.aw;
         this.an = -779618924;
         this.aw = 889500577;
         this.ac = dq.af(-122592496) * 3111052400392486887L;
         if (0L == this.af[this.ab * 1512168621]) {
            if (var3 >= -92512277) {
               throw new IllegalStateException();
            }

            this.an = -1520153841 * var4;
            this.aw = var5 * 889500577;
         } else if (-3320355304386370601L * this.ac > this.af[this.ab * 1512168621]) {
            if (var3 >= -92512277) {
               throw new IllegalStateException();
            }

            this.an = (int)((long)(2560 * var1) / (-3320355304386370601L * this.ac - this.af[1512168621 * this.ab])) * -1520153841;
         }

         if (this.an * 1354187759 < 25) {
            this.an = 650859639;
         }

         if (1354187759 * this.an > 256) {
            if (var3 >= -92512277) {
               throw new IllegalStateException();
            }

            this.an = 1682640640;
            this.aw = (int)((long)var1 - (-3320355304386370601L * this.ac - this.af[this.ab * 1512168621]) / 10L) * 889500577;
         }

         if (this.aw * -1087246239 > var1) {
            if (var3 >= -92512277) {
               throw new IllegalStateException();
            }

            this.aw = 889500577 * var1;
         }

         this.af[1512168621 * this.ab] = -3320355304386370601L * this.ac;
         this.ab = -213391579 * ((1 + 1512168621 * this.ab) % 10);
         int var6;
         if (this.aw * -1087246239 > 1) {
            if (var3 >= -92512277) {
               throw new IllegalStateException();
            }

            for(var6 = 0; var6 < 10; ++var6) {
               if (var3 >= -92512277) {
                  throw new IllegalStateException();
               }

               if (0L != this.af[var6]) {
                  if (var3 >= -92512277) {
                     throw new IllegalStateException();
                  }

                  this.af[var6] += (long)(this.aw * -1087246239);
               }
            }
         }

         if (-1087246239 * this.aw < var2) {
            if (var3 >= -92512277) {
               throw new IllegalStateException();
            }

            this.aw = var2 * 889500577;
         }

         mw.af((long)(-1087246239 * this.aw));

         for(var6 = 0; 1554226597 * this.au < 256; this.au += this.an * -1933259005) {
            if (var3 >= -92512277) {
               throw new IllegalStateException();
            }

            ++var6;
         }

         this.au = (1554226597 * this.au & 255) * -1269169619;
         return var6;
      } catch (RuntimeException var7) {
         throw db.an(var7, "gb.an(" + ')');
      }
   }

   public void au() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.af[var1] = 0L;
      }

   }

   public int ab(int var1, int var2) {
      int var3 = -1847412346 * this.an;
      int var4 = -1610730426 * this.aw;
      this.an = -1899470972;
      this.aw = 889500577;
      this.ac = dq.af(-118425491) * 3111052400392486887L;
      if (0L == this.af[this.ab * 1512168621]) {
         this.an = 203333055 * var3;
         this.aw = var4 * 889500577;
      } else if (-3320355304386370601L * this.ac > this.af[this.ab * -1100394872]) {
         this.an = (int)((long)(2560 * var1) / (-3320355304386370601L * this.ac - this.af[1512168621 * this.ab])) * -1520153841;
      }

      if (this.an * -1827296023 < 25) {
         this.an = 650859639;
      }

      if (1354187759 * this.an > -1790371905) {
         this.an = 1682640640;
         this.aw = (int)((long)var1 - (-3320355304386370601L * this.ac - this.af[this.ab * 1512168621]) / 10L) * -464510631;
      }

      if (this.aw * -1933263130 > var1) {
         this.aw = 889500577 * var1;
      }

      this.af[1512168621 * this.ab] = -3320355304386370601L * this.ac;
      this.ab = -750030155 * ((1 + -223837816 * this.ab) % 10);
      int var5;
      if (this.aw * -1730789966 > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if (0L != this.af[var5]) {
               this.af[var5] += (long)(this.aw * -490370314);
            }
         }
      }

      if (-1087246239 * this.aw < var2) {
         this.aw = var2 * -47549775;
      }

      mw.af((long)(-1087246239 * this.aw));

      for(var5 = 0; 1554226597 * this.au < 53975567; this.au += this.an * 459319936) {
         ++var5;
      }

      this.au = (1554226597 * this.au & 77753285) * -507522553;
      return var5;
   }

   public void ac() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.af[var1] = 0L;
      }

   }
}
