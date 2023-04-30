public class sx {
   static final int ao = 9;
   short[] an;
   static final int aa = 10;
   int[] af;

   public void ai(int[] var1, short[] var2) {
      this.af = var1;
      this.an = var2;
   }

   public sx(hs var1) {
      try {
         super();
         this.af = new int[8];
         this.an = new short[8];
         int var2 = 0;
         if (var1.ai((byte)29)) {
            var2 = var1.ag(-185133589).length;
            System.arraycopy(var1.ag(-1568093553), 0, this.af, 0, var2);
            System.arraycopy(var1.av(800844396), 0, this.an, 0, var2);
         }

         for(int var3 = var2; var3 < 8; ++var3) {
            this.af[var3] = -1;
            this.an[var3] = -1;
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "sx.<init>(" + ')');
      }
   }

   public short[] an(int var1) {
      try {
         return this.an;
      } catch (RuntimeException var2) {
         throw db.an(var2, "sx.an(" + ')');
      }
   }

   public void aw(int var1, int var2, short var3, int var4) {
      try {
         this.af[var1] = var2;
         this.an[var1] = var3;
      } catch (RuntimeException var5) {
         throw db.an(var5, "sx.aw(" + ')');
      }
   }

   public void aa(int var1, int var2, short var3) {
      this.af[var1] = var2;
      this.an[var1] = var3;
   }

   public int[] au() {
      return this.af;
   }

   public int[] ab() {
      return this.af;
   }

   public int[] aq() {
      return this.af;
   }

   public short[] al() {
      return this.an;
   }

   public int[] af(byte var1) {
      try {
         return this.af;
      } catch (RuntimeException var2) {
         throw db.an(var2, "sx.af(" + ')');
      }
   }

   public short[] at() {
      return this.an;
   }

   public void ay(int var1, int var2, short var3) {
      this.af[var1] = var2;
      this.an[var1] = var3;
   }

   public void ao(int[] var1, short[] var2) {
      this.af = var1;
      this.an = var2;
   }

   public void ax(int[] var1, short[] var2) {
      this.af = var1;
      this.an = var2;
   }

   public void ag(int[] var1, short[] var2) {
      this.af = var1;
      this.an = var2;
   }

   public void ac(int[] var1, short[] var2, byte var3) {
      try {
         this.af = var1;
         this.an = var2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "sx.ac(" + ')');
      }
   }
}
