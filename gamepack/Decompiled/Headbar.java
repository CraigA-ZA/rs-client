public class Headbar extends Node {
   static IndexedSprite[] ka;
   HeadbarType aw;
   IterableNodeDeque ac = new IterableNodeDeque();

   Headbar(HeadbarType var1) {
      this.aw = var1;
   }

   void put(int var1, int var2, int var3, int var4) {
      HeadbarUpdate var6 = null;
      int var7 = 0;

      for(HeadbarUpdate var8 = (HeadbarUpdate)this.ac.last(); var8 != null; var8 = (HeadbarUpdate)this.ac.previous()) {
         ++var7;
         if (-1225111563 * var8.af == var1) {
            var8.set(var1, var2, var3, var4);
            return;
         }

         if (-1225111563 * var8.af <= var1) {
            var6 = var8;
         }
      }

      if (var6 == null) {
         if (var7 < 4) {
            this.ac.addLast(new HeadbarUpdate(var1, var2, var3, var4));
         }

      } else {
         IterableNodeDeque.IterableNodeDeque_addBefore(new HeadbarUpdate(var1, var2, var3, var4), var6);
         if (var7 >= 4) {
            this.ac.last().remove();
         }

      }
   }

   HeadbarUpdate get(int var1) {
      HeadbarUpdate var3 = (HeadbarUpdate)this.ac.last();
      if (null != var3 && -1225111563 * var3.af <= var1) {
         for(HeadbarUpdate var4 = (HeadbarUpdate)this.ac.previous(); null != var4 && -1225111563 * var4.af <= var1; var4 = (HeadbarUpdate)this.ac.previous()) {
            var3.remove();
            var3 = var4;
         }

         if (this.aw.ao * -407931959 + -2116244499 * var3.ac + -1225111563 * var3.af > var1) {
            return var3;
         } else {
            var3.remove();
            return null;
         }
      } else {
         return null;
      }
   }

   boolean isEmpty() {
      return this.ac.at();
   }

   public static ClientError setCurrentMapArea(Throwable var0, String var1) {
      ClientError var2;
      if (var0 instanceof ClientError) {
         var2 = (ClientError)var0;
         var2.ab = var2.ab + ' ' + var1;
      } else {
         var2 = new ClientError(var0, var1);
      }

      return var2;
   }
}
