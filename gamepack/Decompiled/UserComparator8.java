import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UserComparator8 extends AbstractUserComparator {
   static int at;
   static String worldHost;
   final boolean af;

   public UserComparator8(boolean var1) {
      this.af = var1;
   }

   int af(Buddy var1, Buddy var2) {
      if (-453810525 * Client.worldId == 177258591 * var1.world0) {
         if (Client.worldId * -453810525 != var2.world0 * 177258591) {
            return this.af ? -1 : 1;
         }
      } else if (177258591 * var2.world0 == Client.worldId * -453810525) {
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
      if (-1727408401 * GameShell.plane != Client.sp * -2000567333) {
         Client.sp = -1813500035 * GameShell.plane;
         int var1 = -1727408401 * GameShell.plane;
         int[] var2 = UrlRequester.sceneMinimapSprite.pixels;
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
               if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) {
                  bx.scene.drawTileMinimap(var2, var5, 512, var1, var6, var4);
               }

               if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) {
                  bx.scene.drawTileMinimap(var2, var5, 512, var1 + 1, var6, var4);
               }

               var5 += 4;
            }
         }

         var4 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
         var5 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
         UrlRequester.sceneMinimapSprite.ac();

         int var7;
         for(var6 = 1; var6 < 103; ++var6) {
            for(var7 = 1; var7 < 103; ++var7) {
               if (0 == (Tiles.Tiles_renderFlags[var1][var7][var6] & 24)) {
                  ff.jy_renamed(var1, var7, var6, var4, var5);
               }

               if (var1 < 3 && (Tiles.Tiles_renderFlags[1 + var1][var7][var6] & 8) != 0) {
                  ff.jy_renamed(var1 + 1, var7, var6, var4, var5);
               }
            }
         }

         Client.sr = 0;

         for(var6 = 0; var6 < 104; ++var6) {
            for(var7 = 0; var7 < 104; ++var7) {
               long var8 = bx.scene.getFloorDecorationTag(GameShell.plane * -1727408401, var6, var7);
               if (var8 != 0L) {
                  int var10 = InterfaceParent.at(var8);
                  int var11 = fw.getLocType(var10).mapIconId * 1270945427;
                  if (var11 >= 0 && nf.getMapElementType(var11).ax) {
                     Client.mapIcons[1573101195 * Client.sr] = nf.getMapElementType(var11).ab(false);
                     Client.tw[Client.sr * 1573101195] = var6;
                     Client.ty[Client.sr * 1573101195] = var7;
                     Client.sr += 868833571;
                  }
               }
            }
         }

         ia.rasterProvider.apply();
      }

   }
}
