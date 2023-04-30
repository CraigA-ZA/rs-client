public class fg extends fu {
   // $FF: synthetic field
   final gr this$0;
   static final int al = 6;
   byte aw;
   int an;
   String af;

   void ab(gj var1) {
      fz var2 = new fz();
      var2.aw = new tm(this.af);
      var2.an = this.an * -1198371199;
      var2.af = this.aw;
      var1.an(var2, -1571505998);
   }

   void aq(gj var1) {
      fz var2 = new fz();
      var2.aw = new tm(this.af);
      var2.an = this.an * -1435095207;
      var2.af = this.aw;
      var1.an(var2, 2031936582);
   }

   void an(gj var1, byte var2) {
      try {
         fz var3 = new fz();
         var3.aw = new tm(this.af);
         var3.an = this.an * -1435095207;
         var3.af = this.aw;
         var1.an(var3, -1098707641);
      } catch (RuntimeException var4) {
         throw db.an(var4, "fg.an(" + ')');
      }
   }

   void aw(sg var1) {
      if (var1.cm((byte)7) != 255) {
         var1.at -= -1516355947;
         var1.cv((byte)1);
      }

      this.af = var1.cz((byte)-12);
      this.an = var1.cl(739337811) * 215553043;
      this.aw = var1.cf(435772489);
      var1.cv((byte)1);
   }

   void ac(sg var1) {
      if (var1.cm((byte)7) != 255) {
         var1.at -= -1516355947;
         var1.cv((byte)1);
      }

      this.af = var1.cz((byte)-122);
      this.an = var1.cl(-422325404) * 215553043;
      this.aw = var1.cf(435772489);
      var1.cv((byte)1);
   }

   void au(sg var1) {
      if (var1.cm((byte)7) != 255) {
         var1.at -= 416275599;
         var1.cv((byte)1);
      }

      this.af = var1.cz((byte)-16);
      this.an = var1.cl(659814966) * -387154071;
      this.aw = var1.cf(435772489);
      var1.cv((byte)1);
   }

   fg(gr var1) {
      try {
         this.this$0 = var1;
         super();
         this.af = null;
      } catch (RuntimeException var2) {
         throw db.an(var2, "fg.<init>(" + ')');
      }
   }

   static final void nn(int var0, int var1, int var2) {
      try {
         gj var3 = var0 >= 0 ? client.so[var0] : bd.sx;
         if (var3 != null) {
            if (var2 <= -461862935) {
               throw new IllegalStateException();
            }

            if (var1 >= 0) {
               if (var2 <= -461862935) {
                  return;
               }

               if (var1 < var3.ac(881801940)) {
                  fz var4 = (fz)var3.aw.get(var1);
                  if (var4.af != -1) {
                     if (var2 <= -461862935) {
                        throw new IllegalStateException();
                     }

                     return;
                  }

                  String var5 = var4.aw.af(-710264960);
                  lg var6 = mi.an(lv.dv, client.in.au, (short)-32287);
                  var6.aw.bu(3 + ct.bc(var5, (byte)15), (byte)70);
                  var6.aw.bu(var0, (byte)17);
                  var6.aw.bf(var1, (byte)39);
                  var6.aw.bh(var5, -2065026783);
                  client.in.aw(var6, 414135591);
                  return;
               }
            }
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "fg.nn(" + ')');
      }
   }

   void af(sg var1, int var2) {
      try {
         if (var1.cm((byte)7) != 255) {
            if (var2 != -1949352075) {
               throw new IllegalStateException();
            }

            var1.at -= -1516355947;
            var1.cv((byte)1);
         }

         this.af = var1.cz((byte)-74);
         this.an = var1.cl(297326267) * 215553043;
         this.aw = var1.cf(435772489);
         var1.cv((byte)1);
      } catch (RuntimeException var3) {
         throw db.an(var3, "fg.af(" + ')');
      }
   }

   static void ab(float var0, float var1, float var2, float var3, ek var4, byte var5) {
      try {
         float var6 = var1 - var0;
         float var7 = var2 - var1;
         float var8 = var3 - var2;
         float var9 = var7 - var6;
         var4.ao = var8 - var7 - var9;
         var4.ay = var9 + var9 + var9;
         var4.aa = var6 + var6 + var6;
         var4.at = var0;
      } catch (RuntimeException var10) {
         throw db.an(var10, "fg.ab(" + ')');
      }
   }

   static ch an(int var0, int var1, int var2, int var3) {
      try {
         int var4 = (var1 << 8) + var0;
         ch var6 = hq.aw(var4, var0, (byte)-114);
         if (null != var6) {
            if (var3 == -1243378406) {
               throw new IllegalStateException();
            } else {
               return var6;
            }
         } else {
            int var5 = kd.af(var2, var0, -521149946);
            ch var8 = (ch)ch.af.af((long)(var5 << 16));
            ch var7;
            if (null != var8) {
               if (var3 == -1243378406) {
                  throw new IllegalStateException();
               }

               var7 = var8;
            } else {
               String var9 = String.valueOf(var5);
               int var10 = ey.fj.cy(var9, 244357161);
               if (-1 == var10) {
                  var7 = null;
               } else {
                  label64: {
                     byte[] var11 = ey.fj.cn(var10, (byte)-23);
                     if (null != var11) {
                        if (var11.length <= 1) {
                           if (var3 == -1243378406) {
                              throw new IllegalStateException();
                           }

                           var7 = null;
                           break label64;
                        }

                        var8 = bz.ac(var11, (byte)1);
                        if (var8 != null) {
                           if (var3 == -1243378406) {
                              throw new IllegalStateException();
                           }

                           ch.af.aw(var8, (long)(var5 << 16));
                           var7 = var8;
                           break label64;
                        }
                     }

                     var7 = null;
                  }
               }
            }

            if (var7 != null) {
               if (var3 == -1243378406) {
                  throw new IllegalStateException();
               } else {
                  return var7;
               }
            } else {
               return null;
            }
         }
      } catch (RuntimeException var12) {
         throw db.an(var12, "fg.an(" + ')');
      }
   }
}
