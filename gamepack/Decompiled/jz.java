import java.util.LinkedList;

public abstract class jz {
   short[][][] ai;
   int aq;
   int al;
   int at;
   byte[][][] ag;
   int ay = -282687267;
   int ao = -1837401609;
   short[][][] ax;
   int aa;
   int au;
   byte[][][] ah;
   jl[][][][] av;
   boolean ar;
   boolean am;
   int ab;

   abstract void an(Packet var1);

   boolean ae() {
      return this.ar && this.am;
   }

   void ap(AbstractArchive var1) {
      if (!this.ae()) {
         byte[] var3 = var1.takeFile(this.ay * 1716482187, -715724743 * this.ao);
         if (var3 != null) {
            this.an(new Packet(var3));
            this.ar = true;
            this.am = true;
         }

      }
   }

   void bb(int var1, int var2, Packet var3) {
      int var5 = var3.g1();
      if (0 != var5) {
         if (0 != (var5 & 1)) {
            this.bi(var1, var2, var3, var5);
         } else {
            this.be(var1, var2, var3, var5);
         }

      }
   }

   void bi(int var1, int var2, Packet var3, int var4) {
      boolean var6 = 0 != (var4 & 2);
      if (var6) {
         this.ai[0][var1][var2] = (short)var3.cl();
      }

      this.ax[0][var1][var2] = (short)var3.cl();
   }

   void be(int var1, int var2, Packet var3, int var4) {
      int var6 = 1 + ((var4 & 24) >> 3);
      boolean var7 = 0 != (var4 & 2);
      boolean var8 = 0 != (var4 & 4);
      this.ax[0][var1][var2] = (short)var3.cl();
      int var9;
      int var10;
      int var12;
      if (var7) {
         var9 = var3.g1();

         for(var10 = 0; var10 < var9; ++var10) {
            int var11 = var3.cl();
            if (var11 != 0) {
               this.ai[var10][var1][var2] = (short)var11;
               var12 = var3.g1();
               this.ag[var10][var1][var2] = (byte)(var12 >> 2);
               this.ah[var10][var1][var2] = (byte)(var12 & 3);
            }
         }
      }

      if (var8) {
         for(var9 = 0; var9 < var6; ++var9) {
            var10 = var3.g1();
            if (var10 != 0) {
               jl[] var15 = this.av[var9][var1][var2] = new jl[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  int var13 = var3.gSmart2or4();
                  int var14 = var3.g1();
                  var15[var12] = new jl(var13, var14 >> 2, var14 & 3);
               }
            }
         }
      }

   }

   int bk() {
      return this.aq * -1159667627;
   }

   int bx() {
      return this.al * -1674687277;
   }

   jz() {
      new LinkedList();
      this.ar = false;
      this.am = false;
   }

   void by() {
      this.ax = (short[][][])null;
      this.ai = (short[][][])null;
      this.ag = (byte[][][])null;
      this.ah = (byte[][][])null;
      this.av = (jl[][][][])null;
      this.ar = false;
      this.am = false;
   }

   public static synchronized byte[] ac_renamed(int var0) {
      return ByteArrayPool.ByteArrayPool_get(var0, false);
   }
}
