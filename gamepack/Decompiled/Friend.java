public class Friend extends Buddy {
   boolean af;
   boolean an;

   Friend() {
   }

   int compareTo00(Friend var1) {
      if (this.world0 * 177258591 == -453810525 * Client.bw && Client.bw * -453810525 != 177258591 * var1.world0) {
         return -1;
      } else if (-453810525 * Client.bw == 177258591 * var1.world0 && Client.bw * -453810525 != 177258591 * this.world0) {
         return 1;
      } else if (177258591 * this.world0 != 0 && 0 == var1.world0 * 177258591) {
         return -1;
      } else if (var1.world0 * 177258591 != 0 && 0 == 177258591 * this.world0) {
         return 1;
      } else if (this.af && !var1.af) {
         return -1;
      } else if (!this.af && var1.af) {
         return 1;
      } else if (this.an && !var1.an) {
         return -1;
      } else if (!this.an && var1.an) {
         return 1;
      } else {
         return 0 != this.world0 * 177258591 ? 1907692493 * this.int2 - var1.int2 * 1907692493 : 1907692493 * var1.int2 - 1907692493 * this.int2;
      }
   }

   public int compareTo0(User var1) {
      return this.compareTo00((Friend)var1);
   }

   public int compareTo(Object var1) {
      return this.compareTo00((Friend)var1);
   }

   static void aw_renamed() {
      WorldMapRegion.au.aq();
   }

   static final void jn_renamed() {
      Client.ma = 0;
      int var1 = jm.ib * -1232093375 + (1144428983 * MusicPatchNode.localPlayer.bx >> 7);
      int var2 = Scenery.jc * 827352769 + (-411750205 * MusicPatchNode.localPlayer.bo >> 7);
      if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
         Client.ma = -1041569925;
      }

      if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
         Client.ma = -1041569925;
      }

      if (1 == Client.ma * 43311027 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
         Client.ma = 0;
      }

   }

   static String lg_renamed(int var0) {
      if (var0 < 0) {
         return "";
      } else {
         return Client.menuTargetNames[var0].length() > 0 ? Client.menuActions[var0] + Strings.Strings_space + Client.menuTargetNames[var0] : Client.menuActions[var0];
      }
   }
}
