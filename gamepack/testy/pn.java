import accessors.RSBufferedSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class pn implements Runnable, RSBufferedSource {
   IOException aq;
   Thread af;
   InputStream an;
   byte[] ac;
   int au;
   int aw;
   int ab;
   static final int aa = 30;

   int aw(short var1) throws IOException {
      try {
         synchronized(this) {
            if (this.ab * 1652063427 == 160772207 * this.au) {
               if (var1 <= 1100) {
                  throw new IllegalStateException();
               } else if (null != this.aq) {
                  if (var1 <= 1100) {
                     throw new IllegalStateException();
                  } else {
                     throw new IOException(this.aq.toString());
                  }
               } else {
                  return -1;
               }
            } else {
               int var3 = this.ac[this.au * 160772207] & 255;
               this.au = (this.au * 160772207 + 1) % (-1464241637 * this.aw) * 1198141071;
               this.notifyAll();
               return var3;
            }
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "pn.aw(" + ')');
      }
   }

   pn(InputStream var1, int var2) {
      try {
         super();
         this.au = 0;
         this.ab = 0;
         this.an = var1;
         this.aw = -1354885101 * (1 + var2);
         this.ac = new byte[-1464241637 * this.aw];
         this.af = new Thread(this);
         this.af.setDaemon(true);
         this.af.start();
      } catch (RuntimeException var3) {
         throw db.an(var3, "pn.<init>(" + ')');
      }
   }

   static int ah(mq var0, int var1) {
      try {
         if (883712245 * var0.bg != 11) {
            dm.ay -= -1086551379;
            cy.al[(cy.at += 427135973) * -964267539 - 1] = -1;
            return 1;
         } else {
            String var2 = cy.aa[(dm.ay -= -1086551379) * -2017760987];
            cy.al[(cy.at += 427135973) * -964267539 - 1] = var0.bb(var2, 434397306);
            return 1;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "pn.ah(" + ')');
      }
   }

   int an(byte var1) throws IOException {
      try {
         synchronized(this) {
            int var3;
            if (this.au * 160772207 <= 1652063427 * this.ab) {
               var3 = this.ab * 1652063427 - this.au * 160772207;
            } else {
               var3 = this.aw * -1464241637 - 160772207 * this.au + 1652063427 * this.ab;
            }

            if (var3 <= 0) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               if (null != this.aq) {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  throw new IOException(this.aq.toString());
               }
            }

            this.notifyAll();
            return var3;
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "pn.an(" + ')');
      }
   }

   boolean af(int var1, int var2) throws IOException {
      try {
         if (0 == var1) {
            if (var2 >= -1026636126) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            if (var1 > 0) {
               if (var2 >= -1026636126) {
                  throw new IllegalStateException();
               }

               if (var1 < -1464241637 * this.aw) {
                  synchronized(this) {
                     int var4;
                     if (this.au * 160772207 <= this.ab * 1652063427) {
                        var4 = 1652063427 * this.ab - this.au * 160772207;
                     } else {
                        var4 = this.aw * -1464241637 - 160772207 * this.au + this.ab * 1652063427;
                     }

                     if (var4 < var1) {
                        if (var2 >= -1026636126) {
                           throw new IllegalStateException();
                        }

                        if (this.aq != null) {
                           if (var2 >= -1026636126) {
                              throw new IllegalStateException();
                           }

                           throw new IOException(this.aq.toString());
                        }

                        this.notifyAll();
                        return false;
                     }

                     return true;
                  }
               }

               if (var2 >= -1026636126) {
                  throw new IllegalStateException();
               }
            }

            throw new IOException();
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "pn.af(" + ')');
      }
   }

   int ac(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if (var3 >= 0) {
            if (var4 >= 481714111) {
               throw new IllegalStateException();
            }

            if (var2 >= 0) {
               if (var4 >= 481714111) {
                  throw new IllegalStateException();
               }

               if (var3 + var2 <= var1.length) {
                  synchronized(this) {
                     int var6;
                     if (160772207 * this.au <= this.ab * 1652063427) {
                        if (var4 >= 481714111) {
                           throw new IllegalStateException();
                        }

                        var6 = 1652063427 * this.ab - 160772207 * this.au;
                     } else {
                        var6 = this.ab * 1652063427 + (-1464241637 * this.aw - this.au * 160772207);
                     }

                     if (var3 > var6) {
                        if (var4 >= 481714111) {
                           throw new IllegalStateException();
                        }

                        var3 = var6;
                     }

                     if (var3 == 0) {
                        if (var4 >= 481714111) {
                           throw new IllegalStateException();
                        }

                        if (this.aq != null) {
                           if (var4 >= 481714111) {
                              throw new IllegalStateException();
                           }

                           throw new IOException(this.aq.toString());
                        }
                     }

                     if (this.au * 160772207 + var3 <= this.aw * -1464241637) {
                        if (var4 >= 481714111) {
                           throw new IllegalStateException();
                        }

                        System.arraycopy(this.ac, this.au * 160772207, var1, var2, var3);
                     } else {
                        int var7 = -1464241637 * this.aw - this.au * 160772207;
                        System.arraycopy(this.ac, 160772207 * this.au, var1, var2, var7);
                        System.arraycopy(this.ac, 0, var1, var7 + var2, var3 - var7);
                     }

                     this.au = 1198141071 * ((this.au * 160772207 + var3) % (-1464241637 * this.aw));
                     this.notifyAll();
                     return var3;
                  }
               }

               if (var4 >= 481714111) {
                  throw new IllegalStateException();
               }
            }
         }

         throw new IOException();
      } catch (RuntimeException var10) {
         throw db.an(var10, "pn.ac(" + ')');
      }
   }

   void as() {
      synchronized(this) {
         if (this.aq == null) {
            this.aq = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.af.join();
      } catch (InterruptedException var3) {
      }

   }

   public void gy() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (null != this.aq) {
                  return;
               }

               if (this.au * 160772207 == 0) {
                  var1 = -1464241637 * this.aw - this.ab * 1652063427 - 1;
               } else if (this.au * 160772207 <= this.ab * 1652063427) {
                  var1 = this.aw * -1464241637 - 1652063427 * this.ab;
               } else {
                  var1 = this.au * 160772207 - 1652063427 * this.ab - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
               }
            }
         }

         int var2;
         try {
            var2 = this.an.read(this.ac, 1652063427 * this.ab, var1);
            if (-1 == var2) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.aq = var3;
               return;
            }
         }

         synchronized(this) {
            this.ab = (this.ab * 1652063427 + var2) % (this.aw * -1464241637) * -954133525;
         }
      }
   }

   public void gd() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (null != this.aq) {
                  return;
               }

               if (this.au * 852690231 == 0) {
                  var1 = -1464241637 * this.aw - this.ab * 1652063427 - 1;
               } else if (this.au * -320422959 <= this.ab * 1652063427) {
                  var1 = this.aw * -1464241637 - -395288529 * this.ab;
               } else {
                  var1 = this.au * 160772207 - 1652063427 * this.ab - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
               }
            }
         }

         int var2;
         try {
            var2 = this.an.read(this.ac, 1652063427 * this.ab, var1);
            if (-1 == var2) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.aq = var3;
               return;
            }
         }

         synchronized(this) {
            this.ab = (this.ab * 1652063427 + var2) % (this.aw * -1464241637) * -1546384791;
         }
      }
   }

   boolean ab(int var1) throws IOException {
      if (0 == var1) {
         return true;
      } else if (var1 > 0 && var1 < -1464241637 * this.aw) {
         synchronized(this) {
            int var3;
            if (this.au * 160772207 <= this.ab * 1652063427) {
               var3 = 1652063427 * this.ab - this.au * 160772207;
            } else {
               var3 = this.aw * -1464241637 - 160772207 * this.au + this.ab * 1652063427;
            }

            if (var3 < var1) {
               if (this.aq != null) {
                  throw new IOException(this.aq.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   boolean aq(int var1) throws IOException {
      if (0 == var1) {
         return true;
      } else if (var1 > 0 && var1 < -1467351357 * this.aw) {
         synchronized(this) {
            int var3;
            if (this.au * 1474079879 <= this.ab * 1652063427) {
               var3 = 1652063427 * this.ab - this.au * 390986745;
            } else {
               var3 = this.aw * -935759386 - 506280892 * this.au + this.ab * 1201965538;
            }

            if (var3 < var1) {
               if (this.aq != null) {
                  throw new IOException(this.aq.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   boolean al(int var1) throws IOException {
      if (0 == var1) {
         return true;
      } else if (var1 > 0 && var1 < -1464241637 * this.aw) {
         synchronized(this) {
            int var3;
            if (this.au * -326964618 <= this.ab * -394145861) {
               var3 = 746510081 * this.ab - this.au * 224982616;
            } else {
               var3 = this.aw * 809123410 - 1672311014 * this.au + this.ab * 1652063427;
            }

            if (var3 < var1) {
               if (this.aq != null) {
                  throw new IOException(this.aq.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   boolean at(int var1) throws IOException {
      if (0 == var1) {
         return true;
      } else if (var1 > 0 && var1 < 1292638279 * this.aw) {
         synchronized(this) {
            int var3;
            if (this.au * 1366502714 <= this.ab * -1221835415) {
               var3 = 1652063427 * this.ab - this.au * 160772207;
            } else {
               var3 = this.aw * -1464241637 - -1123052787 * this.au + this.ab * 1652063427;
            }

            if (var3 < var1) {
               if (this.aq != null) {
                  throw new IOException(this.aq.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int aa() throws IOException {
      synchronized(this) {
         int var2;
         if (this.au * 160772207 <= -1411641710 * this.ab) {
            var2 = this.ab * 1652063427 - this.au * 160772207;
         } else {
            var2 = this.aw * -1464241637 - 160772207 * this.au + 1652063427 * this.ab;
         }

         if (var2 <= 0 && null != this.aq) {
            throw new IOException(this.aq.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   int ay() throws IOException {
      synchronized(this) {
         int var2;
         if (this.au * 160772207 <= 162252123 * this.ab) {
            var2 = this.ab * 1652063427 - this.au * 615012750;
         } else {
            var2 = this.aw * 531107769 - -2068781762 * this.au + 1652063427 * this.ab;
         }

         if (var2 <= 0 && null != this.aq) {
            throw new IOException(this.aq.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   int ao() throws IOException {
      synchronized(this) {
         int var2;
         if (this.au * 160772207 <= 1652063427 * this.ab) {
            var2 = this.ab * 1652063427 - this.au * 160772207;
         } else {
            var2 = this.aw * -1464241637 - 160772207 * this.au + 1652063427 * this.ab;
         }

         if (var2 <= 0 && null != this.aq) {
            throw new IOException(this.aq.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   int ax() throws IOException {
      synchronized(this) {
         if (this.ab * -749209829 == 160772207 * this.au) {
            if (null != this.aq) {
               throw new IOException(this.aq.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.ac[this.au * 160772207] & 255;
            this.au = (this.au * 160772207 + 1) % (-1464241637 * this.aw) * 1198141071;
            this.notifyAll();
            return var2;
         }
      }
   }

   void au(int var1) {
      try {
         synchronized(this) {
            if (this.aq == null) {
               if (var1 != -1118938495) {
                  throw new IllegalStateException();
               }

               this.aq = new IOException("");
            }

            this.notifyAll();
         }

         try {
            this.af.join();
         } catch (InterruptedException var4) {
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "pn.au(" + ')');
      }
   }

   int ai() throws IOException {
      synchronized(this) {
         if (this.ab * 1652063427 == 160772207 * this.au) {
            if (null != this.aq) {
               throw new IOException(this.aq.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.ac[this.au * 160772207] & 255;
            this.au = (this.au * 160772207 + 1) % (-1464241637 * this.aw) * 1198141071;
            this.notifyAll();
            return var2;
         }
      }
   }

   int ah() throws IOException {
      synchronized(this) {
         if (this.ab * 1652063427 == 160772207 * this.au) {
            if (null != this.aq) {
               throw new IOException(this.aq.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.ac[this.au * 160772207] & 255;
            this.au = (this.au * 160772207 + 1) % (-1464241637 * this.aw) * 1198141071;
            this.notifyAll();
            return var2;
         }
      }
   }

   void ar() {
      synchronized(this) {
         if (this.aq == null) {
            this.aq = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.af.join();
      } catch (InterruptedException var3) {
      }

   }

   public void run() {
      try {
         while(true) {
            int var1;
            synchronized(this) {
               while(true) {
                  if (null != this.aq) {
                     return;
                  }

                  if (this.au * 160772207 == 0) {
                     var1 = -1464241637 * this.aw - this.ab * 1652063427 - 1;
                  } else if (this.au * 160772207 <= this.ab * 1652063427) {
                     var1 = this.aw * -1464241637 - 1652063427 * this.ab;
                  } else {
                     var1 = this.au * 160772207 - 1652063427 * this.ab - 1;
                  }

                  if (var1 > 0) {
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var9) {
                  }
               }
            }

            int var2;
            try {
               var2 = this.an.read(this.ac, 1652063427 * this.ab, var1);
               if (-1 == var2) {
                  throw new EOFException();
               }
            } catch (IOException var10) {
               IOException var3 = var10;
               synchronized(this) {
                  this.aq = var3;
                  return;
               }
            }

            synchronized(this) {
               this.ab = (this.ab * 1652063427 + var2) % (this.aw * -1464241637) * -954133525;
            }
         }
      } catch (RuntimeException var12) {
         throw db.an(var12, "pn.run(" + ')');
      }
   }

   void am() {
      synchronized(this) {
         if (this.aq == null) {
            this.aq = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.af.join();
      } catch (InterruptedException var3) {
      }

   }

   int av(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var5;
            if (160772207 * this.au <= this.ab * 1652063427) {
               var5 = 1652063427 * this.ab - 160772207 * this.au;
            } else {
               var5 = this.ab * 1652063427 + (-1464241637 * this.aw - this.au * 160772207);
            }

            if (var3 > var5) {
               var3 = var5;
            }

            if (var3 == 0 && this.aq != null) {
               throw new IOException(this.aq.toString());
            } else {
               if (this.au * 160772207 + var3 <= this.aw * -1464241637) {
                  System.arraycopy(this.ac, this.au * 160772207, var1, var2, var3);
               } else {
                  int var6 = -1464241637 * this.aw - this.au * 160772207;
                  System.arraycopy(this.ac, 160772207 * this.au, var1, var2, var6);
                  System.arraycopy(this.ac, 0, var1, var6 + var2, var3 - var6);
               }

               this.au = 1198141071 * ((this.au * 160772207 + var3) % (-1464241637 * this.aw));
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   void aj() {
      synchronized(this) {
         if (this.aq == null) {
            this.aq = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.af.join();
      } catch (InterruptedException var3) {
      }

   }

   int ag() throws IOException {
      synchronized(this) {
         if (this.ab * 1652063427 == -1782687682 * this.au) {
            if (null != this.aq) {
               throw new IOException(this.aq.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.ac[this.au * 160772207] & 255;
            this.au = (this.au * 160772207 + 1) % (-895113866 * this.aw) * 1198141071;
            this.notifyAll();
            return var2;
         }
      }
   }
}
