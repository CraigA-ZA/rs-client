import accessors.RSSoundCache;

public class ba implements RSSoundCache {
   nm an;
   rc aw;
   static final int ay = 10;
   rc ac;
   static final String bp = "oldschool";
   nm af;
   static final int ai = 11;

   br aq(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & 844224237 | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4 ^ 4294967296L;
      br var7 = (br)this.ac.af(var5);
      if (null != var7) {
         return var7;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         ce var8 = (ce)this.aw.af(var5);
         if (null == var8) {
            var8 = ce.at(this.an, var1, var2);
            if (var8 == null) {
               return null;
            }

            this.aw.an(var8, var5);
         }

         var7 = var8.aa(var3);
         if (var7 == null) {
            return null;
         } else {
            var8.ga();
            this.ac.an(var7, var5);
            return var7;
         }
      }
   }

   br af(int var1, int var2, int[] var3, int var4) {
      try {
         int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
         var5 |= var1 << 16;
         long var6 = (long)var5;
         br var8 = (br)this.ac.af(var6);
         if (var8 != null) {
            if (var4 >= -849125057) {
               throw new IllegalStateException();
            } else {
               return var8;
            }
         } else {
            if (null != var3) {
               if (var4 >= -849125057) {
                  throw new IllegalStateException();
               }

               if (var3[0] <= 0) {
                  return null;
               }
            }

            bs var9 = bs.af(this.af, var1, var2);
            if (var9 == null) {
               if (var4 >= -849125057) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var8 = var9.an();
               this.ac.an(var8, var6);
               if (var3 != null) {
                  if (var4 >= -849125057) {
                     throw new IllegalStateException();
                  }

                  var3[0] -= var8.an.length;
               }

               return var8;
            }
         }
      } catch (RuntimeException var10) {
         throw db.an(var10, "ba.af(" + ')');
      }
   }

   br an(int var1, int var2, int[] var3, byte var4) {
      try {
         int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
         var5 |= var1 << 16;
         long var6 = (long)var5 ^ 4294967296L;
         br var8 = (br)this.ac.af(var6);
         if (null != var8) {
            if (var4 <= -1) {
               throw new IllegalStateException();
            } else {
               return var8;
            }
         } else if (var3 != null && var3[0] <= 0) {
            return null;
         } else {
            ce var9 = (ce)this.aw.af(var6);
            if (null == var9) {
               if (var4 <= -1) {
                  throw new IllegalStateException();
               }

               var9 = ce.at(this.an, var1, var2);
               if (var9 == null) {
                  if (var4 <= -1) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               this.aw.an(var9, var6);
            }

            var8 = var9.aa(var3);
            if (var8 == null) {
               if (var4 <= -1) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var9.ga();
               this.ac.an(var8, var6);
               return var8;
            }
         }
      } catch (RuntimeException var10) {
         throw db.an(var10, "ba.an(" + ')');
      }
   }

   public br aw(int var1, int[] var2, int var3) {
      try {
         if (this.af.cm(-324919451) == 1) {
            if (var3 >= 1686349829) {
               throw new IllegalStateException();
            } else {
               return this.af(0, var1, var2, -1986343683);
            }
         } else if (this.af.cq(var1, (byte)105) == 1) {
            if (var3 >= 1686349829) {
               throw new IllegalStateException();
            } else {
               return this.af(var1, 0, var2, -1115909998);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "ba.aw(" + ')');
      }
   }

   public br ac(int var1, int[] var2, int var3) {
      try {
         if (this.an.cm(-596791499) == 1) {
            if (var3 == -1450505922) {
               throw new IllegalStateException();
            } else {
               return this.an(0, var1, var2, (byte)7);
            }
         } else if (this.an.cq(var1, (byte)80) == 1) {
            return this.an(var1, 0, var2, (byte)66);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "ba.ac(" + ')');
      }
   }

   br au(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4;
      br var7 = (br)this.ac.af(var5);
      if (var7 != null) {
         return var7;
      } else if (null != var3 && var3[0] <= 0) {
         return null;
      } else {
         bs var8 = bs.af(this.af, var1, var2);
         if (var8 == null) {
            return null;
         } else {
            var7 = var8.an();
            this.ac.an(var7, var5);
            if (var3 != null) {
               var3[0] -= var7.an.length;
            }

            return var7;
         }
      }
   }

   public ba(nm var1, nm var2) {
      try {
         super();
         this.aw = new rc(256);
         this.ac = new rc(256);
         this.af = var1;
         this.an = var2;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ba.<init>(" + ')');
      }
   }

   public br ay(int var1, int[] var2) {
      if (this.an.cm(-1607444587) == 1) {
         return this.an(0, var1, var2, (byte)84);
      } else if (this.an.cq(var1, (byte)73) == 1) {
         return this.an(var1, 0, var2, (byte)18);
      } else {
         throw new RuntimeException();
      }
   }

   public br al(int var1, int[] var2) {
      if (this.af.cm(541504899) == 1) {
         return this.af(0, var1, var2, -1967741989);
      } else if (this.af.cq(var1, (byte)6) == 1) {
         return this.af(var1, 0, var2, -1848935474);
      } else {
         throw new RuntimeException();
      }
   }

   public br at(int var1, int[] var2) {
      if (this.af.cm(690565819) == 1) {
         return this.af(0, var1, var2, -1615279816);
      } else if (this.af.cq(var1, (byte)17) == 1) {
         return this.af(var1, 0, var2, -1561993471);
      } else {
         throw new RuntimeException();
      }
   }

   br ab(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4 ^ 4294967296L;
      br var7 = (br)this.ac.af(var5);
      if (null != var7) {
         return var7;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         ce var8 = (ce)this.aw.af(var5);
         if (null == var8) {
            var8 = ce.at(this.an, var1, var2);
            if (var8 == null) {
               return null;
            }

            this.aw.an(var8, var5);
         }

         var7 = var8.aa(var3);
         if (var7 == null) {
            return null;
         } else {
            var8.ga();
            this.ac.an(var7, var5);
            return var7;
         }
      }
   }

   public br aa(int var1, int[] var2) {
      if (this.af.cm(107866659) == 1) {
         return this.af(0, var1, var2, -1425077996);
      } else if (this.af.cq(var1, (byte)50) == 1) {
         return this.af(var1, 0, var2, -1308302013);
      } else {
         throw new RuntimeException();
      }
   }
}
