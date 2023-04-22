package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {
   Hashtable ab() throws IOException;

   TlsSession getSessionToResume();

   ProtocolVersion getClientHelloRecordLayerVersion();

   ProtocolVersion getClientVersion();

   boolean isFallback();

   int[] getCipherSuites();

   short[] getCompressionMethods();

   void init(TlsClientContext var1);

   void notifyServerVersion(ProtocolVersion var1) throws IOException;

   void notifySessionID(byte[] var1);

   void notifySelectedCipherSuite(int var1);

   void notifySelectedCompressionMethod(short var1);

   TlsKeyExchange getKeyExchange() throws IOException;

   TlsAuthentication aq() throws IOException;

   Hashtable ac() throws IOException;

   TlsAuthentication getAuthentication() throws IOException;

   Vector getClientSupplementalData() throws IOException;

   void notifyNewSessionTicket(NewSessionTicket var1) throws IOException;

   Hashtable aw() throws IOException;

   Hashtable an() throws IOException;

   void processServerExtensions(Hashtable var1) throws IOException;

   Hashtable getClientExtensions() throws IOException;

   Hashtable au() throws IOException;

   void processServerSupplementalData(Vector var1) throws IOException;

   Hashtable af() throws IOException;
}
