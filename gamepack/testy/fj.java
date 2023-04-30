import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class fj {
   static final int hy = 16;
   public byte ao;
   boolean aw;
   public int ak;
   int au;
   public String ab;
   int aq;
   public boolean al;
   long[] ai;
   public byte aa;
   public byte ay;
   ro ap;
   public int ax;
   boolean an;
   public byte[] ag;
   int[] ah;
   static final int af = 6;
   public int[] ar;
   int[] av;
   public int as;
   public byte at;
   long ac;
   long[] az;
   public String[] ad;
   public String[] ae;
   public int aj;
   public boolean[] am;
   static nx ck;

   void aq(long var1, String var3, int var4, int var5) {
      try {
         if (var3 != null) {
            if (var5 != -706420067) {
               return;
            }

            if (var3.length() == 0) {
               if (var5 != -706420067) {
                  throw new IllegalStateException();
               }

               var3 = null;
            }
         }

         boolean var10000;
         if (var1 > 0L) {
            if (var5 != -706420067) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         if (var10000 != this.an) {
            if (var5 == -706420067) {
               throw new RuntimeException("");
            }
         } else {
            var10000 = this.aw;
            boolean var10001;
            if (var3 != null) {
               if (var5 != -706420067) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            if (var10000 != var10001) {
               throw new RuntimeException("");
            } else {
               label119: {
                  label129: {
                     if (var1 > 0L) {
                        if (var5 != -706420067) {
                           throw new IllegalStateException();
                        }

                        if (null == this.ai) {
                           break label129;
                        }

                        if (var5 != -706420067) {
                           return;
                        }

                        if (1247430143 * this.ax >= this.ai.length) {
                           break label129;
                        }

                        if (var5 != -706420067) {
                           return;
                        }
                     }

                     if (null == var3) {
                        break label119;
                     }

                     if (var5 != -706420067) {
                        throw new IllegalStateException();
                     }

                     if (this.ad != null) {
                        if (var5 != -706420067) {
                           return;
                        }

                        if (this.ax * 1247430143 < this.ad.length) {
                           break label119;
                        }

                        if (var5 != -706420067) {
                           return;
                        }
                     }
                  }

                  this.af(5 + 1247430143 * this.ax, 1318866700);
               }

               if (null != this.ai) {
                  if (var5 != -706420067) {
                     throw new IllegalStateException();
                  }

                  this.ai[this.ax * 1247430143] = var1;
               }

               if (null != this.ad) {
                  if (var5 != -706420067) {
                     throw new IllegalStateException();
                  }

                  this.ad[1247430143 * this.ax] = var3;
               }

               if (-1 == 680027429 * this.as) {
                  if (var5 != -706420067) {
                     throw new IllegalStateException();
                  }

                  this.as = this.ax * 28974931;
                  this.ag[1247430143 * this.ax] = 126;
               } else {
                  this.ag[1247430143 * this.ax] = 0;
               }

               this.av[this.ax * 1247430143] = 0;
               this.ar[this.ax * 1247430143] = var4;
               this.am[1247430143 * this.ax] = false;
               this.ax += -1836992001;
               this.ah = null;
            }
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "fj.aq(" + ')');
      }
   }

   void bx(int var1) {
      if (var1 >= 0 && var1 < 732068671 * this.ax) {
         this.ax -= -1836992001;
         this.ah = null;
         if (0 == -2105198272 * this.ax) {
            this.ai = null;
            this.ad = null;
            this.ag = null;
            this.av = null;
            this.ar = null;
            this.am = null;
            this.as = 2140298164;
            this.aj = 1281545577;
         } else {
            System.arraycopy(this.ag, 1 + var1, this.ag, var1, 1247430143 * this.ax - var1);
            System.arraycopy(this.av, var1 + 1, this.av, var1, 1247430143 * this.ax - var1);
            System.arraycopy(this.ar, 1 + var1, this.ar, var1, -2050628105 * this.ax - var1);
            System.arraycopy(this.am, 1 + var1, this.am, var1, this.ax * 1565577319 - var1);
            if (this.ai != null) {
               System.arraycopy(this.ai, var1 + 1, this.ai, var1, 1721772876 * this.ax - var1);
            }

            if (null != this.ad) {
               System.arraycopy(this.ad, 1 + var1, this.ad, var1, this.ax * -109131821 - var1);
            }

            this.at(-2012342210);
         }

      } else {
         throw new RuntimeException("");
      }
   }

   boolean ax(int var1, byte var2) {
      try {
         if (this.as * 680027429 != var1) {
            if (var2 != -1) {
               throw new IllegalStateException();
            }

            if (this.ag[var1] != 126) {
               this.ag[680027429 * this.as] = 125;
               this.aj = this.as * 251618433;
               this.ag[var1] = 126;
               this.as = 1473982125 * var1;
               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw db.an(var3, "fj.ax(" + ')');
      }
   }

   public int aw(String var1, byte var2) {
      try {
         if (null != var1) {
            if (var2 <= 18) {
               throw new IllegalStateException();
            }

            if (var1.length() != 0) {
               for(int var3 = 0; var3 < 1247430143 * this.ax; ++var3) {
                  if (this.ad[var3].equals(var1)) {
                     if (var2 <= 18) {
                        throw new IllegalStateException();
                     }

                     return var3;
                  }
               }

               return -1;
            }

            if (var2 <= 18) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw db.an(var4, "fj.aw(" + ')');
      }
   }

   public int ac(int var1, int var2, int var3, byte var4) {
      try {
         int var10000;
         if (31 == var3) {
            if (var4 <= 8) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = (1 << var3 + 1) - 1;
         }

         int var5 = var10000;
         return (this.av[var1] & var5) >>> var2;
      } catch (RuntimeException var6) {
         throw db.an(var6, "fj.ac(" + ')');
      }
   }

   void an(int var1, byte var2) {
      try {
         if (this.an) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            if (this.az != null) {
               System.arraycopy(this.az, 0, this.az = new long[var1], 0, -325159675 * this.ak);
            } else {
               this.az = new long[var1];
            }
         }

         if (this.aw) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            if (this.ae != null) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.ae, 0, this.ae = new String[var1], 0, -325159675 * this.ak);
            } else {
               this.ae = new String[var1];
            }
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "fj.an(" + ')');
      }
   }

   public int[] ab(byte var1) {
      try {
         if (null == this.ah) {
            String[] var2 = new String[1247430143 * this.ax];
            this.ah = new int[this.ax * 1247430143];

            for(int var3 = 0; var3 < 1247430143 * this.ax; this.ah[var3] = var3++) {
               if (var1 <= 4) {
                  throw new IllegalStateException();
               }

               var2[var3] = this.ad[var3];
               if (null != var2[var3]) {
                  if (var1 <= 4) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = var2[var3].toLowerCase();
               }
            }

            int[] var5 = this.ah;
            fd.aw(var2, var5, 0, var2.length - 1, (byte)1);
         }

         return this.ah;
      } catch (RuntimeException var4) {
         throw db.an(var4, "fj.ab(" + ')');
      }
   }

   void bd(int var1) {
      this.ak -= 252514253;
      if (-325159675 * this.ak == 0) {
         this.az = null;
         this.ae = null;
      } else {
         if (this.az != null) {
            System.arraycopy(this.az, var1 + 1, this.az, var1, this.ak * -325159675 - var1);
         }

         if (null != this.ae) {
            System.arraycopy(this.ae, 1 + var1, this.ae, var1, this.ak * -325159675 - var1);
         }
      }

   }

   void al(int var1, byte var2) {
      try {
         if (var1 >= 0) {
            if (var2 >= 5) {
               return;
            }

            if (var1 < 1247430143 * this.ax) {
               this.ax -= -1836992001;
               this.ah = null;
               if (0 == 1247430143 * this.ax) {
                  if (var2 >= 5) {
                     throw new IllegalStateException();
                  }

                  this.ai = null;
                  this.ad = null;
                  this.ag = null;
                  this.av = null;
                  this.ar = null;
                  this.am = null;
                  this.as = -1473982125;
                  this.aj = 671016659;
               } else {
                  System.arraycopy(this.ag, 1 + var1, this.ag, var1, 1247430143 * this.ax - var1);
                  System.arraycopy(this.av, var1 + 1, this.av, var1, 1247430143 * this.ax - var1);
                  System.arraycopy(this.ar, 1 + var1, this.ar, var1, 1247430143 * this.ax - var1);
                  System.arraycopy(this.am, 1 + var1, this.am, var1, this.ax * 1247430143 - var1);
                  if (this.ai != null) {
                     if (var2 >= 5) {
                        throw new IllegalStateException();
                     }

                     System.arraycopy(this.ai, var1 + 1, this.ai, var1, 1247430143 * this.ax - var1);
                  }

                  if (null != this.ad) {
                     if (var2 >= 5) {
                        throw new IllegalStateException();
                     }

                     System.arraycopy(this.ad, 1 + var1, this.ad, var1, this.ax * 1247430143 - var1);
                  }

                  this.at(-163359433);
               }

               return;
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var3) {
         throw db.an(var3, "fj.al(" + ')');
      }
   }

   void at(int var1) {
      try {
         if (1247430143 * this.ax == 0) {
            this.as = -1473982125;
            this.aj = 671016659;
         } else {
            this.as = -1473982125;
            this.aj = 671016659;
            int var2 = 0;
            byte var3 = this.ag[0];

            for(int var4 = 1; var4 < this.ax * 1247430143; ++var4) {
               if (var1 >= 551654911) {
                  return;
               }

               if (this.ag[var4] > var3) {
                  if (var1 >= 551654911) {
                     throw new IllegalStateException();
                  }

                  if (var3 == 125) {
                     if (var1 >= 551654911) {
                        return;
                     }

                     this.aj = var2 * -671016659;
                  }

                  var2 = var4;
                  var3 = this.ag[var4];
               } else if (this.aj * -1218077019 == -1) {
                  if (var1 >= 551654911) {
                     throw new IllegalStateException();
                  }

                  if (this.ag[var4] == 125) {
                     if (var1 >= 551654911) {
                        throw new IllegalStateException();
                     }

                     this.aj = -671016659 * var4;
                  }
               }
            }

            this.as = 1473982125 * var2;
            if (this.as * 680027429 != -1) {
               if (var1 >= 551654911) {
                  throw new IllegalStateException();
               }

               this.ag[680027429 * this.as] = 126;
            }

         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "fj.at(" + ')');
      }
   }

   void aa(long var1, String var3, int var4) {
      try {
         if (null != var3) {
            if (var4 != -1787643966) {
               throw new IllegalStateException();
            }

            if (var3.length() == 0) {
               if (var4 != -1787643966) {
                  throw new IllegalStateException();
               }

               var3 = null;
            }
         }

         if (var1 > 0L != this.an) {
            throw new RuntimeException("");
         } else if (null != var3 != this.aw) {
            if (var4 != -1787643966) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            label89: {
               label99: {
                  if (var1 > 0L) {
                     if (var4 != -1787643966) {
                        throw new IllegalStateException();
                     }

                     if (null == this.az || this.ak * -325159675 >= this.az.length) {
                        break label99;
                     }
                  }

                  if (var3 == null) {
                     break label89;
                  }

                  if (var4 != -1787643966) {
                     throw new IllegalStateException();
                  }

                  if (this.ae != null) {
                     if (this.ak * -325159675 < this.ae.length) {
                        break label89;
                     }

                     if (var4 != -1787643966) {
                        throw new IllegalStateException();
                     }
                  }
               }

               this.an(-325159675 * this.ak + 5, (byte)-100);
            }

            if (this.az != null) {
               if (var4 != -1787643966) {
                  return;
               }

               this.az[this.ak * -325159675] = var1;
            }

            if (this.ae != null) {
               if (var4 != -1787643966) {
                  throw new IllegalStateException();
               }

               this.ae[-325159675 * this.ak] = var3;
            }

            this.ak += 252514253;
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "fj.aa(" + ')');
      }
   }

   void ay(int var1, int var2) {
      try {
         this.ak -= 252514253;
         if (-325159675 * this.ak == 0) {
            if (var2 == 1839794562) {
               throw new IllegalStateException();
            }

            this.az = null;
            this.ae = null;
         } else {
            if (this.az != null) {
               if (var2 == 1839794562) {
                  return;
               }

               System.arraycopy(this.az, var1 + 1, this.az, var1, this.ak * -325159675 - var1);
            }

            if (null != this.ae) {
               if (var2 == 1839794562) {
                  return;
               }

               System.arraycopy(this.ae, 1 + var1, this.ae, var1, this.ak * -325159675 - var1);
            }
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "fj.ay(" + ')');
      }
   }

   public Integer by(int var1) {
      if (null == this.ap) {
         return null;
      } else {
         rp var2 = this.ap.af((long)var1);
         return var2 != null && var2 instanceof rt ? new Integer(((rt)var2).af) : null;
      }
   }

   boolean ar(int var1, long var2) {
      try {
         if (null != this.ap) {
            rp var4 = this.ap.af((long)var1);
            if (null != var4) {
               if (var4 instanceof rq) {
                  rq var5 = (rq)var4;
                  if (var2 == var5.af) {
                     return false;
                  }

                  var5.af = var2;
                  return true;
               }

               var4.ga();
            }
         } else {
            this.ap = new ro(4);
         }

         this.ap.an(new rq(var2), (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw db.an(var6, "fj.ar(" + ')');
      }
   }

   int ai(int var1, boolean var2, short var3) {
      try {
         if (var2 == this.am[var1]) {
            if (var3 >= 205) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            this.am[var1] = var2;
            return var1;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "fj.ai(" + ')');
      }
   }

   int bj(int var1, byte var2) {
      if (126 != var2 && var2 != 127) {
         if (680027429 * this.as == var1 && (this.aj * 1855221862 == -1 || this.ag[this.aj * -1218077019] < -777904272)) {
            return -1;
         } else if (this.ag[var1] == var2) {
            return -1;
         } else {
            this.ag[var1] = var2;
            this.at(200377569);
            return var1;
         }
      } else {
         return -1;
      }
   }

   boolean ah(int var1, int var2, int var3) {
      try {
         if (this.ap != null) {
            if (var3 == 308798124) {
               throw new IllegalStateException();
            }

            rp var4 = this.ap.af((long)var1);
            if (var4 != null) {
               if (var4 instanceof rt) {
                  rt var5 = (rt)var4;
                  if (var2 == var5.af) {
                     if (var3 == 308798124) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  var5.af = var2;
                  return true;
               }

               var4.ga();
            }
         } else {
            this.ap = new ro(4);
         }

         this.ap.an(new rt(var2), (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw db.an(var6, "fj.ah(" + ')');
      }
   }

   boolean av(int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = (1 << var3) - 1;
         int var10000;
         if (var4 == 31) {
            if (var5 == -964267539) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = (1 << 1 + var4) - 1;
         }

         int var7 = var10000;
         int var8 = var7 ^ var6;
         var2 <<= var3;
         var2 &= var8;
         if (null != this.ap) {
            if (var5 == -964267539) {
               throw new IllegalStateException();
            }

            rp var9 = this.ap.af((long)var1);
            if (var9 != null) {
               if (var5 == -964267539) {
                  throw new IllegalStateException();
               }

               if (var9 instanceof rt) {
                  if (var5 == -964267539) {
                     throw new IllegalStateException();
                  }

                  rt var10 = (rt)var9;
                  if ((var10.af & var8) == var2) {
                     if (var5 == -964267539) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  var10.af &= ~var8;
                  var10.af |= var2;
                  return true;
               }

               var9.ga();
            }
         } else {
            this.ap = new ro(4);
         }

         this.ap.an(new rt(var2), (long)var1);
         return true;
      } catch (RuntimeException var11) {
         throw db.an(var11, "fj.av(" + ')');
      }
   }

   public Integer ap(int var1) {
      if (null == this.ap) {
         return null;
      } else {
         rp var2 = this.ap.af((long)var1);
         return var2 != null && var2 instanceof rt ? new Integer(((rt)var2).af) : null;
      }
   }

   boolean am(int var1, String var2, int var3) {
      try {
         if (var2 == null) {
            if (var3 == 942118982) {
               throw new IllegalStateException();
            }

            var2 = "";
         } else if (var2.length() > 80) {
            if (var3 == 942118982) {
               throw new IllegalStateException();
            }

            var2 = var2.substring(0, 80);
         }

         if (null != this.ap) {
            if (var3 == 942118982) {
               throw new IllegalStateException();
            }

            rp var4 = this.ap.af((long)var1);
            if (null != var4) {
               if (var3 == 942118982) {
                  throw new IllegalStateException();
               }

               if (var4 instanceof rd) {
                  if (var3 == 942118982) {
                     throw new IllegalStateException();
                  }

                  rd var5 = (rd)var4;
                  if (var5.af instanceof String) {
                     if (var3 == 942118982) {
                        throw new IllegalStateException();
                     }

                     if (var2.equals(var5.af)) {
                        if (var3 == 942118982) {
                           throw new IllegalStateException();
                        }

                        return false;
                     }

                     var5.ga();
                     this.ap.an(new rd(var2), var5.hr);
                     return true;
                  }
               }

               var4.ga();
            }
         } else {
            this.ap = new ro(4);
         }

         this.ap.an(new rd(var2), (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw db.an(var6, "fj.am(" + ')');
      }
   }

   void as(sg var1, byte var2) {
      try {
         int var3 = var1.cm((byte)7);
         if (var3 >= 1) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            if (var3 <= 6) {
               int var4 = var1.cm((byte)7);
               if ((var4 & 1) != 0) {
                  this.an = true;
               }

               if (0 != (var4 & 2)) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.aw = true;
               }

               if (!this.an) {
                  this.ai = null;
                  this.az = null;
               }

               if (!this.aw) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.ad = null;
                  this.ae = null;
               }

               this.au = var1.cx(-1556304769) * 2008489311;
               this.aq = var1.cx(-1800847684) * -1779678671;
               if (var3 <= 3) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (-468068655 * this.aq != 0) {
                     this.aq += 426811296;
                  }
               }

               this.ax = var1.cl(-1887543270) * -1836992001;
               this.ak = var1.cm((byte)7) * 252514253;
               this.ab = var1.cw((byte)0);
               if (var3 >= 4) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  var1.cx(-2035497486);
               }

               boolean var10001;
               if (var1.cm((byte)7) == 1) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               this.al = var10001;
               this.at = var1.cf(435772489);
               this.aa = var1.cf(435772489);
               this.ay = var1.cf(435772489);
               this.ao = var1.cf(435772489);
               int var5;
               if (1247430143 * this.ax > 0) {
                  if (this.an) {
                     label404: {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (this.ai != null) {
                           if (var2 >= 0) {
                              return;
                           }

                           if (this.ai.length >= 1247430143 * this.ax) {
                              break label404;
                           }

                           if (var2 >= 0) {
                              throw new IllegalStateException();
                           }
                        }

                        this.ai = new long[1247430143 * this.ax];
                     }
                  }

                  if (this.aw) {
                     label405: {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (null != this.ad) {
                           if (var2 >= 0) {
                              throw new IllegalStateException();
                           }

                           if (this.ad.length >= this.ax * 1247430143) {
                              break label405;
                           }
                        }

                        this.ad = new String[1247430143 * this.ax];
                     }
                  }

                  label347: {
                     if (this.ag != null) {
                        if (var2 >= 0) {
                           return;
                        }

                        if (this.ag.length >= 1247430143 * this.ax) {
                           break label347;
                        }

                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }
                     }

                     this.ag = new byte[1247430143 * this.ax];
                  }

                  label340: {
                     if (this.av != null) {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (this.av.length >= this.ax * 1247430143) {
                           break label340;
                        }

                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }
                     }

                     this.av = new int[this.ax * 1247430143];
                  }

                  label333: {
                     if (null != this.ar) {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (this.ar.length >= this.ax * 1247430143) {
                           break label333;
                        }

                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }
                     }

                     this.ar = new int[this.ax * 1247430143];
                  }

                  label326: {
                     if (null != this.am) {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (this.am.length >= this.ax * 1247430143) {
                           break label326;
                        }

                        if (var2 >= 0) {
                           return;
                        }
                     }

                     this.am = new boolean[1247430143 * this.ax];
                  }

                  for(var5 = 0; var5 < this.ax * 1247430143; ++var5) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (this.an) {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        this.ai[var5] = var1.cv((byte)1);
                     }

                     if (this.aw) {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        this.ad[var5] = var1.cz((byte)9);
                     }

                     this.ag[var5] = var1.cf(435772489);
                     if (var3 >= 2) {
                        this.av[var5] = var1.cx(-1161324087);
                     }

                     if (var3 >= 5) {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        this.ar[var5] = var1.cl(-934010390);
                     } else {
                        this.ar[var5] = 0;
                     }

                     if (var3 >= 6) {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        this.am[var5] = var1.cm((byte)7) == 1;
                     } else {
                        this.am[var5] = false;
                     }
                  }

                  this.at(-1881573906);
               }

               if (this.ak * -325159675 > 0) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (this.an) {
                     label408: {
                        if (null != this.az) {
                           if (var2 >= 0) {
                              throw new IllegalStateException();
                           }

                           if (this.az.length >= -325159675 * this.ak) {
                              break label408;
                           }
                        }

                        this.az = new long[-325159675 * this.ak];
                     }
                  }

                  if (this.aw) {
                     label409: {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (this.ae != null) {
                           if (this.ae.length >= this.ak * -325159675) {
                              break label409;
                           }

                           if (var2 >= 0) {
                              throw new IllegalStateException();
                           }
                        }

                        this.ae = new String[this.ak * -325159675];
                     }
                  }

                  for(var5 = 0; var5 < this.ak * -325159675; ++var5) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (this.an) {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        this.az[var5] = var1.cv((byte)1);
                     }

                     if (this.aw) {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        this.ae[var5] = var1.cz((byte)-72);
                     }
                  }
               }

               if (var3 >= 3) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  var5 = var1.cl(-68819352);
                  if (var5 > 0) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     ro var14 = new ro;
                     int var10003;
                     if (var5 < 16) {
                        if (var2 >= 0) {
                           return;
                        }

                        var10003 = co.ab(var5, 1341051994);
                     } else {
                        var10003 = 16;
                     }

                     var14.<init>(var10003);
                     this.ap = var14;

                     while(var5-- > 0) {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        int var6 = var1.cx(-1761556438);
                        int var7 = var6 & 1073741823;
                        int var8 = var6 >>> 30;
                        if (var8 == 0) {
                           int var9 = var1.cx(-2124313259);
                           this.ap.an(new rt(var9), (long)var7);
                        } else if (var8 == 1) {
                           long var12 = var1.cv((byte)1);
                           this.ap.an(new rq(var12), (long)var7);
                        } else if (2 == var8) {
                           if (var2 >= 0) {
                              return;
                           }

                           String var13 = var1.cw((byte)0);
                           this.ap.an(new rd(var13), (long)var7);
                        }
                     }
                  }
               }

               return;
            }

            if (var2 >= 0) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("" + var3);
      } catch (RuntimeException var11) {
         throw db.an(var11, "fj.as(" + ')');
      }
   }

   void aj(int var1) {
      if (this.an) {
         if (null != this.ai) {
            System.arraycopy(this.ai, 0, this.ai = new long[var1], 0, 1247430143 * this.ax);
         } else {
            this.ai = new long[var1];
         }
      }

      if (this.aw) {
         if (null != this.ad) {
            System.arraycopy(this.ad, 0, this.ad = new String[var1], 0, 1247430143 * this.ax);
         } else {
            this.ad = new String[var1];
         }
      }

      if (null != this.ag) {
         System.arraycopy(this.ag, 0, this.ag = new byte[var1], 0, this.ax * 1247430143);
      } else {
         this.ag = new byte[var1];
      }

      if (null != this.av) {
         System.arraycopy(this.av, 0, this.av = new int[var1], 0, 1247430143 * this.ax);
      } else {
         this.av = new int[var1];
      }

      if (this.ar != null) {
         System.arraycopy(this.ar, 0, this.ar = new int[var1], 0, this.ax * 1247430143);
      } else {
         this.ar = new int[var1];
      }

      if (null != this.am) {
         System.arraycopy(this.am, 0, this.am = new boolean[var1], 0, this.ax * 1247430143);
      } else {
         this.am = new boolean[var1];
      }

   }

   void ak(int var1) {
      if (this.an) {
         if (this.az != null) {
            System.arraycopy(this.az, 0, this.az = new long[var1], 0, -325159675 * this.ak);
         } else {
            this.az = new long[var1];
         }
      }

      if (this.aw) {
         if (this.ae != null) {
            System.arraycopy(this.ae, 0, this.ae = new String[var1], 0, -818851115 * this.ak);
         } else {
            this.ae = new String[var1];
         }
      }

   }

   void az(int var1) {
      if (this.an) {
         if (this.az != null) {
            System.arraycopy(this.az, 0, this.az = new long[var1], 0, -325159675 * this.ak);
         } else {
            this.az = new long[var1];
         }
      }

      if (this.aw) {
         if (this.ae != null) {
            System.arraycopy(this.ae, 0, this.ae = new String[var1], 0, -325159675 * this.ak);
         } else {
            this.ae = new String[var1];
         }
      }

   }

   int ag(int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = (1 << var3) - 1;
         int var10000;
         if (var4 == 31) {
            if (var5 == 2043769768) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = (1 << var4 + 1) - 1;
         }

         int var7 = var10000;
         int var8 = var7 ^ var6;
         var2 <<= var3;
         var2 &= var8;
         int var9 = this.av[var1];
         if (var2 == (var9 & var8)) {
            return -1;
         } else {
            var9 &= ~var8;
            this.av[var1] = var9 | var2;
            return var1;
         }
      } catch (RuntimeException var10) {
         throw db.an(var10, "fj.ag(" + ')');
      }
   }

   int ao(int var1, byte var2, int var3) {
      try {
         if (126 != var2) {
            if (var3 != -456839417) {
               throw new IllegalStateException();
            }

            if (var2 != 127) {
               if (680027429 * this.as == var1) {
                  label58: {
                     if (var3 != -456839417) {
                        throw new IllegalStateException();
                     }

                     if (this.aj * -1218077019 != -1) {
                        if (var3 != -456839417) {
                           throw new IllegalStateException();
                        }

                        if (this.ag[this.aj * -1218077019] >= 125) {
                           break label58;
                        }

                        if (var3 != -456839417) {
                           throw new IllegalStateException();
                        }
                     }

                     return -1;
                  }
               }

               if (this.ag[var1] == var2) {
                  return -1;
               }

               this.ag[var1] = var2;
               this.at(-605335751);
               return var1;
            }

            if (var3 != -456839417) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw db.an(var4, "fj.ao(" + ')');
      }
   }

   void cs(sg var1) {
      int var2 = var1.cm((byte)7);
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.cm((byte)7);
         if ((var3 & 1) != 0) {
            this.an = true;
         }

         if (0 != (var3 & 2)) {
            this.aw = true;
         }

         if (!this.an) {
            this.ai = null;
            this.az = null;
         }

         if (!this.aw) {
            this.ad = null;
            this.ae = null;
         }

         this.au = var1.cx(-2127263138) * 2008489311;
         this.aq = var1.cx(-1274619978) * -1779678671;
         if (var2 <= 3 && -468068655 * this.aq != 0) {
            this.aq += 426811296;
         }

         this.ax = var1.cl(-2051107711) * -1836992001;
         this.ak = var1.cm((byte)7) * 252514253;
         this.ab = var1.cw((byte)0);
         if (var2 >= 4) {
            var1.cx(-2107075621);
         }

         this.al = var1.cm((byte)7) == 1;
         this.at = var1.cf(435772489);
         this.aa = var1.cf(435772489);
         this.ay = var1.cf(435772489);
         this.ao = var1.cf(435772489);
         int var4;
         if (1247430143 * this.ax > 0) {
            if (this.an && (this.ai == null || this.ai.length < 1247430143 * this.ax)) {
               this.ai = new long[1247430143 * this.ax];
            }

            if (this.aw && (null == this.ad || this.ad.length < this.ax * 1247430143)) {
               this.ad = new String[1247430143 * this.ax];
            }

            if (this.ag == null || this.ag.length < 1247430143 * this.ax) {
               this.ag = new byte[1247430143 * this.ax];
            }

            if (this.av == null || this.av.length < this.ax * 1247430143) {
               this.av = new int[this.ax * 1247430143];
            }

            if (null == this.ar || this.ar.length < this.ax * 1247430143) {
               this.ar = new int[this.ax * 1247430143];
            }

            if (null == this.am || this.am.length < this.ax * 1247430143) {
               this.am = new boolean[1247430143 * this.ax];
            }

            for(var4 = 0; var4 < this.ax * 1247430143; ++var4) {
               if (this.an) {
                  this.ai[var4] = var1.cv((byte)1);
               }

               if (this.aw) {
                  this.ad[var4] = var1.cz((byte)-2);
               }

               this.ag[var4] = var1.cf(435772489);
               if (var2 >= 2) {
                  this.av[var4] = var1.cx(-1340078476);
               }

               if (var2 >= 5) {
                  this.ar[var4] = var1.cl(-1736267284);
               } else {
                  this.ar[var4] = 0;
               }

               if (var2 >= 6) {
                  this.am[var4] = var1.cm((byte)7) == 1;
               } else {
                  this.am[var4] = false;
               }
            }

            this.at(-377558824);
         }

         if (this.ak * -325159675 > 0) {
            if (this.an && (null == this.az || this.az.length < -325159675 * this.ak)) {
               this.az = new long[-325159675 * this.ak];
            }

            if (this.aw && (this.ae == null || this.ae.length < this.ak * -325159675)) {
               this.ae = new String[this.ak * -325159675];
            }

            for(var4 = 0; var4 < this.ak * -325159675; ++var4) {
               if (this.an) {
                  this.az[var4] = var1.cv((byte)1);
               }

               if (this.aw) {
                  this.ae[var4] = var1.cz((byte)-120);
               }
            }
         }

         if (var2 >= 3) {
            var4 = var1.cl(821741345);
            if (var4 > 0) {
               this.ap = new ro(var4 < 16 ? co.ab(var4, 849710483) : 16);

               while(var4-- > 0) {
                  int var5 = var1.cx(-1000553977);
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (var7 == 0) {
                     int var8 = var1.cx(-1605831139);
                     this.ap.an(new rt(var8), (long)var6);
                  } else if (var7 == 1) {
                     long var10 = var1.cv((byte)1);
                     this.ap.an(new rq(var10), (long)var6);
                  } else if (2 == var7) {
                     String var11 = var1.cw((byte)0);
                     this.ap.an(new rd(var11), (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   void bk(int var1) {
      if (var1 >= 0 && var1 < 1247430143 * this.ax) {
         this.ax -= -1836992001;
         this.ah = null;
         if (0 == 1247430143 * this.ax) {
            this.ai = null;
            this.ad = null;
            this.ag = null;
            this.av = null;
            this.ar = null;
            this.am = null;
            this.as = -1473982125;
            this.aj = 671016659;
         } else {
            System.arraycopy(this.ag, 1 + var1, this.ag, var1, 1247430143 * this.ax - var1);
            System.arraycopy(this.av, var1 + 1, this.av, var1, 1247430143 * this.ax - var1);
            System.arraycopy(this.ar, 1 + var1, this.ar, var1, 1247430143 * this.ax - var1);
            System.arraycopy(this.am, 1 + var1, this.am, var1, this.ax * 1247430143 - var1);
            if (this.ai != null) {
               System.arraycopy(this.ai, var1 + 1, this.ai, var1, 1247430143 * this.ax - var1);
            }

            if (null != this.ad) {
               System.arraycopy(this.ad, 1 + var1, this.ad, var1, this.ax * 1247430143 - var1);
            }

            this.at(-1430542149);
         }

      } else {
         throw new RuntimeException("");
      }
   }

   public int[] bb() {
      if (null == this.ah) {
         String[] var1 = new String[1247430143 * this.ax];
         this.ah = new int[this.ax * 1247430143];

         for(int var2 = 0; var2 < 1247430143 * this.ax; this.ah[var2] = var2++) {
            var1[var2] = this.ad[var2];
            if (null != var1[var2]) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         int[] var3 = this.ah;
         fd.aw(var1, var3, 0, var1.length - 1, (byte)1);
      }

      return this.ah;
   }

   void bi(long var1, String var3, int var4) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.an) {
         throw new RuntimeException("");
      } else if (this.aw != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (null == this.ai || 1247430143 * this.ax >= this.ai.length) || null != var3 && (this.ad == null || this.ax * 1247430143 >= this.ad.length)) {
            this.af(5 + -145560844 * this.ax, 1159199860);
         }

         if (null != this.ai) {
            this.ai[this.ax * 1247430143] = var1;
         }

         if (null != this.ad) {
            this.ad[-330308521 * this.ax] = var3;
         }

         if (-1 == 680027429 * this.as) {
            this.as = this.ax * 28974931;
            this.ag[-1679248936 * this.ax] = 126;
         } else {
            this.ag[-1985220856 * this.ax] = 0;
         }

         this.av[this.ax * 1247430143] = 0;
         this.ar[this.ax * 1247430143] = var4;
         this.am[1163859430 * this.ax] = false;
         this.ax += -1781536034;
         this.ah = null;
      }
   }

   int bs(int var1, byte var2) {
      if (126 != var2 && var2 != 127) {
         if (680027429 * this.as == var1 && (this.aj * 623280815 == -1 || this.ag[this.aj * 1719670841] < 125)) {
            return -1;
         } else if (this.ag[var1] == var2) {
            return -1;
         } else {
            this.ag[var1] = var2;
            this.at(167031367);
            return var1;
         }
      } else {
         return -1;
      }
   }

   int bn(int var1, byte var2) {
      if (126 != var2 && var2 != 889328059) {
         if (-1369837236 * this.as == var1 && (this.aj * -185323072 == -1 || this.ag[this.aj * -1218077019] < 125)) {
            return -1;
         } else if (this.ag[var1] == var2) {
            return -1;
         } else {
            this.ag[var1] = var2;
            this.at(-1045689302);
            return var1;
         }
      } else {
         return -1;
      }
   }

   void be(long var1, String var3, int var4) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.an) {
         throw new RuntimeException("");
      } else if (this.aw != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (null == this.ai || 1247430143 * this.ax >= this.ai.length) || null != var3 && (this.ad == null || this.ax * 1247430143 >= this.ad.length)) {
            this.af(5 + 1247430143 * this.ax, -99224992);
         }

         if (null != this.ai) {
            this.ai[this.ax * 1247430143] = var1;
         }

         if (null != this.ad) {
            this.ad[1247430143 * this.ax] = var3;
         }

         if (-1 == 680027429 * this.as) {
            this.as = this.ax * 28974931;
            this.ag[1247430143 * this.ax] = 126;
         } else {
            this.ag[1247430143 * this.ax] = 0;
         }

         this.av[this.ax * 1247430143] = 0;
         this.ar[this.ax * 1247430143] = var4;
         this.am[1247430143 * this.ax] = false;
         this.ax += -1836992001;
         this.ah = null;
      }
   }

   void bo() {
      if (1247430143 * this.ax == 0) {
         this.as = -1473982125;
         this.aj = 671016659;
      } else {
         this.as = -1473982125;
         this.aj = 671016659;
         int var1 = 0;
         byte var2 = this.ag[0];

         for(int var3 = 1; var3 < this.ax * 1247430143; ++var3) {
            if (this.ag[var3] > var2) {
               if (var2 == 125) {
                  this.aj = var1 * -671016659;
               }

               var1 = var3;
               var2 = this.ag[var3];
            } else if (this.aj * -1218077019 == -1 && this.ag[var3] == 125) {
               this.aj = -671016659 * var3;
            }
         }

         this.as = 1473982125 * var1;
         if (this.as * 680027429 != -1) {
            this.ag[680027429 * this.as] = 126;
         }

      }
   }

   void bz(long var1, String var3) {
      if (null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.an) {
         throw new RuntimeException("");
      } else if (null != var3 != this.aw) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (null == this.az || this.ak * -325159675 >= this.az.length) || var3 != null && (this.ae == null || this.ak * -1378027084 >= this.ae.length)) {
            this.an(-325159675 * this.ak + 5, (byte)-20);
         }

         if (this.az != null) {
            this.az[this.ak * 671283150] = var1;
         }

         if (this.ae != null) {
            this.ae[-1917328715 * this.ak] = var3;
         }

         this.ak += -1813664012;
      }
   }

   void bm(int var1) {
      this.ak -= 1118505787;
      if (1390543951 * this.ak == 0) {
         this.az = null;
         this.ae = null;
      } else {
         if (this.az != null) {
            System.arraycopy(this.az, var1 + 1, this.az, var1, this.ak * -325159675 - var1);
         }

         if (null != this.ae) {
            System.arraycopy(this.ae, 1 + var1, this.ae, var1, this.ak * -325159675 - var1);
         }
      }

   }

   void af(int var1, int var2) {
      try {
         if (this.an) {
            if (var2 <= -1006108627) {
               return;
            }

            if (null != this.ai) {
               if (var2 <= -1006108627) {
                  return;
               }

               System.arraycopy(this.ai, 0, this.ai = new long[var1], 0, 1247430143 * this.ax);
            } else {
               this.ai = new long[var1];
            }
         }

         if (this.aw) {
            if (var2 <= -1006108627) {
               throw new IllegalStateException();
            }

            if (null != this.ad) {
               System.arraycopy(this.ad, 0, this.ad = new String[var1], 0, 1247430143 * this.ax);
            } else {
               this.ad = new String[var1];
            }
         }

         if (null != this.ag) {
            System.arraycopy(this.ag, 0, this.ag = new byte[var1], 0, this.ax * 1247430143);
         } else {
            this.ag = new byte[var1];
         }

         if (null != this.av) {
            if (var2 <= -1006108627) {
               throw new IllegalStateException();
            }

            System.arraycopy(this.av, 0, this.av = new int[var1], 0, 1247430143 * this.ax);
         } else {
            this.av = new int[var1];
         }

         if (this.ar != null) {
            if (var2 <= -1006108627) {
               return;
            }

            System.arraycopy(this.ar, 0, this.ar = new int[var1], 0, this.ax * 1247430143);
         } else {
            this.ar = new int[var1];
         }

         if (null != this.am) {
            if (var2 <= -1006108627) {
               throw new IllegalStateException();
            }

            System.arraycopy(this.am, 0, this.am = new boolean[var1], 0, this.ax * 1247430143);
         } else {
            this.am = new boolean[var1];
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "fj.af(" + ')');
      }
   }

   public fj(sg var1) {
      try {
         super();
         this.au = 0;
         this.ab = null;
         this.aq = 0;
         this.as = -1473982125;
         this.aj = 671016659;
         this.as(var1, (byte)-101);
      } catch (RuntimeException var2) {
         throw db.an(var2, "fj.<init>(" + ')');
      }
   }

   boolean ba(int var1, int var2) {
      if (this.ap != null) {
         rp var3 = this.ap.af((long)var1);
         if (var3 != null) {
            if (var3 instanceof rt) {
               rt var4 = (rt)var3;
               if (var2 == var4.af) {
                  return false;
               }

               var4.af = var2;
               return true;
            }

            var3.ga();
         }
      } else {
         this.ap = new ro(4);
      }

      this.ap.an(new rt(var2), (long)var1);
      return true;
   }

   public int ae(int var1, int var2, int var3) {
      int var4 = 31 == var3 ? -1 : (1 << var3 + 1) - 1;
      return (this.av[var1] & var4) >>> var2;
   }

   int bf(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      int var8 = this.av[var1];
      if (var2 == (var8 & var7)) {
         return -1;
      } else {
         var8 &= ~var7;
         this.av[var1] = var8 | var2;
         return var1;
      }
   }

   int bt(int var1, byte var2) {
      if (126 != var2 && var2 != 127) {
         if (680027429 * this.as == var1 && (this.aj * -1218077019 == -1 || this.ag[this.aj * -1218077019] < 125)) {
            return -1;
         } else if (this.ag[var1] == var2) {
            return -1;
         } else {
            this.ag[var1] = var2;
            this.at(396434672);
            return var1;
         }
      } else {
         return -1;
      }
   }

   boolean bg(int var1) {
      if (this.as * 680027429 != var1 && this.ag[var1] != 126) {
         this.ag[680027429 * this.as] = 125;
         this.aj = this.as * 251618433;
         this.ag[var1] = 126;
         this.as = 1473982125 * var1;
         return true;
      } else {
         return false;
      }
   }

   boolean bu(int var1) {
      if (this.as * 680027429 != var1 && this.ag[var1] != 126) {
         this.ag[680027429 * this.as] = 125;
         this.aj = this.as * 251618433;
         this.ag[var1] = 126;
         this.as = 1473982125 * var1;
         return true;
      } else {
         return false;
      }
   }

   int br(int var1, byte var2) {
      if (126 != var2 && var2 != 1208871457) {
         if (680027429 * this.as != var1 || this.aj * -1218077019 != -1 && this.ag[this.aj * -1218077019] >= 1687258848) {
            if (this.ag[var1] == var2) {
               return -1;
            } else {
               this.ag[var1] = var2;
               this.at(-1108110189);
               return var1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   int bq(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      int var8 = this.av[var1];
      if (var2 == (var8 & var7)) {
         return -1;
      } else {
         var8 &= ~var7;
         this.av[var1] = var8 | var2;
         return var1;
      }
   }

   void ad(int var1) {
      if (this.an) {
         if (this.az != null) {
            System.arraycopy(this.az, 0, this.az = new long[var1], 0, -325159675 * this.ak);
         } else {
            this.az = new long[var1];
         }
      }

      if (this.aw) {
         if (this.ae != null) {
            System.arraycopy(this.ae, 0, this.ae = new String[var1], 0, -325159675 * this.ak);
         } else {
            this.ae = new String[var1];
         }
      }

   }

   boolean bv(int var1, int var2) {
      if (this.ap != null) {
         rp var3 = this.ap.af((long)var1);
         if (var3 != null) {
            if (var3 instanceof rt) {
               rt var4 = (rt)var3;
               if (var2 == var4.af) {
                  return false;
               }

               var4.af = var2;
               return true;
            }

            var3.ga();
         }
      } else {
         this.ap = new ro(4);
      }

      this.ap.an(new rt(var2), (long)var1);
      return true;
   }

   boolean bl(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << 1 + var4) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (null != this.ap) {
         rp var8 = this.ap.af((long)var1);
         if (var8 != null) {
            if (var8 instanceof rt) {
               rt var9 = (rt)var8;
               if ((var9.af & var7) == var2) {
                  return false;
               }

               var9.af &= ~var7;
               var9.af |= var2;
               return true;
            }

            var8.ga();
         }
      } else {
         this.ap = new ro(4);
      }

      this.ap.an(new rt(var2), (long)var1);
      return true;
   }

   boolean bp(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << 1 + var4) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (null != this.ap) {
         rp var8 = this.ap.af((long)var1);
         if (var8 != null) {
            if (var8 instanceof rt) {
               rt var9 = (rt)var8;
               if ((var9.af & var7) == var2) {
                  return false;
               }

               var9.af &= ~var7;
               var9.af |= var2;
               return true;
            }

            var8.ga();
         }
      } else {
         this.ap = new ro(4);
      }

      this.ap.an(new rt(var2), (long)var1);
      return true;
   }

   boolean bc(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << 1 + var4) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (null != this.ap) {
         rp var8 = this.ap.af((long)var1);
         if (var8 != null) {
            if (var8 instanceof rt) {
               rt var9 = (rt)var8;
               if ((var9.af & var7) == var2) {
                  return false;
               }

               var9.af &= ~var7;
               var9.af |= var2;
               return true;
            }

            var8.ga();
         }
      } else {
         this.ap = new ro(4);
      }

      this.ap.an(new rt(var2), (long)var1);
      return true;
   }

   boolean bh(int var1, long var2) {
      if (null != this.ap) {
         rp var4 = this.ap.af((long)var1);
         if (null != var4) {
            if (var4 instanceof rq) {
               rq var5 = (rq)var4;
               if (var2 == var5.af) {
                  return false;
               }

               var5.af = var2;
               return true;
            }

            var4.ga();
         }
      } else {
         this.ap = new ro(4);
      }

      this.ap.an(new rq(var2), (long)var1);
      return true;
   }

   boolean bw(int var1, String var2) {
      if (var2 == null) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (null != this.ap) {
         rp var3 = this.ap.af((long)var1);
         if (null != var3) {
            if (var3 instanceof rd) {
               rd var4 = (rd)var3;
               if (var4.af instanceof String) {
                  if (var2.equals(var4.af)) {
                     return false;
                  }

                  var4.ga();
                  this.ap.an(new rd(var2), var4.hr);
                  return true;
               }
            }

            var3.ga();
         }
      } else {
         this.ap = new ro(4);
      }

      this.ap.an(new rd(var2), (long)var1);
      return true;
   }

   boolean ce(int var1, String var2) {
      if (var2 == null) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (null != this.ap) {
         rp var3 = this.ap.af((long)var1);
         if (null != var3) {
            if (var3 instanceof rd) {
               rd var4 = (rd)var3;
               if (var4.af instanceof String) {
                  if (var2.equals(var4.af)) {
                     return false;
                  }

                  var4.ga();
                  this.ap.an(new rd(var2), var4.hr);
                  return true;
               }
            }

            var3.ga();
         }
      } else {
         this.ap = new ro(4);
      }

      this.ap.an(new rd(var2), (long)var1);
      return true;
   }

   void ci(sg var1) {
      int var2 = var1.cm((byte)7);
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.cm((byte)7);
         if ((var3 & 1) != 0) {
            this.an = true;
         }

         if (0 != (var3 & 2)) {
            this.aw = true;
         }

         if (!this.an) {
            this.ai = null;
            this.az = null;
         }

         if (!this.aw) {
            this.ad = null;
            this.ae = null;
         }

         this.au = var1.cx(-955878656) * 2008489311;
         this.aq = var1.cx(-1317770376) * 1112523832;
         if (var2 <= 3 && -468068655 * this.aq != 0) {
            this.aq += 426811296;
         }

         this.ax = var1.cl(-1854308305) * -1836992001;
         this.ak = var1.cm((byte)7) * 252514253;
         this.ab = var1.cw((byte)0);
         if (var2 >= 4) {
            var1.cx(-1706941785);
         }

         this.al = var1.cm((byte)7) == 1;
         this.at = var1.cf(435772489);
         this.aa = var1.cf(435772489);
         this.ay = var1.cf(435772489);
         this.ao = var1.cf(435772489);
         int var4;
         if (465272584 * this.ax > 0) {
            if (this.an && (this.ai == null || this.ai.length < 1247430143 * this.ax)) {
               this.ai = new long[1024973209 * this.ax];
            }

            if (this.aw && (null == this.ad || this.ad.length < this.ax * 830224546)) {
               this.ad = new String[172788411 * this.ax];
            }

            if (this.ag == null || this.ag.length < 1102649898 * this.ax) {
               this.ag = new byte[-983099127 * this.ax];
            }

            if (this.av == null || this.av.length < this.ax * 265718414) {
               this.av = new int[this.ax * 1705491880];
            }

            if (null == this.ar || this.ar.length < this.ax * -1700733149) {
               this.ar = new int[this.ax * -1983366732];
            }

            if (null == this.am || this.am.length < this.ax * 1247430143) {
               this.am = new boolean[-21781104 * this.ax];
            }

            for(var4 = 0; var4 < this.ax * 1247430143; ++var4) {
               if (this.an) {
                  this.ai[var4] = var1.cv((byte)1);
               }

               if (this.aw) {
                  this.ad[var4] = var1.cz((byte)-83);
               }

               this.ag[var4] = var1.cf(435772489);
               if (var2 >= 2) {
                  this.av[var4] = var1.cx(-1112741654);
               }

               if (var2 >= 5) {
                  this.ar[var4] = var1.cl(318281898);
               } else {
                  this.ar[var4] = 0;
               }

               if (var2 >= 6) {
                  this.am[var4] = var1.cm((byte)7) == 1;
               } else {
                  this.am[var4] = false;
               }
            }

            this.at(-719815457);
         }

         if (this.ak * -1871311559 > 0) {
            if (this.an && (null == this.az || this.az.length < -325159675 * this.ak)) {
               this.az = new long[-219234381 * this.ak];
            }

            if (this.aw && (this.ae == null || this.ae.length < this.ak * -325159675)) {
               this.ae = new String[this.ak * -325159675];
            }

            for(var4 = 0; var4 < this.ak * -325159675; ++var4) {
               if (this.an) {
                  this.az[var4] = var1.cv((byte)1);
               }

               if (this.aw) {
                  this.ae[var4] = var1.cz((byte)-73);
               }
            }
         }

         if (var2 >= 3) {
            var4 = var1.cl(-31983983);
            if (var4 > 0) {
               this.ap = new ro(var4 < 16 ? co.ab(var4, -134668559) : 16);

               while(var4-- > 0) {
                  int var5 = var1.cx(-973940819);
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (var7 == 0) {
                     int var8 = var1.cx(-1249187210);
                     this.ap.an(new rt(var8), (long)var6);
                  } else if (var7 == 1) {
                     long var10 = var1.cv((byte)1);
                     this.ap.an(new rq(var10), (long)var6);
                  } else if (2 == var7) {
                     String var11 = var1.cw((byte)0);
                     this.ap.an(new rd(var11), (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   public Integer au(int var1, byte var2) {
      try {
         if (null == this.ap) {
            if (var2 >= 96) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            rp var3 = this.ap.af((long)var1);
            if (var3 != null) {
               if (var2 >= 96) {
                  throw new IllegalStateException();
               }

               if (var3 instanceof rt) {
                  return new Integer(((rt)var3).af);
               }
            }

            return null;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "fj.au(" + ')');
      }
   }

   void cc(sg var1) {
      int var2 = var1.cm((byte)7);
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.cm((byte)7);
         if ((var3 & 1) != 0) {
            this.an = true;
         }

         if (0 != (var3 & 2)) {
            this.aw = true;
         }

         if (!this.an) {
            this.ai = null;
            this.az = null;
         }

         if (!this.aw) {
            this.ad = null;
            this.ae = null;
         }

         this.au = var1.cx(-2048388024) * 1788049528;
         this.aq = var1.cx(-996253599) * -1779678671;
         if (var2 <= 3 && -468068655 * this.aq != 0) {
            this.aq += 426811296;
         }

         this.ax = var1.cl(-604979223) * -1836992001;
         this.ak = var1.cm((byte)7) * 252514253;
         this.ab = var1.cw((byte)0);
         if (var2 >= 4) {
            var1.cx(-1142145566);
         }

         this.al = var1.cm((byte)7) == 1;
         this.at = var1.cf(435772489);
         this.aa = var1.cf(435772489);
         this.ay = var1.cf(435772489);
         this.ao = var1.cf(435772489);
         int var4;
         if (545714165 * this.ax > 0) {
            if (this.an && (this.ai == null || this.ai.length < -716719293 * this.ax)) {
               this.ai = new long[-1423940936 * this.ax];
            }

            if (this.aw && (null == this.ad || this.ad.length < this.ax * 1518438574)) {
               this.ad = new String[2019770442 * this.ax];
            }

            if (this.ag == null || this.ag.length < 263999675 * this.ax) {
               this.ag = new byte[1247430143 * this.ax];
            }

            if (this.av == null || this.av.length < this.ax * 1247430143) {
               this.av = new int[this.ax * 1247430143];
            }

            if (null == this.ar || this.ar.length < this.ax * 1247430143) {
               this.ar = new int[this.ax * 1247430143];
            }

            if (null == this.am || this.am.length < this.ax * 1247430143) {
               this.am = new boolean[1247430143 * this.ax];
            }

            for(var4 = 0; var4 < this.ax * -132914951; ++var4) {
               if (this.an) {
                  this.ai[var4] = var1.cv((byte)1);
               }

               if (this.aw) {
                  this.ad[var4] = var1.cz((byte)-90);
               }

               this.ag[var4] = var1.cf(435772489);
               if (var2 >= 2) {
                  this.av[var4] = var1.cx(-1980100778);
               }

               if (var2 >= 5) {
                  this.ar[var4] = var1.cl(-1737108440);
               } else {
                  this.ar[var4] = 0;
               }

               if (var2 >= 6) {
                  this.am[var4] = var1.cm((byte)7) == 1;
               } else {
                  this.am[var4] = false;
               }
            }

            this.at(-729100913);
         }

         if (this.ak * -508080464 > 0) {
            if (this.an && (null == this.az || this.az.length < 835727572 * this.ak)) {
               this.az = new long[-1291180691 * this.ak];
            }

            if (this.aw && (this.ae == null || this.ae.length < this.ak * -1360165301)) {
               this.ae = new String[this.ak * 1942074239];
            }

            for(var4 = 0; var4 < this.ak * 1214333954; ++var4) {
               if (this.an) {
                  this.az[var4] = var1.cv((byte)1);
               }

               if (this.aw) {
                  this.ae[var4] = var1.cz((byte)-104);
               }
            }
         }

         if (var2 >= 3) {
            var4 = var1.cl(-2141902099);
            if (var4 > 0) {
               this.ap = new ro(var4 < 16 ? co.ab(var4, 1009611624) : 16);

               while(var4-- > 0) {
                  int var5 = var1.cx(-1166265930);
                  int var6 = var5 & 232154466;
                  int var7 = var5 >>> 30;
                  if (var7 == 0) {
                     int var8 = var1.cx(-1629573371);
                     this.ap.an(new rt(var8), (long)var6);
                  } else if (var7 == 1) {
                     long var10 = var1.cv((byte)1);
                     this.ap.an(new rq(var10), (long)var6);
                  } else if (2 == var7) {
                     String var11 = var1.cw((byte)0);
                     this.ap.an(new rd(var11), (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   static boolean af(int var0, int var1, byte var2) {
      try {
         if (var0 == 4) {
            if (var2 <= 3) {
               throw new IllegalStateException();
            }

            if (var1 >= 8) {
               if (var2 <= 3) {
                  throw new IllegalStateException();
               }

               return false;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw db.an(var3, "fj.af(" + ')');
      }
   }

   public static File af(String var0, String var1, int var2, int var3) {
      try {
         String var10000;
         if (var2 == 0) {
            if (var3 == 616293686) {
               throw new IllegalStateException();
            }

            var10000 = "";
         } else {
            var10000 = "" + var2;
         }

         String var4 = var10000;
         gc.ac = new File(hd.az, "jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
         String var5 = null;
         String var6 = null;
         boolean var7 = false;
         sg var9;
         int var12;
         File var24;
         if (gc.ac.exists()) {
            if (var3 == 616293686) {
               throw new IllegalStateException();
            }

            try {
               label248: {
                  sy var8 = new sy(gc.ac, "rw", 10000L);

                  int var10;
                  for(var9 = new sg((int)var8.au(2074258523)); var9.at * -1633313603 < var9.al.length; var9.at += -1516355947 * var10) {
                     if (var3 == 616293686) {
                        throw new IllegalStateException();
                     }

                     var10 = var8.ab(var9.al, -1633313603 * var9.at, var9.al.length - var9.at * -1633313603, 336555180);
                     if (-1 == var10) {
                        if (var3 == 616293686) {
                           throw new IllegalStateException();
                        }

                        throw new IOException();
                     }
                  }

                  var9.at = 0;
                  var10 = var9.cm((byte)7);
                  if (var10 >= 1) {
                     if (var3 == 616293686) {
                        throw new IllegalStateException();
                     }

                     if (var10 <= 3) {
                        int var11 = 0;
                        if (var10 > 1) {
                           if (var3 == 616293686) {
                              throw new IllegalStateException();
                           }

                           var11 = var9.cm((byte)7);
                        }

                        if (var10 <= 2) {
                           var5 = var9.cj((short)-16960);
                           if (var11 == 1) {
                              var6 = var9.cj((short)-19988);
                           }
                        } else {
                           var5 = var9.ch(1368086059);
                           if (1 == var11) {
                              if (var3 == 616293686) {
                                 throw new IllegalStateException();
                              }

                              var6 = var9.ch(1819805751);
                           }
                        }

                        var8.aw((byte)-14);
                        break label248;
                     }

                     if (var3 == 616293686) {
                        throw new IllegalStateException();
                     }
                  }

                  throw new IOException("" + var10);
               }
            } catch (IOException var20) {
               var20.printStackTrace();
            }

            if (var5 != null) {
               var24 = new File(var5);
               if (!var24.exists()) {
                  if (var3 == 616293686) {
                     throw new IllegalStateException();
                  }

                  var5 = null;
               }
            }

            if (var5 != null) {
               var24 = new File(var5, "test.dat");

               boolean var26;
               try {
                  RandomAccessFile var29 = new RandomAccessFile(var24, "rw");
                  var12 = var29.read();
                  var29.seek(0L);
                  var29.write(var12);
                  var29.seek(0L);
                  var29.close();
                  var24.delete();
                  var26 = true;
               } catch (Exception var18) {
                  var26 = false;
               }

               if (!var26) {
                  var5 = null;
               }
            }
         }

         if (var5 == null) {
            if (var3 == 616293686) {
               throw new IllegalStateException();
            }

            if (var2 == 0) {
               if (var3 == 616293686) {
                  throw new IllegalStateException();
               }

               label216:
               for(int var22 = 0; var22 < dq.ar.length; ++var22) {
                  if (var3 == 616293686) {
                     throw new IllegalStateException();
                  }

                  for(int var25 = 0; var25 < fe.av.length; ++var25) {
                     if (var3 == 616293686) {
                        throw new IllegalStateException();
                     }

                     File var27 = new File(fe.av[var25] + dq.ar[var22] + File.separatorChar + var0 + File.separatorChar);
                     if (var27.exists()) {
                        if (var3 == 616293686) {
                           throw new IllegalStateException();
                        }

                        File var31 = new File(var27, "test.dat");

                        boolean var32;
                        try {
                           RandomAccessFile var13 = new RandomAccessFile(var31, "rw");
                           int var14 = var13.read();
                           var13.seek(0L);
                           var13.write(var14);
                           var13.seek(0L);
                           var13.close();
                           var31.delete();
                           var32 = true;
                        } catch (Exception var17) {
                           var32 = false;
                        }

                        if (var32) {
                           if (var3 == 616293686) {
                              throw new IllegalStateException();
                           }

                           var5 = var27.toString();
                           var7 = true;
                           break label216;
                        }
                     }
                  }
               }
            }
         }

         if (var5 == null) {
            if (var3 == 616293686) {
               throw new IllegalStateException();
            }

            var5 = hd.az + File.separatorChar + "jagexcache" + var4 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
            var7 = true;
         }

         File var23;
         if (var6 != null) {
            if (var3 == 616293686) {
               throw new IllegalStateException();
            }

            var23 = new File(var6);
            var24 = new File(var5);

            try {
               File[] var28 = var23.listFiles();
               File[] var34 = var28;

               for(var12 = 0; var12 < var34.length; ++var12) {
                  if (var3 == 616293686) {
                     throw new IllegalStateException();
                  }

                  File var33 = var34[var12];
                  File var36 = new File(var24, var33.getName());
                  boolean var15 = var33.renameTo(var36);
                  if (!var15) {
                     if (var3 == 616293686) {
                        throw new IllegalStateException();
                     }

                     throw new IOException();
                  }
               }
            } catch (Exception var19) {
               var19.printStackTrace();
            }

            var7 = true;
         }

         if (var7) {
            var23 = new File(var5);
            var9 = null;

            try {
               sy var30 = new sy(gc.ac, "rw", 10000L);
               sg var35 = new sg(500);
               var35.bu(3, (byte)36);
               byte var10001;
               if (null != var9) {
                  if (var3 == 616293686) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var35.bu(var10001, (byte)72);
               var35.ci(var23.getPath(), (byte)-81);
               if (var9 != null) {
                  var35.ci(var9.getPath(), (byte)-71);
               }

               var30.an(var35.al, 0, -1633313603 * var35.at, 185047612);
               var30.aw((byte)-62);
            } catch (IOException var16) {
               var16.printStackTrace();
            }
         }

         return new File(var5);
      } catch (RuntimeException var21) {
         throw db.an(var21, "fj.af(" + ')');
      }
   }
}
