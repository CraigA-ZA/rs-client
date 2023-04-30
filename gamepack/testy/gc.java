import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class gc {
   public static final int af = 1048576000;
   public static final int an = 1048576;
   public static final String aw = "rw";
   static File ac;
   public static int ab;
   public static final String al = "main_file_cache.idx";
   public static sj ao = null;
   public static sj ax = null;
   static final int ay = 70;
   public static int ah;
   public static final String at = "main_file_cache.idx255";
   public static final int ag = 13;
   public static sj ai = null;

   public static File ab(String var0, String var1, int var2) {
      String var3 = var2 == 0 ? "" : "" + var2;
      ac = new File(hd.az, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      sg var8;
      int var11;
      File var22;
      if (ac.exists()) {
         try {
            sy var7 = new sy(ac, "rw", 10000L);

            int var9;
            for(var8 = new sg((int)var7.au(2023426130)); var8.at * -1633313603 < var8.al.length; var8.at += -1516355947 * var9) {
               var9 = var7.ab(var8.al, -1633313603 * var8.at, var8.al.length - var8.at * -1633313603, 864855333);
               if (-1 == var9) {
                  throw new IOException();
               }
            }

            var8.at = 0;
            var9 = var8.cm((byte)7);
            if (var9 < 1 || var9 > 3) {
               throw new IOException("" + var9);
            }

            int var10 = 0;
            if (var9 > 1) {
               var10 = var8.cm((byte)7);
            }

            if (var9 <= 2) {
               var4 = var8.cj((short)-5554);
               if (var10 == 1) {
                  var5 = var8.cj((short)-12771);
               }
            } else {
               var4 = var8.ch(1699621261);
               if (1 == var10) {
                  var5 = var8.ch(2089501422);
               }
            }

            var7.aw((byte)-51);
         } catch (IOException var19) {
            var19.printStackTrace();
         }

         if (var4 != null) {
            var22 = new File(var4);
            if (!var22.exists()) {
               var4 = null;
            }
         }

         if (var4 != null) {
            var22 = new File(var4, "test.dat");

            boolean var24;
            try {
               RandomAccessFile var27 = new RandomAccessFile(var22, "rw");
               var11 = var27.read();
               var27.seek(0L);
               var27.write(var11);
               var27.seek(0L);
               var27.close();
               var22.delete();
               var24 = true;
            } catch (Exception var17) {
               var24 = false;
            }

            if (!var24) {
               var4 = null;
            }
         }
      }

      if (var4 == null && var2 == 0) {
         label134:
         for(int var20 = 0; var20 < dq.ar.length; ++var20) {
            for(int var23 = 0; var23 < fe.av.length; ++var23) {
               File var25 = new File(fe.av[var23] + dq.ar[var20] + File.separatorChar + var0 + File.separatorChar);
               if (var25.exists()) {
                  File var28 = new File(var25, "test.dat");

                  boolean var30;
                  try {
                     RandomAccessFile var12 = new RandomAccessFile(var28, "rw");
                     int var13 = var12.read();
                     var12.seek(0L);
                     var12.write(var13);
                     var12.seek(0L);
                     var12.close();
                     var28.delete();
                     var30 = true;
                  } catch (Exception var16) {
                     var30 = false;
                  }

                  if (var30) {
                     var4 = var25.toString();
                     var6 = true;
                     break label134;
                  }
               }
            }
         }
      }

      if (var4 == null) {
         var4 = hd.az + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var6 = true;
      }

      File var21;
      if (var5 != null) {
         var21 = new File(var5);
         var22 = new File(var4);

         try {
            File[] var26 = var21.listFiles();
            File[] var32 = var26;

            for(var11 = 0; var11 < var32.length; ++var11) {
               File var31 = var32[var11];
               File var34 = new File(var22, var31.getName());
               boolean var14 = var31.renameTo(var34);
               if (!var14) {
                  throw new IOException();
               }
            }
         } catch (Exception var18) {
            var18.printStackTrace();
         }

         var6 = true;
      }

      if (var6) {
         var21 = new File(var4);
         var8 = null;

         try {
            sy var29 = new sy(ac, "rw", 10000L);
            sg var33 = new sg(500);
            var33.bu(3, (byte)53);
            var33.bu(null != var8 ? 1 : 0, (byte)20);
            var33.ci(var21.getPath(), (byte)-115);
            if (var8 != null) {
               var33.ci(var8.getPath(), (byte)-49);
            }

            var29.an(var33.al, 0, -1633313603 * var33.at, 185047612);
            var29.aw((byte)-118);
         } catch (IOException var15) {
            var15.printStackTrace();
         }
      }

      return new File(var4);
   }

   gc() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "gc.<init>(" + ')');
      }
   }

   public static File au(String var0, String var1, int var2) {
      String var3 = var2 == 0 ? "" : "" + var2;
      ac = new File(hd.az, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      sg var8;
      int var11;
      File var22;
      if (ac.exists()) {
         try {
            sy var7 = new sy(ac, "rw", 10000L);

            int var9;
            for(var8 = new sg((int)var7.au(2089959036)); var8.at * -1633313603 < var8.al.length; var8.at += -1516355947 * var9) {
               var9 = var7.ab(var8.al, -1633313603 * var8.at, var8.al.length - var8.at * -1633313603, 1021032550);
               if (-1 == var9) {
                  throw new IOException();
               }
            }

            var8.at = 0;
            var9 = var8.cm((byte)7);
            if (var9 < 1 || var9 > 3) {
               throw new IOException("" + var9);
            }

            int var10 = 0;
            if (var9 > 1) {
               var10 = var8.cm((byte)7);
            }

            if (var9 <= 2) {
               var4 = var8.cj((short)-6844);
               if (var10 == 1) {
                  var5 = var8.cj((short)-21039);
               }
            } else {
               var4 = var8.ch(1604748104);
               if (1 == var10) {
                  var5 = var8.ch(1753984565);
               }
            }

            var7.aw((byte)-31);
         } catch (IOException var19) {
            var19.printStackTrace();
         }

         if (var4 != null) {
            var22 = new File(var4);
            if (!var22.exists()) {
               var4 = null;
            }
         }

         if (var4 != null) {
            var22 = new File(var4, "test.dat");

            boolean var24;
            try {
               RandomAccessFile var27 = new RandomAccessFile(var22, "rw");
               var11 = var27.read();
               var27.seek(0L);
               var27.write(var11);
               var27.seek(0L);
               var27.close();
               var22.delete();
               var24 = true;
            } catch (Exception var17) {
               var24 = false;
            }

            if (!var24) {
               var4 = null;
            }
         }
      }

      if (var4 == null && var2 == 0) {
         label134:
         for(int var20 = 0; var20 < dq.ar.length; ++var20) {
            for(int var23 = 0; var23 < fe.av.length; ++var23) {
               File var25 = new File(fe.av[var23] + dq.ar[var20] + File.separatorChar + var0 + File.separatorChar);
               if (var25.exists()) {
                  File var28 = new File(var25, "test.dat");

                  boolean var30;
                  try {
                     RandomAccessFile var12 = new RandomAccessFile(var28, "rw");
                     int var13 = var12.read();
                     var12.seek(0L);
                     var12.write(var13);
                     var12.seek(0L);
                     var12.close();
                     var28.delete();
                     var30 = true;
                  } catch (Exception var16) {
                     var30 = false;
                  }

                  if (var30) {
                     var4 = var25.toString();
                     var6 = true;
                     break label134;
                  }
               }
            }
         }
      }

      if (var4 == null) {
         var4 = hd.az + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var6 = true;
      }

      File var21;
      if (var5 != null) {
         var21 = new File(var5);
         var22 = new File(var4);

         try {
            File[] var26 = var21.listFiles();
            File[] var32 = var26;

            for(var11 = 0; var11 < var32.length; ++var11) {
               File var31 = var32[var11];
               File var34 = new File(var22, var31.getName());
               boolean var14 = var31.renameTo(var34);
               if (!var14) {
                  throw new IOException();
               }
            }
         } catch (Exception var18) {
            var18.printStackTrace();
         }

         var6 = true;
      }

      if (var6) {
         var21 = new File(var4);
         var8 = null;

         try {
            sy var29 = new sy(ac, "rw", 10000L);
            sg var33 = new sg(500);
            var33.bu(3, (byte)70);
            var33.bu(null != var8 ? 1 : 0, (byte)88);
            var33.ci(var21.getPath(), (byte)-86);
            if (var8 != null) {
               var33.ci(var8.getPath(), (byte)-26);
            }

            var29.an(var33.al, 0, -1633313603 * var33.at, 185047612);
            var29.aw((byte)-52);
         } catch (IOException var15) {
            var15.printStackTrace();
         }
      }

      return new File(var4);
   }

   public static sy aq(String var0, String var1, boolean var2) {
      File var3 = new File(my.au, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            sy var10 = new sy(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
         }
      }

      String var4 = "";
      if (-1185618340 == 1332374694 * ah) {
         var4 = "_rc";
      } else if (1856129774 == -1325133847 * ah) {
         var4 = "_wip";
      }

      File var5 = new File(hd.az, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      sy var6;
      if (!var2 && var5.exists()) {
         try {
            var6 = new sy(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
         }
      }

      try {
         var6 = new sy(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   public static void ai(sg var0, int var1) {
      if (null != ao) {
         try {
            ao.an(0L);
            ao.aq(var0.al, var1, 24, (byte)3);
         } catch (Exception var3) {
         }
      }

   }

   public static sy at(String var0, String var1, boolean var2) {
      File var3 = new File(my.au, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            sy var10 = new sy(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
         }
      }

      String var4 = "";
      if (33 == -1325133847 * ah) {
         var4 = "_rc";
      } else if (34 == -1325133847 * ah) {
         var4 = "_wip";
      }

      File var5 = new File(hd.az, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      sy var6;
      if (!var2 && var5.exists()) {
         try {
            var6 = new sy(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
         }
      }

      try {
         var6 = new sy(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   public static void ao() {
      try {
         File var0 = new File(hd.az, "random.dat");
         int var2;
         if (var0.exists()) {
            ao = new sj(new sy(var0, "rw", 25L), 24, 0);
         } else {
            label34:
            for(int var1 = 0; var1 < dq.ar.length; ++var1) {
               for(var2 = 0; var2 < fe.av.length; ++var2) {
                  File var3 = new File(fe.av[var2] + dq.ar[var1] + File.separatorChar + "random.dat");
                  if (var3.exists()) {
                     ao = new sj(new sy(var3, "rw", 25L), 24, 0);
                     break label34;
                  }
               }
            }
         }

         if (ao == null) {
            RandomAccessFile var5 = new RandomAccessFile(var0, "rw");
            var2 = var5.read();
            var5.seek(0L);
            var5.write(var2);
            var5.seek(0L);
            var5.close();
            ao = new sj(new sy(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var4) {
      }

   }

   public static void ay() {
      try {
         File var0 = new File(hd.az, "random.dat");
         int var2;
         if (var0.exists()) {
            ao = new sj(new sy(var0, "rw", 25L), 24, 0);
         } else {
            label34:
            for(int var1 = 0; var1 < dq.ar.length; ++var1) {
               for(var2 = 0; var2 < fe.av.length; ++var2) {
                  File var3 = new File(fe.av[var2] + dq.ar[var1] + File.separatorChar + "random.dat");
                  if (var3.exists()) {
                     ao = new sj(new sy(var3, "rw", 25L), 24, 0);
                     break label34;
                  }
               }
            }
         }

         if (ao == null) {
            RandomAccessFile var5 = new RandomAccessFile(var0, "rw");
            var2 = var5.read();
            var5.seek(0L);
            var5.write(var2);
            var5.seek(0L);
            var5.close();
            ao = new sj(new sy(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var4) {
      }

   }

   public static sy al(String var0, String var1, boolean var2) {
      File var3 = new File(my.au, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            sy var10 = new sy(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
         }
      }

      String var4 = "";
      if (1520906580 == -1325133847 * ah) {
         var4 = "_rc";
      } else if (-1268736961 == 596924080 * ah) {
         var4 = "_wip";
      }

      File var5 = new File(hd.az, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      sy var6;
      if (!var2 && var5.exists()) {
         try {
            var6 = new sy(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
         }
      }

      try {
         var6 = new sy(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   public static void ax() {
      try {
         File var0 = new File(hd.az, "random.dat");
         int var2;
         if (var0.exists()) {
            ao = new sj(new sy(var0, "rw", 25L), 24, 0);
         } else {
            label34:
            for(int var1 = 0; var1 < dq.ar.length; ++var1) {
               for(var2 = 0; var2 < fe.av.length; ++var2) {
                  File var3 = new File(fe.av[var2] + dq.ar[var1] + File.separatorChar + "random.dat");
                  if (var3.exists()) {
                     ao = new sj(new sy(var3, "rw", 25L), 24, 0);
                     break label34;
                  }
               }
            }
         }

         if (ao == null) {
            RandomAccessFile var5 = new RandomAccessFile(var0, "rw");
            var2 = var5.read();
            var5.seek(0L);
            var5.write(var2);
            var5.seek(0L);
            var5.close();
            ao = new sj(new sy(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var4) {
      }

   }

   public static sy aa(String var0, String var1, boolean var2) {
      File var3 = new File(my.au, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            sy var10 = new sy(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
         }
      }

      String var4 = "";
      if (33 == -1325133847 * ah) {
         var4 = "_rc";
      } else if (34 == -1325133847 * ah) {
         var4 = "_wip";
      }

      File var5 = new File(hd.az, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      sy var6;
      if (!var2 && var5.exists()) {
         try {
            var6 = new sy(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
         }
      }

      try {
         var6 = new sy(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   static final int ag(int var0, int var1, int var2, int var3, byte var4) {
      try {
         int var5 = 65536 - in.au[var2 * 1024 / var3] >> 1;
         return (var0 * (65536 - var5) >> 16) + (var1 * var5 >> 16);
      } catch (RuntimeException var6) {
         throw db.an(var6, "gc.ag(" + ')');
      }
   }
}
