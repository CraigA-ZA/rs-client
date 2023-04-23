public abstract class AbstractArchive {
   static int bz = 0;
   static GzipDecompressor be = new GzipDecompressor();
   boolean bo;
   boolean bx;
   int ar;
   int[] ad;
   int[] ak;
   int[] am;
   int[] as;
   int[] az;
   int[][] ae;
   int[][] ap;
   Object[] bb;
   Object[][] bi;
   td aj;
   td[] by;
   public int bk;

   AbstractArchive(boolean var1, boolean var2) {
      this.bx = var1;
      this.bo = var2;
   }

   void decodeIndex(byte[] var1) {
      this.bk = ii.br_renamed(var1, var1.length) * -175856763;
      Packet var3 = new Packet(ai.ch_renamed(var1));
      int var4 = var3.g1();
      if (var4 >= 5 && var4 <= 7) {
         if (var4 >= 6) {
            var3.g4s();
         }

         int var5 = var3.g1();
         if (var4 >= 7) {
            this.ar = var3.dc() * 1692969259;
         } else {
            this.ar = var3.cl() * 1692969259;
         }

         int var6 = 0;
         int var7 = -1;
         this.am = new int[this.ar * -1754346109];
         int var8;
         if (var4 >= 7) {
            for(var8 = 0; var8 < -1754346109 * this.ar; ++var8) {
               this.am[var8] = var6 += var3.dc();
               if (this.am[var8] > var7) {
                  var7 = this.am[var8];
               }
            }
         } else {
            for(var8 = 0; var8 < this.ar * -1754346109; ++var8) {
               this.am[var8] = var6 += var3.cl();
               if (this.am[var8] > var7) {
                  var7 = this.am[var8];
               }
            }
         }

         this.ak = new int[1 + var7];
         this.az = new int[1 + var7];
         this.ad = new int[var7 + 1];
         this.ae = new int[var7 + 1][];
         this.bb = new Object[1 + var7];
         this.bi = new Object[1 + var7][];
         if (0 != var5) {
            this.as = new int[var7 + 1];

            for(var8 = 0; var8 < -1754346109 * this.ar; ++var8) {
               this.as[this.am[var8]] = var3.g4s();
            }

            this.aj = new td(this.as);
         }

         for(var8 = 0; var8 < this.ar * -1754346109; ++var8) {
            this.ak[this.am[var8]] = var3.g4s();
         }

         for(var8 = 0; var8 < this.ar * -1754346109; ++var8) {
            this.az[this.am[var8]] = var3.g4s();
         }

         for(var8 = 0; var8 < this.ar * -1754346109; ++var8) {
            this.ad[this.am[var8]] = var3.cl();
         }

         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         if (var4 >= 7) {
            for(var8 = 0; var8 < -1754346109 * this.ar; ++var8) {
               var9 = this.am[var8];
               var10 = this.ad[var9];
               var6 = 0;
               var11 = -1;
               this.ae[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.ae[var9][var12] = var6 += var3.dc();
                  if (var13 > var11) {
                     var11 = var13;
                  }
               }

               this.bi[var9] = new Object[1 + var11];
            }
         } else {
            for(var8 = 0; var8 < -1754346109 * this.ar; ++var8) {
               var9 = this.am[var8];
               var10 = this.ad[var9];
               var6 = 0;
               var11 = -1;
               this.ae[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.ae[var9][var12] = var6 += var3.cl();
                  if (var13 > var11) {
                     var11 = var13;
                  }
               }

               this.bi[var9] = new Object[var11 + 1];
            }
         }

         if (var5 != 0) {
            this.ap = new int[1 + var7][];
            this.by = new td[1 + var7];

            for(var8 = 0; var8 < this.ar * -1754346109; ++var8) {
               var9 = this.am[var8];
               var10 = this.ad[var9];
               this.ap[var9] = new int[this.bi[var9].length];

               for(var11 = 0; var11 < var10; ++var11) {
                  this.ap[var9][this.ae[var9][var11]] = var3.g4s();
               }

               this.by[var9] = new td(this.ap[var9]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   public static hs an_renamed(int var0) {
      hs var2 = (hs)hs.ac.get((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = hs.an.takeFile(9, var0);
         var2 = new hs();
         var2.ab = -1772751813 * var0;
         if (null != var3) {
            var2.decode(new Packet(var3));
         }

         var2.postDecode();
         hs.ac.put(var2, (long)var0);
         return var2;
      }
   }

   static char an_renamed(char var0, Language var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (209 == var0 && Language.ab != var1) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (var0 == 221) {
            return 'Y';
         }

         if (var0 == 223) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (231 == var0) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (241 == var0 && var1 != Language.ab) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      if (var0 == 338) {
         return 'O';
      } else if (339 == var0) {
         return 'o';
      } else if (376 == var0) {
         return 'Y';
      } else {
         return var0;
      }
   }

   void aw(int var1) {
   }

   public byte[] takeFile(int var1, int var2) {
      return this.takeFileEncrypted(var1, var2, (int[])null);
   }

   public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.bi.length && this.bi[var1] != null && var2 >= 0 && var2 < this.bi[var1].length) {
         if (null == this.bi[var1][var2]) {
            boolean var5 = this.buildFiles(var1, var3);
            if (!var5) {
               this.ac(var1);
               var5 = this.buildFiles(var1, var3);
               if (!var5) {
                  return null;
               }
            }
         }

         byte[] var6 = HeadbarType.byteArrayFromObject(this.bi[var1][var2], false);
         if (this.bo) {
            this.bi[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   public boolean tryLoadFile(int var1, int var2) {
      if (var1 >= 0 && var1 < this.bi.length && null != this.bi[var1] && var2 >= 0 && var2 < this.bi[var1].length) {
         if (null != this.bi[var1][var2]) {
            return true;
         } else if (null != this.bb[var1]) {
            return true;
         } else {
            this.ac(var1);
            return null != this.bb[var1];
         }
      } else {
         return false;
      }
   }

   public boolean ci(int var1) {
      if (this.bi.length == 1) {
         return this.tryLoadFile(0, var1);
      } else if (1 == this.bi[var1].length) {
         return this.tryLoadFile(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public boolean tryLoadGroup(int var1) {
      if (this.bb[var1] != null) {
         return true;
      } else {
         this.ac(var1);
         return null != this.bb[var1];
      }
   }

   public boolean cc() {
      boolean var2 = true;

      for(int var3 = 0; var3 < this.am.length; ++var3) {
         int var4 = this.am[var3];
         if (null == this.bb[var4]) {
            this.ac(var4);
            if (null == this.bb[var4]) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   int groupLoadPercent(int var1) {
      return null != this.bb[var1] ? 100 : 0;
   }

   public byte[] takeFileFlat(int var1) {
      if (this.bi.length == 1) {
         return this.takeFile(0, var1);
      } else if (this.bi[var1].length == 1) {
         return this.takeFile(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] getFile(int var1, int var2) {
      if (var1 >= 0 && var1 < this.bi.length && null != this.bi[var1] && var2 >= 0 && var2 < this.bi[var1].length) {
         if (this.bi[var1][var2] == null) {
            boolean var4 = this.buildFiles(var1, (int[])null);
            if (!var4) {
               this.ac(var1);
               var4 = this.buildFiles(var1, (int[])null);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = HeadbarType.byteArrayFromObject(this.bi[var1][var2], false);
         return var5;
      } else {
         return null;
      }
   }

   public byte[] getFileFlat(int var1) {
      if (1 == this.bi.length) {
         return this.getFile(0, var1);
      } else if (1 == this.bi[var1].length) {
         return this.getFile(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   void ac(int var1) {
   }

   public int[] ck(int var1) {
      return var1 >= 0 && var1 < this.ae.length ? this.ae[var1] : null;
   }

   public int cq(int var1) {
      return this.bi != null && var1 < this.bi.length && null != this.bi[var1] ? this.bi[var1].length : 0;
   }

   public int cm() {
      return this.bi.length;
   }

   public void cf() {
      for(int var2 = 0; var2 < this.bb.length; ++var2) {
         this.bb[var2] = null;
      }

   }

   public void cl(int var1) {
      for(int var3 = 0; var3 < this.bi[var1].length; ++var3) {
         this.bi[var1][var3] = null;
      }

   }

   public void cg() {
      for(int var2 = 0; var2 < this.bi.length; ++var2) {
         if (this.bi[var2] != null) {
            for(int var3 = 0; var3 < this.bi[var2].length; ++var3) {
               this.bi[var2][var3] = null;
            }
         }
      }

   }

   boolean buildFiles(int var1, int[] var2) {
      if (this.bb[var1] == null) {
         return false;
      } else {
         int var4 = this.ad[var1];
         int[] var5 = this.ae[var1];
         Object[] var6 = this.bi[var1];
         boolean var7 = true;

         for(int var8 = 0; var8 < var4; ++var8) {
            if (var6[var5[var8]] == null) {
               var7 = false;
               break;
            }
         }

         if (var7) {
            return true;
         } else {
            byte[] var19;
            if (var2 == null || 0 == var2[0] && 0 == var2[1] && 0 == var2[2] && var2[3] == 0) {
               var19 = HeadbarType.byteArrayFromObject(this.bb[var1], false);
            } else {
               var19 = HeadbarType.byteArrayFromObject(this.bb[var1], true);
               Packet var9 = new Packet(var19);
               var9.tinyKeyDecrypt(var2, 5, var9.al.length);
            }

            byte[] var20 = ai.ch_renamed(var19);
            if (this.bx) {
               this.bb[var1] = null;
            }

            if (var4 > 1) {
               int var10 = var20.length;
               --var10;
               int var11 = var20[var10] & 255;
               var10 -= 4 * var4 * var11;
               Packet var12 = new Packet(var20);
               int[] var13 = new int[var4];
               var12.at = -1516355947 * var10;

               int var15;
               int var16;
               for(int var14 = 0; var14 < var11; ++var14) {
                  var15 = 0;

                  for(var16 = 0; var16 < var4; ++var16) {
                     var15 += var12.g4s();
                     var13[var16] += var15;
                  }
               }

               byte[][] var21 = new byte[var4][];

               for(var15 = 0; var15 < var4; ++var15) {
                  var21[var15] = new byte[var13[var15]];
                  var13[var15] = 0;
               }

               var12.at = var10 * -1516355947;
               var15 = 0;

               for(var16 = 0; var16 < var11; ++var16) {
                  int var17 = 0;

                  for(int var18 = 0; var18 < var4; ++var18) {
                     var17 += var12.g4s();
                     System.arraycopy(var20, var15, var21[var18], var13[var18], var17);
                     var13[var18] += var17;
                     var15 += var17;
                  }
               }

               for(var16 = 0; var16 < var4; ++var16) {
                  if (!this.bo) {
                     var6[var5[var16]] = ef.byteArrayToObject(var21[var16], false);
                  } else {
                     var6[var5[var16]] = var21[var16];
                  }
               }
            } else if (!this.bo) {
               var6[var5[0]] = ef.byteArrayToObject(var20, false);
            } else {
               var6[var5[0]] = var20;
            }

            return true;
         }
      }
   }

   public int getGroupId(String var1) {
      var1 = var1.toLowerCase();
      return this.aj.af(hn.aq_renamed(var1));
   }

   public int getFileId(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.by[var1].af(hn.aq_renamed(var2));
   }

   public boolean cv(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.aj.af(hn.aq_renamed(var1));
      if (var4 < 0) {
         return false;
      } else {
         int var5 = this.by[var4].af(hn.aq_renamed(var2));
         return var5 >= 0;
      }
   }

   public byte[] takeFileByNames(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.aj.af(hn.aq_renamed(var1));
      int var5 = this.by[var4].af(hn.aq_renamed(var2));
      return this.takeFile(var4, var5);
   }

   public boolean tryLoadFileByNames(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.aj.af(hn.aq_renamed(var1));
      int var5 = this.by[var4].af(hn.aq_renamed(var2));
      return this.tryLoadFile(var4, var5);
   }

   public boolean tryLoadGroupByName(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.aj.af(hn.aq_renamed(var1));
      return this.tryLoadGroup(var3);
   }

   public void cw(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.aj.af(hn.aq_renamed(var1));
      if (var3 >= 0) {
         this.aw(var3);
      }
   }

   public int groupLoadPercentByName(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.aj.af(hn.aq_renamed(var1));
      return this.groupLoadPercent(var3);
   }
}
