public class FriendLoginUpdate extends Link {
   public int time = (int)(Formatting.af_renamed() / 1000L) * -1536274075;
   public short world;
   public Username username;

   FriendLoginUpdate(Username var1, int var2) {
      this.username = var1;
      this.world = (short)var2;
   }
}
