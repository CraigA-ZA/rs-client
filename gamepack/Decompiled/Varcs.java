import java.io.EOFException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Varcs {
   static GraphicsDefaults gg;
   boolean ab = false;
   boolean[] aw;
   /** @deprecated */
   @Deprecated
   String[] au;
   Map ac;
   long aq;

   public static lm[] af_renamed() {
      return new lm[]{lm.af, lm.an, lm.aw, lm.ac, lm.au, lm.ab, lm.aq, lm.al, lm.at, lm.aa, lm.ay};
   }

   Varcs() {
      int var1 = dk.fn.cq(19);
      this.ac = new HashMap();
      this.aw = new boolean[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         VarcInt var4 = (VarcInt)VarcInt.an.get((long)var2);
         VarcInt var3;
         if (var4 != null) {
            var3 = var4;
         } else {
            byte[] var5 = lh.af.takeFile(19, var2);
            var4 = new VarcInt();
            if (var5 != null) {
               var4.decode(new Packet(var5));
            }

            VarcInt.an.put(var4, (long)var2);
            var3 = var4;
         }

         this.aw[var2] = var3.aw;
      }

      var2 = 0;
      if (dk.fn.ao(15)) {
         var2 = dk.fn.cq(15);
      }

      this.au = new String[var2];
      this.aa();
   }

   void setInt(int var1, int var2) {
      this.ac.put(var1, var2);
      if (this.aw[var1]) {
         this.ab = true;
      }

   }

   int getInt(int var1) {
      Object var3 = this.ac.get(var1);
      return var3 instanceof Integer ? (Integer)var3 : -1;
   }

   void setString(int var1, String var2) {
      this.ac.put(var1, var2);
   }

   String getString(int var1) {
      Object var3 = this.ac.get(var1);
      return var3 instanceof String ? (String)var3 : "";
   }

   /** @deprecated */
   @Deprecated
   void setStringOld(int var1, String var2) {
      this.au[var1] = var2;
   }

   /** @deprecated */
   @Deprecated
   String getStringOld(int var1) {
      return this.au[var1];
   }

   void aq() {
      int var2;
      for(var2 = 0; var2 < this.aw.length; ++var2) {
         if (!this.aw[var2]) {
            this.ac.remove(var2);
         }
      }

      for(var2 = 0; var2 < this.au.length; ++var2) {
         this.au[var2] = null;
      }

   }

   AccessFile al(boolean var1) {
      return in.getPreferencesFile("2", Client.cc.aq, var1);
   }

   void at() {
      AccessFile var2 = this.al(true);

      try {
         int var3 = 3;
         int var4 = 0;
         Iterator var5 = this.ac.entrySet().iterator();

         while(var5.hasNext()) {
            Map.Entry var6 = (Map.Entry)var5.next();
            int var7 = (Integer)var6.getKey();
            if (this.aw[var7]) {
               Object var8 = var6.getValue();
               var3 += 3;
               if (var8 instanceof Integer) {
                  var3 += 4;
               } else if (var8 instanceof String) {
                  var3 += DynamicObject.bc_renamed((String)var8);
               }

               ++var4;
            }
         }

         Packet var21 = new Packet(var3);
         var21.bu(2);
         var21.p2(var4);
         Iterator var22 = this.ac.entrySet().iterator();

         while(var22.hasNext()) {
            Map.Entry var23 = (Map.Entry)var22.next();
            int var24 = (Integer)var23.getKey();
            if (this.aw[var24]) {
               var21.p2(var24);
               Object var9 = var23.getValue();
               sh var10 = sh.ab_renamed(var9.getClass());
               var21.bu(454796803 * var10.au);
               sh.aq_renamed(var9, var21);
            }
         }

         var2.write(var21.al, 0, -1633313603 * var21.at);
      } catch (Exception var19) {
      } finally {
         try {
            var2.close();
         } catch (Exception var18) {
         }

      }

      this.ab = false;
      this.aq = Formatting.af_renamed() * 2378911120439077589L;
   }

   void aa() {
      AccessFile var2 = this.al(false);

      label229: {
         try {
            byte[] var3 = new byte[(int)var2.length()];

            int var5;
            for(int var4 = 0; var4 < var3.length; var4 += var5) {
               var5 = var2.read(var3, var4, var3.length - var4);
               if (-1 == var5) {
                  throw new EOFException();
               }
            }

            Packet var25 = new Packet(var3);
            if (var25.al.length - -1633313603 * var25.at < 1) {
               return;
            }

            int var6 = var25.g1();
            if (var6 >= 0 && var6 <= 2) {
               int var7;
               int var8;
               int var9;
               int var10;
               if (var6 >= 2) {
                  var7 = var25.cl();
                  var8 = 0;

                  while(true) {
                     if (var8 >= var7) {
                        break label229;
                     }

                     var9 = var25.cl();
                     var10 = var25.g1();
                     sh var11 = (sh)StructType.findEnumerated(sh.au_renamed(), var10);
                     Object var12 = var11.at(var25);
                     if (var9 >= 0 && var9 < this.aw.length && this.aw[var9]) {
                        this.ac.put(var9, var12);
                     }

                     ++var8;
                  }
               } else {
                  var7 = var25.cl();

                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var25.cl();
                     var10 = var25.g4s();
                     if (var9 >= 0 && var9 < this.aw.length && this.aw[var9]) {
                        this.ac.put(var9, var10);
                     }
                  }

                  var8 = var25.cl();
                  var9 = 0;

                  while(true) {
                     if (var9 >= var8) {
                        break label229;
                     }

                     var25.cl();
                     var25.cw();
                     ++var9;
                  }
               }
            }
         } catch (Exception var23) {
            break label229;
         } finally {
            try {
               var2.close();
            } catch (Exception var22) {
            }

         }

         return;
      }

      this.ab = false;
   }

   void ay() {
      if (this.ab && -7171747788514623875L * this.aq < Formatting.af_renamed() - 60000L) {
         this.at();
      }

   }

   boolean hasUnwrittenChanges() {
      return this.ab;
   }

   static int aq_renamed(int var0, ClientScript var1, boolean var2) {
      Component var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = gh.an_renamed(Interpreter.al[(Interpreter.at -= 427135973) * -964267539]);
      } else {
         var4 = var2 ? SoundSystem.ag : an.ai;
      }

      fw.ma_renamed(var4);
      int var5;
      int var6;
      if (1200 != var0 && 1205 != var0 && 1212 != var0) {
         if (1201 == var0) {
            var4.dr = 866004410;
            var4.dl = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] * 509431749;
            return 1;
         } else if (var0 == 1202) {
            var4.dr = -848477033;
            var4.dl = MusicPatchNode.mi.aw.getChatHeadId() * 509431749;
            return 1;
         } else if (1207 == var0) {
            boolean var8 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
            SecureRandomCallable.bv_renamed(var4, MusicPatchNode.mi.aw, var8);
            return 1;
         } else if (1208 == var0) {
            var5 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
            if (var4.dd == null) {
               throw new RuntimeException("");
            } else {
               ks.ba_renamed(var4, var5);
               return 1;
            }
         } else if (var0 == 1209) {
            Interpreter.at -= 854271946;
            var5 = Interpreter.al[-964267539 * Interpreter.at];
            var6 = Interpreter.al[1 + -964267539 * Interpreter.at];
            if (null == var4.dd) {
               throw new RuntimeException("");
            } else {
               ChatChannel.bq_renamed(var4, var5, var6);
               return 1;
            }
         } else if (var0 == 1210) {
            var5 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
            if (var4.dd == null) {
               throw new RuntimeException("");
            } else {
               ga.bf_renamed(var4, 1693987821 * MusicPatchNode.mi.aw.au, var5);
               return 1;
            }
         } else {
            return 2;
         }
      } else {
         Interpreter.at -= 854271946;
         var5 = Interpreter.al[Interpreter.at * -964267539];
         var6 = Interpreter.al[-964267539 * Interpreter.at + 1];
         var4.gn = -1852876811 * var5;
         var4.gv = var6 * -568259577;
         ObjType var7 = HeadbarUpdate.getObjType(var5);
         var4.dh = 874786355 * var7.ak;
         var4.dp = -2065246853 * var7.az;
         var4.du = var7.ad * 745454881;
         var4.dg = -183088313 * var7.ae;
         var4.de = -347855449 * var7.ap;
         var4.db = 1614948179 * var7.aj;
         if (var0 == 1205) {
            var4.dn = 0;
         } else if (var0 == 1212 | 1552863327 * var7.bi == 1) {
            var4.dn = -761533221;
         } else {
            var4.dn = -1523066442;
         }

         if (var4.df * -289037969 > 0) {
            var4.db = -467727501 * (100808544 * var4.db / (var4.df * -289037969));
         } else if (-1960603747 * var4.bh > 0) {
            var4.db = 100808544 * var4.db / (-1960603747 * var4.bh) * -467727501;
         }

         return 1;
      }
   }

   static Date aq_renamed() {
      Calendar var1 = Calendar.getInstance();
      var1.set(2, 0);
      var1.set(5, 1);
      var1.set(1, 1900);
      return var1.getTime();
   }
}
