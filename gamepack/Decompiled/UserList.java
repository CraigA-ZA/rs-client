import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class UserList {
   int size0 = 0;
   Comparator comparator = null;
   HashMap usernamesMap;
   HashMap previousUsernamesMap;
   User[] array;
   final int capacity;

   UserList(int var1) {
      this.capacity = var1 * 450790185;
      this.array = this.newTypedArray(var1);
      this.usernamesMap = new HashMap(var1 / 8);
      this.previousUsernamesMap = new HashMap(var1 / 8);
   }

   public void clear() {
      this.size0 = 0;
      Arrays.fill(this.array, (Object)null);
      this.usernamesMap.clear();
      this.previousUsernamesMap.clear();
   }

   public int size() {
      return this.size0 * -940640785;
   }

   public boolean isFull() {
      return -734344935 * this.capacity == -940640785 * this.size0;
   }

   public boolean contains(Username var1) {
      if (!var1.hasCleanName()) {
         return false;
      } else {
         return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
      }
   }

   public User getByUsername(Username var1) {
      User var3 = this.getByCurrentUsername(var1);
      return var3 != null ? var3 : this.getByPreviousUsername(var1);
   }

   User getByCurrentUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
   }

   User getByPreviousUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
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
         this.arrayAddLast(var4);
         this.mapPut(var4);
         return var4;
      }
   }

   public final User get(int var1) {
      if (var1 >= 0 && var1 < this.size0 * -940640785) {
         return this.array[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   public final void sort() {
      if (null == this.comparator) {
         Arrays.sort(this.array, 0, -940640785 * this.size0);
      } else {
         Arrays.sort(this.array, 0, -940640785 * this.size0, this.comparator);
      }

   }

   final void changeName(User var1, Username var2, Username var3) {
      this.mapRemove(var1);
      var1.set(var2, var3);
      this.mapPut(var1);
   }

   final int indexOf(User var1) {
      for(int var3 = 0; var3 < -940640785 * this.size0; ++var3) {
         if (this.array[var3] == var1) {
            return var3;
         }
      }

      return -1;
   }

   final void mapRemove(User var1) {
      if (this.usernamesMap.remove(var1.username0) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.previousUsername != null) {
            this.previousUsernamesMap.remove(var1.previousUsername);
         }

      }
   }

   final void arrayAddLast(User var1) {
      this.array[(this.size0 += 905500943) * -940640785 - 1] = var1;
   }

   final void mapPut(User var1) {
      this.usernamesMap.put(var1.username0, var1);
      if (var1.previousUsername != null) {
         User var3 = (User)this.previousUsernamesMap.put(var1.previousUsername, var1);
         if (null != var3 && var3 != var1) {
            var3.previousUsername = null;
         }
      }

   }

   final void arrayRemove(int var1) {
      this.size0 -= 905500943;
      if (var1 < -940640785 * this.size0) {
         System.arraycopy(this.array, 1 + var1, this.array, var1, -940640785 * this.size0 - var1);
      }

   }

   public final void removeComparator() {
      this.comparator = null;
   }

   public final void addComparator(Comparator var1) {
      if (this.comparator == null) {
         this.comparator = var1;
      } else if (this.comparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.comparator).ay(var1);
      }

   }

   abstract User[] newTypedArray(int var1);

   abstract User newInstance();
}
