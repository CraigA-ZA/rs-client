public class ew {
   boolean aa;
   float[][] ax;
   float[][] aw;
   final qj[] ac;
   qj[] au;
   qj[] ab;
   public ew an;
   boolean al;
   qj at;
   public final int af;
   qj ay;
   float[][] ao;
   float[][] ai;
   qj aq;
   public static final int ak = 20;

   void ao() {
      this.ao = new float[this.ac.length][3];
      this.ax = new float[this.ac.length][3];
      this.ai = new float[this.ac.length][3];
      qj var1;
      synchronized(qj.an) {
         if (0 == qj.ac * -910698341) {
            var1 = new qj();
         } else {
            qj.an[(qj.ac -= -564638317) * -910698341].ab((byte)-66);
            var1 = qj.an[qj.ac * -910698341];
         }
      }

      qj var2 = var1;

      for(int var3 = 0; var3 < this.ac.length; ++var3) {
         qj var4 = this.an(var3, (byte)0);
         var2.al(var4, 1825752856);
         var2.ah(-49766360);
         this.ao[var3] = var2.au(728080494);
         this.ax[var3][0] = var4.au[12];
         this.ax[var3][1] = var4.au[13];
         this.ax[var3][2] = var4.au[14];
         this.ai[var3] = var4.av(-885110135);
      }

      var2.an(1198141071);
   }

   void af(int var1) {
      try {
         this.ao = new float[this.ac.length][3];
         this.ax = new float[this.ac.length][3];
         this.ai = new float[this.ac.length][3];
         qj var2;
         synchronized(qj.an) {
            if (0 == qj.ac * -910698341) {
               var2 = new qj();
            } else {
               qj.an[(qj.ac -= -564638317) * -910698341].ab((byte)-120);
               var2 = qj.an[qj.ac * -910698341];
            }
         }

         qj var3 = var2;

         for(int var4 = 0; var4 < this.ac.length; ++var4) {
            if (var1 != 685443179) {
               throw new IllegalStateException();
            }

            qj var5 = this.an(var4, (byte)0);
            var3.al(var5, 1919850341);
            var3.ah(-49766360);
            this.ao[var4] = var3.au(-869294518);
            this.ax[var4][0] = var5.au[12];
            this.ax[var4][1] = var5.au[13];
            this.ax[var4][2] = var5.au[14];
            this.ai[var4] = var5.av(-1193193638);
         }

         var3.an(1198141071);
      } catch (RuntimeException var7) {
         throw db.an(var7, "ew.af(" + ')');
      }
   }

   qj an(int var1, byte var2) {
      try {
         return this.ac[var1];
      } catch (RuntimeException var3) {
         throw db.an(var3, "ew.an(" + ')');
      }
   }

   qj aw(int var1, byte var2) {
      try {
         if (this.au[var1] == null) {
            this.au[var1] = new qj(this.an(var1, (byte)0));
            if (this.an != null) {
               if (var2 != 8) {
                  throw new IllegalStateException();
               }

               this.au[var1].ao(this.an.aw(var1, (byte)8), 1396004011);
            } else {
               this.au[var1].ao(qj.ab, 1996237100);
            }
         }

         return this.au[var1];
      } catch (RuntimeException var3) {
         throw db.an(var3, "ew.aw(" + ')');
      }
   }

   public qj bd(int var1) {
      if (this.aa) {
         this.ay.al(this.ac(var1, 1211179459), 1624520625);
         this.ay.ao(this.aq((byte)2), 1167589682);
         this.aa = false;
      }

      return this.ay;
   }

   public qj al(int var1, int var2) {
      try {
         if (this.aa) {
            this.ay.al(this.ac(var1, 2116559151), 1829163387);
            this.ay.ao(this.aq((byte)2), 1290444179);
            this.aa = false;
         }

         return this.ay;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ew.al(" + ')');
      }
   }

   qj ab(int var1) {
      try {
         return this.aq;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ew.ab(" + ')');
      }
   }

   qj bx() {
      return this.aq;
   }

   float[] br(int var1) {
      return this.ao[var1];
   }

   public ew(int var1, sg var2, boolean var3) {
      try {
         super();
         this.aq = new qj();
         this.al = true;
         this.at = new qj();
         this.aa = true;
         this.ay = new qj();
         this.af = var2.cg((byte)-75) * -1987716595;
         this.ac = new qj[var1];
         this.au = new qj[this.ac.length];
         this.ab = new qj[this.ac.length];
         this.aw = new float[this.ac.length][3];

         for(int var4 = 0; var4 < this.ac.length; ++var4) {
            this.ac[var4] = new qj(var2, var3);
            this.aw[var4][0] = var2.cb(1017864129);
            this.aw[var4][1] = var2.cb(466314277);
            this.aw[var4][2] = var2.cb(2007960527);
         }

         this.af(685443179);
      } catch (RuntimeException var5) {
         throw db.an(var5, "ew.<init>(" + ')');
      }
   }

   float[] aa(int var1, int var2) {
      try {
         return this.ax[var1];
      } catch (RuntimeException var3) {
         throw db.an(var3, "ew.aa(" + ')');
      }
   }

   float[] ay(int var1, int var2) {
      try {
         return this.ai[var1];
      } catch (RuntimeException var3) {
         throw db.an(var3, "ew.ay(" + ')');
      }
   }

   qj bz() {
      if (this.al) {
         this.at.al(this.ab(376832033), 1553920437);
         if (this.an != null) {
            this.at.ao(this.an.aq((byte)2), 2136013565);
         }

         this.al = false;
      }

      return this.at;
   }

   void ax() {
      this.ao = new float[this.ac.length][3];
      this.ax = new float[this.ac.length][3];
      this.ai = new float[this.ac.length][3];
      qj var1;
      synchronized(qj.an) {
         if (0 == qj.ac * -910698341) {
            var1 = new qj();
         } else {
            qj.an[(qj.ac -= -564638317) * -910698341].ab((byte)-83);
            var1 = qj.an[qj.ac * -910698341];
         }
      }

      qj var2 = var1;

      for(int var3 = 0; var3 < this.ac.length; ++var3) {
         qj var4 = this.an(var3, (byte)0);
         var2.al(var4, 1809915307);
         var2.ah(-49766360);
         this.ao[var3] = var2.au(1796143368);
         this.ax[var3][0] = var4.au[12];
         this.ax[var3][1] = var4.au[13];
         this.ax[var3][2] = var4.au[14];
         this.ai[var3] = var4.av(-2009710332);
      }

      var2.an(1198141071);
   }

   float[] bv(int var1) {
      return this.ai[var1];
   }

   void ag() {
      this.ao = new float[this.ac.length][3];
      this.ax = new float[this.ac.length][3];
      this.ai = new float[this.ac.length][3];
      qj var1;
      synchronized(qj.an) {
         if (0 == qj.ac * -910698341) {
            var1 = new qj();
         } else {
            qj.an[(qj.ac -= 718430632) * -910698341].ab((byte)-123);
            var1 = qj.an[qj.ac * -910698341];
         }
      }

      qj var2 = var1;

      for(int var3 = 0; var3 < this.ac.length; ++var3) {
         qj var4 = this.an(var3, (byte)0);
         var2.al(var4, 1668521832);
         var2.ah(-49766360);
         this.ao[var3] = var2.au(-408909175);
         this.ax[var3][0] = var4.au[12];
         this.ax[var3][1] = var4.au[13];
         this.ax[var3][2] = var4.au[14];
         this.ai[var3] = var4.av(-1089038767);
      }

      var2.an(1198141071);
   }

   qj ac(int var1, int var2) {
      try {
         if (this.ab[var1] == null) {
            if (var2 <= -258593861) {
               throw new IllegalStateException();
            }

            this.ab[var1] = new qj(this.aw(var1, (byte)8));
            this.ab[var1].ah(-49766360);
         }

         return this.ab[var1];
      } catch (RuntimeException var3) {
         throw db.an(var3, "ew.ac(" + ')');
      }
   }

   qj av(int var1) {
      return this.ac[var1];
   }

   void au(qj var1, int var2) {
      try {
         this.aq.al(var1, 2092815731);
         this.al = true;
         this.aa = true;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ew.au(" + ')');
      }
   }

   qj am(int var1) {
      return this.ac[var1];
   }

   qj as(int var1) {
      if (this.au[var1] == null) {
         this.au[var1] = new qj(this.an(var1, (byte)0));
         if (this.an != null) {
            this.au[var1].ao(this.an.aw(var1, (byte)8), 1435322956);
         } else {
            this.au[var1].ao(qj.ab, 1699202608);
         }
      }

      return this.au[var1];
   }

   qj aj(int var1) {
      if (this.au[var1] == null) {
         this.au[var1] = new qj(this.an(var1, (byte)0));
         if (this.an != null) {
            this.au[var1].ao(this.an.aw(var1, (byte)8), 1783861666);
         } else {
            this.au[var1].ao(qj.ab, 1450220242);
         }
      }

      return this.au[var1];
   }

   qj ak(int var1) {
      if (this.au[var1] == null) {
         this.au[var1] = new qj(this.an(var1, (byte)0));
         if (this.an != null) {
            this.au[var1].ao(this.an.aw(var1, (byte)8), 1579602661);
         } else {
            this.au[var1].ao(qj.ab, 1184866870);
         }
      }

      return this.au[var1];
   }

   qj az(int var1) {
      if (this.au[var1] == null) {
         this.au[var1] = new qj(this.an(var1, (byte)0));
         if (this.an != null) {
            this.au[var1].ao(this.an.aw(var1, (byte)8), 1162664282);
         } else {
            this.au[var1].ao(qj.ab, 1558668685);
         }
      }

      return this.au[var1];
   }

   float[] at(int var1, int var2) {
      try {
         return this.ao[var1];
      } catch (RuntimeException var3) {
         throw db.an(var3, "ew.at(" + ')');
      }
   }

   float[] bs(int var1) {
      return this.ao[var1];
   }

   qj ap(int var1) {
      if (this.ab[var1] == null) {
         this.ab[var1] = new qj(this.aw(var1, (byte)8));
         this.ab[var1].ah(-49766360);
      }

      return this.ab[var1];
   }

   qj ah(int var1) {
      return this.ac[var1];
   }

   qj aq(byte var1) {
      try {
         if (this.al) {
            if (var1 != 2) {
               throw new IllegalStateException();
            }

            this.at.al(this.ab(535482001), 1842204492);
            if (this.an != null) {
               if (var1 != 2) {
                  throw new IllegalStateException();
               }

               this.at.ao(this.an.aq((byte)2), 1947079637);
            }

            this.al = false;
         }

         return this.at;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ew.aq(" + ')');
      }
   }

   void bi(qj var1) {
      this.aq.al(var1, 2123749342);
      this.al = true;
      this.aa = true;
   }

   qj be() {
      return this.aq;
   }

   float[] bp(int var1) {
      return this.ai[var1];
   }

   qj bk() {
      return this.aq;
   }

   qj bo() {
      return this.aq;
   }

   qj by(int var1) {
      if (this.ab[var1] == null) {
         this.ab[var1] = new qj(this.aw(var1, (byte)8));
         this.ab[var1].ah(-49766360);
      }

      return this.ab[var1];
   }

   qj bm() {
      if (this.al) {
         this.at.al(this.ab(1097734684), 1679034636);
         if (this.an != null) {
            this.at.ao(this.an.aq((byte)2), 1657217110);
         }

         this.al = false;
      }

      return this.at;
   }

   void ai() {
      this.ao = new float[this.ac.length][3];
      this.ax = new float[this.ac.length][3];
      this.ai = new float[this.ac.length][3];
      qj var1;
      synchronized(qj.an) {
         if (0 == qj.ac * -910698341) {
            var1 = new qj();
         } else {
            qj.an[(qj.ac -= -564638317) * -910698341].ab((byte)-55);
            var1 = qj.an[qj.ac * -910698341];
         }
      }

      qj var2 = var1;

      for(int var3 = 0; var3 < this.ac.length; ++var3) {
         qj var4 = this.an(var3, (byte)0);
         var2.al(var4, 1944105306);
         var2.ah(-49766360);
         this.ao[var3] = var2.au(983485416);
         this.ax[var3][0] = var4.au[12];
         this.ax[var3][1] = var4.au[13];
         this.ax[var3][2] = var4.au[14];
         this.ai[var3] = var4.av(-1876607413);
      }

      var2.an(1198141071);
   }

   public qj bt(int var1) {
      if (this.aa) {
         this.ay.al(this.ac(var1, 1029473925), 1864482861);
         this.ay.ao(this.aq((byte)2), 2030669590);
         this.aa = false;
      }

      return this.ay;
   }

   public qj bj(int var1) {
      if (this.aa) {
         this.ay.al(this.ac(var1, 2064857698), 1792772787);
         this.ay.ao(this.aq((byte)2), 1813412779);
         this.aa = false;
      }

      return this.ay;
   }

   float[] bn(int var1) {
      return this.ao[var1];
   }

   void bb(qj var1) {
      this.aq.al(var1, 2089708608);
      this.al = true;
      this.aa = true;
   }

   float[] bf(int var1) {
      return this.ax[var1];
   }

   float[] bg(int var1) {
      return this.ao[var1];
   }

   float[] bu(int var1) {
      return this.ax[var1];
   }

   qj ar(int var1) {
      return this.ac[var1];
   }

   float[] bq(int var1) {
      return this.ax[var1];
   }

   float[] ba(int var1) {
      return this.ai[var1];
   }

   float[] bc(int var1) {
      return this.ai[var1];
   }

   float[] bl(int var1) {
      return this.ai[var1];
   }

   qj ad(int var1) {
      if (this.ab[var1] == null) {
         this.ab[var1] = new qj(this.aw(var1, (byte)8));
         this.ab[var1].ah(-49766360);
      }

      return this.ab[var1];
   }

   qj ae(int var1) {
      if (this.ab[var1] == null) {
         this.ab[var1] = new qj(this.aw(var1, (byte)8));
         this.ab[var1].ah(-49766360);
      }

      return this.ab[var1];
   }

   static final void aw(int var0, int var1, int var2, int var3, int var4) {
      try {
         for(int var5 = var1; var5 <= var1 + var3; ++var5) {
            if (var4 == 2045439667) {
               throw new IllegalStateException();
            }

            for(int var6 = var0; var6 <= var2 + var0; ++var6) {
               if (var4 == 2045439667) {
                  throw new IllegalStateException();
               }

               if (var6 >= 0 && var6 < 104) {
                  if (var4 == 2045439667) {
                     throw new IllegalStateException();
                  }

                  if (var5 >= 0 && var5 < 104) {
                     cd.al[0][var6][var5] = 127;
                     if (var6 == var0) {
                        if (var4 == 2045439667) {
                           throw new IllegalStateException();
                        }

                        if (var6 > 0) {
                           if (var4 == 2045439667) {
                              return;
                           }

                           cd.af[0][var6][var5] = cd.af[0][var6 - 1][var5];
                        }
                     }

                     if (var0 + var2 == var6) {
                        if (var4 == 2045439667) {
                           throw new IllegalStateException();
                        }

                        if (var6 < 103) {
                           if (var4 == 2045439667) {
                              throw new IllegalStateException();
                           }

                           cd.af[0][var6][var5] = cd.af[0][var6 + 1][var5];
                        }
                     }

                     if (var5 == var1) {
                        if (var4 == 2045439667) {
                           throw new IllegalStateException();
                        }

                        if (var5 > 0) {
                           if (var4 == 2045439667) {
                              throw new IllegalStateException();
                           }

                           cd.af[0][var6][var5] = cd.af[0][var6][var5 - 1];
                        }
                     }

                     if (var5 == var1 + var3) {
                        if (var4 == 2045439667) {
                           throw new IllegalStateException();
                        }

                        if (var5 < 103) {
                           if (var4 == 2045439667) {
                              return;
                           }

                           cd.af[0][var6][var5] = cd.af[0][var6][1 + var5];
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "ew.aw(" + ')');
      }
   }

   static final void ai(int var0) {
      try {
         if (ix.ac) {
            if (var0 >= -414392398) {
               throw new IllegalStateException();
            }
         } else {
            int var1 = ie.by;
            int var2 = ie.bb;
            int var3 = ie.bi;
            int var4 = ie.be;
            int var5 = 50;
            int var6 = 3500;
            int var7 = (2139535413 * ix.an - gd.au(-1222275683)) * var5 / eu.at(337497352);
            int var8 = (148198745 * ix.aw - ax.ab(-1074701096)) * var5 / eu.at(-2136440610);
            int var9 = (2139535413 * ix.an - gd.au(-1889737509)) * var6 / eu.at(860263236);
            int var10 = (ix.aw * 148198745 - ax.ab(-262347789)) * var6 / eu.at(642408317);
            int var12 = var2 * var8 + var1 * var5 >> 16;
            int var13 = var2 * var5 - var1 * var8 >> 16;
            int var14 = var6 * var1 + var2 * var10 >> 16;
            int var15 = var2 * var6 - var10 * var1 >> 16;
            int var11 = ob.aw(var7, var13, var4, var3, (byte)-59);
            var5 = qv.ac(var7, var13, var4, var3, (byte)34);
            var7 = var11;
            var11 = ob.aw(var9, var15, var4, var3, (byte)-40);
            var6 = qv.ac(var9, var15, var4, var3, (byte)-28);
            ix.au = -1666864639 * ((var7 + var11) / 2);
            lh.ab = -158275257 * ((var12 + var14) / 2);
            ix.aq = -393366251 * ((var6 + var5) / 2);
            ix.al = (var11 - var7) / 2 * 1520532401;
            ea.at = 101851969 * ((var14 - var12) / 2);
            bj.aa = (var6 - var5) / 2 * 1785143657;
            hx.ay = Math.abs(ix.al * 1677061457) * 1650720741;
            ix.ao = Math.abs(-864785215 * ea.at) * 1274213335;
            aa.ax = Math.abs(-2085912871 * bj.aa) * 1268910509;
         }
      } catch (RuntimeException var16) {
         throw db.an(var16, "ew.ai(" + ')');
      }
   }

   public static hb af(int var0, byte var1) {
      try {
         hb var2 = (hb)hb.ac.af((long)var0);
         if (var2 != null) {
            if (var1 != 4) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = hb.af.bh(32, var0, (byte)-49);
            var2 = new hb();
            if (var3 != null) {
               if (var1 != 4) {
                  throw new IllegalStateException();
               }

               var2.an(new sg(var3), 1967654150);
            }

            hb.ac.aw(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "ew.af(" + ')');
      }
   }
}
