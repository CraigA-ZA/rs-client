import accessors.RSAbstractSocket;
import java.io.IOException;
import java.net.Socket;

public abstract class ph implements RSAbstractSocket {
   static final int ac = 50;

   public abstract int ay() throws IOException;

   public abstract int ar() throws IOException;

   public abstract int aw(int var1) throws IOException;

   public abstract boolean ap(int var1) throws IOException;

   public abstract void az(byte[] var1, int var2, int var3) throws IOException;

   public abstract void ab(byte[] var1, int var2, int var3, int var4) throws IOException;

   public abstract void aq(int var1);

   public static ph al(Socket var0, int var1, int var2) throws IOException {
      return new pv(var0, var1, var2);
   }

   public abstract int au(byte[] var1, int var2, int var3, int var4) throws IOException;

   public static ph aa(Socket var0, int var1, int var2) throws IOException {
      return new pv(var0, var1, var2);
   }

   public abstract int ac(int var1) throws IOException;

   public abstract int ao() throws IOException;

   public abstract int ax() throws IOException;

   public abstract int ai() throws IOException;

   public abstract int ag() throws IOException;

   public abstract int ah() throws IOException;

   public abstract int av() throws IOException;

   public abstract int am(byte[] var1, int var2, int var3) throws IOException;

   ph() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ph.<init>(" + ')');
      }
   }

   public abstract int as(byte[] var1, int var2, int var3) throws IOException;

   public abstract int aj(byte[] var1, int var2, int var3) throws IOException;

   public abstract int ak(byte[] var1, int var2, int var3) throws IOException;

   public static ph at(Socket var0, int var1, int var2) throws IOException {
      return new pv(var0, var1, var2);
   }

   public abstract void ad();

   public abstract void ae();

   public abstract boolean an(int var1, int var2) throws IOException;

   public abstract boolean by(int var1) throws IOException;
}
