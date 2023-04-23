import java.util.HashMap;
import java.util.Map;

public class SeqType extends DualNode {
   public static EvictingDualNodeHashTable aa = new EvictingDualNodeHashTable(100);
   public static EvictingDualNodeHashTable SeqType_cached = new EvictingDualNodeHashTable(64);
   public static EvictingDualNodeHashTable at = new EvictingDualNodeHashTable(100);
   static boolean af = false;
   static AbstractArchive ab;
   static AbstractArchive aq;
   static AbstractArchive SeqType_archive;
   boolean[] aj;
   int lefthand = 0;
   int ax = 0;
   int[] frameIds2;
   int[] as;
   public boolean ak = false;
   public boolean by = false;
   public int ad = -766640841;
   public int ae = -960826081;
   public int righthand = -332517881;
   public int ap = 2043481909;
   public int frameCount = -526927311;
   public int az = -2088242069;
   public int bb = -738419331;
   public int be = -950238702;
   public int bi = 2012018311;
   public int[] frameIds;
   public int[] ar;
   public int[] frameLengths;
   public Map ao;

   static int bs_renamed(byte[] var0, int var1, int var2) {
      int var4 = -1;

      for(int var5 = var1; var5 < var2; ++var5) {
         var4 = var4 >>> 8 ^ Packet.aa[(var4 ^ var0[var5]) & 255];
      }

      var4 = ~var4;
      return var4;
   }

   SeqType() {
   }

   void decode(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (var3 == 0) {
            return;
         }

         this.decode0(var1, var3);
      }
   }

   void decode0(Packet var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.cl();
         this.frameLengths = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.frameLengths[var5] = var1.cl();
         }

         this.frameIds = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.frameIds[var5] = var1.cl();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.frameIds[var5] += var1.cl() << 16;
         }
      } else if (2 == var2) {
         this.righthand = var1.cl() * 332517881;
      } else if (var2 == 3) {
         var4 = var1.g1();
         this.as = new int[1 + var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.as[var5] = var1.g1();
         }

         this.as[var4] = 9999999;
      } else if (var2 == 4) {
         this.ak = true;
      } else if (5 == var2) {
         this.az = var1.g1() * -1276641873;
      } else if (6 == var2) {
         this.ad = var1.cl() * 766640841;
      } else if (var2 == 7) {
         this.ae = var1.cl() * 960826081;
      } else if (var2 == 8) {
         this.ap = var1.g1() * -413193849;
         this.by = true;
      } else if (var2 == 9) {
         this.bb = var1.g1() * 738419331;
      } else if (10 == var2) {
         this.bi = var1.g1() * -2012018311;
      } else if (var2 == 11) {
         this.be = var1.g1() * 1672364297;
      } else if (var2 == 12) {
         var4 = var1.g1();
         this.frameIds2 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.frameIds2[var5] = var1.cl();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.frameIds2[var5] += var1.cl() << 16;
         }
      } else if (var2 == 13) {
         var4 = var1.g1();
         this.ar = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.ar[var5] = var1.cr();
         }
      } else if (14 == var2) {
         this.frameCount = var1.g4s() * 526927311;
      } else if (var2 == 15) {
         var4 = var1.cl();
         this.ao = new HashMap();

         for(var5 = 0; var5 < var4; ++var5) {
            int var6 = var1.cl();
            int var7 = var1.cr();
            this.ao.put(var6, var7);
         }
      } else if (var2 == 16) {
         this.ax = var1.cl() * 732547785;
         this.lefthand = var1.cl() * -1631071449;
      } else if (var2 == 17) {
         this.aj = new boolean[256];

         for(var4 = 0; var4 < this.aj.length; ++var4) {
            this.aj[var4] = false;
         }

         var4 = var1.g1();

         for(var5 = 0; var5 < var4; ++var5) {
            this.aj[var1.g1()] = true;
         }
      }

   }

   void postDecode() {
      if (1069382699 * this.bb == -1) {
         if (null == this.as && null == this.aj) {
            this.bb = 0;
         } else {
            this.bb = 1476838662;
         }
      }

      if (-1 == this.bi * 1957040329) {
         if (null == this.as && this.aj == null) {
            this.bi = 0;
         } else {
            this.bi = 270930674;
         }
      }

   }

   public Model ab(Model var1, int var2) {
      Model var5;
      if (!this.ao()) {
         var2 = this.frameIds[var2];
         AnimFrameset var7 = kb.getAnimFrameset(var2 >> 16);
         var2 &= 65535;
         if (null == var7) {
            return var1.toSharedSequenceModel(true);
         } else {
            var5 = var1.toSharedSequenceModel(!var7.hasAlphaTransform(var2));
            var5.animate(var7, var2);
            return var5;
         }
      } else {
         fh var4 = Obj.av_renamed(this.frameCount * 1238147375);
         if (null == var4) {
            return var1.toSharedSequenceModel(true);
         } else {
            var5 = var1.toSharedSequenceModel(!var4.au());
            var5.am(var4, var2);
            return var5;
         }
      }
   }

   Model animateObject(Model var1, int var2, int var3) {
      Model var6;
      if (!this.ao()) {
         var2 = this.frameIds[var2];
         AnimFrameset var9 = kb.getAnimFrameset(var2 >> 16);
         var2 &= 65535;
         if (var9 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            var6 = var1.toSharedSequenceModel(!var9.hasAlphaTransform(var2));
            var3 &= 3;
            if (var3 == 1) {
               var6.rotateY270Ccw();
            } else if (var3 == 2) {
               var6.rotateY180();
            } else if (var3 == 3) {
               var6.rotateY90Ccw();
            }

            var6.animate(var9, var2);
            if (var3 == 1) {
               var6.rotateY90Ccw();
            } else if (var3 == 2) {
               var6.rotateY180();
            } else if (var3 == 3) {
               var6.rotateY270Ccw();
            }

            return var6;
         }
      } else {
         fh var5 = Obj.av_renamed(1238147375 * this.frameCount);
         if (null == var5) {
            return var1.toSharedSequenceModel(true);
         } else {
            var6 = var1.toSharedSequenceModel(!var5.au());
            var3 &= 3;
            if (var3 == 1) {
               var6.rotateY270Ccw();
            } else if (var3 == 2) {
               var6.rotateY180();
            } else if (var3 == 3) {
               var6.rotateY90Ccw();
            }

            var6.am(var5, var2);
            if (1 == var3) {
               var6.rotateY90Ccw();
            } else if (var3 == 2) {
               var6.rotateY180();
            } else if (3 == var3) {
               var6.rotateY270Ccw();
            }

            return var6;
         }
      }
   }

   Model al(Model var1, int var2) {
      Model var5;
      if (!this.ao()) {
         var2 = this.frameIds[var2];
         AnimFrameset var7 = kb.getAnimFrameset(var2 >> 16);
         var2 &= 65535;
         if (var7 == null) {
            return var1.ay(true);
         } else {
            var5 = var1.ay(!var7.hasAlphaTransform(var2));
            var5.animate(var7, var2);
            return var5;
         }
      } else {
         fh var4 = Obj.av_renamed(1238147375 * this.frameCount);
         if (var4 == null) {
            return var1.ay(true);
         } else {
            var5 = var1.ay(!var4.au());
            var5.am(var4, var2);
            return var5;
         }
      }
   }

   public Model at(Model var1, int var2, SeqType var3, int var4) {
      if (af && !this.ao() && !var3.ao()) {
         return this.aa(var1, var2, var3, var4);
      } else {
         Model var6 = var1.toSharedSequenceModel(false);
         boolean var7 = false;
         AnimFrameset var8 = null;
         AnimBase var9 = null;
         fh var10;
         if (this.ao()) {
            var10 = this.ah();
            if (null == var10) {
               return var6;
            }

            if (var3.ao() && this.aj == null) {
               var6.am(var10, var2);
               return var6;
            }

            var9 = var10.ac;
            var6.az(var9, var10, var2, this.aj, false, !var3.ao());
         } else {
            var2 = this.frameIds[var2];
            var8 = kb.getAnimFrameset(var2 >> 16);
            var2 &= 65535;
            if (var8 == null) {
               return var3.ab(var1, var4);
            }

            if (!var3.ao() && (this.as == null || -1 == var4)) {
               var6.animate(var8, var2);
               return var6;
            }

            if (this.as == null || var4 == -1) {
               var6.animate(var8, var2);
               return var6;
            }

            var7 = var3.ao();
            if (!var7) {
               var6.ad(var8, var2, this.as, false);
            }
         }

         if (var3.ao()) {
            var10 = var3.ah();
            if (var10 == null) {
               return var6;
            }

            if (var9 == null) {
               var9 = var10.ac;
            }

            var6.az(var9, var10, var4, this.aj, true, true);
         } else {
            var4 = var3.frameIds[var4];
            AnimFrameset var13 = kb.getAnimFrameset(var4 >> 16);
            var4 &= 65535;
            if (var13 == null) {
               return this.ab(var1, var2);
            }

            var6.ad(var13, var4, this.as, true);
         }

         if (var7 && var8 != null) {
            var6.ad(var8, var2, this.as, false);
         }

         var6.resetBounds();
         return var6;
      }
   }

   Model aa(Model var1, int var2, SeqType var3, int var4) {
      var2 = this.frameIds[var2];
      AnimFrameset var6 = kb.getAnimFrameset(var2 >> 16);
      var2 &= 65535;
      if (null == var6) {
         return var3.ab(var1, var4);
      } else {
         var4 = var3.frameIds[var4];
         AnimFrameset var7 = kb.getAnimFrameset(var4 >> 16);
         var4 &= 65535;
         Model var8;
         if (null == var7) {
            var8 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2));
            var8.animate(var6, var2);
            return var8;
         } else {
            var8 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2) & !var7.hasAlphaTransform(var4));
            var8.animate2(var6, var2, var7, var4, this.as);
            return var8;
         }
      }
   }

   public Model animateComponent(Model var1, int var2) {
      if (!this.ao()) {
         int var4 = this.frameIds[var2];
         AnimFrameset var5 = kb.getAnimFrameset(var4 >> 16);
         var4 &= 65535;
         if (var5 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            AnimFrameset var6 = null;
            int var7 = 0;
            if (this.frameIds2 != null && var2 < this.frameIds2.length) {
               var7 = this.frameIds2[var2];
               var6 = kb.getAnimFrameset(var7 >> 16);
               var7 &= 65535;
            }

            Model var8;
            if (null != var6 && 65535 != var7) {
               var8 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var4) & !var6.hasAlphaTransform(var7));
               var8.animate(var5, var4);
               var8.animate(var6, var7);
               return var8;
            } else {
               var8 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var4));
               var8.animate(var5, var4);
               return var8;
            }
         }
      } else {
         return this.ab(var1, var2);
      }
   }

   public boolean ao() {
      return this.frameCount * 1238147375 >= 0;
   }

   public int ax() {
      return this.lefthand * 1833069719 - -968724615 * this.ax;
   }

   fh ah() {
      return this.ao() ? Obj.av_renamed(1238147375 * this.frameCount) : null;
   }

   static final void lc_renamed(int var0, int var1, int var2, boolean var3) {
      if (SoundSystem.loadInterface(var0)) {
         fp.ld_renamed(hn.interfaceComponents[var0], -1, var1, var2, var3);
      }
   }
}
