import java.util.Iterator;
import java.util.concurrent.Callable;

public class eh implements Callable {
   public static Font ax;
   final ec aw;
   final ek af;
   final ey an;
   // $FF: synthetic field
   final fh this$0;
   final int ac;

   static void aw_renamed() {
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
         if (-1248352937 * ArchiveDiskActionHandler.aw == 0) {
            na.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
            na.ArchiveDiskActionHandler_thread.setDaemon(true);
            na.ArchiveDiskActionHandler_thread.start();
            na.ArchiveDiskActionHandler_thread.setPriority(5);
         }

         ArchiveDiskActionHandler.aw = 1879867752;
      }
   }

   static void at_renamed() {
      Iterator var1 = Messages.Messages_hashTable.iterator();

      while(var1.hasNext()) {
         Message var2 = (Message)var1.next();
         var2.au();
      }

   }

   eh(fh var1, ek var2, ey var3, ec var4, int var5) {
      this.this$0 = var1;
      this.af = var2;
      this.an = var3;
      this.aw = var4;
      this.ac = var5 * -1352821509;
   }

   public Object call() {
      this.af.an();
      ek[][] var1;
      if (this.an == ey.an) {
         var1 = this.this$0.aw;
      } else {
         var1 = this.this$0.an;
      }

      var1[2042451507 * this.ac][this.aw.ab()] = this.af;
      return null;
   }
}
