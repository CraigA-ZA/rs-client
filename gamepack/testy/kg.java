import accessors.RSAbstractWorldMapIcon;

public abstract class kg implements RSAbstractWorldMapIcon {
   static final int ai = 8192;
   public final lb aq;
   int at;
   int aa;
   public final lb al;

   abstract ku ax();

   boolean ak(int var1, int var2, int var3) {
      try {
         ku var4 = this.aw(-2043987595);
         if (null == var4) {
            if (var3 >= -654384548) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            if (var1 >= this.at * -216598991 - var4.an * -31821843 / 2) {
               if (var3 >= -654384548) {
                  throw new IllegalStateException();
               }

               if (var1 <= var4.an * -31821843 / 2 + this.at * -216598991) {
                  if (var2 >= this.aa * -1288412757) {
                     if (var2 <= this.aa * -1288412757 + var4.aw * -1401615011) {
                        return true;
                     }

                     if (var3 >= -654384548) {
                        throw new IllegalStateException();
                     }
                  }

                  return false;
               }
            }

            return false;
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "kg.ak(" + ')');
      }
   }

   boolean am(int var1, int var2, byte var3) {
      try {
         if (this.aj(var1, var2, 2000208750)) {
            return true;
         } else if (this.ak(var1, var2, -1064122109)) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "kg.am(" + ')');
      }
   }

   abstract ku aw(int var1);

   abstract int ac(int var1);

   abstract ku ai();

   boolean as(int var1) {
      try {
         boolean var10000;
         if (this.an(-1720644500) >= 0) {
            if (var1 <= -1432389183) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw db.an(var2, "kg.as(" + ')');
      }
   }

   boolean aj(int var1, int var2, int var3) {
      try {
         if (!this.as(520990460)) {
            if (var3 <= 1842024947) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            hw var4 = nf.an(this.an(-1290563791), 2053819311);
            int var5 = this.ac(-1623088499);
            int var6 = this.au(435365367);
            switch (var4.aj.ac * 1932346871) {
               case 0:
                  if (var1 > -216598991 * this.at - var5) {
                     if (var3 <= 1842024947) {
                        throw new IllegalStateException();
                     }

                     if (var1 <= -216598991 * this.at) {
                        break;
                     }
                  }

                  return false;
               case 1:
                  if (var1 < this.at * -216598991) {
                     return false;
                  }

                  if (var3 <= 1842024947) {
                     throw new IllegalStateException();
                  }

                  if (var1 >= -216598991 * this.at + var5) {
                     if (var3 <= 1842024947) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
                  break;
               case 2:
                  label99: {
                     if (var1 >= -216598991 * this.at - var5 / 2) {
                        if (var3 <= 1842024947) {
                           throw new IllegalStateException();
                        }

                        if (var1 <= -216598991 * this.at + var5 / 2) {
                           break label99;
                        }

                        if (var3 <= 1842024947) {
                           throw new IllegalStateException();
                        }
                     }

                     return false;
                  }
            }

            switch (var4.ak.ac * 578864459) {
               case 0:
                  if (var2 >= -1288412757 * this.aa) {
                     if (var3 <= 1842024947) {
                        throw new IllegalStateException();
                     }

                     if (var2 < var6 + this.aa * -1288412757) {
                        break;
                     }
                  }

                  return false;
               case 1:
                  if (var2 >= -1288412757 * this.aa - var6 / 2) {
                     if (var3 <= 1842024947) {
                        throw new IllegalStateException();
                     }

                     if (var2 <= -1288412757 * this.aa + var6 / 2) {
                        break;
                     }

                     if (var3 <= 1842024947) {
                        throw new IllegalStateException();
                     }
                  }

                  return false;
               case 2:
                  if (var2 > this.aa * -1288412757 - var6) {
                     if (var3 <= 1842024947) {
                        throw new IllegalStateException();
                     }

                     if (var2 <= this.aa * -1288412757) {
                        return true;
                     }

                     if (var3 <= 1842024947) {
                        throw new IllegalStateException();
                     }
                  }

                  return false;
            }

            return true;
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "kg.aj(" + ')');
      }
   }

   public abstract int an(int var1);

   public abstract int aa();

   public abstract int ay();

   abstract ku ao();

   kg(lb var1, lb var2) {
      try {
         super();
         this.al = var1;
         this.aq = var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "kg.<init>(" + ')');
      }
   }

   abstract int ag();

   abstract int ah();

   abstract int au(int var1);

   abstract int av();

   abstract int ar();

   boolean az() {
      return this.an(-950579903) >= 0;
   }

   boolean ad() {
      return this.an(-712972609) >= 0;
   }

   boolean ae() {
      return this.an(-1821875386) >= 0;
   }

   boolean ap() {
      return this.an(-1449127644) >= 0;
   }

   boolean by(int var1, int var2) {
      if (!this.as(-87175129)) {
         return false;
      } else {
         hw var3 = nf.an(this.an(-1992726861), 1841655217);
         int var4 = this.ac(-1662143066);
         int var5 = this.au(-664449689);
         switch (var3.aj.ac * 1932346871) {
            case 0:
               if (var1 > -216598991 * this.at - var4 && var1 <= -216598991 * this.at) {
                  break;
               }

               return false;
            case 1:
               if (var1 >= this.at * -216598991 && var1 < -216598991 * this.at + var4) {
                  break;
               }

               return false;
            case 2:
               if (var1 < -216598991 * this.at - var4 / 2 || var1 > -216598991 * this.at + var4 / 2) {
                  return false;
               }
         }

         switch (var3.ak.ac * 578864459) {
            case 0:
               if (var2 >= -1288412757 * this.aa && var2 < var5 + this.aa * -1288412757) {
                  break;
               }

               return false;
            case 1:
               if (var2 >= -1288412757 * this.aa - var5 / 2 && var2 <= -1288412757 * this.aa + var5 / 2) {
                  break;
               }

               return false;
            case 2:
               if (var2 <= this.aa * -1288412757 - var5 || var2 > this.aa * -1288412757) {
                  return false;
               }
         }

         return true;
      }
   }

   boolean bb(int var1, int var2) {
      if (!this.as(1162173131)) {
         return false;
      } else {
         hw var3 = nf.an(this.an(-836587891), 1995243205);
         int var4 = this.ac(-826092286);
         int var5 = this.au(-1370069111);
         switch (var3.aj.ac * 1367944941) {
            case 0:
               if (var1 <= -216598991 * this.at - var4 || var1 > -216598991 * this.at) {
                  return false;
               }
               break;
            case 1:
               if (var1 < this.at * -216598991 || var1 >= -175265635 * this.at + var4) {
                  return false;
               }
               break;
            case 2:
               if (var1 < -216598991 * this.at - var4 / 2 || var1 > -216598991 * this.at + var4 / 2) {
                  return false;
               }
         }

         switch (var3.ak.ac * -632355155) {
            case 0:
               if (var2 >= 13768858 * this.aa && var2 < var5 + this.aa * -841012375) {
                  break;
               }

               return false;
            case 1:
               if (var2 >= 1027074634 * this.aa - var5 / 2 && var2 <= -2086067661 * this.aa + var5 / 2) {
                  break;
               }

               return false;
            case 2:
               if (var2 <= this.aa * -1288412757 - var5 || var2 > this.aa * -1288412757) {
                  return false;
               }
         }

         return true;
      }
   }

   boolean bi(int var1, int var2) {
      ku var3 = this.aw(-1997598119);
      if (null == var3) {
         return false;
      } else if (var1 >= this.at * -216598991 - var3.an * -31821843 / 2 && var1 <= var3.an * -31821843 / 2 + this.at * -216598991) {
         return var2 >= this.aa * -1288412757 && var2 <= this.aa * -1288412757 + var3.aw * -1401615011;
      } else {
         return false;
      }
   }

   boolean be(int var1, int var2) {
      ku var3 = this.aw(-2030782152);
      if (null == var3) {
         return false;
      } else if (var1 >= this.at * -216598991 - var3.an * 1254199022 / 2 && var1 <= var3.an * -1828703238 / 2 + this.at * -216598991) {
         return var2 >= this.aa * -1288412757 && var2 <= this.aa * -1288412757 + var3.aw * -1401615011;
      } else {
         return false;
      }
   }

   boolean bk(int var1, int var2) {
      ku var3 = this.aw(-1773099395);
      if (null == var3) {
         return false;
      } else if (var1 >= this.at * -216598991 - var3.an * -31821843 / 2 && var1 <= var3.an * -31821843 / 2 + this.at * -216598991) {
         return var2 >= this.aa * -1288412757 && var2 <= this.aa * -1288412757 + var3.aw * -1401615011;
      } else {
         return false;
      }
   }
}
