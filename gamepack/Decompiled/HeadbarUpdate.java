public class HeadbarUpdate extends Node {
   int cycleOffset;
   int cycle;
   int health;
   int health2;

   HeadbarUpdate(int var1, int var2, int var3, int var4) {
      this.cycle = var1 * -1996034979;
      this.health = 329974251 * var2;
      this.health2 = var3 * -1727836311;
      this.cycleOffset = var4 * 1487825381;
   }

   void set(int var1, int var2, int var3, int var4) {
      this.cycle = var1 * -1996034979;
      this.health = 329974251 * var2;
      this.health2 = var3 * -1727836311;
      this.cycleOffset = 1487825381 * var4;
   }

   public static ObjType getObjType(int var0) {
      ObjType var2 = (ObjType)ObjType.ObjType_cached.get((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = nc.ObjType_archive.takeFile(10, var0);
         var2 = new ObjType();
         var2.id = var0 * 526060183;
         if (null != var3) {
            var2.decode(new Packet(var3));
         }

         var2.an();
         if (-1 != -1375068187 * var2.resizez) {
            var2.genCert(getObjType(var2.resizez * -1375068187), getObjType(1399852547 * var2.resizey));
         }

         if (var2.cg * -1276549997 != -1) {
            var2.genBought(getObjType(var2.cg * -1276549997), getObjType(-1273418661 * var2.cl));
         }

         if (var2.cy * 119859889 != -1) {
            var2.genPlaceholder(getObjType(var2.cy * 119859889), getObjType(-172219939 * var2.cr));
         }

         if (!gm.al && var2.members) {
            var2.name = Strings.Strings_membersObject;
            var2.stockmarket = false;

            int var4;
            for(var4 = 0; var4 < var2.op.length; ++var4) {
               var2.op[var4] = null;
            }

            for(var4 = 0; var4 < var2.iop.length; ++var4) {
               if (var4 != 4) {
                  var2.iop[var4] = null;
               }
            }

            var2.manwearyoff = 1290787642;
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

   public static void runClientScript(ClientScriptEvent var0) {
      PlayerType.runScript(var0, 500000, 475000);
   }
}
