import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class qg implements ko {
   sh af;

   qg() {
   }

   public void aw(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (0 == var3) {
            return;
         }

         qf[] var4 = new qf[]{qf.aw, qf.af, qf.ac, qf.an};
         qf var5 = (qf)StructType.findEnumerated(var4, var3);
         if (var5 != null) {
            switch (-1750512657 * var5.au) {
               case 1:
                  int var6 = var1.g1();
                  this.af = da.an_renamed(var6);
                  if (null != this.af) {
                     break;
                  }

                  throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
               case 2:
                  StructType.findEnumerated(Language.au_renamed(), var1.g1());
                  break;
               case 3:
                  var1.gjstr();
                  break;
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var5);
            }
         } else {
            this.af(var1, var3);
         }
      }
   }

   public static void af_renamed(PacketBit var0) {
      ReflectionCheck var2 = (ReflectionCheck)bt.af.last();
      if (null != var2) {
         int var3 = -1633313603 * var0.at;
         var0.ba(var2.af * 1600861545);

         for(int var4 = 0; var4 < var2.an * -153242533; ++var4) {
            if (var2.ac[var4] != 0) {
               var0.bu(var2.ac[var4]);
            } else {
               try {
                  int var5 = var2.aw[var4];
                  Field var6;
                  int var7;
                  if (var5 == 0) {
                     var6 = var2.au[var4];
                     var7 = var6.getInt((Object)null);
                     var0.bu(0);
                     var0.ba(var7);
                  } else if (var5 == 1) {
                     var6 = var2.au[var4];
                     var6.setInt((Object)null, var2.ab[var4]);
                     var0.bu(0);
                  } else if (var5 == 2) {
                     var6 = var2.au[var4];
                     var7 = var6.getModifiers();
                     var0.bu(0);
                     var0.ba(var7);
                  }

                  Method var23;
                  if (var5 != 3) {
                     if (4 == var5) {
                        var23 = var2.aq[var4];
                        var7 = var23.getModifiers();
                        var0.bu(0);
                        var0.ba(var7);
                     }
                  } else {
                     var23 = var2.aq[var4];
                     byte[][] var24 = var2.al[var4];
                     Object[] var8 = new Object[var24.length];

                     for(int var9 = 0; var9 < var24.length; ++var9) {
                        ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
                        var8[var9] = var10.readObject();
                     }

                     Object var25 = var23.invoke((Object)null, var8);
                     if (null == var25) {
                        var0.bu(0);
                     } else if (var25 instanceof Number) {
                        var0.bu(1);
                        var0.p8s(((Number)var25).longValue());
                     } else if (var25 instanceof String) {
                        var0.bu(2);
                        var0.bh((String)var25);
                     } else {
                        var0.bu(4);
                     }
                  }
               } catch (ClassNotFoundException var11) {
                  var0.bu(-10);
               } catch (InvalidClassException var12) {
                  var0.bu(-11);
               } catch (StreamCorruptedException var13) {
                  var0.bu(-12);
               } catch (OptionalDataException var14) {
                  var0.bu(-13);
               } catch (IllegalAccessException var15) {
                  var0.bu(-14);
               } catch (IllegalArgumentException var16) {
                  var0.bu(-15);
               } catch (InvocationTargetException var17) {
                  var0.bu(-16);
               } catch (SecurityException var18) {
                  var0.bu(-17);
               } catch (IOException var19) {
                  var0.bu(-18);
               } catch (NullPointerException var20) {
                  var0.bu(-19);
               } catch (Exception var21) {
                  var0.bu(-20);
               } catch (Throwable var22) {
                  var0.bu(-21);
               }
            }
         }

         var0.dg(var3);
         var2.remove();
      }
   }

   boolean ac() {
      return null != this.af;
   }

   Object au() {
      if (sh.af == this.af) {
         return 0;
      } else if (sh.an == this.af) {
         return -1L;
      } else {
         return this.af == sh.aw ? "" : null;
      }
   }

   public static void ay_renamed() {
      HitmarkType.ac.clear();
      HitmarkType.au.clear();
      HitmarkType.ab.clear();
   }

   abstract void af(Packet var1, int var2);
}
