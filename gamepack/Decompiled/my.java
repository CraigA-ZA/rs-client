import java.io.File;

public class my {
   public static File au;
   static int ah;

   static {
      int var0 = 0;
      int var1 = 0;
      mi[] var2 = au.af_renamed();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         mi var4 = var2[var3];
         if (413496273 * var4.aw > var0) {
            var0 = 413496273 * var4.aw;
         }

         if (1618476451 * var4.ac > var1) {
            var1 = var4.ac * 1618476451;
         }
      }

   }

   my() throws Throwable {
      throw new Error();
   }

   static final void lo_renamed(Component var0) {
      String var2;
      int var3;
      int var4;
      if (1 == var0.bu * 35076151) {
         var2 = var0.gk;
         var3 = 1713081171 * var0.bs;
         var4 = var0.gn * -2006098851;
         TilePaint.addMiniMenuEntry(var2, "", 24, 0, 0, var3, var4, false);
      }

      if (var0.bu * 35076151 == 2 && !Client.om) {
         var2 = MusicPatchNode.nu_renamed(var0);
         if (var2 != null) {
            fd.km_renamed(var2, oa.colorStartTag(65280) + var0.gq, 25, 0, -1, var0.bs * 1713081171, var0.gn * -2006098851);
         }
      }

      if (var0.bu * 35076151 == 3) {
         MiniMenuEntry.kz_renamed(Strings.gq, "", 26, 0, 0, var0.bs * 1713081171);
      }

      if (4 == 35076151 * var0.bu) {
         MiniMenuEntry.kz_renamed(var0.gk, "", 28, 0, 0, 1713081171 * var0.bs);
      }

      if (var0.bu * 35076151 == 5) {
         MiniMenuEntry.kz_renamed(var0.gk, "", 29, 0, 0, 1713081171 * var0.bs);
      }

      if (6 == 35076151 * var0.bu && Client.pg == null) {
         MiniMenuEntry.kz_renamed(var0.gk, "", 30, 0, -1, var0.bs * 1713081171);
      }

      if (var0.bn) {
         if (Client.om) {
            if (ClientScriptEvent.ac_renamed(KeyHandler.getComponentClickMask(var0)) && (1457791911 * SecureRandomFuture.oo & 32) == 32) {
               fd.km_renamed(Client.oj, Client.ob + " " + Formatting.ab + " " + var0.eh, 58, 0, 55577617 * var0.br, var0.bs * 1713081171, -2006098851 * var0.gn);
            }
         } else {
            for(int var7 = 9; var7 >= 5; --var7) {
               int var5 = KeyHandler.getComponentClickMask(var0);
               boolean var9 = 0 != (var5 >> 1 + var7 & 1);
               String var8;
               if (!var9 && null == var0.fg) {
                  var8 = null;
               } else if (null != var0.ek && var0.ek.length > var7 && null != var0.ek[var7] && var0.ek[var7].trim().length() != 0) {
                  var8 = var0.ek[var7];
               } else {
                  var8 = null;
               }

               if (var8 != null) {
                  fd.km_renamed(var8, var0.eh, 1007, var7 + 1, var0.br * 55577617, var0.bs * 1713081171, var0.gn * -2006098851);
               }
            }

            var2 = MusicPatchNode.nu_renamed(var0);
            if (null != var2) {
               fd.km_renamed(var2, var0.eh, 25, 0, 55577617 * var0.br, var0.bs * 1713081171, var0.gn * -2006098851);
            }

            for(var3 = 4; var3 >= 0; --var3) {
               int var6 = KeyHandler.getComponentClickMask(var0);
               boolean var12 = 0 != (var6 >> 1 + var3 & 1);
               String var10;
               if (!var12 && null == var0.fg) {
                  var10 = null;
               } else if (var0.ek != null && var0.ek.length > var3 && var0.ek[var3] != null && var0.ek[var3].trim().length() != 0) {
                  var10 = var0.ek[var3];
               } else {
                  var10 = null;
               }

               if (null != var10) {
                  TilePaint.addMiniMenuEntry(var10, var0.eh, 57, 1 + var3, 55577617 * var0.br, var0.bs * 1713081171, var0.gn * -2006098851, var0.hh);
               }
            }

            var4 = KeyHandler.getComponentClickMask(var0);
            boolean var11 = (var4 & 1) != 0;
            if (var11) {
               MiniMenuEntry.kz_renamed(Strings.aq, "", 30, 0, var0.br * 55577617, var0.bs * 1713081171);
            }
         }
      }

   }
}
