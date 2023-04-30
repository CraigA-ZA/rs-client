import accessors.RSArchive;
import java.util.zip.CRC32;

public class nd extends nm implements RSArchive {
   static int[] jn;
   static final int aw = 0;
   static final int ac = 1;
   int ai;
   qk ab;
   int al;
   volatile int at;
   boolean aa;
   volatile boolean[] ay;
   int ag;
   int ax;
   static final int af = 200;
   qk aq;
   boolean ah;
   static CRC32 ao = new CRC32();
   static int up;
   static final int an = 12;

   public boolean bg(int var1) {
      return this.ay[var1];
   }

   public boolean af(byte var1) {
      try {
         boolean var10000;
         if (1 == 2103956439 * this.at) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "nd.af(" + ')');
      }
   }

   public int an(byte var1) {
      try {
         if (this.at * 2103956439 != 1) {
            if (var1 != 0) {
               throw new IllegalStateException();
            } else {
               if (this.ah) {
                  if (var1 != 0) {
                     throw new IllegalStateException();
                  }

                  if (2103956439 * this.at == 2) {
                     if (var1 != 0) {
                        throw new IllegalStateException();
                     }

                     return 100;
                  }
               }

               if (this.bb != null) {
                  return 99;
               } else {
                  int var2 = aj.ac(255, this.al * -1596339445, -964267539);
                  if (var2 >= 100) {
                     if (var1 != 0) {
                        throw new IllegalStateException();
                     }

                     var2 = 99;
                  }

                  return var2;
               }
            }
         } else {
            return 100;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "nd.an(" + ')');
      }
   }

   int bt(int var1) {
      if (this.bb[var1] != null) {
         return 100;
      } else {
         return this.ay[var1] ? 100 : aj.ac(-1596339445 * this.al, var1, -964267539);
      }
   }

   void ac(int var1, int var2) {
      try {
         if (null != this.ab) {
            if (var2 >= -1570396352) {
               throw new IllegalStateException();
            }

            if (null != this.ay && this.ay[var1]) {
               if (var2 >= -1570396352) {
                  return;
               }

               qk var3 = this.ab;
               byte[] var5 = null;
               synchronized(ns.af) {
                  for(nw var7 = (nw)ns.af.aq(); null != var7; var7 = (nw)ns.af.at()) {
                     if (var2 >= -1570396352) {
                        throw new IllegalStateException();
                     }

                     if (var7.hr == (long)var1 && var7.aw == var3) {
                        if (var2 >= -1570396352) {
                           throw new IllegalStateException();
                        }

                        if (0 == -1329235479 * var7.af) {
                           if (var2 >= -1570396352) {
                              return;
                           }

                           var5 = var7.an;
                           break;
                        }
                     }
                  }
               }

               if (null != var5) {
                  if (var2 >= -1570396352) {
                     throw new IllegalStateException();
                  }

                  this.al(var3, var1, var5, true, (byte)48);
               } else {
                  byte[] var6 = var3.af(var1, -1372927585);
                  this.al(var3, var1, var6, true, (byte)2);
               }

               return;
            }
         }

         cq.aw(this, -1596339445 * this.al, var1, this.ak[var1], (byte)2, true, (byte)72);
      } catch (RuntimeException var10) {
         throw db.an(var10, "nd.ac(" + ')');
      }
   }

   void ad(int var1) {
      if (null != this.ab && null != this.ay && this.ay[var1]) {
         qk var2 = this.ab;
         byte[] var4 = null;
         synchronized(ns.af) {
            for(nw var6 = (nw)ns.af.aq(); null != var6; var6 = (nw)ns.af.at()) {
               if (var6.hr == (long)var1 && var6.aw == var2 && 0 == -1329235479 * var6.af) {
                  var4 = var6.an;
                  break;
               }
            }
         }

         if (null != var4) {
            this.al(var2, var1, var4, true, (byte)32);
         } else {
            byte[] var5 = var2.af(var1, -215273157);
            this.al(var2, var1, var5, true, (byte)47);
         }
      } else {
         cq.aw(this, -1596339445 * this.al, var1, this.ak[var1], (byte)2, true, (byte)63);
      }

   }

   void ab(int var1, int var2, int var3) {
      try {
         this.ax = var1 * 215951563;
         this.ai = 1459300717 * var2;
         if (this.aq != null) {
            if (var3 != -691028) {
               throw new IllegalStateException();
            }

            int var4 = this.al * -1596339445;
            qk var5 = this.aq;
            byte[] var7 = null;
            synchronized(ns.af) {
               for(nw var9 = (nw)ns.af.aq(); var9 != null; var9 = (nw)ns.af.at()) {
                  if (var3 != -691028) {
                     throw new IllegalStateException();
                  }

                  if (var9.hr == (long)var4) {
                     if (var3 != -691028) {
                        throw new IllegalStateException();
                     }

                     if (var9.aw == var5) {
                        if (var3 != -691028) {
                           throw new IllegalStateException();
                        }

                        if (0 == -1329235479 * var9.af) {
                           if (var3 != -691028) {
                              throw new IllegalStateException();
                           }

                           var7 = var9.an;
                           break;
                        }
                     }
                  }
               }
            }

            if (null != var7) {
               if (var3 != -691028) {
                  throw new IllegalStateException();
               }

               this.al(var5, var4, var7, true, (byte)86);
            } else {
               byte[] var8 = var5.af(var4, -1272810465);
               this.al(var5, var4, var8, true, (byte)83);
            }
         } else {
            cq.aw(this, 255, -1596339445 * this.al, this.ax * -1710883613, (byte)0, true, (byte)74);
         }

      } catch (RuntimeException var12) {
         throw db.an(var12, "nd.ab(" + ')');
      }
   }

   void aq(int var1, byte[] var2, boolean var3, boolean var4, int var5) {
      try {
         if (var3) {
            if (this.at * 2103956439 == 1) {
               if (var5 <= -417788481) {
                  return;
               }

               throw new RuntimeException();
            }

            if (this.aq != null) {
               if (var5 <= -417788481) {
                  return;
               }

               cb.af(this.al * -1596339445, var2, this.aq, (byte)88);
            }

            this.bc(var2, (byte)104);
            this.at(191683705);
         } else {
            var2[var2.length - 2] = (byte)(this.az[var1] >> 8);
            var2[var2.length - 1] = (byte)this.az[var1];
            if (this.ab != null) {
               if (var5 <= -417788481) {
                  throw new IllegalStateException();
               }

               cb.af(var1, var2, this.ab, (byte)73);
               this.ay[var1] = true;
            }

            if (var4) {
               if (var5 <= -417788481) {
                  throw new IllegalStateException();
               }

               this.bb[var1] = ef.af(var2, false, 1713471491);
            }
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "nd.aq(" + ')');
      }
   }

   public void al(qk var1, int var2, byte[] var3, boolean var4, byte var5) {
      try {
         label164: {
            label151: {
               int var6;
               if (this.aq == var1) {
                  if (var5 <= 0) {
                     return;
                  }

                  if (this.at * 2103956439 == 1) {
                     if (var5 <= 0) {
                        throw new IllegalStateException();
                     }

                     throw new RuntimeException();
                  }

                  if (null == var3) {
                     cq.aw(this, 255, -1596339445 * this.al, -1710883613 * this.ax, (byte)0, true, (byte)26);
                     return;
                  }

                  ao.reset();
                  ao.update(var3, 0, var3.length);
                  var6 = (int)ao.getValue();
                  if (var6 != -1710883613 * this.ax) {
                     if (var5 <= 0) {
                        throw new IllegalStateException();
                     }

                     cq.aw(this, 255, this.al * -1596339445, -1710883613 * this.ax, (byte)0, true, (byte)122);
                     return;
                  }

                  sg var7 = new sg(ai.ch(var3, -1117233973));
                  int var8 = var7.cm((byte)7);
                  if (var8 != 5) {
                     if (var5 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (6 != var8) {
                        if (var5 <= 0) {
                           throw new IllegalStateException();
                        }

                        throw new RuntimeException(var8 + "," + -1596339445 * this.al + "," + var2);
                     }
                  }

                  int var9 = 0;
                  if (var8 >= 6) {
                     if (var5 <= 0) {
                        return;
                     }

                     var9 = var7.cx(-1548512076);
                  }

                  if (var9 != 17451109 * this.ai) {
                     if (var5 <= 0) {
                        throw new IllegalStateException();
                     }

                     cq.aw(this, 255, this.al * -1596339445, -1710883613 * this.ax, (byte)0, true, (byte)10);
                     return;
                  }

                  this.bc(var3, (byte)104);
                  this.at(302914766);
               } else {
                  if (!var4) {
                     if (var5 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (-2028669797 * this.ag == var2) {
                        if (var5 <= 0) {
                           return;
                        }

                        this.at = -461123609;
                     }
                  }

                  if (var3 == null) {
                     break label151;
                  }

                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var3.length <= 2) {
                     if (var5 <= 0) {
                        throw new IllegalStateException();
                     }
                     break label151;
                  }

                  ao.reset();
                  ao.update(var3, 0, var3.length - 2);
                  var6 = (int)ao.getValue();
                  int var11 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
                  if (this.ak[var2] != var6) {
                     break label164;
                  }

                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var11 != this.az[var2]) {
                     if (var5 <= 0) {
                        throw new IllegalStateException();
                     }
                     break label164;
                  }

                  this.ay[var2] = true;
                  if (var4) {
                     if (var5 <= 0) {
                        throw new IllegalStateException();
                     }

                     this.bb[var2] = ef.af(var3, false, 2127722280);
                  }
               }

               return;
            }

            this.ay[var2] = false;
            if (!this.aa) {
               if (!var4) {
                  return;
               }

               if (var5 <= 0) {
                  throw new IllegalStateException();
               }
            }

            cq.aw(this, -1596339445 * this.al, var2, this.ak[var2], (byte)2, var4, (byte)12);
            return;
         }

         this.ay[var2] = false;
         if (!this.aa) {
            if (!var4) {
               return;
            }

            if (var5 <= 0) {
               throw new IllegalStateException();
            }
         }

         cq.aw(this, -1596339445 * this.al, var2, this.ak[var2], (byte)2, var4, (byte)48);
      } catch (RuntimeException var10) {
         throw db.an(var10, "nd.al(" + ')');
      }
   }

   public boolean bu(int var1) {
      return this.ay[var1];
   }

   int aa(int var1, int var2) {
      try {
         if (this.bb[var1] != null) {
            if (var2 >= -1633313603) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else if (this.ay[var1]) {
            if (var2 >= -1633313603) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            return aj.ac(-1596339445 * this.al, var1, -964267539);
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "nd.aa(" + ')');
      }
   }

   void at(int var1) {
      try {
         this.ay = new boolean[this.bb.length];

         int var2;
         for(var2 = 0; var2 < this.ay.length; ++var2) {
            this.ay[var2] = false;
         }

         if (null == this.ab) {
            if (var1 <= -1888543176) {
               throw new IllegalStateException();
            } else {
               this.at = -461123609;
            }
         } else {
            this.ag = -631230867;

            for(var2 = 0; var2 < this.ay.length; ++var2) {
               if (var1 <= -1888543176) {
                  throw new IllegalStateException();
               }

               if (this.ad[var2] > 0) {
                  if (var1 <= -1888543176) {
                     throw new IllegalStateException();
                  }

                  jg.an(var2, this.ab, this, -35309556);
                  this.ag = 631230867 * var2;
               }
            }

            if (this.ag * -2028669797 == -1) {
               if (var1 <= -1888543176) {
                  throw new IllegalStateException();
               }

               this.at = -461123609;
            }

         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "nd.at(" + ')');
      }
   }

   public boolean ao(int var1, int var2) {
      try {
         return this.ck(var1, 1675784388) != null;
      } catch (RuntimeException var3) {
         throw db.an(var3, "nd.ao(" + ')');
      }
   }

   void az(int var1) {
      if (null != this.ab && null != this.ay && this.ay[var1]) {
         qk var2 = this.ab;
         byte[] var4 = null;
         synchronized(ns.af) {
            for(nw var6 = (nw)ns.af.aq(); null != var6; var6 = (nw)ns.af.at()) {
               if (var6.hr == (long)var1 && var6.aw == var2 && 0 == -1329235479 * var6.af) {
                  var4 = var6.an;
                  break;
               }
            }
         }

         if (null != var4) {
            this.al(var2, var1, var4, true, (byte)14);
         } else {
            byte[] var5 = var2.af(var1, -1408464133);
            this.al(var2, var1, var5, true, (byte)127);
         }
      } else {
         cq.aw(this, -1596339445 * this.al, var1, this.ak[var1], (byte)2, true, (byte)86);
      }

   }

   public boolean ai() {
      return 1 == -107391883 * this.at;
   }

   public boolean ag() {
      return 1 == 2103956439 * this.at;
   }

   public boolean ay(int var1, int var2) {
      try {
         return this.ay[var1];
      } catch (RuntimeException var3) {
         throw db.an(var3, "nd.ay(" + ')');
      }
   }

   public boolean av() {
      return 1 == 2103956439 * this.at;
   }

   public int ar() {
      if (this.at * 2103956439 == 1 || this.ah && 2103956439 * this.at == 2) {
         return 100;
      } else if (this.bb != null) {
         return 99;
      } else {
         int var1 = aj.ac(255, this.al * -1596339445, -964267539);
         if (var1 >= 100) {
            var1 = 99;
         }

         return var1;
      }
   }

   public int am() {
      if (this.at * 2103956439 == 1 || this.ah && 2103956439 * this.at == 2) {
         return -317295525;
      } else if (this.bb != null) {
         return 86875028;
      } else {
         int var1 = aj.ac(1947709224, this.al * -2060509396, -964267539);
         if (var1 >= -1269756528) {
            var1 = 170729263;
         }

         return var1;
      }
   }

   public boolean ba(int var1) {
      return this.ck(var1, 424070347) != null;
   }

   void aj(int var1) {
      int var2 = -1596339445 * this.al;
      long var3 = (long)(var1 + (var2 << 16));
      no var5 = (no)nl.at.af(var3);
      if (null != var5) {
         nl.al.an(var5);
      }

   }

   void ak(int var1) {
      if (null != this.ab && null != this.ay && this.ay[var1]) {
         qk var2 = this.ab;
         byte[] var4 = null;
         synchronized(ns.af) {
            for(nw var6 = (nw)ns.af.aq(); null != var6; var6 = (nw)ns.af.at()) {
               if (var6.hr == (long)var1 && var6.aw == var2 && 0 == -1329235479 * var6.af) {
                  var4 = var6.an;
                  break;
               }
            }
         }

         if (null != var4) {
            this.al(var2, var1, var4, true, (byte)104);
         } else {
            byte[] var5 = var2.af(var1, -664877427);
            this.al(var2, var1, var5, true, (byte)117);
         }
      } else {
         cq.aw(this, -1596339445 * this.al, var1, this.ak[var1], (byte)2, true, (byte)52);
      }

   }

   public int bp() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.bb.length; ++var3) {
         if (this.ad[var3] > 0) {
            var1 += 100;
            var2 += this.aa(var3, -1669369931);
         }
      }

      if (var1 == 0) {
         return 100;
      } else {
         var3 = 100 * var2 / var1;
         return var3;
      }
   }

   public void bo(qk var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if (this.aq == var1) {
         if (this.at * 2103956439 == 1) {
            throw new RuntimeException();
         }

         if (null == var3) {
            cq.aw(this, 255, -1596339445 * this.al, -1000165165 * this.ax, (byte)0, true, (byte)110);
            return;
         }

         ao.reset();
         ao.update(var3, 0, var3.length);
         var5 = (int)ao.getValue();
         if (var5 != -1710883613 * this.ax) {
            cq.aw(this, -798882322, this.al * -743886959, -1710883613 * this.ax, (byte)0, true, (byte)117);
            return;
         }

         sg var9 = new sg(ai.ch(var3, -1117233973));
         int var7 = var9.cm((byte)7);
         if (var7 != 5 && 6 != var7) {
            throw new RuntimeException(var7 + "," + -1596339445 * this.al + "," + var2);
         }

         int var8 = 0;
         if (var7 >= 6) {
            var8 = var9.cx(-1916431998);
         }

         if (var8 != 17451109 * this.ai) {
            cq.aw(this, 416348147, this.al * -1596339445, 2102559226 * this.ax, (byte)0, true, (byte)39);
            return;
         }

         this.bc(var3, (byte)104);
         this.at(-1090381317);
      } else {
         if (!var4 && 1614195329 * this.ag == var2) {
            this.at = -461123609;
         }

         if (var3 == null || var3.length <= 2) {
            this.ay[var2] = false;
            if (this.aa || var4) {
               cq.aw(this, 627323572 * this.al, var2, this.ak[var2], (byte)2, var4, (byte)58);
            }

            return;
         }

         ao.reset();
         ao.update(var3, 0, var3.length - 2);
         var5 = (int)ao.getValue();
         int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if (this.ak[var2] != var5 || var6 != this.az[var2]) {
            this.ay[var2] = false;
            if (this.aa || var4) {
               cq.aw(this, 670410173 * this.al, var2, this.ak[var2], (byte)2, var4, (byte)83);
            }

            return;
         }

         this.ay[var2] = true;
         if (var4) {
            this.bb[var2] = ef.af(var3, false, 500389543);
         }
      }

   }

   void ae() {
      this.at = -229735256;
      this.am = new int[0];
      this.ak = new int[0];
      this.az = new int[0];
      this.ad = new int[0];
      this.ae = new int[0][];
      this.bb = new Object[0];
      this.bi = new Object[0][];
   }

   void ap() {
      this.at = -922247218;
      this.am = new int[0];
      this.ak = new int[0];
      this.az = new int[0];
      this.ad = new int[0];
      this.ae = new int[0][];
      this.bb = new Object[0];
      this.bi = new Object[0][];
   }

   void au(byte var1) {
      try {
         this.at = -922247218;
         this.am = new int[0];
         this.ak = new int[0];
         this.az = new int[0];
         this.ad = new int[0];
         this.ae = new int[0][];
         this.bb = new Object[0];
         this.bi = new Object[0][];
      } catch (RuntimeException var2) {
         throw db.an(var2, "nd.au(" + ')');
      }
   }

   void bb(int var1, int var2) {
      this.ax = var1 * 215951563;
      this.ai = 1459300717 * var2;
      if (this.aq != null) {
         int var3 = this.al * -1596339445;
         qk var4 = this.aq;
         byte[] var6 = null;
         synchronized(ns.af) {
            for(nw var8 = (nw)ns.af.aq(); var8 != null; var8 = (nw)ns.af.at()) {
               if (var8.hr == (long)var3 && var8.aw == var4 && 0 == -1329235479 * var8.af) {
                  var6 = var8.an;
                  break;
               }
            }
         }

         if (null != var6) {
            this.al(var4, var3, var6, true, (byte)91);
         } else {
            byte[] var7 = var4.af(var3, -429949985);
            this.al(var4, var3, var7, true, (byte)64);
         }
      } else {
         cq.aw(this, 255, -1596339445 * this.al, this.ax * -1710883613, (byte)0, true, (byte)85);
      }

   }

   void aw(int var1, int var2) {
      try {
         int var3 = -1596339445 * this.al;
         long var4 = (long)(var1 + (var3 << 16));
         no var6 = (no)nl.at.af(var4);
         if (null != var6) {
            nl.al.an(var6);
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "nd.aw(" + ')');
      }
   }

   void be(int var1, int var2) {
      this.ax = var1 * 215951563;
      this.ai = 1459300717 * var2;
      if (this.aq != null) {
         int var3 = this.al * -1596339445;
         qk var4 = this.aq;
         byte[] var6 = null;
         synchronized(ns.af) {
            for(nw var8 = (nw)ns.af.aq(); var8 != null; var8 = (nw)ns.af.at()) {
               if (var8.hr == (long)var3 && var8.aw == var4 && 0 == -1329235479 * var8.af) {
                  var6 = var8.an;
                  break;
               }
            }
         }

         if (null != var6) {
            this.al(var4, var3, var6, true, (byte)76);
         } else {
            byte[] var7 = var4.af(var3, 867150001);
            this.al(var4, var3, var7, true, (byte)118);
         }
      } else {
         cq.aw(this, 255, -1596339445 * this.al, this.ax * -1710883613, (byte)0, true, (byte)45);
      }

   }

   void bk(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.at * 2103956439 == 1) {
            throw new RuntimeException();
         }

         if (this.aq != null) {
            cb.af(this.al * -1596339445, var2, this.aq, (byte)6);
         }

         this.bc(var2, (byte)104);
         this.at(1851569992);
      } else {
         var2[var2.length - 2] = (byte)(this.az[var1] >> 8);
         var2[var2.length - 1] = (byte)this.az[var1];
         if (this.ab != null) {
            cb.af(var1, var2, this.ab, (byte)42);
            this.ay[var1] = true;
         }

         if (var4) {
            this.bb[var1] = ef.af(var2, false, 727777261);
         }
      }

   }

   void bx(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.at * 2103956439 == 1) {
            throw new RuntimeException();
         }

         if (this.aq != null) {
            cb.af(this.al * -1596339445, var2, this.aq, (byte)73);
         }

         this.bc(var2, (byte)104);
         this.at(-1668557044);
      } else {
         var2[var2.length - 2] = (byte)(this.az[var1] >> 8);
         var2[var2.length - 1] = (byte)this.az[var1];
         if (this.ab != null) {
            cb.af(var1, var2, this.ab, (byte)93);
            this.ay[var1] = true;
         }

         if (var4) {
            this.bb[var1] = ef.af(var2, false, 495650751);
         }
      }

   }

   public int ax(byte var1) {
      try {
         int var2 = 0;
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < this.bb.length; ++var4) {
            if (this.ad[var4] > 0) {
               if (var1 != 4) {
                  throw new IllegalStateException();
               }

               var2 += 100;
               var3 += this.aa(var4, -1973967810);
            }
         }

         if (var2 == 0) {
            if (var1 != 4) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            var4 = 100 * var3 / var2;
            return var4;
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "nd.ax(" + ')');
      }
   }

   public void bz(qk var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if (this.aq == var1) {
         if (this.at * 2103956439 == 1) {
            throw new RuntimeException();
         } else if (null == var3) {
            cq.aw(this, 255, -1596339445 * this.al, -1710883613 * this.ax, (byte)0, true, (byte)5);
         } else {
            ao.reset();
            ao.update(var3, 0, var3.length);
            var5 = (int)ao.getValue();
            if (var5 != -1710883613 * this.ax) {
               cq.aw(this, 255, this.al * -1596339445, -1710883613 * this.ax, (byte)0, true, (byte)44);
            } else {
               sg var9 = new sg(ai.ch(var3, -1117233973));
               int var7 = var9.cm((byte)7);
               if (var7 != 5 && 6 != var7) {
                  throw new RuntimeException(var7 + "," + -1596339445 * this.al + "," + var2);
               } else {
                  int var8 = 0;
                  if (var7 >= 6) {
                     var8 = var9.cx(-1702203869);
                  }

                  if (var8 != 17451109 * this.ai) {
                     cq.aw(this, 255, this.al * -1596339445, -1710883613 * this.ax, (byte)0, true, (byte)90);
                  } else {
                     this.bc(var3, (byte)104);
                     this.at(1517957226);
                  }
               }
            }
         }
      } else {
         if (!var4 && -2028669797 * this.ag == var2) {
            this.at = -461123609;
         }

         if (var3 != null && var3.length > 2) {
            ao.reset();
            ao.update(var3, 0, var3.length - 2);
            var5 = (int)ao.getValue();
            int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
            if (this.ak[var2] == var5 && var6 == this.az[var2]) {
               this.ay[var2] = true;
               if (var4) {
                  this.bb[var2] = ef.af(var3, false, 2026475881);
               }

            } else {
               this.ay[var2] = false;
               if (this.aa || var4) {
                  cq.aw(this, -1596339445 * this.al, var2, this.ak[var2], (byte)2, var4, (byte)64);
               }

            }
         } else {
            this.ay[var2] = false;
            if (this.aa || var4) {
               cq.aw(this, -1596339445 * this.al, var2, this.ak[var2], (byte)2, var4, (byte)111);
            }

         }
      }
   }

   void bm() {
      this.ay = new boolean[this.bb.length];

      int var1;
      for(var1 = 0; var1 < this.ay.length; ++var1) {
         this.ay[var1] = false;
      }

      if (null == this.ab) {
         this.at = -461123609;
      } else {
         this.ag = -631230867;

         for(var1 = 0; var1 < this.ay.length; ++var1) {
            if (this.ad[var1] > 0) {
               jg.an(var1, this.ab, this, -35309556);
               this.ag = 631230867 * var1;
            }
         }

         if (this.ag * -2028669797 == -1) {
            this.at = -461123609;
         }

      }
   }

   void bd() {
      this.ay = new boolean[this.bb.length];

      int var1;
      for(var1 = 0; var1 < this.ay.length; ++var1) {
         this.ay[var1] = false;
      }

      if (null == this.ab) {
         this.at = -461123609;
      } else {
         this.ag = -631230867;

         for(var1 = 0; var1 < this.ay.length; ++var1) {
            if (this.ad[var1] > 0) {
               jg.an(var1, this.ab, this, -35309556);
               this.ag = 631230867 * var1;
            }
         }

         if (this.ag * -2028669797 == -1) {
            this.at = -461123609;
         }

      }
   }

   void bi(int var1, int var2) {
      this.ax = var1 * 215951563;
      this.ai = 1459300717 * var2;
      if (this.aq != null) {
         int var3 = this.al * -1596339445;
         qk var4 = this.aq;
         byte[] var6 = null;
         synchronized(ns.af) {
            for(nw var8 = (nw)ns.af.aq(); var8 != null; var8 = (nw)ns.af.at()) {
               if (var8.hr == (long)var3 && var8.aw == var4 && 0 == -1329235479 * var8.af) {
                  var6 = var8.an;
                  break;
               }
            }
         }

         if (null != var6) {
            this.al(var4, var3, var6, true, (byte)23);
         } else {
            byte[] var7 = var4.af(var3, -510740248);
            this.al(var4, var3, var7, true, (byte)9);
         }
      } else {
         cq.aw(this, 255, -1596339445 * this.al, this.ax * -1710883613, (byte)0, true, (byte)106);
      }

   }

   int bj(int var1) {
      if (this.bb[var1] != null) {
         return 100;
      } else {
         return this.ay[var1] ? 100 : aj.ac(-1596339445 * this.al, var1, -964267539);
      }
   }

   int bn(int var1) {
      if (this.bb[var1] != null) {
         return 100;
      } else {
         return this.ay[var1] ? 100 : aj.ac(-1596339445 * this.al, var1, -964267539);
      }
   }

   public boolean bs(int var1) {
      return this.ay[var1];
   }

   public boolean br(int var1) {
      return this.ay[var1];
   }

   void as(int var1) {
      int var2 = -1537576947 * this.al;
      long var3 = (long)(var1 + (var2 << 16));
      no var5 = (no)nl.at.af(var3);
      if (null != var5) {
         nl.al.an(var5);
      }

   }

   static int aw(char var0, nx var1, int var2) {
      try {
         int var3;
         label34: {
            var3 = var0 << 4;
            if (!Character.isUpperCase(var0)) {
               if (var2 == 141784696) {
                  throw new IllegalStateException();
               }

               if (!Character.isTitleCase(var0)) {
                  break label34;
               }

               if (var2 == 141784696) {
                  throw new IllegalStateException();
               }
            }

            var0 = Character.toLowerCase(var0);
            var3 = (var0 << 4) + 1;
         }

         if (var0 == 241) {
            if (var2 == 141784696) {
               throw new IllegalStateException();
            }

            if (var1 == nx.ab) {
               var3 = 1762;
            }
         }

         return var3;
      } catch (RuntimeException var4) {
         throw db.an(var4, "nd.aw(" + ')');
      }
   }

   public boolean bf(int var1) {
      return this.ck(var1, 320059254) != null;
   }

   public boolean bq(int var1) {
      return this.ck(var1, 1371704707) != null;
   }

   public nd(qk var1, qk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      try {
         super(var4, var5);
         this.at = 0;
         this.aa = false;
         this.ag = -631230867;
         this.ah = false;
         this.ab = var1;
         this.aq = var2;
         this.al = 957229219 * var3;
         this.aa = var6;
         this.ah = var7;
         int var9 = this.al * -1596339445;
         if (this.ah) {
            if (var9 <= 1097614811 * nl.ak) {
               throw new RuntimeException("");
            }

            if (var9 < 1745465359 * nl.az) {
               nl.az = var9 * 60767983;
            }
         } else {
            if (var9 >= 1745465359 * nl.az) {
               throw new RuntimeException("");
            }

            if (var9 > 1097614811 * nl.ak) {
               nl.ak = 2072522323 * var9;
            }
         }

         if (null != cz.as) {
            cz.as.at = 754054312 * var9 + 1008154857;
            if (-1633313603 * cz.as.at >= cz.as.al.length) {
               if (!this.ah) {
                  throw new RuntimeException("");
               }

               this.au((byte)-5);
            } else {
               int var10 = cz.as.cx(-1663260953);
               int var11 = cz.as.cx(-1793590077);
               this.ab(var10, var11, -691028);
            }
         } else {
            cq.aw((nd)null, 255, 255, 0, (byte)0, true, (byte)110);
            nl.aj[var9] = this;
         }

      } catch (RuntimeException var12) {
         throw db.an(var12, "nd.<init>(" + ')');
      }
   }

   public boolean ah() {
      return 1 == -2065606570 * this.at;
   }

   public int bl() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.bb.length; ++var3) {
         if (this.ad[var3] > 0) {
            var1 += 100;
            var2 += this.aa(var3, -2090642617);
         }
      }

      if (var1 == 0) {
         return 100;
      } else {
         var3 = 100 * var2 / var1;
         return var3;
      }
   }

   void by() {
      this.at = -922247218;
      this.am = new int[0];
      this.ak = new int[0];
      this.az = new int[0];
      this.ad = new int[0];
      this.ae = new int[0][];
      this.bb = new Object[0];
      this.bi = new Object[0][];
   }

   public int bv() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.bb.length; ++var3) {
         if (this.ad[var3] > 0) {
            var1 += 100;
            var2 += this.aa(var3, -2122885114);
         }
      }

      if (var1 == 0) {
         return 100;
      } else {
         var3 = 751577835 * var2 / var1;
         return var3;
      }
   }
}
