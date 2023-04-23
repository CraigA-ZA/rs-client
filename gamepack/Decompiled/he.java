import java.io.IOException;

public class he implements be {
   static Archive gr;
   boolean an = false;
   boolean aw = false;
   Component af = null;

   public void ax(Component var1) {
      this.ag();
      if (null != var1) {
         this.af = var1;
         mt var3 = var1.br();
         if (var3 != null) {
            var3.af.an(true);
            if (null != var3.au) {
               ClientScriptEvent var4 = new ClientScriptEvent();
               var4.aw(var1);
               var4.setArgs(var3.au);
               np.jk_renamed().addFirst(var4);
            }
         }
      }

   }

   public Component ai() {
      return this.af;
   }

   public void ag() {
      if (this.af != null) {
         mt var2 = this.af.br();
         Component var3 = this.af;
         this.af = null;
         if (var2 != null) {
            var2.af.an(false);
            if (null != var2.au) {
               ClientScriptEvent var4 = new ClientScriptEvent();
               var4.aw(var3);
               var4.setArgs(var2.au);
               np.jk_renamed().addFirst(var4);
            }

         }
      }
   }

   public boolean af(int var1) {
      if (null == this.af) {
         return false;
      } else {
         bb var3 = this.af.bs();
         if (var3 == null) {
            return false;
         } else {
            if (var3.aq(var1)) {
               switch (var1) {
                  case 81:
                     this.aw = true;
                     break;
                  case 82:
                     this.an = true;
                     break;
                  default:
                     if (this.ah(var1)) {
                        fw.ma_renamed(this.af);
                     }
               }
            }

            return var3.au(var1);
         }
      }
   }

   public boolean an(int var1) {
      switch (var1) {
         case 81:
            this.aw = false;
            return false;
         case 82:
            this.an = false;
            return false;
         default:
            return false;
      }
   }

   public boolean aw(char var1) {
      if (this.af == null) {
         return false;
      } else if (!MouseHandler.an_renamed(var1)) {
         return false;
      } else {
         mz var3 = this.af.bj();
         if (var3 != null && var3.ca()) {
            bb var4 = this.af.bs();
            if (null == var4) {
               return false;
            } else {
               if (var4.al(var1) && var3.am(var1)) {
                  fw.ma_renamed(this.af);
               }

               return var4.ab(var1);
            }
         } else {
            return false;
         }
      }
   }

   public boolean ac(boolean var1) {
      return false;
   }

   boolean ah(int var1) {
      if (this.af == null) {
         return false;
      } else {
         mz var3 = this.af.bj();
         if (var3 != null && var3.ca()) {
            switch (var1) {
               case 13:
                  this.ag();
                  return true;
               case 48:
                  if (this.an) {
                     var3.ae();
                  }

                  return true;
               case 65:
                  if (this.an) {
                     var3.bf(fy.ol_renamed());
                  }

                  return true;
               case 66:
                  if (this.an) {
                     var3.bu(fy.ol_renamed());
                  }

                  return true;
               case 67:
                  if (this.an) {
                     var3.bq(fy.ol_renamed());
                  }

                  return true;
               case 84:
                  if (var3.cl() == 0) {
                     var3.am(10);
                  } else if (this.aw && var3.cx()) {
                     var3.am(10);
                  } else {
                     mt var4 = this.af.br();
                     ClientScriptEvent var5 = new ClientScriptEvent();
                     var5.aw(this.af);
                     var5.setArgs(var4.aq);
                     np.jk_renamed().addFirst(var5);
                     this.ag();
                  }

                  return true;
               case 85:
                  if (this.an) {
                     var3.ak();
                  } else {
                     var3.as();
                  }

                  return true;
               case 96:
                  if (this.an) {
                     var3.bo(this.aw);
                  } else {
                     var3.bk(this.aw);
                  }

                  return true;
               case 97:
                  if (this.an) {
                     var3.bz(this.aw);
                  } else {
                     var3.bx(this.aw);
                  }

                  return true;
               case 98:
                  if (this.an) {
                     var3.ba();
                  } else {
                     var3.bm(this.aw);
                  }

                  return true;
               case 99:
                  if (this.an) {
                     var3.bv();
                  } else {
                     var3.bd(this.aw);
                  }

                  return true;
               case 101:
                  if (this.an) {
                     var3.az();
                  } else {
                     var3.aj();
                  }

                  return true;
               case 102:
                  if (this.an) {
                     var3.bi(this.aw);
                  } else {
                     var3.by(this.aw);
                  }

                  return true;
               case 103:
                  if (this.an) {
                     var3.be(this.aw);
                  } else {
                     var3.bb(this.aw);
                  }

                  return true;
               case 104:
                  if (this.an) {
                     var3.bn(this.aw);
                  } else {
                     var3.bt(this.aw);
                  }

                  return true;
               case 105:
                  if (this.an) {
                     var3.bs(this.aw);
                  } else {
                     var3.bj(this.aw);
                  }

                  return true;
               default:
                  return false;
            }
         } else {
            return false;
         }
      }
   }

   static ClientPreferences readClientPreferences() {
      AccessFile var1 = null;
      ClientPreferences var2 = new ClientPreferences();

      try {
         var1 = in.getPreferencesFile("", Client.cc.aq, false);
         byte[] var3 = new byte[(int)var1.length()];

         int var5;
         for(int var4 = 0; var4 < var3.length; var4 += var5) {
            var5 = var1.read(var3, var4, var3.length - var4);
            if (-1 == var5) {
               throw new IOException();
            }
         }

         var2 = new ClientPreferences(new Packet(var3));
      } catch (Exception var7) {
      }

      try {
         if (null != var1) {
            var1.close();
         }
      } catch (Exception var6) {
      }

      return var2;
   }

   static void ax_renamed(String var0, String var1, String var2) {
      cz.cs = var0;
      cz.cc = var1;
      cz.cn = var2;
   }
}
