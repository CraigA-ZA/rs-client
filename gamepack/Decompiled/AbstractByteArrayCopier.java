public abstract class AbstractByteArrayCopier {
   protected static boolean bf;

   AbstractByteArrayCopier() {
   }

   static ClientScript af_renamed(int var0) {
      ClientScript var2 = (ClientScript)ClientScript.ClientScript_cached.get((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = ey.archive12.takeFile(var0, 0);
         if (null == var3) {
            return null;
         } else {
            var2 = bz.loadClientScript(var3);
            ClientScript.ClientScript_cached.put(var2, (long)var0);
            return var2;
         }
      }
   }

   abstract void set(byte[] var1);

   abstract byte[] get();
}
