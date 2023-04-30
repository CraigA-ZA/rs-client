import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class gj extends rp {
   static final float ao = 75.56675F;
   public byte aq;
   public List aw;
   int[] ac;
   long au;
   public String ab;
   static final int do = 8;
   public byte al;
   boolean af;
   static int[] av;
   boolean an;

   void ad(sg var1) {
      int var2 = var1.cm((byte)7);
      if (0 != (var2 & 1)) {
         this.af = true;
      }

      if ((var2 & 2) != 0) {
         this.an = true;
      }

      int var3 = 2;
      if (0 != (var2 & 4)) {
         var3 = var1.cm((byte)7);
      }

      this.hr = var1.cv((byte)1);
      this.au = var1.cv((byte)1) * -5510785032985703105L;
      this.ab = var1.cw((byte)0);
      var1.co(1404535452);
      this.al = var1.cf(435772489);
      this.aq = var1.cf(435772489);
      int var4 = var1.cl(823011272);
      if (var4 > 0) {
         this.aw = new ArrayList(var4);

         for(int var5 = 0; var5 < var4; ++var5) {
            fz var6 = new fz();
            if (this.af) {
               var1.cv((byte)1);
            }

            if (this.an) {
               var6.aw = new tm(var1.cw((byte)0));
            }

            var6.af = var1.cf(435772489);
            var6.an = var1.cl(-932343472) * 1064950933;
            if (var3 >= 3) {
               var1.co(1404535452);
            }

            this.aw.add(var5, var6);
         }
      }

   }

   public int au(String var1, int var2) {
      try {
         if (!this.an) {
            if (var2 == -1018251304) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("Displaynames not available");
            }
         } else {
            for(int var3 = 0; var3 < this.aw.size(); ++var3) {
               if (var2 == -1018251304) {
                  throw new IllegalStateException();
               }

               if (((fz)this.aw.get(var3)).aw.af(-710264960).equalsIgnoreCase(var1)) {
                  if (var2 == -1018251304) {
                     throw new IllegalStateException();
                  }

                  return var3;
               }
            }

            return -1;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "gj.au(" + ')');
      }
   }

   public int ac(int var1) {
      try {
         return this.aw.size();
      } catch (RuntimeException var2) {
         throw db.an(var2, "gj.ac(" + ')');
      }
   }

   void aw(int var1, byte var2) {
      try {
         this.aw.remove(var1);
         this.ac = null;
      } catch (RuntimeException var3) {
         throw db.an(var3, "gj.aw(" + ')');
      }
   }

   static {
      new BitSet(65536);
   }

   void ay(fz var1) {
      this.aw.add(var1);
      this.ac = null;
   }

   void ab(sg var1, int var2) {
      try {
         int var3 = var1.cm((byte)7);
         if (0 != (var3 & 1)) {
            if (var2 != -1838416622) {
               throw new IllegalStateException();
            }

            this.af = true;
         }

         if ((var3 & 2) != 0) {
            if (var2 != -1838416622) {
               throw new IllegalStateException();
            }

            this.an = true;
         }

         int var4 = 2;
         if (0 != (var3 & 4)) {
            if (var2 != -1838416622) {
               return;
            }

            var4 = var1.cm((byte)7);
         }

         this.hr = var1.cv((byte)1);
         this.au = var1.cv((byte)1) * -5510785032985703105L;
         this.ab = var1.cw((byte)0);
         var1.co(1404535452);
         this.al = var1.cf(435772489);
         this.aq = var1.cf(435772489);
         int var5 = var1.cl(-1652527705);
         if (var5 > 0) {
            if (var2 != -1838416622) {
               throw new IllegalStateException();
            }

            this.aw = new ArrayList(var5);

            for(int var6 = 0; var6 < var5; ++var6) {
               if (var2 != -1838416622) {
                  return;
               }

               fz var7 = new fz();
               if (this.af) {
                  if (var2 != -1838416622) {
                     throw new IllegalStateException();
                  }

                  var1.cv((byte)1);
               }

               if (this.an) {
                  if (var2 != -1838416622) {
                     throw new IllegalStateException();
                  }

                  var7.aw = new tm(var1.cw((byte)0));
               }

               var7.af = var1.cf(435772489);
               var7.an = var1.cl(50854233) * 820606875;
               if (var4 >= 3) {
                  var1.co(1404535452);
               }

               this.aw.add(var6, var7);
            }
         }

      } catch (RuntimeException var8) {
         throw db.an(var8, "gj.ab(" + ')');
      }
   }

   void aa(fz var1) {
      this.aw.add(var1);
      this.ac = null;
   }

   public int ar(String var1) {
      if (!this.an) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var2 = 0; var2 < this.aw.size(); ++var2) {
            if (((fz)this.aw.get(var2)).aw.af(-710264960).equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   public int[] al() {
      if (this.ac == null) {
         String[] var1 = new String[this.aw.size()];
         this.ac = new int[this.aw.size()];

         for(int var2 = 0; var2 < this.aw.size(); this.ac[var2] = var2++) {
            var1[var2] = ((fz)this.aw.get(var2)).aw.an(-1927218707);
         }

         int[] var3 = this.ac;
         fd.aw(var1, var3, 0, var1.length - 1, (byte)1);
      }

      return this.ac;
   }

   public int[] at() {
      if (this.ac == null) {
         String[] var1 = new String[this.aw.size()];
         this.ac = new int[this.aw.size()];

         for(int var2 = 0; var2 < this.aw.size(); this.ac[var2] = var2++) {
            var1[var2] = ((fz)this.aw.get(var2)).aw.an(-1374926913);
         }

         int[] var3 = this.ac;
         fd.aw(var1, var3, 0, var1.length - 1, (byte)1);
      }

      return this.ac;
   }

   public int[] af(int var1) {
      try {
         if (this.ac == null) {
            String[] var2 = new String[this.aw.size()];
            this.ac = new int[this.aw.size()];

            for(int var3 = 0; var3 < this.aw.size(); this.ac[var3] = var3++) {
               var2[var3] = ((fz)this.aw.get(var3)).aw.an(-1558017121);
            }

            int[] var5 = this.ac;
            fd.aw(var2, var5, 0, var2.length - 1, (byte)1);
         }

         return this.ac;
      } catch (RuntimeException var4) {
         throw db.an(var4, "gj.af(" + ')');
      }
   }

   public gj(sg var1) {
      try {
         super();
         this.an = true;
         this.ab = null;
         this.ab(var1, -1838416622);
      } catch (RuntimeException var2) {
         throw db.an(var2, "gj.<init>(" + ')');
      }
   }

   void ao(int var1) {
      this.aw.remove(var1);
      this.ac = null;
   }

   void ax(int var1) {
      this.aw.remove(var1);
      this.ac = null;
   }

   void ai(int var1) {
      this.aw.remove(var1);
      this.ac = null;
   }

   public int ag() {
      return this.aw.size();
   }

   public int ah() {
      return this.aw.size();
   }

   public int av() {
      return this.aw.size();
   }

   void an(fz var1, int var2) {
      try {
         this.aw.add(var1);
         this.ac = null;
      } catch (RuntimeException var3) {
         throw db.an(var3, "gj.an(" + ')');
      }
   }

   public int am(String var1) {
      if (!this.an) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var2 = 0; var2 < this.aw.size(); ++var2) {
            if (((fz)this.aw.get(var2)).aw.af(-710264960).equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   public int as(String var1) {
      if (!this.an) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var2 = 0; var2 < this.aw.size(); ++var2) {
            if (((fz)this.aw.get(var2)).aw.af(-710264960).equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   public int aj(String var1) {
      if (!this.an) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var2 = 0; var2 < this.aw.size(); ++var2) {
            if (((fz)this.aw.get(var2)).aw.af(-710264960).equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   void ak(sg var1) {
      int var2 = var1.cm((byte)7);
      if (0 != (var2 & 1)) {
         this.af = true;
      }

      if ((var2 & 2) != 0) {
         this.an = true;
      }

      int var3 = 2;
      if (0 != (var2 & 4)) {
         var3 = var1.cm((byte)7);
      }

      this.hr = var1.cv((byte)1);
      this.au = var1.cv((byte)1) * -5510785032985703105L;
      this.ab = var1.cw((byte)0);
      var1.co(1404535452);
      this.al = var1.cf(435772489);
      this.aq = var1.cf(435772489);
      int var4 = var1.cl(811224520);
      if (var4 > 0) {
         this.aw = new ArrayList(var4);

         for(int var5 = 0; var5 < var4; ++var5) {
            fz var6 = new fz();
            if (this.af) {
               var1.cv((byte)1);
            }

            if (this.an) {
               var6.aw = new tm(var1.cw((byte)0));
            }

            var6.af = var1.cf(435772489);
            var6.an = var1.cl(-611861481) * 820606875;
            if (var3 >= 3) {
               var1.co(1404535452);
            }

            this.aw.add(var5, var6);
         }
      }

   }

   void az(sg var1) {
      int var2 = var1.cm((byte)7);
      if (0 != (var2 & 1)) {
         this.af = true;
      }

      if ((var2 & 2) != 0) {
         this.an = true;
      }

      int var3 = 2;
      if (0 != (var2 & 4)) {
         var3 = var1.cm((byte)7);
      }

      this.hr = var1.cv((byte)1);
      this.au = var1.cv((byte)1) * -5510785032985703105L;
      this.ab = var1.cw((byte)0);
      var1.co(1404535452);
      this.al = var1.cf(435772489);
      this.aq = var1.cf(435772489);
      int var4 = var1.cl(-961907598);
      if (var4 > 0) {
         this.aw = new ArrayList(var4);

         for(int var5 = 0; var5 < var4; ++var5) {
            fz var6 = new fz();
            if (this.af) {
               var1.cv((byte)1);
            }

            if (this.an) {
               var6.aw = new tm(var1.cw((byte)0));
            }

            var6.af = var1.cf(435772489);
            var6.an = var1.cl(-391320621) * 820606875;
            if (var3 >= 3) {
               var1.co(1404535452);
            }

            this.aw.add(var5, var6);
         }
      }

   }

   public int[] aq() {
      if (this.ac == null) {
         String[] var1 = new String[this.aw.size()];
         this.ac = new int[this.aw.size()];

         for(int var2 = 0; var2 < this.aw.size(); this.ac[var2] = var2++) {
            var1[var2] = ((fz)this.aw.get(var2)).aw.an(-1569964208);
         }

         int[] var3 = this.ac;
         fd.aw(var1, var3, 0, var1.length - 1, (byte)1);
      }

      return this.ac;
   }

   void ae(sg var1) {
      int var2 = var1.cm((byte)7);
      if (0 != (var2 & 1)) {
         this.af = true;
      }

      if ((var2 & 2) != 0) {
         this.an = true;
      }

      int var3 = 2;
      if (0 != (var2 & 4)) {
         var3 = var1.cm((byte)7);
      }

      this.hr = var1.cv((byte)1);
      this.au = var1.cv((byte)1) * -5510785032985703105L;
      this.ab = var1.cw((byte)0);
      var1.co(1404535452);
      this.al = var1.cf(435772489);
      this.aq = var1.cf(435772489);
      int var4 = var1.cl(579166915);
      if (var4 > 0) {
         this.aw = new ArrayList(var4);

         for(int var5 = 0; var5 < var4; ++var5) {
            fz var6 = new fz();
            if (this.af) {
               var1.cv((byte)1);
            }

            if (this.an) {
               var6.aw = new tm(var1.cw((byte)0));
            }

            var6.af = var1.cf(435772489);
            var6.an = var1.cl(-1547249498) * 820606875;
            if (var3 >= 3) {
               var1.co(1404535452);
            }

            this.aw.add(var5, var6);
         }
      }

   }

   static final int an(int var0, int var1, int var2, int var3, byte var4) {
      try {
         return var2 * var1 - var0 * var3 >> 16;
      } catch (RuntimeException var5) {
         throw db.an(var5, "gj.an(" + ')');
      }
   }
}
