public class gs extends fb {
   static IndexedSprite ag;
   int af;
   // $FF: synthetic field
   final fa this$0;

   public static VarBitType an_renamed(int var0) {
      VarBitType var2 = (VarBitType)VarBitType.VarBitType_cached.get((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = VarBitType.VarBitType_archive.takeFile(14, var0);
         var2 = new VarBitType();
         if (var3 != null) {
            var2.aw(new Packet(var3));
         }

         VarBitType.VarBitType_cached.put(var2, (long)var0);
         return var2;
      }
   }

   static void af_renamed() {
      if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
         bi.KeyHandler_keyCodes[186] = 57;
         bi.KeyHandler_keyCodes[187] = 27;
         bi.KeyHandler_keyCodes[188] = 71;
         bi.KeyHandler_keyCodes[189] = 26;
         bi.KeyHandler_keyCodes[190] = 72;
         bi.KeyHandler_keyCodes[191] = 73;
         bi.KeyHandler_keyCodes[192] = 58;
         bi.KeyHandler_keyCodes[219] = 42;
         bi.KeyHandler_keyCodes[220] = 74;
         bi.KeyHandler_keyCodes[221] = 43;
         bi.KeyHandler_keyCodes[222] = 59;
         bi.KeyHandler_keyCodes[223] = 28;
      } else {
         bi.KeyHandler_keyCodes[44] = 71;
         bi.KeyHandler_keyCodes[45] = 26;
         bi.KeyHandler_keyCodes[46] = 72;
         bi.KeyHandler_keyCodes[47] = 73;
         bi.KeyHandler_keyCodes[59] = 57;
         bi.KeyHandler_keyCodes[61] = 27;
         bi.KeyHandler_keyCodes[91] = 42;
         bi.KeyHandler_keyCodes[92] = 74;
         bi.KeyHandler_keyCodes[93] = 43;
         bi.KeyHandler_keyCodes[192] = 28;
         bi.KeyHandler_keyCodes[222] = 58;
         bi.KeyHandler_keyCodes[520] = 59;
      }

   }

   gs(fa var1) {
      this.this$0 = var1;
      this.af = 536303009;
   }

   void af(Packet var1) {
      this.af = var1.cl() * -536303009;
   }

   void an(fj var1) {
      var1.ax(1899901343 * this.af, (byte)-1);
   }

   static void alignComponentSize(Component var0, int var1, int var2, boolean var3) {
      int var5 = var0.width * -794961409;
      int var6 = var0.height * 1473950221;
      if (var0.widthAlignment * 241981169 == 0) {
         var0.width = -1212957085 * var0.rawWidth;
      } else if (241981169 * var0.widthAlignment == 1) {
         var0.width = 1774069247 * (var1 - var0.rawWidth * -1960603747);
      } else if (var0.widthAlignment * 241981169 == 2) {
         var0.width = 1774069247 * (var1 * var0.rawWidth * -1960603747 >> 14);
      }

      if (-480604969 * var0.heightAlignment == 0) {
         var0.height = 1850345051 * var0.rawHeight;
      } else if (-480604969 * var0.heightAlignment == 1) {
         var0.height = 60157125 * (var2 - 1756076191 * var0.rawHeight);
      } else if (var0.heightAlignment * -480604969 == 2) {
         var0.height = 60157125 * (var2 * 1756076191 * var0.rawHeight >> 14);
      }

      if (var0.widthAlignment * 241981169 == 4) {
         var0.width = 1774069247 * (var0.cn * 640195305 * 1473950221 * var0.height / (276729069 * var0.ca));
      }

      if (4 == var0.heightAlignment * -480604969) {
         var0.height = var0.ca * 276729069 * var0.width * -794961409 / (var0.cn * 640195305) * 60157125;
      }

      if (1337 == 1021339961 * var0.clientCode) {
         Client.ps = var0;
      }

      if (12 == var0.bg * 883712245) {
         var0.bj().aq(var0.width * -794961409, 1473950221 * var0.height);
      }

      if (var3 && null != var0.gh && (var0.width * -794961409 != var5 || var0.height * 1473950221 != var6)) {
         ClientScriptEvent var7 = new ClientScriptEvent();
         var7.aw = var0;
         var7.args0 = var0.gh;
         Client.rq.addFirst(var7);
      }

   }
}
