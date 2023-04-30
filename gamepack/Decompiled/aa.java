import java.util.List;

public class aa implements Enumerated {
   public static final aa af = new aa(0, "POST", true, true);
   public static final aa an = new aa(1, "GET", true, false);
   static int ax;
   static int jp;
   static List wf;
   static final aa ac = new aa(3, "PATCH", false, true);
   static final aa au = new aa(4, "DELETE", false, true);
   static final aa aw = new aa(2, "PUT", false, true);
   boolean al;
   boolean at;
   int ab;
   String aq;

   aa(int var1, String var2, boolean var3, boolean var4) {
      this.ab = 30970631 * var1;
      this.aq = var2;
      this.al = var3;
      this.at = var4;
   }

   boolean au() {
      return this.al;
   }

   public String ab() {
      return this.aq;
   }

   boolean aq() {
      return this.at;
   }

   public int ordinal() {
      return this.ab * 985819831;
   }
}
