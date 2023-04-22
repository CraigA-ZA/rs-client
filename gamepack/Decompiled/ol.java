public class ol {
   public static BufferedFile[] idxFiles;
   static char[] an;
   static char[] aw;
   static char[] af = new char[64];
   static int[] ac;

   ol() throws Throwable {
      throw new Error();
   }

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         af[var0] = (char)(65 + var0);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         af[var0] = (char)(97 + var0 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         af[var0] = (char)(var0 + 48 - 52);
      }

      af[62] = '+';
      af[63] = '/';
      an = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         an[var0] = (char)(65 + var0);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         an[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         an[var0] = (char)(48 + var0 - 52);
      }

      an[62] = '*';
      an[63] = '-';
      aw = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         aw[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         aw[var0] = (char)(97 + var0 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         aw[var0] = (char)(var0 + 48 - 52);
      }

      aw[62] = '-';
      aw[63] = '_';
      ac = new int[128];

      for(var0 = 0; var0 < ac.length; ++var0) {
         ac[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         ac[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         ac[var0] = 26 + (var0 - 97);
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         ac[var0] = 52 + (var0 - 48);
      }

      int[] var3 = ac;
      ac[43] = 62;
      var3[42] = 62;
      int[] var1 = ac;
      ac[47] = 63;
      var1[45] = 63;
   }

   static final void mm_renamed(Component var0, int var1, int var2) {
      if (Client.pr == null && !Client.isMiniMenuOpen) {
         if (var0 != null) {
            Component var6 = var0;
            int var7 = StructType.an_renamed(KeyHandler.getComponentClickMask(var0));
            Component var5;
            int var8;
            if (0 == var7) {
               var5 = null;
            } else {
               var8 = 0;

               while(true) {
                  if (var8 >= var7) {
                     var5 = var6;
                     break;
                  }

                  var6 = gh.an_renamed(var6.parentId * 913615679);
                  if (var6 == null) {
                     var5 = null;
                     break;
                  }

                  ++var8;
               }
            }

            Component var9 = var5;
            if (null == var5) {
               var9 = var0.parent;
            }

            if (var9 != null) {
               Client.pr = var0;
               var6 = var0;
               var7 = StructType.an_renamed(KeyHandler.getComponentClickMask(var0));
               if (0 == var7) {
                  var5 = null;
               } else {
                  var8 = 0;

                  while(true) {
                     if (var8 >= var7) {
                        var5 = var6;
                        break;
                     }

                     var6 = gh.an_renamed(var6.parentId * 913615679);
                     if (var6 == null) {
                        var5 = null;
                        break;
                     }

                     ++var8;
                  }
               }

               var9 = var5;
               if (var5 == null) {
                  var9 = var0.parent;
               }

               Client.pf = var9;
               Client.pd = -489272497 * var1;
               Client.pw = var2 * 1757453321;
               Formatting.qe = 0;
               Client.pn = false;
               int var10 = DynamicObject.lm_renamed();
               if (var10 != -1) {
                  lm.mv_renamed(var10);
               }

               return;
            }
         }

      }
   }
}
