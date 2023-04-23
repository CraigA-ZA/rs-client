public class hf extends Node {
   static int[] ae;
   public int ac;
   public int au;
   public int aw;
   public Component ab;

   public hf(int var1, int var2, int var3, Component var4) {
      this.au = var1 * 104718613;
      this.aw = var2 * -1689391215;
      this.ac = -1488158589 * var3;
      this.ab = var4;
   }

   static sk ov_renamed(int var0) {
      sk var2 = (sk)Client.wq.get((long)var0);
      if (var2 == null) {
         var2 = new sk(PcmPlayer.archive14, oy.af_renamed(var0), BufferedSink.an_renamed(var0));
         Client.wq.put(var2, (long)var0);
      }

      return var2;
   }
}
