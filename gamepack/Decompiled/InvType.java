public class InvType extends DualNode {
   static EvictingDualNodeHashTable an = new EvictingDualNodeHashTable(64);
   static AbstractArchive af;
   public int size = 0;

   InvType() {
   }

   void decode(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (0 == var3) {
            return;
         }

         this.decode0(var1, var3);
      }
   }

   void decode0(Packet var1, int var2) {
      if (2 == var2) {
         this.size = var1.cl() * -28904041;
      }

   }

   static final void lf_renamed(Npc var0, int var1, int var2, int var3) {
      NPCType var5 = var0.type;
      if (730065501 * Client.menuOptionsCount < 400) {
         if (var5.transforms != null) {
            var5 = var5.transform();
         }

         if (null != var5) {
            if (var5.isInteractable) {
               if (!var5.isFollower || var1 == Client.pt * 2050107857) {
                  String var6 = var0.at();
                  int var7;
                  if (0 != 2062903815 * var5.bx && var0.eq * 674049519 != 0) {
                     var7 = 674049519 * var0.eq != -1 ? 674049519 * var0.eq : 2062903815 * var5.bx;
                     var6 = var6 + Inventory.lu_renamed(var7, MusicPatchNode.localPlayer.combatLevel * 1302967875) + " " + Formatting.Formatting_spaceLeftParenthesis + Strings.Strings_level + var7 + Formatting.Formatting_rightParenthesis;
                  }

                  if (var5.isFollower && Client.ov) {
                     MiniMenuEntry.kz_renamed(Strings.Strings_examine, oa.colorStartTag(16776960) + var6, 1003, var1, var2, var3);
                  }

                  if (1 == -303899309 * Client.oq) {
                     MiniMenuEntry.kz_renamed(Strings.Strings_use, Client.selectedItemName + " " + Formatting.Formatting_rightArrow + " " + oa.colorStartTag(16776960) + var6, 7, var1, var2, var3);
                  } else if (Client.om) {
                     if (2 == (1457791911 * SecureRandomFuture.oo & 2)) {
                        MiniMenuEntry.kz_renamed(Client.oj, Client.selectedSpellName + " " + Formatting.Formatting_rightArrow + " " + oa.colorStartTag(16776960) + var6, 8, var1, var2, var3);
                     }
                  } else {
                     var7 = var5.isFollower && Client.ov ? 2000 : 0;
                     String[] var8 = var5.op;
                     int var9;
                     int var10;
                     if (var8 != null) {
                        for(var9 = 4; var9 >= 0; --var9) {
                           if (var0.ac(var9) && null != var8[var9] && !var8[var9].equalsIgnoreCase(Strings.Strings_attack)) {
                              var10 = 0;
                              if (0 == var9) {
                                 var10 = 9 + var7;
                              }

                              if (1 == var9) {
                                 var10 = var7 + 10;
                              }

                              if (2 == var9) {
                                 var10 = var7 + 11;
                              }

                              if (var9 == 3) {
                                 var10 = 12 + var7;
                              }

                              if (4 == var9) {
                                 var10 = var7 + 13;
                              }

                              MiniMenuEntry.kz_renamed(var8[var9], oa.colorStartTag(16776960) + var6, var10, var1, var2, var3);
                           }
                        }
                     }

                     if (null != var8) {
                        for(var9 = 4; var9 >= 0; --var9) {
                           if (var0.ac(var9) && var8[var9] != null && var8[var9].equalsIgnoreCase(Strings.Strings_attack)) {
                              short var18 = 0;
                              if (dj.ac != Client.ew) {
                                 if (dj.an == Client.ew || Client.ew == dj.af && var5.bx * 2062903815 > MusicPatchNode.localPlayer.combatLevel * 1302967875) {
                                    var18 = 2000;
                                 }

                                 var10 = 0;
                                 if (var9 == 0) {
                                    var10 = 9 + var18;
                                 }

                                 if (1 == var9) {
                                    var10 = var18 + 10;
                                 }

                                 if (2 == var9) {
                                    var10 = var18 + 11;
                                 }

                                 if (3 == var9) {
                                    var10 = 12 + var18;
                                 }

                                 if (4 == var9) {
                                    var10 = var18 + 13;
                                 }

                                 MiniMenuEntry.kz_renamed(var8[var9], oa.colorStartTag(16776960) + var6, var10, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if (!var5.isFollower || !Client.ov) {
                        MiniMenuEntry.kz_renamed(Strings.Strings_examine, oa.colorStartTag(16776960) + var6, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }

   static String nb_renamed(String var0, boolean var1) {
      String var3 = var1 ? "https://" : "http://";
      if (Client.cs * -1274626977 == 1) {
         var0 = var0 + "-wtrc";
      } else if (Client.cs * -1274626977 == 2) {
         var0 = var0 + "-wtqa";
      } else if (3 == Client.cs * -1274626977) {
         var0 = var0 + "-wtwip";
      } else if (5 == -1274626977 * Client.cs) {
         var0 = var0 + "-wti";
      } else if (-1274626977 * Client.cs == 4) {
         var0 = "local";
      }

      String var4 = "";
      if (ef.cm != null) {
         var4 = "/p=" + ef.cm;
      }

      String var5 = "runescape.com";
      return var3 + var0 + "." + var5 + "/l=" + fj.ck + "/a=" + TriBool.cf * 1640118701 + var4 + "/";
   }

   public static boolean ok_renamed() {
      return Client.pr != null;
   }
}
