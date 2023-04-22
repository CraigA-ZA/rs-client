package org.bouncycastle.crypto.tls;

import org.bouncycastle.util.Arrays;

public class SecurityParameters {
   boolean truncatedHMac = false;
   int cipherSuite = -1;
   short compressionAlgorithm = 0;
   byte[] serverRandom = null;
   int verifyDataLength = -1;
   boolean extendedMasterSecret = false;
   byte[] clientRandom = null;
   int prfAlgorithm = -1;
   byte[] sessionHash = null;
   int entity = -1;
   byte[] pskIdentity = null;
   short maxFragmentLength = -1;
   byte[] masterSecret = null;
   boolean encryptThenMAC = false;
   byte[] srpIdentity = null;

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
