import accessors.RSRawSound;

public class br extends cu implements RSRawSound {
   public byte[] an;
   public boolean au;
   public int af;
   int ac;
   public int aw;

   public br an(cc var1) {
      this.an = var1.af(this.an, 33076536);
      this.af = var1.an(this.af, (byte)53);
      if (this.aw == this.ac) {
         this.aw = this.ac = var1.aw(this.aw, 896342529);
      } else {
         this.aw = var1.aw(this.aw, -545633262);
         this.ac = var1.aw(this.ac, 575222873);
         if (this.aw == this.ac) {
            --this.aw;
         }
      }

      return this;
   }

   br(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.af = var1;
      this.an = var2;
      this.aw = var3;
      this.ac = var4;
      this.au = var5;
   }

   public br af(cc var1) {
      this.an = var1.af(this.an, 33076536);
      this.af = var1.an(this.af, (byte)45);
      if (this.aw == this.ac) {
         this.aw = this.ac = var1.aw(this.aw, 2001424421);
      } else {
         this.aw = var1.aw(this.aw, 668972378);
         this.ac = var1.aw(this.ac, -454181658);
         if (this.aw == this.ac) {
            --this.aw;
         }
      }

      return this;
   }

   br(int var1, byte[] var2, int var3, int var4) {
      this.af = var1;
      this.an = var2;
      this.aw = var3;
      this.ac = var4;
   }
}
