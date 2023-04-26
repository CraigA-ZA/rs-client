import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Component extends Node {
   public static boolean bj;
   static EvictingDualNodeHashTable bm = new EvictingDualNodeHashTable(8);
   static EvictingDualNodeHashTable Component_cachedModels = new EvictingDualNodeHashTable(50);
   static EvictingDualNodeHashTable bx = new EvictingDualNodeHashTable(200);
   static EvictingDualNodeHashTable Component_cachedFonts = new EvictingDualNodeHashTable(20);
   static pk bd;
   static pk bt;
   gy ef;
   int modelType2;
   int modelId2;
   int paddingY;
   HashMap ea;
   HashMap ej;
   mt es;
   public boolean isIf3 = false;
   public boolean cj;
   public boolean isHidden = false;
   public boolean fill = false;
   public boolean di;
   public boolean modelOrthog;
   public boolean spriteTiling;
   public boolean do;
   public boolean modelTransparency;
   public boolean isDraggable;
   public boolean el;
   public boolean textShadowed;
   public boolean hasListener;
   public boolean hh;
   public boolean hi;
   public boolean hl;
   public boolean noClickThrough;
   public boolean hw;
   public byte[][] en;
   public byte[][] er;
   public int yAlignment = 0;
   public int rawY = 0;
   public int clientCode = 0;
   public int type;
   public int rawWidth = 0;
   public int heightAlignment = 0;
   public int rawX = 0;
   public int xAlignment = 0;
   public int childIndex = 1274125071;
   public int id = -346484955;
   public int buttonType = 0;
   public int widthAlignment = 0;
   public int rawHeight = 0;
   public int ca = -1855082267;
   public int height = 0;
   public int spriteAngle;
   public int x = 0;
   public int scrollWidth = 0;
   public int color = 0;
   public int spriteId2;
   public int y = 0;
   public int scrollHeight = 0;
   public int scrollY = 0;
   public int cn = 915397977;
   public int transparency;
   public int scrollX = 0;
   public int color2 = 0;
   public int width = 0;
   public int spriteId;
   public int parentId = -908641471;
   public int lineWid;
   public int mouseOverColor2 = 0;
   public int mouseOverColor = 0;
   public int cz;
   public int modelZoom;
   public int spriteShadow;
   public int modelOffsetY;
   public int df;
   public int modelOffsetX;
   public int modelAngleX;
   public int modelId;
   public int dn;
   public int modelAngleY;
   public int dq;
   public int modelType;
   public int modelAngleZ;
   public int sequenceId;
   public int outline;
   public int textLineHeight;
   public int sequenceId2;
   public int clickMask;
   public int dragDeadZone;
   public int dragDeadTime;
   public int textYAlignment;
   public int textXAlignment;
   public int paddingX;
   public int mouseOverRedirect;
   public int modelFrameCycle;
   public int itemId;
   public int itemQuantity;
   public int modelFrame;
   public int rootIndex;
   public int hj;
   public int hm;
   public int hu;
   public int cycle;
   public int hx;
   public int[] ed;
   public int[] eg;
   public int[] statTransmitTriggers;
   public int[] invTransmitTriggers;
   public int[] varTransmitTriggers;
   public int[] gb;
   public int[] cs1Comparisons;
   public int[] cs1ComparisonValues;
   public int[] gp;
   public int[] hs;
   public int[][] cs1Instructions;
   public Object[] onTargetEnter;
   public Object[] onMouseLeave;
   public Object[] onStatTransmit;
   public Object[] onMouseRepeat;
   public Object[] onOp;
   public Object[] onClick;
   public Object[] onLoad;
   public Object[] onTimer;
   public Object[] fk;
   public Object[] onClickRepeat;
   public Object[] onScrollWheel;
   public Object[] onDrag;
   public Object[] onHold;
   public Object[] onRelease;
   public Object[] ft;
   public Object[] onChatTransmit;
   public Object[] onInvTransmit;
   public Object[] onVarTransmit;
   public Object[] onMouseOver;
   public Object[] onTargetLeave;
   public Object[] onDragComplete;
   public Object[] onClanTransmit;
   public Object[] onStockTransmit;
   public Object[] ge;
   public Object[] gg;
   public Object[] gh;
   public Object[] onFriendTransmit;
   public Object[] go;
   public Object[] gr;
   public Object[] onKey;
   public Object[] onMiscTransmit;
   public Object[] onDialogAbort;
   public Object[] gw;
   public Object[] onSubChange;
   public String cp;
   public String text2;
   public String text;
   public String opbase;
   public String targetVerb;
   public String buttonText;
   public String spellName;
   public String[] actions;
   public Component parent;
   public Component[] children;
   public PlayerAppearance dd;
   public ta cb;

   public Component() {
      this.cb = ta.af;
      this.transparency = 0;
      this.cz = 0;
      this.lineWid = 1040382753;
      this.cj = false;
      this.spriteId2 = 504605111;
      this.spriteId = -1679014525;
      this.spriteAngle = 0;
      this.spriteTiling = false;
      this.outline = 0;
      this.spriteShadow = 0;
      this.modelType = -1714481443;
      this.modelId = -509431749;
      this.modelType2 = 1918873989;
      this.modelId2 = -1559002165;
      this.sequenceId = 1195025605;
      this.sequenceId2 = 1782995843;
      this.modelOffsetX = 0;
      this.modelOffsetY = 0;
      this.modelAngleX = 0;
      this.modelAngleY = 0;
      this.modelAngleZ = 0;
      this.modelZoom = 471890156;
      this.df = 0;
      this.dq = 0;
      this.modelOrthog = false;
      this.modelTransparency = false;
      this.dn = -1523066442;
      this.textLineHeight = -1858899927;
      this.text = "";
      this.text2 = "";
      this.textXAlignment = 0;
      this.textYAlignment = 0;
      this.paddingX = 0;
      this.textShadowed = false;
      this.paddingY = -996199275;
      this.clickMask = 0;
      this.el = false;
      this.opbase = "";
      this.parent = null;
      this.dragDeadZone = 0;
      this.dragDeadTime = 0;
      this.isDraggable = false;
      this.targetVerb = "";
      this.hasListener = false;
      this.mouseOverRedirect = 597372633;
      this.spellName = "";
      this.buttonText = Strings.Strings_ok;
      this.itemId = 1852876811;
      this.itemQuantity = 0;
      this.modelFrame = 0;
      this.modelFrameCycle = 0;
      this.hw = false;
      this.hi = false;
      this.hj = -3554691;
      this.hm = 0;
      this.hu = 0;
      this.hx = 0;
      this.rootIndex = 1548573671;
      this.cycle = -414825897;
      this.noClickThrough = false;
      this.hl = false;
      this.hh = false;
   }

   static {
      bd = new pk(10, py.af);
      bt = new pk(10, py.af);
      bj = false;
   }

   void decodeLegacy(Packet var1) {
      this.isIf3 = false;
      this.type = var1.g1() * -1183495331;
      this.buttonType = var1.g1() * -1494876793;
      this.clientCode = var1.cl() * 577746185;
      this.rawX = var1.cg() * 1806877347;
      this.rawY = var1.cg() * 1231090287;
      this.rawWidth = var1.cl() * -1495372107;
      this.rawHeight = var1.cl() * 1193771871;
      this.transparency = var1.g1() * 1833148663;
      this.parentId = var1.cl() * 908641471;
      if (this.parentId * 913615679 == 65535) {
         this.parentId = -908641471;
      } else {
         this.parentId = ((1713081171 * this.id & -65536) + 913615679 * this.parentId) * 908641471;
      }

      this.mouseOverRedirect = var1.cl() * -597372633;
      if (65535 == -529297769 * this.mouseOverRedirect) {
         this.mouseOverRedirect = 597372633;
      }

      int var3 = var1.g1();
      int var4;
      if (var3 > 0) {
         this.cs1Comparisons = new int[var3];
         this.cs1ComparisonValues = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.cs1Comparisons[var4] = var1.g1();
            this.cs1ComparisonValues[var4] = var1.cl();
         }
      }

      var4 = var1.g1();
      int var5;
      if (var4 > 0) {
         this.cs1Instructions = new int[var4][];

         for(var5 = 0; var5 < var4; ++var5) {
            int var6 = var1.cl();
            this.cs1Instructions[var5] = new int[var6];

            for(int var7 = 0; var7 < var6; ++var7) {
               this.cs1Instructions[var5][var7] = var1.cl();
               if (65535 == this.cs1Instructions[var5][var7]) {
                  this.cs1Instructions[var5][var7] = -1;
               }
            }
         }
      }

      if (0 == 883712245 * this.type) {
         this.scrollHeight = var1.cl() * -1357451643;
         this.isHidden = var1.g1() == 1;
      }

      if (this.type * 883712245 == 1) {
         var1.cl();
         var1.g1();
      }

      if (3 == this.type * 883712245) {
         this.fill = var1.g1() == 1;
      }

      if (4 == this.type * 883712245 || 883712245 * this.type == 1) {
         this.textYAlignment = var1.g1() * 1612549297;
         this.paddingX = var1.g1() * -522107433;
         this.textXAlignment = var1.g1() * 2116078665;
         this.textLineHeight = var1.cl() * 1858899927;
         if (65535 == -1065036825 * this.textLineHeight) {
            this.textLineHeight = -1858899927;
         }

         this.textShadowed = var1.g1() == 1;
      }

      if (883712245 * this.type == 4) {
         this.text = var1.cw();
         this.text2 = var1.cw();
      }

      if (883712245 * this.type == 1 || 3 == this.type * 883712245 || this.type * 883712245 == 4) {
         this.color = var1.g4s() * -1604768377;
      }

      if (3 == 883712245 * this.type || 4 == 883712245 * this.type) {
         this.color2 = var1.g4s() * 714852617;
         this.mouseOverColor = var1.g4s() * -1045335587;
         this.mouseOverColor2 = var1.g4s() * 1230092841;
      }

      if (883712245 * this.type == 5) {
         this.spriteId2 = var1.g4s() * -504605111;
         this.spriteId = var1.g4s() * 1679014525;
      }

      if (this.type * 883712245 == 6) {
         this.modelType = -1714481443;
         this.modelId = var1.cl() * 509431749;
         if (65535 == this.modelId * -168077555) {
            this.modelId = -509431749;
         }

         this.modelType2 = 1918873989;
         this.modelId2 = var1.cl() * 1559002165;
         if (this.modelId2 * -3148259 == 65535) {
            this.modelId2 = -1559002165;
         }

         this.sequenceId = var1.cl() * -1195025605;
         if (-1526544909 * this.sequenceId == 65535) {
            this.sequenceId = 1195025605;
         }

         this.sequenceId2 = var1.cl() * -1782995843;
         if (65535 == -717228843 * this.sequenceId2) {
            this.sequenceId2 = 1782995843;
         }

         this.modelZoom = var1.cl() * -467727501;
         this.modelAngleX = var1.cl() * -142910041;
         this.modelAngleY = var1.cl() * -230241203;
      }

      if (8 == this.type * 883712245) {
         this.text = var1.cw();
      }

      if (35076151 * this.buttonType == 2) {
         this.targetVerb = var1.cw();
         this.spellName = var1.cw();
         var5 = var1.cl() & 63;
         this.clickMask = -882629235 * (this.clickMask * 1652991301 | var5 << 11);
      }

      if (1 == 35076151 * this.buttonType || 35076151 * this.buttonType == 4 || 35076151 * this.buttonType == 5 || 35076151 * this.buttonType == 6) {
         this.buttonText = var1.cw();
         if (this.buttonText.length() == 0) {
            if (this.buttonType * 35076151 == 1) {
               this.buttonText = Strings.Strings_ok;
            }

            if (35076151 * this.buttonType == 4) {
               this.buttonText = Strings.Strings_select;
            }

            if (35076151 * this.buttonType == 5) {
               this.buttonText = Strings.Strings_select;
            }

            if (6 == this.buttonType * 35076151) {
               this.buttonText = Strings.Strings_continue;
            }
         }
      }

      if (this.buttonType * 35076151 == 1 || 4 == 35076151 * this.buttonType || 5 == this.buttonType * 35076151) {
         this.clickMask = (1652991301 * this.clickMask | 4194304) * -882629235;
      }

      if (this.buttonType * 35076151 == 6) {
         this.clickMask = (this.clickMask * 1652991301 | 1) * -882629235;
      }

   }

   void decode(Packet var1) {
      var1.g1();
      this.isIf3 = true;
      this.type = var1.g1() * -1183495331;
      this.clientCode = var1.cl() * 577746185;
      this.rawX = var1.cg() * 1806877347;
      this.rawY = var1.cg() * 1231090287;
      this.rawWidth = var1.cl() * -1495372107;
      if (9 == this.type * 883712245) {
         this.rawHeight = var1.cg() * 1193771871;
      } else {
         this.rawHeight = var1.cl() * 1193771871;
      }

      this.widthAlignment = var1.g1s() * 387308049;
      this.heightAlignment = var1.g1s() * -480958745;
      this.xAlignment = var1.g1s() * 1656805111;
      this.yAlignment = var1.g1s() * -362988363;
      this.parentId = var1.cl() * 908641471;
      if (this.parentId * 913615679 == 65535) {
         this.parentId = -908641471;
      } else {
         this.parentId = 908641471 * (913615679 * this.parentId + (1713081171 * this.id & -65536));
      }

      this.isHidden = var1.g1() == 1;
      if (this.type * 883712245 == 0) {
         this.scrollWidth = var1.cl() * -1469650905;
         this.scrollHeight = var1.cl() * -1357451643;
         this.noClickThrough = var1.g1() == 1;
      }

      if (this.type * 883712245 == 5) {
         this.spriteId2 = var1.g4s() * -504605111;
         this.spriteAngle = var1.cl() * 877496813;
         this.spriteTiling = var1.g1() == 1;
         this.transparency = var1.g1() * 1833148663;
         this.outline = var1.g1() * 646392503;
         this.spriteShadow = var1.g4s() * -140657215;
         this.do = var1.g1() == 1;
         this.di = var1.g1() == 1;
      }

      if (this.type * 883712245 == 6) {
         this.modelType = -1714481443;
         this.modelId = var1.cl() * 509431749;
         if (this.modelId * -168077555 == 65535) {
            this.modelId = -509431749;
         }

         this.modelOffsetX = var1.cg() * 1759898391;
         this.modelOffsetY = var1.cg() * 1163821709;
         this.modelAngleX = var1.cl() * -142910041;
         this.modelAngleY = var1.cl() * -230241203;
         this.modelAngleZ = var1.cl() * -1051718121;
         this.modelZoom = var1.cl() * -467727501;
         this.sequenceId = var1.cl() * -1195025605;
         if (this.sequenceId * -1526544909 == 65535) {
            this.sequenceId = 1195025605;
         }

         this.modelOrthog = var1.g1() == 1;
         var1.cl();
         if (241981169 * this.widthAlignment != 0) {
            this.df = var1.cl() * 1436736911;
         }

         if (0 != this.heightAlignment * -480604969) {
            var1.cl();
         }
      }

      if (4 == 883712245 * this.type) {
         this.textLineHeight = var1.cl() * 1858899927;
         if (this.textLineHeight * -1065036825 == 65535) {
            this.textLineHeight = -1858899927;
         }

         this.text = var1.cw();
         this.textXAlignment = var1.g1() * 2116078665;
         this.textYAlignment = var1.g1() * 1612549297;
         this.paddingX = var1.g1() * -522107433;
         this.textShadowed = var1.g1() == 1;
         this.color = var1.g4s() * -1604768377;
      }

      if (3 == 883712245 * this.type) {
         this.color = var1.g4s() * -1604768377;
         this.fill = var1.g1() == 1;
         this.transparency = var1.g1() * 1833148663;
      }

      if (883712245 * this.type == 9) {
         this.lineWid = var1.g1() * 1040382753;
         this.color = var1.g4s() * -1604768377;
         this.cj = var1.g1() == 1;
      }

      this.clickMask = var1.cr() * -882629235;
      this.opbase = var1.cw();
      int var3 = var1.g1();
      if (var3 > 0) {
         this.actions = new String[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.actions[var4] = var1.cw();
         }
      }

      this.dragDeadZone = var1.g1() * 1773001161;
      this.dragDeadTime = var1.g1() * 1466803237;
      this.isDraggable = var1.g1() == 1;
      this.targetVerb = var1.cw();
      this.onLoad = this.readListener(var1);
      this.onMouseOver = this.readListener(var1);
      this.onMouseLeave = this.readListener(var1);
      this.onTargetLeave = this.readListener(var1);
      this.onTargetEnter = this.readListener(var1);
      this.onVarTransmit = this.readListener(var1);
      this.onInvTransmit = this.readListener(var1);
      this.onStatTransmit = this.readListener(var1);
      this.onTimer = this.readListener(var1);
      this.onOp = this.readListener(var1);
      this.onMouseRepeat = this.readListener(var1);
      this.onClick = this.readListener(var1);
      this.onClickRepeat = this.readListener(var1);
      this.onRelease = this.readListener(var1);
      this.onHold = this.readListener(var1);
      this.onDrag = this.readListener(var1);
      this.onDragComplete = this.readListener(var1);
      this.onScrollWheel = this.readListener(var1);
      this.varTransmitTriggers = this.readListenerTriggers(var1);
      this.invTransmitTriggers = this.readListenerTriggers(var1);
      this.statTransmitTriggers = this.readListenerTriggers(var1);
   }

   Object[] readListener(Packet var1) {
      int var3 = var1.g1();
      if (var3 == 0) {
         return null;
      } else {
         Object[] var4 = new Object[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = var1.g1();
            if (var6 == 0) {
               var4[var5] = new Integer(var1.g4s());
            } else if (1 == var6) {
               var4[var5] = var1.cw();
            }
         }

         this.hasListener = true;
         return var4;
      }
   }

   int[] readListenerTriggers(Packet var1) {
      int var3 = var1.g1();
      if (var3 == 0) {
         return null;
      } else {
         int[] var4 = new int[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            var4[var5] = var1.g4s();
         }

         return var4;
      }
   }

   public Sprite at(boolean var1, UrlRequester var2) {
      bj = false;
      if (null != this.cp) {
         Sprite var4 = this.aa(var2);
         if (null != var4) {
            return var4;
         }
      }

      int var18;
      if (var1) {
         var18 = -1352724779 * this.spriteId;
      } else {
         var18 = -363627527 * this.spriteId2;
      }

      if (var18 == -1) {
         return null;
      } else {
         long var5 = ((long)(this.spriteShadow * -353676735) << 40) + ((this.do ? 1L : 0L) << 38) + ((long)(this.outline * 1638912775) << 36) + (long)var18 + ((this.di ? 1L : 0L) << 39);
         Sprite var7 = (Sprite)bx.get(var5);
         if (null != var7) {
            return var7;
         } else {
            var7 = sc.readSprite(ClientScriptEvent.be, var18, 0);
            if (null == var7) {
               bj = true;
               return null;
            } else {
               this.ax(var7);
               bx.put(var7, var5);
               return var7;
            }
         }
      }
   }

   Sprite aa(UrlRequester var1) {
      if (!this.ao()) {
         return this.ay(var1);
      } else {
         String var3 = this.cp + (this.do ? 1 : 0) + (this.di ? 1 : 0) + this.outline * 1638912775 + -353676735 * this.spriteShadow;
         Sprite var4 = (Sprite)bt.an(var3);
         if (null == var4) {
            Sprite var5 = this.ay(var1);
            if (null != var5) {
               var4 = var5.an();
               this.ax(var4);
               bt.aw(var3, var4);
            }
         }

         return var4;
      }
   }

   Sprite ay(UrlRequester var1) {
      if (this.cp != null && null != var1) {
         lr var3 = (lr)bd.an(this.cp);
         if (null == var3) {
            var3 = new lr(this.cp, var1);
            bd.aw(this.cp, var3);
         }

         return var3.af();
      } else {
         return null;
      }
   }

   boolean ao() {
      return this.do || this.di || 0 != 1638912775 * this.outline || 0 != this.spriteShadow * -353676735;
   }

   void ax(Sprite var1) {
      if (this.do) {
         var1.al();
      }

      if (this.di) {
         var1.aq();
      }

      if (1638912775 * this.outline > 0) {
         var1.ab(1638912775 * this.outline);
      }

      if (this.outline * 1638912775 >= 1) {
         var1.at(1);
      }

      if (1638912775 * this.outline >= 2) {
         var1.at(16777215);
      }

      if (0 != -353676735 * this.spriteShadow) {
         var1.aa(-353676735 * this.spriteShadow);
      }

   }

   public Font getFont() {
      bj = false;
      if (this.textLineHeight * -1065036825 == -1) {
         return null;
      } else {
         Font var2 = (Font)Component_cachedFonts.get((long)(-1065036825 * this.textLineHeight));
         if (null != var2) {
            return var2;
         } else {
            AbstractArchive var4 = ClientScriptEvent.be;
            AbstractArchive var5 = fv.bk;
            int var6 = -1065036825 * this.textLineHeight;
            byte[] var8 = var4.takeFile(var6, 0);
            boolean var7;
            if (null == var8) {
               var7 = false;
            } else {
               sb.aa_renamed(var8);
               var7 = true;
            }

            Font var3;
            if (!var7) {
               var3 = null;
            } else {
               byte[] var9 = var5.takeFile(var6, 0);
               Font var11;
               if (null == var9) {
                  var11 = null;
               } else {
                  Font var10 = new Font(var9, tx.ac, ar.au, dd.ab, fd.aq, pc.al, VarBitType.at);
                  pk.ay_renamed();
                  var11 = var10;
               }

               var3 = var11;
            }

            if (var3 != null) {
               Component_cachedFonts.put(var3, (long)(-1065036825 * this.textLineHeight));
            } else {
               bj = true;
            }

            return var3;
         }
      }
   }

   public Model getModel(SeqType var1, int var2, boolean var3, PlayerAppearance var4, NPCType var5, hv var6) {
      bj = false;
      int var8;
      int var9;
      if (var3) {
         var8 = this.modelType2 * 1761517389;
         var9 = this.modelId2 * -3148259;
      } else {
         var8 = this.modelType * -123768459;
         var9 = this.modelId * -168077555;
      }

      if (6 == var8) {
         if (null == var5) {
            return null;
         }

         var9 = var5.id * -1115372301;
      }

      if (0 == var8) {
         return null;
      } else if (1 == var8 && -1 == var9) {
         return null;
      } else {
         if (var6 != null && var6.au && 6 == var8) {
            var8 = 3;
         }

         long var10 = (long)(var9 + (var8 << 16));
         if (var6 != null) {
            var10 |= var6.af * -1176524468931644747L << 20;
         }

         Model var12 = (Model)Component_cachedModels.get(var10);
         if (var12 == null) {
            UnlitModel var13 = null;
            int var14 = 64;
            int var15 = 768;
            switch (var8) {
               case 1:
                  var13 = UnlitModel.af_renamed(DynamicObject.bi, var9, 0);
                  break;
               case 2:
                  var13 = AbstractArchive.getNPCType(var9).aq((hv)null);
                  break;
               case 3:
                  var13 = null != var4 ? var4.getChatHeadModel() : null;
                  break;
               case 4:
                  ObjType var16 = HeadbarUpdate.getObjType(var9);
                  var13 = var16.al(10);
                  var14 += var16.boughtlink * 2093614773;
                  var15 += 1794294545 * var16.boughttemplate;
               case 5:
               default:
                  break;
               case 6:
                  var13 = AbstractArchive.getNPCType(var9).aq(var6);
            }

            if (var13 == null) {
               bj = true;
               return null;
            }

            var12 = var13.light(var14, var15, -50, -10, -50);
            Component_cachedModels.put(var12, var10);
         }

         if (var1 != null) {
            var12 = var1.animateComponent(var12, var2);
         }

         return var12;
      }
   }

   public SpriteMask getSpriteMask(boolean var1) {
      if (-1352724779 * this.spriteId == -1) {
         var1 = false;
      }

      int var3 = var1 ? -1352724779 * this.spriteId : -363627527 * this.spriteId2;
      if (-1 == var3) {
         return null;
      } else {
         long var4 = ((this.di ? 1L : 0L) << 39) + ((this.do ? 1L : 0L) << 38) + ((long)(1638912775 * this.outline) << 36) + (long)var3 + ((long)(this.spriteShadow * -353676735) << 40);
         SpriteMask var6 = (SpriteMask)bm.get(var4);
         if (null != var6) {
            return var6;
         } else {
            Sprite var7 = this.at(var1, (UrlRequester)null);
            if (var7 == null) {
               return null;
            } else {
               Sprite var8 = var7.aw();
               int[] var9 = new int[var8.subHeight];
               int[] var10 = new int[var8.subHeight];

               for(int var11 = 0; var11 < var8.subHeight; ++var11) {
                  int var12 = 0;
                  int var13 = var8.subWidth;

                  int var14;
                  for(var14 = 0; var14 < var8.subWidth; ++var14) {
                     if (var8.pixels[var14 + var11 * var8.subWidth] == 0) {
                        var12 = var14;
                        break;
                     }
                  }

                  for(var14 = var8.subWidth - 1; var14 >= var12; --var14) {
                     if (0 == var8.pixels[var11 * var8.subWidth + var14]) {
                        var13 = var14 + 1;
                        break;
                     }
                  }

                  var9[var11] = var12;
                  var10[var11] = var13 - var12;
               }

               var6 = new SpriteMask(var8.subWidth, var8.subHeight, var10, var9);
               bm.put(var6, var4);
               return var6;
            }
         }
      }
   }

   public void setAction(int var1, String var2) {
      if (null == this.actions || this.actions.length <= var1) {
         String[] var4 = new String[var1 + 1];
         if (this.actions != null) {
            for(int var5 = 0; var5 < this.actions.length; ++var5) {
               var4[var5] = this.actions[var5];
            }
         }

         this.actions = var4;
      }

      this.actions[var1] = var2;
   }

   public boolean am() {
      return !this.isIf3 || 883712245 * this.type == 0 || this.type * 883712245 == 11 || this.hasListener || 1338 == this.clientCode * 1021339961 || 12 == 883712245 * this.type;
   }

   public boolean as() {
      return 11 == 883712245 * this.type || 12 == this.type * 883712245;
   }

   public void aj(String var1, UrlRequester var2, long var3) {
      if (11 == 883712245 * this.type && -1L != var3) {
         var1 = var1.replaceAll("%userid%", Long.toString(var3));
         this.ef = new gy();
         if (!this.ef.af(var1, var2)) {
            this.ef = null;
         } else {
            if (null == this.ej || this.ea == null) {
               this.az();
            }

         }
      }
   }

   public void ak(String var1, UrlRequester var2) {
      if (883712245 * this.type == 11 && null != var1) {
         this.ef = new gy();
         this.ef.am(var1, var2);
      }
   }

   void az() {
      this.ej = new HashMap();
      this.ea = new HashMap();
   }

   public void swapItems(int var1, int var2) {
      if (11 == 883712245 * this.type) {
         if (null == this.ej) {
            this.az();
         }

         this.ej.put(var1, var2);
      }
   }

   public void ae(String var1, int var2) {
      if (11 == 883712245 * this.type) {
         if (null == this.ea) {
            this.az();
         }

         this.ea.put(var1, var2);
      }
   }

   public boolean ap(int var1, int var2, int var3, int var4) {
      if (883712245 * this.type == 11 && null != this.ef && this.by()) {
         var1 -= var3;
         var2 -= var4;
         int var6 = (int)(this.ef.at()[0] * (float)(this.width * -794961409));
         int var7 = (int)(this.ef.at()[1] * (float)(1473950221 * this.height));
         int var8 = var6 + (int)(this.ef.at()[2] * (float)(this.width * -794961409));
         int var9 = var7 + (int)(this.ef.at()[3] * (float)(1473950221 * this.height));
         return var1 >= var6 && var2 >= var7 && var1 < var8 && var2 < var9;
      } else {
         return false;
      }
   }

   public boolean by() {
      return 2 == 1888225603 * this.paddingY;
   }

   public int bb(String var1) {
      return 11 == this.type * 883712245 && null != this.ef && this.by() ? this.ef.ac(var1) : -1;
   }

   public String bi(String var1) {
      return 11 == this.type * 883712245 && null != this.ef && this.by() ? this.ef.au(var1) : null;
   }

   public int be() {
      return this.ea != null && this.ea.size() > 0 ? 1 : 0;
   }

   public int bk() {
      if (this.type * 883712245 == 11 && null != this.ef && this.ea != null && !this.ea.isEmpty()) {
         String var2 = this.ef.al();
         return var2 != null && this.ea.containsKey(this.ef.al()) ? (Integer)this.ea.get(var2) : -1;
      } else {
         return -1;
      }
   }

   public String bx() {
      if (11 == 883712245 * this.type && null != this.ef) {
         String var2 = this.ef.al();
         Iterator var3 = this.ef.aa().iterator();

         while(var3.hasNext()) {
            gn var4 = (gn)var3.next();
            String var5 = String.format("%%%S%%", var4.ao());
            if (var4.af() == 0) {
               var2.replaceAll(var5, Integer.toString(var4.al()));
            } else {
               var2.replaceAll(var5, var4.an());
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   public int[] bo() {
      if (11 == 883712245 * this.type && this.ef != null) {
         int[] var2 = new int[3];
         int var3 = 0;
         Iterator var4 = this.ef.aa().iterator();

         while(var4.hasNext()) {
            gn var5 = (gn)var4.next();
            if (!var5.ao().equals("user_id")) {
               if (var5.af() != 0) {
                  return null;
               }

               var2[var3++] = var5.al();
               if (var3 > 3) {
                  return null;
               }
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   public boolean bz(UrlRequester var1) {
      if (this.type * 883712245 == 11 && this.ef != null) {
         this.ef.an(var1);
         if (this.ef.aw() != this.paddingY * 1888225603) {
            this.paddingY = this.ef.aw() * 996199275;
            if (this.paddingY * 1888225603 >= 100) {
               return true;
            }

            if (2 == this.paddingY * 1888225603) {
               this.bd();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   void bd() {
      this.noClickThrough = true;
      ArrayList var2 = this.ef.ab();
      ArrayList var3 = this.ef.aq();
      int var4 = var2.size() + var3.size();
      this.children = new Component[var4];
      int var5 = 0;

      Iterator var6;
      Component var8;
      for(var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
         gi var7 = (gi)var6.next();
         var8 = mz.bm_renamed(5, this, var5, 0, 0, 0, 0, var7.an);
         var8.cp = var7.af.aw();
         lr var9 = new lr(var7.af);
         bd.aw(var8.cp, var9);
      }

      for(var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
         gq var11 = (gq)var6.next();
         var8 = mz.bm_renamed(4, this, var5, 0, 0, 0, 0, var11.au);
         var8.text = var11.ac;
         var8.textLineHeight = (Integer)this.ej.get(1845750621 * var11.al) * 1858899927;
         var8.textYAlignment = var11.ab * 329326313;
         var8.paddingX = 1890763397 * var11.aq;
      }

   }

   public void bt() {
      this.es = new mt();

      for(int var2 = 1; var2 <= 12; ++var2) {
         this.es.aw.af(var2, 0);
      }

      for(char var3 = 0; var3 < ' '; ++var3) {
         this.es.aw.an(var3, 0);
      }

      this.es.aw.an('\u0080', 0);
      this.es.aw.af(82, 2);
      this.es.aw.af(81, 2);
      this.es.aw.af(86, 2);
   }

   public mz bj() {
      return null != this.es ? this.es.af : null;
   }

   public lo bn() {
      return this.es != null ? this.es.an : null;
   }

   public bb bs() {
      return this.es != null ? this.es.aw : null;
   }

   public mt br() {
      return this.es;
   }

   boolean bg(mz var1) {
      boolean var3 = false;
      String var6;
      String var7;
      StringBuilder var8;
      int var9;
      int var10;
      int var11;
      char var12;
      String var13;
      if (null != this.text && !this.text.isEmpty()) {
         var7 = this.text;
         var8 = new StringBuilder(var7.length());
         var9 = 0;
         var10 = -1;

         for(var11 = 0; var11 < var7.length(); ++var11) {
            var12 = var7.charAt(var11);
            if (var12 == '<') {
               var8.append(var7.substring(var9, var11));
               var10 = var11;
            } else if (var12 == '>' && -1 != var10) {
               var13 = var7.substring(var10 + 1, var11);
               var10 = -1;
               if (var13.equals("lt")) {
                  var8.append("<");
               } else if (var13.equals("gt")) {
                  var8.append(">");
               } else if (var13.equals("br")) {
                  var8.append("\n");
               }

               var9 = 1 + var11;
            }
         }

         if (var9 < var7.length()) {
            var8.append(var7.substring(var9, var7.length()));
         }

         var6 = var8.toString();
         var3 |= var1.ac(var6);
         this.text = "";
      }

      if (null != this.text2 && !this.text2.isEmpty()) {
         var7 = this.text2;
         var8 = new StringBuilder(var7.length());
         var9 = 0;
         var10 = -1;

         for(var11 = 0; var11 < var7.length(); ++var11) {
            var12 = var7.charAt(var11);
            if ('<' == var12) {
               var8.append(var7.substring(var9, var11));
               var10 = var11;
            } else if ('>' == var12 && -1 != var10) {
               var13 = var7.substring(1 + var10, var11);
               var10 = -1;
               if (var13.equals("lt")) {
                  var8.append("<");
               } else if (var13.equals("gt")) {
                  var8.append(">");
               } else if (var13.equals("br")) {
                  var8.append("\n");
               }

               var9 = 1 + var11;
            }
         }

         if (var9 < var7.length()) {
            var8.append(var7.substring(var9, var7.length()));
         }

         var6 = var8.toString();
         var3 |= var1.au(var6);
         this.text2 = "";
      }

      return var3;
   }

   public boolean bu() {
      mz var2 = this.bj();
      if (var2 == null) {
         return false;
      } else {
         boolean var3 = false;
         if (!var2.ca() && -1 != -1065036825 * this.textLineHeight) {
            int var4 = var2.cu();
            int var5 = var2.ck();
            int var6 = var2.cn();
            int var7 = var2.cc();
            Font var8 = this.getFont();
            if (null != var8) {
               var3 |= var2.ab(var8);
               var3 |= this.bg(var2);
               var3 |= var2.ay(var4, var5);
               var3 |= var2.ap(var6, var7);
            }
         } else if (var2.ca()) {
            var3 |= this.bg(var2);
         }

         var2.af();
         return var3;
      }
   }
}
