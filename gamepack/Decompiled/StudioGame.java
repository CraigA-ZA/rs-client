public class StudioGame implements Enumerated {
   public static final StudioGame ab = new StudioGame("oldscape", "RuneScape 2007", 5);
   static final StudioGame ac = new StudioGame("game4", "Game 4", 3);
   static final StudioGame af = new StudioGame("runescape", "RuneScape", 0);
   static final StudioGame an = new StudioGame("stellardawn", "Stellar Dawn", 1);
   static final StudioGame au = new StudioGame("game5", "Game 5", 4);
   static final StudioGame aw = new StudioGame("game3", "Game 3", 2);
   final int al;
   public final String aq;

   StudioGame(String var1, String var2, int var3) {
      this.aq = var1;
      this.al = var3 * 1076537803;
   }

   public int ordinal() {
      return 1678259171 * this.al;
   }

   public static PlayerType[] au_renamed() {
      return new PlayerType[]{PlayerType.ac, PlayerType.af, PlayerType.ay, PlayerType.aw, PlayerType.au, PlayerType.av, PlayerType.aq, PlayerType.aa, PlayerType.ai, PlayerType.ao, PlayerType.at, PlayerType.ag, PlayerType.an, PlayerType.ax, PlayerType.ab, PlayerType.al, PlayerType.ah};
   }
}
