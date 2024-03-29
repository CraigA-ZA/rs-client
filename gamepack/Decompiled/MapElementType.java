public class MapElementType extends DualNode {
   static MapElementType[] MapElementType_cached;
   static int uv;
   static EvictingDualNodeHashTable MapElementType_cachedSprites = new EvictingDualNodeHashTable(256);
   static AbstractArchive af;
   byte[] ad;
   int am = Integer.MIN_VALUE;
   int sprite2 = -1486786935;
   int ar = -1629628643;
   int as = Integer.MIN_VALUE;
   int av = -1896307301;
   int[] ah;
   int[] az;
   public boolean ao = true;
   public boolean ax = false;
   public hd aj;
   public hn ak;
   public int labelsize = 0;
   public int sprite1 = 771758991;
   public int category;
   public int at;
   public String ag;
   public String al;
   public String[] iop = new String[5];
   public final int au;

   MapElementType(int var1) {
      this.aj = hd.an;
      this.ak = hn.an;
      this.category = 627392423;
      this.au = -1846037181 * var1;
   }

   void decode(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (var3 == 0) {
            return;
         }

         this.decode0(var1, var3);
      }
   }

   void decode0(Packet var1, int var2) {
      if (var2 == 1) {
         this.sprite1 = var1.gSmart2or4() * -771758991;
      } else if (var2 == 2) {
         this.sprite2 = var1.gSmart2or4() * 1486786935;
      } else if (var2 == 3) {
         this.al = var1.cw();
      } else if (var2 == 4) {
         this.at = var1.cr() * 578146139;
      } else if (var2 == 5) {
         var1.cr();
      } else if (6 == var2) {
         this.labelsize = var1.g1() * 485929563;
      } else {
         int var4;
         if (7 == var2) {
            var4 = var1.g1();
            if ((var4 & 1) == 0) {
               this.ao = false;
            }

            if ((var4 & 2) == 2) {
               this.ax = true;
            }
         } else if (8 == var2) {
            var1.g1();
         } else if (var2 >= 10 && var2 <= 14) {
            this.iop[var2 - 10] = var1.cw();
         } else if (var2 == 15) {
            var4 = var1.g1();
            this.ah = new int[2 * var4];

            int var5;
            for(var5 = 0; var5 < 2 * var4; ++var5) {
               this.ah[var5] = var1.cg();
            }

            var1.g4s();
            var5 = var1.g1();
            this.az = new int[var5];

            int var6;
            for(var6 = 0; var6 < this.az.length; ++var6) {
               this.az[var6] = var1.g4s();
            }

            this.ad = new byte[var4];

            for(var6 = 0; var6 < var4; ++var6) {
               this.ad[var6] = var1.g1s();
            }
         } else if (16 != var2) {
            if (17 == var2) {
               this.ag = var1.cw();
            } else if (18 == var2) {
               var1.gSmart2or4();
            } else if (19 == var2) {
               this.category = var1.cl() * -627392423;
            } else if (var2 == 21) {
               var1.g4s();
            } else if (22 == var2) {
               var1.g4s();
            } else if (23 == var2) {
               var1.g1();
               var1.g1();
               var1.g1();
            } else if (var2 == 24) {
               var1.cg();
               var1.cg();
            } else if (25 == var2) {
               var1.gSmart2or4();
            } else if (var2 == 28) {
               var1.g1();
            } else if (29 == var2) {
               this.aj = (hd)StructType.findEnumerated(su.au_renamed(), var1.g1());
            } else if (30 == var2) {
               hn[] var7 = new hn[]{hn.aw, hn.an, hn.af};
               this.ak = (hn)StructType.findEnumerated(var7, var1.g1());
            }
         }
      }

   }

   void au() {
      if (this.ah != null) {
         for(int var2 = 0; var2 < this.ah.length; var2 += 2) {
            if (this.ah[var2] < 2140325741 * this.av) {
               this.av = this.ah[var2] * -251176347;
            } else if (this.ah[var2] > this.am * -1897586587) {
               this.am = this.ah[var2] * -281505427;
            }

            if (this.ah[var2 + 1] < this.ar * -1117233973) {
               this.ar = this.ah[var2 + 1] * -517855005;
            } else if (this.ah[var2 + 1] > -2068879661 * this.as) {
               this.as = this.ah[var2 + 1] * -1539448485;
            }
         }
      }

   }

   public Sprite ab(boolean var1) {
      int var3 = var1 ? this.sprite2 * 2035390535 : 1458003089 * this.sprite1;
      return this.aq(var3);
   }

   Sprite aq(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         Sprite var3 = (Sprite)MapElementType_cachedSprites.get((long)var1);
         if (null != var3) {
            return var3;
         } else {
            var3 = sc.readSprite(af, var1, 0);
            if (null != var3) {
               MapElementType_cachedSprites.put(var3, (long)var1);
            }

            return var3;
         }
      }
   }

   public int al() {
      return this.au * 219774827;
   }

   static final void ia_renamed() {
      if (Inventory.sv) {
         for(int var1 = 0; var1 < -2010934433 * ds.ab; ++var1) {
            Player var2 = Client.players[ds.aq[var1]];
            var2.ai();
         }

         Inventory.sv = false;
      }

   }
}
