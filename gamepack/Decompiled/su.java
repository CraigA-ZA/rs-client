import java.util.Iterator;

public class su extends qn implements kx {
   final DemotingHashTable aw = new DemotingHashTable(64);
   final AbstractArchive an;
   final int ac;
   static boolean ev;

   public void am() {
      synchronized(this.aw) {
         this.aw.aq();
      }
   }

   protected qg af(int var1) {
      synchronized(this.aw) {
         qb var3 = (qb)this.aw.get((long)var1);
         if (null == var3) {
            var3 = this.ar(var1);
            this.aw.put1(var3, (long)var1);
         }

         return var3;
      }
   }

   public Iterator iterator() {
      return new sn(this);
   }

   public su(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
      super(var1, var3, null != var4 ? var4.cq(var2) : 0);
      this.an = var4;
      this.ac = var2 * 1768319205;
   }

   qb ar(int var1) {
      byte[] var3 = this.an.takeFile(this.ac * -418179859, var1);
      qb var4 = new qb(var1);
      if (var3 != null) {
         var4.aw(new Packet(var3));
      }

      return var4;
   }

   static hd[] au_renamed() {
      return new hd[]{hd.af, hd.aw, hd.an};
   }
}
