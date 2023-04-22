public class LoginType {
   static final LoginType au = new LoginType(7, 4, "", "");
   static final LoginType an = new LoginType(6, 1, "", "");
   public static final LoginType af = new LoginType(4, 0, "", "");
   static final LoginType aw = new LoginType(3, 2, "", "");
   static final LoginType ac = new LoginType(8, 3, "", "");
   static final LoginType ab = new LoginType(5, 5, "", "");
   static final LoginType aq = new LoginType(2, 6, "", "");
   static final LoginType al = new LoginType(1, 7, "", "");
   public static final LoginType at;
   final int aa;
   final String ay;

   LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
      this.aa = var1 * 800568237;
      this.ay = var4;
   }

   public String toString() {
      return this.ay;
   }

   static {
      at = new LoginType(0, -1, "", "", true, new LoginType[]{af, an, aw, au, ac});
   }

   LoginType(int var1, int var2, String var3, String var4) {
      this.aa = var1 * 800568237;
      this.ay = var4;
   }
}
