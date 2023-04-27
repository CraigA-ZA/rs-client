import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
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
import java.net.URL;
import java.util.Iterator;

public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {
   protected static KeyHandler KeyHandler_instance = new KeyHandler();
   protected static TaskHandler taskHandler;
   protected static int aa = 0;
   public static int aj;
   static GameShell gameShell = null;
   static boolean isKilled = false;
   static int al = -2033050820;
   static int at = -341822119;
   static int aw = 0;
   static int bz = -1669766140;
   static int plane;
   static long stopTimeMs = 0L;
   static long garbageCollectorLastCheckTimeMs = 4496549445389278039L;
   static long garbageCollectorLastCollectionTime = -3922098655801851377L;
   static long[] ag = new long[32];
   static long[] ax = new long[32];
   static volatile boolean hasFocus = true;
   MouseWheelHandler mouseWheelHandler;
   boolean hasErrored = false;
   boolean bm = false;
   int contentHeight0;
   int maxCanvasWidth;
   int canvasX = 0;
   int maxCanvasHeight;
   int canvasY = 0;
   int contentWidth0;
   java.awt.Canvas canvas;
   Frame frame;
   Clipboard clipboard;
   final EventQueue eventQueue;
   protected boolean by = false;
   protected int contentHeight;
   protected int contentWidth;
   volatile boolean isCanvasInvalid = false;
   volatile boolean bx = true;
   volatile long canvasSetTimeMs = 0L;

   static void al_renamed() {
      Iterator var1 = Messages.Messages_hashTable.iterator();

      while(var1.hasNext()) {
         Message var2 = (Message)var1.next();
         var2.an();
      }

   }

   static void ac_renamed(int var0, int var1, int var2, LocType var3, int var4) {
      LocSound var6 = new LocSound();
      var6.an = var0 * 241949401;
      var6.aw = -255427968 * var1;
      var6.ac = -274968704 * var2;
      int var7 = var3.width * -1339930361;
      int var8 = var3.length * -1659393955;
      if (1 == var4 || 3 == var4) {
         var7 = -1659393955 * var3.length;
         var8 = -1339930361 * var3.width;
      }

      var6.au = (var1 + var7) * -1490504832;
      var6.ab = 905187968 * (var2 + var8);
      var6.soundEffectId = -853803453 * var3.ambientSoundId;
      var6.aq = var3.int4 * -981504640;
      var6.aa = var3.int5 * -1756454329;
      var6.ay = var3.int6 * -1723341761;
      var6.soundEffectIds = var3.bc;
      if (var3.multi != null) {
         var6.obj = var3;
         var6.set();
      }

      LocSound.objectSounds.addFirst(var6);
      if (var6.soundEffectIds != null) {
         var6.ax = (var6.aa * -442346035 + (int)(Math.random() * (double)(var6.ay * -1018564833 - var6.aa * -442346035))) * -713890281;
      }

   }

   protected GameShell() {
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
      }

      this.eventQueue = var1;
      DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
      PcmPlayer.pcmPlayerProvider = var2;
   }

   protected final void setMaxCanvasSize(int var1, int var2) {
      if (var1 != 2087275977 * this.maxCanvasWidth || 83534669 * this.maxCanvasHeight != var2) {
         this.bi();
      }

      this.maxCanvasWidth = var1 * -753509255;
      this.maxCanvasHeight = var2 * -438874747;
   }

   final void at(Object var1) {
      if (null != this.eventQueue) {
         for(int var3 = 0; var3 < 50 && this.eventQueue.peekEvent() != null; ++var3) {
            PlayerAppearance.af(1L);
         }

         if (null != var1) {
            this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   protected MouseWheel mouseWheel() {
      if (this.mouseWheelHandler == null) {
         this.mouseWheelHandler = new MouseWheelHandler();
         this.mouseWheelHandler.addTo(this.canvas);
      }

      return this.mouseWheelHandler;
   }

   protected void setUpClipboard() {
      this.clipboard = this.getToolkit().getSystemClipboard();
   }

   protected void clipboardSetString(String var1) {
      this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   protected Clipboard ax() {
      return this.clipboard;
   }

   protected final void setUpKeyboard() {
      gs.af_renamed();
      KeyHandler_instance.aw(this.canvas);
   }

   protected final void ag() {
      KeyHandler_instance.au();
   }

   protected void ah(be var1, int var2) {
      KeyHandler_instance.af(var1, var2);
   }

   protected final void setUpMouse() {
      pc.af_renamed(this.canvas);
   }

   final void onResize() {
      Container var2 = this.container();
      if (null != var2) {
         Bounds var3 = this.getFrameContentBounds();
         this.contentWidth = Math.max(944313703 * var3.width, 69014751 * this.contentWidth0) * -2050638615;
         this.contentHeight = Math.max(var3.height * -1376251093, 1673949127 * this.contentHeight0) * -1550051949;
         if (-927540391 * this.contentWidth <= 0) {
            this.contentWidth = -2050638615;
         }

         if (-1747234661 * this.contentHeight <= 0) {
            this.contentHeight = -1550051949;
         }

         aj = Math.min(-927540391 * this.contentWidth, 2087275977 * this.maxCanvasWidth) * 2082454245;
         kd.ak = Math.min(-1747234661 * this.contentHeight, 83534669 * this.maxCanvasHeight) * -16547605;
         this.canvasX = (this.contentWidth * -927540391 - -1687260435 * aj) / 2 * 1463717787;
         this.canvasY = 0;
         this.canvas.setSize(aj * -1687260435, kd.ak * 1658005443);
         ia.rasterProvider = new RasterProvider(-1687260435 * aj, 1658005443 * kd.ak, this.canvas, this.by);
         if (var2 == this.frame) {
            Insets var4 = this.frame.getInsets();
            this.canvas.setLocation(var4.left + -744210797 * this.canvasX, this.canvasY * 895830209 + var4.top);
         } else {
            this.canvas.setLocation(this.canvasX * -744210797, 895830209 * this.canvasY);
         }

         this.bx = true;
         this.am();
      }
   }

   void clearBackground() {
      int var2 = -744210797 * this.canvasX;
      int var3 = 895830209 * this.canvasY;
      int var4 = -927540391 * this.contentWidth - -1687260435 * aj - var2;
      int var5 = this.contentHeight * -1747234661 - kd.ak * 1658005443 - var3;
      if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
         try {
            Container var6 = this.container();
            int var7 = 0;
            int var8 = 0;
            if (var6 == this.frame) {
               Insets var9 = this.frame.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var11 = var6.getGraphics();
            var11.setColor(Color.black);
            if (var2 > 0) {
               var11.fillRect(var7, var8, var2, -1747234661 * this.contentHeight);
            }

            if (var3 > 0) {
               var11.fillRect(var7, var8, -927540391 * this.contentWidth, var3);
            }

            if (var4 > 0) {
               var11.fillRect(var7 + this.contentWidth * -927540391 - var4, var8, var4, this.contentHeight * -1747234661);
            }

            if (var5 > 0) {
               var11.fillRect(var7, var8 + this.contentHeight * -1747234661 - var5, -927540391 * this.contentWidth, var5);
            }
         } catch (Exception var10) {
         }
      }

   }

   final void replaceCanvas() {
      KeyHandler_instance.ac(this.canvas);
      java.awt.Canvas var2 = this.canvas;
      var2.removeMouseListener(MouseHandler.MouseHandler_instance);
      var2.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
      var2.removeFocusListener(MouseHandler.MouseHandler_instance);
      MouseHandler.MouseHandler_currentButton0 = 0;
      if (this.mouseWheelHandler != null) {
         this.mouseWheelHandler.removeFrom(this.canvas);
      }

      this.addCanvas();
      KeyHandler_instance.aw(this.canvas);
      pc.af_renamed(this.canvas);
      if (this.mouseWheelHandler != null) {
         this.mouseWheelHandler.addTo(this.canvas);
      }

      this.bi();
   }

   protected final void startThread(int var1, int var2, int var3, int var4) {
      try {
         if (null != gameShell) {
            aw += -914573903;
            if (aw * 1470919505 >= 3) {
               this.error("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         gameShell = this;
         aj = var1 * 2082454245;
         kd.ak = -16547605 * var2;
         ClientError.aw = var3 * -136548689;
         qh.ac = 767373001 * var4;
         dn.applet = this;
         if (null == taskHandler) {
            taskHandler = new TaskHandler();
         }

         taskHandler.newThreadTask(this, 1);
      } catch (Exception var7) {
         ob.af_renamed((String)null, var7);
         this.error("crash");
      }

   }

   final synchronized void addCanvas() {
      Container var2 = this.container();
      if (null != this.canvas) {
         this.canvas.removeFocusListener(this);
         var2.remove(this.canvas);
      }

      aj = Math.max(var2.getWidth(), this.contentWidth0 * 69014751) * 2082454245;
      kd.ak = Math.max(var2.getHeight(), this.contentHeight0 * 1673949127) * -16547605;
      Insets var3;
      if (null != this.frame) {
         var3 = this.frame.getInsets();
         aj -= (var3.right + var3.left) * 2082454245;
         kd.ak -= (var3.bottom + var3.top) * -16547605;
      }

      this.canvas = new Canvas(this);
      var2.setBackground(Color.BLACK);
      var2.setLayout((LayoutManager)null);
      var2.add(this.canvas);
      this.canvas.setSize(-1687260435 * aj, 1658005443 * kd.ak);
      this.canvas.setVisible(true);
      this.canvas.setBackground(Color.BLACK);
      if (this.frame == var2) {
         var3 = this.frame.getInsets();
         this.canvas.setLocation(var3.left + -744210797 * this.canvasX, var3.top + 895830209 * this.canvasY);
      } else {
         this.canvas.setLocation(this.canvasX * -744210797, this.canvasY * 895830209);
      }

      this.canvas.addFocusListener(this);
      this.canvas.requestFocus();
      this.bx = true;
      if (null != ia.rasterProvider && 1313069155 * ia.rasterProvider.width == aj * -1687260435 && 1658005443 * kd.ak == 1695726685 * ia.rasterProvider.height) {
         ((RasterProvider)ia.rasterProvider).setComponent(this.canvas);
         ia.rasterProvider.drawFull(0, 0);
      } else {
         ia.rasterProvider = new RasterProvider(-1687260435 * aj, kd.ak * 1658005443, this.canvas, this.by);
      }

      this.isCanvasInvalid = false;
      this.canvasSetTimeMs = Formatting.currentTimeMs() * -515103886995160589L;
   }

   protected void ad(boolean var1) {
      if (var1 != this.by) {
         this.by = var1;
         ia.rasterProvider.am(var1);
         ia.rasterProvider.apply();
      }

   }

   protected final boolean checkHost() {
      String var2 = this.getDocumentBase().getHost().toLowerCase();
      if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
         if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
            if (var2.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                  var2 = var2.substring(0, var2.length() - 1);
               }

               if (var2.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.error("invalidhost");
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

   public void run() {
      try {
         if (null != TaskHandler.javaVendor) {
            String var1 = TaskHandler.javaVendor.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = TaskHandler.javaVersion;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.error("wrongjava");
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && ff.aa_renamed(var2.charAt(var3)); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (WorldMapSectionType.an_renamed(var4) && PacketBitNode.ac_renamed(var4) < 10) {
                     this.error("wrongjava");
                     return;
                  }
               }

               at = -1709110595;
            }
         }

         this.setFocusCycleRoot(true);
         this.addCanvas();
         this.setUp();
         pj.clock = fc.al_renamed();

         while(951500247553634275L * stopTimeMs == 0L || Formatting.currentTimeMs() < 951500247553634275L * stopTimeMs) {
            DirectByteArrayCopier.aq = pj.clock.wait(al * 2118369515, -1500331287 * at) * 89306205;

            for(int var6 = 0; var6 < DirectByteArrayCopier.aq * -873938955; ++var6) {
               this.clientTick();
            }

            this.render();
            this.at(this.canvas);
         }
      } catch (Exception var5) {
         ob.af_renamed((String)null, var5);
         this.error("crash");
      }

      this.kill();
   }

   void clientTick() {
      long var2 = Formatting.currentTimeMs();
      long var4 = ag[702273735 * my.ah];
      ag[702273735 * my.ah] = var2;
      my.ah = 94857463 * (my.ah * 702273735 + 1 & 31);
      if (var4 != 0L && var2 > var4) {
      }

      synchronized(this) {
         AbstractByteArrayCopier.bf = hasFocus;
      }

      this.doCycle();
   }

   void render() {
      Container var2 = this.container();
      long var3 = Formatting.currentTimeMs();
      long var5 = ax[Rasterizer3D.ai * -689745739];
      ax[-689745739 * Rasterizer3D.ai] = var3;
      Rasterizer3D.ai = -1417208419 * (1 + -689745739 * Rasterizer3D.ai & 31);
      if (0L != var5 && var3 > var5) {
         int var7 = (int)(var3 - var5);
         aa = (32000 + (var7 >> 1)) / var7 * 1691803635;
      }

      if ((bz += 769754581) * 148605821 - 1 > 50) {
         bz -= -166976614;
         this.bx = true;
         this.canvas.setSize(aj * -1687260435, 1658005443 * kd.ak);
         this.canvas.setVisible(true);
         if (var2 == this.frame) {
            Insets var8 = this.frame.getInsets();
            this.canvas.setLocation(-744210797 * this.canvasX + var8.left, var8.top + 895830209 * this.canvasY);
         } else {
            this.canvas.setLocation(this.canvasX * -744210797, 895830209 * this.canvasY);
         }
      }

      if (this.isCanvasInvalid) {
         this.replaceCanvas();
      }

      this.checkResize();
      this.draw(this.bx);
      if (this.bx) {
         this.clearBackground();
      }

      this.bx = false;
   }

   final void checkResize() {
      Bounds var2 = this.getFrameContentBounds();
      if (var2.width * 944313703 != -927540391 * this.contentWidth || -1747234661 * this.contentHeight != var2.height * -1376251093 || this.bm) {
         this.onResize();
         this.bm = false;
      }

   }

   final void bi() {
      this.bm = true;
   }

   final synchronized void kill() {
      if (!isKilled) {
         isKilled = true;

         try {
            this.canvas.removeFocusListener(this);
         } catch (Exception var6) {
         }

         try {
            this.kill0();
         } catch (Exception var5) {
         }

         if (this.frame != null) {
            try {
               System.exit(0);
            } catch (Throwable var4) {
            }
         }

         if (null != taskHandler) {
            try {
               taskHandler.close();
            } catch (Exception var3) {
            }
         }

         this.ba();
      }
   }

   public final void start() {
      if (gameShell == this && !isKilled) {
         stopTimeMs = 0L;
      }
   }

   public final void stop() {
      if (gameShell == this && !isKilled) {
         stopTimeMs = (Formatting.currentTimeMs() + 4000L) * -2406892942717923893L;
      }
   }

   public final void destroy() {
      if (this == gameShell && !isKilled) {
         stopTimeMs = Formatting.currentTimeMs() * -2406892942717923893L;
         PlayerAppearance.af(5000L);
         this.kill();
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final synchronized void paint(Graphics var1) {
      if (gameShell == this && !isKilled) {
         this.bx = true;
         if (Formatting.currentTimeMs() - -6171487387477770437L * this.canvasSetTimeMs > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= aj * -1687260435 && var2.height >= 1658005443 * kd.ak) {
               this.isCanvasInvalid = true;
            }
         }

      }
   }

   public final void focusGained(FocusEvent var1) {
      hasFocus = true;
      this.bx = true;
   }

   public final void focusLost(FocusEvent var1) {
      hasFocus = false;
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   protected final void drawInitial(int var1, String var2, boolean var3) {
      try {
         Graphics var5 = this.canvas.getGraphics();
         if (null == jn.bb) {
            jn.bb = new java.awt.Font("Helvetica", 1, 13);
            bb.pauseFontMetrics = this.canvas.getFontMetrics(jn.bb);
         }

         if (var3) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, -1687260435 * aj, 1658005443 * kd.ak);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (PacketWriter.pauseImage == null) {
               PacketWriter.pauseImage = this.canvas.createImage(304, 34);
            }

            Graphics var7 = PacketWriter.pauseImage.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, 3 * var1, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(var1 * 3 + 2, 2, 300 - 3 * var1, 30);
            var7.setFont(jn.bb);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - bb.pauseFontMetrics.stringWidth(var2)) / 2, 22);
            var5.drawImage(PacketWriter.pauseImage, aj * -1687260435 / 2 - 152, kd.ak * 1658005443 / 2 - 18, (ImageObserver)null);
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
            var5.drawString(var2, var8 + (304 - bb.pauseFontMetrics.stringWidth(var2)) / 2, 22 + var9);
         }
      } catch (Exception var11) {
         this.canvas.repaint();
      }

   }

   protected final void bs() {
      PacketWriter.pauseImage = null;
      jn.bb = null;
      bb.pauseFontMetrics = null;
   }

   protected void error(String var1) {
      if (!this.hasErrored) {
         this.hasErrored = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var4) {
         }

      }
   }

   Container container() {
      return (Container)(null != this.frame ? this.frame : this);
   }

   Bounds getFrameContentBounds() {
      Container var2 = this.container();
      int var3 = Math.max(var2.getWidth(), this.contentWidth0 * 69014751);
      int var4 = Math.max(var2.getHeight(), 1673949127 * this.contentHeight0);
      if (null != this.frame) {
         Insets var5 = this.frame.getInsets();
         var3 -= var5.right + var5.left;
         var4 -= var5.top + var5.bottom;
      }

      return new Bounds(var3, var4);
   }

   protected final boolean hasFrame() {
      return this.frame != null;
   }

   protected abstract void am();

   protected abstract void doCycle();

   protected abstract void kill0();

   public abstract void init();

   protected abstract void draw(boolean var1);

   protected abstract void setUp();

   protected abstract void ba();
}
