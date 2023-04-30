import java.util.HashMap;

public class Fonts {
   HashMap map;
   AbstractArchive af;
   AbstractArchive an;

   public Fonts(AbstractArchive var1, AbstractArchive var2) {
      this.af = var1;
      this.an = var2;
      this.map = new HashMap();
   }

   public HashMap createMap(FontName[] var1) {
      HashMap var3 = new HashMap();
      FontName[] var4 = var1;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         FontName var6 = var4[var5];
         if (this.map.containsKey(var6)) {
            var3.put(var6, this.map.get(var6));
         } else {
            Font var7 = BufferedNetSocket.ab_renamed(this.af, this.an, var6.aq, "");
            if (var7 != null) {
               this.map.put(var6, var7);
               var3.put(var6, var7);
            }
         }
      }

      return var3;
   }
}
