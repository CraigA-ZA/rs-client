public class es extends AbstractUserComparator {
   static ClanChat sb;
   final boolean af;

   public es(boolean var1) {
      this.af = var1;
   }

   int af(Buddy var1, Buddy var2) {
      if (0 != 177258591 * var1.au) {
         if (var2.au * 177258591 == 0) {
            return this.af ? -1 : 1;
         }
      } else if (177258591 * var2.au != 0) {
         return this.af ? 1 : -1;
      }

      return this.ao(var1, var2);
   }

   static void an_renamed(int var0, String var1, String var2) {
      fo.addMessage(var0, var1, var2, (String)null);
   }

   public int compare(Object var1, Object var2) {
      return this.af((Buddy)var1, (Buddy)var2);
   }

   static void hx_renamed(Archive var0, String var1) {
      ArchiveLoader var3 = new ArchiveLoader(var0, var1);
      Client.we.add(var3);
      Client.ws += 1472564749 * var3.aw;
   }
}
