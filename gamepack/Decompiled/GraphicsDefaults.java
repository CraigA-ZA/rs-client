public class GraphicsDefaults {
   public int aa = -1395448323;
   public int ab = 524907877;
   public int ac = -1245415821;
   public int af = -658978373;
   public int al = 1802127851;
   public int an = 363664783;
   public int aq = -805566907;
   public int at = -2096300737;
   public int au = 2051613563;
   public int aw = -18237505;
   public int ay = 1797432843;

   public static gz af_renamed(int var0) {
      gz var2 = (gz)gz.aw.get((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = gz.af.takeFile(16, var0);
         var2 = new gz();
         if (var3 != null) {
            var2.decode(new Packet(var3));
         }

         gz.aw.put(var2, (long)var0);
         return var2;
      }
   }

   public void decode(AbstractArchive var1) {
      byte[] var3 = var1.takeFileFlat(595484225 * DefaultsGroup.af.an);
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
               this.af = var4.gSmart2or4() * 658978373;
               this.an = var4.gSmart2or4() * -363664783;
               this.aw = var4.gSmart2or4() * 18237505;
               this.ac = var4.gSmart2or4() * 1245415821;
               this.au = var4.gSmart2or4() * -2051613563;
               this.ab = var4.gSmart2or4() * -524907877;
               this.aq = var4.gSmart2or4() * 805566907;
               this.al = var4.gSmart2or4() * -1802127851;
               this.at = var4.gSmart2or4() * 2096300737;
               this.aa = var4.gSmart2or4() * 1395448323;
               this.ay = var4.gSmart2or4() * -1797432843;
         }
      }
   }

   static final void jg_renamed() {
      for(GraphicsObject var1 = (GraphicsObject)Client.np.last(); var1 != null; var1 = (GraphicsObject)Client.np.previous()) {
         if (var1.aw * 397044137 == -1727408401 * GameShell.mh && !var1.aa) {
            if (-1886224337 * Client.ep >= -1927288833 * var1.an) {
               var1.advance(Client.ja * -1795081153);
               if (var1.aa) {
                  var1.remove();
               } else {
                  bx.js.ao(var1.aw * 397044137, -1570643775 * var1.ac, -161744223 * var1.au, var1.ab * -769506393, 60, var1, 0, -1L, false);
               }
            }
         } else {
            var1.remove();
         }
      }

   }
}
