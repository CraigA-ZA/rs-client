import accessors.RSBufferedFile;
import java.io.EOFException;
import java.io.IOException;

public class sj implements RSBufferedFile {
   int au;
   byte[] aw;
   sy an;
   long aq;
   byte[] ab;
   int al;
   long ac;
   long at;
   long aa;
   long ay;
   long ao;

   void ak() throws IOException {
      this.au = 0;
      if (this.at * 8429326271465132299L != 31144933894015367L * this.ao) {
         this.an.af(8429326271465132299L * this.at);
         this.ao = -140630493748753059L * this.at;
      }

      int var2;
      for(this.ac = 2440797830623285237L * this.at; this.au * -1691135521 < this.aw.length; this.au += var2 * -84563425) {
         int var1 = this.aw.length - -1691135521 * this.au;
         if (var1 > 200000000) {
            var1 = 200000000;
         }

         var2 = this.an.ab(this.aw, -1691135521 * this.au, var1, 945781013);
         if (var2 == -1) {
            break;
         }

         this.ao += (long)var2 * -9042087461339190217L;
      }

   }

   public void af(int var1) throws IOException {
      try {
         this.al(789688414);
         this.an.aw((byte)-64);
      } catch (RuntimeException var2) {
         throw db.an(var2, "sj.af(" + ')');
      }
   }

   public void an(long var1) throws IOException {
      try {
         if (var1 < 0L) {
            throw new IOException("");
         } else {
            this.at = var1 * -6181027881899576669L;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "sj.an(" + ')');
      }
   }

   public void ae(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (8429326271465132299L * this.at + (long)var3 > this.ay * -1243507284389482911L) {
            this.ay = -8298185492872661599L * ((long)var3 + this.at * 8429326271465132299L);
         }

         if (this.aq * -8462239109085136939L != -1L && (8429326271465132299L * this.at < this.aq * -8462239109085136939L || 8429326271465132299L * this.at > this.aq * -8462239109085136939L + (long)(-654786411 * this.al))) {
            this.al(1217522500);
         }

         if (-8462239109085136939L * this.aq != -1L && (long)var3 + 8429326271465132299L * this.at > -8462239109085136939L * this.aq + (long)this.ab.length) {
            int var4 = (int)((long)this.ab.length - (8429326271465132299L * this.at - this.aq * -8462239109085136939L));
            System.arraycopy(var1, var2, this.ab, (int)(this.at * 8429326271465132299L - this.aq * -8462239109085136939L), var4);
            this.at += (long)var4 * -6181027881899576669L;
            var2 += var4;
            var3 -= var4;
            this.al = -1669068099 * this.ab.length;
            this.al(723226691);
         }

         if (var3 <= this.ab.length) {
            if (var3 > 0) {
               if (-1L == this.aq * -8462239109085136939L) {
                  this.aq = 2422695430762542431L * this.at;
               }

               System.arraycopy(var1, var2, this.ab, (int)(8429326271465132299L * this.at - -8462239109085136939L * this.aq), var3);
               this.at += (long)var3 * -6181027881899576669L;
               if (this.at * 8429326271465132299L - this.aq * -8462239109085136939L > (long)(this.al * -654786411)) {
                  this.al = (int)(this.at * 8429326271465132299L - -8462239109085136939L * this.aq) * -1669068099;
               }

            }
         } else {
            if (31144933894015367L * this.ao != 8429326271465132299L * this.at) {
               this.an.af(8429326271465132299L * this.at);
               this.ao = -140630493748753059L * this.at;
            }

            this.an.an(var1, var2, var3, 185047612);
            this.ao += (long)var3 * -9042087461339190217L;
            if (this.ao * 31144933894015367L > 3127984517526915633L * this.aa) {
               this.aa = this.ao * 5080559548865145143L;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (8429326271465132299L * this.at >= this.ac * 8734338143670189311L && 8429326271465132299L * this.at < (long)(this.au * -1691135521) + this.ac * 8734338143670189311L) {
               var10 = this.at * 8429326271465132299L;
            } else if (8734338143670189311L * this.ac >= this.at * 8429326271465132299L && 8734338143670189311L * this.ac < (long)var3 + 8429326271465132299L * this.at) {
               var10 = this.ac * 8734338143670189311L;
            }

            if (this.at * 8429326271465132299L + (long)var3 > 8734338143670189311L * this.ac && (long)var3 + 8429326271465132299L * this.at <= (long)(-1691135521 * this.au) + this.ac * 8734338143670189311L) {
               var6 = this.at * 8429326271465132299L + (long)var3;
            } else if ((long)(-1691135521 * this.au) + this.ac * 8734338143670189311L > 8429326271465132299L * this.at && this.ac * 8734338143670189311L + (long)(this.au * -1691135521) <= 8429326271465132299L * this.at + (long)var3) {
               var6 = this.ac * 8734338143670189311L + (long)(this.au * -1691135521);
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(var1, (int)((long)var2 + var10 - 8429326271465132299L * this.at), this.aw, (int)(var10 - 8734338143670189311L * this.ac), var8);
            }

            this.at += (long)var3 * -6181027881899576669L;
         }
      } catch (IOException var9) {
         this.ao = 9042087461339190217L;
         throw var9;
      }
   }

   void al(int var1) throws IOException {
      try {
         if (-8462239109085136939L * this.aq != -1L) {
            if (this.ao * 31144933894015367L != this.aq * -8462239109085136939L) {
               if (var1 <= -1254834640) {
                  return;
               }

               this.an.af(this.aq * -8462239109085136939L);
               this.ao = 7312697603599620803L * this.aq;
            }

            this.an.an(this.ab, 0, this.al * -654786411, 185047612);
            this.ao += -9056128312498455549L * (long)this.al;
            if (this.ao * 31144933894015367L > 3127984517526915633L * this.aa) {
               if (var1 <= -1254834640) {
                  throw new IllegalStateException();
               }

               this.aa = this.ao * 5080559548865145143L;
            }

            long var2;
            long var4;
            label100: {
               var2 = -1L;
               var4 = -1L;
               if (this.aq * -8462239109085136939L >= this.ac * 8734338143670189311L) {
                  if (var1 <= -1254834640) {
                     throw new IllegalStateException();
                  }

                  if (-8462239109085136939L * this.aq < (long)(-1691135521 * this.au) + 8734338143670189311L * this.ac) {
                     if (var1 <= -1254834640) {
                        throw new IllegalStateException();
                     }

                     var2 = -8462239109085136939L * this.aq;
                     break label100;
                  }
               }

               if (8734338143670189311L * this.ac >= this.aq * -8462239109085136939L) {
                  if (var1 <= -1254834640) {
                     throw new IllegalStateException();
                  }

                  if (8734338143670189311L * this.ac < (long)(-654786411 * this.al) + this.aq * -8462239109085136939L) {
                     if (var1 <= -1254834640) {
                        throw new IllegalStateException();
                     }

                     var2 = 8734338143670189311L * this.ac;
                  }
               }
            }

            label94: {
               if (this.aq * -8462239109085136939L + (long)(-654786411 * this.al) > 8734338143670189311L * this.ac) {
                  if (var1 <= -1254834640) {
                     throw new IllegalStateException();
                  }

                  if ((long)(-654786411 * this.al) + this.aq * -8462239109085136939L <= (long)(-1691135521 * this.au) + this.ac * 8734338143670189311L) {
                     if (var1 <= -1254834640) {
                        throw new IllegalStateException();
                     }

                     var4 = this.aq * -8462239109085136939L + (long)(this.al * -654786411);
                     break label94;
                  }
               }

               if (8734338143670189311L * this.ac + (long)(-1691135521 * this.au) > this.aq * -8462239109085136939L) {
                  if (var1 <= -1254834640) {
                     throw new IllegalStateException();
                  }

                  if ((long)(-1691135521 * this.au) + 8734338143670189311L * this.ac <= -8462239109085136939L * this.aq + (long)(-654786411 * this.al)) {
                     if (var1 <= -1254834640) {
                        return;
                     }

                     var4 = (long)(this.au * -1691135521) + this.ac * 8734338143670189311L;
                  }
               }
            }

            if (var2 > -1L) {
               if (var1 <= -1254834640) {
                  throw new IllegalStateException();
               }

               if (var4 > var2) {
                  if (var1 <= -1254834640) {
                     throw new IllegalStateException();
                  }

                  int var6 = (int)(var4 - var2);
                  System.arraycopy(this.ab, (int)(var2 - this.aq * -8462239109085136939L), this.aw, (int)(var2 - this.ac * 8734338143670189311L), var6);
               }
            }

            this.aq = -699769937149266301L;
            this.al = 0;
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "sj.al(" + ')');
      }
   }

   public void au(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         try {
            if (var2 + var3 > var1.length) {
               if (var4 >= 296386112) {
                  return;
               }

               throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
            }

            if (-8462239109085136939L * this.aq != -1L) {
               if (var4 >= 296386112) {
                  throw new IllegalStateException();
               }

               if (this.at * 8429326271465132299L >= -8462239109085136939L * this.aq) {
                  if (var4 >= 296386112) {
                     throw new IllegalStateException();
                  }

                  if (8429326271465132299L * this.at + (long)var3 <= this.aq * -8462239109085136939L + (long)(this.al * -654786411)) {
                     if (var4 >= 296386112) {
                        return;
                     }

                     System.arraycopy(this.ab, (int)(this.at * 8429326271465132299L - -8462239109085136939L * this.aq), var1, var2, var3);
                     this.at += -6181027881899576669L * (long)var3;
                     return;
                  }
               }
            }

            long var5 = 8429326271465132299L * this.at;
            int var8 = var3;
            int var9;
            if (this.at * 8429326271465132299L >= this.ac * 8734338143670189311L) {
               if (var4 >= 296386112) {
                  return;
               }

               if (8429326271465132299L * this.at < 8734338143670189311L * this.ac + (long)(-1691135521 * this.au)) {
                  var9 = (int)((long)(-1691135521 * this.au) - (this.at * 8429326271465132299L - this.ac * 8734338143670189311L));
                  if (var9 > var3) {
                     if (var4 >= 296386112) {
                        throw new IllegalStateException();
                     }

                     var9 = var3;
                  }

                  System.arraycopy(this.aw, (int)(8429326271465132299L * this.at - 8734338143670189311L * this.ac), var1, var2, var9);
                  this.at += -6181027881899576669L * (long)var9;
                  var2 += var9;
                  var3 -= var9;
               }
            }

            if (var3 > this.aw.length) {
               if (var4 >= 296386112) {
                  throw new IllegalStateException();
               }

               this.an.af(this.at * 8429326271465132299L);

               for(this.ao = -140630493748753059L * this.at; var3 > 0; var3 -= var9) {
                  var9 = this.an.ab(var1, var2, var3, -1969365793);
                  if (-1 == var9) {
                     if (var4 >= 296386112) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  this.ao += -9042087461339190217L * (long)var9;
                  this.at += (long)var9 * -6181027881899576669L;
                  var2 += var9;
               }
            } else if (var3 > 0) {
               if (var4 >= 296386112) {
                  throw new IllegalStateException();
               }

               this.ab((byte)-75);
               var9 = var3;
               if (var3 > this.au * -1691135521) {
                  if (var4 >= 296386112) {
                     return;
                  }

                  var9 = -1691135521 * this.au;
               }

               System.arraycopy(this.aw, 0, var1, var2, var9);
               var2 += var9;
               var3 -= var9;
               this.at += (long)var9 * -6181027881899576669L;
            }

            if (this.aq * -8462239109085136939L != -1L) {
               if (var4 >= 296386112) {
                  return;
               }

               if (-8462239109085136939L * this.aq > this.at * 8429326271465132299L) {
                  if (var4 >= 296386112) {
                     throw new IllegalStateException();
                  }

                  if (var3 > 0) {
                     var9 = (int)(-8462239109085136939L * this.aq - this.at * 8429326271465132299L) + var2;
                     if (var9 > var3 + var2) {
                        if (var4 >= 296386112) {
                           throw new IllegalStateException();
                        }

                        var9 = var3 + var2;
                     }

                     while(var2 < var9) {
                        if (var4 >= 296386112) {
                           return;
                        }

                        var1[var2++] = 0;
                        --var3;
                        this.at += -6181027881899576669L;
                     }
                  }
               }

               long var11;
               long var16;
               label172: {
                  var16 = -1L;
                  var11 = -1L;
                  if (this.aq * -8462239109085136939L >= var5) {
                     if (var4 >= 296386112) {
                        return;
                     }

                     if (-8462239109085136939L * this.aq < var5 + (long)var8) {
                        var16 = this.aq * -8462239109085136939L;
                        break label172;
                     }
                  }

                  if (var5 >= -8462239109085136939L * this.aq) {
                     if (var4 >= 296386112) {
                        throw new IllegalStateException();
                     }

                     if (var5 < this.aq * -8462239109085136939L + (long)(this.al * -654786411)) {
                        if (var4 >= 296386112) {
                           throw new IllegalStateException();
                        }

                        var16 = var5;
                     }
                  }
               }

               label166: {
                  if (-8462239109085136939L * this.aq + (long)(this.al * -654786411) > var5) {
                     if (var4 >= 296386112) {
                        throw new IllegalStateException();
                     }

                     if ((long)(-654786411 * this.al) + -8462239109085136939L * this.aq <= (long)var8 + var5) {
                        var11 = this.aq * -8462239109085136939L + (long)(this.al * -654786411);
                        break label166;
                     }
                  }

                  if (var5 + (long)var8 > this.aq * -8462239109085136939L) {
                     if (var4 >= 296386112) {
                        return;
                     }

                     if (var5 + (long)var8 <= (long)(this.al * -654786411) + this.aq * -8462239109085136939L) {
                        if (var4 >= 296386112) {
                           throw new IllegalStateException();
                        }

                        var11 = var5 + (long)var8;
                     }
                  }
               }

               if (var16 > -1L) {
                  if (var4 >= 296386112) {
                     throw new IllegalStateException();
                  }

                  if (var11 > var16) {
                     int var13 = (int)(var11 - var16);
                     System.arraycopy(this.ab, (int)(var16 - -8462239109085136939L * this.aq), var1, (int)(var16 - var5) + var2, var13);
                     if (var11 > this.at * 8429326271465132299L) {
                        if (var4 >= 296386112) {
                           throw new IllegalStateException();
                        }

                        var3 = (int)((long)var3 - (var11 - this.at * 8429326271465132299L));
                        this.at = var11 * -6181027881899576669L;
                     }
                  }
               }
            }
         } catch (IOException var14) {
            this.ao = 9042087461339190217L;
            throw var14;
         }

         if (var3 > 0) {
            throw new EOFException();
         }
      } catch (RuntimeException var15) {
         throw db.an(var15, "sj.au(" + ')');
      }
   }

   public void ac(byte[] var1, int var2) throws IOException {
      try {
         this.au(var1, 0, var1.length, -1928644410);
      } catch (RuntimeException var3) {
         throw db.an(var3, "sj.ac(" + ')');
      }
   }

   void by() throws IOException {
      if (-8462239109085136939L * this.aq != -1L) {
         if (this.ao * 31144933894015367L != this.aq * -8462239109085136939L) {
            this.an.af(this.aq * -8462239109085136939L);
            this.ao = 7312697603599620803L * this.aq;
         }

         this.an.an(this.ab, 0, this.al * -654786411, 185047612);
         this.ao += -9056128312498455549L * (long)this.al;
         if (this.ao * 31144933894015367L > 3127984517526915633L * this.aa) {
            this.aa = this.ao * 5080559548865145143L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.aq * -8462239109085136939L >= this.ac * 8734338143670189311L && -8462239109085136939L * this.aq < (long)(-1691135521 * this.au) + 8734338143670189311L * this.ac) {
            var1 = -8462239109085136939L * this.aq;
         } else if (8734338143670189311L * this.ac >= this.aq * -8462239109085136939L && 8734338143670189311L * this.ac < (long)(-654786411 * this.al) + this.aq * -8462239109085136939L) {
            var1 = 8734338143670189311L * this.ac;
         }

         if (this.aq * -8462239109085136939L + (long)(-654786411 * this.al) > 8734338143670189311L * this.ac && (long)(-654786411 * this.al) + this.aq * -8462239109085136939L <= (long)(-1691135521 * this.au) + this.ac * 8734338143670189311L) {
            var3 = this.aq * -8462239109085136939L + (long)(this.al * -654786411);
         } else if (8734338143670189311L * this.ac + (long)(-1691135521 * this.au) > this.aq * -8462239109085136939L && (long)(-1691135521 * this.au) + 8734338143670189311L * this.ac <= -8462239109085136939L * this.aq + (long)(-654786411 * this.al)) {
            var3 = (long)(this.au * -1691135521) + this.ac * 8734338143670189311L;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.ab, (int)(var1 - this.aq * -8462239109085136939L), this.aw, (int)(var1 - this.ac * 8734338143670189311L), var5);
         }

         this.aq = -699769937149266301L;
         this.al = 0;
      }

   }

   public void aq(byte[] var1, int var2, int var3, byte var4) throws IOException {
      try {
         try {
            if (8429326271465132299L * this.at + (long)var3 > this.ay * -1243507284389482911L) {
               this.ay = -8298185492872661599L * ((long)var3 + this.at * 8429326271465132299L);
            }

            if (this.aq * -8462239109085136939L != -1L) {
               label149: {
                  if (8429326271465132299L * this.at >= this.aq * -8462239109085136939L) {
                     if (var4 != 3) {
                        throw new IllegalStateException();
                     }

                     if (8429326271465132299L * this.at <= this.aq * -8462239109085136939L + (long)(-654786411 * this.al)) {
                        break label149;
                     }
                  }

                  this.al(252549395);
               }
            }

            if (-8462239109085136939L * this.aq != -1L) {
               if (var4 != 3) {
                  throw new IllegalStateException();
               }

               if ((long)var3 + 8429326271465132299L * this.at > -8462239109085136939L * this.aq + (long)this.ab.length) {
                  if (var4 != 3) {
                     throw new IllegalStateException();
                  }

                  int var5 = (int)((long)this.ab.length - (8429326271465132299L * this.at - this.aq * -8462239109085136939L));
                  System.arraycopy(var1, var2, this.ab, (int)(this.at * 8429326271465132299L - this.aq * -8462239109085136939L), var5);
                  this.at += (long)var5 * -6181027881899576669L;
                  var2 += var5;
                  var3 -= var5;
                  this.al = -1669068099 * this.ab.length;
                  this.al(-1249936249);
               }
            }

            if (var3 <= this.ab.length) {
               if (var3 > 0) {
                  if (var4 != 3) {
                     throw new IllegalStateException();
                  } else {
                     if (-1L == this.aq * -8462239109085136939L) {
                        this.aq = 2422695430762542431L * this.at;
                     }

                     System.arraycopy(var1, var2, this.ab, (int)(8429326271465132299L * this.at - -8462239109085136939L * this.aq), var3);
                     this.at += (long)var3 * -6181027881899576669L;
                     if (this.at * 8429326271465132299L - this.aq * -8462239109085136939L > (long)(this.al * -654786411)) {
                        if (var4 != 3) {
                           throw new IllegalStateException();
                        }

                        this.al = (int)(this.at * 8429326271465132299L - -8462239109085136939L * this.aq) * -1669068099;
                     }

                  }
               }
            } else {
               if (31144933894015367L * this.ao != 8429326271465132299L * this.at) {
                  if (var4 != 3) {
                     throw new IllegalStateException();
                  }

                  this.an.af(8429326271465132299L * this.at);
                  this.ao = -140630493748753059L * this.at;
               }

               this.an.an(var1, var2, var3, 185047612);
               this.ao += (long)var3 * -9042087461339190217L;
               if (this.ao * 31144933894015367L > 3127984517526915633L * this.aa) {
                  if (var4 != 3) {
                     throw new IllegalStateException();
                  }

                  this.aa = this.ao * 5080559548865145143L;
               }

               long var7;
               long var12;
               label137: {
                  var12 = -1L;
                  var7 = -1L;
                  if (8429326271465132299L * this.at >= this.ac * 8734338143670189311L) {
                     if (var4 != 3) {
                        return;
                     }

                     if (8429326271465132299L * this.at < (long)(this.au * -1691135521) + this.ac * 8734338143670189311L) {
                        if (var4 != 3) {
                           throw new IllegalStateException();
                        }

                        var12 = this.at * 8429326271465132299L;
                        break label137;
                     }
                  }

                  if (8734338143670189311L * this.ac >= this.at * 8429326271465132299L) {
                     if (var4 != 3) {
                        throw new IllegalStateException();
                     }

                     if (8734338143670189311L * this.ac < (long)var3 + 8429326271465132299L * this.at) {
                        if (var4 != 3) {
                           throw new IllegalStateException();
                        }

                        var12 = this.ac * 8734338143670189311L;
                     }
                  }
               }

               if (this.at * 8429326271465132299L + (long)var3 > 8734338143670189311L * this.ac && (long)var3 + 8429326271465132299L * this.at <= (long)(-1691135521 * this.au) + this.ac * 8734338143670189311L) {
                  if (var4 != 3) {
                     return;
                  }

                  var7 = this.at * 8429326271465132299L + (long)var3;
               } else if ((long)(-1691135521 * this.au) + this.ac * 8734338143670189311L > 8429326271465132299L * this.at) {
                  if (var4 != 3) {
                     return;
                  }

                  if (this.ac * 8734338143670189311L + (long)(this.au * -1691135521) <= 8429326271465132299L * this.at + (long)var3) {
                     if (var4 != 3) {
                        throw new IllegalStateException();
                     }

                     var7 = this.ac * 8734338143670189311L + (long)(this.au * -1691135521);
                  }
               }

               if (var12 > -1L) {
                  if (var4 != 3) {
                     throw new IllegalStateException();
                  }

                  if (var7 > var12) {
                     if (var4 != 3) {
                        return;
                     }

                     int var9 = (int)(var7 - var12);
                     System.arraycopy(var1, (int)((long)var2 + var12 - 8429326271465132299L * this.at), this.aw, (int)(var12 - 8734338143670189311L * this.ac), var9);
                  }
               }

               this.at += (long)var3 * -6181027881899576669L;
            }
         } catch (IOException var10) {
            this.ao = 9042087461339190217L;
            throw var10;
         }
      } catch (RuntimeException var11) {
         throw db.an(var11, "sj.aq(" + ')');
      }
   }

   public void at() throws IOException {
      this.al(-212056417);
      this.an.aw((byte)-65);
   }

   void ab(byte var1) throws IOException {
      try {
         this.au = 0;
         if (this.at * 8429326271465132299L != 31144933894015367L * this.ao) {
            if (var1 == 3) {
               throw new IllegalStateException();
            }

            this.an.af(8429326271465132299L * this.at);
            this.ao = -140630493748753059L * this.at;
         }

         this.ac = 2440797830623285237L * this.at;

         while(true) {
            if (this.au * -1691135521 < this.aw.length) {
               if (var1 == 3) {
                  throw new IllegalStateException();
               }

               int var2 = this.aw.length - -1691135521 * this.au;
               if (var2 > 200000000) {
                  if (var1 == 3) {
                     return;
                  }

                  var2 = 200000000;
               }

               int var3 = this.an.ab(this.aw, -1691135521 * this.au, var2, 82145259);
               if (var3 != -1) {
                  this.ao += (long)var3 * -9042087461339190217L;
                  this.au += var3 * -84563425;
                  continue;
               }
            }

            return;
         }
      } catch (RuntimeException var4) {
         throw db.an(var4, "sj.ab(" + ')');
      }
   }

   public void ap(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (8429326271465132299L * this.at + (long)var3 > this.ay * -1243507284389482911L) {
            this.ay = -8298185492872661599L * ((long)var3 + this.at * 8429326271465132299L);
         }

         if (this.aq * -8462239109085136939L != -1L && (8429326271465132299L * this.at < this.aq * -8462239109085136939L || 8429326271465132299L * this.at > this.aq * -8462239109085136939L + (long)(84307282 * this.al))) {
            this.al(-884074474);
         }

         if (-8462239109085136939L * this.aq != -1L && (long)var3 + 8429326271465132299L * this.at > -8462239109085136939L * this.aq + (long)this.ab.length) {
            int var4 = (int)((long)this.ab.length - (8429326271465132299L * this.at - this.aq * -8462239109085136939L));
            System.arraycopy(var1, var2, this.ab, (int)(this.at * 8429326271465132299L - this.aq * -8462239109085136939L), var4);
            this.at += (long)var4 * -6181027881899576669L;
            var2 += var4;
            var3 -= var4;
            this.al = 316285557 * this.ab.length;
            this.al(-358591900);
         }

         if (var3 <= this.ab.length) {
            if (var3 > 0) {
               if (-1L == this.aq * -8462239109085136939L) {
                  this.aq = 2422695430762542431L * this.at;
               }

               System.arraycopy(var1, var2, this.ab, (int)(8429326271465132299L * this.at - -8462239109085136939L * this.aq), var3);
               this.at += (long)var3 * -6181027881899576669L;
               if (this.at * 8429326271465132299L - this.aq * -8462239109085136939L > (long)(this.al * -654786411)) {
                  this.al = (int)(this.at * 8429326271465132299L - -8462239109085136939L * this.aq) * -1669068099;
               }

            }
         } else {
            if (31144933894015367L * this.ao != 8429326271465132299L * this.at) {
               this.an.af(8429326271465132299L * this.at);
               this.ao = -140630493748753059L * this.at;
            }

            this.an.an(var1, var2, var3, 185047612);
            this.ao += (long)var3 * -9042087461339190217L;
            if (this.ao * 31144933894015367L > 3127984517526915633L * this.aa) {
               this.aa = this.ao * 5080559548865145143L;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (8429326271465132299L * this.at >= this.ac * 8734338143670189311L && 8429326271465132299L * this.at < (long)(this.au * -1691135521) + this.ac * 8734338143670189311L) {
               var10 = this.at * 8429326271465132299L;
            } else if (8734338143670189311L * this.ac >= this.at * 8429326271465132299L && 8734338143670189311L * this.ac < (long)var3 + 8429326271465132299L * this.at) {
               var10 = this.ac * 8734338143670189311L;
            }

            if (this.at * 8429326271465132299L + (long)var3 > 8734338143670189311L * this.ac && (long)var3 + 8429326271465132299L * this.at <= (long)(-1691135521 * this.au) + this.ac * 8734338143670189311L) {
               var6 = this.at * 8429326271465132299L + (long)var3;
            } else if ((long)(-718914329 * this.au) + this.ac * 8734338143670189311L > 8429326271465132299L * this.at && this.ac * 8734338143670189311L + (long)(this.au * -301145734) <= 8429326271465132299L * this.at + (long)var3) {
               var6 = this.ac * 8734338143670189311L + (long)(this.au * 1606160039);
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(var1, (int)((long)var2 + var10 - 8429326271465132299L * this.at), this.aw, (int)(var10 - 8734338143670189311L * this.ac), var8);
            }

            this.at += (long)var3 * -6181027881899576669L;
         }
      } catch (IOException var9) {
         this.ao = 9042087461339190217L;
         throw var9;
      }
   }

   public void ao(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.at = var1 * -6181027881899576669L;
      }
   }

   public long aw(short var1) {
      try {
         return this.ay * -1243507284389482911L;
      } catch (RuntimeException var2) {
         throw db.an(var2, "sj.aw(" + ')');
      }
   }

   public long ai() {
      return this.ay * -1243507284389482911L;
   }

   public sj(sy var1, int var2, int var3) throws IOException {
      try {
         super();
         this.ac = 3718207757638450433L;
         this.aq = -699769937149266301L;
         this.al = 0;
         this.an = var1;
         this.ay = (this.aa = var1.au(2094967238) * 5255811969167658705L) * 6082200808648199633L;
         this.aw = new byte[var2];
         this.ab = new byte[var3];
         this.at = 0L;
      } catch (RuntimeException var4) {
         throw db.an(var4, "sj.<init>(" + ')');
      }
   }

   public void ah(byte[] var1) throws IOException {
      this.au(var1, 0, var1.length, -1865691760);
   }

   public void av(byte[] var1) throws IOException {
      this.au(var1, 0, var1.length, -576327973);
   }

   public void ar(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if (-8462239109085136939L * this.aq != -1L && this.at * 8429326271465132299L >= -8462239109085136939L * this.aq && 8429326271465132299L * this.at + (long)var3 <= this.aq * -8462239109085136939L + (long)(this.al * -684970853)) {
            System.arraycopy(this.ab, (int)(this.at * 8429326271465132299L - -8462239109085136939L * this.aq), var1, var2, var3);
            this.at += -6181027881899576669L * (long)var3;
            return;
         }

         long var4 = 8429326271465132299L * this.at;
         int var7 = var3;
         int var8;
         if (this.at * 8429326271465132299L >= this.ac * 8734338143670189311L && 8429326271465132299L * this.at < 8734338143670189311L * this.ac + (long)(-1691135521 * this.au)) {
            var8 = (int)((long)(-1691135521 * this.au) - (this.at * 8429326271465132299L - this.ac * 8734338143670189311L));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.aw, (int)(8429326271465132299L * this.at - 8734338143670189311L * this.ac), var1, var2, var8);
            this.at += -6181027881899576669L * (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.aw.length) {
            this.an.af(this.at * 8429326271465132299L);

            for(this.ao = -140630493748753059L * this.at; var3 > 0; var3 -= var8) {
               var8 = this.an.ab(var1, var2, var3, -582788217);
               if (-1 == var8) {
                  break;
               }

               this.ao += -9042087461339190217L * (long)var8;
               this.at += (long)var8 * -6181027881899576669L;
               var2 += var8;
            }
         } else if (var3 > 0) {
            this.ab((byte)83);
            var8 = var3;
            if (var3 > this.au * 1119603991) {
               var8 = 2051691812 * this.au;
            }

            System.arraycopy(this.aw, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.at += (long)var8 * -6181027881899576669L;
         }

         if (this.aq * -8462239109085136939L != -1L) {
            if (-8462239109085136939L * this.aq > this.at * 8429326271465132299L && var3 > 0) {
               var8 = (int)(-8462239109085136939L * this.aq - this.at * 8429326271465132299L) + var2;
               if (var8 > var3 + var2) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  this.at += -6181027881899576669L;
               }
            }

            long var14 = -1L;
            long var10 = -1L;
            if (this.aq * -8462239109085136939L >= var4 && -8462239109085136939L * this.aq < var4 + (long)var7) {
               var14 = this.aq * -8462239109085136939L;
            } else if (var4 >= -8462239109085136939L * this.aq && var4 < this.aq * -8462239109085136939L + (long)(this.al * -1917773553)) {
               var14 = var4;
            }

            if (-8462239109085136939L * this.aq + (long)(this.al * -654786411) > var4 && (long)(-281857446 * this.al) + -8462239109085136939L * this.aq <= (long)var7 + var4) {
               var10 = this.aq * -8462239109085136939L + (long)(this.al * -654786411);
            } else if (var4 + (long)var7 > this.aq * -8462239109085136939L && var4 + (long)var7 <= (long)(this.al * -654786411) + this.aq * -8462239109085136939L) {
               var10 = var4 + (long)var7;
            }

            if (var14 > -1L && var10 > var14) {
               int var12 = (int)(var10 - var14);
               System.arraycopy(this.ab, (int)(var14 - -8462239109085136939L * this.aq), var1, (int)(var14 - var4) + var2, var12);
               if (var10 > this.at * 8429326271465132299L) {
                  var3 = (int)((long)var3 - (var10 - this.at * 8429326271465132299L));
                  this.at = var10 * -6181027881899576669L;
               }
            }
         }
      } catch (IOException var13) {
         this.ao = 9042087461339190217L;
         throw var13;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   public void am(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if (-8462239109085136939L * this.aq != -1L && this.at * 8429326271465132299L >= -8462239109085136939L * this.aq && 8429326271465132299L * this.at + (long)var3 <= this.aq * -8462239109085136939L + (long)(this.al * -654786411)) {
            System.arraycopy(this.ab, (int)(this.at * 8429326271465132299L - -8462239109085136939L * this.aq), var1, var2, var3);
            this.at += -6181027881899576669L * (long)var3;
            return;
         }

         long var4 = 8429326271465132299L * this.at;
         int var7 = var3;
         int var8;
         if (this.at * 8429326271465132299L >= this.ac * 8734338143670189311L && 8429326271465132299L * this.at < 8734338143670189311L * this.ac + (long)(-1691135521 * this.au)) {
            var8 = (int)((long)(-1691135521 * this.au) - (this.at * 8429326271465132299L - this.ac * 8734338143670189311L));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.aw, (int)(8429326271465132299L * this.at - 8734338143670189311L * this.ac), var1, var2, var8);
            this.at += -6181027881899576669L * (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.aw.length) {
            this.an.af(this.at * 8429326271465132299L);

            for(this.ao = -140630493748753059L * this.at; var3 > 0; var3 -= var8) {
               var8 = this.an.ab(var1, var2, var3, -1731167481);
               if (-1 == var8) {
                  break;
               }

               this.ao += -9042087461339190217L * (long)var8;
               this.at += (long)var8 * -6181027881899576669L;
               var2 += var8;
            }
         } else if (var3 > 0) {
            this.ab((byte)-48);
            var8 = var3;
            if (var3 > this.au * -1691135521) {
               var8 = -1691135521 * this.au;
            }

            System.arraycopy(this.aw, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.at += (long)var8 * -6181027881899576669L;
         }

         if (this.aq * -8462239109085136939L != -1L) {
            if (-8462239109085136939L * this.aq > this.at * 8429326271465132299L && var3 > 0) {
               var8 = (int)(-8462239109085136939L * this.aq - this.at * 8429326271465132299L) + var2;
               if (var8 > var3 + var2) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  this.at += -6181027881899576669L;
               }
            }

            long var14 = -1L;
            long var10 = -1L;
            if (this.aq * -8462239109085136939L >= var4 && -8462239109085136939L * this.aq < var4 + (long)var7) {
               var14 = this.aq * -8462239109085136939L;
            } else if (var4 >= -8462239109085136939L * this.aq && var4 < this.aq * -8462239109085136939L + (long)(this.al * -654786411)) {
               var14 = var4;
            }

            if (-8462239109085136939L * this.aq + (long)(this.al * -654786411) > var4 && (long)(-654786411 * this.al) + -8462239109085136939L * this.aq <= (long)var7 + var4) {
               var10 = this.aq * -8462239109085136939L + (long)(this.al * -654786411);
            } else if (var4 + (long)var7 > this.aq * -8462239109085136939L && var4 + (long)var7 <= (long)(this.al * -654786411) + this.aq * -8462239109085136939L) {
               var10 = var4 + (long)var7;
            }

            if (var14 > -1L && var10 > var14) {
               int var12 = (int)(var10 - var14);
               System.arraycopy(this.ab, (int)(var14 - -8462239109085136939L * this.aq), var1, (int)(var14 - var4) + var2, var12);
               if (var10 > this.at * 8429326271465132299L) {
                  var3 = (int)((long)var3 - (var10 - this.at * 8429326271465132299L));
                  this.at = var10 * -6181027881899576669L;
               }
            }
         }
      } catch (IOException var13) {
         this.ao = 9042087461339190217L;
         throw var13;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   void as() throws IOException {
      this.au = 0;
      if (this.at * 8429326271465132299L != 31144933894015367L * this.ao) {
         this.an.af(8429326271465132299L * this.at);
         this.ao = -140630493748753059L * this.at;
      }

      int var2;
      for(this.ac = 2440797830623285237L * this.at; this.au * -1691135521 < this.aw.length; this.au += var2 * -84563425) {
         int var1 = this.aw.length - -1691135521 * this.au;
         if (var1 > 200000000) {
            var1 = 200000000;
         }

         var2 = this.an.ab(this.aw, -1691135521 * this.au, var1, 2063330178);
         if (var2 == -1) {
            break;
         }

         this.ao += (long)var2 * -9042087461339190217L;
      }

   }

   void aj() throws IOException {
      this.au = 0;
      if (this.at * 8429326271465132299L != 31144933894015367L * this.ao) {
         this.an.af(8429326271465132299L * this.at);
         this.ao = -140630493748753059L * this.at;
      }

      int var2;
      for(this.ac = 2440797830623285237L * this.at; this.au * -1691135521 < this.aw.length; this.au += var2 * -84563425) {
         int var1 = this.aw.length - -1691135521 * this.au;
         if (var1 > 200000000) {
            var1 = 200000000;
         }

         var2 = this.an.ab(this.aw, -1691135521 * this.au, var1, -361938312);
         if (var2 == -1) {
            break;
         }

         this.ao += (long)var2 * -9042087461339190217L;
      }

   }

   public void aa() throws IOException {
      this.al(-160081256);
      this.an.aw((byte)-97);
   }

   void az() throws IOException {
      this.au = 0;
      if (this.at * 8429326271465132299L != 31144933894015367L * this.ao) {
         this.an.af(8429326271465132299L * this.at);
         this.ao = -140630493748753059L * this.at;
      }

      int var2;
      for(this.ac = 2440797830623285237L * this.at; this.au * -1691135521 < this.aw.length; this.au += var2 * 567466757) {
         int var1 = this.aw.length - -1691135521 * this.au;
         if (var1 > -1463945323) {
            var1 = 200000000;
         }

         var2 = this.an.ab(this.aw, -1691135521 * this.au, var1, -1878239542);
         if (var2 == -1) {
            break;
         }

         this.ao += (long)var2 * -9042087461339190217L;
      }

   }

   public void ad(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (8429326271465132299L * this.at + (long)var3 > this.ay * -1243507284389482911L) {
            this.ay = -8298185492872661599L * ((long)var3 + this.at * 8429326271465132299L);
         }

         if (this.aq * -8462239109085136939L != -1L && (8429326271465132299L * this.at < this.aq * -8462239109085136939L || 8429326271465132299L * this.at > this.aq * -8462239109085136939L + (long)(-568312444 * this.al))) {
            this.al(402353448);
         }

         if (-8462239109085136939L * this.aq != -1L && (long)var3 + 8429326271465132299L * this.at > -8462239109085136939L * this.aq + (long)this.ab.length) {
            int var4 = (int)((long)this.ab.length - (8429326271465132299L * this.at - this.aq * -8462239109085136939L));
            System.arraycopy(var1, var2, this.ab, (int)(this.at * 8429326271465132299L - this.aq * -8462239109085136939L), var4);
            this.at += (long)var4 * -6181027881899576669L;
            var2 += var4;
            var3 -= var4;
            this.al = 527428796 * this.ab.length;
            this.al(535258946);
         }

         if (var3 <= this.ab.length) {
            if (var3 > 0) {
               if (-1L == this.aq * -8462239109085136939L) {
                  this.aq = 2422695430762542431L * this.at;
               }

               System.arraycopy(var1, var2, this.ab, (int)(8429326271465132299L * this.at - -8462239109085136939L * this.aq), var3);
               this.at += (long)var3 * -6181027881899576669L;
               if (this.at * 8429326271465132299L - this.aq * -8462239109085136939L > (long)(this.al * -1958836101)) {
                  this.al = (int)(this.at * 8429326271465132299L - -8462239109085136939L * this.aq) * -1669068099;
               }

            }
         } else {
            if (31144933894015367L * this.ao != 8429326271465132299L * this.at) {
               this.an.af(8429326271465132299L * this.at);
               this.ao = -140630493748753059L * this.at;
            }

            this.an.an(var1, var2, var3, 185047612);
            this.ao += (long)var3 * -9042087461339190217L;
            if (this.ao * 31144933894015367L > 3127984517526915633L * this.aa) {
               this.aa = this.ao * 5080559548865145143L;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (8429326271465132299L * this.at >= this.ac * 8734338143670189311L && 8429326271465132299L * this.at < (long)(this.au * 789993571) + this.ac * 8734338143670189311L) {
               var10 = this.at * 8429326271465132299L;
            } else if (8734338143670189311L * this.ac >= this.at * 8429326271465132299L && 8734338143670189311L * this.ac < (long)var3 + 8429326271465132299L * this.at) {
               var10 = this.ac * 8734338143670189311L;
            }

            if (this.at * 8429326271465132299L + (long)var3 > 8734338143670189311L * this.ac && (long)var3 + 8429326271465132299L * this.at <= (long)(-232073801 * this.au) + this.ac * 8734338143670189311L) {
               var6 = this.at * 8429326271465132299L + (long)var3;
            } else if ((long)(-71594204 * this.au) + this.ac * 8734338143670189311L > 8429326271465132299L * this.at && this.ac * 8734338143670189311L + (long)(this.au * -1668641475) <= 8429326271465132299L * this.at + (long)var3) {
               var6 = this.ac * 8734338143670189311L + (long)(this.au * -1691135521);
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(var1, (int)((long)var2 + var10 - 8429326271465132299L * this.at), this.aw, (int)(var10 - 8734338143670189311L * this.ac), var8);
            }

            this.at += (long)var3 * -6181027881899576669L;
         }
      } catch (IOException var9) {
         this.ao = 9042087461339190217L;
         throw var9;
      }
   }

   void be() throws IOException {
      if (-8462239109085136939L * this.aq != -1L) {
         if (this.ao * 31144933894015367L != this.aq * -8462239109085136939L) {
            this.an.af(this.aq * -8462239109085136939L);
            this.ao = 7312697603599620803L * this.aq;
         }

         this.an.an(this.ab, 0, this.al * 438407466, 185047612);
         this.ao += -9056128312498455549L * (long)this.al;
         if (this.ao * 31144933894015367L > 3127984517526915633L * this.aa) {
            this.aa = this.ao * 5080559548865145143L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.aq * -8462239109085136939L >= this.ac * 8734338143670189311L && -8462239109085136939L * this.aq < (long)(1111206150 * this.au) + 8734338143670189311L * this.ac) {
            var1 = -8462239109085136939L * this.aq;
         } else if (8734338143670189311L * this.ac >= this.aq * -8462239109085136939L && 8734338143670189311L * this.ac < (long)(220042435 * this.al) + this.aq * -8462239109085136939L) {
            var1 = 8734338143670189311L * this.ac;
         }

         if (this.aq * -8462239109085136939L + (long)(-739162078 * this.al) > 8734338143670189311L * this.ac && (long)(-654786411 * this.al) + this.aq * -8462239109085136939L <= (long)(-1691135521 * this.au) + this.ac * 8734338143670189311L) {
            var3 = this.aq * -8462239109085136939L + (long)(this.al * -1662061988);
         } else if (8734338143670189311L * this.ac + (long)(-1691135521 * this.au) > this.aq * -8462239109085136939L && (long)(-132450191 * this.au) + 8734338143670189311L * this.ac <= -8462239109085136939L * this.aq + (long)(964963750 * this.al)) {
            var3 = (long)(this.au * -1691135521) + this.ac * 8734338143670189311L;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.ab, (int)(var1 - this.aq * -8462239109085136939L), this.aw, (int)(var1 - this.ac * 8734338143670189311L), var5);
         }

         this.aq = -699769937149266301L;
         this.al = 0;
      }

   }

   public long ax() {
      return this.ay * -1243507284389482911L;
   }

   public void ay(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.at = var1 * -6181027881899576669L;
      }
   }

   void bb() throws IOException {
      if (-8462239109085136939L * this.aq != -1L) {
         if (this.ao * 31144933894015367L != this.aq * -8462239109085136939L) {
            this.an.af(this.aq * -8462239109085136939L);
            this.ao = 7312697603599620803L * this.aq;
         }

         this.an.an(this.ab, 0, this.al * -654786411, 185047612);
         this.ao += -9056128312498455549L * (long)this.al;
         if (this.ao * 31144933894015367L > 3127984517526915633L * this.aa) {
            this.aa = this.ao * 5080559548865145143L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.aq * -8462239109085136939L >= this.ac * 8734338143670189311L && -8462239109085136939L * this.aq < (long)(-1691135521 * this.au) + 8734338143670189311L * this.ac) {
            var1 = -8462239109085136939L * this.aq;
         } else if (8734338143670189311L * this.ac >= this.aq * -8462239109085136939L && 8734338143670189311L * this.ac < (long)(-654786411 * this.al) + this.aq * -8462239109085136939L) {
            var1 = 8734338143670189311L * this.ac;
         }

         if (this.aq * -8462239109085136939L + (long)(-654786411 * this.al) > 8734338143670189311L * this.ac && (long)(-654786411 * this.al) + this.aq * -8462239109085136939L <= (long)(-1691135521 * this.au) + this.ac * 8734338143670189311L) {
            var3 = this.aq * -8462239109085136939L + (long)(this.al * -654786411);
         } else if (8734338143670189311L * this.ac + (long)(-1691135521 * this.au) > this.aq * -8462239109085136939L && (long)(-1691135521 * this.au) + 8734338143670189311L * this.ac <= -8462239109085136939L * this.aq + (long)(-654786411 * this.al)) {
            var3 = (long)(this.au * -1691135521) + this.ac * 8734338143670189311L;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.ab, (int)(var1 - this.aq * -8462239109085136939L), this.aw, (int)(var1 - this.ac * 8734338143670189311L), var5);
         }

         this.aq = -699769937149266301L;
         this.al = 0;
      }

   }

   void bi() throws IOException {
      if (-8462239109085136939L * this.aq != -1L) {
         if (this.ao * 31144933894015367L != this.aq * -8462239109085136939L) {
            this.an.af(this.aq * -8462239109085136939L);
            this.ao = 7312697603599620803L * this.aq;
         }

         this.an.an(this.ab, 0, this.al * 1623776851, 185047612);
         this.ao += -9056128312498455549L * (long)this.al;
         if (this.ao * 31144933894015367L > 3127984517526915633L * this.aa) {
            this.aa = this.ao * 5080559548865145143L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.aq * -8462239109085136939L >= this.ac * 8734338143670189311L && -8462239109085136939L * this.aq < (long)(-1780960820 * this.au) + 8734338143670189311L * this.ac) {
            var1 = -8462239109085136939L * this.aq;
         } else if (8734338143670189311L * this.ac >= this.aq * -8462239109085136939L && 8734338143670189311L * this.ac < (long)(812726269 * this.al) + this.aq * -8462239109085136939L) {
            var1 = 8734338143670189311L * this.ac;
         }

         if (this.aq * -8462239109085136939L + (long)(-870514707 * this.al) > 8734338143670189311L * this.ac && (long)(-654786411 * this.al) + this.aq * -8462239109085136939L <= (long)(1665092852 * this.au) + this.ac * 8734338143670189311L) {
            var3 = this.aq * -8462239109085136939L + (long)(this.al * -654786411);
         } else if (8734338143670189311L * this.ac + (long)(-1691135521 * this.au) > this.aq * -8462239109085136939L && (long)(-1691135521 * this.au) + 8734338143670189311L * this.ac <= -8462239109085136939L * this.aq + (long)(626501264 * this.al)) {
            var3 = (long)(this.au * 1770708571) + this.ac * 8734338143670189311L;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.ab, (int)(var1 - this.aq * -8462239109085136939L), this.aw, (int)(var1 - this.ac * 8734338143670189311L), var5);
         }

         this.aq = -699769937149266301L;
         this.al = 0;
      }

   }

   public long ag() {
      return this.ay * -1243507284389482911L;
   }
}
