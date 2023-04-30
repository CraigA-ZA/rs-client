import accessors.RSWorldMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class rb implements RSWorldMap {
   int bs = -99962399;
   int be = 468823633;
   int bd = 297924373;
   nm aq;
   nm al;
   nm at;
   boolean bq = true;
   static final ri ay;
   int ak;
   on ax;
   HashMap ai;
   tc[] ag;
   static final int af = -65536;
   int ae = -667691095;
   js ar;
   static final int au = 3;
   HashSet bp = new HashSet();
   rh aj;
   jv as;
   int az;
   int ad = -2080912417;
   int bt = -1698997397;
   float ap;
   float by;
   HashSet ca = new HashSet();
   boolean bz = false;
   static final ri ao;
   int bk = 821936197;
   int bx = 1412277301;
   static final float ac = 30.0F;
   static final ri aa;
   HashSet bm = null;
   js am;
   js av;
   int bj = 1462155693;
   int cf = 1316647483;
   int bi = -224660999;
   int br = -531836949;
   long bg;
   int bu;
   int bf;
   int bb = 410569687;
   HashSet bl = new HashSet();
   int bn = -387305683;
   HashSet bc = new HashSet();
   HashSet bh = new HashSet();
   boolean bw = false;
   int ce = 0;
   int bo = 726470486;
   List cc;
   Iterator cn;
   HashMap ah;
   lb cu = null;
   public boolean ck = false;
   tq cq;
   int cm;
   final int[] cs = new int[]{1008, 1009, 1010, 1011, 1012};
   int cl = -1178523109;
   int cg = -1812867423;

   public void ge(int var1) {
      this.bm = new HashSet();
      this.bd = 0;
      this.bt = 0;

      for(int var2 = 0; var2 < 377946909 * mo.aw; ++var2) {
         if (nf.an(var2, 2066060971) != null && nf.an(var2, 2143474681).ae * -461862935 == var1) {
            this.bm.add(nf.an(var2, 1960881624).au * -1945242275);
         }
      }

   }

   public void af(nm var1, nm var2, nm var3, on var4, HashMap var5, tc[] var6, int var7) {
      try {
         this.ag = var6;
         this.aq = var1;
         this.al = var2;
         this.at = var3;
         this.ax = var4;
         this.ai = new HashMap();
         this.ai.put(jd.af, var5.get(aa));
         this.ai.put(jd.an, var5.get(ay));
         this.ai.put(jd.aw, var5.get(ao));
         this.aj = new rh(var1);
         int var8 = this.aq.cy(kq.af.ab, -44197407);
         int[] var9 = this.aq.ck(var8, 428898733);
         int var10000;
         if (var9 == null) {
            if (var7 == -84102297) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = var9.length;
         }

         int var10 = var10000;
         this.ah = new HashMap(var10);

         for(int var11 = 0; var11 < var10; ++var11) {
            sg var12 = new sg(this.aq.bh(var8, var9[var11], (byte)-120));
            js var13 = new js();
            var13.af(var12, var9[var11], (byte)-126);
            this.ah.put(var13.aa(1181486070), var13);
            if (var13.at(-926489840)) {
               if (var7 == -84102297) {
                  throw new IllegalStateException();
               }

               this.av = var13;
            }
         }

         this.ah(this.av, -1483320853);
         this.am = null;
      } catch (RuntimeException var14) {
         throw db.an(var14, "rb.af(" + ')');
      }
   }

   public void an(int var1) {
      try {
         jr.au.ab(5);
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.an(" + ')');
      }
   }

   public void aw(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (!this.aj.aw(2028152441)) {
            if (var8 == -1900312441) {
               throw new IllegalStateException();
            }
         } else {
            this.ab(796336724);
            this.aq(-1737092003);
            if (!var3) {
               if (var8 == -1900312441) {
                  throw new IllegalStateException();
               }
            } else {
               int var9 = (int)Math.ceil((double)((float)var6 / this.ap));
               int var10 = (int)Math.ceil((double)((float)var7 / this.ap));
               List var11 = this.as.ab(-84102297 * this.ak - var9 / 2 - 1, this.az * -632186207 - var10 / 2 - 1, 1 + this.ak * -84102297 + var9 / 2, 1 + var10 / 2 + this.az * -632186207, var4, var5, var6, var7, var1, var2, -554616528);
               HashSet var12 = new HashSet();

               Iterator var13;
               kg var14;
               dr var15;
               ki var16;
               for(var13 = var11.iterator(); var13.hasNext(); dh.af(var15, (byte)-24)) {
                  if (var8 == -1900312441) {
                     throw new IllegalStateException();
                  }

                  var14 = (kg)var13.next();
                  var12.add(var14);
                  var15 = new dr();
                  var16 = new ki(var14.an(-1645421540), var14.al, var14.aq);
                  var15.af(new Object[]{var16, var1, var2}, 1505295862);
                  if (this.ca.contains(var14)) {
                     if (var8 == -1900312441) {
                        throw new IllegalStateException();
                     }

                     var15.an(17, -715457953);
                  } else {
                     var15.an(15, -648299238);
                  }
               }

               var13 = this.ca.iterator();

               while(var13.hasNext()) {
                  if (var8 == -1900312441) {
                     throw new IllegalStateException();
                  }

                  var14 = (kg)var13.next();
                  if (!var12.contains(var14)) {
                     if (var8 == -1900312441) {
                        throw new IllegalStateException();
                     }

                     var15 = new dr();
                     var16 = new ki(var14.an(-140630002), var14.al, var14.aq);
                     var15.af(new Object[]{var16, var1, var2}, 644607568);
                     var15.an(16, 152580476);
                     dh.af(var15, (byte)73);
                  }
               }

               this.ca = var12;
            }
         }
      } catch (RuntimeException var17) {
         throw db.an(var17, "rb.aw(" + ')');
      }
   }

   public void ac(int var1, int var2, boolean var3, boolean var4, int var5) {
      try {
         long var6;
         label64: {
            var6 = dq.af(829810502);
            this.au(var1, var2, var4, var6);
            if (!this.aa(-1874644883)) {
               label68: {
                  if (var5 >= -525589881) {
                     throw new IllegalStateException();
                  }

                  if (!var4) {
                     if (var5 >= -525589881) {
                        throw new IllegalStateException();
                     }

                     if (!var3) {
                        break label68;
                     }

                     if (var5 >= -525589881) {
                        throw new IllegalStateException();
                     }
                  }

                  if (!gl.ok((byte)-70)) {
                     if (var5 >= -525589881) {
                        return;
                     }

                     if (var4) {
                        if (var5 >= -525589881) {
                           return;
                        }

                        this.bs = 99962399 * var1;
                        this.br = 531836949 * var2;
                        this.bj = 592139365 * this.ak;
                        this.bn = 1696219827 * this.az;
                     }

                     if (-1 != -1960645157 * this.bj) {
                        int var8 = var1 - this.bs * -642077217;
                        int var9 = var2 - -2058412227 * this.br;
                        this.al(this.bj * -1960645157 - (int)((float)var8 / this.by), -1246558373 * this.bn + (int)((float)var9 / this.by), false, (short)254);
                     }
                     break label64;
                  }
               }
            }

            this.at(-1514974800);
         }

         if (var4) {
            if (var5 >= -525589881) {
               throw new IllegalStateException();
            }

            this.bg = 7451806700989670229L * var6;
            this.bu = var1 * -1462297475;
            this.bf = var2 * -88109587;
         }

      } catch (RuntimeException var10) {
         throw db.an(var10, "rb.ac(" + ')');
      }
   }

   void au(int var1, int var2, boolean var3, long var4) {
      try {
         if (this.ar != null) {
            int var6 = (int)((float)(-84102297 * this.ak) + ((float)(var1 - this.be * 817997135) - (float)this.bj((byte)103) * this.ap / 2.0F) / this.ap);
            int var7 = (int)((float)(this.az * -632186207) - ((float)(var2 - this.bk * -1710969485) - (float)this.bn(-947809621) * this.ap / 2.0F) / this.ap);
            this.cu = this.ar.ab(var6 + this.ar.ai(16748608) * 64, var7 + this.ar.ah(-1322331114) * 64, 2133508945);
            if (null != this.cu && var3) {
               hy var8 = client.sh;
               boolean var10 = client.pu * 324465533 >= 2;
               int var12;
               int var13;
               if (var10 && var8.av(82, -689223036) && var8.av(81, -366068816)) {
                  int var16 = this.cu.an * -96298701;
                  var12 = -2105445199 * this.cu.aw;
                  var13 = this.cu.af * -113644749;
                  lg var14 = mi.an(lv.cq, client.in.au, (short)-3299);
                  var14.aw.eb(0, (byte)-5);
                  var14.aw.dy(var16, (byte)91);
                  var14.aw.dh(var13, (byte)-49);
                  var14.aw.ds(var12, -1604623959);
                  client.in.aw(var14, 414135591);
               } else {
                  boolean var11 = true;
                  if (this.bq) {
                     var12 = var1 - this.bu * -1959248683;
                     var13 = var2 - -1379608603 * this.bf;
                     if (var4 - 492133368256496125L * this.bg > 500L || var12 < -25 || var12 > 25 || var13 < -25 || var13 > 25) {
                        var11 = false;
                     }
                  }

                  if (var11) {
                     lg var17 = mi.an(lv.bv, client.in.au, (short)-20822);
                     var17.aw.el(this.cu.af(-964267539), -437883978);
                     client.in.aw(var17, 414135591);
                     this.bg = 0L;
                  }
               }
            }
         } else {
            this.cu = null;
         }

      } catch (RuntimeException var15) {
         throw db.an(var15, "rb.au(" + ')');
      }
   }

   void ab(int var1) {
      try {
         if (fi.wc != null) {
            if (var1 > -1372356650) {
               this.ap = this.by;
            }
         } else {
            if (this.ap < this.by) {
               if (var1 <= -1372356650) {
                  throw new IllegalStateException();
               }

               this.ap = Math.min(this.by, this.ap / 30.0F + this.ap);
            }

            if (this.ap > this.by) {
               if (var1 <= -1372356650) {
                  throw new IllegalStateException();
               }

               this.ap = Math.max(this.by, this.ap - this.ap / 30.0F);
            }

         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.ab(" + ')');
      }
   }

   public void dt(int var1, int var2, int var3, boolean var4) {
      js var5 = this.ay(var1, var2, var3, (byte)2);
      if (var5 == null) {
         if (!var4) {
            return;
         }

         var5 = this.av;
      }

      boolean var6 = false;
      if (this.am != var5 || var4) {
         this.am = var5;
         this.ah(var5, -1483320853);
         var6 = true;
      }

      if (var6 || var4) {
         this.am(var1, var2, var3, -1605938577);
      }

   }

   public js du() {
      return this.ar;
   }

   final void at(int var1) {
      try {
         this.br = -531836949;
         this.bs = -99962399;
         this.bn = -387305683;
         this.bj = 1462155693;
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.at(" + ')');
      }
   }

   boolean aa(int var1) {
      try {
         boolean var10000;
         if (-1 != 506744801 * this.ad && this.ae * 1744520039 != -1) {
            if (var1 >= -1542843452) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.aa(" + ')');
      }
   }

   void dd(js var1) {
      if (null == this.ar || this.ar != var1) {
         this.av(var1, 1346326363);
         this.am(-1, -1, -1, -1605938577);
      }
   }

   public void ad(int var1, int var2) {
      try {
         this.by = this.ap(var1, -1224711390);
      } catch (RuntimeException var3) {
         throw db.an(var3, "rb.ad(" + ')');
      }
   }

   public void ax(int var1, int var2) {
      try {
         js var3 = this.be(var1, -797849478);
         if (null != var3) {
            if (var2 == -518589768) {
               return;
            }

            this.ah(var3, -1483320853);
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "rb.ax(" + ')');
      }
   }

   public void go() {
      this.bo = 1643352688;
   }

   void dn(js var1) {
      this.ar = var1;
      this.as = new jv(this.ag, this.ai, this.al, this.at);
      this.aj.af(null == this.ar ? null : this.ar.aa(1910798663), -527718287);
   }

   public void dy(js var1, lb var2, lb var3, boolean var4) {
      if (null != var1) {
         if (null == this.ar || this.ar != var1) {
            this.av(var1, 855336447);
         }

         if (!var4 && this.ar.aw(1406530404 * var2.af, -96298701 * var2.an, var2.aw * -1530313212, -1460841848)) {
            this.am(106418210 * var2.af, -386163306 * var2.an, var2.aw * -2105445199, -1605938577);
         } else {
            this.am(-2120003328 * var3.af, var3.an * -96298701, var3.aw * 1354223151, -1605938577);
         }

      }
   }

   void dx(js var1) {
      if (null == this.ar || this.ar != var1) {
         this.av(var1, 1639466020);
         this.am(-1, -1, -1, -1605938577);
      }
   }

   public lb hd(int var1, lb var2) {
      if (!this.aj.aw(216319083)) {
         return null;
      } else if (!this.as.al(-887760637)) {
         return null;
      } else if (!this.ar.ac(var2.an * -96298701, -2105445199 * var2.aw, 1985331869)) {
         return null;
      } else {
         HashMap var3 = this.as.at((byte)80);
         List var4 = (List)var3.get(var1);
         if (var4 != null && !var4.isEmpty()) {
            kg var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               kg var8;
               int var11;
               do {
                  if (!var7.hasNext()) {
                     return var5.aq;
                  }

                  var8 = (kg)var7.next();
                  int var9 = -96298701 * var8.aq.an - -96298701 * var2.an;
                  int var10 = -2105445199 * var8.aq.aw - -2105445199 * var2.aw;
                  var11 = var9 * var9 + var10 * var10;
                  if (0 == var11) {
                     return var8.aq;
                  }
               } while(var11 >= var6 && null != var5);

               var5 = var8;
               var6 = var11;
            }
         } else {
            return null;
         }
      }
   }

   void am(int var1, int var2, int var3, int var4) {
      try {
         if (this.ar == null) {
            if (var4 != -1605938577) {
               throw new IllegalStateException();
            }
         } else {
            int[] var5 = this.ar.au(var1, var2, var3, (byte)6);
            if (var5 == null) {
               if (var4 != -1605938577) {
                  return;
               }

               var5 = this.ar.au(this.ar.am(-2019541929), this.ar.ar((byte)126), this.ar.as(-151833963), (byte)6);
            }

            this.al(var5[0] - this.ar.ai(16748608) * 64, var5[1] - this.ar.ah(-599342073) * 64, true, (short)254);
            this.ad = -2080912417;
            this.ae = -667691095;
            this.ap = this.ap(this.ar.ax(447952954), 271609225);
            this.by = this.ap;
            this.cc = null;
            this.cn = null;
            this.as.an(-1525624806);
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "rb.am(" + ')');
      }
   }

   void da(int var1, int var2, int var3) {
      if (this.ar != null) {
         int[] var4 = this.ar.au(var1, var2, var3, (byte)6);
         if (var4 == null) {
            var4 = this.ar.au(this.ar.am(-2019541929), this.ar.ar((byte)94), this.ar.as(-151833963), (byte)6);
         }

         this.al(var4[0] - this.ar.ai(16748608) * 280181450, var4[1] - this.ar.ah(1518597563) * -909976881, true, (short)254);
         this.ad = 987301763;
         this.ae = -2114789619;
         this.ap = this.ap(this.ar.ax(447952954), 407986779);
         this.by = this.ap;
         this.cc = null;
         this.cn = null;
         this.as.an(-1525624806);
      }
   }

   public int fp() {
      return null == this.ar ? -1 : -84102297 * this.ak + this.ar.ai(16748608) * 64;
   }

   void ak(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (fi.wc != null) {
            int var8 = 512 / (983071510 * this.as.ah);
            int var9 = 512 + var3;
            int var10 = var4 + 512;
            float var11 = 1.0F;
            var9 = (int)((float)var9 / var11);
            var10 = (int)((float)var10 / var11);
            int var12 = this.bm(-1167233766) - var5 / 2 - var8;
            int var13 = this.bd((byte)0) - var6 / 2 - var8;
            int var14 = var1 - this.as.ah * -1655947893 * (var8 + var12 - this.cf * 334129421);
            int var15 = var2 - (var8 - (var13 - this.cl * 627335149)) * -1655947893 * this.as.ah;
            if (this.aj(var9, var10, var14, var15, var3, var4, -879179620)) {
               if (var7 != 1052800047) {
                  return;
               }

               label53: {
                  if (this.cq != null && this.cq.an == var9) {
                     if (var7 != 1052800047) {
                        throw new IllegalStateException();
                     }

                     if (var10 == this.cq.aw) {
                        Arrays.fill(this.cq.af, 0);
                        break label53;
                     }

                     if (var7 != 1052800047) {
                        return;
                     }
                  }

                  this.cq = new tq(var9, var10);
               }

               this.cf = (this.bm(-930495552) - var5 / 2 - var8) * -1316647483;
               this.cl = (this.bd((byte)0) - var6 / 2 - var8) * 1178523109;
               this.cm = this.as.ah * 219395697;
               fi.wc.au(this.cf * 334129421, 627335149 * this.cl, this.cq, (float)(1547438523 * this.cm) / var11, 47289372);
               this.cg = client.wn * 2048189963;
               var14 = var1 - this.as.ah * -1655947893 * (var8 + var12 - this.cf * 334129421);
               var15 = var2 - (var8 - (var13 - 627335149 * this.cl)) * this.as.ah * -1655947893;
            }

            th.ev(var1, var2, var3, var4, 0, 128);
            if (1.0F == var11) {
               if (var7 != 1052800047) {
                  throw new IllegalStateException();
               }

               this.cq.az(var14, var15, 192);
            } else {
               this.cq.ap(var14, var15, (int)((float)var9 * var11), (int)(var11 * (float)var10), 192);
            }
         }

      } catch (RuntimeException var16) {
         throw db.an(var16, "rb.ak(" + ')');
      }
   }

   public boolean gl(int var1) {
      return !this.bl.contains(var1);
   }

   public int fx() {
      return this.ar == null ? -1 : -632186207 * this.az + this.ar.ah(1270755809) * 64;
   }

   public void gd(int var1, boolean var2) {
      if (!var2) {
         this.bp.add(var1);
      } else {
         this.bp.remove(var1);
      }

      for(int var3 = 0; var3 < mo.aw * 1110002224; ++var3) {
         if (nf.an(var3, 2074456215) != null && nf.an(var3, 2145045741).ae * -461862935 == var1) {
            int var4 = nf.an(var3, 1874503511).au * 2072327221;
            if (!var2) {
               this.bc.add(var4);
            } else {
               this.bc.remove(var4);
            }
         }
      }

      this.ci((byte)-15);
   }

   public kg ca(int var1) {
      try {
         if (!this.aj.aw(-1073850094)) {
            if (var1 >= 540714456) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (!this.as.al(-1519198855)) {
            if (var1 >= 540714456) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            HashMap var2 = this.as.at((byte)47);
            this.cc = new LinkedList();
            Iterator var3 = var2.values().iterator();

            while(var3.hasNext()) {
               if (var1 >= 540714456) {
                  throw new IllegalStateException();
               }

               List var4 = (List)var3.next();
               this.cc.addAll(var4);
            }

            this.cn = this.cc.iterator();
            return this.cu((byte)-8);
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "rb.ca(" + ')');
      }
   }

   public int by(byte var1) {
      try {
         if (1.0 == (double)this.by) {
            if (var1 != 0) {
               throw new IllegalStateException();
            } else {
               return 25;
            }
         } else if (1.5 == (double)this.by) {
            if (var1 != 0) {
               throw new IllegalStateException();
            } else {
               return 37;
            }
         } else if (2.0 == (double)this.by) {
            if (var1 != 0) {
               throw new IllegalStateException();
            } else {
               return 50;
            }
         } else if ((double)this.by == 3.0) {
            if (var1 != 0) {
               throw new IllegalStateException();
            } else {
               return 75;
            }
         } else if ((double)this.by == 4.0) {
            if (var1 != 0) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            return 200;
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.by(" + ')');
      }
   }

   public js ev(int var1) {
      Iterator var2 = this.ah.values().iterator();

      js var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (js)var2.next();
      } while(var3.al(-964267539) != var1);

      return var3;
   }

   public boolean bi(int var1) {
      try {
         return this.aj.aw(1399465487);
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.bi(" + ')');
      }
   }

   public js be(int var1, int var2) {
      try {
         Iterator var3 = this.ah.values().iterator();

         js var4;
         do {
            if (!var3.hasNext()) {
               return null;
            }

            if (var2 >= -269508165) {
               throw new IllegalStateException();
            }

            var4 = (js)var3.next();
         } while(var4.al(-964267539) != var1);

         if (var2 >= -269508165) {
            throw new IllegalStateException();
         } else {
            return var4;
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "rb.be(" + ')');
      }
   }

   public void er() {
      this.aj.an(-531658846);
   }

   public void bx(int var1, int var2, int var3) {
      try {
         if (null == this.ar) {
            if (var3 == -1469152147) {
               throw new IllegalStateException();
            }
         } else {
            this.al(var1 - this.ar.ai(16748608) * 64, var2 - this.ar.ah(1759021250) * 64, true, (short)254);
            this.ad = -2080912417;
            this.ae = -667691095;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "rb.bx(" + ')');
      }
   }

   public void bo(int var1, int var2, int var3, byte var4) {
      try {
         if (null == this.ar) {
            if (var4 > 2) {
               ;
            }
         } else {
            int[] var5 = this.ar.au(var1, var2, var3, (byte)6);
            if (var5 != null) {
               if (var4 <= 2) {
                  throw new IllegalStateException();
               }

               this.bk(var5[0], var5[1], (byte)-59);
            }

         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "rb.bo(" + ')');
      }
   }

   public void gj(boolean var1) {
      this.bz = var1;
   }

   public int bm(int var1) {
      try {
         if (null == this.ar) {
            if (var1 >= -576886093) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return -84102297 * this.ak + this.ar.ai(16748608) * 64;
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.bm(" + ')');
      }
   }

   public int bd(byte var1) {
      try {
         if (this.ar == null) {
            if (var1 != 0) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return -632186207 * this.az + this.ar.ah(-1704163402) * 64;
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.bd(" + ')');
      }
   }

   public lb bt(int var1) {
      try {
         if (this.ar == null) {
            if (var1 != 1721001715) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return this.ar.ab(this.bm(-1369827628), this.bd((byte)0), 1732463921);
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.bt(" + ')');
      }
   }

   final void al(int var1, int var2, boolean var3, short var4) {
      try {
         this.ak = -599017385 * var1;
         this.az = var2 * 19712353;
         dq.af(2107674499);
         if (var3) {
            this.at(1954041280);
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "rb.al(" + ')');
      }
   }

   public void ar(js var1, lb var2, lb var3, boolean var4, int var5) {
      try {
         if (null == var1) {
            if (var5 <= -30340522) {
               throw new IllegalStateException();
            }
         } else {
            label43: {
               if (null != this.ar) {
                  if (this.ar == var1) {
                     break label43;
                  }

                  if (var5 <= -30340522) {
                     throw new IllegalStateException();
                  }
               }

               this.av(var1, -168114287);
            }

            if (!var4) {
               if (var5 <= -30340522) {
                  throw new IllegalStateException();
               }

               if (this.ar.aw(-113644749 * var2.af, -96298701 * var2.an, var2.aw * -2105445199, 129497682)) {
                  this.am(-113644749 * var2.af, -96298701 * var2.an, var2.aw * -2105445199, -1605938577);
                  return;
               }

               if (var5 <= -30340522) {
                  throw new IllegalStateException();
               }
            }

            this.am(-113644749 * var3.af, var3.an * -96298701, var3.aw * -2105445199, -1605938577);
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "rb.ar(" + ')');
      }
   }

   public void bs(int var1, byte var2) {
      try {
         if (var1 >= 1) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            this.bx = -960896665 * var1;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "rb.bs(" + ')');
      }
   }

   public void br(byte var1) {
      try {
         this.bx = 1412277301;
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.br(" + ')');
      }
   }

   public void bg(int var1, byte var2) {
      try {
         if (var1 >= 1) {
            if (var2 == 22) {
               throw new IllegalStateException();
            }

            this.bo = 787623523 * var1;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "rb.bg(" + ')');
      }
   }

   float ap(int var1, int var2) {
      try {
         if (var1 == 25) {
            if (var2 == 506576733) {
               throw new IllegalStateException();
            } else {
               return 1.0F;
            }
         } else if (var1 == 37) {
            if (var2 == 506576733) {
               throw new IllegalStateException();
            } else {
               return 1.5F;
            }
         } else if (var1 == 50) {
            if (var2 == 506576733) {
               throw new IllegalStateException();
            } else {
               return 2.0F;
            }
         } else if (75 == var1) {
            if (var2 == 506576733) {
               throw new IllegalStateException();
            } else {
               return 3.0F;
            }
         } else {
            return 100 == var1 ? 4.0F : 8.0F;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "rb.ap(" + ')');
      }
   }

   public void bf(boolean var1, int var2) {
      try {
         this.bz = var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "rb.bf(" + ')');
      }
   }

   public void bq(int var1, int var2) {
      try {
         this.bm = new HashSet();
         this.bm.add(var1);
         this.bd = 0;
         this.bt = 0;
      } catch (RuntimeException var3) {
         throw db.an(var3, "rb.bq(" + ')');
      }
   }

   public void ba(int var1, int var2) {
      try {
         this.bm = new HashSet();
         this.bd = 0;
         this.bt = 0;

         for(int var3 = 0; var3 < -1703136055 * mo.aw; ++var3) {
            if (var2 <= 307569287) {
               throw new IllegalStateException();
            }

            if (nf.an(var3, 1859815020) == null) {
               if (var2 <= 307569287) {
                  throw new IllegalStateException();
               }
            } else if (nf.an(var3, 2066685131).ae * -461862935 == var1) {
               this.bm.add(nf.an(var3, 2028862231).au * 219774827);
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "rb.ba(" + ')');
      }
   }

   public void dv(int var1, int var2, int var3, boolean var4) {
      js var5 = this.ay(var1, var2, var3, (byte)2);
      if (var5 == null) {
         if (!var4) {
            return;
         }

         var5 = this.av;
      }

      boolean var6 = false;
      if (this.am != var5 || var4) {
         this.am = var5;
         this.ah(var5, -1483320853);
         var6 = true;
      }

      if (var6 || var4) {
         this.am(var1, var2, var3, -1605938577);
      }

   }

   public void bl(boolean var1, int var2) {
      try {
         boolean var10001;
         if (!var1) {
            if (var2 <= 581262242) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.bw = var10001;
      } catch (RuntimeException var3) {
         throw db.an(var3, "rb.bl(" + ')');
      }
   }

   public void bp(int var1, boolean var2, int var3) {
      try {
         if (!var2) {
            if (var3 <= -1324136589) {
               return;
            }

            this.bl.add(var1);
         } else {
            this.bl.remove(var1);
         }

         this.ci((byte)-91);
      } catch (RuntimeException var4) {
         throw db.an(var4, "rb.bp(" + ')');
      }
   }

   public boolean gz(int var1) {
      return !this.bp.contains(var1);
   }

   public boolean bw(int var1, int var2) {
      try {
         boolean var10000;
         if (!this.bl.contains(var1)) {
            if (var2 == 985369060) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw db.an(var3, "rb.bw(" + ')');
      }
   }

   public boolean ce(int var1, byte var2) {
      try {
         boolean var10000;
         if (!this.bp.contains(var1)) {
            if (var2 >= 3) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw db.an(var3, "rb.ce(" + ')');
      }
   }

   void dw() {
      if (this.aa(-1946568952)) {
         int var1 = this.ad * 506744801 - this.ak * -84102297;
         int var2 = this.ae * 1744520039 - this.az * -632186207;
         if (0 != var1) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.al(-84102297 * this.ak + var1, var2 + this.az * -632186207, true, (short)254);
         if (this.ad * 506744801 == this.ak * -84102297 && 1744520039 * this.ae == this.az * -632186207) {
            this.ad = -2080912417;
            this.ae = -667691095;
         }

      }
   }

   public void cs(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (!this.aj.aw(-1414715817)) {
            if (var7 == 1197548346) {
               throw new IllegalStateException();
            }
         } else {
            int var8 = (int)Math.ceil((double)((float)var3 / this.ap));
            int var9 = (int)Math.ceil((double)((float)var4 / this.ap));
            List var10 = this.as.ab(this.ak * -84102297 - var8 / 2 - 1, -632186207 * this.az - var9 / 2 - 1, var8 / 2 + this.ak * -84102297 + 1, 1 + var9 / 2 + this.az * -632186207, var1, var2, var3, var4, var5, var6, 135663336);
            if (var10.isEmpty()) {
               if (var7 == 1197548346) {
                  throw new IllegalStateException();
               }
            } else {
               Iterator var11 = var10.iterator();

               boolean var14;
               do {
                  if (!var11.hasNext()) {
                     return;
                  }

                  if (var7 == 1197548346) {
                     throw new IllegalStateException();
                  }

                  kg var12 = (kg)var11.next();
                  hw var13 = nf.an(var12.an(-1586895081), 1958358177);
                  var14 = false;

                  for(int var15 = this.cs.length - 1; var15 >= 0; --var15) {
                     if (var7 == 1197548346) {
                        throw new IllegalStateException();
                     }

                     if (null != var13.ai[var15]) {
                        if (var7 == 1197548346) {
                           throw new IllegalStateException();
                        }

                        cb.kz(var13.ai[var15], var13.ag, this.cs[var15], var12.an(-777812869), var12.al.af(-964267539), var12.aq.af(-964267539), (byte)124);
                        var14 = true;
                     }
                  }
               } while(!var14);

            }
         }
      } catch (RuntimeException var16) {
         throw db.an(var16, "rb.cs(" + ')');
      }
   }

   void co(int var1, int var2, boolean var3, long var4) {
      if (this.ar != null) {
         int var6 = (int)((float)(-410746520 * this.ak) + ((float)(var1 - this.be * 817997135) - (float)this.bj((byte)86) * this.ap / 2.0F) / this.ap);
         int var7 = (int)((float)(this.az * -1203973138) - ((float)(var2 - this.bk * 1912558393) - (float)this.bn(2097886997) * this.ap / 2.0F) / this.ap);
         this.cu = this.ar.ab(var6 + this.ar.ai(16748608) * 1636881074, var7 + this.ar.ah(402599440) * 1256085057, 1477274250);
         if (null != this.cu && var3) {
            hy var8 = client.sh;
            boolean var10 = client.pu * -1073920603 >= 2;
            int var12;
            int var13;
            if (var10 && var8.av(82, -1334872437) && var8.av(649214368, -1642009145)) {
               int var15 = this.cu.an * 393922651;
               var12 = -396408734 * this.cu.aw;
               var13 = this.cu.af * -113644749;
               lg var14 = mi.an(lv.cq, client.in.au, (short)-30222);
               var14.aw.eb(0, (byte)-44);
               var14.aw.dy(var15, (byte)23);
               var14.aw.dh(var13, (byte)-72);
               var14.aw.ds(var12, -1041569456);
               client.in.aw(var14, 414135591);
            } else {
               boolean var11 = true;
               if (this.bq) {
                  var12 = var1 - this.bu * -1959248683;
                  var13 = var2 - -1048969760 * this.bf;
                  if (var4 - 492133368256496125L * this.bg > 500L || var12 < -25 || var12 > 25 || var13 < -1091942327 || var13 > 25) {
                     var11 = false;
                  }
               }

               if (var11) {
                  lg var16 = mi.an(lv.bv, client.in.au, (short)-24697);
                  var16.aw.el(this.cu.af(-964267539), -437883978);
                  client.in.aw(var16, 414135591);
                  this.bg = 0L;
               }
            }
         }
      } else {
         this.cu = null;
      }

   }

   public void cn(int var1, int var2, lb var3, lb var4, int var5) {
      try {
         dr var6 = new dr();
         ki var7 = new ki(var2, var3, var4);
         var6.af(new Object[]{var7}, -769905829);
         switch (var1) {
            case 1008:
               var6.an(10, 291235054);
               break;
            case 1009:
               var6.an(11, 665630045);
               break;
            case 1010:
               var6.an(12, -561608176);
               break;
            case 1011:
               var6.an(13, -896488623);
               break;
            case 1012:
               var6.an(14, 603586528);
         }

         dh.af(var6, (byte)4);
      } catch (RuntimeException var8) {
         throw db.an(var8, "rb.cn(" + ')');
      }
   }

   public void bk(int var1, int var2, byte var3) {
      try {
         if (null != this.ar) {
            if (var3 >= 8) {
               throw new IllegalStateException();
            }

            if (this.ar.ac(var1, var2, 1764440845)) {
               this.ad = (var1 - this.ar.ai(16748608) * 64) * 2080912417;
               this.ae = (var2 - this.ar.ah(787514421) * 64) * 667691095;
               return;
            }

            if (var3 >= 8) {
               throw new IllegalStateException();
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "rb.bk(" + ')');
      }
   }

   public kg cu(byte var1) {
      try {
         if (this.cn == null) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            kg var2;
            do {
               if (!this.cn.hasNext()) {
                  return null;
               }

               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               var2 = (kg)this.cn.next();
            } while(var2.an(-1616063448) == -1);

            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "rb.cu(" + ')');
      }
   }

   static {
      aa = ri.ac;
      ay = ri.au;
      ao = ri.ab;
   }

   boolean aj(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (null == this.cq) {
            if (var7 >= 1064772455) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            if (this.cq.an == var1) {
               if (var7 >= 1064772455) {
                  throw new IllegalStateException();
               }

               if (this.cq.aw == var2) {
                  if (-1655947893 * this.as.ah != this.cm * 1547438523) {
                     if (var7 >= 1064772455) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if (this.cg * 2016965279 != -1680619819 * client.wn) {
                     if (var7 >= 1064772455) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if (var3 <= 0) {
                     if (var7 >= 1064772455) {
                        throw new IllegalStateException();
                     }

                     if (var4 <= 0) {
                        if (var1 + var3 >= var5) {
                           if (var7 >= 1064772455) {
                              throw new IllegalStateException();
                           }

                           if (var4 + var2 >= var6) {
                              return false;
                           }

                           if (var7 >= 1064772455) {
                              throw new IllegalStateException();
                           }
                        }

                        return true;
                     }
                  }

                  return true;
               }

               if (var7 >= 1064772455) {
                  throw new IllegalStateException();
               }
            }

            return true;
         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "rb.aj(" + ')');
      }
   }

   public void cq(nm var1, nm var2, nm var3, on var4, HashMap var5, tc[] var6) {
      this.ag = var6;
      this.aq = var1;
      this.al = var2;
      this.at = var3;
      this.ax = var4;
      this.ai = new HashMap();
      this.ai.put(jd.af, var5.get(aa));
      this.ai.put(jd.an, var5.get(ay));
      this.ai.put(jd.aw, var5.get(ao));
      this.aj = new rh(var1);
      int var7 = this.aq.cy(kq.af.ab, -2014555221);
      int[] var8 = this.aq.ck(var7, 1547279193);
      int var9 = var8 == null ? 0 : var8.length;
      this.ah = new HashMap(var9);

      for(int var10 = 0; var10 < var9; ++var10) {
         sg var11 = new sg(this.aq.bh(var7, var8[var10], (byte)-78));
         js var12 = new js();
         var12.af(var11, var8[var10], (byte)-104);
         this.ah.put(var12.aa(-1599876261), var12);
         if (var12.at(-926489840)) {
            this.av = var12;
         }
      }

      this.ah(this.av, -1483320853);
      this.am = null;
   }

   public void cm(nm var1, nm var2, nm var3, on var4, HashMap var5, tc[] var6) {
      this.ag = var6;
      this.aq = var1;
      this.al = var2;
      this.at = var3;
      this.ax = var4;
      this.ai = new HashMap();
      this.ai.put(jd.af, var5.get(aa));
      this.ai.put(jd.an, var5.get(ay));
      this.ai.put(jd.aw, var5.get(ao));
      this.aj = new rh(var1);
      int var7 = this.aq.cy(kq.af.ab, -289898489);
      int[] var8 = this.aq.ck(var7, 623283668);
      int var9 = var8 == null ? 0 : var8.length;
      this.ah = new HashMap(var9);

      for(int var10 = 0; var10 < var9; ++var10) {
         sg var11 = new sg(this.aq.bh(var7, var8[var10], (byte)-22));
         js var12 = new js();
         var12.af(var11, var8[var10], (byte)5);
         this.ah.put(var12.aa(-724737258), var12);
         if (var12.at(-926489840)) {
            this.av = var12;
         }
      }

      this.ah(this.av, -1483320853);
      this.am = null;
   }

   public void cf() {
      jr.au.ab(5);
   }

   public void cl() {
      jr.au.ab(5);
   }

   public void cg() {
      jr.au.ab(5);
   }

   public void cr(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.aj.aw(1800406803)) {
         this.ab(-232932068);
         this.aq(-1717257914);
         if (var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.ap));
            int var9 = (int)Math.ceil((double)((float)var7 / this.ap));
            List var10 = this.as.ab(-84102297 * this.ak - var8 / 2 - 1, this.az * -632186207 - var9 / 2 - 1, 1 + this.ak * -84102297 + var8 / 2, 1 + var9 / 2 + this.az * -632186207, var4, var5, var6, var7, var1, var2, 1549343178);
            HashSet var11 = new HashSet();

            Iterator var12;
            kg var13;
            dr var14;
            ki var15;
            for(var12 = var10.iterator(); var12.hasNext(); dh.af(var14, (byte)30)) {
               var13 = (kg)var12.next();
               var11.add(var13);
               var14 = new dr();
               var15 = new ki(var13.an(-1580649861), var13.al, var13.aq);
               var14.af(new Object[]{var15, var1, var2}, 214587661);
               if (this.ca.contains(var13)) {
                  var14.an(17, 1732434875);
               } else {
                  var14.an(15, -1324562100);
               }
            }

            var12 = this.ca.iterator();

            while(var12.hasNext()) {
               var13 = (kg)var12.next();
               if (!var11.contains(var13)) {
                  var14 = new dr();
                  var15 = new ki(var13.an(-582894896), var13.al, var13.aq);
                  var14.af(new Object[]{var15, var1, var2}, 1652971656);
                  var14.an(16, -812174463);
                  dh.af(var14, (byte)-14);
               }
            }

            this.ca = var11;
         }
      }
   }

   public void dh(int var1) {
      js var2 = this.be(var1, -473896303);
      if (null != var2) {
         this.ah(var2, -1483320853);
      }

   }

   public void cx(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.aj.aw(-1834292981)) {
         this.ab(590619642);
         this.aq(-1610316737);
         if (var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.ap));
            int var9 = (int)Math.ceil((double)((float)var7 / this.ap));
            List var10 = this.as.ab(-84102297 * this.ak - var8 / 2 - 1, this.az * -632186207 - var9 / 2 - 1, 1 + this.ak * -84102297 + var8 / 2, 1 + var9 / 2 + this.az * -632186207, var4, var5, var6, var7, var1, var2, 1269120835);
            HashSet var11 = new HashSet();

            Iterator var12;
            kg var13;
            dr var14;
            ki var15;
            for(var12 = var10.iterator(); var12.hasNext(); dh.af(var14, (byte)-7)) {
               var13 = (kg)var12.next();
               var11.add(var13);
               var14 = new dr();
               var15 = new ki(var13.an(-512573431), var13.al, var13.aq);
               var14.af(new Object[]{var15, var1, var2}, -279711259);
               if (this.ca.contains(var13)) {
                  var14.an(17, -1258302275);
               } else {
                  var14.an(15, 793415627);
               }
            }

            var12 = this.ca.iterator();

            while(var12.hasNext()) {
               var13 = (kg)var12.next();
               if (!var11.contains(var13)) {
                  var14 = new dr();
                  var15 = new ki(var13.an(-1042697453), var13.al, var13.aq);
                  var14.af(new Object[]{var15, var1, var2}, 1302200904);
                  var14.an(16, -1444355686);
                  dh.af(var14, (byte)-43);
               }
            }

            this.ca = var11;
         }
      }
   }

   public void cy(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.aj.aw(1160007712)) {
         this.ab(793323261);
         this.aq(-1832276817);
         if (var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.ap));
            int var9 = (int)Math.ceil((double)((float)var7 / this.ap));
            List var10 = this.as.ab(-1493986062 * this.ak - var8 / 2 - 1, this.az * -632186207 - var9 / 2 - 1, 1 + this.ak * 1748399536 + var8 / 2, 1 + var9 / 2 + this.az * -632186207, var4, var5, var6, var7, var1, var2, 1205225730);
            HashSet var11 = new HashSet();

            Iterator var12;
            kg var13;
            dr var14;
            ki var15;
            for(var12 = var10.iterator(); var12.hasNext(); dh.af(var14, (byte)-39)) {
               var13 = (kg)var12.next();
               var11.add(var13);
               var14 = new dr();
               var15 = new ki(var13.an(-1358105714), var13.al, var13.aq);
               var14.af(new Object[]{var15, var1, var2}, 1846405979);
               if (this.ca.contains(var13)) {
                  var14.an(17, 733518569);
               } else {
                  var14.an(15, -257013143);
               }
            }

            var12 = this.ca.iterator();

            while(var12.hasNext()) {
               var13 = (kg)var12.next();
               if (!var11.contains(var13)) {
                  var14 = new dr();
                  var15 = new ki(var13.an(-1627131838), var13.al, var13.aq);
                  var14.af(new Object[]{var15, var1, var2}, 994037520);
                  var14.an(16, 831676753);
                  dh.af(var14, (byte)21);
               }
            }

            this.ca = var11;
         }
      }
   }

   public void cb(int var1, int var2, boolean var3, boolean var4) {
      long var5 = dq.af(1807187267);
      this.au(var1, var2, var4, var5);
      if (!this.aa(-1634890004) && (var4 || var3) && !gl.ok((byte)-17)) {
         if (var4) {
            this.bs = 99962399 * var1;
            this.br = 531836949 * var2;
            this.bj = 592139365 * this.ak;
            this.bn = 1696219827 * this.az;
         }

         if (-1 != -1960645157 * this.bj) {
            int var7 = var1 - this.bs * -642077217;
            int var8 = var2 - -2058412227 * this.br;
            this.al(this.bj * -1960645157 - (int)((float)var7 / this.by), -1246558373 * this.bn + (int)((float)var8 / this.by), false, (short)254);
         }
      } else {
         this.at(1783940377);
      }

      if (var4) {
         this.bg = 7451806700989670229L * var5;
         this.bu = var1 * -1462297475;
         this.bf = var2 * -88109587;
      }

   }

   public void ey(int var1, int var2) {
      if (null != this.ar) {
         this.al(var1 - this.ar.ai(16748608) * 64, var2 - this.ar.ah(-1080333750) * 1217281780, true, (short)254);
         this.ad = -372983540;
         this.ae = 1032529055;
      }
   }

   public int bj(byte var1) {
      try {
         return -1222006759 * this.bb;
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.bj(" + ')');
      }
   }

   void cw() {
      if (fi.wc != null) {
         this.ap = this.by;
      } else {
         if (this.ap < this.by) {
            this.ap = Math.min(this.by, this.ap / 30.0F + this.ap);
         }

         if (this.ap > this.by) {
            this.ap = Math.max(this.by, this.ap - this.ap / 30.0F);
         }

      }
   }

   public void bu(int var1) {
      try {
         this.bo = 726470486;
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.bu(" + ')');
      }
   }

   void ch() {
      if (fi.wc != null) {
         this.ap = this.by;
      } else {
         if (this.ap < this.by) {
            this.ap = Math.min(this.by, this.ap / 30.0F + this.ap);
         }

         if (this.ap > this.by) {
            this.ap = Math.max(this.by, this.ap - this.ap / 30.0F);
         }

      }
   }

   void ct() {
      if (this.aa(-1935623539)) {
         int var1 = this.ad * -1515957885 - this.ak * -681483255;
         int var2 = this.ae * 1744520039 - this.az * -1387764648;
         if (0 != var1) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.al(466722362 * this.ak + var1, var2 + this.az * 1004518695, true, (short)254);
         if (this.ad * 2131819592 == this.ak * 1681875606 && 1744520039 * this.ae == this.az * -632186207) {
            this.ad = -2080912417;
            this.ae = -138818798;
         }

      }
   }

   void cp() {
      if (this.aa(-1843368762)) {
         int var1 = this.ad * 506744801 - this.ak * -84102297;
         int var2 = this.ae * 1744520039 - this.az * -632186207;
         if (0 != var1) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.al(-84102297 * this.ak + var1, var2 + this.az * -632186207, true, (short)254);
         if (this.ad * 506744801 == this.ak * -84102297 && 1744520039 * this.ae == this.az * -632186207) {
            this.ad = -2080912417;
            this.ae = -667691095;
         }

      }
   }

   void cd() {
      if (this.aa(-1587112547)) {
         int var1 = this.ad * 506744801 - this.ak * -84102297;
         int var2 = this.ae * 423154760 - this.az * -632186207;
         if (0 != var1) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.al(-84102297 * this.ak + var1, var2 + this.az * -632186207, true, (short)254);
         if (this.ad * 506744801 == this.ak * -84102297 && -1372000174 * this.ae == this.az * -806815404) {
            this.ad = -2080912417;
            this.ae = 1232644134;
         }

      }
   }

   void dm() {
      if (this.aa(-1698719749)) {
         int var1 = this.ad * 506744801 - this.ak * -84102297;
         int var2 = this.ae * 1744520039 - this.az * -632186207;
         if (0 != var1) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.al(-84102297 * this.ak + var1, var2 + this.az * -632186207, true, (short)254);
         if (this.ad * 506744801 == this.ak * -84102297 && 1744520039 * this.ae == this.az * -632186207) {
            this.ad = -2080912417;
            this.ae = -667691095;
         }

      }
   }

   public kg hc() {
      if (this.cn == null) {
         return null;
      } else {
         kg var1;
         do {
            if (!this.cn.hasNext()) {
               return null;
            }

            var1 = (kg)this.cn.next();
         } while(var1.an(-197658795) == -1);

         return var1;
      }
   }

   final void dc(int var1, int var2, boolean var3) {
      this.ak = -599017385 * var1;
      this.az = var2 * 19712353;
      dq.af(1092016934);
      if (var3) {
         this.at(843226105);
      }

   }

   final void do() {
      this.br = -531836949;
      this.bs = -99962399;
      this.bn = -387305683;
      this.bj = 1462155693;
   }

   boolean di() {
      return -1 != 506744801 * this.ad && this.ae * 1744520039 != -1;
   }

   boolean dr() {
      return -1 != -1244024819 * this.ad && this.ae * 1744520039 != -1;
   }

   boolean dl() {
      return -1 != -601848329 * this.ad && this.ae * 1744520039 != -1;
   }

   public js dk(int var1, int var2, int var3) {
      Iterator var4 = this.ah.values().iterator();

      js var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (js)var4.next();
      } while(!var5.aw(var1, var2, var3, -394156959));

      return var5;
   }

   public int ai(int var1) {
      try {
         if (this.ar == null) {
            if (var1 == 1666227226) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.ar.al(-964267539);
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.ai(" + ')');
      }
   }

   public int bn(int var1) {
      try {
         return 1077411767 * this.bi;
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.bn(" + ')');
      }
   }

   public void dz(int var1, int var2, int var3, boolean var4) {
      js var5 = this.ay(var1, var2, var3, (byte)2);
      if (var5 == null) {
         if (!var4) {
            return;
         }

         var5 = this.av;
      }

      boolean var6 = false;
      if (this.am != var5 || var4) {
         this.am = var5;
         this.ah(var5, -1483320853);
         var6 = true;
      }

      if (var6 || var4) {
         this.am(var1, var2, var3, -1605938577);
      }

   }

   public void eh(int var1, int var2) {
      if (null != this.ar && this.ar.ac(var1, var2, 1879142725)) {
         this.ad = (var1 - this.ar.ai(16748608) * 64) * 2080912417;
         this.ae = (var2 - this.ar.ah(-1935069417) * 64) * 667691095;
      }
   }

   public int fn() {
      return -1222006759 * this.bb;
   }

   public lb fb() {
      return this.ar == null ? null : this.ar.ab(this.bm(-1607729252), this.bd((byte)0), 1520880723);
   }

   public int dp() {
      return this.ar == null ? -1 : this.ar.al(-964267539);
   }

   public void fc() {
      this.bx = 1412277301;
   }

   public js db() {
      return this.ar;
   }

   public js df() {
      return this.ar;
   }

   public js dq() {
      return this.ar;
   }

   public void hn(int var1, int var2, lb var3, lb var4) {
      dr var5 = new dr();
      ki var6 = new ki(var2, var3, var4);
      var5.af(new Object[]{var6}, 1981849408);
      switch (var1) {
         case 1008:
            var5.an(10, 775914151);
            break;
         case 1009:
            var5.an(11, -228386502);
            break;
         case 1010:
            var5.an(12, 1203032210);
            break;
         case 1011:
            var5.an(13, -106729926);
            break;
         case 1012:
            var5.an(14, 1409667328);
      }

      dh.af(var5, (byte)16);
   }

   public int fl() {
      return null == this.ar ? -1 : -84102297 * this.ak + this.ar.ai(16748608) * 64;
   }

   public void bb(int var1) {
      try {
         this.aj.an(-503506459);
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.bb(" + ')');
      }
   }

   public void gg(int var1) {
      this.bm = new HashSet();
      this.bm.add(var1);
      this.bd = 0;
      this.bt = 0;
   }

   public void fu() {
      this.bo = 726470486;
   }

   public boolean gx(int var1) {
      return !this.bl.contains(var1);
   }

   public void hs(int var1, int var2, lb var3, lb var4) {
      dr var5 = new dr();
      ki var6 = new ki(var2, var3, var4);
      var5.af(new Object[]{var6}, -712213217);
      switch (var1) {
         case 1008:
            var5.an(10, -1481111380);
            break;
         case 1009:
            var5.an(11, -960189401);
            break;
         case 1010:
            var5.an(12, 1777196281);
            break;
         case 1011:
            var5.an(13, 10707487);
            break;
         case 1012:
            var5.an(14, 1368217607);
      }

      dh.af(var5, (byte)-29);
   }

   public void ep(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[4];
      th.el(var6);
      th.es(var1, var2, var1 + var3, var2 + var4);
      th.em(var1, var2, var3, var4, -16777216);
      int var7 = this.aj.ac((byte)75);
      if (var7 < 100) {
         this.ae(var1, var2, var3, var4, var7, 1728998768);
      } else {
         if (!this.as.al(-882999870)) {
            this.as.af(this.aq, this.ar.aa(622430192), client.ca, (short)-7944);
            if (!this.as.al(-1022159283)) {
               return;
            }
         }

         if (this.bm != null) {
            this.bt += 1698997397;
            if (this.bt * 1104873149 % (this.bo * 1369293643) == 0) {
               this.bt = 0;
               this.bd += -297924373;
            }

            if (this.bd * 676356035 >= -1444238761 * this.bx && !this.bz) {
               this.bm = null;
            }
         }

         int var8 = (int)Math.ceil((double)((float)var3 / this.ap));
         int var9 = (int)Math.ceil((double)((float)var4 / this.ap));
         this.as.aw(-84102297 * this.ak - var8 / 2, -632186207 * this.az - var9 / 2, this.ak * -84102297 + var8 / 2, var9 / 2 + this.az * -632186207, var1, var2, var1 + var3, var4 + var2, 447313355);
         boolean var10;
         if (!this.bw) {
            var10 = false;
            if (var5 - 460446351 * this.ce > 100) {
               this.ce = var5 * -2042100625;
               var10 = true;
            }

            this.as.ac(this.ak * -84102297 - var8 / 2, -632186207 * this.az - var9 / 2, -84102297 * this.ak + var8 / 2, -632186207 * this.az + var9 / 2, var1, var2, var1 + var3, var2 + var4, this.bh, this.bm, this.bt * 1104873149, this.bo * 1369293643, var10, 1337992230);
         }

         this.ak(var1, var2, var3, var4, var8, var9, 1052800047);
         var10 = 324465533 * client.pu >= 2;
         if (var10 && this.ck && this.cu != null) {
            this.ax.ar("Coord: " + this.cu, 10 + th.bk, 20 + th.bi, 16776960, -1);
         }

         this.bb = var8 * -410569687;
         this.bi = var9 * 224660999;
         this.be = -468823633 * var1;
         this.bk = var2 * -821936197;
         th.en(var6);
      }
   }

   public void eo(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[4];
      th.el(var6);
      th.es(var1, var2, var1 + var3, var2 + var4);
      th.em(var1, var2, var3, var4, -16777216);
      int var7 = this.aj.ac((byte)75);
      if (var7 < 100) {
         this.ae(var1, var2, var3, var4, var7, 1026615695);
      } else {
         if (!this.as.al(-2025207717)) {
            this.as.af(this.aq, this.ar.aa(1096556161), client.ca, (short)-14273);
            if (!this.as.al(-1406850364)) {
               return;
            }
         }

         if (this.bm != null) {
            this.bt += 1698997397;
            if (this.bt * 1104873149 % (this.bo * 1369293643) == 0) {
               this.bt = 0;
               this.bd += -297924373;
            }

            if (this.bd * 676356035 >= -1444238761 * this.bx && !this.bz) {
               this.bm = null;
            }
         }

         int var8 = (int)Math.ceil((double)((float)var3 / this.ap));
         int var9 = (int)Math.ceil((double)((float)var4 / this.ap));
         this.as.aw(-84102297 * this.ak - var8 / 2, -632186207 * this.az - var9 / 2, this.ak * -84102297 + var8 / 2, var9 / 2 + this.az * -632186207, var1, var2, var1 + var3, var4 + var2, -1179572642);
         boolean var10;
         if (!this.bw) {
            var10 = false;
            if (var5 - 460446351 * this.ce > 100) {
               this.ce = var5 * -2042100625;
               var10 = true;
            }

            this.as.ac(this.ak * -84102297 - var8 / 2, -632186207 * this.az - var9 / 2, -84102297 * this.ak + var8 / 2, -632186207 * this.az + var9 / 2, var1, var2, var1 + var3, var2 + var4, this.bh, this.bm, this.bt * 1104873149, this.bo * 1369293643, var10, -1456202113);
         }

         this.ak(var1, var2, var3, var4, var8, var9, 1052800047);
         var10 = 324465533 * client.pu >= 2;
         if (var10 && this.ck && this.cu != null) {
            this.ax.ar("Coord: " + this.cu, 10 + th.bk, 20 + th.bi, 16776960, -1);
         }

         this.bb = var8 * -410569687;
         this.bi = var9 * 224660999;
         this.be = -468823633 * var1;
         this.bk = var2 * -821936197;
         th.en(var6);
      }
   }

   boolean eq(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null == this.cq) {
         return true;
      } else if (this.cq.an == var1 && this.cq.aw == var2) {
         if (-1655947893 * this.as.ah != this.cm * 1547438523) {
            return true;
         } else if (this.cg * 2016965279 != -1680619819 * client.wn) {
            return true;
         } else if (var3 <= 0 && var4 <= 0) {
            return var1 + var3 < var5 || var4 + var2 < var6;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   void et(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (fi.wc != null) {
         int var7 = -678181206 / (-1683757762 * this.as.ah);
         int var8 = 512 + var3;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.bm(-1198510009) - var5 / 2 - var7;
         int var12 = this.bd((byte)0) - var6 / 2 - var7;
         int var13 = var1 - this.as.ah * -1013171018 * (var7 + var11 - this.cf * -460898343);
         int var14 = var2 - (var7 - (var12 - this.cl * 627335149)) * -291103341 * this.as.ah;
         if (this.aj(var8, var9, var13, var14, var3, var4, 25950892)) {
            if (this.cq != null && this.cq.an == var8 && var9 == this.cq.aw) {
               Arrays.fill(this.cq.af, 0);
            } else {
               this.cq = new tq(var8, var9);
            }

            this.cf = (this.bm(-1018350009) - var5 / 2 - var7) * -55075052;
            this.cl = (this.bd((byte)0) - var6 / 2 - var7) * 1178523109;
            this.cm = this.as.ah * 219395697;
            fi.wc.au(this.cf * 334129421, 627335149 * this.cl, this.cq, (float)(1540315502 * this.cm) / var10, 2709359);
            this.cg = client.wn * 1636039151;
            var13 = var1 - this.as.ah * 631525003 * (var7 + var11 - this.cf * -17556661);
            var14 = var2 - (var7 - (var12 - 627335149 * this.cl)) * this.as.ah * -112773775;
         }

         th.ev(var1, var2, var3, var4, 0, 847653599);
         if (1.0F == var10) {
            this.cq.az(var13, var14, -890666271);
         } else {
            this.cq.ap(var13, var14, (int)((float)var8 * var10), (int)(var10 * (float)var9), 564798997);
         }
      }

   }

   void ef(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (fi.wc != null) {
         int var7 = 512 / (1965172729 * this.as.ah);
         int var8 = 512 + var3;
         int var9 = var4 + -1206669943;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.bm(-817587101) - var5 / 2 - var7;
         int var12 = this.bd((byte)0) - var6 / 2 - var7;
         int var13 = var1 - this.as.ah * 1778852398 * (var7 + var11 - this.cf * 864807469);
         int var14 = var2 - (var7 - (var12 - this.cl * 627335149)) * 1669175771 * this.as.ah;
         if (this.aj(var8, var9, var13, var14, var3, var4, -2137082497)) {
            if (this.cq != null && this.cq.an == var8 && var9 == this.cq.aw) {
               Arrays.fill(this.cq.af, 0);
            } else {
               this.cq = new tq(var8, var9);
            }

            this.cf = (this.bm(-636371593) - var5 / 2 - var7) * -1316647483;
            this.cl = (this.bd((byte)0) - var6 / 2 - var7) * 1178523109;
            this.cm = this.as.ah * -1454354698;
            fi.wc.au(this.cf * -1497859011, -2022260021 * this.cl, this.cq, (float)(-966776445 * this.cm) / var10, -1255534434);
            this.cg = client.wn * 856129560;
            var13 = var1 - this.as.ah * -1804639353 * (var7 + var11 - this.cf * -244681139);
            var14 = var2 - (var7 - (var12 - -684341452 * this.cl)) * this.as.ah * -1655947893;
         }

         th.ev(var1, var2, var3, var4, 0, -193177846);
         if (1.0F == var10) {
            this.cq.az(var13, var14, 192);
         } else {
            this.cq.ap(var13, var14, (int)((float)var8 * var10), (int)(var10 * (float)var9), 923447464);
         }
      }

   }

   public void as(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         int[] var7 = new int[4];
         th.el(var7);
         th.es(var1, var2, var1 + var3, var2 + var4);
         th.em(var1, var2, var3, var4, -16777216);
         int var8 = this.aj.ac((byte)75);
         if (var8 < 100) {
            this.ae(var1, var2, var3, var4, var8, -2130359390);
         } else {
            if (!this.as.al(-1294765646)) {
               if (var6 >= -2105409406) {
                  throw new IllegalStateException();
               }

               this.as.af(this.aq, this.ar.aa(1804607176), client.ca, (short)-17915);
               if (!this.as.al(-1758646748)) {
                  return;
               }
            }

            if (this.bm != null) {
               if (var6 >= -2105409406) {
                  throw new IllegalStateException();
               }

               this.bt += 1698997397;
               if (this.bt * 1104873149 % (this.bo * 1369293643) == 0) {
                  if (var6 >= -2105409406) {
                     throw new IllegalStateException();
                  }

                  this.bt = 0;
                  this.bd += -297924373;
               }

               if (this.bd * 676356035 >= -1444238761 * this.bx) {
                  if (var6 >= -2105409406) {
                     return;
                  }

                  if (!this.bz) {
                     if (var6 >= -2105409406) {
                        return;
                     }

                     this.bm = null;
                  }
               }
            }

            int var9 = (int)Math.ceil((double)((float)var3 / this.ap));
            int var10 = (int)Math.ceil((double)((float)var4 / this.ap));
            this.as.aw(-84102297 * this.ak - var9 / 2, -632186207 * this.az - var10 / 2, this.ak * -84102297 + var9 / 2, var10 / 2 + this.az * -632186207, var1, var2, var1 + var3, var4 + var2, 1642688297);
            boolean var11;
            if (!this.bw) {
               var11 = false;
               if (var5 - 460446351 * this.ce > 100) {
                  if (var6 >= -2105409406) {
                     return;
                  }

                  this.ce = var5 * -2042100625;
                  var11 = true;
               }

               this.as.ac(this.ak * -84102297 - var9 / 2, -632186207 * this.az - var10 / 2, -84102297 * this.ak + var9 / 2, -632186207 * this.az + var10 / 2, var1, var2, var1 + var3, var2 + var4, this.bh, this.bm, this.bt * 1104873149, this.bo * 1369293643, var11, -1771656263);
            }

            this.ak(var1, var2, var3, var4, var9, var10, 1052800047);
            var11 = 324465533 * client.pu >= 2;
            if (var11) {
               if (var6 >= -2105409406) {
                  return;
               }

               if (this.ck) {
                  if (var6 >= -2105409406) {
                     throw new IllegalStateException();
                  }

                  if (this.cu != null) {
                     this.ax.ar("Coord: " + this.cu, 10 + th.bk, 20 + th.bi, 16776960, -1);
                  }
               }
            }

            this.bb = var9 * -410569687;
            this.bi = var10 * 224660999;
            this.be = -468823633 * var1;
            this.bk = var2 * -821936197;
            th.en(var7);
         }
      } catch (RuntimeException var12) {
         throw db.an(var12, "rb.as(" + ')');
      }
   }

   public void ej(int var1) {
      this.by = this.ap(var1, -2081373966);
   }

   void ea(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var1 + var3 / 2;
      int var8 = var2 + var4 / 2 - 18 - var6;
      th.em(var1, var2, var3, var4, -16777216);
      th.ek(var7 - 152, var8, 304, 34, -65536);
      th.em(var7 - 150, 2 + var8, var5 * 3, 30, -65536);
      this.ax.aj(mk.mb, var7, var6 + var8, -1, -1);
   }

   void eu(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var1 + var3 / 2;
      int var8 = var2 + var4 / 2 - 18 - var6;
      th.em(var1, var2, var3, var4, -16777216);
      th.ek(var7 - 152, var8, 304, 34, -65536);
      th.em(var7 - 150, 2 + var8, var5 * 3, 30, -65536);
      this.ax.aj(mk.mb, var7, var6 + var8, -1, -1);
   }

   public int eb() {
      if (1.0 == (double)this.by) {
         return 25;
      } else if (1.5 == (double)this.by) {
         return 37;
      } else if (2.0 == (double)this.by) {
         return 50;
      } else if ((double)this.by == 3.0) {
         return 75;
      } else {
         return (double)this.by == 4.0 ? 100 : 200;
      }
   }

   public void bz(int var1, int var2, int var3, int var4) {
      try {
         if (this.ar != null) {
            int[] var5 = this.ar.au(var1, var2, var3, (byte)6);
            if (var5 != null) {
               if (var4 >= 1119756096) {
                  return;
               }

               this.bx(var5[0], var5[1], -728678184);
            }

         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "rb.bz(" + ')');
      }
   }

   public int el() {
      if (1.0 == (double)this.by) {
         return 25;
      } else if (1.5 == (double)this.by) {
         return 37;
      } else if (2.0 == (double)this.by) {
         return 50;
      } else if ((double)this.by == 3.0) {
         return 75;
      } else {
         return (double)this.by == 4.0 ? 100 : 200;
      }
   }

   public void en() {
      this.aj.an(-1171421311);
   }

   void av(js var1, int var2) {
      try {
         this.ar = var1;
         this.as = new jv(this.ag, this.ai, this.al, this.at);
         this.aj.af(null == this.ar ? null : this.ar.aa(-743182555), -527718287);
      } catch (RuntimeException var3) {
         throw db.an(var3, "rb.av(" + ')');
      }
   }

   public boolean eg() {
      return this.aj.aw(-1961797245);
   }

   public boolean ed() {
      return this.aj.aw(-196690962);
   }

   void ci(byte var1) {
      try {
         this.bh.clear();
         this.bh.addAll(this.bl);
         this.bh.addAll(this.bc);
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.ci(" + ')');
      }
   }

   public js em(int var1) {
      Iterator var2 = this.ah.values().iterator();

      js var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (js)var2.next();
      } while(var3.al(-964267539) != var1);

      return var3;
   }

   public js ew(int var1) {
      Iterator var2 = this.ah.values().iterator();

      js var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (js)var2.next();
      } while(var3.al(-964267539) != var1);

      return var3;
   }

   public void ex(int var1, int var2) {
      if (null != this.ar && this.ar.ac(var1, var2, 1578034803)) {
         this.ad = (var1 - this.ar.ai(16748608) * 64) * 2080912417;
         this.ae = (var2 - this.ar.ah(1184335355) * 64) * 667691095;
      }
   }

   float es(int var1) {
      if (var1 == 25) {
         return 1.0F;
      } else if (var1 == 1742266149) {
         return 1.5F;
      } else if (var1 == -1540522212) {
         return 2.0F;
      } else if (75 == var1) {
         return 3.0F;
      } else {
         return 100 == var1 ? 4.0F : 8.0F;
      }
   }

   public void ek(int var1, int var2) {
      if (null != this.ar && this.ar.ac(var1, var2, 1872286011)) {
         this.ad = (var1 - this.ar.ai(16748608) * 64) * 2080912417;
         this.ae = (var2 - this.ar.ah(-1123269894) * 64) * 667691095;
      }
   }

   public void az(int var1, int var2, int var3, int var4, byte var5) {
      try {
         if (!this.aj.aw(256893588)) {
            if (var5 == 0) {
               throw new IllegalStateException();
            }
         } else {
            if (!this.as.al(-1309897584)) {
               if (var5 == 0) {
                  throw new IllegalStateException();
               }

               this.as.af(this.aq, this.ar.aa(58467529), client.ca, (short)-7862);
               if (!this.as.al(-1299215513)) {
                  if (var5 == 0) {
                     return;
                  }

                  return;
               }
            }

            this.as.au(var1, var2, var3, var4, this.bm, 1104873149 * this.bt, 1369293643 * this.bo, -1814142483);
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "rb.az(" + ')');
      }
   }

   public void ec(int var1, int var2) {
      if (null != this.ar) {
         this.al(var1 - this.ar.ai(16748608) * 64, var2 - this.ar.ah(-915074454) * 64, true, (short)254);
         this.ad = -2080912417;
         this.ae = -667691095;
      }
   }

   public void ei(int var1, int var2) {
      if (null != this.ar) {
         this.al(var1 - this.ar.ai(16748608) * 64, var2 - this.ar.ah(499159204) * 64, true, (short)254);
         this.ad = -2080912417;
         this.ae = -667691095;
      }
   }

   public void ee(int var1, int var2, int var3) {
      if (null != this.ar) {
         int[] var4 = this.ar.au(var1, var2, var3, (byte)6);
         if (var4 != null) {
            this.bk(var4[0], var4[1], (byte)5);
         }

      }
   }

   public boolean bh(short var1) {
      try {
         boolean var10000;
         if (!this.bw) {
            if (var1 != 480) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.bh(" + ')');
      }
   }

   public void fs(int var1, int var2, int var3) {
      if (this.ar != null) {
         int[] var4 = this.ar.au(var1, var2, var3, (byte)6);
         if (var4 != null) {
            this.bx(var4[0], var4[1], -759678660);
         }

      }
   }

   public void fi(int var1, int var2, int var3) {
      if (this.ar != null) {
         int[] var4 = this.ar.au(var1, var2, var3, (byte)6);
         if (var4 != null) {
            this.bx(var4[0], var4[1], 1399258254);
         }

      }
   }

   public void fh(int var1, int var2, int var3) {
      if (this.ar != null) {
         int[] var4 = this.ar.au(var1, var2, var3, (byte)6);
         if (var4 != null) {
            this.bx(var4[0], var4[1], -2000294595);
         }

      }
   }

   public void de(int var1) {
      js var2 = this.be(var1, -290510451);
      if (null != var2) {
         this.ah(var2, -1483320853);
      }

   }

   public boolean gc() {
      return !this.bw;
   }

   public int fo() {
      return this.ar == null ? -1 : -632186207 * this.az + this.ar.ah(-275144775) * 64;
   }

   public void bv(int var1) {
      try {
         this.bm = null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.bv(" + ')');
      }
   }

   public lb fd() {
      return this.ar == null ? null : this.ar.ab(this.bm(-624867937), this.bd((byte)0), 1507339067);
   }

   public void bc(int var1, boolean var2, int var3) {
      try {
         if (!var2) {
            this.bp.add(var1);
         } else {
            this.bp.remove(var1);
         }

         for(int var4 = 0; var4 < mo.aw * -1703136055; ++var4) {
            if (var3 >= 1175110911) {
               return;
            }

            if (nf.an(var4, 1913218168) == null) {
               if (var3 >= 1175110911) {
                  throw new IllegalStateException();
               }
            } else if (nf.an(var4, 2138770387).ae * -461862935 == var1) {
               if (var3 >= 1175110911) {
                  return;
               }

               int var5 = nf.an(var4, 2024786461).au * 219774827;
               if (!var2) {
                  if (var3 >= 1175110911) {
                     return;
                  }

                  this.bc.add(var5);
               } else {
                  this.bc.remove(var5);
               }
            }
         }

         this.ci((byte)-69);
      } catch (RuntimeException var6) {
         throw db.an(var6, "rb.bc(" + ')');
      }
   }

   public void fj() {
      this.bx = 1412277301;
   }

   public int fz() {
      return 1029371743 * this.bb;
   }

   public int fa() {
      return -1222006759 * this.bb;
   }

   public int fy() {
      return 1077411767 * this.bi;
   }

   public int fw() {
      return 1077411767 * this.bi;
   }

   public void fv(int var1) {
      if (var1 >= 1) {
         this.bx = -960896665 * var1;
      }

   }

   public void ft(int var1) {
      if (var1 >= 1) {
         this.bo = 787623523 * var1;
      }

   }

   public void fq(int var1) {
      if (var1 >= 1) {
         this.bx = -960896665 * var1;
      }

   }

   public void ck(nm var1, nm var2, nm var3, on var4, HashMap var5, tc[] var6) {
      this.ag = var6;
      this.aq = var1;
      this.al = var2;
      this.at = var3;
      this.ax = var4;
      this.ai = new HashMap();
      this.ai.put(jd.af, var5.get(aa));
      this.ai.put(jd.an, var5.get(ay));
      this.ai.put(jd.aw, var5.get(ao));
      this.aj = new rh(var1);
      int var7 = this.aq.cy(kq.af.ab, 1993066743);
      int[] var8 = this.aq.ck(var7, 194341237);
      int var9 = var8 == null ? 0 : var8.length;
      this.ah = new HashMap(var9);

      for(int var10 = 0; var10 < var9; ++var10) {
         sg var11 = new sg(this.aq.bh(var7, var8[var10], (byte)-65));
         js var12 = new js();
         var12.af(var11, var8[var10], (byte)-63);
         this.ah.put(var12.aa(-651851856), var12);
         if (var12.at(-926489840)) {
            this.av = var12;
         }
      }

      this.ah(this.av, -1483320853);
      this.am = null;
   }

   public void ff() {
      this.bx = 1187290418;
   }

   public int fr() {
      return 1083037913 * this.bi;
   }

   public void fg() {
      this.bx = 1412277301;
   }

   public void fk(int var1) {
      if (var1 >= 1) {
         this.bo = 787623523 * var1;
      }

   }

   public void fm(int var1) {
      if (var1 >= 1) {
         this.bo = -1736140796 * var1;
      }

   }

   void cz(int var1, int var2, boolean var3, long var4) {
      if (this.ar != null) {
         int var6 = (int)((float)(-84102297 * this.ak) + ((float)(var1 - this.be * 817997135) - (float)this.bj((byte)33) * this.ap / 2.0F) / this.ap);
         int var7 = (int)((float)(this.az * -632186207) - ((float)(var2 - this.bk * -1710969485) - (float)this.bn(1162890872) * this.ap / 2.0F) / this.ap);
         this.cu = this.ar.ab(var6 + this.ar.ai(16748608) * 64, var7 + this.ar.ah(-365940176) * 64, 1450739219);
         if (null != this.cu && var3) {
            hy var8 = client.sh;
            boolean var10 = client.pu * 324465533 >= 2;
            int var12;
            int var13;
            if (var10 && var8.av(82, -833825672) && var8.av(81, -200780249)) {
               int var15 = this.cu.an * -96298701;
               var12 = -2105445199 * this.cu.aw;
               var13 = this.cu.af * -113644749;
               lg var14 = mi.an(lv.cq, client.in.au, (short)-17742);
               var14.aw.eb(0, (byte)-38);
               var14.aw.dy(var15, (byte)43);
               var14.aw.dh(var13, (byte)-31);
               var14.aw.ds(var12, -1289180696);
               client.in.aw(var14, 414135591);
            } else {
               boolean var11 = true;
               if (this.bq) {
                  var12 = var1 - this.bu * -1959248683;
                  var13 = var2 - -1379608603 * this.bf;
                  if (var4 - 492133368256496125L * this.bg > 500L || var12 < -25 || var12 > 25 || var13 < -25 || var13 > 25) {
                     var11 = false;
                  }
               }

               if (var11) {
                  lg var16 = mi.an(lv.bv, client.in.au, (short)-1706);
                  var16.aw.el(this.cu.af(-964267539), -437883978);
                  client.in.aw(var16, 414135591);
                  this.bg = 0L;
               }
            }
         }
      } else {
         this.cu = null;
      }

   }

   public js ag(byte var1) {
      try {
         return this.ar;
      } catch (RuntimeException var2) {
         throw db.an(var2, "rb.ag(" + ')');
      }
   }

   public void gr() {
      this.bo = 726470486;
   }

   public void hv(int var1, int var2, lb var3, lb var4) {
      dr var5 = new dr();
      ki var6 = new ki(var2, var3, var4);
      var5.af(new Object[]{var6}, 472323075);
      switch (var1) {
         case 1008:
            var5.an(10, 877177744);
            break;
         case 1009:
            var5.an(11, 1792342728);
            break;
         case 1010:
            var5.an(12, 873828754);
            break;
         case 1011:
            var5.an(13, -1168135465);
            break;
         case 1012:
            var5.an(14, 366578524);
      }

      dh.af(var5, (byte)94);
   }

   public void gs(boolean var1) {
      this.bz = var1;
   }

   public void ao(int var1, int var2, int var3, boolean var4, byte var5) {
      try {
         js var6 = this.ay(var1, var2, var3, (byte)2);
         if (var6 == null) {
            if (var5 != 15) {
               throw new IllegalStateException();
            }

            if (!var4) {
               return;
            }

            var6 = this.av;
         }

         boolean var7;
         label53: {
            var7 = false;
            if (this.am == var6) {
               if (var5 != 15) {
                  throw new IllegalStateException();
               }

               if (!var4) {
                  break label53;
               }

               if (var5 != 15) {
                  throw new IllegalStateException();
               }
            }

            this.am = var6;
            this.ah(var6, -1483320853);
            var7 = true;
         }

         if (!var7) {
            if (var5 != 15) {
               throw new IllegalStateException();
            }

            if (!var4) {
               return;
            }

            if (var5 != 15) {
               throw new IllegalStateException();
            }
         }

         this.am(var1, var2, var3, -1605938577);
      } catch (RuntimeException var8) {
         throw db.an(var8, "rb.ao(" + ')');
      }
   }

   public void ez(int var1, int var2, int var3, int var4) {
      if (this.aj.aw(-1088693950)) {
         if (!this.as.al(-1141804607)) {
            this.as.af(this.aq, this.ar.aa(1905339062), client.ca, (short)-26488);
            if (!this.as.al(-1077022131)) {
               return;
            }
         }

         this.as.au(var1, var2, var3, var4, this.bm, 1104873149 * this.bt, 1369293643 * this.bo, -1683559746);
      }
   }

   public js ay(int var1, int var2, int var3, byte var4) {
      try {
         Iterator var5 = this.ah.values().iterator();

         js var6;
         do {
            if (!var5.hasNext()) {
               return null;
            }

            if (var4 != 2) {
               throw new IllegalStateException();
            }

            var6 = (js)var5.next();
         } while(!var6.aw(var1, var2, var3, -1323143702));

         if (var4 != 2) {
            throw new IllegalStateException();
         } else {
            return var6;
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "rb.ay(" + ')');
      }
   }

   public void ga() {
      this.bm = null;
   }

   public void gt() {
      this.bm = null;
   }

   public void gu(boolean var1) {
      this.bw = !var1;
   }

   public void gh(boolean var1) {
      this.bw = !var1;
   }

   public void gy(int var1, boolean var2) {
      if (!var2) {
         this.bp.add(var1);
      } else {
         this.bp.remove(var1);
      }

      for(int var3 = 0; var3 < mo.aw * -1703136055; ++var3) {
         if (nf.an(var3, 2090821109) != null && nf.an(var3, 2069841739).ae * -461862935 == var1) {
            int var4 = nf.an(var3, 1885379031).au * 219774827;
            if (!var2) {
               this.bc.add(var4);
            } else {
               this.bc.remove(var4);
            }
         }
      }

      this.ci((byte)-8);
   }

   void cj() {
      if (fi.wc != null) {
         this.ap = this.by;
      } else {
         if (this.ap < this.by) {
            this.ap = Math.min(this.by, this.ap / 30.0F + this.ap);
         }

         if (this.ap > this.by) {
            this.ap = Math.max(this.by, this.ap - this.ap / 30.0F);
         }

      }
   }

   public void gw(int var1, boolean var2) {
      if (!var2) {
         this.bp.add(var1);
      } else {
         this.bp.remove(var1);
      }

      for(int var3 = 0; var3 < mo.aw * 1597997186; ++var3) {
         if (nf.an(var3, 1985156763) != null && nf.an(var3, 2078803617).ae * -461862935 == var1) {
            int var4 = nf.an(var3, 1912725351).au * 219774827;
            if (!var2) {
               this.bc.add(var4);
            } else {
               this.bc.remove(var4);
            }
         }
      }

      this.ci((byte)-46);
   }

   void ah(js var1, int var2) {
      try {
         if (null != this.ar) {
            if (var2 != -1483320853) {
               throw new IllegalStateException();
            }

            if (this.ar == var1) {
               if (var2 != -1483320853) {
                  throw new IllegalStateException();
               }

               return;
            }
         }

         this.av(var1, 1081617147);
         this.am(-1, -1, -1, -1605938577);
      } catch (RuntimeException var3) {
         throw db.an(var3, "rb.ah(" + ')');
      }
   }

   public boolean gf() {
      return !this.bw;
   }

   public boolean gb() {
      return !this.bw;
   }

   public boolean gp() {
      return !this.bw;
   }

   public boolean gn(int var1) {
      return !this.bl.contains(var1);
   }

   public boolean gv(int var1) {
      return !this.bl.contains(var1);
   }

   public void dg(int var1) {
      js var2 = this.be(var1, -1398575365);
      if (null != var2) {
         this.ah(var2, -1483320853);
      }

   }

   void dj(js var1) {
      if (null == this.ar || this.ar != var1) {
         this.av(var1, 1910957520);
         this.am(-1, -1, -1, -1605938577);
      }
   }

   public void cv(int var1, int var2, boolean var3, boolean var4) {
      long var5 = dq.af(393761683);
      this.au(var1, var2, var4, var5);
      if (!this.aa(-1689610790) && (var4 || var3) && !gl.ok((byte)-80)) {
         if (var4) {
            this.bs = -463876578 * var1;
            this.br = -932549095 * var2;
            this.bj = 855346862 * this.ak;
            this.bn = -1697676280 * this.az;
         }

         if (-1 != 1942996257 * this.bj) {
            int var7 = var1 - this.bs * -642077217;
            int var8 = var2 - 333407723 * this.br;
            this.al(this.bj * -1960645157 - (int)((float)var7 / this.by), -1246558373 * this.bn + (int)((float)var8 / this.by), false, (short)254);
         }
      } else {
         this.at(1912554152);
      }

      if (var4) {
         this.bg = 7451806700989670229L * var5;
         this.bu = var1 * -836123571;
         this.bf = var2 * -88109587;
      }

   }

   public boolean hw(int var1) {
      return !this.bp.contains(var1);
   }

   public boolean hi(int var1) {
      return !this.bp.contains(var1);
   }

   public void hj(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.aj.aw(-861487943)) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.ap));
         int var8 = (int)Math.ceil((double)((float)var4 / this.ap));
         List var9 = this.as.ab(this.ak * -1441658470 - var7 / 2 - 1, -632186207 * this.az - var8 / 2 - 1, var7 / 2 + this.ak * 549119423 + 1, 1 + var8 / 2 + this.az * -632186207, var1, var2, var3, var4, var5, var6, -1292145755);
         if (!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if (!var10.hasNext()) {
                  return;
               }

               kg var11 = (kg)var10.next();
               hw var12 = nf.an(var11.an(-1871345500), 1900716447);
               var13 = false;

               for(int var14 = this.cs.length - 1; var14 >= 0; --var14) {
                  if (null != var12.ai[var14]) {
                     cb.kz(var12.ai[var14], var12.ag, this.cs[var14], var11.an(-1599503796), var11.al.af(-964267539), var11.aq.af(-964267539), (byte)90);
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   public lb hm(int var1, lb var2) {
      if (!this.aj.aw(-1702789221)) {
         return null;
      } else if (!this.as.al(-961870225)) {
         return null;
      } else if (!this.ar.ac(var2.an * -489974380, -2105445199 * var2.aw, 1743082541)) {
         return null;
      } else {
         HashMap var3 = this.as.at((byte)48);
         List var4 = (List)var3.get(var1);
         if (var4 != null && !var4.isEmpty()) {
            kg var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               kg var8;
               int var11;
               do {
                  if (!var7.hasNext()) {
                     return var5.aq;
                  }

                  var8 = (kg)var7.next();
                  int var9 = 1246852923 * var8.aq.an - -96298701 * var2.an;
                  int var10 = -2105445199 * var8.aq.aw - 1839674485 * var2.aw;
                  var11 = var9 * var9 + var10 * var10;
                  if (0 == var11) {
                     return var8.aq;
                  }
               } while(var11 >= var6 && null != var5);

               var5 = var8;
               var6 = var11;
            }
         } else {
            return null;
         }
      }
   }

   public lb hu(int var1, lb var2) {
      if (!this.aj.aw(1514629882)) {
         return null;
      } else if (!this.as.al(-1768695183)) {
         return null;
      } else if (!this.ar.ac(var2.an * -96298701, -2105445199 * var2.aw, 1549353516)) {
         return null;
      } else {
         HashMap var3 = this.as.at((byte)17);
         List var4 = (List)var3.get(var1);
         if (var4 != null && !var4.isEmpty()) {
            kg var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               kg var8;
               int var11;
               do {
                  if (!var7.hasNext()) {
                     return var5.aq;
                  }

                  var8 = (kg)var7.next();
                  int var9 = -96298701 * var8.aq.an - -96298701 * var2.an;
                  int var10 = -2105445199 * var8.aq.aw - -2105445199 * var2.aw;
                  var11 = var9 * var9 + var10 * var10;
                  if (0 == var11) {
                     return var8.aq;
                  }
               } while(var11 >= var6 && null != var5);

               var5 = var8;
               var6 = var11;
            }
         } else {
            return null;
         }
      }
   }

   public lb hx(int var1, lb var2) {
      if (!this.aj.aw(804079388)) {
         return null;
      } else if (!this.as.al(-1415624151)) {
         return null;
      } else if (!this.ar.ac(var2.an * -96298701, -2105445199 * var2.aw, 1845292277)) {
         return null;
      } else {
         HashMap var3 = this.as.at((byte)64);
         List var4 = (List)var3.get(var1);
         if (var4 != null && !var4.isEmpty()) {
            kg var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               kg var8;
               int var11;
               do {
                  if (!var7.hasNext()) {
                     return var5.aq;
                  }

                  var8 = (kg)var7.next();
                  int var9 = -96298701 * var8.aq.an - -96298701 * var2.an;
                  int var10 = -2105445199 * var8.aq.aw - -2105445199 * var2.aw;
                  var11 = var9 * var9 + var10 * var10;
                  if (0 == var11) {
                     return var8.aq;
                  }
               } while(var11 >= var6 && null != var5);

               var5 = var8;
               var6 = var11;
            }
         } else {
            return null;
         }
      }
   }

   public void ds(js var1, lb var2, lb var3, boolean var4) {
      if (null != var1) {
         if (null == this.ar || this.ar != var1) {
            this.av(var1, 1393824566);
         }

         if (!var4 && this.ar.aw(-113644749 * var2.af, -96298701 * var2.an, var2.aw * -2105445199, -586405943)) {
            this.am(-113644749 * var2.af, 493250459 * var2.an, var2.aw * -2054896381, -1605938577);
         } else {
            this.am(496726355 * var3.af, var3.an * 1592574919, var3.aw * -786479425, -1605938577);
         }

      }
   }

   public void fe(int var1, int var2, int var3) {
      if (null != this.ar) {
         int[] var4 = this.ar.au(var1, var2, var3, (byte)6);
         if (var4 != null) {
            this.bk(var4[0], var4[1], (byte)-6);
         }

      }
   }

   void ae(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         byte var7 = 20;
         int var8 = var1 + var3 / 2;
         int var9 = var2 + var4 / 2 - 18 - var7;
         th.em(var1, var2, var3, var4, -16777216);
         th.ek(var8 - 152, var9, 304, 34, -65536);
         th.em(var8 - 150, 2 + var9, var5 * 3, 30, -65536);
         this.ax.aj(mk.mb, var8, var7 + var9, -1, -1);
      } catch (RuntimeException var10) {
         throw db.an(var10, "rb.ae(" + ')');
      }
   }

   void aq(int var1) {
      try {
         if (!this.aa(-2020338429)) {
            if (var1 < -1419490017) {
               ;
            }
         } else {
            int var2 = this.ad * 506744801 - this.ak * -84102297;
            int var3 = this.ae * 1744520039 - this.az * -632186207;
            if (0 != var2) {
               if (var1 >= -1419490017) {
                  return;
               }

               var2 /= Math.min(8, Math.abs(var2));
            }

            if (var3 != 0) {
               var3 /= Math.min(8, Math.abs(var3));
            }

            this.al(-84102297 * this.ak + var2, var3 + this.az * -632186207, true, (short)254);
            if (this.ad * 506744801 == this.ak * -84102297) {
               if (var1 >= -1419490017) {
                  throw new IllegalStateException();
               }

               if (1744520039 * this.ae == this.az * -632186207) {
                  if (var1 >= -1419490017) {
                     throw new IllegalStateException();
                  }

                  this.ad = -2080912417;
                  this.ae = -667691095;
               }
            }

         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "rb.aq(" + ')');
      }
   }

   public kg hl() {
      if (!this.aj.aw(712642788)) {
         return null;
      } else if (!this.as.al(-1914642273)) {
         return null;
      } else {
         HashMap var1 = this.as.at((byte)39);
         this.cc = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.cc.addAll(var3);
         }

         this.cn = this.cc.iterator();
         return this.cu((byte)-38);
      }
   }

   public kg hh() {
      if (!this.aj.aw(-675499550)) {
         return null;
      } else if (!this.as.al(-1271376711)) {
         return null;
      } else {
         HashMap var1 = this.as.at((byte)53);
         this.cc = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.cc.addAll(var3);
         }

         this.cn = this.cc.iterator();
         return this.cu((byte)-31);
      }
   }

   public kg hr() {
      if (!this.aj.aw(-1414353828)) {
         return null;
      } else if (!this.as.al(-1035683175)) {
         return null;
      } else {
         HashMap var1 = this.as.at((byte)86);
         this.cc = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.cc.addAll(var3);
         }

         this.cn = this.cc.iterator();
         return this.cu((byte)-67);
      }
   }

   public lb cc(int var1, lb var2, int var3) {
      try {
         if (!this.aj.aw(-1310143333)) {
            if (var3 == 898848000) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (!this.as.al(-1165757098)) {
            if (var3 == 898848000) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (!this.ar.ac(var2.an * -96298701, -2105445199 * var2.aw, 1885384083)) {
            if (var3 == 898848000) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            HashMap var4 = this.as.at((byte)33);
            List var5 = (List)var4.get(var1);
            if (var5 != null) {
               if (var3 == 898848000) {
                  throw new IllegalStateException();
               }

               if (!var5.isEmpty()) {
                  kg var6 = null;
                  int var7 = -1;
                  Iterator var8 = var5.iterator();

                  while(var8.hasNext()) {
                     if (var3 == 898848000) {
                        throw new IllegalStateException();
                     }

                     kg var9 = (kg)var8.next();
                     int var10 = -96298701 * var9.aq.an - -96298701 * var2.an;
                     int var11 = -2105445199 * var9.aq.aw - -2105445199 * var2.aw;
                     int var12 = var10 * var10 + var11 * var11;
                     if (0 == var12) {
                        if (var3 == 898848000) {
                           throw new IllegalStateException();
                        }

                        return var9.aq;
                     }

                     if (var12 >= var7) {
                        if (null != var6) {
                           continue;
                        }

                        if (var3 == 898848000) {
                           throw new IllegalStateException();
                        }
                     }

                     var6 = var9;
                     var7 = var12;
                  }

                  return var6.aq;
               }

               if (var3 == 898848000) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var13) {
         throw db.an(var13, "rb.cc(" + ')');
      }
   }

   public kg hg() {
      if (this.cn == null) {
         return null;
      } else {
         kg var1;
         do {
            if (!this.cn.hasNext()) {
               return null;
            }

            var1 = (kg)this.cn.next();
         } while(var1.an(-79076450) == -1);

         return var1;
      }
   }

   public kg ho() {
      if (this.cn == null) {
         return null;
      } else {
         kg var1;
         do {
            if (!this.cn.hasNext()) {
               return null;
            }

            var1 = (kg)this.cn.next();
         } while(var1.an(-1655908686) == -1);

         return var1;
      }
   }

   public kg ht() {
      if (this.cn == null) {
         return null;
      } else {
         kg var1;
         do {
            if (!this.cn.hasNext()) {
               return null;
            }

            var1 = (kg)this.cn.next();
         } while(var1.an(-162582787) == -1);

         return var1;
      }
   }
}
