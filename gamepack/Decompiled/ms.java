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
      for(LocSound var5 = (LocSound)LocSound.objectSounds.last(); var5 != null; var5 = (LocSound)LocSound.objectSounds.previous()) {
         if (-1 != var5.soundEffectId * 1671764667 || null != var5.soundEffectIds) {
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

            if (var6 - 64 <= -1826007749 * var5.aq && aj.clientPreferences.az() != 0 && var0 == var5.an * 776275305) {
               var6 -= 64;
               if (var6 < 0) {
                  var6 = 0;
               }

               int var7 = (var5.aq * -1826007749 - var6) * aj.clientPreferences.az() / (-1826007749 * var5.aq);
               if (null == var5.stream1) {
                  if (var5.soundEffectId * 1671764667 >= 0) {
                     SoundEffect var8 = SoundEffect.readSoundEffect(qc.archive4, var5.soundEffectId * 1671764667, 0);
                     if (null != var8) {
                        RawSound var9 = var8.toRawSound().resample(WorldMapSectionType.decimator);
                        RawPcmStream var10 = RawPcmStream.aw_renamed(var9, 100, var7);
                        var10.aa(-1);
                        fe.pcmStreamMixer.addSubStream(var10);
                        var5.stream1 = var10;
                     }
                  }
               } else {
                  var5.stream1.ao(var7);
               }

               if (var5.stream2 == null) {
                  if (null != var5.soundEffectIds && (var5.ax -= var3 * -713890281) * -428166745 <= 0) {
                     int var13 = (int)(Math.random() * (double)var5.soundEffectIds.length);
                     SoundEffect var14 = SoundEffect.readSoundEffect(qc.archive4, var5.soundEffectIds[var13], 0);
                     if (null != var14) {
                        RawSound var15 = var14.toRawSound().resample(WorldMapSectionType.decimator);
                        RawPcmStream var11 = RawPcmStream.aw_renamed(var15, 100, var7);
                        var11.aa(0);
                        fe.pcmStreamMixer.addSubStream(var11);
                        var5.stream2 = var11;
                        var5.ax = (-442346035 * var5.aa + (int)(Math.random() * (double)(-1018564833 * var5.ay - -442346035 * var5.aa))) * -713890281;
                     }
                  }
               } else {
                  var5.stream2.ao(var7);
                  if (!var5.stream2.hasNext()) {
                     var5.stream2 = null;
                  }
               }
            } else {
               if (null != var5.stream1) {
                  fe.pcmStreamMixer.removeSubStream(var5.stream1);
                  var5.stream1 = null;
               }

               if (var5.stream2 != null) {
                  fe.pcmStreamMixer.removeSubStream(var5.stream2);
                  var5.stream2 = null;
               }
            }
         }
      }

   }

   static void ni_renamed() {
      if (Client.ln && MusicPatchNode.localPlayer != null) {
         int var1 = MusicPatchNode.localPlayer.pathX[0];
         int var2 = MusicPatchNode.localPlayer.pathY[0];
         if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
            return;
         }

         bz.lg = 462679329 * MusicPatchNode.localPlayer.bx;
         int var3 = fq.getTileHeight(1144428983 * MusicPatchNode.localPlayer.bx, -411750205 * MusicPatchNode.localPlayer.bo, -1727408401 * GameShell.plane) - 394960243 * Client.lm;
         if (var3 < Formatting.ls * 470489225) {
            Formatting.ls = -1138369095 * var3;
         }

         fw.lf = -72020645 * MusicPatchNode.localPlayer.bo;
         Client.ln = false;
      }

   }
}
