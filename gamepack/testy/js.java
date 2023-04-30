import accessors.RSWorldMapArea;
import java.util.Iterator;
import java.util.LinkedList;

public class js implements RSWorldMapArea {
   int al = 0;
   String an;
   String aw;
   int ac = 1277906969;
   int au = 1102813389;
   LinkedList ao;
   int aq = 325424625;
   lb ab = null;
   int at = -498392157;
   int aa = 0;
   boolean ay = false;
   int af = 1431885777;
   public static final int bd = 56;

   public int[] bi(int var1, int var2, int var3) {
      Iterator var4 = this.ao.iterator();

      kw var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (kw)var4.next();
      } while(!var5.an(var1, var2, var3, (byte)-61));

      return var5.ac(var1, var2, var3, (byte)67);
   }

   public int av(int var1) {
      try {
         return this.aa * -1086956513;
      } catch (RuntimeException var2) {
         throw db.an(var2, "js.av(" + ')');
      }
   }

   kw an(sg var1, int var2) {
      try {
         int var3 = var1.cm((byte)7);
         jb var4 = (jb)ht.af(jb.au(-1754346109), var3, (short)173);
         Object var5 = null;
         switch (var4.au * -1627349533) {
            case 0:
               var5 = new ka();
               break;
            case 1:
               var5 = new jw();
               break;
            case 2:
               var5 = new jy();
               break;
            case 3:
               var5 = new ja();
               break;
            default:
               throw new IllegalStateException("");
         }

         ((kw)var5).ab(var1, (byte)0);
         return (kw)var5;
      } catch (RuntimeException var6) {
         throw db.an(var6, "js.an(" + ')');
      }
   }

   public void af(sg var1, int var2, byte var3) {
      try {
         this.af = var2 * -1431885777;
         this.an = var1.cw((byte)0);
         this.aw = var1.cw((byte)0);
         this.ab = new lb(var1.cx(-1171776262));
         this.ac = var1.cx(-1922477430) * -1277906969;
         var1.cm((byte)7);
         boolean var10001;
         if (var1.cm((byte)7) == 1) {
            if (var3 >= 34) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.ay = var10001;
         this.au = var1.cm((byte)7) * -1102813389;
         int var4 = var1.cm((byte)7);
         this.ao = new LinkedList();

         for(int var5 = 0; var5 < var4; ++var5) {
            if (var3 >= 34) {
               throw new IllegalStateException();
            }

            this.ao.add(this.an(var1, 427135973));
         }

         this.aq(1510562162);
      } catch (RuntimeException var6) {
         throw db.an(var6, "js.af(" + ')');
      }
   }

   public boolean ac(int var1, int var2, int var3) {
      try {
         int var4 = var1 / 64;
         int var5 = var2 / 64;
         if (var4 >= this.aq * 77939951) {
            if (var4 <= this.al * 1854846129) {
               if (var5 >= 2059655157 * this.at) {
                  if (var3 <= 1528990176) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= -1086956513 * this.aa) {
                     Iterator var6 = this.ao.iterator();

                     kw var7;
                     do {
                        if (!var6.hasNext()) {
                           return false;
                        }

                        if (var3 <= 1528990176) {
                           throw new IllegalStateException();
                        }

                        var7 = (kw)var6.next();
                     } while(!var7.aw(var1, var2, -1749100775));

                     return true;
                  }

                  if (var3 <= 1528990176) {
                     throw new IllegalStateException();
                  }
               }

               return false;
            }

            if (var3 <= 1528990176) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var8) {
         throw db.an(var8, "js.ac(" + ')');
      }
   }

   public String bg() {
      return this.aw;
   }

   public lb ab(int var1, int var2, int var3) {
      try {
         Iterator var4 = this.ao.iterator();

         kw var5;
         do {
            if (!var4.hasNext()) {
               return null;
            }

            if (var3 <= 1138438549) {
               throw new IllegalStateException();
            }

            var5 = (kw)var4.next();
         } while(!var5.aw(var1, var2, -1795894381));

         if (var3 <= 1138438549) {
            throw new IllegalStateException();
         } else {
            return var5.au(var1, var2, (byte)-4);
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "js.ab(" + ')');
      }
   }

   void aq(int var1) {
      try {
         Iterator var2 = this.ao.iterator();

         while(var2.hasNext()) {
            if (var1 <= -1040917986) {
               return;
            }

            kw var3 = (kw)var2.next();
            var3.af(this, 1131699138);
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "js.aq(" + ')');
      }
   }

   public int cs() {
      return 2096256750 * this.ab.af;
   }

   public boolean at(int var1) {
      try {
         return this.ay;
      } catch (RuntimeException var2) {
         throw db.an(var2, "js.at(" + ')');
      }
   }

   public int ax(int var1) {
      try {
         return -1157501957 * this.au;
      } catch (RuntimeException var2) {
         throw db.an(var2, "js.ax(" + ')');
      }
   }

   public String ay(short var1) {
      try {
         return this.aw;
      } catch (RuntimeException var2) {
         throw db.an(var2, "js.ay(" + ')');
      }
   }

   public int bl() {
      return this.al * 1854846129;
   }

   public int ar(byte var1) {
      try {
         return -96298701 * this.ab.an;
      } catch (RuntimeException var2) {
         throw db.an(var2, "js.ar(" + ')');
      }
   }

   public int ai(int var1) {
      try {
         return this.aq * 77939951;
      } catch (RuntimeException var2) {
         throw db.an(var2, "js.ai(" + ')');
      }
   }

   public int ag(int var1) {
      try {
         return this.al * 1854846129;
      } catch (RuntimeException var2) {
         throw db.an(var2, "js.ag(" + ')');
      }
   }

   public int am(int var1) {
      try {
         return -113644749 * this.ab.af;
      } catch (RuntimeException var2) {
         throw db.an(var2, "js.am(" + ')');
      }
   }

   public boolean ae(int var1, int var2, int var3) {
      Iterator var4 = this.ao.iterator();

      kw var5;
      do {
         if (!var4.hasNext()) {
            return false;
         }

         var5 = (kw)var4.next();
      } while(!var5.an(var1, var2, var3, (byte)-43));

      return true;
   }

   void bd() {
      Iterator var1 = this.ao.iterator();

      while(var1.hasNext()) {
         kw var2 = (kw)var1.next();
         var2.af(this, 1388017855);
      }

   }

   public int as(int var1) {
      try {
         return -2105445199 * this.ab.aw;
      } catch (RuntimeException var2) {
         throw db.an(var2, "js.as(" + ')');
      }
   }

   public lb aj(byte var1) {
      try {
         return new lb(this.ab);
      } catch (RuntimeException var2) {
         throw db.an(var2, "js.aj(" + ')');
      }
   }

   public void ak(sg var1, int var2) {
      this.af = var2 * -1431885777;
      this.an = var1.cw((byte)0);
      this.aw = var1.cw((byte)0);
      this.ab = new lb(var1.cx(-1457787402));
      this.ac = var1.cx(-1438039092) * -1277906969;
      var1.cm((byte)7);
      this.ay = var1.cm((byte)7) == 1;
      this.au = var1.cm((byte)7) * -1102813389;
      int var3 = var1.cm((byte)7);
      this.ao = new LinkedList();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.ao.add(this.an(var1, 427135973));
      }

      this.aq(1031445825);
   }

   public int[] be(int var1, int var2, int var3) {
      Iterator var4 = this.ao.iterator();

      kw var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (kw)var4.next();
      } while(!var5.an(var1, var2, var3, (byte)-79));

      return var5.ac(var1, var2, var3, (byte)8);
   }

   public boolean ad(int var1, int var2, int var3) {
      Iterator var4 = this.ao.iterator();

      kw var5;
      do {
         if (!var4.hasNext()) {
            return false;
         }

         var5 = (kw)var4.next();
      } while(!var5.an(var1, var2, var3, (byte)-107));

      return true;
   }

   public int cu() {
      return -2105445199 * this.ab.aw;
   }

   public boolean ap(int var1, int var2) {
      int var3 = var1 / -1409094024;
      int var4 = var2 / 810003258;
      if (var3 >= this.aq * 77939951 && var3 <= this.al * 1854846129) {
         if (var4 >= 2059655157 * this.at && var4 <= -1086956513 * this.aa) {
            Iterator var5 = this.ao.iterator();

            kw var6;
            do {
               if (!var5.hasNext()) {
                  return false;
               }

               var6 = (kw)var5.next();
            } while(!var6.aw(var1, var2, -1618535392));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean by(int var1, int var2) {
      int var3 = var1 / 64;
      int var4 = var2 / 64;
      if (var3 >= this.aq * -2086288917 && var3 <= this.al * 688000845) {
         if (var4 >= -1731686749 * this.at && var4 <= 869548299 * this.aa) {
            Iterator var5 = this.ao.iterator();

            kw var6;
            do {
               if (!var5.hasNext()) {
                  return false;
               }

               var6 = (kw)var5.next();
            } while(!var6.aw(var1, var2, -1975299563));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean bb(int var1, int var2) {
      int var3 = var1 / 64;
      int var4 = var2 / 64;
      if (var3 >= this.aq * 77939951 && var3 <= this.al * 1854846129) {
         if (var4 >= 2059655157 * this.at && var4 <= -1086956513 * this.aa) {
            Iterator var5 = this.ao.iterator();

            kw var6;
            do {
               if (!var5.hasNext()) {
                  return false;
               }

               var6 = (kw)var5.next();
            } while(!var6.aw(var1, var2, -1801197276));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int ck() {
      return -1499270812 * this.ab.aw;
   }

   public int bp() {
      return this.al * 1854846129;
   }

   int ao(int var1) {
      try {
         return -1302793257 * this.ac;
      } catch (RuntimeException var2) {
         throw db.an(var2, "js.ao(" + ')');
      }
   }

   public lb bx(int var1, int var2) {
      Iterator var3 = this.ao.iterator();

      kw var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (kw)var3.next();
      } while(!var4.aw(var1, var2, -1865324662));

      return var4.au(var1, var2, (byte)2);
   }

   public lb bo(int var1, int var2) {
      Iterator var3 = this.ao.iterator();

      kw var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (kw)var3.next();
      } while(!var4.aw(var1, var2, -2036119834));

      return var4.au(var1, var2, (byte)3);
   }

   public lb bz(int var1, int var2) {
      Iterator var3 = this.ao.iterator();

      kw var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (kw)var3.next();
      } while(!var4.aw(var1, var2, -1876668550));

      return var4.au(var1, var2, (byte)-51);
   }

   void bm() {
      Iterator var1 = this.ao.iterator();

      while(var1.hasNext()) {
         kw var2 = (kw)var1.next();
         var2.af(this, 1484327916);
      }

   }

   public lb bk(int var1, int var2) {
      Iterator var3 = this.ao.iterator();

      kw var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (kw)var3.next();
      } while(!var4.aw(var1, var2, -2136012999));

      return var4.au(var1, var2, (byte)-79);
   }

   void bt() {
      Iterator var1 = this.ao.iterator();

      while(var1.hasNext()) {
         kw var2 = (kw)var1.next();
         var2.af(this, 1624384171);
      }

   }

   public int bj() {
      return this.af * 1286545103;
   }

   int bq() {
      return -1302793257 * this.ac;
   }

   public String bs() {
      return this.an;
   }

   public String br() {
      return this.aw;
   }

   public String bn() {
      return this.an;
   }

   int bu() {
      return -34939641 * this.ac;
   }

   int bf() {
      return -1302793257 * this.ac;
   }

   kw az(sg var1) {
      int var2 = var1.cm((byte)7);
      jb var3 = (jb)ht.af(jb.au(-1754346109), var2, (short)173);
      Object var4 = null;
      switch (var3.au * -122960136) {
         case 0:
            var4 = new ka();
            break;
         case 1:
            var4 = new jw();
            break;
         case 2:
            var4 = new jy();
            break;
         case 3:
            var4 = new ja();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((kw)var4).ab(var1, (byte)0);
      return (kw)var4;
   }

   public int ba() {
      return -1157501957 * this.au;
   }

   public int bv() {
      return this.aq * 77939951;
   }

   public int cc() {
      return -113644749 * this.ab.af;
   }

   public int al(int var1) {
      try {
         return this.af * 1286545103;
      } catch (RuntimeException var2) {
         throw db.an(var2, "js.al(" + ')');
      }
   }

   public int bc() {
      return 2059655157 * this.at;
   }

   public int bh() {
      return this.aa * -1024757870;
   }

   public int bw() {
      return this.aa * 1845792372;
   }

   public String aa(int var1) {
      try {
         return this.an;
      } catch (RuntimeException var2) {
         throw db.an(var2, "js.aa(" + ')');
      }
   }

   public int ci() {
      return 1317426047 * this.ab.af;
   }

   public int[] au(int var1, int var2, int var3, byte var4) {
      try {
         Iterator var5 = this.ao.iterator();

         kw var6;
         do {
            if (!var5.hasNext()) {
               return null;
            }

            if (var4 != 6) {
               throw new IllegalStateException();
            }

            var6 = (kw)var5.next();
         } while(!var6.an(var1, var2, var3, (byte)3));

         if (var4 != 6) {
            throw new IllegalStateException();
         } else {
            return var6.ac(var1, var2, var3, (byte)21);
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "js.au(" + ')');
      }
   }

   public int ah(int var1) {
      try {
         return 2059655157 * this.at;
      } catch (RuntimeException var2) {
         throw db.an(var2, "js.ah(" + ')');
      }
   }

   public int cn() {
      return -884180522 * this.ab.aw;
   }

   public int ca() {
      return 71630679 * this.ab.aw;
   }

   public int ce() {
      return -113644749 * this.ab.af;
   }

   public boolean aw(int var1, int var2, int var3, int var4) {
      try {
         Iterator var5 = this.ao.iterator();

         kw var6;
         do {
            if (!var5.hasNext()) {
               return false;
            }

            if (var4 >= 330654524) {
               throw new IllegalStateException();
            }

            var6 = (kw)var5.next();
         } while(!var6.an(var1, var2, var3, (byte)0));

         if (var4 >= 330654524) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "js.aw(" + ')');
      }
   }

   public lb cq() {
      return new lb(this.ab);
   }

   public lb cm() {
      return new lb(this.ab);
   }

   public lb cf() {
      return new lb(this.ab);
   }

   static int bu(int var0, ch var1, boolean var2, int var3) {
      try {
         int[] var10000;
         int var10001;
         byte var10002;
         if (var0 == 6500) {
            if (var3 == -1070349132) {
               throw new IllegalStateException();
            } else {
               var10000 = cy.al;
               var10001 = (cy.at += 427135973) * -964267539 - 1;
               if (ds.af(-2097984355)) {
                  if (var3 == -1070349132) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else {
            cl var9;
            if (6501 == var0) {
               if (var3 == -1070349132) {
                  throw new IllegalStateException();
               } else {
                  var9 = ir.aq(-285053165);
                  if (null != var9) {
                     if (var3 == -1070349132) {
                        throw new IllegalStateException();
                     }

                     cy.al[(cy.at += 427135973) * -964267539 - 1] = var9.ay * -2091224171;
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = 1810954985 * var9.ao;
                     cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var9.ag;
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = -665846519 * var9.ah;
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = var9.ax * -1396846889;
                     cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var9.ai;
                  } else {
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = -1;
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                     cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                     cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                  }

                  return 1;
               }
            } else if (6502 == var0) {
               if (var3 == -1070349132) {
                  throw new IllegalStateException();
               } else {
                  var9 = cy.al(1711407599);
                  if (null != var9) {
                     if (var3 == -1070349132) {
                        throw new IllegalStateException();
                     }

                     cy.al[(cy.at += 427135973) * -964267539 - 1] = -2091224171 * var9.ay;
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = 1810954985 * var9.ao;
                     cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var9.ag;
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = var9.ah * -665846519;
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = -1396846889 * var9.ax;
                     cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var9.ai;
                  } else {
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = -1;
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                     cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                     cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                  }

                  return 1;
               }
            } else {
               int var4;
               cl var10;
               int var12;
               if (6506 == var0) {
                  if (var3 == -1070349132) {
                     throw new IllegalStateException();
                  } else {
                     var4 = cy.al[(cy.at -= 427135973) * -964267539];
                     var10 = null;

                     for(var12 = 0; var12 < -734287707 * cl.ab; ++var12) {
                        if (var3 == -1070349132) {
                           throw new IllegalStateException();
                        }

                        if (var4 == bx.au[var12].ay * -2091224171) {
                           if (var3 == -1070349132) {
                              throw new IllegalStateException();
                           }

                           var10 = bx.au[var12];
                           break;
                        }
                     }

                     if (var10 != null) {
                        if (var3 == -1070349132) {
                           throw new IllegalStateException();
                        }

                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var10.ay * -2091224171;
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var10.ao * 1810954985;
                        cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var10.ag;
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = var10.ah * -665846519;
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = -1396846889 * var10.ax;
                        cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var10.ai;
                     } else {
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = -1;
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                        cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                        cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                     }

                     return 1;
                  }
               } else if (6507 == var0) {
                  if (var3 == -1070349132) {
                     throw new IllegalStateException();
                  } else {
                     cy.at -= 1708543892;
                     var4 = cy.al[-964267539 * cy.at];
                     boolean var13;
                     if (1 == cy.al[-964267539 * cy.at + 1]) {
                        if (var3 == -1070349132) {
                           throw new IllegalStateException();
                        }

                        var13 = true;
                     } else {
                        var13 = false;
                     }

                     boolean var11 = var13;
                     var12 = cy.al[2 + cy.at * -964267539];
                     if (1 == cy.al[3 + cy.at * -964267539]) {
                        if (var3 == -1070349132) {
                           throw new IllegalStateException();
                        }

                        var13 = true;
                     } else {
                        var13 = false;
                     }

                     boolean var7 = var13;
                     ec.ac(var4, var11, var12, var7, (byte)-41);
                     return 1;
                  }
               } else if (var0 == 6511) {
                  if (var3 == -1070349132) {
                     throw new IllegalStateException();
                  } else {
                     var4 = cy.al[(cy.at -= 427135973) * -964267539];
                     if (var4 >= 0) {
                        if (var3 == -1070349132) {
                           throw new IllegalStateException();
                        }

                        if (var4 < -734287707 * cl.ab) {
                           if (var3 == -1070349132) {
                              throw new IllegalStateException();
                           }

                           var10 = bx.au[var4];
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = var10.ay * -2091224171;
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = var10.ao * 1810954985;
                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var10.ag;
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = -665846519 * var10.ah;
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = var10.ax * -1396846889;
                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = var10.ai;
                           return 1;
                        }
                     }

                     cy.al[(cy.at += 427135973) * -964267539 - 1] = -1;
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                     cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                     cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = "";
                     return 1;
                  }
               } else if (6512 == var0) {
                  if (var3 == -1070349132) {
                     throw new IllegalStateException();
                  } else {
                     client.ov = cy.al[(cy.at -= 427135973) * -964267539] == 1;
                     return 1;
                  }
               } else {
                  int var5;
                  ho var6;
                  if (var0 == 6513) {
                     if (var3 == -1070349132) {
                        throw new IllegalStateException();
                     } else {
                        cy.at -= 854271946;
                        var4 = cy.al[-964267539 * cy.at];
                        var5 = cy.al[-964267539 * cy.at + 1];
                        var6 = bz.an(var5, -2136989447);
                        if (var6.ab(-1346057295)) {
                           if (var3 == -1070349132) {
                              throw new IllegalStateException();
                           }

                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = nm.an(var4, (byte)-72).ao(var5, var6.au, 1361992151);
                        } else {
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = nm.an(var4, (byte)5).ay(var5, -171401431 * var6.ac, 1858319582);
                        }

                        return 1;
                     }
                  } else if (6514 == var0) {
                     cy.at -= 854271946;
                     var4 = cy.al[-964267539 * cy.at];
                     var5 = cy.al[1 + -964267539 * cy.at];
                     var6 = bz.an(var5, 882045221);
                     if (var6.ab(-29176075)) {
                        cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = fw.an(var4, (short)10855).ai(var5, var6.au, 1804170179);
                     } else {
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = fw.an(var4, (short)7278).ax(var5, var6.ac * -171401431, -1848862363);
                     }

                     return 1;
                  } else if (6515 == var0) {
                     if (var3 == -1070349132) {
                        throw new IllegalStateException();
                     } else {
                        cy.at -= 854271946;
                        var4 = cy.al[cy.at * -964267539];
                        var5 = cy.al[cy.at * -964267539 + 1];
                        var6 = bz.an(var5, -824505620);
                        if (var6.ab(-1879450059)) {
                           if (var3 == -1070349132) {
                              throw new IllegalStateException();
                           }

                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = dh.af(var4, (byte)107).ar(var5, var6.au, (byte)0);
                        } else {
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = dh.af(var4, (byte)116).av(var5, -171401431 * var6.ac, (byte)119);
                        }

                        return 1;
                     }
                  } else if (6516 == var0) {
                     if (var3 == -1070349132) {
                        throw new IllegalStateException();
                     } else {
                        cy.at -= 854271946;
                        var4 = cy.al[-964267539 * cy.at];
                        var5 = cy.al[1 + cy.at * -964267539];
                        var6 = bz.an(var5, 25604063);
                        if (var6.ab(609786096)) {
                           if (var3 == -1070349132) {
                              throw new IllegalStateException();
                           }

                           cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = hc.an(var4, -680528429).aq(var5, var6.au, 1937714582);
                        } else {
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = hc.an(var4, -1923524011).ab(var5, -171401431 * var6.ac, (byte)-33);
                        }

                        return 1;
                     }
                  } else if (6518 == var0) {
                     if (var3 == -1070349132) {
                        throw new IllegalStateException();
                     } else {
                        var10000 = cy.al;
                        var10001 = (cy.at += 427135973) * -964267539 - 1;
                        if (client.cy) {
                           if (var3 == -1070349132) {
                              throw new IllegalStateException();
                           }

                           var10002 = 1;
                        } else {
                           var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     }
                  } else if (6519 == var0) {
                     if (var3 == -1070349132) {
                        throw new IllegalStateException();
                     } else {
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = client.cg * -749752677;
                        return 1;
                     }
                  } else if (6520 == var0) {
                     if (var3 == -1070349132) {
                        throw new IllegalStateException();
                     } else {
                        return 1;
                     }
                  } else if (var0 == 6521) {
                     if (var3 == -1070349132) {
                        throw new IllegalStateException();
                     } else {
                        return 1;
                     }
                  } else if (var0 == 6522) {
                     if (var3 == -1070349132) {
                        throw new IllegalStateException();
                     } else {
                        dm.ay -= -1086551379;
                        cy.at -= 427135973;
                        return 1;
                     }
                  } else if (var0 == 6523) {
                     if (var3 == -1070349132) {
                        throw new IllegalStateException();
                     } else {
                        dm.ay -= -1086551379;
                        cy.at -= 427135973;
                        return 1;
                     }
                  } else if (var0 == 6524) {
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = -1;
                     return 1;
                  } else if (6525 == var0) {
                     if (var3 == -1070349132) {
                        throw new IllegalStateException();
                     } else {
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = 1;
                        return 1;
                     }
                  } else if (6526 == var0) {
                     if (var3 == -1070349132) {
                        throw new IllegalStateException();
                     } else {
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = 1;
                        return 1;
                     }
                  } else if (var0 == 6527) {
                     if (var3 == -1070349132) {
                        throw new IllegalStateException();
                     } else {
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = 838232771 * client.cr;
                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "js.bu(" + ')');
      }
   }

   public static int an(sg var0, String var1, int var2) {
      try {
         int var3 = -1633313603 * var0.at;
         byte[] var4 = ia.ac(var1, 267322236);
         var0.ck(var4.length, (byte)-101);
         var0.at += mv.af.af(var4, 0, var4.length, var0.al, -1633313603 * var0.at, -452451300) * -1516355947;
         return var0.at * -1633313603 - var3;
      } catch (RuntimeException var5) {
         throw db.an(var5, "js.an(" + ')');
      }
   }

   public static void ai(int var0, int var1, byte var2) {
      try {
         int var3 = in.ab.aj[0];
         int var4 = var3 / th.ae;
         int var5 = var3 - var4 * th.ae;
         in.ab.an(var0, var5, var1, var4, (byte)93);
      } catch (RuntimeException var6) {
         throw db.an(var6, "js.ai(" + ')');
      }
   }
}
