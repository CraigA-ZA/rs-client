public abstract class qn extends kr implements ts {
   protected qn(StudioGame var1, Language var2, int var3) {
      super(var1, var2, var3);
   }

   public int an() {
      return this.af * -1813265095;
   }

   public Object aw(int var1) {
      qg var3 = this.af(var1);
      return null != var3 && var3.ac() ? var3.au() : null;
   }

   public te ac(Packet var1) {
      int var3 = var1.cl();
      qg var4 = this.af(var3);
      te var5 = new te(var3);
      Class var6 = var4.af.ab;
      if (var6 == Integer.class) {
         var5.an = var1.g4s();
      } else if (var6 == Long.class) {
         var5.an = var1.g8s();
      } else if (String.class == var6) {
         var5.an = var1.gjstr();
      } else {
         if (!sp.class.isAssignableFrom(var6)) {
            throw new IllegalStateException();
         }

         try {
            sp var7 = (sp)var6.newInstance();
            var7.af(var1, (byte)-32);
            var5.an = var7;
         } catch (InstantiationException var8) {
         } catch (IllegalAccessException var9) {
         }
      }

      return var5;
   }

   protected abstract qg af(int var1);
}
