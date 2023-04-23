import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ea extends AbstractUserComparator {
   static int at;
   static String gd;
   final boolean af;

   public ea(boolean var1) {
      this.af = var1;
   }

   int af(Buddy var1, Buddy var2) {
      if (-453810525 * Client.bw == 177258591 * var1.au) {
         if (Client.bw * -453810525 != var2.au * 177258591) {
            return this.af ? -1 : 1;
         }
      } else if (177258591 * var2.au == Client.bw * -453810525) {
         return this.af ? 1 : -1;
      }

      return this.ao(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.af((Buddy)var1, (Buddy)var2);
   }

   public static int an_renamed(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133) & 16383;
   }

   static float[] as_renamed(JSONObject var0, String var1) throws JSONException {
      float[] var3 = new float[4];

      try {
         JSONArray var4 = var0.getJSONArray(var1);
         var3[0] = (float)var4.optDouble(0, 0.0);
         var3[1] = (float)var4.optDouble(1, 0.0);
         var3[2] = (float)var4.optDouble(2, 1.0);
         var3[3] = (float)var4.optDouble(3, 1.0);
      } catch (JSONException var5) {
         var3[0] = 0.0F;
         var3[1] = 0.0F;
         var3[2] = 1.0F;
         var3[3] = 1.0F;
      }

      return var3;
   }

   static final void iu_renamed() {
      if (-1727408401 * GameShell.mh != Client.sp * -2000567333) {
         Client.sp = -1813500035 * GameShell.mh;
         int var1 = -1727408401 * GameShell.mh;
         int[] var2 = UrlRequester.tk.af;
         int var3 = var2.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            var2[var4] = 0;
         }

         int var5;
         int var6;
         for(var4 = 1; var4 < 103; ++var4) {
            var5 = 2048 * (103 - var4) + 24628;

            for(var6 = 1; var6 < 103; ++var6) {
               if ((Tiles.an[var1][var6][var4] & 24) == 0) {
                  bx.js.bm(var2, var5, 512, var1, var6, var4);
               }

               if (var1 < 3 && (Tiles.an[var1 + 1][var6][var4] & 8) != 0) {
                  bx.js.bm(var2, var5, 512, var1 + 1, var6, var4);
               }

               var5 += 4;
            }
         }

         var4 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
         var5 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
         UrlRequester.tk.clearAll();

         int var7;
         for(var6 = 1; var6 < 103; ++var6) {
            for(var7 = 1; var7 < 103; ++var7) {
               if (0 == (Tiles.an[var1][var7][var6] & 24)) {
                  ff.jy_renamed(var1, var7, var6, var4, var5);
               }

               if (var1 < 3 && (Tiles.an[1 + var1][var7][var6] & 8) != 0) {
                  ff.jy_renamed(var1 + 1, var7, var6, var4, var5);
               }
            }
         }

         Client.sr = 0;

         for(var6 = 0; var6 < 104; ++var6) {
            for(var7 = 0; var7 < 104; ++var7) {
               long var8 = bx.js.be(GameShell.mh * -1727408401, var6, var7);
               if (var8 != 0L) {
                  int var10 = InterfaceParent.at(var8);
                  int var11 = fw.an_renamed(var10).be * 1270945427;
                  if (var11 >= 0 && nf.getMapElementType(var11).ax) {
                     Client.ts[1573101195 * Client.sr] = nf.getMapElementType(var11).ab(false);
                     Client.tw[Client.sr * 1573101195] = var6;
                     Client.ty[Client.sr * 1573101195] = var7;
                     Client.sr += 868833571;
                  }
               }
            }
         }

         ia.bn.ar();
      }

   }
}
