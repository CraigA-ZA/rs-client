import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GrandExchangeEvents {
   public static Comparator ac;
   public static Comparator an = new np();
   public static Comparator au;
   public static Comparator aw;
   public final List af;

   static {
      new WorldComparator();
      aw = new nt();
      ac = new na();
      au = new nn();
   }

   static final void an_renamed(PacketBit var0, int var1) {
      int var3 = var0.at * -1633313603;
      ds.ax = 0;
      int var4 = 0;
      var0.importIndex();

      byte[] var10000;
      int var5;
      int var6;
      int var7;
      for(var5 = 0; var5 < ds.ab * -2010934433; ++var5) {
         var6 = ds.aq[var5];
         if ((ds.aw[var6] & 1) == 0) {
            if (var4 > 0) {
               --var4;
               var10000 = ds.aw;
               var10000[var6] = (byte)(var10000[var6] | 2);
            } else {
               var7 = var0.gBit(1);
               if (0 == var7) {
                  var4 = dp.aw_renamed(var0);
                  var10000 = ds.aw;
                  var10000[var6] = (byte)(var10000[var6] | 2);
               } else {
                  mi.ac_renamed(var0, var6);
               }
            }
         }
      }

      var0.exportIndex();
      if (var4 != 0) {
         throw new RuntimeException();
      } else {
         var0.importIndex();

         for(var5 = 0; var5 < ds.ab * -2010934433; ++var5) {
            var6 = ds.aq[var5];
            if ((ds.aw[var6] & 1) != 0) {
               if (var4 > 0) {
                  --var4;
                  var10000 = ds.aw;
                  var10000[var6] = (byte)(var10000[var6] | 2);
               } else {
                  var7 = var0.gBit(1);
                  if (0 == var7) {
                     var4 = dp.aw_renamed(var0);
                     var10000 = ds.aw;
                     var10000[var6] = (byte)(var10000[var6] | 2);
                  } else {
                     mi.ac_renamed(var0, var6);
                  }
               }
            }
         }

         var0.exportIndex();
         if (0 != var4) {
            throw new RuntimeException();
         } else {
            var0.importIndex();

            for(var5 = 0; var5 < 228405989 * ds.al; ++var5) {
               var6 = ds.at[var5];
               if (0 != (ds.aw[var6] & 1)) {
                  if (var4 > 0) {
                     --var4;
                     var10000 = ds.aw;
                     var10000[var6] = (byte)(var10000[var6] | 2);
                  } else {
                     var7 = var0.gBit(1);
                     if (var7 == 0) {
                        var4 = dp.aw_renamed(var0);
                        var10000 = ds.aw;
                        var10000[var6] = (byte)(var10000[var6] | 2);
                     } else if (kb.updateExternalPlayer(var0, var6)) {
                        var10000 = ds.aw;
                        var10000[var6] = (byte)(var10000[var6] | 2);
                     }
                  }
               }
            }

            var0.exportIndex();
            if (0 != var4) {
               throw new RuntimeException();
            } else {
               var0.importIndex();

               for(var5 = 0; var5 < ds.al * 228405989; ++var5) {
                  var6 = ds.at[var5];
                  if (0 == (ds.aw[var6] & 1)) {
                     if (var4 > 0) {
                        --var4;
                        var10000 = ds.aw;
                        var10000[var6] = (byte)(var10000[var6] | 2);
                     } else {
                        var7 = var0.gBit(1);
                        if (0 == var7) {
                           var4 = dp.aw_renamed(var0);
                           var10000 = ds.aw;
                           var10000[var6] = (byte)(var10000[var6] | 2);
                        } else if (kb.updateExternalPlayer(var0, var6)) {
                           var10000 = ds.aw;
                           var10000[var6] = (byte)(var10000[var6] | 2);
                        }
                     }
                  }
               }

               var0.exportIndex();
               if (0 != var4) {
                  throw new RuntimeException();
               } else {
                  ds.ab = 0;
                  ds.al = 0;

                  for(var5 = 1; var5 < 2048; ++var5) {
                     var10000 = ds.aw;
                     var10000[var5] = (byte)(var10000[var5] >> 1);
                     Player var8 = Client.mc[var5];
                     if (var8 != null) {
                        ds.aq[(ds.ab += 511936671) * -2010934433 - 1] = var5;
                     } else {
                        ds.at[(ds.al += 2033203949) * 228405989 - 1] = var5;
                     }
                  }

                  WorldMapLabelSize.ab_renamed(var0);
                  if (-1633313603 * var0.at - var3 != var1) {
                     throw new RuntimeException(var0.at * -1633313603 - var3 + " " + var1);
                  }
               }
            }
         }
      }
   }

   public GrandExchangeEvents(Packet var1, boolean var2) {
      int var3 = var1.cl();
      boolean var4 = var1.g1() == 1;
      byte var5;
      if (var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.cl();
      this.af = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.af.add(new GrandExchangeEvent(var1, var5, var3));
      }

   }

   public void sort(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.af, var1);
      } else {
         Collections.sort(this.af, Collections.reverseOrder(var1));
      }

   }
}
