package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

public class DERGraphicString extends ASN1Primitive implements ASN1String {
   final byte[] string;

   public DERGraphicString(byte[] var1) {
      this.string = Arrays.clone(var1);
   }

   public static DERGraphicString getInstance(ASN1TaggedObject var0, boolean var1) {
      ASN1Primitive var2 = var0.getObject();
      return !var1 && !(var2 instanceof DERGraphicString) ? new DERGraphicString(((ASN1OctetString)var2).getOctets()) : getInstance(var2);
   }

   void encode(ASN1OutputStream var1) throws IOException {
      var1.writeEncoded(25, this.string);
   }

   public byte[] getOctets() {
      return Arrays.clone(this.string);
   }

   boolean isConstructed() {
      return false;
   }

   public String getString() {
      return org.bouncycastle.util.Strings.fromByteArray(this.string);
   }

   public static DERGraphicString getInstance(Object var0) {
      if (var0 != null && !(var0 instanceof DERGraphicString)) {
         if (var0 instanceof byte[]) {
            try {
               return (DERGraphicString)fromByteArray((byte[])((byte[])var0));
            } catch (Exception var2) {
               throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
         } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + var0.getClass().getName());
         }
      } else {
         return (DERGraphicString)var0;
      }
   }

   int encodedLength() {
      return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
   }

   boolean asn1Equals(ASN1Primitive var1) {
      if (!(var1 instanceof DERGraphicString)) {
         return false;
      } else {
         DERGraphicString var2 = (DERGraphicString)var1;
         return Arrays.areEqual(this.string, var2.string);
      }
   }

   public int hashCode() {
      return Arrays.hashCode(this.string);
   }

   public int ahh() {
      return Arrays.hashCode(this.string);
   }

   public int aht() {
      return Arrays.hashCode(this.string);
   }

   public int ahv() {
      return Arrays.hashCode(this.string);
   }
}
