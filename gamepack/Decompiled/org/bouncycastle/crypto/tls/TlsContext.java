package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.RandomGenerator;

public interface TlsContext {
   ProtocolVersion getServerVersion();

   SecureRandom getSecureRandom();

   SecurityParameters getSecurityParameters();

   boolean isServer();

   ProtocolVersion getClientVersion();

   byte[] exportKeyingMaterial(String var1, byte[] var2, int var3);

   TlsSession getResumableSession();

   RandomGenerator getNonceRandomGenerator();

   void setUserObject(Object var1);

   Object getUserObject();
}
