public class TextureProvider implements TextureLoader {
   double au = 1.0;
   Texture[] af;
   int ab = 910538112;
   int ac = 0;
   int aw;
   NodeDeque an = new NodeDeque();
   AbstractArchive aq;

   public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
      this.aq = var2;
      this.aw = -909227037 * var3;
      this.ac = -668183133 * this.aw;
      this.au = var4;
      this.ab = 1080855403 * var6;
      int[] var7 = var1.ck(0);
      if (var7 != null) {
         int var8 = var7.length;
         this.af = new Texture[var1.cq(0)];

         for(int var9 = 0; var9 < var8; ++var9) {
            Packet var10 = new Packet(var1.takeFile(0, var7[var9]));
            this.af[var7[var9]] = new Texture(var10);
         }
      } else {
         this.af = new Texture[0];
      }

   }

   public int af() {
      if (0 == this.af.length) {
         return 100;
      } else {
         int var2 = 0;
         int var3 = 0;
         Texture[] var4 = this.af;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            Texture var6 = var4[var5];
            if (null != var6 && null != var6.aq) {
               var2 += var6.aq.length;
               int[] var7 = var6.aq;

               for(int var8 = 0; var8 < var7.length; ++var8) {
                  int var9 = var7[var8];
                  if (this.aq.ci(var9)) {
                     ++var3;
                  }
               }
            }
         }

         if (0 == var2) {
            return 0;
         } else {
            return 100 * var3 / var2;
         }
      }
   }

   public void setBrightness(double var1) {
      this.au = var1;
      this.clear();
   }

   public int[] load(int var1) {
      Texture var3 = this.af[var1];
      if (var3 != null) {
         if (var3.ax != null) {
            this.an.addLast(var3);
            var3.ai = true;
            return var3.ax;
         }

         boolean var4 = var3.af(this.au, -1962784445 * this.ab, this.aq);
         if (var4) {
            if (0 == this.ac * -1759525447) {
               Texture var5 = (Texture)this.an.removeFirst();
               var5.reset();
            } else {
               this.ac -= -1869565815;
            }

            this.an.addLast(var3);
            var3.ai = true;
            return var3.ax;
         }
      }

      return null;
   }

   public static int al(long var0) {
      return (int)(var0 >>> 14 & 3L);
   }

   public int ac(int var1) {
      return null != this.af[var1] ? this.af[var1].au : 0;
   }

   public boolean au(int var1) {
      return this.af[var1].ab;
   }

   public boolean isLowDetail(int var1) {
      return 64 == this.ab * -1962784445;
   }

   public void clear() {
      for(int var2 = 0; var2 < this.af.length; ++var2) {
         if (this.af[var2] != null) {
            this.af[var2].reset();
         }
      }

      this.an = new NodeDeque();
      this.ac = this.aw * -668183133;
   }

   public void animate(int var1) {
      for(int var3 = 0; var3 < this.af.length; ++var3) {
         Texture var4 = this.af[var3];
         if (var4 != null && 0 != var4.ay && var4.ai) {
            var4.animate(var1);
            var4.ai = false;
         }
      }

   }

   static final void ab_renamed(int var0, int var1, int var2) {
      int var4;
      for(var4 = 0; var4 < 8; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            Tiles.af[var0][var1 + var4][var2 + var5] = 0;
         }
      }

      if (var1 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            Tiles.af[var0][var1][var2 + var4] = Tiles.af[var0][var1 - 1][var2 + var4];
         }
      }

      if (var2 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            Tiles.af[var0][var1 + var4][var2] = Tiles.af[var0][var1 + var4][var2 - 1];
         }
      }

      if (var1 > 0 && Tiles.af[var0][var1 - 1][var2] != 0) {
         Tiles.af[var0][var1][var2] = Tiles.af[var0][var1 - 1][var2];
      } else if (var2 > 0 && Tiles.af[var0][var1][var2 - 1] != 0) {
         Tiles.af[var0][var1][var2] = Tiles.af[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && Tiles.af[var0][var1 - 1][var2 - 1] != 0) {
         Tiles.af[var0][var1][var2] = Tiles.af[var0][var1 - 1][var2 - 1];
      }

   }
}
