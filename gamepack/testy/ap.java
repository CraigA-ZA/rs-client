import accessors.RSKeyHandler;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ap implements KeyListener, FocusListener, RSKeyHandler {
   Collection aw;
   Collection an;
   volatile int ab;
   boolean[] au;
   be[] ac;
   static final int af = 100;
   static int ul;
   static final int ax = 2;
   public static final byte bk = -1;

   static int ng(mq var0, int var1) {
      try {
         rt var2 = (rt)client.rv.af((long)(var0.br * 55577617) + ((long)(1713081171 * var0.bs) << 32));
         if (var2 != null) {
            if (var1 <= 209086632) {
               throw new IllegalStateException();
            } else {
               return var2.af;
            }
         } else {
            return var0.eb * 1652991301;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "ap.ng(" + ')');
      }
   }

   void af(be var1, int var2, int var3) {
      try {
         this.ac[var2] = var1;
      } catch (RuntimeException var4) {
         throw db.an(var4, "ap.af(" + ')');
      }
   }

   public int an(byte var1) {
      try {
         return 581428417 * this.ab;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ap.an(" + ')');
      }
   }

   void aw(Component var1, byte var2) {
      try {
         var1.setFocusTraversalKeysEnabled(false);
         var1.addKeyListener(this);
         var1.addFocusListener(this);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ap.aw(" + ')');
      }
   }

   void ah(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   void au(int var1) {
      try {
         this.ab += -132994239;
         this.ab((byte)-64);
         Iterator var2 = this.aw.iterator();

         label37:
         do {
            while(var2.hasNext()) {
               if (var1 != 190164456) {
                  return;
               }

               bz var3 = (bz)var2.next();

               for(int var4 = 0; var4 < this.ac.length; ++var4) {
                  if (var1 != 190164456) {
                     throw new IllegalStateException();
                  }

                  if (var3.af(this.ac[var4], 2098097689)) {
                     continue label37;
                  }
               }
            }

            this.aw.clear();
            return;
         } while(var1 == 190164456);

         throw new IllegalStateException();
      } catch (RuntimeException var5) {
         throw db.an(var5, "ap.au(" + ')');
      }
   }

   synchronized void be() {
      Collection var1 = this.aw;
      this.aw = this.an;
      this.an = var1;
   }

   public int ay() {
      return -360653713 * this.ab;
   }

   public final synchronized void keyTyped(KeyEvent var1) {
      try {
         char var2 = var1.getKeyChar();
         if (0 != var2 && '\uffff' != var2) {
            boolean var3;
            if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
               label61: {
                  if (0 != var2) {
                     char[] var4 = od.af;

                     for(int var5 = 0; var5 < var4.length; ++var5) {
                        char var6 = var4[var5];
                        if (var6 == var2) {
                           var3 = true;
                           break label61;
                        }
                     }
                  }

                  var3 = false;
               }
            } else {
               var3 = true;
            }

            if (var3) {
               this.an.add(new bz(3, var2));
            }
         }

         var1.consume();
      } catch (RuntimeException var7) {
         throw db.an(var7, "ap.keyTyped(" + ')');
      }
   }

   synchronized void ab(byte var1) {
      try {
         Collection var2 = this.aw;
         this.aw = this.an;
         this.an = var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ap.ab(" + ')');
      }
   }

   public final synchronized void focusGained(FocusEvent var1) {
      try {
         this.an.add(new bz(4, 1));
      } catch (RuntimeException var2) {
         throw db.an(var2, "ap.focusGained(" + ')');
      }
   }

   public final synchronized void focusLost(FocusEvent var1) {
      try {
         for(int var2 = 0; var2 < 112; ++var2) {
            if (this.au[var2]) {
               this.au[var2] = false;
               this.an.add(new bz(2, var2));
            }
         }

         this.an.add(new bz(4, 0));
      } catch (RuntimeException var3) {
         throw db.an(var3, "ap.focusLost(" + ')');
      }
   }

   public int ax() {
      return 581428417 * this.ab;
   }

   public final synchronized void by(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (0 != var2 && -477978230 != var2) {
         boolean var3;
         if (var2 > 0 && var2 < 128 || var2 >= 1121572036 && var2 <= 691285556) {
            var3 = true;
         } else {
            label62: {
               if (0 != var2) {
                  char[] var4 = od.af;

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     char var6 = var4[var5];
                     if (var6 == var2) {
                        var3 = true;
                        break label62;
                     }
                  }
               }

               var3 = false;
            }
         }

         if (var3) {
            this.an.add(new bz(3, var2));
         }
      }

      var1.consume();
   }

   void at(be var1, int var2) {
      this.ac[var2] = var1;
   }

   void aa(be var1, int var2) {
      this.ac[var2] = var1;
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      try {
         int var2;
         label35: {
            var2 = var1.getKeyCode();
            if (var2 >= 0) {
               int var4 = bi.dt.length;
               if (var2 < var4) {
                  var2 = ix.an(var2, (byte)-119);
                  boolean var5 = 0 != (var2 & 128);
                  if (var5) {
                     var2 = -1;
                  }
                  break label35;
               }
            }

            var2 = -1;
         }

         if (var2 >= 0) {
            this.au[var2] = true;
            this.an.add(new bz(1, var2));
            this.ab = 0;
         }

         var1.consume();
      } catch (RuntimeException var6) {
         throw db.an(var6, "ap.keyPressed(" + ')');
      }
   }

   public int ao() {
      return 581428417 * this.ab;
   }

   static void an(nm var0, nm var1, boolean var2, int var3, byte var4) {
      try {
         if (ax.an) {
            if (var3 == 4) {
               ee.ak(4, (byte)51);
            }

         } else {
            if (0 == var3) {
               if (var4 >= 3) {
                  throw new IllegalStateException();
               }

               cz.ay(var2, -1830611678);
            } else {
               ee.ak(var3, (byte)39);
            }

            th.er();
            byte[] var5 = var0.cb("title.jpg", "", 1648560407);
            ex.at = mk.af(var5, 504889561);
            ho.aa = ex.at.af();
            int var6 = client.ce * -205173751;
            if ((var6 & 536870912) != 0) {
               ad.ay = lp.au(var1, "logo_deadman_mode", "", -146128512);
            } else if (0 != (var6 & 1073741824)) {
               if (var4 >= 3) {
                  throw new IllegalStateException();
               }

               ad.ay = lp.au(var1, "logo_seasonal_mode", "", 313418457);
            } else if ((var6 & 256) != 0) {
               if (var4 >= 3) {
                  throw new IllegalStateException();
               }

               ad.ay = lp.au(var1, "logo_speedrunning", "", 2049692581);
            } else {
               ad.ay = lp.au(var1, "logo", "", -1070059423);
            }

            cz.au = lp.au(var1, "titlebox", "", -884653668);
            lu.ab = lp.au(var1, "titlebutton", "", 621917997);
            qo.aq = lp.au(var1, "titlebutton_large", "", -1920614594);
            os.al = lp.au(var1, "play_now_text", "", 2114172391);
            lp.au(var1, "titlebutton_wide42,1", "", -691270939);
            py.ac = mz.ac(var1, "runes", "", 1411006030);
            fc.ao = mz.ac(var1, "title_mute", "", 1455613865);
            cz.ax = lp.au(var1, "options_radio_buttons,0", "", 736085020);
            cz.ai = lp.au(var1, "options_radio_buttons,4", "", 141620347);
            gs.ag = lp.au(var1, "options_radio_buttons,2", "", -744990758);
            cz.ah = lp.au(var1, "options_radio_buttons,6", "", 1062815117);
            cp.cz = 1622050401 * cz.ax.aw;
            hr.cw = cz.ax.ac * 905476585;
            em.av = new dp(py.ac);
            if (var2) {
               if (var4 >= 3) {
                  throw new IllegalStateException();
               }

               cz.ca = "";
               cz.cu = "";
               cz.cm = new String[8];
               cz.cq = 0;
            }

            hp.ct = 0;
            eo.cp = "";
            cz.cd = true;
            cz.di = false;
            if (!aj.vb.aa(-1197954221)) {
               if (var4 >= 3) {
                  throw new IllegalStateException();
               }

               ks.ab(2, pj.fw, "scape main", "", 255, false, -541968853);
            } else {
               ly.au = -626822165;
               ly.ab = null;
               oq.aq = 1643562499;
               gz.al = -1823837761;
               dn.at = 0;
               ev.ay = false;
               ga.aa = 440964570;
            }

            gn.an(false, 1867902391);
            ax.an = true;
            cz.aw = 983792155 * ((bm.aj * -1687260435 - 765) / 2);
            cz.ak = 794898887 * cz.aw + 2036160930;
            fy.az = -1036961612 + cz.ak * -949768875;
            ex.at.ay(578342931 * cz.aw, 0);
            ho.aa.ay(382 + cz.aw * 578342931, 0);
            ad.ay.aw(382 + cz.aw * 578342931 - ad.ay.aw / 2, 18);
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "ap.an(" + ')');
      }
   }

   public int ai() {
      return -885520444 * this.ab;
   }

   public int ag() {
      return 2130864358 * this.ab;
   }

   void al(be var1, int var2) {
      this.ac[var2] = var1;
   }

   synchronized void ac(Component var1, int var2) {
      try {
         var1.removeKeyListener(this);
         var1.removeFocusListener(this);
         synchronized(this) {
            this.an.add(new bz(4, 0));
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "ap.ac(" + ')');
      }
   }

   void av(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   synchronized void am(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.an.add(new bz(4, 0));
      }
   }

   ap() {
      try {
         super();
         this.ac = new be[3];
         this.au = new boolean[112];
         this.ab = 0;
         this.an = new ArrayList(100);
         this.aw = new ArrayList(100);
      } catch (RuntimeException var1) {
         throw db.an(var1, "ap.<init>(" + ')');
      }
   }

   void aj() {
      this.ab += -132994239;
      this.ab((byte)-85);
      Iterator var1 = this.aw.iterator();

      while(var1.hasNext()) {
         bz var2 = (bz)var1.next();

         for(int var3 = 0; var3 < this.ac.length && !var2.af(this.ac[var3], 121605144); ++var3) {
         }
      }

      this.aw.clear();
   }

   public final synchronized void ak(KeyEvent var1) {
      int var2;
      label32: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = bi.dt.length;
            if (var2 < var4) {
               var2 = ix.an(var2, (byte)9);
               boolean var5 = 0 != (var2 & 128);
               if (var5) {
                  var2 = -1;
               }
               break label32;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.au[var2] = true;
         this.an.add(new bz(1, var2));
         this.ab = 0;
      }

      var1.consume();
   }

   public final synchronized void az(KeyEvent var1) {
      int var2;
      label29: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = bi.dt.length;
            if (var2 < var4) {
               var2 = ix.an(var2, (byte)-55);
               boolean var5 = 0 != (var2 & -649687661);
               if (var5) {
                  var2 = -1;
               }
               break label29;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.au[var2] = true;
         this.an.add(new bz(1, var2));
         this.ab = 0;
      }

      var1.consume();
   }

   public final synchronized void ad(KeyEvent var1) {
      int var2;
      label31: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = bi.dt.length;
            if (var2 < var4) {
               var2 = ix.an(var2, (byte)-42);
               boolean var5 = 0 != (var2 & 128);
               if (var5) {
                  var2 = -1;
               }
               break label31;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.au[var2] = true;
         this.an.add(new bz(1, var2));
         this.ab = 0;
      }

      var1.consume();
   }

   public final synchronized void ae(KeyEvent var1) {
      int var2;
      label20: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = bi.dt.length;
            if (var2 < var4) {
               var2 = ix.an(var2, (byte)-43) & -129;
               break label20;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.au[var2] = false;
         this.an.add(new bz(2, var2));
      }

      var1.consume();
   }

   public final synchronized void ap(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (0 != var2 && -351002310 != var2) {
         boolean var3;
         if ((var2 <= 0 || var2 >= -1832943298) && (var2 < 160 || var2 > 1818194793)) {
            label56: {
               if (0 != var2) {
                  char[] var4 = od.af;

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     char var6 = var4[var5];
                     if (var6 == var2) {
                        var3 = true;
                        break label56;
                     }
                  }
               }

               var3 = false;
            }
         } else {
            var3 = true;
         }

         if (var3) {
            this.an.add(new bz(3, var2));
         }
      }

      var1.consume();
   }

   static final void jl(byte var0) {
      try {
         for(dg var1 = (dg)client.nn.aq(); var1 != null; var1 = (dg)client.nn.at()) {
            if (1457211081 * var1.ag == -1) {
               var1.ai = 0;
               eo.kc(var1, -1336825850);
            } else {
               var1.ga();
            }
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "ap.jl(" + ')');
      }
   }

   synchronized void bb() {
      Collection var1 = this.aw;
      this.aw = this.an;
      this.an = var1;
   }

   synchronized void bi() {
      Collection var1 = this.aw;
      this.aw = this.an;
      this.an = var1;
   }

   void aq(be var1, int var2) {
      this.ac[var2] = var1;
   }

   synchronized void as(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.an.add(new bz(4, 0));
      }
   }

   public final synchronized void bx(FocusEvent var1) {
      for(int var2 = 0; var2 < -1853507994; ++var2) {
         if (this.au[var2]) {
            this.au[var2] = false;
            this.an.add(new bz(2, var2));
         }
      }

      this.an.add(new bz(4, 0));
   }

   public final synchronized void bo(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.au[var2]) {
            this.au[var2] = false;
            this.an.add(new bz(2, var2));
         }
      }

      this.an.add(new bz(4, 0));
   }

   static void ha(ha var0, int var1, int var2, int var3, int var4) {
      try {
         if (-297150195 * client.tl < 50) {
            if (var4 <= -1334788260) {
               throw new IllegalStateException();
            }

            if (aj.vb.az(-1837465111) != 0) {
               if (var0.ao != null) {
                  if (var4 <= -1334788260) {
                     throw new IllegalStateException();
                  }

                  if (var0.ao.containsKey(var1)) {
                     ge.hp((Integer)var0.ao.get(var1), var2, var3, 2140947227);
                     return;
                  }

                  if (var4 <= -1334788260) {
                     throw new IllegalStateException();
                  }
               }

               return;
            }

            if (var4 <= -1334788260) {
               throw new IllegalStateException();
            }
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "ap.ha(" + ')');
      }
   }

   public final synchronized void bk(FocusEvent var1) {
      this.an.add(new bz(4, 1));
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      try {
         int var2;
         label26: {
            var2 = var1.getKeyCode();
            if (var2 >= 0) {
               int var4 = bi.dt.length;
               if (var2 < var4) {
                  var2 = ix.an(var2, (byte)-125) & -129;
                  break label26;
               }
            }

            var2 = -1;
         }

         if (var2 >= 0) {
            this.au[var2] = false;
            this.an.add(new bz(2, var2));
         }

         var1.consume();
      } catch (RuntimeException var5) {
         throw db.an(var5, "ap.keyReleased(" + ')');
      }
   }

   void ar(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   public static int af(byte var0) {
      try {
         return -1048050201 * ix.ai;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ap.af(" + ')');
      }
   }

   public static double an(double var0, double var2, double var4) {
      try {
         return fd.af((var0 - var2) / var4) / var4;
      } catch (RuntimeException var6) {
         throw db.an(var6, "ap.an(" + ')');
      }
   }
}
