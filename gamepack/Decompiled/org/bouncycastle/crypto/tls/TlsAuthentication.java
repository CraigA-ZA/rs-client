package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsAuthentication {
   TlsCredentials ac(CertificateRequest var1) throws IOException;

   TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException;

   void af(Certificate var1) throws IOException;

   void an(Certificate var1) throws IOException;

   void aw(Certificate var1) throws IOException;

   TlsCredentials au(CertificateRequest var1) throws IOException;

   void notifyServerCertificate(Certificate var1) throws IOException;
}
