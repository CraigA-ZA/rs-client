package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;

class TlsInputStream extends InputStream {
   byte[] buf = new byte[1];
   TlsProtocol handler = null;

   public int available() throws IOException {
      return this.handler.applicationDataAvailable();
   }

   TlsInputStream(TlsProtocol var1) {
      this.handler = var1;
   }

   public int read(byte[] var1, int var2, int var3) throws IOException {
      return this.handler.readApplicationData(var1, var2, var3);
   }

   public int read() throws IOException {
      return this.read(this.buf) < 0 ? -1 : this.buf[0] & 255;
   }

   public void close() throws IOException {
      this.handler.close();
   }
}
