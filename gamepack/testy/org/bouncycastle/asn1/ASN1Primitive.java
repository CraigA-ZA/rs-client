package org.bouncycastle.asn1;

import java.io.IOException;

public abstract class ASN1Primitive extends ASN1Object {
   public abstract int ahv();

   public static ASN1Primitive fromByteArray(byte[] var0) throws IOException {
      ASN1InputStream var1 = new ASN1InputStream(var0);

      try {
         ASN1Primitive var2 = var1.readObject();
         if (var1.available() != 0) {
            throw new IOException("Extra data detected in stream");
         } else {
            return var2;
         }
      } catch (ClassCastException var3) {
         throw new IOException("cannot recognise object in stream");
      }
   }

   ASN1Primitive() {
   }

   public ASN1Primitive toASN1Primitive() {
      return this;
   }

   public final boolean gk(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof ASN1Encodable && this.asn1Equals(((ASN1Encodable)var1).toASN1Primitive());
      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof ASN1Encodable && this.asn1Equals(((ASN1Encodable)var1).toASN1Primitive());
      }
   }

   public abstract int hashCode();

   abstract boolean isConstructed();

   abstract int encodedLength() throws IOException;

   ASN1Primitive toDERObject() {
      return this;
   }

   public final boolean gi(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof ASN1Encodable && this.asn1Equals(((ASN1Encodable)var1).toASN1Primitive());
      }
   }

   public final boolean gm(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof ASN1Encodable && this.asn1Equals(((ASN1Encodable)var1).toASN1Primitive());
      }
   }

   ASN1Primitive toDLObject() {
      return this;
   }

   public final boolean gq(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof ASN1Encodable && this.asn1Equals(((ASN1Encodable)var1).toASN1Primitive());
      }
   }

   abstract boolean asn1Equals(ASN1Primitive var1);

   public abstract int ahh();

   public abstract int aht();

   abstract void encode(ASN1OutputStream var1) throws IOException;
}
