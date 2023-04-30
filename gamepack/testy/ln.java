import accessors.RSMidiPcmStream;

public class ln extends bp implements RSMidiPcmStream {
   lq[][] ap;
   static mq oh;
   int aw;
   int[] ak;
   long bo;
   int[] ab;
   int[] aq;
   int[] ay;
   int[] at;
   int[] aa;
   lc bz;
   int[] ac;
   int[] al;
   int[] as;
   int[] aj;
   int bk;
   int[] az;
   int[] ad;
   int[] ae;
   int[] au;
   lq[][] by;
   lt bb;
   rc af;
   int be;
   int an;
   long bx;
   static final int ai = 2;
   boolean bi;
   int[] ao;

   void dy(int var1) {
      for(lq var2 = (lq)this.bz.an.aq(); null != var2; var2 = (lq)this.bz.an.at()) {
         if (var1 < 0 || 1021419297 * var2.af == var1) {
            if (null != var2.am) {
               var2.am.ak(bu.au * -1359271235 / 100);
               if (var2.am.ap()) {
                  this.bz.aw.af(var2.am);
               }

               var2.af((byte)-50);
            }

            if (var2.ag * -602614853 < 0) {
               this.ap[var2.af * -2031904173][-1006692268 * var2.ab] = null;
            }

            var2.ga();
         }
      }

   }

   public synchronized void af(int var1, byte var2) {
      try {
         this.an = 1881678515 * var1;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ln.af(" + ')');
      }
   }

   void ae(int var1, int var2) {
      try {
         for(lq var3 = (lq)this.bz.an.aq(); null != var3; var3 = (lq)this.bz.an.at()) {
            if (var1 >= 0) {
               if (var2 >= -1326450429) {
                  throw new IllegalStateException();
               }

               if (var1 != var3.af * 1021419297) {
                  continue;
               }

               if (var2 >= -1326450429) {
                  throw new IllegalStateException();
               }
            }

            if (var3.ag * -602614853 < 0) {
               if (var2 >= -1326450429) {
                  return;
               }

               this.ap[1021419297 * var3.af][-630482265 * var3.ab] = null;
               var3.ag = 0;
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "ln.ae(" + ')');
      }
   }

   public synchronized boolean aw(ld var1, nm var2, ba var3, int var4, int var5) {
      try {
         var1.an();
         boolean var6 = true;
         int[] var7 = null;
         if (var4 > 0) {
            var7 = new int[]{var4};
         }

         for(rl var8 = (rl)var1.af.aw(); null != var8; var8 = (rl)var1.af.ac()) {
            int var9 = (int)var8.hr;
            lz var10 = (lz)this.af.af((long)var9);
            if (null == var10) {
               byte[] var12 = var2.cn(var9, (byte)-18);
               lz var11;
               if (var12 == null) {
                  if (var5 >= -350669271) {
                     throw new IllegalStateException();
                  }

                  var11 = null;
               } else {
                  var11 = new lz(var12);
               }

               var10 = var11;
               if (null == var11) {
                  if (var5 >= -350669271) {
                     throw new IllegalStateException();
                  }

                  var6 = false;
                  continue;
               }

               this.af.an(var11, (long)var9);
            }

            if (!var10.af(var3, var8.af, var7, 875110520)) {
               if (var5 >= -350669271) {
                  throw new IllegalStateException();
               }

               var6 = false;
            }
         }

         if (var6) {
            if (var5 >= -350669271) {
               throw new IllegalStateException();
            }

            var1.aw();
         }

         return var6;
      } catch (RuntimeException var13) {
         throw db.an(var13, "ln.aw(" + ')');
      }
   }

   void do(int var1, int var2, int var3) {
      this.am(var1, var2, 64, (byte)40);
      if (0 != (this.as[var1] & 2)) {
         for(lq var4 = (lq)this.bz.an.al(); var4 != null; var4 = (lq)this.bz.an.aa()) {
            if (var1 == var4.af * 1021419297 && var4.ag * -602614853 < 0) {
               this.ap[var1][var4.ab * -630482265] = null;
               this.ap[var1][var2] = var4;
               int var5 = -279706293 * var4.at + (-1077015879 * var4.ay * var4.aa * 274954637 >> 12);
               var4.at += (var2 - var4.ab * -630482265 << 8) * -1343136669;
               var4.aa = (var5 - var4.at * -279706293) * -101879483;
               var4.ay = 230199296;
               var4.ab = var2 * -1339790057;
               return;
            }
         }
      }

      lz var8 = (lz)this.af.af((long)this.al[var1]);
      if (var8 != null) {
         br var9 = var8.an[var2];
         if (null != var9) {
            lq var6 = new lq();
            var6.af = var1 * -2055035679;
            var6.an = var8;
            var6.aw = var9;
            var6.ac = var8.ab[var2];
            var6.au = -1957781017 * var8.aq[var2];
            var6.ab = -1339790057 * var2;
            var6.aq = -284955771 * (1024 + -1979814511 * var8.af * var3 * var3 * var8.ac[var2] >> 11);
            var6.al = (var8.au[var2] & 255) * -539102003;
            var6.at = ((var2 << 8) - (var8.aw[var2] & 32767)) * -1343136669;
            var6.ao = 0;
            var6.ax = 0;
            var6.ai = 0;
            var6.ag = -81590643;
            var6.ah = 0;
            if (this.az[var1] == 0) {
               var6.am = bl.ac(var9, this.bq(var6, 1662776351), this.bv(var6, 991080098), this.bl(var6, -914493357));
            } else {
               var6.am = bl.ac(var9, this.bq(var6, 1689602258), 0, this.bl(var6, -1899251211));
               this.ar(var6, var8.aw[var2] < 0, 2135072701);
            }

            if (var8.aw[var2] < 0) {
               var6.am.aa(-1);
            }

            if (1959190999 * var6.au >= 0) {
               lq var7 = this.by[var1][1959190999 * var6.au];
               if (null != var7 && var7.ag * -602614853 < 0) {
                  this.ap[var1][-630482265 * var7.ab] = null;
                  var7.ag = 0;
               }

               this.by[var1][var6.au * 1959190999] = var6;
            }

            this.bz.an.an(var6);
            this.ap[var1][var2] = var6;
         }
      }
   }

   public synchronized void au(int var1) {
      try {
         for(lz var2 = (lz)this.af.aw(); null != var2; var2 = (lz)this.af.ac()) {
            var2.ga();
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "ln.au(" + ')');
      }
   }

   public synchronized void aa(ld var1, boolean var2, int var3) {
      try {
         this.ao((byte)-110);
         this.bb.af(var1.an);
         this.bi = var2;
         this.bx = 0L;
         int var4 = this.bb.ac();

         for(int var5 = 0; var5 < var4; ++var5) {
            this.bb.au(var5);
            this.bb.al(var5);
            this.bb.ab(var5);
         }

         this.be = this.bb.ax() * 911615763;
         this.bk = this.bb.au[this.be * -2130330853] * -1172591539;
         this.bo = this.bb.ao(this.bk * 2049666181) * -5361838125554816559L;
      } catch (RuntimeException var6) {
         throw db.an(var6, "ln.aa(" + ')');
      }
   }

   public synchronized void ao(byte var1) {
      try {
         this.bb.an();
         this.ap(-964267539);
      } catch (RuntimeException var2) {
         throw db.an(var2, "ln.ao(" + ')');
      }
   }

   public synchronized boolean ax(int var1) {
      try {
         return this.bb.aw();
      } catch (RuntimeException var2) {
         throw db.an(var2, "ln.ax(" + ')');
      }
   }

   public synchronized void ai(int var1, int var2, byte var3) {
      try {
         this.ag(var1, var2, (byte)-22);
      } catch (RuntimeException var4) {
         throw db.an(var4, "ln.ai(" + ')');
      }
   }

   void ag(int var1, int var2, byte var3) {
      try {
         this.aq[var1] = var2;
         this.at[var1] = var2 & -128;
         this.ah(var1, var2, 1627005536);
      } catch (RuntimeException var4) {
         throw db.an(var4, "ln.ag(" + ')');
      }
   }

   protected synchronized void bd(int[] var1, int var2, int var3) {
      if (this.bb.aw()) {
         int var4 = this.bb.an * this.aw * 437930689 / (-1938748707 * bu.au);

         do {
            long var5 = (long)var3 * (long)var4 + this.bx * 8370013022464380265L;
            if (this.bo * -8691691867109044431L - var5 >= 0L) {
               this.bx = var5 * 389160967981716185L;
               break;
            }

            int var7 = (int)((-8691691867109044431L * this.bo - 8370013022464380265L * this.bx + (long)var4 - 1L) / (long)var4);
            this.bx += (long)var4 * (long)var7 * 389160967981716185L;
            this.bz.at(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.bp(486029060);
         } while(this.bb.aw());
      }

      this.bz.at(var1, var2, var3);
   }

   void av(int var1, int var2, int var3, int var4) {
      try {
         this.am(var1, var2, 64, (byte)104);
         if (0 != (this.as[var1] & 2)) {
            if (var4 >= 283632252) {
               throw new IllegalStateException();
            }

            for(lq var5 = (lq)this.bz.an.al(); var5 != null; var5 = (lq)this.bz.an.aa()) {
               if (var4 >= 283632252) {
                  throw new IllegalStateException();
               }

               if (var1 == var5.af * 1021419297) {
                  if (var4 >= 283632252) {
                     throw new IllegalStateException();
                  }

                  if (var5.ag * -602614853 < 0) {
                     if (var4 >= 283632252) {
                        throw new IllegalStateException();
                     }

                     this.ap[var1][var5.ab * -630482265] = null;
                     this.ap[var1][var2] = var5;
                     int var6 = -279706293 * var5.at + (-1077015879 * var5.ay * var5.aa * 274954637 >> 12);
                     var5.at += (var2 - var5.ab * -630482265 << 8) * -1343136669;
                     var5.aa = (var6 - var5.at * -279706293) * -101879483;
                     var5.ay = 230199296;
                     var5.ab = var2 * -1339790057;
                     return;
                  }
               }
            }
         }

         lz var10 = (lz)this.af.af((long)this.al[var1]);
         if (var10 == null) {
            if (var4 >= 283632252) {
               throw new IllegalStateException();
            }
         } else {
            br var11 = var10.an[var2];
            if (null == var11) {
               if (var4 >= 283632252) {
                  throw new IllegalStateException();
               }
            } else {
               lq var7 = new lq();
               var7.af = var1 * -2055035679;
               var7.an = var10;
               var7.aw = var11;
               var7.ac = var10.ab[var2];
               var7.au = -1957781017 * var10.aq[var2];
               var7.ab = -1339790057 * var2;
               var7.aq = -284955771 * (1024 + -1979814511 * var10.af * var3 * var3 * var10.ac[var2] >> 11);
               var7.al = (var10.au[var2] & 255) * -539102003;
               var7.at = ((var2 << 8) - (var10.aw[var2] & 32767)) * -1343136669;
               var7.ao = 0;
               var7.ax = 0;
               var7.ai = 0;
               var7.ag = -81590643;
               var7.ah = 0;
               if (this.az[var1] == 0) {
                  if (var4 >= 283632252) {
                     throw new IllegalStateException();
                  }

                  var7.am = bl.ac(var11, this.bq(var7, 1876045884), this.bv(var7, 1797141600), this.bl(var7, -1585355620));
               } else {
                  var7.am = bl.ac(var11, this.bq(var7, 1905115536), 0, this.bl(var7, 2104687585));
                  boolean var10002;
                  if (var10.aw[var2] < 0) {
                     if (var4 >= 283632252) {
                        return;
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  this.ar(var7, var10002, 2135313615);
               }

               if (var10.aw[var2] < 0) {
                  if (var4 >= 283632252) {
                     throw new IllegalStateException();
                  }

                  var7.am.aa(-1);
               }

               if (1959190999 * var7.au >= 0) {
                  if (var4 >= 283632252) {
                     throw new IllegalStateException();
                  }

                  lq var8 = this.by[var1][1959190999 * var7.au];
                  if (null != var8 && var8.ag * -602614853 < 0) {
                     if (var4 >= 283632252) {
                        throw new IllegalStateException();
                     }

                     this.ap[var1][-630482265 * var8.ab] = null;
                     var8.ag = 0;
                  }

                  this.by[var1][var7.au * 1959190999] = var7;
               }

               this.bz.an.an(var7);
               this.ap[var1][var2] = var7;
            }
         }
      } catch (RuntimeException var9) {
         throw db.an(var9, "ln.av(" + ')');
      }
   }

   void ep(int var1) {
      for(lq var2 = (lq)this.bz.an.aq(); null != var2; var2 = (lq)this.bz.an.at()) {
         if (var1 < 0 || 1021419297 * var2.af == var1) {
            if (null != var2.am) {
               var2.am.ak(bu.au * -1359271235 / 100);
               if (var2.am.ap()) {
                  this.bz.aw.af(var2.am);
               }

               var2.af((byte)-35);
            }

            if (var2.ag * -602614853 < 0) {
               this.ap[var2.af * 1943353848][2011314404 * var2.ab] = null;
            }

            var2.ga();
         }
      }

   }

   void am(int var1, int var2, int var3, byte var4) {
      try {
         lq var5 = this.ap[var1][var2];
         if (null == var5) {
            if (var4 <= 3) {
               throw new IllegalStateException();
            }
         } else {
            this.ap[var1][var2] = null;
            if (0 != (this.as[var1] & 2)) {
               for(lq var6 = (lq)this.bz.an.aq(); null != var6; var6 = (lq)this.bz.an.at()) {
                  if (var4 <= 3) {
                     throw new IllegalStateException();
                  }

                  if (1021419297 * var6.af == 1021419297 * var5.af) {
                     if (var4 <= 3) {
                        throw new IllegalStateException();
                     }

                     if (var6.ag * -602614853 < 0) {
                        if (var4 <= 3) {
                           throw new IllegalStateException();
                        }

                        if (var6 != var5) {
                           if (var4 <= 3) {
                              throw new IllegalStateException();
                           }

                           var5.ag = 0;
                           break;
                        }
                     }
                  }
               }
            } else {
               var5.ag = 0;
            }

         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "ln.am(" + ')');
      }
   }

   void as(int var1, int var2, int var3, int var4) {
      try {
         ;
      } catch (RuntimeException var5) {
         throw db.an(var5, "ln.as(" + ')');
      }
   }

   void dj(int var1, int var2) {
   }

   void ak(int var1, int var2, int var3) {
      try {
         this.aa[var1] = var2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "ln.ak(" + ')');
      }
   }

   void az(int var1, int var2) {
      try {
         for(lq var3 = (lq)this.bz.an.aq(); null != var3; var3 = (lq)this.bz.an.at()) {
            if (var2 >= 1038029064) {
               throw new IllegalStateException();
            }

            if (var1 >= 0) {
               if (1021419297 * var3.af != var1) {
                  continue;
               }

               if (var2 >= 1038029064) {
                  return;
               }
            }

            if (null != var3.am) {
               if (var2 >= 1038029064) {
                  throw new IllegalStateException();
               }

               var3.am.ak(bu.au * -1359271235 / 100);
               if (var3.am.ap()) {
                  if (var2 >= 1038029064) {
                     throw new IllegalStateException();
                  }

                  this.bz.aw.af(var3.am);
               }

               var3.af((byte)-60);
            }

            if (var3.ag * -602614853 < 0) {
               if (var2 >= 1038029064) {
                  throw new IllegalStateException();
               }

               this.ap[var3.af * 1021419297][-630482265 * var3.ab] = null;
            }

            var3.ga();
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "ln.az(" + ')');
      }
   }

   void ad(int var1, int var2) {
      try {
         if (var1 < 0) {
            if (var2 <= -1202730735) {
               throw new IllegalStateException();
            } else {
               for(var1 = 0; var1 < 16; ++var1) {
                  if (var2 <= -1202730735) {
                     return;
                  }

                  this.ad(var1, 1171995547);
               }

            }
         } else {
            this.ac[var1] = 12800;
            this.au[var1] = 8192;
            this.ab[var1] = 16383;
            this.aa[var1] = 8192;
            this.ay[var1] = 0;
            this.ao[var1] = 8192;
            this.by(var1, (byte)-109);
            this.bn(var1, -1437271181);
            this.as[var1] = 0;
            this.aj[var1] = 32767;
            this.ak[var1] = 256;
            this.az[var1] = 0;
            this.br(var1, 8192, -1731550836);
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "ln.ad(" + ')');
      }
   }

   void ec() {
      int var1 = this.be * -2130330853;
      int var2 = this.bk * 2049666181;

      long var3;
      for(var3 = this.bo * -8691691867109044431L; this.bk * 2049666181 == var2; var3 = this.bb.ao(var2)) {
         while(this.bb.au[var1] == var2) {
            this.bb.au(var1);
            int var5 = this.bb.at(var1);
            if (1 == var5) {
               this.bb.aq();
               this.bb.ab(var1);
               if (this.bb.ai()) {
                  if (!this.bi || var2 == 0) {
                     this.ap(-964267539);
                     this.bb.an();
                     return;
                  }

                  this.bb.ag(var3);
               }
               break;
            }

            if ((var5 & 128) != 0) {
               this.bs(var5, -501765010);
            }

            this.bb.al(var1);
            this.bb.ab(var1);
         }

         var1 = this.bb.ax();
         var2 = this.bb.au[var1];
      }

      this.be = 911615763 * var1;
      this.bk = -1172591539 * var2;
      this.bo = -5361838125554816559L * var3;
   }

   void ap(int var1) {
      try {
         this.az(-1, 1037039964);
         this.ad(-1, 1613137555);

         int var2;
         for(var2 = 0; var2 < 16; ++var2) {
            if (var1 != -964267539) {
               return;
            }

            this.al[var2] = this.aq[var2];
         }

         for(var2 = 0; var2 < 16; ++var2) {
            if (var1 != -964267539) {
               throw new IllegalStateException();
            }

            this.at[var2] = this.aq[var2] & -128;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "ln.ap(" + ')');
      }
   }

   void eq(int var1) {
      if (var1 >= 0) {
         this.ac[var1] = 12800;
         this.au[var1] = 8192;
         this.ab[var1] = 16383;
         this.aa[var1] = 8192;
         this.ay[var1] = 0;
         this.ao[var1] = 8192;
         this.by(var1, (byte)-14);
         this.bn(var1, -1399202551);
         this.as[var1] = 0;
         this.aj[var1] = 32767;
         this.ak[var1] = 256;
         this.az[var1] = 0;
         this.br(var1, 8192, -1731550836);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.ad(var1, 605524522);
         }

      }
   }

   void bn(int var1, int var2) {
      try {
         if (0 != (this.as[var1] & 4)) {
            if (var2 >= 98808232) {
               throw new IllegalStateException();
            }

            for(lq var3 = (lq)this.bz.an.aq(); var3 != null; var3 = (lq)this.bz.an.at()) {
               if (var2 >= 98808232) {
                  throw new IllegalStateException();
               }

               if (var3.af * 1021419297 == var1) {
                  if (var2 >= 98808232) {
                     return;
                  }

                  var3.ak = 0;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "ln.bn(" + ')');
      }
   }

   void bs(int var1, int var2) {
      try {
         int var3 = var1 & 240;
         int var4;
         int var5;
         int var6;
         if (128 == var3) {
            if (var2 >= 102591832) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               var6 = var1 >> 16 & 127;
               this.am(var4, var5, var6, (byte)71);
            }
         } else if (144 == var3) {
            if (var2 >= 102591832) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               var6 = var1 >> 16 & 127;
               if (var6 > 0) {
                  if (var2 >= 102591832) {
                     return;
                  }

                  this.av(var4, var5, var6, -1380723164);
               } else {
                  this.am(var4, var5, 64, (byte)46);
               }

            }
         } else if (160 == var3) {
            if (var2 < 102591832) {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               var6 = var1 >> 16 & 127;
               this.as(var4, var5, var6, -939740093);
            }
         } else if (176 == var3) {
            if (var2 >= 102591832) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               var6 = var1 >> 16 & 127;
               if (var5 == 0) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.at[var4] = (var6 << 14) + (this.at[var4] & -2080769);
               }

               if (var5 == 32) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.at[var4] = (this.at[var4] & -16257) + (var6 << 7);
               }

               if (var5 == 1) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.ay[var4] = (this.ay[var4] & -16257) + (var6 << 7);
               }

               if (33 == var5) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.ay[var4] = (this.ay[var4] & -128) + var6;
               }

               if (5 == var5) {
                  this.ao[var4] = (this.ao[var4] & -16257) + (var6 << 7);
               }

               if (37 == var5) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.ao[var4] = (this.ao[var4] & -128) + var6;
               }

               if (7 == var5) {
                  this.ac[var4] = (this.ac[var4] & -16257) + (var6 << 7);
               }

               if (39 == var5) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.ac[var4] = var6 + (this.ac[var4] & -128);
               }

               if (10 == var5) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.au[var4] = (this.au[var4] & -16257) + (var6 << 7);
               }

               if (42 == var5) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.au[var4] = var6 + (this.au[var4] & -128);
               }

               if (11 == var5) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.ab[var4] = (this.ab[var4] & -16257) + (var6 << 7);
               }

               if (43 == var5) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.ab[var4] = var6 + (this.ab[var4] & -128);
               }

               int[] var10000;
               if (var5 == 64) {
                  if (var6 >= 64) {
                     if (var2 >= 102591832) {
                        throw new IllegalStateException();
                     }

                     var10000 = this.as;
                     var10000[var4] |= 1;
                  } else {
                     var10000 = this.as;
                     var10000[var4] &= -2;
                  }
               }

               if (65 == var5) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  if (var6 >= 64) {
                     var10000 = this.as;
                     var10000[var4] |= 2;
                  } else {
                     this.by(var4, (byte)-36);
                     var10000 = this.as;
                     var10000[var4] &= -3;
                  }
               }

               if (var5 == 99) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.aj[var4] = (var6 << 7) + (this.aj[var4] & 127);
               }

               if (var5 == 98) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.aj[var4] = var6 + (this.aj[var4] & 16256);
               }

               if (var5 == 101) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.aj[var4] = (this.aj[var4] & 127) + 16384 + (var6 << 7);
               }

               if (var5 == 100) {
                  if (var2 >= 102591832) {
                     return;
                  }

                  this.aj[var4] = var6 + 16384 + (this.aj[var4] & 16256);
               }

               if (120 == var5) {
                  this.az(var4, -1922101165);
               }

               if (121 == var5) {
                  if (var2 >= 102591832) {
                     return;
                  }

                  this.ad(var4, 794110733);
               }

               if (var5 == 123) {
                  if (var2 >= 102591832) {
                     return;
                  }

                  this.ae(var4, -2058759132);
               }

               int var7;
               if (var5 == 6) {
                  var7 = this.aj[var4];
                  if (16384 == var7) {
                     this.ak[var4] = (this.ak[var4] & -16257) + (var6 << 7);
                  }
               }

               if (38 == var5) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  var7 = this.aj[var4];
                  if (16384 == var7) {
                     this.ak[var4] = var6 + (this.ak[var4] & -128);
                  }
               }

               if (var5 == 16) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.az[var4] = (this.az[var4] & -16257) + (var6 << 7);
               }

               if (var5 == 48) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.az[var4] = var6 + (this.az[var4] & -128);
               }

               if (81 == var5) {
                  if (var2 >= 102591832) {
                     return;
                  }

                  if (var6 >= 64) {
                     if (var2 >= 102591832) {
                        return;
                     }

                     var10000 = this.as;
                     var10000[var4] |= 4;
                  } else {
                     this.bn(var4, -850992562);
                     var10000 = this.as;
                     var10000[var4] &= -5;
                  }
               }

               if (17 == var5) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.br(var4, (this.ad[var4] & -16257) + (var6 << 7), -1731550836);
               }

               if (49 == var5) {
                  if (var2 >= 102591832) {
                     throw new IllegalStateException();
                  }

                  this.br(var4, (this.ad[var4] & -128) + var6, -1731550836);
               }

            }
         } else if (192 == var3) {
            if (var2 >= 102591832) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               this.ah(var4, var5 + this.at[var4], 1612007289);
            }
         } else if (var3 == 208) {
            if (var2 < 102591832) {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               this.aj(var4, var5, 1736841186);
            }
         } else if (224 == var3) {
            if (var2 < 102591832) {
               var4 = var1 & 15;
               var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
               this.ak(var4, var5, 1611025845);
            }
         } else {
            var3 = var1 & 255;
            if (255 == var3) {
               if (var2 >= 102591832) {
                  throw new IllegalStateException();
               } else {
                  this.ap(-964267539);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "ln.bs(" + ')');
      }
   }

   void br(int var1, int var2, int var3) {
      try {
         this.ad[var1] = var2;
         this.ae[var1] = (int)(2097152.0 * Math.pow(2.0, 5.4931640625E-4 * (double)var2) + 0.5);
      } catch (RuntimeException var4) {
         throw db.an(var4, "ln.br(" + ')');
      }
   }

   int bq(lq var1, int var2) {
      try {
         int var3 = (274954637 * var1.aa * -1077015879 * var1.ay >> 12) + -279706293 * var1.at;
         var3 += this.ak[var1.af * 1021419297] * (this.aa[1021419297 * var1.af] - 8192) >> 12;
         lp var4 = var1.ac;
         int var5;
         if (var4.al * -1668380791 > 0) {
            label54: {
               if (var2 <= 1391456291) {
                  throw new IllegalStateException();
               }

               if (-1552238757 * var4.aq <= 0) {
                  if (var2 <= 1391456291) {
                     throw new IllegalStateException();
                  }

                  if (this.ay[var1.af * 1021419297] <= 0) {
                     break label54;
                  }

                  if (var2 <= 1391456291) {
                     throw new IllegalStateException();
                  }
               }

               var5 = var4.aq * -1552238757 << 2;
               int var6 = 391036783 * var4.at << 1;
               if (667306259 * var1.av < var6) {
                  if (var2 <= 1391456291) {
                     throw new IllegalStateException();
                  }

                  var5 = var5 * var1.av * 667306259 / var6;
               }

               var5 += this.ay[1021419297 * var1.af] >> 7;
               double var7 = Math.sin(0.01227184630308513 * (double)(var1.ar * -2032101041 & 511));
               var3 += (int)(var7 * (double)var5);
            }
         }

         var5 = (int)((double)(256 * var1.aw.af) * Math.pow(2.0, 3.255208333333333E-4 * (double)var3) / (double)(bu.au * -1359271235) + 0.5);
         int var10000;
         if (var5 < 1) {
            if (var2 <= 1391456291) {
               throw new IllegalStateException();
            }

            var10000 = 1;
         } else {
            var10000 = var5;
         }

         return var10000;
      } catch (RuntimeException var9) {
         throw db.an(var9, "ln.bq(" + ')');
      }
   }

   int bv(lq var1, int var2) {
      try {
         lp var3 = var1.ac;
         int var4 = this.ac[1021419297 * var1.af] * this.ab[1021419297 * var1.af] + 4096 >> 13;
         var4 = var4 * var4 + 16384 >> 15;
         var4 = var1.aq * -254585523 * var4 + 16384 >> 15;
         var4 = 128 + 1380277371 * this.an * var4 >> 8;
         if (354539497 * var3.aw > 0) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)(var3.aw * 354539497) * (double)(var1.ao * -814647939) * 1.953125E-5) + 0.5);
         }

         int var5;
         int var6;
         int var7;
         int var8;
         if (null != var3.af) {
            var5 = 873438947 * var1.ax;
            var6 = var3.af[1 + var1.ai * 891662681];
            if (891662681 * var1.ai < var3.af.length - 2) {
               if (var2 == 1171226834) {
                  throw new IllegalStateException();
               }

               var7 = (var3.af[var1.ai * 891662681] & 255) << 8;
               var8 = (var3.af[891662681 * var1.ai + 2] & 255) << 8;
               var6 += (var3.af[3 + 891662681 * var1.ai] - var6) * (var5 - var7) / (var8 - var7);
            }

            var4 = var4 * var6 + 32 >> 6;
         }

         if (-602614853 * var1.ag > 0) {
            if (var2 == 1171226834) {
               throw new IllegalStateException();
            }

            if (var3.an != null) {
               if (var2 == 1171226834) {
                  throw new IllegalStateException();
               }

               var5 = -602614853 * var1.ag;
               var6 = var3.an[1 + -371546193 * var1.ah];
               if (var1.ah * -371546193 < var3.an.length - 2) {
                  if (var2 == 1171226834) {
                     throw new IllegalStateException();
                  }

                  var7 = (var3.an[var1.ah * -371546193] & 255) << 8;
                  var8 = (var3.an[var1.ah * -371546193 + 2] & 255) << 8;
                  var6 += (var3.an[var1.ah * -371546193 + 3] - var6) * (var5 - var7) / (var8 - var7);
               }

               var4 = var6 * var4 + 32 >> 6;
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw db.an(var9, "ln.bv(" + ')');
      }
   }

   int bl(lq var1, int var2) {
      try {
         int var3 = this.au[var1.af * 1021419297];
         if (var3 < 8192) {
            if (var2 == 522688965) {
               throw new IllegalStateException();
            } else {
               return 32 + var3 * var1.al * 1083381765 >> 6;
            }
         } else {
            return 16384 - ((16384 - var3) * (128 - var1.al * 1083381765) + 32 >> 6);
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "ln.bl(" + ')');
      }
   }

   protected synchronized bp ab() {
      try {
         return this.bz;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ln.ab(" + ')');
      }
   }

   protected synchronized bp aq() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ln.aq(" + ')');
      }
   }

   protected synchronized int al() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ln.al(" + ')');
      }
   }

   protected synchronized void at(int[] var1, int var2, int var3) {
      try {
         if (this.bb.aw()) {
            int var4 = this.bb.an * this.aw * 437930689 / (-1359271235 * bu.au);

            do {
               long var5 = (long)var3 * (long)var4 + this.bx * 8370013022464380265L;
               if (this.bo * -8691691867109044431L - var5 >= 0L) {
                  this.bx = var5 * 389160967981716185L;
                  break;
               }

               int var7 = (int)((-8691691867109044431L * this.bo - 8370013022464380265L * this.bx + (long)var4 - 1L) / (long)var4);
               this.bx += (long)var4 * (long)var7 * 389160967981716185L;
               this.bz.at(var1, var2, var7);
               var2 += var7;
               var3 -= var7;
               this.bp(486029060);
            } while(this.bb.aw());
         }

         this.bz.at(var1, var2, var3);
      } catch (RuntimeException var8) {
         throw db.an(var8, "ln.at(" + ')');
      }
   }

   protected synchronized void bf(int var1) {
      if (this.bb.aw()) {
         int var2 = this.bb.an * 437930689 * this.aw / (-1359271235 * bu.au);

         do {
            long var3 = 8370013022464380265L * this.bx + (long)var2 * (long)var1;
            if (-8691691867109044431L * this.bo - var3 >= 0L) {
               this.bx = 389160967981716185L * var3;
               break;
            }

            int var5 = (int)((this.bo * -8691691867109044431L - 8370013022464380265L * this.bx + (long)var2 - 1L) / (long)var2);
            this.bx += (long)var5 * (long)var2 * 389160967981716185L;
            this.bz.ay(var5);
            var1 -= var5;
            this.bp(486029060);
         } while(this.bb.aw());
      }

      this.bz.ay(var1);
   }

   void bp(int var1) {
      try {
         int var2 = this.be * -2130330853;
         int var3 = this.bk * 2049666181;

         long var4;
         for(var4 = this.bo * -8691691867109044431L; this.bk * 2049666181 == var3; var4 = this.bb.ao(var3)) {
            if (var1 != 486029060) {
               throw new IllegalStateException();
            }

            while(this.bb.au[var2] == var3) {
               if (var1 != 486029060) {
                  return;
               }

               this.bb.au(var2);
               int var6 = this.bb.at(var2);
               if (1 == var6) {
                  if (var1 != 486029060) {
                     return;
                  }

                  this.bb.aq();
                  this.bb.ab(var2);
                  if (this.bb.ai()) {
                     if (!this.bi || var3 == 0) {
                        this.ap(-964267539);
                        this.bb.an();
                        return;
                     }

                     if (var1 != 486029060) {
                        throw new IllegalStateException();
                     }

                     this.bb.ag(var4);
                  }
                  break;
               }

               if ((var6 & 128) != 0) {
                  this.bs(var6, -1376449037);
               }

               this.bb.al(var2);
               this.bb.ab(var2);
            }

            var2 = this.bb.ax();
            var3 = this.bb.au[var2];
         }

         this.be = 911615763 * var2;
         this.bk = -1172591539 * var3;
         this.bo = -5361838125554816559L * var4;
      } catch (RuntimeException var7) {
         throw db.an(var7, "ln.bp(" + ')');
      }
   }

   public ln() {
      try {
         super();
         this.an = 673362688;
         this.aw = -1778707904;
         this.ac = new int[16];
         this.au = new int[16];
         this.ab = new int[16];
         this.aq = new int[16];
         this.al = new int[16];
         this.at = new int[16];
         this.aa = new int[16];
         this.ay = new int[16];
         this.ao = new int[16];
         this.as = new int[16];
         this.aj = new int[16];
         this.ak = new int[16];
         this.az = new int[16];
         this.ad = new int[16];
         this.ae = new int[16];
         this.ap = new lq[16][128];
         this.by = new lq[16][128];
         this.bb = new lt();
         this.bz = new lc(this);
         this.af = new rc(128);
         this.ap(-964267539);
      } catch (RuntimeException var1) {
         throw db.an(var1, "ln.<init>(" + ')');
      }
   }

   boolean bh(lq var1, int[] var2, int var3, int var4, int var5) {
      try {
         var1.as = 652897503 * (bu.au * -1359271235 / 100);
         if (-602614853 * var1.ag >= 0) {
            label233: {
               if (var5 == -1837375516) {
                  throw new IllegalStateException();
               }

               if (var1.am != null) {
                  if (var5 == -1837375516) {
                     throw new IllegalStateException();
                  }

                  if (!var1.am.ae()) {
                     break label233;
                  }

                  if (var5 == -1837375516) {
                     throw new IllegalStateException();
                  }
               }

               var1.af((byte)-61);
               var1.ga();
               if (1959190999 * var1.au > 0) {
                  if (var5 == -1837375516) {
                     throw new IllegalStateException();
                  }

                  if (var1 == this.by[var1.af * 1021419297][var1.au * 1959190999]) {
                     this.by[1021419297 * var1.af][var1.au * 1959190999] = null;
                  }
               }

               return true;
            }
         }

         int var6 = var1.ay * -1077015879;
         if (var6 > 0) {
            if (var5 == -1837375516) {
               throw new IllegalStateException();
            }

            var6 -= (int)(16.0 * Math.pow(2.0, (double)this.ao[1021419297 * var1.af] * 4.921259842519685E-4) + 0.5);
            if (var6 < 0) {
               var6 = 0;
            }

            var1.ay = var6 * -871310455;
         }

         var1.am.az(this.bq(var1, 1667221549));
         lp var7 = var1.ac;
         boolean var8 = false;
         var1.av += -1164121829;
         var1.ar += 100789159 * var7.al;
         double var9 = 5.086263020833333E-6 * (double)((274954637 * var1.aa * var1.ay * -1077015879 >> 12) + (-630482265 * var1.ab - 60 << 8));
         if (354539497 * var7.aw > 0) {
            if (var5 == -1837375516) {
               throw new IllegalStateException();
            }

            if (var7.ab * 821482501 > 0) {
               if (var5 == -1837375516) {
                  throw new IllegalStateException();
               }

               var1.ao += (int)(128.0 * Math.pow(2.0, (double)(821482501 * var7.ab) * var9) + 0.5) * 349596629;
            } else {
               var1.ao += 1798695552;
            }
         }

         if (null != var7.af) {
            if (var7.ac * -32542335 > 0) {
               if (var5 == -1837375516) {
                  throw new IllegalStateException();
               }

               var1.ax += (int)(128.0 * Math.pow(2.0, (double)(-32542335 * var7.ac) * var9) + 0.5) * -257124661;
            } else {
               var1.ax += 1447781760;
            }

            while(891662681 * var1.ai < var7.af.length - 2) {
               if (var5 == -1837375516) {
                  throw new IllegalStateException();
               }

               if (var1.ax * 873438947 <= (var7.af[var1.ai * 891662681 + 2] & 255) << 8) {
                  break;
               }

               if (var5 == -1837375516) {
                  throw new IllegalStateException();
               }

               var1.ai += -934605358;
            }

            if (var1.ai * 891662681 == var7.af.length - 2) {
               if (var5 == -1837375516) {
                  throw new IllegalStateException();
               }

               if (0 == var7.af[1 + 891662681 * var1.ai]) {
                  if (var5 == -1837375516) {
                     throw new IllegalStateException();
                  }

                  var8 = true;
               }
            }
         }

         if (var1.ag * -602614853 >= 0) {
            if (var5 == -1837375516) {
               throw new IllegalStateException();
            }

            if (var7.an != null) {
               if (var5 == -1837375516) {
                  throw new IllegalStateException();
               }

               if (0 == (this.as[1021419297 * var1.af] & 1)) {
                  label229: {
                     if (var5 == -1837375516) {
                        throw new IllegalStateException();
                     }

                     if (var1.au * 1959190999 >= 0) {
                        if (var5 == -1837375516) {
                           throw new IllegalStateException();
                        }

                        if (var1 == this.by[var1.af * 1021419297][var1.au * 1959190999]) {
                           break label229;
                        }

                        if (var5 == -1837375516) {
                           throw new IllegalStateException();
                        }
                     }

                     if (-574961187 * var7.au > 0) {
                        var1.ag += (int)(128.0 * Math.pow(2.0, (double)(var7.au * -574961187) * var9) + 0.5) * 81590643;
                     } else {
                        var1.ag += 1853667712;
                     }

                     while(var1.ah * -371546193 < var7.an.length - 2 && -602614853 * var1.ag > (var7.an[2 + -371546193 * var1.ah] & 255) << 8) {
                        if (var5 == -1837375516) {
                           throw new IllegalStateException();
                        }

                        var1.ah += 2121932446;
                     }

                     if (var7.an.length - 2 == var1.ah * -371546193) {
                        if (var5 == -1837375516) {
                           throw new IllegalStateException();
                        }

                        var8 = true;
                     }
                  }
               }
            }
         }

         if (var8) {
            if (var5 == -1837375516) {
               throw new IllegalStateException();
            } else {
               var1.am.ak(-1971564769 * var1.as);
               if (null != var2) {
                  if (var5 == -1837375516) {
                     throw new IllegalStateException();
                  }

                  var1.am.at(var2, var3, var4);
               } else {
                  var1.am.ay(var4);
               }

               if (var1.am.ap()) {
                  if (var5 == -1837375516) {
                     throw new IllegalStateException();
                  }

                  this.bz.aw.af(var1.am);
               }

               var1.af((byte)-108);
               if (var1.ag * -602614853 >= 0) {
                  if (var5 == -1837375516) {
                     throw new IllegalStateException();
                  }

                  var1.ga();
                  if (1959190999 * var1.au > 0) {
                     if (var5 == -1837375516) {
                        throw new IllegalStateException();
                     }

                     if (this.by[1021419297 * var1.af][1959190999 * var1.au] == var1) {
                        this.by[1021419297 * var1.af][var1.au * 1959190999] = null;
                     }
                  }
               }

               return true;
            }
         } else {
            var1.am.aj(var1.as * -1971564769, this.bv(var1, -606314672), this.bl(var1, -941309509));
            return false;
         }
      } catch (RuntimeException var11) {
         throw db.an(var11, "ln.bh(" + ')');
      }
   }

   void ef(int var1) {
      for(lq var2 = (lq)this.bz.an.aq(); null != var2; var2 = (lq)this.bz.an.at()) {
         if ((var1 < 0 || var1 == var2.af * 1021419297) && var2.ag * -602614853 < 0) {
            this.ap[1021419297 * var2.af][-630482265 * var2.ab] = null;
            var2.ag = 0;
         }
      }

   }

   protected synchronized bp bi() {
      return this.bz;
   }

   void ea() {
      this.az(-1, -1082248272);
      this.ad(-1, 1435817543);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.al[var1] = this.aq[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.at[var1] = this.aq[var1] & -128;
      }

   }

   protected synchronized bp bk() {
      return null;
   }

   void dm(int var1, int var2) {
      this.aq[var1] = var2;
      this.at[var1] = var2 & -1532300668;
      this.ah(var1, var2, 1944423622);
   }

   protected synchronized int bo() {
      return 0;
   }

   void ar(lq var1, boolean var2, int var3) {
      try {
         int var5;
         label34: {
            int var4 = var1.aw.an.length;
            if (var2) {
               if (var3 <= 2126274284) {
                  throw new IllegalStateException();
               }

               if (var1.aw.au) {
                  if (var3 <= 2126274284) {
                     return;
                  }

                  int var6 = var4 + var4 - var1.aw.aw;
                  var5 = (int)((long)this.az[1021419297 * var1.af] * (long)var6 >> 6);
                  var4 <<= 8;
                  if (var5 >= var4) {
                     if (var3 <= 2126274284) {
                        return;
                     }

                     var5 = var4 + var4 - 1 - var5;
                     var1.am.ar(true);
                  }
                  break label34;
               }
            }

            var5 = (int)((long)this.az[var1.af * 1021419297] * (long)var4 >> 6);
         }

         var1.am.av(var5);
      } catch (RuntimeException var7) {
         throw db.an(var7, "ln.ar(" + ')');
      }
   }

   public synchronized void bw(int var1) {
      this.an = 1881678515 * var1;
   }

   void df(int var1, int var2) {
   }

   void eb(int var1) {
      if (0 != (this.as[var1] & 4)) {
         for(lq var2 = (lq)this.bz.an.aq(); var2 != null; var2 = (lq)this.bz.an.at()) {
            if (var2.af * 1021419297 == var1) {
               var2.ak = 0;
            }
         }
      }

   }

   protected synchronized void bj(int[] var1, int var2, int var3) {
      if (this.bb.aw()) {
         int var4 = this.bb.an * this.aw * 437930689 / (885818897 * bu.au);

         do {
            long var5 = (long)var3 * (long)var4 + this.bx * 8370013022464380265L;
            if (this.bo * -8691691867109044431L - var5 >= 0L) {
               this.bx = var5 * 389160967981716185L;
               break;
            }

            int var7 = (int)((-8691691867109044431L * this.bo - 8370013022464380265L * this.bx + (long)var4 - 1L) / (long)var4);
            this.bx += (long)var4 * (long)var7 * 389160967981716185L;
            this.bz.at(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.bp(486029060);
         } while(this.bb.aw());
      }

      this.bz.at(var1, var2, var3);
   }

   void es(int var1) {
      if (0 != (this.as[var1] & 2)) {
         for(lq var2 = (lq)this.bz.an.aq(); var2 != null; var2 = (lq)this.bz.an.at()) {
            if (1021419297 * var2.af == var1 && this.ap[var1][var2.ab * -630482265] == null && -602614853 * var2.ag < 0) {
               var2.ag = 0;
            }
         }
      }

   }

   protected synchronized void bu(int var1) {
      if (this.bb.aw()) {
         int var2 = this.bb.an * 437930689 * this.aw / (-1359271235 * bu.au);

         do {
            long var3 = 8370013022464380265L * this.bx + (long)var2 * (long)var1;
            if (-8691691867109044431L * this.bo - var3 >= 0L) {
               this.bx = 389160967981716185L * var3;
               break;
            }

            int var5 = (int)((this.bo * -8691691867109044431L - 8370013022464380265L * this.bx + (long)var2 - 1L) / (long)var2);
            this.bx += (long)var5 * (long)var2 * 389160967981716185L;
            this.bz.ay(var5);
            var1 -= var5;
            this.bp(486029060);
         } while(this.bb.aw());
      }

      this.bz.ay(var1);
   }

   int eh(lq var1) {
      int var2 = this.au[var1.af * 1021419297];
      return var2 < 8192 ? 32 + var2 * var1.al * 1083381765 >> 6 : 16384 - ((16384 - var2) * (128 - var1.al * 1083381765) + 32 >> 6);
   }

   void dh(int var1, int var2, int var3) {
   }

   public synchronized void ce(int var1) {
      this.an = 1881678515 * var1;
   }

   public synchronized void ci(int var1) {
      this.an = 1099002506 * var1;
   }

   public int cs() {
      return 1380277371 * this.an;
   }

   public int cc() {
      return 1380277371 * this.an;
   }

   boolean ee(lq var1) {
      if (var1.am == null) {
         if (var1.ag * -602614853 >= 0) {
            var1.ga();
            if (-724197343 * var1.au > 0 && this.by[var1.af * 1021419297][var1.au * -793617907] == var1) {
               this.by[var1.af * 1021419297][1959190999 * var1.au] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   void by(int var1, byte var2) {
      try {
         if (0 != (this.as[var1] & 2)) {
            if (var2 >= 1) {
               return;
            }

            for(lq var3 = (lq)this.bz.an.aq(); var3 != null; var3 = (lq)this.bz.an.at()) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               if (1021419297 * var3.af == var1) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (this.ap[var1][var3.ab * -630482265] == null) {
                     if (var2 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (-602614853 * var3.ag < 0) {
                        if (var2 >= 1) {
                           throw new IllegalStateException();
                        }

                        var3.ag = 0;
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "ln.by(" + ')');
      }
   }

   public synchronized boolean cu(ld var1, nm var2, ba var3, int var4) {
      var1.an();
      boolean var5 = true;
      int[] var6 = null;
      if (var4 > 0) {
         var6 = new int[]{var4};
      }

      for(rl var7 = (rl)var1.af.aw(); null != var7; var7 = (rl)var1.af.ac()) {
         int var8 = (int)var7.hr;
         lz var9 = (lz)this.af.af((long)var8);
         if (null == var9) {
            byte[] var11 = var2.cn(var8, (byte)66);
            lz var10;
            if (var11 == null) {
               var10 = null;
            } else {
               var10 = new lz(var11);
            }

            var9 = var10;
            if (null == var10) {
               var5 = false;
               continue;
            }

            this.af.an(var10, (long)var8);
         }

         if (!var9.af(var3, var7.af, var6, -578631683)) {
            var5 = false;
         }
      }

      if (var5) {
         var1.aw();
      }

      return var5;
   }

   public synchronized void ck() {
      for(lz var1 = (lz)this.af.aw(); var1 != null; var1 = (lz)this.af.ac()) {
         var1.an((byte)-36);
      }

   }

   public synchronized void cq() {
      for(lz var1 = (lz)this.af.aw(); null != var1; var1 = (lz)this.af.ac()) {
         var1.ga();
      }

   }

   public synchronized void cm() {
      for(lz var1 = (lz)this.af.aw(); null != var1; var1 = (lz)this.af.ac()) {
         var1.ga();
      }

   }

   public synchronized void cf() {
      for(lz var1 = (lz)this.af.aw(); null != var1; var1 = (lz)this.af.ac()) {
         var1.ga();
      }

   }

   public synchronized void cl(ld var1, boolean var2) {
      this.ao((byte)21);
      this.bb.af(var1.an);
      this.bi = var2;
      this.bx = 0L;
      int var3 = this.bb.ac();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.bb.au(var4);
         this.bb.al(var4);
         this.bb.ab(var4);
      }

      this.be = this.bb.ax() * 911615763;
      this.bk = this.bb.au[this.be * -2130330853] * -1172591539;
      this.bo = this.bb.ao(this.bk * 2049666181) * -5361838125554816559L;
   }

   protected synchronized void bt(int[] var1, int var2, int var3) {
      if (this.bb.aw()) {
         int var4 = this.bb.an * this.aw * 437930689 / (-1359271235 * bu.au);

         do {
            long var5 = (long)var3 * (long)var4 + this.bx * 8370013022464380265L;
            if (this.bo * -8691691867109044431L - var5 >= 0L) {
               this.bx = var5 * 389160967981716185L;
               break;
            }

            int var7 = (int)((-8691691867109044431L * this.bo - 8370013022464380265L * this.bx + (long)var4 - 1L) / (long)var4);
            this.bx += (long)var4 * (long)var7 * 389160967981716185L;
            this.bz.at(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.bp(486029060);
         } while(this.bb.aw());
      }

      this.bz.at(var1, var2, var3);
   }

   public synchronized void cv(ld var1, boolean var2) {
      this.ao((byte)92);
      this.bb.af(var1.an);
      this.bi = var2;
      this.bx = 0L;
      int var3 = this.bb.ac();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.bb.au(var4);
         this.bb.al(var4);
         this.bb.ab(var4);
      }

      this.be = this.bb.ax() * 1303477277;
      this.bk = this.bb.au[this.be * -2130330853] * -1172591539;
      this.bo = this.bb.ao(this.bk * 879563806) * -5361838125554816559L;
   }

   public synchronized void cb() {
      this.bb.an();
      this.ap(-964267539);
   }

   public synchronized boolean cw() {
      return this.bb.aw();
   }

   protected synchronized bp bx() {
      return null;
   }

   void ev(int var1, int var2) {
      this.ad[var1] = var2;
      this.ae[var1] = (int)(2097152.0 * Math.pow(2.0, 5.4931640625E-4 * (double)var2) + 0.5);
   }

   public synchronized boolean cj() {
      return this.bb.aw();
   }

   public synchronized boolean ch() {
      return this.bb.aw();
   }

   void el(int var1) {
      if (0 != (this.as[var1] & 4)) {
         for(lq var2 = (lq)this.bz.an.aq(); var2 != null; var2 = (lq)this.bz.an.at()) {
            if (var2.af * 1021419297 == var1) {
               var2.ak = 0;
            }
         }
      }

   }

   public synchronized void cp(int var1, int var2) {
      this.ag(var1, var2, (byte)52);
   }

   void cd(int var1, int var2) {
      this.aq[var1] = var2;
      this.at[var1] = var2 & -128;
      this.ah(var1, var2, 1718934379);
   }

   void du(int var1, int var2, int var3) {
   }

   void dw(int var1, int var2) {
      this.aq[var1] = var2;
      this.at[var1] = var2 & 2095591292;
      this.ah(var1, var2, 2111089971);
   }

   void ah(int var1, int var2, int var3) {
      try {
         if (var2 != this.al[var1]) {
            if (var3 <= 1529980485) {
               throw new IllegalStateException();
            }

            this.al[var1] = var2;

            for(int var4 = 0; var4 < 128; ++var4) {
               if (var3 <= 1529980485) {
                  throw new IllegalStateException();
               }

               this.by[var1][var4] = null;
            }
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "ln.ah(" + ')');
      }
   }

   protected synchronized void bg(int var1) {
      if (this.bb.aw()) {
         int var2 = this.bb.an * 437930689 * this.aw / (-1359271235 * bu.au);

         do {
            long var3 = 8370013022464380265L * this.bx + (long)var2 * (long)var1;
            if (-8691691867109044431L * this.bo - var3 >= 0L) {
               this.bx = 389160967981716185L * var3;
               break;
            }

            int var5 = (int)((this.bo * -8691691867109044431L - 8370013022464380265L * this.bx + (long)var2 - 1L) / (long)var2);
            this.bx += (long)var5 * (long)var2 * 389160967981716185L;
            this.bz.ay(var5);
            var1 -= var5;
            this.bp(486029060);
         } while(this.bb.aw());
      }

      this.bz.ay(var1);
   }

   void di(int var1, int var2, int var3) {
      this.am(var1, var2, 64, (byte)5);
      if (0 != (this.as[var1] & 2)) {
         for(lq var4 = (lq)this.bz.an.al(); var4 != null; var4 = (lq)this.bz.an.aa()) {
            if (var1 == var4.af * 1021419297 && var4.ag * -602614853 < 0) {
               this.ap[var1][var4.ab * -630482265] = null;
               this.ap[var1][var2] = var4;
               int var5 = -279706293 * var4.at + (-1077015879 * var4.ay * var4.aa * 274954637 >> 12);
               var4.at += (var2 - var4.ab * -630482265 << 8) * -1343136669;
               var4.aa = (var5 - var4.at * -279706293) * -101879483;
               var4.ay = 230199296;
               var4.ab = var2 * -1339790057;
               return;
            }
         }
      }

      lz var8 = (lz)this.af.af((long)this.al[var1]);
      if (var8 != null) {
         br var9 = var8.an[var2];
         if (null != var9) {
            lq var6 = new lq();
            var6.af = var1 * -2055035679;
            var6.an = var8;
            var6.aw = var9;
            var6.ac = var8.ab[var2];
            var6.au = -1957781017 * var8.aq[var2];
            var6.ab = -1339790057 * var2;
            var6.aq = -284955771 * (1024 + -1979814511 * var8.af * var3 * var3 * var8.ac[var2] >> 11);
            var6.al = (var8.au[var2] & 255) * -539102003;
            var6.at = ((var2 << 8) - (var8.aw[var2] & 32767)) * -1343136669;
            var6.ao = 0;
            var6.ax = 0;
            var6.ai = 0;
            var6.ag = -81590643;
            var6.ah = 0;
            if (this.az[var1] == 0) {
               var6.am = bl.ac(var9, this.bq(var6, 1570592697), this.bv(var6, -2018498840), this.bl(var6, 11367252));
            } else {
               var6.am = bl.ac(var9, this.bq(var6, 1511971485), 0, this.bl(var6, 638097057));
               this.ar(var6, var8.aw[var2] < 0, 2126571294);
            }

            if (var8.aw[var2] < 0) {
               var6.am.aa(-1);
            }

            if (1959190999 * var6.au >= 0) {
               lq var7 = this.by[var1][1959190999 * var6.au];
               if (null != var7 && var7.ag * -602614853 < 0) {
                  this.ap[var1][-630482265 * var7.ab] = null;
                  var7.ag = 0;
               }

               this.by[var1][var6.au * 1959190999] = var6;
            }

            this.bz.an.an(var6);
            this.ap[var1][var2] = var6;
         }
      }
   }

   void dr(int var1, int var2, int var3) {
      this.am(var1, var2, 1921522566, (byte)27);
      if (0 != (this.as[var1] & 2)) {
         for(lq var4 = (lq)this.bz.an.al(); var4 != null; var4 = (lq)this.bz.an.aa()) {
            if (var1 == var4.af * 1021419297 && var4.ag * -602614853 < 0) {
               this.ap[var1][var4.ab * -1545276213] = null;
               this.ap[var1][var2] = var4;
               int var5 = -279706293 * var4.at + (-1077015879 * var4.ay * var4.aa * -528496990 >> 12);
               var4.at += (var2 - var4.ab * -117547961 << 8) * -1277480258;
               var4.aa = (var5 - var4.at * -279706293) * -101879483;
               var4.ay = 230199296;
               var4.ab = var2 * -1339790057;
               return;
            }
         }
      }

      lz var8 = (lz)this.af.af((long)this.al[var1]);
      if (var8 != null) {
         br var9 = var8.an[var2];
         if (null != var9) {
            lq var6 = new lq();
            var6.af = var1 * 721126860;
            var6.an = var8;
            var6.aw = var9;
            var6.ac = var8.ab[var2];
            var6.au = -1957781017 * var8.aq[var2];
            var6.ab = -355922885 * var2;
            var6.aq = -284955771 * (-141411814 + -1650867934 * var8.af * var3 * var3 * var8.ac[var2] >> 11);
            var6.al = (var8.au[var2] & 255) * -539102003;
            var6.at = ((var2 << 8) - (var8.aw[var2] & 32767)) * 451092095;
            var6.ao = 0;
            var6.ax = 0;
            var6.ai = 0;
            var6.ag = -81590643;
            var6.ah = 0;
            if (this.az[var1] == 0) {
               var6.am = bl.ac(var9, this.bq(var6, 1733980810), this.bv(var6, -571722874), this.bl(var6, -2115175011));
            } else {
               var6.am = bl.ac(var9, this.bq(var6, 1405241798), 0, this.bl(var6, -1452986957));
               this.ar(var6, var8.aw[var2] < 0, 2135859650);
            }

            if (var8.aw[var2] < 0) {
               var6.am.aa(-1);
            }

            if (1959190999 * var6.au >= 0) {
               lq var7 = this.by[var1][-587028102 * var6.au];
               if (null != var7 && var7.ag * -602614853 < 0) {
                  this.ap[var1][-630482265 * var7.ab] = null;
                  var7.ag = 0;
               }

               this.by[var1][var6.au * 1309894243] = var6;
            }

            this.bz.an.an(var6);
            this.ap[var1][var2] = var6;
         }
      }
   }

   void ds(int var1) {
      for(lq var2 = (lq)this.bz.an.aq(); null != var2; var2 = (lq)this.bz.an.at()) {
         if (var1 < 0 || 1021419297 * var2.af == var1) {
            if (null != var2.am) {
               var2.am.ak(bu.au * -1359271235 / 100);
               if (var2.am.ap()) {
                  this.bz.aw.af(var2.am);
               }

               var2.af((byte)106);
            }

            if (var2.ag * 134613144 < 0) {
               this.ap[var2.af * 478989243][-630482265 * var2.ab] = null;
            }

            var2.ga();
         }
      }

   }

   void dk(lq var1, boolean var2) {
      int var3 = var1.aw.an.length;
      int var4;
      if (var2 && var1.aw.au) {
         int var5 = var3 + var3 - var1.aw.aw;
         var4 = (int)((long)this.az[1021419297 * var1.af] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.am.ar(true);
         }
      } else {
         var4 = (int)((long)this.az[var1.af * 1021419297] * (long)var3 >> 6);
      }

      var1.am.av(var4);
   }

   void dt(lq var1, boolean var2) {
      int var3 = var1.aw.an.length;
      int var4;
      if (var2 && var1.aw.au) {
         int var5 = var3 + var3 - var1.aw.aw;
         var4 = (int)((long)this.az[1670915322 * var1.af] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.am.ar(true);
         }
      } else {
         var4 = (int)((long)this.az[var1.af * 1021419297] * (long)var3 >> 6);
      }

      var1.am.av(var4);
   }

   void aj(int var1, int var2, int var3) {
      try {
         ;
      } catch (RuntimeException var4) {
         throw db.an(var4, "ln.aj(" + ')');
      }
   }

   void dz(lq var1, boolean var2) {
      int var3 = var1.aw.an.length;
      int var4;
      if (var2 && var1.aw.au) {
         int var5 = var3 + var3 - var1.aw.aw;
         var4 = (int)((long)this.az[-344917976 * var1.af] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.am.ar(true);
         }
      } else {
         var4 = (int)((long)this.az[var1.af * 1021419297] * (long)var3 >> 6);
      }

      var1.am.av(var4);
   }

   void dg(int var1, int var2, int var3) {
      lq var4 = this.ap[var1][var2];
      if (null != var4) {
         this.ap[var1][var2] = null;
         if (0 != (this.as[var1] & 2)) {
            for(lq var5 = (lq)this.bz.an.aq(); null != var5; var5 = (lq)this.bz.an.at()) {
               if (1667899725 * var5.af == -461993591 * var4.af && var5.ag * -602614853 < 0 && var5 != var4) {
                  var4.ag = 0;
                  break;
               }
            }
         } else {
            var4.ag = 0;
         }

      }
   }

   void de(int var1, int var2, int var3) {
      lq var4 = this.ap[var1][var2];
      if (null != var4) {
         this.ap[var1][var2] = null;
         if (0 != (this.as[var1] & 2)) {
            for(lq var5 = (lq)this.bz.an.aq(); null != var5; var5 = (lq)this.bz.an.at()) {
               if (1021419297 * var5.af == 1021419297 * var4.af && var5.ag * -602614853 < 0 && var5 != var4) {
                  var4.ag = 0;
                  break;
               }
            }
         } else {
            var4.ag = 0;
         }

      }
   }

   void dv(lq var1, boolean var2) {
      int var3 = var1.aw.an.length;
      int var4;
      if (var2 && var1.aw.au) {
         int var5 = var3 + var3 - var1.aw.aw;
         var4 = (int)((long)this.az[1021419297 * var1.af] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.am.ar(true);
         }
      } else {
         var4 = (int)((long)this.az[var1.af * 1021419297] * (long)var3 >> 6);
      }

      var1.am.av(var4);
   }

   void dp(int var1, int var2, int var3) {
   }

   public synchronized boolean ca(ld var1, nm var2, ba var3, int var4) {
      var1.an();
      boolean var5 = true;
      int[] var6 = null;
      if (var4 > 0) {
         var6 = new int[]{var4};
      }

      for(rl var7 = (rl)var1.af.aw(); null != var7; var7 = (rl)var1.af.ac()) {
         int var8 = (int)var7.hr;
         lz var9 = (lz)this.af.af((long)var8);
         if (null == var9) {
            byte[] var11 = var2.cn(var8, (byte)-8);
            lz var10;
            if (var11 == null) {
               var10 = null;
            } else {
               var10 = new lz(var11);
            }

            var9 = var10;
            if (null == var10) {
               var5 = false;
               continue;
            }

            this.af.an(var10, (long)var8);
         }

         if (!var9.af(var3, var7.af, var6, -1230380670)) {
            var5 = false;
         }
      }

      if (var5) {
         var1.aw();
      }

      return var5;
   }

   void db(int var1, int var2) {
   }

   protected synchronized bp be() {
      return null;
   }

   void dq(int var1, int var2) {
   }

   void dd(int var1, int var2) {
   }

   void dl(lq var1, boolean var2) {
      int var3 = var1.aw.an.length;
      int var4;
      if (var2 && var1.aw.au) {
         int var5 = var3 + var3 - var1.aw.aw;
         var4 = (int)((long)this.az[1021419297 * var1.af] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.am.ar(true);
         }
      } else {
         var4 = (int)((long)this.az[var1.af * 976182423] * (long)var3 >> 6);
      }

      var1.am.av(var4);
   }

   void dx(int var1, int var2) {
      this.aa[var1] = var2;
   }

   void dn(int var1, int var2) {
      this.aa[var1] = var2;
   }

   public synchronized void ac(int var1) {
      try {
         for(lz var2 = (lz)this.af.aw(); var2 != null; var2 = (lz)this.af.ac()) {
            if (var1 == -1429517478) {
               throw new IllegalStateException();
            }

            var2.an((byte)-21);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "ln.ac(" + ')');
      }
   }

   protected synchronized void bm(int[] var1, int var2, int var3) {
      if (this.bb.aw()) {
         int var4 = this.bb.an * this.aw * 437930689 / (-1359271235 * bu.au);

         do {
            long var5 = (long)var3 * (long)var4 + this.bx * 8370013022464380265L;
            if (this.bo * -8691691867109044431L - var5 >= 0L) {
               this.bx = var5 * 389160967981716185L;
               break;
            }

            int var7 = (int)((-8691691867109044431L * this.bo - 8370013022464380265L * this.bx + (long)var4 - 1L) / (long)var4);
            this.bx += (long)var4 * (long)var7 * 389160967981716185L;
            this.bz.at(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.bp(486029060);
         } while(this.bb.aw());
      }

      this.bz.at(var1, var2, var3);
   }

   void da(int var1) {
      for(lq var2 = (lq)this.bz.an.aq(); null != var2; var2 = (lq)this.bz.an.at()) {
         if (var1 < 0 || 1021419297 * var2.af == var1) {
            if (null != var2.am) {
               var2.am.ak(bu.au * -658266942 / 100);
               if (var2.am.ap()) {
                  this.bz.aw.af(var2.am);
               }

               var2.af((byte)10);
            }

            if (var2.ag * -602614853 < 0) {
               this.ap[var2.af * 1021419297][-201837357 * var2.ab] = null;
            }

            var2.ga();
         }
      }

   }

   void ed(int var1) {
      int var2 = var1 & 240;
      int var3;
      int var4;
      int var5;
      if (128 == var2) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.am(var3, var4, var5, (byte)28);
      } else if (144 == var2) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var5 > 0) {
            this.av(var3, var4, var5, -49500482);
         } else {
            this.am(var3, var4, 64, (byte)72);
         }

      } else if (160 == var2) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.as(var3, var4, var5, -1037328378);
      } else if (176 == var2) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var4 == 0) {
            this.at[var3] = (var5 << 14) + (this.at[var3] & -2080769);
         }

         if (var4 == 32) {
            this.at[var3] = (this.at[var3] & -16257) + (var5 << 7);
         }

         if (var4 == 1) {
            this.ay[var3] = (this.ay[var3] & -16257) + (var5 << 7);
         }

         if (33 == var4) {
            this.ay[var3] = (this.ay[var3] & -128) + var5;
         }

         if (5 == var4) {
            this.ao[var3] = (this.ao[var3] & -16257) + (var5 << 7);
         }

         if (37 == var4) {
            this.ao[var3] = (this.ao[var3] & -128) + var5;
         }

         if (7 == var4) {
            this.ac[var3] = (this.ac[var3] & -16257) + (var5 << 7);
         }

         if (39 == var4) {
            this.ac[var3] = var5 + (this.ac[var3] & -128);
         }

         if (10 == var4) {
            this.au[var3] = (this.au[var3] & -16257) + (var5 << 7);
         }

         if (42 == var4) {
            this.au[var3] = var5 + (this.au[var3] & -128);
         }

         if (11 == var4) {
            this.ab[var3] = (this.ab[var3] & -16257) + (var5 << 7);
         }

         if (43 == var4) {
            this.ab[var3] = var5 + (this.ab[var3] & -128);
         }

         int[] var10000;
         if (var4 == 64) {
            if (var5 >= 64) {
               var10000 = this.as;
               var10000[var3] |= 1;
            } else {
               var10000 = this.as;
               var10000[var3] &= -2;
            }
         }

         if (65 == var4) {
            if (var5 >= 64) {
               var10000 = this.as;
               var10000[var3] |= 2;
            } else {
               this.by(var3, (byte)-74);
               var10000 = this.as;
               var10000[var3] &= -3;
            }
         }

         if (var4 == 99) {
            this.aj[var3] = (var5 << 7) + (this.aj[var3] & 127);
         }

         if (var4 == 98) {
            this.aj[var3] = var5 + (this.aj[var3] & 16256);
         }

         if (var4 == 101) {
            this.aj[var3] = (this.aj[var3] & 127) + 16384 + (var5 << 7);
         }

         if (var4 == 100) {
            this.aj[var3] = var5 + 16384 + (this.aj[var3] & 16256);
         }

         if (120 == var4) {
            this.az(var3, -233409085);
         }

         if (121 == var4) {
            this.ad(var3, -1086942931);
         }

         if (var4 == 123) {
            this.ae(var3, -1578098207);
         }

         int var6;
         if (var4 == 6) {
            var6 = this.aj[var3];
            if (16384 == var6) {
               this.ak[var3] = (this.ak[var3] & -16257) + (var5 << 7);
            }
         }

         if (38 == var4) {
            var6 = this.aj[var3];
            if (16384 == var6) {
               this.ak[var3] = var5 + (this.ak[var3] & -128);
            }
         }

         if (var4 == 16) {
            this.az[var3] = (this.az[var3] & -16257) + (var5 << 7);
         }

         if (var4 == 48) {
            this.az[var3] = var5 + (this.az[var3] & -128);
         }

         if (81 == var4) {
            if (var5 >= 64) {
               var10000 = this.as;
               var10000[var3] |= 4;
            } else {
               this.bn(var3, -427369850);
               var10000 = this.as;
               var10000[var3] &= -5;
            }
         }

         if (17 == var4) {
            this.br(var3, (this.ad[var3] & -16257) + (var5 << 7), -1731550836);
         }

         if (49 == var4) {
            this.br(var3, (this.ad[var3] & -128) + var5, -1731550836);
         }

      } else if (192 == var2) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.ah(var3, var4 + this.at[var3], 1935841777);
      } else if (var2 == 208) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.aj(var3, var4, 1736841186);
      } else if (224 == var2) {
         var3 = var1 & 15;
         var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.ak(var3, var4, 1611025845);
      } else {
         var2 = var1 & 255;
         if (255 == var2) {
            this.ap(-964267539);
         }
      }
   }

   void eo(int var1) {
      if (var1 >= 0) {
         this.ac[var1] = 12800;
         this.au[var1] = 8192;
         this.ab[var1] = 16383;
         this.aa[var1] = 8192;
         this.ay[var1] = 0;
         this.ao[var1] = 8192;
         this.by(var1, (byte)-23);
         this.bn(var1, -896099039);
         this.as[var1] = 0;
         this.aj[var1] = 32767;
         this.ak[var1] = 256;
         this.az[var1] = 0;
         this.br(var1, 8192, -1731550836);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.ad(var1, -124986761);
         }

      }
   }

   public synchronized void ct(int var1, int var2) {
      this.ag(var1, var2, (byte)-74);
   }

   void et(int var1) {
      if (var1 >= 0) {
         this.ac[var1] = 12800;
         this.au[var1] = 8192;
         this.ab[var1] = 16383;
         this.aa[var1] = 8192;
         this.ay[var1] = 0;
         this.ao[var1] = 8192;
         this.by(var1, (byte)-125);
         this.bn(var1, -295029725);
         this.as[var1] = 0;
         this.aj[var1] = 32767;
         this.ak[var1] = 256;
         this.az[var1] = 0;
         this.br(var1, 8192, -1731550836);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.ad(var1, 452647106);
         }

      }
   }

   public int an(byte var1) {
      try {
         return 1380277371 * this.an;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ln.an(" + ')');
      }
   }

   void ez(int var1) {
      for(lq var2 = (lq)this.bz.an.aq(); null != var2; var2 = (lq)this.bz.an.at()) {
         if ((var1 < 0 || var1 == var2.af * 1021419297) && var2.ag * -602614853 < 0) {
            this.ap[1021419297 * var2.af][-630482265 * var2.ab] = null;
            var2.ag = 0;
         }
      }

   }

   void ej(int var1) {
      for(lq var2 = (lq)this.bz.an.aq(); null != var2; var2 = (lq)this.bz.an.at()) {
         if ((var1 < 0 || var1 == var2.af * 1021419297) && var2.ag * -602614853 < 0) {
            this.ap[1021419297 * var2.af][-630482265 * var2.ab] = null;
            var2.ag = 0;
         }
      }

   }

   public synchronized void cx(ld var1, boolean var2) {
      this.ao((byte)-18);
      this.bb.af(var1.an);
      this.bi = var2;
      this.bx = 0L;
      int var3 = this.bb.ac();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.bb.au(var4);
         this.bb.al(var4);
         this.bb.ab(var4);
      }

      this.be = this.bb.ax() * 908528068;
      this.bk = this.bb.au[this.be * -2130330853] * 1888921809;
      this.bo = this.bb.ao(this.bk * 2049666181) * -5361838125554816559L;
   }

   void eu(int var1) {
      if (0 != (this.as[var1] & 2)) {
         for(lq var2 = (lq)this.bz.an.aq(); var2 != null; var2 = (lq)this.bz.an.at()) {
            if (1021419297 * var2.af == var1 && this.ap[var1][var2.ab * -630482265] == null && -602614853 * var2.ag < 0) {
               var2.ag = 0;
            }
         }
      }

   }

   protected synchronized void ay(int var1) {
      try {
         if (this.bb.aw()) {
            int var2 = this.bb.an * 437930689 * this.aw / (-1359271235 * bu.au);

            do {
               long var3 = 8370013022464380265L * this.bx + (long)var2 * (long)var1;
               if (-8691691867109044431L * this.bo - var3 >= 0L) {
                  this.bx = 389160967981716185L * var3;
                  break;
               }

               int var5 = (int)((this.bo * -8691691867109044431L - 8370013022464380265L * this.bx + (long)var2 - 1L) / (long)var2);
               this.bx += (long)var5 * (long)var2 * 389160967981716185L;
               this.bz.ay(var5);
               var1 -= var5;
               this.bp(486029060);
            } while(this.bb.aw());
         }

         this.bz.ay(var1);
      } catch (RuntimeException var6) {
         throw db.an(var6, "ln.ay(" + ')');
      }
   }

   void dc(int var1, int var2) {
      if (var2 != this.al[var1]) {
         this.al[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.by[var1][var3] = null;
         }
      }

   }

   public synchronized void co() {
      this.bb.an();
      this.ap(-964267539);
   }

   void en(int var1) {
      if (0 != (this.as[var1] & 4)) {
         for(lq var2 = (lq)this.bz.an.aq(); var2 != null; var2 = (lq)this.bz.an.at()) {
            if (var2.af * -1972201472 == var1) {
               var2.ak = 0;
            }
         }
      }

   }

   void er(int var1) {
      if (0 != (this.as[var1] & 4)) {
         for(lq var2 = (lq)this.bz.an.aq(); var2 != null; var2 = (lq)this.bz.an.at()) {
            if (var2.af * -651278385 == var1) {
               var2.ak = 0;
            }
         }
      }

   }

   void eg(int var1) {
      if (0 != (this.as[var1] & 4)) {
         for(lq var2 = (lq)this.bz.an.aq(); var2 != null; var2 = (lq)this.bz.an.at()) {
            if (var2.af * 1021419297 == var1) {
               var2.ak = 0;
            }
         }
      }

   }

   boolean bc(lq var1, short var2) {
      try {
         if (var1.am == null) {
            if (var2 == 145) {
               throw new IllegalStateException();
            } else {
               if (var1.ag * -602614853 >= 0) {
                  if (var2 == 145) {
                     throw new IllegalStateException();
                  }

                  var1.ga();
                  if (1959190999 * var1.au > 0) {
                     if (var2 == 145) {
                        throw new IllegalStateException();
                     }

                     if (this.by[var1.af * 1021419297][var1.au * 1959190999] == var1) {
                        if (var2 == 145) {
                           throw new IllegalStateException();
                        }

                        this.by[var1.af * 1021419297][1959190999 * var1.au] = null;
                     }
                  }
               }

               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "ln.bc(" + ')');
      }
   }

   public synchronized void cz() {
      this.bb.an();
      this.ap(-964267539);
   }

   int em(lq var1) {
      int var2 = (274954637 * var1.aa * -1077015879 * var1.ay >> 12) + -279706293 * var1.at;
      var2 += this.ak[var1.af * 1021419297] * (this.aa[1021419297 * var1.af] - 8192) >> 12;
      lp var3 = var1.ac;
      int var4;
      if (var3.al * -1668380791 > 0 && (-1552238757 * var3.aq > 0 || this.ay[var1.af * 1021419297] > 0)) {
         var4 = var3.aq * -1552238757 << 2;
         int var5 = 391036783 * var3.at << 1;
         if (667306259 * var1.av < var5) {
            var4 = var4 * var1.av * 667306259 / var5;
         }

         var4 += this.ay[1021419297 * var1.af] >> 7;
         double var6 = Math.sin(0.01227184630308513 * (double)(var1.ar * -2032101041 & 511));
         var2 += (int)(var6 * (double)var4);
      }

      var4 = (int)((double)(256 * var1.aw.af) * Math.pow(2.0, 3.255208333333333E-4 * (double)var2) / (double)(bu.au * -1359271235) + 0.5);
      return var4 < 1 ? 1 : var4;
   }

   int ew(lq var1) {
      lp var2 = var1.ac;
      int var3 = this.ac[1021419297 * var1.af] * this.ab[-1361194661 * var1.af] + 164079214 >> 13;
      var3 = var3 * var3 + 1991680641 >> 15;
      var3 = var1.aq * -254585523 * var3 + 16384 >> 15;
      var3 = 128 + -965919098 * this.an * var3 >> 8;
      if (354539497 * var2.aw > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5, (double)(var2.aw * 1138111851) * (double)(var1.ao * -814647939) * 1.953125E-5) + 0.5);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if (null != var2.af) {
         var4 = 584474482 * var1.ax;
         var5 = var2.af[1 + var1.ai * 2119214866];
         if (554937197 * var1.ai < var2.af.length - 2) {
            var6 = (var2.af[var1.ai * -1691261767] & -697260063) << 8;
            var7 = (var2.af[891662681 * var1.ai + 2] & 255) << 8;
            var5 += (var2.af[3 + -1738039833 * var1.ai] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var3 * var5 + -450816130 >> 6;
      }

      if (-602614853 * var1.ag > 0 && var2.an != null) {
         var4 = -602614853 * var1.ag;
         var5 = var2.an[1 + 389266638 * var1.ah];
         if (var1.ah * -801563177 < var2.an.length - 2) {
            var6 = (var2.an[var1.ah * 752707071] & 255) << 8;
            var7 = (var2.an[var1.ah * -39374307 + 2] & 90849728) << 8;
            var5 += (var2.an[var1.ah * 1648162759 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var5 * var3 + -2062348854 >> 6;
      }

      return var3;
   }

   int ex(lq var1) {
      lp var2 = var1.ac;
      int var3 = this.ac[-251956317 * var1.af] * this.ab[1021419297 * var1.af] + 1439828268 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var1.aq * -254585523 * var3 + 16384 >> 15;
      var3 = -69880683 + -1714210238 * this.an * var3 >> 8;
      if (354539497 * var2.aw > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5, (double)(var2.aw * -1537334919) * (double)(var1.ao * -814647939) * 1.953125E-5) + 0.5);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if (null != var2.af) {
         var4 = 566056741 * var1.ax;
         var5 = var2.af[1 + var1.ai * 891662681];
         if (-1517093692 * var1.ai < var2.af.length - 2) {
            var6 = (var2.af[var1.ai * 99031685] & 255) << 8;
            var7 = (var2.af[41591691 * var1.ai + 2] & 1109044842) << 8;
            var5 += (var2.af[3 + -255031697 * var1.ai] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var3 * var5 + 32 >> 6;
      }

      if (137557187 * var1.ag > 0 && var2.an != null) {
         var4 = -602614853 * var1.ag;
         var5 = var2.an[1 + -371546193 * var1.ah];
         if (var1.ah * -371546193 < var2.an.length - 2) {
            var6 = (var2.an[var1.ah * 887659148] & 255) << 8;
            var7 = (var2.an[var1.ah * 1781952581 + 2] & 255) << 8;
            var5 += (var2.an[var1.ah * 1613638397 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var5 * var3 + -1174884891 >> 6;
      }

      return var3;
   }

   protected synchronized bp bb() {
      return this.bz;
   }

   int ek(lq var1) {
      int var2 = this.au[var1.af * 1021419297];
      return var2 < 8192 ? 32 + var2 * var1.al * 1083381765 >> 6 : 935517112 - ((1420697474 - var2) * (1598615070 - var1.al * 1083381765) + 32 >> 6);
   }

   void ey() {
      int var1 = this.be * -2130330853;
      int var2 = this.bk * 2049666181;

      long var3;
      for(var3 = this.bo * -8691691867109044431L; this.bk * 2049666181 == var2; var3 = this.bb.ao(var2)) {
         while(this.bb.au[var1] == var2) {
            this.bb.au(var1);
            int var5 = this.bb.at(var1);
            if (1 == var5) {
               this.bb.aq();
               this.bb.ab(var1);
               if (this.bb.ai()) {
                  if (!this.bi || var2 == 0) {
                     this.ap(-964267539);
                     this.bb.an();
                     return;
                  }

                  this.bb.ag(var3);
               }
               break;
            }

            if ((var5 & 128) != 0) {
               this.bs(var5, -2078249866);
            }

            this.bb.al(var1);
            this.bb.ab(var1);
         }

         var1 = this.bb.ax();
         var2 = this.bb.au[var1];
      }

      this.be = 911615763 * var1;
      this.bk = -1172591539 * var2;
      this.bo = -5361838125554816559L * var3;
   }

   public synchronized boolean cn(ld var1, nm var2, ba var3, int var4) {
      var1.an();
      boolean var5 = true;
      int[] var6 = null;
      if (var4 > 0) {
         var6 = new int[]{var4};
      }

      for(rl var7 = (rl)var1.af.aw(); null != var7; var7 = (rl)var1.af.ac()) {
         int var8 = (int)var7.hr;
         lz var9 = (lz)this.af.af((long)var8);
         if (null == var9) {
            byte[] var11 = var2.cn(var8, (byte)-8);
            lz var10;
            if (var11 == null) {
               var10 = null;
            } else {
               var10 = new lz(var11);
            }

            var9 = var10;
            if (null == var10) {
               var5 = false;
               continue;
            }

            this.af.an(var10, (long)var8);
         }

         if (!var9.af(var3, var7.af, var6, -528008101)) {
            var5 = false;
         }
      }

      if (var5) {
         var1.aw();
      }

      return var5;
   }

   void ei() {
      int var1 = this.be * -2130330853;
      int var2 = this.bk * -2102446898;

      long var3;
      for(var3 = this.bo * -8691691867109044431L; this.bk * -1768406958 == var2; var3 = this.bb.ao(var2)) {
         while(this.bb.au[var1] == var2) {
            this.bb.au(var1);
            int var5 = this.bb.at(var1);
            if (1 == var5) {
               this.bb.aq();
               this.bb.ab(var1);
               if (this.bb.ai()) {
                  if (!this.bi || var2 == 0) {
                     this.ap(-964267539);
                     this.bb.an();
                     return;
                  }

                  this.bb.ag(var3);
               }
               break;
            }

            if ((var5 & -714882084) != 0) {
               this.bs(var5, -557182311);
            }

            this.bb.al(var1);
            this.bb.ab(var1);
         }

         var1 = this.bb.ax();
         var2 = this.bb.au[var1];
      }

      this.be = -351302444 * var1;
      this.bk = -1172591539 * var2;
      this.bo = -5361838125554816559L * var3;
   }

   protected synchronized int bz() {
      return 0;
   }

   boolean fe(lq var1) {
      if (var1.am == null) {
         if (var1.ag * -602614853 >= 0) {
            var1.ga();
            if (1959190999 * var1.au > 0 && this.by[var1.af * 1021419297][var1.au * 1959190999] == var1) {
               this.by[var1.af * 1021419297][1959190999 * var1.au] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   boolean fs(lq var1, int[] var2, int var3, int var4) {
      var1.as = 652897503 * (bu.au * -1359271235 / 100);
      if (-602614853 * var1.ag < 0 || var1.am != null && !var1.am.ae()) {
         int var5 = var1.ay * -1077015879;
         if (var5 > 0) {
            var5 -= (int)(16.0 * Math.pow(2.0, (double)this.ao[1021419297 * var1.af] * 4.921259842519685E-4) + 0.5);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.ay = var5 * -871310455;
         }

         var1.am.az(this.bq(var1, 1468247128));
         lp var6 = var1.ac;
         boolean var7 = false;
         var1.av += -1164121829;
         var1.ar += 100789159 * var6.al;
         double var8 = 5.086263020833333E-6 * (double)((274954637 * var1.aa * var1.ay * -1077015879 >> 12) + (-630482265 * var1.ab - 60 << 8));
         if (354539497 * var6.aw > 0) {
            if (var6.ab * 821482501 > 0) {
               var1.ao += (int)(128.0 * Math.pow(2.0, (double)(821482501 * var6.ab) * var8) + 0.5) * 349596629;
            } else {
               var1.ao += 1798695552;
            }
         }

         if (null != var6.af) {
            if (var6.ac * -32542335 > 0) {
               var1.ax += (int)(128.0 * Math.pow(2.0, (double)(-32542335 * var6.ac) * var8) + 0.5) * -257124661;
            } else {
               var1.ax += 1447781760;
            }

            while(891662681 * var1.ai < var6.af.length - 2 && var1.ax * 873438947 > (var6.af[var1.ai * 891662681 + 2] & 255) << 8) {
               var1.ai += -934605358;
            }

            if (var1.ai * 891662681 == var6.af.length - 2 && 0 == var6.af[1 + 891662681 * var1.ai]) {
               var7 = true;
            }
         }

         if (var1.ag * -602614853 >= 0 && var6.an != null && 0 == (this.as[1021419297 * var1.af] & 1) && (var1.au * 1959190999 < 0 || var1 != this.by[var1.af * 1021419297][var1.au * 1959190999])) {
            if (-574961187 * var6.au > 0) {
               var1.ag += (int)(128.0 * Math.pow(2.0, (double)(var6.au * -574961187) * var8) + 0.5) * 81590643;
            } else {
               var1.ag += 1853667712;
            }

            while(var1.ah * -371546193 < var6.an.length - 2 && -602614853 * var1.ag > (var6.an[2 + -371546193 * var1.ah] & 255) << 8) {
               var1.ah += 2121932446;
            }

            if (var6.an.length - 2 == var1.ah * -371546193) {
               var7 = true;
            }
         }

         if (var7) {
            var1.am.ak(-1971564769 * var1.as);
            if (null != var2) {
               var1.am.at(var2, var3, var4);
            } else {
               var1.am.ay(var4);
            }

            if (var1.am.ap()) {
               this.bz.aw.af(var1.am);
            }

            var1.af((byte)28);
            if (var1.ag * -602614853 >= 0) {
               var1.ga();
               if (1959190999 * var1.au > 0 && this.by[1021419297 * var1.af][1959190999 * var1.au] == var1) {
                  this.by[1021419297 * var1.af][var1.au * 1959190999] = null;
               }
            }

            return true;
         } else {
            var1.am.aj(var1.as * -1971564769, this.bv(var1, 679640786), this.bl(var1, 1057936977));
            return false;
         }
      } else {
         var1.af((byte)-17);
         var1.ga();
         if (1959190999 * var1.au > 0 && var1 == this.by[var1.af * 1021419297][var1.au * 1959190999]) {
            this.by[1021419297 * var1.af][var1.au * 1959190999] = null;
         }

         return true;
      }
   }

   public static void af(nm var0, int var1) {
      try {
         hx.af = var0;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ln.af(" + ')');
      }
   }
}
