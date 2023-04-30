import java.util.Iterator;

public class su extends qn implements kx {
   final ke aw;
   final nm an;
   final int ac;
   public static final String kd = "";
   static boolean ev;

   public void am(byte var1) {
      try {
         synchronized(this.aw) {
            this.aw.aq();
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "su.am(" + ')');
      }
   }

   protected qg af(int var1, byte var2) {
      try {
         synchronized(this.aw) {
            qb var3 = (qb)this.aw.af((long)var1);
            if (null == var3) {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               var3 = this.ar(var1, -989370023);
               this.aw.ac(var3, (long)var1);
            }

            return var3;
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "su.af(" + ')');
      }
   }

   protected qg ax(int var1) {
      synchronized(this.aw) {
         qb var2 = (qb)this.aw.af((long)var1);
         if (null == var2) {
            var2 = this.ar(var1, -989370023);
            this.aw.ac(var2, (long)var1);
         }

         return var2;
      }
   }

   public Iterator br() {
      return new sn(this);
   }

   public Iterator iterator() {
      try {
         return new sn(this);
      } catch (RuntimeException var1) {
         throw db.an(var1, "su.iterator(" + ')');
      }
   }

   public void az() {
      synchronized(this.aw) {
         this.aw.aq();
      }
   }

   public Iterator bg() {
      return new sn(this);
   }

   public Iterator bu() {
      return new sn(this);
   }

   protected qg ah(int var1) {
      synchronized(this.aw) {
         qb var2 = (qb)this.aw.af((long)var1);
         if (null == var2) {
            var2 = this.ar(var1, -989370023);
            this.aw.ac(var2, (long)var1);
         }

         return var2;
      }
   }

   protected qg ao(int var1) {
      synchronized(this.aw) {
         qb var2 = (qb)this.aw.af((long)var1);
         if (null == var2) {
            var2 = this.ar(var1, -989370023);
            this.aw.ac(var2, (long)var1);
         }

         return var2;
      }
   }

   protected qg ai(int var1) {
      synchronized(this.aw) {
         qb var2 = (qb)this.aw.af((long)var1);
         if (null == var2) {
            var2 = this.ar(var1, -989370023);
            this.aw.ac(var2, (long)var1);
         }

         return var2;
      }
   }

   protected qg ag(int var1) {
      synchronized(this.aw) {
         qb var2 = (qb)this.aw.af((long)var1);
         if (null == var2) {
            var2 = this.ar(var1, -989370023);
            this.aw.ac(var2, (long)var1);
         }

         return var2;
      }
   }

   public su(mr var1, int var2, nx var3, nm var4) {
      try {
         super(var1, var3, null != var4 ? var4.cq(var2, (byte)60) : 0);
         this.aw = new ke(64);
         this.an = var4;
         this.ac = var2 * 1768319205;
      } catch (RuntimeException var5) {
         throw db.an(var5, "su.<init>(" + ')');
      }
   }

   protected qg av(int var1) {
      synchronized(this.aw) {
         qb var2 = (qb)this.aw.af((long)var1);
         if (null == var2) {
            var2 = this.ar(var1, -989370023);
            this.aw.ac(var2, (long)var1);
         }

         return var2;
      }
   }

   qb as(int var1) {
      byte[] var2 = this.an.bh(this.ac * -1931772261, var1, (byte)-48);
      qb var3 = new qb(var1);
      if (var2 != null) {
         var3.aw(new sg(var2), -894783888);
      }

      return var3;
   }

   qb aj(int var1) {
      byte[] var2 = this.an.bh(this.ac * -418179859, var1, (byte)-106);
      qb var3 = new qb(var1);
      if (var2 != null) {
         var3.aw(new sg(var2), 1469995379);
      }

      return var3;
   }

   public void ak() {
      synchronized(this.aw) {
         this.aw.aq();
      }
   }

   qb ar(int var1, int var2) {
      try {
         byte[] var3 = this.an.bh(this.ac * -418179859, var1, (byte)-48);
         qb var4 = new qb(var1);
         if (var3 != null) {
            var4.aw(new sg(var3), -1189317349);
         }

         return var4;
      } catch (RuntimeException var5) {
         throw db.an(var5, "su.ar(" + ')');
      }
   }

   static hd[] au(byte var0) {
      try {
         return new hd[]{hd.af, hd.aw, hd.an};
      } catch (RuntimeException var1) {
         throw db.an(var1, "su.au(" + ')');
      }
   }
}
