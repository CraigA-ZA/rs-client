public final class Obj extends Entity {
   static String gp;
   int ac = -2069082981;
   int id;
   int quantity;

   Obj() {
   }

   void af(int var1) {
      this.ac = 1318728709 * var1;
   }

   boolean aw(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (this.ac * -1724221235 & 1 << var1);
      } else {
         return true;
      }
   }

   protected final it getModel() {
      return HeadbarUpdate.getObjType(176307405 * this.id).at(-1745152527 * this.quantity);
   }

   static fh av_renamed(int var0) {
      if (aj.ag_renamed(var0) != 0) {
         return null;
      } else {
         fh var3 = (fh)SeqType.aa.get((long)var0);
         fh var2;
         if (null != var3) {
            var2 = var3;
         } else {
            var3 = iw.af_renamed(SeqType.ab, SeqType.aq, var0, false);
            if (null != var3) {
               SeqType.aa.put(var3, (long)var0);
            }

            var2 = var3;
         }

         return var2;
      }
   }

   static void ix_renamed() {
      if (Client.md) {
         MouseHandler.addPlayerToScene(MusicPatchNode.localPlayer, false);
      }

   }

   static final void ms_renamed(Component[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         Component var4 = var0[var3];
         if (null != var4 && var1 == var4.parentId * 913615679 && (!var4.isIf3 || !pm.isComponentHidden(var4))) {
            int var6;
            if (0 == 883712245 * var4.bg) {
               if (!var4.isIf3 && pm.isComponentHidden(var4) && var4 != MidiPcmStream.oh) {
                  continue;
               }

               ms_renamed(var0, var4.id * 1713081171);
               if (null != var4.children) {
                  ms_renamed(var4.children, 1713081171 * var4.id);
               }

               InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)(var4.id * 1713081171));
               if (var5 != null) {
                  var6 = 944864121 * var5.af;
                  if (SoundSystem.loadInterface(var6)) {
                     ms_renamed(hn.interfaceComponents[var6], -1);
                  }
               }
            }

            if (6 == var4.bg * 883712245) {
               if (-1 != var4.sequenceId * -1526544909 || var4.sequenceId2 * -717228843 != -1) {
                  boolean var16 = rr.runCs1(var4);
                  if (var16) {
                     var6 = var4.sequenceId2 * -717228843;
                  } else {
                     var6 = var4.sequenceId * -1526544909;
                  }

                  if (var6 != -1) {
                     SeqType var7 = Inventory.getSeqType(var6, (byte)104);
                     if (!var7.ao()) {
                        for(var4.modelFrameCycle += Client.ja * 1742890489; 1438245367 * var4.modelFrameCycle > var7.frameLengths[var4.modelFrame * 1575517389]; fw.ma_renamed(var4)) {
                           var4.modelFrameCycle -= var7.frameLengths[var4.modelFrame * 1575517389] * -1830604857;
                           var4.modelFrame += -1991520251;
                           if (var4.modelFrame * 1575517389 >= var7.frameIds.length) {
                              var4.modelFrame -= -149229203 * var7.righthand;
                              if (1575517389 * var4.modelFrame < 0 || 1575517389 * var4.modelFrame >= var7.frameIds.length) {
                                 var4.modelFrame = 0;
                              }
                           }
                        }
                     } else {
                        var4.modelFrame += 1198415163 * Client.ja;
                        int var8 = var7.ax();
                        if (var4.modelFrame * 1575517389 >= var8) {
                           var4.modelFrame -= -149229203 * var7.righthand;
                           if (var4.modelFrame * 1575517389 < 0 || 1575517389 * var4.modelFrame >= var8) {
                              var4.modelFrame = 0;
                           }
                        }

                        fw.ma_renamed(var4);
                     }
                  }
               }

               if (0 != -238796869 * var4.dq && !var4.isIf3) {
                  int var17 = var4.dq * -238796869 >> 16;
                  var6 = var4.dq * -238796869 << 16 >> 16;
                  var17 *= -1795081153 * Client.ja;
                  var6 *= -1795081153 * Client.ja;
                  var4.modelAngleX = -142910041 * (var4.modelAngleX * 797932055 + var17 & 2047);
                  var4.modelAngleY = (var4.modelAngleY * -480949115 + var6 & 2047) * -230241203;
                  fw.ma_renamed(var4);
               }
            }
         }
      }

   }
}
