public class gr {
   long af;
   long an = -9024109114974923449L;
   IterableNodeDeque aw = new IterableNodeDeque();

   public gr(Packet var1) {
      this.af(var1);
   }

   void af(Packet var1) {
      this.af = var1.g8s() * 7340227119084236931L;
      this.an = var1.g8s() * 9024109114974923449L;

      for(int var3 = var1.g1(); 0 != var3; var3 = var1.g1()) {
         Object var4;
         if (var3 == 1) {
            var4 = new fg(this);
         } else if (4 == var3) {
            var4 = new ga(this);
         } else if (3 == var3) {
            var4 = new fq(this);
         } else if (2 == var3) {
            var4 = new fr(this);
         } else {
            if (5 != var3) {
               throw new RuntimeException("");
            }

            var4 = new fk(this);
         }

         ((fu)var4).af(var1);
         this.aw.addFirst((Node)var4);
      }

   }

   public void an(gj var1) {
      if (this.af * 5227141310100233771L == var1.key && this.an * 3503076607081773961L == var1.au * -3803380935026318657L) {
         for(fu var3 = (fu)this.aw.last(); null != var3; var3 = (fu)this.aw.previous()) {
            var3.an(var1);
         }

         var1.au += -5510785032985703105L;
      } else {
         throw new RuntimeException("");
      }
   }

   static void kw_renamed() {
      Client.menuOptionsCount = 0;
      Client.isMiniMenuOpen = false;
      Client.menuActions[0] = Strings.Strings_cancel;
      Client.menuTargetNames[0] = "";
      Client.menuArguments1[0] = 1006;
      Client.menuShiftClick[0] = false;
      Client.menuOptionsCount = 1153055221;
   }
}
