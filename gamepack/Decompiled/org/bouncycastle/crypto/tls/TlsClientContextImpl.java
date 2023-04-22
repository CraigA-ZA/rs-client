package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;

class TlsClientContextImpl extends AbstractTlsContext implements TlsClientContext {
   TlsClientContextImpl(SecureRandom var1, SecurityParameters var2) {
      super(var1, var2);
   }

   public boolean isServer() {
      return false;
   }
}
