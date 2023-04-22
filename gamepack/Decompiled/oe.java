import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class oe extends AbstractQueue {
   Map an;
   int au;
   oh[] af;
   final Comparator ac;
   int aw;

   public oe(int var1, Comparator var2) {
      this.au = 0;
      this.af = new oh[var1];
      this.an = new HashMap();
      this.ac = var2;
   }

   public int size() {
      return -1960181101 * this.aw;
   }

   public boolean offer(Object var1) {
      if (this.an.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         this.au += 6390717;
         int var2 = this.aw * -1960181101;
         if (var2 >= this.af.length) {
            this.af();
         }

         this.aw += 1689217947;
         if (0 == var2) {
            this.af[0] = new oh(var1, 0);
            this.an.put(var1, this.af[0]);
         } else {
            this.af[var2] = new oh(var1, var2);
            this.an.put(var1, this.af[var2]);
            this.an(var2);
         }

         return true;
      }
   }

   public Object peek() {
      return this.aw * -1960181101 == 0 ? null : this.af[0].af;
   }

   public Object poll() {
      if (-1960181101 * this.aw == 0) {
         return null;
      } else {
         this.au += 6390717;
         Object var1 = this.af[0].af;
         this.an.remove(var1);
         this.aw -= 1689217947;
         if (this.aw * -1960181101 == 0) {
            this.af[-1960181101 * this.aw] = null;
         } else {
            this.af[0] = this.af[this.aw * -1960181101];
            this.af[0].an = 0;
            this.af[-1960181101 * this.aw] = null;
            this.aw(0);
         }

         return var1;
      }
   }

   public boolean remove(Object var1) {
      oh var2 = (oh)this.an.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         this.au += 6390717;
         this.aw -= 1689217947;
         if (var2.an * -1919098739 == this.aw * -1960181101) {
            this.af[-1960181101 * this.aw] = null;
            return true;
         } else {
            oh var3 = this.af[-1960181101 * this.aw];
            this.af[this.aw * -1960181101] = null;
            this.af[-1919098739 * var2.an] = var3;
            this.af[var2.an * -1919098739].an = var2.an * 1;
            this.aw(-1919098739 * var2.an);
            if (this.af[-1919098739 * var2.an] == var3) {
               this.an(-1919098739 * var2.an);
            }

            return true;
         }
      }
   }

   void an(int var1) {
      oh var3;
      int var4;
      for(var3 = this.af[var1]; var1 > 0; var1 = var4) {
         var4 = var1 - 1 >>> 1;
         oh var5 = this.af[var4];
         if (null != this.ac) {
            if (this.ac.compare(var3.af, var5.af) >= 0) {
               break;
            }
         } else if (((Comparable)var3.af).compareTo(var5.af) >= 0) {
            break;
         }

         this.af[var1] = var5;
         this.af[var1].an = -450371003 * var1;
      }

      this.af[var1] = var3;
      this.af[var1].an = -450371003 * var1;
   }

   void aw(int var1) {
      oh var3 = this.af[var1];

      int var9;
      for(int var4 = -1960181101 * this.aw >>> 1; var1 < var4; var1 = var9) {
         int var5 = (var1 << 1) + 1;
         oh var6 = this.af[var5];
         int var7 = 2 + (var1 << 1);
         oh var8 = this.af[var7];
         if (null != this.ac) {
            if (var7 < -1960181101 * this.aw && this.ac.compare(var6.af, var8.af) > 0) {
               var9 = var7;
            } else {
               var9 = var5;
            }
         } else if (var7 < -1960181101 * this.aw && ((Comparable)var6.af).compareTo(var8.af) > 0) {
            var9 = var7;
         } else {
            var9 = var5;
         }

         if (null != this.ac) {
            if (this.ac.compare(var3.af, this.af[var9].af) <= 0) {
               break;
            }
         } else if (((Comparable)var3.af).compareTo(this.af[var9].af) <= 0) {
            break;
         }

         this.af[var1] = this.af[var9];
         this.af[var1].an = -450371003 * var1;
      }

      this.af[var1] = var3;
      this.af[var1].an = -450371003 * var1;
   }

   public boolean contains(Object var1) {
      return this.an.containsKey(var1);
   }

   public Iterator iterator() {
      return new os(this);
   }

   public Object[] toArray() {
      Object[] var1 = super.toArray();
      if (this.ac != null) {
         Arrays.sort(var1, this.ac);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   void af() {
      int var2 = 1 + (this.af.length << 1);
      this.af = (oh[])((oh[])Arrays.copyOf(this.af, var2));
   }

   public oe(int var1) {
      this(var1, (Comparator)null);
   }

   static Object[] ac_renamed(Packet var0, int[] var1) {
      int var3 = var0.cd();
      Object[] var4 = new Object[var3 * var1.length];

      for(int var5 = 0; var5 < var3; ++var5) {
         for(int var6 = 0; var6 < var1.length; ++var6) {
            int var7 = var6 + var5 * var1.length;
            sh var8 = da.an_renamed(var1[var6]);
            var4[var7] = var8.at(var0);
         }
      }

      return var4;
   }
}
