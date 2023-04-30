import accessors.RSUserComparator3;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class eb extends pz implements RSUserComparator3 {
   public static final int ax = 11;
   final boolean af;
   public static nm bb;
   static final int wv = 600;
   static final int aq = 4095;
   static byte[][][] am;

   int af(pb var1, pb var2, byte var3) {
      try {
         if (var1.au * 177258591 != var2.au * 177258591) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            } else {
               int var10000;
               if (this.af) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  var10000 = 177258591 * var1.au - var2.au * 177258591;
               } else {
                  var10000 = var2.au * 177258591 - var1.au * 177258591;
               }

               return var10000;
            }
         } else {
            return this.ao(var1, var2, 641920470);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "eb.af(" + ')');
      }
   }

   public static tq[] an(nm var0, int var1, int var2, int var3) {
      try {
         byte[] var5 = var0.bh(var1, var2, (byte)-22);
         boolean var4;
         if (null == var5) {
            if (var3 != 1271520368) {
               throw new IllegalStateException();
            }

            var4 = false;
         } else {
            sb.aa(var5, 1145263442);
            var4 = true;
         }

         if (!var4) {
            return null;
         } else {
            tq[] var6 = new tq[tx.af * 1606065339];

            for(int var7 = 0; var7 < 1606065339 * tx.af; ++var7) {
               if (var3 != 1271520368) {
                  throw new IllegalStateException();
               }

               tq var8 = var6[var7] = new tq();
               var8.ab = -822007097 * tx.an;
               var8.aq = tx.aw * 378525975;
               var8.ac = tx.ac[var7];
               var8.au = ar.au[var7];
               var8.an = dd.ab[var7];
               var8.aw = fd.aq[var7];
               int var9 = var8.aw * var8.an;
               byte[] var10 = hg.at[var7];
               var8.af = new int[var9];

               for(int var11 = 0; var11 < var9; ++var11) {
                  var8.af[var11] = pc.al[var10[var11] & 255];
               }
            }

            pk.ay(-262861184);
            return var6;
         }
      } catch (RuntimeException var12) {
         throw db.an(var12, "eb.an(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.af((pb)var1, (pb)var2, (byte)-10);
      } catch (RuntimeException var3) {
         throw db.an(var3, "eb.compare(" + ')');
      }
   }

   public int au(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, (byte)-105);
   }

   public int ab(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, (byte)-106);
   }

   int aw(pb var1, pb var2) {
      if (var1.au * 177258591 != var2.au * 177258591) {
         return this.af ? -944512681 * var1.au - var2.au * 720461912 : var2.au * 700092822 - var1.au * -861481819;
      } else {
         return this.ao(var1, var2, 641920470);
      }
   }

   public int al(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, (byte)-6);
   }

   public int aq(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, (byte)-100);
   }

   int an(pb var1, pb var2) {
      if (var1.au * 177258591 != var2.au * 177258591) {
         return this.af ? 177258591 * var1.au - var2.au * 177258591 : var2.au * 177258591 - var1.au * 177258591;
      } else {
         return this.ao(var1, var2, 641920470);
      }
   }

   static int bo(int var0, ch var1, boolean var2, int var3) {
      try {
         int var5;
         int var11;
         if (var0 == 4000) {
            if (var3 <= -204312908) {
               throw new IllegalStateException();
            } else {
               cy.at -= 854271946;
               var11 = cy.al[cy.at * -964267539];
               var5 = cy.al[1 + cy.at * -964267539];
               cy.al[(cy.at += 427135973) * -964267539 - 1] = var5 + var11;
               return 1;
            }
         } else if (var0 == 4001) {
            cy.at -= 854271946;
            var11 = cy.al[-964267539 * cy.at];
            var5 = cy.al[1 + -964267539 * cy.at];
            cy.al[(cy.at += 427135973) * -964267539 - 1] = var11 - var5;
            return 1;
         } else if (4002 == var0) {
            if (var3 <= -204312908) {
               throw new IllegalStateException();
            } else {
               cy.at -= 854271946;
               var11 = cy.al[cy.at * -964267539];
               var5 = cy.al[1 + -964267539 * cy.at];
               cy.al[(cy.at += 427135973) * -964267539 - 1] = var11 * var5;
               return 1;
            }
         } else if (var0 == 4003) {
            cy.at -= 854271946;
            var11 = cy.al[cy.at * -964267539];
            var5 = cy.al[cy.at * -964267539 + 1];
            cy.al[(cy.at += 427135973) * -964267539 - 1] = var11 / var5;
            return 1;
         } else if (var0 == 4004) {
            if (var3 <= -204312908) {
               throw new IllegalStateException();
            } else {
               var11 = cy.al[(cy.at -= 427135973) * -964267539];
               cy.al[(cy.at += 427135973) * -964267539 - 1] = (int)(Math.random() * (double)var11);
               return 1;
            }
         } else if (4005 == var0) {
            if (var3 <= -204312908) {
               throw new IllegalStateException();
            } else {
               var11 = cy.al[(cy.at -= 427135973) * -964267539];
               cy.al[(cy.at += 427135973) * -964267539 - 1] = (int)(Math.random() * (double)(1 + var11));
               return 1;
            }
         } else {
            int var6;
            int var7;
            int var8;
            if (4006 == var0) {
               if (var3 <= -204312908) {
                  throw new IllegalStateException();
               } else {
                  cy.at -= 2135679865;
                  var11 = cy.al[cy.at * -964267539];
                  var5 = cy.al[cy.at * -964267539 + 1];
                  var6 = cy.al[cy.at * -964267539 + 2];
                  var7 = cy.al[cy.at * -964267539 + 3];
                  var8 = cy.al[4 + cy.at * -964267539];
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = var11 + (var8 - var6) * (var5 - var11) / (var7 - var6);
                  return 1;
               }
            } else if (4007 == var0) {
               if (var3 <= -204312908) {
                  throw new IllegalStateException();
               } else {
                  cy.at -= 854271946;
                  var11 = cy.al[-964267539 * cy.at];
                  var5 = cy.al[cy.at * -964267539 + 1];
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = var11 * var5 / 100 + var11;
                  return 1;
               }
            } else if (4008 == var0) {
               if (var3 <= -204312908) {
                  throw new IllegalStateException();
               } else {
                  cy.at -= 854271946;
                  var11 = cy.al[cy.at * -964267539];
                  var5 = cy.al[1 + -964267539 * cy.at];
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = var11 | 1 << var5;
                  return 1;
               }
            } else if (var0 == 4009) {
               cy.at -= 854271946;
               var11 = cy.al[-964267539 * cy.at];
               var5 = cy.al[cy.at * -964267539 + 1];
               cy.al[(cy.at += 427135973) * -964267539 - 1] = var11 & -1 - (1 << var5);
               return 1;
            } else {
               int[] var10000;
               int var10001;
               if (var0 == 4010) {
                  if (var3 <= -204312908) {
                     throw new IllegalStateException();
                  } else {
                     cy.at -= 854271946;
                     var11 = cy.al[-964267539 * cy.at];
                     var5 = cy.al[1 + cy.at * -964267539];
                     var10000 = cy.al;
                     var10001 = (cy.at += 427135973) * -964267539 - 1;
                     byte var15;
                     if (0 != (var11 & 1 << var5)) {
                        if (var3 <= -204312908) {
                           throw new IllegalStateException();
                        }

                        var15 = 1;
                     } else {
                        var15 = 0;
                     }

                     var10000[var10001] = var15;
                     return 1;
                  }
               } else if (4011 == var0) {
                  if (var3 <= -204312908) {
                     throw new IllegalStateException();
                  } else {
                     cy.at -= 854271946;
                     var11 = cy.al[cy.at * -964267539];
                     var5 = cy.al[1 + -964267539 * cy.at];
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = var11 % var5;
                     return 1;
                  }
               } else if (4012 == var0) {
                  cy.at -= 854271946;
                  var11 = cy.al[cy.at * -964267539];
                  var5 = cy.al[cy.at * -964267539 + 1];
                  if (var11 == 0) {
                     if (var3 <= -204312908) {
                        throw new IllegalStateException();
                     }

                     cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                  } else {
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = (int)Math.pow((double)var11, (double)var5);
                  }

                  return 1;
               } else if (var0 == 4013) {
                  cy.at -= 854271946;
                  var11 = cy.al[cy.at * -964267539];
                  var5 = cy.al[-964267539 * cy.at + 1];
                  if (0 == var11) {
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                     return 1;
                  } else {
                     switch (var5) {
                        case 0:
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = Integer.MAX_VALUE;
                           break;
                        case 1:
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = var11;
                           break;
                        case 2:
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = (int)Math.sqrt((double)var11);
                           break;
                        case 3:
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = (int)Math.cbrt((double)var11);
                           break;
                        case 4:
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = (int)Math.sqrt(Math.sqrt((double)var11));
                           break;
                        default:
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = (int)Math.pow((double)var11, 1.0 / (double)var5);
                     }

                     return 1;
                  }
               } else if (var0 == 4014) {
                  if (var3 <= -204312908) {
                     throw new IllegalStateException();
                  } else {
                     cy.at -= 854271946;
                     var11 = cy.al[-964267539 * cy.at];
                     var5 = cy.al[1 + -964267539 * cy.at];
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = var11 & var5;
                     return 1;
                  }
               } else if (var0 == 4015) {
                  if (var3 <= -204312908) {
                     throw new IllegalStateException();
                  } else {
                     cy.at -= 854271946;
                     var11 = cy.al[cy.at * -964267539];
                     var5 = cy.al[cy.at * -964267539 + 1];
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = var11 | var5;
                     return 1;
                  }
               } else {
                  int var10002;
                  if (4016 == var0) {
                     if (var3 <= -204312908) {
                        throw new IllegalStateException();
                     } else {
                        cy.at -= 854271946;
                        var11 = cy.al[-964267539 * cy.at];
                        var5 = cy.al[1 + cy.at * -964267539];
                        var10000 = cy.al;
                        var10001 = (cy.at += 427135973) * -964267539 - 1;
                        if (var11 < var5) {
                           if (var3 <= -204312908) {
                              throw new IllegalStateException();
                           }

                           var10002 = var11;
                        } else {
                           var10002 = var5;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     }
                  } else if (4017 == var0) {
                     if (var3 <= -204312908) {
                        throw new IllegalStateException();
                     } else {
                        cy.at -= 854271946;
                        var11 = cy.al[-964267539 * cy.at];
                        var5 = cy.al[cy.at * -964267539 + 1];
                        var10000 = cy.al;
                        var10001 = (cy.at += 427135973) * -964267539 - 1;
                        if (var11 > var5) {
                           if (var3 <= -204312908) {
                              throw new IllegalStateException();
                           }

                           var10002 = var11;
                        } else {
                           var10002 = var5;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     }
                  } else if (4018 == var0) {
                     cy.at -= 1281407919;
                     long var12 = (long)cy.al[-964267539 * cy.at];
                     long var13 = (long)cy.al[-964267539 * cy.at + 1];
                     long var14 = (long)cy.al[2 + -964267539 * cy.at];
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = (int)(var14 * var12 / var13);
                     return 1;
                  } else if (var0 == 4025) {
                     if (var3 <= -204312908) {
                        throw new IllegalStateException();
                     } else {
                        var11 = am.aw(cy.al[(cy.at -= 427135973) * -964267539], -84303745);
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var11;
                        return 1;
                     }
                  } else if (var0 == 4026) {
                     cy.at -= 854271946;
                     var11 = cy.al[cy.at * -964267539];
                     var5 = cy.al[1 + cy.at * -964267539];
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = var11 ^ 1 << var5;
                     return 1;
                  } else if (var0 == 4027) {
                     if (var3 <= -204312908) {
                        throw new IllegalStateException();
                     } else {
                        cy.at -= 1281407919;
                        var11 = cy.al[-964267539 * cy.at];
                        var5 = cy.al[-964267539 * cy.at + 1];
                        var6 = cy.al[2 + -964267539 * cy.at];
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = fl.au(var11, var5, var6, (byte)0);
                        return 1;
                     }
                  } else if (4028 == var0) {
                     if (var3 <= -204312908) {
                        throw new IllegalStateException();
                     } else {
                        cy.at -= 1281407919;
                        var11 = cy.al[-964267539 * cy.at];
                        var5 = cy.al[1 + cy.at * -964267539];
                        var6 = cy.al[-964267539 * cy.at + 2];
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = ad.ac(var11, var5, var6, 1551365421);
                        return 1;
                     }
                  } else if (var0 == 4029) {
                     if (var3 <= -204312908) {
                        throw new IllegalStateException();
                     } else {
                        cy.at -= 1281407919;
                        var11 = cy.al[cy.at * -964267539];
                        var5 = cy.al[-964267539 * cy.at + 1];
                        var6 = cy.al[2 + cy.at * -964267539];
                        var7 = 31 - var6;
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var11 << var7 >>> var5 + var7;
                        return 1;
                     }
                  } else if (4030 == var0) {
                     cy.at -= 1708543892;
                     var11 = cy.al[-964267539 * cy.at];
                     var5 = cy.al[-964267539 * cy.at + 1];
                     var6 = cy.al[2 + cy.at * -964267539];
                     var7 = cy.al[-964267539 * cy.at + 3];
                     var11 = ad.ac(var11, var6, var7, 2061953545);
                     var8 = fn.an(var7 - var6 + 1, (byte)81);
                     if (var5 > var8) {
                        if (var3 <= -204312908) {
                           throw new IllegalStateException();
                        }

                        var5 = var8;
                     }

                     cy.al[(cy.at += 427135973) * -964267539 - 1] = var11 | var5 << var6;
                     return 1;
                  } else if (4032 == var0) {
                     if (var3 <= -204312908) {
                        throw new IllegalStateException();
                     } else {
                        cy.al[cy.at * -964267539 - 1] = dj.aw(cy.al[-964267539 * cy.at - 1], -1961239650);
                        return 1;
                     }
                  } else if (var0 == 4033) {
                     cy.al[cy.at * -964267539 - 1] = px.ac(cy.al[-964267539 * cy.at - 1], (byte)0);
                     return 1;
                  } else if (var0 == 4034) {
                     if (var3 <= -204312908) {
                        throw new IllegalStateException();
                     } else {
                        cy.at -= 854271946;
                        var11 = cy.al[cy.at * -964267539];
                        var5 = cy.al[cy.at * -964267539 + 1];
                        var6 = ea.an(var11, var5, 62977818);
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var6;
                        return 1;
                     }
                  } else if (var0 == 4035) {
                     if (var3 <= -204312908) {
                        throw new IllegalStateException();
                     } else {
                        cy.al[cy.at * -964267539 - 1] = Math.abs(cy.al[cy.at * -964267539 - 1]);
                        return 1;
                     }
                  } else if (4036 == var0) {
                     if (var3 <= -204312908) {
                        throw new IllegalStateException();
                     } else {
                        String var4 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                        var5 = -1;
                        if (jb.an(var4, -634424436)) {
                           if (var3 <= -204312908) {
                              throw new IllegalStateException();
                           }

                           var5 = lg.ac(var4, (byte)46);
                        }

                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var5;
                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw db.an(var10, "eb.bo(" + ')');
      }
   }

   public static void an(sg var0, int var1, int var2) {
      try {
         bj var3 = new bj();
         var3.an = var0.cm((byte)7) * 16276435;
         var3.af = var0.cx(-1804398679) * 711502553;
         var3.aw = new int[-153242533 * var3.an];
         var3.ac = new int[var3.an * -153242533];
         var3.au = new Field[-153242533 * var3.an];
         var3.ab = new int[var3.an * -153242533];
         var3.aq = new Method[var3.an * -153242533];
         var3.al = new byte[-153242533 * var3.an][][];

         for(int var4 = 0; var4 < var3.an * -153242533; ++var4) {
            if (var2 <= 1543332522) {
               throw new IllegalStateException();
            }

            try {
               int var5 = var0.cm((byte)7);
               String var6;
               String var7;
               int var8;
               if (0 != var5) {
                  if (var2 <= 1543332522) {
                     throw new IllegalStateException();
                  }

                  if (var5 != 1) {
                     if (var2 <= 1543332522) {
                        throw new IllegalStateException();
                     }

                     if (2 != var5) {
                        if (3 != var5) {
                           if (var2 <= 1543332522) {
                              throw new IllegalStateException();
                           }

                           if (4 != var5) {
                              continue;
                           }

                           if (var2 <= 1543332522) {
                              throw new IllegalStateException();
                           }
                        }

                        var6 = var0.cw((byte)0);
                        var7 = var0.cw((byte)0);
                        var8 = var0.cm((byte)7);
                        String[] var9 = new String[var8];

                        for(int var10 = 0; var10 < var8; ++var10) {
                           var9[var10] = var0.cw((byte)0);
                        }

                        String var27 = var0.cw((byte)0);
                        byte[][] var11 = new byte[var8][];
                        int var13;
                        if (var5 == 3) {
                           if (var2 <= 1543332522) {
                              return;
                           }

                           for(int var12 = 0; var12 < var8; ++var12) {
                              var13 = var0.cx(-1701836625);
                              var11[var12] = new byte[var13];
                              var0.ct(var11[var12], 0, var13, -1570744551);
                           }
                        }

                        var3.aw[var4] = var5;
                        Class[] var28 = new Class[var8];

                        for(var13 = 0; var13 < var8; ++var13) {
                           if (var2 <= 1543332522) {
                              throw new IllegalStateException();
                           }

                           var28[var13] = bz.aw(var9[var13], 1483756716);
                        }

                        Class var29 = bz.aw(var27, 1654672643);
                        if (bz.aw(var6, 1757034561).getClassLoader() == null) {
                           if (var2 <= 1543332522) {
                              throw new IllegalStateException();
                           }

                           throw new SecurityException();
                        }

                        Method[] var14 = bz.aw(var6, 1470416793).getDeclaredMethods();
                        Method[] var15 = var14;

                        for(int var16 = 0; var16 < var15.length; ++var16) {
                           if (var2 <= 1543332522) {
                              throw new IllegalStateException();
                           }

                           Method var17 = var15[var16];
                           if (var17.getName().equals(var7)) {
                              if (var2 <= 1543332522) {
                                 throw new IllegalStateException();
                              }

                              Class[] var18 = var17.getParameterTypes();
                              if (var18.length == var28.length) {
                                 if (var2 <= 1543332522) {
                                    throw new IllegalStateException();
                                 }

                                 boolean var19 = true;

                                 for(int var20 = 0; var20 < var28.length; ++var20) {
                                    if (var2 <= 1543332522) {
                                       throw new IllegalStateException();
                                    }

                                    if (var28[var20] != var18[var20]) {
                                       var19 = false;
                                       break;
                                    }
                                 }

                                 if (var19) {
                                    if (var2 <= 1543332522) {
                                       throw new IllegalStateException();
                                    }

                                    if (var29 == var17.getReturnType()) {
                                       if (var2 <= 1543332522) {
                                          throw new IllegalStateException();
                                       }

                                       var3.aq[var4] = var17;
                                    }
                                 }
                              }
                           }
                        }

                        var3.al[var4] = var11;
                        continue;
                     }

                     if (var2 <= 1543332522) {
                        return;
                     }
                  }
               }

               var6 = var0.cw((byte)0);
               var7 = var0.cw((byte)0);
               var8 = 0;
               if (1 == var5) {
                  var8 = var0.cx(-1987599500);
               }

               var3.aw[var4] = var5;
               var3.ab[var4] = var8;
               if (bz.aw(var6, 1290821012).getClassLoader() == null) {
                  if (var2 <= 1543332522) {
                     throw new IllegalStateException();
                  }

                  throw new SecurityException();
               }

               var3.au[var4] = bz.aw(var6, 1116581823).getDeclaredField(var7);
            } catch (ClassNotFoundException var21) {
               var3.ac[var4] = -1;
            } catch (SecurityException var22) {
               var3.ac[var4] = -2;
            } catch (NullPointerException var23) {
               var3.ac[var4] = -3;
            } catch (Exception var24) {
               var3.ac[var4] = -4;
            } catch (Throwable var25) {
               var3.ac[var4] = -5;
            }
         }

         bt.af.an(var3);
      } catch (RuntimeException var26) {
         throw db.an(var26, "eb.an(" + ')');
      }
   }

   static final int jx(byte var0) {
      try {
         if (aj.vb.ab(-1990949595)) {
            if (var0 <= 0) {
               throw new IllegalStateException();
            } else {
               return -1727408401 * bm.mh;
            }
         } else {
            int var1 = 3;
            if (jb.ky * 1897923909 < 310) {
               label288: {
                  if (var0 <= 0) {
                     throw new IllegalStateException();
                  }

                  int var2;
                  int var3;
                  if (986256295 * client.lv == 1) {
                     if (var0 <= 0) {
                        throw new IllegalStateException();
                     }

                     var2 = -1958669353 * bz.lg >> 7;
                     var3 = -365969735 * fw.lf >> 7;
                  } else {
                     var2 = 1144428983 * lq.mi.bx >> 7;
                     var3 = lq.mi.bo * -411750205 >> 7;
                  }

                  int var4 = -2100544359 * bt.kx >> 7;
                  int var5 = ly.ke * -91399205 >> 7;
                  if (var4 < 0) {
                     return -1727408401 * bm.mh;
                  }

                  if (var0 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var5 < 0) {
                     return -1727408401 * bm.mh;
                  }

                  if (var0 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var4 >= 104) {
                     return -1727408401 * bm.mh;
                  }

                  if (var0 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var5 >= 104) {
                     if (var0 <= 0) {
                        throw new IllegalStateException();
                     }

                     return -1727408401 * bm.mh;
                  }

                  if (var2 >= 0 && var3 >= 0) {
                     if (var0 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (var2 < 104) {
                        if (var3 < 104) {
                           if (0 != (cd.an[bm.mh * -1727408401][var4][var5] & 4)) {
                              if (var0 <= 0) {
                                 throw new IllegalStateException();
                              }

                              var1 = -1727408401 * bm.mh;
                           }

                           int var6;
                           if (var2 > var4) {
                              if (var0 <= 0) {
                                 throw new IllegalStateException();
                              }

                              var6 = var2 - var4;
                           } else {
                              var6 = var4 - var2;
                           }

                           int var7;
                           if (var3 > var5) {
                              if (var0 <= 0) {
                                 throw new IllegalStateException();
                              }

                              var7 = var3 - var5;
                           } else {
                              var7 = var5 - var3;
                           }

                           int var8;
                           int var9;
                           if (var6 > var7) {
                              if (var0 <= 0) {
                                 throw new IllegalStateException();
                              }

                              var8 = 65536 * var7 / var6;
                              var9 = 32768;

                              while(true) {
                                 if (var2 == var4) {
                                    break label288;
                                 }

                                 if (var0 <= 0) {
                                    throw new IllegalStateException();
                                 }

                                 if (var4 < var2) {
                                    if (var0 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    ++var4;
                                 } else if (var4 > var2) {
                                    if (var0 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    --var4;
                                 }

                                 if (0 != (cd.an[bm.mh * -1727408401][var4][var5] & 4)) {
                                    if (var0 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    var1 = bm.mh * -1727408401;
                                 }

                                 var9 += var8;
                                 if (var9 >= 65536) {
                                    if (var0 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    var9 -= 65536;
                                    if (var5 < var3) {
                                       if (var0 <= 0) {
                                          throw new IllegalStateException();
                                       }

                                       ++var5;
                                    } else if (var5 > var3) {
                                       if (var0 <= 0) {
                                          throw new IllegalStateException();
                                       }

                                       --var5;
                                    }

                                    if (0 != (cd.an[bm.mh * -1727408401][var4][var5] & 4)) {
                                       var1 = bm.mh * -1727408401;
                                    }
                                 }
                              }
                           } else {
                              if (var7 > 0) {
                                 if (var0 <= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var8 = var6 * 65536 / var7;
                                 var9 = 32768;

                                 while(var5 != var3) {
                                    if (var0 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    if (var5 < var3) {
                                       if (var0 <= 0) {
                                          throw new IllegalStateException();
                                       }

                                       ++var5;
                                    } else if (var5 > var3) {
                                       if (var0 <= 0) {
                                          throw new IllegalStateException();
                                       }

                                       --var5;
                                    }

                                    if (0 != (cd.an[-1727408401 * bm.mh][var4][var5] & 4)) {
                                       if (var0 <= 0) {
                                          throw new IllegalStateException();
                                       }

                                       var1 = -1727408401 * bm.mh;
                                    }

                                    var9 += var8;
                                    if (var9 >= 65536) {
                                       var9 -= 65536;
                                       if (var4 < var2) {
                                          if (var0 <= 0) {
                                             throw new IllegalStateException();
                                          }

                                          ++var4;
                                       } else if (var4 > var2) {
                                          if (var0 <= 0) {
                                             throw new IllegalStateException();
                                          }

                                          --var4;
                                       }

                                       if (0 != (cd.an[bm.mh * -1727408401][var4][var5] & 4)) {
                                          if (var0 <= 0) {
                                             throw new IllegalStateException();
                                          }

                                          var1 = bm.mh * -1727408401;
                                       }
                                    }
                                 }
                              }
                              break label288;
                           }
                        }

                        if (var0 <= 0) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  return -1727408401 * bm.mh;
               }
            }

            if (lq.mi.bx * 1144428983 >= 0 && lq.mi.bo * -411750205 >= 0) {
               if (var0 <= 0) {
                  throw new IllegalStateException();
               }

               if (1144428983 * lq.mi.bx < 13312) {
                  if (var0 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (-411750205 * lq.mi.bo < 13312) {
                     if ((cd.an[bm.mh * -1727408401][1144428983 * lq.mi.bx >> 7][-411750205 * lq.mi.bo >> 7] & 4) != 0) {
                        if (var0 <= 0) {
                           throw new IllegalStateException();
                        }

                        var1 = -1727408401 * bm.mh;
                     }

                     return var1;
                  }
               }
            }

            return -1727408401 * bm.mh;
         }
      } catch (RuntimeException var10) {
         throw db.an(var10, "eb.jx(" + ')');
      }
   }

   public eb(boolean var1) {
      try {
         super();
         this.af = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "eb.<init>(" + ')');
      }
   }
}
