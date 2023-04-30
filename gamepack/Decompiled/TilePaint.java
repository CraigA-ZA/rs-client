public final class TilePaint {
   boolean isFlat = true;
   int nwColor;
   int swColor;
   int seColor;
   int rgb;
   int texture;
   int neColor;

   TilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.swColor = var1 * 1110698183;
      this.seColor = 450282055 * var2;
      this.neColor = var3 * -615792113;
      this.nwColor = var4 * 1943953885;
      this.texture = 1567743091 * var5;
      this.rgb = 810771411 * var6;
      this.isFlat = var7;
   }

   public static String aw_renamed(Packet var0) {
      String var2;
      try {
         int var3 = var0.cd();
         if (var3 > 32767) {
            var3 = 32767;
         }

         byte[] var4 = new byte[var3];
         var0.index += mv.huffman.an(var0.array, -1633313603 * var0.index, var4, 0, var3) * -1516355947;
         String var5 = Packet.decodeStringCp1252(var4, 0, var3);
         var2 = var5;
      } catch (Exception var6) {
         var2 = "Cabbage";
      }

      return var2;
   }

   static int ak_renamed(int var0, ClientScript var1, boolean var2) {
      Component var4;
      if (var0 == 2700) {
         var4 = gh.getInterfaceComponent(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -2006098851 * var4.itemId;
         return 1;
      } else if (var0 == 2701) {
         var4 = gh.getInterfaceComponent(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
         if (var4.itemId * -2006098851 != -1) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.itemQuantity * 1336975799;
         } else {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
         }

         return 1;
      } else if (2702 == var0) {
         int var8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var8);
         if (null != var5) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
         } else {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
         }

         return 1;
      } else if (2706 == var0) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.or * -896157613;
         return 1;
      } else if (2707 == var0) {
         var4 = gh.getInterfaceComponent(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4.by() ? 1 : 0;
         return 1;
      } else if (2708 == var0) {
         var4 = gh.getInterfaceComponent(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
         return BufferedSource.ah_renamed(var4);
      } else if (var0 == 2709) {
         var4 = gh.getInterfaceComponent(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
         return au.av_renamed(var4);
      } else {
         return 2;
      }
   }

   static final void addMiniMenuEntry(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (!Client.isMiniMenuOpen) {
         if (Client.menuOptionsCount * 730065501 < 500) {
            Client.menuActions[730065501 * Client.menuOptionsCount] = var0;
            Client.menuTargetNames[Client.menuOptionsCount * 730065501] = var1;
            Client.menuOpcodes[730065501 * Client.menuOptionsCount] = var2;
            Client.menuArguments0[730065501 * Client.menuOptionsCount] = var3;
            Client.menuArguments1[Client.menuOptionsCount * 730065501] = var4;
            Client.menuArguments2[730065501 * Client.menuOptionsCount] = var5;
            Client.oi[Client.menuOptionsCount * 730065501] = var6;
            Client.menuShiftClick[730065501 * Client.menuOptionsCount] = var7;
            Client.menuOptionsCount += 1153055221;
         }

      }
   }
}
