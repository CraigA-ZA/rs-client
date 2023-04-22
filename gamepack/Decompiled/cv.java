import java.math.BigInteger;

public class cv {
   static final BigInteger ab = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   static final BigInteger au = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

   cv() throws Throwable {
      throw new Error();
   }

   public static IndexedSprite[] af_renamed(AbstractArchive var0, int var1, int var2) {
      byte[] var5 = var0.takeFile(var1, var2);
      boolean var4;
      if (null == var5) {
         var4 = false;
      } else {
         sb.aa_renamed(var5);
         var4 = true;
      }

      if (!var4) {
         return null;
      } else {
         IndexedSprite[] var6 = new IndexedSprite[1606065339 * tx.af];

         for(int var7 = 0; var7 < 1606065339 * tx.af; ++var7) {
            IndexedSprite var8 = var6[var7] = new IndexedSprite();
            var8.width = tx.an * -822007097;
            var8.height = 378525975 * tx.aw;
            var8.xOffset = tx.ac[var7];
            var8.yOffset = ar.au[var7];
            var8.subWidth = dd.ab[var7];
            var8.subHeight = fd.aq[var7];
            var8.palette = pc.al;
            var8.pixels = VarBitType.at[var7];
         }

         pk.ay_renamed();
         return var6;
      }
   }

   static void nf_renamed(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var3 = new short[16];
      int var4 = 0;

      for(int var5 = 0; var5 < -1485716275 * MouseRecorder.at; ++var5) {
         ObjType var6 = HeadbarUpdate.getObjType(var5);
         if ((!var1 || var6.members) && var6.resizez * -1375068187 == -1 && var6.name.toLowerCase().indexOf(var0) != -1) {
            if (var4 >= 250) {
               kt.wu = 316033701;
               pj.wm = null;
               return;
            }

            if (var4 >= var3.length) {
               short[] var7 = new short[var3.length * 2];

               for(int var8 = 0; var8 < var4; ++var8) {
                  var7[var8] = var3[var8];
               }

               var3 = var7;
            }

            var3[var4++] = (short)var5;
         }
      }

      pj.wm = var3;
      FontName.wj = 0;
      kt.wu = -316033701 * var4;
      String[] var9 = new String[kt.wu * 1764192979];

      for(int var10 = 0; var10 < kt.wu * 1764192979; ++var10) {
         var9[var10] = HeadbarUpdate.getObjType(var3[var10]).name;
      }

      GrandExchangeOffer.af_renamed(var9, pj.wm);
   }

   static final void aa_renamed(Component var0, int var1, int var2, int var3) {
      if (var0.eg == null) {
         throw new RuntimeException();
      } else {
         var0.eg[var1] = var2;
         var0.ed[var1] = var3;
      }
   }
}
