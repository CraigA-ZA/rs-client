public class fa {
   int an = -2023339089;
   long af;
   IterableNodeDeque aw = new IterableNodeDeque();

   public fa(Packet var1) {
      this.af(var1);
   }

   void af(Packet var1) {
      this.af = var1.g8s() * -6484480482305074947L;
      this.an = var1.g4s() * 2023339089;

      for(int var3 = var1.g1(); var3 != 0; var3 = var1.g1()) {
         Object var4;
         if (3 == var3) {
            var4 = new ge(this);
         } else if (var3 == 1) {
            var4 = new fx(this);
         } else if (13 == var3) {
            var4 = new ft(this);
         } else if (var3 == 4) {
            var4 = new fv(this);
         } else if (var3 == 6) {
            var4 = new fm(this);
         } else if (5 == var3) {
            var4 = new fd(this);
         } else if (2 == var3) {
            var4 = new fy(this);
         } else if (var3 == 7) {
            var4 = new fo(this);
         } else if (var3 == 14) {
            var4 = new fn(this);
         } else if (8 == var3) {
            var4 = new go(this);
         } else if (var3 == 9) {
            var4 = new gt(this);
         } else if (10 == var3) {
            var4 = new ff(this);
         } else if (11 == var3) {
            var4 = new fw(this);
         } else if (12 == var3) {
            var4 = new fc(this);
         } else {
            if (15 != var3) {
               throw new RuntimeException("");
            }

            var4 = new gs(this);
         }

         ((fb)var4).af(var1);
         this.aw.addFirst((Node)var4);
      }

   }

   public void an(fj var1) {
      if (-7997171180678003627L * this.af == 3071145065741142973L * var1.ac && var1.au * -584024417 == 1818498225 * this.an) {
         for(fb var3 = (fb)this.aw.last(); var3 != null; var3 = (fb)this.aw.previous()) {
            var3.an(var1);
         }

         var1.au += 2008489311;
      } else {
         throw new RuntimeException("");
      }
   }

   static int al_renamed() {
      return 1145780727 * in.ab.as;
   }

   static final void ji_renamed() {
      for(Projectile var1 = (Projectile)Client.projectiles.last(); null != var1; var1 = (Projectile)Client.projectiles.previous()) {
         if (GameShell.plane * -1727408401 == -850668143 * var1.frame && -1886224337 * Client.ep <= -1203783373 * var1.cycleStart) {
            if (Client.ep * -1886224337 >= -2048301599 * var1.targetIndex) {
               if (803751093 * var1.int3 > 0) {
                  Npc var2 = Client.npcs[var1.int3 * 803751093 - 1];
                  if (null != var2 && 1144428983 * var2.bx >= 0 && 1144428983 * var2.bx < 13312 && var2.bo * -411750205 >= 0 && -411750205 * var2.bo < 13312) {
                     var1.setDestination(1144428983 * var2.bx, -411750205 * var2.bo, fq.getTileHeight(var2.bx * 1144428983, -411750205 * var2.bo, -850668143 * var1.frame) - var1.id * -860121869, -1886224337 * Client.ep);
                  }
               }

               if (var1.int3 * 803751093 < 0) {
                  int var3 = -(803751093 * var1.int3) - 1;
                  Player var4;
                  if (-549033243 * Client.localPlayerIndex == var3) {
                     var4 = MusicPatchNode.localPlayer;
                  } else {
                     var4 = Client.players[var3];
                  }

                  if (var4 != null && 1144428983 * var4.bx >= 0 && var4.bx * 1144428983 < 13312 && -411750205 * var4.bo >= 0 && -411750205 * var4.bo < 13312) {
                     var1.setDestination(1144428983 * var4.bx, var4.bo * -411750205, fq.getTileHeight(var4.bx * 1144428983, -411750205 * var4.bo, -850668143 * var1.frame) - -860121869 * var1.id, Client.ep * -1886224337);
                  }
               }

               var1.advance(-1795081153 * Client.ja);
               bx.scene.ao(-1727408401 * GameShell.plane, (int)var1.speedZ, (int)var1.ai, (int)var1.accelerationZ, 60, var1, 650783873 * var1.yaw, -1L, false);
            }
         } else {
            var1.remove();
         }
      }

   }

   static void kg_renamed(Npc var0) {
      var0.bm = 1763542591 * var0.type.size;
      var0.dx = var0.type.bj * -1952936367;
      var0.readySequence = var0.type.ai * 869101579;
      var0.walkLeftSequence = -1784513249 * var0.type.ag;
      var0.bg = 1886938753 * var0.type.ah;
      var0.walkRightSequence = var0.type.av * 2010418861;
      var0.turnLeftSequence = var0.type.ay * -133009915;
      var0.bj = var0.type.ao * -1457034847;
      var0.sequence = var0.type.ax * -1686059033;
      var0.runSequence = -1079417805 * var0.type.ar;
      var0.overheadTextCyclesRemaining = var0.type.am * -2020975041;
      var0.npcCycle = var0.type.as * 1337010697;
      var0.bv = 269496349 * var0.type.aj;
      var0.turnRightSequence = -2121315781 * var0.type.ak;
      var0.bp = var0.type.ambient * -605946035;
      var0.targetIndex = var0.type.ad * -76847983;
      var0.movementFrameCycle = var0.type.contrast * -1771433781;
   }
}
