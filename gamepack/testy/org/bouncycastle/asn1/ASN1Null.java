package org.bouncycastle.asn1;

import java.io.IOException;

public abstract class ASN1Null extends ASN1Primitive {
   public static ASN1Null getInstance(Object var0) {
      if (var0 instanceof ASN1Null) {
         return (ASN1Null)var0;
      } else if (var0 != null) {
         try {
            return getInstance(ASN1Primitive.fromByteArray((byte[])((byte[])var0)));
         } catch (IOException var2) {
            throw new IllegalArgumentException("failed to construct NULL from byte[]: " + var2.getMessage());
         } catch (ClassCastException var3) {
            throw new IllegalArgumentException("unknown object in getInstance(): " + var0.getClass().getName());
         }
      } else {
         return null;
      }
   }

   public int hashCode() {
      return -1;
   }

   abstract void encode(ASN1OutputStream var1) throws IOException;

   boolean asn1Equals(ASN1Primitive var1) {
      return var1 instanceof ASN1Null;
   }

   public int ahv() {
      return -1;
   }

   public String toString() {
      return "NULL";
   }

   public int ahh() {
      return -1;
   }

   public int aht() {
      return -1;
   }

   public String ahm() {
      return "NULL";
   }

   public String ahp() {
      return "NULL";
   }

   public String ahj() {
      return "NULL";
   }
}
