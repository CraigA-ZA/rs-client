import accessors.RSPcmStreamMixer;

public class bn extends bp implements RSPcmStreamMixer {
   nh af = new nh();
   nh an = new nh();
   int aw = 0;
   int ac = -1;

   public final synchronized void ar(bp var1) {
      var1.ga();
   }

   void bq(int var1) {
      for(bp var2 = (bp)this.af.aq(); var2 != null; var2 = (bp)this.af.at()) {
         var2.ay(var1);
      }

   }

   public final synchronized void am(bp var1) {
      var1.ga();
   }

   void aw() {
      if (this.aw > 0) {
         for(cs var1 = (cs)this.an.aq(); var1 != null; var1 = (cs)this.an.at()) {
            var1.af -= this.aw;
         }

         this.ac -= this.aw;
         this.aw = 0;
      }

   }

   void ac(rp var1, cs var2) {
      while(var1 != this.an.af && ((cs)var1).af <= var2.af) {
         var1 = var1.hc;
      }

      nh.ac(var2, var1);
      this.ac = ((cs)this.an.af.hc).af;
   }

   void br(int[] var1, int var2, int var3) {
      for(bp var4 = (bp)this.af.aq(); var4 != null; var4 = (bp)this.af.at()) {
         var4.fz(var1, var2, var3);
      }

   }

   protected bp ab() {
      return (bp)this.af.aq();
   }

   protected bp aq() {
      return (bp)this.af.at();
   }

   protected int al() {
      return 0;
   }

   public final synchronized void at(int[] var1, int var2, int var3) {
      do {
         if (this.ac < 0) {
            this.aa(var1, var2, var3);
            return;
         }

         if (this.aw + var3 < this.ac) {
            this.aw += var3;
            this.aa(var1, var2, var3);
            return;
         }

         int var4 = this.ac - this.aw;
         this.aa(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.aw += var4;
         this.aw();
         cs var5 = (cs)this.an.aq();
         synchronized(var5) {
            int var7 = var5.an(this);
            if (var7 < 0) {
               var5.af = 0;
               this.au(var5);
            } else {
               var5.af = var7;
               this.ac(var5.hc, var5);
            }
         }
      } while(var3 != 0);

   }

   void au(cs var1) {
      var1.ga();
      var1.af();
      rp var2 = this.an.af.hc;
      if (var2 == this.an.af) {
         this.ac = -1;
      } else {
         this.ac = ((cs)var2).af;
      }

   }

   void ao(int var1) {
      for(bp var2 = (bp)this.af.aq(); var2 != null; var2 = (bp)this.af.at()) {
         var2.ay(var1);
      }

   }

   protected bp bi() {
      return (bp)this.af.aq();
   }

   public final synchronized void ax(bp var1) {
      this.af.aw(var1);
   }

   public final synchronized void ai(bp var1) {
      this.af.aw(var1);
   }

   void aj() {
      if (this.aw > 0) {
         for(cs var1 = (cs)this.an.aq(); var1 != null; var1 = (cs)this.an.at()) {
            var1.af -= this.aw;
         }

         this.ac -= this.aw;
         this.aw = 0;
      }

   }

   public final synchronized void ah(bp var1) {
      this.af.aw(var1);
   }

   public final synchronized void av(bp var1) {
      this.af.aw(var1);
   }

   protected bp bb() {
      return (bp)this.af.aq();
   }

   public final synchronized void af(bp var1) {
      this.af.aw(var1);
   }

   void as() {
      if (this.aw > 0) {
         for(cs var1 = (cs)this.an.aq(); var1 != null; var1 = (cs)this.an.at()) {
            var1.af -= this.aw;
         }

         this.ac -= this.aw;
         this.aw = 0;
      }

   }

   void ap(cs var1) {
      var1.ga();
      var1.af();
      rp var2 = this.an.af.hc;
      if (var2 == this.an.af) {
         this.ac = -1;
      } else {
         this.ac = ((cs)var2).af;
      }

   }

   void ak() {
      if (this.aw > 0) {
         for(cs var1 = (cs)this.an.aq(); var1 != null; var1 = (cs)this.an.at()) {
            var1.af -= this.aw;
         }

         this.ac -= this.aw;
         this.aw = 0;
      }

   }

   void az() {
      if (this.aw > 0) {
         for(cs var1 = (cs)this.an.aq(); var1 != null; var1 = (cs)this.an.at()) {
            var1.af -= this.aw;
         }

         this.ac -= this.aw;
         this.aw = 0;
      }

   }

   void ad(rp var1, cs var2) {
      while(var1 != this.an.af && ((cs)var1).af <= var2.af) {
         var1 = var1.hc;
      }

      nh.ac(var2, var1);
      this.ac = ((cs)this.an.af.hc).af;
   }

   void aa(int[] var1, int var2, int var3) {
      for(bp var4 = (bp)this.af.aq(); var4 != null; var4 = (bp)this.af.at()) {
         var4.fz(var1, var2, var3);
      }

   }

   public final synchronized void bm(int[] var1, int var2, int var3) {
      do {
         if (this.ac < 0) {
            this.aa(var1, var2, var3);
            return;
         }

         if (this.aw + var3 < this.ac) {
            this.aw += var3;
            this.aa(var1, var2, var3);
            return;
         }

         int var4 = this.ac - this.aw;
         this.aa(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.aw += var4;
         this.aw();
         cs var5 = (cs)this.an.aq();
         synchronized(var5) {
            int var7 = var5.an(this);
            if (var7 < 0) {
               var5.af = 0;
               this.au(var5);
            } else {
               var5.af = var7;
               this.ac(var5.hc, var5);
            }
         }
      } while(var3 != 0);

   }

   void by(cs var1) {
      var1.ga();
      var1.af();
      rp var2 = this.an.af.hc;
      if (var2 == this.an.af) {
         this.ac = -1;
      } else {
         this.ac = ((cs)var2).af;
      }

   }

   protected bp be() {
      return (bp)this.af.at();
   }

   public final synchronized void ag(bp var1) {
      this.af.aw(var1);
   }

   void bn(int[] var1, int var2, int var3) {
      for(bp var4 = (bp)this.af.aq(); var4 != null; var4 = (bp)this.af.at()) {
         var4.fz(var1, var2, var3);
      }

   }

   protected bp bk() {
      return (bp)this.af.at();
   }

   protected bp bx() {
      return (bp)this.af.at();
   }

   protected int bo() {
      return 0;
   }

   protected int bz() {
      return 0;
   }

   public final synchronized void ay(int var1) {
      do {
         if (this.ac < 0) {
            this.ao(var1);
            return;
         }

         if (this.aw + var1 < this.ac) {
            this.aw += var1;
            this.ao(var1);
            return;
         }

         int var2 = this.ac - this.aw;
         this.ao(var2);
         var1 -= var2;
         this.aw += var2;
         this.aw();
         cs var3 = (cs)this.an.aq();
         synchronized(var3) {
            int var5 = var3.an(this);
            if (var5 < 0) {
               var3.af = 0;
               this.au(var3);
            } else {
               var3.af = var5;
               this.ac(var3.hc, var3);
            }
         }
      } while(var1 != 0);

   }

   public final synchronized void bd(int[] var1, int var2, int var3) {
      do {
         if (this.ac < 0) {
            this.aa(var1, var2, var3);
            return;
         }

         if (this.aw + var3 < this.ac) {
            this.aw += var3;
            this.aa(var1, var2, var3);
            return;
         }

         int var4 = this.ac - this.aw;
         this.aa(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.aw += var4;
         this.aw();
         cs var5 = (cs)this.an.aq();
         synchronized(var5) {
            int var7 = var5.an(this);
            if (var7 < 0) {
               var5.af = 0;
               this.au(var5);
            } else {
               var5.af = var7;
               this.ac(var5.hc, var5);
            }
         }
      } while(var3 != 0);

   }

   public final synchronized void bt(int[] var1, int var2, int var3) {
      do {
         if (this.ac < 0) {
            this.aa(var1, var2, var3);
            return;
         }

         if (this.aw + var3 < this.ac) {
            this.aw += var3;
            this.aa(var1, var2, var3);
            return;
         }

         int var4 = this.ac - this.aw;
         this.aa(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.aw += var4;
         this.aw();
         cs var5 = (cs)this.an.aq();
         synchronized(var5) {
            int var7 = var5.an(this);
            if (var7 < 0) {
               var5.af = 0;
               this.au(var5);
            } else {
               var5.af = var7;
               this.ac(var5.hc, var5);
            }
         }
      } while(var3 != 0);

   }

   public final synchronized void bj(int[] var1, int var2, int var3) {
      do {
         if (this.ac < 0) {
            this.aa(var1, var2, var3);
            return;
         }

         if (this.aw + var3 < this.ac) {
            this.aw += var3;
            this.aa(var1, var2, var3);
            return;
         }

         int var4 = this.ac - this.aw;
         this.aa(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.aw += var4;
         this.aw();
         cs var5 = (cs)this.an.aq();
         synchronized(var5) {
            int var7 = var5.an(this);
            if (var7 < 0) {
               var5.af = 0;
               this.au(var5);
            } else {
               var5.af = var7;
               this.ac(var5.hc, var5);
            }
         }
      } while(var3 != 0);

   }

   void ae(cs var1) {
      var1.ga();
      var1.af();
      rp var2 = this.an.af.hc;
      if (var2 == this.an.af) {
         this.ac = -1;
      } else {
         this.ac = ((cs)var2).af;
      }

   }

   void bs(int[] var1, int var2, int var3) {
      for(bp var4 = (bp)this.af.aq(); var4 != null; var4 = (bp)this.af.at()) {
         var4.fz(var1, var2, var3);
      }

   }

   public final synchronized void an(bp var1) {
      var1.ga();
   }

   public final synchronized void bg(int var1) {
      do {
         if (this.ac < 0) {
            this.ao(var1);
            return;
         }

         if (this.aw + var1 < this.ac) {
            this.aw += var1;
            this.ao(var1);
            return;
         }

         int var2 = this.ac - this.aw;
         this.ao(var2);
         var1 -= var2;
         this.aw += var2;
         this.aw();
         cs var3 = (cs)this.an.aq();
         synchronized(var3) {
            int var5 = var3.an(this);
            if (var5 < 0) {
               var3.af = 0;
               this.au(var3);
            } else {
               var3.af = var5;
               this.ac(var3.hc, var3);
            }
         }
      } while(var1 != 0);

   }

   public final synchronized void bu(int var1) {
      do {
         if (this.ac < 0) {
            this.ao(var1);
            return;
         }

         if (this.aw + var1 < this.ac) {
            this.aw += var1;
            this.ao(var1);
            return;
         }

         int var2 = this.ac - this.aw;
         this.ao(var2);
         var1 -= var2;
         this.aw += var2;
         this.aw();
         cs var3 = (cs)this.an.aq();
         synchronized(var3) {
            int var5 = var3.an(this);
            if (var5 < 0) {
               var3.af = 0;
               this.au(var3);
            } else {
               var3.af = var5;
               this.ac(var3.hc, var3);
            }
         }
      } while(var1 != 0);

   }

   public final synchronized void bf(int var1) {
      do {
         if (this.ac < 0) {
            this.ao(var1);
            return;
         }

         if (this.aw + var1 < this.ac) {
            this.aw += var1;
            this.ao(var1);
            return;
         }

         int var2 = this.ac - this.aw;
         this.ao(var2);
         var1 -= var2;
         this.aw += var2;
         this.aw();
         cs var3 = (cs)this.an.aq();
         synchronized(var3) {
            int var5 = var3.an(this);
            if (var5 < 0) {
               var3.af = 0;
               this.au(var3);
            } else {
               var3.af = var5;
               this.ac(var3.hc, var3);
            }
         }
      } while(var1 != 0);

   }
}
