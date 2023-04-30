import accessors.RSPcmStream;

public abstract class bp extends rp implements RSPcmStream {
   volatile boolean am = true;
   bp ah;
   cu ar;
   int av;

   protected abstract bp aq();

   int cr() {
      return 255;
   }

   protected abstract bp ab();

   protected abstract bp bx();

   protected abstract int al();

   final void fz(int[] var1, int var2, int var3) {
      if (this.am) {
         this.at(var1, var2, var3);
      } else {
         this.ay(var3);
      }

   }

   protected bp() {
   }

   protected abstract void ay(int var1);

   protected abstract void bj(int[] var1, int var2, int var3);

   protected abstract bp bi();

   protected abstract bp be();

   protected abstract bp bk();

   protected abstract void bf(int var1);

   protected abstract bp bb();

   protected abstract int bz();

   protected abstract void bm(int[] var1, int var2, int var3);

   protected abstract void bd(int[] var1, int var2, int var3);

   protected abstract void bt(int[] var1, int var2, int var3);

   protected abstract int bo();

   protected abstract void bg(int var1);

   protected abstract void bu(int var1);

   final void fa(int[] var1, int var2, int var3) {
      if (this.am) {
         this.at(var1, var2, var3);
      } else {
         this.ay(var3);
      }

   }

   int ba() {
      return 255;
   }

   int cg() {
      return -803599889;
   }

   int cy() {
      return 255;
   }

   protected abstract void at(int[] var1, int var2, int var3);

   final void fy(int[] var1, int var2, int var3) {
      if (this.am) {
         this.at(var1, var2, var3);
      } else {
         this.ay(var3);
      }

   }

   final void fw(int[] var1, int var2, int var3) {
      if (this.am) {
         this.at(var1, var2, var3);
      } else {
         this.ay(var3);
      }

   }
}
