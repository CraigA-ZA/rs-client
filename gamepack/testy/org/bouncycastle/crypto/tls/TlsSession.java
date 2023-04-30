package org.bouncycastle.crypto.tls;

public interface TlsSession {
   void invalidate();

   byte[] getSessionID();

   boolean isResumable();

   SessionParameters exportSessionParameters();
}
