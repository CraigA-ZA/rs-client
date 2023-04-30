import accessors.RSWorldMapLabel;

public class ku implements RSWorldMapLabel {
   public static final int ao = 2048;
   public static final int aq = 260;
   String af;
   jd ac;
   int aw;
   int an;

   ku(String var1, int var2, int var3, jd var4) {
      try {
         super();
         this.af = var1;
         this.an = 1863009765 * var2;
         this.aw = 891924213 * var3;
         this.ac = var4;
      } catch (RuntimeException var5) {
         throw db.an(var5, "ku.<init>(" + ')');
      }
   }
}
