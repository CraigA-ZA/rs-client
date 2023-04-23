import java.util.HashSet;
import java.util.Set;

public class ne implements Enumerated {
   public static String osName;
   static String gb;
   static final ne aa;
   static final ne ab;
   static final ne ac;
   static final ne af;
   static final ne al;
   static final ne an;
   static final ne ao;
   static final ne aq;
   static final ne at;
   static final ne au;
   static final ne aw;
   static final ne ax;
   static final ne ay;
   final int ai;
   final Set ag = new HashSet();

   static {
      af = new ne("", 0, new nc[]{nc.aw});
      an = new ne("", 1, new nc[]{nc.an, nc.aw});
      aw = new ne("", 2, new nc[]{nc.an, nc.af, nc.aw});
      ac = new ne("", 3, new nc[]{nc.an});
      au = new ne("", 4);
      ab = new ne("", 5, new nc[]{nc.an, nc.aw});
      aq = new ne("", 6, new nc[]{nc.aw});
      al = new ne("", 8, new nc[]{nc.an, nc.aw});
      at = new ne("", 9, new nc[]{nc.an, nc.af});
      aa = new ne("", 10, new nc[]{nc.an});
      ay = new ne("", 11, new nc[]{nc.an});
      ao = new ne("", 12, new nc[]{nc.an, nc.aw});
      ax = new ne("", 13, new nc[]{nc.an});
      au_renamed();
   }

   static ne[] au_renamed() {
      return new ne[]{aq, at, ab, af, ac, ay, an, ao, al, aw, au, ax, aa};
   }

   ne(String var1, int var2) {
      this.ai = 1696685323 * var2;
   }

   ne(String var1, int var2, nc[] var3) {
      this.ai = var2 * 1696685323;
      nc[] var4 = var3;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         nc var6 = var4[var5];
         this.ag.add(var6);
      }

   }

   public int ordinal() {
      return this.ai * -336951645;
   }

   static final void ay_renamed(Component var0, int var1) {
      if (null == var0.en) {
         throw new RuntimeException();
      } else {
         if (null == var0.hs) {
            var0.hs = new int[var0.en.length];
         }

         var0.hs[var1] = Integer.MAX_VALUE;
      }
   }

   static String nh_renamed(String var0) {
      PlayerType[] var2 = StudioGame.au_renamed();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         PlayerType var4 = var2[var3];
         if (var4.id * 2138745227 != -1 && var0.startsWith(ArchiveDiskActionHandler.af_renamed(var4.id * 2138745227))) {
            var0 = var0.substring(6 + Integer.toString(var4.id * 2138745227).length());
            break;
         }
      }

      return var0;
   }
}
