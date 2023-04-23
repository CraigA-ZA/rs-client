import java.awt.datatransfer.Clipboard;

public class fy extends fb {
   static int az;
   byte an;
   int af;
   // $FF: synthetic field
   final fa this$0;

   static final int af_renamed(int var0, int var1, int var2, int var3) {
      return var1 * var3 + var0 * var2 >> 16;
   }

   static byte[] aw_renamed(byte[] var0) {
      int var2 = var0.length;
      byte[] var3 = new byte[var2];
      System.arraycopy(var0, 0, var3, 0, var2);
      return var3;
   }

   fy(fa var1) {
      this.this$0 = var1;
      this.af = 722551969;
   }

   void write(Packet var1) {
      this.af = var1.cl() * -722551969;
      this.an = var1.g1s();
   }

   void an(fj var1) {
      var1.ao(this.af * -263561057, this.an);
   }

   static final void mq_renamed(Component[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         Component var4 = var0[var3];
         if (null != var4) {
            if (0 == 883712245 * var4.bg) {
               if (var4.gz != null) {
                  mq_renamed(var4.gz, var1);
               }

               InterfaceParent var5 = (InterfaceParent)Client.oc.get((long)(1713081171 * var4.bs));
               if (null != var5) {
                  ec.mu_renamed(var5.af * 944864121, var1);
               }
            }

            ClientScriptEvent var6;
            if (var1 == 0 && null != var4.gt) {
               var6 = new ClientScriptEvent();
               var6.aw = var4;
               var6.af = var4.gt;
               HeadbarUpdate.af_renamed(var6);
            }

            if (1 == var1 && var4.gu != null) {
               if (var4.br * 55577617 >= 0) {
                  Component var7 = gh.an_renamed(var4.bs * 1713081171);
                  if (var7 == null || var7.gz == null || var4.br * 55577617 >= var7.gz.length || var7.gz[55577617 * var4.br] != var4) {
                     continue;
                  }
               }

               var6 = new ClientScriptEvent();
               var6.aw = var4;
               var6.af = var4.gu;
               HeadbarUpdate.af_renamed(var6);
            }
         }
      }

   }

   public static Clipboard ol_renamed() {
      return ClientScriptFrame.bc.ax();
   }
}
