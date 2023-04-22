package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

public class DERPrintableString extends ASN1Primitive implements ASN1String {
   final byte[] string;

   public String ahp() {
      return this.getString();
   }

   DERPrintableString(byte[] var1) {
      this.string = var1;
   }

   public static DERPrintableString getInstance(ASN1TaggedObject var0, boolean var1) {
      ASN1Primitive var2 = var0.getObject();
      return !var1 && !(var2 instanceof DERPrintableString) ? new DERPrintableString(ASN1OctetString.getInstance(var2).getOctets()) : getInstance(var2);
   }

   public DERPrintableString(String var1) {
      this(var1, false);
   }

   public DERPrintableString(String var1, boolean var2) {
      if (var2 && !isPrintableString(var1)) {
         throw new IllegalArgumentException("string contains illegal characters");
      } else {
         this.string = org.bouncycastle.util.Strings.toByteArray(var1);
      }
   }

   boolean isConstructed() {
      return false;
   }

   public String getString() {
      return org.bouncycastle.util.Strings.fromByteArray(this.string);
   }

   void encode(ASN1OutputStream var1) throws IOException {
      var1.writeEncoded(19, this.string);
   }

   int encodedLength() {
      return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
   }

   public int hashCode() {
      return Arrays.hashCode(this.string);
   }

   public byte[] getOctets() {
      return Arrays.clone(this.string);
   }

   boolean asn1Equals(ASN1Primitive var1) {
      if (!(var1 instanceof DERPrintableString)) {
         return false;
      } else {
         DERPrintableString var2 = (DERPrintableString)var1;
         return Arrays.areEqual(this.string, var2.string);
      }
   }

   public String toString() {
      return this.getString();
   }

   public static boolean isPrintableString(String var0) {
      for(int var1 = var0.length() - 1; var1 >= 0; --var1) {
         char var2 = var0.charAt(var1);
         if (var2 > 127) {
            return false;
         }

         if (('a' > var2 || var2 > 'z') && ('A' > var2 || var2 > 'Z') && ('0' > var2 || var2 > '9')) {
            switch (var2) {
               case ' ':
               case '\'':
               case '(':
               case ')':
               case '+':
               case ',':
               case '-':
               case '.':
               case '/':
               case ':':
               case '=':
               case '?':
                  break;
               case '!':
               case '"':
               case '#':
               case '$':
               case '%':
               case '&':
               case '*':
               case '0':
               case '1':
               case '2':
               case '3':
               case '4':
               case '5':
               case '6':
               case '7':
               case '8':
               case '9':
               case ';':
               case '<':
               case '>':
               default:
                  return false;
            }
         }
      }

      return true;
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

   public String ahm() {
      return this.getString();
   }

   public static DERPrintableString getInstance(Object var0) {
      if (var0 != null && !(var0 instanceof DERPrintableString)) {
         if (var0 instanceof byte[]) {
            try {
               return (DERPrintableString)fromByteArray((byte[])((byte[])var0));
            } catch (Exception var2) {
               throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
         } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + var0.getClass().getName());
         }
      } else {
         return (DERPrintableString)var0;
      }
   }

   public String ahj() {
      return this.getString();
   }
}
