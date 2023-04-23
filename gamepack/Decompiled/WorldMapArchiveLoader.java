public class WorldMapArchiveLoader {
   boolean al = false;
   int aq = 0;
   String au;
   AbstractArchive ab;

   WorldMapArchiveLoader(AbstractArchive var1) {
      this.ab = var1;
   }

   void reset(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         if (this.au != var1) {
            this.au = var1;
            this.aq = 0;
            this.al = false;
            this.an();
         }
      }
   }

   int an() {
      if (this.au == null) {
         this.aq = 840222292;
         this.al = true;
      } else {
         if (-349750411 * this.aq < 33) {
            if (!this.ab.tryLoadFileByNames(WorldMapCacheName.an.ab, this.au)) {
               return -349750411 * this.aq;
            }

            this.aq = 663820413;
         }

         if (this.aq * -349750411 == 33) {
            if (this.ab.cv(WorldMapCacheName.aw.ab, this.au) && !this.ab.tryLoadFileByNames(WorldMapCacheName.aw.ab, this.au)) {
               return this.aq * -349750411;
            }

            this.aq = 1327640826;
         }

         if (this.aq * -349750411 == 66) {
            if (!this.ab.tryLoadFileByNames(this.au, WorldMapCacheName.au.ab)) {
               return -349750411 * this.aq;
            }

            this.aq = 840222292;
            this.al = true;
         }
      }

      return -349750411 * this.aq;
   }

   boolean isLoaded() {
      return this.al;
   }

   int ac() {
      return -349750411 * this.aq;
   }
}
