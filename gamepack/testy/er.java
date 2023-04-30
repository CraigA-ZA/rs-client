public class er extends pz {
   static final int tm = 50;
   static final int fs = 22;
   static final int aw = 320;
   public static final int am = 17;
   final boolean af;
   static final int bx = 5;

   static int aa(int var0, int var1) {
      try {
         cq var2 = (cq)eo.an.af((long)var0);
         if (var2 == null) {
            if (var1 == -783463561) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else if (eo.aw.af == var2.ej) {
            if (var1 == -783463561) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return -1117255211 * ((cq)var2.ej).af;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "er.aa(" + ')');
      }
   }

   int af(pb var1, pb var2, byte var3) {
      try {
         if (var1.aq * 1922414955 != 1922414955 * var2.aq) {
            if (var3 == 0) {
               throw new IllegalStateException();
            } else {
               int var10000;
               if (this.af) {
                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }

                  var10000 = var1.aq * 1922414955 - 1922414955 * var2.aq;
               } else {
                  var10000 = var2.aq * 1922414955 - var1.aq * 1922414955;
               }

               return var10000;
            }
         } else {
            return this.ao(var1, var2, 641920470);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "er.af(" + ')');
      }
   }

   int aw(pb var1, pb var2) {
      if (var1.aq * 1922414955 != 1922414955 * var2.aq) {
         return this.af ? var1.aq * 1922414955 - 1922414955 * var2.aq : var2.aq * 1922414955 - var1.aq * 1922414955;
      } else {
         return this.ao(var1, var2, 641920470);
      }
   }

   public int au(Object var1, Object var2) {
      return this.af((pb)((pb)var1), (pb)((pb)var2), (byte)57);
   }

   public int ab(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, (byte)-53);
   }

   public er(boolean var1) {
      try {
         super();
         this.af = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "er.<init>(" + ')');
      }
   }

   public int al(Object var1, Object var2) {
      return this.af((pb)((pb)var1), (pb)((pb)var2), (byte)17);
   }

   int an(pb var1, pb var2) {
      if (var1.aq * 1922414955 != 1922414955 * var2.aq) {
         return this.af ? var1.aq * 1922414955 - 1922414955 * var2.aq : var2.aq * 1922414955 - var1.aq * 1922414955;
      } else {
         return this.ao(var1, var2, 641920470);
      }
   }

   public int aq(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, (byte)-112);
   }

   int ac(pb var1, pb var2) {
      if (var1.aq * 1922414955 != 1922414955 * var2.aq) {
         return this.af ? var1.aq * 1922414955 - 1922414955 * var2.aq : var2.aq * 1922414955 - var1.aq * 1922414955;
      } else {
         return this.ao(var1, var2, 641920470);
      }
   }

   public static void af(nm var0, nm var1, int var2) {
      try {
         hh.af = var0;
         hh.an = var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "er.af(" + ')');
      }
   }

   static long af(int var0, int var1, int var2, int var3) {
      try {
         return (long)(var2 << 16 | var0 << 8 | var1);
      } catch (RuntimeException var4) {
         throw db.an(var4, "er.af(" + ')');
      }
   }

   public static String ao(String var0, byte var1) {
      try {
         int var2 = var0.length();
         char[] var3 = new char[var2];
         byte var4 = 2;

         for(int var5 = 0; var5 < var2; ++var5) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            char var6 = var0.charAt(var5);
            if (0 == var4) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               var6 = Character.toLowerCase(var6);
            } else {
               label92: {
                  if (var4 != 2) {
                     if (var1 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (!Character.isUpperCase(var6)) {
                        break label92;
                     }

                     if (var1 >= 1) {
                        throw new IllegalStateException();
                     }
                  }

                  var6 = jb.aw(var6, -1200984421);
               }
            }

            if (Character.isLetter(var6)) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               var4 = 0;
            } else {
               label93: {
                  if (var6 != '.') {
                     if (var1 >= 1) {
                        throw new IllegalStateException();
                     }

                     if ('?' != var6) {
                        if (var1 >= 1) {
                           throw new IllegalStateException();
                        }

                        if (var6 != '!') {
                           if (Character.isSpaceChar(var6)) {
                              if (var1 >= 1) {
                                 throw new IllegalStateException();
                              }

                              if (var4 != 2) {
                                 if (var1 >= 1) {
                                    throw new IllegalStateException();
                                 }

                                 var4 = 1;
                              }
                           } else {
                              var4 = 1;
                           }
                           break label93;
                        }
                     }
                  }

                  var4 = 2;
               }
            }

            var3[var5] = var6;
         }

         return new String(var3);
      } catch (RuntimeException var7) {
         throw db.an(var7, "er.ao(" + ')');
      }
   }

   public static int ah(int var0, int var1) {
      try {
         if (var0 > 0) {
            if (var1 != -1723997839) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else {
            return var0 < 0 ? -1 : 0;
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "er.ah(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.af((pb)var1, (pb)var2, (byte)-49);
      } catch (RuntimeException var3) {
         throw db.an(var3, "er.compare(" + ')');
      }
   }
}
