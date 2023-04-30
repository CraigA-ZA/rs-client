import java.util.Iterator;

class sn implements Iterator {
   int af;
   // $FF: synthetic field
   final su this$0;

   public Object ab() {
      int var1 = (this.af += 360373455) * -428053912 - 1;
      qb var2 = (qb)this.this$0.aw.af((long)var1);
      return var2 != null ? var2 : this.this$0.ar(var1, -989370023);
   }

   public boolean hasNext() {
      try {
         return this.af * 1308054609 < this.this$0.an(-1861055046);
      } catch (RuntimeException var1) {
         throw db.an(var1, "sn.hasNext(" + ')');
      }
   }

   public void remove() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw db.an(var1, "sn.remove(" + ')');
      }
   }

   public boolean at() {
      return this.af * 1308054609 < this.this$0.an(-1861055046);
   }

   public Object au() {
      int var1 = (this.af += -2002094927) * 68720429 - 1;
      qb var2 = (qb)this.this$0.aw.af((long)var1);
      return var2 != null ? var2 : this.this$0.ar(var1, -989370023);
   }

   public Object next() {
      try {
         int var1 = (this.af += -2002094927) * 1308054609 - 1;
         qb var2 = (qb)this.this$0.aw.af((long)var1);
         return var2 != null ? var2 : this.this$0.ar(var1, -989370023);
      } catch (RuntimeException var3) {
         throw db.an(var3, "sn.next(" + ')');
      }
   }

   public Object aq() {
      int var1 = (this.af += -2002094927) * 1308054609 - 1;
      qb var2 = (qb)this.this$0.aw.af((long)var1);
      return var2 != null ? var2 : this.this$0.ar(var1, -989370023);
   }

   public boolean al() {
      return this.af * 167737345 < this.this$0.an(-1861055046);
   }

   sn(su var1) {
      this.this$0 = var1;
   }

   public boolean aa() {
      return this.af * 1308054609 < this.this$0.an(-1861055046);
   }

   public void ay() {
      throw new UnsupportedOperationException();
   }
}
