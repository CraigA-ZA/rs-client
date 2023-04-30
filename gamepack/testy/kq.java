import accessors.RSWorldMapCacheName;

public class kq implements RSWorldMapCacheName {
   public static final kq au = new kq("labels");
   public static final kq af = new kq("details");
   public static final kq aw = new kq("compositetexture");
   static final kq ac = new kq("area");
   public final String ab;
   public static final kq an = new kq("compositemap");

   kq(String var1) {
      try {
         super();
         this.ab = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "kq.<init>(" + ')');
      }
   }
}
