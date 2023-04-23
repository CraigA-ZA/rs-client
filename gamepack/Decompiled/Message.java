public class Message extends DualNode {
   int af;
   int an;
   int aw;
   String ac;
   String al;
   String at;
   TriBool ab;
   TriBool aq;
   Username au;

   Message(int var1, String var2, String var3, String var4) {
      this.ab = TriBool.af;
      this.aq = TriBool.af;
      this.set(var1, var2, var3, var4);
   }

   void set(int var1, String var2, String var3, String var4) {
      this.af = ee.af_renamed() * -1945835651;
      this.an = -795781739 * Client.ep;
      this.aw = var1 * -280274327;
      this.ac = var2;
      this.fillSenderUsername();
      this.al = var3;
      this.at = var4;
      this.clear();
      this.removeAll();
   }

   void clear() {
      this.ab = TriBool.af;
   }

   final boolean isFromFriend() {
      if (this.ab == TriBool.af) {
         this.clearAll();
      }

      return this.ab == TriBool.an;
   }

   public static void aw_renamed(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
      ly.au = -626822165;
      ly.ab = var0;
      oq.aq = var1 * -1643562499;
      gz.al = 1823837761 * var2;
      dn.at = 111967803 * var3;
      ev.ay = var4;
      ga.aa = 1504627152;
   }

   void clearAll() {
      this.ab = World.vt.au.contains(this.au) ? TriBool.an : TriBool.aw;
   }

   void removeAll() {
      this.aq = TriBool.af;
   }

   final boolean isFromIgnored() {
      if (TriBool.af == this.aq) {
         this.aq();
      }

      return TriBool.an == this.aq;
   }

   void aq() {
      this.aq = World.vt.ab.contains(this.au) ? TriBool.an : TriBool.aw;
   }

   final void fillSenderUsername() {
      if (null != this.ac) {
         this.au = new Username(ne.nh_renamed(this.ac), co.cn);
      } else {
         this.au = null;
      }

   }

   static final void aa_renamed(String var0) {
      hn.at_renamed(Strings.hu + var0 + Strings.hx);
   }

   static float aw_renamed(ek var0, float var1, boolean var2) {
      float var4 = 0.0F;
      if (null != var0 && var0.at() != 0) {
         float var5 = (float)(var0.au[0].af * -834721191);
         float var6 = (float)(var0.au[var0.at() - 1].af * -834721191);
         float var7 = var6 - var5;
         if ((double)var7 == 0.0) {
            return var0.au[0].an;
         } else {
            float var8 = 0.0F;
            if (var1 > var6) {
               var8 = (var1 - var6) / var7;
            } else {
               var8 = (var1 - var5) / var7;
            }

            double var9 = (double)((int)var8);
            float var11 = Math.abs((float)((double)var8 - var9));
            float var12 = var11 * var7;
            var9 = Math.abs(1.0 + var9);
            double var13 = var9 / 2.0;
            double var15 = (double)((int)var13);
            var11 = (float)(var13 - var15);
            float var17;
            float var18;
            if (var2) {
               if (var0.aw == ex.au) {
                  if ((double)var11 != 0.0) {
                     var12 += var5;
                  } else {
                     var12 = var6 - var12;
                  }
               } else if (var0.aw != ex.aw && ex.ac != var0.aw) {
                  if (ex.an == var0.aw) {
                     var12 = var5 - var1;
                     var17 = var0.au[0].aw;
                     var18 = var0.au[0].ac;
                     var4 = var0.au[0].an;
                     if (0.0 != (double)var17) {
                        var4 -= var12 * var18 / var17;
                     }

                     return var4;
                  }
               } else {
                  var12 = var6 - var12;
               }
            } else if (var0.ac == ex.au) {
               if ((double)var11 != 0.0) {
                  var12 = var6 - var12;
               } else {
                  var12 += var5;
               }
            } else if (var0.ac != ex.aw && var0.ac != ex.ac) {
               if (var0.ac == ex.an) {
                  var12 = var1 - var6;
                  var17 = var0.au[var0.at() - 1].au;
                  var18 = var0.au[var0.at() - 1].ab;
                  var4 = var0.au[var0.at() - 1].an;
                  if (0.0 != (double)var17) {
                     var4 += var18 * var12 / var17;
                  }

                  return var4;
               }
            } else {
               var12 += var5;
            }

            var4 = GrandExchangeEvent.af_renamed(var0, var12);
            float var19;
            if (var2 && var0.aw == ex.ac) {
               var19 = var0.au[var0.at() - 1].an - var0.au[0].an;
               var4 = (float)((double)var4 - (double)var19 * var9);
            } else if (!var2 && var0.ac == ex.ac) {
               var19 = var0.au[var0.at() - 1].an - var0.au[0].an;
               var4 = (float)((double)var4 + (double)var19 * var9);
            }

            return var4;
         }
      } else {
         return var4;
      }
   }

   static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var7 = (long)(var2 + (var1 << 16));
      NetFileRequest var9 = (NetFileRequest)NetCache.ac.get(var7);
      if (var9 == null) {
         var9 = (NetFileRequest)NetCache.ab.get(var7);
         if (null == var9) {
            var9 = (NetFileRequest)NetCache.at.get(var7);
            if (var9 != null) {
               if (var5) {
                  var9.removeDual();
                  NetCache.ac.put(var9, var7);
                  NetCache.aa -= -2069940741;
                  NetCache.au += -1320339335;
               }

            } else {
               if (!var5) {
                  var9 = (NetFileRequest)NetCache.ay.get(var7);
                  if (var9 != null) {
                     return;
                  }
               }

               var9 = new NetFileRequest();
               var9.af = var0;
               var9.an = var3 * 851624817;
               var9.aw = var4;
               if (var5) {
                  NetCache.ac.put(var9, var7);
                  NetCache.au += -1320339335;
               } else {
                  NetCache.al.addFirst(var9);
                  NetCache.at.put(var9, var7);
                  NetCache.aa += -2069940741;
               }

            }
         }
      }
   }

   static void ks_renamed(int var0, int var1, int var2, int var3, String var4) {
      Component var6 = SoundSystem.getComponentChild(var1, var2);
      if (null != var6) {
         if (var6.fg != null) {
            ClientScriptEvent var7 = new ClientScriptEvent();
            var7.aw = var6;
            var7.ab = var0 * -247460251;
            var7.aa = var4;
            var7.af = var6.fg;
            HeadbarUpdate.af_renamed(var7);
         }

         boolean var12 = true;
         if (1021339961 * var6.bf > 0) {
            var12 = mk_renamed(var6);
         }

         if (var12) {
            int var9 = KeyHandler.getComponentClickMask(var6);
            int var10 = var0 - 1;
            boolean var8 = (var9 >> var10 + 1 & 1) != 0;
            if (var8) {
               PacketBitNode var11;
               if (var0 == 1) {
                  var11 = mi.an_renamed(ClientProt.cg, Client.in.au);
                  var11.aw.ba(var1);
                  var11.aw.p2(var2);
                  var11.aw.p2(var3);
                  Client.in.aw(var11);
               }

               if (2 == var0) {
                  var11 = mi.an_renamed(ClientProt.co, Client.in.au);
                  var11.aw.ba(var1);
                  var11.aw.p2(var2);
                  var11.aw.p2(var3);
                  Client.in.aw(var11);
               }

               if (3 == var0) {
                  var11 = mi.an_renamed(ClientProt.dw, Client.in.au);
                  var11.aw.ba(var1);
                  var11.aw.p2(var2);
                  var11.aw.p2(var3);
                  Client.in.aw(var11);
               }

               if (4 == var0) {
                  var11 = mi.an_renamed(ClientProt.dp, Client.in.au);
                  var11.aw.ba(var1);
                  var11.aw.p2(var2);
                  var11.aw.p2(var3);
                  Client.in.aw(var11);
               }

               if (5 == var0) {
                  var11 = mi.an_renamed(ClientProt.aj, Client.in.au);
                  var11.aw.ba(var1);
                  var11.aw.p2(var2);
                  var11.aw.p2(var3);
                  Client.in.aw(var11);
               }

               if (6 == var0) {
                  var11 = mi.an_renamed(ClientProt.cz, Client.in.au);
                  var11.aw.ba(var1);
                  var11.aw.p2(var2);
                  var11.aw.p2(var3);
                  Client.in.aw(var11);
               }

               if (7 == var0) {
                  var11 = mi.an_renamed(ClientProt.bn, Client.in.au);
                  var11.aw.ba(var1);
                  var11.aw.p2(var2);
                  var11.aw.p2(var3);
                  Client.in.aw(var11);
               }

               if (8 == var0) {
                  var11 = mi.an_renamed(ClientProt.cl, Client.in.au);
                  var11.aw.ba(var1);
                  var11.aw.p2(var2);
                  var11.aw.p2(var3);
                  Client.in.aw(var11);
               }

               if (var0 == 9) {
                  var11 = mi.an_renamed(ClientProt.bm, Client.in.au);
                  var11.aw.ba(var1);
                  var11.aw.p2(var2);
                  var11.aw.p2(var3);
                  Client.in.aw(var11);
               }

               if (10 == var0) {
                  var11 = mi.an_renamed(ClientProt.cb, Client.in.au);
                  var11.aw.ba(var1);
                  var11.aw.p2(var2);
                  var11.aw.p2(var3);
                  Client.in.aw(var11);
               }

            }
         }
      }
   }

   static final boolean mk_renamed(Component var0) {
      int var2 = var0.bf * 1021339961;
      if (var2 == 205) {
         Client.ii = 719725026;
         return true;
      } else {
         int var3;
         int var4;
         if (var2 >= 300 && var2 <= 313) {
            var3 = (var2 - 300) / 2;
            var4 = var2 & 1;
            Client.vh.au(var3, var4 == 1);
         }

         if (var2 >= 314 && var2 <= 323) {
            var3 = (var2 - 314) / 2;
            var4 = var2 & 1;
            Client.vh.ab(var3, var4 == 1);
         }

         if (324 == var2) {
            Client.vh.aq(0);
         }

         if (325 == var2) {
            Client.vh.aq(1);
         }

         if (var2 == 326) {
            PacketBitNode var5 = mi.an_renamed(ClientProt.au, Client.in.au);
            Client.vh.encode(var5.aw);
            Client.in.aw(var5);
            return true;
         } else {
            return false;
         }
      }
   }
}
