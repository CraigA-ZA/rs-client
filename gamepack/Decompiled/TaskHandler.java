import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class TaskHandler implements Runnable {
   public static String javaVendor;
   public static String javaVersion;
   Task current = null;
   boolean isClosed = false;
   Task task0 = null;
   Thread thread;

   public final void close() {
      synchronized(this) {
         this.isClosed = true;
         this.notifyAll();
      }

      try {
         this.thread.join();
      } catch (InterruptedException var4) {
      }

   }

   public final void run() {
      while(true) {
         Task var1;
         synchronized(this) {
            while(true) {
               if (this.isClosed) {
                  return;
               }

               if (null != this.current) {
                  var1 = this.current;
                  this.current = this.current.next;
                  if (this.current == null) {
                     this.task0 = null;
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
            int var2 = 1725083443 * var1.type;
            if (var2 == 1) {
               var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
            } else if (2 == var2) {
               Thread var3 = new Thread((Runnable)var1.objectArgument);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.intArgument);
               var1.result = var3;
            } else if (4 == var2) {
               var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
            }

            var1.status = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.status = 2;
         }
      }
   }

   public final Task newSocketTask(String var1, int var2) {
      return this.newTask(1, var2, 0, var1);
   }

   public final Task newThreadTask(Runnable var1, int var2) {
      return this.newTask(2, var2, 0, var1);
   }

   final Task newTask(int var1, int var2, int var3, Object var4) {
      Task var6 = new Task();
      var6.type = var1 * -107158533;
      var6.intArgument = var2;
      var6.objectArgument = var4;
      synchronized(this) {
         if (null != this.task0) {
            this.task0.next = var6;
            this.task0 = var6;
         } else {
            this.task0 = this.current = var6;
         }

         this.notify();
         return var6;
      }
   }

   static int bj_renamed(int var0, ClientScript var1, boolean var2) {
      int var4;
      if (5504 == var0) {
         Interpreter.Interpreter_intStackSize -= 854271946;
         var4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
         int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
         if (!Client.uj) {
            Client.kp = -637026513 * var4;
            Client.kf = var5 * 642728617;
         }

         return 1;
      } else if (var0 == 5505) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.kp * -954734641;
         return 1;
      } else if (var0 == 5506) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.kf * 704283033;
         return 1;
      } else if (5530 == var0) {
         var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         if (var4 < 0) {
            var4 = 0;
         }

         Client.lm = var4 * 2048249787;
         return 1;
      } else if (var0 == 5531) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.lm * 394960243;
         return 1;
      } else {
         return 2;
      }
   }

   static int au_renamed() {
      return 93675259 * in.ab.ax;
   }

   public static StudioGame[] au_renamed() {
      return new StudioGame[]{StudioGame.aw, StudioGame.ac, StudioGame.af, StudioGame.an, StudioGame.au, StudioGame.ab};
   }

   public TaskHandler() {
      javaVendor = "Unknown";
      javaVersion = "1.6";

      try {
         javaVendor = System.getProperty("java.vendor");
         javaVersion = System.getProperty("java.version");
      } catch (Exception var2) {
      }

      this.isClosed = false;
      this.thread = new Thread(this);
      this.thread.setPriority(10);
      this.thread.setDaemon(true);
      this.thread.start();
   }
}
