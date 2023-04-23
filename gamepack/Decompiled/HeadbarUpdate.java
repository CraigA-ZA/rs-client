public class HeadbarUpdate extends Node {
   int cycleOffset;
   int health2;
   int cycle;
   int health;

   HeadbarUpdate(int var1, int var2, int var3, int var4) {
      this.health2 = var1 * -1996034979;
      this.cycle = 329974251 * var2;
      this.health = var3 * -1727836311;
      this.cycleOffset = var4 * 1487825381;
   }

   void set(int var1, int var2, int var3, int var4) {
      this.health2 = var1 * -1996034979;
      this.cycle = 329974251 * var2;
      this.health = var3 * -1727836311;
      this.cycleOffset = 1487825381 * var4;
   }

   public static ObjType getObjType(int var0) {
      ObjType var2 = (ObjType)ObjType.ObjType_cached.get((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = nc.ObjType_archive.takeFile(10, var0);
         var2 = new ObjType();
         var2.ai = var0 * 526060183;
         if (null != var3) {
            var2.decode(new Packet(var3));
         }

         var2.an();
         if (-1 != -1375068187 * var2.resizez) {
            var2.au(getObjType(var2.resizez * -1375068187), getObjType(1399852547 * var2.certtemplate));
         }

         if (var2.cg * -1276549997 != -1) {
            var2.ab(getObjType(var2.cg * -1276549997), getObjType(-1273418661 * var2.placeholdertemplate));
         }

         if (var2.cy * 119859889 != -1) {
            var2.aq(getObjType(var2.cy * 119859889), getObjType(-172219939 * var2.cr));
         }

         if (!gm.al && var2.stockmarket) {
            var2.name = Strings.Strings_membersObject;
            var2.members = false;

            int var4;
            for(var4 = 0; var4 < var2.iop.length; ++var4) {
               var2.iop[var4] = null;
            }

            for(var4 = 0; var4 < var2.op.length; ++var4) {
               if (var4 != 4) {
                  var2.op[var4] = null;
               }
            }

            var2.womanwear = 1290787642;
            var2.placeholderlink = 0;
            if (var2.params != null) {
               boolean var7 = false;

               for(Node var5 = var2.params.first(); null != var5; var5 = var2.params.next()) {
                  ParamType var6 = bz.getParamType((int)var5.key);
                  if (var6.autodisable) {
                     var5.remove();
                  } else {
                     var7 = true;
                  }
               }

               if (!var7) {
                  var2.params = null;
               }
            }
         }

         ObjType.ObjType_cached.put(var2, (long)var0);
         return var2;
      }
   }

   public static void af_renamed(ClientScriptEvent var0) {
      PlayerType.an_renamed(var0, 500000, 475000);
   }
}
