import java.util.Date;

public class fo extends fb {
   static int[] ar;
   int ac;
   int af;
   int an;
   int aw;
   // $FF: synthetic field
   final fa this$0;

   static void addMessage(int var0, String var1, String var2, String var3) {
      ChatChannel var5 = (ChatChannel)Messages.Messages_channels.get(var0);
      if (var5 == null) {
         var5 = new ChatChannel();
         Messages.Messages_channels.put(var0, var5);
      }

      Message var6 = var5.addMessage(var0, var1, var2, var3);
      Messages.Messages_hashTable.put(var6, (long)(var6.count * -1117255211));
      Messages.Messages_queue.an(var6);
      Client.qb = Client.qu * -2073795047;
   }

   public static String af(long var0) {
      ma.aw.setTime(new Date(var0));
      int var2 = ma.aw.get(7);
      int var3 = ma.aw.get(5);
      int var4 = ma.aw.get(2);
      int var5 = ma.aw.get(1);
      int var6 = ma.aw.get(11);
      int var7 = ma.aw.get(12);
      int var8 = ma.aw.get(13);
      return ma.an[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + ma.af[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
   }

   fo(fa var1) {
      this.this$0 = var1;
      this.af = -2034222333;
   }

   void write(Packet var1) {
      this.af = var1.cl() * 2034222333;
      this.an = var1.g4s() * 1848917875;
      this.aw = var1.g1() * 108318663;
      this.ac = var1.g1() * -152654653;
   }

   void an(fj var1) {
      var1.ag(-830375851 * this.af, 605814203 * this.an, this.aw * -1826209289, this.ac * -1378851861);
   }
}
