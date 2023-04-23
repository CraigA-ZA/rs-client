import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class TaskHandler implements Runnable {
   public static String af;
   public static String an;
   boolean ab = false;
   Task ac = null;
   Task aw = null;
   Thread au;

   public static StudioGame[] au_renamed() {
      return new StudioGame[]{StudioGame.aw, StudioGame.ac, StudioGame.af, StudioGame.an, StudioGame.au, StudioGame.ab};
   }

   public TaskHandler() {
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
   }

   public final void close() {
      synchronized(this) {
         this.ab = true;
         this.notifyAll();
      }

      try {
         this.au.join();
      } catch (InterruptedException var4) {
      }

   }

   public final void run() {
      while(true) {
         Task var1;
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

   final Task newTask(int var1, int var2, int var3, Object var4) {
      Task var6 = new Task();
      var6.au = var1 * -107158533;
      var6.ab = var2;
      var6.aq = var4;
      synchronized(this) {
         if (null != this.ac) {
            this.ac.af = var6;
            this.ac = var6;
         } else {
            this.ac = this.aw = var6;
         }

         this.notify();
         return var6;
      }
   }

   static int au_renamed() {
      return 93675259 * in.ab.ax;
   }

   public final Task newSocketTask(String var1, int var2) {
      return this.newTask(1, var2, 0, var1);
   }

   public final Task newThreadTask(Runnable var1, int var2) {
      return this.newTask(2, var2, 0, var1);
   }

   static int bj_renamed(int var0, ClientScript var1, boolean var2) {
      int var4;
      if (5504 == var0) {
         Interpreter.at -= 854271946;
         var4 = Interpreter.al[-964267539 * Interpreter.at];
         int var5 = Interpreter.al[Interpreter.at * -964267539 + 1];
         if (!Client.uj) {
            Client.kp = -637026513 * var4;
            Client.kf = var5 * 642728617;
         }

         return 1;
      } else if (var0 == 5505) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Client.kp * -954734641;
         return 1;
      } else if (var0 == 5506) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Client.kf * 704283033;
         return 1;
      } else if (5530 == var0) {
         var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
         if (var4 < 0) {
            var4 = 0;
         }

         Client.lm = var4 * 2048249787;
         return 1;
      } else if (var0 == 5531) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Client.lm * 394960243;
         return 1;
      } else {
         return 2;
      }
   }
}
