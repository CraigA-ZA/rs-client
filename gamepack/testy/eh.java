import java.util.Iterator;
import java.util.concurrent.Callable;

public class eh implements Callable {
   final ey an;
   public static final int ao = 6;
   // $FF: synthetic field
   final fh this$0;
   final int ac;
   final ek af;
   public static on ax;
   final ec aw;
   public static final int ba = 71;

   public Object af() {
      this.af.an(1996127302);
      ek[][] var1;
      if (this.an == ey.an) {
         var1 = this.this$0.aw;
      } else {
         var1 = this.this$0.an;
      }

      var1[2042451507 * this.ac][this.aw.ab((byte)-118)] = this.af;
      return null;
   }

   public Object call() {
      try {
         this.af.an(-83613992);
         ek[][] var1;
         if (this.an == ey.an) {
            var1 = this.this$0.aw;
         } else {
            var1 = this.this$0.an;
         }

         var1[2042451507 * this.ac][this.aw.ab((byte)12)] = this.af;
         return null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "eh.call(" + ')');
      }
   }

   public Object an() {
      this.af.an(836571284);
      ek[][] var1;
      if (this.an == ey.an) {
         var1 = this.this$0.aw;
      } else {
         var1 = this.this$0.an;
      }

      var1[2042451507 * this.ac][this.aw.ab((byte)18)] = this.af;
      return null;
   }

   eh(fh var1, ek var2, ey var3, ec var4, int var5) {
      try {
         this.this$0 = var1;
         super();
         this.af = var2;
         this.an = var3;
         this.aw = var4;
         this.ac = var5 * -1352821509;
      } catch (RuntimeException var6) {
         throw db.an(var6, "eh.<init>(" + ')');
      }
   }

   public Object aw() {
      this.af.an(1450974754);
      ek[][] var1;
      if (this.an == ey.an) {
         var1 = this.this$0.aw;
      } else {
         var1 = this.this$0.an;
      }

      var1[2042451507 * this.ac][this.aw.ab((byte)-23)] = this.af;
      return null;
   }

   static void aw(int var0) {
      try {
         synchronized(ns.ac) {
            if (-1248352937 * ns.aw == 0) {
               if (var0 <= -794961409) {
                  throw new IllegalStateException();
               }

               na.au = new Thread(new ns());
               na.au.setDaemon(true);
               na.au.start();
               na.au.setPriority(5);
            }

            ns.aw = 1879867752;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "eh.aw(" + ')');
      }
   }

   static void at(byte var0) {
      try {
         Iterator var1 = eo.an.iterator();

         while(var1.hasNext()) {
            cq var2 = (cq)var1.next();
            var2.au(1267480248);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "eh.at(" + ')');
      }
   }
}
