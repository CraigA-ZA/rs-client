public class ew {
   boolean aa = true;
   boolean al = true;
   float[][] ai;
   float[][] ao;
   float[][] aw;
   float[][] ax;
   qj aq = new qj();
   qj at = new qj();
   qj ay = new qj();
   qj[] ab;
   qj[] au;
   final qj[] ac;
   public ew an;
   public final int af;

   public ew(int var1, Packet var2, boolean var3) {
      this.af = var2.cg() * -1987716595;
      this.ac = new qj[var1];
      this.au = new qj[this.ac.length];
      this.ab = new qj[this.ac.length];
      this.aw = new float[this.ac.length][3];

      for(int var4 = 0; var4 < this.ac.length; ++var4) {
         this.ac[var4] = new qj(var2, var3);
         this.aw[var4][0] = var2.cb();
         this.aw[var4][1] = var2.cb();
         this.aw[var4][2] = var2.cb();
      }

      this.af();
   }

   void af() {
      this.ao = new float[this.ac.length][3];
      this.ax = new float[this.ac.length][3];
      this.ai = new float[this.ac.length][3];
      qj var2;
      synchronized(qj.an) {
         if (0 == qj.ac * -910698341) {
            var2 = new qj();
         } else {
            qj.an[(qj.ac -= -564638317) * -910698341].ab();
            var2 = qj.an[qj.ac * -910698341];
         }
      }

      qj var3 = var2;

      for(int var4 = 0; var4 < this.ac.length; ++var4) {
         qj var5 = this.an(var4);
         var3.al(var5);
         var3.ah();
         this.ao[var4] = var3.au();
         this.ax[var4][0] = var5.au[12];
         this.ax[var4][1] = var5.au[13];
         this.ax[var4][2] = var5.au[14];
         this.ai[var4] = var5.av();
      }

      var3.an();
   }

   public static HitmarkType getHitmarkType(int var0) {
      HitmarkType var2 = (HitmarkType)HitmarkType.HitmarkType_cached.get((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = HitmarkType.af.takeFile(32, var0);
         var2 = new HitmarkType();
         if (var3 != null) {
            var2.decode(new Packet(var3));
         }

         HitmarkType.HitmarkType_cached.put(var2, (long)var0);
         return var2;
      }
   }

   qj an(int var1) {
      return this.ac[var1];
   }

   qj aw(int var1) {
      if (this.au[var1] == null) {
         this.au[var1] = new qj(this.an(var1));
         if (this.an != null) {
            this.au[var1].ao(this.an.aw(var1));
         } else {
            this.au[var1].ao(qj.ab);
         }
      }

      return this.au[var1];
   }

   static final void aw_renamed(int var0, int var1, int var2, int var3) {
      for(int var5 = var1; var5 <= var1 + var3; ++var5) {
         for(int var6 = var0; var6 <= var2 + var0; ++var6) {
            if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
               Tiles.al[0][var6][var5] = 127;
               if (var6 == var0 && var6 > 0) {
                  Tiles.Tiles_heights[0][var6][var5] = Tiles.Tiles_heights[0][var6 - 1][var5];
               }

               if (var0 + var2 == var6 && var6 < 103) {
                  Tiles.Tiles_heights[0][var6][var5] = Tiles.Tiles_heights[0][var6 + 1][var5];
               }

               if (var5 == var1 && var5 > 0) {
                  Tiles.Tiles_heights[0][var6][var5] = Tiles.Tiles_heights[0][var6][var5 - 1];
               }

               if (var5 == var1 + var3 && var5 < 103) {
                  Tiles.Tiles_heights[0][var6][var5] = Tiles.Tiles_heights[0][var6][1 + var5];
               }
            }
         }
      }

   }

   qj ac(int var1) {
      if (this.ab[var1] == null) {
         this.ab[var1] = new qj(this.aw(var1));
         this.ab[var1].ah();
      }

      return this.ab[var1];
   }

   void au(qj var1) {
      this.aq.al(var1);
      this.al = true;
      this.aa = true;
   }

   qj ab() {
      return this.aq;
   }

   qj aq() {
      if (this.al) {
         this.at.al(this.ab());
         if (this.an != null) {
            this.at.ao(this.an.aq());
         }

         this.al = false;
      }

      return this.at;
   }

   public qj al(int var1) {
      if (this.aa) {
         this.ay.al(this.ac(var1));
         this.ay.ao(this.aq());
         this.aa = false;
      }

      return this.ay;
   }

   static final void ai_renamed() {
      if (!ix.ac) {
         int var1 = Scene.Scene_cameraPitchSine;
         int var2 = Scene.Scene_cameraPitchCosine;
         int var3 = Scene.Scene_cameraYawSine;
         int var4 = Scene.Scene_cameraYawCosine;
         int var5 = 50;
         int var6 = 3500;
         int var7 = (2139535413 * ix.an - TaskHandler.au_renamed()) * var5 / eu.at_renamed();
         int var8 = (148198745 * ix.aw - ax.ab_renamed()) * var5 / eu.at_renamed();
         int var9 = (2139535413 * ix.an - TaskHandler.au_renamed()) * var6 / eu.at_renamed();
         int var10 = (ix.aw * 148198745 - ax.ab_renamed()) * var6 / eu.at_renamed();
         int var12 = var2 * var8 + var1 * var5 >> 16;
         int var13 = var2 * var5 - var1 * var8 >> 16;
         int var14 = var6 * var1 + var2 * var10 >> 16;
         int var15 = var2 * var6 - var10 * var1 >> 16;
         int var11 = ob.aw_renamed(var7, var13, var4, var3);
         var5 = qv.ac_renamed(var7, var13, var4, var3);
         var7 = var11;
         var11 = ob.aw_renamed(var9, var15, var4, var3);
         var6 = qv.ac_renamed(var9, var15, var4, var3);
         ix.au = -1666864639 * ((var7 + var11) / 2);
         lh.ab = -158275257 * ((var12 + var14) / 2);
         ix.aq = -393366251 * ((var6 + var5) / 2);
         ix.al = (var11 - var7) / 2 * 1520532401;
         ea.at = 101851969 * ((var14 - var12) / 2);
         ReflectionCheck.aa = (var6 - var5) / 2 * 1785143657;
         EnumType.ay = Math.abs(ix.al * 1677061457) * 1650720741;
         ix.ao = Math.abs(-864785215 * ea.at) * 1274213335;
         aa.ax = Math.abs(-2085912871 * ReflectionCheck.aa) * 1268910509;
      }
   }

   float[] at(int var1) {
      return this.ao[var1];
   }

   float[] aa(int var1) {
      return this.ax[var1];
   }

   float[] ay(int var1) {
      return this.ai[var1];
   }
}
