import java.util.Iterator;

class sn implements Iterator {
   int af;
   // $FF: synthetic field
   final su this$0;

   public boolean hasNext() {
      return this.af * 1308054609 < this.this$0.an();
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   public Object next() {
      int var1 = (this.af += -2002094927) * 1308054609 - 1;
      qb var2 = (qb)this.this$0.aw.get((long)var1);
      return var2 != null ? var2 : this.this$0.ar(var1);
   }

   sn(su var1) {
      this.this$0 = var1;
   }
}
