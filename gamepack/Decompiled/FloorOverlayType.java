public class FloorOverlayType extends DualNode {
   public static EvictingDualNodeHashTable an = new EvictingDualNodeHashTable(64);
   public static AbstractArchive af;
   public boolean au = true;
   public int aa;
   public int ab = 1301405419;
   public int ac = 1885338535;
   public int al;
   public int ao;
   public int aq;
   public int at;
   public int aw = 0;
   public int ay;

   public void clear() {
      if (-2085280195 * this.ab != -1) {
         this.setHsl(this.ab * -2085280195);
         this.aa = this.aq * 1074072567;
         this.ay = -765667919 * this.al;
         this.ao = this.at * -1337679311;
      }

      this.setHsl(this.aw * 1889574527);
   }

   public void decode(Packet var1, int var2) {
      while(true) {
         int var4 = var1.g1();
         if (var4 == 0) {
            return;
         }

         this.decode0(var1, var4, var2);
      }
   }

   void decode0(Packet var1, int var2, int var3) {
      if (1 == var2) {
         this.aw = var1.cr() * -929226369;
      } else if (var2 == 2) {
         this.ac = var1.g1() * -1885338535;
      } else if (5 == var2) {
         this.au = false;
      } else if (var2 == 7) {
         this.ab = var1.cr() * -1301405419;
      } else if (8 == var2) {
      }

   }

   void setHsl(int var1) {
      double var3 = (double)(var1 >> 16 & 255) / 256.0;
      double var5 = (double)(var1 >> 8 & 255) / 256.0;
      double var7 = (double)(var1 & 255) / 256.0;
      double var9 = var3;
      if (var5 < var3) {
         var9 = var5;
      }

      if (var7 < var9) {
         var9 = var7;
      }

      double var11 = var3;
      if (var5 > var3) {
         var11 = var5;
      }

      if (var7 > var11) {
         var11 = var7;
      }

      double var13 = 0.0;
      double var15 = 0.0;
      double var17 = (var11 + var9) / 2.0;
      if (var9 != var11) {
         if (var17 < 0.5) {
            var15 = (var11 - var9) / (var9 + var11);
         }

         if (var17 >= 0.5) {
            var15 = (var11 - var9) / (2.0 - var11 - var9);
         }

         if (var11 == var3) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if (var5 == var11) {
            var13 = 2.0 + (var7 - var3) / (var11 - var9);
         } else if (var11 == var7) {
            var13 = 4.0 + (var3 - var5) / (var11 - var9);
         }
      }

      var13 /= 6.0;
      this.aq = (int)(256.0 * var13) * 1160271239;
      this.al = 1774787329 * (int)(var15 * 256.0);
      this.at = 1974763337 * (int)(256.0 * var17);
      if (470803713 * this.al < 0) {
         this.al = 0;
      } else if (470803713 * this.al > 255) {
         this.al = 1599202815;
      }

      if (532980473 * this.at < 0) {
         this.at = 0;
      } else if (this.at * 532980473 > 255) {
         this.at = 1053477303;
      }

   }

   static void ah_renamed(World var0) {
      if (var0.at() != Client.ca) {
         Client.ca = var0.at();
         boolean var2 = var0.at();
         if (gm.al != var2) {
            oq.as_renamed();
            gm.al = var2;
         }
      }

      if (-205173751 * Client.ce != 1810954985 * var0.ao) {
         Archive var4 = rr.fv;
         int var3 = 1810954985 * var0.ao;
         if ((var3 & 536870912) != 0) {
            Canvas.ay = MusicPatchNode2.au_renamed(var4, "logo_deadman_mode", "");
         } else if (0 != (var3 & 1073741824)) {
            Canvas.ay = MusicPatchNode2.au_renamed(var4, "logo_seasonal_mode", "");
         } else if ((var3 & 256) != 0) {
            Canvas.ay = MusicPatchNode2.au_renamed(var4, "logo_speedrunning", "");
         } else {
            Canvas.ay = MusicPatchNode2.au_renamed(var4, "logo", "");
         }
      }

      ea.gd = var0.ai;
      Client.bw = -2094155673 * var0.ay;
      Client.ce = var0.ao * 702001121;
      ClanChat.gw = (0 == -1274626977 * Client.cs ? 'ꩊ' : -2091224171 * var0.ay + '鱀') * -1326916691;
      ec.gc = (0 == Client.cs * -1274626977 ? 443 : '썐' + var0.ay * -2091224171) * -1927102761;
      Inventory.gf = ClanChat.gw * 518729065;
   }

   static int be_renamed(int var0, ClientScript var1, boolean var2) {
      return 2;
   }
}
