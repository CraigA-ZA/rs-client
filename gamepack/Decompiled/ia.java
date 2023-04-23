import java.net.URL;

public abstract class ia {
   public static MusicTrack musicTrack;
   public static AbstractRasterProvider rasterProvider;
   public int ac;
   public int af;
   public int an;
   public int aw;

   protected ia() {
   }

   static boolean aw_renamed(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!bx.an.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var5 = 0; var5 < var0.length(); ++var5) {
                  if (var11.indexOf(var0.charAt(var5)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var6) {
            return false;
         }
      } else if (1 == var1) {
         try {
            Object var4 = by.aw_renamed(bx.af, var2, new Object[]{(new URL(bx.af.getCodeBase(), var0)).toString()});
            return var4 != null;
         } catch (Throwable var7) {
            return false;
         }
      } else if (2 == var1) {
         try {
            bx.af.getAppletContext().showDocument(new URL(bx.af.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else if (3 == var1) {
         try {
            by.an_renamed(bx.af, "loggedout");
         } catch (Throwable var10) {
         }

         try {
            bx.af.getAppletContext().showDocument(new URL(bx.af.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var9) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static byte[] ac_renamed(CharSequence var0) {
      int var2 = var0.length();
      byte[] var3 = new byte[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 > 0 && var5 < 128 || var5 >= 160 && var5 <= 255) {
            var3[var4] = (byte)var5;
         } else if (8364 == var5) {
            var3[var4] = -128;
         } else if (8218 == var5) {
            var3[var4] = -126;
         } else if (402 == var5) {
            var3[var4] = -125;
         } else if (8222 == var5) {
            var3[var4] = -124;
         } else if (8230 == var5) {
            var3[var4] = -123;
         } else if (8224 == var5) {
            var3[var4] = -122;
         } else if (var5 == 8225) {
            var3[var4] = -121;
         } else if (var5 == 710) {
            var3[var4] = -120;
         } else if (8240 == var5) {
            var3[var4] = -119;
         } else if (var5 == 352) {
            var3[var4] = -118;
         } else if (var5 == 8249) {
            var3[var4] = -117;
         } else if (var5 == 338) {
            var3[var4] = -116;
         } else if (var5 == 381) {
            var3[var4] = -114;
         } else if (8216 == var5) {
            var3[var4] = -111;
         } else if (8217 == var5) {
            var3[var4] = -110;
         } else if (var5 == 8220) {
            var3[var4] = -109;
         } else if (var5 == 8221) {
            var3[var4] = -108;
         } else if (var5 == 8226) {
            var3[var4] = -107;
         } else if (8211 == var5) {
            var3[var4] = -106;
         } else if (8212 == var5) {
            var3[var4] = -105;
         } else if (var5 == 732) {
            var3[var4] = -104;
         } else if (var5 == 8482) {
            var3[var4] = -103;
         } else if (353 == var5) {
            var3[var4] = -102;
         } else if (8250 == var5) {
            var3[var4] = -101;
         } else if (339 == var5) {
            var3[var4] = -100;
         } else if (var5 == 382) {
            var3[var4] = -98;
         } else if (var5 == 376) {
            var3[var4] = -97;
         } else {
            var3[var4] = 63;
         }
      }

      return var3;
   }

   static final void jc_renamed(boolean var0) {
      for(int var2 = 0; var2 < 265474485 * Client.iw; ++var2) {
         Npc var3 = Client.npcs[Client.iy[var2]];
         if (var3 != null && var3.isVisible() && var0 == var3.type.bm && var3.type.aa()) {
            int var4 = var3.bx * 1144428983 >> 7;
            int var5 = var3.bo * -411750205 >> 7;
            if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
               if (1 == var3.size * 353040509 && 64 == (var3.bx * 1144428983 & 127) && 64 == (-411750205 * var3.bo & 127)) {
                  if (Client.mw * 2041464667 == Client.mt[var4][var5]) {
                     continue;
                  }

                  Client.mt[var4][var5] = 2041464667 * Client.mw;
               }

               long var6 = ir.aa_renamed(0, 0, 1, !var3.type.isInteractable, Client.iy[var2]);
               var3.bd = -14183397 * Client.ep;
               bx.scene.ao(GameShell.plane * -1727408401, 1144428983 * var3.bx, -411750205 * var3.bo, fq.getTileHeight(1119756096 * var3.size - 64 + 1144428983 * var3.bx, 1119756096 * var3.size - 64 + var3.bo * -411750205, -1727408401 * GameShell.plane), 60 + (1119756096 * var3.size - 64), var3, var3.bz * -1703696531, var6, var3.an);
            }
         }
      }

   }

   protected abstract boolean af(int var1, int var2, int var3, CollisionMap var4);
}
