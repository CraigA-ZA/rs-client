import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class av implements ThreadFactory {
   static int uq;
   static IndexedSprite[] dl;
   // $FF: synthetic field
   final ag this$0;
   final ThreadGroup af;
   final AtomicInteger an;

   public static int af_renamed(CharSequence var0, CharSequence var1, Language var2) {
      int var4 = var0.length();
      int var5 = var1.length();
      int var6 = 0;
      int var7 = 0;
      byte var8 = 0;
      byte var9 = 0;

      int var10;
      int var11;
      int var12;
      char var13;
      while(var6 - var8 < var4 || var7 - var9 < var5) {
         if (var6 - var8 >= var4) {
            return -1;
         }

         if (var7 - var9 >= var5) {
            return 1;
         }

         if (var8 != 0) {
            var10 = var8;
            boolean var21 = false;
         } else {
            var10 = var0.charAt(var6++);
         }

         if (0 != var9) {
            var11 = var9;
            boolean var22 = false;
         } else {
            var11 = var1.charAt(var7++);
         }

         if (198 == var10) {
            var12 = 69;
         } else if (230 == var10) {
            var12 = 101;
         } else if (223 == var10) {
            var12 = 115;
         } else if (var10 == 338) {
            var12 = 69;
         } else if (339 == var10) {
            var12 = 101;
         } else {
            var12 = 0;
         }

         var8 = (byte)var12;
         if (var11 == 198) {
            var13 = 'E';
         } else if (var11 == 230) {
            var13 = 'e';
         } else if (223 == var11) {
            var13 = 's';
         } else if (338 == var11) {
            var13 = 'E';
         } else if (var11 == 339) {
            var13 = 'e';
         } else {
            var13 = 0;
         }

         var9 = (byte)var13;
         var10 = AbstractArchive.an_renamed((char)var10, var2);
         var11 = AbstractArchive.an_renamed((char)var11, var2);
         if (var10 != var11 && Character.toUpperCase((char)var10) != Character.toUpperCase((char)var11)) {
            var10 = Character.toLowerCase((char)var10);
            var11 = Character.toLowerCase((char)var11);
            if (var10 != var11) {
               return Archive.aw_renamed((char)var10, var2) - Archive.aw_renamed((char)var11, var2);
            }
         }
      }

      var10 = Math.min(var4, var5);

      for(var11 = 0; var11 < var10; ++var11) {
         if (Language.aw == var2) {
            var6 = var4 - 1 - var11;
            var7 = var5 - 1 - var11;
         } else {
            var7 = var11;
            var6 = var11;
         }

         var12 = var0.charAt(var6);
         var13 = var1.charAt(var7);
         if (var12 != var13 && Character.toUpperCase((char)var12) != Character.toUpperCase(var13)) {
            var12 = Character.toLowerCase((char)var12);
            var13 = Character.toLowerCase(var13);
            if (var13 != var12) {
               return Archive.aw_renamed((char)var12, var2) - Archive.aw_renamed(var13, var2);
            }
         }
      }

      var11 = var4 - var5;
      if (0 != var11) {
         return var11;
      } else {
         for(var12 = 0; var12 < var10; ++var12) {
            var13 = var0.charAt(var12);
            char var14 = var1.charAt(var12);
            if (var14 != var13) {
               return Archive.aw_renamed(var13, var2) - Archive.aw_renamed(var14, var2);
            }
         }

         return 0;
      }
   }

   av(ag var1) {
      this.this$0 = var1;
      this.an = new AtomicInteger(1);
      SecurityManager var2 = System.getSecurityManager();
      this.af = null != var2 ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
   }

   public Thread newThread(Runnable var1) {
      Thread var2 = new Thread(this.af, var1, this.this$0.an + "-rest-request-" + this.an.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   static int bc_renamed(int var0, ClientScript var1, boolean var2) {
      return 2;
   }
}
