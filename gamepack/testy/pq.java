import accessors.RSUserList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class pq implements RSUserList {
   int aa;
   final int at;
   pw[] ay;
   Comparator ai;
   HashMap ax;
   HashMap ao;

   pw cb(tm var1) {
      return !var1.aw(564109641) ? null : (pw)this.ax.get(var1);
   }

   public void cs() {
      this.aa = 0;
      Arrays.fill(this.ay, (Object)null);
      this.ao.clear();
      this.ax.clear();
   }

   public int bm(int var1) {
      try {
         return this.aa * -940640785;
      } catch (RuntimeException var2) {
         throw db.an(var2, "pq.bm(" + ')');
      }
   }

   public boolean bd(int var1) {
      try {
         boolean var10000;
         if (-734344935 * this.at == -940640785 * this.aa) {
            if (var1 == 2020691403) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "pq.bd(" + ')');
      }
   }

   pw dw(tm var1, tm var2) {
      if (this.bn(var1, (short)197) != null) {
         throw new IllegalStateException();
      } else {
         pw var3 = this.af(209911376);
         var3.bo(var1, var2, (byte)67);
         this.bc(var3, (byte)-19);
         this.bh(var3, 104957723);
         return var3;
      }
   }

   abstract pw[] aa(int var1);

   pw bn(tm var1, short var2) {
      try {
         if (!var1.aw(-1802823835)) {
            if (var2 != 197) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return (pw)this.ao.get(var1);
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "pq.bn(" + ')');
      }
   }

   final void du(pw var1) {
      if (this.ao.remove(var1.aw) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.ac != null) {
            this.ax.remove(var1.ac);
         }

      }
   }

   public int cu() {
      return this.aa * -940640785;
   }

   public final boolean cw(tm var1) {
      pw var2 = this.bn(var1, (short)197);
      if (null == var2) {
         return false;
      } else {
         this.bg(var2, 779365628);
         return true;
      }
   }

   pw bu(tm var1, byte var2) {
      try {
         return this.bf(var1, (tm)null, (byte)-127);
      } catch (RuntimeException var3) {
         throw db.an(var3, "pq.bu(" + ')');
      }
   }

   final void bp(pw var1, byte var2) {
      try {
         if (this.ao.remove(var1.aw) == null) {
            throw new IllegalStateException();
         } else {
            if (var1.ac != null) {
               if (var2 == 3) {
                  return;
               }

               this.ax.remove(var1.ac);
            }

         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "pq.bp(" + ')');
      }
   }

   pw bs(tm var1, int var2) {
      try {
         if (!var1.aw(1247326473)) {
            if (var2 == -1613504065) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return (pw)this.ax.get(var1);
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "pq.bs(" + ')');
      }
   }

   public final void ba(byte var1) {
      try {
         if (null == this.ai) {
            if (var1 == -126) {
               return;
            }

            Arrays.sort(this.ay, 0, -940640785 * this.aa);
         } else {
            Arrays.sort(this.ay, 0, -940640785 * this.aa, this.ai);
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "pq.ba(" + ')');
      }
   }

   public final boolean br(tm var1, short var2) {
      try {
         pw var3 = this.bn(var1, (short)197);
         if (null == var3) {
            if (var2 >= 255) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            this.bg(var3, -1797777588);
            return true;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "pq.br(" + ')');
      }
   }

   final int bl(pw var1, int var2) {
      try {
         for(int var3 = 0; var3 < -940640785 * this.aa; ++var3) {
            if (var2 == -1296890481) {
               throw new IllegalStateException();
            }

            if (this.ay[var3] == var1) {
               return var3;
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw db.an(var4, "pq.bl(" + ')');
      }
   }

   final void bg(pw var1, int var2) {
      try {
         int var3 = this.bl(var1, -493827826);
         if (-1 == var3) {
            if (var2 >= 1795402504) {
               throw new IllegalStateException();
            }
         } else {
            this.bw(var3, (byte)-47);
            this.bp(var1, (byte)-48);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "pq.bg(" + ')');
      }
   }

   final void bc(pw var1, byte var2) {
      try {
         this.ay[(this.aa += 905500943) * -940640785 - 1] = var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "pq.bc(" + ')');
      }
   }

   final void bv(pw var1, tm var2, tm var3, int var4) {
      try {
         this.bp(var1, (byte)54);
         var1.bo(var2, var3, (byte)92);
         this.bh(var1, -93307052);
      } catch (RuntimeException var5) {
         throw db.an(var5, "pq.bv(" + ')');
      }
   }

   final void bw(int var1, byte var2) {
      try {
         this.aa -= 905500943;
         if (var1 < -940640785 * this.aa) {
            System.arraycopy(this.ay, 1 + var1, this.ay, var1, -940640785 * this.aa - var1);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "pq.bw(" + ')');
      }
   }

   pq(int var1) {
      try {
         super();
         this.aa = 0;
         this.ai = null;
         this.at = var1 * 450790185;
         this.ay = this.an(var1, -463450295);
         this.ao = new HashMap(var1 / 8);
         this.ax = new HashMap(var1 / 8);
      } catch (RuntimeException var2) {
         throw db.an(var2, "pq.<init>(" + ')');
      }
   }

   abstract pw[] an(int var1, int var2);

   public final void ce(int var1) {
      try {
         this.ai = null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "pq.ce(" + ')');
      }
   }

   public final void ci(Comparator var1, byte var2) {
      try {
         if (this.ai == null) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            }

            this.ai = var1;
         } else if (this.ai instanceof pz) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            }

            ((pz)this.ai).ay(var1, 1664695442);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "pq.ci(" + ')');
      }
   }

   abstract pw af(int var1);

   abstract pw au();

   abstract pw ab();

   abstract pw[] aq(int var1);

   public boolean cq() {
      return -734344935 * this.at == -940640785 * this.aa;
   }

   abstract pw[] at(int var1);

   final void dn(int var1) {
      this.aa -= -1657089250;
      if (var1 < -940640785 * this.aa) {
         System.arraycopy(this.ay, 1 + var1, this.ay, var1, -940640785 * this.aa - var1);
      }

   }

   final void dx(int var1) {
      this.aa -= 1104217759;
      if (var1 < -940640785 * this.aa) {
         System.arraycopy(this.ay, 1 + var1, this.ay, var1, -940640785 * this.aa - var1);
      }

   }

   public void cc() {
      this.aa = 0;
      Arrays.fill(this.ay, (Object)null);
      this.ao.clear();
      this.ax.clear();
   }

   public boolean bt(tm var1, int var2) {
      try {
         if (!var1.aw(1868767994)) {
            if (var2 == -402145367) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (this.ao.containsKey(var1)) {
            if (var2 == -402145367) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return this.ax.containsKey(var1);
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "pq.bt(" + ')');
      }
   }

   public int ca() {
      return this.aa * -940640785;
   }

   public final pw bq(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var1 < this.aa * -940640785) {
               return this.ay[var1];
            }

            if (var2 <= -808951927) {
               throw new IllegalStateException();
            }
         }

         throw new ArrayIndexOutOfBoundsException(var1);
      } catch (RuntimeException var3) {
         throw db.an(var3, "pq.bq(" + ')');
      }
   }

   abstract pw[] al(int var1);

   pw bf(tm var1, tm var2, byte var3) {
      try {
         if (this.bn(var1, (short)197) != null) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException();
            }
         } else {
            pw var4 = this.af(1756938494);
            var4.bo(var1, var2, (byte)11);
            this.bc(var4, (byte)-118);
            this.bh(var4, -1215249074);
            return var4;
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "pq.bf(" + ')');
      }
   }

   public boolean cm() {
      return -734344935 * this.at == -940640785 * this.aa;
   }

   public boolean cf(tm var1) {
      if (!var1.aw(-1264295331)) {
         return false;
      } else {
         return this.ao.containsKey(var1) ? true : this.ax.containsKey(var1);
      }
   }

   public pw bj(tm var1, int var2) {
      try {
         pw var3 = this.bn(var1, (short)197);
         if (var3 != null) {
            if (var2 == -989370023) {
               throw new IllegalStateException();
            } else {
               return var3;
            }
         } else {
            return this.bs(var1, -34701339);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "pq.bj(" + ')');
      }
   }

   public pw cg(tm var1) {
      pw var2 = this.bn(var1, (short)197);
      return var2 != null ? var2 : this.bs(var1, -809036783);
   }

   public pw cr(tm var1) {
      pw var2 = this.bn(var1, (short)197);
      return var2 != null ? var2 : this.bs(var1, -1350769537);
   }

   public pw cy(tm var1) {
      pw var2 = this.bn(var1, (short)197);
      return var2 != null ? var2 : this.bs(var1, 903418156);
   }

   final void dj(pw var1) {
      this.ao.put(var1.aw, var1);
      if (var1.ac != null) {
         pw var2 = (pw)this.ax.put(var1.ac, var1);
         if (null != var2 && var2 != var1) {
            var2.ac = null;
         }
      }

   }

   pw cv(tm var1) {
      return !var1.aw(-2145132291) ? null : (pw)this.ax.get(var1);
   }

   public boolean cl(tm var1) {
      if (!var1.aw(1087343221)) {
         return false;
      } else {
         return this.ao.containsKey(var1) ? true : this.ax.containsKey(var1);
      }
   }

   public void bz(int var1) {
      try {
         this.aa = 0;
         Arrays.fill(this.ay, (Object)null);
         this.ao.clear();
         this.ax.clear();
      } catch (RuntimeException var2) {
         throw db.an(var2, "pq.bz(" + ')');
      }
   }

   public final boolean cz(tm var1) {
      pw var2 = this.bn(var1, (short)197);
      if (null == var2) {
         return false;
      } else {
         this.bg(var2, -1270852082);
         return true;
      }
   }

   final void cj(pw var1) {
      int var2 = this.bl(var1, -920384063);
      if (-1 != var2) {
         this.bw(var2, (byte)-31);
         this.bp(var1, (byte)87);
      }
   }

   abstract pw ac();

   final void ch(pw var1) {
      int var2 = this.bl(var1, -1408177467);
      if (-1 != var2) {
         this.bw(var2, (byte)-95);
         this.bp(var1, (byte)84);
      }
   }

   pw ct(tm var1) {
      return this.bf(var1, (tm)null, (byte)-112);
   }

   pw cp(tm var1) {
      return this.bf(var1, (tm)null, (byte)-59);
   }

   pw cd(tm var1) {
      return this.bf(var1, (tm)null, (byte)-128);
   }

   pw dm(tm var1) {
      return this.bf(var1, (tm)null, (byte)-64);
   }

   pw co(tm var1) {
      return !var1.aw(-1818527304) ? null : (pw)this.ax.get(var1);
   }

   public final pw dc(int var1) {
      if (var1 >= 0 && var1 < this.aa * -940640785) {
         return this.ay[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   public final pw do(int var1) {
      if (var1 >= 0 && var1 < this.aa * -940640785) {
         return this.ay[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   public final void di() {
      if (null == this.ai) {
         Arrays.sort(this.ay, 0, 579160679 * this.aa);
      } else {
         Arrays.sort(this.ay, 0, -940640785 * this.aa, this.ai);
      }

   }

   public final void dr() {
      if (null == this.ai) {
         Arrays.sort(this.ay, 0, -940640785 * this.aa);
      } else {
         Arrays.sort(this.ay, 0, -940640785 * this.aa, this.ai);
      }

   }

   public final void dl() {
      if (null == this.ai) {
         Arrays.sort(this.ay, 0, -940640785 * this.aa);
      } else {
         Arrays.sort(this.ay, 0, 482865869 * this.aa, this.ai);
      }

   }

   public final void dk() {
      if (null == this.ai) {
         Arrays.sort(this.ay, 0, -490261718 * this.aa);
      } else {
         Arrays.sort(this.ay, 0, -144759401 * this.aa, this.ai);
      }

   }

   final void dt(pw var1, tm var2, tm var3) {
      this.bp(var1, (byte)-27);
      var1.bo(var2, var3, (byte)7);
      this.bh(var1, -928835205);
   }

   final void dv(pw var1, tm var2, tm var3) {
      this.bp(var1, (byte)53);
      var1.bo(var2, var3, (byte)48);
      this.bh(var1, -315468554);
   }

   final int dz(pw var1) {
      for(int var2 = 0; var2 < -940640785 * this.aa; ++var2) {
         if (this.ay[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   final int dg(pw var1) {
      for(int var2 = 0; var2 < -940640785 * this.aa; ++var2) {
         if (this.ay[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   final int de(pw var1) {
      for(int var2 = 0; var2 < -940640785 * this.aa; ++var2) {
         if (this.ay[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   final int dh(pw var1) {
      for(int var2 = 0; var2 < 351893259 * this.aa; ++var2) {
         if (this.ay[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   pw cx(tm var1) {
      return !var1.aw(1171823974) ? null : (pw)this.ao.get(var1);
   }

   public void cn() {
      this.aa = 0;
      Arrays.fill(this.ay, (Object)null);
      this.ao.clear();
      this.ax.clear();
   }

   final void db(pw var1) {
      if (this.ao.remove(var1.aw) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.ac != null) {
            this.ax.remove(var1.ac);
         }

      }
   }

   final void df(pw var1) {
      this.ay[(this.aa += 52494639) * -940640785 - 1] = var1;
   }

   final void dq(pw var1) {
      this.ay[(this.aa += -1983924279) * 432551964 - 1] = var1;
   }

   final void dd(pw var1) {
      this.ao.put(var1.aw, var1);
      if (var1.ac != null) {
         pw var2 = (pw)this.ax.put(var1.ac, var1);
         if (null != var2 && var2 != var1) {
            var2.ac = null;
         }
      }

   }

   final void dp(pw var1) {
      if (this.ao.remove(var1.aw) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.ac != null) {
            this.ax.remove(var1.ac);
         }

      }
   }

   final void bh(pw var1, int var2) {
      try {
         this.ao.put(var1.aw, var1);
         if (var1.ac != null) {
            if (var2 >= 825276599) {
               throw new IllegalStateException();
            }

            pw var3 = (pw)this.ax.put(var1.ac, var1);
            if (null != var3) {
               if (var2 >= 825276599) {
                  throw new IllegalStateException();
               }

               if (var3 != var1) {
                  if (var2 >= 825276599) {
                     throw new IllegalStateException();
                  }

                  var3.ac = null;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "pq.bh(" + ')');
      }
   }

   public final void ep(Comparator var1) {
      if (this.ai == null) {
         this.ai = var1;
      } else if (this.ai instanceof pz) {
         ((pz)this.ai).ay(var1, 1993452523);
      }

   }

   public final void dy() {
      this.ai = null;
   }

   public final void ds() {
      this.ai = null;
   }

   public final void da(Comparator var1) {
      if (this.ai == null) {
         this.ai = var1;
      } else if (this.ai instanceof pz) {
         ((pz)this.ai).ay(var1, 1462135914);
      }

   }

   public int ck() {
      return this.aa * -940640785;
   }
}
