import java.util.Arrays;

public final class qj {
   public static final qj ab;
   public static qj[] an = new qj[0];
   static final float af = 1.0E-4F;
   public static int ac;
   static tq[] kc;
   static int aw;
   public float[] au;
   static int jg;
   public static final int ax = 44;
   static final int ag = 9;

   public void ba(qj var1) {
      float var2 = this.au[3] * var1.au[12] + this.au[2] * var1.au[8] + var1.au[4] * this.au[1] + var1.au[0] * this.au[0];
      float var3 = var1.au[13] * this.au[3] + var1.au[1] * this.au[0] + this.au[1] * var1.au[5] + var1.au[9] * this.au[2];
      float var4 = this.au[0] * var1.au[2] + var1.au[6] * this.au[1] + this.au[2] * var1.au[10] + var1.au[14] * this.au[3];
      float var5 = this.au[2] * var1.au[11] + this.au[1] * var1.au[7] + this.au[0] * var1.au[3] + this.au[3] * var1.au[15];
      float var6 = this.au[5] * var1.au[4] + this.au[4] * var1.au[0] + var1.au[8] * this.au[6] + this.au[7] * var1.au[12];
      float var7 = var1.au[13] * this.au[7] + this.au[6] * var1.au[9] + this.au[5] * var1.au[5] + var1.au[1] * this.au[4];
      float var8 = var1.au[2] * this.au[4] + this.au[5] * var1.au[6] + var1.au[10] * this.au[6] + var1.au[14] * this.au[7];
      float var9 = this.au[6] * var1.au[11] + var1.au[3] * this.au[4] + var1.au[7] * this.au[5] + this.au[7] * var1.au[15];
      float var10 = var1.au[0] * this.au[8] + this.au[9] * var1.au[4] + var1.au[8] * this.au[10] + this.au[11] * var1.au[12];
      float var11 = var1.au[13] * this.au[11] + this.au[9] * var1.au[5] + var1.au[1] * this.au[8] + this.au[10] * var1.au[9];
      float var12 = this.au[11] * var1.au[14] + var1.au[6] * this.au[9] + var1.au[2] * this.au[8] + this.au[10] * var1.au[10];
      float var13 = var1.au[3] * this.au[8] + var1.au[7] * this.au[9] + this.au[10] * var1.au[11] + this.au[11] * var1.au[15];
      float var14 = this.au[14] * var1.au[8] + var1.au[4] * this.au[13] + this.au[12] * var1.au[0] + this.au[15] * var1.au[12];
      float var15 = this.au[12] * var1.au[1] + this.au[13] * var1.au[5] + this.au[14] * var1.au[9] + this.au[15] * var1.au[13];
      float var16 = var1.au[14] * this.au[15] + var1.au[2] * this.au[12] + this.au[13] * var1.au[6] + var1.au[10] * this.au[14];
      float var17 = var1.au[7] * this.au[13] + this.au[12] * var1.au[3] + this.au[14] * var1.au[11] + var1.au[15] * this.au[15];
      this.au[0] = var2;
      this.au[1] = var3;
      this.au[2] = var4;
      this.au[3] = var5;
      this.au[4] = var6;
      this.au[5] = var7;
      this.au[6] = var8;
      this.au[7] = var9;
      this.au[8] = var10;
      this.au[9] = var11;
      this.au[10] = var12;
      this.au[11] = var13;
      this.au[12] = var14;
      this.au[13] = var15;
      this.au[14] = var16;
      this.au[15] = var17;
   }

   public qj() {
      try {
         super();
         this.au = new float[16];
         this.ab((byte)-10);
      } catch (RuntimeException var1) {
         throw db.an(var1, "qj.<init>(" + ')');
      }
   }

   public qj(qj var1) {
      try {
         super();
         this.au = new float[16];
         this.al(var1, 1890828174);
      } catch (RuntimeException var2) {
         throw db.an(var2, "qj.<init>(" + ')');
      }
   }

   public float[] au(int var1) {
      try {
         float[] var2 = new float[]{(float)(-Math.asin((double)this.au[6])), 0.0F, 0.0F};
         double var3 = Math.cos((double)var2[0]);
         double var5;
         double var7;
         if (Math.abs(var3) > 0.005) {
            if (var1 == -1632760729) {
               throw new IllegalStateException();
            }

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
               if (var1 == -1632760729) {
                  throw new IllegalStateException();
               }

               var2[1] = (float)Math.atan2(var5, var7);
            } else {
               var2[1] = (float)(-Math.atan2(var5, var7));
            }

            var2[2] = 0.0F;
         }

         return var2;
      } catch (RuntimeException var13) {
         throw db.an(var13, "qj.au(" + ')');
      }
   }

   void aw(sg var1, boolean var2, byte var3) {
      try {
         if (var2) {
            if (var3 == 1) {
               return;
            }

            qc var4 = new qc();
            var4.an(lq.af(var1.cg((byte)-49), (short)13359), -1749175533);
            var4.aw(lq.af(var1.cg((byte)-94), (short)15788), 1665202061);
            var4.ac(lq.af(var1.cg((byte)-78), (short)30151), (byte)61);
            var4.au((float)var1.cg((byte)-114), (float)var1.cg((byte)-103), (float)var1.cg((byte)-100), (byte)117);
            this.ai(var4, (byte)87);
         } else {
            for(int var6 = 0; var6 < 16; ++var6) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               }

               this.au[var6] = var1.cb(1195246602);
            }
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "qj.aw(" + ')');
      }
   }

   float[] ac(short var1) {
      try {
         float[] var2 = new float[3];
         if ((double)this.au[2] < 0.999) {
            if (var1 <= 258) {
               throw new IllegalStateException();
            }

            if ((double)this.au[2] > -0.999) {
               if (var1 <= 258) {
                  throw new IllegalStateException();
               }

               var2[1] = (float)(-Math.asin((double)this.au[2]));
               double var3 = Math.cos((double)var2[1]);
               var2[0] = (float)Math.atan2((double)this.au[6] / var3, (double)this.au[10] / var3);
               var2[2] = (float)Math.atan2((double)this.au[1] / var3, (double)this.au[0] / var3);
               return var2;
            }
         }

         var2[0] = 0.0F;
         var2[1] = (float)Math.atan2((double)this.au[2], 0.0);
         var2[2] = (float)Math.atan2((double)(-this.au[9]), (double)this.au[5]);
         return var2;
      } catch (RuntimeException var5) {
         throw db.an(var5, "qj.ac(" + ')');
      }
   }

   public void an(int var1) {
      try {
         synchronized(an) {
            if (-910698341 * ac < -2095080743 * aw - 1) {
               if (var1 != 1198141071) {
                  return;
               }

               an[(ac += -564638317) * -910698341 - 1] = this;
            }

         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "qj.an(" + ')');
      }
   }

   public void ab(byte var1) {
      try {
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
      } catch (RuntimeException var2) {
         throw db.an(var2, "qj.ab(" + ')');
      }
   }

   public void aq(int var1) {
      try {
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
      } catch (RuntimeException var2) {
         throw db.an(var2, "qj.aq(" + ')');
      }
   }

   public void al(qj var1, int var2) {
      try {
         System.arraycopy(var1.au, 0, this.au, 0, 16);
      } catch (RuntimeException var3) {
         throw db.an(var3, "qj.al(" + ')');
      }
   }

   public void at(float var1, int var2) {
      try {
         this.aa(var1, var1, var1, -814200416);
      } catch (RuntimeException var3) {
         throw db.an(var3, "qj.at(" + ')');
      }
   }

   float ci() {
      return this.au[8] * this.au[7] * this.au[2] * this.au[13] + this.au[2] * this.au[5] * this.au[11] * this.au[12] + (this.au[4] * this.au[2] * this.au[9] * this.au[15] + this.au[12] * this.au[1] * this.au[7] * this.au[10] + (this.au[8] * this.au[6] * this.au[1] * this.au[15] + this.au[14] * this.au[1] * this.au[4] * this.au[11] + (this.au[0] * this.au[7] * this.au[9] * this.au[14] + this.au[0] * this.au[6] * this.au[11] * this.au[13] + (this.au[5] * this.au[0] * this.au[10] * this.au[15] - this.au[14] * this.au[5] * this.au[0] * this.au[11] - this.au[15] * this.au[0] * this.au[6] * this.au[9]) - this.au[10] * this.au[0] * this.au[7] * this.au[13] - this.au[1] * this.au[4] * this.au[10] * this.au[15]) - this.au[12] * this.au[11] * this.au[1] * this.au[6] - this.au[14] * this.au[1] * this.au[7] * this.au[8]) - this.au[2] * this.au[4] * this.au[11] * this.au[13] - this.au[15] * this.au[2] * this.au[5] * this.au[8]) - this.au[12] * this.au[9] * this.au[2] * this.au[7] - this.au[9] * this.au[3] * this.au[4] * this.au[14] + this.au[13] * this.au[10] * this.au[4] * this.au[3] + this.au[3] * this.au[5] * this.au[8] * this.au[14] - this.au[12] * this.au[5] * this.au[3] * this.au[10] - this.au[8] * this.au[6] * this.au[3] * this.au[13] + this.au[12] * this.au[3] * this.au[6] * this.au[9];
   }

   public void ay(qj var1, int var2) {
      try {
         for(int var3 = 0; var3 < this.au.length; ++var3) {
            if (var2 == 1960529059) {
               return;
            }

            float[] var10000 = this.au;
            var10000[var3] += var1.au[var3];
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "qj.ay(" + ')');
      }
   }

   public void ao(qj var1, int var2) {
      try {
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
      } catch (RuntimeException var19) {
         throw db.an(var19, "qj.ao(" + ')');
      }
   }

   public void ax(qx var1, byte var2) {
      try {
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
      } catch (RuntimeException var13) {
         throw db.an(var13, "qj.ax(" + ')');
      }
   }

   void ai(qc var1, byte var2) {
      try {
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
      } catch (RuntimeException var3) {
         throw db.an(var3, "qj.ai(" + ')');
      }
   }

   float ag(int var1) {
      try {
         return this.au[8] * this.au[7] * this.au[2] * this.au[13] + this.au[2] * this.au[5] * this.au[11] * this.au[12] + (this.au[4] * this.au[2] * this.au[9] * this.au[15] + this.au[12] * this.au[1] * this.au[7] * this.au[10] + (this.au[8] * this.au[6] * this.au[1] * this.au[15] + this.au[14] * this.au[1] * this.au[4] * this.au[11] + (this.au[0] * this.au[7] * this.au[9] * this.au[14] + this.au[0] * this.au[6] * this.au[11] * this.au[13] + (this.au[5] * this.au[0] * this.au[10] * this.au[15] - this.au[14] * this.au[5] * this.au[0] * this.au[11] - this.au[15] * this.au[0] * this.au[6] * this.au[9]) - this.au[10] * this.au[0] * this.au[7] * this.au[13] - this.au[1] * this.au[4] * this.au[10] * this.au[15]) - this.au[12] * this.au[11] * this.au[1] * this.au[6] - this.au[14] * this.au[1] * this.au[7] * this.au[8]) - this.au[2] * this.au[4] * this.au[11] * this.au[13] - this.au[15] * this.au[2] * this.au[5] * this.au[8]) - this.au[12] * this.au[9] * this.au[2] * this.au[7] - this.au[9] * this.au[3] * this.au[4] * this.au[14] + this.au[13] * this.au[10] * this.au[4] * this.au[3] + this.au[3] * this.au[5] * this.au[8] * this.au[14] - this.au[12] * this.au[5] * this.au[3] * this.au[10] - this.au[8] * this.au[6] * this.au[3] * this.au[13] + this.au[12] * this.au[3] * this.au[6] * this.au[9];
      } catch (RuntimeException var2) {
         throw db.an(var2, "qj.ag(" + ')');
      }
   }

   public String ahj() {
      StringBuilder var1 = new StringBuilder();
      this.au(1837987795);
      this.ac((short)14141);

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

   public String toString() {
      try {
         StringBuilder var1 = new StringBuilder();
         this.au(2011587647);
         this.ac((short)18255);

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
      } catch (RuntimeException var5) {
         throw db.an(var5, "qj.toString(" + ')');
      }
   }

   public void bn(float var1) {
      this.aa(var1, var1, var1, -1044467047);
   }

   public boolean equals(Object var1) {
      try {
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
      } catch (RuntimeException var4) {
         throw db.an(var4, "qj.equals(" + ')');
      }
   }

   public void bl(qx var1) {
      float var2 = var1.aq * var1.aq;
      float var3 = var1.aq * var1.ac;
      float var4 = var1.au * var1.aq;
      float var5 = var1.aq * var1.ab;
      float var6 = var1.ac * var1.ac;
      float var7 = var1.ac * var1.au;
      float var8 = var1.ab * var1.ac;
      float var9 = var1.au * var1.au;
      float var10 = var1.ab * var1.au;
      float var11 = var1.ab * var1.ab;
      this.au[0] = var6 + var2 - var11 - var9;
      this.au[1] = var5 + var7 + var5 + var7;
      this.au[2] = var8 + (var8 - var4 - var4);
      this.au[4] = var7 + (var7 - var5 - var5);
      this.au[5] = var9 + var2 - var6 - var11;
      this.au[6] = var10 + var3 + var10 + var3;
      this.au[8] = var4 + var8 + var4 + var8;
      this.au[9] = var10 - var3 - var3 + var10;
      this.au[10] = var2 + var11 - var9 - var6;
   }

   static {
      ka.af(100, -14812643);
      ab = new qj();
   }

   public boolean gm(Object var1) {
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

   public void bu(qj var1) {
      for(int var2 = 0; var2 < this.au.length; ++var2) {
         float[] var10000 = this.au;
         var10000[var2] += var1.au[var2];
      }

   }

   public void bf(qj var1) {
      float var2 = this.au[3] * var1.au[12] + this.au[2] * var1.au[8] + var1.au[4] * this.au[1] + var1.au[0] * this.au[0];
      float var3 = var1.au[13] * this.au[3] + var1.au[1] * this.au[0] + this.au[1] * var1.au[5] + var1.au[9] * this.au[2];
      float var4 = this.au[0] * var1.au[2] + var1.au[6] * this.au[1] + this.au[2] * var1.au[10] + var1.au[14] * this.au[3];
      float var5 = this.au[2] * var1.au[11] + this.au[1] * var1.au[7] + this.au[0] * var1.au[3] + this.au[3] * var1.au[15];
      float var6 = this.au[5] * var1.au[4] + this.au[4] * var1.au[0] + var1.au[8] * this.au[6] + this.au[7] * var1.au[12];
      float var7 = var1.au[13] * this.au[7] + this.au[6] * var1.au[9] + this.au[5] * var1.au[5] + var1.au[1] * this.au[4];
      float var8 = var1.au[2] * this.au[4] + this.au[5] * var1.au[6] + var1.au[10] * this.au[6] + var1.au[14] * this.au[7];
      float var9 = this.au[6] * var1.au[11] + var1.au[3] * this.au[4] + var1.au[7] * this.au[5] + this.au[7] * var1.au[15];
      float var10 = var1.au[0] * this.au[8] + this.au[9] * var1.au[4] + var1.au[8] * this.au[10] + this.au[11] * var1.au[12];
      float var11 = var1.au[13] * this.au[11] + this.au[9] * var1.au[5] + var1.au[1] * this.au[8] + this.au[10] * var1.au[9];
      float var12 = this.au[11] * var1.au[14] + var1.au[6] * this.au[9] + var1.au[2] * this.au[8] + this.au[10] * var1.au[10];
      float var13 = var1.au[3] * this.au[8] + var1.au[7] * this.au[9] + this.au[10] * var1.au[11] + this.au[11] * var1.au[15];
      float var14 = this.au[14] * var1.au[8] + var1.au[4] * this.au[13] + this.au[12] * var1.au[0] + this.au[15] * var1.au[12];
      float var15 = this.au[12] * var1.au[1] + this.au[13] * var1.au[5] + this.au[14] * var1.au[9] + this.au[15] * var1.au[13];
      float var16 = var1.au[14] * this.au[15] + var1.au[2] * this.au[12] + this.au[13] * var1.au[6] + var1.au[10] * this.au[14];
      float var17 = var1.au[7] * this.au[13] + this.au[12] * var1.au[3] + this.au[14] * var1.au[11] + var1.au[15] * this.au[15];
      this.au[0] = var2;
      this.au[1] = var3;
      this.au[2] = var4;
      this.au[3] = var5;
      this.au[4] = var6;
      this.au[5] = var7;
      this.au[6] = var8;
      this.au[7] = var9;
      this.au[8] = var10;
      this.au[9] = var11;
      this.au[10] = var12;
      this.au[11] = var13;
      this.au[12] = var14;
      this.au[13] = var15;
      this.au[14] = var16;
      this.au[15] = var17;
   }

   public boolean gq(Object var1) {
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

   public int ahh() {
      int var1 = -581979038;
      int var2 = 1;
      var2 = var2 * -322521754 + Arrays.hashCode(this.au);
      return var2;
   }

   public int aht() {
      boolean var1 = true;
      int var2 = 1;
      var2 = var2 * 31 + Arrays.hashCode(this.au);
      return var2;
   }

   public void be() {
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

   public void ah(int var1) {
      try {
         float var2 = 1.0F / this.ag(-671681757);
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
      } catch (RuntimeException var19) {
         throw db.an(var19, "qj.ah(" + ')');
      }
   }

   public String ahp() {
      StringBuilder var1 = new StringBuilder();
      this.au(-49407121);
      this.ac((short)31447);

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

   public void bo(qj var1) {
      System.arraycopy(var1.au, 0, this.au, 0, 16);
   }

   void ad(sg var1, boolean var2) {
      if (var2) {
         qc var3 = new qc();
         var3.an(lq.af(var1.cg((byte)-46), (short)5415), -1591896398);
         var3.aw(lq.af(var1.cg((byte)-36), (short)13419), 1665202061);
         var3.ac(lq.af(var1.cg((byte)-18), (short)18660), (byte)53);
         var3.au((float)var1.cg((byte)-18), (float)var1.cg((byte)-38), (float)var1.cg((byte)-35), (byte)109);
         this.ai(var3, (byte)97);
      } else {
         for(int var4 = 0; var4 < 16; ++var4) {
            this.au[var4] = var1.cb(637467711);
         }
      }

   }

   public void am() {
      synchronized(an) {
         if (1274282021 * ac < -2095080743 * aw - 1) {
            an[(ac += 49957957) * -910698341 - 1] = this;
         }

      }
   }

   public void as() {
      synchronized(an) {
         if (-990589151 * ac < 1335461836 * aw - 1) {
            an[(ac += -414031096) * -910698341 - 1] = this;
         }

      }
   }

   void aj(sg var1, boolean var2) {
      if (var2) {
         qc var3 = new qc();
         var3.an(lq.af(var1.cg((byte)-11), (short)3378), -898796246);
         var3.aw(lq.af(var1.cg((byte)-89), (short)31869), 1665202061);
         var3.ac(lq.af(var1.cg((byte)-25), (short)14502), (byte)5);
         var3.au((float)var1.cg((byte)-6), (float)var1.cg((byte)-81), (float)var1.cg((byte)-56), (byte)110);
         this.ai(var3, (byte)41);
      } else {
         for(int var4 = 0; var4 < 16; ++var4) {
            this.au[var4] = var1.cb(1235015960);
         }
      }

   }

   void ak(sg var1, boolean var2) {
      if (var2) {
         qc var3 = new qc();
         var3.an(lq.af(var1.cg((byte)3), (short)12988), -679711519);
         var3.aw(lq.af(var1.cg((byte)-59), (short)17648), 1665202061);
         var3.ac(lq.af(var1.cg((byte)-121), (short)18429), (byte)32);
         var3.au((float)var1.cg((byte)-109), (float)var1.cg((byte)-50), (float)var1.cg((byte)-57), (byte)111);
         this.ai(var3, (byte)10);
      } else {
         for(int var4 = 0; var4 < 16; ++var4) {
            this.au[var4] = var1.cb(1809152456);
         }
      }

   }

   void az(sg var1, boolean var2) {
      if (var2) {
         qc var3 = new qc();
         var3.an(lq.af(var1.cg((byte)-86), (short)14324), -973705903);
         var3.aw(lq.af(var1.cg((byte)-118), (short)2175), 1665202061);
         var3.ac(lq.af(var1.cg((byte)-50), (short)11040), (byte)90);
         var3.au((float)var1.cg((byte)-21), (float)var1.cg((byte)-15), (float)var1.cg((byte)-76), (byte)126);
         this.ai(var3, (byte)90);
      } else {
         for(int var4 = 0; var4 < 16; ++var4) {
            this.au[var4] = var1.cb(1401049201);
         }
      }

   }

   public float[] ck() {
      float[] var1 = new float[3];
      qr var2 = new qr(this.au[0], this.au[1], this.au[2]);
      qr var3 = new qr(this.au[4], this.au[5], this.au[6]);
      qr var4 = new qr(this.au[8], this.au[9], this.au[10]);
      var1[0] = var2.af((byte)5);
      var1[1] = var3.af((byte)-100);
      var1[2] = var4.af((byte)19);
      return var1;
   }

   public void bp(qx var1) {
      float var2 = var1.aq * var1.aq;
      float var3 = var1.aq * var1.ac;
      float var4 = var1.au * var1.aq;
      float var5 = var1.aq * var1.ab;
      float var6 = var1.ac * var1.ac;
      float var7 = var1.ac * var1.au;
      float var8 = var1.ab * var1.ac;
      float var9 = var1.au * var1.au;
      float var10 = var1.ab * var1.au;
      float var11 = var1.ab * var1.ab;
      this.au[0] = var6 + var2 - var11 - var9;
      this.au[1] = var5 + var7 + var5 + var7;
      this.au[2] = var8 + (var8 - var4 - var4);
      this.au[4] = var7 + (var7 - var5 - var5);
      this.au[5] = var9 + var2 - var6 - var11;
      this.au[6] = var10 + var3 + var10 + var3;
      this.au[8] = var4 + var8 + var4 + var8;
      this.au[9] = var10 - var3 - var3 + var10;
      this.au[10] = var2 + var11 - var9 - var6;
   }

   float[] ap() {
      float[] var1 = new float[3];
      if ((double)this.au[2] < 0.999 && (double)this.au[2] > -0.999) {
         var1[1] = (float)(-Math.asin((double)this.au[2]));
         double var2 = Math.cos((double)var1[1]);
         var1[0] = (float)Math.atan2((double)this.au[6] / var2, (double)this.au[10] / var2);
         var1[2] = (float)Math.atan2((double)this.au[1] / var2, (double)this.au[0] / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2((double)this.au[2], 0.0);
         var1[2] = (float)Math.atan2((double)(-this.au[9]), (double)this.au[5]);
      }

      return var1;
   }

   static void ar(int var0) {
      aw = var0 * 1268073833;
      an = new qj[var0];
      ac = 0;
   }

   public float[] bb() {
      float[] var1 = new float[]{(float)(-Math.asin((double)this.au[6])), 0.0F, 0.0F};
      double var2 = Math.cos((double)var1[0]);
      double var4;
      double var6;
      if (Math.abs(var2) > 0.005) {
         var4 = (double)this.au[2];
         var6 = (double)this.au[10];
         double var8 = (double)this.au[4];
         double var10 = (double)this.au[5];
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         var4 = (double)this.au[1];
         var6 = (double)this.au[0];
         if (this.au[6] < 0.0F) {
            var1[1] = (float)Math.atan2(var4, var6);
         } else {
            var1[1] = (float)(-Math.atan2(var4, var6));
         }

         var1[2] = 0.0F;
      }

      return var1;
   }

   public void bi() {
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

   public int ahv() {
      boolean var1 = true;
      int var2 = 1;
      var2 = var2 * 31 + Arrays.hashCode(this.au);
      return var2;
   }

   public void bk() {
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

   public void bx(qj var1) {
      System.arraycopy(var1.au, 0, this.au, 0, 16);
   }

   public boolean gi(Object var1) {
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

   public void bz(qj var1) {
      System.arraycopy(var1.au, 0, this.au, 0, 16);
   }

   public void bm(qj var1) {
      System.arraycopy(var1.au, 0, this.au, 0, 16);
   }

   public void bd(float var1) {
      this.aa(var1, var1, var1, -773442312);
   }

   public void bt(float var1) {
      this.aa(var1, var1, var1, -929432583);
   }

   public void bj(float var1) {
      this.aa(var1, var1, var1, -2102205308);
   }

   float[] ae() {
      float[] var1 = new float[3];
      if ((double)this.au[2] < 0.999 && (double)this.au[2] > -0.999) {
         var1[1] = (float)(-Math.asin((double)this.au[2]));
         double var2 = Math.cos((double)var1[1]);
         var1[0] = (float)Math.atan2((double)this.au[6] / var2, (double)this.au[10] / var2);
         var1[2] = (float)Math.atan2((double)this.au[1] / var2, (double)this.au[0] / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2((double)this.au[2], 0.0);
         var1[2] = (float)Math.atan2((double)(-this.au[9]), (double)this.au[5]);
      }

      return var1;
   }

   public void bs(float var1, float var2, float var3) {
      this.ab((byte)-28);
      this.au[0] = var1;
      this.au[5] = var2;
      this.au[10] = var3;
   }

   public qj(sg var1, boolean var2) {
      try {
         super();
         this.au = new float[16];
         this.aw(var1, var2, (byte)39);
      } catch (RuntimeException var3) {
         throw db.an(var3, "qj.<init>(" + ')');
      }
   }

   public void aa(float var1, float var2, float var3, int var4) {
      try {
         this.ab((byte)-59);
         this.au[0] = var1;
         this.au[5] = var2;
         this.au[10] = var3;
      } catch (RuntimeException var5) {
         throw db.an(var5, "qj.aa(" + ')');
      }
   }

   public float[] av(int var1) {
      try {
         float[] var2 = new float[3];
         qr var3 = new qr(this.au[0], this.au[1], this.au[2]);
         qr var4 = new qr(this.au[4], this.au[5], this.au[6]);
         qr var5 = new qr(this.au[8], this.au[9], this.au[10]);
         var2[0] = var3.af((byte)79);
         var2[1] = var4.af((byte)-84);
         var2[2] = var5.af((byte)-12);
         return var2;
      } catch (RuntimeException var6) {
         throw db.an(var6, "qj.av(" + ')');
      }
   }

   public int hashCode() {
      try {
         boolean var1 = true;
         int var2 = 1;
         var2 = var2 * 31 + Arrays.hashCode(this.au);
         return var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "qj.hashCode(" + ')');
      }
   }

   public void bq(qj var1) {
      float var2 = this.au[3] * var1.au[12] + this.au[2] * var1.au[8] + var1.au[4] * this.au[1] + var1.au[0] * this.au[0];
      float var3 = var1.au[13] * this.au[3] + var1.au[1] * this.au[0] + this.au[1] * var1.au[5] + var1.au[9] * this.au[2];
      float var4 = this.au[0] * var1.au[2] + var1.au[6] * this.au[1] + this.au[2] * var1.au[10] + var1.au[14] * this.au[3];
      float var5 = this.au[2] * var1.au[11] + this.au[1] * var1.au[7] + this.au[0] * var1.au[3] + this.au[3] * var1.au[15];
      float var6 = this.au[5] * var1.au[4] + this.au[4] * var1.au[0] + var1.au[8] * this.au[6] + this.au[7] * var1.au[12];
      float var7 = var1.au[13] * this.au[7] + this.au[6] * var1.au[9] + this.au[5] * var1.au[5] + var1.au[1] * this.au[4];
      float var8 = var1.au[2] * this.au[4] + this.au[5] * var1.au[6] + var1.au[10] * this.au[6] + var1.au[14] * this.au[7];
      float var9 = this.au[6] * var1.au[11] + var1.au[3] * this.au[4] + var1.au[7] * this.au[5] + this.au[7] * var1.au[15];
      float var10 = var1.au[0] * this.au[8] + this.au[9] * var1.au[4] + var1.au[8] * this.au[10] + this.au[11] * var1.au[12];
      float var11 = var1.au[13] * this.au[11] + this.au[9] * var1.au[5] + var1.au[1] * this.au[8] + this.au[10] * var1.au[9];
      float var12 = this.au[11] * var1.au[14] + var1.au[6] * this.au[9] + var1.au[2] * this.au[8] + this.au[10] * var1.au[10];
      float var13 = var1.au[3] * this.au[8] + var1.au[7] * this.au[9] + this.au[10] * var1.au[11] + this.au[11] * var1.au[15];
      float var14 = this.au[14] * var1.au[8] + var1.au[4] * this.au[13] + this.au[12] * var1.au[0] + this.au[15] * var1.au[12];
      float var15 = this.au[12] * var1.au[1] + this.au[13] * var1.au[5] + this.au[14] * var1.au[9] + this.au[15] * var1.au[13];
      float var16 = var1.au[14] * this.au[15] + var1.au[2] * this.au[12] + this.au[13] * var1.au[6] + var1.au[10] * this.au[14];
      float var17 = var1.au[7] * this.au[13] + this.au[12] * var1.au[3] + this.au[14] * var1.au[11] + var1.au[15] * this.au[15];
      this.au[0] = var2;
      this.au[1] = var3;
      this.au[2] = var4;
      this.au[3] = var5;
      this.au[4] = var6;
      this.au[5] = var7;
      this.au[6] = var8;
      this.au[7] = var9;
      this.au[8] = var10;
      this.au[9] = var11;
      this.au[10] = var12;
      this.au[11] = var13;
      this.au[12] = var14;
      this.au[13] = var15;
      this.au[14] = var16;
      this.au[15] = var17;
   }

   float ce() {
      return this.au[8] * this.au[7] * this.au[2] * this.au[13] + this.au[2] * this.au[5] * this.au[11] * this.au[12] + (this.au[4] * this.au[2] * this.au[9] * this.au[15] + this.au[12] * this.au[1] * this.au[7] * this.au[10] + (this.au[8] * this.au[6] * this.au[1] * this.au[15] + this.au[14] * this.au[1] * this.au[4] * this.au[11] + (this.au[0] * this.au[7] * this.au[9] * this.au[14] + this.au[0] * this.au[6] * this.au[11] * this.au[13] + (this.au[5] * this.au[0] * this.au[10] * this.au[15] - this.au[14] * this.au[5] * this.au[0] * this.au[11] - this.au[15] * this.au[0] * this.au[6] * this.au[9]) - this.au[10] * this.au[0] * this.au[7] * this.au[13] - this.au[1] * this.au[4] * this.au[10] * this.au[15]) - this.au[12] * this.au[11] * this.au[1] * this.au[6] - this.au[14] * this.au[1] * this.au[7] * this.au[8]) - this.au[2] * this.au[4] * this.au[11] * this.au[13] - this.au[15] * this.au[2] * this.au[5] * this.au[8]) - this.au[12] * this.au[9] * this.au[2] * this.au[7] - this.au[9] * this.au[3] * this.au[4] * this.au[14] + this.au[13] * this.au[10] * this.au[4] * this.au[3] + this.au[3] * this.au[5] * this.au[8] * this.au[14] - this.au[12] * this.au[5] * this.au[3] * this.au[10] - this.au[8] * this.au[6] * this.au[3] * this.au[13] + this.au[12] * this.au[3] * this.au[6] * this.au[9];
   }

   public void bv(qx var1) {
      float var2 = var1.aq * var1.aq;
      float var3 = var1.aq * var1.ac;
      float var4 = var1.au * var1.aq;
      float var5 = var1.aq * var1.ab;
      float var6 = var1.ac * var1.ac;
      float var7 = var1.ac * var1.au;
      float var8 = var1.ab * var1.ac;
      float var9 = var1.au * var1.au;
      float var10 = var1.ab * var1.au;
      float var11 = var1.ab * var1.ab;
      this.au[0] = var6 + var2 - var11 - var9;
      this.au[1] = var5 + var7 + var5 + var7;
      this.au[2] = var8 + (var8 - var4 - var4);
      this.au[4] = var7 + (var7 - var5 - var5);
      this.au[5] = var9 + var2 - var6 - var11;
      this.au[6] = var10 + var3 + var10 + var3;
      this.au[8] = var4 + var8 + var4 + var8;
      this.au[9] = var10 - var3 - var3 + var10;
      this.au[10] = var2 + var11 - var9 - var6;
   }

   float[] by() {
      float[] var1 = new float[3];
      if ((double)this.au[2] < 0.999 && (double)this.au[2] > -0.999) {
         var1[1] = (float)(-Math.asin((double)this.au[2]));
         double var2 = Math.cos((double)var1[1]);
         var1[0] = (float)Math.atan2((double)this.au[6] / var2, (double)this.au[10] / var2);
         var1[2] = (float)Math.atan2((double)this.au[1] / var2, (double)this.au[0] / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2((double)this.au[2], 0.0);
         var1[2] = (float)Math.atan2((double)(-this.au[9]), (double)this.au[5]);
      }

      return var1;
   }

   public boolean gk(Object var1) {
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

   public void bc(qx var1) {
      float var2 = var1.aq * var1.aq;
      float var3 = var1.aq * var1.ac;
      float var4 = var1.au * var1.aq;
      float var5 = var1.aq * var1.ab;
      float var6 = var1.ac * var1.ac;
      float var7 = var1.ac * var1.au;
      float var8 = var1.ab * var1.ac;
      float var9 = var1.au * var1.au;
      float var10 = var1.ab * var1.au;
      float var11 = var1.ab * var1.ab;
      this.au[0] = var6 + var2 - var11 - var9;
      this.au[1] = var5 + var7 + var5 + var7;
      this.au[2] = var8 + (var8 - var4 - var4);
      this.au[4] = var7 + (var7 - var5 - var5);
      this.au[5] = var9 + var2 - var6 - var11;
      this.au[6] = var10 + var3 + var10 + var3;
      this.au[8] = var4 + var8 + var4 + var8;
      this.au[9] = var10 - var3 - var3 + var10;
      this.au[10] = var2 + var11 - var9 - var6;
   }

   public void bh(qx var1) {
      float var2 = var1.aq * var1.aq;
      float var3 = var1.aq * var1.ac;
      float var4 = var1.au * var1.aq;
      float var5 = var1.aq * var1.ab;
      float var6 = var1.ac * var1.ac;
      float var7 = var1.ac * var1.au;
      float var8 = var1.ab * var1.ac;
      float var9 = var1.au * var1.au;
      float var10 = var1.ab * var1.au;
      float var11 = var1.ab * var1.ab;
      this.au[0] = var6 + var2 - var11 - var9;
      this.au[1] = var5 + var7 + var5 + var7;
      this.au[2] = var8 + (var8 - var4 - var4);
      this.au[4] = var7 + (var7 - var5 - var5);
      this.au[5] = var9 + var2 - var6 - var11;
      this.au[6] = var10 + var3 + var10 + var3;
      this.au[8] = var4 + var8 + var4 + var8;
      this.au[9] = var10 - var3 - var3 + var10;
      this.au[10] = var2 + var11 - var9 - var6;
   }

   void bw(qc var1) {
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

   public void bg(float var1, float var2, float var3) {
      this.ab((byte)-107);
      this.au[0] = var1;
      this.au[5] = var2;
      this.au[10] = var3;
   }

   public void cc() {
      float var1 = 1.0F / this.ag(-1491842504);
      float var2 = var1 * (this.au[7] * this.au[9] * this.au[14] + this.au[11] * this.au[6] * this.au[13] + (this.au[5] * this.au[10] * this.au[15] - this.au[14] * this.au[5] * this.au[11] - this.au[6] * this.au[9] * this.au[15]) - this.au[13] * this.au[7] * this.au[10]);
      float var3 = (-this.au[1] * this.au[10] * this.au[15] + this.au[1] * this.au[11] * this.au[14] + this.au[15] * this.au[2] * this.au[9] - this.au[11] * this.au[2] * this.au[13] - this.au[14] * this.au[3] * this.au[9] + this.au[3] * this.au[10] * this.au[13]) * var1;
      float var4 = var1 * (this.au[7] * this.au[2] * this.au[13] + (this.au[15] * this.au[6] * this.au[1] - this.au[1] * this.au[7] * this.au[14] - this.au[15] * this.au[5] * this.au[2]) + this.au[14] * this.au[3] * this.au[5] - this.au[6] * this.au[3] * this.au[13]);
      float var5 = var1 * (this.au[9] * this.au[3] * this.au[6] + (this.au[5] * this.au[2] * this.au[11] + this.au[1] * this.au[7] * this.au[10] + this.au[11] * this.au[6] * -this.au[1] - this.au[9] * this.au[2] * this.au[7] - this.au[10] * this.au[3] * this.au[5]));
      float var6 = var1 * (this.au[12] * this.au[10] * this.au[7] + (this.au[15] * this.au[8] * this.au[6] + this.au[11] * this.au[4] * this.au[14] + this.au[15] * -this.au[4] * this.au[10] - this.au[6] * this.au[11] * this.au[12] - this.au[7] * this.au[8] * this.au[14]));
      float var7 = (this.au[12] * this.au[2] * this.au[11] + (this.au[15] * this.au[10] * this.au[0] - this.au[14] * this.au[11] * this.au[0] - this.au[8] * this.au[2] * this.au[15]) + this.au[14] * this.au[3] * this.au[8] - this.au[12] * this.au[3] * this.au[10]) * var1;
      float var8 = var1 * (this.au[12] * this.au[6] * this.au[3] + (this.au[15] * -this.au[0] * this.au[6] + this.au[14] * this.au[7] * this.au[0] + this.au[2] * this.au[4] * this.au[15] - this.au[2] * this.au[7] * this.au[12] - this.au[14] * this.au[4] * this.au[3]));
      float var9 = var1 * (this.au[4] * this.au[3] * this.au[10] + this.au[8] * this.au[7] * this.au[2] + (this.au[0] * this.au[6] * this.au[11] - this.au[10] * this.au[7] * this.au[0] - this.au[11] * this.au[2] * this.au[4]) - this.au[6] * this.au[3] * this.au[8]);
      float var10 = var1 * (this.au[13] * this.au[7] * this.au[8] + this.au[5] * this.au[11] * this.au[12] + (this.au[15] * this.au[9] * this.au[4] - this.au[4] * this.au[11] * this.au[13] - this.au[8] * this.au[5] * this.au[15]) - this.au[12] * this.au[7] * this.au[9]);
      float var11 = var1 * (this.au[9] * -this.au[0] * this.au[15] + this.au[0] * this.au[11] * this.au[13] + this.au[1] * this.au[8] * this.au[15] - this.au[1] * this.au[11] * this.au[12] - this.au[8] * this.au[3] * this.au[13] + this.au[12] * this.au[9] * this.au[3]);
      float var12 = var1 * (this.au[5] * this.au[0] * this.au[15] - this.au[13] * this.au[0] * this.au[7] - this.au[1] * this.au[4] * this.au[15] + this.au[12] * this.au[7] * this.au[1] + this.au[3] * this.au[4] * this.au[13] - this.au[3] * this.au[5] * this.au[12]);
      float var13 = (this.au[4] * this.au[1] * this.au[11] + this.au[9] * this.au[0] * this.au[7] + -this.au[0] * this.au[5] * this.au[11] - this.au[1] * this.au[7] * this.au[8] - this.au[3] * this.au[4] * this.au[9] + this.au[3] * this.au[5] * this.au[8]) * var1;
      float var14 = (this.au[12] * this.au[9] * this.au[6] + (this.au[9] * -this.au[4] * this.au[14] + this.au[4] * this.au[10] * this.au[13] + this.au[8] * this.au[5] * this.au[14] - this.au[12] * this.au[10] * this.au[5] - this.au[8] * this.au[6] * this.au[13])) * var1;
      float var15 = (this.au[12] * this.au[1] * this.au[10] + (this.au[9] * this.au[0] * this.au[14] - this.au[10] * this.au[0] * this.au[13] - this.au[14] * this.au[1] * this.au[8]) + this.au[8] * this.au[2] * this.au[13] - this.au[2] * this.au[9] * this.au[12]) * var1;
      float var16 = var1 * (this.au[14] * this.au[1] * this.au[4] + this.au[5] * -this.au[0] * this.au[14] + this.au[6] * this.au[0] * this.au[13] - this.au[12] * this.au[1] * this.au[6] - this.au[4] * this.au[2] * this.au[13] + this.au[5] * this.au[2] * this.au[12]);
      float var17 = var1 * (this.au[10] * this.au[5] * this.au[0] - this.au[9] * this.au[6] * this.au[0] - this.au[10] * this.au[1] * this.au[4] + this.au[8] * this.au[1] * this.au[6] + this.au[4] * this.au[2] * this.au[9] - this.au[8] * this.au[5] * this.au[2]);
      this.au[0] = var2;
      this.au[1] = var3;
      this.au[2] = var4;
      this.au[3] = var5;
      this.au[4] = var6;
      this.au[5] = var7;
      this.au[6] = var8;
      this.au[7] = var9;
      this.au[8] = var10;
      this.au[9] = var11;
      this.au[10] = var12;
      this.au[11] = var13;
      this.au[12] = var14;
      this.au[13] = var15;
      this.au[14] = var16;
      this.au[15] = var17;
   }

   public void cs() {
      float var1 = 1.0F / this.ag(-1628536196);
      float var2 = var1 * (this.au[7] * this.au[9] * this.au[14] + this.au[11] * this.au[6] * this.au[13] + (this.au[5] * this.au[10] * this.au[15] - this.au[14] * this.au[5] * this.au[11] - this.au[6] * this.au[9] * this.au[15]) - this.au[13] * this.au[7] * this.au[10]);
      float var3 = (-this.au[1] * this.au[10] * this.au[15] + this.au[1] * this.au[11] * this.au[14] + this.au[15] * this.au[2] * this.au[9] - this.au[11] * this.au[2] * this.au[13] - this.au[14] * this.au[3] * this.au[9] + this.au[3] * this.au[10] * this.au[13]) * var1;
      float var4 = var1 * (this.au[7] * this.au[2] * this.au[13] + (this.au[15] * this.au[6] * this.au[1] - this.au[1] * this.au[7] * this.au[14] - this.au[15] * this.au[5] * this.au[2]) + this.au[14] * this.au[3] * this.au[5] - this.au[6] * this.au[3] * this.au[13]);
      float var5 = var1 * (this.au[9] * this.au[3] * this.au[6] + (this.au[5] * this.au[2] * this.au[11] + this.au[1] * this.au[7] * this.au[10] + this.au[11] * this.au[6] * -this.au[1] - this.au[9] * this.au[2] * this.au[7] - this.au[10] * this.au[3] * this.au[5]));
      float var6 = var1 * (this.au[12] * this.au[10] * this.au[7] + (this.au[15] * this.au[8] * this.au[6] + this.au[11] * this.au[4] * this.au[14] + this.au[15] * -this.au[4] * this.au[10] - this.au[6] * this.au[11] * this.au[12] - this.au[7] * this.au[8] * this.au[14]));
      float var7 = (this.au[12] * this.au[2] * this.au[11] + (this.au[15] * this.au[10] * this.au[0] - this.au[14] * this.au[11] * this.au[0] - this.au[8] * this.au[2] * this.au[15]) + this.au[14] * this.au[3] * this.au[8] - this.au[12] * this.au[3] * this.au[10]) * var1;
      float var8 = var1 * (this.au[12] * this.au[6] * this.au[3] + (this.au[15] * -this.au[0] * this.au[6] + this.au[14] * this.au[7] * this.au[0] + this.au[2] * this.au[4] * this.au[15] - this.au[2] * this.au[7] * this.au[12] - this.au[14] * this.au[4] * this.au[3]));
      float var9 = var1 * (this.au[4] * this.au[3] * this.au[10] + this.au[8] * this.au[7] * this.au[2] + (this.au[0] * this.au[6] * this.au[11] - this.au[10] * this.au[7] * this.au[0] - this.au[11] * this.au[2] * this.au[4]) - this.au[6] * this.au[3] * this.au[8]);
      float var10 = var1 * (this.au[13] * this.au[7] * this.au[8] + this.au[5] * this.au[11] * this.au[12] + (this.au[15] * this.au[9] * this.au[4] - this.au[4] * this.au[11] * this.au[13] - this.au[8] * this.au[5] * this.au[15]) - this.au[12] * this.au[7] * this.au[9]);
      float var11 = var1 * (this.au[9] * -this.au[0] * this.au[15] + this.au[0] * this.au[11] * this.au[13] + this.au[1] * this.au[8] * this.au[15] - this.au[1] * this.au[11] * this.au[12] - this.au[8] * this.au[3] * this.au[13] + this.au[12] * this.au[9] * this.au[3]);
      float var12 = var1 * (this.au[5] * this.au[0] * this.au[15] - this.au[13] * this.au[0] * this.au[7] - this.au[1] * this.au[4] * this.au[15] + this.au[12] * this.au[7] * this.au[1] + this.au[3] * this.au[4] * this.au[13] - this.au[3] * this.au[5] * this.au[12]);
      float var13 = (this.au[4] * this.au[1] * this.au[11] + this.au[9] * this.au[0] * this.au[7] + -this.au[0] * this.au[5] * this.au[11] - this.au[1] * this.au[7] * this.au[8] - this.au[3] * this.au[4] * this.au[9] + this.au[3] * this.au[5] * this.au[8]) * var1;
      float var14 = (this.au[12] * this.au[9] * this.au[6] + (this.au[9] * -this.au[4] * this.au[14] + this.au[4] * this.au[10] * this.au[13] + this.au[8] * this.au[5] * this.au[14] - this.au[12] * this.au[10] * this.au[5] - this.au[8] * this.au[6] * this.au[13])) * var1;
      float var15 = (this.au[12] * this.au[1] * this.au[10] + (this.au[9] * this.au[0] * this.au[14] - this.au[10] * this.au[0] * this.au[13] - this.au[14] * this.au[1] * this.au[8]) + this.au[8] * this.au[2] * this.au[13] - this.au[2] * this.au[9] * this.au[12]) * var1;
      float var16 = var1 * (this.au[14] * this.au[1] * this.au[4] + this.au[5] * -this.au[0] * this.au[14] + this.au[6] * this.au[0] * this.au[13] - this.au[12] * this.au[1] * this.au[6] - this.au[4] * this.au[2] * this.au[13] + this.au[5] * this.au[2] * this.au[12]);
      float var17 = var1 * (this.au[10] * this.au[5] * this.au[0] - this.au[9] * this.au[6] * this.au[0] - this.au[10] * this.au[1] * this.au[4] + this.au[8] * this.au[1] * this.au[6] + this.au[4] * this.au[2] * this.au[9] - this.au[8] * this.au[5] * this.au[2]);
      this.au[0] = var2;
      this.au[1] = var3;
      this.au[2] = var4;
      this.au[3] = var5;
      this.au[4] = var6;
      this.au[5] = var7;
      this.au[6] = var8;
      this.au[7] = var9;
      this.au[8] = var10;
      this.au[9] = var11;
      this.au[10] = var12;
      this.au[11] = var13;
      this.au[12] = var14;
      this.au[13] = var15;
      this.au[14] = var16;
      this.au[15] = var17;
   }

   public String ahm() {
      StringBuilder var1 = new StringBuilder();
      this.au(1466353408);
      this.ac((short)15282);

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

   public void br(float var1, float var2, float var3) {
      this.ab((byte)-52);
      this.au[0] = var1;
      this.au[5] = var2;
      this.au[10] = var3;
   }

   public float[] ca() {
      float[] var1 = new float[3];
      qr var2 = new qr(this.au[0], this.au[1], this.au[2]);
      qr var3 = new qr(this.au[4], this.au[5], this.au[6]);
      qr var4 = new qr(this.au[8], this.au[9], this.au[10]);
      var1[0] = var2.af((byte)-20);
      var1[1] = var3.af((byte)51);
      var1[2] = var4.af((byte)4);
      return var1;
   }

   public float[] cu() {
      float[] var1 = new float[3];
      qr var2 = new qr(this.au[0], this.au[1], this.au[2]);
      qr var3 = new qr(this.au[4], this.au[5], this.au[6]);
      qr var4 = new qr(this.au[8], this.au[9], this.au[10]);
      var1[0] = var2.af((byte)59);
      var1[1] = var3.af((byte)-20);
      var1[2] = var4.af((byte)-45);
      return var1;
   }

   public void cn() {
      float var1 = 1.0F / this.ag(-611957643);
      float var2 = var1 * (this.au[7] * this.au[9] * this.au[14] + this.au[11] * this.au[6] * this.au[13] + (this.au[5] * this.au[10] * this.au[15] - this.au[14] * this.au[5] * this.au[11] - this.au[6] * this.au[9] * this.au[15]) - this.au[13] * this.au[7] * this.au[10]);
      float var3 = (-this.au[1] * this.au[10] * this.au[15] + this.au[1] * this.au[11] * this.au[14] + this.au[15] * this.au[2] * this.au[9] - this.au[11] * this.au[2] * this.au[13] - this.au[14] * this.au[3] * this.au[9] + this.au[3] * this.au[10] * this.au[13]) * var1;
      float var4 = var1 * (this.au[7] * this.au[2] * this.au[13] + (this.au[15] * this.au[6] * this.au[1] - this.au[1] * this.au[7] * this.au[14] - this.au[15] * this.au[5] * this.au[2]) + this.au[14] * this.au[3] * this.au[5] - this.au[6] * this.au[3] * this.au[13]);
      float var5 = var1 * (this.au[9] * this.au[3] * this.au[6] + (this.au[5] * this.au[2] * this.au[11] + this.au[1] * this.au[7] * this.au[10] + this.au[11] * this.au[6] * -this.au[1] - this.au[9] * this.au[2] * this.au[7] - this.au[10] * this.au[3] * this.au[5]));
      float var6 = var1 * (this.au[12] * this.au[10] * this.au[7] + (this.au[15] * this.au[8] * this.au[6] + this.au[11] * this.au[4] * this.au[14] + this.au[15] * -this.au[4] * this.au[10] - this.au[6] * this.au[11] * this.au[12] - this.au[7] * this.au[8] * this.au[14]));
      float var7 = (this.au[12] * this.au[2] * this.au[11] + (this.au[15] * this.au[10] * this.au[0] - this.au[14] * this.au[11] * this.au[0] - this.au[8] * this.au[2] * this.au[15]) + this.au[14] * this.au[3] * this.au[8] - this.au[12] * this.au[3] * this.au[10]) * var1;
      float var8 = var1 * (this.au[12] * this.au[6] * this.au[3] + (this.au[15] * -this.au[0] * this.au[6] + this.au[14] * this.au[7] * this.au[0] + this.au[2] * this.au[4] * this.au[15] - this.au[2] * this.au[7] * this.au[12] - this.au[14] * this.au[4] * this.au[3]));
      float var9 = var1 * (this.au[4] * this.au[3] * this.au[10] + this.au[8] * this.au[7] * this.au[2] + (this.au[0] * this.au[6] * this.au[11] - this.au[10] * this.au[7] * this.au[0] - this.au[11] * this.au[2] * this.au[4]) - this.au[6] * this.au[3] * this.au[8]);
      float var10 = var1 * (this.au[13] * this.au[7] * this.au[8] + this.au[5] * this.au[11] * this.au[12] + (this.au[15] * this.au[9] * this.au[4] - this.au[4] * this.au[11] * this.au[13] - this.au[8] * this.au[5] * this.au[15]) - this.au[12] * this.au[7] * this.au[9]);
      float var11 = var1 * (this.au[9] * -this.au[0] * this.au[15] + this.au[0] * this.au[11] * this.au[13] + this.au[1] * this.au[8] * this.au[15] - this.au[1] * this.au[11] * this.au[12] - this.au[8] * this.au[3] * this.au[13] + this.au[12] * this.au[9] * this.au[3]);
      float var12 = var1 * (this.au[5] * this.au[0] * this.au[15] - this.au[13] * this.au[0] * this.au[7] - this.au[1] * this.au[4] * this.au[15] + this.au[12] * this.au[7] * this.au[1] + this.au[3] * this.au[4] * this.au[13] - this.au[3] * this.au[5] * this.au[12]);
      float var13 = (this.au[4] * this.au[1] * this.au[11] + this.au[9] * this.au[0] * this.au[7] + -this.au[0] * this.au[5] * this.au[11] - this.au[1] * this.au[7] * this.au[8] - this.au[3] * this.au[4] * this.au[9] + this.au[3] * this.au[5] * this.au[8]) * var1;
      float var14 = (this.au[12] * this.au[9] * this.au[6] + (this.au[9] * -this.au[4] * this.au[14] + this.au[4] * this.au[10] * this.au[13] + this.au[8] * this.au[5] * this.au[14] - this.au[12] * this.au[10] * this.au[5] - this.au[8] * this.au[6] * this.au[13])) * var1;
      float var15 = (this.au[12] * this.au[1] * this.au[10] + (this.au[9] * this.au[0] * this.au[14] - this.au[10] * this.au[0] * this.au[13] - this.au[14] * this.au[1] * this.au[8]) + this.au[8] * this.au[2] * this.au[13] - this.au[2] * this.au[9] * this.au[12]) * var1;
      float var16 = var1 * (this.au[14] * this.au[1] * this.au[4] + this.au[5] * -this.au[0] * this.au[14] + this.au[6] * this.au[0] * this.au[13] - this.au[12] * this.au[1] * this.au[6] - this.au[4] * this.au[2] * this.au[13] + this.au[5] * this.au[2] * this.au[12]);
      float var17 = var1 * (this.au[10] * this.au[5] * this.au[0] - this.au[9] * this.au[6] * this.au[0] - this.au[10] * this.au[1] * this.au[4] + this.au[8] * this.au[1] * this.au[6] + this.au[4] * this.au[2] * this.au[9] - this.au[8] * this.au[5] * this.au[2]);
      this.au[0] = var2;
      this.au[1] = var3;
      this.au[2] = var4;
      this.au[3] = var5;
      this.au[4] = var6;
      this.au[5] = var7;
      this.au[6] = var8;
      this.au[7] = var9;
      this.au[8] = var10;
      this.au[9] = var11;
      this.au[10] = var12;
      this.au[11] = var13;
      this.au[12] = var14;
      this.au[13] = var15;
      this.au[14] = var16;
      this.au[15] = var17;
   }

   public float[] cq() {
      float[] var1 = new float[3];
      qr var2 = new qr(this.au[0], this.au[1], this.au[2]);
      qr var3 = new qr(this.au[4], this.au[5], this.au[6]);
      qr var4 = new qr(this.au[8], this.au[9], this.au[10]);
      var1[0] = var2.af((byte)-36);
      var1[1] = var3.af((byte)-17);
      var1[2] = var4.af((byte)30);
      return var1;
   }

   static final int ig(int var0, int var1) {
      try {
         if (Math.abs(var0 - -1010818347 * ek.kh) > 1024) {
            if (var1 <= -2081112459) {
               throw new IllegalStateException();
            } else {
               byte var10000;
               if (var0 < -1010818347 * ek.kh) {
                  if (var1 <= -2081112459) {
                     throw new IllegalStateException();
                  }

                  var10000 = 1;
               } else {
                  var10000 = -1;
               }

               return var10000 * 2048 + var0;
            }
         } else {
            return var0;
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "qj.ig(" + ')');
      }
   }

   static fl[] au(int var0) {
      try {
         return new fl[]{fl.af, fl.an, fl.aw, fl.ac, fl.au, fl.ab, fl.aq, fl.al, fl.at};
      } catch (RuntimeException var1) {
         throw db.an(var1, "qj.au(" + ')');
      }
   }

   static final void kn(byte var0) {
      try {
         boolean var1 = false;

         while(!var1) {
            if (var0 != 32) {
               throw new IllegalStateException();
            }

            var1 = true;

            for(int var2 = 0; var2 < 730065501 * client.ne - 1; ++var2) {
               if (client.nh[var2] < 1000 && client.nh[var2 + 1] > 1000) {
                  if (var0 != 32) {
                     throw new IllegalStateException();
                  }

                  String var3 = client.ok[var2];
                  client.ok[var2] = client.ok[1 + var2];
                  client.ok[var2 + 1] = var3;
                  String var4 = client.og[var2];
                  client.og[var2] = client.og[1 + var2];
                  client.og[var2 + 1] = var4;
                  int var5 = client.nh[var2];
                  client.nh[var2] = client.nh[var2 + 1];
                  client.nh[var2 + 1] = var5;
                  var5 = client.nk[var2];
                  client.nk[var2] = client.nk[1 + var2];
                  client.nk[1 + var2] = var5;
                  var5 = client.ni[var2];
                  client.ni[var2] = client.ni[var2 + 1];
                  client.ni[1 + var2] = var5;
                  var5 = client.nq[var2];
                  client.nq[var2] = client.nq[1 + var2];
                  client.nq[var2 + 1] = var5;
                  var5 = client.oi[var2];
                  client.oi[var2] = client.oi[1 + var2];
                  client.oi[1 + var2] = var5;
                  boolean var6 = client.ox[var2];
                  client.ox[var2] = client.ox[1 + var2];
                  client.ox[1 + var2] = var6;
                  var1 = false;
               }
            }
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "qj.kn(" + ')');
      }
   }
}
