import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WorldMap {
   static final FontName fontNameVerdana11;
   static final FontName fontNameVerdana15;
   static final FontName fontNameVerdana13;
   boolean bq = true;
   boolean elementsDisabled = false;
   boolean perpetualFlash0 = false;
   float ap;
   float by;
   int ad = -2080912417;
   int ae = -667691095;
   int ak;
   int az;
   int bb = 410569687;
   int bd = 297924373;
   int be = 468823633;
   int bf;
   int bi = -224660999;
   int bj = 1462155693;
   int bk = 821936197;
   int bn = -387305683;
   int bo = 726470486;
   int br = -531836949;
   int bs = -99962399;
   int bt = -1698997397;
   int bu;
   int bx = 1412277301;
   int ce = 0;
   int cf = 1316647483;
   int cg = -1812867423;
   int cl = -1178523109;
   int cm;
   HashMap mapAreas;
   HashMap fonts;
   HashSet bc = new HashSet();
   HashSet bh = new HashSet();
   HashSet enabledElements = new HashSet();
   HashSet flashingElements = null;
   HashSet enabledCategories = new HashSet();
   HashSet ca = new HashSet();
   Iterator iconIterator;
   List cc;
   WorldMapArea am;
   WorldMapArea currentMapArea0;
   WorldMapArea mainMapArea;
   WorldMapManager worldMapManager;
   Coord mouseCoord = null;
   long bg;
   AbstractArchive al;
   AbstractArchive aq;
   AbstractArchive at;
   Font font;
   WorldMapArchiveLoader cacheLoader;
   IndexedSprite[] mapSceneSprites;
   Sprite sprite;
   final int[] cs = new int[]{1008, 1009, 1010, 1011, 1012};
   public boolean ck = false;

   static {
      fontNameVerdana11 = FontName.FontName_verdana11;
      fontNameVerdana13 = FontName.FontName_verdana13;
      fontNameVerdana15 = FontName.FontName_verdana15;
   }

   public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
      this.mapSceneSprites = var6;
      this.aq = var1;
      this.al = var2;
      this.at = var3;
      this.font = var4;
      this.fonts = new HashMap();
      this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11));
      this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13));
      this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15));
      this.cacheLoader = new WorldMapArchiveLoader(var1);
      int var8 = this.aq.getGroupId(WorldMapCacheName.WorldMapCacheName_details.name);
      int[] var9 = this.aq.ck(var8);
      int var10 = var9 == null ? 0 : var9.length;
      this.mapAreas = new HashMap(var10);

      for(int var11 = 0; var11 < var10; ++var11) {
         Packet var12 = new Packet(this.aq.takeFile(var8, var9[var11]));
         WorldMapArea var13 = new WorldMapArea();
         var13.read(var12, var9[var11]);
         this.mapAreas.put(var13.archiveName(), var13);
         if (var13.isMain()) {
            this.mainMapArea = var13;
         }
      }

      this.setCurrentMapArea(this.mainMapArea);
      this.am = null;
   }

   public void an() {
      WorldMapRegion.au.demote(5);
   }

   public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.cacheLoader.isLoaded()) {
         this.smoothZoom();
         this.aq();
         if (var3) {
            int var9 = (int)Math.ceil((double)((float)var6 / this.ap));
            int var10 = (int)Math.ceil((double)((float)var7 / this.ap));
            List var11 = this.worldMapManager.ab(-84102297 * this.ak - var9 / 2 - 1, this.az * -632186207 - var10 / 2 - 1, 1 + this.ak * -84102297 + var9 / 2, 1 + var10 / 2 + this.az * -632186207, var4, var5, var6, var7, var1, var2);
            HashSet var12 = new HashSet();

            Iterator var13;
            AbstractWorldMapIcon var14;
            ClientScriptEvent var15;
            WorldMapEvent var16;
            for(var13 = var11.iterator(); var13.hasNext(); HeadbarUpdate.af_renamed(var15)) {
               var14 = (AbstractWorldMapIcon)var13.next();
               var12.add(var14);
               var15 = new ClientScriptEvent();
               var16 = new WorldMapEvent(var14.element(), var14.coord1, var14.coord2);
               var15.setArgs(new Object[]{var16, var1, var2});
               if (this.ca.contains(var14)) {
                  var15.setType(17);
               } else {
                  var15.setType(15);
               }
            }

            var13 = this.ca.iterator();

            while(var13.hasNext()) {
               var14 = (AbstractWorldMapIcon)var13.next();
               if (!var12.contains(var14)) {
                  var15 = new ClientScriptEvent();
                  var16 = new WorldMapEvent(var14.element(), var14.coord1, var14.coord2);
                  var15.setArgs(new Object[]{var16, var1, var2});
                  var15.setType(16);
                  HeadbarUpdate.af_renamed(var15);
               }
            }

            this.ca = var12;
         }
      }
   }

   public void ac(int var1, int var2, boolean var3, boolean var4) {
      long var6 = Formatting.af_renamed();
      this.au(var1, var2, var4, var6);
      if (!this.aa() && (var4 || var3) && !InvType.ok_renamed()) {
         if (var4) {
            this.bs = 99962399 * var1;
            this.br = 531836949 * var2;
            this.bj = 592139365 * this.ak;
            this.bn = 1696219827 * this.az;
         }

         if (-1 != -1960645157 * this.bj) {
            int var8 = var1 - this.bs * -642077217;
            int var9 = var2 - -2058412227 * this.br;
            this.al(this.bj * -1960645157 - (int)((float)var8 / this.by), -1246558373 * this.bn + (int)((float)var9 / this.by), false);
         }
      } else {
         this.at();
      }

      if (var4) {
         this.bg = 7451806700989670229L * var6;
         this.bu = var1 * -1462297475;
         this.bf = var2 * -88109587;
      }

   }

   void au(int var1, int var2, boolean var3, long var4) {
      if (this.currentMapArea0 != null) {
         int var6 = (int)((float)(-84102297 * this.ak) + ((float)(var1 - this.be * 817997135) - (float)this.bj() * this.ap / 2.0F) / this.ap);
         int var7 = (int)((float)(this.az * -632186207) - ((float)(var2 - this.bk * -1710969485) - (float)this.bn() * this.ap / 2.0F) / this.ap);
         this.mouseCoord = this.currentMapArea0.coord(var6 + this.currentMapArea0.minX() * 64, var7 + this.currentMapArea0.minY() * 64);
         if (null != this.mouseCoord && var3) {
            hy var8 = Client.sh;
            boolean var10 = Client.pu * 324465533 >= 2;
            int var12;
            int var13;
            if (var10 && var8.av(82) && var8.av(81)) {
               int var18 = this.mouseCoord.x * -96298701;
               var12 = -2105445199 * this.mouseCoord.z;
               var13 = this.mouseCoord.y * -113644749;
               PacketBitNode var14 = mi.an_renamed(ClientProt.cq, Client.packetWriter.au);
               var14.bit.p4ME(0);
               var14.bit.dy(var18);
               var14.bit.dh(var13);
               var14.bit.ds(var12);
               Client.packetWriter.aw(var14);
            } else {
               boolean var11 = true;
               if (this.bq) {
                  var12 = var1 - this.bu * -1959248683;
                  var13 = var2 - -1379608603 * this.bf;
                  if (var4 - 492133368256496125L * this.bg > 500L || var12 < -25 || var12 > 25 || var13 < -25 || var13 > 25) {
                     var11 = false;
                  }
               }

               if (var11) {
                  PacketBitNode var19 = mi.an_renamed(ClientProt.bv, Client.packetWriter.au);
                  var19.bit.p4LE16(this.mouseCoord.af());
                  Client.packetWriter.aw(var19);
                  this.bg = 0L;
               }
            }
         }
      } else {
         this.mouseCoord = null;
      }

   }

   void smoothZoom() {
      if (fi.wc != null) {
         this.ap = this.by;
      } else {
         if (this.ap < this.by) {
            this.ap = Math.min(this.by, this.ap / 30.0F + this.ap);
         }

         if (this.ap > this.by) {
            this.ap = Math.max(this.by, this.ap - this.ap / 30.0F);
         }

      }
   }

   void aq() {
      if (this.aa()) {
         int var2 = this.ad * 506744801 - this.ak * -84102297;
         int var3 = this.ae * 1744520039 - this.az * -632186207;
         if (0 != var2) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         if (var3 != 0) {
            var3 /= Math.min(8, Math.abs(var3));
         }

         this.al(-84102297 * this.ak + var2, var3 + this.az * -632186207, true);
         if (this.ad * 506744801 == this.ak * -84102297 && 1744520039 * this.ae == this.az * -632186207) {
            this.ad = -2080912417;
            this.ae = -667691095;
         }

      }
   }

   final void al(int var1, int var2, boolean var3) {
      this.ak = -599017385 * var1;
      this.az = var2 * 19712353;
      Formatting.af_renamed();
      if (var3) {
         this.at();
      }

   }

   final void at() {
      this.br = -531836949;
      this.bs = -99962399;
      this.bn = -387305683;
      this.bj = 1462155693;
   }

   boolean aa() {
      return -1 != 506744801 * this.ad && this.ae * 1744520039 != -1;
   }

   public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
      Iterator var5 = this.mapAreas.values().iterator();

      WorldMapArea var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (WorldMapArea)var5.next();
      } while(!var6.containsCoord(var1, var2, var3));

      return var6;
   }

   public void ao(int var1, int var2, int var3, boolean var4) {
      WorldMapArea var6 = this.mapAreaAtCoord(var1, var2, var3);
      if (var6 == null) {
         if (!var4) {
            return;
         }

         var6 = this.mainMapArea;
      }

      boolean var7 = false;
      if (this.am != var6 || var4) {
         this.am = var6;
         this.setCurrentMapArea(var6);
         var7 = true;
      }

      if (var7 || var4) {
         this.am(var1, var2, var3);
      }

   }

   public void ax(int var1) {
      WorldMapArea var3 = this.getMapArea(var1);
      if (null != var3) {
         this.setCurrentMapArea(var3);
      }

   }

   public int currentMapAreaId() {
      return this.currentMapArea0 == null ? -1 : this.currentMapArea0.id();
   }

   public WorldMapArea getCurrentMapArea() {
      return this.currentMapArea0;
   }

   void setCurrentMapArea(WorldMapArea var1) {
      if (null == this.currentMapArea0 || this.currentMapArea0 != var1) {
         this.initializeWorldMapManager(var1);
         this.am(-1, -1, -1);
      }
   }

   void initializeWorldMapManager(WorldMapArea var1) {
      this.currentMapArea0 = var1;
      this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.al, this.at);
      this.cacheLoader.reset(null == this.currentMapArea0 ? null : this.currentMapArea0.archiveName());
   }

   public void ar(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
      if (null != var1) {
         if (null == this.currentMapArea0 || this.currentMapArea0 != var1) {
            this.initializeWorldMapManager(var1);
         }

         if (!var4 && this.currentMapArea0.containsCoord(-113644749 * var2.y, -96298701 * var2.x, var2.z * -2105445199)) {
            this.am(-113644749 * var2.y, -96298701 * var2.x, var2.z * -2105445199);
         } else {
            this.am(-113644749 * var3.y, var3.x * -96298701, var3.z * -2105445199);
         }

      }
   }

   void am(int var1, int var2, int var3) {
      if (this.currentMapArea0 != null) {
         int[] var5 = this.currentMapArea0.position(var1, var2, var3);
         if (var5 == null) {
            var5 = this.currentMapArea0.position(this.currentMapArea0.originPlane(), this.currentMapArea0.originX(), this.currentMapArea0.originY());
         }

         this.al(var5[0] - this.currentMapArea0.minX() * 64, var5[1] - this.currentMapArea0.minY() * 64, true);
         this.ad = -2080912417;
         this.ae = -667691095;
         this.ap = this.ap(this.currentMapArea0.zoom());
         this.by = this.ap;
         this.cc = null;
         this.iconIterator = null;
         this.worldMapManager.an();
      }
   }

   public void draw(int var1, int var2, int var3, int var4, int var5) {
      int[] var7 = new int[4];
      Rasterizer2D.Rasterizer2D_getClipArray(var7);
      Rasterizer2D.Rasterizer2D_setClip(var1, var2, var1 + var3, var2 + var4);
      Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
      int var8 = this.cacheLoader.ac();
      if (var8 < 100) {
         this.drawLoading(var1, var2, var3, var4, var8);
      } else {
         if (!this.worldMapManager.isLoaded()) {
            this.worldMapManager.load(this.aq, this.currentMapArea0.archiveName(), Client.ca);
            if (!this.worldMapManager.isLoaded()) {
               return;
            }
         }

         if (this.flashingElements != null) {
            this.bt += 1698997397;
            if (this.bt * 1104873149 % (this.bo * 1369293643) == 0) {
               this.bt = 0;
               this.bd += -297924373;
            }

            if (this.bd * 676356035 >= -1444238761 * this.bx && !this.perpetualFlash0) {
               this.flashingElements = null;
            }
         }

         int var9 = (int)Math.ceil((double)((float)var3 / this.ap));
         int var10 = (int)Math.ceil((double)((float)var4 / this.ap));
         this.worldMapManager.aw(-84102297 * this.ak - var9 / 2, -632186207 * this.az - var10 / 2, this.ak * -84102297 + var9 / 2, var10 / 2 + this.az * -632186207, var1, var2, var1 + var3, var4 + var2);
         boolean var11;
         if (!this.elementsDisabled) {
            var11 = false;
            if (var5 - 460446351 * this.ce > 100) {
               this.ce = var5 * -2042100625;
               var11 = true;
            }

            this.worldMapManager.ac(this.ak * -84102297 - var9 / 2, -632186207 * this.az - var10 / 2, -84102297 * this.ak + var9 / 2, -632186207 * this.az + var10 / 2, var1, var2, var1 + var3, var2 + var4, this.bh, this.flashingElements, this.bt * 1104873149, this.bo * 1369293643, var11);
         }

         this.ak(var1, var2, var3, var4, var9, var10);
         var11 = 324465533 * Client.pu >= 2;
         if (var11 && this.ck && this.mouseCoord != null) {
            this.font.draw("Coord: " + this.mouseCoord, 10 + Rasterizer2D.Rasterizer2D_xClipStart, 20 + Rasterizer2D.Rasterizer2D_yClipStart, 16776960, -1);
         }

         this.bb = var9 * -410569687;
         this.bi = var10 * 224660999;
         this.be = -468823633 * var1;
         this.bk = var2 * -821936197;
         Rasterizer2D.Rasterizer2D_setClipArray(var7);
      }
   }

   boolean aj(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null == this.sprite) {
         return true;
      } else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
         if (-1655947893 * this.worldMapManager.ah != this.cm * 1547438523) {
            return true;
         } else if (this.cg * 2016965279 != -1680619819 * Client.wn) {
            return true;
         } else if (var3 <= 0 && var4 <= 0) {
            return var1 + var3 < var5 || var4 + var2 < var6;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   void ak(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (fi.wc != null) {
         int var8 = 512 / (983071510 * this.worldMapManager.ah);
         int var9 = 512 + var3;
         int var10 = var4 + 512;
         float var11 = 1.0F;
         var9 = (int)((float)var9 / var11);
         var10 = (int)((float)var10 / var11);
         int var12 = this.bm() - var5 / 2 - var8;
         int var13 = this.bd() - var6 / 2 - var8;
         int var14 = var1 - this.worldMapManager.ah * -1655947893 * (var8 + var12 - this.cf * 334129421);
         int var15 = var2 - (var8 - (var13 - this.cl * 627335149)) * -1655947893 * this.worldMapManager.ah;
         if (this.aj(var9, var10, var14, var15, var3, var4)) {
            if (this.sprite != null && this.sprite.subWidth == var9 && var10 == this.sprite.subHeight) {
               Arrays.fill(this.sprite.pixels, 0);
            } else {
               this.sprite = new Sprite(var9, var10);
            }

            this.cf = (this.bm() - var5 / 2 - var8) * -1316647483;
            this.cl = (this.bd() - var6 / 2 - var8) * 1178523109;
            this.cm = this.worldMapManager.ah * 219395697;
            fi.wc.au(this.cf * 334129421, 627335149 * this.cl, this.sprite, (float)(1547438523 * this.cm) / var11);
            this.cg = Client.wn * 2048189963;
            var14 = var1 - this.worldMapManager.ah * -1655947893 * (var8 + var12 - this.cf * 334129421);
            var15 = var2 - (var8 - (var13 - 627335149 * this.cl)) * this.worldMapManager.ah * -1655947893;
         }

         Rasterizer2D.ev_renamed(var1, var2, var3, var4, 0, 128);
         if (1.0F == var11) {
            this.sprite.az(var14, var15, 192);
         } else {
            this.sprite.ap(var14, var15, (int)((float)var9 * var11), (int)(var11 * (float)var10), 192);
         }
      }

   }

   public void az(int var1, int var2, int var3, int var4) {
      if (this.cacheLoader.isLoaded()) {
         if (!this.worldMapManager.isLoaded()) {
            this.worldMapManager.load(this.aq, this.currentMapArea0.archiveName(), Client.ca);
            if (!this.worldMapManager.isLoaded()) {
               return;
            }
         }

         this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, 1104873149 * this.bt, 1369293643 * this.bo);
      }
   }

   public void ad(int var1) {
      this.by = this.ap(var1);
   }

   void drawLoading(int var1, int var2, int var3, int var4, int var5) {
      byte var7 = 20;
      int var8 = var1 + var3 / 2;
      int var9 = var2 + var4 / 2 - 18 - var7;
      Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
      Rasterizer2D.Rasterizer2D_drawRectangle(var8 - 152, var9, 304, 34, -65536);
      Rasterizer2D.Rasterizer2D_fillRectangle(var8 - 150, 2 + var9, var5 * 3, 30, -65536);
      this.font.drawCentered(Strings.Strings_loading, var8, var7 + var9, -1, -1);
   }

   float ap(int var1) {
      if (var1 == 25) {
         return 1.0F;
      } else if (var1 == 37) {
         return 1.5F;
      } else if (var1 == 50) {
         return 2.0F;
      } else if (75 == var1) {
         return 3.0F;
      } else {
         return 100 == var1 ? 4.0F : 8.0F;
      }
   }

   public int by() {
      if (1.0 == (double)this.by) {
         return 25;
      } else if (1.5 == (double)this.by) {
         return 37;
      } else if (2.0 == (double)this.by) {
         return 50;
      } else if ((double)this.by == 3.0) {
         return 75;
      } else {
         return (double)this.by == 4.0 ? 100 : 200;
      }
   }

   public void bb() {
      this.cacheLoader.an();
   }

   public boolean isCacheLoaded() {
      return this.cacheLoader.isLoaded();
   }

   public WorldMapArea getMapArea(int var1) {
      Iterator var3 = this.mapAreas.values().iterator();

      WorldMapArea var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (WorldMapArea)var3.next();
      } while(var4.id() != var1);

      return var4;
   }

   public void bk(int var1, int var2) {
      if (null != this.currentMapArea0 && this.currentMapArea0.containsPosition(var1, var2)) {
         this.ad = (var1 - this.currentMapArea0.minX() * 64) * 2080912417;
         this.ae = (var2 - this.currentMapArea0.minY() * 64) * 667691095;
      }
   }

   public void bx(int var1, int var2) {
      if (null != this.currentMapArea0) {
         this.al(var1 - this.currentMapArea0.minX() * 64, var2 - this.currentMapArea0.minY() * 64, true);
         this.ad = -2080912417;
         this.ae = -667691095;
      }
   }

   public void bo(int var1, int var2, int var3) {
      if (null != this.currentMapArea0) {
         int[] var5 = this.currentMapArea0.position(var1, var2, var3);
         if (var5 != null) {
            this.bk(var5[0], var5[1]);
         }

      }
   }

   public void bz(int var1, int var2, int var3) {
      if (this.currentMapArea0 != null) {
         int[] var5 = this.currentMapArea0.position(var1, var2, var3);
         if (var5 != null) {
            this.bx(var5[0], var5[1]);
         }

      }
   }

   public int bm() {
      return null == this.currentMapArea0 ? -1 : -84102297 * this.ak + this.currentMapArea0.minX() * 64;
   }

   public int bd() {
      return this.currentMapArea0 == null ? -1 : -632186207 * this.az + this.currentMapArea0.minY() * 64;
   }

   public Coord bt() {
      return this.currentMapArea0 == null ? null : this.currentMapArea0.coord(this.bm(), this.bd());
   }

   public int bj() {
      return -1222006759 * this.bb;
   }

   public int bn() {
      return 1077411767 * this.bi;
   }

   public void bs(int var1) {
      if (var1 >= 1) {
         this.bx = -960896665 * var1;
      }

   }

   public void br() {
      this.bx = 1412277301;
   }

   public void bg(int var1) {
      if (var1 >= 1) {
         this.bo = 787623523 * var1;
      }

   }

   public void bu() {
      this.bo = 726470486;
   }

   public void perpetualFlash(boolean var1) {
      this.perpetualFlash0 = var1;
   }

   public void flashElement(int var1) {
      this.flashingElements = new HashSet();
      this.flashingElements.add(var1);
      this.bd = 0;
      this.bt = 0;
   }

   public void flashCategory(int var1) {
      this.flashingElements = new HashSet();
      this.bd = 0;
      this.bt = 0;

      for(int var3 = 0; var3 < -1703136055 * mo.MapElementType_count; ++var3) {
         if (nf.getMapElementType(var3) != null && nf.getMapElementType(var3).category * -461862935 == var1) {
            this.flashingElements.add(nf.getMapElementType(var3).au * 219774827);
         }
      }

   }

   public void stopCurrentFlashes() {
      this.flashingElements = null;
   }

   public void setElementsEnabled(boolean var1) {
      this.elementsDisabled = !var1;
   }

   public void disableElement(int var1, boolean var2) {
      if (!var2) {
         this.enabledElements.add(var1);
      } else {
         this.enabledElements.remove(var1);
      }

      this.ci();
   }

   public void disableCategory(int var1, boolean var2) {
      if (!var2) {
         this.enabledCategories.add(var1);
      } else {
         this.enabledCategories.remove(var1);
      }

      for(int var4 = 0; var4 < mo.MapElementType_count * -1703136055; ++var4) {
         if (nf.getMapElementType(var4) != null && nf.getMapElementType(var4).category * -461862935 == var1) {
            int var5 = nf.getMapElementType(var4).au * 219774827;
            if (!var2) {
               this.bc.add(var5);
            } else {
               this.bc.remove(var5);
            }
         }
      }

      this.ci();
   }

   public boolean getElementsEnabled() {
      return !this.elementsDisabled;
   }

   public boolean isElementDisabled(int var1) {
      return !this.enabledElements.contains(var1);
   }

   public boolean isCategoryDisabled(int var1) {
      return !this.enabledCategories.contains(var1);
   }

   void ci() {
      this.bh.clear();
      this.bh.addAll(this.enabledElements);
      this.bh.addAll(this.bc);
   }

   public void cs(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.cacheLoader.isLoaded()) {
         int var8 = (int)Math.ceil((double)((float)var3 / this.ap));
         int var9 = (int)Math.ceil((double)((float)var4 / this.ap));
         List var10 = this.worldMapManager.ab(this.ak * -84102297 - var8 / 2 - 1, -632186207 * this.az - var9 / 2 - 1, var8 / 2 + this.ak * -84102297 + 1, 1 + var9 / 2 + this.az * -632186207, var1, var2, var3, var4, var5, var6);
         if (!var10.isEmpty()) {
            Iterator var11 = var10.iterator();

            boolean var14;
            do {
               if (!var11.hasNext()) {
                  return;
               }

               AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next();
               MapElementType var13 = nf.getMapElementType(var12.element());
               var14 = false;

               for(int var15 = this.cs.length - 1; var15 >= 0; --var15) {
                  if (null != var13.iop[var15]) {
                     MiniMenuEntry.kz_renamed(var13.iop[var15], var13.ag, this.cs[var15], var12.element(), var12.coord1.af(), var12.coord2.af());
                     var14 = true;
                  }
               }
            } while(!var14);

         }
      }
   }

   public Coord cc(int var1, Coord var2) {
      if (!this.cacheLoader.isLoaded()) {
         return null;
      } else if (!this.worldMapManager.isLoaded()) {
         return null;
      } else if (!this.currentMapArea0.containsPosition(var2.x * -96298701, -2105445199 * var2.z)) {
         return null;
      } else {
         HashMap var4 = this.worldMapManager.buildIcons();
         List var5 = (List)var4.get(var1);
         if (var5 != null && !var5.isEmpty()) {
            AbstractWorldMapIcon var6 = null;
            int var7 = -1;
            Iterator var8 = var5.iterator();

            while(true) {
               AbstractWorldMapIcon var9;
               int var12;
               do {
                  if (!var8.hasNext()) {
                     return var6.coord2;
                  }

                  var9 = (AbstractWorldMapIcon)var8.next();
                  int var10 = -96298701 * var9.coord2.x - -96298701 * var2.x;
                  int var11 = -2105445199 * var9.coord2.z - -2105445199 * var2.z;
                  var12 = var10 * var10 + var11 * var11;
                  if (0 == var12) {
                     return var9.coord2;
                  }
               } while(var12 >= var7 && null != var6);

               var6 = var9;
               var7 = var12;
            }
         } else {
            return null;
         }
      }
   }

   public void menuAction(int var1, int var2, Coord var3, Coord var4) {
      ClientScriptEvent var6 = new ClientScriptEvent();
      WorldMapEvent var7 = new WorldMapEvent(var2, var3, var4);
      var6.setArgs(new Object[]{var7});
      switch (var1) {
         case 1008:
            var6.setType(10);
            break;
         case 1009:
            var6.setType(11);
            break;
         case 1010:
            var6.setType(12);
            break;
         case 1011:
            var6.setType(13);
            break;
         case 1012:
            var6.setType(14);
      }

      HeadbarUpdate.af_renamed(var6);
   }

   public AbstractWorldMapIcon iconStart() {
      if (!this.cacheLoader.isLoaded()) {
         return null;
      } else if (!this.worldMapManager.isLoaded()) {
         return null;
      } else {
         HashMap var2 = this.worldMapManager.buildIcons();
         this.cc = new LinkedList();
         Iterator var3 = var2.values().iterator();

         while(var3.hasNext()) {
            List var4 = (List)var3.next();
            this.cc.addAll(var4);
         }

         this.iconIterator = this.cc.iterator();
         return this.iconNext();
      }
   }

   public AbstractWorldMapIcon iconNext() {
      if (this.iconIterator == null) {
         return null;
      } else {
         AbstractWorldMapIcon var2;
         do {
            if (!this.iconIterator.hasNext()) {
               return null;
            }

            var2 = (AbstractWorldMapIcon)this.iconIterator.next();
         } while(var2.element() == -1);

         return var2;
      }
   }
}
