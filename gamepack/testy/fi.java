import java.util.concurrent.Callable;

class fi implements Callable {
   static long fx;
   // $FF: synthetic field
   final int val$version;
   // $FF: synthetic field
   final fh this$0;
   static final int br = 1002;
   public static final int ay = 13;
   static final int ao = 2048;
   static final int ap = 19136824;
   // $FF: synthetic field
   final sg val$p;
   public static nf wc;
   static final int ca = 4;

   public Object aw() {
      this.this$0.an(this.val$p, this.val$version, (byte)-60);
      return null;
   }

   public Object call() {
      try {
         this.this$0.an(this.val$p, this.val$version, (byte)-87);
         return null;
      } catch (RuntimeException var1) {
         throw db.an(var1, "fi.call(" + ')');
      }
   }

   public Object af() {
      this.this$0.an(this.val$p, this.val$version, (byte)-67);
      return null;
   }

   fi(fh var1, sg var2, int var3) {
      this.this$0 = var1;
      this.val$p = var2;
      this.val$version = var3;
   }

   public Object an() {
      this.this$0.an(this.val$p, this.val$version, (byte)-43);
      return null;
   }
}
