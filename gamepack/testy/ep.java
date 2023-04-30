import accessors.RSVarcs;
import java.io.EOFException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ep implements RSVarcs {
   boolean[] aw;
   /** @deprecated */
   @Deprecated
   String[] au;
   Map ac;
   static final String an = "2";
   boolean ab;
   long aq;
   static qw gg;

   /** @deprecated */
   @Deprecated
   String ak(int var1) {
      return this.au[var1];
   }

   int an(int var1, int var2) {
      try {
         Object var3 = this.ac.get(var1);
         if (var3 instanceof Integer) {
            if (var2 <= -733787727) {
               throw new IllegalStateException();
            } else {
               return (Integer)var3;
            }
         } else {
            return -1;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "ep.an(" + ')');
      }
   }

   public static lm[] af(byte var0) {
      try {
         return new lm[]{lm.af, lm.an, lm.aw, lm.ac, lm.au, lm.ab, lm.aq, lm.al, lm.at, lm.aa, lm.ay};
      } catch (RuntimeException var1) {
         throw db.an(var1, "ep.af(" + ')');
      }
   }

   void aw(int var1, String var2, int var3) {
      try {
         this.ac.put(var1, var2);
      } catch (RuntimeException var4) {
         throw db.an(var4, "ep.aw(" + ')');
      }
   }

   void bb() {
      sy var1 = this.al(true, (byte)95);
      boolean var17 = false;

      label128: {
         label127: {
            try {
               var17 = true;
               int var2 = 3;
               int var3 = 0;
               Iterator var4 = this.ac.entrySet().iterator();

               while(var4.hasNext()) {
                  Map.Entry var5 = (Map.Entry)var4.next();
                  int var6 = (Integer)var5.getKey();
                  if (this.aw[var6]) {
                     Object var7 = var5.getValue();
                     var2 += 3;
                     if (var7 instanceof Integer) {
                        var2 += 4;
                     } else if (var7 instanceof String) {
                        var2 += ct.bc((String)var7, (byte)-7);
                     }

                     ++var3;
                  }
               }

               sg var23 = new sg(var2);
               var23.bu(2, (byte)71);
               var23.bf(var3, (byte)-23);
               Iterator var24 = this.ac.entrySet().iterator();

               while(var24.hasNext()) {
                  Map.Entry var25 = (Map.Entry)var24.next();
                  int var26 = (Integer)var25.getKey();
                  if (this.aw[var26]) {
                     var23.bf(var26, (byte)-69);
                     Object var8 = var25.getValue();
                     sh var9 = sh.ab(var8.getClass(), (short)-18549);
                     var23.bu(454796803 * var9.au, (byte)110);
                     sh.aq(var8, var23, -1117763929);
                  }
               }

               var1.an(var23.al, 0, -1633313603 * var23.at, 185047612);
               var17 = false;
               break label127;
            } catch (Exception var21) {
               var17 = false;
            } finally {
               if (var17) {
                  try {
                     var1.aw((byte)-112);
                  } catch (Exception var18) {
                  }

               }
            }

            try {
               var1.aw((byte)-102);
            } catch (Exception var19) {
            }
            break label128;
         }

         try {
            var1.aw((byte)-19);
         } catch (Exception var20) {
         }
      }

      this.ab = false;
      this.aq = dq.af(808735721) * 2378911120439077589L;
   }

   /** @deprecated */
   @Deprecated
   void au(int var1, String var2, int var3) {
      try {
         this.au[var1] = var2;
      } catch (RuntimeException var4) {
         throw db.an(var4, "ep.au(" + ')');
      }
   }

   /** @deprecated */
   @Deprecated
   String ab(int var1, byte var2) {
      try {
         return this.au[var1];
      } catch (RuntimeException var3) {
         throw db.an(var3, "ep.ab(" + ')');
      }
   }

   void aq(int var1) {
      try {
         int var2;
         for(var2 = 0; var2 < this.aw.length; ++var2) {
            if (var1 != -39979061) {
               throw new IllegalStateException();
            }

            if (!this.aw[var2]) {
               if (var1 != -39979061) {
                  throw new IllegalStateException();
               }

               this.ac.remove(var2);
            }
         }

         for(var2 = 0; var2 < this.au.length; ++var2) {
            if (var1 != -39979061) {
               throw new IllegalStateException();
            }

            this.au[var2] = null;
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "ep.aq(" + ')');
      }
   }

   sy al(boolean var1, byte var2) {
      try {
         return in.an("2", client.cc.aq, var1, (byte)-57);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ep.al(" + ')');
      }
   }

   void at(int var1) {
      try {
         sy var2 = this.al(true, (byte)61);
         boolean var19 = false;

         label173: {
            label172: {
               try {
                  var19 = true;
                  int var3 = 3;
                  int var4 = 0;
                  Iterator var5 = this.ac.entrySet().iterator();

                  while(var5.hasNext()) {
                     if (var1 <= 1606065339) {
                        throw new IllegalStateException();
                     }

                     Map.Entry var6 = (Map.Entry)var5.next();
                     int var7 = (Integer)var6.getKey();
                     if (this.aw[var7]) {
                        Object var8 = var6.getValue();
                        var3 += 3;
                        if (var8 instanceof Integer) {
                           if (var1 <= 1606065339) {
                              return;
                           }

                           var3 += 4;
                        } else if (var8 instanceof String) {
                           if (var1 <= 1606065339) {
                              throw new IllegalStateException();
                           }

                           var3 += ct.bc((String)var8, (byte)-115);
                        }

                        ++var4;
                     }
                  }

                  sg var26 = new sg(var3);
                  var26.bu(2, (byte)46);
                  var26.bf(var4, (byte)55);
                  Iterator var27 = this.ac.entrySet().iterator();

                  while(var27.hasNext()) {
                     if (var1 <= 1606065339) {
                        return;
                     }

                     Map.Entry var28 = (Map.Entry)var27.next();
                     int var29 = (Integer)var28.getKey();
                     if (this.aw[var29]) {
                        if (var1 <= 1606065339) {
                           throw new IllegalStateException();
                        }

                        var26.bf(var29, (byte)-60);
                        Object var9 = var28.getValue();
                        sh var10 = sh.ab(var9.getClass(), (short)-16288);
                        var26.bu(454796803 * var10.au, (byte)25);
                        sh.aq(var9, var26, 779443646);
                     }
                  }

                  var2.an(var26.al, 0, -1633313603 * var26.at, 185047612);
                  var19 = false;
                  break label172;
               } catch (Exception var23) {
                  var19 = false;
               } finally {
                  if (var19) {
                     try {
                        var2.aw((byte)-96);
                     } catch (Exception var20) {
                     }

                  }
               }

               try {
                  var2.aw((byte)-58);
               } catch (Exception var21) {
               }
               break label173;
            }

            try {
               var2.aw((byte)-84);
            } catch (Exception var22) {
            }
         }

         this.ab = false;
         this.aq = dq.af(629105598) * 2378911120439077589L;
      } catch (RuntimeException var25) {
         throw db.an(var25, "ep.at(" + ')');
      }
   }

   void aa(byte var1) {
      try {
         sy var2 = this.al(false, (byte)117);
         boolean var23 = false;

         label332: {
            label331: {
               label337: {
                  label338: {
                     try {
                        var23 = true;
                        byte[] var3 = new byte[(int)var2.au(2095830314)];

                        int var5;
                        for(int var4 = 0; var4 < var3.length; var4 += var5) {
                           if (var1 >= 31) {
                              throw new IllegalStateException();
                           }

                           var5 = var2.ab(var3, var4, var3.length - var4, 1110436062);
                           if (-1 == var5) {
                              if (var1 >= 31) {
                                 throw new IllegalStateException();
                              }

                              throw new EOFException();
                           }
                        }

                        sg var32 = new sg(var3);
                        if (var32.al.length - -1633313603 * var32.at >= 1) {
                           int var6 = var32.cm((byte)7);
                           if (var6 >= 0) {
                              if (var6 <= 2) {
                                 int var7;
                                 int var8;
                                 int var9;
                                 int var10;
                                 if (var6 >= 2) {
                                    var7 = var32.cl(311796919);

                                    for(var8 = 0; var8 < var7; ++var8) {
                                       if (var1 >= 31) {
                                          throw new IllegalStateException();
                                       }

                                       var9 = var32.cl(-90977583);
                                       var10 = var32.cm((byte)7);
                                       sh var11 = (sh)ht.af(sh.au(-1853169436), var10, (short)173);
                                       Object var12 = var11.at(var32, -1183771146);
                                       if (var9 >= 0) {
                                          if (var1 >= 31) {
                                             throw new IllegalStateException();
                                          }

                                          if (var9 < this.aw.length) {
                                             if (var1 >= 31) {
                                                throw new IllegalStateException();
                                             }

                                             if (this.aw[var9]) {
                                                if (var1 >= 31) {
                                                   throw new IllegalStateException();
                                                }

                                                this.ac.put(var9, var12);
                                             }
                                          }
                                       }
                                    }

                                    var23 = false;
                                    break label331;
                                 }

                                 var7 = var32.cl(-1705393510);

                                 for(var8 = 0; var8 < var7; ++var8) {
                                    if (var1 >= 31) {
                                       throw new IllegalStateException();
                                    }

                                    var9 = var32.cl(-1243035831);
                                    var10 = var32.cx(-1040339544);
                                    if (var9 >= 0 && var9 < this.aw.length && this.aw[var9]) {
                                       if (var1 >= 31) {
                                          return;
                                       }

                                       this.ac.put(var9, var10);
                                    }
                                 }

                                 var8 = var32.cl(-1810507928);

                                 for(var9 = 0; var9 < var8; ++var9) {
                                    if (var1 >= 31) {
                                       throw new IllegalStateException();
                                    }

                                    var32.cl(782954984);
                                    var32.cw((byte)0);
                                 }

                                 var23 = false;
                                 break label331;
                              }

                              if (var1 >= 31) {
                                 throw new IllegalStateException();
                              }

                              var23 = false;
                           } else {
                              var23 = false;
                           }
                           break label338;
                        }

                        var23 = false;
                     } catch (Exception var29) {
                        var23 = false;
                        break label337;
                     } finally {
                        if (var23) {
                           try {
                              var2.aw((byte)-62);
                           } catch (Exception var24) {
                           }

                        }
                     }

                     try {
                        var2.aw((byte)-118);
                     } catch (Exception var25) {
                     }

                     return;
                  }

                  try {
                     var2.aw((byte)-77);
                  } catch (Exception var28) {
                  }

                  return;
               }

               try {
                  var2.aw((byte)-55);
               } catch (Exception var26) {
               }
               break label332;
            }

            try {
               var2.aw((byte)-106);
            } catch (Exception var27) {
            }
         }

         this.ab = false;
      } catch (RuntimeException var31) {
         throw db.an(var31, "ep.aa(" + ')');
      }
   }

   void be() {
      if (this.ab && -7171747788514623875L * this.aq < dq.af(1752408278) - 60000L) {
         this.at(1649956052);
      }

   }

   String ac(int var1, int var2) {
      try {
         Object var3 = this.ac.get(var1);
         if (var3 instanceof String) {
            if (var2 <= -1398205849) {
               throw new IllegalStateException();
            } else {
               return (String)var3;
            }
         } else {
            return "";
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "ep.ac(" + ')');
      }
   }

   void ax(int var1, int var2) {
      this.ac.put(var1, var2);
      if (this.aw[var1]) {
         this.ab = true;
      }

   }

   void ai(int var1, int var2) {
      this.ac.put(var1, var2);
      if (this.aw[var1]) {
         this.ab = true;
      }

   }

   void ae() {
      int var1;
      for(var1 = 0; var1 < this.aw.length; ++var1) {
         if (!this.aw[var1]) {
            this.ac.remove(var1);
         }
      }

      for(var1 = 0; var1 < this.au.length; ++var1) {
         this.au[var1] = null;
      }

   }

   int ah(int var1) {
      Object var2 = this.ac.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   int av(int var1) {
      Object var2 = this.ac.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   sy by(boolean var1) {
      return in.an("2", client.cc.aq, var1, (byte)-128);
   }

   void am(int var1, String var2) {
      this.ac.put(var1, var2);
   }

   String as(int var1) {
      Object var2 = this.ac.get(var1);
      return var2 instanceof String ? (String)var2 : "";
   }

   /** @deprecated */
   @Deprecated
   void aj(int var1, String var2) {
      this.au[var1] = var2;
   }

   void ar(int var1, String var2) {
      this.ac.put(var1, var2);
   }

   /** @deprecated */
   @Deprecated
   String az(int var1) {
      return this.au[var1];
   }

   void ad() {
      int var1;
      for(var1 = 0; var1 < this.aw.length; ++var1) {
         if (!this.aw[var1]) {
            this.ac.remove(var1);
         }
      }

      for(var1 = 0; var1 < this.au.length; ++var1) {
         this.au[var1] = null;
      }

   }

   void af(int var1, int var2, int var3) {
      try {
         this.ac.put(var1, var2);
         if (this.aw[var1]) {
            if (var3 <= -849853159) {
               throw new IllegalStateException();
            }

            this.ab = true;
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "ep.af(" + ')');
      }
   }

   sy ap(boolean var1) {
      return in.an("2", client.cc.aq, var1, (byte)-78);
   }

   ep() {
      try {
         super();
         this.ab = false;
         int var1 = dk.fn.cq(19, (byte)22);
         this.ac = new HashMap();
         this.aw = new boolean[var1];

         int var2;
         for(var2 = 0; var2 < var1; ++var2) {
            hi var4 = (hi)hi.an.af((long)var2);
            hi var3;
            if (var4 != null) {
               var3 = var4;
            } else {
               byte[] var5 = lh.af.bh(19, var2, (byte)-124);
               var4 = new hi();
               if (var5 != null) {
                  var4.af(new sg(var5), 1521148390);
               }

               hi.an.aw(var4, (long)var2);
               var3 = var4;
            }

            this.aw[var2] = var3.aw;
         }

         var2 = 0;
         if (dk.fn.ao(15, -1442403869)) {
            var2 = dk.fn.cq(15, (byte)125);
         }

         this.au = new String[var2];
         this.aa((byte)-44);
      } catch (RuntimeException var6) {
         throw db.an(var6, "ep.<init>(" + ')');
      }
   }

   void bi() {
      sy var1 = this.al(false, (byte)26);
      boolean var21 = false;

      label253: {
         label254: {
            label247: {
               label246: {
                  try {
                     var21 = true;
                     byte[] var2 = new byte[(int)var1.au(2057565600)];

                     int var4;
                     for(int var3 = 0; var3 < var2.length; var3 += var4) {
                        var4 = var1.ab(var2, var3, var2.length - var3, 517917708);
                        if (-1 == var4) {
                           throw new EOFException();
                        }
                     }

                     sg var29 = new sg(var2);
                     if (var29.al.length - -1633313603 * var29.at < 1) {
                        var21 = false;
                        break label247;
                     }

                     int var5 = var29.cm((byte)7);
                     if (var5 < 0) {
                        var21 = false;
                        break label254;
                     }

                     if (var5 > 2) {
                        var21 = false;
                        break label254;
                     }

                     int var6;
                     int var7;
                     int var8;
                     int var9;
                     if (var5 >= 2) {
                        var6 = var29.cl(516480397);

                        for(var7 = 0; var7 < var6; ++var7) {
                           var8 = var29.cl(446535072);
                           var9 = var29.cm((byte)7);
                           sh var10 = (sh)ht.af(sh.au(-1975029258), var9, (short)173);
                           Object var11 = var10.at(var29, -1183771146);
                           if (var8 >= 0 && var8 < this.aw.length && this.aw[var8]) {
                              this.ac.put(var8, var11);
                           }
                        }

                        var21 = false;
                     } else {
                        var6 = var29.cl(31169772);

                        for(var7 = 0; var7 < var6; ++var7) {
                           var8 = var29.cl(-924973628);
                           var9 = var29.cx(-1070436426);
                           if (var8 >= 0 && var8 < this.aw.length && this.aw[var8]) {
                              this.ac.put(var8, var9);
                           }
                        }

                        var7 = var29.cl(228465192);

                        for(var8 = 0; var8 < var7; ++var8) {
                           var29.cl(-1412023943);
                           var29.cw((byte)0);
                        }

                        var21 = false;
                     }
                  } catch (Exception var27) {
                     var21 = false;
                     break label246;
                  } finally {
                     if (var21) {
                        try {
                           var1.aw((byte)-77);
                        } catch (Exception var22) {
                        }

                     }
                  }

                  try {
                     var1.aw((byte)-124);
                  } catch (Exception var25) {
                  }
                  break label253;
               }

               try {
                  var1.aw((byte)-86);
               } catch (Exception var24) {
               }
               break label253;
            }

            try {
               var1.aw((byte)-13);
            } catch (Exception var23) {
            }

            return;
         }

         try {
            var1.aw((byte)-63);
         } catch (Exception var26) {
         }

         return;
      }

      this.ab = false;
   }

   boolean bz() {
      return this.ab;
   }

   static Date aq(int var0) {
      try {
         Calendar var1 = Calendar.getInstance();
         var1.set(2, 0);
         var1.set(5, 1);
         var1.set(1, 1900);
         return var1.getTime();
      } catch (RuntimeException var2) {
         throw db.an(var2, "ep.aq(" + ')');
      }
   }

   void bk() {
      if (this.ab && -7171747788514623875L * this.aq < dq.af(-67318408) - 60000L) {
         this.at(1842858363);
      }

   }

   void bx() {
      if (this.ab && -7171747788514623875L * this.aq < dq.af(36836521) - 60000L) {
         this.at(2092264224);
      }

   }

   void bo() {
      if (this.ab && -7171747788514623875L * this.aq < dq.af(1237886239) - 60000L) {
         this.at(1720208837);
      }

   }

   void ag(int var1, int var2) {
      this.ac.put(var1, var2);
      if (this.aw[var1]) {
         this.ab = true;
      }

   }

   void ay(int var1) {
      try {
         if (this.ab) {
            if (var1 <= 719626805) {
               throw new IllegalStateException();
            }

            if (-7171747788514623875L * this.aq < dq.af(1564702941) - 60000L) {
               if (var1 <= 719626805) {
                  throw new IllegalStateException();
               }

               this.at(1833521546);
            }
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "ep.ay(" + ')');
      }
   }

   boolean bd() {
      return this.ab;
   }

   boolean ao(int var1) {
      try {
         return this.ab;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ep.ao(" + ')');
      }
   }

   static int aq(int var0, ch var1, boolean var2, int var3) {
      try {
         mq var4;
         if (var0 >= 2000) {
            if (var3 <= 226455781) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var4 = gh.an(cy.al[(cy.at -= 427135973) * -964267539], (byte)5);
         } else {
            mq var10000;
            if (var2) {
               if (var3 <= 226455781) {
                  throw new IllegalStateException();
               }

               var10000 = bq.ag;
            } else {
               var10000 = an.ai;
            }

            var4 = var10000;
         }

         fw.ma(var4, -1150862978);
         int var5;
         int var6;
         boolean var10;
         if (1200 != var0) {
            if (var3 <= 226455781) {
               throw new IllegalStateException();
            }

            if (1205 != var0 && 1212 != var0) {
               if (1201 == var0) {
                  if (var3 <= 226455781) {
                     throw new IllegalStateException();
                  }

                  var4.dr = 866004410;
                  var4.dl = cy.al[(cy.at -= 427135973) * -964267539] * 509431749;
                  return 1;
               }

               if (var0 == 1202) {
                  if (var3 <= 226455781) {
                     throw new IllegalStateException();
                  }

                  var4.dr = -848477033;
                  var4.dl = lq.mi.aw.ao((short)1364) * 509431749;
                  return 1;
               }

               if (1207 == var0) {
                  if (var3 <= 226455781) {
                     throw new IllegalStateException();
                  }

                  if (cy.al[(cy.at -= 427135973) * -964267539] == 1) {
                     if (var3 <= 226455781) {
                        throw new IllegalStateException();
                     }

                     var10 = true;
                  } else {
                     var10 = false;
                  }

                  boolean var9 = var10;
                  dm.bv(var4, lq.mi.aw, var9, (short)14391);
                  return 1;
               }

               if (1208 == var0) {
                  if (var3 <= 226455781) {
                     throw new IllegalStateException();
                  }

                  var5 = cy.al[(cy.at -= 427135973) * -964267539];
                  if (var4.dd == null) {
                     throw new RuntimeException("");
                  }

                  ks.ba(var4, var5, -1511202412);
                  return 1;
               }

               if (var0 == 1209) {
                  if (var3 <= 226455781) {
                     throw new IllegalStateException();
                  }

                  cy.at -= 854271946;
                  var5 = cy.al[-964267539 * cy.at];
                  var6 = cy.al[1 + -964267539 * cy.at];
                  if (null == var4.dd) {
                     if (var3 <= 226455781) {
                        throw new IllegalStateException();
                     }

                     throw new RuntimeException("");
                  }

                  cp.bq(var4, var5, var6, -912045646);
                  return 1;
               }

               if (var0 == 1210) {
                  if (var3 <= 226455781) {
                     throw new IllegalStateException();
                  }

                  var5 = cy.al[(cy.at -= 427135973) * -964267539];
                  if (var4.dd == null) {
                     if (var3 <= 226455781) {
                        throw new IllegalStateException();
                     }

                     throw new RuntimeException("");
                  }

                  ga.bf(var4, 1693987821 * lq.mi.aw.au, var5, (byte)-103);
                  return 1;
               }

               return 2;
            }
         }

         cy.at -= 854271946;
         var5 = cy.al[cy.at * -964267539];
         var6 = cy.al[-964267539 * cy.at + 1];
         var4.gn = -1852876811 * var5;
         var4.gv = var6 * -568259577;
         hz var7 = dh.af(var5, (byte)76);
         var4.dh = 874786355 * var7.ak;
         var4.dp = -2065246853 * var7.az;
         var4.du = var7.ad * 745454881;
         var4.dg = -183088313 * var7.ae;
         var4.de = -347855449 * var7.ap;
         var4.db = 1614948179 * var7.aj;
         if (var0 == 1205) {
            if (var3 <= 226455781) {
               throw new IllegalStateException();
            }

            var4.dn = 0;
         } else {
            if (var0 == 1212) {
               if (var3 <= 226455781) {
                  throw new IllegalStateException();
               }

               var10 = true;
            } else {
               var10 = false;
            }

            boolean var10001;
            if (1552863327 * var7.bi == 1) {
               if (var3 <= 226455781) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            if (var10 | var10001) {
               if (var3 <= 226455781) {
                  throw new IllegalStateException();
               }

               var4.dn = -761533221;
            } else {
               var4.dn = -1523066442;
            }
         }

         if (var4.df * -289037969 > 0) {
            if (var3 <= 226455781) {
               throw new IllegalStateException();
            }

            var4.db = -467727501 * (100808544 * var4.db / (var4.df * -289037969));
         } else if (-1960603747 * var4.bh > 0) {
            var4.db = 100808544 * var4.db / (-1960603747 * var4.bh) * -467727501;
         }

         return 1;
      } catch (RuntimeException var8) {
         throw db.an(var8, "ep.aq(" + ')');
      }
   }

   boolean bm() {
      return this.ab;
   }
}
