import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class pk {
   final oe ac;
   final Map an;
   final Comparator af;
   final long au;
   final py ab;
   final oe aw;
   final int aq;

   boolean af(byte var1) {
      try {
         boolean var10000;
         if (this.aq * 1638192103 != -1) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "pk.af(" + ')');
      }
   }

   pk(long var1, int var3, py var4) {
      try {
         super();
         this.af = new pg(this);
         this.au = var1 * -6559155621149475795L;
         this.aq = 1806471127 * var3;
         this.ab = var4;
         if (-1 == this.aq * 1638192103) {
            this.an = new HashMap(64);
            this.aw = new oe(64, this.af);
            this.ac = null;
         } else {
            if (null == this.ab) {
               throw new IllegalArgumentException("");
            }

            this.an = new HashMap(1638192103 * this.aq);
            this.aw = new oe(this.aq * 1638192103, this.af);
            this.ac = new oe(1638192103 * this.aq);
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "pk.<init>(" + ')');
      }
   }

   public Object ax(Object var1) {
      synchronized(this) {
         if (-1L != -5966338096779578459L * this.au) {
            this.au((byte)1);
         }

         pj var3 = (pj)this.an.get(var1);
         if (null == var3) {
            return null;
         } else {
            this.ac(var3, false, (byte)37);
            return var3.af;
         }
      }
   }

   public pk(int var1, py var2) {
      try {
         this(-1L, var1, var2);
      } catch (RuntimeException var3) {
         throw db.an(var3, "pk.<init>(" + ')');
      }
   }

   public Object aw(Object var1, Object var2, int var3) {
      try {
         synchronized(this) {
            if (this.au * -5966338096779578459L != -1L) {
               if (var3 != 747668912) {
                  throw new IllegalStateException();
               }

               this.au((byte)1);
            }

            pj var5 = (pj)this.an.get(var1);
            if (null != var5) {
               if (var3 != 747668912) {
                  throw new IllegalStateException();
               } else {
                  Object var10 = var5.af;
                  var5.af = var2;
                  this.ac(var5, false, (byte)-8);
                  return var10;
               }
            } else {
               pj var6;
               if (this.af((byte)-72)) {
                  if (var3 != 747668912) {
                     throw new IllegalStateException();
                  }

                  if (this.an.size() == 1638192103 * this.aq) {
                     if (var3 != 747668912) {
                        throw new IllegalStateException();
                     }

                     var6 = (pj)this.ac.remove();
                     this.an.remove(var6.an);
                     this.aw.remove(var6);
                  }
               }

               var6 = new pj(var2, var1);
               this.an.put(var1, var6);
               this.ac(var6, true, (byte)-13);
               return null;
            }
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "pk.aw(" + ')');
      }
   }

   void ac(pj var1, boolean var2, byte var3) {
      try {
         if (!var2) {
            this.aw.remove(var1);
            if (this.af((byte)-100)) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               }

               if (!this.ac.remove(var1)) {
                  if (var3 == 1) {
                     return;
                  }

                  throw new IllegalStateException("");
               }
            }
         }

         var1.aw = System.currentTimeMillis() * -766817315095904517L;
         if (this.af((byte)-76)) {
            if (var3 == 1) {
               throw new IllegalStateException();
            }

            switch (-1101065145 * this.ab.aw) {
               case 0:
                  var1.ac += -6212029956567734047L;
                  break;
               case 1:
                  var1.ac = var1.aw * 8282359513895223507L;
            }

            this.ac.add(var1);
         }

         this.aw.add(var1);
      } catch (RuntimeException var4) {
         throw db.an(var4, "pk.ac(" + ')');
      }
   }

   public void ak() {
      synchronized(this) {
         this.an.clear();
         this.aw.clear();
         if (this.af((byte)-116)) {
            this.ac.clear();
         }

      }
   }

   void au(byte var1) {
      try {
         if (-5966338096779578459L * this.au == -1L) {
            throw new IllegalStateException("");
         } else {
            long var2 = System.currentTimeMillis() - -5966338096779578459L * this.au;

            while(!this.aw.isEmpty()) {
               pj var4 = (pj)this.aw.peek();
               if (3457501928509627443L * var4.aw >= var2) {
                  return;
               }

               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               this.an.remove(var4.an);
               this.aw.remove(var4);
               if (this.af((byte)-25)) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  this.ac.remove(var4);
               }
            }

         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "pk.au(" + ')');
      }
   }

   boolean aq() {
      return this.aq * 1638192103 != -1;
   }

   boolean al() {
      return this.aq * 1638192103 != -1;
   }

   boolean at() {
      return this.aq * 1638192103 != -1;
   }

   boolean aa() {
      return this.aq * 1638192103 != -1;
   }

   public Object ay(Object var1) {
      synchronized(this) {
         if (-1L != -5966338096779578459L * this.au) {
            this.au((byte)1);
         }

         pj var3 = (pj)this.an.get(var1);
         if (null == var3) {
            return null;
         } else {
            this.ac(var3, false, (byte)86);
            return var3.af;
         }
      }
   }

   public Object ao(Object var1) {
      synchronized(this) {
         if (-1L != -5966338096779578459L * this.au) {
            this.au((byte)1);
         }

         pj var3 = (pj)this.an.get(var1);
         if (null == var3) {
            return null;
         } else {
            this.ac(var3, false, (byte)19);
            return var3.af;
         }
      }
   }

   public static void ay(int var0) {
      try {
         tx.ac = null;
         ar.au = null;
         dd.ab = null;
         fd.aq = null;
         pc.al = null;
         hg.at = (byte[][])null;
      } catch (RuntimeException var1) {
         throw db.an(var1, "pk.ay(" + ')');
      }
   }

   public Object ai(Object var1, Object var2) {
      synchronized(this) {
         if (this.au * -5966338096779578459L != -1L) {
            this.au((byte)1);
         }

         pj var4 = (pj)this.an.get(var1);
         if (null != var4) {
            Object var8 = var4.af;
            var4.af = var2;
            this.ac(var4, false, (byte)4);
            return var8;
         } else {
            pj var5;
            if (this.af((byte)-4) && this.an.size() == 1638192103 * this.aq) {
               var5 = (pj)this.ac.remove();
               this.an.remove(var5.an);
               this.aw.remove(var5);
            }

            var5 = new pj(var2, var1);
            this.an.put(var1, var5);
            this.ac(var5, true, (byte)4);
            return null;
         }
      }
   }

   public Object ag(Object var1, Object var2) {
      synchronized(this) {
         if (this.au * -5966338096779578459L != -1L) {
            this.au((byte)1);
         }

         pj var4 = (pj)this.an.get(var1);
         if (null != var4) {
            Object var8 = var4.af;
            var4.af = var2;
            this.ac(var4, false, (byte)-8);
            return var8;
         } else {
            pj var5;
            if (this.af((byte)-78) && this.an.size() == -561574006 * this.aq) {
               var5 = (pj)this.ac.remove();
               this.an.remove(var5.an);
               this.aw.remove(var5);
            }

            var5 = new pj(var2, var1);
            this.an.put(var1, var5);
            this.ac(var5, true, (byte)36);
            return null;
         }
      }
   }

   public Object ah(Object var1, Object var2) {
      synchronized(this) {
         if (this.au * -5966338096779578459L != -1L) {
            this.au((byte)1);
         }

         pj var4 = (pj)this.an.get(var1);
         if (null != var4) {
            Object var8 = var4.af;
            var4.af = var2;
            this.ac(var4, false, (byte)-10);
            return var8;
         } else {
            pj var5;
            if (this.af((byte)-58) && this.an.size() == 1638192103 * this.aq) {
               var5 = (pj)this.ac.remove();
               this.an.remove(var5.an);
               this.aw.remove(var5);
            }

            var5 = new pj(var2, var1);
            this.an.put(var1, var5);
            this.ac(var5, true, (byte)-30);
            return null;
         }
      }
   }

   void av(pj var1, boolean var2) {
      if (!var2) {
         this.aw.remove(var1);
         if (this.af((byte)-85) && !this.ac.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.aw = System.currentTimeMillis() * -766817315095904517L;
      if (this.af((byte)-89)) {
         switch (-1101065145 * this.ab.aw) {
            case 0:
               var1.ac += -6212029956567734047L;
               break;
            case 1:
               var1.ac = var1.aw * 8282359513895223507L;
         }

         this.ac.add(var1);
      }

      this.aw.add(var1);
   }

   void ar(pj var1, boolean var2) {
      if (!var2) {
         this.aw.remove(var1);
         if (this.af((byte)-56) && !this.ac.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.aw = System.currentTimeMillis() * -766817315095904517L;
      if (this.af((byte)-71)) {
         switch (-1101065145 * this.ab.aw) {
            case 0:
               var1.ac += -6212029956567734047L;
               break;
            case 1:
               var1.ac = var1.aw * 8282359513895223507L;
         }

         this.ac.add(var1);
      }

      this.aw.add(var1);
   }

   void am(pj var1, boolean var2) {
      if (!var2) {
         this.aw.remove(var1);
         if (this.af((byte)-94) && !this.ac.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.aw = System.currentTimeMillis() * -766817315095904517L;
      if (this.af((byte)-27)) {
         switch (-1101065145 * this.ab.aw) {
            case 0:
               var1.ac += -6212029956567734047L;
               break;
            case 1:
               var1.ac = var1.aw * 8282359513895223507L;
         }

         this.ac.add(var1);
      }

      this.aw.add(var1);
   }

   void as() {
      if (-5966338096779578459L * this.au == -1L) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - -5966338096779578459L * this.au;

         while(!this.aw.isEmpty()) {
            pj var3 = (pj)this.aw.peek();
            if (3457501928509627443L * var3.aw >= var1) {
               return;
            }

            this.an.remove(var3.an);
            this.aw.remove(var3);
            if (this.af((byte)-123)) {
               this.ac.remove(var3);
            }
         }

      }
   }

   void aj() {
      if (-5966338096779578459L * this.au == -1L) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - -5966338096779578459L * this.au;

         while(!this.aw.isEmpty()) {
            pj var3 = (pj)this.aw.peek();
            if (3457501928509627443L * var3.aw >= var1) {
               return;
            }

            this.an.remove(var3.an);
            this.aw.remove(var3);
            if (this.af((byte)-47)) {
               this.ac.remove(var3);
            }
         }

      }
   }

   public Object an(Object var1, short var2) {
      try {
         synchronized(this) {
            if (-1L != -5966338096779578459L * this.au) {
               if (var2 <= 128) {
                  throw new IllegalStateException();
               }

               this.au((byte)1);
            }

            pj var4 = (pj)this.an.get(var1);
            if (null == var4) {
               if (var2 <= 128) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               this.ac(var4, false, (byte)20);
               return var4.af;
            }
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "pk.an(" + ')');
      }
   }

   public void ab(int var1) {
      try {
         synchronized(this) {
            this.an.clear();
            this.aw.clear();
            if (this.af((byte)-119)) {
               if (var1 <= 1393349809) {
                  throw new IllegalStateException();
               }

               this.ac.clear();
            }

         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "pk.ab(" + ')');
      }
   }
}
