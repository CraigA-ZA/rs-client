package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class X962NamedCurves$23 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = new BigInteger("0340340340340340340340340340340340340340340340340340340323C313FAB50589703B5EC68D3587FEC60D161CC149C1AD4A91", 16);
      BigInteger var2 = BigInteger.valueOf(10080L);
      ECCurve$F2m var3 = new ECCurve$F2m(431, 120, new BigInteger("1A827EF00DD6FC0E234CAF046C6A5D8A85395B236CC4AD2CF32A0CADBDC9DDF620B0EB9906D0957F6C6FEACD615468DF104DE296CD8F", 16), new BigInteger("10D9B4A3D9047D8B154359ABFB1B7F5485B04CEB868237DDC9DEDA982A679A5A919B626D4E50A8DD731B107A9962381FB5D807BF2618", 16), var1, var2);
      return new X9ECParameters(var3, new X9ECPoint(var3, Hex.decode("02120FC05D3C67A99DE161D2F4092622FECA701BE4F50F4758714E8A87BBF2A658EF8C21E7C5EFE965361F6C2999C0C247B0DBD70CE6B7")), var1, var2, (byte[])null);
   }
}