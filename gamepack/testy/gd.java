import accessors.RSTaskHandler;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class gd implements Runnable, RSTaskHandler {
   public static String af;
   public static String an;
   gp aw;
   boolean ab;
   gp ac;
   Thread au;
   public static final int ar = 1;

   public final void ab() {
      synchronized(this) {
         this.ab = true;
         this.notifyAll();
      }

      try {
         this.au.join();
      } catch (InterruptedException var3) {
      }

   }

   public final void af(int var1) {
      try {
         synchronized(this) {
            this.ab = true;
            this.notifyAll();
         }

         try {
            this.au.join();
         } catch (InterruptedException var4) {
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "gd.af(" + ')');
      }
   }

   public final void run() {
      try {
         while(true) {
            gp var1;
            synchronized(this) {
               while(true) {
                  if (this.ab) {
                     return;
                  }

                  if (null != this.aw) {
                     var1 = this.aw;
                     this.aw = this.aw.af;
                     if (this.aw == null) {
                        this.ac = null;
                     }
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var7) {
                  }
               }
            }

            try {
               int var2 = 1725083443 * var1.au;
               if (var2 == 1) {
                  var1.al = new Socket(InetAddress.getByName((String)var1.aq), var1.ab);
               } else if (2 == var2) {
                  Thread var3 = new Thread((Runnable)var1.aq);
                  var3.setDaemon(true);
                  var3.start();
                  var3.setPriority(var1.ab);
                  var1.al = var3;
               } else if (4 == var2) {
                  var1.al = new DataInputStream(((URL)var1.aq).openStream());
               }

               var1.ac = 1;
            } catch (ThreadDeath var5) {
               throw var5;
            } catch (Throwable var6) {
               var1.ac = 2;
            }
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "gd.run(" + ')');
      }
   }

   public final void au() {
      synchronized(this) {
         this.ab = true;
         this.notifyAll();
      }

      try {
         this.au.join();
      } catch (InterruptedException var3) {
      }

   }

   public final gp aw(String var1, int var2, int var3) {
      try {
         return this.an(1, var2, 0, var1, 627776063);
      } catch (RuntimeException var4) {
         throw db.an(var4, "gd.aw(" + ')');
      }
   }

   public final gp ac(Runnable var1, int var2, byte var3) {
      try {
         return this.an(2, var2, 0, var1, 1775674834);
      } catch (RuntimeException var4) {
         throw db.an(var4, "gd.ac(" + ')');
      }
   }

   public final void gy() {
      while(true) {
         gp var1;
         synchronized(this) {
            while(true) {
               if (this.ab) {
                  return;
               }

               if (null != this.aw) {
                  var1 = this.aw;
                  this.aw = this.aw.af;
                  if (this.aw == null) {
                     this.ac = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var7) {
               }
            }
         }

         try {
            int var2 = 1725083443 * var1.au;
            if (var2 == 1) {
               var1.al = new Socket(InetAddress.getByName((String)var1.aq), var1.ab);
            } else if (2 == var2) {
               Thread var3 = new Thread((Runnable)var1.aq);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.ab);
               var1.al = var3;
            } else if (4 == var2) {
               var1.al = new DataInputStream(((URL)var1.aq).openStream());
            }

            var1.ac = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.ac = 2;
         }
      }
   }

   final gp an(int var1, int var2, int var3, Object var4, int var5) {
      try {
         gp var6 = new gp();
         var6.au = var1 * -107158533;
         var6.ab = var2;
         var6.aq = var4;
         synchronized(this) {
            if (null != this.ac) {
               if (var5 == -1848743379) {
                  throw new IllegalStateException();
               }

               this.ac.af = var6;
               this.ac = var6;
            } else {
               this.ac = this.aw = var6;
            }

            this.notify();
            return var6;
         }
      } catch (RuntimeException var10) {
         throw db.an(var10, "gd.an(" + ')');
      }
   }

   final gp al(int var1, int var2, int var3, Object var4) {
      gp var5 = new gp();
      var5.au = var1 * -107158533;
      var5.ab = var2;
      var5.aq = var4;
      synchronized(this) {
         if (null != this.ac) {
            this.ac.af = var5;
            this.ac = var5;
         } else {
            this.ac = this.aw = var5;
         }

         this.notify();
         return var5;
      }
   }

   public final void aq() {
      synchronized(this) {
         this.ab = true;
         this.notifyAll();
      }

      try {
         this.au.join();
      } catch (InterruptedException var3) {
      }

   }

   public final void gd() {
      while(true) {
         gp var1;
         synchronized(this) {
            while(true) {
               if (this.ab) {
                  return;
               }

               if (null != this.aw) {
                  var1 = this.aw;
                  this.aw = this.aw.af;
                  if (this.aw == null) {
                     this.ac = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var7) {
               }
            }
         }

         try {
            int var2 = 1725083443 * var1.au;
            if (var2 == 1) {
               var1.al = new Socket(InetAddress.getByName((String)var1.aq), var1.ab);
            } else if (2 == var2) {
               Thread var3 = new Thread((Runnable)var1.aq);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.ab);
               var1.al = var3;
            } else if (4 == var2) {
               var1.al = new DataInputStream(((URL)var1.aq).openStream());
            }

            var1.ac = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.ac = 2;
         }
      }
   }

   public final gp ay(String var1, int var2) {
      return this.an(1, var2, 0, var1, -482887996);
   }

   public final gp at(String var1, int var2) {
      return this.an(1, var2, 0, var1, -1394403860);
   }

   public final gp aa(String var1, int var2) {
      return this.an(1, var2, 0, var1, -267329209);
   }

   static int bj(int var0, ch var1, boolean var2, int var3) {
      try {
         int var4;
         if (5504 == var0) {
            if (var3 != -898403827) {
               throw new IllegalStateException();
            } else {
               cy.at -= 854271946;
               var4 = cy.al[-964267539 * cy.at];
               int var5 = cy.al[cy.at * -964267539 + 1];
               if (!client.uj) {
                  client.kp = -637026513 * var4;
                  client.kf = var5 * 642728617;
               }

               return 1;
            }
         } else if (var0 == 5505) {
            if (var3 != -898403827) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = client.kp * -954734641;
               return 1;
            }
         } else if (var0 == 5506) {
            if (var3 != -898403827) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = client.kf * 704283033;
               return 1;
            }
         } else if (5530 == var0) {
            if (var3 != -898403827) {
               throw new IllegalStateException();
            } else {
               var4 = cy.al[(cy.at -= 427135973) * -964267539];
               if (var4 < 0) {
                  if (var3 != -898403827) {
                     throw new IllegalStateException();
                  }

                  var4 = 0;
               }

               client.lm = var4 * 2048249787;
               return 1;
            }
         } else if (var0 == 5531) {
            if (var3 != -898403827) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = client.lm * 394960243;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "gd.bj(" + ')');
      }
   }

   public final gp ao(String var1, int var2) {
      return this.an(1, var2, 0, var1, -1020464342);
   }

   static int au(int var0) {
      try {
         return 93675259 * in.ab.ax;
      } catch (RuntimeException var1) {
         throw db.an(var1, "gd.au(" + ')');
      }
   }

   public final gp ai(Runnable var1, int var2) {
      return this.an(2, var2, 0, var1, -1946939389);
   }

   public final gp ag(Runnable var1, int var2) {
      return this.an(2, var2, 0, var1, -369178750);
   }

   public final gp ax(Runnable var1, int var2) {
      return this.an(2, var2, 0, var1, -1559033353);
   }

   public static mr[] au(int var0) {
      try {
         return new mr[]{mr.aw, mr.ac, mr.af, mr.an, mr.au, mr.ab};
      } catch (RuntimeException var1) {
         throw db.an(var1, "gd.au(" + ')');
      }
   }

   public gd() {
      try {
         super();
         this.aw = null;
         this.ac = null;
         this.ab = false;
         af = "Unknown";
         an = "1.6";

         try {
            af = System.getProperty("java.vendor");
            an = System.getProperty("java.version");
         } catch (Exception var2) {
         }

         this.ab = false;
         this.au = new Thread(this);
         this.au.setPriority(10);
         this.au.setDaemon(true);
         this.au.start();
      } catch (RuntimeException var3) {
         throw db.an(var3, "gd.<init>(" + ')');
      }
   }
}
