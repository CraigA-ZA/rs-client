public class TextureProvider implements TextureLoader {
   double brightness0 = 1.0;
   Texture[] textures;
   int textureSize = 910538112;
   int remaining = 0;
   int aw;
   NodeDeque deque = new NodeDeque();
   AbstractArchive archive;

   public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
      this.archive = var2;
      this.aw = -909227037 * var3;
      this.remaining = -668183133 * this.aw;
      this.brightness0 = var4;
      this.textureSize = 1080855403 * var6;
      int[] var7 = var1.ck(0);
      if (var7 != null) {
         int var8 = var7.length;
         this.textures = new Texture[var1.cq(0)];

         for(int var9 = 0; var9 < var8; ++var9) {
            Packet var10 = new Packet(var1.takeFile(0, var7[var9]));
            this.textures[var7[var9]] = new Texture(var10);
         }
      } else {
         this.textures = new Texture[0];
      }

   }

   public int af() {
      if (0 == this.textures.length) {
         return 100;
      } else {
         int var2 = 0;
         int var3 = 0;
         Texture[] var4 = this.textures;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            Texture var6 = var4[var5];
            if (null != var6 && null != var6.files) {
               var2 += var6.files.length;
               int[] var7 = var6.files;

               for(int var8 = 0; var8 < var7.length; ++var8) {
                  int var9 = var7[var8];
                  if (this.archive.ci(var9)) {
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
      this.brightness0 = var1;
      this.clear();
   }

   public int[] load(int var1) {
      Texture var3 = this.textures[var1];
      if (var3 != null) {
         if (var3.pixels != null) {
            this.deque.addLast(var3);
            var3.isLoaded = true;
            return var3.pixels;
         }

         boolean var4 = var3.af(this.brightness0, -1962784445 * this.textureSize, this.archive);
         if (var4) {
            if (0 == this.remaining * -1759525447) {
               Texture var5 = (Texture)this.deque.removeFirst();
               var5.reset();
            } else {
               this.remaining -= -1869565815;
            }

            this.deque.addLast(var3);
            var3.isLoaded = true;
            return var3.pixels;
         }
      }

      return null;
   }

   public static int al(long var0) {
      return (int)(var0 >>> 14 & 3L);
   }

   public int ac(int var1) {
      return null != this.textures[var1] ? this.textures[var1].int1 : 0;
   }

   public boolean au(int var1) {
      return this.textures[var1].ab;
   }

   public boolean isLowDetail(int var1) {
      return 64 == this.textureSize * -1962784445;
   }

   public void clear() {
      for(int var2 = 0; var2 < this.textures.length; ++var2) {
         if (this.textures[var2] != null) {
            this.textures[var2].reset();
         }
      }

      this.deque = new NodeDeque();
      this.remaining = this.aw * -668183133;
   }

   public void animate(int var1) {
      for(int var3 = 0; var3 < this.textures.length; ++var3) {
         Texture var4 = this.textures[var3];
         if (var4 != null && 0 != var4.animationDirection && var4.isLoaded) {
            var4.animate(var1);
            var4.isLoaded = false;
         }
      }

   }

   static final void ab_renamed(int var0, int var1, int var2) {
      int var4;
      for(var4 = 0; var4 < 8; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            Tiles.Tiles_heights[var0][var1 + var4][var2 + var5] = 0;
         }
      }

      if (var1 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            Tiles.Tiles_heights[var0][var1][var2 + var4] = Tiles.Tiles_heights[var0][var1 - 1][var2 + var4];
         }
      }

      if (var2 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            Tiles.Tiles_heights[var0][var1 + var4][var2] = Tiles.Tiles_heights[var0][var1 + var4][var2 - 1];
         }
      }

      if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) {
         Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
      } else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) {
         Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) {
         Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
      }

   }
}
