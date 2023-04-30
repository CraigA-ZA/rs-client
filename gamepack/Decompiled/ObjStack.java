public final class ObjStack {
   int tileHeight;
   int height;
   int x;
   int y;
   Entity third;
   Entity first;
   Entity second;
   long tag;

   ObjStack() {
   }

   public static boolean au_renamed(int var0) {
      return var0 >= mc.aj.ad * -1344801027 && var0 <= mc.ak.ad * -1344801027;
   }

   static final void ka_renamed(boolean var0, PacketBit var1) {
      while(true) {
         byte var3 = 16;
         int var4 = 1 << var3;
         if (var1.bitsRemaining(889658999 * Client.packetWriter.serverPacket0Length) >= 12 + var3) {
            int var5 = var1.gBit(var3);
            if (var4 - 1 != var5) {
               boolean var6 = false;
               if (null == Client.npcs[var5]) {
                  Client.npcs[var5] = new Npc();
                  var6 = true;
               }

               Npc var7 = Client.npcs[var5];
               Client.npcIndices[(Client.npcCount += 1796101277) * 265474485 - 1] = var5;
               var7.dg = Client.ep * -1014023335;
               int var10;
               if (var0) {
                  var10 = var1.gBit(8);
                  if (var10 > 127) {
                     var10 -= 256;
                  }
               } else {
                  var10 = var1.gBit(5);
                  if (var10 > 15) {
                     var10 -= 32;
                  }
               }

               boolean var11 = var1.gBit(1) == 1;
               if (var11) {
                  var1.gBit(32);
               }

               int var12 = var1.gBit(1);
               if (1 == var12) {
                  Client.ih[(Client.ig += 1487412345) * 606834121 - 1] = var5;
               }

               int var8 = var1.gBit(1);
               var7.type = AbstractArchive.getNPCType(var1.gBit(14));
               int var9;
               if (var0) {
                  var9 = var1.gBit(8);
                  if (var9 > 127) {
                     var9 -= 256;
                  }
               } else {
                  var9 = var1.gBit(5);
                  if (var9 > 15) {
                     var9 -= 32;
                  }
               }

               int var13 = Client.nm[var1.gBit(3)];
               if (var6) {
                  var7.dd = (var7.bz = -1228309915 * var13) * 720096107;
               }

               fa.kg_renamed(var7);
               if (var7.dx * 351748387 == 0) {
                  var7.bz = 0;
               }

               var7.ay(var9 + MusicPatchNode.localPlayer.pathX[0], var10 + MusicPatchNode.localPlayer.pathY[0], 1 == var8);
               continue;
            }
         }

         var1.exportIndex();
         return;
      }
   }
}
