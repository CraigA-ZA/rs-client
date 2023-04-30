import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class av implements ThreadFactory {
   final ThreadGroup af;
   final AtomicInteger an;
   // $FF: synthetic field
   final ag this$0;
   public static final int bi = 35;
   static tc[] dl;
   static final int qi = 31;
   static final int bb = 34;
   static int uq;
   public static final int ab = 10000;

   public Thread af(Runnable var1) {
      Thread var2 = new Thread(this.af, var1, this.this$0.an + "-rest-request-" + this.an.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   static int bc(int var0, ch var1, boolean var2, int var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "av.bc(" + ')');
      }
   }

   public Thread newThread(Runnable var1) {
      try {
         Thread var2 = new Thread(this.af, var1, this.this$0.an + "-rest-request-" + this.an.getAndIncrement(), 0L);
         var2.setDaemon(true);
         var2.setPriority(5);
         return var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "av.newThread(" + ')');
      }
   }

   public Thread an(Runnable var1) {
      Thread var2 = new Thread(this.af, var1, this.this$0.an + "-rest-request-" + this.an.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   av(ag var1) {
      try {
         this.this$0 = var1;
         super();
         this.an = new AtomicInteger(1);
         SecurityManager var2 = System.getSecurityManager();
         this.af = null != var2 ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
      } catch (RuntimeException var3) {
         throw db.an(var3, "av.<init>(" + ')');
      }
   }

   public static int af(CharSequence var0, CharSequence var1, nx var2, int var3) {
      try {
         int var4 = var0.length();
         int var5 = var1.length();
         int var6 = 0;
         int var7 = 0;
         byte var8 = 0;
         byte var9 = 0;

         while(true) {
            int var10;
            int var11;
            int var12;
            char var13;
            if (var6 - var8 >= var4) {
               if (var3 <= 1463652511) {
                  throw new IllegalStateException();
               }

               if (var7 - var9 >= var5) {
                  if (var3 <= 1463652511) {
                     throw new IllegalStateException();
                  }

                  var10 = Math.min(var4, var5);

                  for(var11 = 0; var11 < var10; ++var11) {
                     if (var3 <= 1463652511) {
                        throw new IllegalStateException();
                     }

                     if (nx.aw == var2) {
                        if (var3 <= 1463652511) {
                           throw new IllegalStateException();
                        }

                        var6 = var4 - 1 - var11;
                        var7 = var5 - 1 - var11;
                     } else {
                        var7 = var11;
                        var6 = var11;
                     }

                     var12 = var0.charAt(var6);
                     var13 = var1.charAt(var7);
                     if (var12 != var13) {
                        if (var3 <= 1463652511) {
                           throw new IllegalStateException();
                        }

                        if (Character.toUpperCase((char)var12) != Character.toUpperCase(var13)) {
                           if (var3 <= 1463652511) {
                              throw new IllegalStateException();
                           }

                           var12 = Character.toLowerCase((char)var12);
                           var13 = Character.toLowerCase(var13);
                           if (var13 != var12) {
                              if (var3 <= 1463652511) {
                                 throw new IllegalStateException();
                              }

                              return nd.aw((char)var12, var2, -1341614150) - nd.aw(var13, var2, -1124664307);
                           }
                        }
                     }
                  }

                  var11 = var4 - var5;
                  if (0 != var11) {
                     if (var3 <= 1463652511) {
                        throw new IllegalStateException();
                     }

                     return var11;
                  }

                  for(var12 = 0; var12 < var10; ++var12) {
                     if (var3 <= 1463652511) {
                        throw new IllegalStateException();
                     }

                     var13 = var0.charAt(var12);
                     char var14 = var1.charAt(var12);
                     if (var14 != var13) {
                        return nd.aw(var13, var2, 242400549) - nd.aw(var14, var2, -1956567373);
                     }
                  }

                  return 0;
               }
            }

            if (var6 - var8 >= var4) {
               if (var3 <= 1463652511) {
                  throw new IllegalStateException();
               }

               return -1;
            }

            if (var7 - var9 >= var5) {
               if (var3 <= 1463652511) {
                  throw new IllegalStateException();
               }

               return 1;
            }

            if (var8 != 0) {
               if (var3 <= 1463652511) {
                  throw new IllegalStateException();
               }

               var10 = var8;
               boolean var16 = false;
            } else {
               var10 = var0.charAt(var6++);
            }

            if (0 != var9) {
               if (var3 <= 1463652511) {
                  throw new IllegalStateException();
               }

               var11 = var9;
               boolean var17 = false;
            } else {
               var11 = var1.charAt(var7++);
            }

            if (198 == var10) {
               if (var3 <= 1463652511) {
                  throw new IllegalStateException();
               }

               var12 = 69;
            } else if (230 == var10) {
               if (var3 <= 1463652511) {
                  throw new IllegalStateException();
               }

               var12 = 101;
            } else if (223 == var10) {
               if (var3 <= 1463652511) {
                  throw new IllegalStateException();
               }

               var12 = 115;
            } else if (var10 == 338) {
               if (var3 <= 1463652511) {
                  throw new IllegalStateException();
               }

               var12 = 69;
            } else if (339 == var10) {
               if (var3 <= 1463652511) {
                  throw new IllegalStateException();
               }

               var12 = 101;
            } else {
               var12 = 0;
            }

            var8 = (byte)var12;
            if (var11 == 198) {
               if (var3 <= 1463652511) {
                  throw new IllegalStateException();
               }

               var13 = 'E';
            } else if (var11 == 230) {
               var13 = 'e';
            } else if (223 == var11) {
               if (var3 <= 1463652511) {
                  throw new IllegalStateException();
               }

               var13 = 's';
            } else if (338 == var11) {
               if (var3 <= 1463652511) {
                  throw new IllegalStateException();
               }

               var13 = 'E';
            } else if (var11 == 339) {
               if (var3 <= 1463652511) {
                  throw new IllegalStateException();
               }

               var13 = 'e';
            } else {
               var13 = 0;
            }

            var9 = (byte)var13;
            var10 = nm.an((char)var10, var2, (byte)16);
            var11 = nm.an((char)var11, var2, (byte)-44);
            if (var10 != var11) {
               if (var3 <= 1463652511) {
                  throw new IllegalStateException();
               }

               if (Character.toUpperCase((char)var10) != Character.toUpperCase((char)var11)) {
                  var10 = Character.toLowerCase((char)var10);
                  var11 = Character.toLowerCase((char)var11);
                  if (var10 != var11) {
                     return nd.aw((char)var10, var2, 1902659379) - nd.aw((char)var11, var2, -1151048423);
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw db.an(var15, "av.af(" + ')');
      }
   }
}
