import accessors.RSUser;

public class pw implements Comparable, RSUser {
   tm ac;
   public static final int em = 2;
   tm aw;

   void bg(tm var1, tm var2) {
      if (null == var1) {
         throw new NullPointerException();
      } else {
         this.aw = var1;
         this.ac = var2;
      }
   }

   public tm be(int var1) {
      try {
         return this.aw;
      } catch (RuntimeException var2) {
         throw db.an(var2, "pw.be(" + ')');
      }
   }

   public String bk(int var1) {
      try {
         if (null == this.aw) {
            if (var1 == 1942649753) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else {
            return this.aw.af(-710264960);
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "pw.bk(" + ')');
      }
   }

   public String bx(int var1) {
      try {
         if (null == this.ac) {
            if (var1 != -43557433) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else {
            return this.ac.af(-710264960);
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "pw.bx(" + ')');
      }
   }

   void bo(tm var1, tm var2, byte var3) {
      try {
         if (null == var1) {
            throw new NullPointerException();
         } else {
            this.aw = var1;
            this.ac = var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "pw.bo(" + ')');
      }
   }

   public String bd() {
      return null == this.ac ? "" : this.ac.af(-710264960);
   }

   void bu(tm var1, tm var2) {
      if (null == var1) {
         throw new NullPointerException();
      } else {
         this.aw = var1;
         this.ac = var2;
      }
   }

   public int ac(Object var1) {
      return this.an((pw)var1, 1856817146);
   }

   public int au(Object var1) {
      return this.an((pw)var1, 659632812);
   }

   public int ab(Object var1) {
      return this.an((pw)var1, 966104677);
   }

   public int aq(pw var1) {
      return this.aw.aq(var1.aw, (byte)116);
   }

   void bs(tm var1, tm var2) {
      if (null == var1) {
         throw new NullPointerException();
      } else {
         this.aw = var1;
         this.ac = var2;
      }
   }

   public String bz() {
      return null == this.aw ? "" : this.aw.af(-710264960);
   }

   public String bm() {
      return null == this.aw ? "" : this.aw.af(-710264960);
   }

   void br(tm var1, tm var2) {
      if (null == var1) {
         throw new NullPointerException();
      } else {
         this.aw = var1;
         this.ac = var2;
      }
   }

   public String bt() {
      return null == this.ac ? "" : this.ac.af(-710264960);
   }

   public String bj() {
      return null == this.ac ? "" : this.ac.af(-710264960);
   }

   void bn(tm var1, tm var2) {
      if (null == var1) {
         throw new NullPointerException();
      } else {
         this.aw = var1;
         this.ac = var2;
      }
   }

   static void ab(int var0, short var1) {
      try {
         dc var2 = (dc)dc.af.af((long)var0);
         if (null == var2) {
            if (var1 <= 3150) {
               throw new IllegalStateException();
            }
         } else {
            var2.ga();
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "pw.ab(" + ')');
      }
   }

   public int compareTo(Object var1) {
      try {
         return this.an((pw)var1, 1093536041);
      } catch (RuntimeException var2) {
         throw db.an(var2, "pw.compareTo(" + ')');
      }
   }

   public int al(pw var1) {
      return this.aw.aq(var1.aw, (byte)116);
   }

   pw() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "pw.<init>(" + ')');
      }
   }

   public int an(pw var1, int var2) {
      try {
         return this.aw.aq(var1.aw, (byte)95);
      } catch (RuntimeException var3) {
         throw db.an(var3, "pw.an(" + ')');
      }
   }
}
