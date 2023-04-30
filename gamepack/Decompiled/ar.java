import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

class ar implements SSLSession {
   public static int[] au;
   // $FF: synthetic field
   final ax this$1;

   ar(ax var1) {
      this.this$1 = var1;
   }

   public int getApplicationBufferSize() {
      return 0;
   }

   public String getCipherSuite() {
      throw new UnsupportedOperationException();
   }

   public long getCreationTime() {
      throw new UnsupportedOperationException();
   }

   public byte[] getId() {
      throw new UnsupportedOperationException();
   }

   public long getLastAccessedTime() {
      throw new UnsupportedOperationException();
   }

   public Certificate[] getLocalCertificates() {
      throw new UnsupportedOperationException();
   }

   public Principal getLocalPrincipal() {
      throw new UnsupportedOperationException();
   }

   public int getPacketBufferSize() {
      throw new UnsupportedOperationException();
   }

   public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
      return null;
   }

   public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
      return this.this$1.af;
   }

   public String getPeerHost() {
      throw new UnsupportedOperationException();
   }

   public int getPeerPort() {
      return 0;
   }

   public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
      return null;
   }

   public String getProtocol() {
      throw new UnsupportedOperationException();
   }

   public SSLSessionContext getSessionContext() {
      throw new UnsupportedOperationException();
   }

   public Object getValue(String var1) {
      throw new UnsupportedOperationException();
   }

   public String[] getValueNames() {
      throw new UnsupportedOperationException();
   }

   public void invalidate() {
      throw new UnsupportedOperationException();
   }

   public boolean isValid() {
      throw new UnsupportedOperationException();
   }

   public void putValue(String var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   public void removeValue(String var1) {
      throw new UnsupportedOperationException();
   }

   static final void doAction(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
      if (var2 >= 2000) {
         var2 -= 2000;
      }

      Npc var10;
      PacketBitNode var11;
      if (var2 == 11) {
         var10 = Client.npcs[var3];
         if (null != var10) {
            Client.mouseCrossX = var7 * 1956692579;
            Client.mouseCrossY = 956660059 * var8;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * var0;
            Client.destinationY = 875414437 * var1;
            var11 = mi.an_renamed(ClientProt.dc, Client.packetWriter.au);
            var11.bit.p2LE(var3);
            var11.bit.dh(Client.sh.av(82) ? 1 : 0);
            Client.packetWriter.aw(var11);
         }
      }

      PacketBitNode var17;
      if (6 == var2) {
         Client.mouseCrossX = 1956692579 * var7;
         Client.mouseCrossY = 956660059 * var8;
         Client.mv = 1387316670;
         Client.mouseCrossState = 0;
         Client.destinationX = -1970850269 * var0;
         Client.destinationY = 875414437 * var1;
         var17 = mi.an_renamed(ClientProt.bp, Client.packetWriter.au);
         var17.bit.dy(var3);
         var17.bit.dh(Client.sh.av(82) ? 1 : 0);
         var17.bit.dy(var1 + 827352769 * Scenery.baseY);
         var17.bit.p2LE(-1232093375 * jm.baseX + var0);
         Client.packetWriter.aw(var17);
      }

      if (13 == var2) {
         var10 = Client.npcs[var3];
         if (var10 != null) {
            Client.mouseCrossX = var7 * 1956692579;
            Client.mouseCrossY = var8 * 956660059;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = var0 * -1970850269;
            Client.destinationY = var1 * 875414437;
            var11 = mi.an_renamed(ClientProt.bc, Client.packetWriter.au);
            var11.bit.bu(Client.sh.av(82) ? 1 : 0);
            var11.bit.dy(var3);
            Client.packetWriter.aw(var11);
         }
      }

      if (5 == var2) {
         Client.mouseCrossX = 1956692579 * var7;
         Client.mouseCrossY = 956660059 * var8;
         Client.mv = 1387316670;
         Client.mouseCrossState = 0;
         Client.destinationX = var0 * -1970850269;
         Client.destinationY = 875414437 * var1;
         var17 = mi.an_renamed(ClientProt.bq, Client.packetWriter.au);
         var17.bit.ds(jm.baseX * -1232093375 + var0);
         var17.bit.p2LE(var3);
         var17.bit.ds(827352769 * Scenery.baseY + var1);
         var17.bit.dp(Client.sh.av(82) ? 1 : 0);
         Client.packetWriter.aw(var17);
      }

      if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || 1012 == var2) {
         ey.worldMap0.menuAction(var2, var3, new Coord(var0), new Coord(var1));
      }

      if (19 == var2) {
         Client.mouseCrossX = var7 * 1956692579;
         Client.mouseCrossY = var8 * 956660059;
         Client.mv = 1387316670;
         Client.mouseCrossState = 0;
         Client.destinationX = var0 * -1970850269;
         Client.destinationY = 875414437 * var1;
         var17 = mi.an_renamed(ClientProt.bz, Client.packetWriter.au);
         var17.bit.dy(var1 + Scenery.baseY * 827352769);
         var17.bit.ds(var3);
         var17.bit.bu(Client.sh.av(82) ? 1 : 0);
         var17.bit.ds(jm.baseX * -1232093375 + var0);
         Client.packetWriter.aw(var17);
      }

      if (var2 == 1001) {
         Client.mouseCrossX = var7 * 1956692579;
         Client.mouseCrossY = var8 * 956660059;
         Client.mv = 1387316670;
         Client.mouseCrossState = 0;
         Client.destinationX = -1970850269 * var0;
         Client.destinationY = 875414437 * var1;
         var17 = mi.an_renamed(ClientProt.cw, Client.packetWriter.au);
         var17.bit.dp(Client.sh.av(82) ? 1 : 0);
         var17.bit.ds(var3);
         var17.bit.dy(-1232093375 * jm.baseX + var0);
         var17.bit.ds(var1 + 827352769 * Scenery.baseY);
         Client.packetWriter.aw(var17);
      }

      if (23 == var2) {
         if (Client.isMiniMenuOpen) {
            bx.scene.bn();
         } else {
            bx.scene.menuOpen(GameShell.plane * -1727408401, var0, var1, true);
         }
      }

      int var12;
      Component var18;
      if (var2 == 28) {
         var17 = mi.an_renamed(ClientProt.ci, Client.packetWriter.au);
         var17.bit.ba(var1);
         Client.packetWriter.aw(var17);
         var18 = gh.getInterfaceComponent(var1);
         if (var18 != null && var18.cs1Instructions != null && var18.cs1Instructions[0][0] == 5) {
            var12 = var18.cs1Instructions[0][1];
            Varps.Varps_main[var12] = 1 - Varps.Varps_main[var12];
            al.md_renamed(var12);
         }
      }

      Player var19;
      if (47 == var2) {
         var19 = Client.players[var3];
         if (var19 != null) {
            Client.mouseCrossX = 1956692579 * var7;
            Client.mouseCrossY = var8 * 956660059;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = var0 * -1970850269;
            Client.destinationY = 875414437 * var1;
            var11 = mi.an_renamed(ClientProt.cf, Client.packetWriter.au);
            var11.bit.dp(Client.sh.av(82) ? 1 : 0);
            var11.bit.p2LE(var3);
            Client.packetWriter.aw(var11);
         }
      }

      if (var2 == 7) {
         var10 = Client.npcs[var3];
         if (null != var10) {
            Client.mouseCrossX = var7 * 1956692579;
            Client.mouseCrossY = var8 * 956660059;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = var0 * -1970850269;
            Client.destinationY = var1 * 875414437;
            var11 = mi.an_renamed(ClientProt.du, Client.packetWriter.au);
            var11.bit.du(Client.sh.av(82) ? 1 : 0);
            var11.bit.ba(-1164741861 * lh.ix);
            var11.bit.dy(var3);
            var11.bit.ds(fw.iz * -1518641849);
            var11.bit.p2(896780031 * WorldMapSectionType.ow);
            Client.packetWriter.aw(var11);
         }
      }

      if (var2 == 50) {
         var19 = Client.players[var3];
         if (null != var19) {
            Client.mouseCrossX = 1956692579 * var7;
            Client.mouseCrossY = 956660059 * var8;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * var0;
            Client.destinationY = var1 * 875414437;
            var11 = mi.an_renamed(ClientProt.al, Client.packetWriter.au);
            var11.bit.ds(var3);
            var11.bit.dh(Client.sh.av(82) ? 1 : 0);
            Client.packetWriter.aw(var11);
         }
      }

      if (var2 == 10) {
         var10 = Client.npcs[var3];
         if (var10 != null) {
            Client.mouseCrossX = 1956692579 * var7;
            Client.mouseCrossY = var8 * 956660059;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * var0;
            Client.destinationY = var1 * 875414437;
            var11 = mi.an_renamed(ClientProt.dr, Client.packetWriter.au);
            var11.bit.dy(var3);
            var11.bit.dh(Client.sh.av(82) ? 1 : 0);
            Client.packetWriter.aw(var11);
         }
      }

      Component var21;
      if (57 == var2 || var2 == 1007) {
         var21 = SoundSystem.getComponentChild(var1, var0);
         if (var21 != null) {
            Message.ks_renamed(var3, var1, var0, var4, var6);
         }
      }

      if (14 == var2) {
         var19 = Client.players[var3];
         if (null != var19) {
            Client.mouseCrossX = 1956692579 * var7;
            Client.mouseCrossY = var8 * 956660059;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = var0 * -1970850269;
            Client.destinationY = 875414437 * var1;
            var11 = mi.an_renamed(ClientProt.bx, Client.packetWriter.au);
            var11.bit.p2(var3);
            var11.bit.dh(Client.sh.av(82) ? 1 : 0);
            var11.bit.dy(896780031 * WorldMapSectionType.ow);
            var11.bit.ba(lh.ix * -1164741861);
            var11.bit.p2(fw.iz * -1518641849);
            Client.packetWriter.aw(var11);
         }
      }

      if (var2 == 48) {
         var19 = Client.players[var3];
         if (null != var19) {
            Client.mouseCrossX = var7 * 1956692579;
            Client.mouseCrossY = 956660059 * var8;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * var0;
            Client.destinationY = var1 * 875414437;
            var11 = mi.an_renamed(ClientProt.az, Client.packetWriter.au);
            var11.bit.dp(Client.sh.av(82) ? 1 : 0);
            var11.bit.p2(var3);
            Client.packetWriter.aw(var11);
         }
      }

      if (var2 == 9) {
         var10 = Client.npcs[var3];
         if (var10 != null) {
            Client.mouseCrossX = var7 * 1956692579;
            Client.mouseCrossY = var8 * 956660059;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * var0;
            Client.destinationY = 875414437 * var1;
            var11 = mi.an_renamed(ClientProt.dh, Client.packetWriter.au);
            var11.bit.bu(Client.sh.av(82) ? 1 : 0);
            var11.bit.ds(var3);
            Client.packetWriter.aw(var11);
         }
      }

      if (51 == var2) {
         var19 = Client.players[var3];
         if (null != var19) {
            Client.mouseCrossX = 1956692579 * var7;
            Client.mouseCrossY = 956660059 * var8;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * var0;
            Client.destinationY = 875414437 * var1;
            var11 = mi.an_renamed(ClientProt.at, Client.packetWriter.au);
            var11.bit.dy(var3);
            var11.bit.dp(Client.sh.av(82) ? 1 : 0);
            Client.packetWriter.aw(var11);
         }
      }

      if (3 == var2) {
         Client.mouseCrossX = var7 * 1956692579;
         Client.mouseCrossY = 956660059 * var8;
         Client.mv = 1387316670;
         Client.mouseCrossState = 0;
         Client.destinationX = var0 * -1970850269;
         Client.destinationY = var1 * 875414437;
         var17 = mi.an_renamed(ClientProt.ay, Client.packetWriter.au);
         var17.bit.p2LE(-1232093375 * jm.baseX + var0);
         var17.bit.dh(Client.sh.av(82) ? 1 : 0);
         var17.bit.ds(var1 + Scenery.baseY * 827352769);
         var17.bit.dy(var3);
         Client.packetWriter.aw(var17);
      }

      if (var2 == 25) {
         var21 = SoundSystem.getComponentChild(var1, var0);
         if (null != var21) {
            gy.kp_renamed();
            am.kh_renamed(var1, var0, hc.af_renamed(KeyHandler.getComponentClickMask(var21)), var4);
            Client.isItemSelected = 0;
            Client.selectedSpellActionName = MusicPatchNode.nu_renamed(var21);
            if (null == Client.selectedSpellActionName) {
               Client.selectedSpellActionName = Strings.Strings_null;
            }

            if (var21.isIf3) {
               Client.selectedSpellName = var21.opbase + oa.colorStartTag(16777215);
            } else {
               Client.selectedSpellName = oa.colorStartTag(65280) + var21.spellName + oa.colorStartTag(16777215);
            }
         }

      } else {
         PacketBitNode var20;
         if (var2 == 24) {
            var21 = gh.getInterfaceComponent(var1);
            if (null != var21) {
               boolean var22 = true;
               if (1021339961 * var21.clientCode > 0) {
                  var22 = Message.mk_renamed(var21);
               }

               if (var22) {
                  var20 = mi.an_renamed(ClientProt.ci, Client.packetWriter.au);
                  var20.bit.ba(var1);
                  Client.packetWriter.aw(var20);
               }
            }
         }

         if (var2 == 1003) {
            Client.mouseCrossX = var7 * 1956692579;
            Client.mouseCrossY = var8 * 956660059;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            var10 = Client.npcs[var3];
            if (var10 != null) {
               NPCType var23 = var10.type;
               if (null != var23.transforms) {
                  var23 = var23.transform();
               }

               if (null != var23) {
                  var20 = mi.an_renamed(ClientProt.cc, Client.packetWriter.au);
                  var20.bit.p2LE(-1115372301 * var23.id);
                  Client.packetWriter.aw(var20);
               }
            }
         }

         if (20 == var2) {
            Client.mouseCrossX = var7 * 1956692579;
            Client.mouseCrossY = var8 * 956660059;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * var0;
            Client.destinationY = 875414437 * var1;
            var17 = mi.an_renamed(ClientProt.bi, Client.packetWriter.au);
            var17.bit.dy(-1232093375 * jm.baseX + var0);
            var17.bit.bu(Client.sh.av(82) ? 1 : 0);
            var17.bit.ds(var3);
            var17.bit.dy(var1 + Scenery.baseY * 827352769);
            Client.packetWriter.aw(var17);
         }

         if (var2 == 49) {
            var19 = Client.players[var3];
            if (var19 != null) {
               Client.mouseCrossX = 1956692579 * var7;
               Client.mouseCrossY = var8 * 956660059;
               Client.mv = 1387316670;
               Client.mouseCrossState = 0;
               Client.destinationX = -1970850269 * var0;
               Client.destinationY = var1 * 875414437;
               var11 = mi.an_renamed(ClientProt.ca, Client.packetWriter.au);
               var11.bit.dy(var3);
               var11.bit.dp(Client.sh.av(82) ? 1 : 0);
               Client.packetWriter.aw(var11);
            }
         }

         if (var2 == 8) {
            var10 = Client.npcs[var3];
            if (var10 != null) {
               Client.mouseCrossX = var7 * 1956692579;
               Client.mouseCrossY = 956660059 * var8;
               Client.mv = 1387316670;
               Client.mouseCrossState = 0;
               Client.destinationX = -1970850269 * var0;
               Client.destinationY = var1 * 875414437;
               var11 = mi.an_renamed(ClientProt.ce, Client.packetWriter.au);
               var11.bit.dy(616923277 * Client.op);
               var11.bit.p4ME(96656415 * jg.ou);
               var11.bit.p2LE(var3);
               var11.bit.dy(145251849 * Client.oa);
               var11.bit.dh(Client.sh.av(82) ? 1 : 0);
               Client.packetWriter.aw(var11);
            }
         }

         if (var2 == 2) {
            Client.mouseCrossX = var7 * 1956692579;
            Client.mouseCrossY = 956660059 * var8;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * var0;
            Client.destinationY = var1 * 875414437;
            var17 = mi.an_renamed(ClientProt.ae, Client.packetWriter.au);
            var17.bit.dh(Client.sh.av(82) ? 1 : 0);
            var17.bit.p2LE(var3);
            var17.bit.p2LE(Client.op * 616923277);
            var17.bit.p2LE(var0 + jm.baseX * -1232093375);
            var17.bit.ds(145251849 * Client.oa);
            var17.bit.p4ME(96656415 * jg.ou);
            var17.bit.ds(var1 + 827352769 * Scenery.baseY);
            Client.packetWriter.aw(var17);
         }

         if (var2 == 1002) {
            Client.mouseCrossX = 1956692579 * var7;
            Client.mouseCrossY = var8 * 956660059;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            var17 = mi.an_renamed(ClientProt.cv, Client.packetWriter.au);
            var17.bit.ds(var3);
            Client.packetWriter.aw(var17);
         }

         if (var2 == 45) {
            var19 = Client.players[var3];
            if (null != var19) {
               Client.mouseCrossX = var7 * 1956692579;
               Client.mouseCrossY = var8 * 956660059;
               Client.mv = 1387316670;
               Client.mouseCrossState = 0;
               Client.destinationX = -1970850269 * var0;
               Client.destinationY = 875414437 * var1;
               var11 = mi.an_renamed(ClientProt.bd, Client.packetWriter.au);
               var11.bit.dh(Client.sh.av(82) ? 1 : 0);
               var11.bit.p2LE(var3);
               Client.packetWriter.aw(var11);
            }
         }

         if (var2 == 16) {
            Client.mouseCrossX = var7 * 1956692579;
            Client.mouseCrossY = 956660059 * var8;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * var0;
            Client.destinationY = var1 * 875414437;
            var17 = mi.an_renamed(ClientProt.ah, Client.packetWriter.au);
            var17.bit.p2(WorldMapSectionType.ow * 896780031);
            var17.bit.ds(jm.baseX * -1232093375 + var0);
            var17.bit.ds(var3);
            var17.bit.ds(Scenery.baseY * 827352769 + var1);
            var17.bit.p2(-1518641849 * fw.iz);
            var17.bit.bu(Client.sh.av(82) ? 1 : 0);
            var17.bit.p4ME(-1164741861 * lh.ix);
            Client.packetWriter.aw(var17);
         }

         if (var2 == 46) {
            var19 = Client.players[var3];
            if (var19 != null) {
               Client.mouseCrossX = var7 * 1956692579;
               Client.mouseCrossY = 956660059 * var8;
               Client.mv = 1387316670;
               Client.mouseCrossState = 0;
               Client.destinationX = var0 * -1970850269;
               Client.destinationY = var1 * 875414437;
               var11 = mi.an_renamed(ClientProt.bo, Client.packetWriter.au);
               var11.bit.p2LE(var3);
               var11.bit.du(Client.sh.av(82) ? 1 : 0);
               Client.packetWriter.aw(var11);
            }
         }

         if (4 == var2) {
            Client.mouseCrossX = 1956692579 * var7;
            Client.mouseCrossY = var8 * 956660059;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * var0;
            Client.destinationY = var1 * 875414437;
            var17 = mi.an_renamed(ClientProt.bs, Client.packetWriter.au);
            var17.bit.ds(-1232093375 * jm.baseX + var0);
            var17.bit.p2LE(827352769 * Scenery.baseY + var1);
            var17.bit.ds(var3);
            var17.bit.du(Client.sh.av(82) ? 1 : 0);
            Client.packetWriter.aw(var17);
         }

         if (var2 == 44) {
            var19 = Client.players[var3];
            if (null != var19) {
               Client.mouseCrossX = 1956692579 * var7;
               Client.mouseCrossY = var8 * 956660059;
               Client.mv = 1387316670;
               Client.mouseCrossState = 0;
               Client.destinationX = var0 * -1970850269;
               Client.destinationY = 875414437 * var1;
               var11 = mi.an_renamed(ClientProt.de, Client.packetWriter.au);
               var11.bit.du(Client.sh.av(82) ? 1 : 0);
               var11.bit.p2(var3);
               Client.packetWriter.aw(var11);
            }
         }

         if (var2 == 18) {
            Client.mouseCrossX = var7 * 1956692579;
            Client.mouseCrossY = var8 * 956660059;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * var0;
            Client.destinationY = var1 * 875414437;
            var17 = mi.an_renamed(ClientProt.do_renamed, Client.packetWriter.au);
            var17.bit.ds(var3);
            var17.bit.p2(Scenery.baseY * 827352769 + var1);
            var17.bit.dh(Client.sh.av(82) ? 1 : 0);
            var17.bit.p2LE(var0 + jm.baseX * -1232093375);
            Client.packetWriter.aw(var17);
         }

         if (58 == var2) {
            var21 = SoundSystem.getComponentChild(var1, var0);
            if (var21 != null) {
               if (null != var21.fk) {
                  ClientScriptEvent var24 = new ClientScriptEvent();
                  var24.component = var21;
                  var24.opIndex = var3 * -247460251;
                  var24.opbase = var6;
                  var24.args0 = var21.fk;
                  HeadbarUpdate.runClientScript(var24);
               }

               var11 = mi.an_renamed(ClientProt.ad, Client.packetWriter.au);
               var11.bit.p2LE(var0);
               var11.bit.p2(var4);
               var11.bit.p4LE16(jg.ou * 96656415);
               var11.bit.ds(145251849 * Client.oa);
               var11.bit.p4ME(var1);
               var11.bit.dy(Client.op * 616923277);
               Client.packetWriter.aw(var11);
            }
         }

         if (30 == var2 && null == Client.pg) {
            do_renamed.kf_renamed(var1, var0);
            Client.pg = SoundSystem.getComponentChild(var1, var0);
            fw.ma_renamed(Client.pg);
         }

         if (26 == var2) {
            fc.ml_renamed();
         }

         if (var2 == 15) {
            var19 = Client.players[var3];
            if (var19 != null) {
               Client.mouseCrossX = var7 * 1956692579;
               Client.mouseCrossY = var8 * 956660059;
               Client.mv = 1387316670;
               Client.mouseCrossState = 0;
               Client.destinationX = -1970850269 * var0;
               Client.destinationY = 875414437 * var1;
               var11 = mi.an_renamed(ClientProt.bl, Client.packetWriter.au);
               var11.bit.ds(145251849 * Client.oa);
               var11.bit.dy(616923277 * Client.op);
               var11.bit.p2LE(var3);
               var11.bit.dh(Client.sh.av(82) ? 1 : 0);
               var11.bit.ba(96656415 * jg.ou);
               Client.packetWriter.aw(var11);
            }
         }

         if (12 == var2) {
            var10 = Client.npcs[var3];
            if (var10 != null) {
               Client.mouseCrossX = var7 * 1956692579;
               Client.mouseCrossY = var8 * 956660059;
               Client.mv = 1387316670;
               Client.mouseCrossState = 0;
               Client.destinationX = var0 * -1970850269;
               Client.destinationY = 875414437 * var1;
               var11 = mi.an_renamed(ClientProt.be, Client.packetWriter.au);
               var11.bit.dy(var3);
               var11.bit.du(Client.sh.av(82) ? 1 : 0);
               Client.packetWriter.aw(var11);
            }
         }

         if (1 == var2) {
            Client.mouseCrossX = 1956692579 * var7;
            Client.mouseCrossY = var8 * 956660059;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = var0 * -1970850269;
            Client.destinationY = var1 * 875414437;
            var17 = mi.an_renamed(ClientProt.bf, Client.packetWriter.au);
            var17.bit.dy(var3);
            var17.bit.p4ME(-1164741861 * lh.ix);
            var17.bit.p2(896780031 * WorldMapSectionType.ow);
            var17.bit.dy(var0 + -1232093375 * jm.baseX);
            var17.bit.dh(Client.sh.av(82) ? 1 : 0);
            var17.bit.dy(-1518641849 * fw.iz);
            var17.bit.ds(var1 + 827352769 * Scenery.baseY);
            Client.packetWriter.aw(var17);
         }

         if (17 == var2) {
            Client.mouseCrossX = var7 * 1956692579;
            Client.mouseCrossY = var8 * 956660059;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = var0 * -1970850269;
            Client.destinationY = var1 * 875414437;
            var17 = mi.an_renamed(ClientProt.ap, Client.packetWriter.au);
            var17.bit.dh(Client.sh.av(82) ? 1 : 0);
            var17.bit.p4ME(96656415 * jg.ou);
            var17.bit.ds(145251849 * Client.oa);
            var17.bit.p2(var3);
            var17.bit.p2LE(-1232093375 * jm.baseX + var0);
            var17.bit.dy(var1 + Scenery.baseY * 827352769);
            var17.bit.dy(Client.op * 616923277);
            Client.packetWriter.aw(var17);
         }

         if (21 == var2) {
            Client.mouseCrossX = var7 * 1956692579;
            Client.mouseCrossY = 956660059 * var8;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = var0 * -1970850269;
            Client.destinationY = var1 * 875414437;
            var17 = mi.an_renamed(ClientProt.db, Client.packetWriter.au);
            var17.bit.dy(jm.baseX * -1232093375 + var0);
            var17.bit.dh(Client.sh.av(82) ? 1 : 0);
            var17.bit.ds(827352769 * Scenery.baseY + var1);
            var17.bit.p2LE(var3);
            Client.packetWriter.aw(var17);
         }

         if (var2 == 29) {
            var17 = mi.an_renamed(ClientProt.ci, Client.packetWriter.au);
            var17.bit.ba(var1);
            Client.packetWriter.aw(var17);
            var18 = gh.getInterfaceComponent(var1);
            if (null != var18 && var18.cs1Instructions != null && 5 == var18.cs1Instructions[0][0]) {
               var12 = var18.cs1Instructions[0][1];
               if (var18.cs1ComparisonValues[0] != Varps.Varps_main[var12]) {
                  Varps.Varps_main[var12] = var18.cs1ComparisonValues[0];
                  al.md_renamed(var12);
               }
            }
         }

         if (var2 == 22) {
            Client.mouseCrossX = 1956692579 * var7;
            Client.mouseCrossY = var8 * 956660059;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            Client.destinationX = -1970850269 * var0;
            Client.destinationY = var1 * 875414437;
            var17 = mi.an_renamed(ClientProt.as, Client.packetWriter.au);
            var17.bit.p2LE(Scenery.baseY * 827352769 + var1);
            var17.bit.dp(Client.sh.av(82) ? 1 : 0);
            var17.bit.p2(var0 + jm.baseX * -1232093375);
            var17.bit.p2LE(var3);
            Client.packetWriter.aw(var17);
         }

         if (1004 == var2) {
            Client.mouseCrossX = 1956692579 * var7;
            Client.mouseCrossY = 956660059 * var8;
            Client.mv = 1387316670;
            Client.mouseCrossState = 0;
            var17 = mi.an_renamed(ClientProt.dm, Client.packetWriter.au);
            var17.bit.p2(Scenery.baseY * 827352769 + var1);
            var17.bit.p2LE(var3);
            var17.bit.p2LE(-1232093375 * jm.baseX + var0);
            Client.packetWriter.aw(var17);
         }

         if (0 != Client.isItemSelected * -303899309) {
            Client.isItemSelected = 0;
            fw.ma_renamed(gh.getInterfaceComponent(lh.ix * -1164741861));
         }

         if (Client.om) {
            gy.kp_renamed();
         }

      }
   }
}
