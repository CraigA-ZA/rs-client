import java.io.IOException;
import java.util.Locale;

@nk
@lj
public class Language implements Enumerated {
   public static final Language ab;
   public static final Language af;
   public static final Language aw;
   static MiniMenuEntry ot;
   static Font ir;
   static final Language ac;
   static final Language an;
   static final Language aq;
   static final Language au;
   static final Language[] ay;
   final int aa;
   final String al;
   final String at;

   static {
      af = new Language("EN", "en", "English", ne.af, 0, "GB");
      an = new Language("DE", "de", "German", ne.af, 1, "DE");
      aw = new Language("FR", "fr", "French", ne.af, 2, "FR");
      ac = new Language("PT", "pt", "Portuguese", ne.af, 3, "BR");
      au = new Language("NL", "nl", "Dutch", ne.ac, 4, "NL");
      ab = new Language("ES", "es", "Spanish", ne.ac, 5, "ES");
      aq = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ne.af, 6, "MX");
      Language[] var0 = au_renamed();
      ay = new Language[var0.length];
      Language[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         Language var3 = var1[var2];
         if (ay[-1624506429 * var3.aa] != null) {
            throw new IllegalStateException();
         }

         ay[-1624506429 * var3.aa] = var3;
      }

   }

   public static AttackOption[] au_renamed() {
      return new AttackOption[]{AttackOption.af, AttackOption.ac, AttackOption.an, AttackOption.aw};
   }

   static Language[] au_renamed() {
      return new Language[]{aw, au, an, aq, ac, af, ab};
   }

   Language(String var1, String var2, String var3, ne var4, int var5, String var6) {
      this.al = var1;
      this.at = var2;
      this.aa = var5 * 69691627;
      if (null != var6) {
         new Locale(var2.substring(0, 2), var6);
      } else {
         new Locale(var2.substring(0, 2));
      }

   }

   String ab() {
      return this.at;
   }

   public int ordinal() {
      return -1624506429 * this.aa;
   }

   public static Language aq_renamed(int var0, byte var1) {
      if (var0 >= 0) {
         if (var0 < ay.length) {
            return ay[var0];
         }

         if (var1 != -1) {
            throw new IllegalStateException();
         }
      }

      return null;
   }

   public String toString() {
      return this.ab().toLowerCase(Locale.ENGLISH);
   }

   static Object cc_renamed(sh var0) {
      if (null == var0) {
         throw new IllegalStateException("popValueOfType() failure - null baseVarType");
      } else {
         switch (var0.ac * -22191699) {
            case 1:
               return Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
            case 2:
               return Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
            default:
               throw new IllegalStateException("popValueOfType() failure - unsupported type");
         }
      }
   }

   static final void jv_renamed(boolean var0) {
      mj.hz_renamed();
      PacketWriter var10000 = Client.in;
      var10000.ay += -1313905755;
      if (1383386157 * Client.in.ay >= 50 || var0) {
         Client.in.ay = 0;
         if (!Client.ik && Client.in.getSocket() != null) {
            PacketBitNode var2 = mi.an_renamed(ClientProt.by, Client.in.au);
            Client.in.aw(var2);

            try {
               Client.in.an();
            } catch (IOException var4) {
               Client.ik = true;
            }
         }

      }
   }
}
