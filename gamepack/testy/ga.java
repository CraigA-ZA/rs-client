public class ga extends fu {
   static final int se = 128;
   // $FF: synthetic field
   final gr this$0;
   byte aw;
   byte an;
   String af;
   public static int aa;
   static final int dh = 11;

   void af(sg var1, int var2) {
      try {
         this.af = var1.cz((byte)-35);
         if (null != this.af) {
            if (var2 != -1949352075) {
               return;
            }

            var1.cm((byte)7);
            this.an = var1.cf(435772489);
            this.aw = var1.cf(435772489);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "ga.af(" + ')');
      }
   }

   void aw(sg var1) {
      this.af = var1.cz((byte)-19);
      if (null != this.af) {
         var1.cm((byte)7);
         this.an = var1.cf(435772489);
         this.aw = var1.cf(435772489);
      }

   }

   void an(gj var1, byte var2) {
      try {
         var1.ab = this.af;
         if (null != this.af) {
            if (var2 == 19) {
               return;
            }

            var1.aq = this.an;
            var1.al = this.aw;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "ga.an(" + ')');
      }
   }

   void ab(gj var1) {
      var1.ab = this.af;
      if (null != this.af) {
         var1.aq = this.an;
         var1.al = this.aw;
      }

   }

   public static void bf(mq var0, int var1, int var2, byte var3) {
      try {
         mw var4 = var0.dd;
         boolean var10000;
         if (var2 != 1693987821 * var4.au) {
            if (var3 >= 0) {
               return;
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var5 = var10000;
         var4.au = 325591525 * var2;
         if (var5) {
            int var6;
            int var7;
            if (1693987821 * var4.au == var1) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               for(var6 = 0; var6 < mw.ag.length; ++var6) {
                  var7 = mw.ag[var6];
                  if (var4.an[var7] > 0 && var4.an[var7] < 512) {
                     if (var3 >= 0) {
                        return;
                     }

                     var4.an[var7] = var4.af[var7];
                  }
               }
            } else {
               label108: {
                  if (var4.an[0] >= 512) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     boolean var9;
                     if (var4.an[0] >= 512) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        label100: {
                           hz var10 = dh.af(var4.an[0] - 512, (byte)110);
                           if (622494345 * hp.ao.ag != var10.bx * -1719338253) {
                              if (var3 >= 0) {
                                 return;
                              }

                              if (hp.ao.ag * 622494345 != 723093341 * var10.bo) {
                                 var10000 = true;
                                 break label100;
                              }
                           }

                           var10000 = false;
                        }

                        var9 = var10000;
                     } else {
                        var9 = false;
                     }

                     if (!var9) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }
                        break label108;
                     }
                  }

                  var4.an[622494345 * hp.ao.ag] = 1;
               }

               for(var6 = 0; var6 < 7; ++var6) {
                  var7 = mw.ag[var6];
                  if (var4.an[var7] > 0) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (var4.an[var7] < 512) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        gt.ac(var2, var4.an, var6, 2068575587);
                     }
                  }
               }
            }
         }

         var4.ax(-469114674);
      } catch (RuntimeException var8) {
         throw db.an(var8, "ga.bf(" + ')');
      }
   }

   void au(sg var1) {
      this.af = var1.cz((byte)15);
      if (null != this.af) {
         var1.cm((byte)7);
         this.an = var1.cf(435772489);
         this.aw = var1.cf(435772489);
      }

   }

   void ac(sg var1) {
      this.af = var1.cz((byte)-87);
      if (null != this.af) {
         var1.cm((byte)7);
         this.an = var1.cf(435772489);
         this.aw = var1.cf(435772489);
      }

   }

   void aq(gj var1) {
      var1.ab = this.af;
      if (null != this.af) {
         var1.aq = this.an;
         var1.al = this.aw;
      }

   }

   static void aq(byte var0) {
      try {
         eo.af.clear();
         eo.an.aw();
         eo.aw.af();
         eo.ac = 0;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ga.aq(" + ')');
      }
   }

   ga(gr var1) {
      try {
         this.this$0 = var1;
         super();
      } catch (RuntimeException var2) {
         throw db.an(var2, "ga.<init>(" + ')');
      }
   }
}
