package org.bouncycastle.asn1.ocsp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

public class OCSPResponseStatus extends ASN1Object {
   ASN1Enumerated value;

   public static OCSPResponseStatus getInstance(Object var0) {
      if (var0 instanceof OCSPResponseStatus) {
         return (OCSPResponseStatus)var0;
      } else {
         return var0 != null ? new OCSPResponseStatus(ASN1Enumerated.getInstance(var0)) : null;
      }
   }

   public OCSPResponseStatus(int var1) {
      this(new ASN1Enumerated(var1));
   }

   OCSPResponseStatus(ASN1Enumerated var1) {
      this.value = var1;
   }

   public BigInteger getValue() {
      return this.value.getValue();
   }

   public ASN1Primitive toASN1Primitive() {
      return this.value;
   }
}
