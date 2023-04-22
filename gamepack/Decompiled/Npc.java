public final class Npc extends Actor {
   int au = 2139129811;
   String aw = "";
   static int aa = -1963015503;
   hv aq;
   hs af;
   static int al = -1714612375;
   hv at;
   sx ab;

   protected final it getModel() {
      if (this.af == null) {
         return null;
      } else {
         SeqType var2 = -1 != -1372355773 * this.ct && 1253892101 * this.dm == 0 ? Inventory.getSeqType(-1372355773 * this.ct, (byte)94) : null;
         SeqType var3 = -1 == -1302441815 * this.cz || this.cz * -1302441815 == this.bt * 1590591885 && var2 != null ? null : Inventory.getSeqType(-1302441815 * this.cz, (byte)39);
         it var4 = null;
         if (this.aq != null && this.aq.au) {
            var4 = MusicPatchNode.localPlayer.appearance.aa(var2, -41215169 * this.cp, var3, this.cw * 424813829);
         } else {
            var4 = this.af.ab(var2, this.cp * -41215169, var3, this.cw * 424813829, this.aq);
         }

         if (null == var4) {
            return null;
         } else {
            var4.ai();
            this.de = var4.et * 2070391287;
            int var5 = var4.ao;
            var4 = this.cp(var4);
            if (1458410691 * this.af.al == 1) {
               var4.bx = true;
            }

            if (this.dq != 0 && Client.ep * -1886224337 >= 1182789041 * this.dh && -1886224337 * Client.ep < 707232483 * this.dp) {
               var4.cj = this.du;
               var4.ch = this.db;
               var4.ct = this.df;
               var4.cp = this.dq;
               var4.cd = (short)var5;
            } else {
               var4.cp = 0;
            }

            return var4;
         }
      }
   }

   void af(String var1) {
      this.aw = null == var1 ? "" : var1;
   }

   final void aa(int var1, iu var2) {
      int var4 = this.dy[0];
      int var5 = this.ds[0];
      if (var1 == 0) {
         --var4;
         ++var5;
      }

      if (var1 == 1) {
         ++var5;
      }

      if (var1 == 2) {
         ++var4;
         ++var5;
      }

      if (3 == var1) {
         --var4;
      }

      if (var1 == 4) {
         ++var4;
      }

      if (var1 == 5) {
         --var4;
         --var5;
      }

      if (6 == var1) {
         --var5;
      }

      if (var1 == 7) {
         ++var4;
         --var5;
      }

      if (-1372355773 * this.ct != -1 && Inventory.getSeqType(-1372355773 * this.ct, (byte)121).bi * 1957040329 == 1) {
         this.ct = 1690721941;
      }

      if (1134756167 * this.dn < 9) {
         this.dn += 400971895;
      }

      for(int var6 = this.dn * 1134756167; var6 > 0; --var6) {
         this.dy[var6] = this.dy[var6 - 1];
         this.ds[var6] = this.ds[var6 - 1];
         this.da[var6] = this.da[var6 - 1];
      }

      this.dy[0] = var4;
      this.ds[0] = var5;
      this.da[0] = var2;
   }

   final void ay(int var1, int var2, boolean var3) {
      if (-1 != this.ct * -1372355773 && Inventory.getSeqType(this.ct * -1372355773, (byte)0).bi * 1957040329 == 1) {
         this.ct = 1690721941;
      }

      if (!var3) {
         int var5 = var1 - this.dy[0];
         int var6 = var2 - this.ds[0];
         if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
            if (this.dn * 1134756167 < 9) {
               this.dn += 400971895;
            }

            for(int var7 = this.dn * 1134756167; var7 > 0; --var7) {
               this.dy[var7] = this.dy[var7 - 1];
               this.ds[var7] = this.ds[var7 - 1];
               this.da[var7] = this.da[var7 - 1];
            }

            this.dy[0] = var1;
            this.ds[0] = var2;
            this.da[0] = iu.aw;
            return;
         }
      }

      this.dn = 0;
      this.eo = 0;
      this.ep = 0;
      this.dy[0] = var1;
      this.ds[0] = var2;
      this.bx = -1102445696 * this.dy[0] + -1606165824 * this.bm;
      this.bo = this.bm * 254242752 + -1887439488 * this.ds[0];
   }

   final boolean as() {
      return null != this.af;
   }

   int[] ao() {
      return this.ab != null ? this.ab.af() : this.af.ag();
   }

   void ai(int var1, int var2, short var3) {
      if (this.ab == null) {
         this.ab = new sx(this.af);
      }

      this.ab.aw(var1, var2, var3);
   }

   void av(hv var1) {
      this.at = var1;
   }

   hv ar() {
      return this.at;
   }

   void am(hv var1) {
      this.aq = var1;
   }

   void ak() {
      this.aq = null;
   }

   short[] ax() {
      return this.ab != null ? this.ab.an() : this.af.av();
   }

   void ag(int[] var1, short[] var2) {
      if (this.ab == null) {
         this.ab = new sx(this.af);
      }

      this.ab.ac(var1, var2);
   }

   boolean ac(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (-189357307 * this.au & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   final String at() {
      if (!this.aw.isEmpty()) {
         return this.aw;
      } else {
         hs var2 = this.af;
         if (null != var2.bn) {
            var2 = var2.at();
            if (null == var2) {
               var2 = this.af;
            }
         }

         return var2.aq;
      }
   }

   void ah() {
      this.ab = null;
   }

   void aw(int var1) {
      this.au = 1731572173 * var1;
   }

   void aj() {
      this.at = null;
   }

   Npc() {
   }

   static final float au_renamed(int var0) {
      float var2 = 10075.0F - (float)var0;
      return (var2 * 1.0075567F - 75.56675F) / var2;
   }

   public static void af_renamed(AbstractArchive var0) {
      InvType.af = var0;
   }

   protected static final void bz_renamed() {
      pj.clock.mark();

      int var1;
      for(var1 = 0; var1 < 32; ++var1) {
         GameShell.ax[var1] = 0L;
      }

      for(var1 = 0; var1 < 32; ++var1) {
         GameShell.ag[var1] = 0L;
      }

      DirectByteArrayCopier.aq = 0;
   }
}
