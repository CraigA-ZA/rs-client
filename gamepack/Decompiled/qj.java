import java.util.Arrays;

public final class qj {
   public static int ac;
   public static qj[] an = new qj[0];
   public static final qj ab;
   static int aw;
   static int jg;
   static Sprite[] kc;
   public float[] au = new float[16];

   static {
      WorldMapSection2.af_renamed(100);
      ab = new qj();
   }

   public void an() {
      synchronized(an) {
         if (-910698341 * ac < -2095080743 * aw - 1) {
            an[(ac += -564638317) * -910698341 - 1] = this;
         }

      }
   }

   public qj() {
      this.ab();
   }

   public qj(qj var1) {
      this.al(var1);
   }

   public qj(Packet var1, boolean var2) {
      this.aw(var1, var2);
   }

   void aw(Packet var1, boolean var2) {
      if (var2) {
         qc var4 = new qc();
         var4.an(MusicPatchNode.af_renamed(var1.cg()));
         var4.aw(MusicPatchNode.af_renamed(var1.cg()));
         var4.ac(MusicPatchNode.af_renamed(var1.cg()));
         var4.au((float)var1.cg(), (float)var1.cg(), (float)var1.cg());
         this.ai(var4);
      } else {
         for(int var5 = 0; var5 < 16; ++var5) {
            this.au[var5] = var1.cb();
         }
      }

   }

   float[] ac() {
      float[] var2 = new float[3];
      if ((double)this.au[2] < 0.999 && (double)this.au[2] > -0.999) {
         var2[1] = (float)(-Math.asin((double)this.au[2]));
         double var3 = Math.cos((double)var2[1]);
         var2[0] = (float)Math.atan2((double)this.au[6] / var3, (double)this.au[10] / var3);
         var2[2] = (float)Math.atan2((double)this.au[1] / var3, (double)this.au[0] / var3);
      } else {
         var2[0] = 0.0F;
         var2[1] = (float)Math.atan2((double)this.au[2], 0.0);
         var2[2] = (float)Math.atan2((double)(-this.au[9]), (double)this.au[5]);
      }

      return var2;
   }

   public float[] au() {
      float[] var2 = new float[]{(float)(-Math.asin((double)this.au[6])), 0.0F, 0.0F};
      double var3 = Math.cos((double)var2[0]);
      double var5;
      double var7;
      if (Math.abs(var3) > 0.005) {
         var5 = (double)this.au[2];
         var7 = (double)this.au[10];
         double var9 = (double)this.au[4];
         double var11 = (double)this.au[5];
         var2[1] = (float)Math.atan2(var5, var7);
         var2[2] = (float)Math.atan2(var9, var11);
      } else {
         var5 = (double)this.au[1];
         var7 = (double)this.au[0];
         if (this.au[6] < 0.0F) {
            var2[1] = (float)Math.atan2(var5, var7);
         } else {
            var2[1] = (float)(-Math.atan2(var5, var7));
         }

         var2[2] = 0.0F;
      }

      return var2;
   }

   public void ab() {
      this.au[0] = 1.0F;
      this.au[1] = 0.0F;
      this.au[2] = 0.0F;
      this.au[3] = 0.0F;
      this.au[4] = 0.0F;
      this.au[5] = 1.0F;
      this.au[6] = 0.0F;
      this.au[7] = 0.0F;
      this.au[8] = 0.0F;
      this.au[9] = 0.0F;
      this.au[10] = 1.0F;
      this.au[11] = 0.0F;
      this.au[12] = 0.0F;
      this.au[13] = 0.0F;
      this.au[14] = 0.0F;
      this.au[15] = 1.0F;
   }

   static fl[] au_renamed() {
      return new fl[]{fl.af, fl.an, fl.aw, fl.ac, fl.au, fl.ab, fl.aq, fl.al, fl.at};
   }

   public void aq() {
      this.au[0] = 0.0F;
      this.au[1] = 0.0F;
      this.au[2] = 0.0F;
      this.au[3] = 0.0F;
      this.au[4] = 0.0F;
      this.au[5] = 0.0F;
      this.au[6] = 0.0F;
      this.au[7] = 0.0F;
      this.au[8] = 0.0F;
      this.au[9] = 0.0F;
      this.au[10] = 0.0F;
      this.au[11] = 0.0F;
      this.au[12] = 0.0F;
      this.au[13] = 0.0F;
      this.au[14] = 0.0F;
      this.au[15] = 0.0F;
   }

   public void al(qj var1) {
      System.arraycopy(var1.au, 0, this.au, 0, 16);
   }

   public void at(float var1) {
      this.aa(var1, var1, var1);
   }

   public void aa(float var1, float var2, float var3) {
      this.ab();
      this.au[0] = var1;
      this.au[5] = var2;
      this.au[10] = var3;
   }

   public void ay(qj var1) {
      for(int var3 = 0; var3 < this.au.length; ++var3) {
         float[] var10000 = this.au;
         var10000[var3] += var1.au[var3];
      }

   }

   public void ao(qj var1) {
      float var3 = this.au[3] * var1.au[12] + this.au[2] * var1.au[8] + var1.au[4] * this.au[1] + var1.au[0] * this.au[0];
      float var4 = var1.au[13] * this.au[3] + var1.au[1] * this.au[0] + this.au[1] * var1.au[5] + var1.au[9] * this.au[2];
      float var5 = this.au[0] * var1.au[2] + var1.au[6] * this.au[1] + this.au[2] * var1.au[10] + var1.au[14] * this.au[3];
      float var6 = this.au[2] * var1.au[11] + this.au[1] * var1.au[7] + this.au[0] * var1.au[3] + this.au[3] * var1.au[15];
      float var7 = this.au[5] * var1.au[4] + this.au[4] * var1.au[0] + var1.au[8] * this.au[6] + this.au[7] * var1.au[12];
      float var8 = var1.au[13] * this.au[7] + this.au[6] * var1.au[9] + this.au[5] * var1.au[5] + var1.au[1] * this.au[4];
      float var9 = var1.au[2] * this.au[4] + this.au[5] * var1.au[6] + var1.au[10] * this.au[6] + var1.au[14] * this.au[7];
      float var10 = this.au[6] * var1.au[11] + var1.au[3] * this.au[4] + var1.au[7] * this.au[5] + this.au[7] * var1.au[15];
      float var11 = var1.au[0] * this.au[8] + this.au[9] * var1.au[4] + var1.au[8] * this.au[10] + this.au[11] * var1.au[12];
      float var12 = var1.au[13] * this.au[11] + this.au[9] * var1.au[5] + var1.au[1] * this.au[8] + this.au[10] * var1.au[9];
      float var13 = this.au[11] * var1.au[14] + var1.au[6] * this.au[9] + var1.au[2] * this.au[8] + this.au[10] * var1.au[10];
      float var14 = var1.au[3] * this.au[8] + var1.au[7] * this.au[9] + this.au[10] * var1.au[11] + this.au[11] * var1.au[15];
      float var15 = this.au[14] * var1.au[8] + var1.au[4] * this.au[13] + this.au[12] * var1.au[0] + this.au[15] * var1.au[12];
      float var16 = this.au[12] * var1.au[1] + this.au[13] * var1.au[5] + this.au[14] * var1.au[9] + this.au[15] * var1.au[13];
      float var17 = var1.au[14] * this.au[15] + var1.au[2] * this.au[12] + this.au[13] * var1.au[6] + var1.au[10] * this.au[14];
      float var18 = var1.au[7] * this.au[13] + this.au[12] * var1.au[3] + this.au[14] * var1.au[11] + var1.au[15] * this.au[15];
      this.au[0] = var3;
      this.au[1] = var4;
      this.au[2] = var5;
      this.au[3] = var6;
      this.au[4] = var7;
      this.au[5] = var8;
      this.au[6] = var9;
      this.au[7] = var10;
      this.au[8] = var11;
      this.au[9] = var12;
      this.au[10] = var13;
      this.au[11] = var14;
      this.au[12] = var15;
      this.au[13] = var16;
      this.au[14] = var17;
      this.au[15] = var18;
   }

   public void ax(qx var1) {
      float var3 = var1.aq * var1.aq;
      float var4 = var1.aq * var1.ac;
      float var5 = var1.au * var1.aq;
      float var6 = var1.aq * var1.ab;
      float var7 = var1.ac * var1.ac;
      float var8 = var1.ac * var1.au;
      float var9 = var1.ab * var1.ac;
      float var10 = var1.au * var1.au;
      float var11 = var1.ab * var1.au;
      float var12 = var1.ab * var1.ab;
      this.au[0] = var7 + var3 - var12 - var10;
      this.au[1] = var6 + var8 + var6 + var8;
      this.au[2] = var9 + (var9 - var5 - var5);
      this.au[4] = var8 + (var8 - var6 - var6);
      this.au[5] = var10 + var3 - var7 - var12;
      this.au[6] = var11 + var4 + var11 + var4;
      this.au[8] = var5 + var9 + var5 + var9;
      this.au[9] = var11 - var4 - var4 + var11;
      this.au[10] = var3 + var12 - var10 - var7;
   }

   void ai(qc var1) {
      this.au[0] = var1.af;
      this.au[1] = var1.an;
      this.au[2] = var1.aw;
      this.au[3] = 0.0F;
      this.au[4] = var1.ac;
      this.au[5] = var1.au;
      this.au[6] = var1.ab;
      this.au[7] = 0.0F;
      this.au[8] = var1.aq;
      this.au[9] = var1.al;
      this.au[10] = var1.at;
      this.au[11] = 0.0F;
      this.au[12] = var1.aa;
      this.au[13] = var1.ay;
      this.au[14] = var1.ao;
      this.au[15] = 1.0F;
   }

   float ag() {
      return this.au[8] * this.au[7] * this.au[2] * this.au[13] + this.au[2] * this.au[5] * this.au[11] * this.au[12] + (this.au[4] * this.au[2] * this.au[9] * this.au[15] + this.au[12] * this.au[1] * this.au[7] * this.au[10] + (this.au[8] * this.au[6] * this.au[1] * this.au[15] + this.au[14] * this.au[1] * this.au[4] * this.au[11] + (this.au[0] * this.au[7] * this.au[9] * this.au[14] + this.au[0] * this.au[6] * this.au[11] * this.au[13] + (this.au[5] * this.au[0] * this.au[10] * this.au[15] - this.au[14] * this.au[5] * this.au[0] * this.au[11] - this.au[15] * this.au[0] * this.au[6] * this.au[9]) - this.au[10] * this.au[0] * this.au[7] * this.au[13] - this.au[1] * this.au[4] * this.au[10] * this.au[15]) - this.au[12] * this.au[11] * this.au[1] * this.au[6] - this.au[14] * this.au[1] * this.au[7] * this.au[8]) - this.au[2] * this.au[4] * this.au[11] * this.au[13] - this.au[15] * this.au[2] * this.au[5] * this.au[8]) - this.au[12] * this.au[9] * this.au[2] * this.au[7] - this.au[9] * this.au[3] * this.au[4] * this.au[14] + this.au[13] * this.au[10] * this.au[4] * this.au[3] + this.au[3] * this.au[5] * this.au[8] * this.au[14] - this.au[12] * this.au[5] * this.au[3] * this.au[10] - this.au[8] * this.au[6] * this.au[3] * this.au[13] + this.au[12] * this.au[3] * this.au[6] * this.au[9];
   }

   public void ah() {
      float var2 = 1.0F / this.ag();
      float var3 = var2 * (this.au[7] * this.au[9] * this.au[14] + this.au[11] * this.au[6] * this.au[13] + (this.au[5] * this.au[10] * this.au[15] - this.au[14] * this.au[5] * this.au[11] - this.au[6] * this.au[9] * this.au[15]) - this.au[13] * this.au[7] * this.au[10]);
      float var4 = (-this.au[1] * this.au[10] * this.au[15] + this.au[1] * this.au[11] * this.au[14] + this.au[15] * this.au[2] * this.au[9] - this.au[11] * this.au[2] * this.au[13] - this.au[14] * this.au[3] * this.au[9] + this.au[3] * this.au[10] * this.au[13]) * var2;
      float var5 = var2 * (this.au[7] * this.au[2] * this.au[13] + (this.au[15] * this.au[6] * this.au[1] - this.au[1] * this.au[7] * this.au[14] - this.au[15] * this.au[5] * this.au[2]) + this.au[14] * this.au[3] * this.au[5] - this.au[6] * this.au[3] * this.au[13]);
      float var6 = var2 * (this.au[9] * this.au[3] * this.au[6] + (this.au[5] * this.au[2] * this.au[11] + this.au[1] * this.au[7] * this.au[10] + this.au[11] * this.au[6] * -this.au[1] - this.au[9] * this.au[2] * this.au[7] - this.au[10] * this.au[3] * this.au[5]));
      float var7 = var2 * (this.au[12] * this.au[10] * this.au[7] + (this.au[15] * this.au[8] * this.au[6] + this.au[11] * this.au[4] * this.au[14] + this.au[15] * -this.au[4] * this.au[10] - this.au[6] * this.au[11] * this.au[12] - this.au[7] * this.au[8] * this.au[14]));
      float var8 = (this.au[12] * this.au[2] * this.au[11] + (this.au[15] * this.au[10] * this.au[0] - this.au[14] * this.au[11] * this.au[0] - this.au[8] * this.au[2] * this.au[15]) + this.au[14] * this.au[3] * this.au[8] - this.au[12] * this.au[3] * this.au[10]) * var2;
      float var9 = var2 * (this.au[12] * this.au[6] * this.au[3] + (this.au[15] * -this.au[0] * this.au[6] + this.au[14] * this.au[7] * this.au[0] + this.au[2] * this.au[4] * this.au[15] - this.au[2] * this.au[7] * this.au[12] - this.au[14] * this.au[4] * this.au[3]));
      float var10 = var2 * (this.au[4] * this.au[3] * this.au[10] + this.au[8] * this.au[7] * this.au[2] + (this.au[0] * this.au[6] * this.au[11] - this.au[10] * this.au[7] * this.au[0] - this.au[11] * this.au[2] * this.au[4]) - this.au[6] * this.au[3] * this.au[8]);
      float var11 = var2 * (this.au[13] * this.au[7] * this.au[8] + this.au[5] * this.au[11] * this.au[12] + (this.au[15] * this.au[9] * this.au[4] - this.au[4] * this.au[11] * this.au[13] - this.au[8] * this.au[5] * this.au[15]) - this.au[12] * this.au[7] * this.au[9]);
      float var12 = var2 * (this.au[9] * -this.au[0] * this.au[15] + this.au[0] * this.au[11] * this.au[13] + this.au[1] * this.au[8] * this.au[15] - this.au[1] * this.au[11] * this.au[12] - this.au[8] * this.au[3] * this.au[13] + this.au[12] * this.au[9] * this.au[3]);
      float var13 = var2 * (this.au[5] * this.au[0] * this.au[15] - this.au[13] * this.au[0] * this.au[7] - this.au[1] * this.au[4] * this.au[15] + this.au[12] * this.au[7] * this.au[1] + this.au[3] * this.au[4] * this.au[13] - this.au[3] * this.au[5] * this.au[12]);
      float var14 = (this.au[4] * this.au[1] * this.au[11] + this.au[9] * this.au[0] * this.au[7] + -this.au[0] * this.au[5] * this.au[11] - this.au[1] * this.au[7] * this.au[8] - this.au[3] * this.au[4] * this.au[9] + this.au[3] * this.au[5] * this.au[8]) * var2;
      float var15 = (this.au[12] * this.au[9] * this.au[6] + (this.au[9] * -this.au[4] * this.au[14] + this.au[4] * this.au[10] * this.au[13] + this.au[8] * this.au[5] * this.au[14] - this.au[12] * this.au[10] * this.au[5] - this.au[8] * this.au[6] * this.au[13])) * var2;
      float var16 = (this.au[12] * this.au[1] * this.au[10] + (this.au[9] * this.au[0] * this.au[14] - this.au[10] * this.au[0] * this.au[13] - this.au[14] * this.au[1] * this.au[8]) + this.au[8] * this.au[2] * this.au[13] - this.au[2] * this.au[9] * this.au[12]) * var2;
      float var17 = var2 * (this.au[14] * this.au[1] * this.au[4] + this.au[5] * -this.au[0] * this.au[14] + this.au[6] * this.au[0] * this.au[13] - this.au[12] * this.au[1] * this.au[6] - this.au[4] * this.au[2] * this.au[13] + this.au[5] * this.au[2] * this.au[12]);
      float var18 = var2 * (this.au[10] * this.au[5] * this.au[0] - this.au[9] * this.au[6] * this.au[0] - this.au[10] * this.au[1] * this.au[4] + this.au[8] * this.au[1] * this.au[6] + this.au[4] * this.au[2] * this.au[9] - this.au[8] * this.au[5] * this.au[2]);
      this.au[0] = var3;
      this.au[1] = var4;
      this.au[2] = var5;
      this.au[3] = var6;
      this.au[4] = var7;
      this.au[5] = var8;
      this.au[6] = var9;
      this.au[7] = var10;
      this.au[8] = var11;
      this.au[9] = var12;
      this.au[10] = var13;
      this.au[11] = var14;
      this.au[12] = var15;
      this.au[13] = var16;
      this.au[14] = var17;
      this.au[15] = var18;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      this.au();
      this.ac();

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.au[var3 + var2 * 4];
            if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   public int hashCode() {
      boolean var1 = true;
      int var2 = 1;
      var2 = var2 * 31 + Arrays.hashCode(this.au);
      return var2;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof qj)) {
         return false;
      } else {
         qj var2 = (qj)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if (var2.au[var3] != this.au[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public float[] av() {
      float[] var2 = new float[3];
      qr var3 = new qr(this.au[0], this.au[1], this.au[2]);
      qr var4 = new qr(this.au[4], this.au[5], this.au[6]);
      qr var5 = new qr(this.au[8], this.au[9], this.au[10]);
      var2[0] = var3.af();
      var2[1] = var4.af();
      var2[2] = var5.af();
      return var2;
   }

   static final int ig_renamed(int var0) {
      return Math.abs(var0 - -1010818347 * ek.kh) > 1024 ? (var0 < -1010818347 * ek.kh ? 1 : -1) * 2048 + var0 : var0;
   }

   static final void kn_renamed() {
      boolean var1 = false;

      while(!var1) {
         var1 = true;

         for(int var2 = 0; var2 < 730065501 * Client.menuOptionsCount - 1; ++var2) {
            if (Client.menuArguments1[var2] < 1000 && Client.menuArguments1[var2 + 1] > 1000) {
               String var3 = Client.menuTargetNames[var2];
               Client.menuTargetNames[var2] = Client.menuTargetNames[1 + var2];
               Client.menuTargetNames[var2 + 1] = var3;
               String var4 = Client.menuActions[var2];
               Client.menuActions[var2] = Client.menuActions[1 + var2];
               Client.menuActions[var2 + 1] = var4;
               int var5 = Client.menuArguments1[var2];
               Client.menuArguments1[var2] = Client.menuArguments1[var2 + 1];
               Client.menuArguments1[var2 + 1] = var5;
               var5 = Client.menuArguments0[var2];
               Client.menuArguments0[var2] = Client.menuArguments0[1 + var2];
               Client.menuArguments0[1 + var2] = var5;
               var5 = Client.menuArguments2[var2];
               Client.menuArguments2[var2] = Client.menuArguments2[var2 + 1];
               Client.menuArguments2[1 + var2] = var5;
               var5 = Client.menuOpcodes[var2];
               Client.menuOpcodes[var2] = Client.menuOpcodes[1 + var2];
               Client.menuOpcodes[var2 + 1] = var5;
               var5 = Client.oi[var2];
               Client.oi[var2] = Client.oi[1 + var2];
               Client.oi[1 + var2] = var5;
               boolean var6 = Client.menuShiftClick[var2];
               Client.menuShiftClick[var2] = Client.menuShiftClick[1 + var2];
               Client.menuShiftClick[1 + var2] = var6;
               var1 = false;
            }
         }
      }

   }
}
