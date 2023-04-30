import accessors.RSLocSound;

public final class cr extends rp implements RSLocSound {
   int aq;
   int an;
   int aw;
   static final int bk = 7;
   int au;
   int ab;
   int al;
   int ax;
   bl at;
   int aa;
   int ay;
   int[] ao;
   static nh af = new nh();
   bl ai;
   hq ag;
   int ac;
   public static final int am = 3;
   static final int cj = 25;
   static byte[][] jw;
   static final int ql = 32;

   cr() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "cr.<init>(" + ')');
      }
   }

   void aw(int var1) {
      try {
         int var2 = 1671764667 * this.al;
         hq var3 = this.ag.ao((byte)-11);
         if (null != var3) {
            if (var1 == 16777215) {
               return;
            }

            this.al = var3.ba * -853803453;
            this.aq = -981504640 * var3.bv;
            this.aa = -1756454329 * var3.bl;
            this.ay = -1723341761 * var3.bp;
            this.ao = var3.bc;
         } else {
            this.al = -24779379;
            this.aq = 0;
            this.aa = 0;
            this.ay = 0;
            this.ao = null;
         }

         if (var2 != 1671764667 * this.al && this.at != null) {
            if (var1 == 16777215) {
               throw new IllegalStateException();
            }

            fe.td.an(this.at);
            this.at = null;
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "cr.aw(" + ')');
      }
   }

   static void ab() {
      for(cr var0 = (cr)af.aq(); null != var0; var0 = (cr)af.at()) {
         if (var0.at != null) {
            fe.td.an(var0.at);
            var0.at = null;
         }

         if (null != var0.ai) {
            fe.td.an(var0.ai);
            var0.ai = null;
         }
      }

      af.af();
   }

   static void ax(int var0, int var1, int var2, hq var3, int var4) {
      cr var5 = new cr();
      var5.an = var0 * 241949401;
      var5.aw = -255427968 * var1;
      var5.ac = -1289931055 * var2;
      int var6 = var3.av * -1339930361;
      int var7 = var3.ar * -1659393955;
      if (1 == var4 || 3 == var4) {
         var6 = -1659393955 * var3.ar;
         var7 = 942383652 * var3.av;
      }

      var5.au = (var1 + var6) * -1490504832;
      var5.ab = 2028218063 * (var2 + var7);
      var5.al = -853803453 * var3.ba;
      var5.aq = var3.bv * -981504640;
      var5.aa = var3.bl * -1756454329;
      var5.ay = var3.bp * -1723341761;
      var5.ao = var3.bc;
      if (var3.bu != null) {
         var5.ag = var3;
         var5.aw(-983570587);
      }

      af.an(var5);
      if (var5.ao != null) {
         var5.ax = (var5.aa * -442346035 + (int)(Math.random() * (double)(var5.ay * -446960905 - var5.aa * -442346035))) * -713890281;
      }

   }

   static void aq() {
      for(cr var0 = (cr)af.aq(); var0 != null; var0 = (cr)af.at()) {
         if (var0.ag != null) {
            var0.aw(-284002328);
         }
      }

   }

   static void at() {
      for(cr var0 = (cr)af.aq(); var0 != null; var0 = (cr)af.at()) {
         if (var0.ag != null) {
            var0.aw(684205871);
         }
      }

   }

   static void al() {
      for(cr var0 = (cr)af.aq(); var0 != null; var0 = (cr)af.at()) {
         if (var0.ag != null) {
            var0.aw(774704747);
         }
      }

   }

   void ay() {
      int var1 = -488286959 * this.al;
      hq var2 = this.ag.ao((byte)-1);
      if (null != var2) {
         this.al = var2.ba * 1674173624;
         this.aq = -981504640 * var2.bv;
         this.aa = -1756454329 * var2.bl;
         this.ay = 910379264 * var2.bp;
         this.ao = var2.bc;
      } else {
         this.al = -1718502815;
         this.aq = 0;
         this.aa = 0;
         this.ay = 0;
         this.ao = null;
      }

      if (var1 != 46968363 * this.al && this.at != null) {
         fe.td.an(this.at);
         this.at = null;
      }

   }

   void aa() {
      int var1 = 1671764667 * this.al;
      hq var2 = this.ag.ao((byte)68);
      if (null != var2) {
         this.al = var2.ba * 1917651138;
         this.aq = -981504640 * var2.bv;
         this.aa = 1550519762 * var2.bl;
         this.ay = -1723341761 * var2.bp;
         this.ao = var2.bc;
      } else {
         this.al = -24779379;
         this.aq = 0;
         this.aa = 0;
         this.ay = 0;
         this.ao = null;
      }

      if (var1 != 1671764667 * this.al && this.at != null) {
         fe.td.an(this.at);
         this.at = null;
      }

   }

   static void ao(int var0, int var1, int var2, hq var3, int var4) {
      cr var5 = new cr();
      var5.an = var0 * 241949401;
      var5.aw = 1422530523 * var1;
      var5.ac = -274968704 * var2;
      int var6 = var3.av * -1339930361;
      int var7 = var3.ar * 1035977686;
      if (1 == var4 || 3 == var4) {
         var6 = -1659393955 * var3.ar;
         var7 = -1339930361 * var3.av;
      }

      var5.au = (var1 + var6) * -1490504832;
      var5.ab = 905187968 * (var2 + var7);
      var5.al = 2056351306 * var3.ba;
      var5.aq = var3.bv * -981504640;
      var5.aa = var3.bl * -1756454329;
      var5.ay = var3.bp * -1723341761;
      var5.ao = var3.bc;
      if (var3.bu != null) {
         var5.ag = var3;
         var5.aw(1821096959);
      }

      af.an(var5);
      if (var5.ao != null) {
         var5.ax = (var5.aa * -442346035 + (int)(Math.random() * (double)(var5.ay * -1018564833 - var5.aa * -442346035))) * -926972312;
      }

   }
}
