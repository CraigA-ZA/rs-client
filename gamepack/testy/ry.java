import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ry implements rn {
   final ts an;
   Map af;

   public void aq(int var1, Object var2) {
      if (null == this.af) {
         this.af = new HashMap();
         this.af.put(var1, new te(var1, var2));
      } else {
         te var3 = (te)this.af.get(var1);
         if (null == var3) {
            this.af.put(var1, new te(var1, var2));
         } else {
            var3.an = var2;
         }
      }

   }

   public void an(int var1, Object var2, int var3) {
      try {
         if (null == this.af) {
            if (var3 == 654932558) {
               throw new IllegalStateException();
            }

            this.af = new HashMap();
            this.af.put(var1, new te(var1, var2));
         } else {
            te var4 = (te)this.af.get(var1);
            if (null == var4) {
               if (var3 == 654932558) {
                  throw new IllegalStateException();
               }

               this.af.put(var1, new te(var1, var2));
            } else {
               var4.an = var2;
            }
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "ry.an(" + ')');
      }
   }

   public ry(ts var1) {
      try {
         super();
         this.an = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ry.<init>(" + ')');
      }
   }

   public Iterator iterator() {
      try {
         return this.af == null ? Collections.emptyList().iterator() : this.af.values().iterator();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ry.iterator(" + ')');
      }
   }

   public int af(int var1, byte var2) {
      try {
         if (this.af != null) {
            te var3 = (te)this.af.get(var1);
            if (var3 != null) {
               return (Integer)var3.an;
            }
         }

         return (Integer)this.an.aw(var1, (short)-16285);
      } catch (RuntimeException var4) {
         throw db.an(var4, "ry.af(" + ')');
      }
   }

   public Iterator bg() {
      return this.af == null ? Collections.emptyList().iterator() : this.af.values().iterator();
   }

   public Iterator bu() {
      return this.af == null ? Collections.emptyList().iterator() : this.af.values().iterator();
   }

   public int aw(int var1) {
      if (this.af != null) {
         te var2 = (te)this.af.get(var1);
         if (var2 != null) {
            return (Integer)var2.an;
         }
      }

      return (Integer)this.an.aw(var1, (short)-9792);
   }

   public void al(int var1, Object var2) {
      if (null == this.af) {
         this.af = new HashMap();
         this.af.put(var1, new te(var1, var2));
      } else {
         te var3 = (te)this.af.get(var1);
         if (null == var3) {
            this.af.put(var1, new te(var1, var2));
         } else {
            var3.an = var2;
         }
      }

   }

   public int au(int var1) {
      if (this.af != null) {
         te var2 = (te)this.af.get(var1);
         if (var2 != null) {
            return (Integer)var2.an;
         }
      }

      return (Integer)this.an.aw(var1, (short)-11681);
   }

   public void ab(int var1, Object var2) {
      if (null == this.af) {
         this.af = new HashMap();
         this.af.put(var1, new te(var1, var2));
      } else {
         te var3 = (te)this.af.get(var1);
         if (null == var3) {
            this.af.put(var1, new te(var1, var2));
         } else {
            var3.an = var2;
         }
      }

   }

   public int ac(int var1) {
      if (this.af != null) {
         te var2 = (te)this.af.get(var1);
         if (var2 != null) {
            return (Integer)var2.an;
         }
      }

      return (Integer)this.an.aw(var1, (short)-24441);
   }

   public Iterator br() {
      return this.af == null ? Collections.emptyList().iterator() : this.af.values().iterator();
   }

   public void at(int var1, Object var2) {
      if (null == this.af) {
         this.af = new HashMap();
         this.af.put(var1, new te(var1, var2));
      } else {
         te var3 = (te)this.af.get(var1);
         if (null == var3) {
            this.af.put(var1, new te(var1, var2));
         } else {
            var3.an = var2;
         }
      }

   }
}
