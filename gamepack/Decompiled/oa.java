import java.io.IOException;

public class oa {
   int an = 0;
   int aw = 0;
   oq af;

   oa(oq var1, int var2, int var3) {
      this.af = var1;
      this.an = var2 * -1672722573;
      this.aw = var3 * 1839294905;
   }

   public String af() {
      if (this.aw()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder(this.ac());

         for(int var3 = -816892485 * this.an; var3 < this.aw * 987221129; ++var3) {
            om var4 = this.af.af(var3);
            var2.append(var4.af);
         }

         return var2.toString();
      }
   }

   static String colorStartTag(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   boolean an(int var1) {
      return this.af.bx() == 2 || this.af.bx() == 1 && (!this.af.aj || this.aw * 987221129 - 1 != var1);
   }

   public boolean aw() {
      return 987221129 * this.aw == -816892485 * this.an;
   }

   public int ac() {
      return this.aw * 987221129 - -816892485 * this.an;
   }

   boolean au(om var1) {
      if (2 == this.af.ae * 874587033) {
         return true;
      } else if (this.af.ae * 874587033 == 0) {
         return false;
      } else {
         return this.af.an() != var1;
      }
   }

   int ab() {
      if (this.aw()) {
         return 0;
      } else {
         om var2 = this.af.af(this.aw * 987221129 - 1);
         if ('\n' == var2.af) {
            return 0;
         } else if (this.au(var2)) {
            return this.af.ak.aw[42];
         } else {
            int var3 = this.af.ak.aw[var2.af];
            if (var3 == 0) {
               return var2.af == '\t' ? this.af.ak.aw[32] * 3 : this.af.ak.aw[32];
            } else {
               return var3;
            }
         }
      }
   }

   public rg aq() {
      if (this.aw()) {
         return new rg(0, 0);
      } else {
         om var2 = this.af.af(987221129 * this.aw - 1);
         return new rg(1620071571 * var2.an + this.ab(), -727185157 * var2.aw);
      }
   }

   public static void ab_renamed() {
      sm.an.clear();
   }

   public om al(int var1) {
      return var1 >= 0 && var1 < this.ac() ? this.af.af(this.an * -816892485 + var1) : null;
   }

   static final int ah_renamed(int var0, int var1) {
      int var3 = Actor.av_renamed(var0 - 1, var1 - 1) + Actor.av_renamed(1 + var0, var1 - 1) + Actor.av_renamed(var0 - 1, var1 + 1) + Actor.av_renamed(1 + var0, 1 + var1);
      int var4 = Actor.av_renamed(var0 - 1, var1) + Actor.av_renamed(var0 + 1, var1) + Actor.av_renamed(var0, var1 - 1) + Actor.av_renamed(var0, var1 + 1);
      int var5 = Actor.av_renamed(var0, var1);
      return var4 / 8 + var3 / 16 + var5 / 4;
   }

   static void nj_renamed(Packet var0) {
      if (Client.hf != null) {
         var0.cs(Client.hf, 0, Client.hf.length);
      } else {
         byte[] var3 = new byte[24];

         try {
            gc.ao.seek(0L);
            gc.ao.readFill(var3);

            int var4;
            for(var4 = 0; var4 < 24 && var3[var4] == 0; ++var4) {
            }

            if (var4 >= 24) {
               throw new IOException();
            }
         } catch (Exception var6) {
            for(int var5 = 0; var5 < 24; ++var5) {
               var3[var5] = -1;
            }
         }

         var0.cs(var3, 0, var3.length);
      }
   }
}
