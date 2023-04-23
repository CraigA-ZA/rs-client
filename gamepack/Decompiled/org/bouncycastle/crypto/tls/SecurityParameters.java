package org.bouncycastle.crypto.tls;

import org.bouncycastle.util.Arrays;

public class SecurityParameters {
   boolean encryptThenMAC = false;
   boolean extendedMasterSecret = false;
   boolean truncatedHMac = false;
   byte[] clientRandom = null;
   byte[] masterSecret = null;
   byte[] pskIdentity = null;
   byte[] serverRandom = null;
   byte[] sessionHash = null;
   byte[] srpIdentity = null;
   int cipherSuite = -1;
   int entity = -1;
   int prfAlgorithm = -1;
   int verifyDataLength = -1;
   short compressionAlgorithm = 0;
   short maxFragmentLength = -1;

   public int getCipherSuite() {
      return this.cipherSuite;
   }

   void clear() {
      if (this.masterSecret != null) {
         Arrays.fill((byte[])this.masterSecret, (byte)0);
         this.masterSecret = null;
      }

   }

   public int getPrfAlgorithm() {
      return this.prfAlgorithm;
   }

   public short getCompressionAlgorithm() {
      return this.compressionAlgorithm;
   }

   public byte[] getPSKIdentity() {
      return this.pskIdentity;
   }

   public int getVerifyDataLength() {
      return this.verifyDataLength;
   }

   public int getEntity() {
      return this.entity;
   }

   public byte[] getClientRandom() {
      return this.clientRandom;
   }

   public byte[] getServerRandom() {
      return this.serverRandom;
   }

   public byte[] getSessionHash() {
      return this.sessionHash;
   }

   public byte[] getMasterSecret() {
      return this.masterSecret;
   }

   /** @deprecated */
   public byte[] getPskIdentity() {
      return this.pskIdentity;
   }

   public byte[] getSRPIdentity() {
      return this.srpIdentity;
   }
}
