package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {
   void trackHashAlgorithm(short var1);

   TlsHandshakeHash notifyPRFDetermined();

   void sealHashAlgorithms();

   void init(TlsContext var1);

   TlsHandshakeHash stopTracking();

   Digest forkPRFHash();

   byte[] getFinalHash(short var1);
}
