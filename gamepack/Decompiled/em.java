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

   static int ao_renamed(int var0, ClientScript var1, boolean var2) {
      Component var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = gh.getInterfaceComponent(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
      } else {
         var4 = var2 ? SoundSystem.ag : an.ai;
      }

      String var5 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
      int[] var6 = null;
      if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
         int var7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
         if (var7 > 0) {
            for(var6 = new int[var7]; var7-- > 0; var6[var7] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]) {
            }
         }

         var5 = var5.substring(0, var5.length() - 1);
      }

      Object[] var12 = new Object[var5.length() + 1];

      int var8;
      for(var8 = var12.length - 1; var8 >= 1; --var8) {
         if (var5.charAt(var8 - 1) == 's') {
            var12[var8] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987];
         } else {
            var12[var8] = new Integer(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
         }
      }

      var8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
      if (var8 != -1) {
         var12[0] = new Integer(var8);
      } else {
         var12 = null;
      }

      if (1400 == var0) {
         var4.onClick = var12;
      } else if (var0 == 1401) {
         var4.onHold = var12;
      } else if (var0 == 1402) {
         var4.onRelease = var12;
      } else if (var0 == 1403) {
         var4.onMouseOver = var12;
      } else if (1404 == var0) {
         var4.onMouseLeave = var12;
      } else if (1405 == var0) {
         var4.onDrag = var12;
      } else if (var0 == 1406) {
         var4.onTargetLeave = var12;
      } else if (var0 == 1407) {
         var4.onVarTransmit = var12;
         var4.varTransmitTriggers = var6;
      } else if (var0 == 1408) {
         var4.onTimer = var12;
      } else if (var0 == 1409) {
         var4.onOp = var12;
      } else if (var0 == 1410) {
         var4.onDragComplete = var12;
      } else if (var0 == 1411) {
         var4.onClickRepeat = var12;
      } else if (1412 == var0) {
         var4.onMouseRepeat = var12;
      } else if (var0 == 1414) {
         var4.onInvTransmit = var12;
         var4.invTransmitTriggers = var6;
      } else if (1415 == var0) {
         var4.onStatTransmit = var12;
         var4.statTransmitTriggers = var6;
      } else if (var0 == 1416) {
         var4.onTargetEnter = var12;
      } else if (var0 == 1417) {
         var4.onScrollWheel = var12;
      } else if (var0 == 1418) {
         var4.onChatTransmit = var12;
      } else if (1419 == var0) {
         var4.onKey = var12;
      } else if (var0 == 1420) {
         var4.onFriendTransmit = var12;
      } else if (1421 == var0) {
         var4.onClanTransmit = var12;
      } else if (1422 == var0) {
         var4.onMiscTransmit = var12;
      } else if (var0 == 1423) {
         var4.onDialogAbort = var12;
      } else if (1424 == var0) {
         var4.onSubChange = var12;
      } else if (1425 == var0) {
         var4.onStockTransmit = var12;
      } else if (var0 == 1426) {
         var4.gd = var12;
      } else if (var0 == 1427) {
         var4.gh = var12;
      } else if (1428 == var0) {
         var4.gg = var12;
      } else if (var0 == 1429) {
         var4.ge = var12;
      } else if (var0 == 1430) {
         var4.gr = var12;
      } else if (var0 == 1431) {
         var4.go = var12;
      } else if (var0 == 1434) {
         var4.gw = var12;
      } else if (1435 == var0) {
         var4.fk = var12;
      } else {
         if (var0 < 1436 || var0 > 1439) {
            return 2;
         }

         mt var9 = var4.br();
         if (null != var9) {
            if (var0 == 1436) {
               var9.au = var12;
            } else if (1437 == var0) {
               var9.ab = var12;
            } else if (var0 == 1438) {
               var9.aq = var12;
            } else if (1439 == var0) {
               var9.ac = var12;
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
      Client.packetWriter.serverPacket0Length = 0;
      Client.packetWriter.aa = 0;
      Client.rebootTimer = 0;
      Client.menuOptionsCount = 0;
      Client.isMiniMenuOpen = false;
      Client.minimapState = 0;
      Client.destinationX = 0;

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
      fd.updateGameState(30);

      for(var1 = 0; var1 < 100; ++var1) {
         Client.rf[var1] = true;
      }

      an.io_renamed();
   }

   static final void kd_renamed(int var0, int var1) {
      NodeDeque var3 = Client.objStacks[GameShell.plane * -1727408401][var0][var1];
      if (var3 == null) {
         bx.scene.removeObjStack(-1727408401 * GameShell.plane, var0, var1);
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
            bx.scene.removeObjStack(GameShell.plane * -1727408401, var0, var1);
         } else {
            var3.addLast(var6);
            Obj var14 = null;
            Obj var15 = null;

            for(var7 = (Obj)var3.last(); null != var7; var7 = (Obj)var3.previous()) {
               if (var6.id * 176307405 != var7.id * 176307405) {
                  if (var14 == null) {
                     var14 = var7;
                  }

                  if (176307405 * var14.id != var7.id * 176307405 && var15 == null) {
                     var15 = var7;
                  }
               }
            }

            long var10 = FaceNormal.aa_renamed(var0, var1, 3, false, 0);
            bx.scene.newObjStack(-1727408401 * GameShell.plane, var0, var1, fq.getTileHeight(64 + var0 * 128, 64 + 128 * var1, GameShell.plane * -1727408401), var6, var10, var14, var15);
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
