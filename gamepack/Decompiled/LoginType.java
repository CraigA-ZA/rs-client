public class LoginType {
   public static final LoginType af = new LoginType(4, 0, "", "");
   public static final LoginType at;
   static final LoginType ab = new LoginType(5, 5, "", "");
   static final LoginType ac = new LoginType(8, 3, "", "");
   static final LoginType al = new LoginType(1, 7, "", "");
   static final LoginType an = new LoginType(6, 1, "", "");
   static final LoginType aq = new LoginType(2, 6, "", "");
   static final LoginType au = new LoginType(7, 4, "", "");
   static final LoginType aw = new LoginType(3, 2, "", "");
   final int aa;
   final String ay;

   static {
      at = new LoginType(0, -1, "", "", true, new LoginType[]{af, an, aw, au, ac});
   }

   LoginType(int var1, int var2, String var3, String var4) {
      this.aa = var1 * 800568237;
      this.ay = var4;
   }

   LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
      this.aa = var1 * 800568237;
      this.ay = var4;
   }

   public String toString() {
      return this.ay;
   }
}
