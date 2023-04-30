import accessors.RSGrandExchangeEvents;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class nr implements RSGrandExchangeEvents {
   public static Comparator au;
   public static Comparator an = new np();
   public final List af;
   public static Comparator ac;
   public static Comparator aw;

   public nr(sg var1, boolean var2) {
      try {
         super();
         int var3 = var1.cl(-1361207699);
         boolean var4 = var1.cm((byte)7) == 1;
         byte var5;
         if (var4) {
            var5 = 1;
         } else {
            var5 = 0;
         }

         int var6 = var1.cl(-2077620060);
         this.af = new ArrayList(var6);

         for(int var7 = 0; var7 < var6; ++var7) {
            this.af.add(new nu(var1, var5, var3));
         }

      } catch (RuntimeException var8) {
         throw db.an(var8, "nr.<init>(" + ')');
      }
   }

   public void af(Comparator var1, boolean var2, int var3) {
      try {
         if (var2) {
            if (var3 != 694808074) {
               return;
            }

            Collections.sort(this.af, var1);
         } else {
            Collections.sort(this.af, Collections.reverseOrder(var1));
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "nr.af(" + ')');
      }
   }

   public void an(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.af, var1);
      } else {
         Collections.sort(this.af, Collections.reverseOrder(var1));
      }

   }

   static {
      new ny();
      aw = new nt();
      ac = new na();
      au = new nn();
   }

   public void aw(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.af, var1);
      } else {
         Collections.sort(this.af, Collections.reverseOrder(var1));
      }

   }

   public void ac(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.af, var1);
      } else {
         Collections.sort(this.af, Collections.reverseOrder(var1));
      }

   }

   public void au(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.af, var1);
      } else {
         Collections.sort(this.af, Collections.reverseOrder(var1));
      }

   }

   static final void an(sq var0, int var1, int var2) {
      try {
         int var3 = var0.at * -1633313603;
         ds.ax = 0;
         int var4 = 0;
         var0.al((byte)-26);

         byte[] var10000;
         int var5;
         int var6;
         int var7;
         for(var5 = 0; var5 < ds.ab * -2010934433; ++var5) {
            if (var2 == 191702299) {
               throw new IllegalStateException();
            }

            var6 = ds.aq[var5];
            if ((ds.aw[var6] & 1) == 0) {
               if (var2 == 191702299) {
                  throw new IllegalStateException();
               }

               if (var4 > 0) {
                  if (var2 == 191702299) {
                     return;
                  }

                  --var4;
                  var10000 = ds.aw;
                  var10000[var6] = (byte)(var10000[var6] | 2);
               } else {
                  var7 = var0.at(1, -2142787184);
                  if (0 == var7) {
                     var4 = dp.aw(var0, 197503678);
                     var10000 = ds.aw;
                     var10000[var6] = (byte)(var10000[var6] | 2);
                  } else {
                     mi.ac(var0, var6, -547893919);
                  }
               }
            }
         }

         var0.aa((byte)-38);
         if (var4 != 0) {
            throw new RuntimeException();
         } else {
            var0.al((byte)89);

            for(var5 = 0; var5 < ds.ab * -2010934433; ++var5) {
               if (var2 == 191702299) {
                  throw new IllegalStateException();
               }

               var6 = ds.aq[var5];
               if ((ds.aw[var6] & 1) != 0) {
                  if (var2 == 191702299) {
                     return;
                  }

                  if (var4 > 0) {
                     if (var2 == 191702299) {
                        throw new IllegalStateException();
                     }

                     --var4;
                     var10000 = ds.aw;
                     var10000[var6] = (byte)(var10000[var6] | 2);
                  } else {
                     var7 = var0.at(1, -1579324042);
                     if (0 == var7) {
                        if (var2 == 191702299) {
                           return;
                        }

                        var4 = dp.aw(var0, 197503678);
                        var10000 = ds.aw;
                        var10000[var6] = (byte)(var10000[var6] | 2);
                     } else {
                        mi.ac(var0, var6, -621611682);
                     }
                  }
               }
            }

            var0.aa((byte)-26);
            if (0 != var4) {
               throw new RuntimeException();
            } else {
               var0.al((byte)86);

               for(var5 = 0; var5 < 228405989 * ds.al; ++var5) {
                  var6 = ds.at[var5];
                  if (0 != (ds.aw[var6] & 1)) {
                     if (var2 == 191702299) {
                        throw new IllegalStateException();
                     }

                     if (var4 > 0) {
                        --var4;
                        var10000 = ds.aw;
                        var10000[var6] = (byte)(var10000[var6] | 2);
                     } else {
                        var7 = var0.at(1, -1415715820);
                        if (var7 == 0) {
                           if (var2 == 191702299) {
                              throw new IllegalStateException();
                           }

                           var4 = dp.aw(var0, 197503678);
                           var10000 = ds.aw;
                           var10000[var6] = (byte)(var10000[var6] | 2);
                        } else if (kb.au(var0, var6, 940918989)) {
                           if (var2 == 191702299) {
                              throw new IllegalStateException();
                           }

                           var10000 = ds.aw;
                           var10000[var6] = (byte)(var10000[var6] | 2);
                        }
                     }
                  }
               }

               var0.aa((byte)-86);
               if (0 != var4) {
                  if (var2 != 191702299) {
                     throw new RuntimeException();
                  }
               } else {
                  var0.al((byte)-38);

                  for(var5 = 0; var5 < ds.al * 228405989; ++var5) {
                     if (var2 == 191702299) {
                        throw new IllegalStateException();
                     }

                     var6 = ds.at[var5];
                     if (0 == (ds.aw[var6] & 1)) {
                        if (var4 > 0) {
                           if (var2 == 191702299) {
                              throw new IllegalStateException();
                           }

                           --var4;
                           var10000 = ds.aw;
                           var10000[var6] = (byte)(var10000[var6] | 2);
                        } else {
                           var7 = var0.at(1, 315434392);
                           if (0 == var7) {
                              if (var2 == 191702299) {
                                 return;
                              }

                              var4 = dp.aw(var0, 197503678);
                              var10000 = ds.aw;
                              var10000[var6] = (byte)(var10000[var6] | 2);
                           } else if (kb.au(var0, var6, -1019526045)) {
                              var10000 = ds.aw;
                              var10000[var6] = (byte)(var10000[var6] | 2);
                           }
                        }
                     }
                  }

                  var0.aa((byte)-20);
                  if (0 != var4) {
                     if (var2 != 191702299) {
                        throw new RuntimeException();
                     }
                  } else {
                     ds.ab = 0;
                     ds.al = 0;

                     for(var5 = 1; var5 < 2048; ++var5) {
                        if (var2 == 191702299) {
                           throw new IllegalStateException();
                        }

                        var10000 = ds.aw;
                        var10000[var5] = (byte)(var10000[var5] >> 1);
                        dv var9 = client.mc[var5];
                        if (var9 != null) {
                           if (var2 == 191702299) {
                              throw new IllegalStateException();
                           }

                           ds.aq[(ds.ab += 511936671) * -2010934433 - 1] = var5;
                        } else {
                           ds.at[(ds.al += 2033203949) * 228405989 - 1] = var5;
                        }
                     }

                     jd.ab(var0, (byte)7);
                     if (-1633313603 * var0.at - var3 != var1) {
                        if (var2 == 191702299) {
                           throw new IllegalStateException();
                        } else {
                           throw new RuntimeException(var0.at * -1633313603 - var3 + " " + var1);
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "nr.an(" + ')');
      }
   }
}
