import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

class ax extends SSLSocket {
   static boolean an;
   Certificate[] af;
   // $FF: synthetic field
   final ah this$0;
   // $FF: synthetic field
   final String val$host;
   // $FF: synthetic field
   final TlsClientProtocol val$tlsClientProtocol;

   ax(ah var1, TlsClientProtocol var2, String var3) {
      this.this$0 = var1;
      this.val$tlsClientProtocol = var2;
      this.val$host = var3;
   }

   public InputStream getInputStream() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public OutputStream getOutputStream() throws IOException {
      return this.val$tlsClientProtocol.getOutputStream();
   }

   public synchronized void close() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
   }

   static int ab_renamed() {
      return 1666539507 * Rasterizer3D.ab.ai;
   }

   public boolean getEnableSessionCreation() {
      return false;
   }

   public String[] getEnabledCipherSuites() {
      return null;
   }

   public String[] getEnabledProtocols() {
      return null;
   }

   public boolean getNeedClientAuth() {
      return false;
   }

   public SSLSession getSession() {
      return new ar(this);
   }

   public String[] getSupportedProtocols() {
      return null;
   }

   public String[] getSupportedCipherSuites() {
      return null;
   }

   public boolean getUseClientMode() {
      return false;
   }

   public boolean getWantClientAuth() {
      return false;
   }

   public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
   }

   public void setEnableSessionCreation(boolean var1) {
   }

   public void setEnabledCipherSuites(String[] var1) {
   }

   public void setEnabledProtocols(String[] var1) {
   }

   public void setNeedClientAuth(boolean var1) {
   }

   public void setUseClientMode(boolean var1) {
   }

   public void setWantClientAuth(boolean var1) {
   }

   public void startHandshake() throws IOException {
      this.val$tlsClientProtocol.connect(new ai(this));
   }

   static void ci_renamed(int var0) {
      if (var0 != -1) {
         if (SoundSystem.loadInterface(var0)) {
            Component[] var2 = hn.interfaceComponents[var0];

            for(int var3 = 0; var3 < var2.length; ++var3) {
               Component var4 = var2[var3];
               if (null != var4.onStatTransmit) {
                  ClientScriptEvent var5 = new ClientScriptEvent();
                  var5.aw = var4;
                  var5.args0 = var4.onStatTransmit;
                  PlayerType.an_renamed(var5, 5000000, 0);
               }
            }

         }
      }
   }
}
