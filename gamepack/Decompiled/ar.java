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
         var10 = Client.iu[var3];
         if (null != var10) {
            Client.mq = var7 * 1956692579;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = 875414437 * var1;
            var11 = mi.an_renamed(ClientProt.dc, Client.in.au);
            var11.aw.p2LE(var3);
            var11.aw.dh(Client.sh.av(82) ? 1 : 0);
            Client.in.aw(var11);
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
         var13 = mi.an_renamed(ClientProt.bp, Client.in.au);
         var13.aw.dy(var3);
         var13.aw.dh(Client.sh.av(82) ? 1 : 0);
         var13.aw.dy(var1 + 827352769 * Scenery.jc);
         var13.aw.p2LE(-1232093375 * jm.ib + var0);
         Client.in.aw(var13);
      }

      if (13 == var2) {
         var10 = Client.iu[var3];
         if (var10 != null) {
            Client.mq = var7 * 1956692579;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = var0 * -1970850269;
            Client.th = var1 * 875414437;
            var11 = mi.an_renamed(ClientProt.bc, Client.in.au);
            var11.aw.bu(Client.sh.av(82) ? 1 : 0);
            var11.aw.dy(var3);
            Client.in.aw(var11);
         }
      }

      if (5 == var2) {
         Client.mq = 1956692579 * var7;
         Client.mm = 956660059 * var8;
         Client.mv = 1387316670;
         Client.me = 0;
         Client.te = var0 * -1970850269;
         Client.th = 875414437 * var1;
         var13 = mi.an_renamed(ClientProt.bq, Client.in.au);
         var13.aw.ds(jm.ib * -1232093375 + var0);
         var13.aw.p2LE(var3);
         var13.aw.ds(827352769 * Scenery.jc + var1);
         var13.aw.dp(Client.sh.av(82) ? 1 : 0);
         Client.in.aw(var13);
      }

      if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || 1012 == var2) {
         ey.wt.menuAction(var2, var3, new Coord(var0), new Coord(var1));
      }

      if (19 == var2) {
         Client.mq = var7 * 1956692579;
         Client.mm = var8 * 956660059;
         Client.mv = 1387316670;
         Client.me = 0;
         Client.te = var0 * -1970850269;
         Client.th = 875414437 * var1;
         var13 = mi.an_renamed(ClientProt.bz, Client.in.au);
         var13.aw.dy(var1 + Scenery.jc * 827352769);
         var13.aw.ds(var3);
         var13.aw.bu(Client.sh.av(82) ? 1 : 0);
         var13.aw.ds(jm.ib * -1232093375 + var0);
         Client.in.aw(var13);
      }

      if (var2 == 1001) {
         Client.mq = var7 * 1956692579;
         Client.mm = var8 * 956660059;
         Client.mv = 1387316670;
         Client.me = 0;
         Client.te = -1970850269 * var0;
         Client.th = 875414437 * var1;
         var13 = mi.an_renamed(ClientProt.cw, Client.in.au);
         var13.aw.dp(Client.sh.av(82) ? 1 : 0);
         var13.aw.ds(var3);
         var13.aw.dy(-1232093375 * jm.ib + var0);
         var13.aw.ds(var1 + 827352769 * Scenery.jc);
         Client.in.aw(var13);
      }

      if (23 == var2) {
         if (Client.nt) {
            bx.js.bn();
         } else {
            bx.js.menuOpen(GameShell.mh * -1727408401, var0, var1, true);
         }
      }

      int var12;
      Component var14;
      if (var2 == 28) {
         var13 = mi.an_renamed(ClientProt.ci, Client.in.au);
         var13.aw.ba(var1);
         Client.in.aw(var13);
         var14 = gh.an_renamed(var1);
         if (var14 != null && var14.gc != null && var14.gc[0][0] == 5) {
            var12 = var14.gc[0][1];
            Varps.aw[var12] = 1 - Varps.aw[var12];
            al.md_renamed(var12);
         }
      }

      Player var15;
      if (47 == var2) {
         var15 = Client.mc[var3];
         if (var15 != null) {
            Client.mq = 1956692579 * var7;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = var0 * -1970850269;
            Client.th = 875414437 * var1;
            var11 = mi.an_renamed(ClientProt.cf, Client.in.au);
            var11.aw.dp(Client.sh.av(82) ? 1 : 0);
            var11.aw.p2LE(var3);
            Client.in.aw(var11);
         }
      }

      if (var2 == 7) {
         var10 = Client.iu[var3];
         if (null != var10) {
            Client.mq = var7 * 1956692579;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = var0 * -1970850269;
            Client.th = var1 * 875414437;
            var11 = mi.an_renamed(ClientProt.du, Client.in.au);
            var11.aw.du(Client.sh.av(82) ? 1 : 0);
            var11.aw.ba(-1164741861 * lh.ix);
            var11.aw.dy(var3);
            var11.aw.ds(fw.iz * -1518641849);
            var11.aw.p2(896780031 * WorldMapSectionType.ow);
            Client.in.aw(var11);
         }
      }

      if (var2 == 50) {
         var15 = Client.mc[var3];
         if (null != var15) {
            Client.mq = 1956692579 * var7;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = var1 * 875414437;
            var11 = mi.an_renamed(ClientProt.al, Client.in.au);
            var11.aw.ds(var3);
            var11.aw.dh(Client.sh.av(82) ? 1 : 0);
            Client.in.aw(var11);
         }
      }

      if (var2 == 10) {
         var10 = Client.iu[var3];
         if (var10 != null) {
            Client.mq = 1956692579 * var7;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = var1 * 875414437;
            var11 = mi.an_renamed(ClientProt.dr, Client.in.au);
            var11.aw.dy(var3);
            var11.aw.dh(Client.sh.av(82) ? 1 : 0);
            Client.in.aw(var11);
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
         var15 = Client.mc[var3];
         if (null != var15) {
            Client.mq = 1956692579 * var7;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = var0 * -1970850269;
            Client.th = 875414437 * var1;
            var11 = mi.an_renamed(ClientProt.bx, Client.in.au);
            var11.aw.p2(var3);
            var11.aw.dh(Client.sh.av(82) ? 1 : 0);
            var11.aw.dy(896780031 * WorldMapSectionType.ow);
            var11.aw.ba(lh.ix * -1164741861);
            var11.aw.p2(fw.iz * -1518641849);
            Client.in.aw(var11);
         }
      }

      if (var2 == 48) {
         var15 = Client.mc[var3];
         if (null != var15) {
            Client.mq = var7 * 1956692579;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = var1 * 875414437;
            var11 = mi.an_renamed(ClientProt.az, Client.in.au);
            var11.aw.dp(Client.sh.av(82) ? 1 : 0);
            var11.aw.p2(var3);
            Client.in.aw(var11);
         }
      }

      if (var2 == 9) {
         var10 = Client.iu[var3];
         if (var10 != null) {
            Client.mq = var7 * 1956692579;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = 875414437 * var1;
            var11 = mi.an_renamed(ClientProt.dh, Client.in.au);
            var11.aw.bu(Client.sh.av(82) ? 1 : 0);
            var11.aw.ds(var3);
            Client.in.aw(var11);
         }
      }

      if (51 == var2) {
         var15 = Client.mc[var3];
         if (null != var15) {
            Client.mq = 1956692579 * var7;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = 875414437 * var1;
            var11 = mi.an_renamed(ClientProt.at, Client.in.au);
            var11.aw.dy(var3);
            var11.aw.dp(Client.sh.av(82) ? 1 : 0);
            Client.in.aw(var11);
         }
      }

      if (3 == var2) {
         Client.mq = var7 * 1956692579;
         Client.mm = 956660059 * var8;
         Client.mv = 1387316670;
         Client.me = 0;
         Client.te = var0 * -1970850269;
         Client.th = var1 * 875414437;
         var13 = mi.an_renamed(ClientProt.ay, Client.in.au);
         var13.aw.p2LE(-1232093375 * jm.ib + var0);
         var13.aw.dh(Client.sh.av(82) ? 1 : 0);
         var13.aw.ds(var1 + Scenery.jc * 827352769);
         var13.aw.dy(var3);
         Client.in.aw(var13);
      }

      if (var2 == 25) {
         var17 = SoundSystem.getComponentChild(var1, var0);
         if (null != var17) {
            gy.kp_renamed();
            am.kh_renamed(var1, var0, hc.af_renamed(KeyHandler.getComponentClickMask(var17)), var4);
            Client.oq = 0;
            Client.oj = MusicPatchNode.nu_renamed(var17);
            if (null == Client.oj) {
               Client.oj = Strings.at;
            }

            if (var17.bn) {
               Client.ob = var17.eh + oa.colorStartTag(16777215);
            } else {
               Client.ob = oa.colorStartTag(65280) + var17.gq + oa.colorStartTag(16777215);
            }
         }

      } else {
         PacketBitNode var16;
         if (var2 == 24) {
            var17 = gh.an_renamed(var1);
            if (null != var17) {
               boolean var18 = true;
               if (1021339961 * var17.bf > 0) {
                  var18 = Message.mk_renamed(var17);
               }

               if (var18) {
                  var16 = mi.an_renamed(ClientProt.ci, Client.in.au);
                  var16.aw.ba(var1);
                  Client.in.aw(var16);
               }
            }
         }

         if (var2 == 1003) {
            Client.mq = var7 * 1956692579;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            var10 = Client.iu[var3];
            if (var10 != null) {
               hs var19 = var10.af;
               if (null != var19.bn) {
                  var19 = var19.at();
               }

               if (null != var19) {
                  var16 = mi.an_renamed(ClientProt.cc, Client.in.au);
                  var16.aw.p2LE(-1115372301 * var19.ab);
                  Client.in.aw(var16);
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
            var13 = mi.an_renamed(ClientProt.bi, Client.in.au);
            var13.aw.dy(-1232093375 * jm.ib + var0);
            var13.aw.bu(Client.sh.av(82) ? 1 : 0);
            var13.aw.ds(var3);
            var13.aw.dy(var1 + Scenery.jc * 827352769);
            Client.in.aw(var13);
         }

         if (var2 == 49) {
            var15 = Client.mc[var3];
            if (var15 != null) {
               Client.mq = 1956692579 * var7;
               Client.mm = var8 * 956660059;
               Client.mv = 1387316670;
               Client.me = 0;
               Client.te = -1970850269 * var0;
               Client.th = var1 * 875414437;
               var11 = mi.an_renamed(ClientProt.ca, Client.in.au);
               var11.aw.dy(var3);
               var11.aw.dp(Client.sh.av(82) ? 1 : 0);
               Client.in.aw(var11);
            }
         }

         if (var2 == 8) {
            var10 = Client.iu[var3];
            if (var10 != null) {
               Client.mq = var7 * 1956692579;
               Client.mm = 956660059 * var8;
               Client.mv = 1387316670;
               Client.me = 0;
               Client.te = -1970850269 * var0;
               Client.th = var1 * 875414437;
               var11 = mi.an_renamed(ClientProt.ce, Client.in.au);
               var11.aw.dy(616923277 * Client.op);
               var11.aw.p4ME(96656415 * jg.ou);
               var11.aw.p2LE(var3);
               var11.aw.dy(145251849 * Client.oa);
               var11.aw.dh(Client.sh.av(82) ? 1 : 0);
               Client.in.aw(var11);
            }
         }

         if (var2 == 2) {
            Client.mq = var7 * 1956692579;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = var1 * 875414437;
            var13 = mi.an_renamed(ClientProt.ae, Client.in.au);
            var13.aw.dh(Client.sh.av(82) ? 1 : 0);
            var13.aw.p2LE(var3);
            var13.aw.p2LE(Client.op * 616923277);
            var13.aw.p2LE(var0 + jm.ib * -1232093375);
            var13.aw.ds(145251849 * Client.oa);
            var13.aw.p4ME(96656415 * jg.ou);
            var13.aw.ds(var1 + 827352769 * Scenery.jc);
            Client.in.aw(var13);
         }

         if (var2 == 1002) {
            Client.mq = 1956692579 * var7;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            var13 = mi.an_renamed(ClientProt.cv, Client.in.au);
            var13.aw.ds(var3);
            Client.in.aw(var13);
         }

         if (var2 == 45) {
            var15 = Client.mc[var3];
            if (null != var15) {
               Client.mq = var7 * 1956692579;
               Client.mm = var8 * 956660059;
               Client.mv = 1387316670;
               Client.me = 0;
               Client.te = -1970850269 * var0;
               Client.th = 875414437 * var1;
               var11 = mi.an_renamed(ClientProt.bd, Client.in.au);
               var11.aw.dh(Client.sh.av(82) ? 1 : 0);
               var11.aw.p2LE(var3);
               Client.in.aw(var11);
            }
         }

         if (var2 == 16) {
            Client.mq = var7 * 1956692579;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = var1 * 875414437;
            var13 = mi.an_renamed(ClientProt.ah, Client.in.au);
            var13.aw.p2(WorldMapSectionType.ow * 896780031);
            var13.aw.ds(jm.ib * -1232093375 + var0);
            var13.aw.ds(var3);
            var13.aw.ds(Scenery.jc * 827352769 + var1);
            var13.aw.p2(-1518641849 * fw.iz);
            var13.aw.bu(Client.sh.av(82) ? 1 : 0);
            var13.aw.p4ME(-1164741861 * lh.ix);
            Client.in.aw(var13);
         }

         if (var2 == 46) {
            var15 = Client.mc[var3];
            if (var15 != null) {
               Client.mq = var7 * 1956692579;
               Client.mm = 956660059 * var8;
               Client.mv = 1387316670;
               Client.me = 0;
               Client.te = var0 * -1970850269;
               Client.th = var1 * 875414437;
               var11 = mi.an_renamed(ClientProt.bo, Client.in.au);
               var11.aw.p2LE(var3);
               var11.aw.du(Client.sh.av(82) ? 1 : 0);
               Client.in.aw(var11);
            }
         }

         if (4 == var2) {
            Client.mq = 1956692579 * var7;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = var1 * 875414437;
            var13 = mi.an_renamed(ClientProt.bs, Client.in.au);
            var13.aw.ds(-1232093375 * jm.ib + var0);
            var13.aw.p2LE(827352769 * Scenery.jc + var1);
            var13.aw.ds(var3);
            var13.aw.du(Client.sh.av(82) ? 1 : 0);
            Client.in.aw(var13);
         }

         if (var2 == 44) {
            var15 = Client.mc[var3];
            if (null != var15) {
               Client.mq = 1956692579 * var7;
               Client.mm = var8 * 956660059;
               Client.mv = 1387316670;
               Client.me = 0;
               Client.te = var0 * -1970850269;
               Client.th = 875414437 * var1;
               var11 = mi.an_renamed(ClientProt.de, Client.in.au);
               var11.aw.du(Client.sh.av(82) ? 1 : 0);
               var11.aw.p2(var3);
               Client.in.aw(var11);
            }
         }

         if (var2 == 18) {
            Client.mq = var7 * 1956692579;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = -1970850269 * var0;
            Client.th = var1 * 875414437;
            var13 = mi.an_renamed(ClientProt.do, Client.in.au);
            var13.aw.ds(var3);
            var13.aw.p2(Scenery.jc * 827352769 + var1);
            var13.aw.dh(Client.sh.av(82) ? 1 : 0);
            var13.aw.p2LE(var0 + jm.ib * -1232093375);
            Client.in.aw(var13);
         }

         if (58 == var2) {
            var17 = SoundSystem.getComponentChild(var1, var0);
            if (var17 != null) {
               if (null != var17.fk) {
                  ClientScriptEvent var20 = new ClientScriptEvent();
                  var20.aw = var17;
                  var20.ab = var3 * -247460251;
                  var20.aa = var6;
                  var20.af = var17.fk;
                  HeadbarUpdate.af_renamed(var20);
               }

               var11 = mi.an_renamed(ClientProt.ad, Client.in.au);
               var11.aw.p2LE(var0);
               var11.aw.p2(var4);
               var11.aw.el(jg.ou * 96656415);
               var11.aw.ds(145251849 * Client.oa);
               var11.aw.p4ME(var1);
               var11.aw.dy(Client.op * 616923277);
               Client.in.aw(var11);
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
            var15 = Client.mc[var3];
            if (var15 != null) {
               Client.mq = var7 * 1956692579;
               Client.mm = var8 * 956660059;
               Client.mv = 1387316670;
               Client.me = 0;
               Client.te = -1970850269 * var0;
               Client.th = 875414437 * var1;
               var11 = mi.an_renamed(ClientProt.bl, Client.in.au);
               var11.aw.ds(145251849 * Client.oa);
               var11.aw.dy(616923277 * Client.op);
               var11.aw.p2LE(var3);
               var11.aw.dh(Client.sh.av(82) ? 1 : 0);
               var11.aw.ba(96656415 * jg.ou);
               Client.in.aw(var11);
            }
         }

         if (12 == var2) {
            var10 = Client.iu[var3];
            if (var10 != null) {
               Client.mq = var7 * 1956692579;
               Client.mm = var8 * 956660059;
               Client.mv = 1387316670;
               Client.me = 0;
               Client.te = var0 * -1970850269;
               Client.th = 875414437 * var1;
               var11 = mi.an_renamed(ClientProt.be, Client.in.au);
               var11.aw.dy(var3);
               var11.aw.du(Client.sh.av(82) ? 1 : 0);
               Client.in.aw(var11);
            }
         }

         if (1 == var2) {
            Client.mq = 1956692579 * var7;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = var0 * -1970850269;
            Client.th = var1 * 875414437;
            var13 = mi.an_renamed(ClientProt.bf, Client.in.au);
            var13.aw.dy(var3);
            var13.aw.p4ME(-1164741861 * lh.ix);
            var13.aw.p2(896780031 * WorldMapSectionType.ow);
            var13.aw.dy(var0 + -1232093375 * jm.ib);
            var13.aw.dh(Client.sh.av(82) ? 1 : 0);
            var13.aw.dy(-1518641849 * fw.iz);
            var13.aw.ds(var1 + 827352769 * Scenery.jc);
            Client.in.aw(var13);
         }

         if (17 == var2) {
            Client.mq = var7 * 1956692579;
            Client.mm = var8 * 956660059;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = var0 * -1970850269;
            Client.th = var1 * 875414437;
            var13 = mi.an_renamed(ClientProt.ap, Client.in.au);
            var13.aw.dh(Client.sh.av(82) ? 1 : 0);
            var13.aw.p4ME(96656415 * jg.ou);
            var13.aw.ds(145251849 * Client.oa);
            var13.aw.p2(var3);
            var13.aw.p2LE(-1232093375 * jm.ib + var0);
            var13.aw.dy(var1 + Scenery.jc * 827352769);
            var13.aw.dy(Client.op * 616923277);
            Client.in.aw(var13);
         }

         if (21 == var2) {
            Client.mq = var7 * 1956692579;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            Client.te = var0 * -1970850269;
            Client.th = var1 * 875414437;
            var13 = mi.an_renamed(ClientProt.db, Client.in.au);
            var13.aw.dy(jm.ib * -1232093375 + var0);
            var13.aw.dh(Client.sh.av(82) ? 1 : 0);
            var13.aw.ds(827352769 * Scenery.jc + var1);
            var13.aw.p2LE(var3);
            Client.in.aw(var13);
         }

         if (var2 == 29) {
            var13 = mi.an_renamed(ClientProt.ci, Client.in.au);
            var13.aw.ba(var1);
            Client.in.aw(var13);
            var14 = gh.an_renamed(var1);
            if (null != var14 && var14.gc != null && 5 == var14.gc[0][0]) {
               var12 = var14.gc[0][1];
               if (var14.gm[0] != Varps.aw[var12]) {
                  Varps.aw[var12] = var14.gm[0];
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
            var13 = mi.an_renamed(ClientProt.as, Client.in.au);
            var13.aw.p2LE(Scenery.jc * 827352769 + var1);
            var13.aw.dp(Client.sh.av(82) ? 1 : 0);
            var13.aw.p2(var0 + jm.ib * -1232093375);
            var13.aw.p2LE(var3);
            Client.in.aw(var13);
         }

         if (1004 == var2) {
            Client.mq = 1956692579 * var7;
            Client.mm = 956660059 * var8;
            Client.mv = 1387316670;
            Client.me = 0;
            var13 = mi.an_renamed(ClientProt.dm, Client.in.au);
            var13.aw.p2(Scenery.jc * 827352769 + var1);
            var13.aw.p2LE(var3);
            var13.aw.p2LE(-1232093375 * jm.ib + var0);
            Client.in.aw(var13);
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
