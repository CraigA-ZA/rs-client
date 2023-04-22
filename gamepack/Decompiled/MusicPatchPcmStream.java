public class MusicPatchPcmStream extends PcmStream {
   MidiPcmStream superStream;
   NodeDeque queue = new NodeDeque();
   PcmStreamMixer mixer = new PcmStreamMixer();

   static int bm_renamed(int var0, ClientScript var1, boolean var2) {
      int var4;
      if (4200 == var0) {
         var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = HeadbarUpdate.getObjType(var4).name;
         return 1;
      } else {
         ObjType var6;
         int var7;
         if (4201 == var0) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
            var7 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
            var6 = HeadbarUpdate.getObjType(var4);
            if (var7 >= 1 && var7 <= 5 && var6.iop[var7 - 1] != null) {
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var6.iop[var7 - 1];
            } else {
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
            }

            return 1;
         } else if (var0 == 4202) {
            Interpreter.Interpreter_intStackSize -= 854271946;
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
            var6 = HeadbarUpdate.getObjType(var4);
            if (var7 >= 1 && var7 <= 5 && null != var6.op[var7 - 1]) {
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var6.op[var7 - 1];
            } else {
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
            }

            return 1;
         } else if (4203 == var0) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HeadbarUpdate.getObjType(var4).cost * -1706039181;
            return 1;
         } else if (var0 == 4204) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HeadbarUpdate.getObjType(var4).stackable * 1552863327 == 1 ? 1 : 0;
            return 1;
         } else {
            ObjType var5;
            if (var0 == 4205) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               var5 = HeadbarUpdate.getObjType(var4);
               if (-1375068187 * var5.resizez == -1 && 1399852547 * var5.certtemplate >= 0) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.certtemplate * 1399852547;
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4206) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               var5 = HeadbarUpdate.getObjType(var4);
               if (-1375068187 * var5.resizez >= 0 && var5.certtemplate * 1399852547 >= 0) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.certtemplate * 1399852547;
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4207) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HeadbarUpdate.getObjType(var4).stockmarket ? 1 : 0;
               return 1;
            } else if (4208 == var0) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               var5 = HeadbarUpdate.getObjType(var4);
               if (-1 == 119859889 * var5.cy && var5.cr * -172219939 >= 0) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.cr * -172219939;
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4209) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               var5 = HeadbarUpdate.getObjType(var4);
               if (var5.cy * 119859889 >= 0 && var5.cr * -172219939 >= 0) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -172219939 * var5.cr;
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var4;
               }

               return 1;
            } else if (4210 == var0) {
               String var8 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
               var7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               cv.nf_renamed(var8, 1 == var7);
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1764192979 * kt.wu;
               return 1;
            } else if (4211 != var0) {
               if (4212 == var0) {
                  FontName.wj = 0;
                  return 1;
               } else if (var0 == 4213) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var7 = HeadbarUpdate.getObjType(var4).getShiftClickIndex();
                  if (var7 == -1) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var7;
                  } else {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var7 + 1;
                  }

                  return 1;
               } else if (4214 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HeadbarUpdate.getObjType(var4).womanwearyoff * -1935812527;
                  return 1;
               } else if (4215 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HeadbarUpdate.getObjType(var4).manwear * -1719338253;
                  return 1;
               } else if (4216 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HeadbarUpdate.getObjType(var4).contrast * 723093341;
                  return 1;
               } else if (4217 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var5 = HeadbarUpdate.getObjType(var4);
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1162544887 * var5.xan2d;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (pj.wm != null && -859067495 * FontName.wj < kt.wu * 1764192979) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = pj.wm[(FontName.wj += 1333557417) * -859067495 - 1] & '\uffff';
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }

   protected PcmStream ab() {
      MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
      if (var1 == null) {
         return null;
      } else {
         return (PcmStream)(null != var1.stream ? var1.stream : this.aq());
      }
   }

   protected PcmStream aq() {
      MusicPatchNode var1;
      do {
         var1 = (MusicPatchNode)this.queue.previous();
         if (var1 == null) {
            return null;
         }
      } while(var1.stream == null);

      return var1.stream;
   }

   void an(MusicPatchNode var1, int var2) {
      if (0 != (this.superStream.as[1021419297 * var1.af] & 4) && -602614853 * var1.ag < 0) {
         int var4 = this.superStream.ae[var1.af * 1021419297] / (PcmPlayer.au * -1359271235);
         int var5 = (1048575 + var4 - -89170073 * var1.ak) / var4;
         var1.ak = (var4 * var2 + -89170073 * var1.ak & 1048575) * -1999877033;
         if (var5 <= var2) {
            if (this.superStream.az[var1.af * 1021419297] == 0) {
               var1.stream = RawPcmStream.ac_renamed(var1.rawSound, var1.stream.ad(), var1.stream.ag(), var1.stream.ah());
            } else {
               var1.stream = RawPcmStream.ac_renamed(var1.rawSound, var1.stream.ad(), 0, var1.stream.ah());
               this.superStream.ar(var1, var1.patch.aw[var1.ab * -630482265] < 0);
            }

            if (var1.patch.aw[-630482265 * var1.ab] < 0) {
               var1.stream.aa(-1);
            }

            var2 = -89170073 * var1.ak / var4;
         }
      }

      var1.stream.ay(var2);
   }

   protected int al() {
      return 0;
   }

   void af(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (this.superStream.as[var1.af * 1021419297] & 4) && var1.ag * -602614853 < 0) {
         int var7 = this.superStream.ae[1021419297 * var1.af] / (-1359271235 * PcmPlayer.au);

         while(true) {
            int var8 = (var7 + 1048575 - var1.ak * -89170073) / var7;
            if (var8 > var4) {
               var1.ak += var7 * var4 * -1999877033;
               break;
            }

            var1.stream.at(var2, var3, var8);
            var3 += var8;
            var4 -= var8;
            var1.ak += (var7 * var8 - 1048576) * -1999877033;
            int var9 = -1359271235 * PcmPlayer.au / 100;
            int var10 = 262144 / var7;
            if (var10 < var9) {
               var9 = var10;
            }

            RawPcmStream var11 = var1.stream;
            if (this.superStream.az[1021419297 * var1.af] == 0) {
               var1.stream = RawPcmStream.ac_renamed(var1.rawSound, var11.ad(), var11.ag(), var11.ah());
            } else {
               var1.stream = RawPcmStream.ac_renamed(var1.rawSound, var11.ad(), 0, var11.ah());
               this.superStream.ar(var1, var1.patch.aw[-630482265 * var1.ab] < 0);
               var1.stream.as(var9, var11.ag());
            }

            if (var1.patch.aw[var1.ab * -630482265] < 0) {
               var1.stream.aa(-1);
            }

            var11.ak(var9);
            var11.at(var2, var3, var5 - var3);
            if (var11.ap()) {
               this.mixer.addSubStream(var11);
            }
         }
      }

      var1.stream.at(var2, var3, var4);
   }

   protected void ay(int var1) {
      this.mixer.ay(var1);

      for(MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.bc(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.as * -1971564769) {
                  this.an(var3, var2);
                  var3.as -= var2 * 652897503;
                  break;
               }

               this.an(var3, var3.as * -1971564769);
               var2 -= var3.as * -1971564769;
            } while(!this.superStream.bh(var3, (int[])null, 0, var2));
         }
      }

   }

   MusicPatchPcmStream(MidiPcmStream var1) {
      this.superStream = var1;
   }

   protected void at(int[] var1, int var2, int var3) {
      this.mixer.at(var1, var2, var3);

      for(MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.bc(var6)) {
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
            } while(!this.superStream.bh(var6, var1, var4, var5));
         }
      }

   }
}
