public class WorldMapArchiveLoader {
   boolean isLoaded0 = false;
   int percentLoaded0 = 0;
   String cacheName;
   AbstractArchive archive;

   WorldMapArchiveLoader(AbstractArchive var1) {
      this.archive = var1;
   }

   void reset(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         if (this.cacheName != var1) {
            this.cacheName = var1;
            this.percentLoaded0 = 0;
            this.isLoaded0 = false;
            this.load();
         }
      }
   }

   int load() {
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

   int percentLoaded() {
      return -349750411 * this.percentLoaded0;
   }
}
