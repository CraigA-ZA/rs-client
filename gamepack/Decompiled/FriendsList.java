public class FriendsList extends UserList {
   int ac = -1405002149;
   final LoginType loginType;
   public LinkDeque friendLoginUpdates = new LinkDeque();

   public FriendsList(LoginType var1) {
      super(400);
      this.loginType = var1;
   }

   User[] newTypedArray(int var1) {
      return new Friend[var1];
   }

   public void read(Packet var1, int var2) {
      while(true) {
         if (var1.index * -1633313603 < var2) {
            boolean var4 = var1.g1() == 1;
            Username var5 = new Username(var1.cw(), this.loginType);
            Username var6 = new Username(var1.cw(), this.loginType);
            int var7 = var1.cl();
            int var8 = var1.g1();
            int var9 = var1.g1();
            boolean var10 = (var9 & 2) != 0;
            boolean var11 = 0 != (var9 & 1);
            if (var7 > 0) {
               var1.cw();
               var1.g1();
               var1.g4s();
            }

            var1.cw();
            if (var5 != null && var5.hasCleanName()) {
               Friend var12 = (Friend)this.bn(var5);
               if (var4) {
                  Friend var13 = (Friend)this.bn(var6);
                  if (null != var13 && var13 != var12) {
                     if (var12 != null) {
                        this.bg(var13);
                     } else {
                        var12 = var13;
                     }
                  }
               }

               if (var12 != null) {
                  this.bv(var12, var5, var6);
                  if (var7 != var12.au * 177258591) {
                     boolean var15 = true;

                     for(FriendLoginUpdate var14 = (FriendLoginUpdate)this.friendLoginUpdates.an(); null != var14; var14 = (FriendLoginUpdate)this.friendLoginUpdates.aw()) {
                        if (var14.username.equals(var5)) {
                           if (0 != var7 && 0 == var14.world) {
                              var14.af();
                              var15 = false;
                           } else if (0 == var7 && 0 != var14.world) {
                              var14.af();
                              var15 = false;
                           }
                        }
                     }

                     if (var15) {
                        this.friendLoginUpdates.af(new FriendLoginUpdate(var5, var7));
                     }
                  }
               } else {
                  if (this.bm() >= 400) {
                     continue;
                  }

                  var12 = (Friend)this.bf(var5, var6);
               }

               if (var12.au * 177258591 != var7) {
                  var12.ab = ((this.ac += -1405002149) * 2010685907 - 1) * 1270747397;
                  if (-1 == 177258591 * var12.au && var7 == 0) {
                     var12.ab = -(var12.ab * 1);
                  }

                  var12.au = var7 * -1128162401;
               }

               var12.aq = 1331866435 * var8;
               var12.af = var10;
               var12.an = var11;
               continue;
            }

            throw new IllegalStateException();
         }

         this.ba();
         return;
      }
   }

   User newInstance() {
      return new Friend();
   }

   public boolean aw(Username var1, boolean var2) {
      Friend var4 = (Friend)this.bj(var1);
      if (null == var4) {
         return false;
      } else {
         return !var2 || 0 != 177258591 * var4.au;
      }
   }

   static void je_renamed(hf var0) {
      if (var0 != null && null != var0.ab) {
         if (55577617 * var0.ab.childIndex >= 0) {
            Component var2 = gh.an_renamed(913615679 * var0.ab.parentId);
            if (var2 == null || var2.children == null || 0 == var2.children.length || 55577617 * var0.ab.childIndex >= var2.children.length || var2.children[55577617 * var0.ab.childIndex] != var0.ab) {
               return;
            }
         }

         if (var0.ab.bg * 883712245 == 11 && var0.au * -469277123 == 0) {
            if (var0.ab.ap(-1583959695 * var0.aw, var0.ac * -1480602069, 0, 0)) {
               switch (var0.ab.be()) {
                  case 0:
                     Ignored.af_renamed(var0.ab.bx(), true, false);
                     break;
                  case 1:
                     if (hq.au_renamed(KeyHandler.getComponentClickMask(var0.ab))) {
                        int[] var5 = var0.ab.bo();
                        if (null != var5) {
                           PacketBitNode var3 = mi.an_renamed(ClientProt.ct, Client.packetWriter.au);
                           var3.bit.eb(var5[0]);
                           var3.bit.es(var0.ab.id * 1713081171);
                           var3.bit.ba(var5[1]);
                           var3.bit.el(var0.ab.bk());
                           var3.bit.eb(var5[2]);
                           var3.bit.dn(55577617 * var0.ab.childIndex);
                           Client.packetWriter.aw(var3);
                        }
                     }
               }
            }
         } else if (12 == var0.ab.bg * 883712245) {
            mz var4 = var0.ab.bj();
            if (var4 != null && var4.ci()) {
               switch (-469277123 * var0.au) {
                  case 0:
                     Client.si.ax(var0.ab);
                     var4.an(true);
                     var4.br(var0.aw * -1583959695, -1480602069 * var0.ac, Client.sh.av(82), Client.sh.av(81));
                     break;
                  case 1:
                     var4.bg(-1583959695 * var0.aw, -1480602069 * var0.ac);
               }
            }
         }

      }
   }
}
