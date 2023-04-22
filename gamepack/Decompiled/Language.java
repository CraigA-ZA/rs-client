import java.io.IOException;
import java.util.Locale;

@nk
@lj
public class Language implements Enumerated {
   public static final Language af;
   static MiniMenuEntry tempMenuAction;
   public static final Language aw;
   static final Language ac;
   static final Language au;
   public static final Language ab;
   static final Language aq;
   final String at;
   final int aa;
   static Font fontPlain11;
   static final Language an;
   final String al;
   static final Language[] ay;

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

   public int af() {
      return -1624506429 * this.aa;
   }

   String ab() {
      return this.at;
   }

   public String toString() {
      return this.ab().toLowerCase(Locale.ENGLISH);
   }

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

   static final void jv_renamed(boolean var0) {
      mj.hz_renamed();
      PacketWriter var10000 = Client.packetWriter;
      var10000.ay += -1313905755;
      if (1383386157 * Client.packetWriter.ay >= 50 || var0) {
         Client.packetWriter.ay = 0;
         if (!Client.ik && Client.packetWriter.getSocket() != null) {
            PacketBitNode var2 = mi.an_renamed(ClientProt.by, Client.packetWriter.au);
            Client.packetWriter.aw(var2);

            try {
               Client.packetWriter.an();
            } catch (IOException var4) {
               Client.ik = true;
            }
         }

      }
   }

   static Language[] au_renamed() {
      return new Language[]{aw, au, an, aq, ac, af, ab};
   }

   static Object cc_renamed(sh var0) {
      if (null == var0) {
         throw new IllegalStateException("popValueOfType() failure - null baseVarType");
      } else {
         switch (var0.ac * -22191699) {
            case 1:
               return Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            case 2:
               return Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
            default:
               throw new IllegalStateException("popValueOfType() failure - unsupported type");
         }
      }
   }

   public static AttackOption[] au_renamed() {
      return new AttackOption[]{AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_leftClickWhereAvailable};
   }
}
