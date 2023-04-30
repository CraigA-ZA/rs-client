final class si implements ss {
   public void aq(Object var1, sg var2) {
      this.ax((String)var1, var2, (byte)85);
   }

   public void au(Object var1, sg var2) {
      this.ax((String)var1, var2, (byte)7);
   }

   public void al(Object var1, sg var2) {
      this.ax((String)var1, var2, (byte)16);
   }

   public void af(Object var1, sg var2, int var3) {
      try {
         this.ax((String)var1, var2, (byte)-97);
      } catch (RuntimeException var4) {
         throw db.an(var4, "si.af(" + ')');
      }
   }

   public void aw(Object var1, sg var2) {
      this.ax((String)var1, var2, (byte)37);
   }

   public void ac(Object var1, sg var2) {
      this.ax((String)var1, var2, (byte)20);
   }

   public Object an(sg var1, int var2) {
      try {
         return var1.cw((byte)0);
      } catch (RuntimeException var3) {
         throw db.an(var3, "si.an(" + ')');
      }
   }

   public void ab(Object var1, sg var2) {
      this.ax((String)var1, var2, (byte)32);
   }

   public Object aa(sg var1) {
      return var1.cw((byte)0);
   }

   void ag(String var1, sg var2) {
      var2.bh(var1, -1461995325);
   }

   public Object at(sg var1) {
      return var1.cw((byte)0);
   }

   void ax(String var1, sg var2, byte var3) {
      try {
         var2.bh(var1, -1552390337);
      } catch (RuntimeException var4) {
         throw db.an(var4, "si.ax(" + ')');
      }
   }

   public Object ay(sg var1) {
      return var1.cw((byte)0);
   }

   public Object ao(sg var1) {
      return var1.cw((byte)0);
   }

   void ai(String var1, sg var2) {
      var2.bh(var1, -1470841795);
   }
}
