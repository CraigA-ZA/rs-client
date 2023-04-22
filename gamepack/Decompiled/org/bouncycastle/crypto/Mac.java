package org.bouncycastle.crypto;

public interface Mac {
   void reset();

   String getAlgorithmName();

   void update(byte[] var1, int var2, int var3) throws DataLengthException, IllegalStateException;

   void init(CipherParameters var1) throws IllegalArgumentException;

   void update(byte var1) throws IllegalStateException;

   int doFinal(byte[] var1, int var2) throws DataLengthException, IllegalStateException;

   int getMacSize();
}
