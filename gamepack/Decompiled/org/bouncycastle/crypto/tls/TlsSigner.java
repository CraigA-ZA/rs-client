package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public interface TlsSigner {
   Signer createSigner(SignatureAndHashAlgorithm var1, AsymmetricKeyParameter var2);

   byte[] generateRawSignature(AsymmetricKeyParameter var1, byte[] var2) throws CryptoException;

   boolean verifyRawSignature(byte[] var1, AsymmetricKeyParameter var2, byte[] var3) throws CryptoException;

   void init(TlsContext var1);

   byte[] generateRawSignature(SignatureAndHashAlgorithm var1, AsymmetricKeyParameter var2, byte[] var3) throws CryptoException;

   Signer createSigner(AsymmetricKeyParameter var1);

   boolean verifyRawSignature(SignatureAndHashAlgorithm var1, byte[] var2, AsymmetricKeyParameter var3, byte[] var4) throws CryptoException;

   Signer createVerifyer(AsymmetricKeyParameter var1);

   Signer createVerifyer(SignatureAndHashAlgorithm var1, AsymmetricKeyParameter var2);

   boolean isValidPublicKey(AsymmetricKeyParameter var1);
}
