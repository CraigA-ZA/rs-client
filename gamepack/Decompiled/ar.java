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

   static final void ke_renamed(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
      if (var2 >= 2000) {
         var2 -= 2000;
      }

      Npc var10;
      PacketBitNode var11;
      if (var2 == 11) {
         var10 = Client.npcs[var3];
         if (null != var10) {
            Client.mq = var7 * 1956692579;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = 875414437 * var1;
            var11 = mi.an_renamed(ClientProt.dc, Client.packetWriter.au);
            var11.bit.p2LE(var3);
            var11.bit.dh(Client.sh.av(82) ? 1 : 0);
            Client.packetWriter.aw(var11);
         }
      }

      PacketBitNode var13;
      if (6 == var2) {
         Client.mq = 1956692579 * var7;
         Client.mm = 956660059 * var8;
         Client.mv = 1387316670;
         Client.me = 0;
         Client.te = -1970850269 * var0;
         Client.th = 875414437 * var1;
         var13 = mi.an_renamed(ClientProt.bp, Client.packetWriter.au);
         var13.bit.dy(var3);
         var13.bit.dh(Client.sh.av(82) ? 1 : 0);
         var13.bit.dy(var1 + 827352769 * Scenery.jc);
         var13.bit.p2LE(-1232093375 * jm.ib + var0);
         Client.packetWriter.aw(var13);
      }

      if (13 == var2) {
         var10 = Client.npcs[var3];
         if (var10 != null) {
            Client.mq = var7 * 1956692579;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = var0 * -1970850269;
            Client.th = var1 * 875414437;
            var11 = mi.an_renamed(ClientProt.bc, Client.packetWriter.au);
            var11.bit.bu(Client.sh.av(82) ? 1 : 0);
            var11.bit.dy(var3);
            Client.packetWriter.aw(var11);
         }
      }

      if (5 == var2) {
         Client.mq = 1956692579 * var7;
         Client.mm = 956660059 * var8;
         Client.mv = 1387316670;
         Client.me = 0;
         Client.te = var0 * -1970850269;
         Client.th = 875414437 * var1;
         var13 = mi.an_renamed(ClientProt.bq, Client.packetWriter.au);
         var13.bit.ds(jm.ib * -1232093375 + var0);
         var13.bit.p2LE(var3);
         var13.bit.ds(827352769 * Scenery.jc + var1);
         var13.bit.dp(Client.sh.av(82) ? 1 : 0);
         Client.packetWriter.aw(var13);
      }

      if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || 1012 == var2) {
         ey.worldMap0.menuAction(var2, var3, new Coord(var0), new Coord(var1));
      }

      if (19 == var2) {
         Client.mq = var7 * 1956692579;
         Client.mm = var8 * 956660059;
         Client.mv = 1387316670;
         Client.me = 0;
         Client.te = var0 * -1970850269;
         Client.th = 875414437 * var1;
         var13 = mi.an_renamed(ClientProt.bz, Client.packetWriter.au);
         var13.bit.dy(var1 + Scenery.jc * 827352769);
         var13.bit.ds(var3);
         var13.bit.bu(Client.sh.av(82) ? 1 : 0);
         var13.bit.ds(jm.ib * -1232093375 + var0);
         Client.packetWriter.aw(var13);
      }

      if (var2 == 1001) {
         Client.mq = var7 * 1956692579;
         Client.mm = var8 * 956660059;
         Client.mv = 1387316670;
         Client.me = 0;
         Client.te = -1970850269 * var0;
         Client.th = 875414437 * var1;
         var13 = mi.an_renamed(ClientProt.cw, Client.packetWriter.au);
         var13.bit.dp(Client.sh.av(82) ? 1 : 0);
         var13.bit.ds(var3);
         var13.bit.dy(-1232093375 * jm.ib + var0);
         var13.bit.ds(var1 + 827352769 * Scenery.jc);
         Client.packetWriter.aw(var13);
      }

      if (23 == var2) {
         if (Client.isMiniMenuOpen) {
            bx.scene.bn();
         } else {
            bx.scene.menuOpen(GameShell.plane * -1727408401, var0, var1, true);
         }
      }

      int var12;
      Component var14;
      if (var2 == 28) {
         var13 = mi.an_renamed(ClientProt.ci, Client.packetWriter.au);
         var13.bit.ba(var1);
         Client.packetWriter.aw(var13);
         var14 = gh.an_renamed(var1);
         if (var14 != null && var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
            var12 = var14.cs1Instructions[0][1];
            Varps.Varps_main[var12] = 1 - Varps.Varps_main[var12];
            al.md_renamed(var12);
         }
      }

      Player var15;
      if (47 == var2) {
         var15 = Client.players[var3];
         if (var15 != null) {
            Client.mq = 1956692579 * var7;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = var0 * -1970850269;
            Client.th = 875414437 * var1;
            var11 = mi.an_renamed(ClientProt.cf, Client.packetWriter.au);
            var11.bit.dp(Client.sh.av(82) ? 1 : 0);
            var11.bit.p2LE(var3);
            Client.packetWriter.aw(var11);
         }
      }

      if (var2 == 7) {
         var10 = Client.npcs[var3];
         if (null != var10) {
            Client.mq = var7 * 1956692579;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = var0 * -1970850269;
            Client.th = var1 * 875414437;
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
         var15 = Client.players[var3];
         if (null != var15) {
            Client.mq = 1956692579 * var7;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = var1 * 875414437;
            var11 = mi.an_renamed(ClientProt.al, Client.packetWriter.au);
            var11.bit.ds(var3);
            var11.bit.dh(Client.sh.av(82) ? 1 : 0);
            Client.packetWriter.aw(var11);
         }
      }

      if (var2 == 10) {
         var10 = Client.npcs[var3];
         if (var10 != null) {
            Client.mq = 1956692579 * var7;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = var1 * 875414437;
            var11 = mi.an_renamed(ClientProt.dr, Client.packetWriter.au);
            var11.bit.dy(var3);
            var11.bit.dh(Client.sh.av(82) ? 1 : 0);
            Client.packetWriter.aw(var11);
         }
      }

      Component var17;
      if (57 == var2 || var2 == 1007) {
         var17 = SoundSystem.getComponentChild(var1, var0);
         if (var17 != null) {
            Message.ks_renamed(var3, var1, var0, var4, var6);
         }
      }

      if (14 == var2) {
         var15 = Client.players[var3];
         if (null != var15) {
            Client.mq = 1956692579 * var7;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = var0 * -1970850269;
            Client.th = 875414437 * var1;
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
         var15 = Client.players[var3];
         if (null != var15) {
            Client.mq = var7 * 1956692579;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = var1 * 875414437;
            var11 = mi.an_renamed(ClientProt.az, Client.packetWriter.au);
            var11.bit.dp(Client.sh.av(82) ? 1 : 0);
            var11.bit.p2(var3);
            Client.packetWriter.aw(var11);
         }
      }

      if (var2 == 9) {
         var10 = Client.npcs[var3];
         if (var10 != null) {
            Client.mq = var7 * 1956692579;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = 875414437 * var1;
            var11 = mi.an_renamed(ClientProt.dh, Client.packetWriter.au);
            var11.bit.bu(Client.sh.av(82) ? 1 : 0);
            var11.bit.ds(var3);
            Client.packetWriter.aw(var11);
         }
      }

      if (51 == var2) {
         var15 = Client.players[var3];
         if (null != var15) {
            Client.mq = 1956692579 * var7;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = 875414437 * var1;
            var11 = mi.an_renamed(ClientProt.at, Client.packetWriter.au);
            var11.bit.dy(var3);
            var11.bit.dp(Client.sh.av(82) ? 1 : 0);
            Client.packetWriter.aw(var11);
         }
      }

      if (3 == var2) {
         Client.mq = var7 * 1956692579;
         Client.mm = 956660059 * var8;
         Client.mv = 1387316670;
         Client.me = 0;
         Client.te = var0 * -1970850269;
         Client.th = var1 * 875414437;
         var13 = mi.an_renamed(ClientProt.ay, Client.packetWriter.au);
         var13.bit.p2LE(-1232093375 * jm.ib + var0);
         var13.bit.dh(Client.sh.av(82) ? 1 : 0);
         var13.bit.ds(var1 + Scenery.jc * 827352769);
         var13.bit.dy(var3);
         Client.packetWriter.aw(var13);
      }

      if (var2 == 25) {
         var17 = SoundSystem.getComponentChild(var1, var0);
         if (null != var17) {
            gy.kp_renamed();
            am.kh_renamed(var1, var0, hc.af_renamed(KeyHandler.getComponentClickMask(var17)), var4);
            Client.oq = 0;
            Client.oj = MusicPatchNode.nu_renamed(var17);
            if (null == Client.oj) {
               Client.oj = Strings.Strings_null;
            }

            if (var17.isIf3) {
               Client.selectedSpellName = var17.opbase + oa.colorStartTag(16777215);
            } else {
               Client.selectedSpellName = oa.colorStartTag(65280) + var17.spellName + oa.colorStartTag(16777215);
            }
         }

      } else {
         PacketBitNode var16;
         if (var2 == 24) {
            var17 = gh.an_renamed(var1);
            if (null != var17) {
               boolean var18 = true;
               if (1021339961 * var17.clientCode > 0) {
                  var18 = Message.mk_renamed(var17);
               }

               if (var18) {
                  var16 = mi.an_renamed(ClientProt.ci, Client.packetWriter.au);
                  var16.bit.ba(var1);
                  Client.packetWriter.aw(var16);
               }
            }
         }

         if (var2 == 1003) {
            Client.mq = var7 * 1956692579;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            var10 = Client.npcs[var3];
            if (var10 != null) {
               NPCType var19 = var10.type;
               if (null != var19.transforms) {
                  var19 = var19.transform();
               }

               if (null != var19) {
                  var16 = mi.an_renamed(ClientProt.cc, Client.packetWriter.au);
                  var16.bit.p2LE(-1115372301 * var19.ab);
                  Client.packetWriter.aw(var16);
               }
            }
         }

         if (20 == var2) {
            Client.mq = var7 * 1956692579;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = 875414437 * var1;
            var13 = mi.an_renamed(ClientProt.bi, Client.packetWriter.au);
            var13.bit.dy(-1232093375 * jm.ib + var0);
            var13.bit.bu(Client.sh.av(82) ? 1 : 0);
            var13.bit.ds(var3);
            var13.bit.dy(var1 + Scenery.jc * 827352769);
            Client.packetWriter.aw(var13);
         }

         if (var2 == 49) {
            var15 = Client.players[var3];
            if (var15 != null) {
               Client.mq = 1956692579 * var7;
               Client.mm = var8 * 956660059;
               Client.mv = 1387316670;
               Client.me = 0;
               Client.te = -1970850269 * var0;
               Client.th = var1 * 875414437;
               var11 = mi.an_renamed(ClientProt.ca, Client.packetWriter.au);
               var11.bit.dy(var3);
               var11.bit.dp(Client.sh.av(82) ? 1 : 0);
               Client.packetWriter.aw(var11);
            }
         }

         if (var2 == 8) {
            var10 = Client.npcs[var3];
            if (var10 != null) {
               Client.mq = var7 * 1956692579;
               Client.mm = 956660059 * var8;
               Client.mv = 1387316670;
               Client.me = 0;
               Client.te = -1970850269 * var0;
               Client.th = var1 * 875414437;
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
            Client.mq = var7 * 1956692579;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = var1 * 875414437;
            var13 = mi.an_renamed(ClientProt.ae, Client.packetWriter.au);
            var13.bit.dh(Client.sh.av(82) ? 1 : 0);
            var13.bit.p2LE(var3);
            var13.bit.p2LE(Client.op * 616923277);
            var13.bit.p2LE(var0 + jm.ib * -1232093375);
            var13.bit.ds(145251849 * Client.oa);
            var13.bit.p4ME(96656415 * jg.ou);
            var13.bit.ds(var1 + 827352769 * Scenery.jc);
            Client.packetWriter.aw(var13);
         }

         if (var2 == 1002) {
            Client.mq = 1956692579 * var7;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            var13 = mi.an_renamed(ClientProt.cv, Client.packetWriter.au);
            var13.bit.ds(var3);
            Client.packetWriter.aw(var13);
         }

         if (var2 == 45) {
            var15 = Client.players[var3];
            if (null != var15) {
               Client.mq = var7 * 1956692579;
               Client.mm = var8 * 956660059;
               Client.mv = 1387316670;
               Client.me = 0;
               Client.te = -1970850269 * var0;
               Client.th = 875414437 * var1;
               var11 = mi.an_renamed(ClientProt.bd, Client.packetWriter.au);
               var11.bit.dh(Client.sh.av(82) ? 1 : 0);
               var11.bit.p2LE(var3);
               Client.packetWriter.aw(var11);
            }
         }

         if (var2 == 16) {
            Client.mq = var7 * 1956692579;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = var1 * 875414437;
            var13 = mi.an_renamed(ClientProt.ah, Client.packetWriter.au);
            var13.bit.p2(WorldMapSectionType.ow * 896780031);
            var13.bit.ds(jm.ib * -1232093375 + var0);
            var13.bit.ds(var3);
            var13.bit.ds(Scenery.jc * 827352769 + var1);
            var13.bit.p2(-1518641849 * fw.iz);
            var13.bit.bu(Client.sh.av(82) ? 1 : 0);
            var13.bit.p4ME(-1164741861 * lh.ix);
            Client.packetWriter.aw(var13);
         }

         if (var2 == 46) {
            var15 = Client.players[var3];
            if (var15 != null) {
               Client.mq = var7 * 1956692579;
               Client.mm = 956660059 * var8;
               Client.mv = 1387316670;
               Client.me = 0;
               Client.te = var0 * -1970850269;
               Client.th = var1 * 875414437;
               var11 = mi.an_renamed(ClientProt.bo, Client.packetWriter.au);
               var11.bit.p2LE(var3);
               var11.bit.du(Client.sh.av(82) ? 1 : 0);
               Client.packetWriter.aw(var11);
            }
         }

         if (4 == var2) {
            Client.mq = 1956692579 * var7;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = var1 * 875414437;
            var13 = mi.an_renamed(ClientProt.bs, Client.packetWriter.au);
            var13.bit.ds(-1232093375 * jm.ib + var0);
            var13.bit.p2LE(827352769 * Scenery.jc + var1);
            var13.bit.ds(var3);
            var13.bit.du(Client.sh.av(82) ? 1 : 0);
            Client.packetWriter.aw(var13);
         }

         if (var2 == 44) {
            var15 = Client.players[var3];
            if (null != var15) {
               Client.mq = 1956692579 * var7;
               Client.mm = var8 * 956660059;
               Client.mv = 1387316670;
               Client.me = 0;
               Client.te = var0 * -1970850269;
               Client.th = 875414437 * var1;
               var11 = mi.an_renamed(ClientProt.de, Client.packetWriter.au);
               var11.bit.du(Client.sh.av(82) ? 1 : 0);
               var11.bit.p2(var3);
               Client.packetWriter.aw(var11);
            }
         }

         if (var2 == 18) {
            Client.mq = var7 * 1956692579;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = var1 * 875414437;
            var13 = mi.an_renamed(ClientProt.do, Client.packetWriter.au);
            var13.bit.ds(var3);
            var13.bit.p2(Scenery.jc * 827352769 + var1);
            var13.bit.dh(Client.sh.av(82) ? 1 : 0);
            var13.bit.p2LE(var0 + jm.ib * -1232093375);
            Client.packetWriter.aw(var13);
         }

         if (58 == var2) {
            var17 = SoundSystem.getComponentChild(var1, var0);
            if (var17 != null) {
               if (null != var17.fk) {
                  ClientScriptEvent var20 = new ClientScriptEvent();
                  var20.aw = var17;
                  var20.ab = var3 * -247460251;
                  var20.opbase = var6;
                  var20.args0 = var17.fk;
                  HeadbarUpdate.af_renamed(var20);
               }

               var11 = mi.an_renamed(ClientProt.ad, Client.packetWriter.au);
               var11.bit.p2LE(var0);
               var11.bit.p2(var4);
               var11.bit.el(jg.ou * 96656415);
               var11.bit.ds(145251849 * Client.oa);
               var11.bit.p4ME(var1);
               var11.bit.dy(Client.op * 616923277);
               Client.packetWriter.aw(var11);
            }
         }

         if (30 == var2 && null == Client.pg) {
            do.kf_renamed(var1, var0);
            Client.pg = SoundSystem.getComponentChild(var1, var0);
            fw.ma_renamed(Client.pg);
         }

         if (26 == var2) {
            fc.ml_renamed();
         }

         if (var2 == 15) {
            var15 = Client.players[var3];
            if (var15 != null) {
               Client.mq = var7 * 1956692579;
               Client.mm = var8 * 956660059;
               Client.mv = 1387316670;
               Client.me = 0;
               Client.te = -1970850269 * var0;
               Client.th = 875414437 * var1;
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
               Client.mq = var7 * 1956692579;
               Client.mm = var8 * 956660059;
               Client.mv = 1387316670;
               Client.me = 0;
               Client.te = var0 * -1970850269;
               Client.th = 875414437 * var1;
               var11 = mi.an_renamed(ClientProt.be, Client.packetWriter.au);
               var11.bit.dy(var3);
               var11.bit.du(Client.sh.av(82) ? 1 : 0);
               Client.packetWriter.aw(var11);
            }
         }

         if (1 == var2) {
            Client.mq = 1956692579 * var7;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = var0 * -1970850269;
            Client.th = var1 * 875414437;
            var13 = mi.an_renamed(ClientProt.bf, Client.packetWriter.au);
            var13.bit.dy(var3);
            var13.bit.p4ME(-1164741861 * lh.ix);
            var13.bit.p2(896780031 * WorldMapSectionType.ow);
            var13.bit.dy(var0 + -1232093375 * jm.ib);
            var13.bit.dh(Client.sh.av(82) ? 1 : 0);
            var13.bit.dy(-1518641849 * fw.iz);
            var13.bit.ds(var1 + 827352769 * Scenery.jc);
            Client.packetWriter.aw(var13);
         }

         if (17 == var2) {
            Client.mq = var7 * 1956692579;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = var0 * -1970850269;
            Client.th = var1 * 875414437;
            var13 = mi.an_renamed(ClientProt.ap, Client.packetWriter.au);
            var13.bit.dh(Client.sh.av(82) ? 1 : 0);
            var13.bit.p4ME(96656415 * jg.ou);
            var13.bit.ds(145251849 * Client.oa);
            var13.bit.p2(var3);
            var13.bit.p2LE(-1232093375 * jm.ib + var0);
            var13.bit.dy(var1 + Scenery.jc * 827352769);
            var13.bit.dy(Client.op * 616923277);
            Client.packetWriter.aw(var13);
         }

         if (21 == var2) {
            Client.mq = var7 * 1956692579;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = var0 * -1970850269;
            Client.th = var1 * 875414437;
            var13 = mi.an_renamed(ClientProt.db, Client.packetWriter.au);
            var13.bit.dy(jm.ib * -1232093375 + var0);
            var13.bit.dh(Client.sh.av(82) ? 1 : 0);
            var13.bit.ds(827352769 * Scenery.jc + var1);
            var13.bit.p2LE(var3);
            Client.packetWriter.aw(var13);
         }

         if (var2 == 29) {
            var13 = mi.an_renamed(ClientProt.ci, Client.packetWriter.au);
            var13.bit.ba(var1);
            Client.packetWriter.aw(var13);
            var14 = gh.an_renamed(var1);
            if (null != var14 && var14.cs1Instructions != null && 5 == var14.cs1Instructions[0][0]) {
               var12 = var14.cs1Instructions[0][1];
               if (var14.cs1Comparisons[0] != Varps.Varps_main[var12]) {
                  Varps.Varps_main[var12] = var14.cs1Comparisons[0];
                  al.md_renamed(var12);
               }
            }
         }

         if (var2 == 22) {
            Client.mq = 1956692579 * var7;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = var1 * 875414437;
            var13 = mi.an_renamed(ClientProt.as, Client.packetWriter.au);
            var13.bit.p2LE(Scenery.jc * 827352769 + var1);
            var13.bit.dp(Client.sh.av(82) ? 1 : 0);
            var13.bit.p2(var0 + jm.ib * -1232093375);
            var13.bit.p2LE(var3);
            Client.packetWriter.aw(var13);
         }

         if (1004 == var2) {
            Client.mq = 1956692579 * var7;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            var13 = mi.an_renamed(ClientProt.dm, Client.packetWriter.au);
            var13.bit.p2(Scenery.jc * 827352769 + var1);
            var13.bit.p2LE(var3);
            var13.bit.p2LE(-1232093375 * jm.ib + var0);
            Client.packetWriter.aw(var13);
         }

         if (0 != Client.oq * -303899309) {
            Client.oq = 0;
            fw.ma_renamed(gh.an_renamed(lh.ix * -1164741861));
         }

         if (Client.om) {
            gy.kp_renamed();
         }

      }
   }
}
