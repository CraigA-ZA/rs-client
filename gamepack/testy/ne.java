import java.util.HashSet;
import java.util.Set;

public class ne implements nj {
   static final ne aq;
   static final ne an;
   static final ne aw;
   static final ne al;
   static final ne au;
   static final ne ax;
   public static String ak;
   static final ne ab;
   static final ne at;
   static final ne aa;
   static final ne ay;
   static final ne ac;
   static final int wr = 3;
   final int ai;
   final Set ag;
   static String gb;
   public static final int bb = 1;
   static final ne ao;
   static final int bd = 42;
   static final ne af;
   public static final int bi = 27;

   ne(String var1, int var2) {
      try {
         super();
         this.ag = new HashSet();
         this.ai = 1696685323 * var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ne.<init>(" + ')');
      }
   }

   static ne[] ab() {
      return new ne[]{aq, at, ab, af, ac, ay, an, ao, al, aw, au, ax, aa};
   }

   ne(String var1, int var2, nc[] var3) {
      try {
         super();
         this.ag = new HashSet();
         this.ai = var2 * 1696685323;
         nc[] var4 = var3;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            nc var6 = var4[var5];
            this.ag.add(var6);
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "ne.<init>(" + ')');
      }
   }

   public int af(int var1) {
      try {
         return this.ai * -336951645;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ne.af(" + ')');
      }
   }

   static ne[] au(byte var0) {
      try {
         return new ne[]{aq, at, ab, af, ac, ay, an, ao, al, aw, au, ax, aa};
      } catch (RuntimeException var1) {
         throw db.an(var1, "ne.au(" + ')');
      }
   }

   public int an() {
      return this.ai * 955467446;
   }

   static final void ay(mq var0, int var1, byte var2) {
      try {
         if (null == var0.en) {
            if (var2 >= 57) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            if (null == var0.hs) {
               if (var2 >= 57) {
                  throw new IllegalStateException();
               }

               var0.hs = new int[var0.en.length];
            }

            var0.hs[var1] = Integer.MAX_VALUE;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "ne.ay(" + ')');
      }
   }

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
      au((byte)-88);
   }

   public int ac() {
      return this.ai * -336951645;
   }

   static ne[] aq() {
      return new ne[]{aq, at, ab, af, ac, ay, an, ao, al, aw, au, ax, aa};
   }

   static ne[] al() {
      return new ne[]{aq, at, ab, af, ac, ay, an, ao, al, aw, au, ax, aa};
   }

   public int aw() {
      return this.ai * -336951645;
   }

   static String nh(String var0, int var1) {
      try {
         nz[] var2 = mr.au((byte)42);

         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var1 != 1227239523) {
               throw new IllegalStateException();
            }

            nz var4 = var2[var3];
            if (var4.am * 2138745227 != -1 && var0.startsWith(ns.af(var4.am * 2138745227, 938011940))) {
               if (var1 != 1227239523) {
                  throw new IllegalStateException();
               }

               var0 = var0.substring(6 + Integer.toString(var4.am * 2138745227).length());
               break;
            }
         }

         return var0;
      } catch (RuntimeException var5) {
         throw db.an(var5, "ne.nh(" + ')');
      }
   }

   static ne[] at() {
      return new ne[]{aq, at, ab, af, ac, ay, an, ao, al, aw, au, ax, aa};
   }
}
