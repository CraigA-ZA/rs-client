public class dk implements Enumerated {
   static Archive fn;
   static Archive fz;
   static final dk ac = new dk(3, 8);
   static final dk af = new dk(0, -1);
   static final dk an = new dk(1, 1);
   static final dk au = new dk(4, 9);
   static final dk aw = new dk(2, 7);
   final int ab;
   final int aq;

   dk(int var1, int var2) {
      this.ab = var1 * 1067867841;
      this.aq = -1472514397 * var2;
   }

   public static void af_renamed(AbstractArchive var0) {
      StructType.af = var0;
   }

   public int ordinal() {
      return this.aq * 1331571979;
   }

   static final void kk_renamed(int var0, int var1) {
      if (730065501 * Client.ne >= 2 || -303899309 * Client.oq != 0 || Client.om) {
         if (Client.oz) {
            int var3 = DynamicObject.lm_renamed();
            String var4;
            if (1 == Client.oq * -303899309 && 730065501 * Client.ne < 2) {
               var4 = Strings.gu + Strings.gk + Client.it + " " + Formatting.ab;
            } else if (Client.om && 730065501 * Client.ne < 2) {
               var4 = Client.oj + Strings.gk + Client.ob + " " + Formatting.ab;
            } else {
               var4 = Friend.lg_renamed(var3);
            }

            if (730065501 * Client.ne > 2) {
               var4 = var4 + oa.colorStartTag(16777215) + " " + '/' + " " + (Client.ne * 730065501 - 2) + Strings.gw;
            }

            fx.ip.drawRandomAlphaAndSpacing(var4, 4 + var0, 15 + var1, 16777215, 0, Client.ep * -1886224337 / 1000);
         }
      }
   }

   static void nq_renamed() {
      if (fi.wc != null) {
         Client.wn = Client.ep * -465324813;
         fi.wc.ac();

         for(int var1 = 0; var1 < Client.mc.length; ++var1) {
            if (Client.mc[var1] != null) {
               fi.wc.aw(-1232093375 * jm.ib + (1144428983 * Client.mc[var1].bx >> 7), (-411750205 * Client.mc[var1].bo >> 7) + 827352769 * Scenery.jc);
            }
         }
      }

   }
}
