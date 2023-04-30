import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class fj {
   static Language ck;
   boolean an;
   boolean aw;
   int aq = 0;
   int au = 0;
   int[] ah;
   int[] av;
   long ac;
   long[] ai;
   long[] az;
   IterableNodeHashTable ap;
   public boolean al;
   public boolean[] am;
   public byte aa;
   public byte ao;
   public byte at;
   public byte ay;
   public byte[] ag;
   public int aj = 671016659;
   public int ak;
   public int as = -1473982125;
   public int ax;
   public int[] ar;
   public String ab = null;
   public String[] ad;
   public String[] ae;

   static boolean af_renamed(int var0, int var1) {
      return var0 != 4 || var1 < 8;
   }

   public static File af_renamed(String var0, String var1, int var2) {
      String var4 = var2 == 0 ? "" : "" + var2;
      gc.clDat = new File(hd.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
      String var5 = null;
      String var6 = null;
      boolean var7 = false;
      Packet var9;
      int var12;
      File var23;
      if (gc.clDat.exists()) {
         try {
            AccessFile var8 = new AccessFile(gc.clDat, "rw", 10000L);

            int var10;
            for(var9 = new Packet((int)var8.length()); var9.index * -1633313603 < var9.array.length; var9.index += -1516355947 * var10) {
               var10 = var8.read(var9.array, -1633313603 * var9.index, var9.array.length - var9.index * -1633313603);
               if (-1 == var10) {
                  throw new IOException();
               }
            }

            var9.index = 0;
            var10 = var9.g1();
            if (var10 < 1 || var10 > 3) {
               throw new IOException("" + var10);
            }

            int var11 = 0;
            if (var10 > 1) {
               var11 = var9.g1();
            }

            if (var10 <= 2) {
               var5 = var9.gjstr();
               if (var11 == 1) {
                  var6 = var9.gjstr();
               }
            } else {
               var5 = var9.ch();
               if (1 == var11) {
                  var6 = var9.ch();
               }
            }

            var8.close();
         } catch (IOException var20) {
            var20.printStackTrace();
         }

         if (var5 != null) {
            var23 = new File(var5);
            if (!var23.exists()) {
               var5 = null;
            }
         }

         if (var5 != null) {
            var23 = new File(var5, "test.dat");

            boolean var25;
            try {
               RandomAccessFile var28 = new RandomAccessFile(var23, "rw");
               var12 = var28.read();
               var28.seek(0L);
               var28.write(var12);
               var28.seek(0L);
               var28.close();
               var23.delete();
               var25 = true;
            } catch (Exception var18) {
               var25 = false;
            }

            if (!var25) {
               var5 = null;
            }
         }
      }

      if (var5 == null && var2 == 0) {
         label155:
         for(int var21 = 0; var21 < Formatting.ar.length; ++var21) {
            for(int var24 = 0; var24 < fe.cacheDirectoryLocations.length; ++var24) {
               File var26 = new File(fe.cacheDirectoryLocations[var24] + Formatting.ar[var21] + File.separatorChar + var0 + File.separatorChar);
               if (var26.exists()) {
                  File var29 = new File(var26, "test.dat");

                  boolean var31;
                  try {
                     RandomAccessFile var13 = new RandomAccessFile(var29, "rw");
                     int var14 = var13.read();
                     var13.seek(0L);
                     var13.write(var14);
                     var13.seek(0L);
                     var13.close();
                     var29.delete();
                     var31 = true;
                  } catch (Exception var17) {
                     var31 = false;
                  }

                  if (var31) {
                     var5 = var26.toString();
                     var7 = true;
                     break label155;
                  }
               }
            }
         }
      }

      if (var5 == null) {
         var5 = hd.userHomeDirectory + File.separatorChar + "jagexcache" + var4 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var7 = true;
      }

      File var22;
      if (var6 != null) {
         var22 = new File(var6);
         var23 = new File(var5);

         try {
            File[] var27 = var22.listFiles();
            File[] var33 = var27;

            for(var12 = 0; var12 < var33.length; ++var12) {
               File var32 = var33[var12];
               File var35 = new File(var23, var32.getName());
               boolean var15 = var32.renameTo(var35);
               if (!var15) {
                  throw new IOException();
               }
            }
         } catch (Exception var19) {
            var19.printStackTrace();
         }

         var7 = true;
      }

      if (var7) {
         var22 = new File(var5);
         var9 = null;

         try {
            AccessFile var30 = new AccessFile(gc.clDat, "rw", 10000L);
            Packet var34 = new Packet(500);
            var34.bu(3);
            var34.bu(null != var9 ? 1 : 0);
            var34.ci(var22.getPath());
            if (var9 != null) {
               var34.ci(var9.getPath());
            }

            var30.write(var34.array, 0, -1633313603 * var34.index);
            var30.close();
         } catch (IOException var16) {
            var16.printStackTrace();
         }
      }

      return new File(var5);
   }

   public fj(Packet var1) {
      this.as(var1);
   }

   void af(int var1) {
      if (this.an) {
         if (null != this.ai) {
            System.arraycopy(this.ai, 0, this.ai = new long[var1], 0, 1247430143 * this.ax);
         } else {
            this.ai = new long[var1];
         }
      }

      if (this.aw) {
         if (null != this.ad) {
            System.arraycopy(this.ad, 0, this.ad = new String[var1], 0, 1247430143 * this.ax);
         } else {
            this.ad = new String[var1];
         }
      }

      if (null != this.ag) {
         System.arraycopy(this.ag, 0, this.ag = new byte[var1], 0, this.ax * 1247430143);
      } else {
         this.ag = new byte[var1];
      }

      if (null != this.av) {
         System.arraycopy(this.av, 0, this.av = new int[var1], 0, 1247430143 * this.ax);
      } else {
         this.av = new int[var1];
      }

      if (this.ar != null) {
         System.arraycopy(this.ar, 0, this.ar = new int[var1], 0, this.ax * 1247430143);
      } else {
         this.ar = new int[var1];
      }

      if (null != this.am) {
         System.arraycopy(this.am, 0, this.am = new boolean[var1], 0, this.ax * 1247430143);
      } else {
         this.am = new boolean[var1];
      }

   }

   void an(int var1) {
      if (this.an) {
         if (this.az != null) {
            System.arraycopy(this.az, 0, this.az = new long[var1], 0, -325159675 * this.ak);
         } else {
            this.az = new long[var1];
         }
      }

      if (this.aw) {
         if (this.ae != null) {
            System.arraycopy(this.ae, 0, this.ae = new String[var1], 0, -325159675 * this.ak);
         } else {
            this.ae = new String[var1];
         }
      }

   }

   public int aw(String var1) {
      if (null != var1 && var1.length() != 0) {
         for(int var3 = 0; var3 < 1247430143 * this.ax; ++var3) {
            if (this.ad[var3].equals(var1)) {
               return var3;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public int ac(int var1, int var2, int var3) {
      int var5 = 31 == var3 ? -1 : (1 << var3 + 1) - 1;
      return (this.av[var1] & var5) >>> var2;
   }

   public Integer au(int var1) {
      if (null == this.ap) {
         return null;
      } else {
         Node var3 = this.ap.get((long)var1);
         return var3 != null && var3 instanceof IntegerNode ? new Integer(((IntegerNode)var3).integer) : null;
      }
   }

   public int[] ab() {
      if (null == this.ah) {
         String[] var2 = new String[1247430143 * this.ax];
         this.ah = new int[this.ax * 1247430143];

         for(int var3 = 0; var3 < 1247430143 * this.ax; this.ah[var3] = var3++) {
            var2[var3] = this.ad[var3];
            if (null != var2[var3]) {
               var2[var3] = var2[var3].toLowerCase();
            }
         }

         int[] var4 = this.ah;
         fd.aw_renamed(var2, var4, 0, var2.length - 1);
      }

      return this.ah;
   }

   void aq(long var1, String var3, int var4, int var5) {
      if (var3 != null) {
         if (var5 != -706420067) {
            return;
         }

         if (var3.length() == 0) {
            if (var5 != -706420067) {
               throw new IllegalStateException();
            }

            var3 = null;
         }
      }

      boolean var10000;
      if (var1 > 0L) {
         if (var5 != -706420067) {
            throw new IllegalStateException();
         }

         var10000 = true;
      } else {
         var10000 = false;
      }

      if (var10000 != this.an) {
         if (var5 == -706420067) {
            throw new RuntimeException("");
         }
      } else {
         var10000 = this.aw;
         boolean var10001;
         if (var3 != null) {
            if (var5 != -706420067) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         if (var10000 != var10001) {
            throw new RuntimeException("");
         } else {
            label116: {
               label125: {
                  if (var1 > 0L) {
                     if (var5 != -706420067) {
                        throw new IllegalStateException();
                     }

                     if (null == this.ai) {
                        break label125;
                     }

                     if (var5 != -706420067) {
                        return;
                     }

                     if (1247430143 * this.ax >= this.ai.length) {
                        break label125;
                     }

                     if (var5 != -706420067) {
                        return;
                     }
                  }

                  if (null == var3) {
                     break label116;
                  }

                  if (var5 != -706420067) {
                     throw new IllegalStateException();
                  }

                  if (this.ad != null) {
                     if (var5 != -706420067) {
                        return;
                     }

                     if (this.ax * 1247430143 < this.ad.length) {
                        break label116;
                     }

                     if (var5 != -706420067) {
                        return;
                     }
                  }
               }

               this.af(5 + 1247430143 * this.ax);
            }

            if (null != this.ai) {
               if (var5 != -706420067) {
                  throw new IllegalStateException();
               }

               this.ai[this.ax * 1247430143] = var1;
            }

            if (null != this.ad) {
               if (var5 != -706420067) {
                  throw new IllegalStateException();
               }

               this.ad[1247430143 * this.ax] = var3;
            }

            if (-1 == 680027429 * this.as) {
               if (var5 != -706420067) {
                  throw new IllegalStateException();
               }

               this.as = this.ax * 28974931;
               this.ag[1247430143 * this.ax] = 126;
            } else {
               this.ag[1247430143 * this.ax] = 0;
            }

            this.av[this.ax * 1247430143] = 0;
            this.ar[this.ax * 1247430143] = var4;
            this.am[1247430143 * this.ax] = false;
            this.ax += -1836992001;
            this.ah = null;
         }
      }
   }

   void al(int var1) {
      if (var1 >= 0 && var1 < 1247430143 * this.ax) {
         this.ax -= -1836992001;
         this.ah = null;
         if (0 == 1247430143 * this.ax) {
            this.ai = null;
            this.ad = null;
            this.ag = null;
            this.av = null;
            this.ar = null;
            this.am = null;
            this.as = -1473982125;
            this.aj = 671016659;
         } else {
            System.arraycopy(this.ag, 1 + var1, this.ag, var1, 1247430143 * this.ax - var1);
            System.arraycopy(this.av, var1 + 1, this.av, var1, 1247430143 * this.ax - var1);
            System.arraycopy(this.ar, 1 + var1, this.ar, var1, 1247430143 * this.ax - var1);
            System.arraycopy(this.am, 1 + var1, this.am, var1, this.ax * 1247430143 - var1);
            if (this.ai != null) {
               System.arraycopy(this.ai, var1 + 1, this.ai, var1, 1247430143 * this.ax - var1);
            }

            if (null != this.ad) {
               System.arraycopy(this.ad, 1 + var1, this.ad, var1, this.ax * 1247430143 - var1);
            }

            this.at();
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void at() {
      if (1247430143 * this.ax == 0) {
         this.as = -1473982125;
         this.aj = 671016659;
      } else {
         this.as = -1473982125;
         this.aj = 671016659;
         int var2 = 0;
         byte var3 = this.ag[0];

         for(int var4 = 1; var4 < this.ax * 1247430143; ++var4) {
            if (this.ag[var4] > var3) {
               if (var3 == 125) {
                  this.aj = var2 * -671016659;
               }

               var2 = var4;
               var3 = this.ag[var4];
            } else if (this.aj * -1218077019 == -1 && this.ag[var4] == 125) {
               this.aj = -671016659 * var4;
            }
         }

         this.as = 1473982125 * var2;
         if (this.as * 680027429 != -1) {
            this.ag[680027429 * this.as] = 126;
         }

      }
   }

   void aa(long var1, String var3, int var4) {
      if (null != var3) {
         if (var4 != -1787643966) {
            throw new IllegalStateException();
         }

         if (var3.length() == 0) {
            if (var4 != -1787643966) {
               throw new IllegalStateException();
            }

            var3 = null;
         }
      }

      if (var1 > 0L != this.an) {
         throw new RuntimeException("");
      } else if (null != var3 != this.aw) {
         if (var4 != -1787643966) {
            throw new IllegalStateException();
         } else {
            throw new RuntimeException("");
         }
      } else {
         label86: {
            label95: {
               if (var1 > 0L) {
                  if (var4 != -1787643966) {
                     throw new IllegalStateException();
                  }

                  if (null == this.az || this.ak * -325159675 >= this.az.length) {
                     break label95;
                  }
               }

               if (var3 == null) {
                  break label86;
               }

               if (var4 != -1787643966) {
                  throw new IllegalStateException();
               }

               if (this.ae != null) {
                  if (this.ak * -325159675 < this.ae.length) {
                     break label86;
                  }

                  if (var4 != -1787643966) {
                     throw new IllegalStateException();
                  }
               }
            }

            this.an(-325159675 * this.ak + 5);
         }

         if (this.az != null) {
            if (var4 != -1787643966) {
               return;
            }

            this.az[this.ak * -325159675] = var1;
         }

         if (this.ae != null) {
            if (var4 != -1787643966) {
               throw new IllegalStateException();
            }

            this.ae[-325159675 * this.ak] = var3;
         }

         this.ak += 252514253;
      }
   }

   void ay(int var1) {
      this.ak -= 252514253;
      if (-325159675 * this.ak == 0) {
         this.az = null;
         this.ae = null;
      } else {
         if (this.az != null) {
            System.arraycopy(this.az, var1 + 1, this.az, var1, this.ak * -325159675 - var1);
         }

         if (null != this.ae) {
            System.arraycopy(this.ae, 1 + var1, this.ae, var1, this.ak * -325159675 - var1);
         }
      }

   }

   int ao(int var1, byte var2) {
      if (126 != var2 && var2 != 127) {
         if (680027429 * this.as == var1 && (this.aj * -1218077019 == -1 || this.ag[this.aj * -1218077019] < 125)) {
            return -1;
         } else if (this.ag[var1] == var2) {
            return -1;
         } else {
            this.ag[var1] = var2;
            this.at();
            return var1;
         }
      } else {
         return -1;
      }
   }

   boolean ax(int var1) {
      if (this.as * 680027429 != var1 && this.ag[var1] != 126) {
         this.ag[680027429 * this.as] = 125;
         this.aj = this.as * 251618433;
         this.ag[var1] = 126;
         this.as = 1473982125 * var1;
         return true;
      } else {
         return false;
      }
   }

   int ai(int var1, boolean var2) {
      if (var2 == this.am[var1]) {
         return -1;
      } else {
         this.am[var1] = var2;
         return var1;
      }
   }

   int ag(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      int var9 = this.av[var1];
      if (var2 == (var9 & var8)) {
         return -1;
      } else {
         var9 &= ~var8;
         this.av[var1] = var9 | var2;
         return var1;
      }
   }

   boolean ah(int var1, int var2) {
      if (this.ap != null) {
         Node var4 = this.ap.get((long)var1);
         if (var4 != null) {
            if (var4 instanceof IntegerNode) {
               IntegerNode var5 = (IntegerNode)var4;
               if (var2 == var5.integer) {
                  return false;
               }

               var5.integer = var2;
               return true;
            }

            var4.remove();
         }
      } else {
         this.ap = new IterableNodeHashTable(4);
      }

      this.ap.put(new IntegerNode(var2), (long)var1);
      return true;
   }

   boolean av(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = var4 == 31 ? -1 : (1 << 1 + var4) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      if (null != this.ap) {
         Node var9 = this.ap.get((long)var1);
         if (var9 != null) {
            if (var9 instanceof IntegerNode) {
               IntegerNode var10 = (IntegerNode)var9;
               if ((var10.integer & var8) == var2) {
                  return false;
               }

               var10.integer &= ~var8;
               var10.integer |= var2;
               return true;
            }

            var9.remove();
         }
      } else {
         this.ap = new IterableNodeHashTable(4);
      }

      this.ap.put(new IntegerNode(var2), (long)var1);
      return true;
   }

   boolean ar(int var1, long var2) {
      if (null != this.ap) {
         Node var4 = this.ap.get((long)var1);
         if (null != var4) {
            if (var4 instanceof rq) {
               rq var5 = (rq)var4;
               if (var2 == var5.af) {
                  return false;
               }

               var5.af = var2;
               return true;
            }

            var4.remove();
         }
      } else {
         this.ap = new IterableNodeHashTable(4);
      }

      this.ap.put(new rq(var2), (long)var1);
      return true;
   }

   boolean am(int var1, String var2) {
      if (var2 == null) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (null != this.ap) {
         Node var4 = this.ap.get((long)var1);
         if (null != var4) {
            if (var4 instanceof ObjectNode) {
               ObjectNode var5 = (ObjectNode)var4;
               if (var5.obj instanceof String) {
                  if (var2.equals(var5.obj)) {
                     return false;
                  }

                  var5.remove();
                  this.ap.put(new ObjectNode(var2), var5.key);
                  return true;
               }
            }

            var4.remove();
         }
      } else {
         this.ap = new IterableNodeHashTable(4);
      }

      this.ap.put(new ObjectNode(var2), (long)var1);
      return true;
   }

   void as(Packet var1) {
      int var3 = var1.g1();
      if (var3 >= 1 && var3 <= 6) {
         int var4 = var1.g1();
         if ((var4 & 1) != 0) {
            this.an = true;
         }

         if (0 != (var4 & 2)) {
            this.aw = true;
         }

         if (!this.an) {
            this.ai = null;
            this.az = null;
         }

         if (!this.aw) {
            this.ad = null;
            this.ae = null;
         }

         this.au = var1.g4s() * 2008489311;
         this.aq = var1.g4s() * -1779678671;
         if (var3 <= 3 && -468068655 * this.aq != 0) {
            this.aq += 426811296;
         }

         this.ax = var1.cl() * -1836992001;
         this.ak = var1.g1() * 252514253;
         this.ab = var1.cw();
         if (var3 >= 4) {
            var1.g4s();
         }

         this.al = var1.g1() == 1;
         this.at = var1.g1s();
         this.aa = var1.g1s();
         this.ay = var1.g1s();
         this.ao = var1.g1s();
         int var5;
         if (1247430143 * this.ax > 0) {
            if (this.an && (this.ai == null || this.ai.length < 1247430143 * this.ax)) {
               this.ai = new long[1247430143 * this.ax];
            }

            if (this.aw && (null == this.ad || this.ad.length < this.ax * 1247430143)) {
               this.ad = new String[1247430143 * this.ax];
            }

            if (this.ag == null || this.ag.length < 1247430143 * this.ax) {
               this.ag = new byte[1247430143 * this.ax];
            }

            if (this.av == null || this.av.length < this.ax * 1247430143) {
               this.av = new int[this.ax * 1247430143];
            }

            if (null == this.ar || this.ar.length < this.ax * 1247430143) {
               this.ar = new int[this.ax * 1247430143];
            }

            if (null == this.am || this.am.length < this.ax * 1247430143) {
               this.am = new boolean[1247430143 * this.ax];
            }

            for(var5 = 0; var5 < this.ax * 1247430143; ++var5) {
               if (this.an) {
                  this.ai[var5] = var1.g8s();
               }

               if (this.aw) {
                  this.ad[var5] = var1.cz();
               }

               this.ag[var5] = var1.g1s();
               if (var3 >= 2) {
                  this.av[var5] = var1.g4s();
               }

               if (var3 >= 5) {
                  this.ar[var5] = var1.cl();
               } else {
                  this.ar[var5] = 0;
               }

               if (var3 >= 6) {
                  this.am[var5] = var1.g1() == 1;
               } else {
                  this.am[var5] = false;
               }
            }

            this.at();
         }

         if (this.ak * -325159675 > 0) {
            if (this.an && (null == this.az || this.az.length < -325159675 * this.ak)) {
               this.az = new long[-325159675 * this.ak];
            }

            if (this.aw && (this.ae == null || this.ae.length < this.ak * -325159675)) {
               this.ae = new String[this.ak * -325159675];
            }

            for(var5 = 0; var5 < this.ak * -325159675; ++var5) {
               if (this.an) {
                  this.az[var5] = var1.g8s();
               }

               if (this.aw) {
                  this.ae[var5] = var1.cz();
               }
            }
         }

         if (var3 >= 3) {
            var5 = var1.cl();
            if (var5 > 0) {
               this.ap = new IterableNodeHashTable(var5 < 16 ? co.ab_renamed(var5) : 16);

               while(var5-- > 0) {
                  int var6 = var1.g4s();
                  int var7 = var6 & 1073741823;
                  int var8 = var6 >>> 30;
                  if (var8 == 0) {
                     int var9 = var1.g4s();
                     this.ap.put(new IntegerNode(var9), (long)var7);
                  } else if (var8 == 1) {
                     long var12 = var1.g8s();
                     this.ap.put(new rq(var12), (long)var7);
                  } else if (2 == var8) {
                     String var13 = var1.cw();
                     this.ap.put(new ObjectNode(var13), (long)var7);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var3);
      }
   }
}
