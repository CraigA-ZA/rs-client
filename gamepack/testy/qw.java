import accessors.RSGraphicsDefaults;

public class qw implements RSGraphicsDefaults {
   public int an = 363664783;
   public int ay = 1797432843;
   public int aw = -18237505;
   public int ac = -1245415821;
   public int al = 1802127851;
   public int ab = 524907877;
   public int aq = -805566907;
   public int at = -2096300737;
   public int au = 2051613563;
   public int aa = -1395448323;
   public int af = -658978373;

   public void aw(nm var1) {
      byte[] var2 = var1.cn(251393081 * qp.af.an, (byte)31);
      sg var3 = new sg(var2);

      while(true) {
         int var4 = var3.cm((byte)7);
         if (0 == var4) {
            return;
         }

         switch (var4) {
            case 1:
               var3.cr(-1189069027);
               break;
            case 2:
               this.af = var3.do(880863046) * 658978373;
               this.an = var3.do(72996497) * 491601391;
               this.aw = var3.do(176491159) * 18237505;
               this.ac = var3.do(2108606418) * 1245415821;
               this.au = var3.do(369959886) * -145284902;
               this.ab = var3.do(1110520746) * -524907877;
               this.aq = var3.do(1593454303) * 805566907;
               this.al = var3.do(1764815975) * 1710336119;
               this.at = var3.do(862356252) * -704418199;
               this.aa = var3.do(881110961) * 1395448323;
               this.ay = var3.do(1844796909) * -1797432843;
         }
      }
   }

   public void af(nm var1, int var2) {
      try {
         byte[] var3 = var1.cn(595484225 * qp.af.an, (byte)8);
         sg var4 = new sg(var3);

         while(true) {
            int var5 = var4.cm((byte)7);
            if (0 == var5) {
               return;
            }

            switch (var5) {
               case 1:
                  var4.cr(2130592697);
                  break;
               case 2:
                  this.af = var4.do(203805527) * 658978373;
                  this.an = var4.do(1227117525) * -363664783;
                  this.aw = var4.do(281879387) * 18237505;
                  this.ac = var4.do(1309881932) * 1245415821;
                  this.au = var4.do(1588338223) * -2051613563;
                  this.ab = var4.do(1788174195) * -524907877;
                  this.aq = var4.do(1731635951) * 805566907;
                  this.al = var4.do(195444732) * -1802127851;
                  this.at = var4.do(1962763962) * 2096300737;
                  this.aa = var4.do(352717850) * 1395448323;
                  this.ay = var4.do(935264208) * -1797432843;
            }
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "qw.af(" + ')');
      }
   }

   public void an(nm var1) {
      byte[] var2 = var1.cn(595484225 * qp.af.an, (byte)84);
      sg var3 = new sg(var2);

      while(true) {
         int var4 = var3.cm((byte)7);
         if (0 == var4) {
            return;
         }

         switch (var4) {
            case 1:
               var3.cr(-106412299);
               break;
            case 2:
               this.af = var3.do(28491091) * 658978373;
               this.an = var3.do(1470608841) * -363664783;
               this.aw = var3.do(1658985989) * 18237505;
               this.ac = var3.do(133205805) * 1245415821;
               this.au = var3.do(1579796708) * -2051613563;
               this.ab = var3.do(582210523) * -524907877;
               this.aq = var3.do(1398972378) * 805566907;
               this.al = var3.do(1286296698) * -1802127851;
               this.at = var3.do(1515663998) * 2096300737;
               this.aa = var3.do(1708084307) * 1395448323;
               this.ay = var3.do(2027655759) * -1797432843;
         }
      }
   }

   static final void jg(byte var0) {
      try {
         for(cx var1 = (cx)client.np.aq(); var1 != null; var1 = (cx)client.np.at()) {
            if (var0 >= 0) {
               return;
            }

            if (var1.aw * 397044137 == -1727408401 * bm.mh) {
               if (var0 >= 0) {
                  throw new IllegalStateException();
               }

               if (!var1.aa) {
                  if (-1886224337 * client.ep >= -1927288833 * var1.an) {
                     if (var0 >= 0) {
                        throw new IllegalStateException();
                     }

                     var1.af(client.ja * -1795081153, (byte)-34);
                     if (var1.aa) {
                        if (var0 >= 0) {
                           throw new IllegalStateException();
                        }

                        var1.ga();
                     } else {
                        bx.js.ao(var1.aw * 397044137, -1570643775 * var1.ac, -161744223 * var1.au, var1.ab * -769506393, 60, var1, 0, -1L, false);
                     }
                  }
                  continue;
               }

               if (var0 >= 0) {
                  return;
               }
            }

            var1.ga();
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "qw.jg(" + ')');
      }
   }

   public static gz af(int var0, int var1) {
      try {
         gz var2 = (gz)gz.aw.af((long)var0);
         if (null != var2) {
            return var2;
         } else {
            byte[] var3 = gz.af.bh(16, var0, (byte)-1);
            var2 = new gz();
            if (var3 != null) {
               if (var1 >= -654466346) {
                  throw new IllegalStateException();
               }

               var2.an(new sg(var3), 955579844);
            }

            gz.aw.aw(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "qw.af(" + ')');
      }
   }
}
