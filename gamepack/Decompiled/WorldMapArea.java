import java.util.Iterator;
import java.util.LinkedList;

public class WorldMapArea {
   boolean isMain0 = false;
   int maxY0 = 0;
   int ac = 1277906969;
   int id0 = 1431885777;
   int maxX0 = 0;
   int minX0 = 325424625;
   int minY0 = -498392157;
   int zoom0 = 1102813389;
   String archiveName0;
   String name0;
   LinkedList sections;
   Coord origin0 = null;

   public static int an_renamed(Packet var0, String var1) {
      int var3 = -1633313603 * var0.index;
      byte[] var4 = ia.ac_renamed(var1);
      var0.pSmart1or2(var4.length);
      var0.index += mv.huffman.af(var4, 0, var4.length, var0.array, -1633313603 * var0.index) * -1516355947;
      return var0.index * -1633313603 - var3;
   }

   public void read(Packet var1, int var2) {
      this.id0 = var2 * -1431885777;
      this.archiveName0 = var1.cw();
      this.name0 = var1.cw();
      this.origin0 = new Coord(var1.g4s());
      this.ac = var1.g4s() * -1277906969;
      var1.g1();
      this.isMain0 = var1.g1() == 1;
      this.zoom0 = var1.g1() * -1102813389;
      int var4 = var1.g1();
      this.sections = new LinkedList();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.sections.add(this.readWorldMapSection(var1));
      }

      this.setBounds();
   }

   WorldMapSection readWorldMapSection(Packet var1) {
      int var3 = var1.g1();
      WorldMapSectionType var4 = (WorldMapSectionType)StructType.findEnumerated(WorldMapSectionType.au_renamed(), var3);
      Object var5 = null;
      switch (var4.type * -1627349533) {
         case 0:
            var5 = new WorldMapSection2();
            break;
         case 1:
            var5 = new WorldMapSection3();
            break;
         case 2:
            var5 = new WorldMapSection1();
            break;
         case 3:
            var5 = new WorldMapSection0();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((WorldMapSection)var5).read(var1);
      return (WorldMapSection)var5;
   }

   public boolean containsCoord(int var1, int var2, int var3) {
      Iterator var5 = this.sections.iterator();

      WorldMapSection var6;
      do {
         if (!var5.hasNext()) {
            return false;
         }

         var6 = (WorldMapSection)var5.next();
      } while(!var6.containsCoord(var1, var2, var3));

      return true;
   }

   public boolean containsPosition(int var1, int var2) {
      int var4 = var1 / 64;
      int var5 = var2 / 64;
      if (var4 >= this.minX0 * 77939951 && var4 <= this.maxX0 * 1854846129) {
         if (var5 >= 2059655157 * this.minY0 && var5 <= -1086956513 * this.maxY0) {
            Iterator var6 = this.sections.iterator();

            WorldMapSection var7;
            do {
               if (!var6.hasNext()) {
                  return false;
               }

               var7 = (WorldMapSection)var6.next();
            } while(!var7.containsPosition(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int[] position(int var1, int var2, int var3) {
      Iterator var5 = this.sections.iterator();

      WorldMapSection var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (WorldMapSection)var5.next();
      } while(!var6.containsCoord(var1, var2, var3));

      return var6.position(var1, var2, var3);
   }

   public Coord coord(int var1, int var2) {
      Iterator var4 = this.sections.iterator();

      WorldMapSection var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (WorldMapSection)var4.next();
      } while(!var5.containsPosition(var1, var2));

      return var5.coord(var1, var2);
   }

   void setBounds() {
      Iterator var2 = this.sections.iterator();

      while(var2.hasNext()) {
         WorldMapSection var3 = (WorldMapSection)var2.next();
         var3.expandBounds(this);
      }

   }

   public int id() {
      return this.id0 * 1286545103;
   }

   public boolean isMain() {
      return this.isMain0;
   }

   public String archiveName() {
      return this.archiveName0;
   }

   public String name() {
      return this.name0;
   }

   int ao() {
      return -1302793257 * this.ac;
   }

   public int zoom() {
      return -1157501957 * this.zoom0;
   }

   public int minX() {
      return this.minX0 * 77939951;
   }

   public int maxX() {
      return this.maxX0 * 1854846129;
   }

   public int minY() {
      return 2059655157 * this.minY0;
   }

   public int maxY() {
      return this.maxY0 * -1086956513;
   }

   public static void ai_renamed(int var0, int var1) {
      int var3 = Rasterizer3D.ab.aj[0];
      int var4 = var3 / Rasterizer2D.Rasterizer2D_width;
      int var5 = var3 - var4 * Rasterizer2D.Rasterizer2D_width;
      Rasterizer3D.ab.an(var0, var5, var1, var4);
   }

   public int originX() {
      return -96298701 * this.origin0.x;
   }

   public int originPlane() {
      return -113644749 * this.origin0.y;
   }

   public int originY() {
      return -2105445199 * this.origin0.z;
   }

   public Coord origin() {
      return new Coord(this.origin0);
   }

   static int bu_renamed(int var0, ClientScript var1, boolean var2) {
      if (var0 == 6500) {
         Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ds.loadWorlds() ? 1 : 0;
         return 1;
      } else {
         World var22;
         if (6501 == var0) {
            var22 = FaceNormal.aq_renamed();
            if (null != var22) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var22.id * -2091224171;
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1810954985 * var22.properties;
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var22.activity;
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -665846519 * var22.location;
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var22.population * -1396846889;
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var22.host;
            } else {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
            }

            return 1;
         } else if (6502 == var0) {
            var22 = Interpreter.al_renamed();
            if (null != var22) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -2091224171 * var22.id;
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1810954985 * var22.properties;
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var22.activity;
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var22.location * -665846519;
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1396846889 * var22.population;
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var22.host;
            } else {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
               Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
            }

            return 1;
         } else {
            int var4;
            World var5;
            int var24;
            if (6506 == var0) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               var5 = null;

               for(var24 = 0; var24 < -734287707 * World.worldsCount; ++var24) {
                  if (var4 == bx.worlds[var24].id * -2091224171) {
                     var5 = bx.worlds[var24];
                     break;
                  }
               }

               if (var5 != null) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.id * -2091224171;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.properties * 1810954985;
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5.activity;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.location * -665846519;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1396846889 * var5.population;
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5.host;
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
               }

               return 1;
            } else if (6507 == var0) {
               Interpreter.Interpreter_intStackSize -= 1708543892;
               var4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
               boolean var23 = 1 == Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
               var24 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
               boolean var7 = 1 == Interpreter.Interpreter_intStack[3 + Interpreter.Interpreter_intStackSize * -964267539];
               ec.ac_renamed(var4, var23, var24, var7);
               return 1;
            } else if (var0 != 6511) {
               if (6512 == var0) {
                  Client.ov = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                  return 1;
               } else {
                  int var21;
                  ParamType var6;
                  if (var0 == 6513) {
                     Interpreter.Interpreter_intStackSize -= 854271946;
                     var4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                     var21 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                     var6 = bz.getParamType(var21);
                     if (var6.isString()) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = AbstractArchive.getNPCType(var4).getStringParam(var21, var6.defaultstr);
                     } else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = AbstractArchive.getNPCType(var4).getIntParam(var21, -171401431 * var6.defaultint);
                     }

                     return 1;
                  } else if (6514 == var0) {
                     Interpreter.Interpreter_intStackSize -= 854271946;
                     var4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                     var21 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
                     var6 = bz.getParamType(var21);
                     if (var6.isString()) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = fw.getLocType(var4).getStringParam(var21, var6.defaultstr);
                     } else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fw.getLocType(var4).getIntParam(var21, var6.defaultint * -171401431);
                     }

                     return 1;
                  } else if (6515 == var0) {
                     Interpreter.Interpreter_intStackSize -= 854271946;
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                     var21 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
                     var6 = bz.getParamType(var21);
                     if (var6.isString()) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = HeadbarUpdate.getObjType(var4).getStringParam(var21, var6.defaultstr);
                     } else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HeadbarUpdate.getObjType(var4).getIntParam(var21, -171401431 * var6.defaultint);
                     }

                     return 1;
                  } else if (6516 == var0) {
                     Interpreter.Interpreter_intStackSize -= 854271946;
                     var4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                     var21 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                     var6 = bz.getParamType(var21);
                     if (var6.isString()) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = hc.an_renamed(var4).getStringParam(var21, var6.defaultstr);
                     } else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = hc.an_renamed(var4).getIntParam(var21, -171401431 * var6.defaultint);
                     }

                     return 1;
                  } else if (6518 == var0) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.cy ? 1 : 0;
                     return 1;
                  } else if (6519 == var0) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.cg * -749752677;
                     return 1;
                  } else if (6520 == var0) {
                     return 1;
                  } else if (var0 == 6521) {
                     return 1;
                  } else if (var0 == 6522) {
                     SecureRandomCallable.Interpreter_stringStackSize -= -1086551379;
                     Interpreter.Interpreter_intStackSize -= 427135973;
                     return 1;
                  } else if (var0 == 6523) {
                     SecureRandomCallable.Interpreter_stringStackSize -= -1086551379;
                     Interpreter.Interpreter_intStackSize -= 427135973;
                     return 1;
                  } else if (var0 == 6524) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                     return 1;
                  } else if (6525 == var0) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                     return 1;
                  } else if (6526 == var0) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 838232771 * Client.cr;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               if (var4 >= 0 && var4 < -734287707 * World.worldsCount) {
                  var5 = bx.worlds[var4];
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.id * -2091224171;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.properties * 1810954985;
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5.activity;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -665846519 * var5.location;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = var5.population * -1396846889;
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = var5.host;
               } else {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
