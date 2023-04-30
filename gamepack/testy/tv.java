import accessors.RSGzipDecompressor;
import java.util.zip.Inflater;

public class tv implements RSGzipDecompressor {
   public static final int aw = 4;
   Inflater af;

   tv(int var1, int var2, int var3) {
      try {
         super();
      } catch (RuntimeException var4) {
         throw db.an(var4, "tv.<init>(" + ')');
      }
   }

   public void an(sg var1, byte[] var2) {
      if (31 == var1.al[-1474734418 * var1.at] && 369442274 == var1.al[var1.at * 203367586 + 1]) {
         if (this.af == null) {
            this.af = new Inflater(true);
         }

         try {
            this.af.setInput(var1.al, -1633313603 * var1.at + 10, var1.al.length - (1029561179 * var1.at + 10 + 8));
            this.af.inflate(var2);
         } catch (Exception var4) {
            this.af.reset();
            throw new RuntimeException("");
         }

         this.af.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   public void af(sg var1, byte[] var2, int var3) {
      try {
         if (31 == var1.al[-1633313603 * var1.at]) {
            if (var3 != 1293232912) {
               throw new IllegalStateException();
            }

            if (-117 == var1.al[var1.at * -1633313603 + 1]) {
               if (this.af == null) {
                  this.af = new Inflater(true);
               }

               try {
                  this.af.setInput(var1.al, -1633313603 * var1.at + 10, var1.al.length - (-1633313603 * var1.at + 10 + 8));
                  this.af.inflate(var2);
               } catch (Exception var5) {
                  this.af.reset();
                  throw new RuntimeException("");
               }

               this.af.reset();
               return;
            }

            if (var3 != 1293232912) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var6) {
         throw db.an(var6, "tv.af(" + ')');
      }
   }

   public tv() {
      try {
         this(-1, 1000000, 1000000);
      } catch (RuntimeException var1) {
         throw db.an(var1, "tv.<init>(" + ')');
      }
   }

   public void aw(sg var1, byte[] var2) {
      if (31 == var1.al[-1633313603 * var1.at] && 385152988 == var1.al[var1.at * -1633313603 + 1]) {
         if (this.af == null) {
            this.af = new Inflater(true);
         }

         try {
            this.af.setInput(var1.al, 2013179515 * var1.at + 10, var1.al.length - (-1633313603 * var1.at + 10 + 8));
            this.af.inflate(var2);
         } catch (Exception var4) {
            this.af.reset();
            throw new RuntimeException("");
         }

         this.af.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   public void ac(sg var1, byte[] var2) {
      if (-1236040625 == var1.al[-1633313603 * var1.at] && -117 == var1.al[var1.at * -1527729257 + 1]) {
         if (this.af == null) {
            this.af = new Inflater(true);
         }

         try {
            this.af.setInput(var1.al, -1633313603 * var1.at + 10, var1.al.length - (1038097254 * var1.at + 10 + 8));
            this.af.inflate(var2);
         } catch (Exception var4) {
            this.af.reset();
            throw new RuntimeException("");
         }

         this.af.reset();
      } else {
         throw new RuntimeException("");
      }
   }
}
