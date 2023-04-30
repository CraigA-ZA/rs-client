import accessors.RSUrlRequester;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public abstract class et implements Runnable, RSUrlRequester {
   static tq tk;
   volatile boolean an;
   Queue aw;
   int ac;
   final Thread af;
   static final int ca = 73;

   int aa(URLConnection var1) {
      int var2 = ez.aw * -1513206085;
      if (var1 != null) {
         try {
            if (var1 instanceof HttpURLConnection) {
               var2 = ((HttpURLConnection)var1).getResponseCode();
            }
         } catch (IOException var4) {
         }
      }

      return var2;
   }

   public void run() {
      try {
         while(!this.an) {
            try {
               ez var1;
               synchronized(this) {
                  var1 = (ez)this.aw.poll();
                  if (var1 == null) {
                     try {
                        this.wait();
                     } catch (InterruptedException var5) {
                     }
                     continue;
                  }
               }

               this.af(var1, (byte)16);
            } catch (Exception var7) {
               ob.af((String)null, var7, (byte)8);
            }
         }

      } catch (RuntimeException var8) {
         throw db.an(var8, "et.run(" + ')');
      }
   }

   abstract void af(ez var1, byte var2) throws IOException;

   int an(URLConnection var1, int var2) {
      try {
         int var3 = ez.aw * -1513206085;
         if (var1 != null) {
            if (var2 == 1278038295) {
               throw new IllegalStateException();
            }

            try {
               if (var1 instanceof HttpURLConnection) {
                  var3 = ((HttpURLConnection)var1).getResponseCode();
               }
            } catch (IOException var5) {
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw db.an(var6, "et.an(" + ')');
      }
   }

   void av(URLConnection var1, ez var2) {
      DataInputStream var3 = null;
      boolean var13 = false;

      label89: {
         label88: {
            try {
               var13 = true;
               int var5 = var1.getContentLength();
               var3 = new DataInputStream(var1.getInputStream());
               byte[] var4;
               if (var5 >= 0) {
                  var4 = new byte[var5];
                  var3.readFully(var4);
               } else {
                  var4 = new byte[0];
                  byte[] var6 = jz.ac(5000, -673043390);

                  byte[] var8;
                  for(int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) {
                     var8 = new byte[var7 + var4.length];
                     System.arraycopy(var4, 0, var8, 0, var4.length);
                     System.arraycopy(var6, 0, var8, var4.length, var7);
                  }

                  di.au(var6, (byte)66);
               }

               var2.au = var4;
               var13 = false;
               break label88;
            } catch (IOException var15) {
               var2.au = null;
               var13 = false;
            } finally {
               if (var13) {
                  var2.ac = this.an(var1, -1827081915) * -1103804946;
               }
            }

            var2.ac = this.an(var1, 1796275765) * -1964979829;
            break label89;
         }

         var2.ac = this.an(var1, 897457677) * -1964979829;
      }

      if (var3 != null) {
         try {
            var3.close();
         } catch (IOException var14) {
         }
      }

   }

   int ao(URLConnection var1) {
      int var2 = ez.aw * -1513206085;
      if (var1 != null) {
         try {
            if (var1 instanceof HttpURLConnection) {
               var2 = ((HttpURLConnection)var1).getResponseCode();
            }
         } catch (IOException var4) {
         }
      }

      return var2;
   }

   void ai(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(107966670);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + 1778804956 * this.ac);
   }

   public void ab(int var1) {
      try {
         this.an = true;

         try {
            synchronized(this) {
               this.notify();
            }

            this.af.join();
         } catch (InterruptedException var5) {
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "et.ab(" + ')');
      }
   }

   public void gy() {
      while(!this.an) {
         try {
            ez var1;
            synchronized(this) {
               var1 = (ez)this.aw.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.af(var1, (byte)16);
         } catch (Exception var7) {
            ob.af((String)null, var7, (byte)8);
         }
      }

   }

   public void gd() {
      while(!this.an) {
         try {
            ez var1;
            synchronized(this) {
               var1 = (ez)this.aw.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.af(var1, (byte)16);
         } catch (Exception var7) {
            ob.af((String)null, var7, (byte)8);
         }
      }

   }

   public ez au(URL var1, int var2) {
      try {
         ez var3 = new ez(var1);
         synchronized(this) {
            this.aw.add(var3);
            this.notify();
            return var3;
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "et.au(" + ')');
      }
   }

   abstract void al(ez var1) throws IOException;

   abstract void at(ez var1) throws IOException;

   void ax(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + 1429112917 * this.ac);
   }

   int ay(URLConnection var1) {
      int var2 = ez.aw * -1513206085;
      if (var1 != null) {
         try {
            if (var1 instanceof HttpURLConnection) {
               var2 = ((HttpURLConnection)var1).getResponseCode();
            }
         } catch (IOException var4) {
         }
      }

      return var2;
   }

   abstract void aq(ez var1) throws IOException;

   public ez as(URL var1) {
      ez var2 = new ez(var1);
      synchronized(this) {
         this.aw.add(var2);
         this.notify();
         return var2;
      }
   }

   void ah(URLConnection var1, ez var2) {
      DataInputStream var3 = null;
      boolean var13 = false;

      label89: {
         label88: {
            try {
               var13 = true;
               int var5 = var1.getContentLength();
               var3 = new DataInputStream(var1.getInputStream());
               byte[] var4;
               if (var5 >= 0) {
                  var4 = new byte[var5];
                  var3.readFully(var4);
               } else {
                  var4 = new byte[0];
                  byte[] var6 = jz.ac(5000, -1224377535);

                  byte[] var8;
                  for(int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) {
                     var8 = new byte[var7 + var4.length];
                     System.arraycopy(var4, 0, var8, 0, var4.length);
                     System.arraycopy(var6, 0, var8, var4.length, var7);
                  }

                  di.au(var6, (byte)89);
               }

               var2.au = var4;
               var13 = false;
               break label88;
            } catch (IOException var15) {
               var2.au = null;
               var13 = false;
            } finally {
               if (var13) {
                  var2.ac = this.an(var1, 804375351) * -1964979829;
               }
            }

            var2.ac = this.an(var1, -1866310861) * -1964979829;
            break label89;
         }

         var2.ac = this.an(var1, -1126911937) * -1425331906;
      }

      if (var3 != null) {
         try {
            var3.close();
         } catch (IOException var14) {
         }
      }

   }

   void ag(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + 1429112917 * this.ac);
   }

   et(int var1) {
      try {
         super();
         this.aw = new LinkedList();
         this.af = new Thread(this);
         this.af.setPriority(1);
         this.af.start();
         this.ac = -502647555 * var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "et.<init>(" + ')');
      }
   }

   void aw(URLConnection var1, int var2) {
      try {
         var1.setConnectTimeout(5000);
         var1.setReadTimeout(5000);
         var1.setUseCaches(false);
         var1.setRequestProperty("Connection", "close");
         var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + 1429112917 * this.ac);
      } catch (RuntimeException var3) {
         throw db.an(var3, "et.aw(" + ')');
      }
   }

   void ar(URLConnection var1, ez var2) {
      DataInputStream var3 = null;
      boolean var13 = false;

      label89: {
         label88: {
            try {
               var13 = true;
               int var5 = var1.getContentLength();
               var3 = new DataInputStream(var1.getInputStream());
               byte[] var4;
               if (var5 >= 0) {
                  var4 = new byte[var5];
                  var3.readFully(var4);
               } else {
                  var4 = new byte[0];
                  byte[] var6 = jz.ac(5000, -2033640276);

                  byte[] var8;
                  for(int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) {
                     var8 = new byte[var7 + var4.length];
                     System.arraycopy(var4, 0, var8, 0, var4.length);
                     System.arraycopy(var6, 0, var8, var4.length, var7);
                  }

                  di.au(var6, (byte)69);
               }

               var2.au = var4;
               var13 = false;
               break label88;
            } catch (IOException var15) {
               var2.au = null;
               var13 = false;
            } finally {
               if (var13) {
                  var2.ac = this.an(var1, -1600304682) * -1964979829;
               }
            }

            var2.ac = this.an(var1, -2135862454) * -1964979829;
            break label89;
         }

         var2.ac = this.an(var1, -2016449496) * -1964979829;
      }

      if (var3 != null) {
         try {
            var3.close();
         } catch (IOException var14) {
         }
      }

   }

   public ez am(URL var1) {
      ez var2 = new ez(var1);
      synchronized(this) {
         this.aw.add(var2);
         this.notify();
         return var2;
      }
   }

   void ac(URLConnection var1, ez var2, byte var3) {
      try {
         DataInputStream var4 = null;
         boolean var15 = false;

         label118: {
            label117: {
               try {
                  var15 = true;
                  int var6 = var1.getContentLength();
                  var4 = new DataInputStream(var1.getInputStream());
                  byte[] var5;
                  if (var6 >= 0) {
                     if (var3 != 1) {
                        return;
                     }

                     var5 = new byte[var6];
                     var4.readFully(var5);
                  } else {
                     var5 = new byte[0];
                     byte[] var7 = jz.ac(5000, -115934714);

                     byte[] var9;
                     for(int var8 = var4.read(var7, 0, var7.length); var8 > -1; var5 = var9) {
                        if (var3 != 1) {
                           throw new IllegalStateException();
                        }

                        var9 = new byte[var8 + var5.length];
                        System.arraycopy(var5, 0, var9, 0, var5.length);
                        System.arraycopy(var7, 0, var9, var5.length, var8);
                     }

                     di.au(var7, (byte)7);
                  }

                  var2.au = var5;
                  var15 = false;
                  break label117;
               } catch (IOException var17) {
                  var2.au = null;
                  var15 = false;
               } finally {
                  if (var15) {
                     var2.ac = this.an(var1, -996917348) * -1964979829;
                  }
               }

               var2.ac = this.an(var1, -903419789) * -1964979829;
               break label118;
            }

            var2.ac = this.an(var1, -730727375) * -1964979829;
         }

         if (var4 != null) {
            if (var3 != 1) {
               return;
            }

            try {
               var4.close();
            } catch (IOException var16) {
            }
         }

      } catch (RuntimeException var19) {
         throw db.an(var19, "et.ac(" + ')');
      }
   }

   public ez aj(URL var1) {
      ez var2 = new ez(var1);
      synchronized(this) {
         this.aw.add(var2);
         this.notify();
         return var2;
      }
   }

   public ez ak(URL var1) {
      ez var2 = new ez(var1);
      synchronized(this) {
         this.aw.add(var2);
         this.notify();
         return var2;
      }
   }

   public void az() {
      this.an = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.af.join();
      } catch (InterruptedException var4) {
      }

   }

   static void au(float[] var0, int var1) {
      try {
         if (em.ac + var0[0] < 1.3333334F) {
            if (var1 != -166868527) {
               throw new IllegalStateException();
            }

            float var2 = var0[0] - 2.0F;
            float var3 = var0[0] - 1.0F;
            float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * var3 * 4.0F));
            float var5 = 0.5F * (-var2 + var4);
            if (em.ac + var0[1] > var5) {
               if (var1 != -166868527) {
                  throw new IllegalStateException();
               }

               var0[1] = var5 - em.ac;
            } else {
               var5 = 0.5F * (-var2 - var4);
               if (var0[1] < em.ac + var5) {
                  if (var1 != -166868527) {
                     throw new IllegalStateException();
                  }

                  var0[1] = var5 + em.ac;
               }
            }
         } else {
            var0[0] = 1.3333334F - em.ac;
            var0[1] = 0.33333334F - em.ac;
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "et.au(" + ')');
      }
   }

   static boolean aw(CharSequence var0, int var1, boolean var2, byte var3) {
      try {
         if (var1 >= 2) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            if (var1 <= 36) {
               boolean var4 = false;
               boolean var5 = false;
               int var6 = 0;
               int var7 = var0.length();
               int var8 = 0;

               while(true) {
                  if (var8 >= var7) {
                     return var5;
                  }

                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  label144: {
                     int var9 = var0.charAt(var8);
                     if (0 == var8) {
                        if (var3 <= 1) {
                           throw new IllegalStateException();
                        }

                        if (45 == var9) {
                           if (var3 <= 1) {
                              throw new IllegalStateException();
                           }

                           var4 = true;
                           break label144;
                        }

                        if (var9 == 43) {
                           if (var3 <= 1) {
                              throw new IllegalStateException();
                           }

                           if (var2) {
                              if (var3 <= 1) {
                                 throw new IllegalStateException();
                              }
                              break label144;
                           }
                        }
                     }

                     label146: {
                        if (var9 >= 48) {
                           if (var3 <= 1) {
                              throw new IllegalStateException();
                           }

                           if (var9 <= 57) {
                              if (var3 <= 1) {
                                 throw new IllegalStateException();
                              }

                              var9 -= 48;
                              break label146;
                           }
                        }

                        if (var9 >= 65) {
                           if (var3 <= 1) {
                              throw new IllegalStateException();
                           }

                           if (var9 <= 90) {
                              if (var3 <= 1) {
                                 throw new IllegalStateException();
                              }

                              var9 -= 55;
                              break label146;
                           }
                        }

                        if (var9 < 97) {
                           break;
                        }

                        if (var3 <= 1) {
                           throw new IllegalStateException();
                        }

                        if (var9 > 122) {
                           break;
                        }

                        if (var3 <= 1) {
                           throw new IllegalStateException();
                        }

                        var9 -= 87;
                     }

                     if (var9 >= var1) {
                        if (var3 <= 1) {
                           throw new IllegalStateException();
                        }

                        return false;
                     }

                     if (var4) {
                        if (var3 <= 1) {
                           throw new IllegalStateException();
                        }

                        var9 = -var9;
                     }

                     int var10 = var1 * var6 + var9;
                     if (var10 / var1 != var6) {
                        if (var3 <= 1) {
                           throw new IllegalStateException();
                        }

                        return false;
                     }

                     var6 = var10;
                     var5 = true;
                  }

                  ++var8;
               }

               return false;
            }

            if (var3 <= 1) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException("" + var1);
      } catch (RuntimeException var11) {
         throw db.an(var11, "et.aw(" + ')');
      }
   }
}
