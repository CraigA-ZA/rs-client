public final class GraphicsObject extends Entity {
   static boolean sl;
   boolean isFinished = false;
   SeqType seqType;
   int height;
   int x;
   int id;
   int frame = 0;
   int cycleStart;
   int frameCycle = 0;
   int y;
   int plane;

   GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.id = var1 * -1726780687;
      this.plane = 1295796889 * var2;
      this.x = var3 * -620581055;
      this.y = -652580511 * var4;
      this.height = 186790935 * var5;
      this.cycleStart = 1889540095 * (var7 + var6);
      int var8 = Inventory.getSpotType(-1107802607 * this.id).sequence * 374130911;
      if (var8 != -1) {
         this.isFinished = false;
         this.seqType = Inventory.getSeqType(var8, (byte)52);
      } else {
         this.isFinished = true;
      }

   }

   final void advance(int var1) {
      if (!this.isFinished) {
         this.frameCycle += var1 * -1521037169;
         if (!this.seqType.ao()) {
            while(this.frameCycle * -1355788689 > this.seqType.frameLengths[this.frame * 158616165]) {
               this.frameCycle -= this.seqType.frameLengths[158616165 * this.frame] * -1521037169;
               this.frame += 639915885;
               if (158616165 * this.frame >= this.seqType.frameIds.length) {
                  this.isFinished = true;
                  break;
               }
            }
         } else {
            this.frame += var1 * 639915885;
            if (this.frame * 158616165 >= this.seqType.ax()) {
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

   protected final Model getModel() {
      SpotType var2 = Inventory.getSpotType(-1107802607 * this.id);
      Model var3;
      if (!this.isFinished) {
         var3 = var2.au(158616165 * this.frame);
      } else {
         var3 = var2.au(-1);
      }

      return var3 == null ? null : var3;
   }

   static final void ao(long var0) {
      ix.ag[(ix.ai += -429048361) * -1048050201 - 1] = var0;
   }

   static final void is_renamed(int var0, int var1) {
      if (var0 < 128) {
         var0 = 128;
      } else if (var0 > 383) {
         var0 = 383;
      }

      if (1897923909 * WorldMapSectionType.cameraPitch < var0) {
         WorldMapSectionType.cameraPitch += 528729485 * (MapElementType.uv * 942361787 * (var0 - WorldMapSectionType.cameraPitch * 1897923909) / 1000 + 1039880989 * Archive.up);
         if (1897923909 * WorldMapSectionType.cameraPitch > var0) {
            WorldMapSectionType.cameraPitch = 528729485 * var0;
         }
      } else if (1897923909 * WorldMapSectionType.cameraPitch > var0) {
         WorldMapSectionType.cameraPitch -= (MapElementType.uv * 942361787 * (WorldMapSectionType.cameraPitch * 1897923909 - var0) / 1000 + Archive.up * 1039880989) * 528729485;
         if (WorldMapSectionType.cameraPitch * 1897923909 < var0) {
            WorldMapSectionType.cameraPitch = var0 * 528729485;
         }
      }

      var1 &= 2047;
      int var3 = var1 - ek.cameraYaw * -1010818347;
      if (var3 > 1024) {
         var3 -= 2048;
      } else if (var3 < -1024) {
         var3 += 2048;
      }

      if (var3 > 0) {
         ek.cameraYaw += -1545206147 * (var3 * 942361787 * MapElementType.uv / 1000 + 1039880989 * Archive.up);
         ek.cameraYaw = (ek.cameraYaw * -1010818347 & 2047) * -1545206147;
      } else if (var3 < 0) {
         ek.cameraYaw -= -1545206147 * (1039880989 * Archive.up + -var3 * 942361787 * MapElementType.uv / 1000);
         ek.cameraYaw = (ek.cameraYaw * -1010818347 & 2047) * -1545206147;
      }

      int var4 = var1 - ek.cameraYaw * -1010818347;
      if (var4 > 1024) {
         var4 -= 2048;
      } else if (var4 < -1024) {
         var4 += 2048;
      }

      if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
         ek.cameraYaw = var1 * -1545206147;
      }

   }
}
