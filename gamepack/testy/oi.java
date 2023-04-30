import accessors.RSIterableNodeDeque;
import java.util.Collection;
import java.util.Iterator;

public class oi implements Iterable, Collection, RSIterableNodeDeque {
   rp af = new rp();
   rp an;

   public Object[] ck(Object[] var1) {
      int var2 = 0;

      for(rp var3 = this.af.hc; var3 != this.af; var3 = var3.hc) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public void af() {
      while(this.af.hc != this.af) {
         this.af.hc.ga();
      }

   }

   public rp bb() {
      rp var1 = this.an;
      if (var1 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var1.hc;
         return var1;
      }
   }

   public void ah(rp var1) {
      if (var1.hg != null) {
         var1.ga();
      }

      var1.hg = this.af;
      var1.hc = this.af.hc;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
   }

   public static void ac(rp var0, rp var1) {
      if (var0.hg != null) {
         var0.ga();
      }

      var0.hg = var1;
      var0.hc = var1.hc;
      var0.hg.hc = var0;
      var0.hc.hg = var0;
   }

   public boolean at() {
      return this.af.hc == this.af;
   }

   public boolean bw(Object var1) {
      throw new RuntimeException();
   }

   public rp ap() {
      rp var1 = this.an;
      if (var1 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var1.hc;
         return var1;
      }
   }

   rp[] bj() {
      rp[] var1 = new rp[this.al()];
      int var2 = 0;

      for(rp var3 = this.af.hc; var3 != this.af; var3 = var3.hc) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean cj(Object var1) {
      return this.ay((rp)var1);
   }

   public boolean bo() {
      return this.af.hc == this.af;
   }

   public int size() {
      return this.al();
   }

   public boolean cl(Collection var1) {
      throw new RuntimeException();
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.aa();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(rp var3 = this.af.hc; var3 != this.af; var3 = var3.hc) {
         var1[var2++] = var3;
      }

      return var1;
   }

   boolean ay(rp var1) {
      this.an(var1);
      return true;
   }

   public boolean bz() {
      return this.af.hc == this.af;
   }

   public boolean cr(Collection var1) {
      throw new RuntimeException();
   }

   public rp aq() {
      rp var1 = this.an;
      if (var1 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var1.hc;
         return var1;
      }
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public void clear() {
      this.af();
   }

   public boolean add(Object var1) {
      return this.ay((rp)var1);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "oi.equals(" + ')');
      }
   }

   public int hashCode() {
      try {
         return super.hashCode();
      } catch (RuntimeException var1) {
         throw db.an(var1, "oi.hashCode(" + ')');
      }
   }

   public boolean gm(Object var1) {
      return super.equals(var1);
   }

   public boolean gi(Object var1) {
      return super.equals(var1);
   }

   public void aw(rp var1) {
      if (var1.hg != null) {
         var1.ga();
      }

      var1.hg = this.af;
      var1.hc = this.af.hc;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
   }

   public int bq() {
      return this.al();
   }

   public int ahh() {
      return super.hashCode();
   }

   public boolean gk(Object var1) {
      return super.equals(var1);
   }

   public int ahv() {
      return super.hashCode();
   }

   public void ao() {
      while(this.af.hc != this.af) {
         this.af.hc.ga();
      }

   }

   public void ax() {
      while(this.af.hc != this.af) {
         this.af.hc.ga();
      }

   }

   public void ai(rp var1) {
      if (var1.hg != null) {
         var1.ga();
      }

      var1.hg = this.af.hg;
      var1.hc = this.af;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
   }

   public void ag(rp var1) {
      if (var1.hg != null) {
         var1.ga();
      }

      var1.hg = this.af.hg;
      var1.hc = this.af;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
   }

   public Object[] cu(Object[] var1) {
      int var2 = 0;

      for(rp var3 = this.af.hc; var3 != this.af; var3 = var3.hc) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public void av(rp var1) {
      if (var1.hg != null) {
         var1.ga();
      }

      var1.hg = this.af;
      var1.hc = this.af.hc;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
   }

   public static void ar(rp var0, rp var1) {
      if (var0.hg != null) {
         var0.ga();
      }

      var0.hg = var1;
      var0.hc = var1.hc;
      var0.hg.hc = var0;
      var0.hc.hg = var0;
   }

   rp[] bs() {
      rp[] var1 = new rp[this.al()];
      int var2 = 0;

      for(rp var3 = this.af.hc; var3 != this.af; var3 = var3.hc) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public static void as(rp var0, rp var1) {
      if (var0.hg != null) {
         var0.ga();
      }

      var0.hg = var1;
      var0.hc = var1.hc;
      var0.hg.hc = var0;
      var0.hc.hg = var0;
   }

   public rp aj() {
      return this.ab((rp)null);
   }

   public rp ak() {
      return this.ab((rp)null);
   }

   rp az(rp var1) {
      rp var2;
      if (var1 == null) {
         var2 = this.af.hc;
      } else {
         var2 = var1;
      }

      if (var2 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var2.hc;
         return var2;
      }
   }

   public Object[] cc() {
      return this.aa();
   }

   public rp ae() {
      rp var1 = this.an;
      if (var1 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var1.hc;
         return var1;
      }
   }

   boolean cm(rp var1) {
      this.an(var1);
      return true;
   }

   public rp by() {
      rp var1 = this.an;
      if (var1 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var1.hc;
         return var1;
      }
   }

   public boolean gq(Object var1) {
      return super.equals(var1);
   }

   int bi() {
      int var1 = 0;

      for(rp var2 = this.af.hc; var2 != this.af; var2 = var2.hc) {
         ++var1;
      }

      return var1;
   }

   int be() {
      int var1 = 0;

      for(rp var2 = this.af.hc; var2 != this.af; var2 = var2.hc) {
         ++var1;
      }

      return var1;
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   int bx() {
      int var1 = 0;

      for(rp var2 = this.af.hc; var2 != this.af; var2 = var2.hc) {
         ++var1;
      }

      return var1;
   }

   public void an(rp var1) {
      if (var1.hg != null) {
         var1.ga();
      }

      var1.hg = this.af.hg;
      var1.hc = this.af;
      var1.hg.hc = var1;
      var1.hc.hg = var1;
   }

   rp ad(rp var1) {
      rp var2;
      if (var1 == null) {
         var2 = this.af.hc;
      } else {
         var2 = var1;
      }

      if (var2 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var2.hc;
         return var2;
      }
   }

   public boolean bm() {
      return this.af.hc == this.af;
   }

   public boolean bd() {
      return this.af.hc == this.af;
   }

   rp[] bt() {
      rp[] var1 = new rp[this.al()];
      int var2 = 0;

      for(rp var3 = this.af.hc; var3 != this.af; var3 = var3.hc) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public rp au() {
      return this.ab((rp)null);
   }

   rp[] bn() {
      rp[] var1 = new rp[this.al()];
      int var2 = 0;

      for(rp var3 = this.af.hc; var3 != this.af; var3 = var3.hc) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public Iterator bu() {
      return new nq(this);
   }

   public Iterator br() {
      return new nq(this);
   }

   public boolean bh(Object var1) {
      throw new RuntimeException();
   }

   public oi() {
      this.af.hc = this.af;
      this.af.hg = this.af;
   }

   public int bf() {
      return this.al();
   }

   public static void am(rp var0, rp var1) {
      if (var0.hg != null) {
         var0.ga();
      }

      var0.hg = var1;
      var0.hc = var1.hc;
      var0.hg.hc = var0;
      var0.hc.hg = var0;
   }

   public int ba() {
      return this.al();
   }

   public boolean bv() {
      return this.at();
   }

   public boolean bl() {
      return this.at();
   }

   public boolean bp() {
      return this.at();
   }

   int al() {
      int var1 = 0;

      for(rp var2 = this.af.hc; var2 != this.af; var2 = var2.hc) {
         ++var1;
      }

      return var1;
   }

   rp[] aa() {
      rp[] var1 = new rp[this.al()];
      int var2 = 0;

      for(rp var3 = this.af.hc; var3 != this.af; var3 = var3.hc) {
         var1[var2++] = var3;
      }

      return var1;
   }

   rp ab(rp var1) {
      rp var2;
      if (var1 == null) {
         var2 = this.af.hc;
      } else {
         var2 = var1;
      }

      if (var2 == this.af) {
         this.an = null;
         return null;
      } else {
         this.an = var2.hc;
         return var2;
      }
   }

   public boolean ce(Object var1) {
      throw new RuntimeException();
   }

   public boolean ci(Object var1) {
      throw new RuntimeException();
   }

   public Object[] cs() {
      return this.aa();
   }

   public int aht() {
      return super.hashCode();
   }

   public Object[] cn() {
      return this.aa();
   }

   int bk() {
      int var1 = 0;

      for(rp var2 = this.af.hc; var2 != this.af; var2 = var2.hc) {
         ++var1;
      }

      return var1;
   }

   public Iterator bg() {
      return new nq(this);
   }

   public void co() {
      this.af();
   }

   boolean cq(rp var1) {
      this.an(var1);
      return true;
   }

   public boolean bc(Object var1) {
      throw new RuntimeException();
   }

   public boolean cf(Object var1) {
      throw new RuntimeException();
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean cg(Collection var1) {
      throw new RuntimeException();
   }

   public Iterator iterator() {
      return new nq(this);
   }

   public boolean cy(Collection var1) {
      throw new RuntimeException();
   }

   public boolean cx(Collection var1) {
      throw new RuntimeException();
   }

   public boolean cv(Collection var1) {
      throw new RuntimeException();
   }

   public boolean cb(Collection var1) {
      throw new RuntimeException();
   }

   public boolean isEmpty() {
      return this.at();
   }

   public void cz() {
      this.af();
   }

   public boolean cw(Object var1) {
      return this.ay((rp)var1);
   }

   public Object[] ca(Object[] var1) {
      int var2 = 0;

      for(rp var3 = this.af.hc; var3 != this.af; var3 = var3.hc) {
         var1[var2++] = var3;
      }

      return var1;
   }
}
