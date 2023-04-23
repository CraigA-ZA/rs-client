public class em {
   public static final float ac = Math.ulp(1.0F);
   public static final float au;
   static dp av;
   static float[] ab;
   static float[] aq;
   static String gv;

   static {
      au = ac * 2.0F;
      ab = new float[4];
      aq = new float[5];
   }

   em() throws Throwable {
      throw new Error();
   }

   static dk[] au_renamed() {
      return new dk[]{dk.ac, dk.an, dk.au, dk.aw, dk.af};
   }

   static ec[] au_renamed() {
      return new ec[]{ec.af, ec.an, ec.aw, ec.ac, ec.au, ec.ab, ec.aq, ec.al, ec.at, ec.aa, ec.ay, ec.ao, ec.ax, ec.ai, ec.ag, ec.ah, ec.av};
   }

   static int ao_renamed(int var0, ClientScript var1, boolean var2, byte var3) {
      Component var4;
      if (var0 >= 2000) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var0 -= 1000;
         var4 = gh.an_renamed(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
      } else {
         Component var10000;
         if (var2) {
            if (var3 != -1) {
               throw new IllegalStateException();
            }

            var10000 = SoundSystem.ag;
         } else {
            var10000 = an.ai;
         }

         var4 = var10000;
      }

      String var5 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
      int[] var6 = null;
      if (var5.length() > 0) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         if (var5.charAt(var5.length() - 1) == 'Y') {
            if (var3 != -1) {
               throw new IllegalStateException();
            }

            int var7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (var7 > 0) {
               for(var6 = new int[var7]; var7-- > 0; var6[var7] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]) {
                  if (var3 != -1) {
                     throw new IllegalStateException();
                  }
               }
            }

            var5 = var5.substring(0, var5.length() - 1);
         }
      }

      Object[] var10 = new Object[var5.length() + 1];

      int var8;
      for(var8 = var10.length - 1; var8 >= 1; --var8) {
         if (var5.charAt(var8 - 1) == 's') {
            if (var3 != -1) {
               throw new IllegalStateException();
            }

            var10[var8] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
         } else {
            var10[var8] = new Integer(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
         }
      }

      var8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
      if (var8 != -1) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var10[0] = new Integer(var8);
      } else {
         var10 = null;
      }

      if (1400 == var0) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.onClickRepeat = var10;
      } else if (var0 == 1401) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.onDrag = var10;
      } else if (var0 == 1402) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.onTargetLeave = var10;
      } else if (var0 == 1403) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.onInvTransmit = var10;
      } else if (1404 == var0) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.onTargetEnter = var10;
      } else if (1405 == var0) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.onDragComplete = var10;
      } else if (var0 == 1406) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.onLoad = var10;
      } else if (var0 == 1407) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.onOp = var10;
         var4.invTransmitTriggers = var6;
      } else if (var0 == 1408) {
         var4.onClick = var10;
      } else if (var0 == 1409) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.onMouseOver = var10;
      } else if (var0 == 1410) {
         var4.onScrollWheel = var10;
      } else if (var0 == 1411) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.onRelease = var10;
      } else if (1412 == var0) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.onHold = var10;
      } else if (var0 == 1414) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.onMouseRepeat = var10;
         var4.statTransmitTriggers = var6;
      } else if (1415 == var0) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.onVarTransmit = var10;
         var4.varTransmitTriggers = var6;
      } else if (var0 == 1416) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.onTimer = var10;
      } else if (var0 == 1417) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.onMouseLeave = var10;
      } else if (var0 == 1418) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.ft = var10;
      } else if (1419 == var0) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.fu = var10;
      } else if (var0 == 1420) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.gs = var10;
      } else if (1421 == var0) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.gj = var10;
      } else if (1422 == var0) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.ga = var10;
      } else if (var0 == 1423) {
         var4.gt = var10;
      } else if (1424 == var0) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.gu = var10;
      } else if (1425 == var0) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.gy = var10;
      } else if (var0 == 1426) {
         var4.gd = var10;
      } else if (var0 == 1427) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.gh = var10;
      } else if (1428 == var0) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.gg = var10;
      } else if (var0 == 1429) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.ge = var10;
      } else if (var0 == 1430) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.gr = var10;
      } else if (var0 == 1431) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.go = var10;
      } else if (var0 == 1434) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.gw = var10;
      } else if (1435 == var0) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         var4.fk = var10;
      } else {
         if (var0 < 1436) {
            return 2;
         }

         if (var3 != -1) {
            throw new IllegalStateException();
         }

         if (var0 > 1439) {
            return 2;
         }

         if (var3 != -1) {
            throw new IllegalStateException();
         }

         mt var9 = var4.br();
         if (null != var9) {
            if (var3 != -1) {
               throw new IllegalStateException();
            }

            if (var0 == 1436) {
               if (var3 != -1) {
                  throw new IllegalStateException();
               }

               var9.au = var10;
            } else if (1437 == var0) {
               if (var3 != -1) {
                  throw new IllegalStateException();
               }

               var9.ab = var10;
            } else if (var0 == 1438) {
               if (var3 != -1) {
                  throw new IllegalStateException();
               }

               var9.aq = var10;
            } else if (1439 == var0) {
               if (var3 != -1) {
                  throw new IllegalStateException();
               }

               var9.ac = var10;
            }
         }
      }

      var4.hasListener = true;
      return 1;
   }

   static void hh_renamed() {
      Client.packetWriter.af();
      Client.packetWriter.bit.index = 0;
      Client.packetWriter.serverPacket0 = null;
      Client.packetWriter.ao = null;
      Client.packetWriter.ax = null;
      Client.packetWriter.ai = null;
      Client.packetWriter.al = 0;
      Client.packetWriter.aa = 0;
      Client.ea = 0;
      Client.menuOptionsCount = 0;
      Client.isMiniMenuOpen = false;
      Client.tp = 0;
      Client.te = 0;

      int var1;
      for(var1 = 0; var1 < 2048; ++var1) {
         Client.players[var1] = null;
      }

      MusicPatchNode.localPlayer = null;

      for(var1 = 0; var1 < Client.npcs.length; ++var1) {
         Npc var2 = Client.npcs[var1];
         if (var2 != null) {
            var2.sequenceFrameCycle = -1052277865;
            var2.false0 = false;
         }
      }

      Inventory.itemContainers = new NodeHashTable(32);
      fd.hi_renamed(30);

      for(var1 = 0; var1 < 100; ++var1) {
         Client.rf[var1] = true;
      }

      an.io_renamed();
   }

   static final void kd_renamed(int var0, int var1) {
      NodeDeque var3 = Client.objStacks[GameShell.plane * -1727408401][var0][var1];
      if (var3 == null) {
         bx.scene.ak(-1727408401 * GameShell.plane, var0, var1);
      } else {
         long var4 = -99999999L;
         Obj var6 = null;

         Obj var7;
         for(var7 = (Obj)var3.last(); var7 != null; var7 = (Obj)var3.previous()) {
            ObjType var8 = HeadbarUpdate.getObjType(var7.id * 176307405);
            long var9 = (long)(var8.cost * -1706039181);
            if (1 == var8.stackable * 1552863327) {
               var9 *= -1745152527 * var7.quantity < Integer.MAX_VALUE ? (long)(1 + var7.quantity * -1745152527) : (long)(var7.quantity * -1745152527);
            }

            if (var9 > var4) {
               var4 = var9;
               var6 = var7;
            }
         }

         if (null == var6) {
            bx.scene.ak(GameShell.plane * -1727408401, var0, var1);
         } else {
            var3.addLast(var6);
            Obj var12 = null;
            Obj var13 = null;

            for(var7 = (Obj)var3.last(); null != var7; var7 = (Obj)var3.previous()) {
               if (var6.id * 176307405 != var7.id * 176307405) {
                  if (var12 == null) {
                     var12 = var7;
                  }

                  if (176307405 * var12.id != var7.id * 176307405 && var13 == null) {
                     var13 = var7;
                  }
               }
            }

            long var10 = ir.aa_renamed(var0, var1, 3, false, 0);
            bx.scene.newObjStack(-1727408401 * GameShell.plane, var0, var1, fq.getTileHeight(64 + var0 * 128, 64 + 128 * var1, GameShell.plane * -1727408401), var6, var10, var12, var13);
         }
      }
   }

   static String lp_renamed(String var0, Component var1) {
      if (var0.indexOf("%") != -1) {
         for(int var3 = 1; var3 <= 5; ++var3) {
            while(true) {
               int var4 = var0.indexOf("%" + var3);
               if (-1 == var4) {
                  break;
               }

               String var5 = var0.substring(0, var4);
               int var7 = ArchiveLoader.lx_renamed(var1, var3 - 1);
               String var6;
               if (var7 < 999999999) {
                  var6 = Integer.toString(var7);
               } else {
                  var6 = "*";
               }

               var0 = var5 + var6 + var0.substring(var4 + 2);
            }
         }
      }

      return var0;
   }
}
