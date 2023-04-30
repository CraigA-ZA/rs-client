package org.bouncycastle.crypto;

public interface Signer {
   boolean verifySignature(byte[] var1);

   void init(boolean var1, CipherParameters var2);

   void reset();

   byte[] generateSignature() throws CryptoException, DataLengthException;

   void update(byte[] var1, int var2, int var3);

   void update(byte var1);
}
