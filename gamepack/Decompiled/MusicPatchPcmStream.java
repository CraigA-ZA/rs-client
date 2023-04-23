public class MusicPatchPcmStream extends PcmStream {
   PcmStreamMixer aw = new PcmStreamMixer();
   MidiPcmStream af;
   NodeDeque an = new NodeDeque();

   MusicPatchPcmStream(MidiPcmStream var1) {
      this.af = var1;
   }

   protected PcmStream firstSubStream() {
      MusicPatchNode var1 = (MusicPatchNode)this.an.last();
      if (var1 == null) {
         return null;
      } else {
         return (PcmStream)(null != var1.am ? var1.am : this.nextSubStream());
      }
   }

   protected PcmStream nextSubStream() {
      MusicPatchNode var1;
      do {
         var1 = (MusicPatchNode)this.an.previous();
         if (var1 == null) {
            return null;
         }
      } while(var1.am == null);

      return var1.am;
   }

   protected int al() {
      return 0;
   }

   protected void fill(int[] var1, int var2, int var3) {
      this.aw.fill(var1, var2, var3);

      for(MusicPatchNode var6 = (MusicPatchNode)this.an.last(); var6 != null; var6 = (MusicPatchNode)this.an.previous()) {
         if (!this.af.bc(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.as * -1971564769) {
                  this.af(var6, var1, var4, var5, var5 + var4);
                  var6.as -= 652897503 * var5;
                  break;
               }

               this.af(var6, var1, var4, -1971564769 * var6.as, var4 + var5);
               var4 += -1971564769 * var6.as;
               var5 -= -1971564769 * var6.as;
            } while(!this.af.bh(var6, var1, var4, var5));
         }
      }

   }

   protected void skip(int var1) {
      this.aw.skip(var1);

      for(MusicPatchNode var3 = (MusicPatchNode)this.an.last(); var3 != null; var3 = (MusicPatchNode)this.an.previous()) {
         if (!this.af.bc(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.as * -1971564769) {
                  this.an(var3, var2);
                  var3.as -= var2 * 652897503;
                  break;
               }

               this.an(var3, var3.as * -1971564769);
               var2 -= var3.as * -1971564769;
            } while(!this.af.bh(var3, (int[])null, 0, var2));
         }
      }

   }

   void af(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (this.af.as[var1.af * 1021419297] & 4) && var1.ag * -602614853 < 0) {
         int var7 = this.af.ae[1021419297 * var1.af] / (-1359271235 * PcmPlayer.au);

         while(true) {
            int var8 = (var7 + 1048575 - var1.ak * -89170073) / var7;
            if (var8 > var4) {
               var1.ak += var7 * var4 * -1999877033;
               break;
            }

            var1.am.fill(var2, var3, var8);
            var3 += var8;
            var4 -= var8;
            var1.ak += (var7 * var8 - 1048576) * -1999877033;
            int var9 = -1359271235 * PcmPlayer.au / 100;
            int var10 = 262144 / var7;
            if (var10 < var9) {
               var9 = var10;
            }

            RawPcmStream var11 = var1.am;
            if (this.af.az[1021419297 * var1.af] == 0) {
               var1.am = RawPcmStream.ac_renamed(var1.aw, var11.ad(), var11.ag(), var11.transformedSize());
            } else {
               var1.am = RawPcmStream.ac_renamed(var1.aw, var11.ad(), 0, var11.transformedSize());
               this.af.ar(var1, var1.an.aw[-630482265 * var1.ab] < 0);
               var1.am.as(var9, var11.ag());
            }

            if (var1.an.aw[var1.ab * -630482265] < 0) {
               var1.am.aa(-1);
            }

            var11.ak(var9);
            var11.fill(var2, var3, var5 - var3);
            if (var11.ap()) {
               this.aw.addSubStream(var11);
            }
         }
      }

      var1.am.fill(var2, var3, var4);
   }

   void an(MusicPatchNode var1, int var2) {
      if (0 != (this.af.as[1021419297 * var1.af] & 4) && -602614853 * var1.ag < 0) {
         int var4 = this.af.ae[var1.af * 1021419297] / (PcmPlayer.au * -1359271235);
         int var5 = (1048575 + var4 - -89170073 * var1.ak) / var4;
         var1.ak = (var4 * var2 + -89170073 * var1.ak & 1048575) * -1999877033;
         if (var5 <= var2) {
            if (this.af.az[var1.af * 1021419297] == 0) {
               var1.am = RawPcmStream.ac_renamed(var1.aw, var1.am.ad(), var1.am.ag(), var1.am.transformedSize());
            } else {
               var1.am = RawPcmStream.ac_renamed(var1.aw, var1.am.ad(), 0, var1.am.transformedSize());
               this.af.ar(var1, var1.an.aw[var1.ab * -630482265] < 0);
            }

            if (var1.an.aw[-630482265 * var1.ab] < 0) {
               var1.am.aa(-1);
            }

            var2 = -89170073 * var1.ak / var4;
         }
      }

      var1.am.skip(var2);
   }

   static int bm_renamed(int var0, ClientScript var1, boolean var2) {
      int var4;
      if (4200 == var0) {
         var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
         Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = HeadbarUpdate.getObjType(var4).ah;
         return 1;
      } else {
         ObjType var6;
         int var7;
         if (4201 == var0) {
            Interpreter.at -= 854271946;
            var4 = Interpreter.al[-964267539 * Interpreter.at];
            var7 = Interpreter.al[1 + Interpreter.at * -964267539];
            var6 = HeadbarUpdate.getObjType(var4);
            if (var7 >= 1 && var7 <= 5 && var6.bm[var7 - 1] != null) {
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var6.bm[var7 - 1];
            } else {
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
            }

            return 1;
         } else if (var0 == 4202) {
            Interpreter.at -= 854271946;
            var4 = Interpreter.al[Interpreter.at * -964267539];
            var7 = Interpreter.al[Interpreter.at * -964267539 + 1];
            var6 = HeadbarUpdate.getObjType(var4);
            if (var7 >= 1 && var7 <= 5 && null != var6.bd[var7 - 1]) {
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var6.bd[var7 - 1];
            } else {
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
            }

            return 1;
         } else if (4203 == var0) {
            var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = HeadbarUpdate.getObjType(var4).be * -1706039181;
            return 1;
         } else if (var0 == 4204) {
            var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
            Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = HeadbarUpdate.getObjType(var4).bi * 1552863327 == 1 ? 1 : 0;
            return 1;
         } else {
            ObjType var5;
            if (var0 == 4205) {
               var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               var5 = HeadbarUpdate.getObjType(var4);
               if (-1375068187 * var5.ci == -1 && 1399852547 * var5.ce >= 0) {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var5.ce * 1399852547;
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4206) {
               var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               var5 = HeadbarUpdate.getObjType(var4);
               if (-1375068187 * var5.ci >= 0 && var5.ce * 1399852547 >= 0) {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var5.ce * 1399852547;
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4207) {
               var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = HeadbarUpdate.getObjType(var4).bz ? 1 : 0;
               return 1;
            } else if (4208 == var0) {
               var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               var5 = HeadbarUpdate.getObjType(var4);
               if (-1 == 119859889 * var5.cy && var5.cr * -172219939 >= 0) {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var5.cr * -172219939;
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4209) {
               var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               var5 = HeadbarUpdate.getObjType(var4);
               if (var5.cy * 119859889 >= 0 && var5.cr * -172219939 >= 0) {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -172219939 * var5.cr;
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var4;
               }

               return 1;
            } else if (4210 == var0) {
               String var8 = Interpreter.aa[(SecureRandomCallable.ay -= -1086551379) * -2017760987];
               var7 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               cv.nf_renamed(var8, 1 == var7);
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 1764192979 * kt.wu;
               return 1;
            } else if (4211 != var0) {
               if (4212 == var0) {
                  FontName.wj = 0;
                  return 1;
               } else if (var0 == 4213) {
                  var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  var7 = HeadbarUpdate.getObjType(var4).getShiftClickIndex();
                  if (var7 == -1) {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var7;
                  } else {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var7 + 1;
                  }

                  return 1;
               } else if (4214 == var0) {
                  var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = HeadbarUpdate.getObjType(var4).bk * -1935812527;
                  return 1;
               } else if (4215 == var0) {
                  var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = HeadbarUpdate.getObjType(var4).bx * -1719338253;
                  return 1;
               } else if (4216 == var0) {
                  var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = HeadbarUpdate.getObjType(var4).bo * 723093341;
                  return 1;
               } else if (4217 == var0) {
                  var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
                  var5 = HeadbarUpdate.getObjType(var4);
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1162544887 * var5.cq;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (pj.wm != null && -859067495 * FontName.wj < kt.wu * 1764192979) {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = pj.wm[(FontName.wj += 1333557417) * -859067495 - 1] & '\uffff';
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }
}
