public final class GraphicsObject extends Entity {
   int frame = 0;
   int height;
   int id;
   boolean isFinished = false;
   int x;
   int y;
   SeqType seqType;
   int plane;
   int cycleStart;
   int frameCycle = 0;
   static boolean sl;

   GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.cycleStart = var1 * -1726780687;
      this.id = 1295796889 * var2;
      this.plane = var3 * -620581055;
      this.x = -652580511 * var4;
      this.y = 186790935 * var5;
      this.height = 1889540095 * (var7 + var6);
      int var8 = Inventory.getSpotType(-1107802607 * this.cycleStart).aq * 374130911;
      if (var8 != -1) {
         this.isFinished = false;
         this.seqType = Inventory.getSeqType(var8, (byte)52);
      } else {
         this.isFinished = true;
      }

   }

   static final void ao(long var0) {
      ix.ag[(ix.ai += -429048361) * -1048050201 - 1] = var0;
   }

   protected final it getModel() {
      SpotType var2 = Inventory.getSpotType(-1107802607 * this.cycleStart);
      it var3;
      if (!this.isFinished) {
         var3 = var2.au(158616165 * this.frameCycle);
      } else {
         var3 = var2.au(-1);
      }

      return var3 == null ? null : var3;
   }

   final void advance(int var1) {
      if (!this.isFinished) {
         this.frame += var1 * -1521037169;
         if (!this.seqType.ao()) {
            while(this.frame * -1355788689 > this.seqType.frameLengths[this.frameCycle * 158616165]) {
               this.frame -= this.seqType.frameLengths[158616165 * this.frameCycle] * -1521037169;
               this.frameCycle += 639915885;
               if (158616165 * this.frameCycle >= this.seqType.ag.length) {
                  this.isFinished = true;
                  break;
               }
            }
         } else {
            this.frameCycle += var1 * 639915885;
            if (this.frameCycle * 158616165 >= this.seqType.ax()) {
               this.isFinished = true;
            }
         }

      }
   }

   public static void an_renamed() {
      if (MouseHandler.MouseHandler_instance != null) {
         synchronized(MouseHandler.MouseHandler_instance) {
            MouseHandler.MouseHandler_instance = null;
         }
      }

   }

   static final void is_renamed(int var0, int var1) {
      if (var0 < 128) {
         var0 = 128;
      } else if (var0 > 383) {
         var0 = 383;
      }

      if (1897923909 * WorldMapSectionType.ky < var0) {
         WorldMapSectionType.ky += 528729485 * (MapElementType.uv * 942361787 * (var0 - WorldMapSectionType.ky * 1897923909) / 1000 + 1039880989 * Archive.up);
         if (1897923909 * WorldMapSectionType.ky > var0) {
            WorldMapSectionType.ky = 528729485 * var0;
         }
      } else if (1897923909 * WorldMapSectionType.ky > var0) {
         WorldMapSectionType.ky -= (MapElementType.uv * 942361787 * (WorldMapSectionType.ky * 1897923909 - var0) / 1000 + Archive.up * 1039880989) * 528729485;
         if (WorldMapSectionType.ky * 1897923909 < var0) {
            WorldMapSectionType.ky = var0 * 528729485;
         }
      }

      var1 &= 2047;
      int var3 = var1 - ek.kh * -1010818347;
      if (var3 > 1024) {
         var3 -= 2048;
      } else if (var3 < -1024) {
         var3 += 2048;
      }

      if (var3 > 0) {
         ek.kh += -1545206147 * (var3 * 942361787 * MapElementType.uv / 1000 + 1039880989 * Archive.up);
         ek.kh = (ek.kh * -1010818347 & 2047) * -1545206147;
      } else if (var3 < 0) {
         ek.kh -= -1545206147 * (1039880989 * Archive.up + -var3 * 942361787 * MapElementType.uv / 1000);
         ek.kh = (ek.kh * -1010818347 & 2047) * -1545206147;
      }

      int var4 = var1 - ek.kh * -1010818347;
      if (var4 > 1024) {
         var4 -= 2048;
      } else if (var4 < -1024) {
         var4 += 2048;
      }

      if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
         ek.kh = var1 * -1545206147;
      }

   }
}
