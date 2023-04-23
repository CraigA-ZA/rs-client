public class gs extends fb {
   static IndexedSprite ag;
   int af;
   // $FF: synthetic field
   final fa this$0;

   public static VarBitType an_renamed(int var0) {
      VarBitType var2 = (VarBitType)VarBitType.an.get((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = VarBitType.af.takeFile(14, var0);
         var2 = new VarBitType();
         if (var3 != null) {
            var2.decode(new Packet(var3));
         }

         VarBitType.an.put(var2, (long)var0);
         return var2;
      }
   }

   static void af_renamed() {
      if (TaskHandler.af.toLowerCase().indexOf("microsoft") != -1) {
         bi.dt[186] = 57;
         bi.dt[187] = 27;
         bi.dt[188] = 71;
         bi.dt[189] = 26;
         bi.dt[190] = 72;
         bi.dt[191] = 73;
         bi.dt[192] = 58;
         bi.dt[219] = 42;
         bi.dt[220] = 74;
         bi.dt[221] = 43;
         bi.dt[222] = 59;
         bi.dt[223] = 28;
      } else {
         bi.dt[44] = 71;
         bi.dt[45] = 26;
         bi.dt[46] = 72;
         bi.dt[47] = 73;
         bi.dt[59] = 57;
         bi.dt[61] = 27;
         bi.dt[91] = 42;
         bi.dt[92] = 74;
         bi.dt[93] = 43;
         bi.dt[192] = 28;
         bi.dt[222] = 58;
         bi.dt[520] = 59;
      }

   }

   gs(fa var1) {
      this.this$0 = var1;
      this.af = 536303009;
   }

   void write(Packet var1) {
      this.af = var1.cl() * -536303009;
   }

   void an(fj var1) {
      var1.ax(1899901343 * this.af, (byte)-1);
   }

   static void alignComponentSize(Component var0, int var1, int var2, boolean var3) {
      int var5 = var0.cs * -794961409;
      int var6 = var0.cc * 1473950221;
      if (var0.bv * 241981169 == 0) {
         var0.cs = -1212957085 * var0.bh;
      } else if (241981169 * var0.bv == 1) {
         var0.cs = 1774069247 * (var1 - var0.bh * -1960603747);
      } else if (var0.bv * 241981169 == 2) {
         var0.cs = 1774069247 * (var1 * var0.bh * -1960603747 >> 14);
      }

      if (-480604969 * var0.bl == 0) {
         var0.cc = 1850345051 * var0.bw;
      } else if (-480604969 * var0.bl == 1) {
         var0.cc = 60157125 * (var2 - 1756076191 * var0.bw);
      } else if (var0.bl * -480604969 == 2) {
         var0.cc = 60157125 * (var2 * 1756076191 * var0.bw >> 14);
      }

      if (var0.bv * 241981169 == 4) {
         var0.cs = 1774069247 * (var0.cn * 640195305 * 1473950221 * var0.cc / (276729069 * var0.ca));
      }

      if (4 == var0.bl * -480604969) {
         var0.cc = var0.ca * 276729069 * var0.cs * -794961409 / (var0.cn * 640195305) * 60157125;
      }

      if (1337 == 1021339961 * var0.bf) {
         Client.ps = var0;
      }

      if (12 == var0.bg * 883712245) {
         var0.bj().aq(var0.cs * -794961409, 1473950221 * var0.cc);
      }

      if (var3 && null != var0.gh && (var0.cs * -794961409 != var5 || var0.cc * 1473950221 != var6)) {
         ClientScriptEvent var7 = new ClientScriptEvent();
         var7.aw = var0;
         var7.af = var0.gh;
         Client.rq.addFirst(var7);
      }

   }
}
