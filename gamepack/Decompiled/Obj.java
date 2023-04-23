public final class Obj extends Entity {
   static String gp;
   int ac = -2069082981;
   int af;
   int an;

   Obj() {
   }

   void advance(int var1) {
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
      return HeadbarUpdate.getObjType(176307405 * this.af).at(-1745152527 * this.an);
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
         MouseHandler.addPlayerToScene(MusicPatchNode.mi, false);
      }

   }

   static final void ms_renamed(Component[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         Component var4 = var0[var3];
         if (null != var4 && var1 == var4.cu * 913615679 && (!var4.bn || !pm.isComponentHidden(var4))) {
            int var6;
            if (0 == 883712245 * var4.bg) {
               if (!var4.bn && pm.isComponentHidden(var4) && var4 != MidiPcmStream.oh) {
                  continue;
               }

               ms_renamed(var0, var4.bs * 1713081171);
               if (null != var4.gz) {
                  ms_renamed(var4.gz, 1713081171 * var4.bs);
               }

               InterfaceParent var5 = (InterfaceParent)Client.oc.get((long)(var4.bs * 1713081171));
               if (var5 != null) {
                  var6 = 944864121 * var5.af;
                  if (SoundSystem.loadInterface(var6)) {
                     ms_renamed(hn.ap[var6], -1);
                  }
               }
            }

            if (6 == var4.bg * 883712245) {
               if (-1 != var4.dv * -1526544909 || var4.dz * -717228843 != -1) {
                  boolean var9 = rr.runCs1(var4);
                  if (var9) {
                     var6 = var4.dz * -717228843;
                  } else {
                     var6 = var4.dv * -1526544909;
                  }

                  if (var6 != -1) {
                     SeqType var7 = Inventory.getSeqType(var6, (byte)104);
                     if (!var7.ao()) {
                        for(var4.gl += Client.ja * 1742890489; 1438245367 * var4.gl > var7.av[var4.gx * 1575517389]; fw.ma_renamed(var4)) {
                           var4.gl -= var7.av[var4.gx * 1575517389] * -1830604857;
                           var4.gx += -1991520251;
                           if (var4.gx * 1575517389 >= var7.ag.length) {
                              var4.gx -= -149229203 * var7.am;
                              if (1575517389 * var4.gx < 0 || 1575517389 * var4.gx >= var7.ag.length) {
                                 var4.gx = 0;
                              }
                           }
                        }
                     } else {
                        var4.gx += 1198415163 * Client.ja;
                        int var8 = var7.ax();
                        if (var4.gx * 1575517389 >= var8) {
                           var4.gx -= -149229203 * var7.am;
                           if (var4.gx * 1575517389 < 0 || 1575517389 * var4.gx >= var8) {
                              var4.gx = 0;
                           }
                        }

                        fw.ma_renamed(var4);
                     }
                  }
               }

               if (0 != -238796869 * var4.dq && !var4.bn) {
                  int var10 = var4.dq * -238796869 >> 16;
                  var6 = var4.dq * -238796869 << 16 >> 16;
                  var10 *= -1795081153 * Client.ja;
                  var6 *= -1795081153 * Client.ja;
                  var4.dh = -142910041 * (var4.dh * 797932055 + var10 & 2047);
                  var4.dp = (var4.dp * -480949115 + var6 & 2047) * -230241203;
                  fw.ma_renamed(var4);
               }
            }
         }
      }

   }
}
