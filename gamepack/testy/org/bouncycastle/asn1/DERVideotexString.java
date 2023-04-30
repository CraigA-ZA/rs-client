package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class DERVideotexString extends ASN1Primitive implements ASN1String {
   final byte[] string;

   public static DERVideotexString getInstance(ASN1TaggedObject var0, boolean var1) {
      ASN1Primitive var2 = var0.getObject();
      return !var1 && !(var2 instanceof DERVideotexString) ? new DERVideotexString(((ASN1OctetString)var2).getOctets()) : getInstance(var2);
   }

   int encodedLength() {
      return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
   }

   public DERVideotexString(byte[] var1) {
      this.string = Arrays.clone(var1);
   }

   public byte[] getOctets() {
      return Arrays.clone(this.string);
   }

   boolean asn1Equals(ASN1Primitive var1) {
      if (!(var1 instanceof DERVideotexString)) {
         return false;
      } else {
         DERVideotexString var2 = (DERVideotexString)var1;
         return Arrays.areEqual(this.string, var2.string);
      }
   }

   boolean isConstructed() {
      return false;
   }

   void encode(ASN1OutputStream var1) throws IOException {
      var1.writeEncoded(21, this.string);
   }

   public int hashCode() {
      return Arrays.hashCode(this.string);
   }

   public String getString() {
      return Strings.fromByteArray(this.string);
   }

   public static DERVideotexString getInstance(Object var0) {
      if (var0 != null && !(var0 instanceof DERVideotexString)) {
         if (var0 instanceof byte[]) {
            try {
               return (DERVideotexString)fromByteArray((byte[])((byte[])var0));
            } catch (Exception var2) {
               throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
         } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + var0.getClass().getName());
         }
      } else {
         return (DERVideotexString)var0;
      }
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
