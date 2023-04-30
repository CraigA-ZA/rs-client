import accessors.RSGameShell;
import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Iterator;

public abstract class bm extends Applet implements Runnable, FocusListener, WindowListener, RSGameShell {
   Canvas bk;
   static bm an = null;
   static int aw = 0;
   int ap;
   boolean ab;
   protected static gd af;
   static int al = -2033050820;
   static int at = -341822119;
   protected static int aa = 0;
   volatile long bt;
   static long[] ag = new long[32];
   protected int av;
   static volatile boolean bu = true;
   protected int ar;
   int as;
   public static int aj;
   int az;
   int ad;
   int ae;
   Frame be;
   protected boolean by;
   protected static ap bq = new ap();
   static long[] ax = new long[32];
   volatile boolean bx;
   static int bz = -1669766140;
   boolean bm;
   volatile boolean bd;
   static boolean au = false;
   ak bs;
   int am;
   final EventQueue bg;
   static long ac = 0L;
   Clipboard br;
   static long bv = -3922098655801851377L;
   static long bl = 4496549445389278039L;
   static int mh;

   final void ct() {
      bq.ac(this.bk, -1425593570);
      Canvas var1 = this.bk;
      var1.removeMouseListener(bd.ac);
      var1.removeMouseMotionListener(bd.ac);
      var1.removeFocusListener(bd.ac);
      bd.ab = 0;
      if (this.bs != null) {
         this.bs.an(this.bk, 109187860);
      }

      this.az(-1544686112);
      bq.aw(this.bk, (byte)64);
      pc.af((Component)this.bk, -501067257);
      if (this.bs != null) {
         this.bs.af(this.bk, 757874510);
      }

      this.bi(-343258222);
   }

   final void dn() {
      this.bm = true;
   }

   final void at(Object var1, int var2) {
      try {
         if (null == this.bg) {
            if (var2 <= 1176260111) {
               throw new IllegalStateException();
            }
         } else {
            for(int var3 = 0; var3 < 50 && this.bg.peekEvent() != null; ++var3) {
               if (var2 <= 1176260111) {
                  return;
               }

               mw.af(1L);
            }

            if (null != var1) {
               this.bg.postEvent(new ActionEvent(var1, 1001, "dummy"));
            }

         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "bm.at(" + ')');
      }
   }

   protected gf aa(int var1) {
      try {
         if (this.bs == null) {
            if (var1 <= -1914628905) {
               throw new IllegalStateException();
            }

            this.bs = new ak();
            this.bs.af(this.bk, -1336020209);
         }

         return this.bs;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.aa(" + ')');
      }
   }

   final void aj(int var1) {
      try {
         bq.ac(this.bk, -2015254392);
         Canvas var2 = this.bk;
         var2.removeMouseListener(bd.ac);
         var2.removeMouseMotionListener(bd.ac);
         var2.removeFocusListener(bd.ac);
         bd.ab = 0;
         if (this.bs != null) {
            if (var1 == -1329623220) {
               throw new IllegalStateException();
            }

            this.bs.an(this.bk, 109187860);
         }

         this.az(19552116);
         bq.aw(this.bk, (byte)64);
         pc.af((Component)this.bk, -617434740);
         if (this.bs != null) {
            if (var1 == -1329623220) {
               throw new IllegalStateException();
            }

            this.bs.af(this.bk, -201411052);
         }

         this.bi(-2091423650);
      } catch (RuntimeException var3) {
         throw db.an(var3, "bm.aj(" + ')');
      }
   }

   protected void bw() {
      this.br = this.getToolkit().getSystemClipboard();
   }

   protected Clipboard ax(int var1) {
      try {
         return this.br;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.ax(" + ')');
      }
   }

   protected final void ai(byte var1) {
      try {
         gs.af((byte)4);
         bq.aw(this.bk, (byte)64);
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.ai(" + ')');
      }
   }

   protected final void al(int var1, int var2, byte var3) {
      try {
         label21: {
            if (var1 == 2087275977 * this.ae) {
               if (83534669 * this.ap == var2) {
                  break label21;
               }

               if (var3 != 2) {
                  throw new IllegalStateException();
               }
            }

            this.bi(-480956714);
         }

         this.ae = var1 * -753509255;
         this.ap = var2 * -438874747;
      } catch (RuntimeException var4) {
         throw db.an(var4, "bm.al(" + ')');
      }
   }

   protected void ah(be var1, int var2, byte var3) {
      try {
         bq.af(var1, var2, 107693889);
      } catch (RuntimeException var4) {
         throw db.an(var4, "bm.ah(" + ')');
      }
   }

   protected Clipboard cu() {
      return this.br;
   }

   public final void eg(WindowEvent var1) {
   }

   protected abstract void am(byte var1);

   protected abstract void fz(boolean var1);

   protected final void ck() {
      gs.af((byte)4);
      bq.aw(this.bk, (byte)64);
   }

   protected final boolean gj() {
      return this.be != null;
   }

   final synchronized void az(int var1) {
      try {
         Container var2 = this.bg((byte)6);
         if (null != this.bk) {
            if (var1 == 902164980) {
               throw new IllegalStateException();
            }

            this.bk.removeFocusListener(this);
            var2.remove(this.bk);
         }

         aj = Math.max(var2.getWidth(), this.az * 69014751) * 2082454245;
         kd.ak = Math.max(var2.getHeight(), this.ad * 1673949127) * -16547605;
         Insets var3;
         if (null != this.be) {
            if (var1 == 902164980) {
               throw new IllegalStateException();
            }

            var3 = this.be.getInsets();
            aj -= (var3.right + var3.left) * 2082454245;
            kd.ak -= (var3.bottom + var3.top) * -16547605;
         }

         this.bk = new ad(this);
         var2.setBackground(Color.BLACK);
         var2.setLayout((LayoutManager)null);
         var2.add(this.bk);
         this.bk.setSize(-1687260435 * aj, 1658005443 * kd.ak);
         this.bk.setVisible(true);
         this.bk.setBackground(Color.BLACK);
         if (this.be == var2) {
            if (var1 == 902164980) {
               throw new IllegalStateException();
            }

            var3 = this.be.getInsets();
            this.bk.setLocation(var3.left + -744210797 * this.am, var3.top + 895830209 * this.as);
         } else {
            this.bk.setLocation(this.am * -744210797, this.as * 895830209);
         }

         label63: {
            this.bk.addFocusListener(this);
            this.bk.requestFocus();
            this.bx = true;
            if (null != ia.bn) {
               if (var1 == 902164980) {
                  throw new IllegalStateException();
               }

               if (1313069155 * ia.bn.ac == aj * -1687260435) {
                  if (var1 == 902164980) {
                     return;
                  }

                  if (1658005443 * kd.ak == 1695726685 * ia.bn.au) {
                     if (var1 == 902164980) {
                        throw new IllegalStateException();
                     }

                     ((bo)ia.bn).af(this.bk, (byte)44);
                     ia.bn.an(0, 0, -893520439);
                     break label63;
                  }
               }
            }

            ia.bn = new bo(-1687260435 * aj, kd.ak * 1658005443, this.bk, this.by);
         }

         this.bd = false;
         this.bt = dq.af(1655647545) * -515103886995160589L;
      } catch (RuntimeException var4) {
         throw db.an(var4, "bm.az(" + ')');
      }
   }

   protected void ad(boolean var1, byte var2) {
      try {
         if (var1 != this.by) {
            if (var2 != 14) {
               return;
            }

            this.by = var1;
            ia.bn.am(var1, -1022741876);
            ia.bn.ar((byte)0);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "bm.ad(" + ')');
      }
   }

   protected final boolean ae(int var1) {
      try {
         String var2 = this.getDocumentBase().getHost().toLowerCase();
         if (!var2.equals("jagex.com")) {
            if (var1 >= 975266980) {
               throw new IllegalStateException();
            }

            if (!var2.endsWith(".jagex.com")) {
               if (!var2.equals("runescape.com")) {
                  if (var1 >= 975266980) {
                     throw new IllegalStateException();
                  }

                  if (!var2.endsWith(".runescape.com")) {
                     if (var2.endsWith("127.0.0.1")) {
                        return true;
                     }

                     while(var2.length() > 0) {
                        if (var1 >= 975266980) {
                           throw new IllegalStateException();
                        }

                        if (var2.charAt(var2.length() - 1) < '0') {
                           break;
                        }

                        if (var1 >= 975266980) {
                           throw new IllegalStateException();
                        }

                        if (var2.charAt(var2.length() - 1) > '9') {
                           break;
                        }

                        if (var1 >= 975266980) {
                           throw new IllegalStateException();
                        }

                        var2 = var2.substring(0, var2.length() - 1);
                     }

                     if (var2.endsWith("192.168.1.")) {
                        return true;
                     }

                     this.br("invalidhost", 1689121582);
                     return false;
                  }

                  if (var1 >= 975266980) {
                     throw new IllegalStateException();
                  }
               }

               return true;
            }

            if (var1 >= 975266980) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw db.an(var3, "bm.ae(" + ')');
      }
   }

   public void run() {
      try {
         try {
            if (null != gd.af) {
               String var1 = gd.af.toLowerCase();
               if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                  String var2 = gd.an;
                  if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                     this.br("wrongjava", -1294118678);
                     return;
                  }

                  if (var2.startsWith("1.6.0_")) {
                     int var3;
                     for(var3 = 6; var3 < var2.length() && ff.aa(var2.charAt(var3), -200557618); ++var3) {
                     }

                     String var4 = var2.substring(6, var3);
                     if (jb.an(var4, 88944891) && lg.ac(var4, (byte)27) < 10) {
                        this.br("wrongjava", -748289620);
                        return;
                     }
                  }

                  at = -1709110595;
               }
            }

            this.setFocusCycleRoot(true);
            this.az(-1549595366);
            this.bm((byte)42);
            pj.ay = fc.al(450057476);

            while(951500247553634275L * ac == 0L || dq.af(55191168) < 951500247553634275L * ac) {
               mp.aq = pj.ay.an(al * 2118369515, -1500331287 * at, -1491982008) * 89306205;

               for(int var7 = 0; var7 < mp.aq * -873938955; ++var7) {
                  this.ap(1294253430);
               }

               this.by((byte)29);
               this.at(this.bk, 1513004820);
            }
         } catch (Exception var5) {
            ob.af((String)null, var5, (byte)8);
            this.br("crash", -2128881192);
         }

         this.be(812160949);
      } catch (RuntimeException var6) {
         throw db.an(var6, "bm.run(" + ')');
      }
   }

   void ap(int var1) {
      try {
         long var2 = dq.af(1811202151);
         long var4 = ag[702273735 * my.ah];
         ag[702273735 * my.ah] = var2;
         my.ah = 94857463 * (my.ah * 702273735 + 1 & 31);
         if (var4 != 0L) {
            if (var1 == 1003505289) {
               throw new IllegalStateException();
            }

            if (var2 > var4 && var1 == 1003505289) {
               throw new IllegalStateException();
            }
         }

         synchronized(this) {
            mx.bf = bu;
         }

         this.bd(-2106306379);
      } catch (RuntimeException var9) {
         throw db.an(var9, "bm.ap(" + ')');
      }
   }

   public final void an(Graphics var1) {
      this.paint(var1);
   }

   final void bb(int var1) {
      try {
         qu var2 = this.bu(-1516355947);
         if (var2.aw * 944313703 == -927540391 * this.av) {
            if (var1 >= 1164114216) {
               return;
            }

            if (-1747234661 * this.ar == var2.ac * -1376251093) {
               if (var1 >= 1164114216) {
                  throw new IllegalStateException();
               }

               if (!this.bm) {
                  return;
               }

               if (var1 >= 1164114216) {
                  return;
               }
            }
         }

         this.ar(1698796359);
         this.bm = false;
      } catch (RuntimeException var3) {
         throw db.an(var3, "bm.bb(" + ')');
      }
   }

   protected void dz(boolean var1) {
      if (var1 != this.by) {
         this.by = var1;
         ia.bn.am(var1, 125940170);
         ia.bn.ar((byte)0);
      }

   }

   protected abstract void bd(int var1);

   public final void start() {
      try {
         if (an == this && !au) {
            ac = 0L;
         }
      } catch (RuntimeException var1) {
         throw db.an(var1, "bm.start(" + ')');
      }
   }

   public final void stop() {
      try {
         if (an == this && !au) {
            ac = (dq.af(-160464610) + 4000L) * -2406892942717923893L;
         }
      } catch (RuntimeException var1) {
         throw db.an(var1, "bm.stop(" + ')');
      }
   }

   public final void destroy() {
      try {
         if (this == an && !au) {
            ac = dq.af(-451893560) * -2406892942717923893L;
            mw.af(5000L);
            this.be(497965592);
         }
      } catch (RuntimeException var1) {
         throw db.an(var1, "bm.destroy(" + ')');
      }
   }

   public final void update(Graphics var1) {
      try {
         this.paint(var1);
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.update(" + ')');
      }
   }

   public final synchronized void paint(Graphics var1) {
      try {
         if (an == this && !au) {
            this.bx = true;
            if (dq.af(-236357307) - -6171487387477770437L * this.bt > 1000L) {
               Rectangle var2 = var1.getClipBounds();
               if (var2 == null || var2.width >= aj * -1687260435 && var2.height >= 1658005443 * kd.ak) {
                  this.bd = true;
               }
            }

         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "bm.paint(" + ')');
      }
   }

   public final void focusGained(FocusEvent var1) {
      try {
         bu = true;
         this.bx = true;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.focusGained(" + ')');
      }
   }

   final void ar(int var1) {
      try {
         Container var2 = this.bg((byte)6);
         if (null == var2) {
            if (var1 >= 2119369406) {
               throw new IllegalStateException();
            }
         } else {
            qu var3 = this.bu(-1516355947);
            this.av = Math.max(944313703 * var3.aw, 69014751 * this.az) * -2050638615;
            this.ar = Math.max(var3.ac * -1376251093, 1673949127 * this.ad) * -1550051949;
            if (-927540391 * this.av <= 0) {
               if (var1 >= 2119369406) {
                  return;
               }

               this.av = -2050638615;
            }

            if (-1747234661 * this.ar <= 0) {
               if (var1 >= 2119369406) {
                  throw new IllegalStateException();
               }

               this.ar = -1550051949;
            }

            aj = Math.min(-927540391 * this.av, 2087275977 * this.ae) * 2082454245;
            kd.ak = Math.min(-1747234661 * this.ar, 83534669 * this.ap) * -16547605;
            this.am = (this.av * -927540391 - -1687260435 * aj) / 2 * 1463717787;
            this.as = 0;
            this.bk.setSize(aj * -1687260435, kd.ak * 1658005443);
            ia.bn = new bo(-1687260435 * aj, 1658005443 * kd.ak, this.bk, this.by);
            if (var2 == this.be) {
               Insets var4 = this.be.getInsets();
               this.bk.setLocation(var4.left + -744210797 * this.am, this.as * 895830209 + var4.top);
            } else {
               this.bk.setLocation(this.am * -744210797, 895830209 * this.as);
            }

            this.bx = true;
            this.am((byte)79);
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "bm.ar(" + ')');
      }
   }

   Container ft() {
      return (Container)(null != this.be ? this.be : this);
   }

   protected final void ag(byte var1) {
      try {
         bq.au(190164456);
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.ag(" + ')');
      }
   }

   public final void windowClosing(WindowEvent var1) {
      try {
         this.destroy();
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.windowClosing(" + ')');
      }
   }

   public final void windowDeactivated(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.windowDeactivated(" + ')');
      }
   }

   protected abstract void bj(int var1);

   public final void windowIconified(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.windowIconified(" + ')');
      }
   }

   public final void windowOpened(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.windowOpened(" + ')');
      }
   }

   public abstract void init();

   void by(byte var1) {
      try {
         Container var2 = this.bg((byte)6);
         long var3 = dq.af(1755738982);
         long var5 = ax[in.ai * -689745739];
         ax[-689745739 * in.ai] = var3;
         in.ai = -1417208419 * (1 + -689745739 * in.ai & 31);
         if (0L != var5) {
            if (var1 != 29) {
               throw new IllegalStateException();
            }

            if (var3 > var5) {
               if (var1 != 29) {
                  throw new IllegalStateException();
               }

               int var7 = (int)(var3 - var5);
               aa = (32000 + (var7 >> 1)) / var7 * 1691803635;
            }
         }

         if ((bz += 769754581) * 148605821 - 1 > 50) {
            if (var1 != 29) {
               throw new IllegalStateException();
            }

            bz -= -166976614;
            this.bx = true;
            this.bk.setSize(aj * -1687260435, 1658005443 * kd.ak);
            this.bk.setVisible(true);
            if (var2 == this.be) {
               if (var1 != 29) {
                  throw new IllegalStateException();
               }

               Insets var9 = this.be.getInsets();
               this.bk.setLocation(-744210797 * this.am + var9.left, var9.top + 895830209 * this.as);
            } else {
               this.bk.setLocation(this.am * -744210797, 895830209 * this.as);
            }
         }

         if (this.bd) {
            if (var1 != 29) {
               throw new IllegalStateException();
            }

            this.aj(1142186209);
         }

         this.bb(-1941798605);
         this.bt(this.bx, (short)7737);
         if (this.bx) {
            if (var1 != 29) {
               throw new IllegalStateException();
            }

            this.as((byte)23);
         }

         this.bx = false;
      } catch (RuntimeException var8) {
         throw db.an(var8, "bm.by(" + ')');
      }
   }

   protected final void bv(int var1, int var2) {
      if (var1 != 2087275977 * this.ae || 83534669 * this.ap != var2) {
         this.bi(-308326596);
      }

      this.ae = var1 * -753509255;
      this.ap = var2 * 524036191;
   }

   protected abstract void bt(boolean var1, short var2);

   protected void fm(String var1) {
      if (!this.ab) {
         this.ab = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }

      }
   }

   protected final void bn(int var1, String var2, boolean var3, int var4) {
      try {
         try {
            Graphics var5 = this.bk.getGraphics();
            if (null == jn.bb) {
               if (var4 >= -1948942042) {
                  throw new IllegalStateException();
               }

               jn.bb = new Font("Helvetica", 1, 13);
               bb.bi = this.bk.getFontMetrics(jn.bb);
            }

            if (var3) {
               if (var4 >= -1948942042) {
                  return;
               }

               var5.setColor(Color.black);
               var5.fillRect(0, 0, -1687260435 * aj, 1658005443 * kd.ak);
            }

            Color var6 = new Color(140, 17, 17);

            try {
               if (eq.bo == null) {
                  if (var4 >= -1948942042) {
                     return;
                  }

                  eq.bo = this.bk.createImage(304, 34);
               }

               Graphics var7 = eq.bo.getGraphics();
               var7.setColor(var6);
               var7.drawRect(0, 0, 303, 33);
               var7.fillRect(2, 2, 3 * var1, 30);
               var7.setColor(Color.black);
               var7.drawRect(1, 1, 301, 31);
               var7.fillRect(var1 * 3 + 2, 2, 300 - 3 * var1, 30);
               var7.setFont(jn.bb);
               var7.setColor(Color.white);
               var7.drawString(var2, (304 - bb.bi.stringWidth(var2)) / 2, 22);
               var5.drawImage(eq.bo, aj * -1687260435 / 2 - 152, kd.ak * 1658005443 / 2 - 18, (ImageObserver)null);
            } catch (Exception var10) {
               int var8 = -1687260435 * aj / 2 - 152;
               int var9 = 1658005443 * kd.ak / 2 - 18;
               var5.setColor(var6);
               var5.drawRect(var8, var9, 303, 33);
               var5.fillRect(var8 + 2, 2 + var9, var1 * 3, 30);
               var5.setColor(Color.black);
               var5.drawRect(1 + var8, var9 + 1, 301, 31);
               var5.fillRect(3 * var1 + 2 + var8, var9 + 2, 300 - 3 * var1, 30);
               var5.setFont(jn.bb);
               var5.setColor(Color.white);
               var5.drawString(var2, var8 + (304 - bb.bi.stringWidth(var2)) / 2, 22 + var9);
            }
         } catch (Exception var11) {
            this.bk.repaint();
         }

      } catch (RuntimeException var12) {
         throw db.an(var12, "bm.bn(" + ')');
      }
   }

   final synchronized void be(int var1) {
      try {
         if (au) {
            if (var1 == -1279409393) {
               throw new IllegalStateException();
            }
         } else {
            au = true;

            try {
               this.bk.removeFocusListener(this);
            } catch (Exception var6) {
            }

            try {
               this.bj(-72974483);
            } catch (Exception var5) {
            }

            if (this.be != null) {
               if (var1 == -1279409393) {
                  throw new IllegalStateException();
               }

               try {
                  System.exit(0);
               } catch (Throwable var4) {
               }
            }

            if (null != af) {
               if (var1 == -1279409393) {
                  throw new IllegalStateException();
               }

               try {
                  af.af(-1782899864);
               } catch (Exception var3) {
               }
            }

            this.ba(-1086551379);
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "bm.be(" + ')');
      }
   }

   protected void br(String var1, int var2) {
      try {
         if (this.ab) {
            if (var2 == 1235713104) {
               throw new IllegalStateException();
            }
         } else {
            this.ab = true;
            System.out.println("error_game_" + var1);

            try {
               this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
            } catch (Exception var4) {
            }

         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "bm.br(" + ')');
      }
   }

   protected abstract void bm(byte var1);

   qu bu(int var1) {
      try {
         Container var2 = this.bg((byte)6);
         int var3 = Math.max(var2.getWidth(), this.az * 69014751);
         int var4 = Math.max(var2.getHeight(), 1673949127 * this.ad);
         if (null != this.be) {
            if (var1 != -1516355947) {
               throw new IllegalStateException();
            }

            Insets var5 = this.be.getInsets();
            var3 -= var5.right + var5.left;
            var4 -= var5.top + var5.bottom;
         }

         return new qu(var3, var4);
      } catch (RuntimeException var6) {
         throw db.an(var6, "bm.bu(" + ')');
      }
   }

   protected abstract void fa();

   protected abstract void ba(int var1);

   public final void ey(WindowEvent var1) {
   }

   public final void af(Graphics var1) {
      this.paint(var1);
   }

   protected void ao(String var1, byte var2) {
      try {
         this.br.setContents(new StringSelection(var1), (ClipboardOwner)null);
      } catch (RuntimeException var3) {
         throw db.an(var3, "bm.ao(" + ')');
      }
   }

   protected abstract void gc();

   public final synchronized void ac(Graphics var1) {
      if (an == this && !au) {
         this.bx = true;
         if (dq.af(646879891) - -6171487387477770437L * this.bt > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= aj * -334073675 && var2.height >= 1658005443 * kd.ak) {
               this.bd = true;
            }
         }

      }
   }

   public final synchronized void au(Graphics var1) {
      if (an == this && !au) {
         this.bx = true;
         if (dq.af(-486258269) - -6171487387477770437L * this.bt > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= aj * -1687260435 && var2.height >= 1658005443 * kd.ak) {
               this.bd = true;
            }
         }

      }
   }

   public final synchronized void ab(Graphics var1) {
      if (an == this && !au) {
         this.bx = true;
         if (dq.af(622436992) - -6171487387477770437L * this.bt > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= aj * -1687260435 && var2.height >= 1658005443 * kd.ak) {
               this.bd = true;
            }
         }

      }
   }

   public final synchronized void aq(Graphics var1) {
      if (an == this && !au) {
         this.bx = true;
         if (dq.af(312598050) - -6171487387477770437L * this.bt > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= aj * -1687260435 && var2.height >= 1658005443 * kd.ak) {
               this.bd = true;
            }
         }

      }
   }

   public final void bk(FocusEvent var1) {
      bu = true;
      this.bx = true;
   }

   public final void bx(FocusEvent var1) {
      bu = false;
   }

   public final void bo(FocusEvent var1) {
      bu = false;
   }

   public final void windowClosed(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.windowClosed(" + ')');
      }
   }

   protected final void bl(int var1, int var2) {
      if (var1 != 2087275977 * this.ae || 83534669 * this.ap != var2) {
         this.bi(-2084705385);
      }

      this.ae = var1 * -753509255;
      this.ap = var2 * -438874747;
   }

   protected gf bp() {
      if (this.bs == null) {
         this.bs = new ak();
         this.bs.af(this.bk, -1292958576);
      }

      return this.bs;
   }

   void du() {
      long var1 = dq.af(-84529913);
      long var3 = ag[1876302371 * my.ah];
      ag[702273735 * my.ah] = var1;
      my.ah = 390659723 * (my.ah * 1792635681 + 1 & 1458006761);
      if (var3 != 0L && var1 > var3) {
      }

      synchronized(this) {
         mx.bf = bu;
      }

      this.bd(-2102387167);
   }

   protected gf bh() {
      if (this.bs == null) {
         this.bs = new ak();
         this.bs.af(this.bk, -512958595);
      }

      return this.bs;
   }

   public final void el(WindowEvent var1) {
   }

   protected abstract void co();

   protected void ci() {
      this.br = this.getToolkit().getSystemClipboard();
   }

   protected bm() {
      try {
         super();
         this.ab = false;
         this.am = 0;
         this.as = 0;
         this.by = false;
         this.bx = true;
         this.bm = false;
         this.bd = false;
         this.bt = 0L;
         EventQueue var1 = null;

         try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
         } catch (Throwable var3) {
         }

         this.bg = var1;
         az var2 = new az();
         bu.ax = var2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "bm.<init>(" + ')');
      }
   }

   protected Clipboard cc() {
      return this.br;
   }

   public final void ez() {
      if (an == this && !au) {
         ac = 0L;
      }
   }

   protected Clipboard ca() {
      return this.br;
   }

   public final void windowDeiconified(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.windowDeiconified(" + ')');
      }
   }

   public final void em(WindowEvent var1) {
      this.destroy();
   }

   protected final void cm() {
      bq.au(190164456);
   }

   protected void cf(be var1, int var2) {
      bq.af(var1, var2, -123589902);
   }

   protected void cl(be var1, int var2) {
      bq.af(var1, var2, 1517381685);
   }

   protected void cg(be var1, int var2) {
      bq.af(var1, var2, 330446593);
   }

   protected final void cr() {
      pc.af((Component)this.bk, -1018034590);
   }

   final void cy() {
      Container var1 = this.bg((byte)6);
      if (null != var1) {
         qu var2 = this.bu(-1516355947);
         this.av = Math.max(944313703 * var2.aw, 69014751 * this.az) * -2050638615;
         this.ar = Math.max(var2.ac * -1376251093, 1673949127 * this.ad) * -1550051949;
         if (-927540391 * this.av <= 0) {
            this.av = -2050638615;
         }

         if (-1747234661 * this.ar <= 0) {
            this.ar = -1550051949;
         }

         aj = Math.min(-927540391 * this.av, 2087275977 * this.ae) * 2082454245;
         kd.ak = Math.min(-1747234661 * this.ar, 83534669 * this.ap) * -16547605;
         this.am = (this.av * -927540391 - -1687260435 * aj) / 2 * 1463717787;
         this.as = 0;
         this.bk.setSize(aj * -1687260435, kd.ak * 1658005443);
         ia.bn = new bo(-1687260435 * aj, 1658005443 * kd.ak, this.bk, this.by);
         if (var1 == this.be) {
            Insets var3 = this.be.getInsets();
            this.bk.setLocation(var3.left + -744210797 * this.am, this.as * 895830209 + var3.top);
         } else {
            this.bk.setLocation(this.am * -744210797, 895830209 * this.as);
         }

         this.bx = true;
         this.am((byte)37);
      }
   }

   final void cx() {
      Container var1 = this.bg((byte)6);
      if (null != var1) {
         qu var2 = this.bu(-1516355947);
         this.av = Math.max(944313703 * var2.aw, 69014751 * this.az) * -2050638615;
         this.ar = Math.max(var2.ac * -1376251093, 1673949127 * this.ad) * -1550051949;
         if (-927540391 * this.av <= 0) {
            this.av = -2050638615;
         }

         if (-1747234661 * this.ar <= 0) {
            this.ar = -1550051949;
         }

         aj = Math.min(-927540391 * this.av, 2087275977 * this.ae) * 2082454245;
         kd.ak = Math.min(-1747234661 * this.ar, 83534669 * this.ap) * -16547605;
         this.am = (this.av * -927540391 - -1687260435 * aj) / 2 * 1463717787;
         this.as = 0;
         this.bk.setSize(aj * -1687260435, kd.ak * 1658005443);
         ia.bn = new bo(-1687260435 * aj, 1658005443 * kd.ak, this.bk, this.by);
         if (var1 == this.be) {
            Insets var3 = this.be.getInsets();
            this.bk.setLocation(var3.left + -744210797 * this.am, this.as * 895830209 + var3.top);
         } else {
            this.bk.setLocation(this.am * -744210797, 895830209 * this.as);
         }

         this.bx = true;
         this.am((byte)72);
      }
   }

   final void cv() {
      Container var1 = this.bg((byte)6);
      if (null != var1) {
         qu var2 = this.bu(-1516355947);
         this.av = Math.max(944313703 * var2.aw, 69014751 * this.az) * -2050638615;
         this.ar = Math.max(var2.ac * -1376251093, 1673949127 * this.ad) * -1550051949;
         if (-927540391 * this.av <= 0) {
            this.av = -2050638615;
         }

         if (-1747234661 * this.ar <= 0) {
            this.ar = -1550051949;
         }

         aj = Math.min(-927540391 * this.av, 2087275977 * this.ae) * 2082454245;
         kd.ak = Math.min(-1747234661 * this.ar, 83534669 * this.ap) * -16547605;
         this.am = (this.av * -927540391 - -1687260435 * aj) / 2 * 1463717787;
         this.as = 0;
         this.bk.setSize(aj * -1687260435, kd.ak * 1658005443);
         ia.bn = new bo(-1687260435 * aj, 1658005443 * kd.ak, this.bk, this.by);
         if (var1 == this.be) {
            Insets var3 = this.be.getInsets();
            this.bk.setLocation(var3.left + -744210797 * this.am, this.as * 895830209 + var3.top);
         } else {
            this.bk.setLocation(this.am * -744210797, 895830209 * this.as);
         }

         this.bx = true;
         this.am((byte)17);
      }
   }

   protected abstract void cb();

   public final void focusLost(FocusEvent var1) {
      try {
         bu = false;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.focusLost(" + ')');
      }
   }

   void cz() {
      int var1 = -744210797 * this.am;
      int var2 = 895830209 * this.as;
      int var3 = -927540391 * this.av - -1687260435 * aj - var1;
      int var4 = this.ar * -1747234661 - kd.ak * 1658005443 - var2;
      if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.bg((byte)6);
            int var6 = 0;
            int var7 = 0;
            if (var5 == this.be) {
               Insets var8 = this.be.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
               var10.fillRect(var6, var7, var1, -1747234661 * this.ar);
            }

            if (var2 > 0) {
               var10.fillRect(var6, var7, -927540391 * this.av, var2);
            }

            if (var3 > 0) {
               var10.fillRect(var6 + this.av * -927540391 - var3, var7, var3, this.ar * -1747234661);
            }

            if (var4 > 0) {
               var10.fillRect(var6, var7 + this.ar * -1747234661 - var4, -927540391 * this.av, var4);
            }
         } catch (Exception var9) {
         }
      }

   }

   static void al(int var0) {
      try {
         Iterator var1 = eo.an.iterator();

         while(var1.hasNext()) {
            if (var0 == 608753495) {
               return;
            }

            cq var2 = (cq)var1.next();
            var2.an((byte)-124);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "bm.al(" + ')');
      }
   }

   final void cj() {
      bq.ac(this.bk, 1146077895);
      Canvas var1 = this.bk;
      var1.removeMouseListener(bd.ac);
      var1.removeMouseMotionListener(bd.ac);
      var1.removeFocusListener(bd.ac);
      bd.ab = 0;
      if (this.bs != null) {
         this.bs.an(this.bk, 109187860);
      }

      this.az(759046030);
      bq.aw(this.bk, (byte)64);
      pc.af((Component)this.bk, -266758715);
      if (this.bs != null) {
         this.bs.af(this.bk, -1965095158);
      }

      this.bi(-908164626);
   }

   final void ch() {
      bq.ac(this.bk, -888034364);
      Canvas var1 = this.bk;
      var1.removeMouseListener(bd.ac);
      var1.removeMouseMotionListener(bd.ac);
      var1.removeFocusListener(bd.ac);
      bd.ab = 0;
      if (this.bs != null) {
         this.bs.an(this.bk, 109187860);
      }

      this.az(-1803506032);
      bq.aw(this.bk, (byte)64);
      pc.af((Component)this.bk, -1907610252);
      if (this.bs != null) {
         this.bs.af(this.bk, -215761426);
      }

      this.bi(-1334984441);
   }

   protected final void dc(int var1, int var2, int var3, int var4) {
      try {
         if (null != an) {
            aw += -914573903;
            if (aw * 1470919505 >= 3) {
               this.br("alreadyloaded", 896729460);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         an = this;
         aj = var1 * 2082454245;
         kd.ak = -16547605 * var2;
         tr.aw = var3 * -136548689;
         qh.ac = 767373001 * var4;
         dn.af = this;
         if (null == af) {
            af = new gd();
         }

         af.ac(this, 1, (byte)0);
      } catch (Exception var6) {
         ob.af((String)null, var6, (byte)8);
         this.br("crash", 332720012);
      }

   }

   void dd() {
      Container var1 = this.bg((byte)6);
      long var2 = dq.af(652001504);
      long var4 = ax[in.ai * 1151958567];
      ax[-1903434896 * in.ai] = var2;
      in.ai = -1417208419 * (1 + -689745739 * in.ai & -2078116914);
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         aa = (1798715468 + (var6 >> 1)) / var6 * 1691803635;
      }

      if ((bz += 769754581) * -1956251093 - 1 > 196179764) {
         bz -= -166976614;
         this.bx = true;
         this.bk.setSize(aj * 662719275, -31410281 * kd.ak);
         this.bk.setVisible(true);
         if (var1 == this.be) {
            Insets var7 = this.be.getInsets();
            this.bk.setLocation(-744210797 * this.am + var7.left, var7.top + -1412449547 * this.as);
         } else {
            this.bk.setLocation(this.am * -744210797, -475338998 * this.as);
         }
      }

      if (this.bd) {
         this.aj(-2123569243);
      }

      this.bb(722126841);
      this.bt(this.bx, (short)29575);
      if (this.bx) {
         this.as((byte)23);
      }

      this.bx = false;
   }

   protected final void cd(int var1, int var2, int var3, int var4) {
      try {
         if (null != an) {
            aw += 1564523937;
            if (aw * 1470919505 >= 3) {
               this.br("alreadyloaded", 1617725624);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         an = this;
         aj = var1 * 2082454245;
         kd.ak = -16547605 * var2;
         tr.aw = var3 * -850532629;
         qh.ac = -1496319204 * var4;
         dn.af = this;
         if (null == af) {
            af = new gd();
         }

         af.ac(this, 1, (byte)0);
      } catch (Exception var6) {
         ob.af((String)null, var6, (byte)8);
         this.br("crash", 1205057188);
      }

   }

   protected final void dm(int var1, int var2, int var3, int var4) {
      try {
         if (null != an) {
            aw += -914573903;
            if (aw * -1355550869 >= 3) {
               this.br("alreadyloaded", 1041797247);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         an = this;
         aj = var1 * 1138129439;
         kd.ak = -16547605 * var2;
         tr.aw = var3 * -136548689;
         qh.ac = 767373001 * var4;
         dn.af = this;
         if (null == af) {
            af = new gd();
         }

         af.ac(this, 1, (byte)0);
      } catch (Exception var6) {
         ob.af((String)null, var6, (byte)8);
         this.br("crash", 1005525310);
      }

   }

   protected final void dw(int var1, int var2, int var3, int var4) {
      try {
         if (null != an) {
            aw += -914573903;
            if (aw * -59836021 >= 3) {
               this.br("alreadyloaded", 146922259);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         an = this;
         aj = var1 * -759017878;
         kd.ak = -1784005023 * var2;
         tr.aw = var3 * -136548689;
         qh.ac = 767373001 * var4;
         dn.af = this;
         if (null == af) {
            af = new gd();
         }

         af.ac(this, 1, (byte)0);
      } catch (Exception var6) {
         ob.af((String)null, var6, (byte)8);
         this.br("crash", -62440740);
      }

   }

   public final void ej() {
      if (an == this && !au) {
         ac = (dq.af(1174706404) + 4000L) * -2406892942717923893L;
      }
   }

   final synchronized void do() {
      Container var1 = this.bg((byte)6);
      if (null != this.bk) {
         this.bk.removeFocusListener(this);
         var1.remove(this.bk);
      }

      aj = Math.max(var1.getWidth(), this.az * -1519342189) * 2082454245;
      kd.ak = Math.max(var1.getHeight(), this.ad * 133553358) * -281054358;
      Insets var2;
      if (null != this.be) {
         var2 = this.be.getInsets();
         aj -= (var2.right + var2.left) * 2082454245;
         kd.ak -= (var2.bottom + var2.top) * -16547605;
      }

      this.bk = new ad(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.bk);
      this.bk.setSize(-1687260435 * aj, 1658005443 * kd.ak);
      this.bk.setVisible(true);
      this.bk.setBackground(Color.BLACK);
      if (this.be == var1) {
         var2 = this.be.getInsets();
         this.bk.setLocation(var2.left + -744210797 * this.am, var2.top + 1510249106 * this.as);
      } else {
         this.bk.setLocation(this.am * -744210797, this.as * 1530318169);
      }

      this.bk.addFocusListener(this);
      this.bk.requestFocus();
      this.bx = true;
      if (null != ia.bn && -540244595 * ia.bn.ac == aj * -1687260435 && -1831173084 * kd.ak == -1216940728 * ia.bn.au) {
         ((bo)ia.bn).af(this.bk, (byte)63);
         ia.bn.an(0, 0, -261993821);
      } else {
         ia.bn = new bo(-1687260435 * aj, kd.ak * 1658005443, this.bk, this.by);
      }

      this.bd = false;
      this.bt = dq.af(1723093467) * -515103886995160589L;
   }

   final synchronized void di() {
      Container var1 = this.bg((byte)6);
      if (null != this.bk) {
         this.bk.removeFocusListener(this);
         var1.remove(this.bk);
      }

      aj = Math.max(var1.getWidth(), this.az * 69014751) * 2082454245;
      kd.ak = Math.max(var1.getHeight(), this.ad * 1673949127) * -16547605;
      Insets var2;
      if (null != this.be) {
         var2 = this.be.getInsets();
         aj -= (var2.right + var2.left) * 2082454245;
         kd.ak -= (var2.bottom + var2.top) * -16547605;
      }

      this.bk = new ad(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.bk);
      this.bk.setSize(-1687260435 * aj, 1658005443 * kd.ak);
      this.bk.setVisible(true);
      this.bk.setBackground(Color.BLACK);
      if (this.be == var1) {
         var2 = this.be.getInsets();
         this.bk.setLocation(var2.left + -744210797 * this.am, var2.top + 895830209 * this.as);
      } else {
         this.bk.setLocation(this.am * -744210797, this.as * 895830209);
      }

      this.bk.addFocusListener(this);
      this.bk.requestFocus();
      this.bx = true;
      if (null != ia.bn && 1313069155 * ia.bn.ac == aj * -1687260435 && 1658005443 * kd.ak == 1695726685 * ia.bn.au) {
         ((bo)ia.bn).af(this.bk, (byte)84);
         ia.bn.an(0, 0, 1282122906);
      } else {
         ia.bn = new bo(-1687260435 * aj, kd.ak * 1658005443, this.bk, this.by);
      }

      this.bd = false;
      this.bt = dq.af(713684195) * -515103886995160589L;
   }

   final synchronized void dr() {
      Container var1 = this.bg((byte)6);
      if (null != this.bk) {
         this.bk.removeFocusListener(this);
         var1.remove(this.bk);
      }

      aj = Math.max(var1.getWidth(), this.az * 69014751) * 2082454245;
      kd.ak = Math.max(var1.getHeight(), this.ad * 1673949127) * -16547605;
      Insets var2;
      if (null != this.be) {
         var2 = this.be.getInsets();
         aj -= (var2.right + var2.left) * 2082454245;
         kd.ak -= (var2.bottom + var2.top) * -16547605;
      }

      this.bk = new ad(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.bk);
      this.bk.setSize(-1687260435 * aj, 1658005443 * kd.ak);
      this.bk.setVisible(true);
      this.bk.setBackground(Color.BLACK);
      if (this.be == var1) {
         var2 = this.be.getInsets();
         this.bk.setLocation(var2.left + -744210797 * this.am, var2.top + 895830209 * this.as);
      } else {
         this.bk.setLocation(this.am * -744210797, this.as * 895830209);
      }

      this.bk.addFocusListener(this);
      this.bk.requestFocus();
      this.bx = true;
      if (null != ia.bn && 1313069155 * ia.bn.ac == aj * -1687260435 && 1658005443 * kd.ak == 1695726685 * ia.bn.au) {
         ((bo)ia.bn).af(this.bk, (byte)8);
         ia.bn.an(0, 0, 1608103191);
      } else {
         ia.bn = new bo(-1687260435 * aj, kd.ak * 1658005443, this.bk, this.by);
      }

      this.bd = false;
      this.bt = dq.af(2079584375) * -515103886995160589L;
   }

   final synchronized void dl() {
      Container var1 = this.bg((byte)6);
      if (null != this.bk) {
         this.bk.removeFocusListener(this);
         var1.remove(this.bk);
      }

      aj = Math.max(var1.getWidth(), this.az * -1258157441) * 2082454245;
      kd.ak = Math.max(var1.getHeight(), this.ad * 1426239306) * -16547605;
      Insets var2;
      if (null != this.be) {
         var2 = this.be.getInsets();
         aj -= (var2.right + var2.left) * -2082603289;
         kd.ak -= (var2.bottom + var2.top) * -16547605;
      }

      this.bk = new ad(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.bk);
      this.bk.setSize(-1058781625 * aj, 2098881115 * kd.ak);
      this.bk.setVisible(true);
      this.bk.setBackground(Color.BLACK);
      if (this.be == var1) {
         var2 = this.be.getInsets();
         this.bk.setLocation(var2.left + 1893100664 * this.am, var2.top + -1828249033 * this.as);
      } else {
         this.bk.setLocation(this.am * 1342665558, this.as * 895830209);
      }

      this.bk.addFocusListener(this);
      this.bk.requestFocus();
      this.bx = true;
      if (null != ia.bn && 163168565 * ia.bn.ac == aj * -1687260435 && -934386346 * kd.ak == 1695726685 * ia.bn.au) {
         ((bo)ia.bn).af(this.bk, (byte)127);
         ia.bn.an(0, 0, -2144659546);
      } else {
         ia.bn = new bo(-1687260435 * aj, kd.ak * 1658005443, this.bk, this.by);
      }

      this.bd = false;
      this.bt = dq.af(-123244483) * -515103886995160589L;
   }

   protected void dk(boolean var1) {
      if (var1 != this.by) {
         this.by = var1;
         ia.bn.am(var1, -572724659);
         ia.bn.ar((byte)0);
      }

   }

   protected void dt(boolean var1) {
      if (var1 != this.by) {
         this.by = var1;
         ia.bn.am(var1, 897213302);
         ia.bn.ar((byte)0);
      }

   }

   final void bi(int var1) {
      try {
         this.bm = true;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.bi(" + ')');
      }
   }

   Container gr() {
      return (Container)(null != this.be ? this.be : this);
   }

   public final void windowActivated(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.windowActivated(" + ')');
      }
   }

   protected final boolean de() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if (var1.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= -1107988483) {
                  var1 = var1.substring(0, var1.length() - 1);
               }

               if (var1.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.br("invalidhost", -1888210231);
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public abstract void fi();

   void dp() {
      long var1 = dq.af(2119797645);
      long var3 = ag[702273735 * my.ah];
      ag[-105094121 * my.ah] = var1;
      my.ah = -1240221692 * (my.ah * -2112543606 + 1 & 31);
      if (var3 != 0L && var1 > var3) {
      }

      synchronized(this) {
         mx.bf = bu;
      }

      this.bd(-2081916691);
   }

   public final void ea() {
      if (an == this && !au) {
         ac = (dq.af(597756630) + 4000L) * -2406892942717923893L;
      }
   }

   void db() {
      long var1 = dq.af(-417439777);
      long var3 = ag[702273735 * my.ah];
      ag[702273735 * my.ah] = var1;
      my.ah = 94857463 * (my.ah * 702273735 + 1 & 31);
      if (var3 != 0L && var1 > var3) {
      }

      synchronized(this) {
         mx.bf = bu;
      }

      this.bd(-2098685834);
   }

   void df() {
      Container var1 = this.bg((byte)6);
      long var2 = dq.af(783234153);
      long var4 = ax[in.ai * -689745739];
      ax[-689745739 * in.ai] = var2;
      in.ai = -1417208419 * (1 + -689745739 * in.ai & 31);
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         aa = (32000 + (var6 >> 1)) / var6 * 1691803635;
      }

      if ((bz += 769754581) * 148605821 - 1 > 50) {
         bz -= -166976614;
         this.bx = true;
         this.bk.setSize(aj * -1687260435, 1658005443 * kd.ak);
         this.bk.setVisible(true);
         if (var1 == this.be) {
            Insets var7 = this.be.getInsets();
            this.bk.setLocation(-744210797 * this.am + var7.left, var7.top + 895830209 * this.as);
         } else {
            this.bk.setLocation(this.am * -744210797, 895830209 * this.as);
         }
      }

      if (this.bd) {
         this.aj(1698172633);
      }

      this.bb(-212550234);
      this.bt(this.bx, (short)24316);
      if (this.bx) {
         this.as((byte)23);
      }

      this.bx = false;
   }

   void dq() {
      Container var1 = this.bg((byte)6);
      long var2 = dq.af(2146069755);
      long var4 = ax[in.ai * 1619524634];
      ax[-1134613253 * in.ai] = var2;
      in.ai = 1655534107 * (1 + -689745739 * in.ai & 31);
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         aa = (-1382603890 + (var6 >> 1)) / var6 * 1691803635;
      }

      if ((bz += 1062200873) * -464338692 - 1 > 50) {
         bz -= -166976614;
         this.bx = true;
         this.bk.setSize(aj * -1687260435, 706318287 * kd.ak);
         this.bk.setVisible(true);
         if (var1 == this.be) {
            Insets var7 = this.be.getInsets();
            this.bk.setLocation(1881118304 * this.am + var7.left, var7.top + 895830209 * this.as);
         } else {
            this.bk.setLocation(this.am * -744210797, 1137168852 * this.as);
         }
      }

      if (this.bd) {
         this.aj(945944437);
      }

      this.bb(-920130140);
      this.bt(this.bx, (short)24072);
      if (this.bx) {
         this.as((byte)23);
      }

      this.bx = false;
   }

   protected final void fc(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.bk.getGraphics();
         if (null == jn.bb) {
            jn.bb = new Font("Helvetica", 1, 13);
            bb.bi = this.bk.getFontMetrics(jn.bb);
         }

         if (var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, 2094430171 * aj, 1916189544 * kd.ak);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if (eq.bo == null) {
               eq.bo = this.bk.createImage(304, 34);
            }

            Graphics var6 = eq.bo.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 2057049657, 33);
            var6.fillRect(2, 2, 3 * var1, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, -661605756, -1246122833);
            var6.fillRect(var1 * 3 + 2, 2, 300 - 3 * var1, 30);
            var6.setFont(jn.bb);
            var6.setColor(Color.white);
            var6.drawString(var2, (-1946999059 - bb.bi.stringWidth(var2)) / 2, 22);
            var4.drawImage(eq.bo, aj * -169001378 / 2 - 152, kd.ak * 1658005443 / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = -1687260435 * aj / 2 - 152;
            int var8 = 1658005443 * kd.ak / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, 303, 33);
            var4.fillRect(var7 + 2, 2 + var8, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(1 + var7, var8 + 1, -1299690707, 276043293);
            var4.fillRect(3 * var1 + 2 + var7, var8 + 2, 538904330 - 3 * var1, 30);
            var4.setFont(jn.bb);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - bb.bi.stringWidth(var2)) / 2, 22 + var8);
         }
      } catch (Exception var10) {
         this.bk.repaint();
      }

   }

   void dj() {
      Container var1 = this.bg((byte)6);
      long var2 = dq.af(23779710);
      long var4 = ax[in.ai * -689745739];
      ax[-689745739 * in.ai] = var2;
      in.ai = -1417208419 * (1 + -689745739 * in.ai & 31);
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         aa = (32000 + (var6 >> 1)) / var6 * 1691803635;
      }

      if ((bz += 769754581) * 148605821 - 1 > 50) {
         bz -= -166976614;
         this.bx = true;
         this.bk.setSize(aj * -1687260435, 1658005443 * kd.ak);
         this.bk.setVisible(true);
         if (var1 == this.be) {
            Insets var7 = this.be.getInsets();
            this.bk.setLocation(-744210797 * this.am + var7.left, var7.top + 895830209 * this.as);
         } else {
            this.bk.setLocation(this.am * -744210797, 895830209 * this.as);
         }
      }

      if (this.bd) {
         this.aj(847650772);
      }

      this.bb(-396472741);
      this.bt(this.bx, (short)20094);
      if (this.bx) {
         this.as((byte)23);
      }

      this.bx = false;
   }

   protected void fk(String var1) {
      if (!this.ab) {
         this.ab = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }

      }
   }

   protected final void ak(int var1, int var2, int var3, int var4, byte var5) {
      try {
         try {
            if (null != an) {
               if (var5 >= 0) {
                  throw new IllegalStateException();
               }

               aw += -914573903;
               if (aw * 1470919505 >= 3) {
                  if (var5 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.br("alreadyloaded", 858563294);
                  return;
               }

               this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
               return;
            }

            an = this;
            aj = var1 * 2082454245;
            kd.ak = -16547605 * var2;
            tr.aw = var3 * -136548689;
            qh.ac = 767373001 * var4;
            dn.af = this;
            if (null == af) {
               af = new gd();
            }

            af.ac(this, 1, (byte)0);
         } catch (Exception var7) {
            ob.af((String)null, var7, (byte)8);
            this.br("crash", -1769013593);
         }

      } catch (RuntimeException var8) {
         throw db.an(var8, "bm.ak(" + ')');
      }
   }

   final void dy() {
      this.bm = true;
   }

   final void ds() {
      this.bm = true;
   }

   final synchronized void da() {
      if (!au) {
         au = true;

         try {
            this.bk.removeFocusListener(this);
         } catch (Exception var5) {
         }

         try {
            this.bj(-72974483);
         } catch (Exception var4) {
         }

         if (this.be != null) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
            }
         }

         if (null != af) {
            try {
               af.af(831049950);
            } catch (Exception var2) {
            }
         }

         this.ba(-1086551379);
      }
   }

   final synchronized void ep() {
      if (!au) {
         au = true;

         try {
            this.bk.removeFocusListener(this);
         } catch (Exception var5) {
         }

         try {
            this.bj(-72974483);
         } catch (Exception var4) {
         }

         if (this.be != null) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
            }
         }

         if (null != af) {
            try {
               af.af(-1129421458);
            } catch (Exception var2) {
            }
         }

         this.ba(-1086551379);
      }
   }

   final synchronized void eo() {
      if (!au) {
         au = true;

         try {
            this.bk.removeFocusListener(this);
         } catch (Exception var5) {
         }

         try {
            this.bj(-72974483);
         } catch (Exception var4) {
         }

         if (this.be != null) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
            }
         }

         if (null != af) {
            try {
               af.af(522027584);
            } catch (Exception var2) {
            }
         }

         this.ba(-1086551379);
      }
   }

   public final void eq() {
      if (an == this && !au) {
         ac = 0L;
      }
   }

   public final void et() {
      if (an == this && !au) {
         ac = 0L;
      }
   }

   public final void ef() {
      if (an == this && !au) {
         ac = 0L;
      }
   }

   protected abstract void fx();

   Container fu() {
      return (Container)(null != this.be ? this.be : this);
   }

   protected void ce() {
      this.br = this.getToolkit().getSystemClipboard();
   }

   public final void eu() {
      if (this == an && !au) {
         ac = dq.af(837356449) * -2406892942717923893L;
         mw.af(5000L);
         this.be(69370348);
      }
   }

   public final void es() {
      if (this == an && !au) {
         ac = dq.af(-139430543) * -2406892942717923893L;
         mw.af(5000L);
         this.be(-1680663447);
      }
   }

   public final void eb(WindowEvent var1) {
   }

   protected void dv(boolean var1) {
      if (var1 != this.by) {
         this.by = var1;
         ia.bn.am(var1, -2106633368);
         ia.bn.ar((byte)0);
      }

   }

   public final void en(WindowEvent var1) {
   }

   public final void er(WindowEvent var1) {
   }

   Container bg(byte var1) {
      try {
         if (null != this.be) {
            if (var1 != 6) {
               throw new IllegalStateException();
            } else {
               return this.be;
            }
         } else {
            return this;
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.bg(" + ')');
      }
   }

   public final void ed(WindowEvent var1) {
   }

   public final void ev(WindowEvent var1) {
   }

   void dh() {
      long var1 = dq.af(957828286);
      long var3 = ag[702273735 * my.ah];
      ag[702273735 * my.ah] = var1;
      my.ah = 94857463 * (my.ah * -879553567 + 1 & 31);
      if (var3 != 0L && var1 > var3) {
      }

      synchronized(this) {
         mx.bf = bu;
      }

      this.bd(-2145498198);
   }

   public final void ew(WindowEvent var1) {
      this.destroy();
   }

   public final void ex(WindowEvent var1) {
   }

   public final void eh(WindowEvent var1) {
   }

   public final void ek(WindowEvent var1) {
   }

   protected abstract void fy();

   public final void ec(WindowEvent var1) {
   }

   protected final void ff() {
      eq.bo = null;
      jn.bb = null;
      bb.bi = null;
   }

   public final void ee(WindowEvent var1) {
   }

   public final void ei(WindowEvent var1) {
   }

   protected void ay(int var1) {
      try {
         this.br = this.getToolkit().getSystemClipboard();
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.ay(" + ')');
      }
   }

   protected final void bs(int var1) {
      try {
         eq.bo = null;
         jn.bb = null;
         bb.bi = null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.bs(" + ')');
      }
   }

   public abstract void fh();

   public abstract void fl();

   public abstract void fp();

   protected abstract void fo();

   protected final void av(byte var1) {
      try {
         pc.af((Component)this.bk, 1714263236);
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.av(" + ')');
      }
   }

   protected abstract void fd();

   protected abstract void fb();

   protected abstract void fn(boolean var1);

   protected Clipboard cn() {
      return this.br;
   }

   protected final boolean dg() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if (var1.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
                  var1 = var1.substring(0, var1.length() - 1);
               }

               if (var1.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.br("invalidhost", -213495388);
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public void gy() {
      try {
         if (null != gd.af) {
            String var1 = gd.af.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = gd.an;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.br("wrongjava", 867728822);
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && ff.aa(var2.charAt(var3), 186393927); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (jb.an(var4, -1571426846) && lg.ac(var4, (byte)92) < 10) {
                     this.br("wrongjava", -2002459390);
                     return;
                  }
               }

               at = -1709110595;
            }
         }

         this.setFocusCycleRoot(true);
         this.az(2070556909);
         this.bm((byte)91);
         pj.ay = fc.al(-774699412);

         while(951500247553634275L * ac == 0L || dq.af(673189286) < 951500247553634275L * ac) {
            mp.aq = pj.ay.an(al * 348118455, 299523984 * at, -900377971) * -1145499060;

            for(int var6 = 0; var6 < mp.aq * 2142982630; ++var6) {
               this.ap(-1128791201);
            }

            this.by((byte)29);
            this.at(this.bk, 1743306475);
         }
      } catch (Exception var5) {
         ob.af((String)null, var5, (byte)8);
         this.br("crash", 1843211231);
      }

      this.be(-1055352876);
   }

   protected abstract void fw();

   protected final void fr(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.bk.getGraphics();
         if (null == jn.bb) {
            jn.bb = new Font("Helvetica", 1, 13);
            bb.bi = this.bk.getFontMetrics(jn.bb);
         }

         if (var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, -993006901 * aj, 2067971846 * kd.ak);
         }

         Color var5 = new Color(1193952064, 17, 17);

         try {
            if (eq.bo == null) {
               eq.bo = this.bk.createImage(304, 34);
            }

            Graphics var6 = eq.bo.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 760597504, 155827970);
            var6.fillRect(2, 2, 3 * var1, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, -966513652, 1315851656);
            var6.fillRect(var1 * 3 + 2, 2, -1985740001 - 3 * var1, 30);
            var6.setFont(jn.bb);
            var6.setColor(Color.white);
            var6.drawString(var2, (304 - bb.bi.stringWidth(var2)) / 2, 22);
            var4.drawImage(eq.bo, aj * -1687260435 / 2 - -765801451, kd.ak * 1658005443 / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = -1687260435 * aj / 2 - 719073224;
            int var8 = 1658005443 * kd.ak / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, -516238593, -1487814245);
            var4.fillRect(var7 + 2, 2 + var8, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(1 + var7, var8 + 1, -1137518944, 31);
            var4.fillRect(3 * var1 + 2 + var7, var8 + 2, -60976142 - 3 * var1, 30);
            var4.setFont(jn.bb);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (646464829 - bb.bi.stringWidth(var2)) / 2, 22 + var8);
         }
      } catch (Exception var10) {
         this.bk.repaint();
      }

   }

   protected final void fv(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.bk.getGraphics();
         if (null == jn.bb) {
            jn.bb = new Font("Helvetica", 1, 13);
            bb.bi = this.bk.getFontMetrics(jn.bb);
         }

         if (var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, -1687260435 * aj, 1984746741 * kd.ak);
         }

         Color var5 = new Color(1008144199, 17, 17);

         try {
            if (eq.bo == null) {
               eq.bo = this.bk.createImage(304, 1607740619);
            }

            Graphics var6 = eq.bo.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 303, 33);
            var6.fillRect(2, 2, 3 * var1, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, 301, 1392632740);
            var6.fillRect(var1 * 3 + 2, 2, 300 - 3 * var1, 30);
            var6.setFont(jn.bb);
            var6.setColor(Color.white);
            var6.drawString(var2, (304 - bb.bi.stringWidth(var2)) / 2, 22);
            var4.drawImage(eq.bo, aj * 515736743 / 2 - 152, kd.ak * 1658005443 / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = 1223070138 * aj / 2 - 308081473;
            int var8 = 527246150 * kd.ak / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, 1858310946, 33);
            var4.fillRect(var7 + 2, 2 + var8, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(1 + var7, var8 + 1, 301, 31);
            var4.fillRect(3 * var1 + 2 + var7, var8 + 2, -2135006800 - 3 * var1, 30);
            var4.setFont(jn.bb);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - bb.bi.stringWidth(var2)) / 2, 22 + var8);
         }
      } catch (Exception var10) {
         this.bk.repaint();
      }

   }

   protected final void fq(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.bk.getGraphics();
         if (null == jn.bb) {
            jn.bb = new Font("Helvetica", 1, 13);
            bb.bi = this.bk.getFontMetrics(jn.bb);
         }

         if (var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, 1604933886 * aj, 2102851015 * kd.ak);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if (eq.bo == null) {
               eq.bo = this.bk.createImage(-1077818123, 1514998152);
            }

            Graphics var6 = eq.bo.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 303, 33);
            var6.fillRect(2, 2, 3 * var1, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, 301, 31);
            var6.fillRect(var1 * 3 + 2, 2, 300 - 3 * var1, 30);
            var6.setFont(jn.bb);
            var6.setColor(Color.white);
            var6.drawString(var2, (-1673646257 - bb.bi.stringWidth(var2)) / 2, 22);
            var4.drawImage(eq.bo, aj * -1687260435 / 2 - 152, kd.ak * 1658005443 / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = -1687260435 * aj / 2 - -475005573;
            int var8 = 1658005443 * kd.ak / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, -1821930983, 33);
            var4.fillRect(var7 + 2, 2 + var8, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(1 + var7, var8 + 1, -1701335359, 1487202307);
            var4.fillRect(3 * var1 + 2 + var7, var8 + 2, 522520098 - 3 * var1, 30);
            var4.setFont(jn.bb);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - bb.bi.stringWidth(var2)) / 2, 22 + var8);
         }
      } catch (Exception var10) {
         this.bk.repaint();
      }

   }

   final void cp() {
      bq.ac(this.bk, -44493606);
      Canvas var1 = this.bk;
      var1.removeMouseListener(bd.ac);
      var1.removeMouseMotionListener(bd.ac);
      var1.removeFocusListener(bd.ac);
      bd.ab = 0;
      if (this.bs != null) {
         this.bs.an(this.bk, 109187860);
      }

      this.az(-1851740702);
      bq.aw(this.bk, (byte)64);
      pc.af((Component)this.bk, 1028597963);
      if (this.bs != null) {
         this.bs.af(this.bk, 2108619234);
      }

      this.bi(-1703383794);
   }

   public final void aw(Graphics var1) {
      this.paint(var1);
   }

   protected void fj(String var1) {
      if (!this.ab) {
         this.ab = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }

      }
   }

   protected void fg(String var1) {
      if (!this.ab) {
         this.ab = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }

      }
   }

   public final void fe(WindowEvent var1) {
   }

   final void dx() {
      qu var1 = this.bu(-1516355947);
      if (var1.aw * -948238754 != 1882268173 * this.av || -1747234661 * this.ar != var1.ac * -1376251093 || this.bm) {
         this.ar(1474255908);
         this.bm = false;
      }

   }

   protected gf bc() {
      if (this.bs == null) {
         this.bs = new ak();
         this.bs.af(this.bk, 1308935098);
      }

      return this.bs;
   }

   public final void fs(WindowEvent var1) {
   }

   protected final boolean bf(int var1) {
      try {
         boolean var10000;
         if (this.be != null) {
            if (var1 <= 447814518) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "bm.bf(" + ')');
      }
   }

   qu go() {
      Container var1 = this.bg((byte)6);
      int var2 = Math.max(var1.getWidth(), this.az * -1044856143);
      int var3 = Math.max(var1.getHeight(), -1305050727 * this.ad);
      if (null != this.be) {
         Insets var4 = this.be.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.top + var4.bottom;
      }

      return new qu(var2, var3);
   }

   qu gs() {
      Container var1 = this.bg((byte)6);
      int var2 = Math.max(var1.getWidth(), this.az * 69014751);
      int var3 = Math.max(var1.getHeight(), 1673949127 * this.ad);
      if (null != this.be) {
         Insets var4 = this.be.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.top + var4.bottom;
      }

      return new qu(var2, var3);
   }

   protected void cs(String var1) {
      this.br.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   protected final boolean gg() {
      return this.be != null;
   }

   protected final boolean ge() {
      return this.be != null;
   }

   protected static int ga() {
      int var0 = 0;
      if (li.ba == null || !li.ba.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  li.ba = var2;
                  bl = 4496549445389278039L;
                  bv = -3922098655801851377L;
               }
            }
         } catch (Throwable var9) {
         }
      }

      if (null != li.ba) {
         long var10 = dq.af(1011490396);
         long var3 = li.ba.getCollectionTime();
         if (-3199239881614683375L * bv != -1L) {
            long var5 = var3 - -3199239881614683375L * bv;
            long var7 = var10 - 9118577410129870745L * bl;
            if (var7 != 0L) {
               var0 = (int)(100L * var5 / var7);
            }
         }

         bv = 3922098655801851377L * var3;
         bl = -4496549445389278039L * var10;
      }

      return var0;
   }

   protected static int gt() {
      int var0 = 0;
      if (li.ba == null || !li.ba.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  li.ba = var2;
                  bl = 4496549445389278039L;
                  bv = -3922098655801851377L;
               }
            }
         } catch (Throwable var9) {
         }
      }

      if (null != li.ba) {
         long var10 = dq.af(1193189321);
         long var3 = li.ba.getCollectionTime();
         if (-3199239881614683375L * bv != -1L) {
            long var5 = var3 - -3199239881614683375L * bv;
            long var7 = var10 - 9118577410129870745L * bl;
            if (var7 != 0L) {
               var0 = (int)(100L * var5 / var7);
            }
         }

         bv = 3922098655801851377L * var3;
         bl = -4496549445389278039L * var10;
      }

      return var0;
   }

   protected static int gu() {
      int var0 = 0;
      if (li.ba == null || !li.ba.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  li.ba = var2;
                  bl = 4496549445389278039L;
                  bv = -3922098655801851377L;
               }
            }
         } catch (Throwable var9) {
         }
      }

      if (null != li.ba) {
         long var10 = dq.af(15041803);
         long var3 = li.ba.getCollectionTime();
         if (-3199239881614683375L * bv != -1L) {
            long var5 = var3 - -3199239881614683375L * bv;
            long var7 = var10 - 9118577410129870745L * bl;
            if (var7 != 0L) {
               var0 = (int)(100L * var5 / var7);
            }
         }

         bv = 3922098655801851377L * var3;
         bl = -4496549445389278039L * var10;
      }

      return var0;
   }

   protected abstract void gh();

   void cw() {
      int var1 = 5159447 * this.am;
      int var2 = 895830209 * this.as;
      int var3 = -927540391 * this.av - -1687260435 * aj - var1;
      int var4 = this.ar * -1747234661 - kd.ak * -1396000821 - var2;
      if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.bg((byte)6);
            int var6 = 0;
            int var7 = 0;
            if (var5 == this.be) {
               Insets var8 = this.be.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
               var10.fillRect(var6, var7, var1, -1747234661 * this.ar);
            }

            if (var2 > 0) {
               var10.fillRect(var6, var7, 150481567 * this.av, var2);
            }

            if (var3 > 0) {
               var10.fillRect(var6 + this.av * -927540391 - var3, var7, var3, this.ar * 1466747240);
            }

            if (var4 > 0) {
               var10.fillRect(var6, var7 + this.ar * 2005870194 - var4, -927540391 * this.av, var4);
            }
         } catch (Exception var9) {
         }
      }

   }

   public void gd() {
      try {
         if (null != gd.af) {
            String var1 = gd.af.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = gd.an;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.br("wrongjava", -1984286157);
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && ff.aa(var2.charAt(var3), -1725060782); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (jb.an(var4, -258102702) && lg.ac(var4, (byte)84) < 10) {
                     this.br("wrongjava", 1225947011);
                     return;
                  }
               }

               at = -1709110595;
            }
         }

         this.setFocusCycleRoot(true);
         this.az(-453136424);
         this.bm((byte)-33);
         pj.ay = fc.al(483410853);

         while(951500247553634275L * ac == 0L || dq.af(1697889039) < 951500247553634275L * ac) {
            mp.aq = pj.ay.an(al * 2118369515, -1500331287 * at, -869275510) * 89306205;

            for(int var6 = 0; var6 < mp.aq * -873938955; ++var6) {
               this.ap(-746993883);
            }

            this.by((byte)29);
            this.at(this.bk, 2062931138);
         }
      } catch (Exception var5) {
         ob.af((String)null, var5, (byte)8);
         this.br("crash", 981813616);
      }

      this.be(417700866);
   }

   protected abstract void gw();

   protected final void cq() {
      bq.au(190164456);
   }

   protected abstract void gf();

   void as(byte var1) {
      try {
         int var2 = -744210797 * this.am;
         int var3 = 895830209 * this.as;
         int var4 = -927540391 * this.av - -1687260435 * aj - var2;
         int var5 = this.ar * -1747234661 - kd.ak * 1658005443 - var3;
         if (var2 <= 0) {
            if (var1 != 23) {
               throw new IllegalStateException();
            }

            if (var4 <= 0) {
               if (var1 != 23) {
                  throw new IllegalStateException();
               }

               if (var3 <= 0) {
                  if (var5 <= 0) {
                     return;
                  }

                  if (var1 != 23) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         try {
            Container var6 = this.bg((byte)6);
            int var7 = 0;
            int var8 = 0;
            if (var6 == this.be) {
               if (var1 != 23) {
                  throw new IllegalStateException();
               }

               Insets var9 = this.be.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var12 = var6.getGraphics();
            var12.setColor(Color.black);
            if (var2 > 0) {
               var12.fillRect(var7, var8, var2, -1747234661 * this.ar);
            }

            if (var3 > 0) {
               if (var1 != 23) {
                  throw new IllegalStateException();
               }

               var12.fillRect(var7, var8, -927540391 * this.av, var3);
            }

            if (var4 > 0) {
               if (var1 != 23) {
                  throw new IllegalStateException();
               }

               var12.fillRect(var7 + this.av * -927540391 - var4, var8, var4, this.ar * -1747234661);
            }

            if (var5 > 0) {
               var12.fillRect(var7, var8 + this.ar * -1747234661 - var5, -927540391 * this.av, var5);
            }
         } catch (Exception var10) {
         }

      } catch (RuntimeException var11) {
         throw db.an(var11, "bm.as(" + ')');
      }
   }

   static void ac(int var0, int var1, int var2, hq var3, int var4, byte var5) {
      try {
         cr var6;
         int var7;
         int var8;
         label48: {
            var6 = new cr();
            var6.an = var0 * 241949401;
            var6.aw = -255427968 * var1;
            var6.ac = -274968704 * var2;
            var7 = var3.av * -1339930361;
            var8 = var3.ar * -1659393955;
            if (1 != var4) {
               if (var5 >= 3) {
                  throw new IllegalStateException();
               }

               if (3 != var4) {
                  break label48;
               }

               if (var5 >= 3) {
                  return;
               }
            }

            var7 = -1659393955 * var3.ar;
            var8 = -1339930361 * var3.av;
         }

         var6.au = (var1 + var7) * -1490504832;
         var6.ab = 905187968 * (var2 + var8);
         var6.al = -853803453 * var3.ba;
         var6.aq = var3.bv * -981504640;
         var6.aa = var3.bl * -1756454329;
         var6.ay = var3.bp * -1723341761;
         var6.ao = var3.bc;
         if (var3.bu != null) {
            if (var5 >= 3) {
               throw new IllegalStateException();
            }

            var6.ag = var3;
            var6.aw(108175277);
         }

         cr.af.an(var6);
         if (var6.ao != null) {
            if (var5 >= 3) {
               throw new IllegalStateException();
            }

            var6.ax = (var6.aa * -442346035 + (int)(Math.random() * (double)(var6.ay * -1018564833 - var6.aa * -442346035))) * -713890281;
         }

      } catch (RuntimeException var9) {
         throw db.an(var9, "bm.ac(" + ')');
      }
   }
}
