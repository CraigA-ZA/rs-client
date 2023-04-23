public class HeadbarUpdate extends Node {
   int ac;
   int af;
   int an;
   int aw;

   HeadbarUpdate(int var1, int var2, int var3, int var4) {
      this.af = var1 * -1996034979;
      this.an = 329974251 * var2;
      this.aw = var3 * -1727836311;
      this.ac = var4 * 1487825381;
   }

   void set(int var1, int var2, int var3, int var4) {
      this.af = var1 * -1996034979;
      this.an = 329974251 * var2;
      this.aw = var3 * -1727836311;
      this.ac = 1487825381 * var4;
   }

   public static ObjType getObjType(int var0) {
      ObjType var2 = (ObjType)ObjType.aa.get((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = nc.ab.takeFile(10, var0);
         var2 = new ObjType();
         var2.ai = var0 * 526060183;
         if (null != var3) {
            var2.decode(new Packet(var3));
         }

         var2.reset();
         if (-1 != -1375068187 * var2.ci) {
            var2.au(getObjType(var2.ci * -1375068187), getObjType(1399852547 * var2.ce));
         }

         if (var2.cg * -1276549997 != -1) {
            var2.ab(getObjType(var2.cg * -1276549997), getObjType(-1273418661 * var2.cl));
         }

         if (var2.cy * 119859889 != -1) {
            var2.aq(getObjType(var2.cy * 119859889), getObjType(-172219939 * var2.cr));
         }

         if (!gm.al && var2.bz) {
            var2.ah = Strings.af;
            var2.cf = false;

            int var4;
            for(var4 = 0; var4 < var2.bm.length; ++var4) {
               var2.bm[var4] = null;
            }

            for(var4 = 0; var4 < var2.bd.length; ++var4) {
               if (var4 != 4) {
                  var2.bd[var4] = null;
               }
            }

            var2.bj = 1290787642;
            var2.ck = 0;
            if (var2.cm != null) {
               boolean var7 = false;

               for(Node var5 = var2.cm.first(); null != var5; var5 = var2.cm.next()) {
                  ParamType var6 = bz.getParamType((int)var5.hr);
                  if (var6.ab) {
                     var5.remove();
                  } else {
                     var7 = true;
                  }
               }

               if (!var7) {
                  var2.cm = null;
               }
            }
         }

         ObjType.aa.put(var2, (long)var0);
         return var2;
      }
   }

   public static void af_renamed(ClientScriptEvent var0) {
      PlayerType.an_renamed(var0, 500000, 475000);
   }
}
