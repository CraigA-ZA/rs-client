import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class bt {
   static final int bi = 30;
   public static oi af = new oi();
   static tq[] jl;
   static int kx;
   static final int cd = 50;
   static final int ar = 512;
   static final int bz = 17;

   bt() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "bt.<init>(" + ')');
      }
   }

   public static void aq(sg var0, int var1) {
      bj var2 = new bj();
      var2.an = var0.cm((byte)7) * 16276435;
      var2.af = var0.cx(-1766033006) * 711502553;
      var2.aw = new int[-153242533 * var2.an];
      var2.ac = new int[var2.an * -153242533];
      var2.au = new Field[-153242533 * var2.an];
      var2.ab = new int[var2.an * -153242533];
      var2.aq = new Method[var2.an * -153242533];
      var2.al = new byte[-153242533 * var2.an][][];

      for(int var3 = 0; var3 < var2.an * -153242533; ++var3) {
         try {
            int var4 = var0.cm((byte)7);
            String var5;
            String var6;
            int var7;
            if (0 != var4 && var4 != 1 && 2 != var4) {
               if (3 == var4 || 4 == var4) {
                  var5 = var0.cw((byte)0);
                  var6 = var0.cw((byte)0);
                  var7 = var0.cm((byte)7);
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.cw((byte)0);
                  }

                  String var25 = var0.cw((byte)0);
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if (var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.cx(-2034506740);
                        var10[var11] = new byte[var12];
                        var0.ct(var10[var11], 0, var12, -1570744551);
                     }
                  }

                  var2.aw[var3] = var4;
                  Class[] var26 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var26[var12] = bz.aw(var8[var12], 1509587765);
                  }

                  Class var27 = bz.aw(var25, 1662469473);
                  if (bz.aw(var5, 1472762885).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = bz.aw(var5, 2133027428).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if (var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if (var17.length == var26.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var26.length; ++var19) {
                              if (var26[var19] != var17[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var27 == var16.getReturnType()) {
                              var2.aq[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.al[var3] = var10;
               }
            } else {
               var5 = var0.cw((byte)0);
               var6 = var0.cw((byte)0);
               var7 = 0;
               if (1 == var4) {
                  var7 = var0.cx(-891976923);
               }

               var2.aw[var3] = var4;
               var2.ab[var3] = var7;
               if (bz.aw(var5, 2032569480).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.au[var3] = bz.aw(var5, 1744867594).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.ac[var3] = -1;
         } catch (SecurityException var21) {
            var2.ac[var3] = -2;
         } catch (NullPointerException var22) {
            var2.ac[var3] = -3;
         } catch (Exception var23) {
            var2.ac[var3] = -4;
         } catch (Throwable var24) {
            var2.ac[var3] = -5;
         }
      }

      af.an(var2);
   }

   static final void la(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         int var7 = var2 - var0;
         int var8 = var3 - var1;
         int var10000;
         if (var7 >= 0) {
            if (var6 <= 0) {
               throw new IllegalStateException();
            }

            var10000 = var7;
         } else {
            var10000 = -var7;
         }

         int var9 = var10000;
         if (var8 >= 0) {
            if (var6 <= 0) {
               throw new IllegalStateException();
            }

            var10000 = var8;
         } else {
            var10000 = -var8;
         }

         int var10 = var10000;
         int var11 = var9;
         if (var9 < var10) {
            if (var6 <= 0) {
               throw new IllegalStateException();
            }

            var11 = var10;
         }

         if (0 != var11) {
            int var12 = (var7 << 16) / var11;
            int var13 = (var8 << 16) / var11;
            if (var13 <= var12) {
               var12 = -var12;
            } else {
               var13 = -var13;
            }

            int var14 = var5 * var13 >> 17;
            int var15 = 1 + var13 * var5 >> 17;
            int var16 = var12 * var5 >> 17;
            int var17 = var5 * var12 + 1 >> 17;
            var0 -= th.bk;
            var1 -= th.bi;
            int var18 = var0 + var14;
            int var19 = var0 - var15;
            int var20 = var7 + var0 - var15;
            int var21 = var0 + var7 + var14;
            int var22 = var16 + var1;
            int var23 = var1 - var17;
            int var24 = var1 + var8 - var17;
            int var25 = var1 + var8 + var16;
            gz.ag(var18, var19, var20, -1740756415);
            fw.av(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4, -515253774);
            gz.ag(var18, var20, var21, -1740756415);
            fw.av(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4, 714212921);
         }
      } catch (RuntimeException var26) {
         throw db.an(var26, "bt.la(" + ')');
      }
   }

   public static void ab(sg var0, int var1) {
      bj var2 = new bj();
      var2.an = var0.cm((byte)7) * 16276435;
      var2.af = var0.cx(-1164544920) * 711502553;
      var2.aw = new int[-153242533 * var2.an];
      var2.ac = new int[var2.an * -153242533];
      var2.au = new Field[-153242533 * var2.an];
      var2.ab = new int[var2.an * -153242533];
      var2.aq = new Method[var2.an * -153242533];
      var2.al = new byte[-153242533 * var2.an][][];

      for(int var3 = 0; var3 < var2.an * -153242533; ++var3) {
         try {
            int var4 = var0.cm((byte)7);
            String var5;
            String var6;
            int var7;
            if (0 != var4 && var4 != 1 && 2 != var4) {
               if (3 == var4 || 4 == var4) {
                  var5 = var0.cw((byte)0);
                  var6 = var0.cw((byte)0);
                  var7 = var0.cm((byte)7);
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.cw((byte)0);
                  }

                  String var25 = var0.cw((byte)0);
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if (var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.cx(-1437229668);
                        var10[var11] = new byte[var12];
                        var0.ct(var10[var11], 0, var12, -1570744551);
                     }
                  }

                  var2.aw[var3] = var4;
                  Class[] var26 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var26[var12] = bz.aw(var8[var12], 1620841152);
                  }

                  Class var27 = bz.aw(var25, 1114254348);
                  if (bz.aw(var5, 1351533558).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = bz.aw(var5, 2062334865).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if (var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if (var17.length == var26.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var26.length; ++var19) {
                              if (var26[var19] != var17[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var27 == var16.getReturnType()) {
                              var2.aq[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.al[var3] = var10;
               }
            } else {
               var5 = var0.cw((byte)0);
               var6 = var0.cw((byte)0);
               var7 = 0;
               if (1 == var4) {
                  var7 = var0.cx(-1376488618);
               }

               var2.aw[var3] = var4;
               var2.ab[var3] = var7;
               if (bz.aw(var5, 1287997626).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.au[var3] = bz.aw(var5, 1118453323).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.ac[var3] = -1;
         } catch (SecurityException var21) {
            var2.ac[var3] = -2;
         } catch (NullPointerException var22) {
            var2.ac[var3] = -3;
         } catch (Exception var23) {
            var2.ac[var3] = -4;
         } catch (Throwable var24) {
            var2.ac[var3] = -5;
         }
      }

      af.an(var2);
   }

   static final void it(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      try {
         if (var2 < 1) {
            if (var5 <= -1897736046) {
               throw new IllegalStateException();
            }

            var2 = 1;
         }

         if (var3 < 1) {
            if (var5 <= -1897736046) {
               throw new IllegalStateException();
            }

            var3 = 1;
         }

         int var6 = var3 - 334;
         int var7;
         if (var6 < 0) {
            if (var5 <= -1897736046) {
               throw new IllegalStateException();
            }

            var7 = client.vv;
         } else if (var6 >= 100) {
            if (var5 <= -1897736046) {
               throw new IllegalStateException();
            }

            var7 = client.va;
         } else {
            var7 = var6 * (client.va - client.vv) / 100 + client.vv;
         }

         int var8 = var3 * var7 * 512 / (var2 * 334);
         int var9;
         int var10;
         short var18;
         if (var8 < client.vo) {
            if (var5 <= -1897736046) {
               throw new IllegalStateException();
            }

            var18 = client.vo;
            var7 = var2 * var18 * 334 / (512 * var3);
            if (var7 > client.vn) {
               if (var5 <= -1897736046) {
                  throw new IllegalStateException();
               }

               var7 = client.vn;
               var9 = 512 * var7 * var3 / (var18 * 334);
               var10 = (var2 - var9) / 2;
               if (var4) {
                  if (var5 <= -1897736046) {
                     throw new IllegalStateException();
                  }

                  th.eu();
                  th.em(var0, var1, var10, var3, -16777216);
                  th.em(var2 + var0 - var10, var1, var10, var3, -16777216);
               }

               var0 += var10;
               var2 -= var10 * 2;
            }
         } else if (var8 > client.vk) {
            if (var5 <= -1897736046) {
               throw new IllegalStateException();
            }

            var18 = client.vk;
            var7 = var2 * var18 * 334 / (512 * var3);
            if (var7 < client.vm) {
               if (var5 <= -1897736046) {
                  throw new IllegalStateException();
               }

               var7 = client.vm;
               var9 = var2 * var18 * 334 / (var7 * 512);
               var10 = (var3 - var9) / 2;
               if (var4) {
                  if (var5 <= -1897736046) {
                     throw new IllegalStateException();
                  }

                  th.eu();
                  th.em(var0, var1, var2, var10, -16777216);
                  th.em(var0, var1 + var3 - var10, var2, var10, -16777216);
               }

               var1 += var10;
               var3 -= var10 * 2;
            }
         }

         label147: {
            client.vi = -787687633 * (var3 * var7 / 334);
            if (var2 == client.vp * 433849721) {
               if (2042096749 * client.vy == var3) {
                  break label147;
               }

               if (var5 <= -1897736046) {
                  throw new IllegalStateException();
               }
            }

            int[] var19 = new int[9];

            for(var10 = 0; var10 < var19.length; ++var10) {
               if (var5 <= -1897736046) {
                  throw new IllegalStateException();
               }

               int var11 = var10 * 32 + 128 + 15;
               int var12 = jm.hv(var11, (byte)-4);
               int var13 = in.ac[var11];
               int var15 = var3 - 334;
               if (var15 < 0) {
                  var15 = 0;
               } else if (var15 > 100) {
                  if (var5 <= -1897736046) {
                     return;
                  }

                  var15 = 100;
               }

               int var16 = client.vl + var15 * (client.ve - client.vl) / 100;
               int var14 = var12 * var16 / 256;
               var19[var10] = var14 * var13 >> 16;
            }

            ie.bd(var19, 500, 800, 334 * var2 / var3, 334);
         }

         client.vd = var0 * -1528400137;
         client.vx = var1 * 2017169511;
         client.vp = var2 * -350989111;
         client.vy = var3 * -538378907;
      } catch (RuntimeException var17) {
         throw db.an(var17, "bt.it(" + ')');
      }
   }

   static Class al(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return Byte.TYPE;
      } else if (var0.equals("I")) {
         return Integer.TYPE;
      } else if (var0.equals("S")) {
         return Short.TYPE;
      } else if (var0.equals("J")) {
         return Long.TYPE;
      } else if (var0.equals("Z")) {
         return Boolean.TYPE;
      } else if (var0.equals("F")) {
         return Float.TYPE;
      } else if (var0.equals("D")) {
         return Double.TYPE;
      } else if (var0.equals("C")) {
         return Character.TYPE;
      } else {
         return var0.equals("void") ? Void.TYPE : Class.forName(var0);
      }
   }

   public static void au(sq var0) {
      bj var1 = (bj)af.au();
      if (null != var1) {
         int var2 = -1633313603 * var0.at;
         var0.ba(var1.af * 1600861545, -2081835031);

         for(int var3 = 0; var3 < var1.an * -153242533; ++var3) {
            if (var1.ac[var3] != 0) {
               var0.bu(var1.ac[var3], (byte)26);
            } else {
               try {
                  int var4 = var1.aw[var3];
                  Field var5;
                  int var6;
                  if (var4 == 0) {
                     var5 = var1.au[var3];
                     var6 = var5.getInt((Object)null);
                     var0.bu(0, (byte)47);
                     var0.ba(var6, -2081835031);
                  } else if (var4 == 1) {
                     var5 = var1.au[var3];
                     var5.setInt((Object)null, var1.ab[var3]);
                     var0.bu(0, (byte)71);
                  } else if (var4 == 2) {
                     var5 = var1.au[var3];
                     var6 = var5.getModifiers();
                     var0.bu(0, (byte)85);
                     var0.ba(var6, -2081835031);
                  }

                  Method var22;
                  if (var4 != 3) {
                     if (4 == var4) {
                        var22 = var1.aq[var3];
                        var6 = var22.getModifiers();
                        var0.bu(0, (byte)22);
                        var0.ba(var6, -2081835031);
                     }
                  } else {
                     var22 = var1.aq[var3];
                     byte[][] var23 = var1.al[var3];
                     Object[] var7 = new Object[var23.length];

                     for(int var8 = 0; var8 < var23.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var23[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var24 = var22.invoke((Object)null, var7);
                     if (null == var24) {
                        var0.bu(0, (byte)127);
                     } else if (var24 instanceof Number) {
                        var0.bu(1, (byte)56);
                        var0.bl(((Number)var24).longValue());
                     } else if (var24 instanceof String) {
                        var0.bu(2, (byte)55);
                        var0.bh((String)var24, -1826907593);
                     } else {
                        var0.bu(4, (byte)22);
                     }
                  }
               } catch (ClassNotFoundException var10) {
                  var0.bu(-10, (byte)86);
               } catch (InvalidClassException var11) {
                  var0.bu(-11, (byte)11);
               } catch (StreamCorruptedException var12) {
                  var0.bu(-12, (byte)71);
               } catch (OptionalDataException var13) {
                  var0.bu(-13, (byte)42);
               } catch (IllegalAccessException var14) {
                  var0.bu(-14, (byte)125);
               } catch (IllegalArgumentException var15) {
                  var0.bu(-15, (byte)70);
               } catch (InvocationTargetException var16) {
                  var0.bu(-16, (byte)114);
               } catch (SecurityException var17) {
                  var0.bu(-17, (byte)22);
               } catch (IOException var18) {
                  var0.bu(-18, (byte)65);
               } catch (NullPointerException var19) {
                  var0.bu(-19, (byte)75);
               } catch (Exception var20) {
                  var0.bu(-20, (byte)93);
               } catch (Throwable var21) {
                  var0.bu(-21, (byte)50);
               }
            }
         }

         var0.dg(var2, 261084734);
         var1.ga();
      }
   }

   public static void ac(sq var0) {
      bj var1 = (bj)af.au();
      if (null != var1) {
         int var2 = -1633313603 * var0.at;
         var0.ba(var1.af * 1600861545, -2081835031);

         for(int var3 = 0; var3 < var1.an * -153242533; ++var3) {
            if (var1.ac[var3] != 0) {
               var0.bu(var1.ac[var3], (byte)50);
            } else {
               try {
                  int var4 = var1.aw[var3];
                  Field var5;
                  int var6;
                  if (var4 == 0) {
                     var5 = var1.au[var3];
                     var6 = var5.getInt((Object)null);
                     var0.bu(0, (byte)108);
                     var0.ba(var6, -2081835031);
                  } else if (var4 == 1) {
                     var5 = var1.au[var3];
                     var5.setInt((Object)null, var1.ab[var3]);
                     var0.bu(0, (byte)38);
                  } else if (var4 == 2) {
                     var5 = var1.au[var3];
                     var6 = var5.getModifiers();
                     var0.bu(0, (byte)67);
                     var0.ba(var6, -2081835031);
                  }

                  Method var22;
                  if (var4 != 3) {
                     if (4 == var4) {
                        var22 = var1.aq[var3];
                        var6 = var22.getModifiers();
                        var0.bu(0, (byte)80);
                        var0.ba(var6, -2081835031);
                     }
                  } else {
                     var22 = var1.aq[var3];
                     byte[][] var23 = var1.al[var3];
                     Object[] var7 = new Object[var23.length];

                     for(int var8 = 0; var8 < var23.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var23[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var24 = var22.invoke((Object)null, var7);
                     if (null == var24) {
                        var0.bu(0, (byte)116);
                     } else if (var24 instanceof Number) {
                        var0.bu(1, (byte)65);
                        var0.bl(((Number)var24).longValue());
                     } else if (var24 instanceof String) {
                        var0.bu(2, (byte)73);
                        var0.bh((String)var24, -2054216186);
                     } else {
                        var0.bu(4, (byte)88);
                     }
                  }
               } catch (ClassNotFoundException var10) {
                  var0.bu(-10, (byte)2);
               } catch (InvalidClassException var11) {
                  var0.bu(-11, (byte)117);
               } catch (StreamCorruptedException var12) {
                  var0.bu(-12, (byte)66);
               } catch (OptionalDataException var13) {
                  var0.bu(-2061583612, (byte)29);
               } catch (IllegalAccessException var14) {
                  var0.bu(-14, (byte)34);
               } catch (IllegalArgumentException var15) {
                  var0.bu(-15, (byte)46);
               } catch (InvocationTargetException var16) {
                  var0.bu(864057074, (byte)52);
               } catch (SecurityException var17) {
                  var0.bu(-17, (byte)126);
               } catch (IOException var18) {
                  var0.bu(-18, (byte)56);
               } catch (NullPointerException var19) {
                  var0.bu(-19, (byte)29);
               } catch (Exception var20) {
                  var0.bu(-20, (byte)2);
               } catch (Throwable var21) {
                  var0.bu(-21, (byte)111);
               }
            }
         }

         var0.dg(var2, 56604042);
         var1.ga();
      }
   }

   static void ie(byte var0) {
      try {
         if (null != ey.wt) {
            ey.wt.ao(bm.mh * -1727408401, (1144428983 * lq.mi.bx >> 7) + -1232093375 * jm.ib, 827352769 * jj.jc + (lq.mi.bo * -411750205 >> 7), false, (byte)15);
            ey.wt.bb(216165054);
         }

      } catch (RuntimeException var1) {
         throw db.an(var1, "bt.ie(" + ')');
      }
   }

   static final void no(int var0) {
      try {
         client.qy = client.qu * 1321175015;
         dc.sv = true;
      } catch (RuntimeException var1) {
         throw db.an(var1, "bt.no(" + ')');
      }
   }
}
