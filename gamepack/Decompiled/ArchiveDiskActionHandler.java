public class ArchiveDiskActionHandler implements Runnable {
   public static NodeDeque ArchiveDiskActionHandler_responseQueue = new NodeDeque();
   public static NodeDeque ArchiveDiskActionHandler_requestQueue = new NodeDeque();
   static int aw = 0;
   static Object ArchiveDiskActionHandler_lock = new Object();

   static String af_renamed(int var0) {
      return "<img=" + var0 + ">";
   }

   public void run() {
      try {
         while(true) {
            ArchiveDiskAction var1;
            synchronized(ArchiveDiskActionHandler_requestQueue) {
               var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
            }

            if (var1 != null) {
               if (-1329235479 * var1.type == 0) {
                  var1.archiveDisk.write((int)var1.hr, var1.data, var1.data.length);
                  synchronized(ArchiveDiskActionHandler_requestQueue) {
                     var1.ga();
                  }
               } else if (var1.type * -1329235479 == 1) {
                  var1.data = var1.archiveDisk.read((int)var1.hr);
                  synchronized(ArchiveDiskActionHandler_requestQueue) {
                     ArchiveDiskActionHandler_responseQueue.addFirst(var1);
                  }
               }

               synchronized(ArchiveDiskActionHandler_lock) {
                  if (aw * -1248352937 <= 1) {
                     aw = 0;
                     ArchiveDiskActionHandler_lock.notifyAll();
                     return;
                  }

                  aw = 1879867752;
               }
            } else {
               PlayerAppearance.af(100L);
               synchronized(ArchiveDiskActionHandler_lock) {
                  if (aw * -1248352937 <= 1) {
                     aw = 0;
                     ArchiveDiskActionHandler_lock.notifyAll();
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

   ArchiveDiskActionHandler() {
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

            var0.index -= -1516355947;
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
}
