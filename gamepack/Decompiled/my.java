import java.io.File;

public class my {
   public static File au;
   static int ah;

   my() throws Throwable {
      throw new Error();
   }

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

   static final void lo_renamed(Component var0) {
      String var2;
      int var3;
      int var4;
      if (1 == var0.buttonType * 35076151) {
         var2 = var0.buttonText;
         var3 = 1713081171 * var0.id;
         var4 = var0.itemId * -2006098851;
         TilePaint.addMiniMenuEntry(var2, "", 24, 0, 0, var3, var4, false);
      }

      if (var0.buttonType * 35076151 == 2 && !Client.om) {
         var2 = MusicPatchNode.nu_renamed(var0);
         if (var2 != null) {
            fd.km_renamed(var2, oa.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id * 1713081171, var0.itemId * -2006098851);
         }
      }

      if (var0.buttonType * 35076151 == 3) {
         MiniMenuEntry.kz_renamed(Strings.Strings_close, "", 26, 0, 0, var0.id * 1713081171);
      }

      if (4 == 35076151 * var0.buttonType) {
         MiniMenuEntry.kz_renamed(var0.buttonText, "", 28, 0, 0, 1713081171 * var0.id);
      }

      if (var0.buttonType * 35076151 == 5) {
         MiniMenuEntry.kz_renamed(var0.buttonText, "", 29, 0, 0, 1713081171 * var0.id);
      }

      if (6 == 35076151 * var0.buttonType && Client.pg == null) {
         MiniMenuEntry.kz_renamed(var0.buttonText, "", 30, 0, -1, var0.id * 1713081171);
      }

      if (var0.isIf3) {
         if (Client.om) {
            if (ClientScriptEvent.ac_renamed(KeyHandler.getComponentClickMask(var0)) && (1457791911 * SecureRandomFuture.oo & 32) == 32) {
               fd.km_renamed(Client.oj, Client.selectedSpellName + " " + Formatting.Formatting_rightArrow + " " + var0.opbase, 58, 0, 55577617 * var0.childIndex, var0.id * 1713081171, -2006098851 * var0.itemId);
            }
         } else {
            for(int var7 = 9; var7 >= 5; --var7) {
               int var5 = KeyHandler.getComponentClickMask(var0);
               boolean var9 = 0 != (var5 >> 1 + var7 & 1);
               String var8;
               if (!var9 && null == var0.onMouseOver) {
                  var8 = null;
               } else if (null != var0.ops && var0.ops.length > var7 && null != var0.ops[var7] && var0.ops[var7].trim().length() != 0) {
                  var8 = var0.ops[var7];
               } else {
                  var8 = null;
               }

               if (var8 != null) {
                  fd.km_renamed(var8, var0.opbase, 1007, var7 + 1, var0.childIndex * 55577617, var0.id * 1713081171, var0.itemId * -2006098851);
               }
            }

            var2 = MusicPatchNode.nu_renamed(var0);
            if (null != var2) {
               fd.km_renamed(var2, var0.opbase, 25, 0, 55577617 * var0.childIndex, var0.id * 1713081171, var0.itemId * -2006098851);
            }

            for(var3 = 4; var3 >= 0; --var3) {
               int var6 = KeyHandler.getComponentClickMask(var0);
               boolean var12 = 0 != (var6 >> 1 + var3 & 1);
               String var10;
               if (!var12 && null == var0.onMouseOver) {
                  var10 = null;
               } else if (var0.ops != null && var0.ops.length > var3 && var0.ops[var3] != null && var0.ops[var3].trim().length() != 0) {
                  var10 = var0.ops[var3];
               } else {
                  var10 = null;
               }

               if (null != var10) {
                  TilePaint.addMiniMenuEntry(var10, var0.opbase, 57, 1 + var3, 55577617 * var0.childIndex, var0.id * 1713081171, var0.itemId * -2006098851, var0.hh);
               }
            }

            var4 = KeyHandler.getComponentClickMask(var0);
            boolean var11 = (var4 & 1) != 0;
            if (var11) {
               MiniMenuEntry.kz_renamed(Strings.Strings_continue, "", 30, 0, var0.childIndex * 55577617, var0.id * 1713081171);
            }
         }
      }

   }
}
