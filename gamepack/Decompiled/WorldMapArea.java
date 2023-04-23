import java.util.Iterator;
import java.util.LinkedList;

public class WorldMapArea {
   boolean ay = false;
   int aa = 0;
   int ac = 1277906969;
   int af = 1431885777;
   int al = 0;
   int aq = 325424625;
   int at = -498392157;
   int au = 1102813389;
   String an;
   String aw;
   LinkedList ao;
   Coord ab = null;

   public static int an_renamed(Packet var0, String var1) {
      int var3 = -1633313603 * var0.at;
      byte[] var4 = ia.ac_renamed(var1);
      var0.pSmart1or2(var4.length);
      var0.at += mv.af.af(var4, 0, var4.length, var0.al, -1633313603 * var0.at) * -1516355947;
      return var0.at * -1633313603 - var3;
   }

   public void read(Packet var1, int var2) {
      this.af = var2 * -1431885777;
      this.an = var1.cw();
      this.aw = var1.cw();
      this.ab = new Coord(var1.g4s());
      this.ac = var1.g4s() * -1277906969;
      var1.g1();
      this.ay = var1.g1() == 1;
      this.au = var1.g1() * -1102813389;
      int var4 = var1.g1();
      this.ao = new LinkedList();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.ao.add(this.readWorldMapSection(var1));
      }

      this.setBounds();
   }

   WorldMapSection readWorldMapSection(Packet var1) {
      int var3 = var1.g1();
      WorldMapSectionType var4 = (WorldMapSectionType)StructType.findEnumerated(WorldMapSectionType.au_renamed(), var3);
      Object var5 = null;
      switch (var4.au * -1627349533) {
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
      Iterator var5 = this.ao.iterator();

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
      if (var4 >= this.aq * 77939951 && var4 <= this.al * 1854846129) {
         if (var5 >= 2059655157 * this.at && var5 <= -1086956513 * this.aa) {
            Iterator var6 = this.ao.iterator();

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
      Iterator var5 = this.ao.iterator();

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
      Iterator var4 = this.ao.iterator();

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
      Iterator var2 = this.ao.iterator();

      while(var2.hasNext()) {
         WorldMapSection var3 = (WorldMapSection)var2.next();
         var3.expandBounds(this);
      }

   }

   public int id() {
      return this.af * 1286545103;
   }

   public boolean isMain() {
      return this.ay;
   }

   public String name() {
      return this.an;
   }

   public String archiveName() {
      return this.aw;
   }

   int ao() {
      return -1302793257 * this.ac;
   }

   public int zoom() {
      return -1157501957 * this.au;
   }

   public int minX() {
      return this.aq * 77939951;
   }

   public int maxX() {
      return this.al * 1854846129;
   }

   public int minY() {
      return 2059655157 * this.at;
   }

   public int maxY() {
      return this.aa * -1086956513;
   }

   public static void ai_renamed(int var0, int var1) {
      int var3 = in.ab.aj[0];
      int var4 = var3 / Rasterizer2D.ae;
      int var5 = var3 - var4 * Rasterizer2D.ae;
      in.ab.an(var0, var5, var1, var4);
   }

   public int originX() {
      return -96298701 * this.ab.an;
   }

   public int originPlane() {
      return -113644749 * this.ab.af;
   }

   public int originY() {
      return -2105445199 * this.ab.aw;
   }

   public Coord origin() {
      return new Coord(this.ab);
   }

   static int bu_renamed(int var0, ClientScript var1, boolean var2) {
      if (var0 == 6500) {
         Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = ds.loadWorlds() ? 1 : 0;
         return 1;
      } else {
         World var9;
         if (6501 == var0) {
            var9 = ir.aq_renamed();
            if (null != var9) {
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var9.ay * -2091224171;
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 1810954985 * var9.ao;
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var9.ag;
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -665846519 * var9.ah;
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var9.ax * -1396846889;
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var9.ai;
            } else {
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
            }

            return 1;
         } else if (6502 == var0) {
            var9 = Interpreter.al_renamed();
            if (null != var9) {
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -2091224171 * var9.ay;
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 1810954985 * var9.ao;
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var9.ag;
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var9.ah * -665846519;
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1396846889 * var9.ax;
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var9.ai;
            } else {
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
               Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
               Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
            }

            return 1;
         } else {
            int var4;
            World var5;
            int var11;
            if (6506 == var0) {
               var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               var5 = null;

               for(var11 = 0; var11 < -734287707 * World.ab; ++var11) {
                  if (var4 == bx.au[var11].ay * -2091224171) {
                     var5 = bx.au[var11];
                     break;
                  }
               }

               if (var5 != null) {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var5.ay * -2091224171;
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var5.ao * 1810954985;
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var5.ag;
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var5.ah * -665846519;
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1396846889 * var5.ax;
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var5.ai;
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
               }

               return 1;
            } else if (6507 == var0) {
               Interpreter.at -= 1708543892;
               var4 = Interpreter.al[-964267539 * Interpreter.at];
               boolean var10 = 1 == Interpreter.al[-964267539 * Interpreter.at + 1];
               var11 = Interpreter.al[2 + Interpreter.at * -964267539];
               boolean var7 = 1 == Interpreter.al[3 + Interpreter.at * -964267539];
               ec.ac_renamed(var4, var10, var11, var7);
               return 1;
            } else if (var0 != 6511) {
               if (6512 == var0) {
                  Client.ov = Interpreter.al[(Interpreter.at -= 427135973) * -964267539] == 1;
                  return 1;
               } else {
                  ParamType var6;
                  int var8;
                  if (var0 == 6513) {
                     Interpreter.at -= 854271946;
                     var4 = Interpreter.al[-964267539 * Interpreter.at];
                     var8 = Interpreter.al[-964267539 * Interpreter.at + 1];
                     var6 = bz.getParamType(var8);
                     if (var6.isString()) {
                        Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = AbstractArchive.an_renamed(var4).ao(var8, var6.au);
                     } else {
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = AbstractArchive.an_renamed(var4).ay(var8, -171401431 * var6.ac);
                     }

                     return 1;
                  } else if (6514 == var0) {
                     Interpreter.at -= 854271946;
                     var4 = Interpreter.al[-964267539 * Interpreter.at];
                     var8 = Interpreter.al[1 + -964267539 * Interpreter.at];
                     var6 = bz.getParamType(var8);
                     if (var6.isString()) {
                        Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = fw.an_renamed(var4).ai(var8, var6.au);
                     } else {
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = fw.an_renamed(var4).ax(var8, var6.ac * -171401431);
                     }

                     return 1;
                  } else if (6515 == var0) {
                     Interpreter.at -= 854271946;
                     var4 = Interpreter.al[Interpreter.at * -964267539];
                     var8 = Interpreter.al[Interpreter.at * -964267539 + 1];
                     var6 = bz.getParamType(var8);
                     if (var6.isString()) {
                        Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = HeadbarUpdate.getObjType(var4).getStringParam(var8, var6.au);
                     } else {
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = HeadbarUpdate.getObjType(var4).getIntParam(var8, -171401431 * var6.ac);
                     }

                     return 1;
                  } else if (6516 == var0) {
                     Interpreter.at -= 854271946;
                     var4 = Interpreter.al[-964267539 * Interpreter.at];
                     var8 = Interpreter.al[1 + Interpreter.at * -964267539];
                     var6 = bz.getParamType(var8);
                     if (var6.isString()) {
                        Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = hc.an_renamed(var4).getStringParam(var8, var6.au);
                     } else {
                        Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = hc.an_renamed(var4).getIntParam(var8, -171401431 * var6.ac);
                     }

                     return 1;
                  } else if (6518 == var0) {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Client.cy ? 1 : 0;
                     return 1;
                  } else if (6519 == var0) {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = Client.cg * -749752677;
                     return 1;
                  } else if (6520 == var0) {
                     return 1;
                  } else if (var0 == 6521) {
                     return 1;
                  } else if (var0 == 6522) {
                     SecureRandomCallable.ay -= -1086551379;
                     Interpreter.at -= 427135973;
                     return 1;
                  } else if (var0 == 6523) {
                     SecureRandomCallable.ay -= -1086551379;
                     Interpreter.at -= 427135973;
                     return 1;
                  } else if (var0 == 6524) {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                     return 1;
                  } else if (6525 == var0) {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 1;
                     return 1;
                  } else if (6526 == var0) {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 838232771 * Client.cr;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = Interpreter.al[(Interpreter.at -= 427135973) * -964267539];
               if (var4 >= 0 && var4 < -734287707 * World.ab) {
                  var5 = bx.au[var4];
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var5.ay * -2091224171;
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var5.ao * 1810954985;
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var5.ag;
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -665846519 * var5.ah;
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = var5.ax * -1396846889;
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = var5.ai;
               } else {
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = -1;
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                  Interpreter.al[(Interpreter.at += 427135973) * -964267539 - 1] = 0;
                  Interpreter.aa[(SecureRandomCallable.ay += -1086551379) * -2017760987 - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
