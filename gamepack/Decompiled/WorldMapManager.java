import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class WorldMapManager {
   boolean af = false;
   boolean an = false;
   int ag;
   int ai;
   int ao;
   int ax;
   HashMap aq = new HashMap();
   HashMap au;
   WorldMapRegion[][] ab;
   WorldMapAreaData aw;
   IndexedSprite[] al;
   Rasterizer3D ac;
   final HashMap ay;
   final AbstractArchive aa;
   final AbstractArchive at;
   public int ah = 0;

   public WorldMapManager(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
      this.al = var1;
      this.ay = var2;
      this.at = var3;
      this.aa = var4;
   }

   public void load(AbstractArchive var1, String var2, boolean var3) {
      if (!this.an) {
         this.af = false;
         this.an = true;
         System.nanoTime();
         int var5 = var1.getGroupId(WorldMapCacheName.af.ab);
         int var6 = var1.getFileId(var5, var2);
         Packet var7 = new Packet(var1.takeFileByNames(WorldMapCacheName.af.ab, var2));
         Packet var8 = new Packet(var1.takeFileByNames(WorldMapCacheName.an.ab, var2));
         System.nanoTime();
         System.nanoTime();
         this.aw = new WorldMapAreaData();

         try {
            this.aw.cl(var7, var8, var6, var3);
         } catch (IllegalStateException var17) {
            return;
         }

         this.aw.originX();
         this.aw.originPlane();
         this.aw.originY();
         this.ao = this.aw.minX() * -1335619264;
         this.ax = this.aw.minY() * 683814720;
         this.ai = (this.aw.maxX() - this.aw.minX() + 1) * -1863614400;
         this.ag = (this.aw.maxY() - this.aw.minY() + 1) * -935980224;
         int var9 = this.aw.maxX() - this.aw.minX() + 1;
         int var10 = this.aw.maxY() - this.aw.minY() + 1;
         System.nanoTime();
         System.nanoTime();
         Friend.aw_renamed();
         this.ab = new WorldMapRegion[var9][var10];
         Iterator var11 = this.aw.ax.iterator();

         while(var11.hasNext()) {
            jm var12 = (jm)var11.next();
            int var13 = var12.aq * -1159667627;
            int var14 = var12.al * -1674687277;
            int var15 = var13 - this.aw.minX();
            int var16 = var14 - this.aw.minY();
            this.ab[var15][var16] = new WorldMapRegion(var13, var14, this.aw.ao(), this.ay);
            this.ab[var15][var16].au(var12, this.aw.ag);
         }

         for(int var18 = 0; var18 < var9; ++var18) {
            for(int var20 = 0; var20 < var10; ++var20) {
               if (this.ab[var18][var20] == null) {
                  this.ab[var18][var20] = new WorldMapRegion(this.aw.minX() + var18, this.aw.minY() + var20, this.aw.ao(), this.ay);
                  this.ab[var18][var20].ab(this.aw.ai, this.aw.ag);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.cv(WorldMapCacheName.aw.ab, var2)) {
            byte[] var19 = var1.takeFileByNames(WorldMapCacheName.aw.ab, var2);
            this.ac = Strings.af_renamed(var19);
         }

         System.nanoTime();
         var1.cf();
         var1.cg();
         this.af = true;
      }
   }

   public final void an() {
      this.au = null;
   }

   public final void aw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var10 = Rasterizer2D.ad;
      int var11 = Rasterizer2D.ae;
      int var12 = Rasterizer2D.ap;
      float[] var13 = Rasterizer2D.by;
      int[] var14 = new int[4];
      Rasterizer2D.Rasterizer2D_getClipArray(var14);
      ju var15 = this.aq(var1, var2, var3, var4);
      float var16 = this.ay(var7 - var5, var3 - var1);
      int var17 = (int)Math.ceil((double)var16);
      this.ah = var17 * 1717142051;
      if (!this.aq.containsKey(var17)) {
         kj var18 = new kj(var17);
         var18.ac();
         this.aq.put(var17, var18);
      }

      int var25 = var15.af * -1083493055 + -1346472301 * var15.aw - 1;
      int var19 = 844386227 * var15.ac + 856820921 * var15.an - 1;

      int var20;
      int var21;
      for(var20 = var15.aw * -1346472301; var20 <= var25; ++var20) {
         for(var21 = 844386227 * var15.ac; var21 <= var19; ++var21) {
            this.ab[var20][var21].ax(var17, (kj)this.aq.get(var17), this.al, this.at, this.aa);
         }
      }

      an.ay_renamed(var10, var11, var12, var13);
      Rasterizer2D.Rasterizer2D_setClipArray(var14);
      var20 = (int)(64.0F * var16);
      var21 = 1525088909 * this.ao + var1;
      int var22 = this.ax * -151833963 + var2;

      for(int var23 = var15.aw * -1346472301; var23 < -1346472301 * var15.aw + var15.af * -1083493055; ++var23) {
         for(int var24 = var15.ac * 844386227; var24 < var15.an * 856820921 + 844386227 * var15.ac; ++var24) {
            this.ab[var23][var24].ac(var5 + (1598848320 * this.ab[var23][var24].ab - var21) * var20 / 64, var8 - (64 + (-1342988608 * this.ab[var23][var24].aq - var22)) * var20 / 64, var20);
         }
      }

   }

   public final void ac(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      ju var15 = this.aq(var1, var2, var3, var4);
      float var16 = this.ay(var7 - var5, var3 - var1);
      int var17 = (int)(var16 * 64.0F);
      int var18 = var1 + this.ao * 1525088909;
      int var19 = var2 + -151833963 * this.ax;

      int var20;
      int var21;
      for(var20 = -1346472301 * var15.aw; var20 < -1083493055 * var15.af + var15.aw * -1346472301; ++var20) {
         for(var21 = 844386227 * var15.ac; var21 < var15.ac * 844386227 + var15.an * 856820921; ++var21) {
            if (var13) {
               this.ab[var20][var21].at();
            }

            this.ab[var20][var21].ai(var5 + (1598848320 * this.ab[var20][var21].ab - var18) * var17 / 64, var8 - (-1342988608 * this.ab[var20][var21].aq - var19 + 64) * var17 / 64, var17, var9);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var20 = -1346472301 * var15.aw; var20 < -1346472301 * var15.aw + -1083493055 * var15.af; ++var20) {
            for(var21 = var15.ac * 844386227; var21 < var15.an * 856820921 + 844386227 * var15.ac; ++var21) {
               this.ab[var20][var21].ag(var10, var11, var12);
            }
         }
      }

   }

   public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.ac) {
         this.ac.ag(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.au == null) {
               this.aa();
            }

            Iterator var9 = var5.iterator();

            while(true) {
               List var11;
               do {
                  if (!var9.hasNext()) {
                     return;
                  }

                  int var10 = (Integer)var9.next();
                  var11 = (List)this.au.get(var10);
               } while(null == var11);

               Iterator var12 = var11.iterator();

               while(var12.hasNext()) {
                  AbstractWorldMapIcon var13 = (AbstractWorldMapIcon)var12.next();
                  int var14 = (-96298701 * var13.aq.an - this.ao * 1525088909) * var3 / (335565313 * this.ai);
                  int var15 = var4 - var4 * (var13.aq.aw * -2105445199 - this.ax * -151833963) / (2138972293 * this.ag);
                  Rasterizer2D.ed_renamed(var14 + var1, var15 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   public List ab(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var12 = new LinkedList();
      if (!this.af) {
         return var12;
      } else {
         ju var13 = this.aq(var1, var2, var3, var4);
         float var14 = this.ay(var7, var3 - var1);
         int var15 = (int)(var14 * 64.0F);
         int var16 = var1 + 1525088909 * this.ao;
         int var17 = var2 + -151833963 * this.ax;

         for(int var18 = -1346472301 * var13.aw; var18 < -1083493055 * var13.af + -1346472301 * var13.aw; ++var18) {
            for(int var19 = var13.ac * 844386227; var19 < 856820921 * var13.an + var13.ac * 844386227; ++var19) {
               List var20 = this.ab[var18][var19].bm(var15 * (1598848320 * this.ab[var18][var19].ab - var16) / 64 + var5, var8 + var6 - (-1342988608 * this.ab[var18][var19].aq - var17 + 64) * var15 / 64, var15, var9, var10);
               if (!var20.isEmpty()) {
                  var12.addAll(var20);
               }
            }
         }

         return var12;
      }
   }

   ju aq(int var1, int var2, int var3, int var4) {
      ju var6 = new ju(this);
      int var7 = var1 + this.ao * 1525088909;
      int var8 = var2 + this.ax * -151833963;
      int var9 = this.ao * 1525088909 + var3;
      int var10 = this.ax * -151833963 + var4;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      int var14 = var10 / 64;
      var6.af = (var13 - var11 + 1) * 1584683713;
      var6.an = 227686793 * (var14 - var12 + 1);
      var6.aw = (var11 - this.aw.minX()) * 507320219;
      var6.ac = (var12 - this.aw.minY()) * -1727465605;
      if (var6.aw * -1346472301 < 0) {
         var6.af += 685970131 * var6.aw;
         var6.aw = 0;
      }

      if (var6.aw * -1346472301 > this.ab.length - -1083493055 * var6.af) {
         var6.af = 1584683713 * (this.ab.length - var6.aw * -1346472301);
      }

      if (var6.ac * 844386227 < 0) {
         var6.an += 1072923083 * var6.ac;
         var6.ac = 0;
      }

      if (var6.ac * 844386227 > this.ab[0].length - var6.an * 856820921) {
         var6.an = 227686793 * (this.ab[0].length - 844386227 * var6.ac);
      }

      var6.af = Math.min(-1083493055 * var6.af, this.ab.length) * 1584683713;
      var6.an = Math.min(var6.an * 856820921, this.ab[0].length) * 227686793;
      return var6;
   }

   public boolean isLoaded() {
      return this.af;
   }

   public HashMap buildIcons() {
      this.aa();
      return this.au;
   }

   void aa() {
      if (this.au == null) {
         this.au = new HashMap();
      }

      this.au.clear();

      for(int var2 = 0; var2 < this.ab.length; ++var2) {
         for(int var3 = 0; var3 < this.ab[var2].length; ++var3) {
            List var4 = this.ab[var2][var3].icons();
            Iterator var5 = var4.iterator();

            while(var5.hasNext()) {
               AbstractWorldMapIcon var6 = (AbstractWorldMapIcon)var5.next();
               if (var6.as()) {
                  int var7 = var6.element();
                  if (!this.au.containsKey(var7)) {
                     LinkedList var8 = new LinkedList();
                     var8.add(var6);
                     this.au.put(var7, var8);
                  } else {
                     List var9 = (List)this.au.get(var7);
                     var9.add(var6);
                  }
               }
            }
         }
      }

   }

   float ay(int var1, int var2) {
      float var4 = (float)var1 / (float)var2;
      if (var4 > 8.0F) {
         return 8.0F;
      } else if (var4 < 1.0F) {
         return 1.0F;
      } else {
         int var5 = Math.round(var4);
         return Math.abs((float)var5 - var4) < 0.05F ? (float)var5 : var4;
      }
   }
}
