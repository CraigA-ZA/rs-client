public class IgnoreList extends UserList {
   final LoginType au;

   public IgnoreList(LoginType var1) {
      super(400);
      this.au = var1;
   }

   User newInstance() {
      return new Ignored();
   }

   User[] newTypedArray(int var1) {
      return new Ignored[var1];
   }

   public void read(Packet var1, int var2) {
      while(-1633313603 * var1.at < var2) {
         int var4 = var1.g1();
         if (4 == var4) {
            Username var10 = new Username(var1.cw(), this.au);
            if (!var10.hasCleanName()) {
               throw new IllegalStateException();
            }

            boolean var11 = false;
            World.vt.removeIgnore(var10.af(), var11);
         } else {
            boolean var5 = 0 != (var4 & 1);
            Username var6 = new Username(var1.cw(), this.au);
            Username var7 = new Username(var1.cw(), this.au);
            var1.cw();
            if (!var6.hasCleanName()) {
               throw new IllegalStateException();
            }

            Ignored var8 = (Ignored)this.getByCurrentUsername(var6);
            if (var5) {
               Ignored var9 = (Ignored)this.getByCurrentUsername(var7);
               if (null != var9 && var9 != var8) {
                  if (null != var8) {
                     this.remove(var9);
                  } else {
                     var8 = var9;
                  }
               }
            }

            if (null != var8) {
               this.changeName(var8, var6, var7);
            } else if (this.size() < 400) {
               int var12 = this.size();
               var8 = (Ignored)this.addLast(var6, var7);
               var8.af = var12 * -450340677;
            }
         }
      }

   }
}
