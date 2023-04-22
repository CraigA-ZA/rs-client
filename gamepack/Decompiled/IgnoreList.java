public class IgnoreList extends UserList {
   final LoginType loginType;

   User newInstance() {
      return new Ignored();
   }

   public IgnoreList(LoginType var1) {
      super(400);
      this.loginType = var1;
   }

   public void read(Packet var1, int var2) {
      while(-1633313603 * var1.index < var2) {
         int var4 = var1.g1();
         if (4 == var4) {
            Username var10 = new Username(var1.cw(), this.loginType);
            if (!var10.hasCleanName()) {
               throw new IllegalStateException();
            }

            boolean var11 = false;
            World.friendSystem.removeIgnore(var10.af(), var11);
         } else {
            boolean var5 = 0 != (var4 & 1);
            Username var6 = new Username(var1.cw(), this.loginType);
            Username var7 = new Username(var1.cw(), this.loginType);
            var1.cw();
            if (!var6.hasCleanName()) {
               throw new IllegalStateException();
            }

            Ignored var8 = (Ignored)this.bn(var6);
            if (var5) {
               Ignored var9 = (Ignored)this.bn(var7);
               if (null != var9 && var9 != var8) {
                  if (null != var8) {
                     this.bg(var9);
                  } else {
                     var8 = var9;
                  }
               }
            }

            if (null != var8) {
               this.bv(var8, var6, var7);
            } else if (this.bm() < 400) {
               int var12 = this.bm();
               var8 = (Ignored)this.bf(var6, var7);
               var8.id = var12 * -450340677;
            }
         }
      }

   }

   User[] newTypedArray(int var1) {
      return new Ignored[var1];
   }
}
