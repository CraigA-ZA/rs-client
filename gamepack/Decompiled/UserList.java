import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class UserList {
   int aa = 0;
   Comparator ai = null;
   HashMap ao;
   HashMap ax;
   User[] ay;
   final int at;

   UserList(int var1) {
      this.at = var1 * 450790185;
      this.ay = this.newTypedArray(var1);
      this.ao = new HashMap(var1 / 8);
      this.ax = new HashMap(var1 / 8);
   }

   public void clear() {
      this.aa = 0;
      Arrays.fill(this.ay, (Object)null);
      this.ao.clear();
      this.ax.clear();
   }

   public int size() {
      return this.aa * -940640785;
   }

   public boolean isFull() {
      return -734344935 * this.at == -940640785 * this.aa;
   }

   public boolean contains(Username var1) {
      if (!var1.hasCleanName()) {
         return false;
      } else {
         return this.ao.containsKey(var1) ? true : this.ax.containsKey(var1);
      }
   }

   public User getByUsername(Username var1) {
      User var3 = this.getByCurrentUsername(var1);
      return var3 != null ? var3 : this.getByPreviousUsername(var1);
   }

   User getByCurrentUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.ao.get(var1);
   }

   User getByPreviousUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.ax.get(var1);
   }

   public final boolean removeByUsername(Username var1) {
      User var3 = this.getByCurrentUsername(var1);
      if (null == var3) {
         return false;
      } else {
         this.remove(var3);
         return true;
      }
   }

   final void remove(User var1) {
      int var3 = this.indexOf(var1);
      if (-1 != var3) {
         this.arrayRemove(var3);
         this.mapRemove(var1);
      }
   }

   User addLastNoPreviousUsername(Username var1) {
      return this.addLast(var1, (Username)null);
   }

   User addLast(Username var1, Username var2) {
      if (this.getByCurrentUsername(var1) != null) {
         throw new IllegalStateException();
      } else {
         User var4 = this.newInstance();
         var4.set(var1, var2);
         this.bc(var4);
         this.mapPut(var4);
         return var4;
      }
   }

   public final User get(int var1) {
      if (var1 >= 0 && var1 < this.aa * -940640785) {
         return this.ay[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   public final void sort() {
      if (null == this.ai) {
         Arrays.sort(this.ay, 0, -940640785 * this.aa);
      } else {
         Arrays.sort(this.ay, 0, -940640785 * this.aa, this.ai);
      }

   }

   final void changeName(User var1, Username var2, Username var3) {
      this.mapRemove(var1);
      var1.set(var2, var3);
      this.mapPut(var1);
   }

   final int indexOf(User var1) {
      for(int var3 = 0; var3 < -940640785 * this.aa; ++var3) {
         if (this.ay[var3] == var1) {
            return var3;
         }
      }

      return -1;
   }

   final void mapRemove(User var1) {
      if (this.ao.remove(var1.aw) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.ac != null) {
            this.ax.remove(var1.ac);
         }

      }
   }

   final void bc(User var1) {
      this.ay[(this.aa += 905500943) * -940640785 - 1] = var1;
   }

   final void mapPut(User var1) {
      this.ao.put(var1.aw, var1);
      if (var1.ac != null) {
         User var3 = (User)this.ax.put(var1.ac, var1);
         if (null != var3 && var3 != var1) {
            var3.ac = null;
         }
      }

   }

   final void arrayRemove(int var1) {
      this.aa -= 905500943;
      if (var1 < -940640785 * this.aa) {
         System.arraycopy(this.ay, 1 + var1, this.ay, var1, -940640785 * this.aa - var1);
      }

   }

   public final void removeComparator() {
      this.ai = null;
   }

   public final void addComparator(Comparator var1) {
      if (this.ai == null) {
         this.ai = var1;
      } else if (this.ai instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.ai).ay(var1);
      }

   }

   abstract User[] newTypedArray(int var1);

   abstract User newInstance();
}
