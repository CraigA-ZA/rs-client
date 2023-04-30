final class dy implements lx {
   static final int bi = 19136896;
   static final int as = 7;
   public static final int bo = 131072;
   static final int tx = 1024;
   static int qw;
   // $FF: synthetic field
   final mq val$cc;

   dy(mq var1) {
      this.val$cc = var1;
   }

   public void af(int var1) {
      try {
         if (this.val$cc != null) {
            if (var1 != 427135973) {
               throw new IllegalStateException();
            }

            if (this.val$cc.br(-1420038959).ac != null) {
               dr var2 = new dr();
               var2.aw(this.val$cc, (byte)34);
               var2.af(this.val$cc.br(-110395550).ac, 1887161968);
               np.jk((byte)99).an(var2);
            }
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "dy.af(" + ')');
      }
   }

   public void au() {
      if (this.val$cc != null && this.val$cc.br(-1141661558).ac != null) {
         dr var1 = new dr();
         var1.aw(this.val$cc, (byte)-81);
         var1.af(this.val$cc.br(-1005785523).ac, -691983005);
         np.jk((byte)126).an(var1);
      }

   }

   public void aw() {
      if (this.val$cc != null && this.val$cc.br(-686746886).ac != null) {
         dr var1 = new dr();
         var1.aw(this.val$cc, (byte)-26);
         var1.af(this.val$cc.br(566372406).ac, 256382678);
         np.jk((byte)85).an(var1);
      }

   }

   public void ac() {
      if (this.val$cc != null && this.val$cc.br(-569931730).ac != null) {
         dr var1 = new dr();
         var1.aw(this.val$cc, (byte)-74);
         var1.af(this.val$cc.br(476476081).ac, 1995573311);
         np.jk((byte)11).an(var1);
      }

   }

   public void an() {
      if (this.val$cc != null && this.val$cc.br(-2115444779).ac != null) {
         dr var1 = new dr();
         var1.aw(this.val$cc, (byte)-86);
         var1.af(this.val$cc.br(90337492).ac, -396144798);
         np.jk((byte)119).an(var1);
      }

   }

   static final String ao(int var0, int var1) {
      try {
         if (var0 < 100000) {
            if (var1 <= 247431094) {
               throw new IllegalStateException();
            } else {
               return "<col=ffff00>" + var0 + "</col>";
            }
         } else if (var0 < 10000000) {
            if (var1 <= 247431094) {
               throw new IllegalStateException();
            } else {
               return "<col=ffffff>" + var0 / 1000 + mk.gv + "</col>";
            }
         } else {
            return "<col=00ff80>" + var0 / 1000000 + mk.gp + "</col>";
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "dy.ao(" + ')');
      }
   }

   static final int ai(int var0, int var1, int var2, byte var3) {
      try {
         int var4 = var0 / var2;
         int var5 = var0 & var2 - 1;
         int var6 = var1 / var2;
         int var7 = var1 & var2 - 1;
         int var8 = oa.ah(var4, var6, (byte)119);
         int var9 = oa.ah(1 + var4, var6, (byte)52);
         int var10 = oa.ah(var4, var6 + 1, (byte)117);
         int var11 = oa.ah(var4 + 1, var6 + 1, (byte)72);
         int var12 = gc.ag(var8, var9, var5, var2, (byte)-40);
         int var13 = gc.ag(var10, var11, var5, var2, (byte)-21);
         return gc.ag(var12, var13, var7, var2, (byte)-74);
      } catch (RuntimeException var14) {
         throw db.an(var14, "dy.ai(" + ')');
      }
   }
}
