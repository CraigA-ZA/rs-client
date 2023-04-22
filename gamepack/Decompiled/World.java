public class World {
   static int worldsCount = 0;
   static int[] al = new int[]{1, 1, 1, 1};
   static int[] at = new int[]{0, 1, 2, 3};
   int properties;
   int population;
   String host;
   String activity;
   int location;
   int id;
   static IndexedSprite[] dt;
   public static FriendSystem friendSystem;
   int index;
   static int aq = 0;

   boolean at() {
      return 0 != (1 & 1810954985 * this.properties);
   }

   boolean aa() {
      return (65536 & this.properties * 1810954985) != 0;
   }

   boolean ao() {
      return 0 != (4 & 1810954985 * this.properties);
   }

   boolean ax() {
      return 0 != (8 & this.properties * 1810954985);
   }

   boolean ag() {
      return 0 != (33554432 & this.properties * 1810954985);
   }

   boolean ah() {
      return 0 != (1073741824 & 1810954985 * this.properties);
   }

   boolean av() {
      return (256 & 1810954985 * this.properties) != 0;
   }

   boolean ar() {
      return 0 != (134217728 & 1810954985 * this.properties);
   }

   World() {
   }

   boolean ai() {
      return 0 != (536870912 & 1810954985 * this.properties);
   }

   boolean ay() {
      return 0 != (2 & this.properties * 1810954985);
   }

   public static void af_renamed(AbstractArchive var0) {
      FloorUnderlayType.FloorUnderlayType_archive = var0;
   }

   static int ab_renamed(int var0) {
      ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
      return var2 == null ? 0 : var2.size();
   }
}
