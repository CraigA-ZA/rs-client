package org.bouncycastle.asn1;

import org.bouncycastle.util.Arrays;

class ASN1ObjectIdentifier$OidHandle {
   final int key;
   final byte[] enc;

   public int aht() {
      return this.key;
   }

   public int hashCode() {
      return this.key;
   }

   public boolean gk(Object var1) {
      return var1 instanceof ASN1ObjectIdentifier$OidHandle ? Arrays.areEqual(this.enc, ((ASN1ObjectIdentifier$OidHandle)var1).enc) : false;
   }

   public boolean gm(Object var1) {
      return var1 instanceof ASN1ObjectIdentifier$OidHandle ? Arrays.areEqual(this.enc, ((ASN1ObjectIdentifier$OidHandle)var1).enc) : false;
   }

   ASN1ObjectIdentifier$OidHandle(byte[] var1) {
      this.key = Arrays.hashCode(var1);
      this.enc = var1;
   }

   public boolean gq(Object var1) {
      return var1 instanceof ASN1ObjectIdentifier$OidHandle ? Arrays.areEqual(this.enc, ((ASN1ObjectIdentifier$OidHandle)var1).enc) : false;
   }

   public boolean equals(Object var1) {
      return var1 instanceof ASN1ObjectIdentifier$OidHandle ? Arrays.areEqual(this.enc, ((ASN1ObjectIdentifier$OidHandle)var1).enc) : false;
   }

   public boolean gi(Object var1) {
      return var1 instanceof ASN1ObjectIdentifier$OidHandle ? Arrays.areEqual(this.enc, ((ASN1ObjectIdentifier$OidHandle)var1).enc) : false;
   }

   public int ahh() {
      return this.key;
   }

   public int ahv() {
      return this.key;
   }
}
