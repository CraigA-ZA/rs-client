public class ClanChat extends UserList {
   final LoginType loginType;
   final Usernamed localUser;
   public String owner = null;
   public String name = null;
   int al = 923743697;
   public int rank;
   public byte minKick;
   static int gw;

   static final void ki_renamed(int var0, int var1, int var2, int var3) {
      for(int var5 = 0; var5 < -356793645 * Client.rr; ++var5) {
         if (Client.rh[var5] + Client.rootComponentWidths[var5] > var0 && Client.rh[var5] < var2 + var0 && Client.rootComponentHeights[var5] + Client.rb[var5] > var1 && Client.rb[var5] < var1 + var3) {
            Client.rm[var5] = true;
         }
      }

   }

   User newInstance() {
      return new ClanMate();
   }

   final void aw(String var1) {
      this.owner = SecureRandomFuture.ac_renamed(var1);
   }

   public final void readUpdate(Packet var1, int var2) {
      this.ay(var1.cw());
      long var4 = var1.g8s();
      this.aw(jn.longToString(var4));
      this.minKick = var1.g1s();
      int var6;
      short var7;
      if (1 == var2) {
         var6 = var1.g1();
         var7 = 255;
      } else {
         if (var2 != 2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var6 = var1.dm();
         var7 = -1;
      }

      if (var6 != var7) {
         int var8 = var6;
         this.bz();

         for(int var9 = 0; var9 < var8; ++var9) {
            ClanMate var10 = (ClanMate)this.bu(new Username(var1.cw(), this.loginType));
            int var11 = var1.cl();
            var10.bf(var11, (this.al += 923743697) * -835632335 - 1);
            var10.aq = var1.g1s() * 1331866435;
            var1.cw();
            this.ah(var10);
         }

      }
   }

   public final void ai() {
      for(int var2 = 0; var2 < this.bm(); ++var2) {
         ((ClanMate)this.bq(var2)).af();
      }

   }

   final void ah(ClanMate var1) {
      if (var1.be().equals(this.localUser.username())) {
         this.rank = var1.aq * 2092329417;
      }

   }

   public final void ag() {
      for(int var2 = 0; var2 < this.bm(); ++var2) {
         ((ClanMate)this.bq(var2)).aa();
      }

   }

   public final void ax(Packet var1) {
      Username var3 = new Username(var1.cw(), this.loginType);
      int var4 = var1.cl();
      byte var5 = var1.g1s();
      boolean var6 = false;
      if (-128 == var5) {
         var6 = true;
      }

      ClanMate var7;
      if (var6) {
         if (this.bm() == 0) {
            return;
         }

         var7 = (ClanMate)this.bn(var3);
         if (var7 != null && var7.bq() == var4) {
            this.bg(var7);
         }
      } else {
         var1.cw();
         var7 = (ClanMate)this.bn(var3);
         if (null == var7) {
            if (this.bm() > this.at * -734344935) {
               return;
            }

            var7 = (ClanMate)this.bu(var3);
         }

         var7.bf(var4, (this.al += 923743697) * -835632335 - 1);
         var7.aq = 1331866435 * var5;
         this.ah(var7);
      }

   }

   final void ay(String var1) {
      this.name = SecureRandomFuture.ac_renamed(var1);
   }

   User[] newTypedArray(int var1) {
      return new ClanMate[var1];
   }

   public ClanChat(LoginType var1, Usernamed var2) {
      super(500);
      this.loginType = var1;
      this.localUser = var2;
   }
}
