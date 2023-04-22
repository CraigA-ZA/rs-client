package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.agreement.DHBasicAgreement;
import org.bouncycastle.crypto.generators.DHBasicKeyPairGenerator;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.encoders.Hex;

public class TlsDHUtils {
   public static final Integer EXT_negotiated_ff_dhe_groups = Integers.valueOf(101);
   static final DHParameters draft_ffdhe2432 = fromSafeP("FFFFFFFFFFFFFFFFADF85458A2BB4A9AAFDC5620273D3CF1D8B9C583CE2D3695A9E13641146433FBCC939DCE249B3EF97D2FE363630C75D8F681B202AEC4617AD3DF1ED5D5FD65612433F51F5F066ED0856365553DED1AF3B557135E7F57C935984F0C70E0E68B77E2A689DAF3EFE8721DF158A136ADE73530ACCA4F483A797ABC0AB182B324FB61D108A94BB2C8E3FBB96ADAB760D7F4681D4F42A3DE394DF4AE56EDE76372BB190B07A7C8EE0A6D709E02FCE1CDF7E2ECC03404CD28342F619172FE9CE98583FF8E4F1232EEF28183C3FE3B1B4C6FAD733BB5FCBC2EC22005C58EF1837D1683B2C6F34A26C1B2EFFA886B4238611FCFDCDE355B3B6519035BBC34F4DEF99C023861B46FC9D6E6C9077AD91D2691F7F7EE598CB0FAC186D91CAEFE13098533C8B3FFFFFFFFFFFFFFFF");
   static final DHParameters draft_ffdhe3072 = fromSafeP("FFFFFFFFFFFFFFFFADF85458A2BB4A9AAFDC5620273D3CF1D8B9C583CE2D3695A9E13641146433FBCC939DCE249B3EF97D2FE363630C75D8F681B202AEC4617AD3DF1ED5D5FD65612433F51F5F066ED0856365553DED1AF3B557135E7F57C935984F0C70E0E68B77E2A689DAF3EFE8721DF158A136ADE73530ACCA4F483A797ABC0AB182B324FB61D108A94BB2C8E3FBB96ADAB760D7F4681D4F42A3DE394DF4AE56EDE76372BB190B07A7C8EE0A6D709E02FCE1CDF7E2ECC03404CD28342F619172FE9CE98583FF8E4F1232EEF28183C3FE3B1B4C6FAD733BB5FCBC2EC22005C58EF1837D1683B2C6F34A26C1B2EFFA886B4238611FCFDCDE355B3B6519035BBC34F4DEF99C023861B46FC9D6E6C9077AD91D2691F7F7EE598CB0FAC186D91CAEFE130985139270B4130C93BC437944F4FD4452E2D74DD364F2E21E71F54BFF5CAE82AB9C9DF69EE86D2BC522363A0DABC521979B0DEADA1DBF9A42D5C4484E0ABCD06BFA53DDEF3C1B20EE3FD59D7C25E41D2B66C62E37FFFFFFFFFFFFFFFF");
   static final DHParameters draft_ffdhe4096 = fromSafeP("FFFFFFFFFFFFFFFFADF85458A2BB4A9AAFDC5620273D3CF1D8B9C583CE2D3695A9E13641146433FBCC939DCE249B3EF97D2FE363630C75D8F681B202AEC4617AD3DF1ED5D5FD65612433F51F5F066ED0856365553DED1AF3B557135E7F57C935984F0C70E0E68B77E2A689DAF3EFE8721DF158A136ADE73530ACCA4F483A797ABC0AB182B324FB61D108A94BB2C8E3FBB96ADAB760D7F4681D4F42A3DE394DF4AE56EDE76372BB190B07A7C8EE0A6D709E02FCE1CDF7E2ECC03404CD28342F619172FE9CE98583FF8E4F1232EEF28183C3FE3B1B4C6FAD733BB5FCBC2EC22005C58EF1837D1683B2C6F34A26C1B2EFFA886B4238611FCFDCDE355B3B6519035BBC34F4DEF99C023861B46FC9D6E6C9077AD91D2691F7F7EE598CB0FAC186D91CAEFE130985139270B4130C93BC437944F4FD4452E2D74DD364F2E21E71F54BFF5CAE82AB9C9DF69EE86D2BC522363A0DABC521979B0DEADA1DBF9A42D5C4484E0ABCD06BFA53DDEF3C1B20EE3FD59D7C25E41D2B669E1EF16E6F52C3164DF4FB7930E9E4E58857B6AC7D5F42D69F6D187763CF1D5503400487F55BA57E31CC7A7135C886EFB4318AED6A1E012D9E6832A907600A918130C46DC778F971AD0038092999A333CB8B7A1A1DB93D7140003C2A4ECEA9F98D0ACC0A8291CDCEC97DCF8EC9B55A7F88A46B4DB5A851F44182E1C68A007E5E655F6AFFFFFFFFFFFFFFFF");
   static final DHParameters draft_ffdhe6144 = fromSafeP("FFFFFFFFFFFFFFFFADF85458A2BB4A9AAFDC5620273D3CF1D8B9C583CE2D3695A9E13641146433FBCC939DCE249B3EF97D2FE363630C75D8F681B202AEC4617AD3DF1ED5D5FD65612433F51F5F066ED0856365553DED1AF3B557135E7F57C935984F0C70E0E68B77E2A689DAF3EFE8721DF158A136ADE73530ACCA4F483A797ABC0AB182B324FB61D108A94BB2C8E3FBB96ADAB760D7F4681D4F42A3DE394DF4AE56EDE76372BB190B07A7C8EE0A6D709E02FCE1CDF7E2ECC03404CD28342F619172FE9CE98583FF8E4F1232EEF28183C3FE3B1B4C6FAD733BB5FCBC2EC22005C58EF1837D1683B2C6F34A26C1B2EFFA886B4238611FCFDCDE355B3B6519035BBC34F4DEF99C023861B46FC9D6E6C9077AD91D2691F7F7EE598CB0FAC186D91CAEFE130985139270B4130C93BC437944F4FD4452E2D74DD364F2E21E71F54BFF5CAE82AB9C9DF69EE86D2BC522363A0DABC521979B0DEADA1DBF9A42D5C4484E0ABCD06BFA53DDEF3C1B20EE3FD59D7C25E41D2B669E1EF16E6F52C3164DF4FB7930E9E4E58857B6AC7D5F42D69F6D187763CF1D5503400487F55BA57E31CC7A7135C886EFB4318AED6A1E012D9E6832A907600A918130C46DC778F971AD0038092999A333CB8B7A1A1DB93D7140003C2A4ECEA9F98D0ACC0A8291CDCEC97DCF8EC9B55A7F88A46B4DB5A851F44182E1C68A007E5E0DD9020BFD64B645036C7A4E677D2C38532A3A23BA4442CAF53EA63BB454329B7624C8917BDD64B1C0FD4CB38E8C334C701C3ACDAD0657FCCFEC719B1F5C3E4E46041F388147FB4CFDB477A52471F7A9A96910B855322EDB6340D8A00EF092350511E30ABEC1FFF9E3A26E7FB29F8C183023C3587E38DA0077D9B4763E4E4B94B2BBC194C6651E77CAF992EEAAC0232A281BF6B3A739C1226116820AE8DB5847A67CBEF9C9091B462D538CD72B03746AE77F5E62292C311562A846505DC82DB854338AE49F5235C95B91178CCF2DD5CACEF403EC9D1810C6272B045B3B71F9DC6B80D63FDD4A8E9ADB1E6962A69526D43161C1A41D570D7938DAD4A40E329CD0E40E65FFFFFFFFFFFFFFFF");
   static final BigInteger TWO = BigInteger.valueOf(2L);
   static final DHParameters draft_ffdhe8192 = fromSafeP("FFFFFFFFFFFFFFFFADF85458A2BB4A9AAFDC5620273D3CF1D8B9C583CE2D3695A9E13641146433FBCC939DCE249B3EF97D2FE363630C75D8F681B202AEC4617AD3DF1ED5D5FD65612433F51F5F066ED0856365553DED1AF3B557135E7F57C935984F0C70E0E68B77E2A689DAF3EFE8721DF158A136ADE73530ACCA4F483A797ABC0AB182B324FB61D108A94BB2C8E3FBB96ADAB760D7F4681D4F42A3DE394DF4AE56EDE76372BB190B07A7C8EE0A6D709E02FCE1CDF7E2ECC03404CD28342F619172FE9CE98583FF8E4F1232EEF28183C3FE3B1B4C6FAD733BB5FCBC2EC22005C58EF1837D1683B2C6F34A26C1B2EFFA886B4238611FCFDCDE355B3B6519035BBC34F4DEF99C023861B46FC9D6E6C9077AD91D2691F7F7EE598CB0FAC186D91CAEFE130985139270B4130C93BC437944F4FD4452E2D74DD364F2E21E71F54BFF5CAE82AB9C9DF69EE86D2BC522363A0DABC521979B0DEADA1DBF9A42D5C4484E0ABCD06BFA53DDEF3C1B20EE3FD59D7C25E41D2B669E1EF16E6F52C3164DF4FB7930E9E4E58857B6AC7D5F42D69F6D187763CF1D5503400487F55BA57E31CC7A7135C886EFB4318AED6A1E012D9E6832A907600A918130C46DC778F971AD0038092999A333CB8B7A1A1DB93D7140003C2A4ECEA9F98D0ACC0A8291CDCEC97DCF8EC9B55A7F88A46B4DB5A851F44182E1C68A007E5E0DD9020BFD64B645036C7A4E677D2C38532A3A23BA4442CAF53EA63BB454329B7624C8917BDD64B1C0FD4CB38E8C334C701C3ACDAD0657FCCFEC719B1F5C3E4E46041F388147FB4CFDB477A52471F7A9A96910B855322EDB6340D8A00EF092350511E30ABEC1FFF9E3A26E7FB29F8C183023C3587E38DA0077D9B4763E4E4B94B2BBC194C6651E77CAF992EEAAC0232A281BF6B3A739C1226116820AE8DB5847A67CBEF9C9091B462D538CD72B03746AE77F5E62292C311562A846505DC82DB854338AE49F5235C95B91178CCF2DD5CACEF403EC9D1810C6272B045B3B71F9DC6B80D63FDD4A8E9ADB1E6962A69526D43161C1A41D570D7938DAD4A40E329CCFF46AAA36AD004CF600C8381E425A31D951AE64FDB23FCEC9509D43687FEB69EDD1CC5E0B8CC3BDF64B10EF86B63142A3AB8829555B2F747C932665CB2C0F1CC01BD70229388839D2AF05E454504AC78B7582822846C0BA35C35F5C59160CC046FD8251541FC68C9C86B022BB7099876A460E7451A8A93109703FEE1C217E6C3826E52C51AA691E0E423CFC99E9E31650C1217B624816CDAD9A95F9D5B8019488D9C0A0A1FE3075A577E23183F81D4A3F2FA4571EFC8CE0BA8A4FE8B6855DFE72B0A66EDED2FBABFBE58A30FAFABE1C5D71A87E2F741EF8C1FE86FEA6BBFDE530677F0D97D11D49F7A8443D0822E506A9F4614E011E2A94838FF88CD68C8BB7C5C6424CFFFFFFFFFFFFFFFF");

   public static byte[] createNegotiatedDHEGroupsClientExtension(short[] var0) throws IOException {
      if (var0 != null && var0.length >= 1 && var0.length <= 255) {
         return TlsUtils.encodeUint8ArrayWithUint8Length(var0);
      } else {
         throw new TlsFatalAlert((short)80);
      }
   }

   public static boolean areCompatibleParameters(DHParameters var0, DHParameters var1) {
      return var0.getP().equals(var1.getP()) && var0.getG().equals(var1.getG()) && (var0.getQ() == null || var1.getQ() == null || var0.getQ().equals(var1.getQ()));
   }

   static DHParameters fromSafeP(String var0) {
      BigInteger var1 = fromHex(var0);
      BigInteger var2 = var1.shiftRight(1);
      return new DHParameters(var1, TWO, var2);
   }

   public static DHPrivateKeyParameters generateEphemeralServerKeyExchange(SecureRandom var0, DHParameters var1, OutputStream var2) throws IOException {
      AsymmetricCipherKeyPair var3 = generateDHKeyPair(var0, var1);
      DHPublicKeyParameters var4 = (DHPublicKeyParameters)var3.getPublic();
      (new ServerDHParams(var4)).encode(var2);
      return (DHPrivateKeyParameters)var3.getPrivate();
   }

   public static void addNegotiatedDHEGroupsServerExtension(Hashtable var0, short var1) throws IOException {
      var0.put(EXT_negotiated_ff_dhe_groups, createNegotiatedDHEGroupsServerExtension(var1));
   }

   public static short[] getNegotiatedDHEGroupsClientExtension(Hashtable var0) throws IOException {
      byte[] var1 = TlsUtils.getExtensionData(var0, EXT_negotiated_ff_dhe_groups);
      return var1 == null ? null : readNegotiatedDHEGroupsClientExtension(var1);
   }

   public static DHPublicKeyParameters validateDHPublicKey(DHPublicKeyParameters var0) throws IOException {
      DHParameters var1 = validateDHParameters(var0.getParameters());
      BigInteger var2 = var0.getY();
      if (var2.compareTo(TWO) >= 0 && var2.compareTo(var1.getP().subtract(TWO)) <= 0) {
         return var0;
      } else {
         throw new TlsFatalAlert((short)47);
      }
   }

   public static boolean containsDHECipherSuites(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         if (isDHECipherSuite(var0[var1])) {
            return true;
         }
      }

      return false;
   }

   public static void writeDHParameter(BigInteger var0, OutputStream var1) throws IOException {
      TlsUtils.writeOpaque16(BigIntegers.asUnsignedByteArray(var0), var1);
   }

   public static short getNegotiatedDHEGroupsServerExtension(Hashtable var0) throws IOException {
      byte[] var1 = TlsUtils.getExtensionData(var0, EXT_negotiated_ff_dhe_groups);
      return var1 == null ? -1 : readNegotiatedDHEGroupsServerExtension(var1);
   }

   public static short readNegotiatedDHEGroupsServerExtension(byte[] var0) throws IOException {
      if (var0 == null) {
         throw new IllegalArgumentException("'extensionData' cannot be null");
      } else if (var0.length != 1) {
         throw new TlsFatalAlert((short)50);
      } else {
         return TlsUtils.readUint8(var0, 0);
      }
   }

   public static DHParameters getParametersForDHEGroup(short var0) {
      switch (var0) {
         case 0:
            return draft_ffdhe2432;
         case 1:
            return draft_ffdhe3072;
         case 2:
            return draft_ffdhe4096;
         case 3:
            return draft_ffdhe6144;
         case 4:
            return draft_ffdhe8192;
         default:
            return null;
      }
   }

   public static byte[] calculateDHBasicAgreement(DHPublicKeyParameters var0, DHPrivateKeyParameters var1) {
      DHBasicAgreement var2 = new DHBasicAgreement();
      var2.init(var1);
      BigInteger var3 = var2.calculateAgreement(var0);
      return BigIntegers.asUnsignedByteArray(var3);
   }

   public static boolean isDHECipherSuite(int var0) {
      switch (var0) {
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 45:
         case 50:
         case 51:
         case 56:
         case 57:
         case 64:
         case 68:
         case 69:
         case 103:
         case 106:
         case 107:
         case 135:
         case 136:
         case 142:
         case 143:
         case 144:
         case 145:
         case 153:
         case 154:
         case 158:
         case 159:
         case 162:
         case 163:
         case 170:
         case 171:
         case 178:
         case 179:
         case 180:
         case 181:
         case 189:
         case 190:
         case 195:
         case 196:
         case 49276:
         case 49277:
         case 49280:
         case 49281:
         case 49296:
         case 49297:
         case 49302:
         case 49303:
         case 49310:
         case 49311:
         case 49314:
         case 49315:
         case 49318:
         case 49319:
         case 49322:
         case 49323:
         case 52394:
         case 52397:
         case 65280:
         case 65281:
         case 65298:
         case 65299:
            return true;
         default:
            return false;
      }
   }

   public static byte[] createNegotiatedDHEGroupsServerExtension(short var0) throws IOException {
      TlsUtils.checkUint8(var0);
      byte[] var1 = new byte[1];
      TlsUtils.writeUint8((short)var0, var1, 0);
      return var1;
   }

   public static AsymmetricCipherKeyPair generateDHKeyPair(SecureRandom var0, DHParameters var1) {
      DHBasicKeyPairGenerator var2 = new DHBasicKeyPairGenerator();
      var2.init(new DHKeyGenerationParameters(var0, var1));
      return var2.generateKeyPair();
   }

   public static DHPrivateKeyParameters generateEphemeralClientKeyExchange(SecureRandom var0, DHParameters var1, OutputStream var2) throws IOException {
      AsymmetricCipherKeyPair var3 = generateDHKeyPair(var0, var1);
      DHPublicKeyParameters var4 = (DHPublicKeyParameters)var3.getPublic();
      writeDHParameter(var4.getY(), var2);
      return (DHPrivateKeyParameters)var3.getPrivate();
   }

   public static short[] readNegotiatedDHEGroupsClientExtension(byte[] var0) throws IOException {
      if (var0 == null) {
         throw new IllegalArgumentException("'extensionData' cannot be null");
      } else {
         ByteArrayInputStream var1 = new ByteArrayInputStream(var0);
         short var2 = TlsUtils.readUint8(var1);
         if (var2 < 1) {
            throw new TlsFatalAlert((short)50);
         } else {
            short[] var3 = TlsUtils.readUint8Array(var2, var1);
            TlsProtocol.assertEmpty(var1);
            return var3;
         }
      }
   }

   public static DHParameters validateDHParameters(DHParameters var0) throws IOException {
      BigInteger var1 = var0.getP();
      BigInteger var2 = var0.getG();
      if (!var1.isProbablePrime(2)) {
         throw new TlsFatalAlert((short)47);
      } else if (var2.compareTo(TWO) >= 0 && var2.compareTo(var1.subtract(TWO)) <= 0) {
         return var0;
      } else {
         throw new TlsFatalAlert((short)47);
      }
   }

   static BigInteger fromHex(String var0) {
      return new BigInteger(1, Hex.decode(var0));
   }

   public static BigInteger readDHParameter(InputStream var0) throws IOException {
      return new BigInteger(1, TlsUtils.readOpaque16(var0));
   }

   public static void addNegotiatedDHEGroupsClientExtension(Hashtable var0, short[] var1) throws IOException {
      var0.put(EXT_negotiated_ff_dhe_groups, createNegotiatedDHEGroupsClientExtension(var1));
   }
}
