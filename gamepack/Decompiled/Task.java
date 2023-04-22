public class Task {
   public int intArgument;
   Task next;
   public volatile int status = 0;
   int type;
   Object objectArgument;
   public volatile Object result;

   Task() {
   }
}
