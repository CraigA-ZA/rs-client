public class GraphicsDefaults {
   public int scrollbar = -1395448323;
   public int headiconshint = 524907877;
   public int headiconspk = -1245415821;
   public int compass = -658978373;
   public int cross = 1802127851;
   public int mapedge = 363664783;
   public int mapmarker = -805566907;
   public int mapdots = -2096300737;
   public int headiconsprayer = 2051613563;
   public int mapscene = -18237505;
   public int modicons = 1797432843;

   public static gz af_renamed(int var0) {
      gz var2 = (gz)gz.aw.get((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = gz.af.takeFile(16, var0);
         var2 = new gz();
         if (var3 != null) {
            var2.an(new Packet(var3));
         }

         gz.aw.put(var2, (long)var0);
         return var2;
      }
   }

   public void decode(AbstractArchive var1) {
      byte[] var3 = var1.takeFileFlat(595484225 * DefaultsGroup.DefaultsGroup_graphics.group);
      Packet var4 = new Packet(var3);

      while(true) {
         int var5 = var4.g1();
         if (0 == var5) {
            return;
         }

         switch (var5) {
            case 1:
               var4.cr();
               break;
            case 2:
               this.compass = var4.gSmart2or4() * 658978373;
               this.mapedge = var4.gSmart2or4() * -363664783;
               this.mapscene = var4.gSmart2or4() * 18237505;
               this.headiconspk = var4.gSmart2or4() * 1245415821;
               this.headiconsprayer = var4.gSmart2or4() * -2051613563;
               this.headiconshint = var4.gSmart2or4() * -524907877;
               this.mapmarker = var4.gSmart2or4() * 805566907;
               this.cross = var4.gSmart2or4() * -1802127851;
               this.mapdots = var4.gSmart2or4() * 2096300737;
               this.scrollbar = var4.gSmart2or4() * 1395448323;
               this.modicons = var4.gSmart2or4() * -1797432843;
         }
      }
   }

   static final void jg_renamed() {
      for(GraphicsObject var1 = (GraphicsObject)Client.graphicsObjects.last(); var1 != null; var1 = (GraphicsObject)Client.graphicsObjects.previous()) {
         if (var1.id * 397044137 == -1727408401 * GameShell.plane && !var1.isFinished) {
            if (-1886224337 * Client.ep >= -1927288833 * var1.height) {
               var1.advance(Client.ja * -1795081153);
               if (var1.isFinished) {
                  var1.remove();
               } else {
                  bx.scene.ao(var1.id * 397044137, -1570643775 * var1.plane, -161744223 * var1.x, var1.y * -769506393, 60, var1, 0, -1L, false);
               }
            }
         } else {
            var1.remove();
         }
      }

   }
}
