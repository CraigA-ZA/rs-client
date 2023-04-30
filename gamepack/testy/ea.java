import accessors.RSUserComparator8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ea extends pz implements RSUserComparator8 {
   static final int eh = 0;
   static int at;
   static String gd;
   final boolean af;

   static float[] as(JSONObject var0, String var1, int var2) throws JSONException {
      try {
         float[] var3 = new float[4];

         try {
            JSONArray var4 = var0.getJSONArray(var1);
            var3[0] = (float)var4.optDouble(0, 0.0);
            var3[1] = (float)var4.optDouble(1, 0.0);
            var3[2] = (float)var4.optDouble(2, 1.0);
            var3[3] = (float)var4.optDouble(3, 1.0);
         } catch (JSONException var5) {
            var3[0] = 0.0F;
            var3[1] = 0.0F;
            var3[2] = 1.0F;
            var3[3] = 1.0F;
         }

         return var3;
      } catch (RuntimeException var6) {
         throw db.an(var6, "ea.as(" + ')');
      }
   }

   int af(pb var1, pb var2, int var3) {
      try {
         if (-453810525 * client.bw == 177258591 * var1.au) {
            if (client.bw * -453810525 != var2.au * 177258591) {
               return this.af ? -1 : 1;
            }
         } else if (177258591 * var2.au == client.bw * -453810525) {
            if (var3 != -1369824853) {
               throw new IllegalStateException();
            }

            byte var10000;
            if (this.af) {
               if (var3 != -1369824853) {
                  throw new IllegalStateException();
               }

               var10000 = 1;
            } else {
               var10000 = -1;
            }

            return var10000;
         }

         return this.ao(var1, var2, 641920470);
      } catch (RuntimeException var4) {
         throw db.an(var4, "ea.af(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.af((pb)var1, (pb)var2, -1369824853);
      } catch (RuntimeException var3) {
         throw db.an(var3, "ea.compare(" + ')');
      }
   }

   public int au(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, -1369824853);
   }

   public ea(boolean var1) {
      try {
         super();
         this.af = var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "ea.<init>(" + ')');
      }
   }

   public int aq(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, -1369824853);
   }

   public static int an(int var0, int var1, int var2) {
      try {
         return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133) & 16383;
      } catch (RuntimeException var3) {
         throw db.an(var3, "ea.an(" + ')');
      }
   }

   int an(pb var1, pb var2) {
      if (-453810525 * client.bw == 177258591 * var1.au) {
         if (client.bw * -453810525 != var2.au * 177258591) {
            return this.af ? -1 : 1;
         }
      } else if (1635263960 * var2.au == client.bw * -510315481) {
         return this.af ? 1 : -1;
      }

      return this.ao(var1, var2, 641920470);
   }

   int aw(pb var1, pb var2) {
      if (-453810525 * client.bw == 177258591 * var1.au) {
         if (client.bw * -453810525 != var2.au * 177258591) {
            return this.af ? -1 : 1;
         }
      } else if (177258591 * var2.au == client.bw * -453810525) {
         return this.af ? 1 : -1;
      }

      return this.ao(var1, var2, 641920470);
   }

   int ac(pb var1, pb var2) {
      if (-939931346 * client.bw == -243372234 * var1.au) {
         if (client.bw * -1186589312 != var2.au * 1077874178) {
            return this.af ? -1 : 1;
         }
      } else if (177258591 * var2.au == client.bw * -453810525) {
         return this.af ? 1 : -1;
      }

      return this.ao(var1, var2, 641920470);
   }

   public int ab(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, -1369824853);
   }

   int at(pb var1, pb var2) {
      if (-453810525 * client.bw == 177258591 * var1.au) {
         if (client.bw * -453810525 != var2.au * 177258591) {
            return this.af ? -1 : 1;
         }
      } else if (177258591 * var2.au == client.bw * -453810525) {
         return this.af ? 1 : -1;
      }

      return this.ao(var1, var2, 641920470);
   }

   static final void iu(byte var0) {
      try {
         if (-1727408401 * bm.mh != client.sp * -2000567333) {
            if (var0 >= 3) {
               return;
            }

            client.sp = -1813500035 * bm.mh;
            int var1 = -1727408401 * bm.mh;
            int[] var2 = et.tk.af;
            int var3 = var2.length;

            int var4;
            for(var4 = 0; var4 < var3; ++var4) {
               if (var0 >= 3) {
                  throw new IllegalStateException();
               }

               var2[var4] = 0;
            }

            int var5;
            int var6;
            for(var4 = 1; var4 < 103; ++var4) {
               if (var0 >= 3) {
                  throw new IllegalStateException();
               }

               var5 = 2048 * (103 - var4) + 24628;

               for(var6 = 1; var6 < 103; ++var6) {
                  if ((cd.an[var1][var6][var4] & 24) == 0) {
                     if (var0 >= 3) {
                        throw new IllegalStateException();
                     }

                     bx.js.bm(var2, var5, 512, var1, var6, var4);
                  }

                  if (var1 < 3) {
                     if (var0 >= 3) {
                        throw new IllegalStateException();
                     }

                     if ((cd.an[var1 + 1][var6][var4] & 8) != 0) {
                        if (var0 >= 3) {
                           throw new IllegalStateException();
                        }

                        bx.js.bm(var2, var5, 512, var1 + 1, var6, var4);
                     }
                  }

                  var5 += 4;
               }
            }

            var4 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
            var5 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
            et.tk.ac();

            int var7;
            for(var6 = 1; var6 < 103; ++var6) {
               if (var0 >= 3) {
                  return;
               }

               for(var7 = 1; var7 < 103; ++var7) {
                  if (var0 >= 3) {
                     return;
                  }

                  if (0 == (cd.an[var1][var7][var6] & 24)) {
                     if (var0 >= 3) {
                        throw new IllegalStateException();
                     }

                     ff.jy(var1, var7, var6, var4, var5, -1290487561);
                  }

                  if (var1 < 3 && (cd.an[1 + var1][var7][var6] & 8) != 0) {
                     ff.jy(var1 + 1, var7, var6, var4, var5, -1520804786);
                  }
               }
            }

            client.sr = 0;

            for(var6 = 0; var6 < 104; ++var6) {
               if (var0 >= 3) {
                  throw new IllegalStateException();
               }

               for(var7 = 0; var7 < 104; ++var7) {
                  if (var0 >= 3) {
                     throw new IllegalStateException();
                  }

                  long var8 = bx.js.be(bm.mh * -1727408401, var6, var7);
                  if (var8 != 0L) {
                     int var10 = di.at(var8);
                     int var11 = fw.an(var10, (short)2415).be * 1270945427;
                     if (var11 >= 0) {
                        if (var0 >= 3) {
                           throw new IllegalStateException();
                        }

                        if (!nf.an(var11, 2096193718).ax) {
                           if (var0 >= 3) {
                              return;
                           }
                        } else {
                           client.ts[1573101195 * client.sr] = nf.an(var11, 2007261839).ab(false, -16711936);
                           client.tw[client.sr * 1573101195] = var6;
                           client.ty[client.sr * 1573101195] = var7;
                           client.sr += 868833571;
                        }
                     }
                  }
               }
            }

            ia.bn.ar((byte)0);
         }

      } catch (RuntimeException var12) {
         throw db.an(var12, "ea.iu(" + ')');
      }
   }

   public int al(Object var1, Object var2) {
      return this.af((pb)var1, (pb)var2, -1369824853);
   }
}
