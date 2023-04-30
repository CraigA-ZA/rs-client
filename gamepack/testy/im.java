import accessors.RSTextureProvider;

public class im implements jq, RSTextureProvider {
   nm aq;
   ih[] af;
   double au;
   int ac;
   nh an;
   int ab;
   int aw;

   public boolean am(int var1) {
      return 64 == this.ab * -1569371429;
   }

   public int af(int var1) {
      try {
         if (0 == this.af.length) {
            return 100;
         } else {
            int var2 = 0;
            int var3 = 0;
            ih[] var4 = this.af;

            for(int var5 = 0; var5 < var4.length; ++var5) {
               if (var1 != 1658187175) {
                  throw new IllegalStateException();
               }

               ih var6 = var4[var5];
               if (null != var6) {
                  if (var1 != 1658187175) {
                     throw new IllegalStateException();
                  }

                  if (null != var6.aq) {
                     var2 += var6.aq.length;
                     int[] var7 = var6.aq;

                     for(int var8 = 0; var8 < var7.length; ++var8) {
                        if (var1 != 1658187175) {
                           throw new IllegalStateException();
                        }

                        int var9 = var7[var8];
                        if (this.aq.ci(var9, 953853219)) {
                           if (var1 != 1658187175) {
                              throw new IllegalStateException();
                           }

                           ++var3;
                        }
                     }
                  }
               }
            }

            if (0 == var2) {
               if (var1 != 1658187175) {
                  throw new IllegalStateException();
               } else {
                  return 0;
               }
            } else {
               return 100 * var3 / var2;
            }
         }
      } catch (RuntimeException var10) {
         throw db.an(var10, "im.af(" + ')');
      }
   }

   public boolean ar(int var1) {
      return 64 == this.ab * -1798234843;
   }

   public int[] aw(int var1, int var2) {
      try {
         ih var3 = this.af[var1];
         if (var3 != null) {
            if (var3.ax != null) {
               this.an.aw(var3);
               var3.ai = true;
               return var3.ax;
            }

            boolean var4 = var3.af(this.au, -1962784445 * this.ab, this.aq);
            if (var4) {
               if (var2 <= -1833096007) {
                  throw new IllegalStateException();
               }

               if (0 == this.ac * -1759525447) {
                  if (var2 <= -1833096007) {
                     throw new IllegalStateException();
                  }

                  ih var5 = (ih)this.an.ab();
                  var5.an();
               } else {
                  this.ac -= -1869565815;
               }

               this.an.aw(var3);
               var3.ai = true;
               return var3.ax;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw db.an(var6, "im.aw(" + ')');
      }
   }

   public int ac(int var1, int var2) {
      try {
         if (null != this.af[var1]) {
            if (var2 <= -1934843273) {
               throw new IllegalStateException();
            } else {
               return this.af[var1].au;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "im.ac(" + ')');
      }
   }

   public void an(double var1) {
      try {
         this.au = var1;
         this.aq(551874647);
      } catch (RuntimeException var3) {
         throw db.an(var3, "im.an(" + ')');
      }
   }

   public boolean au(int var1, byte var2) {
      try {
         return this.af[var1].ab;
      } catch (RuntimeException var3) {
         throw db.an(var3, "im.au(" + ')');
      }
   }

   public boolean ab(int var1, int var2) {
      try {
         boolean var10000;
         if (64 == this.ab * -1962784445) {
            if (var2 != -407888071) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw db.an(var3, "im.ab(" + ')');
      }
   }

   public void al(int var1, int var2) {
      try {
         for(int var3 = 0; var3 < this.af.length; ++var3) {
            if (var2 >= 384764811) {
               throw new IllegalStateException();
            }

            ih var4 = this.af[var3];
            if (var4 != null) {
               if (var2 >= 384764811) {
                  throw new IllegalStateException();
               }

               if (0 != var4.ay) {
                  if (var2 >= 384764811) {
                     return;
                  }

                  if (var4.ai) {
                     if (var2 >= 384764811) {
                        return;
                     }

                     var4.aw(var1);
                     var4.ai = false;
                  }
               }
            }
         }

      } catch (RuntimeException var5) {
         throw db.an(var5, "im.al(" + ')');
      }
   }

   public int at() {
      if (0 == this.af.length) {
         return 100;
      } else {
         int var1 = 0;
         int var2 = 0;
         ih[] var3 = this.af;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            ih var5 = var3[var4];
            if (null != var5 && null != var5.aq) {
               var1 += var5.aq.length;
               int[] var6 = var5.aq;

               for(int var7 = 0; var7 < var6.length; ++var7) {
                  int var8 = var6[var7];
                  if (this.aq.ci(var8, 953853219)) {
                     ++var2;
                  }
               }
            }
         }

         if (0 == var1) {
            return 0;
         } else {
            return 100 * var2 / var1;
         }
      }
   }

   public void aa(double var1) {
      this.au = var1;
      this.aq(-718121098);
   }

   public int[] ay(int var1) {
      ih var2 = this.af[var1];
      if (var2 != null) {
         if (var2.ax != null) {
            this.an.aw(var2);
            var2.ai = true;
            return var2.ax;
         }

         boolean var3 = var2.af(this.au, -1962784445 * this.ab, this.aq);
         if (var3) {
            if (0 == this.ac * -1759525447) {
               ih var4 = (ih)this.an.ab();
               var4.an();
            } else {
               this.ac -= -1869565815;
            }

            this.an.aw(var2);
            var2.ai = true;
            return var2.ax;
         }
      }

      return null;
   }

   public int ao(int var1) {
      return null != this.af[var1] ? this.af[var1].au : 0;
   }

   public int ax(int var1) {
      return null != this.af[var1] ? this.af[var1].au : 0;
   }

   public int ai(int var1) {
      return null != this.af[var1] ? this.af[var1].au : 0;
   }

   public boolean ag(int var1) {
      return this.af[var1].ab;
   }

   public boolean ah(int var1) {
      return this.af[var1].ab;
   }

   public void ad(int var1) {
      for(int var2 = 0; var2 < this.af.length; ++var2) {
         ih var3 = this.af[var2];
         if (var3 != null && 0 != var3.ay && var3.ai) {
            var3.aw(var1);
            var3.ai = false;
         }
      }

   }

   public im(nm var1, nm var2, int var3, double var4, int var6) {
      try {
         super();
         this.an = new nh();
         this.ac = 0;
         this.au = 1.0;
         this.ab = 910538112;
         this.aq = var2;
         this.aw = -909227037 * var3;
         this.ac = -668183133 * this.aw;
         this.au = var4;
         this.ab = 1080855403 * var6;
         int[] var7 = var1.ck(0, 296342556);
         if (var7 != null) {
            int var8 = var7.length;
            this.af = new ih[var1.cq(0, (byte)53)];

            for(int var9 = 0; var9 < var8; ++var9) {
               sg var10 = new sg(var1.bh(0, var7[var9], (byte)-49));
               this.af[var7[var9]] = new ih(var10);
            }
         } else {
            this.af = new ih[0];
         }

      } catch (RuntimeException var11) {
         throw db.an(var11, "im.<init>(" + ')');
      }
   }

   public boolean av(int var1) {
      return this.af[var1].ab;
   }

   public void as() {
      for(int var1 = 0; var1 < this.af.length; ++var1) {
         if (this.af[var1] != null) {
            this.af[var1].an();
         }
      }

      this.an = new nh();
      this.ac = this.aw * -668183133;
   }

   public void aj() {
      for(int var1 = 0; var1 < this.af.length; ++var1) {
         if (this.af[var1] != null) {
            this.af[var1].an();
         }
      }

      this.an = new nh();
      this.ac = this.aw * -668183133;
   }

   public void ak(int var1) {
      for(int var2 = 0; var2 < this.af.length; ++var2) {
         ih var3 = this.af[var2];
         if (var3 != null && 0 != var3.ay && var3.ai) {
            var3.aw(var1);
            var3.ai = false;
         }
      }

   }

   public void az(int var1) {
      for(int var2 = 0; var2 < this.af.length; ++var2) {
         ih var3 = this.af[var2];
         if (var3 != null && 0 != var3.ay && var3.ai) {
            var3.aw(var1);
            var3.ai = false;
         }
      }

   }

   public void aq(int var1) {
      try {
         for(int var2 = 0; var2 < this.af.length; ++var2) {
            if (var1 <= -1476440325) {
               throw new IllegalStateException();
            }

            if (this.af[var2] != null) {
               if (var1 <= -1476440325) {
                  throw new IllegalStateException();
               }

               this.af[var2].an();
            }
         }

         this.an = new nh();
         this.ac = this.aw * -668183133;
      } catch (RuntimeException var3) {
         throw db.an(var3, "im.aq(" + ')');
      }
   }

   public static int al(long var0) {
      try {
         return (int)(var0 >>> 14 & 3L);
      } catch (RuntimeException var2) {
         throw db.an(var2, "im.al(" + ')');
      }
   }

   static final void ab(int var0, int var1, int var2, int var3) {
      try {
         int var4;
         for(var4 = 0; var4 < 8; ++var4) {
            for(int var5 = 0; var5 < 8; ++var5) {
               if (var3 <= 969723822) {
                  throw new IllegalStateException();
               }

               cd.af[var0][var1 + var4][var2 + var5] = 0;
            }
         }

         if (var1 > 0) {
            for(var4 = 1; var4 < 8; ++var4) {
               if (var3 <= 969723822) {
                  throw new IllegalStateException();
               }

               cd.af[var0][var1][var2 + var4] = cd.af[var0][var1 - 1][var2 + var4];
            }
         }

         if (var2 > 0) {
            for(var4 = 1; var4 < 8; ++var4) {
               if (var3 <= 969723822) {
                  return;
               }

               cd.af[var0][var1 + var4][var2] = cd.af[var0][var1 + var4][var2 - 1];
            }
         }

         if (var1 > 0) {
            if (var3 <= 969723822) {
               return;
            }

            if (cd.af[var0][var1 - 1][var2] != 0) {
               if (var3 <= 969723822) {
                  throw new IllegalStateException();
               }

               cd.af[var0][var1][var2] = cd.af[var0][var1 - 1][var2];
               return;
            }
         }

         if (var2 > 0) {
            if (var3 <= 969723822) {
               throw new IllegalStateException();
            }

            if (cd.af[var0][var1][var2 - 1] != 0) {
               cd.af[var0][var1][var2] = cd.af[var0][var1][var2 - 1];
               return;
            }
         }

         if (var1 > 0) {
            if (var3 <= 969723822) {
               throw new IllegalStateException();
            }

            if (var2 > 0) {
               if (var3 <= 969723822) {
                  throw new IllegalStateException();
               }

               if (cd.af[var0][var1 - 1][var2 - 1] != 0) {
                  if (var3 <= 969723822) {
                     return;
                  }

                  cd.af[var0][var1][var2] = cd.af[var0][var1 - 1][var2 - 1];
               }
            }
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "im.ab(" + ')');
      }
   }
}
