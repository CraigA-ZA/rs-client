public class mg {
   public static final int bg = 65;
   public static final int al = 6;
   public static final int ac = 2;
   public static final int af = -1;
   public static final int ao = 10;
   public static final int at = 7;
   public static final int ab = 4;
   public static final int an = -2;
   public static final int ah = 14;
   public static final int bu = 67;
   static final int cw = 90;

   public static void af(nm var0, byte var1) {
      try {
         sz.af = var0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "mg.af(" + ')');
      }
   }

   static int bg(int var0, ch var1, boolean var2, byte var3) {
      try {
         if (6200 == var0) {
            if (var3 == 14) {
               throw new IllegalStateException();
            } else {
               at -= 854271946;
               client.vv = (short)ib.bs(cy.al[-964267539 * cy.at], -2041739406);
               if (client.vv <= 0) {
                  client.vv = 256;
               }

               client.va = (short)ib.bs(cy.al[cy.at * -964267539 + 1], -1156963923);
               if (client.va <= 0) {
                  if (var3 == 14) {
                     throw new IllegalStateException();
                  }

                  client.va = 256;
               }

               return 1;
            }
         } else if (var0 == 6201) {
            if (var3 == 14) {
               throw new IllegalStateException();
            } else {
               at -= 854271946;
               client.vl = (short)cy.al[-964267539 * cy.at];
               if (client.vl <= 0) {
                  client.vl = 256;
               }

               client.ve = (short)cy.al[-964267539 * cy.at + 1];
               if (client.ve <= 0) {
                  if (var3 == 14) {
                     throw new IllegalStateException();
                  }

                  client.ve = 320;
               }

               return 1;
            }
         } else if (6202 == var0) {
            if (var3 == 14) {
               throw new IllegalStateException();
            } else {
               at -= 1708543892;
               client.vm = (short)cy.al[cy.at * -964267539];
               if (client.vm <= 0) {
                  client.vm = 1;
               }

               client.vn = (short)cy.al[1 + -964267539 * cy.at];
               if (client.vn <= 0) {
                  if (var3 == 14) {
                     throw new IllegalStateException();
                  }

                  client.vn = 32767;
               } else if (client.vn < client.vm) {
                  if (var3 == 14) {
                     throw new IllegalStateException();
                  }

                  client.vn = client.vm;
               }

               client.vo = (short)cy.al[2 + cy.at * -964267539];
               if (client.vo <= 0) {
                  if (var3 == 14) {
                     throw new IllegalStateException();
                  }

                  client.vo = 1;
               }

               client.vk = (short)cy.al[3 + -964267539 * cy.at];
               if (client.vk <= 0) {
                  if (var3 == 14) {
                     throw new IllegalStateException();
                  }

                  client.vk = 32767;
               } else if (client.vk < client.vo) {
                  if (var3 == 14) {
                     throw new IllegalStateException();
                  }

                  client.vk = client.vo;
               }

               return 1;
            }
         } else if (6203 == var0) {
            if (var3 == 14) {
               throw new IllegalStateException();
            } else {
               if (client.ps != null) {
                  if (var3 == 14) {
                     throw new IllegalStateException();
                  }

                  bt.it(0, 0, -794961409 * client.ps.cs, 1473950221 * client.ps.cc, false, 566359130);
                  cy.al[(at += 427135973) * -964267539 - 1] = 433849721 * client.vp;
                  cy.al[(at += 427135973) * -964267539 - 1] = client.vy * 2042096749;
               } else {
                  cy.al[(at += 427135973) * -964267539 - 1] = -1;
                  cy.al[(at += 427135973) * -964267539 - 1] = -1;
               }

               return 1;
            }
         } else if (var0 == 6204) {
            if (var3 == 14) {
               throw new IllegalStateException();
            } else {
               cy.al[(at += 427135973) * -964267539 - 1] = client.vl;
               cy.al[(at += 427135973) * -964267539 - 1] = client.ve;
               return 1;
            }
         } else if (var0 == 6205) {
            if (var3 == 14) {
               throw new IllegalStateException();
            } else {
               cy.al[(at += 427135973) * -964267539 - 1] = bq.br(client.vv, -1195339231);
               cy.al[(at += 427135973) * -964267539 - 1] = bq.br(client.va, -1932123695);
               return 1;
            }
         } else if (6220 == var0) {
            cy.al[(at += 427135973) * -964267539 - 1] = 0;
            return 1;
         } else if (6221 == var0) {
            if (var3 == 14) {
               throw new IllegalStateException();
            } else {
               cy.al[(at += 427135973) * -964267539 - 1] = 0;
               return 1;
            }
         } else if (var0 == 6222) {
            if (var3 == 14) {
               throw new IllegalStateException();
            } else {
               cy.al[(at += 427135973) * -964267539 - 1] = bm.aj * -1687260435;
               return 1;
            }
         } else if (6223 == var0) {
            cy.al[(at += 427135973) * -964267539 - 1] = 1658005443 * kd.ak;
            return 1;
         } else {
            return 2;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "mg.bg(" + ')');
      }
   }

   mg() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw db.an(var1, "mg.<init>(" + ')');
      }
   }
}
