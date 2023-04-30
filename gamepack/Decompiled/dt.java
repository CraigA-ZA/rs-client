public class dt implements Enumerated {
   static int uf;
   static int[] at;
   static final dt ab = new dt(5, 6);
   static final dt ac = new dt(3, 4);
   static final dt af = new dt(0, -1);
   static final dt an = new dt(1, 2);
   static final dt au = new dt(4, 5);
   static final dt aw = new dt(2, 3);
   final int al;
   final int aq;

   dt(int var1, int var2) {
      this.aq = var1 * 968435365;
      this.al = 1823410001 * var2;
   }

   public int ordinal() {
      return 2093130161 * this.al;
   }

   static final void mo_renamed(int var0) {
      var0 = Math.min(Math.max(var0, 0), 255);
      if (var0 != aj.clientPreferences.am()) {
         if (aj.clientPreferences.am() == 0 && -1 != Client.tz * 1976903761) {
            Message.aw_renamed(pj.archive6, 1976903761 * Client.tz, 0, var0, false);
            Client.tf = false;
         } else if (var0 == 0) {
            FloorUnderlayType.au_renamed();
            Client.tf = false;
         } else {
            ii.ac_renamed(var0);
         }

         aj.clientPreferences.ar(var0);
      }

   }
}
