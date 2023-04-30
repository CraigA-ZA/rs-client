import accessors.RSWorldMapEvent;

public class ki implements RSWorldMapEvent {
   public int af;
   public lb an;
   public lb aw;

   public ki(int var1, lb var2, lb var3) {
      try {
         super();
         this.af = 271164285 * var1;
         this.an = var2;
         this.aw = var3;
      } catch (RuntimeException var4) {
         throw db.an(var4, "ki.<init>(" + ')');
      }
   }
}
