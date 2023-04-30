import accessors.RSCollisionMap;

public class if implements RSCollisionMap {
   static final int ad = 19136782;
   static final int an = 2;
   static final int ay = 1024;
   static final int au = 16;
   static final int aa = 512;
   static final int af = 1;
   static final int ah = 32768;
   static final int aw = 4;
   int bz;
   static final int am = 262144;
   int bm;
   int bd;
   int bt;
   public int[][] bj;

   void ae(int var1, int var2, int var3) {
      int[] var10000 = this.bj[var1];
      var10000[var2] |= var3;
   }

   public void am(int var1, int var2) {
      var1 -= this.bz * -1620221059;
      var2 -= 409488021 * this.bm;
      int[] var10000 = this.bj[var1];
      var10000[var2] |= 308761946;
   }

   public void an(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         var1 -= 1724654229 * this.bz;
         var2 -= -216630539 * this.bm;
         if (0 == var3) {
            if (var6 != -2067452311) {
               throw new IllegalStateException();
            }

            if (var4 == 0) {
               this.ab(var1, var2, 128, -1980468475);
               this.ab(var1 - 1, var2, 8, -592915122);
            }

            if (var4 == 1) {
               if (var6 != -2067452311) {
                  return;
               }

               this.ab(var1, var2, 2, 1894082229);
               this.ab(var1, 1 + var2, 32, -2136189270);
            }

            if (2 == var4) {
               if (var6 != -2067452311) {
                  throw new IllegalStateException();
               }

               this.ab(var1, var2, 8, -220385584);
               this.ab(1 + var1, var2, 128, -183667112);
            }

            if (3 == var4) {
               this.ab(var1, var2, 32, 1094018251);
               this.ab(var1, var2 - 1, 2, 997248202);
            }
         }

         label261: {
            if (1 != var3) {
               if (var6 != -2067452311) {
                  throw new IllegalStateException();
               }

               if (3 != var3) {
                  break label261;
               }
            }

            if (0 == var4) {
               if (var6 != -2067452311) {
                  throw new IllegalStateException();
               }

               this.ab(var1, var2, 1, 1270556798);
               this.ab(var1 - 1, var2 + 1, 16, -1904420287);
            }

            if (var4 == 1) {
               this.ab(var1, var2, 4, -1234074317);
               this.ab(var1 + 1, var2 + 1, 64, -326624685);
            }

            if (var4 == 2) {
               if (var6 != -2067452311) {
                  return;
               }

               this.ab(var1, var2, 16, 498800564);
               this.ab(1 + var1, var2 - 1, 1, 858439809);
            }

            if (var4 == 3) {
               if (var6 != -2067452311) {
                  throw new IllegalStateException();
               }

               this.ab(var1, var2, 64, 209585500);
               this.ab(var1 - 1, var2 - 1, 4, 1638247877);
            }
         }

         if (var3 == 2) {
            if (var6 != -2067452311) {
               return;
            }

            if (var4 == 0) {
               if (var6 != -2067452311) {
                  throw new IllegalStateException();
               }

               this.ab(var1, var2, 130, -1812573145);
               this.ab(var1 - 1, var2, 8, 1536765730);
               this.ab(var1, var2 + 1, 32, 35369921);
            }

            if (var4 == 1) {
               if (var6 != -2067452311) {
                  return;
               }

               this.ab(var1, var2, 10, 1486820658);
               this.ab(var1, 1 + var2, 32, -1027553383);
               this.ab(1 + var1, var2, 128, 2030351546);
            }

            if (2 == var4) {
               if (var6 != -2067452311) {
                  throw new IllegalStateException();
               }

               this.ab(var1, var2, 40, 434307567);
               this.ab(var1 + 1, var2, 128, -1256562631);
               this.ab(var1, var2 - 1, 2, 1006837730);
            }

            if (3 == var4) {
               if (var6 != -2067452311) {
                  throw new IllegalStateException();
               }

               this.ab(var1, var2, 160, 341240436);
               this.ab(var1, var2 - 1, 2, -2066786685);
               this.ab(var1 - 1, var2, 8, -454639093);
            }
         }

         if (var5) {
            if (var6 != -2067452311) {
               return;
            }

            if (var3 == 0) {
               if (var6 != -2067452311) {
                  throw new IllegalStateException();
               }

               if (var4 == 0) {
                  if (var6 != -2067452311) {
                     return;
                  }

                  this.ab(var1, var2, 65536, 1844003045);
                  this.ab(var1 - 1, var2, 4096, 874984966);
               }

               if (1 == var4) {
                  if (var6 != -2067452311) {
                     throw new IllegalStateException();
                  }

                  this.ab(var1, var2, 1024, -1071472855);
                  this.ab(var1, 1 + var2, 16384, 1174893417);
               }

               if (2 == var4) {
                  this.ab(var1, var2, 4096, -1439893867);
                  this.ab(var1 + 1, var2, 65536, 89246651);
               }

               if (var4 == 3) {
                  if (var6 != -2067452311) {
                     throw new IllegalStateException();
                  }

                  this.ab(var1, var2, 16384, 1634280093);
                  this.ab(var1, var2 - 1, 1024, -1166486366);
               }
            }

            label265: {
               if (1 != var3) {
                  if (var6 != -2067452311) {
                     throw new IllegalStateException();
                  }

                  if (var3 != 3) {
                     break label265;
                  }

                  if (var6 != -2067452311) {
                     throw new IllegalStateException();
                  }
               }

               if (0 == var4) {
                  if (var6 != -2067452311) {
                     return;
                  }

                  this.ab(var1, var2, 512, 893708024);
                  this.ab(var1 - 1, 1 + var2, 8192, -1431506838);
               }

               if (var4 == 1) {
                  if (var6 != -2067452311) {
                     throw new IllegalStateException();
                  }

                  this.ab(var1, var2, 2048, 476418732);
                  this.ab(var1 + 1, 1 + var2, 32768, 246927257);
               }

               if (var4 == 2) {
                  if (var6 != -2067452311) {
                     throw new IllegalStateException();
                  }

                  this.ab(var1, var2, 8192, 1572848674);
                  this.ab(var1 + 1, var2 - 1, 512, 560233341);
               }

               if (3 == var4) {
                  if (var6 != -2067452311) {
                     throw new IllegalStateException();
                  }

                  this.ab(var1, var2, 32768, -1079157197);
                  this.ab(var1 - 1, var2 - 1, 2048, 1897101757);
               }
            }

            if (var3 == 2) {
               if (var6 != -2067452311) {
                  throw new IllegalStateException();
               }

               if (0 == var4) {
                  if (var6 != -2067452311) {
                     return;
                  }

                  this.ab(var1, var2, 66560, 1561574969);
                  this.ab(var1 - 1, var2, 4096, 1350801642);
                  this.ab(var1, 1 + var2, 16384, -1245887714);
               }

               if (var4 == 1) {
                  this.ab(var1, var2, 5120, -254740978);
                  this.ab(var1, 1 + var2, 16384, -1540737681);
                  this.ab(1 + var1, var2, 65536, -1556821189);
               }

               if (var4 == 2) {
                  if (var6 != -2067452311) {
                     throw new IllegalStateException();
                  }

                  this.ab(var1, var2, 20480, -1991368599);
                  this.ab(var1 + 1, var2, 65536, -718694627);
                  this.ab(var1, var2 - 1, 1024, 921676810);
               }

               if (var4 == 3) {
                  if (var6 != -2067452311) {
                     throw new IllegalStateException();
                  }

                  this.ab(var1, var2, 81920, -163566198);
                  this.ab(var1, var2 - 1, 1024, -55441375);
                  this.ab(var1 - 1, var2, 4096, -1792327412);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "if.an(" + ')');
      }
   }

   public void bi(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 += 131072;
      }

      var1 -= this.bz * 1724654229;
      var2 -= this.bm * -216630539;
      int var8;
      if (1 == var5 || var5 == 3) {
         var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for(var8 = var1; var8 < var3 + var1; ++var8) {
         if (var8 >= 0 && var8 < this.bd * 1145675465) {
            for(int var9 = var2; var9 < var4 + var2; ++var9) {
               if (var9 >= 0 && var9 < -1150578375 * this.bt) {
                  this.at(var8, var9, var7, 1835747327);
               }
            }
         }
      }

   }

   public void ac(int var1, int var2, byte var3) {
      try {
         var1 -= this.bz * 1724654229;
         var2 -= -216630539 * this.bm;
         int[] var10000 = this.bj[var1];
         var10000[var2] |= 2097152;
      } catch (RuntimeException var4) {
         throw db.an(var4, "if.ac(" + ')');
      }
   }

   public void au(int var1, int var2, int var3) {
      try {
         var1 -= 1724654229 * this.bz;
         var2 -= this.bm * -216630539;
         int[] var10000 = this.bj[var1];
         var10000[var2] |= 262144;
      } catch (RuntimeException var4) {
         throw db.an(var4, "if.au(" + ')');
      }
   }

   void ab(int var1, int var2, int var3, int var4) {
      try {
         int[] var10000 = this.bj[var1];
         var10000[var2] |= var3;
      } catch (RuntimeException var5) {
         throw db.an(var5, "if.ab(" + ')');
      }
   }

   public void aq(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         var1 -= this.bz * 1724654229;
         var2 -= -216630539 * this.bm;
         if (var3 == 0) {
            if (var6 >= -453940114) {
               throw new IllegalStateException();
            }

            if (var4 == 0) {
               if (var6 >= -453940114) {
                  return;
               }

               this.at(var1, var2, 128, 1835747327);
               this.at(var1 - 1, var2, 8, 1835747327);
            }

            if (1 == var4) {
               if (var6 >= -453940114) {
                  return;
               }

               this.at(var1, var2, 2, 1835747327);
               this.at(var1, 1 + var2, 32, 1835747327);
            }

            if (var4 == 2) {
               if (var6 >= -453940114) {
                  throw new IllegalStateException();
               }

               this.at(var1, var2, 8, 1835747327);
               this.at(1 + var1, var2, 128, 1835747327);
            }

            if (var4 == 3) {
               this.at(var1, var2, 32, 1835747327);
               this.at(var1, var2 - 1, 2, 1835747327);
            }
         }

         label259: {
            if (var3 != 1) {
               if (var3 != 3) {
                  break label259;
               }

               if (var6 >= -453940114) {
                  throw new IllegalStateException();
               }
            }

            if (0 == var4) {
               this.at(var1, var2, 1, 1835747327);
               this.at(var1 - 1, var2 + 1, 16, 1835747327);
            }

            if (1 == var4) {
               if (var6 >= -453940114) {
                  throw new IllegalStateException();
               }

               this.at(var1, var2, 4, 1835747327);
               this.at(var1 + 1, var2 + 1, 64, 1835747327);
            }

            if (var4 == 2) {
               if (var6 >= -453940114) {
                  return;
               }

               this.at(var1, var2, 16, 1835747327);
               this.at(var1 + 1, var2 - 1, 1, 1835747327);
            }

            if (var4 == 3) {
               if (var6 >= -453940114) {
                  return;
               }

               this.at(var1, var2, 64, 1835747327);
               this.at(var1 - 1, var2 - 1, 4, 1835747327);
            }
         }

         if (var3 == 2) {
            if (var6 >= -453940114) {
               throw new IllegalStateException();
            }

            if (0 == var4) {
               if (var6 >= -453940114) {
                  throw new IllegalStateException();
               }

               this.at(var1, var2, 130, 1835747327);
               this.at(var1 - 1, var2, 8, 1835747327);
               this.at(var1, 1 + var2, 32, 1835747327);
            }

            if (var4 == 1) {
               this.at(var1, var2, 10, 1835747327);
               this.at(var1, var2 + 1, 32, 1835747327);
               this.at(var1 + 1, var2, 128, 1835747327);
            }

            if (var4 == 2) {
               if (var6 >= -453940114) {
                  throw new IllegalStateException();
               }

               this.at(var1, var2, 40, 1835747327);
               this.at(var1 + 1, var2, 128, 1835747327);
               this.at(var1, var2 - 1, 2, 1835747327);
            }

            if (3 == var4) {
               if (var6 >= -453940114) {
                  throw new IllegalStateException();
               }

               this.at(var1, var2, 160, 1835747327);
               this.at(var1, var2 - 1, 2, 1835747327);
               this.at(var1 - 1, var2, 8, 1835747327);
            }
         }

         if (var5) {
            if (var6 >= -453940114) {
               throw new IllegalStateException();
            }

            if (var3 == 0) {
               if (var6 >= -453940114) {
                  return;
               }

               if (var4 == 0) {
                  if (var6 >= -453940114) {
                     throw new IllegalStateException();
                  }

                  this.at(var1, var2, 65536, 1835747327);
                  this.at(var1 - 1, var2, 4096, 1835747327);
               }

               if (1 == var4) {
                  if (var6 >= -453940114) {
                     return;
                  }

                  this.at(var1, var2, 1024, 1835747327);
                  this.at(var1, var2 + 1, 16384, 1835747327);
               }

               if (var4 == 2) {
                  if (var6 >= -453940114) {
                     throw new IllegalStateException();
                  }

                  this.at(var1, var2, 4096, 1835747327);
                  this.at(var1 + 1, var2, 65536, 1835747327);
               }

               if (var4 == 3) {
                  if (var6 >= -453940114) {
                     throw new IllegalStateException();
                  }

                  this.at(var1, var2, 16384, 1835747327);
                  this.at(var1, var2 - 1, 1024, 1835747327);
               }
            }

            label263: {
               if (1 != var3) {
                  if (var3 != 3) {
                     break label263;
                  }

                  if (var6 >= -453940114) {
                     throw new IllegalStateException();
                  }
               }

               if (var4 == 0) {
                  if (var6 >= -453940114) {
                     throw new IllegalStateException();
                  }

                  this.at(var1, var2, 512, 1835747327);
                  this.at(var1 - 1, var2 + 1, 8192, 1835747327);
               }

               if (var4 == 1) {
                  this.at(var1, var2, 2048, 1835747327);
                  this.at(var1 + 1, var2 + 1, 32768, 1835747327);
               }

               if (2 == var4) {
                  if (var6 >= -453940114) {
                     throw new IllegalStateException();
                  }

                  this.at(var1, var2, 8192, 1835747327);
                  this.at(var1 + 1, var2 - 1, 512, 1835747327);
               }

               if (3 == var4) {
                  if (var6 >= -453940114) {
                     return;
                  }

                  this.at(var1, var2, 32768, 1835747327);
                  this.at(var1 - 1, var2 - 1, 2048, 1835747327);
               }
            }

            if (var3 == 2) {
               if (0 == var4) {
                  if (var6 >= -453940114) {
                     throw new IllegalStateException();
                  }

                  this.at(var1, var2, 66560, 1835747327);
                  this.at(var1 - 1, var2, 4096, 1835747327);
                  this.at(var1, 1 + var2, 16384, 1835747327);
               }

               if (1 == var4) {
                  if (var6 >= -453940114) {
                     return;
                  }

                  this.at(var1, var2, 5120, 1835747327);
                  this.at(var1, var2 + 1, 16384, 1835747327);
                  this.at(var1 + 1, var2, 65536, 1835747327);
               }

               if (2 == var4) {
                  if (var6 >= -453940114) {
                     throw new IllegalStateException();
                  }

                  this.at(var1, var2, 20480, 1835747327);
                  this.at(1 + var1, var2, 65536, 1835747327);
                  this.at(var1, var2 - 1, 1024, 1835747327);
               }

               if (3 == var4) {
                  if (var6 >= -453940114) {
                     return;
                  }

                  this.at(var1, var2, 81920, 1835747327);
                  this.at(var1, var2 - 1, 1024, 1835747327);
                  this.at(var1 - 1, var2, 4096, 1835747327);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw db.an(var7, "if.aq(" + ')');
      }
   }

   public if(int var1, int var2) {
      try {
         super();
         this.bz = 0;
         this.bm = 0;
         this.bd = var1 * 1684986745;
         this.bt = -2120741623 * var2;
         this.bj = new int[this.bd * 1145675465][this.bt * -1150578375];
         this.af(1836692462);
      } catch (RuntimeException var3) {
         throw db.an(var3, "if.<init>(" + ')');
      }
   }

   void at(int var1, int var2, int var3, int var4) {
      try {
         int[] var10000 = this.bj[var1];
         var10000[var2] &= ~var3;
      } catch (RuntimeException var5) {
         throw db.an(var5, "if.at(" + ')');
      }
   }

   public void aa(int var1, int var2, int var3) {
      try {
         var1 -= 1724654229 * this.bz;
         var2 -= -216630539 * this.bm;
         int[] var10000 = this.bj[var1];
         var10000[var2] &= -262145;
      } catch (RuntimeException var4) {
         throw db.an(var4, "if.aa(" + ')');
      }
   }

   public void ay() {
      for(int var1 = 0; var1 < 1145675465 * this.bd; ++var1) {
         for(int var2 = 0; var2 < this.bt * -1150578375; ++var2) {
            if (var1 != 0 && 0 != var2 && var1 < this.bd * 1145675465 - 5 && var2 < this.bt * -1150578375 - 5) {
               this.bj[var1][var2] = 16777216;
            } else {
               this.bj[var1][var2] = 16777215;
            }
         }
      }

   }

   public void aw(int var1, int var2, int var3, int var4, boolean var5, byte var6) {
      try {
         int var7 = 256;
         if (var5) {
            if (var6 >= 0) {
               return;
            }

            var7 += 131072;
         }

         var1 -= this.bz * 1724654229;
         var2 -= -216630539 * this.bm;

         for(int var8 = var1; var8 < var1 + var3; ++var8) {
            if (var6 >= 0) {
               return;
            }

            if (var8 >= 0) {
               if (var6 >= 0) {
                  throw new IllegalStateException();
               }

               if (var8 < 1145675465 * this.bd) {
                  if (var6 >= 0) {
                     throw new IllegalStateException();
                  }

                  for(int var9 = var2; var9 < var4 + var2; ++var9) {
                     if (var6 >= 0) {
                        return;
                     }

                     if (var9 >= 0) {
                        if (var6 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (var9 < -1150578375 * this.bt) {
                           if (var6 >= 0) {
                              throw new IllegalStateException();
                           }

                           this.ab(var8, var9, var7, -617613217);
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var10) {
         throw db.an(var10, "if.aw(" + ')');
      }
   }

   public void ax(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= 1724654229 * this.bz;
      var2 -= -216630539 * this.bm;
      if (0 == var3) {
         if (var4 == 0) {
            this.ab(var1, var2, 128, -450570053);
            this.ab(var1 - 1, var2, 8, -705207428);
         }

         if (var4 == 1) {
            this.ab(var1, var2, 2, -913335823);
            this.ab(var1, 1 + var2, 32, 2006702046);
         }

         if (2 == var4) {
            this.ab(var1, var2, 8, 802894547);
            this.ab(1 + var1, var2, 128, -1392454743);
         }

         if (3 == var4) {
            this.ab(var1, var2, 32, -933050866);
            this.ab(var1, var2 - 1, 2, 1698191276);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (0 == var4) {
            this.ab(var1, var2, 1, -287913576);
            this.ab(var1 - 1, var2 + 1, 16, -1175165017);
         }

         if (var4 == 1) {
            this.ab(var1, var2, 4, 1225151041);
            this.ab(var1 + 1, var2 + 1, 64, -2096453538);
         }

         if (var4 == 2) {
            this.ab(var1, var2, 16, -234387390);
            this.ab(1 + var1, var2 - 1, 1, -1801859421);
         }

         if (var4 == 3) {
            this.ab(var1, var2, 64, 1407767757);
            this.ab(var1 - 1, var2 - 1, 4, 1249701739);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.ab(var1, var2, 130, 555571354);
            this.ab(var1 - 1, var2, 8, -932593446);
            this.ab(var1, var2 + 1, 32, 1970289536);
         }

         if (var4 == 1) {
            this.ab(var1, var2, 10, 349690967);
            this.ab(var1, 1 + var2, 32, -311204615);
            this.ab(1 + var1, var2, 128, 2124419479);
         }

         if (2 == var4) {
            this.ab(var1, var2, 40, -199807556);
            this.ab(var1 + 1, var2, 128, 857987765);
            this.ab(var1, var2 - 1, 2, -1453221305);
         }

         if (3 == var4) {
            this.ab(var1, var2, 160, 1035862328);
            this.ab(var1, var2 - 1, 2, 873770609);
            this.ab(var1 - 1, var2, 8, 440304683);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.ab(var1, var2, 65536, 863791611);
               this.ab(var1 - 1, var2, 4096, 1682231082);
            }

            if (1 == var4) {
               this.ab(var1, var2, 1024, 395705888);
               this.ab(var1, 1 + var2, 16384, -580103569);
            }

            if (2 == var4) {
               this.ab(var1, var2, 4096, -1387607008);
               this.ab(var1 + 1, var2, 65536, -177173528);
            }

            if (var4 == 3) {
               this.ab(var1, var2, 16384, 59948249);
               this.ab(var1, var2 - 1, 1024, 850301250);
            }
         }

         if (1 == var3 || var3 == 3) {
            if (0 == var4) {
               this.ab(var1, var2, 512, 1576698190);
               this.ab(var1 - 1, 1 + var2, 8192, 1606101758);
            }

            if (var4 == 1) {
               this.ab(var1, var2, 2048, 709053500);
               this.ab(var1 + 1, 1 + var2, 32768, 1562742907);
            }

            if (var4 == 2) {
               this.ab(var1, var2, 8192, 1788515499);
               this.ab(var1 + 1, var2 - 1, 512, 368039179);
            }

            if (3 == var4) {
               this.ab(var1, var2, 32768, -717131397);
               this.ab(var1 - 1, var2 - 1, 2048, -1698228738);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.ab(var1, var2, 66560, -1234952717);
               this.ab(var1 - 1, var2, 4096, 613841336);
               this.ab(var1, 1 + var2, 16384, -1571080363);
            }

            if (var4 == 1) {
               this.ab(var1, var2, 5120, 330371007);
               this.ab(var1, 1 + var2, 16384, 110707564);
               this.ab(1 + var1, var2, 65536, 1585422789);
            }

            if (var4 == 2) {
               this.ab(var1, var2, 20480, -14675941);
               this.ab(var1 + 1, var2, 65536, -899643965);
               this.ab(var1, var2 - 1, 1024, 1854045168);
            }

            if (var4 == 3) {
               this.ab(var1, var2, 81920, 1278771453);
               this.ab(var1, var2 - 1, 1024, -1473235025);
               this.ab(var1 - 1, var2, 4096, -1391145954);
            }
         }
      }

   }

   public void ai(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= 1604314777 * this.bz;
      var2 -= 38866972 * this.bm;
      if (0 == var3) {
         if (var4 == 0) {
            this.ab(var1, var2, 128, 286396647);
            this.ab(var1 - 1, var2, 8, -1154529219);
         }

         if (var4 == 1) {
            this.ab(var1, var2, 2, -1974053505);
            this.ab(var1, 1 + var2, -108092454, -1448676108);
         }

         if (2 == var4) {
            this.ab(var1, var2, 8, 1857413192);
            this.ab(1 + var1, var2, 128, -1706051729);
         }

         if (3 == var4) {
            this.ab(var1, var2, 32, 477322893);
            this.ab(var1, var2 - 1, 2, -2044886405);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (0 == var4) {
            this.ab(var1, var2, 1, -1092657505);
            this.ab(var1 - 1, var2 + 1, 16, -1025511532);
         }

         if (var4 == 1) {
            this.ab(var1, var2, 4, 574928745);
            this.ab(var1 + 1, var2 + 1, 64, 1094998263);
         }

         if (var4 == 2) {
            this.ab(var1, var2, 16, 1036638465);
            this.ab(1 + var1, var2 - 1, 1, 1566934196);
         }

         if (var4 == 3) {
            this.ab(var1, var2, -1021203354, -1056139725);
            this.ab(var1 - 1, var2 - 1, 4, -544149316);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.ab(var1, var2, -139901821, -536414440);
            this.ab(var1 - 1, var2, 8, -1017458705);
            this.ab(var1, var2 + 1, 32, -400251747);
         }

         if (var4 == 1) {
            this.ab(var1, var2, 10, -912603089);
            this.ab(var1, 1 + var2, -673741079, -2040955620);
            this.ab(1 + var1, var2, 128, 259817839);
         }

         if (2 == var4) {
            this.ab(var1, var2, 2135490442, 1216537063);
            this.ab(var1 + 1, var2, 128, 1114641860);
            this.ab(var1, var2 - 1, 2, -1788457513);
         }

         if (3 == var4) {
            this.ab(var1, var2, 160, -8949134);
            this.ab(var1, var2 - 1, 2, 1865991392);
            this.ab(var1 - 1, var2, 8, -49366529);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.ab(var1, var2, 65536, -1111249760);
               this.ab(var1 - 1, var2, -203365346, 1522448196);
            }

            if (1 == var4) {
               this.ab(var1, var2, 1024, 267689450);
               this.ab(var1, 1 + var2, -2121376844, 2034856310);
            }

            if (2 == var4) {
               this.ab(var1, var2, 4096, -907100321);
               this.ab(var1 + 1, var2, -37271659, -1018039998);
            }

            if (var4 == 3) {
               this.ab(var1, var2, 16384, 630012149);
               this.ab(var1, var2 - 1, 506784169, -1855895859);
            }
         }

         if (1 == var3 || var3 == 3) {
            if (0 == var4) {
               this.ab(var1, var2, 512, 1890537614);
               this.ab(var1 - 1, 1 + var2, 8192, -1506025257);
            }

            if (var4 == 1) {
               this.ab(var1, var2, 2048, 1201651587);
               this.ab(var1 + 1, 1 + var2, -1970339212, -2103753543);
            }

            if (var4 == 2) {
               this.ab(var1, var2, 8192, 1936838965);
               this.ab(var1 + 1, var2 - 1, 512, -225364095);
            }

            if (3 == var4) {
               this.ab(var1, var2, 23019969, 1833425570);
               this.ab(var1 - 1, var2 - 1, -1805842461, -1139120131);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.ab(var1, var2, 66560, -1189111059);
               this.ab(var1 - 1, var2, 4096, 1320659404);
               this.ab(var1, 1 + var2, -1557709904, 1308234996);
            }

            if (var4 == 1) {
               this.ab(var1, var2, 5120, -532295314);
               this.ab(var1, 1 + var2, 16384, -1627557411);
               this.ab(1 + var1, var2, 65536, -1262665388);
            }

            if (var4 == 2) {
               this.ab(var1, var2, 1501135658, -1433895768);
               this.ab(var1 + 1, var2, -1713690686, -1509738511);
               this.ab(var1, var2 - 1, 1318678631, 1645758143);
            }

            if (var4 == 3) {
               this.ab(var1, var2, 81920, -1350046009);
               this.ab(var1, var2 - 1, 349074860, 22644097);
               this.ab(var1 - 1, var2, 1179416097, -1475503494);
            }
         }
      }

   }

   public void ag(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = -13403639;
      if (var5) {
         var6 += 131072;
      }

      var1 -= this.bz * -1604166768;
      var2 -= 1263255970 * this.bm;

      for(int var7 = var1; var7 < var1 + var3; ++var7) {
         if (var7 >= 0 && var7 < 1240922597 * this.bd) {
            for(int var8 = var2; var8 < var4 + var2; ++var8) {
               if (var8 >= 0 && var8 < 1097750985 * this.bt) {
                  this.ab(var7, var8, var6, 1288190170);
               }
            }
         }
      }

   }

   public void ah(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if (var5) {
         var6 += 131072;
      }

      var1 -= this.bz * 1724654229;
      var2 -= -216630539 * this.bm;

      for(int var7 = var1; var7 < var1 + var3; ++var7) {
         if (var7 >= 0 && var7 < 1145675465 * this.bd) {
            for(int var8 = var2; var8 < var4 + var2; ++var8) {
               if (var8 >= 0 && var8 < -1150578375 * this.bt) {
                  this.ab(var7, var8, var6, -475702304);
               }
            }
         }
      }

   }

   public void av(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if (var5) {
         var6 += 131072;
      }

      var1 -= this.bz * 1724654229;
      var2 -= -216630539 * this.bm;

      for(int var7 = var1; var7 < var1 + var3; ++var7) {
         if (var7 >= 0 && var7 < 1145675465 * this.bd) {
            for(int var8 = var2; var8 < var4 + var2; ++var8) {
               if (var8 >= 0 && var8 < -1150578375 * this.bt) {
                  this.ab(var7, var8, var6, -1982256434);
               }
            }
         }
      }

   }

   public void ar(int var1, int var2) {
      var1 -= this.bz * 1724654229;
      var2 -= -216630539 * this.bm;
      int[] var10000 = this.bj[var1];
      var10000[var2] |= 2097152;
   }

   void bo(int var1, int var2, int var3) {
      int[] var10000 = this.bj[var1];
      var10000[var2] &= ~var3;
   }

   public void as(int var1, int var2) {
      var1 -= this.bz * 1724654229;
      var2 -= -216630539 * this.bm;
      int[] var10000 = this.bj[var1];
      var10000[var2] |= 2097152;
   }

   public void aj(int var1, int var2) {
      var1 -= 1724654229 * this.bz;
      var2 -= this.bm * -216630539;
      int[] var10000 = this.bj[var1];
      var10000[var2] |= 262144;
   }

   public void ak(int var1, int var2) {
      var1 -= 1724654229 * this.bz;
      var2 -= this.bm * -216630539;
      int[] var10000 = this.bj[var1];
      var10000[var2] |= 262144;
   }

   public void az(int var1, int var2) {
      var1 -= 1724654229 * this.bz;
      var2 -= this.bm * -216630539;
      int[] var10000 = this.bj[var1];
      var10000[var2] |= 262144;
   }

   void ad(int var1, int var2, int var3) {
      int[] var10000 = this.bj[var1];
      var10000[var2] |= var3;
   }

   public void af(int var1) {
      try {
         for(int var2 = 0; var2 < 1145675465 * this.bd; ++var2) {
            if (var1 <= 1581872191) {
               return;
            }

            for(int var3 = 0; var3 < this.bt * -1150578375; ++var3) {
               if (var2 != 0 && 0 != var3) {
                  if (var1 <= 1581872191) {
                     throw new IllegalStateException();
                  }

                  if (var2 < this.bd * 1145675465 - 5) {
                     if (var1 <= 1581872191) {
                        throw new IllegalStateException();
                     }

                     if (var3 < this.bt * -1150578375 - 5) {
                        this.bj[var2][var3] = 16777216;
                        continue;
                     }

                     if (var1 <= 1581872191) {
                        throw new IllegalStateException();
                     }
                  }
               }

               this.bj[var2][var3] = 16777215;
            }
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "if.af(" + ')');
      }
   }

   void ap(int var1, int var2, int var3) {
      int[] var10000 = this.bj[var1];
      var10000[var2] |= var3;
   }

   public void al(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      try {
         int var8 = 256;
         if (var6) {
            if (var7 >= 1873871214) {
               return;
            }

            var8 += 131072;
         }

         int var9;
         label84: {
            var1 -= this.bz * 1724654229;
            var2 -= this.bm * -216630539;
            if (1 != var5) {
               if (var7 >= 1873871214) {
                  throw new IllegalStateException();
               }

               if (var5 != 3) {
                  break label84;
               }

               if (var7 >= 1873871214) {
                  throw new IllegalStateException();
               }
            }

            var9 = var3;
            var3 = var4;
            var4 = var9;
         }

         for(var9 = var1; var9 < var3 + var1; ++var9) {
            if (var7 >= 1873871214) {
               throw new IllegalStateException();
            }

            if (var9 >= 0) {
               if (var7 >= 1873871214) {
                  throw new IllegalStateException();
               }

               if (var9 < this.bd * 1145675465) {
                  if (var7 >= 1873871214) {
                     throw new IllegalStateException();
                  }

                  for(int var10 = var2; var10 < var4 + var2; ++var10) {
                     if (var7 >= 1873871214) {
                        throw new IllegalStateException();
                     }

                     if (var10 >= 0) {
                        if (var7 >= 1873871214) {
                           throw new IllegalStateException();
                        }

                        if (var10 < -1150578375 * this.bt) {
                           if (var7 >= 1873871214) {
                              throw new IllegalStateException();
                           }

                           this.at(var9, var10, var8, 1835747327);
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var11) {
         throw db.an(var11, "if.al(" + ')');
      }
   }

   static void hy(int var0, int var1, int var2) {
      try {
         if (aj.vb.am(678255359) != 0) {
            if (var2 != 1287836101) {
               throw new IllegalStateException();
            }

            if (-1 != var0) {
               if (var2 != 1287836101) {
                  throw new IllegalStateException();
               }

               cq.aw(hc.ff, var0, 0, aj.vb.am(-1320951377), false, -1962828137);
               client.tf = true;
            }
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "if.hy(" + ')');
      }
   }

   void bx(int var1, int var2, int var3) {
      int[] var10000 = this.bj[var1];
      var10000[var2] &= ~var3;
   }

   public void ao(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= -136375268 * this.bz;
      var2 -= -216630539 * this.bm;
      if (0 == var3) {
         if (var4 == 0) {
            this.ab(var1, var2, 128, 709883260);
            this.ab(var1 - 1, var2, 8, 1963037027);
         }

         if (var4 == 1) {
            this.ab(var1, var2, 2, 1384319882);
            this.ab(var1, 1 + var2, 32, 537310929);
         }

         if (2 == var4) {
            this.ab(var1, var2, 8, 1434662220);
            this.ab(1 + var1, var2, 1441280386, -891196837);
         }

         if (3 == var4) {
            this.ab(var1, var2, 1701835372, -231070762);
            this.ab(var1, var2 - 1, 2, -1540621355);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (0 == var4) {
            this.ab(var1, var2, 1, 1473699266);
            this.ab(var1 - 1, var2 + 1, 16, 61352518);
         }

         if (var4 == 1) {
            this.ab(var1, var2, 4, 1198321348);
            this.ab(var1 + 1, var2 + 1, 1014977790, -2107292175);
         }

         if (var4 == 2) {
            this.ab(var1, var2, 16, 2129461302);
            this.ab(1 + var1, var2 - 1, 1, 111960943);
         }

         if (var4 == 3) {
            this.ab(var1, var2, 64, 1023699633);
            this.ab(var1 - 1, var2 - 1, 4, 1818406840);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.ab(var1, var2, 130, -289779567);
            this.ab(var1 - 1, var2, 8, 327349556);
            this.ab(var1, var2 + 1, 1582684661, -2072391280);
         }

         if (var4 == 1) {
            this.ab(var1, var2, 10, -1118805554);
            this.ab(var1, 1 + var2, 32, -1381898419);
            this.ab(1 + var1, var2, -315882283, -1896505855);
         }

         if (2 == var4) {
            this.ab(var1, var2, 40, 145521377);
            this.ab(var1 + 1, var2, -745741292, -1369160471);
            this.ab(var1, var2 - 1, 2, 2072462191);
         }

         if (3 == var4) {
            this.ab(var1, var2, -1319917346, -1384526510);
            this.ab(var1, var2 - 1, 2, 1020394931);
            this.ab(var1 - 1, var2, 8, -659557428);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.ab(var1, var2, -324637307, 73305234);
               this.ab(var1 - 1, var2, 1435435643, -1829784139);
            }

            if (1 == var4) {
               this.ab(var1, var2, -749539774, 1485345448);
               this.ab(var1, 1 + var2, 16384, 1350495565);
            }

            if (2 == var4) {
               this.ab(var1, var2, 4096, -2017258275);
               this.ab(var1 + 1, var2, -169385526, -1334731067);
            }

            if (var4 == 3) {
               this.ab(var1, var2, 16384, -1424771599);
               this.ab(var1, var2 - 1, 488716263, -410450353);
            }
         }

         if (1 == var3 || var3 == 3) {
            if (0 == var4) {
               this.ab(var1, var2, 842039010, -1206117621);
               this.ab(var1 - 1, 1 + var2, -1422254481, 2046523183);
            }

            if (var4 == 1) {
               this.ab(var1, var2, 2048, 1758136653);
               this.ab(var1 + 1, 1 + var2, 32768, -2076107832);
            }

            if (var4 == 2) {
               this.ab(var1, var2, -620182334, 1557646433);
               this.ab(var1 + 1, var2 - 1, 512, -21846353);
            }

            if (3 == var4) {
               this.ab(var1, var2, 222301457, -1362921971);
               this.ab(var1 - 1, var2 - 1, 2048, -41417541);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.ab(var1, var2, 1773541390, 742688443);
               this.ab(var1 - 1, var2, -474998065, 2140545043);
               this.ab(var1, 1 + var2, 21329084, -239431918);
            }

            if (var4 == 1) {
               this.ab(var1, var2, 5120, -1962163138);
               this.ab(var1, 1 + var2, -659676393, 1519409792);
               this.ab(1 + var1, var2, 485821977, -782322890);
            }

            if (var4 == 2) {
               this.ab(var1, var2, 20480, -1504955701);
               this.ab(var1 + 1, var2, 65536, -1684341899);
               this.ab(var1, var2 - 1, 1024, -2072589145);
            }

            if (var4 == 3) {
               this.ab(var1, var2, 613973027, 660053765);
               this.ab(var1, var2 - 1, 1024, -1451594436);
               this.ab(var1 - 1, var2, -1159969387, -1011573868);
            }
         }
      }

   }

   void bk(int var1, int var2, int var3) {
      int[] var10000 = this.bj[var1];
      var10000[var2] &= ~var3;
   }

   public void by(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.bz * 1724654229;
      var2 -= -216630539 * this.bm;
      if (var3 == 0) {
         if (var4 == 0) {
            this.at(var1, var2, 128, 1835747327);
            this.at(var1 - 1, var2, 8, 1835747327);
         }

         if (1 == var4) {
            this.at(var1, var2, 2, 1835747327);
            this.at(var1, 1 + var2, 32, 1835747327);
         }

         if (var4 == 2) {
            this.at(var1, var2, 8, 1835747327);
            this.at(1 + var1, var2, 128, 1835747327);
         }

         if (var4 == 3) {
            this.at(var1, var2, 32, 1835747327);
            this.at(var1, var2 - 1, 2, 1835747327);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (0 == var4) {
            this.at(var1, var2, 1, 1835747327);
            this.at(var1 - 1, var2 + 1, 16, 1835747327);
         }

         if (1 == var4) {
            this.at(var1, var2, 4, 1835747327);
            this.at(var1 + 1, var2 + 1, 64, 1835747327);
         }

         if (var4 == 2) {
            this.at(var1, var2, 16, 1835747327);
            this.at(var1 + 1, var2 - 1, 1, 1835747327);
         }

         if (var4 == 3) {
            this.at(var1, var2, 64, 1835747327);
            this.at(var1 - 1, var2 - 1, 4, 1835747327);
         }
      }

      if (var3 == 2) {
         if (0 == var4) {
            this.at(var1, var2, 130, 1835747327);
            this.at(var1 - 1, var2, 8, 1835747327);
            this.at(var1, 1 + var2, 32, 1835747327);
         }

         if (var4 == 1) {
            this.at(var1, var2, 10, 1835747327);
            this.at(var1, var2 + 1, 32, 1835747327);
            this.at(var1 + 1, var2, 128, 1835747327);
         }

         if (var4 == 2) {
            this.at(var1, var2, 40, 1835747327);
            this.at(var1 + 1, var2, 128, 1835747327);
            this.at(var1, var2 - 1, 2, 1835747327);
         }

         if (3 == var4) {
            this.at(var1, var2, 160, 1835747327);
            this.at(var1, var2 - 1, 2, 1835747327);
            this.at(var1 - 1, var2, 8, 1835747327);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.at(var1, var2, 65536, 1835747327);
               this.at(var1 - 1, var2, 4096, 1835747327);
            }

            if (1 == var4) {
               this.at(var1, var2, 1024, 1835747327);
               this.at(var1, var2 + 1, 16384, 1835747327);
            }

            if (var4 == 2) {
               this.at(var1, var2, 4096, 1835747327);
               this.at(var1 + 1, var2, 65536, 1835747327);
            }

            if (var4 == 3) {
               this.at(var1, var2, 16384, 1835747327);
               this.at(var1, var2 - 1, 1024, 1835747327);
            }
         }

         if (1 == var3 || var3 == 3) {
            if (var4 == 0) {
               this.at(var1, var2, 512, 1835747327);
               this.at(var1 - 1, var2 + 1, 8192, 1835747327);
            }

            if (var4 == 1) {
               this.at(var1, var2, 2048, 1835747327);
               this.at(var1 + 1, var2 + 1, 32768, 1835747327);
            }

            if (2 == var4) {
               this.at(var1, var2, 8192, 1835747327);
               this.at(var1 + 1, var2 - 1, 512, 1835747327);
            }

            if (3 == var4) {
               this.at(var1, var2, 32768, 1835747327);
               this.at(var1 - 1, var2 - 1, 2048, 1835747327);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.at(var1, var2, 66560, 1835747327);
               this.at(var1 - 1, var2, 4096, 1835747327);
               this.at(var1, 1 + var2, 16384, 1835747327);
            }

            if (1 == var4) {
               this.at(var1, var2, 5120, 1835747327);
               this.at(var1, var2 + 1, 16384, 1835747327);
               this.at(var1 + 1, var2, 65536, 1835747327);
            }

            if (2 == var4) {
               this.at(var1, var2, 20480, 1835747327);
               this.at(1 + var1, var2, 65536, 1835747327);
               this.at(var1, var2 - 1, 1024, 1835747327);
            }

            if (3 == var4) {
               this.at(var1, var2, 81920, 1835747327);
               this.at(var1, var2 - 1, 1024, 1835747327);
               this.at(var1 - 1, var2, 4096, 1835747327);
            }
         }
      }

   }

   public void bb(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 += 131072;
      }

      var1 -= this.bz * 1724654229;
      var2 -= this.bm * -216630539;
      int var8;
      if (1 == var5 || var5 == 3) {
         var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for(var8 = var1; var8 < var3 + var1; ++var8) {
         if (var8 >= 0 && var8 < this.bd * 1145675465) {
            for(int var9 = var2; var9 < var4 + var2; ++var9) {
               if (var9 >= 0 && var9 < -1150578375 * this.bt) {
                  this.at(var8, var9, var7, 1835747327);
               }
            }
         }
      }

   }

   public void bz(int var1, int var2) {
      var1 -= -869604221 * this.bz;
      var2 -= -783452397 * this.bm;
      int[] var10000 = this.bj[var1];
      var10000[var2] &= 1806837419;
   }

   void be(int var1, int var2, int var3) {
      int[] var10000 = this.bj[var1];
      var10000[var2] &= ~var3;
   }
}
