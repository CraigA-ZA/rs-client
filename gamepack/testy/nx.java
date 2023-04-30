import accessors.RSLanguage;
import java.io.IOException;
import java.util.Locale;

@nk
@lj
public class nx implements nj, RSLanguage {
   public static final nx af;
   static cb ot;
   public static final nx aw;
   static final nx ac;
   static final nx au;
   public static final nx ab;
   static final nx aq;
   static final int bn = 14;
   final String at;
   final int aa;
   static on ir;
   static final nx an;
   public static final int bk = 1024;
   final String al;
   static final nx[] ay;
   static final int dr = 3;

   public static nx aq(int var0, byte var1) {
      try {
         if (var0 >= 0) {
            if (var0 < ay.length) {
               return ay[var0];
            }

            if (var1 != -1) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "nx.aq(" + ')');
      }
   }

   nx(String var1, String var2, String var3, ne var4, int var5, String var6) {
      try {
         super();
         this.al = var1;
         this.at = var2;
         this.aa = var5 * 69691627;
         if (null != var6) {
            new Locale(var2.substring(0, 2), var6);
         } else {
            new Locale(var2.substring(0, 2));
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "nx.<init>(" + ')');
      }
   }

   public static nx ah(int var0) {
      return var0 >= 0 && var0 < ay.length ? ay[var0] : null;
   }

   public int af(int var1) {
      try {
         return -1624506429 * this.aa;
      } catch (RuntimeException var2) {
         throw db.an(var2, "nx.af(" + ')');
      }
   }

   String ab(byte var1) {
      try {
         return this.at;
      } catch (RuntimeException var2) {
         throw db.an(var2, "nx.ab(" + ')');
      }
   }

   public String toString() {
      try {
         return this.ab((byte)80).toLowerCase(Locale.ENGLISH);
      } catch (RuntimeException var1) {
         throw db.an(var1, "nx.toString(" + ')');
      }
   }

   static {
      af = new nx("EN", "en", "English", ne.af, 0, "GB");
      an = new nx("DE", "de", "German", ne.af, 1, "DE");
      aw = new nx("FR", "fr", "French", ne.af, 2, "FR");
      ac = new nx("PT", "pt", "Portuguese", ne.af, 3, "BR");
      au = new nx("NL", "nl", "Dutch", ne.ac, 4, "NL");
      ab = new nx("ES", "es", "Spanish", ne.ac, 5, "ES");
      aq = new nx("ES_MX", "es-mx", "Spanish (Latin American)", ne.af, 6, "MX");
      nx[] var0 = au((byte)-121);
      ay = new nx[var0.length];
      nx[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         nx var3 = var1[var2];
         if (ay[-1624506429 * var3.aa] != null) {
            throw new IllegalStateException();
         }

         ay[-1624506429 * var3.aa] = var3;
      }

   }

   public String ahp() {
      return this.ab((byte)90).toLowerCase(Locale.ENGLISH);
   }

   public int aw() {
      return -1624506429 * this.aa;
   }

   public int ac() {
      return -1624506429 * this.aa;
   }

   public String ahm() {
      return this.ab((byte)43).toLowerCase(Locale.ENGLISH);
   }

   public static nx ag(int var0) {
      return var0 >= 0 && var0 < ay.length ? ay[var0] : null;
   }

   String ao() {
      return this.at;
   }

   static final void jv(boolean var0, int var1) {
      try {
         mj.hz(-1516350255);
         eq var10000 = client.in;
         var10000.ay += -1313905755;
         if (1383386157 * client.in.ay < 50) {
            if (var1 >= 243413340) {
               throw new IllegalStateException();
            }

            if (!var0) {
               if (var1 >= 243413340) {
                  throw new IllegalStateException();
               }

               return;
            }
         }

         client.in.ay = 0;
         if (!client.ik) {
            if (var1 >= 243413340) {
               throw new IllegalStateException();
            }

            if (client.in.aq((byte)21) != null) {
               lg var2 = mi.an(lv.by, client.in.au, (short)-19971);
               client.in.aw(var2, 414135591);

               try {
                  client.in.an(421941662);
               } catch (IOException var4) {
                  client.ik = true;
               }
            }
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "nx.jv(" + ')');
      }
   }

   static nx[] at() {
      return new nx[]{aw, au, an, aq, ac, af, ab};
   }

   static nx[] aa() {
      return new nx[]{aw, au, an, aq, ac, af, ab};
   }

   String ay() {
      return this.at;
   }

   static nx[] al() {
      return new nx[]{aw, au, an, aq, ac, af, ab};
   }

   String ax() {
      return this.at;
   }

   public static nx ai(int var0) {
      return var0 >= 0 && var0 < ay.length ? ay[var0] : null;
   }

   static nx[] au(byte var0) {
      try {
         return new nx[]{aw, au, an, aq, ac, af, ab};
      } catch (RuntimeException var1) {
         throw db.an(var1, "nx.au(" + ')');
      }
   }

   public int an() {
      return -1624506429 * this.aa;
   }

   static Object cc(sh var0, byte var1) {
      try {
         if (null == var0) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("popValueOfType() failure - null baseVarType");
            }
         } else {
            switch (var0.ac * -22191699) {
               case 1:
                  return cy.al[(cy.at -= 427135973) * -964267539];
               case 2:
                  return cy.aa[(dm.ay -= -1086551379) * -2017760987];
               default:
                  throw new IllegalStateException("popValueOfType() failure - unsupported type");
            }
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "nx.cc(" + ')');
      }
   }

   public String ahj() {
      return this.ab((byte)40).toLowerCase(Locale.ENGLISH);
   }

   public static mb[] au(byte var0) {
      try {
         return new mb[]{mb.af, mb.ac, mb.an, mb.aw};
      } catch (RuntimeException var1) {
         throw db.an(var1, "nx.au(" + ')');
      }
   }
}
