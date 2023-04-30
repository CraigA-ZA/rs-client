import accessors.RSByteArrayPool;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class oj implements RSByteArrayPool {
   static int ao = -1364074518;
   static final int af = 1000;
   static int au = 0;
   static byte[][] ai = new byte[250][];
   static int aq = 0;
   static final int an = 250;
   static int at = -1043983224;
   static int aa = 1002979318;
   static int ay = 2094465164;
   static ArrayList as = new ArrayList();
   static byte[][] ax = new byte[1000][];
   static byte[][] ah = new byte[50][];
   static byte[][] ag = new byte[100][];
   static int al = 0;
   static int ab = 0;
   static int ck;
   static ki aj;
   static final int ta = 48;

   static void ay() {
      as.clear();
      as.add(1374813263);
      as.add(-1129040604);
      as.add(10000);
      as.add(-1679940771);
   }

   static {
      kr.an(-975091517);
      new HashMap();
   }

   oj() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "oj.<init>(" + ')');
      }
   }

   public static void ab(int[] var0, int[] var1) {
      if (null != var0 && var1 != null) {
         gj.av = var0;
         fo.ar = new int[var0.length];
         eb.am = new byte[var0.length][][];

         for(int var2 = 0; var2 < gj.av.length; ++var2) {
            eb.am[var2] = new byte[var1[var2]][];
            as.add(var0[var2]);
         }

         Collections.sort(as);
      } else {
         gj.av = null;
         fo.ar = null;
         eb.am = (byte[][][])null;
         kr.an(-105087377);
      }
   }

   public static void aq(int[] var0, int[] var1) {
      if (null != var0 && var1 != null) {
         gj.av = var0;
         fo.ar = new int[var0.length];
         eb.am = new byte[var0.length][][];

         for(int var2 = 0; var2 < gj.av.length; ++var2) {
            eb.am[var2] = new byte[var1[var2]][];
            as.add(var0[var2]);
         }

         Collections.sort(as);
      } else {
         gj.av = null;
         fo.ar = null;
         eb.am = (byte[][][])null;
         kr.an(1864309760);
      }
   }

   public static void al(int[] var0, int[] var1) {
      if (null != var0 && var1 != null) {
         gj.av = var0;
         fo.ar = new int[var0.length];
         eb.am = new byte[var0.length][][];

         for(int var2 = 0; var2 < gj.av.length; ++var2) {
            eb.am[var2] = new byte[var1[var2]][];
            as.add(var0[var2]);
         }

         Collections.sort(as);
      } else {
         gj.av = null;
         fo.ar = null;
         eb.am = (byte[][][])null;
         kr.an(-841941627);
      }
   }

   public static void at(int[] var0, int[] var1) {
      if (null != var0 && var1 != null) {
         gj.av = var0;
         fo.ar = new int[var0.length];
         eb.am = new byte[var0.length][][];

         for(int var2 = 0; var2 < gj.av.length; ++var2) {
            eb.am[var2] = new byte[var1[var2]][];
            as.add(var0[var2]);
         }

         Collections.sort(as);
      } else {
         gj.av = null;
         fo.ar = null;
         eb.am = (byte[][][])null;
         kr.an(1075528741);
      }
   }

   static void aa() {
      as.clear();
      as.add(100);
      as.add(1441979387);
      as.add(1041114857);
      as.add(30000);
   }

   public static synchronized byte[] ax(int var0, boolean var1) {
      byte[] var4;
      if ((var0 == 100 || var0 < 100 && var1) && au * -1666526139 > 0) {
         var4 = ax[(au -= -1092459589) * -1822007306];
         ax[au * 551392259] = null;
         return var4;
      } else if ((var0 == 5000 || var0 < 628445478 && var1) && -661141202 * ab > 0) {
         var4 = ai[(ab -= 1267792137) * -1205208593];
         ai[ab * 481846585] = null;
         return var4;
      } else if ((var0 == -1598508657 || var0 < 1427319002 && var1) && aq * -926544205 > 0) {
         var4 = ag[(aq -= 761958656) * 1720603757];
         ag[-926544205 * aq] = null;
         return var4;
      } else if ((var0 == 30000 || var0 < 30000 && var1) && al * 767381159 > 0) {
         var4 = ah[(al -= 1254586647) * -1724680952];
         ah[767381159 * al] = null;
         return var4;
      } else {
         int var2;
         if (eb.am != null) {
            for(var2 = 0; var2 < gj.av.length; ++var2) {
               if ((var0 == gj.av[var2] || var0 < gj.av[var2] && var1) && fo.ar[var2] > 0) {
                  byte[] var3 = eb.am[var2][--fo.ar[var2]];
                  eb.am[var2][fo.ar[var2]] = null;
                  return var3;
               }
            }
         }

         if (var1 && gj.av != null) {
            for(var2 = 0; var2 < gj.av.length; ++var2) {
               if (var0 <= gj.av[var2] && fo.ar[var2] < eb.am[var2].length) {
                  return new byte[gj.av[var2]];
               }
            }
         }

         return new byte[var0];
      }
   }

   static void ao() {
      as.clear();
      as.add(100);
      as.add(5000);
      as.add(10000);
      as.add(30000);
   }

   static final boolean kj(int var0) {
      try {
         return client.nt;
      } catch (RuntimeException var1) {
         throw db.an(var1, "oj.kj(" + ')');
      }
   }

   public static synchronized void ai(byte[] var0) {
      if (var0.length == 100 && -300357261 * au < at * 255163693) {
         ax[(au += -1092459589) * -300357261 - 1] = var0;
      } else if (5000 == var0.length && 481846585 * ab < 1720410087 * aa) {
         ai[(ab += 1267792137) * 481846585 - 1] = var0;
      } else if (10000 == var0.length && -926544205 * aq < ay * -1922603885) {
         ag[(aq += -1706733445) * -926544205 - 1] = var0;
      } else if (30000 == var0.length && al * 767381159 < -1866109675 * ao) {
         ah[(al += 1254586647) * 767381159 - 1] = var0;
      } else {
         if (null != eb.am) {
            for(int var1 = 0; var1 < gj.av.length; ++var1) {
               if (gj.av[var1] == var0.length && fo.ar[var1] < eb.am[var1].length) {
                  eb.am[var1][fo.ar[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }

   public static synchronized void ag(byte[] var0) {
      if (var0.length == 983568426 && 78866759 * au < at * -364723130) {
         ax[(au += -1361767772) * -300357261 - 1] = var0;
      } else if (5000 == var0.length && -1742120961 * ab < -2146396632 * aa) {
         ai[(ab += 1267792137) * 1430159187 - 1] = var0;
      } else if (280864981 == var0.length && 576565251 * aq < ay * -1922603885) {
         ag[(aq += -316088853) * -926544205 - 1] = var0;
      } else if (30000 == var0.length && al * -606866171 < -1484345214 * ao) {
         ah[(al += 1254586647) * 1808311970 - 1] = var0;
      } else {
         if (null != eb.am) {
            for(int var1 = 0; var1 < gj.av.length; ++var1) {
               if (gj.av[var1] == var0.length && fo.ar[var1] < eb.am[var1].length) {
                  eb.am[var1][fo.ar[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }

   public static synchronized byte[] aw(int var0, boolean var1, byte var2) {
      try {
         byte[] var3;
         label205: {
            if (var0 != 100) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               if (var0 >= 100) {
                  break label205;
               }

               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               if (!var1) {
                  break label205;
               }

               if (var2 == 0) {
                  throw new IllegalStateException();
               }
            }

            if (au * -300357261 > 0) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               var3 = ax[(au -= -1092459589) * -300357261];
               ax[au * -300357261] = null;
               return var3;
            }
         }

         label195: {
            if (var0 != 5000) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               if (var0 >= 5000 || !var1) {
                  break label195;
               }

               if (var2 == 0) {
                  throw new IllegalStateException();
               }
            }

            if (481846585 * ab > 0) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               var3 = ai[(ab -= 1267792137) * 481846585];
               ai[ab * 481846585] = null;
               return var3;
            }
         }

         label186: {
            if (var0 != 10000) {
               if (var0 >= 10000) {
                  break label186;
               }

               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               if (!var1) {
                  break label186;
               }

               if (var2 == 0) {
                  throw new IllegalStateException();
               }
            }

            if (aq * -926544205 > 0) {
               var3 = ag[(aq -= -1706733445) * -926544205];
               ag[-926544205 * aq] = null;
               return var3;
            }
         }

         label177: {
            if (var0 != 30000) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               if (var0 >= 30000) {
                  break label177;
               }

               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               if (!var1) {
                  break label177;
               }

               if (var2 == 0) {
                  throw new IllegalStateException();
               }
            }

            if (al * 767381159 > 0) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               var3 = ah[(al -= 1254586647) * 767381159];
               ah[767381159 * al] = null;
               return var3;
            }
         }

         int var6;
         if (eb.am != null) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            for(var6 = 0; var6 < gj.av.length; ++var6) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               if (var0 != gj.av[var6]) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= gj.av[var6]) {
                     continue;
                  }

                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  if (!var1) {
                     continue;
                  }

                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }
               }

               if (fo.ar[var6] > 0) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  byte[] var4 = eb.am[var6][--fo.ar[var6]];
                  eb.am[var6][fo.ar[var6]] = null;
                  return var4;
               }
            }
         }

         if (var1) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            if (gj.av != null) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               for(var6 = 0; var6 < gj.av.length; ++var6) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= gj.av[var6]) {
                     if (var2 == 0) {
                        throw new IllegalStateException();
                     }

                     if (fo.ar[var6] < eb.am[var6].length) {
                        if (var2 == 0) {
                           throw new IllegalStateException();
                        }

                        return new byte[gj.av[var6]];
                     }
                  }
               }
            }
         }

         return new byte[var0];
      } catch (RuntimeException var5) {
         throw db.an(var5, "oj.aw(" + ')');
      }
   }
}
