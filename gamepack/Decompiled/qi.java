public class qi {
   qi() throws Throwable {
      throw new Error();
   }

   static final void updatePlayer(PacketBit var0) {
      var0.importIndex();
      int var2 = Client.localPlayerIndex * -549033243;
      Player var3 = MusicPatchNode.localPlayer = Client.players[var2] = new Player();
      var3.index = var2 * -710946309;
      int var4 = var0.gBit(30);
      byte var5 = (byte)(var4 >> 28);
      int var6 = var4 >> 14 & 16383;
      int var7 = var4 & 16383;
      var3.pathX[0] = var6 - jm.baseX * -1232093375;
      var3.bx = ((var3.pathX[0] << 7) + (var3.transformedSize() << 6)) * -881028089;
      var3.pathY[0] = var7 - 827352769 * Scenery.baseY;
      var3.bo = ((var3.pathY[0] << 7) + (var3.transformedSize() << 6)) * 1193213931;
      GameShell.plane = (var3.plane = var5 * -1829675965) * 1128021573;
      if (null != ds.au[var2]) {
         var3.read(ds.au[var2]);
      }

      ds.ab = 0;
      ds.aq[(ds.ab += 511936671) * -2010934433 - 1] = var2;
      ds.aw[var2] = 0;
      ds.al = 0;

      for(int var8 = 1; var8 < 2048; ++var8) {
         if (var8 != var2) {
            int var9 = var0.gBit(18);
            int var10 = var9 >> 16;
            int var11 = var9 >> 8 & 597;
            int var12 = var9 & 597;
            ds.Players_regions[var8] = (var10 << 28) + (var11 << 14) + var12;
            ds.ay[var8] = 0;
            ds.ao[var8] = -1;
            ds.at[(ds.al += 2033203949) * 228405989 - 1] = var8;
            ds.aw[var8] = 0;
         }
      }

      var0.exportIndex();
   }
}
