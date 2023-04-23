public class ChatChannel {
   static int cz;
   static Rasterizer3D jb;
   Message[] an = new Message[100];
   int aw;

   static final IterableNodeHashTable readStringIntParameters(Packet var0, IterableNodeHashTable var1) {
      int var3 = var0.g1();
      int var4;
      if (null == var1) {
         var4 = co.ab_renamed(var3);
         var1 = new IterableNodeHashTable(var4);
      }

      for(var4 = 0; var4 < var3; ++var4) {
         boolean var5 = var0.g1() == 1;
         int var6 = var0.cr();
         Object var7;
         if (var5) {
            var7 = new ObjectNode(var0.cw());
         } else {
            var7 = new IntegerNode(var0.g4s());
         }

         var1.put((Node)var7, (long)var6);
      }

      return var1;
   }

   ChatChannel() {
   }

   Message addMessage(int var1, String var2, String var3, String var4) {
      Message var6 = this.an[99];

      for(int var7 = -1742939983 * this.aw; var7 > 0; --var7) {
         if (var7 != 100) {
            this.an[var7] = this.an[var7 - 1];
         }
      }

      if (var6 == null) {
         var6 = new Message(var1, var2, var4, var3);
      } else {
         var6.remove();
         var6.removeDual();
         var6.set(var1, var2, var4, var3);
      }

      this.an[0] = var6;
      if (this.aw * -1742939983 < 100) {
         this.aw += 632451153;
      }

      return var6;
   }

   Message getMessage(int var1) {
      return var1 >= 0 && var1 < -1742939983 * this.aw ? this.an[var1] : null;
   }

   int size() {
      return this.aw * -1742939983;
   }

   public static void bq_renamed(Component var0, int var1, int var2) {
      var0.dd.aw[var1] = var2;
      var0.dd.ax();
   }
}
