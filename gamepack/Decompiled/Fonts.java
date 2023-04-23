import java.util.HashMap;

public class Fonts {
   HashMap aw;
   AbstractArchive af;
   AbstractArchive an;

   public Fonts(AbstractArchive var1, AbstractArchive var2) {
      this.af = var1;
      this.an = var2;
      this.aw = new HashMap();
   }

   public HashMap createMap(FontName[] var1) {
      HashMap var3 = new HashMap();
      FontName[] var4 = var1;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         FontName var6 = var4[var5];
         if (this.aw.containsKey(var6)) {
            var3.put(var6, this.aw.get(var6));
         } else {
            Font var7 = BufferedNetSocket.ab_renamed(this.af, this.an, var6.aq, "");
            if (var7 != null) {
               this.aw.put(var6, var7);
               var3.put(var6, var7);
            }
         }
      }

      return var3;
   }
}
