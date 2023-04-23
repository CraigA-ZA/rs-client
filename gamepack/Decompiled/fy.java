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

   void af(Packet var1) {
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
               if (var4.children != null) {
                  mq_renamed(var4.children, var1);
               }

               InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)(1713081171 * var4.id));
               if (null != var5) {
                  ec.mu_renamed(var5.af * 944864121, var1);
               }
            }

            ClientScriptEvent var12;
            if (var1 == 0 && null != var4.gt) {
               var12 = new ClientScriptEvent();
               var12.aw = var4;
               var12.args0 = var4.gt;
               HeadbarUpdate.af_renamed(var12);
            }

            if (1 == var1 && var4.gu != null) {
               if (var4.childIndex * 55577617 >= 0) {
                  Component var13 = gh.getInterfaceComponent(var4.id * 1713081171);
                  if (var13 == null || var13.children == null || var4.childIndex * 55577617 >= var13.children.length || var13.children[55577617 * var4.childIndex] != var4) {
                     continue;
                  }
               }

               var12 = new ClientScriptEvent();
               var12.aw = var4;
               var12.args0 = var4.gu;
               HeadbarUpdate.af_renamed(var12);
            }
         }
      }

   }

   public static Clipboard ol_renamed() {
      return ClientScriptFrame.client.ax();
   }
}
