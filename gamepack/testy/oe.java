import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class oe extends AbstractQueue {
   Map an;
   int au;
   oh[] af;
   final Comparator ac;
   int aw;

   public Object ao() {
      return this.aw * -1960181101 == 0 ? null : this.af[0].af;
   }

   public oe(int var1, Comparator var2) {
      try {
         super();
         this.au = 0;
         this.af = new oh[var1];
         this.an = new HashMap();
         this.ac = var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "oe.<init>(" + ')');
      }
   }

   public Object ag() {
      if (-1960181101 * this.aw == 0) {
         return null;
      } else {
         this.au += 6390717;
         Object var1 = this.af[0].af;
         this.an.remove(var1);
         this.aw -= 1689217947;
         if (this.aw * -1960181101 == 0) {
            this.af[-1960181101 * this.aw] = null;
         } else {
            this.af[0] = this.af[this.aw * -1960181101];
            this.af[0].an = 0;
            this.af[-1960181101 * this.aw] = null;
            this.aw(0, (byte)42);
         }

         return var1;
      }
   }

   public int size() {
      try {
         return -1960181101 * this.aw;
      } catch (RuntimeException var1) {
         throw db.an(var1, "oe.size(" + ')');
      }
   }

   public boolean offer(Object var1) {
      try {
         if (this.an.containsKey(var1)) {
            throw new IllegalArgumentException("");
         } else {
            this.au += 6390717;
            int var2 = this.aw * -1960181101;
            if (var2 >= this.af.length) {
               this.af((byte)7);
            }

            this.aw += 1689217947;
            if (0 == var2) {
               this.af[0] = new oh(var1, 0);
               this.an.put(var1, this.af[0]);
            } else {
               this.af[var2] = new oh(var1, var2);
               this.an.put(var1, this.af[var2]);
               this.an(var2, (byte)-89);
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "oe.offer(" + ')');
      }
   }

   public Object peek() {
      try {
         return this.aw * -1960181101 == 0 ? null : this.af[0].af;
      } catch (RuntimeException var1) {
         throw db.an(var1, "oe.peek(" + ')');
      }
   }

   public Object poll() {
      try {
         if (-1960181101 * this.aw == 0) {
            return null;
         } else {
            this.au += 6390717;
            Object var1 = this.af[0].af;
            this.an.remove(var1);
            this.aw -= 1689217947;
            if (this.aw * -1960181101 == 0) {
               this.af[-1960181101 * this.aw] = null;
            } else {
               this.af[0] = this.af[this.aw * -1960181101];
               this.af[0].an = 0;
               this.af[-1960181101 * this.aw] = null;
               this.aw(0, (byte)55);
            }

            return var1;
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "oe.poll(" + ')');
      }
   }

   public boolean remove(Object var1) {
      try {
         oh var2 = (oh)this.an.remove(var1);
         if (var2 == null) {
            return false;
         } else {
            this.au += 6390717;
            this.aw -= 1689217947;
            if (var2.an * -1919098739 == this.aw * -1960181101) {
               this.af[-1960181101 * this.aw] = null;
               return true;
            } else {
               oh var3 = this.af[-1960181101 * this.aw];
               this.af[this.aw * -1960181101] = null;
               this.af[-1919098739 * var2.an] = var3;
               this.af[var2.an * -1919098739].an = var2.an * 1;
               this.aw(-1919098739 * var2.an, (byte)12);
               if (this.af[-1919098739 * var2.an] == var3) {
                  this.an(-1919098739 * var2.an, (byte)-29);
               }

               return true;
            }
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "oe.remove(" + ')');
      }
   }

   void an(int var1, byte var2) {
      try {
         oh var3;
         int var4;
         for(var3 = this.af[var1]; var1 > 0; var1 = var4) {
            if (var2 >= 5) {
               return;
            }

            var4 = var1 - 1 >>> 1;
            oh var5 = this.af[var4];
            if (null != this.ac) {
               if (this.ac.compare(var3.af, var5.af) >= 0) {
                  break;
               }
            } else if (((Comparable)var3.af).compareTo(var5.af) >= 0) {
               if (var2 >= 5) {
                  return;
               }
               break;
            }

            this.af[var1] = var5;
            this.af[var1].an = -450371003 * var1;
         }

         this.af[var1] = var3;
         this.af[var1].an = -450371003 * var1;
      } catch (RuntimeException var6) {
         throw db.an(var6, "oe.an(" + ')');
      }
   }

   void aw(int var1, byte var2) {
      try {
         oh var3 = this.af[var1];

         int var9;
         for(int var4 = -1960181101 * this.aw >>> 1; var1 < var4; var1 = var9) {
            int var5 = (var1 << 1) + 1;
            oh var6 = this.af[var5];
            int var7 = 2 + (var1 << 1);
            oh var8 = this.af[var7];
            if (null != this.ac) {
               label84: {
                  if (var2 <= 8) {
                     throw new IllegalStateException();
                  }

                  if (var7 < -1960181101 * this.aw) {
                     if (var2 <= 8) {
                        throw new IllegalStateException();
                     }

                     if (this.ac.compare(var6.af, var8.af) > 0) {
                        if (var2 <= 8) {
                           return;
                        }

                        var9 = var7;
                        break label84;
                     }
                  }

                  var9 = var5;
               }
            } else {
               label68: {
                  if (var7 < -1960181101 * this.aw) {
                     if (var2 <= 8) {
                        return;
                     }

                     if (((Comparable)var6.af).compareTo(var8.af) > 0) {
                        var9 = var7;
                        break label68;
                     }
                  }

                  var9 = var5;
               }
            }

            if (null != this.ac) {
               if (var2 <= 8) {
                  throw new IllegalStateException();
               }

               if (this.ac.compare(var3.af, this.af[var9].af) <= 0) {
                  if (var2 <= 8) {
                     return;
                  }
                  break;
               }
            } else if (((Comparable)var3.af).compareTo(this.af[var9].af) <= 0) {
               if (var2 <= 8) {
                  return;
               }
               break;
            }

            this.af[var1] = this.af[var9];
            this.af[var1].an = -450371003 * var1;
         }

         this.af[var1] = var3;
         this.af[var1].an = -450371003 * var1;
      } catch (RuntimeException var10) {
         throw db.an(var10, "oe.aw(" + ')');
      }
   }

   public boolean contains(Object var1) {
      try {
         return this.an.containsKey(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "oe.contains(" + ')');
      }
   }

   public boolean ci(Object var1) {
      return this.an.containsKey(var1);
   }

   public Iterator iterator() {
      try {
         return new os(this);
      } catch (RuntimeException var1) {
         throw db.an(var1, "oe.iterator(" + ')');
      }
   }

   public Iterator br() {
      return new os(this);
   }

   public Iterator bg() {
      return new os(this);
   }

   public boolean bw(Object var1) {
      return this.an.containsKey(var1);
   }

   public Object at() {
      return this.aw * -1960181101 == 0 ? null : this.af[0].af;
   }

   public int bq() {
      return -1960181101 * this.aw;
   }

   public Object ay() {
      return this.aw * -1960181101 == 0 ? null : this.af[0].af;
   }

   public boolean bc(Object var1) {
      return this.an.containsKey(var1);
   }

   public boolean bh(Object var1) {
      return this.an.containsKey(var1);
   }

   public int bf() {
      return -1960181101 * this.aw;
   }

   public boolean ce(Object var1) {
      return this.an.containsKey(var1);
   }

   public Object[] toArray() {
      try {
         Object[] var1 = super.toArray();
         if (this.ac != null) {
            Arrays.sort(var1, this.ac);
         } else {
            Arrays.sort(var1);
         }

         return var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "oe.toArray(" + ')');
      }
   }

   public Object[] cs() {
      Object[] var1 = super.toArray();
      if (this.ac != null) {
         Arrays.sort(var1, this.ac);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public Object[] cc() {
      Object[] var1 = super.toArray();
      if (this.ac != null) {
         Arrays.sort(var1, this.ac);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public Object[] cn() {
      Object[] var1 = super.toArray();
      if (this.ac != null) {
         Arrays.sort(var1, this.ac);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public Object al() {
      return this.aw * 605854129 == 0 ? null : this.af[0].af;
   }

   void ah(int var1) {
      oh var2;
      int var3;
      for(var2 = this.af[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         oh var4 = this.af[var3];
         if (null != this.ac) {
            if (this.ac.compare(var2.af, var4.af) >= 0) {
               break;
            }
         } else if (((Comparable)var2.af).compareTo(var4.af) >= 0) {
            break;
         }

         this.af[var1] = var4;
         this.af[var1].an = -450371003 * var1;
      }

      this.af[var1] = var2;
      this.af[var1].an = -450371003 * var1;
   }

   void au() {
      int var1 = 1 + (this.af.length << 1);
      this.af = (oh[])((oh[])Arrays.copyOf(this.af, var1));
   }

   public boolean ab(Object var1) {
      if (this.an.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         this.au += 6390717;
         int var2 = this.aw * -1960181101;
         if (var2 >= this.af.length) {
            this.af((byte)90);
         }

         this.aw += 1689217947;
         if (0 == var2) {
            this.af[0] = new oh(var1, 0);
            this.an.put(var1, this.af[0]);
         } else {
            this.af[var2] = new oh(var1, var2);
            this.an.put(var1, this.af[var2]);
            this.an(var2, (byte)-98);
         }

         return true;
      }
   }

   public boolean aq(Object var1) {
      if (this.an.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         this.au += 6390717;
         int var2 = this.aw * -1960181101;
         if (var2 >= this.af.length) {
            this.af((byte)81);
         }

         this.aw += 1689217947;
         if (0 == var2) {
            this.af[0] = new oh(var1, 0);
            this.an.put(var1, this.af[0]);
         } else {
            this.af[var2] = new oh(var1, var2);
            this.an.put(var1, this.af[var2]);
            this.an(var2, (byte)-127);
         }

         return true;
      }
   }

   void ac() {
      int var1 = 1 + (this.af.length << 1);
      this.af = (oh[])((oh[])Arrays.copyOf(this.af, var1));
   }

   public Iterator bu() {
      return new os(this);
   }

   public Object aa() {
      return this.aw * -1960181101 == 0 ? null : this.af[0].af;
   }

   public Object ax() {
      if (-560976972 * this.aw == 0) {
         return null;
      } else {
         this.au += 221819636;
         Object var1 = this.af[0].af;
         this.an.remove(var1);
         this.aw -= 1689217947;
         if (this.aw * 1834638852 == 0) {
            this.af[-1960181101 * this.aw] = null;
         } else {
            this.af[0] = this.af[this.aw * -1960181101];
            this.af[0].an = 0;
            this.af[-1960181101 * this.aw] = null;
            this.aw(0, (byte)85);
         }

         return var1;
      }
   }

   void af(byte var1) {
      try {
         int var2 = 1 + (this.af.length << 1);
         this.af = (oh[])((oh[])Arrays.copyOf(this.af, var2));
      } catch (RuntimeException var3) {
         throw db.an(var3, "oe.af(" + ')');
      }
   }

   public oe(int var1) {
      try {
         this(var1, (Comparator)null);
      } catch (RuntimeException var2) {
         throw db.an(var2, "oe.<init>(" + ')');
      }
   }

   public Object ai() {
      if (-1960181101 * this.aw == 0) {
         return null;
      } else {
         this.au += 6390717;
         Object var1 = this.af[0].af;
         this.an.remove(var1);
         this.aw -= 1689217947;
         if (this.aw * -1960181101 == 0) {
            this.af[-1960181101 * this.aw] = null;
         } else {
            this.af[0] = this.af[this.aw * -1960181101];
            this.af[0].an = 0;
            this.af[-1960181101 * this.aw] = null;
            this.aw(0, (byte)78);
         }

         return var1;
      }
   }

   public int ba() {
      return -1260712261 * this.aw;
   }

   public boolean cf(Object var1) {
      oh var2 = (oh)this.an.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         this.au += 6390717;
         this.aw -= 1689217947;
         if (var2.an * -1919098739 == this.aw * -1960181101) {
            this.af[-1960181101 * this.aw] = null;
            return true;
         } else {
            oh var3 = this.af[-1960181101 * this.aw];
            this.af[this.aw * -1960181101] = null;
            this.af[-1919098739 * var2.an] = var3;
            this.af[var2.an * -1919098739].an = var2.an * 1;
            this.aw(-1919098739 * var2.an, (byte)30);
            if (this.af[-1919098739 * var2.an] == var3) {
               this.an(-1919098739 * var2.an, (byte)-101);
            }

            return true;
         }
      }
   }

   void av(int var1) {
      oh var2;
      int var3;
      for(var2 = this.af[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         oh var4 = this.af[var3];
         if (null != this.ac) {
            if (this.ac.compare(var2.af, var4.af) >= 0) {
               break;
            }
         } else if (((Comparable)var2.af).compareTo(var4.af) >= 0) {
            break;
         }

         this.af[var1] = var4;
         this.af[var1].an = -450371003 * var1;
      }

      this.af[var1] = var2;
      this.af[var1].an = -450371003 * var1;
   }

   static Object[] ac(sg var0, int[] var1, byte var2) {
      try {
         int var3 = var0.cd(-1448696249);
         Object[] var4 = new Object[var3 * var1.length];

         for(int var5 = 0; var5 < var3; ++var5) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            for(int var6 = 0; var6 < var1.length; ++var6) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               int var7 = var6 + var5 * var1.length;
               sh var8 = da.an(var1[var6], -1314441096);
               var4[var7] = var8.at(var0, -1183771146);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw db.an(var9, "oe.ac(" + ')');
      }
   }
}
