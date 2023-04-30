import accessors.RSWorldMapSection1;

public class jy implements kw, RSWorldMapSection1 {
   int au;
   int aw;
   static final int bg = 1003;
   int ac;
   int aa;
   int aq;
   int af;
   int al;
   int at;
   int an;
   static final int ax = 1;
   int ab;
   static final int bs = 24;

   public int[] ac(int var1, int var2, int var3, byte var4) {
      try {
         if (!this.an(var1, var2, var3, (byte)-42)) {
            if (var4 <= 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int[] var5 = new int[]{this.au * -1546860992 - 9327936 * this.aw + var2 + (this.at * -201304696 - this.aq * 547210872), var3 + (this.ab * -323407552 - 1744001984 * this.ac) + (this.aa * 248657896 - 1082441896 * this.al)};
            return var5;
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "jy.ac(" + ')');
      }
   }

   void aq(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "jy.aq(" + ')');
      }
   }

   public boolean an(int var1, int var2, int var3, byte var4) {
      try {
         if (var1 >= -1060807941 * this.af) {
            if (var4 >= 10) {
               throw new IllegalStateException();
            }

            if (var1 < this.an * -1519014345 + this.af * -1060807941) {
               boolean var10000;
               if (var2 >= (this.aw * 268581205 << 6) + (this.aq * 605272271 << 3)) {
                  if (var4 >= 10) {
                     throw new IllegalStateException();
                  }

                  if (var2 <= 7 + (this.aq * 605272271 << 3) + (this.aw * 268581205 << 6)) {
                     if (var4 >= 10) {
                        throw new IllegalStateException();
                     }

                     if (var3 >= (362794351 * this.ac << 6) + (-2012178411 * this.al << 3) && var3 <= (this.al * -2012178411 << 3) + (362794351 * this.ac << 6) + 7) {
                        var10000 = true;
                        return var10000;
                     }
                  }
               }

               var10000 = false;
               return var10000;
            }

            if (var4 >= 10) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw db.an(var5, "jy.an(" + ')');
      }
   }

   public boolean aw(int var1, int var2, int var3) {
      try {
         boolean var10000;
         if (var1 >= (-562033999 * this.at << 3) + (this.au * 646918937 << 6)) {
            if (var3 >= -1516355947) {
               throw new IllegalStateException();
            }

            if (var1 <= 7 + (this.au * 646918937 << 6) + (-562033999 * this.at << 3) && var2 >= (this.ab * -2085428027 << 6) + (this.aa * 1104824061 << 3) && var2 <= (1104824061 * this.aa << 3) + (this.ab * -2085428027 << 6) + 7) {
               if (var3 >= -1516355947) {
                  throw new IllegalStateException();
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var4) {
         throw db.an(var4, "jy.aw(" + ')');
      }
   }

   public void aa(js var1) {
      if (var1.aq * 1747493579 > 200417309 * this.au) {
         var1.aq = -694790025 * this.au;
      }

      if (1854846129 * var1.al < -1660420949 * this.au) {
         var1.al = this.au * 92282601;
      }

      if (var1.at * -104888762 > -907957007 * this.ab) {
         var1.at = this.ab * 1075472273;
      }

      if (var1.aa * 92797411 < -2085428027 * this.ab) {
         var1.aa = this.ab * 1487382450;
      }

   }

   public boolean ad(int var1, int var2, int var3) {
      if (var1 >= 1455053008 * this.af && var1 < this.an * 983464293 + this.af * -1060807941) {
         return var2 >= (this.aw * 268581205 << 6) + (this.aq * 1154919610 << 3) && var2 <= 7 + (this.aq * 605272271 << 3) + (this.aw * 1226403615 << 6) && var3 >= (-1227767638 * this.ac << 6) + (-2012178411 * this.al << 3) && var3 <= (this.al * -1911026493 << 3) + (46819562 * this.ac << 6) + 7;
      } else {
         return false;
      }
   }

   public void ab(sg var1, byte var2) {
      try {
         this.af = var1.cm((byte)7) * -153706445;
         this.an = var1.cm((byte)7) * 74409863;
         this.aw = var1.cl(414597028) * -1522795523;
         this.aq = var1.cm((byte)7) * -1051832785;
         this.ac = var1.cl(448456406) * 3551631;
         this.al = var1.cm((byte)7) * -1804437699;
         this.au = var1.cl(188283728) * 1517975849;
         this.at = var1.cm((byte)7) * 1932656209;
         this.ab = var1.cl(-2063502861) * -426051059;
         this.aa = var1.cm((byte)7) * 137791061;
         this.aq(-1809982320);
      } catch (RuntimeException var3) {
         throw db.an(var3, "jy.ab(" + ')');
      }
   }

   public lb au(int var1, int var2, byte var3) {
      try {
         if (!this.aw(var1, var2, -2054419050)) {
            return null;
         } else {
            int var4 = 547210872 * this.aq - -201304696 * this.at + 9327936 * this.aw - -1546860992 * this.au + var1;
            int var5 = 1082441896 * this.al - this.aa * 248657896 + var2 + (this.ac * 1744001984 - -323407552 * this.ab);
            return new lb(-1060807941 * this.af, var4, var5);
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "jy.au(" + ')');
      }
   }

   public void al(js var1) {
      if (var1.aq * 77939951 > 646918937 * this.au) {
         var1.aq = -694790025 * this.au;
      }

      if (1854846129 * var1.al < 646918937 * this.au) {
         var1.al = this.au * 92282601;
      }

      if (var1.at * 2059655157 > -2085428027 * this.ab) {
         var1.at = this.ab * 1075472273;
      }

      if (var1.aa * -1086956513 < -2085428027 * this.ab) {
         var1.aa = this.ab * 1758667419;
      }

   }

   public void at(js var1) {
      if (var1.aq * 1945596353 > 1937970406 * this.au) {
         var1.aq = -694790025 * this.au;
      }

      if (1854846129 * var1.al < 871659216 * this.au) {
         var1.al = this.au * 92282601;
      }

      if (var1.at * 1607451251 > -2085428027 * this.ab) {
         var1.at = this.ab * -1591406467;
      }

      if (var1.aa * 1593457824 < 243837231 * this.ab) {
         var1.aa = this.ab * 1758667419;
      }

   }

   public static final tq ay(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         if (var1 == -1) {
            if (var6 <= -775071603) {
               throw new IllegalStateException();
            }

            var4 = 0;
         } else if (2 == var4) {
            if (var6 <= -775071603) {
               throw new IllegalStateException();
            }

            if (var1 != 1) {
               var4 = 1;
            }
         }

         long var7 = ((long)var2 << 38) + (long)var0 + ((long)var1 << 16) + ((long)var4 << 40) + ((long)var3 << 42);
         tq var9;
         if (!var5) {
            if (var6 <= -775071603) {
               throw new IllegalStateException();
            }

            var9 = (tq)hz.ao.af(var7);
            if (var9 != null) {
               if (var6 <= -775071603) {
                  throw new IllegalStateException();
               }

               return var9;
            }
         }

         hz var10 = dh.af(var0, (byte)86);
         if (var1 > 1 && null != var10.bh) {
            if (var6 <= -775071603) {
               throw new IllegalStateException();
            }

            int var11 = -1;

            for(int var12 = 0; var12 < 10; ++var12) {
               if (var1 >= var10.bw[var12]) {
                  if (var6 <= -775071603) {
                     throw new IllegalStateException();
                  }

                  if (0 != var10.bw[var12]) {
                     if (var6 <= -775071603) {
                        throw new IllegalStateException();
                     }

                     var11 = var10.bh[var12];
                  }
               }
            }

            if (var11 != -1) {
               if (var6 <= -775071603) {
                  throw new IllegalStateException();
               }

               var10 = dh.af(var11, (byte)69);
            }
         }

         it var22 = var10.at(1, -1609935694);
         if (var22 == null) {
            if (var6 <= -775071603) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            tq var23 = null;
            if (-1 != var10.ci * -1375068187) {
               if (var6 <= -775071603) {
                  throw new IllegalStateException();
               }

               var23 = ay(var10.ce * 1399852547, 10, 1, 0, 0, true, 1339353001);
               if (null == var23) {
                  if (var6 <= -775071603) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            } else if (-1276549997 * var10.cg != -1) {
               if (var6 <= -775071603) {
                  throw new IllegalStateException();
               }

               var23 = ay(var10.cl * -1273418661, var1, var2, var3, 0, false, 1852795737);
               if (null == var23) {
                  return null;
               }
            } else if (var10.cy * 119859889 != -1) {
               var23 = ay(-172219939 * var10.cr, var1, 0, 0, 0, false, -539868663);
               if (null == var23) {
                  return null;
               }
            }

            int[] var13 = th.ad;
            int var14 = th.ae;
            int var15 = th.ap;
            float[] var16 = th.by;
            int[] var17 = new int[4];
            th.el(var17);
            var9 = new tq(36, 32);
            an.ay(var9.af, 36, 32, (float[])null, 580310026);
            th.er();
            am.ao(-1447075049);
            js.ai(16, 16, (byte)32);
            in.ab.an = false;
            if (-1 != var10.cy * 119859889) {
               if (var6 <= -775071603) {
                  throw new IllegalStateException();
               }

               var23.ax(0, 0);
            }

            int var18 = var10.aj * 1014971553;
            if (var5) {
               if (var6 <= -775071603) {
                  throw new IllegalStateException();
               }

               var18 = (int)(1.5 * (double)var18);
            } else if (2 == var2) {
               if (var6 <= -775071603) {
                  throw new IllegalStateException();
               }

               var18 = (int)((double)var18 * 1.04);
            }

            int var19 = var18 * in.ac[415331477 * var10.ak] >> 16;
            int var20 = var18 * in.au[415331477 * var10.ak] >> 16;
            var22.ai();
            var22.bx(0, -2044433177 * var10.az, var10.ad * 450595207, var10.ak * 415331477, var10.ae * 151912273, 1550732737 * var22.et / 2 + var19 + -271411709 * var10.ap, var20 + var10.ap * -271411709);
            if (-1276549997 * var10.cg != -1) {
               if (var6 <= -775071603) {
                  throw new IllegalStateException();
               }

               var23.ax(0, 0);
            }

            if (var2 >= 1) {
               if (var6 <= -775071603) {
                  throw new IllegalStateException();
               }

               var9.at(1);
            }

            if (var2 >= 2) {
               var9.at(16777215);
            }

            if (0 != var3) {
               if (var6 <= -775071603) {
                  throw new IllegalStateException();
               }

               var9.aa(var3);
            }

            an.ay(var9.af, 36, 32, (float[])null, 580310026);
            if (var10.ci * -1375068187 != -1) {
               if (var6 <= -775071603) {
                  throw new IllegalStateException();
               }

               var23.ax(0, 0);
            }

            label200: {
               if (var4 != 1) {
                  if (var6 <= -775071603) {
                     throw new IllegalStateException();
                  }

                  if (var4 != 2 || 1 != var10.bi * 1552863327) {
                     break label200;
                  }

                  if (var6 <= -775071603) {
                     throw new IllegalStateException();
                  }
               }

               eh.ax.ar(dy.ao(var1, 262535457), 0, 9, 16776960, 1);
            }

            if (!var5) {
               hz.ao.aw(var9, var7);
            }

            an.ay(var13, var14, var15, var16, 580310026);
            th.en(var17);
            am.ao(-755644984);
            in.ab.an = true;
            return var9;
         }
      } catch (RuntimeException var21) {
         throw db.an(var21, "jy.ay(" + ')');
      }
   }

   public boolean ay(int var1, int var2) {
      return var1 >= (-562033999 * this.at << 3) + (this.au * -2086205450 << 6) && var1 <= 7 + (this.au * 1770324111 << 6) + (-562033999 * this.at << 3) && var2 >= (this.ab * -2085428027 << 6) + (this.aa * 1104824061 << 3) && var2 <= (1104824061 * this.aa << 3) + (this.ab * -2085428027 << 6) + 7;
   }

   public int[] ao(int var1, int var2, int var3) {
      if (!this.an(var1, var2, var3, (byte)-58)) {
         return null;
      } else {
         int[] var4 = new int[]{this.au * -1546860992 - 9327936 * this.aw + var2 + (this.at * -201304696 - this.aq * 547210872), var3 + (this.ab * 1835797691 - 1063133807 * this.ac) + (this.aa * 1359347976 - 1082441896 * this.al)};
         return var4;
      }
   }

   void az() {
   }

   public lb ai(int var1, int var2) {
      if (!this.aw(var1, var2, -1986448320)) {
         return null;
      } else {
         int var3 = 547210872 * this.aq - -201304696 * this.at + 9327936 * this.aw - -1546860992 * this.au + var1;
         int var4 = 1082441896 * this.al - this.aa * 248657896 + var2 + (this.ac * 1744001984 - -323407552 * this.ab);
         return new lb(-1060807941 * this.af, var3, var4);
      }
   }

   public lb ag(int var1, int var2) {
      if (!this.aw(var1, var2, -1564596333)) {
         return null;
      } else {
         int var3 = 547210872 * this.aq - -201304696 * this.at + 119258326 * this.aw - -1546860992 * this.au + var1;
         int var4 = 1082441896 * this.al - this.aa * 248657896 + var2 + (this.ac * 1958774821 - -323407552 * this.ab);
         return new lb(-1060807941 * this.af, var3, var4);
      }
   }

   public lb ah(int var1, int var2) {
      if (!this.aw(var1, var2, -1560199223)) {
         return null;
      } else {
         int var3 = 547210872 * this.aq - 1478881004 * this.at + -1553179120 * this.aw - -1546860992 * this.au + var1;
         int var4 = -1981001301 * this.al - this.aa * 248657896 + var2 + (this.ac * 85241671 - -661190100 * this.ab);
         return new lb(-203537750 * this.af, var3, var4);
      }
   }

   public lb av(int var1, int var2) {
      if (!this.aw(var1, var2, -1743343165)) {
         return null;
      } else {
         int var3 = 547210872 * this.aq - -201304696 * this.at + 9327936 * this.aw - -1546860992 * this.au + var1;
         int var4 = 1082441896 * this.al - this.aa * 248657896 + var2 + (this.ac * 1744001984 - -323407552 * this.ab);
         return new lb(-1060807941 * this.af, var3, var4);
      }
   }

   public void ar(sg var1) {
      this.af = var1.cm((byte)7) * -153706445;
      this.an = var1.cm((byte)7) * 74409863;
      this.aw = var1.cl(-311262912) * -1522795523;
      this.aq = var1.cm((byte)7) * -1051832785;
      this.ac = var1.cl(-1213820090) * 3551631;
      this.al = var1.cm((byte)7) * -1804437699;
      this.au = var1.cl(-994853023) * 1517975849;
      this.at = var1.cm((byte)7) * 1932656209;
      this.ab = var1.cl(-537518872) * -426051059;
      this.aa = var1.cm((byte)7) * 137791061;
      this.aq(218847638);
   }

   public void am(sg var1) {
      this.af = var1.cm((byte)7) * -153706445;
      this.an = var1.cm((byte)7) * 74409863;
      this.aw = var1.cl(-1737366852) * -1522795523;
      this.aq = var1.cm((byte)7) * -1051832785;
      this.ac = var1.cl(-1827569325) * 3551631;
      this.al = var1.cm((byte)7) * -1804437699;
      this.au = var1.cl(-1383004988) * 1517975849;
      this.at = var1.cm((byte)7) * 1932656209;
      this.ab = var1.cl(606745035) * -426051059;
      this.aa = var1.cm((byte)7) * 137791061;
      this.aq(729368537);
   }

   public void as(sg var1) {
      this.af = var1.cm((byte)7) * -153706445;
      this.an = var1.cm((byte)7) * 74409863;
      this.aw = var1.cl(-1064858139) * -1522795523;
      this.aq = var1.cm((byte)7) * -1051832785;
      this.ac = var1.cl(-256435622) * 3551631;
      this.al = var1.cm((byte)7) * -1804437699;
      this.au = var1.cl(603784709) * 1517975849;
      this.at = var1.cm((byte)7) * 1932656209;
      this.ab = var1.cl(-55853301) * -426051059;
      this.aa = var1.cm((byte)7) * 137791061;
      this.aq(1193511091);
   }

   public void aj(sg var1) {
      this.af = var1.cm((byte)7) * -153706445;
      this.an = var1.cm((byte)7) * 74409863;
      this.aw = var1.cl(-1241397749) * -1522795523;
      this.aq = var1.cm((byte)7) * -1051832785;
      this.ac = var1.cl(376545408) * 3551631;
      this.al = var1.cm((byte)7) * -1804437699;
      this.au = var1.cl(-495754110) * 1517975849;
      this.at = var1.cm((byte)7) * 1932656209;
      this.ab = var1.cl(-1766374274) * -426051059;
      this.aa = var1.cm((byte)7) * 137791061;
      this.aq(1336052723);
   }

   public void af(js var1, int var2) {
      try {
         if (var1.aq * 77939951 > 646918937 * this.au) {
            if (var2 <= 854271946) {
               throw new IllegalStateException();
            }

            var1.aq = -694790025 * this.au;
         }

         if (1854846129 * var1.al < 646918937 * this.au) {
            var1.al = this.au * 92282601;
         }

         if (var1.at * 2059655157 > -2085428027 * this.ab) {
            if (var2 <= 854271946) {
               throw new IllegalStateException();
            }

            var1.at = this.ab * 1075472273;
         }

         if (var1.aa * -1086956513 < -2085428027 * this.ab) {
            if (var2 <= 854271946) {
               return;
            }

            var1.aa = this.ab * 1758667419;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "jy.af(" + ')');
      }
   }

   public boolean ae(int var1, int var2, int var3) {
      if (var1 >= 1639414297 * this.af && var1 < this.an * -1519014345 + this.af * -1060807941) {
         return var2 >= (this.aw * 268581205 << 6) + (this.aq * -646100311 << 3) && var2 <= 7 + (this.aq * 211972934 << 3) + (this.aw * 268581205 << 6) && var3 >= (1540923543 * this.ac << 6) + (648463073 * this.al << 3) && var3 <= (this.al * 285128667 << 3) + (362794351 * this.ac << 6) + 7;
      } else {
         return false;
      }
   }

   public boolean ap(int var1, int var2, int var3) {
      if (var1 >= -1060807941 * this.af && var1 < this.an * -1041907261 + this.af * -1060807941) {
         return var2 >= (this.aw * 781218082 << 6) + (this.aq * 1714664462 << 3) && var2 <= 7 + (this.aq * 2080085357 << 3) + (this.aw * 268581205 << 6) && var3 >= (362794351 * this.ac << 6) + (1566834611 * this.al << 3) && var3 <= (this.al * 1321535704 << 3) + (362794351 * this.ac << 6) + 7;
      } else {
         return false;
      }
   }

   void ak() {
   }

   jy() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "jy.<init>(" + ')');
      }
   }

   void by() {
   }

   void bb() {
   }

   public int[] ax(int var1, int var2, int var3) {
      if (!this.an(var1, var2, var3, (byte)1)) {
         return null;
      } else {
         int[] var4 = new int[]{this.au * -1546860992 - 9327936 * this.aw + var2 + (this.at * 1458540265 - this.aq * 547210872), var3 + (this.ab * -323407552 - 1744001984 * this.ac) + (this.aa * -843587113 - -2052844905 * this.al)};
         return var4;
      }
   }

   public static int af(int var0, int var1) {
      try {
         hg var2 = gs.an(var0, -1334878542);
         int var3 = var2.aw * 470400793;
         int var4 = 1050888611 * var2.ac;
         int var5 = var2.au * 1130237503;
         int var6 = le.af[var5 - var4];
         return le.aw[var3] >> var4 & var6;
      } catch (RuntimeException var7) {
         throw db.an(var7, "jy.af(" + ')');
      }
   }
}
