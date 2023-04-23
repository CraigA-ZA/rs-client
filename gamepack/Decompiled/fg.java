public class fg extends fu {
   byte aw;
   int an;
   String af;
   // $FF: synthetic field
   final gr this$0;

   static ClientScript an_renamed(int var0, int var1, int var2) {
      int var4 = (var1 << 8) + var0;
      ClientScript var6 = LocType.aw_renamed(var4, var0);
      if (null != var6) {
         return var6;
      } else {
         int var5 = kd.af_renamed(var2, var0);
         ClientScript var8 = (ClientScript)ClientScript.ClientScript_cached.get((long)(var5 << 16));
         ClientScript var7;
         if (null != var8) {
            var7 = var8;
         } else {
            String var9 = String.valueOf(var5);
            int var10 = ey.archive16.getGroupId(var9);
            if (-1 == var10) {
               var7 = null;
            } else {
               byte[] var11 = ey.archive16.takeFileFlat(var10);
               if (null != var11) {
                  if (var11.length <= 1) {
                     var7 = null;
                     return var7 != null ? var7 : null;
                  }

                  var8 = bz.loadClientScript(var11);
                  if (var8 != null) {
                     ClientScript.ClientScript_cached.put(var8, (long)(var5 << 16));
                     var7 = var8;
                     return var7 != null ? var7 : null;
                  }
               }

               var7 = null;
            }
         }

         return var7 != null ? var7 : null;
      }
   }

   fg(gr var1) {
      this.this$0 = var1;
      this.af = null;
   }

   void af(Packet var1) {
      if (var1.g1() != 255) {
         var1.index -= -1516355947;
         var1.g8s();
      }

      this.af = var1.cz();
      this.an = var1.cl() * 215553043;
      this.aw = var1.g1s();
      var1.g8s();
   }

   void an(gj var1) {
      fz var3 = new fz();
      var3.aw = new Username(this.af);
      var3.an = this.an * -1435095207;
      var3.af = this.aw;
      var1.an(var3);
   }

   static void ab_renamed(float var0, float var1, float var2, float var3, ek var4) {
      float var6 = var1 - var0;
      float var7 = var2 - var1;
      float var8 = var3 - var2;
      float var9 = var7 - var6;
      var4.ao = var8 - var7 - var9;
      var4.ay = var9 + var9 + var9;
      var4.aa = var6 + var6 + var6;
      var4.at = var0;
   }

   static final void nn_renamed(int var0, int var1) {
      gj var3 = var0 >= 0 ? Client.so[var0] : MouseHandler.sx;
      if (var3 != null && var1 >= 0 && var1 < var3.ac()) {
         fz var4 = (fz)var3.aw.get(var1);
         if (var4.af == -1) {
            String var5 = var4.aw.af();
            PacketBitNode var6 = mi.an_renamed(ClientProt.dv, Client.packetWriter.au);
            var6.bit.bu(3 + DynamicObject.bc_renamed(var5));
            var6.bit.bu(var0);
            var6.bit.p2(var1);
            var6.bit.bh(var5);
            Client.packetWriter.aw(var6);
         }
      }
   }
}
