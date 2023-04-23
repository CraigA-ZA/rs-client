public class Task {
   Task next;
   int type;
   Object objectArgument;
   public int intArgument;
   public volatile int status = 0;
   public volatile Object result;

   Task() {
   }
}
