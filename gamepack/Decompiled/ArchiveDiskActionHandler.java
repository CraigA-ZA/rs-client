public class ArchiveDiskActionHandler implements Runnable {
   public static NodeDeque af = new NodeDeque();
   public static NodeDeque an = new NodeDeque();
   static int aw = 0;
   static Object ac = new Object();

   ArchiveDiskActionHandler() {
   }

   static String af_renamed(int var0) {
      return "<img=" + var0 + ">";
   }

   static Integer af_renamed(Packet var0) {
      int var2 = 0;
      boolean var3 = false;

      while(true) {
         int var4 = var0.g1();
         if (255 == var4) {
            return var3 ? var2 : null;
         }

         if (var4 != 0) {
            throw new IllegalStateException("");
         }

         while(true) {
            int var5 = var0.g1();
            if (var5 == 255) {
               break;
            }

            var0.at -= -1516355947;
            if (var0.cl() != 0) {
               throw new IllegalStateException("");
            }

            if (var3) {
               throw new IllegalStateException("");
            }

            var2 = var0.g4s();
            var3 = true;
         }
      }
   }

   public void run() {
      try {
         while(true) {
            ArchiveDiskAction var1;
            synchronized(af) {
               var1 = (ArchiveDiskAction)af.last();
            }

            if (var1 != null) {
               if (-1329235479 * var1.af == 0) {
                  var1.aw.write((int)var1.hr, var1.an, var1.an.length);
                  synchronized(af) {
                     var1.remove();
                  }
               } else if (var1.af * -1329235479 == 1) {
                  var1.an = var1.aw.read((int)var1.hr);
                  synchronized(af) {
                     an.addFirst(var1);
                  }
               }

               synchronized(ac) {
                  if (aw * -1248352937 <= 1) {
                     aw = 0;
                     ac.notifyAll();
                     return;
                  }

                  aw = 1879867752;
               }
            } else {
               PlayerAppearance.af(100L);
               synchronized(ac) {
                  if (aw * -1248352937 <= 1) {
                     aw = 0;
                     ac.notifyAll();
                     return;
                  }

                  aw -= 1527846503;
               }
            }
         }
      } catch (Exception var13) {
         ob.af_renamed((String)null, var13);
      }
   }
}
