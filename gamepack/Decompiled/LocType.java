public class LocType extends DualNode {
   public static EvictingDualNodeHashTable LocType_cachedUnlitModels = new EvictingDualNodeHashTable(500);
   static boolean LocType_isLowDetail = false;
   static UnlitModel[] al = new UnlitModel[4];
   static EvictingDualNodeHashTable ab = new EvictingDualNodeHashTable(30);
   static EvictingDualNodeHashTable LocType_cached = new EvictingDualNodeHashTable(4096);
   static EvictingDualNodeHashTable aq = new EvictingDualNodeHashTable(30);
   static AbstractArchive LocType_archive;
   boolean sharelight;
   boolean isSolid;
   boolean isRotated;
   int hillChange;
   int contrast;
   int resizeZ;
   int bf;
   int offsetY;
   int resizeY;
   int offsetZ;
   int bq;
   int offsetX;
   int ambient;
   int resizeX;
   int[] aa;
   int[] ay;
   IterableNodeHashTable params;
   short[] retex_s;
   short[] retex_d;
   short[] recol_d;
   short[] recol_s;
   public boolean occlude;
   public boolean boolean1;
   public boolean bh;
   public boolean clipped;
   public boolean lowDetailVisible;
   public int animationId;
   public int interactable;
   public int interactType;
   public int int2;
   public int length;
   public int at;
   public int width;
   public int ambientSoundId;
   public int mapIconId;
   public int int3;
   public int mapSceneId;
   public int int5;
   public int int6;
   public int int4;
   public int[] bc;
   public int[] multi;
   public String name;
   public String[] op;

   public static boolean au_renamed(int var0) {
      return 0 != (var0 >> 22 & 1);
   }

   LocType() {
      this.name = Strings.Strings_null;
      this.width = 1205654711;
      this.length = 1159818229;
      this.interactType = -1581132706;
      this.boolean1 = true;
      this.interactable = -1041321269;
      this.hillChange = -657077221;
      this.sharelight = false;
      this.occlude = false;
      this.animationId = 1142530427;
      this.int2 = -233970928;
      this.ambient = 0;
      this.contrast = 0;
      this.op = new String[5];
      this.mapIconId = 1683785829;
      this.mapSceneId = 476568133;
      this.isRotated = false;
      this.clipped = true;
      this.resizeX = -133284736;
      this.resizeY = -845704064;
      this.resizeZ = -2060996480;
      this.offsetX = 0;
      this.offsetY = 0;
      this.offsetZ = 0;
      this.lowDetailVisible = false;
      this.isSolid = false;
      this.int3 = -1776888457;
      this.bf = -1157714067;
      this.bq = 1863808827;
      this.ambientSoundId = 38705135;
      this.int4 = 0;
      this.int5 = 0;
      this.int6 = 0;
      this.bh = true;
   }

   static ClientScript aw_renamed(int var0, int var1) {
      ClientScript var3 = (ClientScript)ClientScript.ClientScript_cached.get((long)(var0 << 16));
      if (var3 != null) {
         return var3;
      } else {
         String var4 = String.valueOf(var0);
         int var5 = ey.archive12.getGroupId(var4);
         if (var5 == -1) {
            return null;
         } else {
            byte[] var6 = ey.archive12.takeFileFlat(var5);
            if (var6 != null) {
               if (var6.length <= 1) {
                  return null;
               }

               var3 = bz.loadClientScript(var6);
               if (var3 != null) {
                  ClientScript.ClientScript_cached.put(var3, (long)(var0 << 16));
                  return var3;
               }
            }

            return null;
         }
      }
   }

   void aw() {
      if (this.interactable * 415653149 == -1) {
         this.interactable = 0;
         if (null != this.aa && (null == this.ay || this.ay[0] == 10)) {
            this.interactable = 1041321269;
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            if (this.op[var2] != null) {
               this.interactable = 1041321269;
            }
         }
      }

      if (-1 == -1850643527 * this.int3) {
         this.int3 = (this.interactType * -973955889 != 0 ? 1 : 0) * 1776888457;
      }

   }

   void decode(Packet var1) {
      while(true) {
         int var3 = var1.g1();
         if (var3 == 0) {
            return;
         }

         this.decode0(var1, var3, (byte)16);
      }
   }

   void decode0(Packet var1, int var2, byte var3) {
      int var4;
      int var5;
      if (var2 == 1) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         var4 = var1.g1();
         if (var4 > 0) {
            if (var3 == -1) {
               return;
            }

            if (this.aa != null) {
               if (var3 == -1) {
                  throw new IllegalStateException();
               }

               if (!LocType_isLowDetail) {
                  var1.index += -254100545 * var4;
                  return;
               }

               if (var3 == -1) {
                  return;
               }
            }

            this.ay = new int[var4];
            this.aa = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == -1) {
                  throw new IllegalStateException();
               }

               this.aa[var5] = var1.cl();
               this.ay[var5] = var1.g1();
            }
         }
      } else if (var2 == 2) {
         this.name = var1.cw();
      } else if (var2 == 5) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         var4 = var1.g1();
         if (var4 > 0) {
            if (this.aa != null && !LocType_isLowDetail) {
               var1.index += var4 * 1262255402;
            } else {
               this.ay = null;
               this.aa = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 == -1) {
                     throw new IllegalStateException();
                  }

                  this.aa[var5] = var1.cl();
               }
            }
         }
      } else if (var2 == 14) {
         if (var3 == -1) {
            return;
         }

         this.width = var1.g1() * 1205654711;
      } else if (15 == var2) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.length = var1.g1() * 1159818229;
      } else if (var2 == 17) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.interactType = 0;
         this.boolean1 = false;
      } else if (var2 == 18) {
         this.boolean1 = false;
      } else if (var2 == 19) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.interactable = var1.g1() * 1041321269;
      } else if (var2 == 21) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.hillChange = 0;
      } else if (var2 == 22) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.sharelight = true;
      } else if (23 == var2) {
         this.occlude = true;
      } else if (var2 == 24) {
         this.animationId = var1.cl() * -1142530427;
         if (65535 == 1292954189 * this.animationId) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.animationId = 1142530427;
         }
      } else if (27 == var2) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.interactType = 1356917295;
      } else if (var2 == 28) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.int2 = var1.g1() * -1893671375;
      } else if (var2 == 29) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         this.ambient = var1.g1s() * 524532799;
      } else if (39 == var2) {
         this.contrast = var1.g1s() * -1238182971;
      } else {
         if (var2 >= 30) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            if (var2 < 35) {
               this.op[var2 - 30] = var1.cw();
               if (this.op[var2 - 30].equalsIgnoreCase(Strings.Strings_hidden)) {
                  if (var3 == -1) {
                     throw new IllegalStateException();
                  }

                  this.op[var2 - 30] = null;
               }

               return;
            }
         }

         if (var2 == 40) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            var4 = var1.g1();
            this.recol_s = new short[var4];
            this.recol_d = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.recol_s[var5] = (short)var1.cl();
               this.recol_d[var5] = (short)var1.cl();
            }
         } else if (var2 == 41) {
            if (var3 == -1) {
               return;
            }

            var4 = var1.g1();
            this.retex_s = new short[var4];
            this.retex_d = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == -1) {
                  throw new IllegalStateException();
               }

               this.retex_s[var5] = (short)var1.cl();
               this.retex_d[var5] = (short)var1.cl();
            }
         } else if (61 == var2) {
            var1.cl();
         } else if (62 == var2) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.isRotated = true;
         } else if (64 == var2) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.clipped = false;
         } else if (65 == var2) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.resizeX = var1.cl() * 1039146105;
         } else if (var2 == 66) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.resizeY = var1.cl() * -677695703;
         } else if (var2 == 67) {
            if (var3 == -1) {
               return;
            }

            this.resizeZ = var1.cl() * 1862946657;
         } else if (var2 == 68) {
            this.mapSceneId = var1.cl() * -476568133;
         } else if (69 == var2) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            var1.g1();
         } else if (var2 == 70) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.offsetX = var1.cg() * -327422321;
         } else if (71 == var2) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.offsetY = var1.cg() * 956024773;
         } else if (72 == var2) {
            if (var3 == -1) {
               return;
            }

            this.offsetZ = var1.cg() * -127229215;
         } else if (73 == var2) {
            if (var3 == -1) {
               return;
            }

            this.lowDetailVisible = true;
         } else if (74 == var2) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.isSolid = true;
         } else if (var2 == 75) {
            if (var3 == -1) {
               return;
            }

            this.int3 = var1.g1() * 1776888457;
         } else {
            if (var2 != 77) {
               if (var2 != 92) {
                  if (78 == var2) {
                     if (var3 == -1) {
                        throw new IllegalStateException();
                     }

                     this.ambientSoundId = var1.cl() * -38705135;
                     this.int4 = var1.g1() * 1190823625;
                     return;
                  } else if (var2 == 79) {
                     if (var3 == -1) {
                        throw new IllegalStateException();
                     }

                     this.int5 = var1.cl() * 1257958995;
                     this.int6 = var1.cl() * 230715233;
                     this.int4 = var1.g1() * 1190823625;
                     var4 = var1.g1();
                     this.bc = new int[var4];

                     for(var5 = 0; var5 < var4; ++var5) {
                        this.bc[var5] = var1.cl();
                     }

                     return;
                  } else if (81 == var2) {
                     this.hillChange = var1.g1() * 708044032;
                     return;
                  } else if (var2 == 82) {
                     if (var3 == -1) {
                        return;
                     }

                     this.mapIconId = var1.cl() * -1683785829;
                     return;
                  } else {
                     if (89 == var2) {
                        if (var3 == -1) {
                           throw new IllegalStateException();
                        }

                        this.bh = false;
                     } else if (var2 == 249) {
                        this.params = ChatChannel.readStringIntParameters(var1, this.params);
                        return;
                     }

                     return;
                  }
               }

               if (var3 == -1) {
                  throw new IllegalStateException();
               }
            }

            this.bf = var1.cl() * 1157714067;
            if (1411927451 * this.bf == 65535) {
               if (var3 == -1) {
                  return;
               }

               this.bf = -1157714067;
            }

            this.bq = var1.cl() * -1863808827;
            if (1685173773 * this.bq == 65535) {
               this.bq = 1863808827;
            }

            var4 = -1;
            if (var2 == 92) {
               if (var3 == -1) {
                  throw new IllegalStateException();
               }

               var4 = var1.cl();
               if (65535 == var4) {
                  if (var3 == -1) {
                     return;
                  }

                  var4 = -1;
               }
            }

            var5 = var1.g1();
            this.multi = new int[var5 + 2];

            for(int var6 = 0; var6 <= var5; ++var6) {
               this.multi[var6] = var1.cl();
               if (this.multi[var6] == 65535) {
                  if (var3 == -1) {
                     throw new IllegalStateException();
                  }

                  this.multi[var6] = -1;
               }
            }

            this.multi[1 + var5] = var4;
         }
      }

   }

   public final boolean loadModelType(int var1) {
      if (this.ay != null) {
         for(int var5 = 0; var5 < this.ay.length; ++var5) {
            if (this.ay[var5] == var1) {
               return go.LocType_modelArchive.tryLoadFile(this.aa[var5] & '\uffff', 0);
            }
         }

         return true;
      } else if (null == this.aa) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var3 = true;

         for(int var4 = 0; var4 < this.aa.length; ++var4) {
            var3 &= go.LocType_modelArchive.tryLoadFile(this.aa[var4] & '\uffff', 0);
         }

         return var3;
      }
   }

   public final boolean loadModels() {
      if (this.aa == null) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.aa.length; ++var3) {
            var2 &= go.LocType_modelArchive.tryLoadFile(this.aa[var3] & '\uffff', 0);
         }

         return var2;
      }
   }

   public final Entity al(int var1, int var2, int[][] var3, int var4, int var5, int var6, byte var7) {
      long var8;
      if (this.ay == null) {
         if (var7 >= -1) {
            throw new IllegalStateException();
         }

         var8 = (long)((this.at * -1529817365 << 10) + var2);
      } else {
         var8 = (long)(var2 + (-1529817365 * this.at << 10) + (var1 << 3));
      }

      Object var10 = (Entity)ab.get(var8);
      if (null == var10) {
         if (var7 >= -1) {
            throw new IllegalStateException();
         }

         UnlitModel var11 = this.getUnlitModel(var1, var2);
         if (var11 == null) {
            if (var7 >= -1) {
               throw new IllegalStateException();
            }

            return null;
         }

         if (!this.sharelight) {
            if (var7 >= -1) {
               throw new IllegalStateException();
            }

            var10 = var11.bb(64 + this.ambient * 1284125631, 768 + -18088891 * this.contrast, -50, -10, -50);
         } else {
            var11.bo = (short)(1284125631 * this.ambient + 64);
            var11.bz = (short)(this.contrast * -18088891 + 768);
            var11.ad();
            var10 = var11;
         }

         ab.put((DualNode)var10, var8);
      }

      if (this.sharelight) {
         if (var7 >= -1) {
            throw new IllegalStateException();
         }

         var10 = ((UnlitModel)var10).ao();
      }

      if (-1437543955 * this.hillChange >= 0) {
         if (var7 >= -1) {
            throw new IllegalStateException();
         }

         if (var10 instanceof it) {
            var10 = ((it)var10).at(var3, var4, var5, var6, true, this.hillChange * -1437543955);
         } else if (var10 instanceof UnlitModel) {
            if (var7 >= -1) {
               throw new IllegalStateException();
            }

            var10 = ((UnlitModel)var10).ax(var3, var4, var5, var6, true, -1437543955 * this.hillChange);
         }
      }

      return (Entity)var10;
   }

   public final it at(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var8;
      if (null == this.ay) {
         var8 = (long)((-1529817365 * this.at << 10) + var2);
      } else {
         var8 = (long)((this.at * -1529817365 << 10) + (var1 << 3) + var2);
      }

      it var10 = (it)aq.get(var8);
      if (var10 == null) {
         UnlitModel var11 = this.getUnlitModel(var1, var2);
         if (var11 == null) {
            return null;
         }

         var10 = var11.bb(this.ambient * 1284125631 + 64, 768 + -18088891 * this.contrast, -50, -10, -50);
         aq.put(var10, var8);
      }

      if (this.hillChange * -1437543955 >= 0) {
         var10 = var10.at(var3, var4, var5, var6, true, -1437543955 * this.hillChange);
      }

      return var10;
   }

   public final it aa(int var1, int var2, int[][] var3, int var4, int var5, int var6, SeqType var7, int var8) {
      long var10;
      if (null == this.ay) {
         var10 = (long)(var2 + (this.at * -1529817365 << 10));
      } else {
         var10 = (long)(var2 + (this.at * -1529817365 << 10) + (var1 << 3));
      }

      it var12 = (it)aq.get(var10);
      if (var12 == null) {
         UnlitModel var13 = this.getUnlitModel(var1, var2);
         if (var13 == null) {
            return null;
         }

         var12 = var13.bb(64 + this.ambient * 1284125631, 768 + this.contrast * -18088891, -50, -10, -50);
         aq.put(var12, var10);
      }

      if (var7 == null && -1 == this.hillChange * -1437543955) {
         return var12;
      } else {
         if (null != var7) {
            var12 = var7.aq(var12, var8, var2);
         } else {
            var12 = var12.aa(true);
         }

         if (-1437543955 * this.hillChange >= 0) {
            var12 = var12.at(var3, var4, var5, var6, false, -1437543955 * this.hillChange);
         }

         return var12;
      }
   }

   final UnlitModel getUnlitModel(int var1, int var2) {
      UnlitModel var4 = null;
      boolean var5;
      int var6;
      int var8;
      if (this.ay == null) {
         if (var1 != 10) {
            return null;
         }

         if (null == this.aa) {
            return null;
         }

         var5 = this.isRotated;
         if (2 == var1 && var2 > 3) {
            var5 = !var5;
         }

         var6 = this.aa.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            var8 = this.aa[var7];
            if (var5) {
               var8 += 65536;
            }

            var4 = (UnlitModel)LocType_cachedUnlitModels.get((long)var8);
            if (null == var4) {
               var4 = UnlitModel.af_renamed(go.LocType_modelArchive, var8 & '\uffff', 0);
               if (var4 == null) {
                  return null;
               }

               if (var5) {
                  var4.ak();
               }

               LocType_cachedUnlitModels.put(var4, (long)var8);
            }

            if (var6 > 1) {
               al[var7] = var4;
            }
         }

         if (var6 > 1) {
            var4 = new UnlitModel(al, var6);
         }
      } else {
         int var10 = -1;

         for(var6 = 0; var6 < this.ay.length; ++var6) {
            if (this.ay[var6] == var1) {
               var10 = var6;
               break;
            }
         }

         if (var10 == -1) {
            return null;
         }

         var6 = this.aa[var10];
         boolean var11 = this.isRotated ^ var2 > 3;
         if (var11) {
            var6 += 65536;
         }

         var4 = (UnlitModel)LocType_cachedUnlitModels.get((long)var6);
         if (null == var4) {
            var4 = UnlitModel.af_renamed(go.LocType_modelArchive, var6 & '\uffff', 0);
            if (null == var4) {
               return null;
            }

            if (var11) {
               var4.ak();
            }

            LocType_cachedUnlitModels.put(var4, (long)var6);
         }
      }

      if (128 == this.resizeX * -60584503 && 128 == -950870759 * this.resizeY && -1734306655 * this.resizeZ == 128) {
         var5 = false;
      } else {
         var5 = true;
      }

      boolean var12;
      if (105607279 * this.offsetX == 0 && 0 == this.offsetY * -1068622067 && this.offsetZ * 629285153 == 0) {
         var12 = false;
      } else {
         var12 = true;
      }

      UnlitModel var13 = new UnlitModel(var4, 0 == var2 && !var5 && !var12, this.recol_s == null, this.retex_s == null, true);
      if (4 == var1 && var2 > 3) {
         var13.ar(256);
         var13.am(45, 0, -45);
      }

      var2 &= 3;
      if (1 == var2) {
         var13.ag();
      } else if (var2 == 2) {
         var13.ah();
      } else if (var2 == 3) {
         var13.av();
      }

      if (this.recol_s != null) {
         for(var8 = 0; var8 < this.recol_s.length; ++var8) {
            var13.recolor(this.recol_s[var8], this.recol_d[var8]);
         }
      }

      if (null != this.retex_s) {
         for(var8 = 0; var8 < this.retex_s.length; ++var8) {
            var13.retexture(this.retex_s[var8], this.retex_d[var8]);
         }
      }

      if (var5) {
         var13.az(this.resizeX * -60584503, this.resizeY * -950870759, -1734306655 * this.resizeZ);
      }

      if (var12) {
         var13.am(105607279 * this.offsetX, this.offsetY * -1068622067, this.offsetZ * 629285153);
      }

      return var13;
   }

   public final LocType multiLoc() {
      int var2 = -1;
      if (-1 != 1411927451 * this.bf) {
         var2 = WorldMapSection1.getVarbit(1411927451 * this.bf);
      } else if (1685173773 * this.bq != -1) {
         var2 = Varps.Varps_main[this.bq * 1685173773];
      }

      int var3;
      if (var2 >= 0 && var2 < this.multi.length - 1) {
         var3 = this.multi[var2];
      } else {
         var3 = this.multi[this.multi.length - 1];
      }

      return -1 != var3 ? fw.getLocType(var3) : null;
   }

   public int getIntParam(int var1, int var2) {
      IterableNodeHashTable var5 = this.params;
      int var4;
      if (null == var5) {
         var4 = var2;
      } else {
         IntegerNode var6 = (IntegerNode)var5.get((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = var6.integer;
         }
      }

      return var4;
   }

   public String getStringParam(int var1, String var2) {
      return EnumType.an_renamed(this.params, var1, var2);
   }

   public boolean ah() {
      if (this.multi == null) {
         return this.ambientSoundId * 1970571505 != -1 || null != this.bc;
      } else {
         for(int var2 = 0; var2 < this.multi.length; ++var2) {
            if (-1 != this.multi[var2]) {
               LocType var3 = fw.getLocType(this.multi[var2]);
               if (-1 != 1970571505 * var3.ambientSoundId || var3.bc != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   static int ae_renamed(int var0, ClientScript var1, boolean var2) {
      if (var0 == 3200) {
         Interpreter.Interpreter_intStackSize -= 1281407919;
         fh.he_renamed(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2]);
         return 1;
      } else if (var0 == 3201) {
         an.hf_renamed(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
         return 1;
      } else if (var0 == 3202) {
         Interpreter.Interpreter_intStackSize -= 854271946;
         CollisionMap.hy_renamed(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1]);
         return 1;
      } else {
         dt var4;
         dk var5;
         int var6;
         int var7;
         String var16;
         if (var0 != 3212 && 3213 != var0 && var0 != 3209 && var0 != 3181 && 3203 != var0 && var0 != 3205 && 3207 != var0) {
            boolean var15;
            if (var0 != 3214 && var0 != 3215 && 3210 != var0 && 3182 != var0 && var0 != 3204 && var0 != 3206 && 3208 != var0) {
               if (3211 == var0) {
                  return 1;
               } else {
                  int var17;
                  int var19;
                  if (3216 == var0) {
                     var17 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                     var19 = 0;
                     dt var23 = (dt)StructType.findEnumerated(ArchiveDiskAction.au_renamed(), var17);
                     if (var23 != null) {
                        var19 = dt.af != var23 ? 1 : 0;
                     }

                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var19;
                     return 1;
                  } else if (3218 == var0) {
                     var17 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                     var19 = 0;
                     dk var22 = (dk)StructType.findEnumerated(em.au_renamed(), var17);
                     if (var22 != null) {
                        var19 = var22 != dk.af ? 1 : 0;
                     }

                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var19;
                     return 1;
                  } else if (3217 != var0 && var0 != 3219) {
                     return 2;
                  } else {
                     var4 = dt.af;
                     var5 = dk.af;
                     var15 = true;
                     boolean var21 = true;
                     int var8;
                     if (3217 == var0) {
                        var8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        var4 = (dt)StructType.findEnumerated(ArchiveDiskAction.au_renamed(), var8);
                        if (null == var4) {
                           throw new RuntimeException(String.format("Unrecognized device option %d", var8));
                        }
                     }

                     if (var0 == 3219) {
                        var8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        var5 = (dk)StructType.findEnumerated(em.au_renamed(), var8);
                        if (null == var5) {
                           throw new RuntimeException(String.format("Unrecognized game option %d", var8));
                        }
                     }

                     String var18;
                     byte var20;
                     if (dk.af == var5) {
                        switch (-2060299987 * var4.aq) {
                           case 1:
                           case 2:
                           case 3:
                              var20 = 0;
                              var7 = 1;
                              break;
                           case 4:
                              var20 = 0;
                              var7 = Integer.MAX_VALUE;
                              break;
                           case 5:
                              var20 = 0;
                              var7 = 100;
                              break;
                           default:
                              var18 = String.format("Unkown device option: %s.", var4.toString());
                              throw new RuntimeException(var18);
                        }
                     } else {
                        switch (358560065 * var5.ab) {
                           case 1:
                              var20 = 0;
                              var7 = 1;
                              break;
                           case 2:
                           case 3:
                           case 4:
                              var20 = 0;
                              var7 = 100;
                              break;
                           default:
                              var18 = String.format("Unkown game option: %s.", var5.toString());
                              throw new RuntimeException(var18);
                        }
                     }

                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var20;
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var7;
                     return 1;
                  }
               }
            } else {
               var4 = dt.af;
               var5 = dk.af;
               var15 = false;
               if (3214 == var0) {
                  var7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var4 = (dt)StructType.findEnumerated(ArchiveDiskAction.au_renamed(), var7);
                  if (var4 == null) {
                     throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                  }
               }

               if (var0 == 3215) {
                  var7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var5 = (dk)StructType.findEnumerated(em.au_renamed(), var7);
                  if (null == var5) {
                     throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                  }
               }

               if (3210 == var0) {
                  var7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  var4 = (dt)StructType.findEnumerated(ArchiveDiskAction.au_renamed(), var7);
                  if (var4 == null) {
                     var5 = (dk)StructType.findEnumerated(em.au_renamed(), var7);
                     if (var5 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                     }
                  }
               } else if (3182 == var0) {
                  var4 = dt.ab;
               } else if (var0 == 3204) {
                  var5 = dk.aw;
               } else if (var0 == 3206) {
                  var5 = dk.ac;
               } else if (var0 == 3208) {
                  var5 = dk.au;
               }

               if (var5 == dk.af) {
                  switch (var4.aq * -2060299987) {
                     case 1:
                        var6 = aj.clientPreferences.al() ? 1 : 0;
                        break;
                     case 2:
                        var6 = aj.clientPreferences.aa() ? 1 : 0;
                        break;
                     case 3:
                        var6 = aj.clientPreferences.ax() ? 1 : 0;
                        break;
                     case 4:
                        var6 = aj.clientPreferences.ag();
                        break;
                     case 5:
                        var6 = da.mh_renamed();
                        break;
                     default:
                        var16 = String.format("Unkown device option: %s.", var4.toString());
                        throw new RuntimeException(var16);
                  }
               } else {
                  switch (var5.ab * 358560065) {
                     case 1:
                        var6 = aj.clientPreferences.ab() ? 1 : 0;
                        break;
                     case 2:
                        var7 = aj.clientPreferences.am();
                        var6 = Math.round((float)(var7 * 100) / 255.0F);
                        break;
                     case 3:
                        var7 = aj.clientPreferences.aj();
                        var6 = Math.round((float)(var7 * 100) / 127.0F);
                        break;
                     case 4:
                        var7 = aj.clientPreferences.az();
                        var6 = Math.round((float)(100 * var7) / 127.0F);
                        break;
                     default:
                        var16 = String.format("Unkown game option: %s.", var5.toString());
                        throw new RuntimeException(var16);
                  }
               }

               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var6;
               return 1;
            }
         } else {
            var4 = dt.af;
            var5 = dk.af;
            var6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (3212 == var0) {
               var7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               var4 = (dt)StructType.findEnumerated(ArchiveDiskAction.au_renamed(), var7);
               if (var4 == null) {
                  throw new RuntimeException(String.format("Unrecognized device option %d", var7));
               }
            }

            if (var0 == 3213) {
               var7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               var5 = (dk)StructType.findEnumerated(em.au_renamed(), var7);
               if (var5 == null) {
                  throw new RuntimeException(String.format("Unrecognized game option %d", var7));
               }
            }

            if (var0 == 3209) {
               var7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               var4 = (dt)StructType.findEnumerated(ArchiveDiskAction.au_renamed(), var7);
               if (null == var4) {
                  var5 = (dk)StructType.findEnumerated(em.au_renamed(), var7);
                  if (null == var5) {
                     throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                  }
               }
            } else if (var0 == 3181) {
               var4 = dt.ab;
            } else if (var0 == 3203) {
               var5 = dk.aw;
            } else if (3205 == var0) {
               var5 = dk.ac;
            } else if (3207 == var0) {
               var5 = dk.au;
            }

            if (dk.af == var5) {
               switch (-2060299987 * var4.aq) {
                  case 1:
                     aj.clientPreferences.aq(1 == var6);
                     break;
                  case 2:
                     aj.clientPreferences.at(1 == var6);
                     break;
                  case 3:
                     aj.clientPreferences.ay(1 == var6);
                     break;
                  case 4:
                     if (var6 < 0) {
                        var6 = 0;
                     }

                     aj.clientPreferences.ai(var6);
                     break;
                  case 5:
                     cm.mc_renamed(var6);
                     break;
                  default:
                     var16 = String.format("Unkown device option: %s.", var4.toString());
                     throw new RuntimeException(var16);
               }
            } else {
               switch (var5.ab * 358560065) {
                  case 1:
                     aj.clientPreferences.au(var6 == 1);
                     break;
                  case 2:
                     var6 = Math.min(Math.max(var6, 0), 100);
                     var7 = Math.round((float)(255 * var6) / 100.0F);
                     dt.mo_renamed(var7);
                     break;
                  case 3:
                     var6 = Math.min(Math.max(var6, 0), 100);
                     var7 = Math.round((float)(127 * var6) / 100.0F);
                     fe.mn_renamed(var7);
                     break;
                  case 4:
                     var6 = Math.min(Math.max(var6, 0), 100);
                     var7 = Math.round((float)(127 * var6) / 100.0F);
                     fp.mi_renamed(var7);
                     break;
                  default:
                     var16 = String.format("Unkown game option: %s.", var5.toString());
                     throw new RuntimeException(var16);
               }
            }

            return 1;
         }
      }
   }
}
