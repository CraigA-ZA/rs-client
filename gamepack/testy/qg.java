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

   qg(int var1) {
      try {
         super();
      } catch (RuntimeException var2) {
         throw db.an(var2, "qg.<init>(" + ')');
      }
   }

   public void aw(sg var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (0 == var3) {
               if (var2 == -253633021) {
                  return;
               }

               return;
            }

            qf[] var4 = new qf[]{qf.aw, qf.af, qf.ac, qf.an};
            qf var5 = (qf)ht.af(var4, var3, (short)173);
            if (var5 != null) {
               if (var2 == -253633021) {
                  return;
               }

               switch (-1750512657 * var5.au) {
                  case 1:
                     int var6 = var1.cm((byte)7);
                     this.af = da.an(var6, 1454430970);
                     if (null != this.af) {
                        break;
                     }

                     throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
                  case 2:
                     ht.af(nx.au((byte)-10), var1.cm((byte)7), (short)173);
                     break;
                  case 3:
                     var1.cj((short)-4885);
                     break;
                  default:
                     throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var5);
               }
            } else {
               this.af(var1, var3, 489961361);
            }
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "qg.aw(" + ')');
      }
   }

   abstract void af(sg var1, int var2, int var3);

   boolean ac(int var1) {
      try {
         boolean var10000;
         if (null != this.af) {
            if (var1 != -108666621) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "qg.ac(" + ')');
      }
   }

   Object ax() {
      if (sh.af == this.af) {
         return 0;
      } else if (sh.an == this.af) {
         return -1L;
      } else {
         return this.af == sh.aw ? "" : null;
      }
   }

   abstract void an(sg var1, int var2);

   public void ab(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         qf[] var3 = new qf[]{qf.aw, qf.af, qf.ac, qf.an};
         qf var4 = (qf)ht.af(var3, var2, (short)173);
         if (var4 != null) {
            switch (-1750512657 * var4.au) {
               case 1:
                  int var5 = var1.cm((byte)7);
                  this.af = da.an(var5, -504914257);
                  if (null != this.af) {
                     break;
                  }

                  throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
               case 2:
                  ht.af(nx.au((byte)-83), var1.cm((byte)7), (short)173);
                  break;
               case 3:
                  var1.cj((short)-15850);
                  break;
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
            }
         } else {
            this.af(var1, var2, -163012967);
         }
      }
   }

   public void aq(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         qf[] var3 = new qf[]{qf.aw, qf.af, qf.ac, qf.an};
         qf var4 = (qf)ht.af(var3, var2, (short)173);
         if (var4 != null) {
            switch (-1750512657 * var4.au) {
               case 1:
                  int var5 = var1.cm((byte)7);
                  this.af = da.an(var5, -2022571391);
                  if (null != this.af) {
                     break;
                  }

                  throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
               case 2:
                  ht.af(nx.au((byte)-20), var1.cm((byte)7), (short)173);
                  break;
               case 3:
                  var1.cj((short)-397);
                  break;
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
            }
         } else {
            this.af(var1, var2, -451202677);
         }
      }
   }

   Object au(int var1) {
      try {
         if (sh.af == this.af) {
            return 0;
         } else if (sh.an == this.af) {
            if (var1 != 1458153897) {
               throw new IllegalStateException();
            } else {
               return -1L;
            }
         } else if (this.af == sh.aw) {
            if (var1 != 1458153897) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else {
            return null;
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "qg.au(" + ')');
      }
   }

   boolean at() {
      return null != this.af;
   }

   public void al(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (0 == var2) {
            return;
         }

         qf[] var3 = new qf[]{qf.aw, qf.af, qf.ac, qf.an};
         qf var4 = (qf)ht.af(var3, var2, (short)173);
         if (var4 != null) {
            switch (-1750512657 * var4.au) {
               case 1:
                  int var5 = var1.cm((byte)7);
                  this.af = da.an(var5, -1584291508);
                  if (null != this.af) {
                     break;
                  }

                  throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
               case 2:
                  ht.af(nx.au((byte)-122), var1.cm((byte)7), (short)173);
                  break;
               case 3:
                  var1.cj((short)-13430);
                  break;
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
            }
         } else {
            this.af(var1, var2, -874082235);
         }
      }
   }

   boolean ay() {
      return null != this.af;
   }

   Object ai() {
      if (sh.af == this.af) {
         return 0;
      } else if (sh.an == this.af) {
         return -1L;
      } else {
         return this.af == sh.aw ? "" : null;
      }
   }

   Object ao() {
      if (sh.af == this.af) {
         return 0;
      } else if (sh.an == this.af) {
         return -1L;
      } else {
         return this.af == sh.aw ? "" : null;
      }
   }

   boolean aa() {
      return null != this.af;
   }

   public static void ay(int var0) {
      try {
         hb.ac.ac();
         hb.au.ac();
         hb.ab.ac();
      } catch (RuntimeException var1) {
         throw db.an(var1, "qg.ay(" + ')');
      }
   }

   public static void af(sq var0, byte var1) {
      try {
         bj var2 = (bj)bt.af.au();
         if (null != var2) {
            int var3 = -1633313603 * var0.at;
            var0.ba(var2.af * 1600861545, -2081835031);

            for(int var4 = 0; var4 < var2.an * -153242533; ++var4) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               if (var2.ac[var4] != 0) {
                  var0.bu(var2.ac[var4], (byte)75);
               } else {
                  try {
                     int var5 = var2.aw[var4];
                     Field var6;
                     int var7;
                     if (var5 == 0) {
                        if (var1 >= 1) {
                           return;
                        }

                        var6 = var2.au[var4];
                        var7 = var6.getInt((Object)null);
                        var0.bu(0, (byte)118);
                        var0.ba(var7, -2081835031);
                     } else if (var5 == 1) {
                        if (var1 >= 1) {
                           throw new IllegalStateException();
                        }

                        var6 = var2.au[var4];
                        var6.setInt((Object)null, var2.ab[var4]);
                        var0.bu(0, (byte)96);
                     } else if (var5 == 2) {
                        if (var1 >= 1) {
                           throw new IllegalStateException();
                        }

                        var6 = var2.au[var4];
                        var7 = var6.getModifiers();
                        var0.bu(0, (byte)62);
                        var0.ba(var7, -2081835031);
                     }

                     Method var24;
                     if (var5 != 3) {
                        if (4 == var5) {
                           if (var1 >= 1) {
                              throw new IllegalStateException();
                           }

                           var24 = var2.aq[var4];
                           var7 = var24.getModifiers();
                           var0.bu(0, (byte)102);
                           var0.ba(var7, -2081835031);
                        }
                     } else {
                        if (var1 >= 1) {
                           throw new IllegalStateException();
                        }

                        var24 = var2.aq[var4];
                        byte[][] var25 = var2.al[var4];
                        Object[] var8 = new Object[var25.length];

                        for(int var9 = 0; var9 < var25.length; ++var9) {
                           ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var25[var9]));
                           var8[var9] = var10.readObject();
                        }

                        Object var26 = var24.invoke((Object)null, var8);
                        if (null == var26) {
                           if (var1 >= 1) {
                              throw new IllegalStateException();
                           }

                           var0.bu(0, (byte)75);
                        } else if (var26 instanceof Number) {
                           if (var1 >= 1) {
                              throw new IllegalStateException();
                           }

                           var0.bu(1, (byte)92);
                           var0.bl(((Number)var26).longValue());
                        } else if (var26 instanceof String) {
                           var0.bu(2, (byte)71);
                           var0.bh((String)var26, -1787557412);
                        } else {
                           var0.bu(4, (byte)93);
                        }
                     }
                  } catch (ClassNotFoundException var11) {
                     var0.bu(-10, (byte)59);
                  } catch (InvalidClassException var12) {
                     var0.bu(-11, (byte)37);
                  } catch (StreamCorruptedException var13) {
                     var0.bu(-12, (byte)106);
                  } catch (OptionalDataException var14) {
                     var0.bu(-13, (byte)112);
                  } catch (IllegalAccessException var15) {
                     var0.bu(-14, (byte)93);
                  } catch (IllegalArgumentException var16) {
                     var0.bu(-15, (byte)59);
                  } catch (InvocationTargetException var17) {
                     var0.bu(-16, (byte)122);
                  } catch (SecurityException var18) {
                     var0.bu(-17, (byte)37);
                  } catch (IOException var19) {
                     var0.bu(-18, (byte)60);
                  } catch (NullPointerException var20) {
                     var0.bu(-19, (byte)18);
                  } catch (Exception var21) {
                     var0.bu(-20, (byte)51);
                  } catch (Throwable var22) {
                     var0.bu(-21, (byte)99);
                  }
               }
            }

            var0.dg(var3, -2013538167);
            var2.ga();
         }
      } catch (RuntimeException var23) {
         throw db.an(var23, "qg.af(" + ')');
      }
   }
}
