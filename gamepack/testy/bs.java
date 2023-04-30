import accessors.RSSoundEffect;

public class bs implements RSSoundEffect {
   static final int af = 22050;
   ca[] an = new ca[10];
   int aw;
   int ac;

   public final int at() {
      int var1 = -1889883171;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.an[var2] != null && this.an[var2].av / 20 < var1) {
            var1 = this.an[var2].av / 20;
         }
      }

      if (this.aw < this.ac && this.aw / 20 < var1) {
         var1 = this.aw / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.an[var2] != null) {
               ca var10000 = this.an[var2];
               var10000.av -= var1 * 20;
            }
         }

         if (this.aw < this.ac) {
            this.aw -= var1 * 20;
            this.ac -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public static bs af(nm var0, int var1, int var2) {
      byte[] var3 = var0.bh(var1, var2, (byte)-35);
      return var3 == null ? null : new bs(new sg(var3));
   }

   public br an() {
      byte[] var1 = this.ac();
      return new br(22050, var1, 22050 * this.aw / 1000, 22050 * this.ac / 1000);
   }

   public final int aw() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.an[var2] != null && this.an[var2].av / 20 < var1) {
            var1 = this.an[var2].av / 20;
         }
      }

      if (this.aw < this.ac && this.aw / 20 < var1) {
         var1 = this.aw / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.an[var2] != null) {
               ca var10000 = this.an[var2];
               var10000.av -= var1 * 20;
            }
         }

         if (this.aw < this.ac) {
            this.aw -= var1 * 20;
            this.ac -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] ac() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.an[var2] != null && this.an[var2].ah + this.an[var2].av > var1) {
            var1 = this.an[var2].ah + this.an[var2].av;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.an[var4] != null) {
               int var5 = this.an[var4].ah * 22050 / 1000;
               int var6 = this.an[var4].av * 22050 / 1000;
               int[] var7 = this.an[var4].af(var5, this.an[var4].ah);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   public final int ao() {
      int var1 = -739725905;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.an[var2] != null && this.an[var2].av / 20 < var1) {
            var1 = this.an[var2].av / 20;
         }
      }

      if (this.aw < this.ac && this.aw / 20 < var1) {
         var1 = this.aw / 20;
      }

      if (var1 != -2082394032 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.an[var2] != null) {
               ca var10000 = this.an[var2];
               var10000.av -= var1 * 20;
            }
         }

         if (this.aw < this.ac) {
            this.aw -= var1 * 20;
            this.ac -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public br ab() {
      byte[] var1 = this.ac();
      return new br(-313950619, var1, -1318711762 * this.aw / 473639352, -1414498817 * this.ac / -1427472440);
   }

   public br aq() {
      byte[] var1 = this.ac();
      return new br(22050, var1, -2079092416 * this.aw / 1000, 22050 * this.ac / -575246537);
   }

   public br al() {
      byte[] var1 = this.ac();
      return new br(1397188514, var1, -1702216849 * this.aw / 1000, 22050 * this.ac / 1000);
   }

   bs(sg var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.cm((byte)7);
         if (var3 != 0) {
            var1.at -= -1516355947;
            this.an[var2] = new ca();
            this.an[var2].aw(var1);
         }
      }

      this.aw = var1.cl(-1044101781);
      this.ac = var1.cl(-284490295);
   }

   public final int aa() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.an[var2] != null && this.an[var2].av / 20 < var1) {
            var1 = this.an[var2].av / 20;
         }
      }

      if (this.aw < this.ac && this.aw / 20 < var1) {
         var1 = this.aw / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.an[var2] != null) {
               ca var10000 = this.an[var2];
               var10000.av -= var1 * 20;
            }
         }

         if (this.aw < this.ac) {
            this.aw -= var1 * 20;
            this.ac -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public final int ay() {
      int var1 = -763140820;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.an[var2] != null && this.an[var2].av / 20 < var1) {
            var1 = this.an[var2].av / 20;
         }
      }

      if (this.aw < this.ac && this.aw / 20 < var1) {
         var1 = this.aw / 20;
      }

      if (var1 != -1868252628 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.an[var2] != null) {
               ca var10000 = this.an[var2];
               var10000.av -= var1 * 20;
            }
         }

         if (this.aw < this.ac) {
            this.aw -= var1 * 20;
            this.ac -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] ax() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.an[var2] != null && this.an[var2].ah + this.an[var2].av > var1) {
            var1 = this.an[var2].ah + this.an[var2].av;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.an[var4] != null) {
               int var5 = this.an[var4].ah * 22050 / 1000;
               int var6 = this.an[var4].av * 22050 / 1000;
               int[] var7 = this.an[var4].af(var5, this.an[var4].ah);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   public static bs au(nm var0, int var1, int var2) {
      byte[] var3 = var0.bh(var1, var2, (byte)-64);
      return var3 == null ? null : new bs(new sg(var3));
   }

   final byte[] ai() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.an[var2] != null && this.an[var2].ah + this.an[var2].av > var1) {
            var1 = this.an[var2].ah + this.an[var2].av;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.an[var4] != null) {
               int var5 = this.an[var4].ah * 22050 / 1000;
               int var6 = this.an[var4].av * 22050 / 1000;
               int[] var7 = this.an[var4].af(var5, this.an[var4].ah);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }
}
