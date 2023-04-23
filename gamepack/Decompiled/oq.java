import java.util.ArrayList;

public class oq {
   public static int aq;
   boolean aj = true;
   int ad = 0;
   int ae = 0;
   int ah = 1729616775;
   int am = 0;
   int ar = 0;
   int as = 0;
   int av = -1966324537;
   ArrayList az = new ArrayList();
   AbstractFont ak;

   public om af(int var1) {
      return (om)this.az.get(var1);
   }

   om an() {
      return this.az.size() == 0 ? null : (om)this.az.get(this.az.size() - 1);
   }

   public boolean aw() {
      return this.az.size() == 0;
   }

   boolean ac() {
      return this.av * -64830711 > 1;
   }

   public int au() {
      return this.az.size();
   }

   public String ab() {
      if (this.aw()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder(this.au());

         for(int var3 = 0; var3 < this.au(); ++var3) {
            om var4 = this.af(var3);
            var2.append(var4.af);
         }

         return var2.toString();
      }
   }

   public void aq(int var1) {
      if (null != this.ak && var1 < 2 * this.ak.ascent) {
         var1 = Integer.MAX_VALUE;
      }

      if (233637321 * this.ah != var1) {
         this.ah = 417866873 * var1;
         this.bm();
      }

   }

   public void al(int var1) {
      if (var1 != this.av * -64830711) {
         this.av = var1 * -181159111;
         this.bm();
      }

   }

   public void at(int var1) {
      if (var1 != 874587033 * this.ae) {
         this.ae = var1 * 1523286185;
         this.bm();
      }

   }

   public void aa(AbstractFont var1) {
      if (var1 != this.ak) {
         this.ak = var1;
         if (null != this.ak) {
            if (this.as * -1059679999 == 0) {
               this.as = this.ak.ascent * 1279946497;
            }

            if (!this.aw()) {
               this.bm();
            }
         }
      }

   }

   public void ay(int var1) {
      if (var1 != this.ad * -29893609) {
         this.ad = -1609622617 * var1;
         this.bm();
      }

   }

   public boolean ao(int var1, int var2) {
      if (var1 != 252193353 * this.ar || var2 != 1114162931 * this.am) {
         this.ar = 1135601657 * var1;
         this.am = -99433925 * var2;
         this.bm();
      }

      return true;
   }

   public void ax(int var1) {
      if (this.as * -1059679999 != var1) {
         this.as = var1 * 1279946497;
         this.bm();
      }

   }

   public oa ai(int var1, int var2) {
      if (var1 == var2) {
         return new oa(this, 0, 0);
      } else if (var1 <= this.az.size() && var2 <= this.az.size()) {
         return var2 < var1 ? new oa(this, var2, var1) : new oa(this, var1, var2);
      } else {
         return new oa(this, 0, 0);
      }
   }

   public ow ag(char var1, int var2, int var3) {
      return this.ah(Character.toString(var1), var2, var3);
   }

   public ow ah(String var1, int var2, int var3) {
      if (0 == var3) {
         var3 = Integer.MAX_VALUE;
      }

      int var5 = var2;
      if (this.az.size() >= var3) {
         this.bd(var2, var2);
         return new ow(var2, true);
      } else {
         this.az.ensureCapacity(this.az.size() + var1.length());

         for(int var6 = 0; var6 < var1.length() && this.az.size() < var3; ++var6) {
            om var7 = new om();
            var7.af = var1.charAt(var6);
            this.az.add(var5, var7);
            ++var5;
         }

         this.bd(var2, var5);
         if (-64830711 * this.av != 0 && this.by() > this.av * -64830711) {
            while(var5 != var2) {
               --var5;
               this.as(var5);
               if (this.by() <= this.av * -64830711) {
                  break;
               }
            }

            return new ow(var5, true);
         } else {
            return new ow(var5, false);
         }
      }
   }

   ow av(String var1, int var2) {
      return this.ah(var1, this.az.size(), var2);
   }

   public ow ar(String var1) {
      this.am();
      return this.av(var1, 0);
   }

   void am() {
      this.az.clear();
   }

   public int as(int var1) {
      return this.aj(var1, var1 + 1);
   }

   public int aj(int var1, int var2) {
      int var4;
      if (var2 < var1) {
         var4 = var2;
         var2 = var1;
         var1 = var4;
      }

      this.az.subList(var1, var2).clear();
      var4 = var1;
      if (this.ac() && 1 == -29893609 * this.ad) {
         while(var4 > 0) {
            --var4;
            char var5 = ((om)this.az.get(var4)).af;
            if (' ' == var5 || var5 == '\t') {
               break;
            }
         }
      }

      this.bd(var4, var2);
      return var1;
   }

   public int ak(int var1, int var2) {
      if (null == this.ak) {
         return 0;
      } else if (this.ac() && var1 > 233637321 * this.ah) {
         return this.az.size();
      } else {
         if (!this.az.isEmpty()) {
            for(int var4 = 0; var4 < this.az.size(); ++var4) {
               om var5 = (om)this.az.get(var4);
               if (var2 <= var5.aw * -727185157 + this.ap()) {
                  if (var2 < -727185157 * var5.aw) {
                     break;
                  }

                  if (var1 < 1620071571 * var5.an) {
                     return var4 > 0 ? var4 - 1 : 0;
                  }

                  if (var4 + 1 != this.az.size() && ((om)this.az.get(var4 + 1)).aw * -727185157 != -727185157 * var5.aw) {
                     int var6 = this.bj((om)this.az.get(var4), false);
                     if (var1 < 1620071571 * var5.an + var6) {
                        return var4;
                     }

                     if (var2 <= -727185157 * var5.aw + this.ap()) {
                        return var4 + 1;
                     }
                  }
               }
            }

            om var10 = (om)this.az.get(this.az.size() - 1);
            if (var1 >= var10.an * 1620071571 && var1 <= var10.an * 1620071571 + this.bb() && var2 >= -727185157 * var10.aw && var2 <= -727185157 * var10.aw + this.ap()) {
               return this.az.size() - 1;
            }
         }

         return this.az.size();
      }
   }

   public int az(int var1, int var2) {
      if (null != this.ak && !this.aw() && var1 <= this.az.size()) {
         byte var4;
         if (var2 > 0) {
            var4 = 1;
         } else {
            var4 = -1;
            var2 = -var2;
         }

         int var5 = 0;
         int var6 = 0;
         if (var1 > 0) {
            om var7 = (om)this.az.get(var1 - 1);
            var5 = var7.an * 1620071571 + this.bt(var1 - 1);
            var6 = var7.aw * -727185157;
         } else if (var4 == -1 && 0 == var1) {
            return 0;
         }

         int var16 = 16777215;
         int var8 = 0;
         int var9 = var1;
         int var10 = 16777215;
         int var11 = 1 == var4 ? this.az.size() + 1 : 0;

         for(int var12 = var1 + var4; var11 != var12; var12 += var4) {
            om var13 = (om)this.az.get(var12 - 1);
            if (var6 != -727185157 * var13.aw) {
               ++var8;
               var6 = -727185157 * var13.aw;
               if (var8 > var2) {
                  return var9;
               }
            }

            if (var8 == var2) {
               int var14 = Math.abs(var13.an * 1620071571 + this.bt(var12 - 1) - var5);
               if (var14 >= var10) {
                  return var9;
               }

               var9 = var12;
               var10 = var14;
            }
         }

         if (var4 == 1) {
            return this.az.size();
         } else {
            if (var6 != 0) {
               ++var8;
            }

            return 16777215 != var10 && (var8 != var2 || var5 >= var10) ? var9 : 0;
         }
      } else {
         return 0;
      }
   }

   public int ad() {
      if (!this.az.isEmpty() && this.by() == 1) {
         return this.az.isEmpty() ? 0 : ((om)this.az.get(this.az.size() - 1)).an * 1620071571 + this.bb();
      } else {
         int var2 = -1;
         int var3 = 0;

         for(int var4 = this.az.size() - 1; var4 >= 0; --var4) {
            om var5 = (om)this.az.get(var4);
            if (var2 != -727185157 * var5.aw) {
               int var6 = this.bj(var5, false) + 1620071571 * var5.an;
               var3 = Math.max(var6, var3);
               var2 = var5.aw * -727185157;
            }
         }

         return var3;
      }
   }

   public int ae() {
      return this.aw() ? 0 : this.ak.ascent + ((om)this.az.get(this.az.size() - 1)).aw * -727185157;
   }

   public int ap() {
      return this.as * -1059679999;
   }

   public int by() {
      return this.ae() / this.ak.ascent;
   }

   int bb() {
      return this.aw() ? 0 : this.bj((om)this.az.get(this.az.size() - 1), false);
   }

   public int bi() {
      return this.ah * 233637321;
   }

   public int be() {
      return this.av * -64830711;
   }

   public int bk() {
      return this.ad * -29893609;
   }

   public int bx() {
      return 874587033 * this.ae;
   }

   public int bo(int var1) {
      switch (this.ar * 252193353) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            return 0;
      }
   }

   public int bz(int var1) {
      switch (1114162931 * this.am) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            return 0;
      }
   }

   void bm() {
      this.bd(0, this.az.size());
   }

   void bd(int var1, int var2) {
      if (!this.aw() && this.ak != null) {
         rg var4 = this.bn(var1, var2);
         boolean var5 = (Integer)var4.af == 0 && (Integer)var4.an == this.az.size();
         int var6 = (Integer)var4.af;
         int var7 = 0;
         int var8 = var5 ? 0 : ((om)this.az.get((Integer)var4.af)).aw * -727185157;
         int var9 = 0;

         int var10;
         for(var10 = (Integer)var4.af; var10 <= (Integer)var4.an; ++var10) {
            boolean var11 = var10 >= this.az.size();
            om var12 = (om)this.az.get(!var11 ? var10 : this.az.size() - 1);
            int var13 = !var11 ? this.bj(var12, false) : 0;
            boolean var14 = !var11 && var12.af == '\n';
            boolean var15 = !var11 && this.ac() && var7 + var13 > 233637321 * this.ah;
            if (var14 || var15 || var11) {
               int var16 = var10;
               int var17 = 0;
               int var18;
               int var19;
               om var20;
               if (var15) {
                  var18 = 0;
                  if (1 == this.ad * -29893609) {
                     for(var19 = var10; var19 > var6; --var19) {
                        var20 = (om)this.az.get(var19);
                        var18 += var19 < var16 ? this.bj(var20, false) : 0;
                        if (var20.af == ' ' || '\n' == var20.af) {
                           var16 = var19;
                           var7 -= var18;
                           var17 = var18;
                           break;
                        }
                     }
                  }
               }

               var18 = -this.bo(var7);

               for(var19 = var6; var19 < var16; ++var19) {
                  var20 = (om)this.az.get(var19);
                  int var21 = this.bj(var20, false);
                  var20.an = var18 * -961418853;
                  var20.aw = var8 * -2052537805;
                  var18 += var21;
               }

               var6 = var16;
               var7 = var17;
               var8 += this.ap();
               ++var9;
            }

            var7 += !var11 ? var13 : 0;
         }

         if (1114162931 * this.am != 0 && var5) {
            var10 = var9 * this.ap();
            int var22 = this.bz(var10);

            for(int var23 = 0; var23 < this.az.size(); ++var23) {
               om var24 = (om)this.az.get(var23);
               var24.aw -= var22 * -2052537805;
            }
         }

      }
   }

   int bt(int var1) {
      return var1 < this.az.size() ? this.bj((om)this.az.get(var1), false) : 0;
   }

   int bj(om var1, boolean var2) {
      if (var1.af == '\n') {
         return 0;
      } else if (!var2 && 0 != this.ae * 874587033) {
         return this.ak.advances[42];
      } else {
         int var4 = this.ak.advances[var1.af];
         if (var4 == 0) {
            return '\t' == var1.af ? this.ak.advances[32] * 3 : this.ak.advances[32];
         } else {
            return var4;
         }
      }
   }

   rg bn(int var1, int var2) {
      int var4 = Math.min(var1, var2);
      int var5 = Math.max(var1, var2);
      int var6 = this.az.size();
      if (0 == var4 && var5 == var6) {
         return new rg(0, var6);
      } else {
         int var7 = this.bs(var4, false);
         int var8 = this.br(var5, false);
         int var9;
         switch (this.am * 1114162931) {
            case 0:
               if (252193353 * this.ar == 0) {
                  return new rg(var7, var6);
               }

               var9 = this.bs(var4, true);
               return new rg(var9, var6);
            case 1:
               return new rg(0, var6);
            case 2:
               if (252193353 * this.ar == 2) {
                  return new rg(0, var8);
               }

               var9 = this.br(var5, true);
               return new rg(0, var9);
            default:
               return new rg(0, var6);
         }
      }
   }

   int bs(int var1, boolean var2) {
      if (var1 < this.az.size()) {
         int var4 = ((om)this.az.get(var1)).aw * -727185157;

         for(int var5 = var1; var5 > 0; --var5) {
            if (((om)this.az.get(var5 - 1)).aw * -727185157 < var4) {
               if (!var2) {
                  return var5;
               }

               var2 = false;
               var4 = ((om)this.az.get(var5 - 1)).aw * -727185157;
            }
         }
      }

      return 0;
   }

   int br(int var1, boolean var2) {
      if (var1 < this.az.size()) {
         int var4 = ((om)this.az.get(var1)).aw * -727185157;

         for(int var5 = var1; var5 < this.az.size() - 1; ++var5) {
            if (((om)this.az.get(var5 + 1)).aw * -727185157 > var4) {
               if (!var2) {
                  return var5;
               }

               var2 = false;
               var4 = ((om)this.az.get(1 + var5)).aw * -727185157;
            }
         }
      }

      return this.az.size();
   }

   public static void as_renamed() {
      ObjType.ObjType_cached.clear();
      ObjType.ay.clear();
      ObjType.Sprite_cached.clear();
   }

   static final void nl_renamed(String var0) {
      if (!var0.equals("")) {
         PacketBitNode var2 = mi.an_renamed(ClientProt.aa, Client.packetWriter.au);
         var2.bit.bu(DynamicObject.bc_renamed(var0));
         var2.bit.bh(var0);
         Client.packetWriter.aw(var2);
      }
   }
}
