public class FriendLoginUpdate extends Link {
   public Username username;
   public short world;
   public int time = (int)(Formatting.af_renamed() / 1000L) * -1536274075;

   FriendLoginUpdate(Username var1, int var2) {
      this.username = var1;
      this.world = (short)var2;
   }
}
