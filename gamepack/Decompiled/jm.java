public class jm extends jz {
   static int ib;

   void af(Packet var1) {
      int var3 = var1.g1();
      if (var3 != 1780364927 * kb.af.aw) {
         throw new IllegalStateException("");
      } else {
         this.at = var1.g1() * -1676456091;
         this.aa = var1.g1() * -981846019;
         this.au = var1.cl() * 81463585;
         this.ab = var1.cl() * -814397553;
         this.aq = var1.cl() * 1330978045;
         this.al = var1.cl() * -775427237;
         this.ay = var1.gSmart2or4() * 282687267;
         this.ao = var1.gSmart2or4() * 1837401609;
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof jm)) {
         return false;
      } else {
         jm var2 = (jm)var1;
         return -1159667627 * var2.aq == -1159667627 * this.aq && var2.al * -1674687277 == -1674687277 * this.al;
      }
   }

   public int hashCode() {
      return -1159667627 * this.aq | -1674687277 * this.al << 8;
   }

   jm() {
   }

   void an(Packet var1) {
      this.aa = Math.min(this.aa * 1632558421, 4) * -981846019;
      this.ax = new short[1][64][64];
      this.ai = new short[this.aa * 1632558421][64][64];
      this.ag = new byte[1632558421 * this.aa][64][64];
      this.ah = new byte[this.aa * 1632558421][64][64];
      this.av = new jl[1632558421 * this.aa][64][64][];
      int var3 = var1.g1();
      if (var3 != -1203100125 * kd.af.aw) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.g1();
         int var5 = var1.g1();
         if (this.aq * -1159667627 == var4 && this.al * -1674687277 == var5) {
            for(int var6 = 0; var6 < 64; ++var6) {
               for(int var7 = 0; var7 < 64; ++var7) {
                  this.bb(var6, var7, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   static int hv_renamed(int var0) {
      return var0 * 3 + 600;
   }

   static final void nr_renamed() {
      PacketBitNode var1 = mi.an_renamed(ClientProt.aa, Client.packetWriter.au);
      var1.bit.bu(0);
      Client.packetWriter.aw(var1);
   }
}
