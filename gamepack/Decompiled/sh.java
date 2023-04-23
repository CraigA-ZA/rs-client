public class sh implements Enumerated {
   public static final sh af = new sh(1, 0, Integer.class, new sa());
   public static final sh an = new sh(0, 1, Long.class, new sf());
   public static final sh aw = new sh(2, 2, String.class, new si());
   final ss aq;
   public final int ac;
   public final int au;
   public final Class ab;

   public static void an_renamed(AbstractArchive var0, String var1, String var2, int var3, boolean var4) {
      if (var0.cv(var1, var2)) {
         int var6 = var0.getGroupId(var1);
         int var7 = var0.getFileId(var6, var2);
         Message.aw_renamed(var0, var6, var7, var3, var4);
      }

   }

   public static PacketBitNode aw_renamed() {
      PacketBitNode var1 = SpotType.af_renamed();
      var1.af = null;
      var1.an = 0;
      var1.bit = new PacketBit(5000);
      return var1;
   }

   public static sh[] au_renamed() {
      return new sh[]{af, an, aw};
   }

   sh(int var1, int var2, Class var3, ss var4) {
      this.ac = 1357163045 * var1;
      this.au = var2 * 848999595;
      this.ab = var3;
      this.aq = var4;
   }

   public static sh ab_renamed(Class var0) {
      sh[] var2 = au_renamed();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         sh var4 = var2[var3];
         if (var0 == var4.ab) {
            return var4;
         }
      }

      return null;
   }

   public static void aq_renamed(Object var0, Packet var1) {
      ss var3 = al_renamed(var0.getClass());
      var3.af(var0, var1);
   }

   static ss al_renamed(Class var0) {
      sh var2 = ab_renamed(var0);
      if (var2 == null) {
         throw new IllegalArgumentException();
      } else {
         return var2.aq;
      }
   }

   public int ordinal() {
      return this.au * 454796803;
   }

   public Object at(Packet var1) {
      return this.aq.an(var1);
   }

   static final int am_renamed(int var0, int var1) {
      if (-2 == var0) {
         return 12345678;
      } else if (-1 == var0) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   static int bk_renamed(int var0, ClientScript var1, boolean var2) {
      if (3800 == var0) {
         if (null != ObjType.sq) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
            fh.ah = ObjType.sq;
         } else {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
         }

         return 1;
      } else {
         int var4;
         if (3801 == var0) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (Client.sg[var4] != null) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
               fh.ah = Client.sg[var4];
            } else {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3802) {
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = fh.ah.ab;
            return 1;
         } else if (3803 == var0) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fh.ah.al ? 1 : 0;
            return 1;
         } else if (3804 == var0) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fh.ah.at;
            return 1;
         } else if (var0 == 3805) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fh.ah.aa;
            return 1;
         } else if (3806 == var0) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fh.ah.ay;
            return 1;
         } else if (var0 == 3807) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fh.ah.ao;
            return 1;
         } else if (var0 == 3809) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1247430143 * fh.ah.ax;
            return 1;
         } else if (var0 == 3810) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = fh.ah.ad[var4];
            return 1;
         } else if (3811 == var0) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fh.ah.ag[var4];
            return 1;
         } else if (var0 == 3812) {
            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fh.ah.ak * -325159675;
            return 1;
         } else if (3813 == var0) {
            var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = fh.ah.ae[var4];
            return 1;
         } else {
            int var6;
            int var7;
            if (var0 == 3814) {
               Interpreter.Interpreter_intStackSize -= 1281407919;
               var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
               var7 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
               var6 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fh.ah.ac(var4, var7, var6);
               return 1;
            } else if (var0 == 3815) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fh.ah.as * 680027429;
               return 1;
            } else if (3816 == var0) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fh.ah.aj * -1218077019;
               return 1;
            } else if (var0 == 3817) {
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fh.ah.aw(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987]);
               return 1;
            } else if (3818 == var0) {
               Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1] = fh.ah.ab()[Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1]];
               return 1;
            } else if (var0 == 3819) {
               Interpreter.Interpreter_intStackSize -= 854271946;
               var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
               var7 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
               kj.na_renamed(var7, var4, (byte)46);
               return 1;
            } else if (3820 == var0) {
               var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
               Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fh.ah.ar[var4];
               return 1;
            } else {
               if (3821 == var0) {
                  Interpreter.Interpreter_intStackSize -= 1281407919;
                  var4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                  boolean var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] == 1;
                  var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2];
                  Clock.np_renamed(var6, var4, var5);
               }

               if (var0 == 3822) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fh.ah.am[var4] ? 1 : 0;
                  return 1;
               } else if (3850 == var0) {
                  if (MouseHandler.sx != null) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                     fq.av = MouseHandler.sx;
                  } else {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                  }

                  return 1;
               } else if (3851 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  if (Client.so[var4] != null) {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                     fq.av = Client.so[var4];
                     cz.ar = 1601506193 * var4;
                  } else {
                     Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3852) {
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = fq.av.ab;
                  return 1;
               } else if (var0 == 3853) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fq.av.al;
                  return 1;
               } else if (3854 == var0) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fq.av.aq;
                  return 1;
               } else if (3855 == var0) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fq.av.ac();
                  return 1;
               } else if (3856 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += -1086551379) * -2017760987 - 1] = ((fz)fq.av.aw.get(var4)).aw.af();
                  return 1;
               } else if (3857 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((fz)fq.av.aw.get(var4)).af;
                  return 1;
               } else if (var0 == 3858) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((fz)fq.av.aw.get(var4)).an * -2113202541;
                  return 1;
               } else if (3859 == var0) {
                  var4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                  fg.nn_renamed(cz.ar * -575466127, var4);
                  return 1;
               } else if (var0 == 3860) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = fq.av.au(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= -1086551379) * -2017760987]);
                  return 1;
               } else if (var0 == 3861) {
                  Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1] = fq.av.af()[Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1]];
                  return 1;
               } else if (3890 == var0) {
                  Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ds.rx != null ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   static final void nm_renamed(String var0) {
      if (es.clanChat != null) {
         PacketBitNode var2 = mi.an_renamed(ClientProt.dt, Client.packetWriter.au);
         var2.bit.bu(DynamicObject.bc_renamed(var0));
         var2.bit.bh(var0);
         Client.packetWriter.aw(var2);
      }
   }
}
