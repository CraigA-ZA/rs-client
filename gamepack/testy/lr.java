import java.net.MalformedURLException;
import java.net.URL;

public class lr {
   static final int bj = 57;
   ez af;
   static final int aw = 100;
   tq an;

   lr(String var1, et var2) {
      try {
         super();

         try {
            this.af = var2.au(new URL(var1), -433559614);
         } catch (MalformedURLException var4) {
            this.af = null;
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "lr.<init>(" + ')');
      }
   }

   lr(ez var1) {
      try {
         super();
         this.af = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "lr.<init>(" + ')');
      }
   }

   tq af(byte var1) {
      try {
         if (null == this.an) {
            if (var1 == 13) {
               throw new IllegalStateException();
            }

            if (this.af != null && this.af.af((byte)-40)) {
               if (var1 == 13) {
                  throw new IllegalStateException();
               }

               if (this.af.an((byte)-112) != null) {
                  if (var1 == 13) {
                     throw new IllegalStateException();
                  }

                  this.an = mk.af(this.af.an((byte)-35), 112687480);
               }

               this.af = null;
            }
         }

         return this.an;
      } catch (RuntimeException var2) {
         throw db.an(var2, "lr.af(" + ')');
      }
   }

   tq an() {
      if (null == this.an && this.af != null && this.af.af((byte)-57)) {
         if (this.af.an((byte)35) != null) {
            this.an = mk.af(this.af.an((byte)80), -677914708);
         }

         this.af = null;
      }

      return this.an;
   }

   tq aw() {
      if (null == this.an && this.af != null && this.af.af((byte)-78)) {
         if (this.af.an((byte)48) != null) {
            this.an = mk.af(this.af.an((byte)-21), -1385885392);
         }

         this.af = null;
      }

      return this.an;
   }
}
