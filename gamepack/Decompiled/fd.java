import java.io.File;
import java.io.RandomAccessFile;

public class fd extends fb {
   public static int[] aq;
   static int uu;
   int af;
   // $FF: synthetic field
   final fa this$0;

   static double af(double var0) {
      return Math.exp(var0 * -var0 / 2.0) / Math.sqrt(6.283185307179586);
   }

   public static File af_renamed(String var0) {
      if (!gm.af) {
         throw new RuntimeException("");
      } else {
         File var2 = (File)gm.aw.get(var0);
         if (null != var2) {
            return var2;
         } else {
            File var3 = new File(tl.an, var0);
            RandomAccessFile var4 = null;

            try {
               File var5 = new File(var3.getParent());
               if (!var5.exists()) {
                  throw new RuntimeException("");
               } else {
                  var4 = new RandomAccessFile(var3, "rw");
                  int var6 = var4.read();
                  var4.seek(0L);
                  var4.write(var6);
                  var4.seek(0L);
                  var4.close();
                  gm.aw.put(var0, var3);
                  return var3;
               }
            } catch (Exception var8) {
               try {
                  if (null != var4) {
                     var4.close();
                     var4 = null;
                  }
               } catch (Exception var7) {
               }

               throw new RuntimeException();
            }
         }
      }
   }

   public static void aw_renamed(String[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var5 = (var2 + var3) / 2;
         int var6 = var2;
         String var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         int var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;

         for(int var9 = var2; var9 < var3; ++var9) {
            if (null == var7 || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         aw_renamed(var0, var1, var2, var6 - 1);
         aw_renamed(var0, var1, 1 + var6, var3);
      }

   }

   fd(fa var1) {
      this.this$0 = var1;
      this.af = 1030741753;
   }

   void af(Packet var1) {
      this.af = var1.cl() * -1030741753;
   }

   void an(fj var1) {
      var1.al(this.af * -469795657);
   }

   static void hi_renamed(int var0) {
      if (Client.dw * -1275976559 != var0) {
         if (-1275976559 * Client.dw == 30) {
            Client.si.ag();
         }

         if (0 == -1275976559 * Client.dw) {
            ClientScriptFrame.client.bs();
         }

         if (var0 == 20 || 40 == var0 || 45 == var0 || var0 == 50) {
            kz.og_renamed(0);
            Client.ga = 0;
            Client.gt = 0;
            Client.timer.aw(var0);
            if (var0 != 20) {
               ag.hb_renamed(false);
            }
         }

         if (var0 != 20 && var0 != 40 && null != ml.ic) {
            ml.ic.aq();
            ml.ic = null;
         }

         if (Client.dw * -1275976559 == 25) {
            Client.je = 0;
            Client.jx = 0;
            Client.jo = -1903772507;
            Client.jk = 0;
            Client.jq = -1711800473;
         }

         int var2;
         if (var0 != 5 && 10 != var0) {
            if (20 == var0) {
               var2 = 11 == -1275976559 * Client.dw ? 4 : 0;
               KeyHandler.an_renamed(NetFileRequest.archive10, rr.archive8, false, var2);
            } else if (11 == var0) {
               KeyHandler.an_renamed(NetFileRequest.archive10, rr.archive8, false, 4);
            } else if (50 == var0) {
               he.ax_renamed("", "Updating date of birth...", "");
               KeyHandler.an_renamed(NetFileRequest.archive10, rr.archive8, false, 7);
            } else {
               Player.au_renamed();
            }
         } else {
            var2 = fl.oi_renamed() ? 0 : 12;
            KeyHandler.an_renamed(NetFileRequest.archive10, rr.archive8, true, var2);
         }

         Client.dw = 188619889 * var0;
      }
   }

   static void am_renamed() {
      Login.di = false;
      ex.at.ay(Login.aw * 578342931, 0);
      ParamType.aa.ay(578342931 * Login.aw + 382, 0);
      Canvas.ay.aw(Login.aw * 578342931 + 382 - Canvas.ay.subWidth / 2, 18);
   }

   static final void kv_renamed(MiniMenuEntry var0, int var1, int var2) {
      if (var0 != null) {
         ar.ke_renamed(68640743 * var0.argument1, var0.argument2 * 1427372077, 532700261 * var0.opcode, 1480765569 * var0.argument0, 680599237 * var0.au, var0.action, var0.aq, var1, var2);
      }

   }

   static final void km_renamed(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      TilePaint.addMiniMenuEntry(var0, var1, var2, var3, var4, var5, var6, false);
   }
}
