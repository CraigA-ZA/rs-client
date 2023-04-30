import java.util.Date;

public class cm extends ia {
   static final int ab = 3;
   static final int ar = 18;
   static final int bv = 1;

   cm() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "cm.<init>(" + ')');
      }
   }

   static final void mc(int var0, int var1) {
      try {
         var0 = Math.max(Math.min(var0, 100), 0);
         var0 = 100 - var0;
         float var2 = 0.5F + (float)var0 / 200.0F;
         ck.mg((double)var2);
      } catch (RuntimeException var3) {
         throw db.an(var3, "cm.mc(" + ')');
      }
   }

   protected boolean an(int var1, int var2, int var3, if var4) {
      return var2 == this.af * -1418619457 && 911526458 * this.an == var3;
   }

   protected boolean aw(int var1, int var2, int var3, if var4) {
      return var2 == this.af * 465318274 && 1191111835 * this.an == var3;
   }

   protected boolean ac(int var1, int var2, int var3, if var4) {
      return var2 == this.af * 1539024089 && -407280601 * this.an == var3;
   }

   protected boolean au(int var1, int var2, int var3, if var4) {
      return var2 == this.af * 1970709942 && 727911086 * this.an == var3;
   }

   protected boolean ab(int var1, int var2, int var3, if var4) {
      return var2 == this.af * -1297786825 && -407280601 * this.an == var3;
   }

   public static gl an(int var0, int var1) {
      try {
         gl var2 = (gl)gl.an.af((long)var0);
         if (null != var2) {
            if (var1 != -1717461998) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = gl.af.bh(5, var0, (byte)-7);
            var2 = new gl();
            if (var3 != null) {
               var2.aw(new sg(var3), (byte)1);
            }

            gl.an.aw(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "cm.an(" + ')');
      }
   }

   static int bz(int var0, ch var1, boolean var2, int var3) {
      try {
         String var4;
         int var11;
         if (4100 == var0) {
            if (var3 != 16776960) {
               throw new IllegalStateException();
            } else {
               var4 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
               var11 = cy.al[(cy.at -= 427135973) * -964267539];
               cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var4 + var11;
               return 1;
            }
         } else {
            String var5;
            if (4101 == var0) {
               dm.ay -= 2121864538;
               var4 = cy.aa[dm.ay * -2017760987];
               var5 = cy.aa[1 + -2017760987 * dm.ay];
               cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var4 + var5;
               return 1;
            } else if (var0 == 4102) {
               var4 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
               var11 = cy.al[(cy.at -= 427135973) * -964267539];
               cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var4 + hj.ab(var11, true, (byte)16);
               return 1;
            } else if (var0 == 4103) {
               var4 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
               cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var4.toLowerCase();
               return 1;
            } else {
               int var7;
               int var8;
               int var13;
               if (4104 == var0) {
                  if (var3 != 16776960) {
                     throw new IllegalStateException();
                  } else {
                     var13 = cy.al[(cy.at -= 427135973) * -964267539];
                     long var17 = ((long)var13 + 11745L) * 86400000L;
                     cy.am.setTime(new Date(var17));
                     var7 = cy.am.get(5);
                     var8 = cy.am.get(2);
                     int var9 = cy.am.get(1);
                     cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var7 + "-" + cy.as[var8] + "-" + var9;
                     return 1;
                  }
               } else if (4105 == var0) {
                  if (var3 != 16776960) {
                     throw new IllegalStateException();
                  } else {
                     dm.ay -= 2121864538;
                     var4 = cy.aa[-2017760987 * dm.ay];
                     var5 = cy.aa[1 + dm.ay * -2017760987];
                     if (null != lq.mi.aw) {
                        if (var3 != 16776960) {
                           throw new IllegalStateException();
                        }

                        if (0 != 1693987821 * lq.mi.aw.au) {
                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var5;
                           return 1;
                        }

                        if (var3 != 16776960) {
                           throw new IllegalStateException();
                        }
                     }

                     cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var4;
                     return 1;
                  }
               } else if (4106 == var0) {
                  if (var3 != 16776960) {
                     throw new IllegalStateException();
                  } else {
                     var13 = cy.al[(cy.at -= 427135973) * -964267539];
                     cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = Integer.toString(var13);
                     return 1;
                  }
               } else if (var0 == 4107) {
                  dm.ay -= 2121864538;
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = er.ah(av.af(cy.aa[-2017760987 * dm.ay], cy.aa[dm.ay * -2017760987 + 1], fj.ck, 1629498841), -1723997839);
                  return 1;
               } else {
                  int var14;
                  byte[] var16;
                  on var18;
                  if (var0 == 4108) {
                     if (var3 != 16776960) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                        cy.at -= 854271946;
                        var11 = cy.al[cy.at * -964267539];
                        var14 = cy.al[1 + -964267539 * cy.at];
                        var16 = ei.fg.bh(var14, 0, (byte)-23);
                        var18 = new on(var16);
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var18.ag(var4, var11);
                        return 1;
                     }
                  } else if (var0 == 4109) {
                     if (var3 != 16776960) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                        cy.at -= 854271946;
                        var11 = cy.al[-964267539 * cy.at];
                        var14 = cy.al[1 + cy.at * -964267539];
                        var16 = ei.fg.bh(var14, 0, (byte)-43);
                        var18 = new on(var16);
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var18.ai(var4, var11);
                        return 1;
                     }
                  } else if (var0 == 4110) {
                     if (var3 != 16776960) {
                        throw new IllegalStateException();
                     } else {
                        dm.ay -= 2121864538;
                        var4 = cy.aa[dm.ay * -2017760987];
                        var5 = cy.aa[1 + dm.ay * -2017760987];
                        if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var4;
                        } else {
                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var5;
                        }

                        return 1;
                     }
                  } else if (4111 == var0) {
                     if (var3 != 16776960) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                        cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = ou.ah(var4);
                        return 1;
                     }
                  } else if (4112 == var0) {
                     if (var3 != 16776960) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                        var11 = cy.al[(cy.at -= 427135973) * -964267539];
                        cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var4 + (char)var11;
                        return 1;
                     }
                  } else {
                     int[] var10000;
                     int var10001;
                     byte var10002;
                     if (var0 == 4113) {
                        var13 = cy.al[(cy.at -= 427135973) * -964267539];
                        var10000 = cy.al;
                        var10001 = (cy.at += 427135973) * -964267539 - 1;
                        if (hi.ag((char)var13, (byte)4)) {
                           if (var3 != 16776960) {
                              throw new IllegalStateException();
                           }

                           var10002 = 1;
                        } else {
                           var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     } else if (var0 == 4114) {
                        if (var3 != 16776960) {
                           throw new IllegalStateException();
                        } else {
                           var13 = cy.al[(cy.at -= 427135973) * -964267539];
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = cb.ay((char)var13, -591876497) ? 1 : 0;
                           return 1;
                        }
                     } else if (4115 == var0) {
                        var13 = cy.al[(cy.at -= 427135973) * -964267539];
                        var10000 = cy.al;
                        var10001 = (cy.at += 427135973) * -964267539 - 1;
                        if (fl.at((char)var13, (byte)3)) {
                           if (var3 != 16776960) {
                              throw new IllegalStateException();
                           }

                           var10002 = 1;
                        } else {
                           var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     } else if (var0 == 4116) {
                        if (var3 != 16776960) {
                           throw new IllegalStateException();
                        } else {
                           var13 = cy.al[(cy.at -= 427135973) * -964267539];
                           var10000 = cy.al;
                           var10001 = (cy.at += 427135973) * -964267539 - 1;
                           if (ff.aa((char)var13, 1560581975)) {
                              if (var3 != 16776960) {
                                 throw new IllegalStateException();
                              }

                              var10002 = 1;
                           } else {
                              var10002 = 0;
                           }

                           var10000[var10001] = var10002;
                           return 1;
                        }
                     } else if (var0 == 4117) {
                        var4 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                        if (null != var4) {
                           if (var3 != 16776960) {
                              throw new IllegalStateException();
                           }

                           cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.length();
                        } else {
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                        }

                        return 1;
                     } else if (4118 == var0) {
                        var4 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                        cy.at -= 854271946;
                        var11 = cy.al[cy.at * -964267539];
                        var14 = cy.al[1 + -964267539 * cy.at];
                        cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var4.substring(var11, var14);
                        return 1;
                     } else if (4119 == var0) {
                        if (var3 != 16776960) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                           StringBuilder var12 = new StringBuilder(var4.length());
                           boolean var15 = false;

                           for(var7 = 0; var7 < var4.length(); ++var7) {
                              if (var3 != 16776960) {
                                 throw new IllegalStateException();
                              }

                              var8 = var4.charAt(var7);
                              if (60 == var8) {
                                 if (var3 != 16776960) {
                                    throw new IllegalStateException();
                                 }

                                 var15 = true;
                              } else if (var8 == 62) {
                                 var15 = false;
                              } else if (!var15) {
                                 if (var3 != 16776960) {
                                    throw new IllegalStateException();
                                 }

                                 var12.append((char)var8);
                              }
                           }

                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var12.toString();
                           return 1;
                        }
                     } else if (4120 == var0) {
                        if (var3 != 16776960) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                           var11 = cy.al[(cy.at -= 427135973) * -964267539];
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.indexOf(var11);
                           return 1;
                        }
                     } else if (4121 == var0) {
                        if (var3 != 16776960) {
                           throw new IllegalStateException();
                        } else {
                           dm.ay -= 2121864538;
                           var4 = cy.aa[-2017760987 * dm.ay];
                           var5 = cy.aa[1 + dm.ay * -2017760987];
                           var14 = cy.al[(cy.at -= 427135973) * -964267539];
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.indexOf(var5, var14);
                           return 1;
                        }
                     } else if (4122 == var0) {
                        if (var3 != 16776960) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var4.toUpperCase();
                           return 1;
                        }
                     } else if (var0 == 4123) {
                        if (var3 != 16776960) {
                           throw new IllegalStateException();
                        } else {
                           dm.ay -= 1035313159;
                           var4 = cy.aa[dm.ay * -2017760987];
                           var5 = cy.aa[dm.ay * -2017760987 + 1];
                           String var6 = cy.aa[2 + dm.ay * -2017760987];
                           if (null == lq.mi.aw) {
                              if (var3 != 16776960) {
                                 throw new IllegalStateException();
                              } else {
                                 cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var6;
                                 return 1;
                              }
                           } else {
                              switch (-1004049459 * lq.mi.aw.ac) {
                                 case 0:
                                    cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var4;
                                    break;
                                 case 1:
                                    cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var5;
                                    break;
                                 case 2:
                                 default:
                                    cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var6;
                              }

                              return 1;
                           }
                        }
                     } else {
                        return 2;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw db.an(var10, "cm.bz(" + ')');
      }
   }

   protected boolean af(int var1, int var2, int var3, if var4, int var5) {
      try {
         boolean var10000;
         if (var2 == this.af * 689701217) {
            if (var5 == -83590544) {
               throw new IllegalStateException();
            }

            if (-407280601 * this.an == var3) {
               if (var5 == -83590544) {
                  throw new IllegalStateException();
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var6) {
         throw db.an(var6, "cm.af(" + ')');
      }
   }
}
