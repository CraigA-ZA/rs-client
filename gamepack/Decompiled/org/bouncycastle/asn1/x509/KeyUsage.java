package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;

public class KeyUsage extends ASN1Object {
   DERBitString bitString;

   public ASN1Primitive toASN1Primitive() {
      return this.bitString;
   }

   public static KeyUsage fromExtensions(Extensions var0) {
      return getInstance(var0.getExtensionParsedValue(Extension.keyUsage));
   }

   public KeyUsage(int var1) {
      this.bitString = new DERBitString(var1);
   }

   public static KeyUsage getInstance(Object var0) {
      if (var0 instanceof KeyUsage) {
         return (KeyUsage)var0;
      } else {
         return var0 != null ? new KeyUsage(DERBitString.getInstance(var0)) : null;
      }
   }

   public boolean hasUsages(int var1) {
      return (this.bitString.intValue() & var1) == var1;
   }

   public byte[] getBytes() {
      return this.bitString.getBytes();
   }

   public int getPadBits() {
      return this.bitString.getPadBits();
   }

   KeyUsage(DERBitString var1) {
      this.bitString = var1;
   }

   public String toString() {
      byte[] var1 = this.bitString.getBytes();
      return var1.length == 1 ? "KeyUsage: 0x" + Integer.toHexString(var1[0] & 255) : "KeyUsage: 0x" + Integer.toHexString((var1[1] & 255) << 8 | var1[0] & 255);
   }

   public String ahm() {
      byte[] var1 = this.bitString.getBytes();
      return var1.length == 1 ? "KeyUsage: 0x" + Integer.toHexString(var1[0] & -147832185) : "KeyUsage: 0x" + Integer.toHexString((var1[1] & 255) << 8 | var1[0] & 255);
   }

   public String ahp() {
      byte[] var1 = this.bitString.getBytes();
      return var1.length == 1 ? "KeyUsage: 0x" + Integer.toHexString(var1[0] & 255) : "KeyUsage: 0x" + Integer.toHexString((var1[1] & 255) << 8 | var1[0] & 255);
   }

   public String ahj() {
      byte[] var1 = this.bitString.getBytes();
      return var1.length == 1 ? "KeyUsage: 0x" + Integer.toHexString(var1[0] & -153786565) : "KeyUsage: 0x" + Integer.toHexString((var1[1] & 255) << 8 | var1[0] & -1746144033);
   }
}
