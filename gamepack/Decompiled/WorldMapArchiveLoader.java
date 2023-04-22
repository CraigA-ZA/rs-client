public class WorldMapArchiveLoader {
   String cacheName;
   AbstractArchive archive;
   int percentLoaded0 = 0;
   boolean isLoaded0 = false;

   void reset(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         if (this.cacheName != var1) {
            this.cacheName = var1;
            this.percentLoaded0 = 0;
            this.isLoaded0 = false;
            this.an();
         }
      }
   }

   int an() {
      if (this.cacheName == null) {
         this.percentLoaded0 = 840222292;
         this.isLoaded0 = true;
      } else {
         if (-349750411 * this.percentLoaded0 < 33) {
            if (!this.archive.tryLoadFileByNames(WorldMapCacheName.WorldMapCacheName_compositeMap.name, this.cacheName)) {
               return -349750411 * this.percentLoaded0;
            }

            this.percentLoaded0 = 663820413;
         }

         if (this.percentLoaded0 * -349750411 == 33) {
            if (this.archive.cv(WorldMapCacheName.WorldMapCacheName_compositeTexture.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.WorldMapCacheName_compositeTexture.name, this.cacheName)) {
               return this.percentLoaded0 * -349750411;
            }

            this.percentLoaded0 = 1327640826;
         }

         if (this.percentLoaded0 * -349750411 == 66) {
            if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.WorldMapCacheName_labels.name)) {
               return -349750411 * this.percentLoaded0;
            }

            this.percentLoaded0 = 840222292;
            this.isLoaded0 = true;
         }
      }

      return -349750411 * this.percentLoaded0;
   }

   boolean isLoaded() {
      return this.isLoaded0;
   }

   int ac() {
      return -349750411 * this.percentLoaded0;
   }

   WorldMapArchiveLoader(AbstractArchive var1) {
      this.archive = var1;
   }
}
