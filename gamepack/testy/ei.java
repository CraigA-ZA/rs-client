import java.util.concurrent.Callable;

class ei implements Callable {
   static nd fg;
   // $FF: synthetic field
   final int val$workStart;
   // $FF: synthetic field
   final eh[] val$curveLoadJobs;
   // $FF: synthetic field
   final fh this$0;
   public static final int an = 1;
   // $FF: synthetic field
   final int val$workEnd;
   static final int bx = 38;

   ei(fh var1, int var2, int var3, eh[] var4) {
      this.this$0 = var1;
      this.val$workStart = var2;
      this.val$workEnd = var3;
      this.val$curveLoadJobs = var4;
   }

   public Object call() {
      try {
         for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
            this.val$curveLoadJobs[var1].call();
         }

         return null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ei.call(" + ')');
      }
   }

   public Object af() {
      for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }

   public Object an() {
      for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }

   public Object aw() {
      for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }
}
