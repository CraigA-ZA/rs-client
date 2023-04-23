public final class GraphicsObject extends Entity {
   static boolean sl;
   boolean aa = false;
   SeqType aq;
   int ab;
   int ac;
   int af;
   int al = 0;
   int an;
   int at = 0;
   int au;
   int aw;

   GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.af = var1 * -1726780687;
      this.aw = 1295796889 * var2;
      this.ac = var3 * -620581055;
      this.au = -652580511 * var4;
      this.ab = 186790935 * var5;
      this.an = 1889540095 * (var7 + var6);
      int var8 = Inventory.getSpotType(-1107802607 * this.af).aq * 374130911;
      if (var8 != -1) {
         this.aa = false;
         this.aq = Inventory.getSeqType(var8, (byte)52);
      } else {
         this.aa = true;
      }

   }

   final void advance(int var1) {
      if (!this.aa) {
         this.at += var1 * -1521037169;
         if (!this.aq.ao()) {
            while(this.at * -1355788689 > this.aq.av[this.al * 158616165]) {
               this.at -= this.aq.av[158616165 * this.al] * -1521037169;
               this.al += 639915885;
               if (158616165 * this.al >= this.aq.ag.length) {
                  this.aa = true;
                  break;
               }
            }
         } else {
            this.al += var1 * 639915885;
            if (this.al * 158616165 >= this.aq.ax()) {
               this.aa = true;
            }
         }

      }
   }

   public static void an_renamed() {
      if (MouseHandler.ac != null) {
         synchronized(MouseHandler.ac) {
            MouseHandler.ac = null;
         }
      }

   }

   protected final it getModel() {
      SpotType var2 = Inventory.getSpotType(-1107802607 * this.af);
      it var3;
      if (!this.aa) {
         var3 = var2.au(158616165 * this.al);
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
