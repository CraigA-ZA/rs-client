import java.util.LinkedList;

public abstract class jz {
   public static final int bz = 262144;
   short[][][] ai;
   int aq;
   int al;
   int at;
   byte[][][] ag;
   int ay;
   int ao;
   short[][][] ax;
   int aa;
   int au;
   byte[][][] ah;
   jl[][][][] av;
   boolean ar;
   boolean am;
   int ab;

   abstract void an(sg var1, short var2);

   boolean ae(int var1) {
      try {
         boolean var10000;
         if (this.ar) {
            if (var1 >= 482450430) {
               throw new IllegalStateException();
            }

            if (this.am) {
               if (var1 >= 482450430) {
                  throw new IllegalStateException();
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "jz.ae(" + ')');
      }
   }

   void ap(nm var1, byte var2) {
      try {
         if (!this.ae(-44397169)) {
            byte[] var3 = var1.bh(this.ay * 1716482187, -715724743 * this.ao, (byte)-17);
            if (var3 != null) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               this.an(new sg(var3), (short)2348);
               this.ar = true;
               this.am = true;
            }

         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "jz.ap(" + ')');
      }
   }

   void bb(int var1, int var2, sg var3, int var4) {
      try {
         int var5 = var3.cm((byte)7);
         if (0 == var5) {
            if (var4 != 1675486274) {
               throw new IllegalStateException();
            }
         } else {
            if (0 != (var5 & 1)) {
               if (var4 != 1675486274) {
                  return;
               }

               this.bi(var1, var2, var3, var5, (byte)-28);
            } else {
               this.be(var1, var2, var3, var5, 675570307);
            }

         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "jz.bb(" + ')');
      }
   }

   int cs() {
      return this.al * -81031194;
   }

   void bi(int var1, int var2, sg var3, int var4, byte var5) {
      try {
         boolean var10000;
         if (0 != (var4 & 2)) {
            if (var5 >= 2) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var6 = var10000;
         if (var6) {
            if (var5 >= 2) {
               throw new IllegalStateException();
            }

            this.ai[0][var1][var2] = (short)var3.cl(-889978718);
         }

         this.ax[0][var1][var2] = (short)var3.cl(261185412);
      } catch (RuntimeException var7) {
         throw db.an(var7, "jz.bi(" + ')');
      }
   }

   void be(int var1, int var2, sg var3, int var4, int var5) {
      try {
         int var6 = 1 + ((var4 & 24) >> 3);
         boolean var10000;
         if (0 != (var4 & 2)) {
            if (var5 != 675570307) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var7 = var10000;
         if (0 != (var4 & 4)) {
            if (var5 != 675570307) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var8 = var10000;
         this.ax[0][var1][var2] = (short)var3.cl(-134555678);
         int var9;
         int var10;
         int var12;
         if (var7) {
            if (var5 != 675570307) {
               throw new IllegalStateException();
            }

            var9 = var3.cm((byte)7);

            for(var10 = 0; var10 < var9; ++var10) {
               if (var5 != 675570307) {
                  throw new IllegalStateException();
               }

               int var11 = var3.cl(-1237278688);
               if (var11 != 0) {
                  if (var5 != 675570307) {
                     throw new IllegalStateException();
                  }

                  this.ai[var10][var1][var2] = (short)var11;
                  var12 = var3.cm((byte)7);
                  this.ag[var10][var1][var2] = (byte)(var12 >> 2);
                  this.ah[var10][var1][var2] = (byte)(var12 & 3);
               }
            }
         }

         if (var8) {
            if (var5 != 675570307) {
               return;
            }

            for(var9 = 0; var9 < var6; ++var9) {
               if (var5 != 675570307) {
                  throw new IllegalStateException();
               }

               var10 = var3.cm((byte)7);
               if (var10 == 0) {
                  if (var5 != 675570307) {
                     throw new IllegalStateException();
                  }
               } else {
                  jl[] var16 = this.av[var9][var1][var2] = new jl[var10];

                  for(var12 = 0; var12 < var10; ++var12) {
                     int var13 = var3.do(1277824677);
                     int var14 = var3.cm((byte)7);
                     var16[var12] = new jl(var13, var14 >> 2, var14 & 3);
                  }
               }
            }
         }

      } catch (RuntimeException var15) {
         throw db.an(var15, "jz.be(" + ')');
      }
   }

   abstract void ac(sg var1);

   int bk(int var1) {
      try {
         return this.aq * -1159667627;
      } catch (RuntimeException var2) {
         throw db.an(var2, "jz.bk(" + ')');
      }
   }

   int bx(int var1) {
      try {
         return this.al * -1674687277;
      } catch (RuntimeException var2) {
         throw db.an(var2, "jz.bx(" + ')');
      }
   }

   jz() {
      try {
         super();
         this.ay = -282687267;
         this.ao = -1837401609;
         new LinkedList();
         this.ar = false;
         this.am = false;
      } catch (RuntimeException var1) {
         throw db.an(var1, "jz.<init>(" + ')');
      }
   }

   abstract void au(sg var1);

   abstract void ab(sg var1);

   abstract void aq(sg var1);

   boolean bo() {
      return this.ar && this.am;
   }

   void by(int var1) {
      try {
         this.ax = (short[][][])null;
         this.ai = (short[][][])null;
         this.ag = (byte[][][])null;
         this.ah = (byte[][][])null;
         this.av = (jl[][][][])null;
         this.ar = false;
         this.am = false;
      } catch (RuntimeException var2) {
         throw db.an(var2, "jz.by(" + ')');
      }
   }

   boolean bm() {
      return this.ar && this.am;
   }

   void bd(nm var1) {
      if (!this.ae(290090802)) {
         byte[] var2 = var1.bh(this.ay * 1716482187, -1520659948 * this.ao, (byte)-65);
         if (var2 != null) {
            this.an(new sg(var2), (short)15439);
            this.ar = true;
            this.am = true;
         }

      }
   }

   void br() {
      this.ax = (short[][][])null;
      this.ai = (short[][][])null;
      this.ag = (byte[][][])null;
      this.ah = (byte[][][])null;
      this.av = (jl[][][][])null;
      this.ar = false;
      this.am = false;
   }

   void bj(nm var1) {
      if (!this.ae(-1735868411)) {
         byte[] var2 = var1.bh(this.ay * 1716482187, -715724743 * this.ao, (byte)-34);
         if (var2 != null) {
            this.an(new sg(var2), (short)24755);
            this.ar = true;
            this.am = true;
         }

      }
   }

   void bn(nm var1) {
      if (!this.ae(-401055779)) {
         byte[] var2 = var1.bh(this.ay * 1716482187, -715724743 * this.ao, (byte)-48);
         if (var2 != null) {
            this.an(new sg(var2), (short)17763);
            this.ar = true;
            this.am = true;
         }

      }
   }

   void bs() {
      this.ax = (short[][][])null;
      this.ai = (short[][][])null;
      this.ag = (byte[][][])null;
      this.ah = (byte[][][])null;
      this.av = (jl[][][][])null;
      this.ar = false;
      this.am = false;
   }

   void bf(int var1, int var2, sg var3) {
      int var4 = var3.cm((byte)7);
      if (0 != var4) {
         if (0 != (var4 & 1)) {
            this.bi(var1, var2, var3, var4, (byte)-110);
         } else {
            this.be(var1, var2, var3, var4, 675570307);
         }

      }
   }

   void bg(int var1, int var2, sg var3) {
      int var4 = var3.cm((byte)7);
      if (0 != var4) {
         if (0 != (var4 & 1)) {
            this.bi(var1, var2, var3, var4, (byte)1);
         } else {
            this.be(var1, var2, var3, var4, 675570307);
         }

      }
   }

   void bu(int var1, int var2, sg var3) {
      int var4 = var3.cm((byte)7);
      if (0 != var4) {
         if (0 != (var4 & 1)) {
            this.bi(var1, var2, var3, var4, (byte)-123);
         } else {
            this.be(var1, var2, var3, var4, 675570307);
         }

      }
   }

   int ce() {
      return this.al * -521041157;
   }

   public static synchronized byte[] ac(int var0, int var1) {
      try {
         return oj.aw(var0, false, (byte)20);
      } catch (RuntimeException var2) {
         throw db.an(var2, "jz.ac(" + ')');
      }
   }

   void ba(int var1, int var2, sg var3, int var4) {
      boolean var5 = 0 != (var4 & 2);
      if (var5) {
         this.ai[0][var1][var2] = (short)var3.cl(-1331801936);
      }

      this.ax[0][var1][var2] = (short)var3.cl(-761162490);
   }

   int ci() {
      return this.al * -1674687277;
   }

   void bl(int var1, int var2, sg var3, int var4) {
      int var5 = 1 + ((var4 & 24) >> 3);
      boolean var6 = 0 != (var4 & 2);
      boolean var7 = 0 != (var4 & 4);
      this.ax[0][var1][var2] = (short)var3.cl(834981870);
      int var8;
      int var9;
      int var11;
      if (var6) {
         var8 = var3.cm((byte)7);

         for(var9 = 0; var9 < var8; ++var9) {
            int var10 = var3.cl(-2083476033);
            if (var10 != 0) {
               this.ai[var9][var1][var2] = (short)var10;
               var11 = var3.cm((byte)7);
               this.ag[var9][var1][var2] = (byte)(var11 >> 2);
               this.ah[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if (var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var3.cm((byte)7);
            if (var9 != 0) {
               jl[] var14 = this.av[var8][var1][var2] = new jl[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  int var12 = var3.do(1083993848);
                  int var13 = var3.cm((byte)7);
                  var14[var11] = new jl(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }

   }

   int bh() {
      return this.aq * 1598650183;
   }

   int bc() {
      return this.aq * -1159667627;
   }

   void bq(int var1, int var2, sg var3, int var4) {
      boolean var5 = 0 != (var4 & 2);
      if (var5) {
         this.ai[0][var1][var2] = (short)var3.cl(140276444);
      }

      this.ax[0][var1][var2] = (short)var3.cl(-1273366134);
   }

   int bw() {
      return this.aq * -259536928;
   }

   void bp(int var1, int var2, sg var3, int var4) {
      int var5 = 1 + ((var4 & 24) >> 3);
      boolean var6 = 0 != (var4 & 2);
      boolean var7 = 0 != (var4 & 4);
      this.ax[0][var1][var2] = (short)var3.cl(-2139747424);
      int var8;
      int var9;
      int var11;
      if (var6) {
         var8 = var3.cm((byte)7);

         for(var9 = 0; var9 < var8; ++var9) {
            int var10 = var3.cl(335455759);
            if (var10 != 0) {
               this.ai[var9][var1][var2] = (short)var10;
               var11 = var3.cm((byte)7);
               this.ag[var9][var1][var2] = (byte)(var11 >> 2);
               this.ah[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if (var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var3.cm((byte)7);
            if (var9 != 0) {
               jl[] var14 = this.av[var8][var1][var2] = new jl[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  int var12 = var3.do(2079851609);
                  int var13 = var3.cm((byte)7);
                  var14[var11] = new jl(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }

   }

   void bt(nm var1) {
      if (!this.ae(-1000661783)) {
         byte[] var2 = var1.bh(this.ay * 1716482187, -715724743 * this.ao, (byte)-118);
         if (var2 != null) {
            this.an(new sg(var2), (short)19979);
            this.ar = true;
            this.am = true;
         }

      }
   }

   void bv(int var1, int var2, sg var3, int var4) {
      boolean var5 = 0 != (var4 & 2);
      if (var5) {
         this.ai[0][var1][var2] = (short)var3.cl(-1175006800);
      }

      this.ax[0][var1][var2] = (short)var3.cl(879160531);
   }

   boolean bz() {
      return this.ar && this.am;
   }
}
