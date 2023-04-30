import accessors.RSBufferedNetSocket;
import java.io.IOException;
import java.net.Socket;

public class pv extends ph implements RSBufferedNetSocket {
   qe aw;
   pn an;
   Socket af;

   public int am(byte[] var1, int var2, int var3) throws IOException {
      return this.an.ac(var1, var2, var3, 189303635);
   }

   public int av() throws IOException {
      return this.an.aw((short)29189);
   }

   public int aw(int var1) throws IOException {
      try {
         return this.an.an((byte)25);
      } catch (RuntimeException var2) {
         throw db.an(var2, "pv.aw(" + ')');
      }
   }

   public int ah() throws IOException {
      return this.an.aw((short)21079);
   }

   public int au(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         return this.an.ac(var1, var2, var3, -744884869);
      } catch (RuntimeException var5) {
         throw db.an(var5, "pv.au(" + ')');
      }
   }

   public void ab(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         this.aw.an(var1, var2, var3, (byte)-78);
      } catch (RuntimeException var5) {
         throw db.an(var5, "pv.ab(" + ')');
      }
   }

   public void aq(int var1) {
      try {
         this.aw.aw(663754894);

         try {
            this.af.close();
         } catch (IOException var3) {
         }

         this.an.au(-1118938495);
      } catch (RuntimeException var4) {
         throw db.an(var4, "pv.aq(" + ')');
      }
   }

   public int as(byte[] var1, int var2, int var3) throws IOException {
      return this.an.ac(var1, var2, var3, 469715753);
   }

   public int ay() throws IOException {
      return this.an.an((byte)12);
   }

   public int ao() throws IOException {
      return this.an.an((byte)78);
   }

   public int ac(int var1) throws IOException {
      try {
         return this.an.aw((short)28528);
      } catch (RuntimeException var2) {
         throw db.an(var2, "pv.ac(" + ')');
      }
   }

   public int ai() throws IOException {
      return this.an.an((byte)37);
   }

   public boolean ap(int var1) throws IOException {
      return this.an.af(var1, -1780836105);
   }

   public int ag() throws IOException {
      return this.an.an((byte)57);
   }

   public int ar() throws IOException {
      return this.an.aw((short)20839);
   }

   protected void finalize() {
      try {
         this.aq(323141636);
      } catch (RuntimeException var1) {
         throw db.an(var1, "pv.finalize(" + ')');
      }
   }

   static int aw(int var0, int var1, int var2) {
      try {
         dc var3 = (dc)dc.af.af((long)var0);
         if (null == var3) {
            if (var2 >= 705212246) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else if (-1 == var1) {
            if (var2 >= 705212246) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            int var4 = 0;

            for(int var5 = 0; var5 < var3.aw.length; ++var5) {
               if (var2 >= 705212246) {
                  throw new IllegalStateException();
               }

               if (var1 == var3.an[var5]) {
                  var4 += var3.aw[var5];
               }
            }

            return var4;
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "pv.aw(" + ')');
      }
   }

   public int ax() throws IOException {
      return this.an.an((byte)75);
   }

   public int aj(byte[] var1, int var2, int var3) throws IOException {
      return this.an.ac(var1, var2, var3, 121858257);
   }

   public int ak(byte[] var1, int var2, int var3) throws IOException {
      return this.an.ac(var1, var2, var3, 130409839);
   }

   public void az(byte[] var1, int var2, int var3) throws IOException {
      this.aw.an(var1, var2, var3, (byte)-40);
   }

   public void ad() {
      this.aw.aw(-1422439694);

      try {
         this.af.close();
      } catch (IOException var2) {
      }

      this.an.au(-1118938495);
   }

   public void ae() {
      this.aw.aw(410103038);

      try {
         this.af.close();
      } catch (IOException var2) {
      }

      this.an.au(-1118938495);
   }

   public boolean an(int var1, int var2) throws IOException {
      try {
         return this.an.af(var1, -1797531866);
      } catch (RuntimeException var3) {
         throw db.an(var3, "pv.an(" + ')');
      }
   }

   public boolean by(int var1) throws IOException {
      return this.an.af(var1, -2008288638);
   }

   protected void aha() {
      this.aq(-954350717);
   }

   protected void ahc() {
      this.aq(1055756721);
   }

   public static on ab(nm var0, nm var1, String var2, String var3, int var4) {
      try {
         if (!var0.cv(var2, var3, -1313069490)) {
            if (var4 != 1606925660) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var5 = var0.cy(var2, -507580052);
            int var6 = var0.cx(var5, var3, (short)8192);
            byte[] var9 = var0.bh(var5, var6, (byte)-79);
            boolean var8;
            if (null == var9) {
               var8 = false;
            } else {
               sb.aa(var9, 1145263442);
               var8 = true;
            }

            on var7;
            if (!var8) {
               if (var4 != 1606925660) {
                  throw new IllegalStateException();
               }

               var7 = null;
            } else {
               byte[] var10 = var1.bh(var5, var6, (byte)-77);
               on var13;
               if (null == var10) {
                  if (var4 != 1606925660) {
                     throw new IllegalStateException();
                  }

                  var13 = null;
               } else {
                  on var11 = new on(var10, tx.ac, ar.au, dd.ab, fd.aq, pc.al, hg.at);
                  pk.ay(-262861184);
                  var13 = var11;
               }

               var7 = var13;
            }

            return var7;
         }
      } catch (RuntimeException var12) {
         throw db.an(var12, "pv.ab(" + ')');
      }
   }

   pv(Socket var1, int var2, int var3) throws IOException {
      try {
         super();
         this.af = var1;
         this.af.setSoTimeout(30000);
         this.af.setTcpNoDelay(true);
         this.af.setReceiveBufferSize(65536);
         this.af.setSendBufferSize(65536);
         this.an = new pn(this.af.getInputStream(), var2);
         this.aw = new qe(this.af.getOutputStream(), var3);
      } catch (RuntimeException var4) {
         throw db.an(var4, "pv.<init>(" + ')');
      }
   }
}
