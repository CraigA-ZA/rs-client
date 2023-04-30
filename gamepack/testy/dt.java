public class dt implements nj {
   static int[] at;
   static final dt an = new dt(1, 2);
   static final dt aw = new dt(2, 3);
   static final dt ac = new dt(3, 4);
   static final dt au = new dt(4, 5);
   static final dt ab = new dt(5, 6);
   final int al;
   static final dt af = new dt(0, -1);
   final int aq;
   static int uf;

   static dt[] at() {
      return new dt[]{an, ab, aw, af, au, ac};
   }

   dt(int var1, int var2) {
      try {
         super();
         this.aq = var1 * 968435365;
         this.al = 1823410001 * var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "dt.<init>(" + ')');
      }
   }

   public int an() {
      return 2093130161 * this.al;
   }

   public int aw() {
      return 2093130161 * this.al;
   }

   public int ac() {
      return 2093130161 * this.al;
   }

   public int af(int var1) {
      try {
         return 2093130161 * this.al;
      } catch (RuntimeException var2) {
         throw db.an(var2, "dt.af(" + ')');
      }
   }

   static dt[] ab() {
      return new dt[]{an, ab, aw, af, au, ac};
   }

   static dt[] al() {
      return new dt[]{an, ab, aw, af, au, ac};
   }

   static dt[] aq() {
      return new dt[]{an, ab, aw, af, au, ac};
   }

   static final void mo(int var0, byte var1) {
      try {
         var0 = Math.min(Math.max(var0, 0), 255);
         if (var0 != aj.vb.am(-747004874)) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            label38: {
               if (aj.vb.am(834708098) == 0) {
                  if (var1 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (-1 != client.tz * 1976903761) {
                     if (var1 >= 1) {
                        throw new IllegalStateException();
                     }

                     cq.aw(pj.fw, 1976903761 * client.tz, 0, var0, false, -1321934258);
                     client.tf = false;
                     break label38;
                  }
               }

               if (var0 == 0) {
                  if (var1 >= 1) {
                     throw new IllegalStateException();
                  }

                  hr.au(-852125385);
                  client.tf = false;
               } else {
                  ii.ac(var0, -1445318523);
               }
            }

            aj.vb.ar(var0, -935900203);
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "dt.mo(" + ')');
      }
   }
}
