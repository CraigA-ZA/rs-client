import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class ah extends SSLSocketFactory {
   SecureRandom af;
   public static ah an;

   public Socket ah(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
      return null;
   }

   public Socket ao(String var1, int var2) throws IOException, UnknownHostException {
      return null;
   }

   public String[] getDefaultCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ah.getDefaultCipherSuites(" + ')');
      }
   }

   public String[] getSupportedCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ah.getSupportedCipherSuites(" + ')');
      }
   }

   public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
      try {
         return null;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ah.createSocket(" + ')');
      }
   }

   static {
      if (Security.getProvider("BC") == null) {
         Security.addProvider(new BouncyCastleProvider());
      }

   }

   public Socket createSocket(InetAddress var1, int var2) throws IOException {
      try {
         return null;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ah.createSocket(" + ')');
      }
   }

   public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
      try {
         return null;
      } catch (RuntimeException var5) {
         throw db.an(var5, "ah.createSocket(" + ')');
      }
   }

   public String[] aq() {
      return null;
   }

   public Socket ay(String var1, int var2) throws IOException, UnknownHostException {
      return null;
   }

   public Socket an(Socket var1, String var2, int var3, boolean var4) throws IOException {
      if (null == var1) {
         var1 = new Socket();
      }

      if (!var1.isConnected()) {
         var1.connect(new InetSocketAddress(var2, var3));
      }

      TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.af);
      return this.af(var2, var5, -489123832);
   }

   public Socket aw(Socket var1, String var2, int var3, boolean var4) throws IOException {
      if (null == var1) {
         var1 = new Socket();
      }

      if (!var1.isConnected()) {
         var1.connect(new InetSocketAddress(var2, var3));
      }

      TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.af);
      return this.af(var2, var5, -489123832);
   }

   public Socket ac(Socket var1, String var2, int var3, boolean var4) throws IOException {
      if (null == var1) {
         var1 = new Socket();
      }

      if (!var1.isConnected()) {
         var1.connect(new InetSocketAddress(var2, var3));
      }

      TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.af);
      return this.af(var2, var5, -489123832);
   }

   public String[] au() {
      return null;
   }

   public String[] ab() {
      return null;
   }

   public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
      try {
         return null;
      } catch (RuntimeException var5) {
         throw db.an(var5, "ah.createSocket(" + ')');
      }
   }

   public String[] al() {
      return null;
   }

   public Socket at(String var1, int var2) throws IOException, UnknownHostException {
      return null;
   }

   public ah() {
      try {
         super();
         this.af = new SecureRandom();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ah.<init>(" + ')');
      }
   }

   SSLSocket am(String var1, TlsClientProtocol var2) {
      return new ax(this, var2, var1);
   }

   SSLSocket as(String var1, TlsClientProtocol var2) {
      return new ax(this, var2, var1);
   }

   public Socket ax(String var1, int var2) throws IOException, UnknownHostException {
      return null;
   }

   public Socket ai(InetAddress var1, int var2) throws IOException {
      return null;
   }

   public Socket ag(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
      return null;
   }

   public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
      try {
         if (null == var1) {
            var1 = new Socket();
         }

         if (!var1.isConnected()) {
            var1.connect(new InetSocketAddress(var2, var3));
         }

         TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.af);
         return this.af(var2, var5, -489123832);
      } catch (RuntimeException var6) {
         throw db.an(var6, "ah.createSocket(" + ')');
      }
   }

   SSLSocket af(String var1, TlsClientProtocol var2, int var3) {
      try {
         return new ax(this, var2, var1);
      } catch (RuntimeException var4) {
         throw db.an(var4, "ah.af(" + ')');
      }
   }

   public Socket ar(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
      return null;
   }

   public Socket aa(String var1, int var2) throws IOException, UnknownHostException {
      return null;
   }

   public Socket av(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
      return null;
   }

   SSLSocket aj(String var1, TlsClientProtocol var2) {
      return new ax(this, var2, var1);
   }

   SSLSocket ak(String var1, TlsClientProtocol var2) {
      return new ax(this, var2, var1);
   }
}
