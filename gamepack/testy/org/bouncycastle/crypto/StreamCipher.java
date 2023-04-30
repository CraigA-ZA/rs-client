package org.bouncycastle.crypto;

public interface StreamCipher {
   byte returnByte(byte var1);

   String getAlgorithmName();

   int processBytes(byte[] var1, int var2, int var3, byte[] var4, int var5) throws DataLengthException;

   void init(boolean var1, CipherParameters var2) throws IllegalArgumentException;

   void reset();
}
