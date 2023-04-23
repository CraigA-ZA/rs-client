public class ga extends fu {
   public static int aa;
   byte an;
   byte aw;
   String af;
   // $FF: synthetic field
   final gr this$0;

   static void aq_renamed() {
      Messages.Messages_channels.clear();
      Messages.Messages_hashTable.clear();
      Messages.Messages_queue.af();
      Messages.Messages_count = 0;
   }

   ga(gr var1) {
      this.this$0 = var1;
   }

   void af(Packet var1) {
      this.af = var1.cz();
      if (null != this.af) {
         var1.g1();
         this.an = var1.g1s();
         this.aw = var1.g1s();
      }

   }

   void an(gj var1) {
      var1.ab = this.af;
      if (null != this.af) {
         var1.aq = this.an;
         var1.al = this.aw;
      }

   }

   public static void bf_renamed(Component var0, int var1, int var2) {
      PlayerAppearance var4 = var0.dd;
      boolean var5 = var2 != 1693987821 * var4.au;
      var4.au = 325591525 * var2;
      if (var5) {
         int var6;
         int var7;
         if (1693987821 * var4.au == var1) {
            for(var6 = 0; var6 < PlayerAppearance.ag.length; ++var6) {
               var7 = PlayerAppearance.ag[var6];
               if (var4.equipment[var7] > 0 && var4.equipment[var7] < 512) {
                  var4.equipment[var7] = var4.af[var7];
               }
            }
         } else {
            label79: {
               if (var4.equipment[0] >= 512) {
                  boolean var11;
                  if (var4.equipment[0] < 512) {
                     var11 = false;
                  } else {
                     ObjType var12 = HeadbarUpdate.getObjType(var4.equipment[0] - 512);
                     var11 = 622494345 * hp.ao.ag != var12.manwear * -1719338253 && hp.ao.ag * 622494345 != 723093341 * var12.manwear2;
                  }

                  if (!var11) {
                     break label79;
                  }
               }

               var4.equipment[622494345 * hp.ao.ag] = 1;
            }

            for(var6 = 0; var6 < 7; ++var6) {
               var7 = PlayerAppearance.ag[var6];
               if (var4.equipment[var7] > 0 && var4.equipment[var7] < 512) {
                  gt.ac_renamed(var2, var4.equipment, var6);
               }
            }
         }
      }

      var4.ax();
   }
}
