import accessors.RSPacketWriter;
import java.awt.Image;
import java.io.IOException;

public class eq implements RSPacketWriter {
   oi an;
   ls aq;
   int aw;
   sg ac;
   public tp au;
   sq ab;
   ls ai;
   int al;
   boolean at;
   int aa;
   int ay;
   ls ao;
   ls ax;
   ph af;
   static Image bo;

   public final void ai(lg var1) {
      this.an.an(var1);
      var1.ac = -1120134497 * var1.aw.at;
      var1.aw.at = 0;
      this.aw += var1.ac * -56666229;
   }

   final void at() {
      this.an.af();
      this.aw = 0;
   }

   final void aa() {
      this.an.af();
      this.aw = 0;
   }

   public final void aw(lg var1, int var2) {
      try {
         this.an.an(var1);
         var1.ac = -1120134497 * var1.aw.at;
         var1.aw.at = 0;
         this.aw += var1.ac * -56666229;
      } catch (RuntimeException var3) {
         throw db.an(var3, "eq.aw(" + ')');
      }
   }

   void ac(ph var1, byte var2) {
      try {
         this.af = var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "eq.ac(" + ')');
      }
   }

   void au(int var1) {
      try {
         if (this.af != null) {
            this.af.aq(-103517959);
            this.af = null;
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "eq.au(" + ')');
      }
   }

   void ab(int var1) {
      try {
         this.af = null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "eq.ab(" + ')');
      }
   }

   eq() {
      try {
         super();
         this.an = new oi();
         this.aw = 0;
         this.ac = new sg(5000);
         this.ab = new sq(40000);
         this.aq = null;
         this.al = 0;
         this.at = true;
         this.aa = 0;
         this.ay = 0;
      } catch (RuntimeException var1) {
         throw db.an(var1, "eq.<init>(" + ')');
      }
   }

   final void al() {
      this.an.af();
      this.aw = 0;
   }

   ph aq(byte var1) {
      try {
         return this.af;
      } catch (RuntimeException var2) {
         throw db.an(var2, "eq.aq(" + ')');
      }
   }

   void ar() {
      if (this.af != null) {
         this.af.aq(-486787121);
         this.af = null;
      }

   }

   final void af(int var1) {
      try {
         this.an.af();
         this.aw = 0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "eq.af(" + ')');
      }
   }

   public final void ao(lg var1) {
      this.an.an(var1);
      var1.ac = -1120134497 * var1.aw.at;
      var1.aw.at = 0;
      this.aw += var1.ac * -56666229;
   }

   public final void ax(lg var1) {
      this.an.an(var1);
      var1.ac = 2022932994 * var1.aw.at;
      var1.aw.at = 0;
      this.aw += var1.ac * -56666229;
   }

   void aj() {
      this.af = null;
   }

   public final void ag(lg var1) {
      this.an.an(var1);
      var1.ac = 1257014177 * var1.aw.at;
      var1.aw.at = 0;
      this.aw += var1.ac * -1332166483;
   }

   void ah(ph var1) {
      this.af = var1;
   }

   void av(ph var1) {
      this.af = var1;
   }

   void ak() {
      this.af = null;
   }

   void am() {
      if (this.af != null) {
         this.af.aq(-1267075320);
         this.af = null;
      }

   }

   final void an(int var1) throws IOException {
      try {
         if (null != this.af) {
            if (var1 != 421941662) {
               throw new IllegalStateException();
            }

            if (-1859952183 * this.aw > 0) {
               if (var1 != 421941662) {
                  throw new IllegalStateException();
               }

               this.ac.at = 0;

               while(true) {
                  lg var2 = (lg)this.an.au();
                  if (null == var2) {
                     if (var1 != 421941662) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  if (1816684323 * var2.ac > this.ac.al.length - this.ac.at * -1633313603) {
                     if (var1 != 421941662) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  this.ac.cs(var2.aw.al, 0, 1816684323 * var2.ac, (byte)114);
                  this.aw -= -56666229 * var2.ac;
                  var2.ga();
                  var2.aw.bg(265255722);
                  var2.ac(-2073453785);
               }

               this.af.ab(this.ac.al, 0, this.ac.at * -1633313603, -2115422184);
               this.ay = 0;
            }
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "eq.an(" + ')');
      }
   }

   void as() {
      this.af = null;
   }

   final void ay() throws IOException {
      if (null != this.af && -1859952183 * this.aw > 0) {
         this.ac.at = 0;

         while(true) {
            lg var1 = (lg)this.an.au();
            if (null == var1 || 1816684323 * var1.ac > this.ac.al.length - this.ac.at * -1633313603) {
               this.af.ab(this.ac.al, 0, this.ac.at * -1633313603, -2115422184);
               this.ay = 0;
               break;
            }

            this.ac.cs(var1.aw.al, 0, 1816684323 * var1.ac, (byte)39);
            this.aw -= -56666229 * var1.ac;
            var1.ga();
            var1.aw.bg(265255722);
            var1.ac(-1361015242);
         }
      }

   }

   ph az() {
      return this.af;
   }
}
