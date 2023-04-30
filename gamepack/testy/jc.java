import accessors.RSTilePaint;

public final class jc implements RSTilePaint {
   int aw;
   int an;
   int af;
   int ac;
   int au;
   boolean ab;
   int aq;

   static int ak(int var0, ch var1, boolean var2, byte var3) {
      try {
         mq var4;
         if (var0 == 2700) {
            var4 = gh.an(cy.al[(cy.at -= 427135973) * -964267539], (byte)5);
            cy.al[(cy.at += 427135973) * -964267539 - 1] = -2006098851 * var4.gn;
            return 1;
         } else if (var0 == 2701) {
            if (var3 <= 5) {
               throw new IllegalStateException();
            } else {
               var4 = gh.an(cy.al[(cy.at -= 427135973) * -964267539], (byte)5);
               if (var4.gn * -2006098851 != -1) {
                  if (var3 <= 5) {
                     throw new IllegalStateException();
                  }

                  cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.gv * 1336975799;
               } else {
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            }
         } else if (2702 == var0) {
            if (var3 <= 5) {
               throw new IllegalStateException();
            } else {
               int var7 = cy.al[(cy.at -= 427135973) * -964267539];
               di var5 = (di)client.oc.af((long)var7);
               if (null != var5) {
                  if (var3 <= 5) {
                     throw new IllegalStateException();
                  }

                  cy.al[(cy.at += 427135973) * -964267539 - 1] = 1;
               } else {
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            }
         } else if (2706 == var0) {
            if (var3 <= 5) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = client.or * -896157613;
               return 1;
            }
         } else if (2707 == var0) {
            var4 = gh.an(cy.al[(cy.at -= 427135973) * -964267539], (byte)5);
            int[] var10000 = cy.al;
            int var10001 = (cy.at += 427135973) * -964267539 - 1;
            byte var10002;
            if (var4.by(-885789044)) {
               if (var3 <= 5) {
                  throw new IllegalStateException();
               }

               var10002 = 1;
            } else {
               var10002 = 0;
            }

            var10000[var10001] = var10002;
            return 1;
         } else if (2708 == var0) {
            if (var3 <= 5) {
               throw new IllegalStateException();
            } else {
               var4 = gh.an(cy.al[(cy.at -= 427135973) * -964267539], (byte)5);
               return pn.ah(var4, 734574746);
            }
         } else if (var0 == 2709) {
            if (var3 <= 5) {
               throw new IllegalStateException();
            } else {
               var4 = gh.an(cy.al[(cy.at -= 427135973) * -964267539], (byte)5);
               return au.av(var4, -1582872592);
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "jc.ak(" + ')');
      }
   }

   public static String aw(sg var0, byte var1) {
      try {
         String var2;
         try {
            int var3 = var0.cd(-75801365);
            if (var3 > 32767) {
               if (var1 <= 4) {
                  throw new IllegalStateException();
               }

               var3 = 32767;
            }

            byte[] var4 = new byte[var3];
            var0.at += mv.af.an(var0.al, -1633313603 * var0.at, var4, 0, var3, -977933945) * -1516355947;
            String var5 = sg.ab(var4, 0, var3, 178594756);
            var2 = var5;
         } catch (Exception var6) {
            var2 = "Cabbage";
         }

         return var2;
      } catch (RuntimeException var7) {
         throw db.an(var7, "jc.aw(" + ')');
      }
   }

   jc(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      try {
         super();
         this.ab = true;
         this.af = var1 * 1110698183;
         this.an = 450282055 * var2;
         this.aw = var3 * -615792113;
         this.ac = var4 * 1943953885;
         this.au = 1567743091 * var5;
         this.aq = 810771411 * var6;
         this.ab = var7;
      } catch (RuntimeException var8) {
         throw db.an(var8, "jc.<init>(" + ')');
      }
   }

   static final void lv(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, byte var8) {
      try {
         if (client.nt) {
            if (var8 <= 5) {
               throw new IllegalStateException();
            }
         } else {
            if (client.ne * 730065501 < 500) {
               if (var8 <= 5) {
                  throw new IllegalStateException();
               }

               client.og[730065501 * client.ne] = var0;
               client.ok[client.ne * 730065501] = var1;
               client.nh[730065501 * client.ne] = var2;
               client.nq[730065501 * client.ne] = var3;
               client.nk[client.ne * 730065501] = var4;
               client.ni[730065501 * client.ne] = var5;
               client.oi[client.ne * 730065501] = var6;
               client.ox[730065501 * client.ne] = var7;
               client.ne += 1153055221;
            }

         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "jc.lv(" + ')');
      }
   }
}
