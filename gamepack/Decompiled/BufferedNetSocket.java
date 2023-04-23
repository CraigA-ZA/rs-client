import java.io.IOException;
import java.net.Socket;

public class BufferedNetSocket extends AbstractSocket {
   Socket af;
   BufferedSource an;
   BufferedSink aw;

   BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
      this.af = var1;
      this.af.setSoTimeout(30000);
      this.af.setTcpNoDelay(true);
      this.af.setReceiveBufferSize(65536);
      this.af.setSendBufferSize(65536);
      this.an = new BufferedSource(this.af.getInputStream(), var2);
      this.aw = new BufferedSink(this.af.getOutputStream(), var3);
   }

   public boolean an(int var1) throws IOException {
      return this.an.isAvailable(var1);
   }

   public int aw() throws IOException {
      return this.an.available();
   }

   static int aw_renamed(int var0, int var1) {
      Inventory var3 = (Inventory)Inventory.af.get((long)var0);
      if (null == var3) {
         return 0;
      } else if (-1 == var1) {
         return 0;
      } else {
         int var4 = 0;

         for(int var5 = 0; var5 < var3.aw.length; ++var5) {
            if (var1 == var3.an[var5]) {
               var4 += var3.aw[var5];
            }
         }

         return var4;
      }
   }

   public int ac() throws IOException {
      return this.an.readUnsignedByte();
   }

   public int au(byte[] var1, int var2, int var3) throws IOException {
      return this.an.read(var1, var2, var3);
   }

   public void ab(byte[] var1, int var2, int var3) throws IOException {
      this.aw.write(var1, var2, var3);
   }

   public void aq() {
      this.aw.close();

      try {
         this.af.close();
      } catch (IOException var3) {
      }

      this.an.close();
   }

   protected void finalize() {
      this.aq();
   }

   public static Font ab_renamed(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
      if (!var0.cv(var2, var3)) {
         return null;
      } else {
         int var5 = var0.getGroupId(var2);
         int var6 = var0.getFileId(var5, var3);
         byte[] var9 = var0.takeFile(var5, var6);
         boolean var8;
         if (null == var9) {
            var8 = false;
         } else {
            sb.aa_renamed(var9);
            var8 = true;
         }

         Font var7;
         if (!var8) {
            var7 = null;
         } else {
            byte[] var10 = var1.takeFile(var5, var6);
            Font var12;
            if (null == var10) {
               var12 = null;
            } else {
               Font var11 = new Font(var10, tx.ac, ar.au, dd.ab, fd.aq, pc.al, VarBitType.at);
               pk.ay_renamed();
               var12 = var11;
            }

            var7 = var12;
         }

         return var7;
      }
   }
}
