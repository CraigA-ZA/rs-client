import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class pk {
   final oe ac;
   final Map an;
   final Comparator af;
   final long au;
   final py ab;
   final oe aw;
   final int aq;

   boolean af() {
      return this.aq * 1638192103 != -1;
   }

   pk(long var1, int var3, py var4) {
      this.af = new pg(this);
      this.au = var1 * -6559155621149475795L;
      this.aq = 1806471127 * var3;
      this.ab = var4;
      if (-1 == this.aq * 1638192103) {
         this.an = new HashMap(64);
         this.aw = new oe(64, this.af);
         this.ac = null;
      } else {
         if (null == this.ab) {
            throw new IllegalArgumentException("");
         }

         this.an = new HashMap(1638192103 * this.aq);
         this.aw = new oe(this.aq * 1638192103, this.af);
         this.ac = new oe(1638192103 * this.aq);
      }

   }

   public pk(int var1, py var2) {
      this(-1L, var1, var2);
   }

   public Object aw(Object var1, Object var2) {
      synchronized(this) {
         if (this.au * -5966338096779578459L != -1L) {
            this.au();
         }

         pj var5 = (pj)this.an.get(var1);
         if (null != var5) {
            Object var9 = var5.af;
            var5.af = var2;
            this.ac(var5, false);
            return var9;
         } else {
            pj var6;
            if (this.af() && this.an.size() == 1638192103 * this.aq) {
               var6 = (pj)this.ac.remove();
               this.an.remove(var6.an);
               this.aw.remove(var6);
            }

            var6 = new pj(var2, var1);
            this.an.put(var1, var6);
            this.ac(var6, true);
            return null;
         }
      }
   }

   void ac(pj var1, boolean var2) {
      if (!var2) {
         this.aw.remove(var1);
         if (this.af() && !this.ac.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.aw = System.currentTimeMillis() * -766817315095904517L;
      if (this.af()) {
         switch (-1101065145 * this.ab.aw) {
            case 0:
               var1.ac += -6212029956567734047L;
               break;
            case 1:
               var1.ac = var1.aw * 8282359513895223507L;
         }

         this.ac.add(var1);
      }

      this.aw.add(var1);
   }

   void au() {
      if (-5966338096779578459L * this.au == -1L) {
         throw new IllegalStateException("");
      } else {
         long var2 = System.currentTimeMillis() - -5966338096779578459L * this.au;

         while(!this.aw.isEmpty()) {
            pj var4 = (pj)this.aw.peek();
            if (3457501928509627443L * var4.aw >= var2) {
               return;
            }

            this.an.remove(var4.an);
            this.aw.remove(var4);
            if (this.af()) {
               this.ac.remove(var4);
            }
         }

      }
   }

   public static void ay_renamed() {
      tx.ac = null;
      ar.au = null;
      dd.ab = null;
      fd.aq = null;
      pc.al = null;
      VarBitType.at = (byte[][])null;
   }

   public Object an(Object var1) {
      synchronized(this) {
         if (-1L != -5966338096779578459L * this.au) {
            this.au();
         }

         pj var4 = (pj)this.an.get(var1);
         if (null == var4) {
            return null;
         } else {
            this.ac(var4, false);
            return var4.af;
         }
      }
   }

   public void ab() {
      synchronized(this) {
         this.an.clear();
         this.aw.clear();
         if (this.af()) {
            this.ac.clear();
         }

      }
   }
}
