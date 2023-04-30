import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

class ax extends SSLSocket {
   // $FF: synthetic field
   final TlsClientProtocol val$tlsClientProtocol;
   Certificate[] af;
   static boolean an;
   // $FF: synthetic field
   final ah this$0;
   static final int ak = 24;
   // $FF: synthetic field
   final String val$host;
   public static final int bh = 66;
   static final int ac = 4;
   public static final int dc = 102;

   public String[] by() {
      return null;
   }

   public InputStream getInputStream() throws IOException {
      try {
         return this.val$tlsClientProtocol.getInputStream();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ax.getInputStream(" + ')');
      }
   }

   public void bu(String[] var1) {
   }

   public synchronized void close() throws IOException {
      try {
         this.val$tlsClientProtocol.close();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ax.close(" + ')');
      }
   }

   public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ax.addHandshakeCompletedListener(" + ')');
      }
   }

   public void br(boolean var1) {
   }

   public String[] getEnabledCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ax.getEnabledCipherSuites(" + ')');
      }
   }

   public String[] getEnabledProtocols() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ax.getEnabledProtocols(" + ')');
      }
   }

   public boolean getNeedClientAuth() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ax.getNeedClientAuth(" + ')');
      }
   }

   public boolean bo() {
      return false;
   }

   public void bq(String[] var1) {
   }

   public String[] ao() {
      return null;
   }

   public boolean getUseClientMode() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ax.getUseClientMode(" + ')');
      }
   }

   public boolean getWantClientAuth() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ax.getWantClientAuth(" + ')');
      }
   }

   public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ax.removeHandshakeCompletedListener(" + ')');
      }
   }

   public void setEnableSessionCreation(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ax.setEnableSessionCreation(" + ')');
      }
   }

   public void setEnabledCipherSuites(String[] var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ax.setEnabledCipherSuites(" + ')');
      }
   }

   public void setEnabledProtocols(String[] var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ax.setEnabledProtocols(" + ')');
      }
   }

   public void setNeedClientAuth(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ax.setNeedClientAuth(" + ')');
      }
   }

   public void bn(HandshakeCompletedListener var1) {
   }

   public boolean aj() {
      return false;
   }

   public void startHandshake() throws IOException {
      try {
         this.val$tlsClientProtocol.connect(new ai(this));
      } catch (RuntimeException var1) {
         throw db.an(var1, "ax.startHandshake(" + ')');
      }
   }

   public InputStream af() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public void bs(HandshakeCompletedListener var1) {
   }

   public InputStream aw() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public void bl(boolean var1) {
   }

   public synchronized void au() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   public boolean bm() {
      return false;
   }

   public void aq(HandshakeCompletedListener var1) {
   }

   public void al(HandshakeCompletedListener var1) {
   }

   public boolean at() {
      return false;
   }

   public String[] aa() {
      return null;
   }

   public String[] ay() {
      return null;
   }

   public InputStream an() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public String[] ax() {
      return null;
   }

   public String[] ai() {
      return null;
   }

   public void bj(HandshakeCompletedListener var1) {
   }

   public String[] ah() {
      return null;
   }

   public String[] av() {
      return null;
   }

   public boolean ar() {
      return false;
   }

   public boolean am() {
      return false;
   }

   public boolean as() {
      return false;
   }

   ax(ah var1, TlsClientProtocol var2, String var3) {
      this.this$0 = var1;
      this.val$tlsClientProtocol = var2;
      this.val$host = var3;
   }

   public void setWantClientAuth(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ax.setWantClientAuth(" + ')');
      }
   }

   public SSLSession az() {
      return new ar(this);
   }

   public String[] ad() {
      return null;
   }

   public String[] ae() {
      return null;
   }

   public String[] ap() {
      return null;
   }

   public void cs() throws IOException {
      this.val$tlsClientProtocol.connect(new ai(this));
   }

   public String[] bb() {
      return null;
   }

   public String[] bi() {
      return null;
   }

   public synchronized void ab() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   public boolean bk() {
      return false;
   }

   public boolean bx() {
      return false;
   }

   public boolean getEnableSessionCreation() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ax.getEnableSessionCreation(" + ')');
      }
   }

   public void bp(boolean var1) {
   }

   public String[] ag() {
      return null;
   }

   public void bd(HandshakeCompletedListener var1) {
   }

   public void bt(HandshakeCompletedListener var1) {
   }

   public void bc(boolean var1) {
   }

   public boolean be() {
      return false;
   }

   public SSLSession ak() {
      return new ar(this);
   }

   public void setUseClientMode(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ax.setUseClientMode(" + ')');
      }
   }

   public void bg(String[] var1) {
   }

   public SSLSession getSession() {
      try {
         return new ar(this);
      } catch (RuntimeException var1) {
         throw db.an(var1, "ax.getSession(" + ')');
      }
   }

   public void bf(String[] var1) {
   }

   public void ba(boolean var1) {
   }

   public String[] getSupportedCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ax.getSupportedCipherSuites(" + ')');
      }
   }

   public void bv(boolean var1) {
   }

   public OutputStream getOutputStream() throws IOException {
      try {
         return this.val$tlsClientProtocol.getOutputStream();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ax.getOutputStream(" + ')');
      }
   }

   public boolean bz() {
      return false;
   }

   public String[] getSupportedProtocols() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ax.getSupportedProtocols(" + ')');
      }
   }

   public void bh(boolean var1) {
   }

   public void bw(boolean var1) {
   }

   public void ce(boolean var1) {
   }

   public void ci() throws IOException {
      this.val$tlsClientProtocol.connect(new ai(this));
   }

   public OutputStream ac() throws IOException {
      return this.val$tlsClientProtocol.getOutputStream();
   }

   public void cc() throws IOException {
      this.val$tlsClientProtocol.connect(new ai(this));
   }

   static void ci(int var0, byte var1) {
      try {
         if (var0 != -1) {
            if (!bq.ac(var0, 1376777516)) {
               if (var1 <= 104) {
                  throw new IllegalStateException();
               }
            } else {
               mq[] var2 = hn.ap[var0];

               for(int var3 = 0; var3 < var2.length; ++var3) {
                  if (var1 <= 104) {
                     throw new IllegalStateException();
                  }

                  mq var4 = var2[var3];
                  if (null != var4.fi) {
                     if (var1 <= 104) {
                        throw new IllegalStateException();
                     }

                     dr var5 = new dr();
                     var5.aw = var4;
                     var5.af = var4.fi;
                     nz.an(var5, 5000000, 0, 614042183);
                  }
               }

            }
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "ax.ci(" + ')');
      }
   }

   static int ab(int var0) {
      try {
         return 1666539507 * in.ab.ai;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ax.ab(" + ')');
      }
   }
}
