import accessors.RSDefaultsGroup;

public class qp implements RSDefaultsGroup {
   static final int ms = 2048;
   final int an;
   static final qp af = new qp(3);

   qp(int var1) {
      try {
         super();
         this.an = 1519432129 * var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "qp.<init>(" + ')');
      }
   }

   static int ag(int var0, ch var1, boolean var2, int var3) {
      try {
         mq var4 = var2 ? bq.ag : an.ai;
         if (1700 == var0) {
            if (var3 <= 1047937166) {
               throw new IllegalStateException();
            } else {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.gn * -2006098851;
               return 1;
            }
         } else if (1701 == var0) {
            if (var3 <= 1047937166) {
               throw new IllegalStateException();
            } else {
               if (-1 != -2006098851 * var4.gn) {
                  if (var3 <= 1047937166) {
                     throw new IllegalStateException();
                  }

                  cy.al[(cy.at += 427135973) * -964267539 - 1] = var4.gv * 1336975799;
               } else {
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            }
         } else if (1702 == var0) {
            cy.al[(cy.at += 427135973) * -964267539 - 1] = 55577617 * var4.br;
            return 1;
         } else if (1707 == var0) {
            if (var3 <= 1047937166) {
               throw new IllegalStateException();
            } else {
               int[] var10000 = cy.al;
               int var10001 = (cy.at += 427135973) * -964267539 - 1;
               byte var10002;
               if (var4.by(2072674187)) {
                  if (var3 <= 1047937166) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else if (var0 == 1708) {
            if (var3 <= 1047937166) {
               throw new IllegalStateException();
            } else {
               return pn.ah(var4, 590181687);
            }
         } else if (var0 == 1709) {
            if (var3 <= 1047937166) {
               throw new IllegalStateException();
            } else {
               return au.av(var4, -935305362);
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "qp.ag(" + ')');
      }
   }
}
