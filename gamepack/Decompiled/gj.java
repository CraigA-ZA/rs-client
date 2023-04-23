import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class gj extends Node {
   static int[] av;
   boolean af;
   boolean an = true;
   int[] ac;
   long au;
   public byte al;
   public byte aq;
   public String ab = null;
   public List aw;

   static final int an_renamed(int var0, int var1, int var2, int var3) {
      return var2 * var1 - var0 * var3 >> 16;
   }

   static {
      new BitSet(65536);
   }

   public gj(Packet var1) {
      this.decode(var1);
   }

   public int[] af() {
      if (this.ac == null) {
         String[] var2 = new String[this.aw.size()];
         this.ac = new int[this.aw.size()];

         for(int var3 = 0; var3 < this.aw.size(); this.ac[var3] = var3++) {
            var2[var3] = ((fz)this.aw.get(var3)).aw.an();
         }

         int[] var4 = this.ac;
         fd.aw_renamed(var2, var4, 0, var2.length - 1);
      }

      return this.ac;
   }

   void an(fz var1) {
      this.aw.add(var1);
      this.ac = null;
   }

   void animate(int var1) {
      this.aw.remove(var1);
      this.ac = null;
   }

   public int gIsaac1() {
      return this.aw.size();
   }

   public int au(String var1) {
      if (!this.an) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var3 = 0; var3 < this.aw.size(); ++var3) {
            if (((fz)this.aw.get(var3)).aw.af().equalsIgnoreCase(var1)) {
               return var3;
            }
         }

         return -1;
      }
   }

   void decode(Packet var1) {
      int var3 = var1.g1();
      if (0 != (var3 & 1)) {
         this.af = true;
      }

      if ((var3 & 2) != 0) {
         this.an = true;
      }

      int var4 = 2;
      if (0 != (var3 & 4)) {
         var4 = var1.g1();
      }

      this.hr = var1.g8s();
      this.au = var1.g8s() * -5510785032985703105L;
      this.ab = var1.cw();
      var1.gbool();
      this.al = var1.g1s();
      this.aq = var1.g1s();
      int var5 = var1.cl();
      if (var5 > 0) {
         this.aw = new ArrayList(var5);

         for(int var6 = 0; var6 < var5; ++var6) {
            fz var7 = new fz();
            if (this.af) {
               var1.g8s();
            }

            if (this.an) {
               var7.aw = new Username(var1.cw());
            }

            var7.af = var1.g1s();
            var7.an = var1.cl() * 820606875;
            if (var4 >= 3) {
               var1.gbool();
            }

            this.aw.add(var6, var7);
         }
      }

   }
}
