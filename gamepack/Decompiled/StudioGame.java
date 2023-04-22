public class StudioGame implements Enumerated {
   public static final StudioGame ab = new StudioGame("oldscape", "RuneScape 2007", 5);
   static final StudioGame an = new StudioGame("stellardawn", "Stellar Dawn", 1);
   static final StudioGame af = new StudioGame("runescape", "RuneScape", 0);
   static final StudioGame ac = new StudioGame("game4", "Game 4", 3);
   static final StudioGame au = new StudioGame("game5", "Game 5", 4);
   public final String name;
   final int id;
   static final StudioGame aw = new StudioGame("game3", "Game 3", 2);

   public int ordinal() {
      return 1678259171 * this.id;
   }

   StudioGame(String var1, String var2, int var3) {
      this.name = var1;
      this.id = var3 * 1076537803;
   }

   public static PlayerType[] au_renamed() {
      return new PlayerType[]{PlayerType.PlayerType_ironman, PlayerType.PlayerType_normal, PlayerType.ay, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.av, PlayerType.aq, PlayerType.aa, PlayerType.ai, PlayerType.ao, PlayerType.at, PlayerType.ag, PlayerType.PlayerType_playerModerator, PlayerType.ax, PlayerType.PlayerType_hardcoreIronman, PlayerType.al, PlayerType.ah};
   }
}
