public class jh extends jz {
   int ac;
   int af;
   int an;
   int aw;

   jh() {
   }

   void af(Packet var1) {
      int var3 = var1.g1();
      if (var3 != 1780364927 * kb.an.aw) {
         throw new IllegalStateException("");
      } else {
         this.at = var1.g1() * -1676456091;
         this.aa = var1.g1() * -981846019;
         this.au = var1.cl() * 81463585;
         this.ab = var1.cl() * -814397553;
         this.af = var1.g1() * 117916141;
         this.an = var1.g1() * 579263121;
         this.aq = var1.cl() * 1330978045;
         this.al = var1.cl() * -775427237;
         this.aw = var1.g1() * 658944493;
         this.ac = var1.g1() * 1599120557;
         this.ay = var1.gSmart2or4() * 282687267;
         this.ao = var1.gSmart2or4() * 1837401609;
      }
   }

   void an(Packet var1) {
      this.aa = Math.min(1632558421 * this.aa, 4) * -981846019;
      this.ax = new short[1][64][64];
      this.ai = new short[this.aa * 1632558421][64][64];
      this.ag = new byte[this.aa * 1632558421][64][64];
      this.ah = new byte[this.aa * 1632558421][64][64];
      this.av = new jl[1632558421 * this.aa][64][64][];
      int var3 = var1.g1();
      if (-1203100125 * kd.an.aw != var3) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.g1();
         int var5 = var1.g1();
         int var6 = var1.g1();
         int var7 = var1.g1();
         if (var4 == this.aq * -1159667627 && this.al * -1674687277 == var5 && var6 == this.aw * -1275112475 && var7 == this.ac * 1219256101) {
            for(int var8 = 0; var8 < 8; ++var8) {
               for(int var9 = 0; var9 < 8; ++var9) {
                  this.bb(this.aw * -1610965208 + var8, 1164114216 * this.ac + var9, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof jh)) {
         return false;
      } else {
         jh var2 = (jh)var1;
         if (-1159667627 * this.aq == -1159667627 * var2.aq && -1674687277 * var2.al == this.al * -1674687277) {
            return -1275112475 * this.aw == var2.aw * -1275112475 && this.ac * 1219256101 == 1219256101 * var2.ac;
         } else {
            return false;
         }
      }
   }

   public int hashCode() {
      return -1159667627 * this.aq | -1674687277 * this.al << 8 | this.aw * -1275112475 << 16 | this.ac * 1219256101 << 24;
   }

   int aw() {
      return 1294287845 * this.af;
   }

   int al() {
      return 294135409 * this.an;
   }

   int at() {
      return -1275112475 * this.aw;
   }

   int aa() {
      return 1219256101 * this.ac;
   }

   static void jq_renamed() {
      for(hf var1 = (hf)Client.re.last(); null != var1; var1 = (hf)Client.re.previous()) {
         var1.remove();
      }

   }
}
