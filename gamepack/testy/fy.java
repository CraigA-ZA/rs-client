import java.awt.datatransfer.Clipboard;

public class fy extends fb {
   // $FF: synthetic field
   final fa this$0;
   int af;
   byte an;
   static final int ah = 10;
   static int az;

   static final int af(int var0, int var1, int var2, int var3, byte var4) {
      try {
         return var1 * var3 + var0 * var2 >> 16;
      } catch (RuntimeException var5) {
         throw db.an(var5, "fy.af(" + ')');
      }
   }

   void au(sg var1) {
      this.af = var1.cl(-265692380) * -722551969;
      this.an = var1.cf(435772489);
   }

   void an(fj var1, int var2) {
      try {
         var1.ao(this.af * -263561057, this.an, -456839417);
      } catch (RuntimeException var3) {
         throw db.an(var3, "fy.an(" + ')');
      }
   }

   fy(fa var1) {
      try {
         this.this$0 = var1;
         super();
         this.af = 722551969;
      } catch (RuntimeException var2) {
         throw db.an(var2, "fy.<init>(" + ')');
      }
   }

   void ac(sg var1) {
      this.af = var1.cl(-1348736794) * -722551969;
      this.an = var1.cf(435772489);
   }

   void aw(fj var1) {
      var1.ao(this.af * -263561057, this.an, -456839417);
   }

   void af(sg var1, int var2) {
      try {
         this.af = var1.cl(-2001702280) * -722551969;
         this.an = var1.cf(435772489);
      } catch (RuntimeException var3) {
         throw db.an(var3, "fy.af(" + ')');
      }
   }

   public static Clipboard ol(int var0) {
      try {
         return ck.bc.ax(-481768005);
      } catch (RuntimeException var1) {
         throw db.an(var1, "fy.ol(" + ')');
      }
   }

   static byte[] aw(byte[] var0, byte var1) {
      try {
         int var2 = var0.length;
         byte[] var3 = new byte[var2];
         System.arraycopy(var0, 0, var3, 0, var2);
         return var3;
      } catch (RuntimeException var4) {
         throw db.an(var4, "fy.aw(" + ')');
      }
   }

   static final void mq(mq[] var0, int var1, byte var2) {
      try {
         for(int var3 = 0; var3 < var0.length; ++var3) {
            mq var4 = var0[var3];
            if (null != var4) {
               if (0 == 883712245 * var4.bg) {
                  if (var4.gz != null) {
                     if (var2 <= 4) {
                        throw new IllegalStateException();
                     }

                     mq(var4.gz, var1, (byte)107);
                  }

                  di var5 = (di)client.oc.af((long)(1713081171 * var4.bs));
                  if (null != var5) {
                     if (var2 <= 4) {
                        throw new IllegalStateException();
                     }

                     ec.mu(var5.af * 944864121, var1, (byte)63);
                  }
               }

               dr var7;
               if (var1 == 0) {
                  if (var2 <= 4) {
                     throw new IllegalStateException();
                  }

                  if (null != var4.gt) {
                     if (var2 <= 4) {
                        throw new IllegalStateException();
                     }

                     var7 = new dr();
                     var7.aw = var4;
                     var7.af = var4.gt;
                     dh.af(var7, (byte)40);
                  }
               }

               if (1 == var1 && var4.gu != null) {
                  if (var2 <= 4) {
                     throw new IllegalStateException();
                  }

                  if (var4.br * 55577617 >= 0) {
                     if (var2 <= 4) {
                        throw new IllegalStateException();
                     }

                     mq var8 = gh.an(var4.bs * 1713081171, (byte)5);
                     if (var8 == null) {
                        continue;
                     }

                     if (var2 <= 4) {
                        return;
                     }

                     if (var8.gz == null) {
                        continue;
                     }

                     if (var2 <= 4) {
                        return;
                     }

                     if (var4.br * 55577617 >= var8.gz.length) {
                        continue;
                     }

                     if (var2 <= 4) {
                        throw new IllegalStateException();
                     }

                     if (var8.gz[55577617 * var4.br] != var4) {
                        continue;
                     }
                  }

                  var7 = new dr();
                  var7.aw = var4;
                  var7.af = var4.gu;
                  dh.af(var7, (byte)51);
               }
            }
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "fy.mq(" + ')');
      }
   }
}
