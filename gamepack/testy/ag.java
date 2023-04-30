import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ag {
   static final int as = 22;
   final int af;
   final String an;
   static et iq;
   static final int xp = 12;
   static final int mf = 4;
   final ThreadPoolExecutor ac;
   final ThreadFactory aw;

   final ThreadPoolExecutor af(int var1, int var2) {
      try {
         return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(1905963157 * this.af), this.aw);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ag.af(" + ')');
      }
   }

   public am an(ay var1, byte var2) {
      try {
         if (this.ac.getQueue().remainingCapacity() <= 0) {
            if (var2 != 1) {
               throw new IllegalStateException();
            } else {
               System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.ac.getCorePoolSize() + " Queue capacity " + this.af * 1905963157);
               return new am("Queue full");
            }
         } else {
            am var3 = new am(this.ac.submit(new as(this, var1)));
            return var3;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "ag.an(" + ')');
      }
   }

   static final void hb(boolean var0, int var1) {
      try {
         fp var10000;
         if (var0) {
            if (var1 >= 12457961) {
               throw new IllegalStateException();
            }

            if (cz.cd) {
               if (var1 >= 12457961) {
                  throw new IllegalStateException();
               }

               var10000 = fp.an;
            } else {
               var10000 = fp.ac;
            }

            client.gh = var10000;
         } else {
            if (aj.vb.bk(cz.ca, (byte)-11)) {
               if (var1 >= 12457961) {
                  throw new IllegalStateException();
               }

               var10000 = fp.af;
            } else {
               var10000 = fp.aw;
            }

            client.gh = var10000;
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "ag.hb(" + ')');
      }
   }

   public final void aw(int var1) {
      try {
         try {
            this.ac.shutdown();
         } catch (Exception var3) {
            System.err.println("Error shutting down RestRequestService\r\n" + var3);
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "ag.aw(" + ')');
      }
   }

   final ThreadPoolExecutor ac(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(1905963157 * this.af), this.aw);
   }

   final ThreadPoolExecutor au(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(1483242025 * this.af), this.aw);
   }

   public ag(String var1, int var2, int var3) {
      try {
         super();
         this.an = var1;
         this.af = -1983210819 * var2;
         this.aw = new av(this);
         this.ac = this.af(var3, 140913775);
      } catch (RuntimeException var4) {
         throw db.an(var4, "ag.<init>(" + ')');
      }
   }

   public am aq(ay var1) {
      if (this.ac.getQueue().remainingCapacity() <= 0) {
         System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.ac.getCorePoolSize() + " Queue capacity " + this.af * 1905963157);
         return new am("Queue full");
      } else {
         am var2 = new am(this.ac.submit(new as(this, var1)));
         return var2;
      }
   }

   public final void al() {
      try {
         this.ac.shutdown();
      } catch (Exception var2) {
         System.err.println("Error shutting down RestRequestService\r\n" + var2);
      }

   }

   public final void at() {
      try {
         this.ac.shutdown();
      } catch (Exception var2) {
         System.err.println("Error shutting down RestRequestService\r\n" + var2);
      }

   }

   static void av(int var0, int var1) {
      try {
         ee.ak(14, (byte)54);
         cz.ba = var0 * -1919975363;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ag.av(" + ')');
      }
   }

   public static void ag(int var0) {
      try {
         hq.ac.ac();
         hq.au.ac();
         hq.ab.ac();
         hq.aq.ac();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ag.ag(" + ')');
      }
   }

   public am ab(ay var1) {
      if (this.ac.getQueue().remainingCapacity() <= 0) {
         System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.ac.getCorePoolSize() + " Queue capacity " + this.af * 1905963157);
         return new am("Queue full");
      } else {
         am var2 = new am(this.ac.submit(new as(this, var1)));
         return var2;
      }
   }

   static String ax(char var0, int var1, byte var2) {
      try {
         char[] var3 = new char[var1];

         for(int var4 = 0; var4 < var1; ++var4) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            var3[var4] = var0;
         }

         return new String(var3);
      } catch (RuntimeException var5) {
         throw db.an(var5, "ag.ax(" + ')');
      }
   }

   static float an(ek var0, float var1, byte var2) {
      try {
         if (null == var0) {
            if (var2 <= 18) {
               throw new IllegalStateException();
            } else {
               return 0.0F;
            }
         } else {
            float var3 = var1 - var0.aq;
            return var0.ao + var3 * (var0.ay + var3 * (var0.at * var3 + var0.aa));
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "ag.an(" + ')');
      }
   }
}
