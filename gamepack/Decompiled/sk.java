import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sk extends DualNode {
   List au;
   sh[] ac;

   public sk(AbstractArchive var1, int var2, int var3) {
      byte[] var4 = var1.takeFile(var2, var3 + 1);
      this.af(new Packet(var4));
   }

   public sk(AbstractArchive var1, int var2) {
      byte[] var3 = var1.takeFile(var2, 0);
      this.af(new Packet(var3));
   }

   void af(Packet var1) {
      int var3 = var1.dr();
      this.ac = new sh[var3];
      this.au = new ArrayList(var3);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.ac[var4] = (sh)StructType.findEnumerated(sh.au_renamed(), var1.g1());
         int var5 = var1.dr();
         HashMap var6 = new HashMap(var5);

         while(var5-- > 0) {
            Object var7 = this.ac[var4].at(var1);
            int var8 = var1.dr();
            ArrayList var9 = new ArrayList();

            while(var8-- > 0) {
               int var10 = var1.dr();
               var9.add(var10);
            }

            var6.put(var7, var9);
         }

         this.au.add(var4, var6);
      }

   }

   public List an(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var4 = (Map)this.au.get(var2);
      return (List)var4.get(var1);
   }
}
