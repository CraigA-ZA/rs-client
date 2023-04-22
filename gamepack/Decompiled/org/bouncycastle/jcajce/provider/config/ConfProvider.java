package org.bouncycastle.jcajce.provider.config;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.util.AsymKeyInfoConverter;

public interface ConfProvider {
   boolean hasAlgorithm(String var1, String var2);

   void addAlgorithm(String var1, String var2);

   void addAlgorithm(String var1, ASN1ObjectIdentifier var2, String var3);

   void addKeyInfoConverter(ASN1ObjectIdentifier var1, AsymKeyInfoConverter var2);

   void setParameter(String var1, Object var2);
}
