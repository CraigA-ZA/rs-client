public class ms implements Enumerated {
   public static final ms ac = new ms(3);
   static final ms af = new ms(0);
   static final ms an = new ms(1);
   static final ms au = new ms(4);
   static final ms aw = new ms(2);
   final int ab;

   ms(int var1) {
      this.ab = var1 * 1221393021;
   }

   public int ordinal() {
      return this.ab * -1109405995;
   }

   static void au_renamed(int var0, int var1, int var2, int var3) {
      for(cr var5 = (cr)cr.af.last(); var5 != null; var5 = (cr)cr.af.previous()) {
         if (-1 != var5.al * 1671764667 || null != var5.ao) {
            int var6 = 0;
            if (var1 > -823707049 * var5.au) {
               var6 += var1 - var5.au * -823707049;
            } else if (var1 < var5.aw * 506576733) {
               var6 += 506576733 * var5.aw - var1;
            }

            if (var2 > var5.ab * -1828326483) {
               var6 += var2 - var5.ab * -1828326483;
            } else if (var2 < 99345247 * var5.ac) {
               var6 += var5.ac * 99345247 - var2;
            }

            if (var6 - 64 <= -1826007749 * var5.aq && aj.vb.az() != 0 && var0 == var5.an * 776275305) {
               var6 -= 64;
               if (var6 < 0) {
                  var6 = 0;
               }

               int var7 = (var5.aq * -1826007749 - var6) * aj.vb.az() / (-1826007749 * var5.aq);
               if (null == var5.at) {
                  if (var5.al * 1671764667 >= 0) {
                     SoundEffect var8 = SoundEffect.readSoundEffect(qc.fa, var5.al * 1671764667, 0);
                     if (null != var8) {
                        RawSound var9 = var8.toRawSound().resample(WorldMapSectionType.tj);
                        RawPcmStream var10 = RawPcmStream.aw_renamed(var9, 100, var7);
                        var10.aa(-1);
                        fe.td.addSubStream(var10);
                        var5.at = var10;
                     }
                  }
               } else {
                  var5.at.skipSubStreams(var7);
               }

               if (var5.ai == null) {
                  if (null != var5.ao && (var5.ax -= var3 * -713890281) * -428166745 <= 0) {
                     int var12 = (int)(Math.random() * (double)var5.ao.length);
                     SoundEffect var13 = SoundEffect.readSoundEffect(qc.fa, var5.ao[var12], 0);
                     if (null != var13) {
                        RawSound var14 = var13.toRawSound().resample(WorldMapSectionType.tj);
                        RawPcmStream var11 = RawPcmStream.aw_renamed(var14, 100, var7);
                        var11.aa(0);
                        fe.td.addSubStream(var11);
                        var5.ai = var11;
                        var5.ax = (-442346035 * var5.aa + (int)(Math.random() * (double)(-1018564833 * var5.ay - -442346035 * var5.aa))) * -713890281;
                     }
                  }
               } else {
                  var5.ai.skipSubStreams(var7);
                  if (!var5.ai.hasNext()) {
                     var5.ai = null;
                  }
               }
            } else {
               if (null != var5.at) {
                  fe.td.removeSubStream(var5.at);
                  var5.at = null;
               }

               if (var5.ai != null) {
                  fe.td.removeSubStream(var5.ai);
                  var5.ai = null;
               }
            }
         }
      }

   }

   static void ni_renamed() {
      if (Client.ln && MusicPatchNode.mi != null) {
         int var1 = MusicPatchNode.mi.dy[0];
         int var2 = MusicPatchNode.mi.ds[0];
         if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
            return;
         }

         bz.lg = 462679329 * MusicPatchNode.mi.bx;
         int var3 = fq.getTileHeight(1144428983 * MusicPatchNode.mi.bx, -411750205 * MusicPatchNode.mi.bo, -1727408401 * GameShell.mh) - 394960243 * Client.lm;
         if (var3 < Formatting.ls * 470489225) {
            Formatting.ls = -1138369095 * var3;
         }

         fw.lf = -72020645 * MusicPatchNode.mi.bo;
         Client.ln = false;
      }

   }
}
