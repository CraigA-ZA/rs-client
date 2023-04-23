public class World {
   public static FriendSystem vt;
   static int ab = 0;
   static int aq = 0;
   static int[] al = new int[]{1, 1, 1, 1};
   static int[] at = new int[]{0, 1, 2, 3};
   static IndexedSprite[] dt;
   int ah;
   int ao;
   int av;
   int ax;
   int ay;
   String ag;
   String ai;

   public static void af_renamed(AbstractArchive var0) {
      FloorUnderlayType.af = var0;
   }

   World() {
   }

   static int ab_renamed(int var0) {
      ChatChannel var2 = (ChatChannel)Messages.af.get(var0);
      return var2 == null ? 0 : var2.size();
   }

   boolean at() {
      return 0 != (1 & 1810954985 * this.ao);
   }

   boolean aa() {
      return (65536 & this.ao * 1810954985) != 0;
   }

   boolean ay() {
      return 0 != (2 & this.ao * 1810954985);
   }

   boolean ao() {
      return 0 != (4 & 1810954985 * this.ao);
   }

   boolean ax() {
      return 0 != (8 & this.ao * 1810954985);
   }

   boolean ai() {
      return 0 != (536870912 & 1810954985 * this.ao);
   }

   boolean ag() {
      return 0 != (33554432 & this.ao * 1810954985);
   }

   boolean ah() {
      return 0 != (1073741824 & 1810954985 * this.ao);
   }

   boolean av() {
      return (256 & 1810954985 * this.ao) != 0;
   }

   boolean ar() {
      return 0 != (134217728 & 1810954985 * this.ao);
   }
}
