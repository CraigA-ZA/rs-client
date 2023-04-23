import java.util.concurrent.Callable;

class fi implements Callable {
   public static nf wc;
   static long fx;
   // $FF: synthetic field
   final fh this$0;
   // $FF: synthetic field
   final int val$version;
   // $FF: synthetic field
   final Packet val$p;

   fi(fh var1, Packet var2, int var3) {
      this.this$0 = var1;
      this.val$p = var2;
      this.val$version = var3;
   }

   public Object call() {
      this.this$0.decode0(this.val$p, this.val$version);
      return null;
   }
}
