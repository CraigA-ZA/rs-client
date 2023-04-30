public abstract class qn extends kr implements ts {
   static final int aq = 30;

   public int aq() {
      return this.af * -1813265095;
   }

   protected qn(mr var1, nx var2, int var3) {
      try {
         super(var1, var2, var3);
      } catch (RuntimeException var4) {
         throw db.an(var4, "qn.<init>(" + ')');
      }
   }

   public int an(int var1) {
      try {
         return this.af * -1813265095;
      } catch (RuntimeException var2) {
         throw db.an(var2, "qn.an(" + ')');
      }
   }

   public te aa(sg var1) {
      int var2 = var1.cl(-1029001163);
      qg var3 = this.af(var2, (byte)0);
      te var4 = new te(var2);
      Class var5 = var3.af.ab;
      if (var5 == Integer.class) {
         var4.an = var1.cx(-1702976352);
      } else if (var5 == Long.class) {
         var4.an = var1.cv((byte)1);
      } else if (String.class == var5) {
         var4.an = var1.cj((short)-14545);
      } else {
         if (!sp.class.isAssignableFrom(var5)) {
            throw new IllegalStateException();
         }

         try {
            sp var6 = (sp)var5.newInstance();
            var6.af(var1, (byte)-104);
            var4.an = var6;
         } catch (InstantiationException var7) {
         } catch (IllegalAccessException var8) {
         }
      }

      return var4;
   }

   public te ac(sg var1, int var2) {
      try {
         int var3 = var1.cl(-562941646);
         qg var4 = this.af(var3, (byte)0);
         te var5 = new te(var3);
         Class var6 = var4.af.ab;
         if (var6 == Integer.class) {
            if (var2 <= 1895936781) {
               throw new IllegalStateException();
            }

            var5.an = var1.cx(-1048705519);
         } else if (var6 == Long.class) {
            if (var2 <= 1895936781) {
               throw new IllegalStateException();
            }

            var5.an = var1.cv((byte)1);
         } else if (String.class == var6) {
            if (var2 <= 1895936781) {
               throw new IllegalStateException();
            }

            var5.an = var1.cj((short)-17323);
         } else {
            if (!sp.class.isAssignableFrom(var6)) {
               throw new IllegalStateException();
            }

            if (var2 <= 1895936781) {
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
      } catch (RuntimeException var10) {
         throw db.an(var10, "qn.ac(" + ')');
      }
   }

   public int au() {
      return this.af * -1813265095;
   }

   public int ab() {
      return this.af * -1222541835;
   }

   protected abstract qg av(int var1);

   public int al() {
      return this.af * -1813265095;
   }

   public Object at(int var1) {
      qg var2 = this.af(var1, (byte)0);
      return null != var2 && var2.ac(-108666621) ? var2.au(1458153897) : null;
   }

   protected abstract qg af(int var1, byte var2);

   public te ay(sg var1) {
      int var2 = var1.cl(-1903083954);
      qg var3 = this.af(var2, (byte)0);
      te var4 = new te(var2);
      Class var5 = var3.af.ab;
      if (var5 == Integer.class) {
         var4.an = var1.cx(-1394107003);
      } else if (var5 == Long.class) {
         var4.an = var1.cv((byte)1);
      } else if (String.class == var5) {
         var4.an = var1.cj((short)-28051);
      } else {
         if (!sp.class.isAssignableFrom(var5)) {
            throw new IllegalStateException();
         }

         try {
            sp var6 = (sp)var5.newInstance();
            var6.af(var1, (byte)-36);
            var4.an = var6;
         } catch (InstantiationException var7) {
         } catch (IllegalAccessException var8) {
         }
      }

      return var4;
   }

   public Object aw(int var1, short var2) {
      try {
         qg var3 = this.af(var1, (byte)0);
         if (null != var3) {
            if (var2 >= 6640) {
               throw new IllegalStateException();
            }

            if (var3.ac(-108666621)) {
               return var3.au(1458153897);
            }

            if (var2 >= 6640) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var4) {
         throw db.an(var4, "qn.aw(" + ')');
      }
   }

   protected abstract qg ax(int var1);

   protected abstract qg ao(int var1);

   protected abstract qg ag(int var1);

   protected abstract qg ah(int var1);

   protected abstract qg ai(int var1);
}
