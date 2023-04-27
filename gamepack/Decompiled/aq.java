public class aq implements Enumerated {
   public static final aq af = new aq(0, 0);
   final int an;
   final int aw;

   aq(int var1, int var2) {
      this.an = -1515921529 * var1;
      this.aw = var2 * 648396637;
   }

   public int ordinal() {
      return this.aw * -754086667;
   }

   static int aa_renamed() {
      return 571147771 * Rasterizer3D.ab.ag;
   }

   static void aa_renamed(boolean var0) {
      if (!ClientScriptFrame.client.gn() && !ClientScriptFrame.client.gx() && !ClientScriptFrame.client.gv()) {
         Login.Login_response1 = Strings.ir;
         Login.Login_response2 = Strings.io;
         Login.Login_response3 = Strings.ip;
         ee.ak_renamed(2);
         if (var0) {
            Login.Login_password = "";
         }

         WallDecoration.ac_renamed();
         if (Client.hb && Login.Login_username != null && Login.Login_username.length() > 0) {
            Login.dm = 1153152795;
         } else {
            Login.dm = 0;
         }

      } else {
         ee.ak_renamed(10);
      }
   }

   static void drawTitle(Font var0, Font var1, Font var2) {
      aw = (-1687260435 * GameShell.aj - 765) / 2 * 983792155;
      Login.ak = 794898887 * Login.aw + 2036160930;
      fy.az = -1036961612 + Login.ak * -949768875;
      if (Login.di) {
         Decimator.ai_renamed(var0, var1);
      } else {
         ex.at.ay(Login.aw * 578342931, 0);
         ParamType.aa.ay(Login.aw * 578342931 + 382, 0);
         Canvas.ay.aw(Login.aw * 578342931 + 382 - Canvas.ay.subWidth / 2, 18);
         int var4;
         int var5;
         if (Client.gameState * -1275976559 == 0 || Client.gameState * -1275976559 == 5) {
            var4 = 20;
            var0.drawCentered(Strings.iv, 180 + 678588245 * Login.ak, 245 - var4, 16777215, -1);
            var5 = 253 - var4;
            Rasterizer2D.Rasterizer2D_drawRectangle(Login.ak * 678588245 + 180 - 152, var5, 304, 34, 9179409);
            Rasterizer2D.Rasterizer2D_drawRectangle(678588245 * Login.ak + 180 - 151, var5 + 1, 302, 32, 0);
            Rasterizer2D.Rasterizer2D_fillRectangle(Login.ak * 678588245 + 180 - 150, 2 + var5, -819692701 * Login.ad, 30, 9179409);
            Rasterizer2D.Rasterizer2D_fillRectangle(180 + 678588245 * Login.ak - 150 + -819692701 * Login.ad, 2 + var5, 300 - Login.ad * -819692701, 30, 0);
            var0.drawCentered(Login.Login_loadingText, 180 + Login.ak * 678588245, 276 - var4, 16777215, -1);
         }

         String var6;
         String var7;
         short var18;
         if (Client.gameState * -1275976559 == 20) {
            Login.au.aw(Login.ak * 678588245 + 180 - Login.au.subWidth / 2, 271 - Login.au.subHeight / 2);
            var4 = 201;
            var0.drawCentered(Login.Login_response1, 180 + 678588245 * Login.ak, var4, 16776960, 0);
            var4 += 15;
            var0.drawCentered(Login.Login_response2, Login.ak * 678588245 + 180, var4, 16776960, 0);
            var4 += 15;
            var0.drawCentered(Login.Login_response3, Login.ak * 678588245 + 180, var4, 16776960, 0);
            var4 += 15;
            var4 += 7;
            if (4 != Login.ce * 1145608355 && 10 != 1145608355 * Login.ce) {
               var0.draw(Strings.Strings_login, Login.ak * 678588245 + 180 - 110, var4, 16777215, 0);
               var18 = 200;

               for(var6 = am.aw_renamed(); var0.stringWidth(var6) > var18; var6 = var6.substring(0, var6.length() - 1)) {
               }

               var0.draw(AbstractFont.escapeBrackets(var6), 180 + Login.ak * 678588245 - 70, var4, 16777215, 0);
               var4 += 15;

               for(var7 = mc.ai_renamed(Login.Login_password); var0.stringWidth(var7) > var18; var7 = var7.substring(1)) {
               }

               var0.draw(Strings.Strings_password + var7, 180 + Login.ak * 678588245 - 108, var4, 16777215, 0);
               var4 += 15;
            }
         }

         if (10 == Client.gameState * -1275976559 || Client.gameState * -1275976559 == 11 || Client.gameState * -1275976559 == 50) {
            Login.au.aw(Login.ak * 678588245, 171);
            short var19;
            int var20;
            if (0 == Login.ce * 1145608355) {
               var19 = 251;
               var0.drawCentered(Strings.Strings_welcomeToRuneScape, 678588245 * Login.ak + 180, var19, 16776960, 0);
               var4 = var19 + 30;
               var5 = 180 + 678588245 * Login.ak - 80;
               var20 = 291;
               lu.ab.aw(var5 - 73, var20 - 20);
               var0.drawLines(Strings.Strings_newUser, var5 - 73, var20 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var5 = 180 + 678588245 * Login.ak + 80;
               lu.ab.aw(var5 - 73, var20 - 20);
               var0.drawLines(Strings.Strings_existingUser, var5 - 73, var20 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (1 == 1145608355 * Login.ce) {
               var0.drawCentered(Login.Login_response0, 678588245 * Login.ak + 180, 201, 16776960, 0);
               var19 = 236;
               var0.drawCentered(Login.Login_response1, 678588245 * Login.ak + 180, var19, 16777215, 0);
               var4 = var19 + 15;
               var0.drawCentered(Login.Login_response2, Login.ak * 678588245 + 180, var4, 16777215, 0);
               var4 += 15;
               var0.drawCentered(Login.Login_response3, Login.ak * 678588245 + 180, var4, 16777215, 0);
               var4 += 15;
               var5 = 678588245 * Login.ak + 180 - 80;
               var20 = 321;
               lu.ab.aw(var5 - 73, var20 - 20);
               var0.drawCentered(Strings.Strings_continue, var5, var20 + 5, 16777215, 0);
               var5 = Login.ak * 678588245 + 180 + 80;
               lu.ab.aw(var5 - 73, var20 - 20);
               var0.drawCentered(Strings.Strings_cancel, var5, 5 + var20, 16777215, 0);
            } else {
               int var8;
               if (1145608355 * Login.ce == 2) {
                  var19 = 201;
                  var0.drawCentered(Login.Login_response1, fy.az * 950254081, var19, 16776960, 0);
                  var4 = var19 + 15;
                  var0.drawCentered(Login.Login_response2, 950254081 * fy.az, var4, 16776960, 0);
                  var4 += 15;
                  var0.drawCentered(Login.Login_response3, fy.az * 950254081, var4, 16776960, 0);
                  var4 += 15;
                  var4 += 7;
                  var0.draw(Strings.Strings_login, 950254081 * fy.az - 110, var4, 16777215, 0);
                  var18 = 200;

                  for(var6 = am.aw_renamed(); var0.stringWidth(var6) > var18; var6 = var6.substring(1)) {
                  }

                  var0.draw(AbstractFont.escapeBrackets(var6) + (0 == Login.dm * -1232221421 & Client.ep * -1886224337 % 40 < 20 ? oa.colorStartTag(16776960) + Formatting.Formatting_pipe : ""), 950254081 * fy.az - 70, var4, 16777215, 0);
                  var4 += 15;

                  for(var7 = mc.ai_renamed(Login.Login_password); var0.stringWidth(var7) > var18; var7 = var7.substring(1)) {
                  }

                  var0.draw(Strings.Strings_password + var7 + (-1232221421 * Login.dm == 1 & Client.ep * -1886224337 % 40 < 20 ? oa.colorStartTag(16776960) + Formatting.Formatting_pipe : ""), 950254081 * fy.az - 108, var4, 16777215, 0);
                  var4 += 15;
                  var19 = 277;
                  var8 = -117 + 950254081 * fy.az;
                  boolean var10 = Client.hb;
                  boolean var11 = Login.cj;
                  IndexedSprite var9 = var10 ? (var11 ? Login.ah : gs.ag) : (var11 ? Login.ai : Login.ax);
                  var9.aw(var8, var19);
                  var8 += 5 + var9.subWidth;
                  var1.draw(Strings.kc, var8, 13 + var19, 16776960, 0);
                  var8 = 950254081 * fy.az + 24;
                  boolean var14 = aj.clientPreferences.al();
                  boolean var15 = Login.ch;
                  IndexedSprite var13 = var14 ? (var15 ? Login.ah : gs.ag) : (var15 ? Login.ai : Login.ax);
                  var13.aw(var8, var19);
                  var8 += 5 + var13.subWidth;
                  var1.draw(Strings.ku, var8, var19 + 13, 16776960, 0);
                  var4 = var19 + 15;
                  int var16 = fy.az * 950254081 - 80;
                  short var17 = 321;
                  lu.ab.aw(var16 - 73, var17 - 20);
                  var0.drawCentered(Strings.ju, var16, var17 + 5, 16777215, 0);
                  var16 = 80 + fy.az * 950254081;
                  lu.ab.aw(var16 - 73, var17 - 20);
                  var0.drawCentered(Strings.Strings_cancel, var16, 5 + var17, 16777215, 0);
                  var19 = 357;
                  switch (Login.bp * -1733444455) {
                     case 2:
                        am.bc = Strings.lg;
                        break;
                     default:
                        am.bc = Strings.lv;
                  }

                  Formatting.bh = new Bounds(fy.az * 950254081, var19, var1.stringWidth(am.bc), 11);
                  as.bw = new Bounds(950254081 * fy.az, var19, var1.stringWidth(Strings.lm), 11);
                  var1.drawCentered(am.bc, 950254081 * fy.az, var19, 16777215, 0);
               } else if (3 == Login.ce * 1145608355) {
                  var19 = 201;
                  var0.drawCentered(Strings.ke, 678588245 * Login.ak + 180, var19, 16776960, 0);
                  var4 = var19 + 20;
                  var1.drawCentered(Strings.ky, Login.ak * 678588245 + 180, var4, 16776960, 0);
                  var4 += 20;
                  var1.drawCentered(Strings.kh, 678588245 * Login.ak + 180, var4, 16776960, 0);
                  var4 += 15;
                  var5 = 678588245 * Login.ak + 180;
                  var20 = 276;
                  lu.ab.aw(var5 - 73, var20 - 20);
                  var2.drawCentered(Strings.kp, var5, var20 + 5, 16777215, 0);
                  var5 = 180 + Login.ak * 678588245;
                  var20 = 326;
                  lu.ab.aw(var5 - 73, var20 - 20);
                  var2.drawCentered(Strings.kf, var5, 5 + var20, 16777215, 0);
               } else {
                  short var22;
                  if (Login.ce * 1145608355 == 4) {
                     var0.drawCentered(Strings.je, 180 + 678588245 * Login.ak, 201, 16776960, 0);
                     var19 = 236;
                     var0.drawCentered(Login.Login_response1, 678588245 * Login.ak + 180, var19, 16777215, 0);
                     var4 = var19 + 15;
                     var0.drawCentered(Login.Login_response2, 180 + Login.ak * 678588245, var4, 16777215, 0);
                     var4 += 15;
                     var0.drawCentered(Login.Login_response3, 678588245 * Login.ak + 180, var4, 16777215, 0);
                     var4 += 15;
                     var0.draw(Strings.Strings_pin + mc.ai_renamed(Messages.cp) + (-1886224337 * Client.ep % 40 < 20 ? oa.colorStartTag(16776960) + Formatting.Formatting_pipe : ""), Login.ak * 678588245 + 180 - 108, var4, 16777215, 0);
                     var4 -= 8;
                     var0.draw(Strings.aa, 678588245 * Login.ak + 180 - 9, var4, 16776960, 0);
                     var4 += 15;
                     var0.draw(Strings.ay, 180 + Login.ak * 678588245 - 9, var4, 16776960, 0);
                     var5 = Login.ak * 678588245 + 180 - 9 + var0.stringWidth(Strings.ay) + 15;
                     var20 = var4 - var0.ascent;
                     IndexedSprite var21;
                     if (Login.cd) {
                        var21 = gs.ag;
                     } else {
                        var21 = Login.ax;
                     }

                     var21.aw(var5, var20);
                     var4 += 15;
                     var8 = 180 + 678588245 * Login.ak - 80;
                     var22 = 321;
                     lu.ab.aw(var8 - 73, var22 - 20);
                     var0.drawCentered(Strings.Strings_continue, var8, var22 + 5, 16777215, 0);
                     var8 = 80 + Login.ak * 678588245 + 180;
                     lu.ab.aw(var8 - 73, var22 - 20);
                     var0.drawCentered(Strings.Strings_cancel, var8, 5 + var22, 16777215, 0);
                     var1.drawCentered(Strings.jj, 180 + Login.ak * 678588245, var22 + 36, 255, 0);
                  } else if (Login.ce * 1145608355 == 5) {
                     var0.drawCentered(Strings.ks, Login.ak * 678588245 + 180, 201, 16776960, 0);
                     var19 = 221;
                     var2.drawCentered(Login.Login_response1, 678588245 * Login.ak + 180, var19, 16776960, 0);
                     var4 = var19 + 15;
                     var2.drawCentered(Login.Login_response2, 180 + 678588245 * Login.ak, var4, 16776960, 0);
                     var4 += 15;
                     var2.drawCentered(Login.Login_response3, 180 + 678588245 * Login.ak, var4, 16776960, 0);
                     var4 += 15;
                     var4 += 14;
                     var0.draw(Strings.kn, 180 + 678588245 * Login.ak - 145, var4, 16777215, 0);
                     var18 = 174;

                     for(var6 = am.aw_renamed(); var0.stringWidth(var6) > var18; var6 = var6.substring(1)) {
                     }

                     var0.draw(AbstractFont.escapeBrackets(var6) + (-1886224337 * Client.ep % 40 < 20 ? oa.colorStartTag(16776960) + Formatting.Formatting_pipe : ""), Login.ak * 678588245 + 180 - 34, var4, 16777215, 0);
                     var4 += 15;
                     int var23 = 180 + 678588245 * Login.ak - 80;
                     short var25 = 321;
                     lu.ab.aw(var23 - 73, var25 - 20);
                     var0.drawCentered(Strings.kz, var23, var25 + 5, 16777215, 0);
                     var23 = 80 + 180 + Login.ak * 678588245;
                     lu.ab.aw(var23 - 73, var25 - 20);
                     var0.drawCentered(Strings.km, var23, var25 + 5, 16777215, 0);
                     var25 = 356;
                     var1.drawCentered(Strings.lm, fy.az * 950254081, var25, 268435455, 0);
                  } else {
                     short var24;
                     if (6 == Login.ce * 1145608355) {
                        var19 = 201;
                        var0.drawCentered(Login.Login_response1, 180 + Login.ak * 678588245, var19, 16776960, 0);
                        var4 = var19 + 15;
                        var0.drawCentered(Login.Login_response2, 180 + Login.ak * 678588245, var4, 16776960, 0);
                        var4 += 15;
                        var0.drawCentered(Login.Login_response3, 678588245 * Login.ak + 180, var4, 16776960, 0);
                        var4 += 15;
                        var5 = 180 + 678588245 * Login.ak;
                        var24 = 321;
                        lu.ab.aw(var5 - 73, var24 - 20);
                        var0.drawCentered(Strings.km, var5, var24 + 5, 16777215, 0);
                     } else if (1145608355 * Login.ce == 7) {
                        if (WorldMapSectionType.ds && !Client.cy) {
                           var19 = 201;
                           var0.drawCentered(Login.Login_response1, 950254081 * fy.az, var19, 16776960, 0);
                           var4 = var19 + 15;
                           var0.drawCentered(Login.Login_response2, 950254081 * fy.az, var4, 16776960, 0);
                           var4 += 15;
                           var0.drawCentered(Login.Login_response3, 950254081 * fy.az, var4, 16776960, 0);
                           var5 = fy.az * 950254081 - 150;
                           var4 += 10;

                           for(var20 = 0; var20 < 8; ++var20) {
                              lu.ab.au(var5, var4, 30, 40);
                              boolean var26 = Login.cq * -1262226977 == var20 & -1886224337 * Client.ep % 40 < 20;
                              var0.draw((Login.cm[var20] == null ? "" : Login.cm[var20]) + (var26 ? oa.colorStartTag(16776960) + Formatting.Formatting_pipe : ""), var5 + 10, 27 + var4, 16777215, 0);
                              if (1 != var20 && 3 != var20) {
                                 var5 += 35;
                              } else {
                                 var5 += 50;
                                 var0.draw(AbstractFont.escapeBrackets("/"), var5 - 13, 27 + var4, 16777215, 0);
                              }
                           }

                           var20 = fy.az * 950254081 - 80;
                           short var27 = 321;
                           lu.ab.aw(var20 - 73, var27 - 20);
                           var0.drawCentered("Submit", var20, var27 + 5, 16777215, 0);
                           var20 = 80 + 950254081 * fy.az;
                           lu.ab.aw(var20 - 73, var27 - 20);
                           var0.drawCentered(Strings.Strings_cancel, var20, var27 + 5, 16777215, 0);
                        } else {
                           var19 = 216;
                           var0.drawCentered(Strings.mw, Login.ak * 678588245 + 180, var19, 16776960, 0);
                           var4 = var19 + 15;
                           var2.drawCentered(Strings.mz, 180 + Login.ak * 678588245, var4, 16776960, 0);
                           var4 += 15;
                           var2.drawCentered(Strings.mu, 180 + 678588245 * Login.ak, var4, 16776960, 0);
                           var4 += 15;
                           var5 = Login.ak * 678588245 + 180 - 80;
                           var24 = 321;
                           lu.ab.aw(var5 - 73, var24 - 20);
                           var0.drawCentered(Strings.mq, var5, 5 + var24, 16777215, 0);
                           var5 = 180 + Login.ak * 678588245 + 80;
                           lu.ab.aw(var5 - 73, var24 - 20);
                           var0.drawCentered(Strings.km, var5, var24 + 5, 16777215, 0);
                        }
                     } else if (8 == 1145608355 * Login.ce) {
                        var19 = 216;
                        var0.drawCentered(Strings.fb, Login.ak * 678588245 + 180, var19, 16776960, 0);
                        var4 = var19 + 15;
                        var2.drawCentered(Strings.fn, 180 + 678588245 * Login.ak, var4, 16776960, 0);
                        var4 += 15;
                        var2.drawCentered(Strings.fz, 678588245 * Login.ak + 180, var4, 16776960, 0);
                        var4 += 15;
                        var5 = 678588245 * Login.ak + 180 - 80;
                        var24 = 321;
                        lu.ab.aw(var5 - 73, var24 - 20);
                        var0.drawCentered(Strings.fa, var5, 5 + var24, 16777215, 0);
                        var5 = 80 + Login.ak * 678588245 + 180;
                        lu.ab.aw(var5 - 73, var24 - 20);
                        var0.drawCentered(Strings.km, var5, var24 + 5, 16777215, 0);
                     } else if (9 == Login.ce * 1145608355) {
                        var19 = 221;
                        var0.drawCentered(Login.Login_response1, 180 + 678588245 * Login.ak, var19, 16776960, 0);
                        var4 = var19 + 25;
                        var0.drawCentered(Login.Login_response2, 678588245 * Login.ak + 180, var4, 16776960, 0);
                        var4 += 25;
                        var0.drawCentered(Login.Login_response3, 180 + Login.ak * 678588245, var4, 16776960, 0);
                        var5 = 180 + Login.ak * 678588245;
                        var24 = 311;
                        lu.ab.aw(var5 - 73, var24 - 20);
                        var0.drawCentered(Strings.kp, var5, var24 + 5, 16777215, 0);
                     } else if (10 == 1145608355 * Login.ce) {
                        var4 = 678588245 * Login.ak + 180;
                        var18 = 209;
                        var0.drawCentered(Strings.Strings_welcomeToRuneScape, 180 + 678588245 * Login.ak, var18, 16776960, 0);
                        var5 = var18 + 20;
                        qo.aq.aw(var4 - 109, var5);
                        if (Login.cy.isEmpty()) {
                           os.al.aw(var4 - 48, 18 + var5);
                        } else {
                           os.al.aw(var4 - 48, 5 + var5);
                           var0.drawCentered(Login.cy, var4, 68 + var5 - 15, 16776960, 0);
                        }
                     } else if (12 == 1145608355 * Login.ce) {
                        var4 = fy.az * 950254081;
                        var18 = 216;
                        var2.drawCentered(Strings.mx, var4, var18, 16777215, 0);
                        var5 = var18 + 17;
                        var2.drawCentered(Strings.ma, var4, var5, 16777215, 0);
                        var5 += 17;
                        var2.drawCentered(Strings.mp, var4, var5, 16777215, 0);
                        var5 += 17;
                        var2.drawCentered(Strings.mj, var4, var5, 16777215, 0);
                        var4 = 950254081 * fy.az - 80;
                        var18 = 311;
                        lu.ab.aw(var4 - 73, var18 - 20);
                        var0.drawCentered(Strings.mh, var4, var18 + 5, 16777215, 0);
                        var4 = 80 + fy.az * 950254081;
                        lu.ab.aw(var4 - 73, var18 - 20);
                        var0.drawCentered(Strings.mg, var4, var18 + 5, 16777215, 0);
                     } else if (13 == Login.ce * 1145608355) {
                        var19 = 231;
                        var2.drawCentered(Strings.ms, 678588245 * Login.ak + 180, var19, 16777215, 0);
                        var4 = var19 + 20;
                        var2.drawCentered(Strings.mc, 678588245 * Login.ak + 180, var4, 16777215, 0);
                        var5 = 678588245 * Login.ak + 180;
                        var19 = 311;
                        lu.ab.aw(var5 - 73, var19 - 20);
                        var0.drawCentered(Strings.km, var5, var19 + 5, 16777215, 0);
                     } else if (1145608355 * Login.ce == 14) {
                        var19 = 201;
                        String var29 = "";
                        var6 = "";
                        var7 = "";
                        switch (Login.ba * -1478945003) {
                           case 0:
                              var29 = Strings.cc;
                              var6 = Strings.cn;
                              var7 = Strings.ca;
                              break;
                           case 1:
                              var29 = Strings.db;
                              var6 = Strings.df;
                              var7 = Strings.dq;
                              break;
                           case 2:
                              var29 = Strings.fe;
                              var6 = Strings.fs;
                              var7 = Strings.fi;
                              break;
                           default:
                              aa_renamed(false);
                        }

                        var0.drawCentered(var29, Login.ak * 678588245 + 180, var19, 16776960, 0);
                        var4 = var19 + 20;
                        var0.drawCentered(var6, 180 + 678588245 * Login.ak, var4, 16776960, 0);
                        var4 += 20;
                        var0.drawCentered(var7, 678588245 * Login.ak + 180, var4, 16776960, 0);
                        var8 = 678588245 * Login.ak + 180;
                        var22 = 276;
                        lu.ab.aw(var8 - 73, var22 - 20);
                        if (1 == Login.ba * -1478945003) {
                           var0.drawCentered(Strings.bs, var8, 5 + var22, 16777215, 0);
                        } else {
                           var0.drawCentered(Strings.bn, var8, var22 + 5, 16777215, 0);
                        }

                        var8 = 180 + 678588245 * Login.ak;
                        var22 = 326;
                        lu.ab.aw(var8 - 73, var22 - 20);
                        var0.drawCentered(Strings.km, var8, var22 + 5, 16777215, 0);
                     } else if (24 == Login.ce * 1145608355) {
                        var19 = 221;
                        var0.drawCentered(Login.Login_response1, 678588245 * Login.ak + 180, var19, 16777215, 0);
                        var4 = var19 + 15;
                        var0.drawCentered(Login.Login_response2, 678588245 * Login.ak + 180, var4, 16777215, 0);
                        var4 += 15;
                        var0.drawCentered(Login.Login_response3, 678588245 * Login.ak + 180, var4, 16777215, 0);
                        var4 += 15;
                        var5 = Login.ak * 678588245 + 180;
                        var24 = 301;
                        lu.ab.aw(var5 - 73, var24 - 20);
                        var0.drawCentered(Strings.Strings_ok, var5, var24 + 5, 16777215, 0);
                     } else if (32 == Login.ce * 1145608355) {
                        var19 = 216;
                        var0.drawCentered(Strings.mw, Login.ak * 678588245 + 180, var19, 16776960, 0);
                        var4 = var19 + 15;
                        var2.drawCentered(Strings.mz, Login.ak * 678588245 + 180, var4, 16776960, 0);
                        var4 += 15;
                        var2.drawCentered(Strings.mu, 678588245 * Login.ak + 180, var4, 16776960, 0);
                        var4 += 15;
                        var5 = 180 + Login.ak * 678588245 - 80;
                        var24 = 321;
                        lu.ab.aw(var5 - 73, var24 - 20);
                        var0.drawCentered(Strings.mq, var5, var24 + 5, 16777215, 0);
                        var5 = 180 + Login.ak * 678588245 + 80;
                        lu.ab.aw(var5 - 73, var24 - 20);
                        var0.drawCentered(Strings.km, var5, var24 + 5, 16777215, 0);
                     } else if (33 == Login.ce * 1145608355) {
                        var19 = 201;
                        var0.drawCentered(Login.Login_response1, 180 + Login.ak * 678588245, var19, 16776960, 0);
                        var4 = var19 + 20;
                        var1.drawCentered(Login.Login_response2, 180 + Login.ak * 678588245, var4, 16776960, 0);
                        var4 += 20;
                        var1.drawCentered(Login.Login_response3, 180 + Login.ak * 678588245, var4, 16776960, 0);
                        var4 += 15;
                        var5 = 180 + 678588245 * Login.ak;
                        var24 = 276;
                        lu.ab.aw(var5 - 73, var24 - 20);
                        var2.drawCentered(Strings.nw, var5, var24 + 5, 16777215, 0);
                        var5 = Login.ak * 678588245 + 180;
                        var24 = 326;
                        lu.ab.aw(var5 - 73, var24 - 20);
                        var2.drawCentered(Strings.km, var5, 5 + var24, 16777215, 0);
                     }
                  }
               }
            }
         }

         if (Client.gameState * -1275976559 >= 10) {
            int[] var31 = new int[4];
            Rasterizer2D.Rasterizer2D_getClipArray(var31);
            Rasterizer2D.Rasterizer2D_setClip(Login.aw * 578342931, 0, 765 + 578342931 * Login.aw, 1658005443 * kd.ak);
            em.av.aw(578342931 * Login.aw - 22, -1886224337 * Client.ep);
            em.av.aw(578342931 * Login.aw + 765 + 22 - 128, -1886224337 * Client.ep);
            Rasterizer2D.Rasterizer2D_setClipArray(var31);
         }

         fc.titleMuteSprites[aj.clientPreferences.aa() ? 1 : 0].aw(765 + Login.aw * 578342931 - 40, 463);
         if (-1275976559 * Client.gameState > 5 && Language.af == fj.ck) {
            if (mv.dv != null) {
               var4 = Login.aw * 578342931 + 5;
               var18 = 463;
               byte var30 = 100;
               byte var28 = 35;
               mv.dv.aw(var4, var18);
               var0.drawCentered(Strings.gx + " " + Client.worldId * -453810525, var30 / 2 + var4, var18 + var28 / 2 - 2, 16777215, 0);
               if (ao.aa != null) {
                  var1.drawCentered(Strings.Strings_loading, var30 / 2 + var4, 12 + var28 / 2 + var18, 16777215, 0);
               } else {
                  var1.drawCentered(Strings.nz, var4 + var30 / 2, var28 / 2 + var18 + 12, 16777215, 0);
               }
            } else {
               mv.dv = MusicPatchNode2.au_renamed(rr.archive8, "sl_button", "");
            }
         }

      }
   }
}
