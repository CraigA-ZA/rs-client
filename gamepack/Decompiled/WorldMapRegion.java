import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WorldMapRegion {
   public static DemotingHashTable au = new DemotingHashTable(37748736, 256);
   int aa;
   int ab;
   int aq;
   int ay;
   HashMap ax;
   LinkedList at;
   List ao;
   jm al;
   final HashMap ai;

   WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
      this.ab = var1 * 970404445;
      this.aq = var2 * 125165747;
      this.at = new LinkedList();
      this.ao = new LinkedList();
      this.ax = new HashMap();
      this.aa = (var3 | -16777216) * 241012907;
      this.ai = var4;
   }

   void ac(int var1, int var2, int var3) {
      Rasterizer3D var5 = gz.an_renamed(-2122501643 * this.ab, 1858063995 * this.aq, this.ay * -1897887643);
      if (var5 != null) {
         if (this.ay * -1205724864 == var3) {
            var5.ay(var1, var2);
         } else {
            var5.bz(var1, var2, var3, var3);
         }

      }
   }

   static void au_renamed(int var0) {
      Inventory var2 = (Inventory)Inventory.af.get((long)var0);
      if (var2 != null) {
         for(int var3 = 0; var3 < var2.an.length; ++var3) {
            var2.an[var3] = -1;
            var2.aw[var3] = 0;
         }

      }
   }

   void au(jm var1, List var2) {
      this.ax.clear();
      this.al = var1;
      this.aa(var2);
   }

   void ab(HashSet var1, List var2) {
      this.ax.clear();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         jh var5 = (jh)var4.next();
         if (var5.bk() == this.ab * -2122501643 && var5.bx() == 1858063995 * this.aq) {
            this.at.add(var5);
         }
      }

      this.aa(var2);
   }

   void aq(int var1, int var2, int var3, int var4, jz var5) {
      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         label86:
         for(int var8 = var2; var8 < var4 + var2; ++var8) {
            for(int var9 = 0; var9 < var5.aa * 1632558421; ++var9) {
               jl[] var10 = var5.av[var9][var7][var8];
               if (null != var10 && 0 != var10.length) {
                  jl[] var11 = var10;

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     hq var14;
                     boolean var15;
                     label77: {
                        jl var13 = var11[var12];
                        var14 = fw.an_renamed(var13.af * 2080162465);
                        if (null != var14.bu) {
                           int[] var16 = var14.bu;

                           for(int var17 = 0; var17 < var16.length; ++var17) {
                              int var18 = var16[var17];
                              hq var19 = fw.an_renamed(var18);
                              if (1270945427 * var19.be != -1) {
                                 var15 = true;
                                 break label77;
                              }
                           }
                        } else if (1270945427 * var14.be != -1) {
                           var15 = true;
                           break label77;
                        }

                        var15 = false;
                     }

                     if (var15) {
                        this.al(var14, var9, var7, var8, var5);
                        continue label86;
                     }
                  }
               }
            }
         }
      }

   }

   void al(hq var1, int var2, int var3, int var4, jz var5) {
      Coord var7 = new Coord(var2, this.ab * 1598848320 + var3, -1342988608 * this.aq + var4);
      Coord var8 = null;
      if (null != this.al) {
         var8 = new Coord(this.al.at * 1615088237 + var2, var3 + this.al.au * 518961216, 763222976 * this.al.ab + var4);
      } else {
         jh var9 = (jh)var5;
         var8 = new Coord(var2 + var9.at * 1615088237, var3 + 518961216 * var9.au + var9.aw() * 8, var9.ab * 763222976 + var4 + var9.al() * 8);
      }

      MapElementType var10;
      Object var11;
      if (var1.bu != null) {
         var11 = new WorldMapIcon2(var8, var7, -1529817365 * var1.at, this);
      } else {
         var10 = nf.getMapElementType(1270945427 * var1.be);
         var11 = new WorldMapIcon1(var8, var7, var10.au * 219774827, this.bz(var10));
      }

      var10 = nf.getMapElementType(((AbstractWorldMapIcon)var11).element());
      if (var10.ao) {
         this.ax.put(new Coord(0, var3, var4), var11);
      }

   }

   void at() {
      Iterator var2 = this.ax.values().iterator();

      while(var2.hasNext()) {
         AbstractWorldMapIcon var3 = (AbstractWorldMapIcon)var2.next();
         if (var3 instanceof WorldMapIcon2) {
            ((WorldMapIcon2)var3).af();
         }
      }

   }

   void aa(List var1) {
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         WorldMapIcon1 var4 = (WorldMapIcon1)var3.next();
         if (nf.getMapElementType(1767565411 * var4.af).ao && var4.aq.an * -96298701 >> 6 == this.ab * -2122501643 && this.aq * 1858063995 == -2105445199 * var4.aq.aw >> 6) {
            WorldMapIcon1 var5 = new WorldMapIcon1(var4.aq, var4.aq, var4.af * 1767565411, this.bo(var4.af * 1767565411));
            this.ao.add(var5);
         }
      }

   }

   void ay() {
      if (this.al != null) {
         this.al.by();
      } else {
         Iterator var2 = this.at.iterator();

         while(var2.hasNext()) {
            jh var3 = (jh)var2.next();
            var3.by();
         }
      }

   }

   boolean ao(AbstractArchive var1) {
      this.ax.clear();
      if (null != this.al) {
         this.al.ap(var1);
         if (this.al.ae()) {
            this.aq(0, 0, 64, 64, this.al);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var3 = true;

         Iterator var4;
         jh var5;
         for(var4 = this.at.iterator(); var4.hasNext(); var3 &= var5.ae()) {
            var5 = (jh)var4.next();
            var5.ap(var1);
         }

         if (var3) {
            var4 = this.at.iterator();

            while(var4.hasNext()) {
               var5 = (jh)var4.next();
               this.aq(var5.at() * 8, var5.aa() * 8, 8, 8, var5);
            }
         }

         return var3;
      }
   }

   void ax(int var1, kj var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
      this.ay = -467998355 * var1;
      if (this.al != null || !this.at.isEmpty()) {
         if (gz.an_renamed(this.ab * -2122501643, 1858063995 * this.aq, var1) == null) {
            boolean var7 = true;
            var7 &= this.ao(var4);
            int var9;
            if (null != this.al) {
               var9 = 1716482187 * this.al.ay;
            } else {
               var9 = ((jz)this.at.getFirst()).ay * 1716482187;
            }

            var7 &= var5.tryLoadGroup(var9);
            if (var7) {
               byte[] var8 = var5.takeFileFlat(var9);
               kc var10;
               if (null == var8) {
                  var10 = new kc();
               } else {
                  var10 = new kc(Strings.af_renamed(var8).af);
               }

               Rasterizer3D var12 = new Rasterizer3D(-1205724864 * this.ay, -1205724864 * this.ay);
               var12.clearAll();
               if (this.al != null) {
                  this.ah(var2, var3, var10);
               } else {
                  this.av(var2, var3, var10);
               }

               int var13 = -2122501643 * this.ab;
               int var14 = this.aq * 1858063995;
               int var15 = -1897887643 * this.ay;
               au.put(var12, er.af_renamed(var13, var14, var15), var12.af.length * 4);
               this.ay();
            }
         }
      }
   }

   void ai(int var1, int var2, int var3, HashSet var4) {
      if (null == var4) {
         var4 = new HashSet();
      }

      this.ad(var1, var2, var4, var3);
      this.be(var1, var2, var4, var3);
   }

   void ag(HashSet var1, int var2, int var3) {
      Iterator var5 = this.ax.values().iterator();

      while(var5.hasNext()) {
         AbstractWorldMapIcon var6 = (AbstractWorldMapIcon)var5.next();
         if (var6.as()) {
            int var7 = var6.element();
            if (var1.contains(var7)) {
               MapElementType var8 = nf.getMapElementType(var7);
               this.ap(var8, var6.at * -216598991, var6.aa * -1288412757, var2, var3);
            }
         }
      }

      this.ae(var1, var2, var3);
   }

   void ah(kj var1, IndexedSprite[] var2, kc var3) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.am(var5, var6, this.al, var1, var3);
            this.as(var5, var6, this.al, var1);
         }
      }

      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.ar(var5, var6, this.al, var1, var2);
         }
      }

   }

   void av(kj var1, IndexedSprite[] var2, kc var3) {
      Iterator var5 = this.at.iterator();

      jh var6;
      int var7;
      int var8;
      while(var5.hasNext()) {
         var6 = (jh)var5.next();

         for(var7 = var6.at() * 8; var7 < var6.at() * 8 + 8; ++var7) {
            for(var8 = var6.aa() * 8; var8 < var6.aa() * 8 + 8; ++var8) {
               this.am(var7, var8, var6, var1, var3);
               this.as(var7, var8, var6, var1);
            }
         }
      }

      var5 = this.at.iterator();

      while(var5.hasNext()) {
         var6 = (jh)var5.next();

         for(var7 = var6.at() * 8; var7 < var6.at() * 8 + 8; ++var7) {
            for(var8 = var6.aa() * 8; var8 < var6.aa() * 8 + 8; ++var8) {
               this.ar(var7, var8, var6, var1, var2);
            }
         }
      }

   }

   void ar(int var1, int var2, jz var3, kj var4, IndexedSprite[] var5) {
      this.az(var1, var2, var3);
      this.ak(var1, var2, var3, var5);
   }

   void am(int var1, int var2, jz var3, kj var4, kc var5) {
      int var7 = var3.ax[0][var1][var2] - 1;
      int var8 = var3.ai[0][var1][var2] - 1;
      if (var7 == -1 && var8 == -1) {
         Rasterizer2D.Rasterizer2D_fillRectangle(-1897887643 * this.ay * var1, (63 - var2) * this.ay * -1897887643, -1897887643 * this.ay, this.ay * -1897887643, this.aa * 973203971);
      }

      int var9 = 16711935;
      int var10;
      if (var8 != -1) {
         int var11 = 973203971 * this.aa;
         FloorOverlayType var13 = (FloorOverlayType)FloorOverlayType.an.get((long)var8);
         FloorOverlayType var12;
         if (var13 != null) {
            var12 = var13;
         } else {
            byte[] var14 = FloorOverlayType.af.takeFile(4, var8);
            var13 = new FloorOverlayType();
            if (null != var14) {
               var13.decode(new Packet(var14), var8);
            }

            var13.reset();
            FloorOverlayType.an.put(var13, (long)var8);
            var12 = var13;
         }

         if (var12 == null) {
            var10 = var11;
         } else {
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (-2085280195 * var12.ab >= 0) {
               var15 = -187777599 * var12.aa;
               var16 = var12.ay * 1797179473;
               var17 = -1379609783 * var12.ao;
               if (var17 > 179) {
                  var16 /= 2;
               }

               if (var17 > 192) {
                  var16 /= 2;
               }

               if (var17 > 217) {
                  var16 /= 2;
               }

               if (var17 > 243) {
                  var16 /= 2;
               }

               var18 = (var16 / 32 << 7) + (var15 / 4 << 10) + var17 / 2;
               var19 = dd.af_renamed(var18, 96);
               var10 = in.af[var19] | -16777216;
            } else if (-202963991 * var12.ac >= 0) {
               int var20 = dd.af_renamed(in.ab.aq.ac(var12.ac * -202963991), 96);
               var10 = in.af[var20] | -16777216;
            } else if (var12.aw * 1889574527 == 16711935) {
               var10 = var11;
            } else {
               var15 = var12.aq * 174415927;
               var16 = 470803713 * var12.al;
               var17 = 532980473 * var12.at;
               if (var17 > 179) {
                  var16 /= 2;
               }

               if (var17 > 192) {
                  var16 /= 2;
               }

               if (var17 > 217) {
                  var16 /= 2;
               }

               if (var17 > 243) {
                  var16 /= 2;
               }

               var18 = (var15 / 4 << 10) + (var16 / 32 << 7) + var17 / 2;
               var19 = dd.af_renamed(var18, 96);
               var10 = in.af[var19] | -16777216;
            }
         }

         var9 = var10;
      }

      if (var8 > -1 && 0 == var3.ag[0][var1][var2]) {
         Rasterizer2D.Rasterizer2D_fillRectangle(-1897887643 * this.ay * var1, this.ay * -1897887643 * (63 - var2), -1897887643 * this.ay, this.ay * -1897887643, var9);
      } else {
         var10 = this.aj(var1, var2, var3, var5);
         if (var8 == -1) {
            Rasterizer2D.Rasterizer2D_fillRectangle(var1 * -1897887643 * this.ay, (63 - var2) * -1897887643 * this.ay, this.ay * -1897887643, -1897887643 * this.ay, var10);
         } else {
            var4.af(var1 * -1897887643 * this.ay, this.ay * -1897887643 * (63 - var2), var10, var9, this.ay * -1897887643, this.ay * -1897887643, var3.ag[0][var1][var2], var3.ah[0][var1][var2]);
         }
      }
   }

   void as(int var1, int var2, jz var3, kj var4) {
      for(int var6 = 1; var6 < var3.aa * 1632558421; ++var6) {
         int var7 = var3.ai[var6][var1][var2] - 1;
         if (var7 > -1) {
            int var9 = 973203971 * this.aa;
            FloorOverlayType var11 = (FloorOverlayType)FloorOverlayType.an.get((long)var7);
            FloorOverlayType var10;
            if (var11 != null) {
               var10 = var11;
            } else {
               byte[] var12 = FloorOverlayType.af.takeFile(4, var7);
               var11 = new FloorOverlayType();
               if (null != var12) {
                  var11.decode(new Packet(var12), var7);
               }

               var11.reset();
               FloorOverlayType.an.put(var11, (long)var7);
               var10 = var11;
            }

            int var8;
            if (var10 == null) {
               var8 = var9;
            } else {
               int var13;
               int var14;
               int var15;
               int var16;
               int var17;
               if (var10.ab * -2085280195 >= 0) {
                  var13 = var10.aa * -187777599;
                  var14 = var10.ay * 1797179473;
                  var15 = -1379609783 * var10.ao;
                  if (var15 > 179) {
                     var14 /= 2;
                  }

                  if (var15 > 192) {
                     var14 /= 2;
                  }

                  if (var15 > 217) {
                     var14 /= 2;
                  }

                  if (var15 > 243) {
                     var14 /= 2;
                  }

                  var16 = var15 / 2 + (var13 / 4 << 10) + (var14 / 32 << 7);
                  var17 = dd.af_renamed(var16, 96);
                  var8 = in.af[var17] | -16777216;
               } else if (var10.ac * -202963991 >= 0) {
                  int var18 = dd.af_renamed(in.ab.aq.ac(var10.ac * -202963991), 96);
                  var8 = in.af[var18] | -16777216;
               } else if (1889574527 * var10.aw == 16711935) {
                  var8 = var9;
               } else {
                  var13 = var10.aq * 174415927;
                  var14 = 470803713 * var10.al;
                  var15 = var10.at * 532980473;
                  if (var15 > 179) {
                     var14 /= 2;
                  }

                  if (var15 > 192) {
                     var14 /= 2;
                  }

                  if (var15 > 217) {
                     var14 /= 2;
                  }

                  if (var15 > 243) {
                     var14 /= 2;
                  }

                  var16 = var15 / 2 + (var13 / 4 << 10) + (var14 / 32 << 7);
                  var17 = dd.af_renamed(var16, 96);
                  var8 = in.af[var17] | -16777216;
               }
            }

            if (var3.ag[var6][var1][var2] == 0) {
               Rasterizer2D.Rasterizer2D_fillRectangle(var1 * -1897887643 * this.ay, (63 - var2) * -1897887643 * this.ay, this.ay * -1897887643, -1897887643 * this.ay, var8);
            } else {
               var4.af(var1 * -1897887643 * this.ay, (63 - var2) * this.ay * -1897887643, 0, var8, this.ay * -1897887643, this.ay * -1897887643, var3.ag[var6][var1][var2], var3.ah[var6][var1][var2]);
            }
         }
      }

   }

   int aj(int var1, int var2, jz var3, kc var4) {
      return 0 == var3.ax[0][var1][var2] ? this.aa * 973203971 : var4.af(var1, var2);
   }

   void ak(int var1, int var2, jz var3, IndexedSprite[] var4) {
      for(int var6 = 0; var6 < 1632558421 * var3.aa; ++var6) {
         jl[] var7 = var3.av[var6][var1][var2];
         if (null != var7 && var7.length != 0) {
            jl[] var8 = var7;

            for(int var9 = 0; var9 < var8.length; ++var9) {
               jl var10 = var8[var9];
               if (!ObjStack.au_renamed(var10.an * 1504481025)) {
                  int var12 = var10.an * 1504481025;
                  boolean var11 = -1344801027 * mc.az.ad == var12;
                  if (!var11) {
                     continue;
                  }
               }

               hq var13 = fw.an_renamed(2080162465 * var10.af);
               if (-1 != 771086195 * var13.bk) {
                  if (771086195 * var13.bk != 46 && var13.bk * 771086195 != 52) {
                     var4[771086195 * var13.bk].au(var1 * -1897887643 * this.ay, this.ay * -1897887643 * (63 - var2), 499192010 * this.ay, 499192010 * this.ay);
                  } else {
                     var4[var13.bk * 771086195].au(var1 * -1897887643 * this.ay, -1897887643 * this.ay * (63 - var2), 499192010 * this.ay + 1, 499192010 * this.ay + 1);
                  }
               }
            }
         }
      }

   }

   void az(int var1, int var2, jz var3) {
      for(int var5 = 0; var5 < var3.aa * 1632558421; ++var5) {
         jl[] var6 = var3.av[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            jl[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               jl var9 = var7[var8];
               int var11 = 1504481025 * var9.an;
               boolean var10 = var11 >= mc.af.ad * -1344801027 && var11 <= mc.ac.ad * -1344801027 || -1344801027 * mc.au.ad == var11;
               if (var10) {
                  hq var12 = fw.an_renamed(2080162465 * var9.af);
                  int var13 = var12.aj * 415653149 != 0 ? -3407872 : -3355444;
                  if (mc.af.ad * -1344801027 == 1504481025 * var9.an) {
                     this.bt(var1, var2, -1419490017 * var9.aw, var13);
                  }

                  if (-1344801027 * mc.aw.ad == 1504481025 * var9.an) {
                     this.bt(var1, var2, var9.aw * -1419490017, -3355444);
                     this.bt(var1, var2, var9.aw * -1419490017 + 1, var13);
                  }

                  if (mc.ac.ad * -1344801027 == 1504481025 * var9.an) {
                     if (var9.aw * -1419490017 == 0) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.ay * -1897887643 * var1, (63 - var2) * -1897887643 * this.ay, 1, var13);
                     }

                     if (1 == -1419490017 * var9.aw) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.ay * -1897887643 * var1 + this.ay * -1897887643 - 1, (63 - var2) * this.ay * -1897887643, 1, var13);
                     }

                     if (2 == var9.aw * -1419490017) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(var1 * this.ay * -1897887643 + -1897887643 * this.ay - 1, (63 - var2) * -1897887643 * this.ay + -1897887643 * this.ay - 1, 1, var13);
                     }

                     if (3 == -1419490017 * var9.aw) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(-1897887643 * this.ay * var1, (63 - var2) * this.ay * -1897887643 + this.ay * -1897887643 - 1, 1, var13);
                     }
                  }

                  if (-1344801027 * mc.au.ad == 1504481025 * var9.an) {
                     int var14 = -1419490017 * var9.aw % 2;
                     int var15;
                     if (var14 == 0) {
                        for(var15 = 0; var15 < this.ay * -1897887643; ++var15) {
                           Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.ay * -1897887643 * var1 + var15, (64 - var2) * -1897887643 * this.ay - 1 - var15, 1, var13);
                        }
                     } else {
                        for(var15 = 0; var15 < -1897887643 * this.ay; ++var15) {
                           Rasterizer2D.Rasterizer2D_drawHorizontalLine(var1 * -1897887643 * this.ay + var15, var15 + -1897887643 * this.ay * (63 - var2), 1, var13);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void ad(int var1, int var2, HashSet var3, int var4) {
      float var6 = (float)var4 / 64.0F;
      float var7 = var6 / 2.0F;
      Iterator var8 = this.ax.entrySet().iterator();

      while(var8.hasNext()) {
         Map.Entry var9 = (Map.Entry)var8.next();
         Coord var10 = (Coord)var9.getKey();
         int var11 = (int)((float)var1 + (float)(var10.an * -96298701) * var6 - var7);
         int var12 = (int)((float)(var2 + var4) - (float)(-2105445199 * var10.aw) * var6 - var7);
         AbstractWorldMapIcon var13 = (AbstractWorldMapIcon)var9.getValue();
         if (null != var13 && var13.as()) {
            var13.at = -1370053935 * var11;
            var13.aa = 1379111171 * var12;
            MapElementType var14 = nf.getMapElementType(var13.element());
            if (!var3.contains(var14.al())) {
               this.by(var13, var11, var12, var6);
            }
         }
      }

   }

   void ae(HashSet var1, int var2, int var3) {
      Iterator var5 = this.ao.iterator();

      while(var5.hasNext()) {
         AbstractWorldMapIcon var6 = (AbstractWorldMapIcon)var5.next();
         if (var6.as()) {
            MapElementType var7 = nf.getMapElementType(var6.element());
            if (var7 != null && var1.contains(var7.al())) {
               this.ap(var7, -216598991 * var6.at, var6.aa * -1288412757, var2, var3);
            }
         }
      }

   }

   void ap(MapElementType var1, int var2, int var3, int var4, int var5) {
      Rasterizer3D var7 = var1.ab(false);
      if (var7 != null) {
         var7.ax(var2 - var7.an / 2, var3 - var7.aw / 2);
         if (var4 % var5 < var5 / 2) {
            Rasterizer2D.ed_renamed(var2, var3, 15, 16776960, 128);
            Rasterizer2D.ed_renamed(var2, var3, 7, 16777215, 256);
         }

      }
   }

   void by(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
      MapElementType var6 = nf.getMapElementType(var1.element());
      this.bb(var6, var2, var3);
      this.bi(var1, var6, var2, var3, var4);
   }

   void bb(MapElementType var1, int var2, int var3) {
      Rasterizer3D var5 = var1.ab(false);
      if (var5 != null) {
         int var6 = this.bk(var5, var1.aj);
         int var7 = this.bx(var5, var1.ak);
         var5.ax(var6 + var2, var7 + var3);
      }

   }

   void bi(AbstractWorldMapIcon var1, MapElementType var2, int var3, int var4, float var5) {
      WorldMapLabel var7 = var1.label();
      if (null != var7) {
         if (var7.ac.af(var5)) {
            Font var8 = (Font)this.ai.get(var7.ac);
            var8.drawLines(var7.af, var3 - var7.an * -31821843 / 2, var4, var7.an * -31821843, -1401615011 * var7.aw, -16777216 | 1080412371 * var2.at, 0, 1, 0, var8.al / 2);
         }
      }
   }

   void be(int var1, int var2, HashSet var3, int var4) {
      float var6 = (float)var4 / 64.0F;
      Iterator var7 = this.ao.iterator();

      while(var7.hasNext()) {
         AbstractWorldMapIcon var8 = (AbstractWorldMapIcon)var7.next();
         if (var8.as()) {
            int var9 = var8.aq.an * -96298701 % 64;
            int var10 = -2105445199 * var8.aq.aw % 64;
            var8.at = (int)(var6 * (float)var9 + (float)var1) * -1370053935;
            var8.aa = (int)((float)(63 - var10) * var6 + (float)var2) * 1379111171;
            if (!var3.contains(var8.element())) {
               this.by(var8, var8.at * -216598991, var8.aa * -1288412757, var6);
            }
         }
      }

   }

   int bk(Rasterizer3D var1, hd var2) {
      switch (var2.ac * 1932346871) {
         case 0:
            return 0;
         case 2:
            return -var1.an / 2;
         default:
            return -var1.an;
      }
   }

   int bx(Rasterizer3D var1, hn var2) {
      switch (var2.ac * 578864459) {
         case 1:
            return -var1.aw / 2;
         case 2:
            return 0;
         default:
            return -var1.aw;
      }
   }

   WorldMapLabel bo(int var1) {
      MapElementType var3 = nf.getMapElementType(var1);
      return this.bz(var3);
   }

   WorldMapLabel bz(MapElementType var1) {
      if (null != var1.al && this.ai != null && this.ai.get(WorldMapLabelSize.af) != null) {
         WorldMapLabelSize var3 = WorldMapLabelSize.an_renamed(952315347 * var1.aa);
         if (null == var3) {
            return null;
         } else {
            Font var4 = (Font)this.ai.get(var3);
            if (var4 == null) {
               return null;
            } else {
               int var5 = var4.lineCount(var1.al, 1000000);
               String[] var6 = new String[var5];
               var4.breakLines(var1.al, (int[])null, var6);
               int var7 = var6.length * var4.al / 2;
               int var8 = 0;
               String[] var9 = var6;

               for(int var10 = 0; var10 < var9.length; ++var10) {
                  String var11 = var9[var10];
                  int var12 = var4.stringWidth(var11);
                  if (var12 > var8) {
                     var8 = var12;
                  }
               }

               return new WorldMapLabel(var1.al, var8, var7, var3);
            }
         }
      } else {
         return null;
      }
   }

   List bm(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var7 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var1 + var3 && var5 < var3 + var2) {
            Iterator var8 = this.ax.values().iterator();

            AbstractWorldMapIcon var9;
            while(var8.hasNext()) {
               var9 = (AbstractWorldMapIcon)var8.next();
               if (var9.as() && var9.am(var4, var5)) {
                  var7.add(var9);
               }
            }

            var8 = this.ao.iterator();

            while(var8.hasNext()) {
               var9 = (AbstractWorldMapIcon)var8.next();
               if (var9.as() && var9.am(var4, var5)) {
                  var7.add(var9);
               }
            }

            return var7;
         } else {
            return var7;
         }
      } else {
         return var7;
      }
   }

   List icons() {
      LinkedList var2 = new LinkedList();
      var2.addAll(this.ao);
      var2.addAll(this.ax.values());
      return var2;
   }

   void bt(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (0 == var3) {
         Rasterizer2D.Rasterizer2D_drawVerticalLine(-1897887643 * this.ay * var1, this.ay * -1897887643 * (63 - var2), this.ay * -1897887643, var4);
      }

      if (1 == var3) {
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.ay * -1897887643 * var1, (63 - var2) * this.ay * -1897887643, -1897887643 * this.ay, var4);
      }

      if (var3 == 2) {
         Rasterizer2D.Rasterizer2D_drawVerticalLine(this.ay * -1897887643 * var1 + this.ay * -1897887643 - 1, this.ay * -1897887643 * (63 - var2), this.ay * -1897887643, var4);
      }

      if (var3 == 3) {
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(var1 * -1897887643 * this.ay, -1897887643 * this.ay + (63 - var2) * this.ay * -1897887643 - 1, -1897887643 * this.ay, var4);
      }

   }
}
