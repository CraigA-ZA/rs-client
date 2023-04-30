import accessors.RSBufferedSink;
import java.io.IOException;
import java.io.OutputStream;

public class qe implements Runnable, RSBufferedSink {
   OutputStream an;
   IOException aq;
   int aw;
   byte[] ac;
   static final int ar = 202;
   int ab;
   Thread af;
   boolean al;
   int au;

   boolean ac() {
      if (this.al) {
         try {
            this.an.close();
            if (this.aq == null) {
               this.aq = new IOException("");
            }
         } catch (IOException var2) {
            if (this.aq == null) {
               this.aq = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   boolean af(byte var1) {
      try {
         if (!this.al) {
            return false;
         } else if (var1 <= 2) {
            throw new IllegalStateException();
         } else {
            try {
               this.an.close();
               if (this.aq == null) {
                  if (var1 <= 2) {
                     throw new IllegalStateException();
                  }

                  this.aq = new IOException("");
               }
            } catch (IOException var3) {
               if (this.aq == null) {
                  if (var1 <= 2) {
                     throw new IllegalStateException();
                  }

                  this.aq = new IOException(var3);
               }
            }

            return true;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "qe.af(" + ')');
      }
   }

   public void run() {
      try {
         do {
            int var1;
            synchronized(this) {
               while(true) {
                  if (null != this.aq) {
                     return;
                  }

                  if (this.au * -836587695 <= this.ab * -989370023) {
                     var1 = -989370023 * this.ab - this.au * -836587695;
                  } else {
                     var1 = this.ab * -989370023 + (this.aw * 1534274201 - -836587695 * this.au);
                  }

                  if (var1 > 0) {
                     break;
                  }

                  try {
                     this.an.flush();
                  } catch (IOException var10) {
                     this.aq = var10;
                     return;
                  }

                  if (this.af((byte)95)) {
                     return;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var11) {
                  }
               }
            }

            try {
               if (-836587695 * this.au + var1 <= this.aw * 1534274201) {
                  this.an.write(this.ac, -836587695 * this.au, var1);
               } else {
                  int var14 = 1534274201 * this.aw - this.au * -836587695;
                  this.an.write(this.ac, this.au * -836587695, var14);
                  this.an.write(this.ac, 0, var1 - var14);
               }
            } catch (IOException var9) {
               IOException var2 = var9;
               synchronized(this) {
                  this.aq = var2;
                  return;
               }
            }

            synchronized(this) {
               this.au = (this.au * -836587695 + var1) % (1534274201 * this.aw) * -1949304399;
            }
         } while(!this.af((byte)44));

      } catch (RuntimeException var13) {
         throw db.an(var13, "qe.run(" + ')');
      }
   }

   qe(OutputStream var1, int var2) {
      try {
         super();
         this.au = 0;
         this.ab = 0;
         this.an = var1;
         this.aw = -1984591447 * (1 + var2);
         this.ac = new byte[this.aw * 1534274201];
         this.af = new Thread(this);
         this.af.setDaemon(true);
         this.af.start();
      } catch (RuntimeException var3) {
         throw db.an(var3, "qe.<init>(" + ')');
      }
   }

   void aw(int var1) {
      try {
         synchronized(this) {
            this.al = true;
            this.notifyAll();
         }

         try {
            this.af.join();
         } catch (InterruptedException var4) {
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "qe.aw(" + ')');
      }
   }

   void aa() {
      synchronized(this) {
         this.al = true;
         this.notifyAll();
      }

      try {
         this.af.join();
      } catch (InterruptedException var3) {
      }

   }

   public void gd() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if (null != this.aq) {
                  return;
               }

               if (this.au * -836587695 <= this.ab * -989370023) {
                  var1 = -989370023 * this.ab - this.au * -836587695;
               } else {
                  var1 = this.ab * -989370023 + (this.aw * 1534274201 - -836587695 * this.au);
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.an.flush();
               } catch (IOException var10) {
                  this.aq = var10;
                  return;
               }

               if (this.af((byte)73)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }
         }

         try {
            if (-836587695 * this.au + var1 <= this.aw * 1534274201) {
               this.an.write(this.ac, -836587695 * this.au, var1);
            } else {
               int var13 = 1534274201 * this.aw - this.au * -836587695;
               this.an.write(this.ac, this.au * -836587695, var13);
               this.an.write(this.ac, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized(this) {
               this.aq = var2;
               return;
            }
         }

         synchronized(this) {
            this.au = (this.au * -836587695 + var1) % (1534274201 * this.aw) * -1949304399;
         }
      } while(!this.af((byte)45));

   }

   public void gy() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if (null != this.aq) {
                  return;
               }

               if (this.au * -836587695 <= this.ab * -989370023) {
                  var1 = -989370023 * this.ab - this.au * -836587695;
               } else {
                  var1 = this.ab * -989370023 + (this.aw * 1534274201 - -836587695 * this.au);
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.an.flush();
               } catch (IOException var10) {
                  this.aq = var10;
                  return;
               }

               if (this.af((byte)75)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }
         }

         try {
            if (-836587695 * this.au + var1 <= this.aw * 1534274201) {
               this.an.write(this.ac, -836587695 * this.au, var1);
            } else {
               int var13 = 1534274201 * this.aw - this.au * -836587695;
               this.an.write(this.ac, this.au * -836587695, var13);
               this.an.write(this.ac, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized(this) {
               this.aq = var2;
               return;
            }
         }

         synchronized(this) {
            this.au = (this.au * -836587695 + var1) % (1534274201 * this.aw) * -1949304399;
         }
      } while(!this.af((byte)95));

   }

   boolean au() {
      if (this.al) {
         try {
            this.an.close();
            if (this.aq == null) {
               this.aq = new IOException("");
            }
         } catch (IOException var2) {
            if (this.aq == null) {
               this.aq = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   void at(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if (null != this.aq) {
               throw new IOException(this.aq.toString());
            } else {
               int var5;
               if (-836587695 * this.au <= -989370023 * this.ab) {
                  var5 = -836587695 * this.au + (1534274201 * this.aw - this.ab * -989370023) - 1;
               } else {
                  var5 = this.au * -836587695 - this.ab * -989370023 - 1;
               }

               if (var5 < var3) {
                  throw new IOException("");
               } else {
                  if (this.ab * -989370023 + var3 <= this.aw * 1534274201) {
                     System.arraycopy(var1, var2, this.ac, this.ab * -989370023, var3);
                  } else {
                     int var6 = 1534274201 * this.aw - this.ab * -989370023;
                     System.arraycopy(var1, var2, this.ac, -989370023 * this.ab, var6);
                     System.arraycopy(var1, var6 + var2, this.ac, 0, var3 - var6);
                  }

                  this.ab = -832024855 * ((-989370023 * this.ab + var3) % (this.aw * 1534274201));
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void aq(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if (null != this.aq) {
               throw new IOException(this.aq.toString());
            } else {
               int var5;
               if (-836587695 * this.au <= -989370023 * this.ab) {
                  var5 = -836587695 * this.au + (1534274201 * this.aw - this.ab * -989370023) - 1;
               } else {
                  var5 = this.au * -836587695 - this.ab * -989370023 - 1;
               }

               if (var5 < var3) {
                  throw new IOException("");
               } else {
                  if (this.ab * -989370023 + var3 <= this.aw * 1534274201) {
                     System.arraycopy(var1, var2, this.ac, this.ab * -989370023, var3);
                  } else {
                     int var6 = 1534274201 * this.aw - this.ab * -989370023;
                     System.arraycopy(var1, var2, this.ac, -989370023 * this.ab, var6);
                     System.arraycopy(var1, var6 + var2, this.ac, 0, var3 - var6);
                  }

                  this.ab = -832024855 * ((-989370023 * this.ab + var3) % (this.aw * 1534274201));
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void al(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if (null != this.aq) {
               throw new IOException(this.aq.toString());
            } else {
               int var5;
               if (-836587695 * this.au <= -989370023 * this.ab) {
                  var5 = -836587695 * this.au + (1534274201 * this.aw - this.ab * -989370023) - 1;
               } else {
                  var5 = this.au * -836587695 - this.ab * -989370023 - 1;
               }

               if (var5 < var3) {
                  throw new IOException("");
               } else {
                  if (this.ab * -989370023 + var3 <= this.aw * 1534274201) {
                     System.arraycopy(var1, var2, this.ac, this.ab * -989370023, var3);
                  } else {
                     int var6 = 1534274201 * this.aw - this.ab * -989370023;
                     System.arraycopy(var1, var2, this.ac, -989370023 * this.ab, var6);
                     System.arraycopy(var1, var6 + var2, this.ac, 0, var3 - var6);
                  }

                  this.ab = -832024855 * ((-989370023 * this.ab + var3) % (this.aw * 1534274201));
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void an(byte[] var1, int var2, int var3, byte var4) throws IOException {
      try {
         if (var3 >= 0) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            }

            if (var2 >= 0) {
               if (var4 >= 0) {
                  throw new IllegalStateException();
               }

               if (var3 + var2 <= var1.length) {
                  synchronized(this) {
                     if (null != this.aq) {
                        if (var4 >= 0) {
                           return;
                        }

                        throw new IOException(this.aq.toString());
                     }

                     int var6;
                     if (-836587695 * this.au <= -989370023 * this.ab) {
                        if (var4 >= 0) {
                           throw new IllegalStateException();
                        }

                        var6 = -836587695 * this.au + (1534274201 * this.aw - this.ab * -989370023) - 1;
                     } else {
                        var6 = this.au * -836587695 - this.ab * -989370023 - 1;
                     }

                     if (var6 < var3) {
                        if (var4 >= 0) {
                           throw new IllegalStateException();
                        }

                        throw new IOException("");
                     }

                     if (this.ab * -989370023 + var3 <= this.aw * 1534274201) {
                        if (var4 >= 0) {
                           throw new IllegalStateException();
                        }

                        System.arraycopy(var1, var2, this.ac, this.ab * -989370023, var3);
                     } else {
                        int var7 = 1534274201 * this.aw - this.ab * -989370023;
                        System.arraycopy(var1, var2, this.ac, -989370023 * this.ab, var7);
                        System.arraycopy(var1, var7 + var2, this.ac, 0, var3 - var7);
                     }

                     this.ab = -832024855 * ((-989370023 * this.ab + var3) % (this.aw * 1534274201));
                     this.notifyAll();
                     return;
                  }
               }

               if (var4 >= 0) {
                  return;
               }
            }
         }

         throw new IOException();
      } catch (RuntimeException var10) {
         throw db.an(var10, "qe.an(" + ')');
      }
   }

   boolean ab() {
      if (this.al) {
         try {
            this.an.close();
            if (this.aq == null) {
               this.aq = new IOException("");
            }
         } catch (IOException var2) {
            if (this.aq == null) {
               this.aq = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static int an(int var0, byte var1) {
      try {
         return var0 >>> 4 & -858518957 * sc.ac;
      } catch (RuntimeException var2) {
         throw db.an(var2, "qe.an(" + ')');
      }
   }
}
