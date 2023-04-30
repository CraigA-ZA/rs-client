import accessors.RSNpc;

public final class df extends de implements RSNpc {
   int au;
   String aw;
   static final int ac = 31;
   static int aa = -1963015503;
   hv aq;
   hs af;
   static int al = -1714612375;
   hv at;
   static final int ae = 19136776;
   static final int ei = 1;
   public static final int bi = 8192;
   sx ab;

   protected final it an(byte var1) {
      try {
         if (this.af == null) {
            if (var1 >= 14) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            ha var10000;
            label109: {
               if (-1 != -1372355773 * this.ct) {
                  if (var1 >= 14) {
                     throw new IllegalStateException();
                  }

                  if (1253892101 * this.dm == 0) {
                     if (var1 >= 14) {
                        throw new IllegalStateException();
                     }

                     var10000 = dc.an(-1372355773 * this.ct, (byte)94);
                     break label109;
                  }
               }

               var10000 = null;
            }

            ha var2;
            label119: {
               var2 = var10000;
               if (-1 != -1302441815 * this.cz) {
                  label117: {
                     if (var1 >= 14) {
                        throw new IllegalStateException();
                     }

                     if (this.cz * -1302441815 == this.bt * 1590591885) {
                        if (var1 >= 14) {
                           throw new IllegalStateException();
                        }

                        if (var2 != null) {
                           break label117;
                        }

                        if (var1 >= 14) {
                           throw new IllegalStateException();
                        }
                     }

                     var10000 = dc.an(-1302441815 * this.cz, (byte)39);
                     break label119;
                  }
               }

               var10000 = null;
            }

            it var4;
            label91: {
               ha var3 = var10000;
               var4 = null;
               if (this.aq != null) {
                  if (var1 >= 14) {
                     throw new IllegalStateException();
                  }

                  if (this.aq.au) {
                     if (var1 >= 14) {
                        throw new IllegalStateException();
                     }

                     var4 = lq.mi.aw.aa(var2, -41215169 * this.cp, var3, this.cw * 424813829, (byte)17);
                     break label91;
                  }
               }

               var4 = this.af.ab(var2, this.cp * -41215169, var3, this.cw * 424813829, this.aq, (byte)46);
            }

            if (null == var4) {
               if (var1 >= 14) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var4.ai();
               this.de = var4.et * 2070391287;
               int var5 = var4.ao;
               var4 = this.cp(var4, (byte)127);
               if (1458410691 * this.af.al == 1) {
                  if (var1 >= 14) {
                     throw new IllegalStateException();
                  }

                  var4.bx = true;
               }

               if (this.dq != 0 && client.ep * -1886224337 >= 1182789041 * this.dh && -1886224337 * client.ep < 707232483 * this.dp) {
                  var4.cj = this.du;
                  var4.ch = this.db;
                  var4.ct = this.df;
                  var4.cp = this.dq;
                  var4.cd = (short)var5;
               } else {
                  var4.cp = 0;
               }

               return var4;
            }
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "df.an(" + ')');
      }
   }

   void af(String var1, int var2) {
      try {
         String var10001;
         if (null == var1) {
            if (var2 >= 427135973) {
               throw new IllegalStateException();
            }

            var10001 = "";
         } else {
            var10001 = var1;
         }

         this.aw = var10001;
      } catch (RuntimeException var3) {
         throw db.an(var3, "df.af(" + ')');
      }
   }

   final void bm(int var1, iu var2) {
      int var3 = this.dy[0];
      int var4 = this.ds[0];
      if (var1 == 0) {
         --var3;
         ++var4;
      }

      if (var1 == 1) {
         ++var4;
      }

      if (var1 == 2) {
         ++var3;
         ++var4;
      }

      if (3 == var1) {
         --var3;
      }

      if (var1 == 4) {
         ++var3;
      }

      if (var1 == 5) {
         --var3;
         --var4;
      }

      if (6 == var1) {
         --var4;
      }

      if (var1 == 7) {
         ++var3;
         --var4;
      }

      if (-1372355773 * this.ct != -1 && dc.an(-1372355773 * this.ct, (byte)126).bi * 1957040329 == 1) {
         this.ct = 1690721941;
      }

      if (1134756167 * this.dn < 9) {
         this.dn += 400971895;
      }

      for(int var5 = this.dn * 1134756167; var5 > 0; --var5) {
         this.dy[var5] = this.dy[var5 - 1];
         this.ds[var5] = this.ds[var5 - 1];
         this.da[var5] = this.da[var5 - 1];
      }

      this.dy[0] = var3;
      this.ds[0] = var4;
      this.da[0] = var2;
   }

   final void bt(int var1, iu var2) {
      int var3 = this.dy[0];
      int var4 = this.ds[0];
      if (var1 == 0) {
         --var3;
         ++var4;
      }

      if (var1 == 1) {
         ++var4;
      }

      if (var1 == 2) {
         ++var3;
         ++var4;
      }

      if (3 == var1) {
         --var3;
      }

      if (var1 == 4) {
         ++var3;
      }

      if (var1 == 5) {
         --var3;
         --var4;
      }

      if (6 == var1) {
         --var4;
      }

      if (var1 == 7) {
         ++var3;
         --var4;
      }

      if (-1372355773 * this.ct != -1 && dc.an(-1372355773 * this.ct, (byte)89).bi * -480870242 == 1) {
         this.ct = -1877124267;
      }

      if (1134756167 * this.dn < 9) {
         this.dn += 1815817733;
      }

      for(int var5 = this.dn * -253020415; var5 > 0; --var5) {
         this.dy[var5] = this.dy[var5 - 1];
         this.ds[var5] = this.ds[var5 - 1];
         this.da[var5] = this.da[var5 - 1];
      }

      this.dy[0] = var3;
      this.ds[0] = var4;
      this.da[0] = var2;
   }

   void ci() {
      this.ab = null;
   }

   final void aa(int var1, iu var2, byte var3) {
      try {
         int var4 = this.dy[0];
         int var5 = this.ds[0];
         if (var1 == 0) {
            if (var3 <= 104) {
               throw new IllegalStateException();
            }

            --var4;
            ++var5;
         }

         if (var1 == 1) {
            if (var3 <= 104) {
               throw new IllegalStateException();
            }

            ++var5;
         }

         if (var1 == 2) {
            ++var4;
            ++var5;
         }

         if (3 == var1) {
            if (var3 <= 104) {
               return;
            }

            --var4;
         }

         if (var1 == 4) {
            ++var4;
         }

         if (var1 == 5) {
            if (var3 <= 104) {
               throw new IllegalStateException();
            }

            --var4;
            --var5;
         }

         if (6 == var1) {
            if (var3 <= 104) {
               return;
            }

            --var5;
         }

         if (var1 == 7) {
            if (var3 <= 104) {
               throw new IllegalStateException();
            }

            ++var4;
            --var5;
         }

         if (-1372355773 * this.ct != -1) {
            if (var3 <= 104) {
               throw new IllegalStateException();
            }

            if (dc.an(-1372355773 * this.ct, (byte)121).bi * 1957040329 == 1) {
               if (var3 <= 104) {
                  throw new IllegalStateException();
               }

               this.ct = 1690721941;
            }
         }

         if (1134756167 * this.dn < 9) {
            if (var3 <= 104) {
               return;
            }

            this.dn += 400971895;
         }

         for(int var6 = this.dn * 1134756167; var6 > 0; --var6) {
            if (var3 <= 104) {
               throw new IllegalStateException();
            }

            this.dy[var6] = this.dy[var6 - 1];
            this.ds[var6] = this.ds[var6 - 1];
            this.da[var6] = this.da[var6 - 1];
         }

         this.dy[0] = var4;
         this.ds[0] = var5;
         this.da[0] = var2;
      } catch (RuntimeException var7) {
         throw db.an(var7, "df.aa(" + ')');
      }
   }

   final void ay(int var1, int var2, boolean var3, int var4) {
      try {
         if (-1 != this.ct * -1372355773) {
            if (var4 == 1913276055) {
               throw new IllegalStateException();
            }

            if (dc.an(this.ct * -1372355773, (byte)0).bi * 1957040329 == 1) {
               this.ct = 1690721941;
            }
         }

         if (!var3) {
            int var5 = var1 - this.dy[0];
            int var6 = var2 - this.ds[0];
            if (var5 >= -8) {
               if (var4 == 1913276055) {
                  throw new IllegalStateException();
               }

               if (var5 <= 8) {
                  if (var4 == 1913276055) {
                     return;
                  }

                  if (var6 >= -8) {
                     if (var4 == 1913276055) {
                        throw new IllegalStateException();
                     }

                     if (var6 <= 8) {
                        if (var4 == 1913276055) {
                           throw new IllegalStateException();
                        }

                        if (this.dn * 1134756167 < 9) {
                           if (var4 == 1913276055) {
                              throw new IllegalStateException();
                           }

                           this.dn += 400971895;
                        }

                        for(int var7 = this.dn * 1134756167; var7 > 0; --var7) {
                           if (var4 == 1913276055) {
                              throw new IllegalStateException();
                           }

                           this.dy[var7] = this.dy[var7 - 1];
                           this.ds[var7] = this.ds[var7 - 1];
                           this.da[var7] = this.da[var7 - 1];
                        }

                        this.dy[0] = var1;
                        this.ds[0] = var2;
                        this.da[0] = iu.aw;
                        return;
                     }
                  }
               }
            }
         }

         this.dn = 0;
         this.eo = 0;
         this.ep = 0;
         this.dy[0] = var1;
         this.ds[0] = var2;
         this.bx = -1102445696 * this.dy[0] + -1606165824 * this.bm;
         this.bo = this.bm * 254242752 + -1887439488 * this.ds[0];
      } catch (RuntimeException var8) {
         throw db.an(var8, "df.ay(" + ')');
      }
   }

   void az(String var1) {
      this.aw = null == var1 ? "" : var1;
   }

   final boolean as(int var1) {
      try {
         if (null == this.af) {
            if (var1 != 1666539507) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "df.as(" + ')');
      }
   }

   int[] ao(byte var1) {
      try {
         if (this.ab != null) {
            if (var1 != 14) {
               throw new IllegalStateException();
            } else {
               return this.ab.af((byte)-91);
            }
         } else {
            return this.af.ag(-1475728711);
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "df.ao(" + ')');
      }
   }

   final void bs(int var1, int var2, boolean var3) {
      if (-1 != this.ct * -1372355773 && dc.an(this.ct * -1372355773, (byte)54).bi * 1957040329 == 1) {
         this.ct = 1690721941;
      }

      if (!var3) {
         int var4 = var1 - this.dy[0];
         int var5 = var2 - this.ds[0];
         if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if (this.dn * 1134756167 < 9) {
               this.dn += 400971895;
            }

            for(int var6 = this.dn * 1134756167; var6 > 0; --var6) {
               this.dy[var6] = this.dy[var6 - 1];
               this.ds[var6] = this.ds[var6 - 1];
               this.da[var6] = this.da[var6 - 1];
            }

            this.dy[0] = var1;
            this.ds[0] = var2;
            this.da[0] = iu.aw;
            return;
         }
      }

      this.dn = 0;
      this.eo = 0;
      this.ep = 0;
      this.dy[0] = var1;
      this.ds[0] = var2;
      this.bx = -1102445696 * this.dy[0] + -1606165824 * this.bm;
      this.bo = this.bm * 254242752 + -1887439488 * this.ds[0];
   }

   void ai(int var1, int var2, short var3, int var4) {
      try {
         if (this.ab == null) {
            if (var4 <= 1131785934) {
               return;
            }

            this.ab = new sx(this.af);
         }

         this.ab.aw(var1, var2, var3, 164406269);
      } catch (RuntimeException var5) {
         throw db.an(var5, "df.ai(" + ')');
      }
   }

   void cl() {
      this.at = null;
   }

   void bw(int[] var1, short[] var2) {
      if (this.ab == null) {
         this.ab = new sx(this.af);
      }

      this.ab.ac(var1, var2, (byte)12);
   }

   void av(hv var1, int var2) {
      try {
         this.at = var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "df.av(" + ')');
      }
   }

   hv ar(int var1) {
      try {
         return this.at;
      } catch (RuntimeException var2) {
         throw db.an(var2, "df.ar(" + ')');
      }
   }

   void am(hv var1, int var2) {
      try {
         this.aq = var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "df.am(" + ')');
      }
   }

   void bc(int var1, int var2, short var3) {
      if (this.ab == null) {
         this.ab = new sx(this.af);
      }

      this.ab.aw(var1, var2, var3, 918437832);
   }

   void ak(byte var1) {
      try {
         this.aq = null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "df.ak(" + ')');
      }
   }

   protected final it au() {
      if (this.af == null) {
         return null;
      } else {
         ha var1 = -1 != -1372355773 * this.ct && 1253892101 * this.dm == 0 ? dc.an(-1372355773 * this.ct, (byte)100) : null;
         ha var2 = -1 != -1302441815 * this.cz && (this.cz * -1302441815 != this.bt * 1590591885 || var1 == null) ? dc.an(-1302441815 * this.cz, (byte)36) : null;
         it var3 = null;
         if (this.aq != null && this.aq.au) {
            var3 = lq.mi.aw.aa(var1, -41215169 * this.cp, var2, this.cw * 424813829, (byte)116);
         } else {
            var3 = this.af.ab(var1, this.cp * -41215169, var2, this.cw * 424813829, this.aq, (byte)-3);
         }

         if (null == var3) {
            return null;
         } else {
            var3.ai();
            this.de = var3.et * 2070391287;
            int var4 = var3.ao;
            var3 = this.cp(var3, (byte)120);
            if (1458410691 * this.af.al == 1) {
               var3.bx = true;
            }

            if (this.dq != 0 && client.ep * -1886224337 >= 1182789041 * this.dh && -1886224337 * client.ep < 707232483 * this.dp) {
               var3.cj = this.du;
               var3.ch = this.db;
               var3.ct = this.df;
               var3.cp = this.dq;
               var3.cd = (short)var4;
            } else {
               var3.cp = 0;
            }

            return var3;
         }
      }
   }

   protected final it ab() {
      if (this.af == null) {
         return null;
      } else {
         ha var1 = -1 != 1827920268 * this.ct && -533950944 * this.dm == 0 ? dc.an(-1372355773 * this.ct, (byte)79) : null;
         ha var2 = -1 != -1302441815 * this.cz && (this.cz * -1302441815 != this.bt * 1590591885 || var1 == null) ? dc.an(-1671312967 * this.cz, (byte)108) : null;
         it var3 = null;
         if (this.aq != null && this.aq.au) {
            var3 = lq.mi.aw.aa(var1, -1838752898 * this.cp, var2, this.cw * 424813829, (byte)88);
         } else {
            var3 = this.af.ab(var1, this.cp * 1520322154, var2, this.cw * -1443494667, this.aq, (byte)-32);
         }

         if (null == var3) {
            return null;
         } else {
            var3.ai();
            this.de = var3.et * 2070391287;
            int var4 = var3.ao;
            var3 = this.cp(var3, (byte)107);
            if (1458410691 * this.af.al == 1) {
               var3.bx = true;
            }

            if (this.dq != 0 && client.ep * -1313766902 >= 1182789041 * this.dh && -1886224337 * client.ep < 707232483 * this.dp) {
               var3.cj = this.du;
               var3.ch = this.db;
               var3.ct = this.df;
               var3.cp = this.dq;
               var3.cd = (short)var4;
            } else {
               var3.cp = 0;
            }

            return var3;
         }
      }
   }

   short[] ax(int var1) {
      try {
         if (this.ab != null) {
            if (var1 == 1759508233) {
               throw new IllegalStateException();
            } else {
               return this.ab.an(496795655);
            }
         } else {
            return this.af.av(800844396);
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "df.ax(" + ')');
      }
   }

   protected final it al() {
      if (this.af == null) {
         return null;
      } else {
         ha var1 = -1 != -1372355773 * this.ct && 6917641 * this.dm == 0 ? dc.an(-278887549 * this.ct, (byte)117) : null;
         ha var2 = -1 == -1302441815 * this.cz || this.cz * 1105722490 == this.bt * 1590591885 && var1 != null ? null : dc.an(-1020505610 * this.cz, (byte)122);
         it var3 = null;
         if (this.aq != null && this.aq.au) {
            var3 = lq.mi.aw.aa(var1, 934493175 * this.cp, var2, this.cw * 424813829, (byte)80);
         } else {
            var3 = this.af.ab(var1, this.cp * 464974006, var2, this.cw * -1117056257, this.aq, (byte)-36);
         }

         if (null == var3) {
            return null;
         } else {
            var3.ai();
            this.de = var3.et * 2070391287;
            int var4 = var3.ao;
            var3 = this.cp(var3, (byte)127);
            if (431254778 * this.af.al == 1) {
               var3.bx = true;
            }

            if (this.dq != 0 && client.ep * 1266497927 >= -845093896 * this.dh && -1886224337 * client.ep < 707232483 * this.dp) {
               var3.cj = this.du;
               var3.ch = this.db;
               var3.ct = this.df;
               var3.cp = this.dq;
               var3.cd = (short)var4;
            } else {
               var3.cp = 0;
            }

            return var3;
         }
      }
   }

   final boolean cx() {
      return null != this.af;
   }

   final boolean cv() {
      return null != this.af;
   }

   void cr() {
      this.aq = null;
   }

   void ad(String var1) {
      this.aw = null == var1 ? "" : var1;
   }

   boolean be(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (-189357307 * this.au & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   void ap(String var1) {
      this.aw = null == var1 ? "" : var1;
   }

   void by(int var1) {
      this.au = 1731572173 * var1;
   }

   void bb(int var1) {
      this.au = 1731572173 * var1;
   }

   boolean bi(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (-2075850623 * this.au & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   void bp(int var1, int var2, short var3) {
      if (this.ab == null) {
         this.ab = new sx(this.af);
      }

      this.ab.aw(var1, var2, var3, 1818907800);
   }

   final String bz() {
      if (!this.aw.isEmpty()) {
         return this.aw;
      } else {
         hs var1 = this.af;
         if (null != var1.bn) {
            var1 = var1.at(-1568052979);
            if (null == var1) {
               var1 = this.af;
            }
         }

         return var1.aq;
      }
   }

   boolean bx(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (-1158200279 * this.au & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   final String bo() {
      if (!this.aw.isEmpty()) {
         return this.aw;
      } else {
         hs var1 = this.af;
         if (null != var1.bn) {
            var1 = var1.at(1918593431);
            if (null == var1) {
               var1 = this.af;
            }
         }

         return var1.aq;
      }
   }

   void ag(int[] var1, short[] var2, int var3) {
      try {
         if (this.ab == null) {
            if (var3 == 427135973) {
               return;
            }

            this.ab = new sx(this.af);
         }

         this.ab.ac(var1, var2, (byte)12);
      } catch (RuntimeException var4) {
         throw db.an(var4, "df.ag(" + ')');
      }
   }

   void ae(String var1) {
      this.aw = null == var1 ? "" : var1;
   }

   final void bd(int var1, iu var2) {
      int var3 = this.dy[0];
      int var4 = this.ds[0];
      if (var1 == 0) {
         --var3;
         ++var4;
      }

      if (var1 == 1) {
         ++var4;
      }

      if (var1 == 2) {
         ++var3;
         ++var4;
      }

      if (3 == var1) {
         --var3;
      }

      if (var1 == 4) {
         ++var3;
      }

      if (var1 == 5) {
         --var3;
         --var4;
      }

      if (6 == var1) {
         --var4;
      }

      if (var1 == 7) {
         ++var3;
         --var4;
      }

      if (-639622791 * this.ct != -1 && dc.an(587828475 * this.ct, (byte)94).bi * 1482394435 == 1) {
         this.ct = 931517835;
      }

      if (-504638426 * this.dn < 9) {
         this.dn += -1687050934;
      }

      for(int var5 = this.dn * 1134756167; var5 > 0; --var5) {
         this.dy[var5] = this.dy[var5 - 1];
         this.ds[var5] = this.ds[var5 - 1];
         this.da[var5] = this.da[var5 - 1];
      }

      this.dy[0] = var3;
      this.ds[0] = var4;
      this.da[0] = var2;
   }

   boolean ac(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 != 1164667978) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               if (var2 != 1164667978) {
                  throw new IllegalStateException();
               }

               boolean var10000;
               if ((-189357307 * this.au & 1 << var1) != 0) {
                  if (var2 != 1164667978) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               return var10000;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw db.an(var3, "df.ac(" + ')');
      }
   }

   final void bj(int var1, int var2, boolean var3) {
      if (-1 != this.ct * -1623717335 && dc.an(this.ct * -867463453, (byte)121).bi * 1957040329 == 1) {
         this.ct = -309083316;
      }

      if (!var3) {
         int var4 = var1 - this.dy[0];
         int var5 = var2 - this.ds[0];
         if (var4 >= -8 && var4 <= 8 && var5 >= -1635777588 && var5 <= 8) {
            if (this.dn * 222179878 < 9) {
               this.dn += 400971895;
            }

            for(int var6 = this.dn * 1134756167; var6 > 0; --var6) {
               this.dy[var6] = this.dy[var6 - 1];
               this.ds[var6] = this.ds[var6 - 1];
               this.da[var6] = this.da[var6 - 1];
            }

            this.dy[0] = var1;
            this.ds[0] = var2;
            this.da[0] = iu.aw;
            return;
         }
      }

      this.dn = 0;
      this.eo = 0;
      this.ep = 0;
      this.dy[0] = var1;
      this.ds[0] = var2;
      this.bx = -1102445696 * this.dy[0] + 828354898 * this.bm;
      this.bo = this.bm * -1974745916 + -1887439488 * this.ds[0];
   }

   final void bn(int var1, int var2, boolean var3) {
      if (-1 != this.ct * -1372355773 && dc.an(this.ct * -1372355773, (byte)64).bi * 1957040329 == 1) {
         this.ct = 1690721941;
      }

      if (!var3) {
         int var4 = var1 - this.dy[0];
         int var5 = var2 - this.ds[0];
         if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if (this.dn * 1134756167 < 9) {
               this.dn += 400971895;
            }

            for(int var6 = this.dn * 1134756167; var6 > 0; --var6) {
               this.dy[var6] = this.dy[var6 - 1];
               this.ds[var6] = this.ds[var6 - 1];
               this.da[var6] = this.da[var6 - 1];
            }

            this.dy[0] = var1;
            this.ds[0] = var2;
            this.da[0] = iu.aw;
            return;
         }
      }

      this.dn = 0;
      this.eo = 0;
      this.ep = 0;
      this.dy[0] = var1;
      this.ds[0] = var2;
      this.bx = -1102445696 * this.dy[0] + -1606165824 * this.bm;
      this.bo = this.bm * 254242752 + -1887439488 * this.ds[0];
   }

   final String at(int var1) {
      try {
         if (!this.aw.isEmpty()) {
            if (var1 >= -1061723035) {
               throw new IllegalStateException();
            } else {
               return this.aw;
            }
         } else {
            hs var2 = this.af;
            if (null != var2.bn) {
               var2 = var2.at(1440094468);
               if (null == var2) {
                  if (var1 >= -1061723035) {
                     throw new IllegalStateException();
                  }

                  var2 = this.af;
               }
            }

            return var2.aq;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "df.at(" + ')');
      }
   }

   int[] br() {
      return this.ab != null ? this.ab.af((byte)-84) : this.af.ag(-70273452);
   }

   int[] bg() {
      return this.ab != null ? this.ab.af((byte)-60) : this.af.ag(-1238951172);
   }

   short[] bu() {
      return this.ab != null ? this.ab.an(1926809919) : this.af.av(800844396);
   }

   short[] bf() {
      return this.ab != null ? this.ab.an(-1121309488) : this.af.av(800844396);
   }

   short[] bq() {
      return this.ab != null ? this.ab.an(-1067195649) : this.af.av(800844396);
   }

   void ba(int var1, int var2, short var3) {
      if (this.ab == null) {
         this.ab = new sx(this.af);
      }

      this.ab.aw(var1, var2, var3, -1442971356);
   }

   void bv(int var1, int var2, short var3) {
      if (this.ab == null) {
         this.ab = new sx(this.af);
      }

      this.ab.aw(var1, var2, var3, 1612667941);
   }

   void bl(int var1, int var2, short var3) {
      if (this.ab == null) {
         this.ab = new sx(this.af);
      }

      this.ab.aw(var1, var2, var3, 322632035);
   }

   protected final it aq() {
      if (this.af == null) {
         return null;
      } else {
         ha var1 = -1 != -1372355773 * this.ct && 1253892101 * this.dm == 0 ? dc.an(-1372355773 * this.ct, (byte)78) : null;
         ha var2 = -1 == -1302441815 * this.cz || this.cz * -1302441815 == this.bt * 1590591885 && var1 != null ? null : dc.an(-1302441815 * this.cz, (byte)103);
         it var3 = null;
         if (this.aq != null && this.aq.au) {
            var3 = lq.mi.aw.aa(var1, -41215169 * this.cp, var2, this.cw * 424813829, (byte)57);
         } else {
            var3 = this.af.ab(var1, this.cp * -41215169, var2, this.cw * 424813829, this.aq, (byte)-70);
         }

         if (null == var3) {
            return null;
         } else {
            var3.ai();
            this.de = var3.et * 2070391287;
            int var4 = var3.ao;
            var3 = this.cp(var3, (byte)117);
            if (1458410691 * this.af.al == 1) {
               var3.bx = true;
            }

            if (this.dq != 0 && client.ep * -1886224337 >= 1182789041 * this.dh && -1886224337 * client.ep < 707232483 * this.dp) {
               var3.cj = this.du;
               var3.ch = this.db;
               var3.ct = this.df;
               var3.cp = this.dq;
               var3.cd = (short)var4;
            } else {
               var3.cp = 0;
            }

            return var3;
         }
      }
   }

   void ah(byte var1) {
      try {
         this.ab = null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "df.ah(" + ')');
      }
   }

   void bh(int var1, int var2, short var3) {
      if (this.ab == null) {
         this.ab = new sx(this.af);
      }

      this.ab.aw(var1, var2, var3, -1697251199);
   }

   void cy() {
      this.aq = null;
   }

   void ce(int[] var1, short[] var2) {
      if (this.ab == null) {
         this.ab = new sx(this.af);
      }

      this.ab.ac(var1, var2, (byte)12);
   }

   void aw(int var1, int var2) {
      try {
         this.au = 1731572173 * var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "df.aw(" + ')');
      }
   }

   void cs(hv var1) {
      this.at = var1;
   }

   hv cc() {
      return this.at;
   }

   hv cn() {
      return this.at;
   }

   boolean bk(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (-189357307 * this.au & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   void aj(short var1) {
      try {
         this.at = null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "df.aj(" + ')');
      }
   }

   void ck(hv var1) {
      this.aq = var1;
   }

   void cq(hv var1) {
      this.aq = var1;
   }

   void cm() {
      this.at = null;
   }

   void cf() {
      this.at = null;
   }

   void ca(hv var1) {
      this.aq = var1;
   }

   void cg() {
      this.aq = null;
   }

   df() {
      try {
         super();
         this.aw = "";
         this.au = 2139129811;
      } catch (RuntimeException var1) {
         throw db.an(var1, "df.<init>(" + ')');
      }
   }

   void cu(hv var1) {
      this.aq = var1;
   }

   static final float au(int var0, int var1) {
      try {
         float var2 = 10075.0F - (float)var0;
         return (var2 * 1.0075567F - 75.56675F) / var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "df.au(" + ')');
      }
   }

   public static void af(nm var0, byte var1) {
      try {
         gl.af = var0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "df.af(" + ')');
      }
   }

   protected static final void bz(int var0) {
      try {
         pj.ay.af(-331366942);

         int var1;
         for(var1 = 0; var1 < 32; ++var1) {
            if (var0 != 599275396) {
               throw new IllegalStateException();
            }

            bm.ax[var1] = 0L;
         }

         for(var1 = 0; var1 < 32; ++var1) {
            if (var0 != 599275396) {
               return;
            }

            bm.ag[var1] = 0L;
         }

         mp.aq = 0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "df.bz(" + ')');
      }
   }
}
