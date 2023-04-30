import accessors.RSStructType;

public class ht extends rk implements RSStructType {
   static final int de = 10;
   static nm af;
   ro aw;
   static kh an = new kh(64);
   static final int aq = 3;

   void au(sg var1, int var2, int var3) {
      try {
         if (var2 == 249) {
            if (var3 >= 935514660) {
               throw new IllegalStateException();
            }

            this.aw = cp.af(var1, this.aw, (byte)-113);
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "ht.au(" + ')');
      }
   }

   public static nj af(nj[] var0, int var1, short var2) {
      try {
         nj[] var3 = var0;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            nj var5 = var3[var4];
            if (var1 == var5.af(741942848)) {
               if (var2 != 173) {
                  throw new IllegalStateException();
               }

               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw db.an(var6, "ht.af(" + ')');
      }
   }

   void ac(sg var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cm((byte)7);
            if (var3 == 0) {
               if (var2 >= 2124221074) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.au(var1, var3, -1196220711);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "ht.ac(" + ')');
      }
   }

   public static ht ao(int var0) {
      ht var1 = (ht)an.af((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = af.bh(34, var0, (byte)-125);
         var1 = new ht();
         if (null != var2) {
            var1.ac(new sg(var2), -560752221);
         }

         var1.aw(-1436129588);
         an.aw(var1, (long)var0);
         return var1;
      }
   }

   public int ab(int var1, int var2, byte var3) {
      try {
         ro var5 = this.aw;
         int var4;
         if (var5 == null) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            var4 = var2;
         } else {
            rt var6 = (rt)var5.af((long)var1);
            if (null == var6) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               var4 = var2;
            } else {
               var4 = var6.af;
            }
         }

         return var4;
      } catch (RuntimeException var7) {
         throw db.an(var7, "ht.ab(" + ')');
      }
   }

   public String aq(int var1, String var2, int var3) {
      try {
         return hx.an(this.aw, var1, var2, 1493473883);
      } catch (RuntimeException var4) {
         throw db.an(var4, "ht.aq(" + ')');
      }
   }

   public static void at(nm var0) {
      af = var0;
   }

   void ah(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.au(var1, var2, 471598402);
      }
   }

   public static void ay(nm var0) {
      af = var0;
   }

   static void af(byte var0) {
      try {
         for(cr var1 = (cr)cr.af.aq(); null != var1; var1 = (cr)cr.af.at()) {
            if (var0 != 1) {
               throw new IllegalStateException();
            }

            if (var1.at != null) {
               if (var0 != 1) {
                  return;
               }

               fe.td.an(var1.at);
               var1.at = null;
            }

            if (null != var1.ai) {
               if (var0 != 1) {
                  throw new IllegalStateException();
               }

               fe.td.an(var1.ai);
               var1.ai = null;
            }
         }

         cr.af.af();
      } catch (RuntimeException var2) {
         throw db.an(var2, "ht.af(" + ')');
      }
   }

   void ax() {
   }

   public int az(int var1, int var2) {
      ro var4 = this.aw;
      int var3;
      if (var4 == null) {
         var3 = var2;
      } else {
         rt var5 = (rt)var4.af((long)var1);
         if (null == var5) {
            var3 = var2;
         } else {
            var3 = var5.af;
         }
      }

      return var3;
   }

   void ag() {
   }

   void aw(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ht.aw(" + ')');
      }
   }

   void av(sg var1) {
      while(true) {
         int var2 = var1.cm((byte)7);
         if (var2 == 0) {
            return;
         }

         this.au(var1, var2, 209402697);
      }
   }

   public static void ae() {
      an.ac();
   }

   void am(sg var1, int var2) {
      if (var2 == 249) {
         this.aw = cp.af(var1, this.aw, (byte)-11);
      }

   }

   void as(sg var1, int var2) {
      if (var2 == 249) {
         this.aw = cp.af(var1, this.aw, (byte)-16);
      }

   }

   public int aj(int var1, int var2) {
      ro var4 = this.aw;
      int var3;
      if (var4 == null) {
         var3 = var2;
      } else {
         rt var5 = (rt)var4.af((long)var1);
         if (null == var5) {
            var3 = var2;
         } else {
            var3 = var5.af;
         }
      }

      return var3;
   }

   public int ak(int var1, int var2) {
      ro var4 = this.aw;
      int var3;
      if (var4 == null) {
         var3 = var2;
      } else {
         rt var5 = (rt)var4.af((long)var1);
         if (null == var5) {
            var3 = var2;
         } else {
            var3 = var5.af;
         }
      }

      return var3;
   }

   void ai() {
   }

   public static void ad() {
      an.ac();
   }

   ht() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ht.<init>(" + ')');
      }
   }

   static int al(int var0, ch var1, boolean var2, int var3) {
      try {
         boolean var4 = true;
         mq var5;
         if (var0 >= 2000) {
            var0 -= 1000;
            var5 = gh.an(cy.al[(cy.at -= 427135973) * -964267539], (byte)5);
            var4 = false;
         } else {
            mq var10000;
            if (var2) {
               if (var3 >= -964267539) {
                  throw new IllegalStateException();
               }

               var10000 = bq.ag;
            } else {
               var10000 = an.ai;
            }

            var5 = var10000;
         }

         int var6;
         if (1300 == var0) {
            if (var3 >= -964267539) {
               throw new IllegalStateException();
            } else {
               var6 = cy.al[(cy.at -= 427135973) * -964267539] - 1;
               if (var6 >= 0) {
                  if (var3 >= -964267539) {
                     throw new IllegalStateException();
                  }

                  if (var6 <= 9) {
                     var5.ar(var6, cy.aa[(dm.ay -= -1086551379) * -2017760987], (byte)2);
                     return 1;
                  }

                  if (var3 >= -964267539) {
                     throw new IllegalStateException();
                  }
               }

               dm.ay -= -1086551379;
               return 1;
            }
         } else {
            int var7;
            if (var0 == 1301) {
               if (var3 >= -964267539) {
                  throw new IllegalStateException();
               } else {
                  cy.at -= 854271946;
                  var6 = cy.al[cy.at * -964267539];
                  var7 = cy.al[1 + cy.at * -964267539];
                  var5.ey = bq.aw(var6, var7, 1600705235);
                  return 1;
               }
            } else if (1302 == var0) {
               if (var3 >= -964267539) {
                  throw new IllegalStateException();
               } else {
                  boolean var10001;
                  if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                     if (var3 >= -964267539) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var5.ee = var10001;
                  return 1;
               }
            } else if (var0 == 1303) {
               if (var3 >= -964267539) {
                  throw new IllegalStateException();
               } else {
                  var5.ec = cy.al[(cy.at -= 427135973) * -964267539] * 1773001161;
                  return 1;
               }
            } else if (var0 == 1304) {
               if (var3 >= -964267539) {
                  throw new IllegalStateException();
               } else {
                  var5.ei = cy.al[(cy.at -= 427135973) * -964267539] * 1466803237;
                  return 1;
               }
            } else if (var0 == 1305) {
               if (var3 >= -964267539) {
                  throw new IllegalStateException();
               } else {
                  var5.eh = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                  return 1;
               }
            } else if (var0 == 1306) {
               if (var3 >= -964267539) {
                  throw new IllegalStateException();
               } else {
                  var5.fe = cy.aa[(dm.ay -= -1086551379) * -2017760987];
                  return 1;
               }
            } else if (1307 == var0) {
               if (var3 >= -964267539) {
                  throw new IllegalStateException();
               } else {
                  var5.ek = null;
                  return 1;
               }
            } else if (var0 == 1308) {
               var5.hh = cy.al[(cy.at -= 427135973) * -964267539] == 1;
               return 1;
            } else if (1309 == var0) {
               cy.at -= 427135973;
               return 1;
            } else {
               int var8;
               byte[] var12;
               if (1350 == var0) {
                  if (var3 >= -964267539) {
                     throw new IllegalStateException();
                  } else {
                     byte[] var11 = null;
                     var12 = null;
                     if (var4) {
                        if (var3 >= -964267539) {
                           throw new IllegalStateException();
                        }

                        cy.at -= -23607566;

                        for(var8 = 0; var8 < 10; var8 += 2) {
                           if (var3 >= -964267539) {
                              throw new IllegalStateException();
                           }

                           if (cy.al[var8 + -964267539 * cy.at] < 0) {
                              if (var3 >= -964267539) {
                                 throw new IllegalStateException();
                              }
                              break;
                           }
                        }

                        if (var8 > 0) {
                           var11 = new byte[var8 / 2];
                           var12 = new byte[var8 / 2];

                           for(var8 -= 2; var8 >= 0; var8 -= 2) {
                              var11[var8 / 2] = (byte)cy.al[cy.at * -964267539 + var8];
                              var12[var8 / 2] = (byte)cy.al[1 + -964267539 * cy.at + var8];
                           }
                        }
                     } else {
                        cy.at -= 854271946;
                        var11 = new byte[]{(byte)cy.al[-964267539 * cy.at]};
                        var12 = new byte[]{(byte)cy.al[1 + -964267539 * cy.at]};
                     }

                     var8 = cy.al[(cy.at -= 427135973) * -964267539] - 1;
                     if (var8 >= 0) {
                        if (var3 >= -964267539) {
                           throw new IllegalStateException();
                        }

                        if (var8 <= 9) {
                           al.at(var5, var8, var11, var12, 71833059);
                           return 1;
                        }

                        if (var3 >= -964267539) {
                           throw new IllegalStateException();
                        }
                     }

                     throw new RuntimeException();
                  }
               } else {
                  byte var10;
                  if (1351 == var0) {
                     if (var3 >= -964267539) {
                        throw new IllegalStateException();
                     } else {
                        cy.at -= 854271946;
                        var10 = 10;
                        var12 = new byte[]{(byte)cy.al[cy.at * -964267539]};
                        byte[] var13 = new byte[]{(byte)cy.al[-964267539 * cy.at + 1]};
                        al.at(var5, var10, var12, var13, 1887295232);
                        return 1;
                     }
                  } else if (1352 == var0) {
                     if (var3 >= -964267539) {
                        throw new IllegalStateException();
                     } else {
                        cy.at -= 1281407919;
                        var6 = cy.al[-964267539 * cy.at] - 1;
                        var7 = cy.al[-964267539 * cy.at + 1];
                        var8 = cy.al[cy.at * -964267539 + 2];
                        if (var6 >= 0) {
                           if (var3 >= -964267539) {
                              throw new IllegalStateException();
                           }

                           if (var6 <= 9) {
                              cv.aa(var5, var6, var7, var8, -1038667453);
                              return 1;
                           }

                           if (var3 >= -964267539) {
                              throw new IllegalStateException();
                           }
                        }

                        throw new RuntimeException();
                     }
                  } else if (var0 == 1353) {
                     if (var3 >= -964267539) {
                        throw new IllegalStateException();
                     } else {
                        var10 = 10;
                        var7 = cy.al[(cy.at -= 427135973) * -964267539];
                        var8 = cy.al[(cy.at -= 427135973) * -964267539];
                        cv.aa(var5, var10, var7, var8, -635612095);
                        return 1;
                     }
                  } else if (var0 == 1354) {
                     cy.at -= 427135973;
                     var6 = cy.al[-964267539 * cy.at] - 1;
                     if (var6 >= 0) {
                        if (var3 >= -964267539) {
                           throw new IllegalStateException();
                        }

                        if (var6 <= 9) {
                           ne.ay(var5, var6, (byte)-105);
                           return 1;
                        }
                     }

                     throw new RuntimeException();
                  } else if (1355 == var0) {
                     if (var3 >= -964267539) {
                        throw new IllegalStateException();
                     } else {
                        var6 = 10;
                        ne.ay(var5, var6, (byte)17);
                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "ht.al(" + ')');
      }
   }

   public static int an(int var0, int var1) {
      try {
         return var0 >> 17 & 7;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ht.an(" + ')');
      }
   }

   void ar(sg var1, int var2) {
      if (var2 == 249) {
         this.aw = cp.af(var1, this.aw, (byte)-15);
      }

   }

   public static void aa(nm var0) {
      af = var0;
   }
}
