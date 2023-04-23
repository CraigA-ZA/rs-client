public class PcmStreamMixer extends PcmStream {
   int ac = -1;
   int aw = 0;
   NodeDeque af = new NodeDeque();
   NodeDeque an = new NodeDeque();

   public final synchronized void addSubStream(PcmStream var1) {
      this.af.addLast(var1);
   }

   public final synchronized void removeSubStream(PcmStream var1) {
      var1.remove();
   }

   void clear() {
      if (this.aw > 0) {
         for(PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.an.last(); var1 != null; var1 = (PcmStreamMixerListener)this.an.previous()) {
            var1.af -= this.aw;
         }

         this.ac -= this.aw;
         this.aw = 0;
      }

   }

   void ac(Node var1, PcmStreamMixerListener var2) {
      while(var1 != this.an.af && ((PcmStreamMixerListener)var1).af <= var2.af) {
         var1 = var1.hc;
      }

      NodeDeque.ac(var2, var1);
      this.ac = ((PcmStreamMixerListener)this.an.af.hc).af;
   }

   void au(PcmStreamMixerListener var1) {
      var1.remove();
      var1.remove2();
      Node var2 = this.an.af.hc;
      if (var2 == this.an.af) {
         this.ac = -1;
      } else {
         this.ac = ((PcmStreamMixerListener)var2).af;
      }

   }

   protected PcmStream firstSubStream() {
      return (PcmStream)this.af.last();
   }

   protected PcmStream nextSubStream() {
      return (PcmStream)this.af.previous();
   }

   protected int al() {
      return 0;
   }

   public final synchronized void fill(int[] var1, int var2, int var3) {
      do {
         if (this.ac < 0) {
            this.updateSubStreams(var1, var2, var3);
            return;
         }

         if (this.aw + var3 < this.ac) {
            this.aw += var3;
            this.updateSubStreams(var1, var2, var3);
            return;
         }

         int var4 = this.ac - this.aw;
         this.updateSubStreams(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.aw += var4;
         this.clear();
         PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.an.last();
         synchronized(var5) {
            int var7 = var5.update(this);
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

   void updateSubStreams(int[] var1, int var2, int var3) {
      for(PcmStream var4 = (PcmStream)this.af.last(); var4 != null; var4 = (PcmStream)this.af.previous()) {
         var4.update(var1, var2, var3);
      }

   }

   public final synchronized void skip(int var1) {
      do {
         if (this.ac < 0) {
            this.skipSubStreams(var1);
            return;
         }

         if (this.aw + var1 < this.ac) {
            this.aw += var1;
            this.skipSubStreams(var1);
            return;
         }

         int var2 = this.ac - this.aw;
         this.skipSubStreams(var2);
         var1 -= var2;
         this.aw += var2;
         this.clear();
         PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.an.last();
         synchronized(var3) {
            int var5 = var3.update(this);
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

   void skipSubStreams(int var1) {
      for(PcmStream var2 = (PcmStream)this.af.last(); var2 != null; var2 = (PcmStream)this.af.previous()) {
         var2.skip(var1);
      }

   }
}
