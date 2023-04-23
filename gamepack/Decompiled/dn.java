import java.applet.Applet;

final class dn implements lx {
   public static int at;
   public static Applet af;
   // $FF: synthetic field
   final Component val$cc;

   public static byte charToByteCp1252(char var0) {
      byte var2;
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (8364 == var0) {
            var2 = -128;
         } else if (var0 == 8218) {
            var2 = -126;
         } else if (402 == var0) {
            var2 = -125;
         } else if (8222 == var0) {
            var2 = -124;
         } else if (8230 == var0) {
            var2 = -123;
         } else if (var0 == 8224) {
            var2 = -122;
         } else if (8225 == var0) {
            var2 = -121;
         } else if (var0 == 710) {
            var2 = -120;
         } else if (var0 == 8240) {
            var2 = -119;
         } else if (var0 == 352) {
            var2 = -118;
         } else if (var0 == 8249) {
            var2 = -117;
         } else if (var0 == 338) {
            var2 = -116;
         } else if (381 == var0) {
            var2 = -114;
         } else if (8216 == var0) {
            var2 = -111;
         } else if (8217 == var0) {
            var2 = -110;
         } else if (var0 == 8220) {
            var2 = -109;
         } else if (var0 == 8221) {
            var2 = -108;
         } else if (var0 == 8226) {
            var2 = -107;
         } else if (8211 == var0) {
            var2 = -106;
         } else if (var0 == 8212) {
            var2 = -105;
         } else if (732 == var0) {
            var2 = -104;
         } else if (var0 == 8482) {
            var2 = -103;
         } else if (var0 == 353) {
            var2 = -102;
         } else if (8250 == var0) {
            var2 = -101;
         } else if (var0 == 339) {
            var2 = -100;
         } else if (382 == var0) {
            var2 = -98;
         } else if (376 == var0) {
            var2 = -97;
         } else {
            var2 = 63;
         }
      } else {
         var2 = (byte)var0;
      }

      return var2;
   }

   public static IDKType getIDKType(int var0) {
      IDKType var2 = (IDKType)IDKType.IDKType_cached.get((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = IDKType.IDKType_archive.takeFile(3, var0);
         var2 = new IDKType();
         if (null != var3) {
            var2.decode(new Packet(var3));
         }

         IDKType.IDKType_cached.put(var2, (long)var0);
         return var2;
      }
   }

   static void ac_renamed() {
      AccessFile var1 = null;

      try {
         var1 = Rasterizer3D.getPreferencesFile("", Client.studioGame.name, true);
         Packet var2 = aj.clientPreferences.toBuffer();
         var1.write(var2.array, 0, var2.index * -1633313603);
      } catch (Exception var4) {
      }

      try {
         if (null != var1) {
            var1.closeSync(true);
         }
      } catch (Exception var3) {
      }

   }

   dn(Component var1) {
      this.val$cc = var1;
   }

   public void af() {
      if (null != this.val$cc && this.val$cc.br().ab != null) {
         ClientScriptEvent var2 = new ClientScriptEvent();
         var2.aw(this.val$cc);
         var2.setArgs(this.val$cc.br().ab);
         np.jk_renamed().addFirst(var2);
      }

   }
}
