public abstract class ii extends th {
   public static final int bl = 73;
   boolean an;
   static final int au = 14;
   int[] aq;
   jg al;
   boolean af;
   static final int ah = 10;

   abstract void bx(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   void af(int[] var1, int var2, int var3, float[] var4, int var5) {
      try {
         ea(var1, var2, var3, var4);
      } catch (RuntimeException var6) {
         throw db.an(var6, "ii.af(" + ')');
      }
   }

   void ac(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16, byte var17) {
      try {
         var10 = ge.an(var10, var13, var14, var15, var16, (byte)-65);
         var11 = ge.an(var11, var13, var14, var15, var16, (byte)-50);
         var12 = ge.an(var12, var13, var14, var15, var16, (byte)-50);
         this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
      } catch (RuntimeException var18) {
         throw db.an(var18, "ii.ac(" + ')');
      }
   }

   abstract void at(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   abstract void ab(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

   abstract void aq(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

   abstract void bd(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   static int ai(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & -510514709;
      int var8 = var4 & 255;
      if (-1 != var1) {
         var5 += var8 * (var1 - var5) >> 7;
      }

      if (-1 != var2) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += var8 * (var3 - var7) >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & '\uffff';
   }

   void aa(int[] var1, int var2, int var3, float[] var4) {
      ea(var1, var2, var3, var4);
   }

   void ay(int[] var1, int var2, int var3, float[] var4) {
      ea(var1, var2, var3, var4);
   }

   void ao(int[] var1, int var2, int var3, float[] var4) {
      ea(var1, var2, var3, var4);
   }

   static int ax(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (-1 != var1) {
         var5 += var8 * (var1 - var5) >> 7;
      }

      if (-1 != var2) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += var8 * (var3 - var7) >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & '\uffff';
   }

   void ae(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
      int var15 = ge.an(var10, var11, var12, var13, var14, (byte)-123);
      var10 = this.aq[var15];
      this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public static int br(byte[] var0, int var1, byte var2) {
      try {
         return ha.bs(var0, 0, var1, 645656657);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ii.br(" + ')');
      }
   }

   static final int ah(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 1673541148) + var1;
   }

   static final int av(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   void ar(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
      var10 = ge.an(var10, var13, var14, var15, var16, (byte)-103);
      var11 = ge.an(var11, var13, var14, var15, var16, (byte)-15);
      var12 = ge.an(var12, var13, var14, var15, var16, (byte)-53);
      this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   static void cs(int var0, lb var1, boolean var2, byte var3) {
      try {
         js var4 = dz.gb(1347059277).be(var0, -1113732625);
         int var5 = -1900490645 * lq.mi.ad;
         int var6 = (lq.mi.bx * 1144428983 >> 7) + -1232093375 * jm.ib;
         int var7 = jj.jc * 827352769 + (-411750205 * lq.mi.bo >> 7);
         lb var8 = new lb(var5, var6, var7);
         dz.gb(-1080694136).ar(var4, var8, var1, var2, 2112134948);
      } catch (RuntimeException var9) {
         throw db.an(var9, "ii.cs(" + ')');
      }
   }

   void as(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
      var10 = ge.an(var10, var13, var14, var15, var16, (byte)-104);
      var11 = ge.an(var11, var13, var14, var15, var16, (byte)-114);
      var12 = ge.an(var12, var13, var14, var15, var16, (byte)-77);
      this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   void aj(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
      var10 = ge.an(var10, var13, var14, var15, var16, (byte)-83);
      var11 = ge.an(var11, var13, var14, var15, var16, (byte)-125);
      var12 = ge.an(var12, var13, var14, var15, var16, (byte)-22);
      this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   void ak(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
      int var15 = ge.an(var10, var11, var12, var13, var14, (byte)-78);
      var10 = this.aq[var15];
      this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   void az(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
      int var15 = ge.an(var10, var11, var12, var13, var14, (byte)-9);
      var10 = this.aq[var15];
      this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   void ad(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
      int var15 = ge.an(var10, var11, var12, var13, var14, (byte)-126);
      var10 = this.aq[var15];
      this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   abstract void bi(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

   abstract void ap(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

   abstract void by(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

   abstract void bb(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

   abstract void bk(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

   abstract void be(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

   abstract void al(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   abstract void bt(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   abstract void bo(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   abstract void bz(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   abstract void bm(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   void am(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
      var10 = ge.an(var10, var13, var14, var15, var16, (byte)-4);
      var11 = ge.an(var11, var13, var14, var15, var16, (byte)-93);
      var12 = ge.an(var12, var13, var14, var15, var16, (byte)-60);
      this.ab(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   static final int ag(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   void au(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14, int var15) {
      try {
         int var16 = ge.an(var10, var11, var12, var13, var14, (byte)-39);
         var10 = this.aq[var16];
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      } catch (RuntimeException var17) {
         throw db.an(var17, "ii.au(" + ')');
      }
   }

   public static void ac(int var0, int var1) {
      try {
         if (926096579 * ly.au != 0) {
            if (var1 >= -1012890131) {
               throw new IllegalStateException();
            }

            dn.at = var0 * 111967803;
         } else {
            sa.ac.af(var0, (byte)19);
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "ii.ac(" + ')');
      }
   }

   static void aj(byte var0) {
      try {
         ee.ak(24, (byte)82);
         he.ax(mk.jr, mk.jv, mk.jh, 24926455);
      } catch (RuntimeException var1) {
         throw db.an(var1, "ii.aj(" + ')');
      }
   }

   ii(jg var1) {
      try {
         super();
         this.af = false;
         this.an = false;
         this.aq = in.af;
         this.al = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ii.<init>(" + ')');
      }
   }
}
