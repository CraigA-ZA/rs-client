import java.util.Arrays;
import java.util.HashMap;

public class Model extends Entity {
   static boolean cl = true;
   static boolean[] br = new boolean[6500];
   static boolean[] bs = new boolean[6500];
   static byte[] ac = new byte[1];
   static byte[] an = new byte[1];
   static char[] bc = new char[6000];
   static char[][] bh = new char[6000][512];
   static float[] bf = new float[6500];
   static float[] ck = new float[10];
   static int cf;
   static int cm;
   static int cq;
   static int[] ba = new int[6500];
   static int[] modelViewportXs = new int[6500];
   static int[] bl = new int[6500];
   static int[] bq = new int[6500];
   static int[] modelViewportYs = new int[6500];
   static int[] bv = new int[6500];
   static int[] bw = new int[12];
   static int[] ca = new int[10];
   static int[] cb;
   static int[] cc = new int[12];
   static int[] ci = new int[2000];
   static int[] cn = new int[10];
   static int[] cs = new int[2000];
   static int[] cu = new int[10];
   static int[] cv;
   static int[] Model_cosine;
   static int[] Model_sine;
   static int[][] ce = new int[12][2000];
   static Model af = new Model();
   static Model aw = new Model();
   static qj ab = new qj();
   static qj aq = new qj();
   static qj au = new qj();
   static final float cw;
   byte[] aj;
   byte[] am;
   byte[] faceAlphas;
   int diameter;
   int xzRadius;
   int boundsType;
   int radius;
   int bottomY;
   int[] verticesY;
   int[] ae;
   int[] indices3;
   int[] faceColors1;
   int[] indices2;
   int[] ap;
   int[] faceColors3;
   int[] verticesX;
   int[] faceColors2;
   int[] indices1;
   int[] verticesZ;
   int[] by;
   int[][] vertexLabels;
   int[][] be;
   int[][] faceLabelsAlpha;
   int[][] bk;
   HashMap bj = new HashMap();
   short[] faceTextures;
   public boolean isSingleTile = false;
   public byte az = 0;
   public byte ch;
   public byte cj;
   public byte cp;
   public byte ct;
   public int ad = 0;
   public int verticesCount = 0;
   public int indicesCount = 0;
   public short cd;

   static {
      Model_sine = Rasterizer3D.Rasterizer3D_sine;
      Model_cosine = Rasterizer3D.Rasterizer3D_cosine;
      cv = Rasterizer3D.af;
      cb = Rasterizer3D.aw;
      cw = Npc.au_renamed(50);
   }

   Model() {
   }

   public Model(Model[] var1, int var2) {
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.ad = 0;
      this.az = -1;

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         Model var4 = var1[var3];
         if (var4 != null) {
            this.verticesCount += var4.verticesCount;
            this.indicesCount += var4.indicesCount;
            this.ad += var4.ad;
            if (this.az == -1) {
               this.az = var4.az;
            }
         }
      }

      this.doNotUse(this.verticesCount, this.indicesCount, this.ad);
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.ad = 0;

      for(var3 = 0; var3 < var2; ++var3) {
         this.ac(var1[var3]);
      }

   }

   public Model(int var1, int var2, int var3, byte var4) {
      this.doNotUse(var1, var2, var3);
      this.az = var4;
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.ad = 0;
   }

   void doNotUse(int var1, int var2, int var3) {
      this.verticesX = new int[var1];
      this.verticesY = new int[var1];
      this.verticesZ = new int[var1];
      this.indices1 = new int[var2];
      this.indices2 = new int[var2];
      this.indices3 = new int[var2];
      this.faceColors1 = new int[var2];
      this.faceColors2 = new int[var2];
      this.faceColors3 = new int[var2];
      if (var3 > 0) {
         this.ae = new int[var3];
         this.ap = new int[var3];
         this.by = new int[var3];
      }

   }

   void aw(Model var1) {
      int var2 = this.indices1.length;
      if (this.am == null && (var1.am != null || this.az != var1.az)) {
         this.am = new byte[var2];
         Arrays.fill(this.am, this.az);
      }

      if (this.faceAlphas == null && var1.faceAlphas != null) {
         this.faceAlphas = new byte[var2];
         Arrays.fill(this.faceAlphas, (byte)0);
      }

      if (this.faceTextures == null && var1.faceTextures != null) {
         this.faceTextures = new short[var2];
         Arrays.fill(this.faceTextures, (short)-1);
      }

      if (this.aj == null && var1.aj != null) {
         this.aj = new byte[var2];
         Arrays.fill(this.aj, (byte)-1);
      }

   }

   public void ac(Model var1) {
      if (var1 != null) {
         this.aw(var1);

         int var2;
         for(var2 = 0; var2 < var1.indicesCount; ++var2) {
            this.indices1[this.indicesCount] = var1.indices1[var2] + this.verticesCount;
            this.indices2[this.indicesCount] = var1.indices2[var2] + this.verticesCount;
            this.indices3[this.indicesCount] = var1.indices3[var2] + this.verticesCount;
            this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
            this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
            this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
            if (this.am != null) {
               this.am[this.indicesCount] = var1.am != null ? var1.am[var2] : var1.az;
            }

            if (this.faceAlphas != null && var1.faceAlphas != null) {
               this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2];
            }

            if (this.faceTextures != null) {
               this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1;
            }

            if (this.aj != null) {
               if (var1.aj != null && var1.aj[var2] != -1) {
                  this.aj[this.indicesCount] = (byte)(var1.aj[var2] + this.ad);
               } else {
                  this.aj[this.indicesCount] = -1;
               }
            }

            ++this.indicesCount;
         }

         for(var2 = 0; var2 < var1.ad; ++var2) {
            this.ae[this.ad] = var1.ae[var2] + this.verticesCount;
            this.ap[this.ad] = var1.ap[var2] + this.verticesCount;
            this.by[this.ad] = var1.by[var2] + this.verticesCount;
            ++this.ad;
         }

         for(var2 = 0; var2 < var1.verticesCount; ++var2) {
            this.verticesX[this.verticesCount] = var1.verticesX[var2];
            this.verticesY[this.verticesCount] = var1.verticesY[var2];
            this.verticesZ[this.verticesCount] = var1.verticesZ[var2];
            ++this.verticesCount;
         }

      }
   }

   public Model at(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.calculateBoundsCylinder();
      int var7 = var2 - this.xzRadius;
      int var8 = var2 + this.xzRadius;
      int var9 = var4 - this.xzRadius;
      int var10 = var4 + this.xzRadius;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            Model var11;
            if (var5) {
               var11 = new Model();
               var11.verticesCount = this.verticesCount;
               var11.indicesCount = this.indicesCount;
               var11.ad = this.ad;
               var11.verticesX = this.verticesX;
               var11.verticesZ = this.verticesZ;
               var11.indices1 = this.indices1;
               var11.indices2 = this.indices2;
               var11.indices3 = this.indices3;
               var11.faceColors1 = this.faceColors1;
               var11.faceColors2 = this.faceColors2;
               var11.faceColors3 = this.faceColors3;
               var11.am = this.am;
               var11.faceAlphas = this.faceAlphas;
               var11.aj = this.aj;
               var11.faceTextures = this.faceTextures;
               var11.az = this.az;
               var11.ae = this.ae;
               var11.ap = this.ap;
               var11.by = this.by;
               var11.vertexLabels = this.vertexLabels;
               var11.faceLabelsAlpha = this.faceLabelsAlpha;
               var11.isSingleTile = this.isSingleTile;
               var11.verticesY = new int[var11.verticesCount];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.verticesCount; ++var12) {
                  var13 = this.verticesX[var12] + var2;
                  var14 = this.verticesZ[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.verticesY[var12] = this.verticesY[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.verticesCount; ++var12) {
                  var13 = (-this.verticesY[var12] << 16) / (this.height * 1550732737);
                  if (var13 < var6) {
                     var14 = this.verticesX[var12] + var2;
                     var15 = this.verticesZ[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.verticesY[var12] = this.verticesY[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.resetBounds();
            return var11;
         }
      } else {
         return this;
      }
   }

   public Model toSharedSequenceModel(boolean var1) {
      if (!var1 && an.length < this.indicesCount) {
         an = new byte[this.indicesCount + 100];
      }

      return this.copy0(var1, af, an);
   }

   public Model toSharedSpotAnimationModel(boolean var1) {
      if (!var1 && ac.length < this.indicesCount) {
         ac = new byte[this.indicesCount + 100];
      }

      return this.copy0(var1, aw, ac);
   }

   Model copy0(boolean var1, Model var2, byte[] var3) {
      var2.verticesCount = this.verticesCount;
      var2.indicesCount = this.indicesCount;
      var2.ad = this.ad;
      if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) {
         var2.verticesX = new int[this.verticesCount + 100];
         var2.verticesY = new int[this.verticesCount + 100];
         var2.verticesZ = new int[this.verticesCount + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.verticesCount; ++var4) {
         var2.verticesX[var4] = this.verticesX[var4];
         var2.verticesY[var4] = this.verticesY[var4];
         var2.verticesZ[var4] = this.verticesZ[var4];
      }

      if (var1) {
         var2.faceAlphas = this.faceAlphas;
      } else {
         var2.faceAlphas = var3;
         if (this.faceAlphas == null) {
            for(var4 = 0; var4 < this.indicesCount; ++var4) {
               var2.faceAlphas[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.indicesCount; ++var4) {
               var2.faceAlphas[var4] = this.faceAlphas[var4];
            }
         }
      }

      var2.indices1 = this.indices1;
      var2.indices2 = this.indices2;
      var2.indices3 = this.indices3;
      var2.faceColors1 = this.faceColors1;
      var2.faceColors2 = this.faceColors2;
      var2.faceColors3 = this.faceColors3;
      var2.am = this.am;
      var2.aj = this.aj;
      var2.faceTextures = this.faceTextures;
      var2.az = this.az;
      var2.ae = this.ae;
      var2.ap = this.ap;
      var2.by = this.by;
      var2.vertexLabels = this.vertexLabels;
      var2.faceLabelsAlpha = this.faceLabelsAlpha;
      var2.be = this.be;
      var2.bk = this.bk;
      var2.isSingleTile = this.isSingleTile;
      var2.resetBounds();
      var2.cp = 0;
      return var2;
   }

   void calculateBoundingBox(int var1) {
      if (!this.bj.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = Model_cosine[var1];
         int var9 = Model_sine[var1];

         for(int var10 = 0; var10 < this.verticesCount; ++var10) {
            int var11 = fy.af_renamed(this.verticesX[var10], this.verticesZ[var10], var8, var9);
            int var12 = this.verticesY[var10];
            int var13 = gj.an_renamed(this.verticesX[var10], this.verticesZ[var10], var8, var9);
            if (var11 < var2) {
               var2 = var11;
            }

            if (var11 > var5) {
               var5 = var11;
            }

            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }
         }

         AABB var17 = new AABB((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
         boolean var18 = true;
         if (var17.xMidOffset * -1923653815 < 32) {
            var17.xMidOffset = -889692384;
         }

         if (var17.zMidOffset * -452185969 < 32) {
            var17.zMidOffset = 702402016;
         }

         if (this.isSingleTile) {
            boolean var19 = true;
            var17.xMidOffset += -222423096;
            var17.zMidOffset += 175600504;
         }

         this.bj.put(var1, var17);
      }
   }

   public void calculateBoundsCylinder() {
      if (this.boundsType != 1) {
         this.boundsType = 1;
         this.height = 0;
         this.bottomY = 0;
         this.xzRadius = 0;

         for(int var1 = 0; var1 < this.verticesCount; ++var1) {
            int var2 = this.verticesX[var1];
            int var3 = this.verticesY[var1];
            int var4 = this.verticesZ[var1];
            if (-var3 > this.height * 1550732737) {
               this.height = -var3 * -644693439;
            }

            if (var3 > this.bottomY) {
               this.bottomY = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.xzRadius) {
               this.xzRadius = var5;
            }
         }

         this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99);
         this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.height * 1550732737 * this.height * 1550732737)) + 0.99);
         this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99);
      }
   }

   void ag() {
      if (this.boundsType != 2) {
         this.boundsType = 2;
         this.xzRadius = 0;

         for(int var1 = 0; var1 < this.verticesCount; ++var1) {
            int var2 = this.verticesX[var1];
            int var3 = this.verticesY[var1];
            int var4 = this.verticesZ[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.xzRadius) {
               this.xzRadius = var5;
            }
         }

         this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99);
         this.radius = this.xzRadius;
         this.diameter = this.xzRadius + this.xzRadius;
      }
   }

   public int ah() {
      this.calculateBoundsCylinder();
      return this.xzRadius;
   }

   public void resetBounds() {
      this.boundsType = 0;
      this.bj.clear();
   }

   public void animate(AnimFrameset var1, int var2) {
      if (this.vertexLabels != null) {
         if (var2 != -1) {
            AnimFrame var3 = var1.frames[var2];
            AnimBase var4 = var3.base;
            cq = 0;
            cm = 0;
            cf = 0;

            for(int var5 = 0; var5 < var3.transformCount; ++var5) {
               int var6 = var3.transforms[var5];
               this.transform(var4.transformTypes[var6], var4.transformLabels[var6], var3.xs[var5], var3.ys[var5], var3.zs[var5]);
            }

            this.resetBounds();
         }
      }
   }

   public void am(fh var1, int var2) {
      AnimBase var3 = var1.ac;
      ic var4 = var3.an();
      if (var4 != null) {
         var3.an().au(var1, var2);
         this.aj(var3.an(), var1.ac());
      }

      if (var1.au()) {
         this.as(var1, var2);
      }

      this.resetBounds();
   }

   void as(fh var1, int var2) {
      AnimBase var3 = var1.ac;

      for(int var4 = 0; var4 < var3.transformCount * 1158767581; ++var4) {
         int var5 = var3.transformTypes[var4];
         if (var5 == 5 && var1.an != null && var1.an[var4] != null && var1.an[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
            ek var6 = var1.an[var4][0];
            int[] var7 = var3.transformLabels[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.faceLabelsAlpha.length) {
                  int[] var11 = this.faceLabelsAlpha[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.aw(var2) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = 255;
                     }

                     this.faceAlphas[var13] = (byte)var14;
                  }
               }
            }
         }
      }

   }

   void aj(ic var1, int var2) {
      this.bs(var1, var2);
   }

   public void animate2(AnimFrameset var1, int var2, AnimFrameset var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            AnimFrame var6 = var1.frames[var2];
            AnimFrame var7 = var3.frames[var4];
            AnimBase var8 = var6.base;
            cq = 0;
            cm = 0;
            cf = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.transformCount; ++var11) {
               for(var12 = var6.transforms[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 != var10 || var8.transformTypes[var12] == 0) {
                  this.transform(var8.transformTypes[var12], var8.transformLabels[var12], var6.xs[var11], var6.ys[var11], var6.zs[var11]);
               }
            }

            cq = 0;
            cm = 0;
            cf = 0;
            byte var14 = 0;
            var9 = var14 + 1;
            var10 = var5[var14];

            for(var11 = 0; var11 < var7.transformCount; ++var11) {
               for(var12 = var7.transforms[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 == var10 || var8.transformTypes[var12] == 0) {
                  this.transform(var8.transformTypes[var12], var8.transformLabels[var12], var7.xs[var11], var7.ys[var11], var7.zs[var11]);
               }
            }

            this.resetBounds();
         } else {
            this.animate(var1, var2);
         }
      }
   }

   public void az(AnimBase var1, fh var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      ic var7 = var1.an();
      if (var7 != null) {
         var7.ab(var2, var3, var4, var5);
         if (var6) {
            this.aj(var7, var2.ac());
         }
      }

      if (!var5 && var2.au()) {
         this.as(var2, var3);
      }

   }

   public void ad(AnimFrameset var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.animate(var1, var2);
      } else {
         AnimFrame var5 = var1.frames[var2];
         AnimBase var6 = var5.base;
         int var7 = 0;
         int var8 = var3[var7++];
         cq = 0;
         cm = 0;
         cf = 0;

         for(int var9 = 0; var9 < var5.transformCount; ++var9) {
            int var10;
            for(var10 = var5.transforms[var9]; var10 > var8; var8 = var3[var7++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.transformTypes[var10] == 0) {
                  this.transform(var6.transformTypes[var10], var6.transformLabels[var10], var5.xs[var9], var5.ys[var9], var5.zs[var9]);
               }
            } else if (var10 != var8 || var6.transformTypes[var10] == 0) {
               this.transform(var6.transformTypes[var10], var6.transformLabels[var10], var5.xs[var9], var5.ys[var9], var5.zs[var9]);
            }
         }

      }
   }

   void transform(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var1 == 0) {
         var7 = 0;
         cq = 0;
         cm = 0;
         cf = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var24 = var2[var8];
            if (var24 < this.vertexLabels.length) {
               int[] var25 = this.vertexLabels[var24];

               for(var11 = 0; var11 < var25.length; ++var11) {
                  var12 = var25[var11];
                  cq += this.verticesX[var12];
                  cm += this.verticesY[var12];
                  cf += this.verticesZ[var12];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            cq = cq / var7 + var3;
            cm = cm / var7 + var4;
            cf = cf / var7 + var5;
         } else {
            cq = var3;
            cm = var4;
            cf = var5;
         }

      } else {
         int[] var9;
         int var10;
         int[] var10000;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.vertexLabels.length) {
                  var9 = this.vertexLabels[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.verticesX;
                     var10000[var11] += var3;
                     var10000 = this.verticesY;
                     var10000[var11] += var4;
                     var10000 = this.verticesZ;
                     var10000[var11] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.vertexLabels.length) {
                  var9 = this.vertexLabels[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.verticesX;
                     var10000[var11] -= cq;
                     var10000 = this.verticesY;
                     var10000[var11] -= cm;
                     var10000 = this.verticesZ;
                     var10000[var11] -= cf;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = Model_sine[var14];
                        var16 = Model_cosine[var14];
                        var17 = this.verticesY[var11] * var15 + this.verticesX[var11] * var16 >> 16;
                        this.verticesY[var11] = this.verticesY[var11] * var16 - this.verticesX[var11] * var15 >> 16;
                        this.verticesX[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = Model_sine[var12];
                        var16 = Model_cosine[var12];
                        var17 = this.verticesY[var11] * var16 - this.verticesZ[var11] * var15 >> 16;
                        this.verticesZ[var11] = this.verticesY[var11] * var15 + this.verticesZ[var11] * var16 >> 16;
                        this.verticesY[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = Model_sine[var13];
                        var16 = Model_cosine[var13];
                        var17 = this.verticesZ[var11] * var15 + this.verticesX[var11] * var16 >> 16;
                        this.verticesZ[var11] = this.verticesZ[var11] * var16 - this.verticesX[var11] * var15 >> 16;
                        this.verticesX[var11] = var17;
                     }

                     var10000 = this.verticesX;
                     var10000[var11] += cq;
                     var10000 = this.verticesY;
                     var10000[var11] += cm;
                     var10000 = this.verticesZ;
                     var10000[var11] += cf;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.vertexLabels.length) {
                  var9 = this.vertexLabels[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.verticesX;
                     var10000[var11] -= cq;
                     var10000 = this.verticesY;
                     var10000[var11] -= cm;
                     var10000 = this.verticesZ;
                     var10000[var11] -= cf;
                     this.verticesX[var11] = this.verticesX[var11] * var3 / 128;
                     this.verticesY[var11] = this.verticesY[var11] * var4 / 128;
                     this.verticesZ[var11] = this.verticesZ[var11] * var5 / 128;
                     var10000 = this.verticesX;
                     var10000[var11] += cq;
                     var10000 = this.verticesY;
                     var10000[var11] += cm;
                     var10000 = this.verticesZ;
                     var10000[var11] += cf;
                  }
               }
            }

         } else if (var1 == 5) {
            if (this.faceLabelsAlpha != null && this.faceAlphas != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if (var8 < this.faceLabelsAlpha.length) {
                     var9 = this.faceLabelsAlpha[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.faceAlphas[var11] & 255) + var3 * 8;
                        if (var12 < 0) {
                           var12 = 0;
                        } else if (var12 > 255) {
                           var12 = 255;
                        }

                        this.faceAlphas[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   public void rotateY90Ccw() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.verticesX[var1];
         this.verticesX[var1] = this.verticesZ[var1];
         this.verticesZ[var1] = -var2;
      }

      this.resetBounds();
   }

   public void rotateY180() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         this.verticesX[var1] = -this.verticesX[var1];
         this.verticesZ[var1] = -this.verticesZ[var1];
      }

      this.resetBounds();
   }

   public void rotateY270Ccw() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.verticesZ[var1];
         this.verticesZ[var1] = this.verticesX[var1];
         this.verticesX[var1] = -var2;
      }

      this.resetBounds();
   }

   public void rotateZ(int var1) {
      int var2 = Model_sine[var1];
      int var3 = Model_cosine[var1];

      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         int var5 = this.verticesY[var4] * var3 - this.verticesZ[var4] * var2 >> 16;
         this.verticesZ[var4] = this.verticesY[var4] * var2 + this.verticesZ[var4] * var3 >> 16;
         this.verticesY[var4] = var5;
      }

      this.resetBounds();
   }

   public void offset(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         int[] var10000 = this.verticesX;
         var10000[var4] += var1;
         var10000 = this.verticesY;
         var10000[var4] += var2;
         var10000 = this.verticesZ;
         var10000[var4] += var3;
      }

      this.resetBounds();
   }

   public void resize(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
         this.verticesY[var4] = this.verticesY[var4] * var2 / 128;
         this.verticesZ[var4] = this.verticesZ[var4] * var3 / 128;
      }

      this.resetBounds();
   }

   public final void bx(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.boundsType != 2 && this.boundsType != 1) {
         this.ag();
      }

      int var8 = TaskHandler.au_renamed();
      int var9 = ax.ab_renamed();
      int var10 = Model_sine[var1];
      int var11 = Model_cosine[var1];
      int var12 = Model_sine[var2];
      int var13 = Model_cosine[var2];
      int var14 = Model_sine[var3];
      int var15 = Model_cosine[var3];
      int var16 = Model_sine[var4];
      int var17 = Model_cosine[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.verticesCount; ++var19) {
         int var20 = this.verticesX[var19];
         int var21 = this.verticesY[var19];
         int var22 = this.verticesZ[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         bq[var19] = var22 - var18;
         modelViewportXs[var19] = var8 + var20 * eu.at_renamed() / var22;
         modelViewportYs[var19] = var9 + var23 * eu.at_renamed() / var22;
         bf[var19] = Npc.au_renamed(var22);
         if (this.ad > 0) {
            ba[var19] = var20;
            bv[var19] = var23;
            bl[var19] = var22;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   public final void bo(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.boundsType != 2 && this.boundsType != 1) {
         this.ag();
      }

      int var9 = TaskHandler.au_renamed();
      int var10 = ax.ab_renamed();
      int var11 = Model_sine[var1];
      int var12 = Model_cosine[var1];
      int var13 = Model_sine[var2];
      int var14 = Model_cosine[var2];
      int var15 = Model_sine[var3];
      int var16 = Model_cosine[var3];
      int var17 = Model_sine[var4];
      int var18 = Model_cosine[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.verticesCount; ++var20) {
         int var21 = this.verticesX[var20];
         int var22 = this.verticesY[var20];
         int var23 = this.verticesZ[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         bq[var20] = var23 - var19;
         modelViewportXs[var20] = var9 + var21 * eu.at_renamed() / var8;
         modelViewportYs[var20] = var10 + var24 * eu.at_renamed() / var8;
         bf[var20] = Npc.au_renamed(var8);
         if (this.ad > 0) {
            ba[var20] = var21;
            bv[var20] = var24;
            bl[var20] = var23;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.boundsType != 1) {
         this.calculateBoundsCylinder();
      }

      this.calculateBoundingBox(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.xzRadius * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.xzRadius) * eu.at_renamed();
         if (var16 / var14 < kt.aq_renamed()) {
            int var17 = (var15 + this.xzRadius) * eu.at_renamed();
            int var18 = var17 / var14;
            int var19 = -1346890391 * Rasterizer3D.ab.av;
            if (var18 > var19) {
               int var20 = var7 * var3 - var11 * var2 >> 16;
               int var21 = this.xzRadius * var2 >> 16;
               int var22 = var21 + (this.bottomY * var3 >> 16);
               int var23 = (var20 + var22) * eu.at_renamed();
               int var24 = var23 / var14;
               int var25 = Rasterizer3D.ab.am * 1380452969;
               if (var24 > var25) {
                  int var26 = var21 + (this.height * 1550732737 * var3 >> 16);
                  int var27 = (var20 - var26) * eu.at_renamed();
                  if (var27 / var14 < fa.al_renamed()) {
                     int var28 = var13 + (this.height * 1550732737 * var2 >> 16);
                     boolean var29 = false;
                     boolean var30 = false;
                     if (var12 - var28 <= 50) {
                        var30 = true;
                     }

                     boolean var31 = var30 || this.ad > 0;
                     int var32 = Projectile.ax_renamed();
                     int var33 = ix.aw * 148198745;
                     boolean var35 = ix.af;
                     boolean var37 = gq.aw(var9);
                     boolean var38 = false;
                     int var40;
                     int var41;
                     int var42;
                     if (var37 && var35) {
                        boolean var39 = false;
                        if (cl) {
                           var39 = qf.ag_renamed(this, var1, var6, var7, var8);
                        } else {
                           var40 = var12 - var13;
                           if (var40 <= 50) {
                              var40 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var40;
                           } else {
                              var17 /= var14;
                              var16 /= var40;
                           }

                           if (var20 > 0) {
                              var27 /= var14;
                              var23 /= var40;
                           } else {
                              var23 /= var14;
                              var27 /= var40;
                           }

                           var41 = var32 - TaskHandler.au_renamed();
                           var42 = var33 - ax.ab_renamed();
                           if (var41 > var16 && var41 < var17 && var42 > var27 && var42 < var23) {
                              var39 = true;
                           }
                        }

                        if (var39) {
                           if (this.isSingleTile) {
                              GraphicsObject.ao(var9);
                           } else {
                              var38 = true;
                           }
                        }
                     }

                     int var49 = TaskHandler.au_renamed();
                     var40 = ax.ab_renamed();
                     var41 = 0;
                     var42 = 0;
                     if (var1 != 0) {
                        var41 = Model_sine[var1];
                        var42 = Model_cosine[var1];
                     }

                     for(int var43 = 0; var43 < this.verticesCount; ++var43) {
                        int var44 = this.verticesX[var43];
                        int var45 = this.verticesY[var43];
                        int var46 = this.verticesZ[var43];
                        int var47;
                        if (var1 != 0) {
                           var47 = var46 * var41 + var44 * var42 >> 16;
                           var46 = var46 * var42 - var44 * var41 >> 16;
                           var44 = var47;
                        }

                        var44 += var6;
                        var45 += var7;
                        var46 += var8;
                        var47 = var46 * var4 + var44 * var5 >> 16;
                        var46 = var46 * var5 - var44 * var4 >> 16;
                        var44 = var47;
                        var47 = var45 * var3 - var46 * var2 >> 16;
                        var46 = var45 * var2 + var46 * var3 >> 16;
                        bq[var43] = var46 - var12;
                        if (var46 >= 50) {
                           modelViewportXs[var43] = var49 + var44 * eu.at_renamed() / var46;
                           modelViewportYs[var43] = var40 + var47 * eu.at_renamed() / var46;
                           bf[var43] = Npc.au_renamed(var46);
                        } else {
                           modelViewportXs[var43] = -5000;
                           var29 = true;
                        }

                        if (var31) {
                           ba[var43] = var44;
                           bv[var43] = var47;
                           bl[var43] = var46;
                        }
                     }

                     try {
                        this.draw0(var29, var38, this.isSingleTile, var9);
                     } catch (Exception var48) {
                     }

                  }
               }
            }
         }
      }
   }

   final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.diameter < 6000) {
         int var6;
         for(var6 = 0; var6 < this.diameter; ++var6) {
            bc[var6] = 0;
         }

         var6 = var3 ? 20 : 5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.indicesCount; var7 = (char)(var7 + 1)) {
            if (this.faceColors3[var7] != -2) {
               var8 = this.indices1[var7];
               var9 = this.indices2[var7];
               var10 = this.indices3[var7];
               var11 = modelViewportXs[var8];
               var12 = modelViewportXs[var9];
               var13 = modelViewportXs[var10];
               int var17;
               int var32;
               if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
                  var32 = ba[var8];
                  var15 = ba[var9];
                  var16 = ba[var10];
                  var17 = bv[var8];
                  var18 = bv[var9];
                  int var19 = bv[var10];
                  int var20 = bl[var8];
                  int var21 = bl[var9];
                  int var22 = bl[var10];
                  var32 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var32 * var22;
                  int var25 = var32 * var19 - var17 * var16;
                  if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     br[var7] = true;
                     int var26 = (bq[var8] + bq[var9] + bq[var10]) / 3 + this.radius;
                     bh[var26][bc[var26]++] = (char)var7;
                  }
               } else {
                  if (var2) {
                     var15 = modelViewportYs[var8];
                     var16 = modelViewportYs[var9];
                     var17 = modelViewportYs[var10];
                     var18 = 148198745 * ix.aw + var6;
                     boolean var14;
                     if (var18 < var15 && var18 < var16 && var18 < var17) {
                        var14 = false;
                     } else {
                        var18 = ix.aw * 148198745 - var6;
                        if (var18 > var15 && var18 > var16 && var18 > var17) {
                           var14 = false;
                        } else {
                           var18 = var6 + ix.an * 2139535413;
                           if (var18 < var11 && var18 < var12 && var18 < var13) {
                              var14 = false;
                           } else {
                              var18 = ix.an * 2139535413 - var6;
                              if (var18 > var11 && var18 > var12 && var18 > var13) {
                                 var14 = false;
                              } else {
                                 var14 = true;
                              }
                           }
                        }
                     }

                     if (var14) {
                        GraphicsObject.ao(var4);
                        var2 = false;
                     }
                  }

                  if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (modelViewportYs[var8] - modelViewportYs[var9]) * (var13 - var12) > 0) {
                     br[var7] = false;
                     var32 = aq.aa_renamed();
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var32 && var12 <= var32 && var13 <= var32) {
                        bs[var7] = false;
                     } else {
                        bs[var7] = true;
                     }

                     var15 = (bq[var8] + bq[var9] + bq[var10]) / 3 + this.radius;
                     bh[var15][bc[var15]++] = (char)var7;
                  }
               }
            }
         }

         char var27;
         char[] var28;
         if (this.am == null) {
            for(var7 = this.diameter - 1; var7 >= 0; --var7) {
               var27 = bc[var7];
               if (var27 > 0) {
                  var28 = bh[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     this.bm(var28[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               bw[var7] = 0;
               cc[var7] = 0;
            }

            for(var7 = this.diameter - 1; var7 >= 0; --var7) {
               var27 = bc[var7];
               if (var27 > 0) {
                  var28 = bh[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     char var29 = var28[var10];
                     byte var30 = this.am[var29];
                     var13 = bw[var30]++;
                     ce[var30][var13] = var29;
                     if (var30 < 10) {
                        int[] var35 = cc;
                        var35[var30] += var7;
                     } else if (var30 == 10) {
                        ci[var13] = var7;
                     } else {
                        cs[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (bw[1] > 0 || bw[2] > 0) {
               var7 = (cc[1] + cc[2]) / (bw[1] + bw[2]);
            }

            var8 = 0;
            if (bw[3] > 0 || bw[4] > 0) {
               var8 = (cc[3] + cc[4]) / (bw[3] + bw[4]);
            }

            var9 = 0;
            if (bw[6] > 0 || bw[8] > 0) {
               var9 = (cc[6] + cc[8]) / (bw[6] + bw[8]);
            }

            var11 = 0;
            var12 = bw[10];
            int[] var31 = ce[10];
            int[] var33 = ci;
            if (var11 == var12) {
               var11 = 0;
               var12 = bw[11];
               var31 = ce[11];
               var33 = cs;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.bm(var31[var11++]);
                  if (var11 == var12 && var31 != ce[11]) {
                     var11 = 0;
                     var12 = bw[11];
                     var31 = ce[11];
                     var33 = cs;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = bw[var15];
               int[] var34 = ce[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.bm(var34[var18]);
               }
            }

            while(var10 != -1000) {
               this.bm(var31[var11++]);
               if (var11 == var12 && var31 != ce[11]) {
                  var11 = 0;
                  var31 = ce[11];
                  var12 = bw[11];
                  var33 = cs;
               }

               if (var11 < var12) {
                  var10 = var33[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   final void bm(int var1) {
      if (br[var1]) {
         this.bj(var1);
      } else {
         int var2 = this.indices1[var1];
         int var3 = this.indices2[var1];
         int var4 = this.indices3[var1];
         Rasterizer3D.ab.af = bs[var1];
         if (this.faceAlphas == null) {
            Rasterizer3D.ab.aw = 0;
         } else {
            Rasterizer3D.ab.aw = (this.faceAlphas[var1] & 255) * -1087605381;
         }

         this.bt(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], bf[var2], bf[var3], bf[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
      }
   }

   boolean bd(int var1) {
      return this.cp > 0 && var1 < this.cd;
   }

   final void bt(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
      int var15;
      int var16;
      int var17;
      if (this.faceTextures != null && this.faceTextures[var1] != -1) {
         int var26;
         if (this.aj != null && this.aj[var1] != -1) {
            var17 = this.aj[var1] & 255;
            var26 = this.ae[var17];
            var15 = this.ap[var17];
            var16 = this.by[var17];
         } else {
            var26 = this.indices1[var1];
            var15 = this.indices2[var1];
            var16 = this.indices3[var1];
         }

         if (this.faceColors3[var1] == -1) {
            DevicePcmPlayerProvider.ar_renamed(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, ba[var26], ba[var15], ba[var16], bv[var26], bv[var15], bv[var16], bl[var26], bl[var15], bl[var16], this.faceTextures[var1]);
         } else {
            DevicePcmPlayerProvider.ar_renamed(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, ba[var26], ba[var15], ba[var16], bv[var26], bv[var15], bv[var16], bl[var26], bl[var15], bl[var16], this.faceTextures[var1]);
         }
      } else {
         boolean var14 = this.bd(var1);
         byte var18;
         if (this.faceColors3[var1] == -1 && var14) {
            var15 = cv[this.faceColors1[var1]];
            var16 = this.cj;
            var17 = this.ch;
            var18 = this.ct;
            byte var19 = this.cp;
            Rasterizer3D.aq.au(var2, var3, var4, var5, var6, var7, var8, var9, var10, var15, (byte)var16, (byte)var17, var18, var19);
         } else if (this.faceColors3[var1] == -1) {
            fw.av_renamed(var2, var3, var4, var5, var6, var7, var8, var9, var10, cv[this.faceColors1[var1]]);
         } else if (var14) {
            var15 = this.cj;
            var16 = this.ch;
            var17 = this.ct;
            var18 = this.cp;
            Rasterizer3D.aq.ac(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, (byte)var15, (byte)var16, (byte)var17, var18);
         } else {
            Wall.ah_renamed(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }

   }

   final void bj(int var1) {
      int var2 = TaskHandler.au_renamed();
      int var3 = ax.ab_renamed();
      int var4 = 0;
      int var5 = this.indices1[var1];
      int var6 = this.indices2[var1];
      int var7 = this.indices3[var1];
      int var8 = bl[var5];
      int var9 = bl[var6];
      int var10 = bl[var7];
      if (this.faceAlphas == null) {
         Rasterizer3D.ab.aw = 0;
      } else {
         Rasterizer3D.ab.aw = (this.faceAlphas[var1] & 255) * -1087605381;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         cn[var4] = modelViewportXs[var5];
         ca[var4] = modelViewportYs[var5];
         ck[var4] = bf[var7];
         cu[var4++] = this.faceColors1[var1];
      } else {
         var11 = ba[var5];
         var12 = bv[var5];
         var13 = this.faceColors1[var1];
         if (var10 >= 50) {
            var14 = (50 - var8) * cb[var10 - var8];
            cn[var4] = var2 + (var11 + ((ba[var7] - var11) * var14 >> 16)) * eu.at_renamed() / 50;
            ca[var4] = var3 + (var12 + ((bv[var7] - var12) * var14 >> 16)) * eu.at_renamed() / 50;
            ck[var4] = cw;
            cu[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = (50 - var8) * cb[var9 - var8];
            cn[var4] = var2 + (var11 + ((ba[var6] - var11) * var14 >> 16)) * eu.at_renamed() / 50;
            ca[var4] = var3 + (var12 + ((bv[var6] - var12) * var14 >> 16)) * eu.at_renamed() / 50;
            ck[var4] = cw;
            cu[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         cn[var4] = modelViewportXs[var6];
         ca[var4] = modelViewportYs[var6];
         ck[var4] = bf[var7];
         cu[var4++] = this.faceColors2[var1];
      } else {
         var11 = ba[var6];
         var12 = bv[var6];
         var13 = this.faceColors2[var1];
         if (var8 >= 50) {
            var14 = (50 - var9) * cb[var8 - var9];
            cn[var4] = var2 + (var11 + ((ba[var5] - var11) * var14 >> 16)) * eu.at_renamed() / 50;
            ca[var4] = var3 + (var12 + ((bv[var5] - var12) * var14 >> 16)) * eu.at_renamed() / 50;
            ck[var4] = cw;
            cu[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (50 - var9) * cb[var10 - var9];
            cn[var4] = var2 + (var11 + ((ba[var7] - var11) * var14 >> 16)) * eu.at_renamed() / 50;
            ca[var4] = var3 + (var12 + ((bv[var7] - var12) * var14 >> 16)) * eu.at_renamed() / 50;
            cu[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         cn[var4] = modelViewportXs[var7];
         ca[var4] = modelViewportYs[var7];
         ck[var4] = bf[var7];
         cu[var4++] = this.faceColors3[var1];
      } else {
         var11 = ba[var7];
         var12 = bv[var7];
         var13 = this.faceColors3[var1];
         if (var9 >= 50) {
            var14 = (50 - var10) * cb[var9 - var10];
            cn[var4] = var2 + (var11 + ((ba[var6] - var11) * var14 >> 16)) * eu.at_renamed() / 50;
            ca[var4] = var3 + (var12 + ((bv[var6] - var12) * var14 >> 16)) * eu.at_renamed() / 50;
            ck[var4] = cw;
            cu[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = (50 - var10) * cb[var8 - var10];
            cn[var4] = var2 + (var11 + ((ba[var5] - var11) * var14 >> 16)) * eu.at_renamed() / 50;
            ca[var4] = var3 + (var12 + ((bv[var5] - var12) * var14 >> 16)) * eu.at_renamed() / 50;
            ck[var4] = cw;
            cu[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
         }
      }

      var11 = cn[0];
      var12 = cn[1];
      var13 = cn[2];
      var14 = ca[0];
      int var15 = ca[1];
      int var16 = ca[2];
      float var17 = ck[0];
      float var18 = ck[1];
      float var19 = ck[2];
      Rasterizer3D.ab.af = false;
      int var20 = aq.aa_renamed();
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
            Rasterizer3D.ab.af = true;
         }

         this.bt(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, cu[0], cu[1], cu[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || cn[3] < 0 || cn[3] > var20) {
            Rasterizer3D.ab.af = true;
         }

         int var22;
         int var23;
         int var24;
         short var40;
         if (this.faceTextures != null && this.faceTextures[var1] != -1) {
            int var38;
            if (this.aj != null && this.aj[var1] != -1) {
               var24 = this.aj[var1] & 255;
               var38 = this.ae[var24];
               var22 = this.ap[var24];
               var23 = this.by[var24];
            } else {
               var38 = var5;
               var22 = var6;
               var23 = var7;
            }

            var40 = this.faceTextures[var1];
            if (this.faceColors3[var1] == -1) {
               DevicePcmPlayerProvider.ar_renamed(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], ba[var38], ba[var22], ba[var23], bv[var38], bv[var22], bv[var23], bl[var38], bl[var22], bl[var23], var40);
               DevicePcmPlayerProvider.ar_renamed(var14, var16, ca[3], var11, var13, cn[3], var17, var19, ck[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], ba[var38], ba[var22], ba[var23], bv[var38], bv[var22], bv[var23], bl[var38], bl[var22], bl[var23], var40);
            } else {
               DevicePcmPlayerProvider.ar_renamed(var14, var15, var16, var11, var12, var13, var17, var18, var19, cu[0], cu[1], cu[2], ba[var38], ba[var22], ba[var23], bv[var38], bv[var22], bv[var23], bl[var38], bl[var22], bl[var23], var40);
               DevicePcmPlayerProvider.ar_renamed(var14, var16, ca[3], var11, var13, cn[3], var17, var19, ck[3], cu[0], cu[2], cu[3], ba[var38], ba[var22], ba[var23], bv[var38], bv[var22], bv[var23], bl[var38], bl[var22], bl[var23], var40);
            }
         } else {
            boolean var21 = this.bd(var1);
            byte var25;
            byte var26;
            int var27;
            int var28;
            if (this.faceColors3[var1] == -1 && var21) {
               var22 = cv[this.faceColors1[var1]];
               byte var39 = this.cj;
               var40 = this.ch;
               var25 = this.ct;
               var26 = this.cp;
               Rasterizer3D.aq.au(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, var39, (byte)var40, var25, var26);
               var27 = ca[3];
               var28 = cn[3];
               float var41 = ck[3];
               byte var42 = this.cj;
               byte var43 = this.ch;
               byte var44 = this.ct;
               byte var45 = this.cp;
               Rasterizer3D.aq.au(var14, var16, var27, var11, var13, var28, var17, var19, var41, var22, var42, var43, var44, var45);
            } else if (this.faceColors3[var1] == -1) {
               var22 = cv[this.faceColors1[var1]];
               fw.av_renamed(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
               fw.av_renamed(var14, var16, ca[3], var11, var13, cn[3], var17, var19, ck[3], var22);
            } else if (var21) {
               var22 = cu[0];
               var23 = cu[1];
               var24 = cu[2];
               var25 = this.cj;
               var26 = this.ct;
               var27 = this.ch;
               var28 = this.cp;
               Rasterizer3D.aq.ac(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, var23, var24, var25, var26, (byte)var27, (byte)var28);
               int var29 = ca[3];
               int var30 = cn[3];
               int var31 = cu[0];
               int var32 = cu[2];
               int var33 = cu[3];
               byte var34 = this.cj;
               byte var35 = this.ct;
               byte var36 = this.ch;
               byte var37 = this.cp;
               Rasterizer3D.aq.ac(var14, var16, var29, var11, var13, var30, 0.0F, 0.0F, 0.0F, var31, var32, var33, var34, var35, var36, var37);
            } else {
               Wall.ah_renamed(var14, var15, var16, var11, var12, var13, var17, var18, var19, cu[0], cu[1], cu[2]);
               Wall.ah_renamed(var14, var16, ca[3], var11, var13, cn[3], var17, var19, ck[3], cu[0], cu[2], cu[3]);
            }
         }
      }

   }

   void bn(int var1, qj var2) {
      float var3 = (float)this.verticesX[var1];
      float var4 = (float)(-this.verticesY[var1]);
      float var5 = (float)(-this.verticesZ[var1]);
      float var6 = 1.0F;
      this.verticesX[var1] = (int)(var2.au[0] * var3 + var2.au[4] * var4 + var2.au[8] * var5 + var2.au[12] * var6);
      this.verticesY[var1] = -((int)(var2.au[1] * var3 + var2.au[5] * var4 + var2.au[9] * var5 + var2.au[13] * var6));
      this.verticesZ[var1] = -((int)(var2.au[2] * var3 + var2.au[6] * var4 + var2.au[10] * var5 + var2.au[14] * var6));
   }

   void bs(ic var1, int var2) {
      if (this.be != null) {
         for(int var3 = 0; var3 < this.verticesCount; ++var3) {
            int[] var4 = this.be[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.bk[var3];
               au.aq();

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  ew var8 = var1.aw(var7);
                  if (var8 != null) {
                     ab.at((float)var5[var6] / 255.0F);
                     aq.al(var8.al(var2));
                     aq.ao(ab);
                     au.ay(aq);
                  }
               }

               this.bn(var3, au);
            }
         }

      }
   }
}
