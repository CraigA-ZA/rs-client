import java.util.Comparator;

class pg implements Comparator {
   // $FF: synthetic field
   final pk this$0;
   static int ab;

   public int compare(Object var1, Object var2) {
      try {
         return this.af((pj)var1, (pj)var2, 386384998);
      } catch (RuntimeException var3) {
         throw db.an(var3, "pg.compare(" + ')');
      }
   }

   int af(pj var1, pj var2, int var3) {
      try {
         if (3457501928509627443L * var1.aw > 3457501928509627443L * var2.aw) {
            if (var3 <= 165800406) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else {
            return 3457501928509627443L * var1.aw < 3457501928509627443L * var2.aw ? -1 : 0;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "pg.af(" + ')');
      }
   }

   int ac(pj var1, pj var2) {
      if (3457501928509627443L * var1.aw > 3457501928509627443L * var2.aw) {
         return 1;
      } else {
         return 3457501928509627443L * var1.aw < 3457501928509627443L * var2.aw ? -1 : 0;
      }
   }

   int aw(pj var1, pj var2) {
      if (3457501928509627443L * var1.aw > 3457501928509627443L * var2.aw) {
         return 1;
      } else {
         return 3457501928509627443L * var1.aw < 3457501928509627443L * var2.aw ? -1 : 0;
      }
   }

   public boolean gq(Object var1) {
      return super.equals(var1);
   }

   public int ab(Object var1, Object var2) {
      return this.af((pj)var1, (pj)var2, 719017983);
   }

   public int aq(Object var1, Object var2) {
      return this.af((pj)var1, (pj)var2, 1414463712);
   }

   public int al(Object var1, Object var2) {
      return this.af((pj)var1, (pj)var2, 990010626);
   }

   public boolean gm(Object var1) {
      return super.equals(var1);
   }

   pg(pk var1) {
      this.this$0 = var1;
   }

   public boolean gk(Object var1) {
      return super.equals(var1);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "pg.equals(" + ')');
      }
   }

   int an(pj var1, pj var2) {
      if (3457501928509627443L * var1.aw > 3457501928509627443L * var2.aw) {
         return 1;
      } else {
         return 3457501928509627443L * var1.aw < 3457501928509627443L * var2.aw ? -1 : 0;
      }
   }

   public boolean gi(Object var1) {
      return super.equals(var1);
   }

   public int au(Object var1, Object var2) {
      return this.af((pj)var1, (pj)var2, 2015069283);
   }

   int at(pj var1, pj var2) {
      if (3457501928509627443L * var1.aw > 3457501928509627443L * var2.aw) {
         return 1;
      } else {
         return 3457501928509627443L * var1.aw < 3457501928509627443L * var2.aw ? -1 : 0;
      }
   }

   public static String af(CharSequence var0, int var1) {
      try {
         int var2 = var0.length();
         StringBuilder var3 = new StringBuilder(var2);

         for(int var4 = 0; var4 < var2; ++var4) {
            char var5;
            label108: {
               var5 = var0.charAt(var4);
               if (var5 >= 'a') {
                  if (var1 <= 1423380424) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= 'z') {
                     break label108;
                  }

                  if (var1 <= 1423380424) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 >= 'A') {
                  if (var1 <= 1423380424) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= 'Z') {
                     break label108;
                  }

                  if (var1 <= 1423380424) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 >= '0') {
                  if (var1 <= 1423380424) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= '9') {
                     break label108;
                  }
               }

               if ('.' != var5 && var5 != '-' && '*' != var5) {
                  if (var1 <= 1423380424) {
                     throw new IllegalStateException();
                  }

                  if ('_' != var5) {
                     if (' ' == var5) {
                        if (var1 <= 1423380424) {
                           throw new IllegalStateException();
                        }

                        var3.append('+');
                     } else {
                        byte var6 = dn.af(var5, (byte)-20);
                        var3.append('%');
                        int var7 = var6 >> 4 & 15;
                        if (var7 >= 10) {
                           if (var1 <= 1423380424) {
                              throw new IllegalStateException();
                           }

                           var3.append((char)(var7 + 55));
                        } else {
                           var3.append((char)(48 + var7));
                        }

                        var7 = var6 & 15;
                        if (var7 >= 10) {
                           if (var1 <= 1423380424) {
                              throw new IllegalStateException();
                           }

                           var3.append((char)(55 + var7));
                        } else {
                           var3.append((char)(var7 + 48));
                        }
                     }
                     continue;
                  }

                  if (var1 <= 1423380424) {
                     throw new IllegalStateException();
                  }
               }
            }

            var3.append(var5);
         }

         return var3.toString();
      } catch (RuntimeException var8) {
         throw db.an(var8, "pg.af(" + ')');
      }
   }
}
