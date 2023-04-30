import accessors.RSSecureRandomFuture;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class cj implements RSSecureRandomFuture {
   Future an;
   static int oo;
   static final int bi = 3;
   static final int bu = 0;
   ExecutorService af;

   SecureRandom aa() {
      try {
         return (SecureRandom)this.an.get();
      } catch (Exception var4) {
         SecureRandom var3 = new SecureRandom();
         var3.nextInt();
         return var3;
      }
   }

   void af(int var1) {
      try {
         this.af.shutdown();
         this.af = null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "cj.af(" + ')');
      }
   }

   boolean an(byte var1) {
      try {
         return this.an.isDone();
      } catch (RuntimeException var2) {
         throw db.an(var2, "cj.an(" + ')');
      }
   }

   SecureRandom aw(byte var1) {
      try {
         try {
            return (SecureRandom)this.an.get();
         } catch (Exception var5) {
            SecureRandom var4 = new SecureRandom();
            var4.nextInt();
            return var4;
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "cj.aw(" + ')');
      }
   }

   public static int au(CharSequence var0, int var1, boolean var2, byte var3) {
      try {
         if (var1 >= 2) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            if (var1 <= 36) {
               boolean var4 = false;
               boolean var5 = false;
               int var6 = 0;
               int var7 = var0.length();
               int var8 = 0;

               while(true) {
                  if (var8 >= var7) {
                     if (!var5) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        throw new NumberFormatException();
                     }

                     return var6;
                  }

                  label139: {
                     int var9 = var0.charAt(var8);
                     if (var8 == 0) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (45 == var9) {
                           var4 = true;
                           break label139;
                        }

                        if (43 == var9) {
                           if (var3 >= 0) {
                              throw new IllegalStateException();
                           }

                           if (var2) {
                              if (var3 >= 0) {
                                 throw new IllegalStateException();
                              }
                              break label139;
                           }
                        }
                     }

                     label141: {
                        if (var9 >= 48) {
                           if (var3 >= 0) {
                              throw new IllegalStateException();
                           }

                           if (var9 <= 57) {
                              if (var3 >= 0) {
                                 throw new IllegalStateException();
                              }

                              var9 -= 48;
                              break label141;
                           }
                        }

                        if (var9 >= 65 && var9 <= 90) {
                           if (var3 >= 0) {
                              throw new IllegalStateException();
                           }

                           var9 -= 55;
                        } else {
                           if (var9 < 97) {
                              break;
                           }

                           if (var3 >= 0) {
                              throw new IllegalStateException();
                           }

                           if (var9 > 122) {
                              break;
                           }

                           if (var3 >= 0) {
                              throw new IllegalStateException();
                           }

                           var9 -= 87;
                        }
                     }

                     if (var9 >= var1) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        throw new NumberFormatException();
                     }

                     if (var4) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        var9 = -var9;
                     }

                     int var10 = var9 + var6 * var1;
                     if (var6 != var10 / var1) {
                        throw new NumberFormatException();
                     }

                     var6 = var10;
                     var5 = true;
                  }

                  ++var8;
               }

               throw new NumberFormatException();
            }

            if (var3 >= 0) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException("" + var1);
      } catch (RuntimeException var11) {
         throw db.an(var11, "cj.au(" + ')');
      }
   }

   boolean au() {
      return this.an.isDone();
   }

   boolean ab() {
      return this.an.isDone();
   }

   boolean aq() {
      return this.an.isDone();
   }

   SecureRandom al() {
      try {
         return (SecureRandom)this.an.get();
      } catch (Exception var4) {
         SecureRandom var3 = new SecureRandom();
         var3.nextInt();
         return var3;
      }
   }

   SecureRandom at() {
      try {
         return (SecureRandom)this.an.get();
      } catch (Exception var4) {
         SecureRandom var3 = new SecureRandom();
         var3.nextInt();
         return var3;
      }
   }

   cj() {
      try {
         super();
         this.af = Executors.newSingleThreadExecutor();
         this.an = this.af.submit(new dm());
      } catch (RuntimeException var1) {
         throw db.an(var1, "cj.<init>(" + ')');
      }
   }

   public static int aw(int var0) {
      try {
         return (bd.au += -500489753) * -119381545 - 1;
      } catch (RuntimeException var1) {
         throw db.an(var1, "cj.aw(" + ')');
      }
   }

   void ac() {
      this.af.shutdown();
      this.af = null;
   }

   public static String ac(CharSequence var0, int var1) {
      try {
         String var2 = hr.aw(gi.af(var0, -1475560106));
         if (null == var2) {
            if (var1 == 1874342629) {
               throw new IllegalStateException();
            }

            var2 = "";
         }

         return var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "cj.ac(" + ')');
      }
   }
}
