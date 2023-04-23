public class DynamicObject extends Entity {
   static AbstractArchive bi;
   SeqType aq;
   int ab;
   int ac;
   int af;
   int al;
   int an;
   int at;
   int au;
   int aw;

   DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Entity var9) {
      this.af = 1330439285 * var1;
      this.an = 918377177 * var2;
      this.aw = 1745873217 * var3;
      this.ac = var4 * -1874330171;
      this.au = -1211484067 * var5;
      this.ab = -1840369975 * var6;
      if (-1 != var7) {
         this.aq = Inventory.getSeqType(var7, (byte)2);
         this.al = 0;
         this.at = -1495562491 * Client.ep - -1353577717;
         if (this.aq.be * 789159225 == 0 && var9 != null && var9 instanceof DynamicObject) {
            DynamicObject var10 = (DynamicObject)var9;
            if (var10.aq == this.aq) {
               this.al = var10.al * 1;
               this.at = 1 * var10.at;
               return;
            }
         }

         if (var8 && this.aq.am * 1363943497 != -1) {
            if (!this.aq.ao()) {
               this.al = (int)(Math.random() * (double)this.aq.ag.length) * 499784167;
               this.at -= (int)(Math.random() * (double)this.aq.av[1017637335 * this.al]) * -1353577717;
            } else {
               this.al = (int)(Math.random() * (double)this.aq.ax()) * 499784167;
            }
         }
      }

   }

   protected final it getModel() {
      int var3;
      if (null != this.aq) {
         int var2 = -1886224337 * Client.ep - this.at * -287053661;
         if (var2 > 100 && 1363943497 * this.aq.am > 0) {
            var2 = 100;
         }

         if (this.aq.ao()) {
            var3 = this.aq.ax();
            this.al += 499784167 * var2;
            var2 = 0;
            if (1017637335 * this.al >= var3) {
               this.al = 499784167 * (var3 - this.aq.am * 1363943497);
               if (1017637335 * this.al < 0 || 1017637335 * this.al > var3) {
                  this.aq = null;
               }
            }
         } else {
            label92: {
               do {
                  do {
                     if (var2 <= this.aq.av[this.al * 1017637335]) {
                        break label92;
                     }

                     var2 -= this.aq.av[1017637335 * this.al];
                     this.al += 499784167;
                  } while(1017637335 * this.al < this.aq.ag.length);

                  this.al -= this.aq.am * -1989000481;
               } while(1017637335 * this.al >= 0 && 1017637335 * this.al < this.aq.ag.length);

               this.aq = null;
            }
         }

         this.at = -1353577717 * (-1886224337 * Client.ep - var2);
      }

      hq var13 = fw.an_renamed(618580957 * this.af);
      if (var13.bu != null) {
         var13 = var13.ao();
      }

      if (var13 == null) {
         return null;
      } else {
         int var4;
         if (this.aw * 1904322241 != 1 && 3 != 1904322241 * this.aw) {
            var3 = -1339930361 * var13.av;
            var4 = var13.ar * -1659393955;
         } else {
            var3 = var13.ar * -1659393955;
            var4 = -1339930361 * var13.av;
         }

         int var5 = 1815829493 * this.au + (var3 >> 1);
         int var6 = this.au * 1815829493 + (var3 + 1 >> 1);
         int var7 = (var4 >> 1) + this.ab * -1893774471;
         int var8 = -1893774471 * this.ab + (var4 + 1 >> 1);
         int[][] var9 = Tiles.af[-1674675955 * this.ac];
         int var10 = var9[var5][var8] + var9[var5][var7] + var9[var6][var7] + var9[var6][var8] >> 2;
         int var11 = (var3 << 6) + (this.au * 1815829493 << 7);
         int var12 = (var4 << 6) + (this.ab * -1893774471 << 7);
         return var13.aa(-373027479 * this.an, this.aw * 1904322241, var9, var11, var10, var12, this.aq, 1017637335 * this.al);
      }
   }

   public static long al_renamed(int var0) {
      if (var0 > 63) {
         throw new ot("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
      } else {
         return (long)Math.pow(2.0, (double)var0) - 1L;
      }
   }

   public static int bc_renamed(String var0) {
      return var0.length() + 1;
   }

   static final void chatCommand(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         aj.vb.au(!aj.vb.ab());
         if (aj.vb.ab()) {
            es.an_renamed(99, "", "Roofs are now all hidden");
         } else {
            es.an_renamed(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.startsWith("zbuf")) {
         boolean var2 = PacketBitNode.ac_renamed(var0.substring(5).trim()) == 1;
         ClientScriptFrame.bc.ad(var2);
         mz.af_renamed(var2);
      }

      if (var0.equalsIgnoreCase("z")) {
         Client.ex = !Client.ex;
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         aj.vb.ao();
      }

      if (var0.equalsIgnoreCase("renderself")) {
         Client.md = !Client.md;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         Client.oz = !Client.oz;
      }

      if (324465533 * Client.pu >= 2) {
         if (var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (var0.equalsIgnoreCase("showcoord")) {
            ey.wt.ck = !ey.wt.ck;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            aj.vb.ay(true);
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            aj.vb.ay(false);
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            ng.ht_renamed();
         }
      }

      PacketBitNode var3 = mi.an_renamed(ClientProt.di, Client.in.au);
      var3.aw.bu(var0.length() + 1);
      var3.aw.bh(var0);
      Client.in.aw(var3);
   }

   static final int lm_renamed() {
      return Client.ne * 730065501 - 1;
   }

   static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
      if (var0 != MusicPatchNode.mi) {
         if (Client.ne * 730065501 < 400) {
            String var5;
            if (0 == var0.at * 761215505) {
               var5 = var0.aq[0] + var0.af + var0.aq[1] + Inventory.lu_renamed(var0.al * 1302967875, MusicPatchNode.mi.al * 1302967875) + " " + Formatting.ac + Strings.gf + 1302967875 * var0.al + Formatting.au + var0.aq[2];
            } else {
               var5 = var0.aq[0] + var0.af + var0.aq[1] + " " + Formatting.ac + Strings.gm + 761215505 * var0.at + Formatting.au + var0.aq[2];
            }

            int var6;
            if (Client.oq * -303899309 == 1) {
               MiniMenuEntry.kz_renamed(Strings.gu, Client.it + " " + Formatting.ab + " " + oa.colorStartTag(16777215) + var5, 14, var1, var2, var3);
            } else if (Client.om) {
               if ((1457791911 * SecureRandomFuture.oo & 8) == 8) {
                  MiniMenuEntry.kz_renamed(Client.oj, Client.ob + " " + Formatting.ab + " " + oa.colorStartTag(16777215) + var5, 15, var1, var2, var3);
               }
            } else {
               for(var6 = 7; var6 >= 0; --var6) {
                  if (null != Client.nd[var6]) {
                     short var7 = 0;
                     if (Client.nd[var6].equalsIgnoreCase(Strings.gy)) {
                        if (Client.em == dj.ac) {
                           continue;
                        }

                        if (Client.em == dj.an || dj.af == Client.em && var0.al * 1302967875 > MusicPatchNode.mi.al * 1302967875) {
                           var7 = 2000;
                        }

                        if (-55850951 * MusicPatchNode.mi.ak != 0 && -55850951 * var0.ak != 0) {
                           if (var0.ak * -55850951 == -55850951 * MusicPatchNode.mi.ak) {
                              var7 = 2000;
                           } else {
                              var7 = 0;
                           }
                        } else if (Client.em == dj.au && var0.ag()) {
                           var7 = 2000;
                        }
                     } else if (Client.no[var6]) {
                        var7 = 2000;
                     }

                     boolean var8 = false;
                     int var9 = var7 + Client.ns[var6];
                     MiniMenuEntry.kz_renamed(Client.nd[var6], oa.colorStartTag(16777215) + var5, var9, var1, var2, var3);
                  }
               }
            }

            for(var6 = 0; var6 < 730065501 * Client.ne; ++var6) {
               if (23 == Client.nh[var6]) {
                  Client.ok[var6] = oa.colorStartTag(16777215) + var5;
                  break;
               }
            }

         }
      }
   }

   static final void nz_renamed(Component var0, int var1, int var2, int var3) {
      SpriteMask var5 = var0.getSpriteMask(false, (byte)65);
      if (var5 != null) {
         if (Client.tp * 1383336963 < 3) {
            ChatChannel.jb.be(var1, var2, var5.af * 1484188043, 939947663 * var5.an, 25, 25, 704283033 * Client.kf, 256, var5.ac, var5.aw);
         } else {
            Rasterizer2D.fx(var1, var2, 0, var5.ac, var5.aw);
         }

      }
   }
}
