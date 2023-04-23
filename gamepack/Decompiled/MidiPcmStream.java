public class MidiPcmStream extends PcmStream {
   static Component oh;
   boolean bi;
   int an = 673362688;
   int aw = -1778707904;
   int be;
   int bk;
   int[] aa = new int[16];
   int[] ab = new int[16];
   int[] ac = new int[16];
   int[] ad = new int[16];
   int[] ae = new int[16];
   int[] aj = new int[16];
   int[] ak = new int[16];
   int[] al = new int[16];
   int[] ao = new int[16];
   int[] aq = new int[16];
   int[] as = new int[16];
   int[] at = new int[16];
   int[] au = new int[16];
   int[] ay = new int[16];
   int[] az = new int[16];
   MusicPatchPcmStream bz = new MusicPatchPcmStream(this);
   long bo;
   long bx;
   MusicPatchNode[][] ap = new MusicPatchNode[16][128];
   MusicPatchNode[][] by = new MusicPatchNode[16][128];
   MidiFileReader bb = new MidiFileReader();
   NodeHashTable af = new NodeHashTable(128);

   public static void af_renamed(AbstractArchive var0) {
      EnumType.af = var0;
   }

   public MidiPcmStream() {
      this.ap();
   }

   public synchronized void advance(int var1) {
      this.an = 1881678515 * var1;
   }

   public int size() {
      return 1380277371 * this.an;
   }

   public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
      var1.reset();
      boolean var6 = true;
      int[] var7 = null;
      if (var4 > 0) {
         var7 = new int[]{var4};
      }

      for(ByteArrayNode var8 = (ByteArrayNode)var1.af.first(); null != var8; var8 = (ByteArrayNode)var1.af.next()) {
         int var9 = (int)var8.hr;
         MusicPatch var10 = (MusicPatch)this.af.get((long)var9);
         if (null == var10) {
            byte[] var12 = var2.takeFileFlat(var9);
            MusicPatch var11;
            if (var12 == null) {
               var11 = null;
            } else {
               var11 = new MusicPatch(var12);
            }

            var10 = var11;
            if (null == var11) {
               var6 = false;
               continue;
            }

            this.af.put(var11, (long)var9);
         }

         if (!var10.af(var3, var8.af, var7)) {
            var6 = false;
         }
      }

      if (var6) {
         var1.clear();
      }

      return var6;
   }

   public synchronized void clearAll() {
      for(MusicPatch var2 = (MusicPatch)this.af.first(); var2 != null; var2 = (MusicPatch)this.af.next()) {
         var2.clear();
      }

   }

   public synchronized void removeAll() {
      for(MusicPatch var2 = (MusicPatch)this.af.first(); null != var2; var2 = (MusicPatch)this.af.next()) {
         var2.remove();
      }

   }

   public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
      this.ao();
      this.bb.parse(var1.an);
      this.bi = var2;
      this.bx = 0L;
      int var4 = this.bb.trackCount();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.bb.gotoTrack(var5);
         this.bb.readTrackLength(var5);
         this.bb.markTrackPosition(var5);
      }

      this.be = this.bb.getPrioritizedTrack() * 911615763;
      this.bk = this.bb.au[this.be * -2130330853] * -1172591539;
      this.bo = this.bb.ao(this.bk * 2049666181) * -5361838125554816559L;
   }

   public synchronized void ao() {
      this.bb.clear();
      this.ap();
   }

   public synchronized boolean isReady() {
      return this.bb.isReady();
   }

   public synchronized void ai(int var1, int var2) {
      this.ag(var1, var2);
   }

   void ag(int var1, int var2) {
      this.aq[var1] = var2;
      this.at[var1] = var2 & -128;
      this.ah(var1, var2);
   }

   void ah(int var1, int var2) {
      if (var2 != this.al[var1]) {
         this.al[var1] = var2;

         for(int var4 = 0; var4 < 128; ++var4) {
            this.by[var1][var4] = null;
         }
      }

   }

   void av(int var1, int var2, int var3) {
      this.am(var1, var2, 64);
      if (0 != (this.as[var1] & 2)) {
         for(MusicPatchNode var5 = (MusicPatchNode)this.bz.an.first(); var5 != null; var5 = (MusicPatchNode)this.bz.an.next()) {
            if (var1 == var5.af * 1021419297 && var5.ag * -602614853 < 0) {
               this.ap[var1][var5.ab * -630482265] = null;
               this.ap[var1][var2] = var5;
               int var6 = -279706293 * var5.at + (-1077015879 * var5.ay * var5.aa * 274954637 >> 12);
               var5.at += (var2 - var5.ab * -630482265 << 8) * -1343136669;
               var5.aa = (var6 - var5.at * -279706293) * -101879483;
               var5.ay = 230199296;
               var5.ab = var2 * -1339790057;
               return;
            }
         }
      }

      MusicPatch var9 = (MusicPatch)this.af.get((long)this.al[var1]);
      if (var9 != null) {
         RawSound var10 = var9.an[var2];
         if (null != var10) {
            MusicPatchNode var7 = new MusicPatchNode();
            var7.af = var1 * -2055035679;
            var7.an = var9;
            var7.aw = var10;
            var7.ac = var9.ab[var2];
            var7.au = -1957781017 * var9.aq[var2];
            var7.ab = -1339790057 * var2;
            var7.aq = -284955771 * (1024 + -1979814511 * var9.af * var3 * var3 * var9.ac[var2] >> 11);
            var7.al = (var9.au[var2] & 255) * -539102003;
            var7.at = ((var2 << 8) - (var9.aw[var2] & 32767)) * -1343136669;
            var7.ao = 0;
            var7.ax = 0;
            var7.ai = 0;
            var7.ag = -81590643;
            var7.ah = 0;
            if (this.az[var1] == 0) {
               var7.am = RawPcmStream.ac_renamed(var10, this.bq(var7), this.bv(var7), this.bl(var7));
            } else {
               var7.am = RawPcmStream.ac_renamed(var10, this.bq(var7), 0, this.bl(var7));
               this.ar(var7, var9.aw[var2] < 0);
            }

            if (var9.aw[var2] < 0) {
               var7.am.aa(-1);
            }

            if (1959190999 * var7.au >= 0) {
               MusicPatchNode var8 = this.by[var1][1959190999 * var7.au];
               if (null != var8 && var8.ag * -602614853 < 0) {
                  this.ap[var1][-630482265 * var8.ab] = null;
                  var8.ag = 0;
               }

               this.by[var1][var7.au * 1959190999] = var7;
            }

            this.bz.an.addFirst(var7);
            this.ap[var1][var2] = var7;
         }
      }
   }

   void ar(MusicPatchNode var1, boolean var2) {
      int var4 = var1.aw.an.length;
      int var5;
      if (var2 && var1.aw.au) {
         int var6 = var4 + var4 - var1.aw.aw;
         var5 = (int)((long)this.az[1021419297 * var1.af] * (long)var6 >> 6);
         var4 <<= 8;
         if (var5 >= var4) {
            var5 = var4 + var4 - 1 - var5;
            var1.am.ar(true);
         }
      } else {
         var5 = (int)((long)this.az[var1.af * 1021419297] * (long)var4 >> 6);
      }

      var1.am.av(var5);
   }

   void am(int var1, int var2, int var3) {
      MusicPatchNode var5 = this.ap[var1][var2];
      if (null != var5) {
         this.ap[var1][var2] = null;
         if (0 != (this.as[var1] & 2)) {
            for(MusicPatchNode var6 = (MusicPatchNode)this.bz.an.last(); null != var6; var6 = (MusicPatchNode)this.bz.an.previous()) {
               if (1021419297 * var6.af == 1021419297 * var5.af && var6.ag * -602614853 < 0 && var6 != var5) {
                  var5.ag = 0;
                  break;
               }
            }
         } else {
            var5.ag = 0;
         }

      }
   }

   void as(int var1, int var2, int var3) {
   }

   void aj(int var1, int var2) {
   }

   void ak(int var1, int var2) {
      this.aa[var1] = var2;
   }

   void az(int var1) {
      for(MusicPatchNode var3 = (MusicPatchNode)this.bz.an.last(); null != var3; var3 = (MusicPatchNode)this.bz.an.previous()) {
         if (var1 < 0 || 1021419297 * var3.af == var1) {
            if (null != var3.am) {
               var3.am.ak(PcmPlayer.au * -1359271235 / 100);
               if (var3.am.ap()) {
                  this.bz.aw.addSubStream(var3.am);
               }

               var3.remove2();
            }

            if (var3.ag * -602614853 < 0) {
               this.ap[var3.af * 1021419297][-630482265 * var3.ab] = null;
            }

            var3.remove();
         }
      }

   }

   void ad(int var1) {
      if (var1 >= 0) {
         this.ac[var1] = 12800;
         this.au[var1] = 8192;
         this.ab[var1] = 16383;
         this.aa[var1] = 8192;
         this.ay[var1] = 0;
         this.ao[var1] = 8192;
         this.by(var1);
         this.bn(var1);
         this.as[var1] = 0;
         this.aj[var1] = 32767;
         this.ak[var1] = 256;
         this.az[var1] = 0;
         this.br(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.ad(var1);
         }

      }
   }

   void ae(int var1) {
      for(MusicPatchNode var3 = (MusicPatchNode)this.bz.an.last(); null != var3; var3 = (MusicPatchNode)this.bz.an.previous()) {
         if ((var1 < 0 || var1 == var3.af * 1021419297) && var3.ag * -602614853 < 0) {
            this.ap[1021419297 * var3.af][-630482265 * var3.ab] = null;
            var3.ag = 0;
         }
      }

   }

   void ap() {
      this.az(-1);
      this.ad(-1);

      int var2;
      for(var2 = 0; var2 < 16; ++var2) {
         this.al[var2] = this.aq[var2];
      }

      for(var2 = 0; var2 < 16; ++var2) {
         this.at[var2] = this.aq[var2] & -128;
      }

   }

   void by(int var1) {
      if (0 != (this.as[var1] & 2)) {
         for(MusicPatchNode var3 = (MusicPatchNode)this.bz.an.last(); var3 != null; var3 = (MusicPatchNode)this.bz.an.previous()) {
            if (1021419297 * var3.af == var1 && this.ap[var1][var3.ab * -630482265] == null && -602614853 * var3.ag < 0) {
               var3.ag = 0;
            }
         }
      }

   }

   void bn(int var1) {
      if (0 != (this.as[var1] & 4)) {
         for(MusicPatchNode var3 = (MusicPatchNode)this.bz.an.last(); var3 != null; var3 = (MusicPatchNode)this.bz.an.previous()) {
            if (var3.af * 1021419297 == var1) {
               var3.ak = 0;
            }
         }
      }

   }

   void bs(int var1) {
      int var3 = var1 & 240;
      int var4;
      int var5;
      int var6;
      if (128 == var3) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.am(var4, var5, var6);
      } else if (144 == var3) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var6 > 0) {
            this.av(var4, var5, var6);
         } else {
            this.am(var4, var5, 64);
         }

      } else if (160 == var3) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.as(var4, var5, var6);
      } else if (176 == var3) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var5 == 0) {
            this.at[var4] = (var6 << 14) + (this.at[var4] & -2080769);
         }

         if (var5 == 32) {
            this.at[var4] = (this.at[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 1) {
            this.ay[var4] = (this.ay[var4] & -16257) + (var6 << 7);
         }

         if (33 == var5) {
            this.ay[var4] = (this.ay[var4] & -128) + var6;
         }

         if (5 == var5) {
            this.ao[var4] = (this.ao[var4] & -16257) + (var6 << 7);
         }

         if (37 == var5) {
            this.ao[var4] = (this.ao[var4] & -128) + var6;
         }

         if (7 == var5) {
            this.ac[var4] = (this.ac[var4] & -16257) + (var6 << 7);
         }

         if (39 == var5) {
            this.ac[var4] = var6 + (this.ac[var4] & -128);
         }

         if (10 == var5) {
            this.au[var4] = (this.au[var4] & -16257) + (var6 << 7);
         }

         if (42 == var5) {
            this.au[var4] = var6 + (this.au[var4] & -128);
         }

         if (11 == var5) {
            this.ab[var4] = (this.ab[var4] & -16257) + (var6 << 7);
         }

         if (43 == var5) {
            this.ab[var4] = var6 + (this.ab[var4] & -128);
         }

         int[] var10000;
         if (var5 == 64) {
            if (var6 >= 64) {
               var10000 = this.as;
               var10000[var4] |= 1;
            } else {
               var10000 = this.as;
               var10000[var4] &= -2;
            }
         }

         if (65 == var5) {
            if (var6 >= 64) {
               var10000 = this.as;
               var10000[var4] |= 2;
            } else {
               this.by(var4);
               var10000 = this.as;
               var10000[var4] &= -3;
            }
         }

         if (var5 == 99) {
            this.aj[var4] = (var6 << 7) + (this.aj[var4] & 127);
         }

         if (var5 == 98) {
            this.aj[var4] = var6 + (this.aj[var4] & 16256);
         }

         if (var5 == 101) {
            this.aj[var4] = (this.aj[var4] & 127) + 16384 + (var6 << 7);
         }

         if (var5 == 100) {
            this.aj[var4] = var6 + 16384 + (this.aj[var4] & 16256);
         }

         if (120 == var5) {
            this.az(var4);
         }

         if (121 == var5) {
            this.ad(var4);
         }

         if (var5 == 123) {
            this.ae(var4);
         }

         int var7;
         if (var5 == 6) {
            var7 = this.aj[var4];
            if (16384 == var7) {
               this.ak[var4] = (this.ak[var4] & -16257) + (var6 << 7);
            }
         }

         if (38 == var5) {
            var7 = this.aj[var4];
            if (16384 == var7) {
               this.ak[var4] = var6 + (this.ak[var4] & -128);
            }
         }

         if (var5 == 16) {
            this.az[var4] = (this.az[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 48) {
            this.az[var4] = var6 + (this.az[var4] & -128);
         }

         if (81 == var5) {
            if (var6 >= 64) {
               var10000 = this.as;
               var10000[var4] |= 4;
            } else {
               this.bn(var4);
               var10000 = this.as;
               var10000[var4] &= -5;
            }
         }

         if (17 == var5) {
            this.br(var4, (this.ad[var4] & -16257) + (var6 << 7));
         }

         if (49 == var5) {
            this.br(var4, (this.ad[var4] & -128) + var6);
         }

      } else if (192 == var3) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.ah(var4, var5 + this.at[var4]);
      } else if (var3 == 208) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.aj(var4, var5);
      } else if (224 == var3) {
         var4 = var1 & 15;
         var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.ak(var4, var5);
      } else {
         var3 = var1 & 255;
         if (255 == var3) {
            this.ap();
         }
      }
   }

   void br(int var1, int var2) {
      this.ad[var1] = var2;
      this.ae[var1] = (int)(2097152.0 * Math.pow(2.0, 5.4931640625E-4 * (double)var2) + 0.5);
   }

   int bq(MusicPatchNode var1) {
      int var3 = (274954637 * var1.aa * -1077015879 * var1.ay >> 12) + -279706293 * var1.at;
      var3 += this.ak[var1.af * 1021419297] * (this.aa[1021419297 * var1.af] - 8192) >> 12;
      MusicPatchNode2 var4 = var1.ac;
      int var5;
      if (var4.al * -1668380791 > 0 && (-1552238757 * var4.aq > 0 || this.ay[var1.af * 1021419297] > 0)) {
         var5 = var4.aq * -1552238757 << 2;
         int var6 = 391036783 * var4.at << 1;
         if (667306259 * var1.av < var6) {
            var5 = var5 * var1.av * 667306259 / var6;
         }

         var5 += this.ay[1021419297 * var1.af] >> 7;
         double var7 = Math.sin(0.01227184630308513 * (double)(var1.ar * -2032101041 & 511));
         var3 += (int)(var7 * (double)var5);
      }

      var5 = (int)((double)(256 * var1.aw.af) * Math.pow(2.0, 3.255208333333333E-4 * (double)var3) / (double)(PcmPlayer.au * -1359271235) + 0.5);
      return var5 < 1 ? 1 : var5;
   }

   int bv(MusicPatchNode var1) {
      MusicPatchNode2 var3 = var1.ac;
      int var4 = this.ac[1021419297 * var1.af] * this.ab[1021419297 * var1.af] + 4096 >> 13;
      var4 = var4 * var4 + 16384 >> 15;
      var4 = var1.aq * -254585523 * var4 + 16384 >> 15;
      var4 = 128 + 1380277371 * this.an * var4 >> 8;
      if (354539497 * var3.aw > 0) {
         var4 = (int)((double)var4 * Math.pow(0.5, (double)(var3.aw * 354539497) * (double)(var1.ao * -814647939) * 1.953125E-5) + 0.5);
      }

      int var5;
      int var6;
      int var7;
      int var8;
      if (null != var3.af) {
         var5 = 873438947 * var1.ax;
         var6 = var3.af[1 + var1.ai * 891662681];
         if (891662681 * var1.ai < var3.af.length - 2) {
            var7 = (var3.af[var1.ai * 891662681] & 255) << 8;
            var8 = (var3.af[891662681 * var1.ai + 2] & 255) << 8;
            var6 += (var3.af[3 + 891662681 * var1.ai] - var6) * (var5 - var7) / (var8 - var7);
         }

         var4 = var4 * var6 + 32 >> 6;
      }

      if (-602614853 * var1.ag > 0 && var3.an != null) {
         var5 = -602614853 * var1.ag;
         var6 = var3.an[1 + -371546193 * var1.ah];
         if (var1.ah * -371546193 < var3.an.length - 2) {
            var7 = (var3.an[var1.ah * -371546193] & 255) << 8;
            var8 = (var3.an[var1.ah * -371546193 + 2] & 255) << 8;
            var6 += (var3.an[var1.ah * -371546193 + 3] - var6) * (var5 - var7) / (var8 - var7);
         }

         var4 = var6 * var4 + 32 >> 6;
      }

      return var4;
   }

   int bl(MusicPatchNode var1) {
      int var3 = this.au[var1.af * 1021419297];
      return var3 < 8192 ? 32 + var3 * var1.al * 1083381765 >> 6 : 16384 - ((16384 - var3) * (128 - var1.al * 1083381765) + 32 >> 6);
   }

   protected synchronized PcmStream firstSubStream() {
      return this.bz;
   }

   protected synchronized PcmStream nextSubStream() {
      return null;
   }

   protected synchronized int al() {
      return 0;
   }

   protected synchronized void fill(int[] var1, int var2, int var3) {
      if (this.bb.isReady()) {
         int var4 = this.bb.an * this.aw * 437930689 / (-1359271235 * PcmPlayer.au);

         do {
            long var5 = (long)var3 * (long)var4 + this.bx * 8370013022464380265L;
            if (this.bo * -8691691867109044431L - var5 >= 0L) {
               this.bx = var5 * 389160967981716185L;
               break;
            }

            int var7 = (int)((-8691691867109044431L * this.bo - 8370013022464380265L * this.bx + (long)var4 - 1L) / (long)var4);
            this.bx += (long)var4 * (long)var7 * 389160967981716185L;
            this.bz.fill(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.bp();
         } while(this.bb.isReady());
      }

      this.bz.fill(var1, var2, var3);
   }

   protected synchronized void skip(int var1) {
      if (this.bb.isReady()) {
         int var2 = this.bb.an * 437930689 * this.aw / (-1359271235 * PcmPlayer.au);

         do {
            long var3 = 8370013022464380265L * this.bx + (long)var2 * (long)var1;
            if (-8691691867109044431L * this.bo - var3 >= 0L) {
               this.bx = 389160967981716185L * var3;
               break;
            }

            int var5 = (int)((this.bo * -8691691867109044431L - 8370013022464380265L * this.bx + (long)var2 - 1L) / (long)var2);
            this.bx += (long)var5 * (long)var2 * 389160967981716185L;
            this.bz.skip(var5);
            var1 -= var5;
            this.bp();
         } while(this.bb.isReady());
      }

      this.bz.skip(var1);
   }

   void bp() {
      int var2 = this.be * -2130330853;
      int var3 = this.bk * 2049666181;

      long var4;
      for(var4 = this.bo * -8691691867109044431L; this.bk * 2049666181 == var3; var4 = this.bb.ao(var3)) {
         while(this.bb.au[var2] == var3) {
            this.bb.gotoTrack(var2);
            int var6 = this.bb.readMessage(var2);
            if (1 == var6) {
               this.bb.aq();
               this.bb.markTrackPosition(var2);
               if (this.bb.isDone()) {
                  if (!this.bi || var3 == 0) {
                     this.ap();
                     this.bb.clear();
                     return;
                  }

                  this.bb.reset(var4);
               }
               break;
            }

            if ((var6 & 128) != 0) {
               this.bs(var6);
            }

            this.bb.readTrackLength(var2);
            this.bb.markTrackPosition(var2);
         }

         var2 = this.bb.getPrioritizedTrack();
         var3 = this.bb.au[var2];
      }

      this.be = 911615763 * var2;
      this.bk = -1172591539 * var3;
      this.bo = -5361838125554816559L * var4;
   }

   boolean bc(MusicPatchNode var1) {
      if (var1.am == null) {
         if (var1.ag * -602614853 >= 0) {
            var1.remove();
            if (1959190999 * var1.au > 0 && this.by[var1.af * 1021419297][var1.au * 1959190999] == var1) {
               this.by[var1.af * 1021419297][1959190999 * var1.au] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   boolean bh(MusicPatchNode var1, int[] var2, int var3, int var4) {
      var1.as = 652897503 * (PcmPlayer.au * -1359271235 / 100);
      if (-602614853 * var1.ag < 0 || var1.am != null && !var1.am.ae()) {
         int var6 = var1.ay * -1077015879;
         if (var6 > 0) {
            var6 -= (int)(16.0 * Math.pow(2.0, (double)this.ao[1021419297 * var1.af] * 4.921259842519685E-4) + 0.5);
            if (var6 < 0) {
               var6 = 0;
            }

            var1.ay = var6 * -871310455;
         }

         var1.am.az(this.bq(var1));
         MusicPatchNode2 var7 = var1.ac;
         boolean var8 = false;
         var1.av += -1164121829;
         var1.ar += 100789159 * var7.al;
         double var9 = 5.086263020833333E-6 * (double)((274954637 * var1.aa * var1.ay * -1077015879 >> 12) + (-630482265 * var1.ab - 60 << 8));
         if (354539497 * var7.aw > 0) {
            if (var7.ab * 821482501 > 0) {
               var1.ao += (int)(128.0 * Math.pow(2.0, (double)(821482501 * var7.ab) * var9) + 0.5) * 349596629;
            } else {
               var1.ao += 1798695552;
            }
         }

         if (null != var7.af) {
            if (var7.ac * -32542335 > 0) {
               var1.ax += (int)(128.0 * Math.pow(2.0, (double)(-32542335 * var7.ac) * var9) + 0.5) * -257124661;
            } else {
               var1.ax += 1447781760;
            }

            while(891662681 * var1.ai < var7.af.length - 2 && var1.ax * 873438947 > (var7.af[var1.ai * 891662681 + 2] & 255) << 8) {
               var1.ai += -934605358;
            }

            if (var1.ai * 891662681 == var7.af.length - 2 && 0 == var7.af[1 + 891662681 * var1.ai]) {
               var8 = true;
            }
         }

         if (var1.ag * -602614853 >= 0 && var7.an != null && 0 == (this.as[1021419297 * var1.af] & 1) && (var1.au * 1959190999 < 0 || var1 != this.by[var1.af * 1021419297][var1.au * 1959190999])) {
            if (-574961187 * var7.au > 0) {
               var1.ag += (int)(128.0 * Math.pow(2.0, (double)(var7.au * -574961187) * var9) + 0.5) * 81590643;
            } else {
               var1.ag += 1853667712;
            }

            while(var1.ah * -371546193 < var7.an.length - 2 && -602614853 * var1.ag > (var7.an[2 + -371546193 * var1.ah] & 255) << 8) {
               var1.ah += 2121932446;
            }

            if (var7.an.length - 2 == var1.ah * -371546193) {
               var8 = true;
            }
         }

         if (var8) {
            var1.am.ak(-1971564769 * var1.as);
            if (null != var2) {
               var1.am.fill(var2, var3, var4);
            } else {
               var1.am.skip(var4);
            }

            if (var1.am.ap()) {
               this.bz.aw.addSubStream(var1.am);
            }

            var1.remove2();
            if (var1.ag * -602614853 >= 0) {
               var1.remove();
               if (1959190999 * var1.au > 0 && this.by[1021419297 * var1.af][1959190999 * var1.au] == var1) {
                  this.by[1021419297 * var1.af][var1.au * 1959190999] = null;
               }
            }

            return true;
         } else {
            var1.am.aj(var1.as * -1971564769, this.bv(var1), this.bl(var1));
            return false;
         }
      } else {
         var1.remove2();
         var1.remove();
         if (1959190999 * var1.au > 0 && var1 == this.by[var1.af * 1021419297][var1.au * 1959190999]) {
            this.by[1021419297 * var1.af][var1.au * 1959190999] = null;
         }

         return true;
      }
   }
}
