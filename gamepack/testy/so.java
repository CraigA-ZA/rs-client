import accessors.RSBzip2State;

public final class so implements RSBzip2State {
   final int ab;
   final int an;
   final int ac;
   int ar;
   final int au;
   byte[] bi;
   byte[][] bz;
   final int af;
   int at;
   byte[] aa;
   int al;
   int ao;
   int ax;
   byte ai;
   int ag;
   int[] bk;
   int av;
   int ay;
   int am;
   int as;
   int aj;
   int[] ak;
   int az;
   int[] ad;
   int ap;
   boolean[] by;
   boolean[] bb;
   int ah;
   byte[] be;
   byte[] aq;
   byte[] bx;
   final int aw;
   byte[] bo;
   int[][] bm;
   int[][] bd;
   int[][] bt;
   int[] bj;
   int bn;

   so() {
      try {
         super();
         this.af = 4096;
         this.an = 16;
         this.aw = 258;
         this.ac = 6;
         this.au = 50;
         this.ab = 18002;
         this.al = 0;
         this.ay = 0;
         this.ak = new int[256];
         this.ad = new int[257];
         this.by = new boolean[256];
         this.bb = new boolean[16];
         this.bi = new byte[256];
         this.be = new byte[4096];
         this.bk = new int[16];
         this.bx = new byte[18002];
         this.bo = new byte[18002];
         this.bz = new byte[6][258];
         this.bm = new int[6][258];
         this.bd = new int[6][258];
         this.bt = new int[6][258];
         this.bj = new int[6];
      } catch (RuntimeException var1) {
         throw db.an(var1, "so.<init>(" + ')');
      }
   }
}
