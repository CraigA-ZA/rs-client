import accessors.RSDemotingHashTable;

public final class ke implements RSDemotingHashTable {
   ox ac;
   int an;
   ro aw;
   kv au;
   int af;

   public void ad(int var1) {
      for(kf var2 = (kf)this.ac.au(); var2 != null; var2 = (kf)this.ac.aq()) {
         if (var2.an()) {
            if (var2.af() == null) {
               var2.ga();
               var2.fs();
               this.an += var2.an;
            }
         } else if (++var2.ef > (long)var1) {
            ky var3 = new ky(var2.af(), var2.an);
            this.aw.an(var3, var2.hr);
            ox.aw(var3, var2);
            var2.ga();
            var2.fs();
         }
      }

   }

   public void by() {
      this.ac.af();
      this.aw.aw();
      this.an = this.af;
   }

   public Object af(long var1) {
      kf var3 = (kf)this.aw.af(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.af();
         if (var4 == null) {
            var3.ga();
            var3.fs();
            this.an += var3.an;
            return null;
         } else {
            if (var3.an()) {
               kp var5 = new kp(var4, var3.an);
               this.aw.an(var5, var3.hr);
               this.ac.an(var5);
               var5.ef = 0L;
               var3.ga();
               var3.fs();
            } else {
               this.ac.an(var3);
               var3.ef = 0L;
            }

            return var4;
         }
      }
   }

   void an(long var1) {
      kf var3 = (kf)this.aw.af(var1);
      this.aw(var3);
   }

   void ai(long var1) {
      kf var3 = (kf)this.aw.af(var1);
      this.aw(var3);
   }

   public ke(int var1) {
      this(var1, var1);
   }

   public void au(Object var1, long var2, int var4) {
      if (var4 > this.af) {
         throw new IllegalStateException();
      } else {
         this.an(var2);
         this.an -= var4;

         while(this.an < 0) {
            kf var5 = (kf)this.ac.ac();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.an()) {
            }

            this.aw(var5);
            if (this.au != null) {
               this.au.af(var5.af());
            }
         }

         kp var6 = new kp(var1, var4);
         this.aw.an(var6, var2);
         this.ac.an(var6);
         var6.ef = 0L;
      }
   }

   public void ab(int var1) {
      for(kf var2 = (kf)this.ac.au(); var2 != null; var2 = (kf)this.ac.aq()) {
         if (var2.an()) {
            if (var2.af() == null) {
               var2.ga();
               var2.fs();
               this.an += var2.an;
            }
         } else if (++var2.ef > (long)var1) {
            ky var3 = new ky(var2.af(), var2.an);
            this.aw.an(var3, var2.hr);
            ox.aw(var3, var2);
            var2.ga();
            var2.fs();
         }
      }

   }

   void ax(long var1) {
      kf var3 = (kf)this.aw.af(var1);
      this.aw(var3);
   }

   public Object al(long var1) {
      kf var3 = (kf)this.aw.af(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.af();
         if (var4 == null) {
            var3.ga();
            var3.fs();
            this.an += var3.an;
            return null;
         } else {
            if (var3.an()) {
               kp var5 = new kp(var4, var3.an);
               this.aw.an(var5, var3.hr);
               this.ac.an(var5);
               var5.ef = 0L;
               var3.ga();
               var3.fs();
            } else {
               this.ac.an(var3);
               var3.ef = 0L;
            }

            return var4;
         }
      }
   }

   public Object at(long var1) {
      kf var3 = (kf)this.aw.af(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.af();
         if (var4 == null) {
            var3.ga();
            var3.fs();
            this.an += var3.an;
            return null;
         } else {
            if (var3.an()) {
               kp var5 = new kp(var4, var3.an);
               this.aw.an(var5, var3.hr);
               this.ac.an(var5);
               var5.ef = 0L;
               var3.ga();
               var3.fs();
            } else {
               this.ac.an(var3);
               var3.ef = 0L;
            }

            return var4;
         }
      }
   }

   public Object aa(long var1) {
      kf var3 = (kf)this.aw.af(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.af();
         if (var4 == null) {
            var3.ga();
            var3.fs();
            this.an += var3.an;
            return null;
         } else {
            if (var3.an()) {
               kp var5 = new kp(var4, var3.an);
               this.aw.an(var5, var3.hr);
               this.ac.an(var5);
               var5.ef = 0L;
               var3.ga();
               var3.fs();
            } else {
               this.ac.an(var3);
               var3.ef = 0L;
            }

            return var4;
         }
      }
   }

   public void bi() {
      this.ac.af();
      this.aw.aw();
      this.an = this.af;
   }

   void ao(long var1) {
      kf var3 = (kf)this.aw.af(var1);
      this.aw(var3);
   }

   public ke(int var1, int var2) {
      this.ac = new ox();
      this.af = var1;
      this.an = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
      }

      this.aw = new ro(var3);
   }

   public void aq() {
      this.ac.af();
      this.aw.aw();
      this.an = this.af;
   }

   void ag(kf var1) {
      if (var1 != null) {
         var1.ga();
         var1.fs();
         this.an += var1.an;
      }

   }

   public void ah(Object var1, long var2) {
      this.au(var1, var2, 1);
   }

   public void av(Object var1, long var2) {
      this.au(var1, var2, 1);
   }

   public void ar(Object var1, long var2, int var4) {
      if (var4 > this.af) {
         throw new IllegalStateException();
      } else {
         this.an(var2);
         this.an -= var4;

         while(this.an < 0) {
            kf var5 = (kf)this.ac.ac();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.an()) {
            }

            this.aw(var5);
            if (this.au != null) {
               this.au.af(var5.af());
            }
         }

         kp var6 = new kp(var1, var4);
         this.aw.an(var6, var2);
         this.ac.an(var6);
         var6.ef = 0L;
      }
   }

   public void am(Object var1, long var2, int var4) {
      if (var4 > this.af) {
         throw new IllegalStateException();
      } else {
         this.an(var2);
         this.an -= var4;

         while(this.an < 0) {
            kf var5 = (kf)this.ac.ac();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.an()) {
            }

            this.aw(var5);
            if (this.au != null) {
               this.au.af(var5.af());
            }
         }

         kp var6 = new kp(var1, var4);
         this.aw.an(var6, var2);
         this.ac.an(var6);
         var6.ef = 0L;
      }
   }

   public void as(Object var1, long var2, int var4) {
      if (var4 > this.af) {
         throw new IllegalStateException();
      } else {
         this.an(var2);
         this.an -= var4;

         while(this.an < 0) {
            kf var5 = (kf)this.ac.ac();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.an()) {
            }

            this.aw(var5);
            if (this.au != null) {
               this.au.af(var5.af());
            }
         }

         kp var6 = new kp(var1, var4);
         this.aw.an(var6, var2);
         this.ac.an(var6);
         var6.ef = 0L;
      }
   }

   public void aj(int var1) {
      for(kf var2 = (kf)this.ac.au(); var2 != null; var2 = (kf)this.ac.aq()) {
         if (var2.an()) {
            if (var2.af() == null) {
               var2.ga();
               var2.fs();
               this.an += var2.an;
            }
         } else if (++var2.ef > (long)var1) {
            ky var3 = new ky(var2.af(), var2.an);
            this.aw.an(var3, var2.hr);
            ox.aw(var3, var2);
            var2.ga();
            var2.fs();
         }
      }

   }

   public void ak(int var1) {
      for(kf var2 = (kf)this.ac.au(); var2 != null; var2 = (kf)this.ac.aq()) {
         if (var2.an()) {
            if (var2.af() == null) {
               var2.ga();
               var2.fs();
               this.an += var2.an;
            }
         } else if (++var2.ef > (long)var1) {
            ky var3 = new ky(var2.af(), var2.an);
            this.aw.an(var3, var2.hr);
            ox.aw(var3, var2);
            var2.ga();
            var2.fs();
         }
      }

   }

   public void az(int var1) {
      for(kf var2 = (kf)this.ac.au(); var2 != null; var2 = (kf)this.ac.aq()) {
         if (var2.an()) {
            if (var2.af() == null) {
               var2.ga();
               var2.fs();
               this.an += var2.an;
            }
         } else if (++var2.ef > (long)var1) {
            ky var3 = new ky(var2.af(), var2.an);
            this.aw.an(var3, var2.hr);
            ox.aw(var3, var2);
            var2.ga();
            var2.fs();
         }
      }

   }

   public Object ay(long var1) {
      kf var3 = (kf)this.aw.af(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.af();
         if (var4 == null) {
            var3.ga();
            var3.fs();
            this.an += var3.an;
            return null;
         } else {
            if (var3.an()) {
               kp var5 = new kp(var4, var3.an);
               this.aw.an(var5, var3.hr);
               this.ac.an(var5);
               var5.ef = 0L;
               var3.ga();
               var3.fs();
            } else {
               this.ac.an(var3);
               var3.ef = 0L;
            }

            return var4;
         }
      }
   }

   public void ae(int var1) {
      for(kf var2 = (kf)this.ac.au(); var2 != null; var2 = (kf)this.ac.aq()) {
         if (var2.an()) {
            if (var2.af() == null) {
               var2.ga();
               var2.fs();
               this.an += var2.an;
            }
         } else if (++var2.ef > (long)var1) {
            ky var3 = new ky(var2.af(), var2.an);
            this.aw.an(var3, var2.hr);
            ox.aw(var3, var2);
            var2.ga();
            var2.fs();
         }
      }

   }

   public void ap() {
      this.ac.af();
      this.aw.aw();
      this.an = this.af;
   }

   public void ac(Object var1, long var2) {
      this.au(var1, var2, 1);
   }

   public void bb() {
      this.ac.af();
      this.aw.aw();
      this.an = this.af;
   }

   void aw(kf var1) {
      if (var1 != null) {
         var1.ga();
         var1.fs();
         this.an += var1.an;
      }

   }
}
