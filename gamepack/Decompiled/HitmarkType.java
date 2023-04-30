public class HitmarkType extends DualNode {
   public static AbstractArchive af;
   public static AbstractArchive an;
   public static AbstractArchive aw;
   static EvictingDualNodeHashTable HitmarkType_cachedFonts = new EvictingDualNodeHashTable(20);
   static EvictingDualNodeHashTable HitmarkType_cached = new EvictingDualNodeHashTable(64);
   static EvictingDualNodeHashTable au = new EvictingDualNodeHashTable(64);
   int ag = -1067276637;
   int ah = -1113583925;
   int fontId = -1427566695;
   int transformVarbit = -753468781;
   int ar = 1203704241;
   int av = 42326427;
   int transformVarp = 663321583;
   String format = "";
   public int ad = 0;
   public int ai = -1307612166;
   public int aj = 481029747;
   public int am = 0;
   public int as = 0;
   public int ax = 659007217;
   public int az = -720956497;
   public int[] transforms;

   HitmarkType() {
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
         this.fontId = var1.gSmart2or4() * 1427566695;
      } else if (2 == var2) {
         this.ax = var1.cr() * -407348977;
      } else if (var2 == 3) {
         this.ag = var1.gSmart2or4() * 1067276637;
      } else if (var2 == 4) {
         this.av = var1.gSmart2or4() * -42326427;
      } else if (5 == var2) {
         this.ah = var1.gSmart2or4() * 1113583925;
      } else if (var2 == 6) {
         this.ar = var1.gSmart2or4() * -1203704241;
      } else if (var2 == 7) {
         this.am = var1.cg() * -924786991;
      } else if (8 == var2) {
         this.format = var1.gjstr();
      } else if (var2 == 9) {
         this.ai = var1.cl() * -877673633;
      } else if (10 == var2) {
         this.as = var1.cg() * -1866102945;
      } else if (11 == var2) {
         this.aj = 0;
      } else if (12 == var2) {
         this.az = var1.g1() * 720956497;
      } else if (13 == var2) {
         this.ad = var1.cg() * 219094333;
      } else if (var2 == 14) {
         this.aj = var1.cl() * -481029747;
      } else if (var2 == 17 || var2 == 18) {
         this.transformVarbit = var1.cl() * 753468781;
         if (1173802085 * this.transformVarbit == 65535) {
            this.transformVarbit = -753468781;
         }

         this.transformVarp = var1.cl() * -663321583;
         if (this.transformVarp * -1580274447 == 65535) {
            this.transformVarp = 663321583;
         }

         int var4 = -1;
         if (var2 == 18) {
            var4 = var1.cl();
            if (65535 == var4) {
               var4 = -1;
            }
         }

         int var5 = var1.g1();
         this.transforms = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.transforms[var6] = var1.cl();
            if (65535 == this.transforms[var6]) {
               this.transforms[var6] = -1;
            }
         }

         this.transforms[var5 + 1] = var4;
      }

   }

   public final HitmarkType transform() {
      int var2 = -1;
      if (-1 != 1173802085 * this.transformVarbit) {
         var2 = WorldMapSection1.getVarbit(this.transformVarbit * 1173802085);
      } else if (-1 != this.transformVarp * -1580274447) {
         var2 = Varps.Varps_main[-1580274447 * this.transformVarp];
      }

      int var3;
      if (var2 >= 0 && var2 < this.transforms.length - 1) {
         var3 = this.transforms[var2];
      } else {
         var3 = this.transforms[this.transforms.length - 1];
      }

      return var3 != -1 ? ew.getHitmarkType(var3) : null;
   }

   public String getString(int var1) {
      String var3 = this.format;

      while(true) {
         int var4 = var3.indexOf("%1");
         if (var4 < 0) {
            return var3;
         }

         var3 = var3.substring(0, var4) + IDKType.intToString(var1, false) + var3.substring(var4 + 2);
      }
   }

   public Sprite ab() {
      if (728089333 * this.ag < 0) {
         return null;
      } else {
         Sprite var2 = (Sprite)au.get((long)(728089333 * this.ag));
         if (var2 != null) {
            return var2;
         } else {
            var2 = sc.readSprite(an, 728089333 * this.ag, 0);
            if (null != var2) {
               au.put(var2, (long)(728089333 * this.ag));
            }

            return var2;
         }
      }
   }

   public Sprite aq() {
      if (-466249443 * this.ah < 0) {
         return null;
      } else {
         Sprite var2 = (Sprite)au.get((long)(this.ah * -466249443));
         if (var2 != null) {
            return var2;
         } else {
            var2 = sc.readSprite(an, this.ah * -466249443, 0);
            if (var2 != null) {
               au.put(var2, (long)(this.ah * -466249443));
            }

            return var2;
         }
      }
   }

   public Sprite al() {
      if (1100815213 * this.av < 0) {
         return null;
      } else {
         Sprite var2 = (Sprite)au.get((long)(this.av * 1100815213));
         if (null != var2) {
            return var2;
         } else {
            var2 = sc.readSprite(an, 1100815213 * this.av, 0);
            if (var2 != null) {
               au.put(var2, (long)(1100815213 * this.av));
            }

            return var2;
         }
      }
   }

   public Sprite at() {
      if (170092719 * this.ar < 0) {
         return null;
      } else {
         Sprite var2 = (Sprite)au.get((long)(this.ar * 170092719));
         if (var2 != null) {
            return var2;
         } else {
            var2 = sc.readSprite(an, this.ar * 170092719, 0);
            if (var2 != null) {
               au.put(var2, (long)(170092719 * this.ar));
            }

            return var2;
         }
      }
   }

   public Font getFont() {
      if (-1 == 1857366871 * this.fontId) {
         return null;
      } else {
         Font var2 = (Font)HitmarkType_cachedFonts.get((long)(1857366871 * this.fontId));
         if (var2 != null) {
            return var2;
         } else {
            AbstractArchive var4 = an;
            AbstractArchive var5 = aw;
            int var6 = 1857366871 * this.fontId;
            byte[] var8 = var4.takeFile(var6, 0);
            boolean var7;
            if (null == var8) {
               var7 = false;
            } else {
               sb.aa_renamed(var8);
               var7 = true;
            }

            Font var3;
            if (!var7) {
               var3 = null;
            } else {
               byte[] var9 = var5.takeFile(var6, 0);
               Font var12;
               if (var9 == null) {
                  var12 = null;
               } else {
                  Font var10 = new Font(var9, tx.ac, ar.au, dd.ab, fd.aq, pc.al, VarBitType.at);
                  pk.ay_renamed();
                  var12 = var10;
               }

               var3 = var12;
            }

            if (null != var3) {
               HitmarkType_cachedFonts.put(var3, (long)(1857366871 * this.fontId));
            }

            return var3;
         }
      }
   }

   static int bb_renamed(int var0, ClientScript var1, boolean var2) {
      int var4;
      if (var0 == 3500) {
         var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.sh.av(var4) ? 1 : 0;
         return 1;
      } else if (var0 == 3501) {
         var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.sh.ah(var4) ? 1 : 0;
         return 1;
      } else if (3502 == var0) {
         var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.sh.ar(var4) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }
}
