public class jg {
   int aw = 0;
   public boolean an = true;
   public int ab = 1538564608;
   int[] aj = new int[1024];
   int ai;
   public TextureLoader aq;
   int ax;
   int ah;
   int ag;
   boolean af = false;
   int av;
   int ar;
   int am;
   int as;
   static int ou;

   void af() {
      this.ax = 1695415347 * (571147771 * this.ag / 2);
      this.ai = this.ah * -1347859351 / 2 * -1393733317;
      this.av = -(-1719496509 * this.ax);
      this.ar = 115528311 * this.ag - -2084847753 * this.ax;
      this.am = -(this.ai * 756446203);
      this.as = -1130425185 * this.ah - this.ai * 1303915237;
   }

   void an(int var1, int var2, int var3, int var4) {
      this.ax = 1695415347 * (var1 - var2);
      this.ai = -1393733317 * (var3 - var4);
      this.av = -(this.ax * -1719496509);
      this.ar = 115528311 * this.ag - this.ax * -2084847753;
      this.am = -(this.ai * 756446203);
      this.as = this.ah * -1130425185 - this.ai * 1303915237;
   }

   jg() {
   }

   void aw(int var1, int var2, int var3) {
      this.af = var1 < 0 || var1 > this.ag * 571147771 || var2 < 0 || var2 > this.ag * 571147771 || var3 < 0 || var3 > this.ag * 571147771;
   }

   static void an_renamed(int var0, ArchiveDisk var1, Archive var2) {
      ArchiveDiskAction var4 = new ArchiveDiskAction();
      var4.type = -1330450855;
      var4.hr = (long)var0;
      var4.archiveDisk = var1;
      var4.archive = var2;
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
         ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4);
      }

      eh.aw_renamed();
   }
}
