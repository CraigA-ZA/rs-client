public class sh implements nj {
   public static final sh aw = new sh(2, 2, String.class, new si());
   public static final sh an = new sh(0, 1, Long.class, new sf());
   public static final sh af = new sh(1, 0, Integer.class, new sa());
   public final int ac;
   public final int au;
   public final Class ab;
   final ss aq;
   static final int ba = 56;
   public static final float at = 10000.0F;

   public static lg aw(short var0) {
      try {
         lg var1 = hh.af((byte)0);
         var1.af = null;
         var1.an = 0;
         var1.aw = new sq(5000);
         return var1;
      } catch (RuntimeException var2) {
         throw db.an(var2, "sh.aw(" + ')');
      }
   }

   public static sh ay(Class var0) {
      sh[] var1 = au(-1594990105);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         sh var3 = var1[var2];
         if (var0 == var3.ab) {
            return var3;
         }
      }

      return null;
   }

   public static sh ab(Class var0, short var1) {
      try {
         sh[] var2 = au(-1831694021);

         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var1 >= 256) {
               throw new IllegalStateException();
            }

            sh var4 = var2[var3];
            if (var0 == var4.ab) {
               if (var1 >= 256) {
                  throw new IllegalStateException();
               }

               return var4;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw db.an(var5, "sh.ab(" + ')');
      }
   }

   public static sh[] au(int var0) {
      try {
         return new sh[]{af, an, aw};
      } catch (RuntimeException var1) {
         throw db.an(var1, "sh.au(" + ')');
      }
   }

   static ss al(Class var0, int var1) {
      try {
         sh var2 = ab(var0, (short)-27673);
         if (var2 == null) {
            if (var1 != -1458293291) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            return var2.aq;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "sh.al(" + ')');
      }
   }

   public int af(int var1) {
      try {
         return this.au * 454796803;
      } catch (RuntimeException var2) {
         throw db.an(var2, "sh.af(" + ')');
      }
   }

   public int aw() {
      return this.au * -1312168892;
   }

   public int an() {
      return this.au * 454796803;
   }

   public static void ao(Object var0, sg var1) {
      ss var2 = al(var0.getClass(), -1458293291);
      var2.af(var0, var1, 204430724);
   }

   public Object at(sg var1, int var2) {
      try {
         return this.aq.an(var1, -1690934499);
      } catch (RuntimeException var3) {
         throw db.an(var3, "sh.at(" + ')');
      }
   }

   public static sh[] aa() {
      return new sh[]{af, an, aw};
   }

   public int ac() {
      return this.au * 454796803;
   }

   sh(int var1, int var2, Class var3, ss var4) {
      try {
         super();
         this.ac = 1357163045 * var1;
         this.au = var2 * 848999595;
         this.ab = var3;
         this.aq = var4;
      } catch (RuntimeException var5) {
         throw db.an(var5, "sh.<init>(" + ')');
      }
   }

   public static void ax(Object var0, sg var1) {
      ss var2 = al(var0.getClass(), -1458293291);
      var2.af(var0, var1, -1985528033);
   }

   public static void ai(Object var0, sg var1) {
      ss var2 = al(var0.getClass(), -1458293291);
      var2.af(var0, var1, -1192953475);
   }

   public static void ag(Object var0, sg var1) {
      ss var2 = al(var0.getClass(), -1458293291);
      var2.af(var0, var1, 1833941593);
   }

   static ss ah(Class var0) {
      sh var1 = ab(var0, (short)-29318);
      if (var1 == null) {
         throw new IllegalArgumentException();
      } else {
         return var1.aq;
      }
   }

   static int bk(int var0, ch var1, boolean var2, byte var3) {
      try {
         if (3800 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               if (null != hz.sq) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  cy.al[(cy.at += 427135973) * -964267539 - 1] = 1;
                  fh.ah = hz.sq;
               } else {
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
               }

               return 1;
            }
         } else {
            int var4;
            if (3801 == var0) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               } else {
                  var4 = cy.al[(cy.at -= 427135973) * -964267539];
                  if (client.sg[var4] != null) {
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = 1;
                     fh.ah = client.sg[var4];
                  } else {
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                  }

                  return 1;
               }
            } else if (var0 == 3802) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               } else {
                  cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = fh.ah.ab;
                  return 1;
               }
            } else if (3803 == var0) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               } else {
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = fh.ah.al ? 1 : 0;
                  return 1;
               }
            } else if (3804 == var0) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               } else {
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = fh.ah.at;
                  return 1;
               }
            } else if (var0 == 3805) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               } else {
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = fh.ah.aa;
                  return 1;
               }
            } else if (3806 == var0) {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = fh.ah.ay;
               return 1;
            } else if (var0 == 3807) {
               cy.al[(cy.at += 427135973) * -964267539 - 1] = fh.ah.ao;
               return 1;
            } else if (var0 == 3809) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               } else {
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = 1247430143 * fh.ah.ax;
                  return 1;
               }
            } else if (var0 == 3810) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               } else {
                  var4 = cy.al[(cy.at -= 427135973) * -964267539];
                  cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = fh.ah.ad[var4];
                  return 1;
               }
            } else if (3811 == var0) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               } else {
                  var4 = cy.al[(cy.at -= 427135973) * -964267539];
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = fh.ah.ag[var4];
                  return 1;
               }
            } else if (var0 == 3812) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               } else {
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = fh.ah.ak * -325159675;
                  return 1;
               }
            } else if (3813 == var0) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               } else {
                  var4 = cy.al[(cy.at -= 427135973) * -964267539];
                  cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = fh.ah.ae[var4];
                  return 1;
               }
            } else {
               int var6;
               int var8;
               if (var0 == 3814) {
                  cy.at -= 1281407919;
                  var4 = cy.al[cy.at * -964267539];
                  var8 = cy.al[1 + -964267539 * cy.at];
                  var6 = cy.al[2 + cy.at * -964267539];
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = fh.ah.ac(var4, var8, var6, (byte)60);
                  return 1;
               } else if (var0 == 3815) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  } else {
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = fh.ah.as * 680027429;
                     return 1;
                  }
               } else if (3816 == var0) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  } else {
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = fh.ah.aj * -1218077019;
                     return 1;
                  }
               } else if (var0 == 3817) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  } else {
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = fh.ah.aw(cy.aa[(dm.ay -= -1086551379) * -2017760987], (byte)79);
                     return 1;
                  }
               } else if (3818 == var0) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  } else {
                     cy.al[-964267539 * cy.at - 1] = fh.ah.ab((byte)33)[cy.al[-964267539 * cy.at - 1]];
                     return 1;
                  }
               } else if (var0 == 3819) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  } else {
                     cy.at -= 854271946;
                     var4 = cy.al[cy.at * -964267539];
                     var8 = cy.al[-964267539 * cy.at + 1];
                     kj.na(var8, var4, (byte)46);
                     return 1;
                  }
               } else if (3820 == var0) {
                  var4 = cy.al[(cy.at -= 427135973) * -964267539];
                  cy.al[(cy.at += 427135973) * -964267539 - 1] = fh.ah.ar[var4];
                  return 1;
               } else {
                  if (3821 == var0) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     cy.at -= 1281407919;
                     var4 = cy.al[-964267539 * cy.at];
                     boolean var10000;
                     if (cy.al[cy.at * -964267539 + 1] == 1) {
                        if (var3 != 0) {
                           throw new IllegalStateException();
                        }

                        var10000 = true;
                     } else {
                        var10000 = false;
                     }

                     boolean var5 = var10000;
                     var6 = cy.al[cy.at * -964267539 + 2];
                     gv.np(var6, var4, var5, 787854296);
                  }

                  int var10001;
                  byte var10002;
                  int[] var9;
                  if (var0 == 3822) {
                     var4 = cy.al[(cy.at -= 427135973) * -964267539];
                     var9 = cy.al;
                     var10001 = (cy.at += 427135973) * -964267539 - 1;
                     if (fh.ah.am[var4]) {
                        if (var3 != 0) {
                           throw new IllegalStateException();
                        }

                        var10002 = 1;
                     } else {
                        var10002 = 0;
                     }

                     var9[var10001] = var10002;
                     return 1;
                  } else if (3850 == var0) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     } else {
                        if (bd.sx != null) {
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = 1;
                           fq.av = bd.sx;
                        } else {
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                        }

                        return 1;
                     }
                  } else if (3851 == var0) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cy.al[(cy.at -= 427135973) * -964267539];
                        if (client.so[var4] != null) {
                           if (var3 != 0) {
                              throw new IllegalStateException();
                           }

                           cy.al[(cy.at += 427135973) * -964267539 - 1] = 1;
                           fq.av = client.so[var4];
                           cz.ar = 1601506193 * var4;
                        } else {
                           cy.al[(cy.at += 427135973) * -964267539 - 1] = 0;
                        }

                        return 1;
                     }
                  } else if (var0 == 3852) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     } else {
                        cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = fq.av.ab;
                        return 1;
                     }
                  } else if (var0 == 3853) {
                     cy.al[(cy.at += 427135973) * -964267539 - 1] = fq.av.al;
                     return 1;
                  } else if (3854 == var0) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     } else {
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = fq.av.aq;
                        return 1;
                     }
                  } else if (3855 == var0) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     } else {
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = fq.av.ac(390972136);
                        return 1;
                     }
                  } else if (3856 == var0) {
                     var4 = cy.al[(cy.at -= 427135973) * -964267539];
                     cy.aa[(dm.ay += -1086551379) * -2017760987 - 1] = ((fz)fq.av.aw.get(var4)).aw.af(-710264960);
                     return 1;
                  } else if (3857 == var0) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cy.al[(cy.at -= 427135973) * -964267539];
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = ((fz)fq.av.aw.get(var4)).af;
                        return 1;
                     }
                  } else if (var0 == 3858) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cy.al[(cy.at -= 427135973) * -964267539];
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = ((fz)fq.av.aw.get(var4)).an * -2113202541;
                        return 1;
                     }
                  } else if (3859 == var0) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cy.al[(cy.at -= 427135973) * -964267539];
                        fg.nn(cz.ar * -575466127, var4, 201113676);
                        return 1;
                     }
                  } else if (var0 == 3860) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     } else {
                        cy.al[(cy.at += 427135973) * -964267539 - 1] = fq.av.au(cy.aa[(dm.ay -= -1086551379) * -2017760987], -1047252257);
                        return 1;
                     }
                  } else if (var0 == 3861) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     } else {
                        cy.al[cy.at * -964267539 - 1] = fq.av.af(67863678)[cy.al[-964267539 * cy.at - 1]];
                        return 1;
                     }
                  } else if (3890 == var0) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     } else {
                        var9 = cy.al;
                        var10001 = (cy.at += 427135973) * -964267539 - 1;
                        if (ds.rx != null) {
                           if (var3 != 0) {
                              throw new IllegalStateException();
                           }

                           var10002 = 1;
                        } else {
                           var10002 = 0;
                        }

                        var9[var10001] = var10002;
                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "sh.bk(" + ')');
      }
   }

   static final int am(int var0, int var1, byte var2) {
      try {
         if (-2 == var0) {
            return 12345678;
         } else if (-1 == var0) {
            if (var2 != 0) {
               throw new IllegalStateException();
            } else {
               if (var1 < 2) {
                  var1 = 2;
               } else if (var1 > 126) {
                  if (var2 != 0) {
                     throw new IllegalStateException();
                  }

                  var1 = 126;
               }

               return var1;
            }
         } else {
            var1 = (var0 & 127) * var1 / 128;
            if (var1 < 2) {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               var1 = 2;
            } else if (var1 > 126) {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               var1 = 126;
            }

            return (var0 & 'ﾀ') + var1;
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "sh.am(" + ')');
      }
   }

   public static void an(nm var0, String var1, String var2, int var3, boolean var4, int var5) {
      try {
         if (var0.cv(var1, var2, -1313069490)) {
            if (var5 <= -1893671375) {
               throw new IllegalStateException();
            }

            int var6 = var0.cy(var1, 480106733);
            int var7 = var0.cx(var6, var2, (short)8192);
            cq.aw(var0, var6, var7, var3, var4, -1544812816);
         }

      } catch (RuntimeException var8) {
         throw db.an(var8, "sh.an(" + ')');
      }
   }

   static final void nm(String var0, byte var1) {
      try {
         if (es.sb == null) {
            if (var1 > 25) {
               ;
            }
         } else {
            lg var2 = mi.an(lv.dt, client.in.au, (short)-32141);
            var2.aw.bu(ct.bc(var0, (byte)-37), (byte)4);
            var2.aw.bh(var0, -1834018420);
            client.in.aw(var2, 414135591);
         }
      } catch (RuntimeException var3) {
         throw db.an(var3, "sh.nm(" + ')');
      }
   }

   public static void aq(Object var0, sg var1, int var2) {
      try {
         ss var3 = al(var0.getClass(), -1458293291);
         var3.af(var0, var1, -1451264347);
      } catch (RuntimeException var4) {
         throw db.an(var4, "sh.aq(" + ')');
      }
   }
}
