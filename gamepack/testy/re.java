import accessors.RSDesktopPlatformInfoProvider;

public class re implements rz, RSDesktopPlatformInfoProvider {
   int ac;
   static final String an = "\\.";
   int ab;
   int au;
   static final int af = 0;
   static int nj;

   void al(String var1) {
      if (var1.startsWith("1.")) {
         this.aw(var1, -813939375);
      } else {
         this.ac(var1, 125622295);
      }

   }

   public rv af(int var1) {
      try {
         byte var2;
         if (jb.aj.startsWith("win")) {
            var2 = 1;
         } else if (jb.aj.startsWith("mac")) {
            if (var1 == -589138) {
               throw new IllegalStateException();
            }

            var2 = 2;
         } else if (jb.aj.startsWith("linux")) {
            if (var1 == -589138) {
               throw new IllegalStateException();
            }

            var2 = 3;
         } else {
            var2 = 4;
         }

         String var3;
         try {
            var3 = System.getProperty("os.arch").toLowerCase();
         } catch (Exception var31) {
            var3 = "";
         }

         String var4;
         try {
            var4 = System.getProperty("os.version").toLowerCase();
         } catch (Exception var30) {
            var4 = "";
         }

         String var5 = "Unknown";
         String var6 = "1.1";

         try {
            var5 = System.getProperty("java.vendor");
            var6 = System.getProperty("java.version");
         } catch (Exception var29) {
         }

         boolean var7;
         label240: {
            if (!var3.startsWith("amd64")) {
               if (!var3.startsWith("x86_64")) {
                  var7 = false;
                  break label240;
               }

               if (var1 == -589138) {
                  throw new IllegalStateException();
               }
            }

            var7 = true;
         }

         byte var8 = 0;
         if (1 == var2) {
            if (var1 == -589138) {
               throw new IllegalStateException();
            }

            if (var4.indexOf("4.0") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 1;
            } else if (var4.indexOf("4.1") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 2;
            } else if (var4.indexOf("4.9") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 3;
            } else if (var4.indexOf("5.0") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 4;
            } else if (var4.indexOf("5.1") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 5;
            } else if (var4.indexOf("5.2") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 8;
            } else if (var4.indexOf("6.0") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 6;
            } else if (var4.indexOf("6.1") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 7;
            } else if (var4.indexOf("6.2") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 9;
            } else if (var4.indexOf("6.3") != -1) {
               var8 = 10;
            } else if (var4.indexOf("10.0") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 11;
            }
         } else if (2 == var2) {
            if (var1 == -589138) {
               throw new IllegalStateException();
            }

            if (var4.indexOf("10.4") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 20;
            } else if (var4.indexOf("10.5") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 21;
            } else if (var4.indexOf("10.6") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 22;
            } else if (var4.indexOf("10.7") != -1) {
               var8 = 23;
            } else if (var4.indexOf("10.8") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 24;
            } else if (var4.indexOf("10.9") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 25;
            } else if (var4.indexOf("10.10") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 26;
            } else if (var4.indexOf("10.11") != -1) {
               var8 = 27;
            } else if (var4.indexOf("10.12") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 28;
            } else if (var4.indexOf("10.13") != -1) {
               if (var1 == -589138) {
                  throw new IllegalStateException();
               }

               var8 = 29;
            }
         }

         byte var9;
         if (var5.toLowerCase().indexOf("sun") != -1) {
            if (var1 == -589138) {
               throw new IllegalStateException();
            }

            var9 = 1;
         } else if (var5.toLowerCase().indexOf("microsoft") != -1) {
            var9 = 2;
         } else if (var5.toLowerCase().indexOf("apple") != -1) {
            if (var1 == -589138) {
               throw new IllegalStateException();
            }

            var9 = 3;
         } else if (var5.toLowerCase().indexOf("oracle") != -1) {
            if (var1 == -589138) {
               throw new IllegalStateException();
            }

            var9 = 5;
         } else {
            var9 = 4;
         }

         this.an(var6, (short)-31175);
         boolean var10 = false;
         int var11 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
         int var12;
         if (this.ac * -1029607193 > 3) {
            if (var1 == -589138) {
               throw new IllegalStateException();
            }

            var12 = Runtime.getRuntime().availableProcessors();
         } else {
            var12 = 0;
         }

         byte var13 = 0;
         String var14 = "";
         String var15 = "";
         String var16 = "";
         String var17 = "";
         String var18 = "";
         String var19 = "";
         boolean var20 = false;
         boolean var21 = false;
         boolean var22 = false;
         boolean var23 = false;
         int[] var24 = new int[3];
         boolean var25 = false;
         String var26 = "";
         String var27 = "";
         boolean var28 = false;
         return new rv(var2, var7, var8, var9, this.ac * -1029607193, -999716567 * this.au, 335741455 * this.ab, false, var11, var12, var13, 0, var14, var15, var16, var17, 0, 0, 0, 0, var18, var19, var24, 0, "", "");
      } catch (RuntimeException var32) {
         throw db.an(var32, "re.af(" + ')');
      }
   }

   void an(String var1, short var2) {
      try {
         if (var1.startsWith("1.")) {
            if (var2 >= 3600) {
               return;
            }

            this.aw(var1, -1365894541);
         } else {
            this.ac(var1, -595434086);
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "re.an(" + ')');
      }
   }

   public rv au() {
      byte var1;
      if (jb.aj.startsWith("win")) {
         var1 = 1;
      } else if (jb.aj.startsWith("mac")) {
         var1 = 2;
      } else if (jb.aj.startsWith("linux")) {
         var1 = 3;
      } else {
         var1 = 4;
      }

      String var2;
      try {
         var2 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var30) {
         var2 = "";
      }

      String var3;
      try {
         var3 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var29) {
         var3 = "";
      }

      String var4 = "Unknown";
      String var5 = "1.1";

      try {
         var4 = System.getProperty("java.vendor");
         var5 = System.getProperty("java.version");
      } catch (Exception var28) {
      }

      boolean var6;
      if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
         var6 = false;
      } else {
         var6 = true;
      }

      byte var7 = 0;
      if (1 == var1) {
         if (var3.indexOf("4.0") != -1) {
            var7 = 1;
         } else if (var3.indexOf("4.1") != -1) {
            var7 = 2;
         } else if (var3.indexOf("4.9") != -1) {
            var7 = 3;
         } else if (var3.indexOf("5.0") != -1) {
            var7 = 4;
         } else if (var3.indexOf("5.1") != -1) {
            var7 = 5;
         } else if (var3.indexOf("5.2") != -1) {
            var7 = 8;
         } else if (var3.indexOf("6.0") != -1) {
            var7 = 6;
         } else if (var3.indexOf("6.1") != -1) {
            var7 = 7;
         } else if (var3.indexOf("6.2") != -1) {
            var7 = 9;
         } else if (var3.indexOf("6.3") != -1) {
            var7 = 10;
         } else if (var3.indexOf("10.0") != -1) {
            var7 = 11;
         }
      } else if (2 == var1) {
         if (var3.indexOf("10.4") != -1) {
            var7 = 20;
         } else if (var3.indexOf("10.5") != -1) {
            var7 = 21;
         } else if (var3.indexOf("10.6") != -1) {
            var7 = 22;
         } else if (var3.indexOf("10.7") != -1) {
            var7 = 23;
         } else if (var3.indexOf("10.8") != -1) {
            var7 = 24;
         } else if (var3.indexOf("10.9") != -1) {
            var7 = 25;
         } else if (var3.indexOf("10.10") != -1) {
            var7 = 26;
         } else if (var3.indexOf("10.11") != -1) {
            var7 = 27;
         } else if (var3.indexOf("10.12") != -1) {
            var7 = 28;
         } else if (var3.indexOf("10.13") != -1) {
            var7 = 29;
         }
      }

      byte var8;
      if (var4.toLowerCase().indexOf("sun") != -1) {
         var8 = 1;
      } else if (var4.toLowerCase().indexOf("microsoft") != -1) {
         var8 = 2;
      } else if (var4.toLowerCase().indexOf("apple") != -1) {
         var8 = 3;
      } else if (var4.toLowerCase().indexOf("oracle") != -1) {
         var8 = 5;
      } else {
         var8 = 4;
      }

      this.an(var5, (short)-6085);
      boolean var9 = false;
      int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      int var11;
      if (this.ac * -1029607193 > 3) {
         var11 = Runtime.getRuntime().availableProcessors();
      } else {
         var11 = 0;
      }

      byte var12 = 0;
      String var13 = "";
      String var14 = "";
      String var15 = "";
      String var16 = "";
      String var17 = "";
      String var18 = "";
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      boolean var22 = false;
      int[] var23 = new int[3];
      boolean var24 = false;
      String var25 = "";
      String var26 = "";
      boolean var27 = false;
      return new rv(var1, var6, var7, var8, this.ac * -1029607193, -999716567 * this.au, 335741455 * this.ab, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "", "");
   }

   void ac(String var1, int var2) {
      try {
         String[] var3 = var1.split("\\.");

         try {
            this.ac = Integer.parseInt(var3[0]) * 1615373015;
            this.au = Integer.parseInt(var3[1]) * -1249303783;
            this.ab = Integer.parseInt(var3[2]) * -633230097;
         } catch (Exception var5) {
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "re.ac(" + ')');
      }
   }

   void aw(String var1, int var2) {
      try {
         String[] var3 = var1.split("\\.");

         try {
            this.ac = Integer.parseInt(var3[1]) * 1615373015;
            var3 = var3[2].split("_");
            this.au = Integer.parseInt(var3[0]) * -1249303783;
            this.ab = Integer.parseInt(var3[1]) * -633230097;
         } catch (Exception var5) {
         }

      } catch (RuntimeException var6) {
         throw db.an(var6, "re.aw(" + ')');
      }
   }

   void aq(String var1) {
      if (var1.startsWith("1.")) {
         this.aw(var1, -1705349170);
      } else {
         this.ac(var1, 1749134985);
      }

   }

   void at(String var1) {
      if (var1.startsWith("1.")) {
         this.aw(var1, -716825643);
      } else {
         this.ac(var1, -37188883);
      }

   }

   public rv ab() {
      byte var1;
      if (jb.aj.startsWith("win")) {
         var1 = 1;
      } else if (jb.aj.startsWith("mac")) {
         var1 = 2;
      } else if (jb.aj.startsWith("linux")) {
         var1 = 3;
      } else {
         var1 = 4;
      }

      String var2;
      try {
         var2 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var30) {
         var2 = "";
      }

      String var3;
      try {
         var3 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var29) {
         var3 = "";
      }

      String var4 = "Unknown";
      String var5 = "1.1";

      try {
         var4 = System.getProperty("java.vendor");
         var5 = System.getProperty("java.version");
      } catch (Exception var28) {
      }

      boolean var6;
      if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
         var6 = false;
      } else {
         var6 = true;
      }

      byte var7 = 0;
      if (1 == var1) {
         if (var3.indexOf("4.0") != -1) {
            var7 = 1;
         } else if (var3.indexOf("4.1") != -1) {
            var7 = 2;
         } else if (var3.indexOf("4.9") != -1) {
            var7 = 3;
         } else if (var3.indexOf("5.0") != -1) {
            var7 = 4;
         } else if (var3.indexOf("5.1") != -1) {
            var7 = 5;
         } else if (var3.indexOf("5.2") != -1) {
            var7 = 8;
         } else if (var3.indexOf("6.0") != -1) {
            var7 = 6;
         } else if (var3.indexOf("6.1") != -1) {
            var7 = 7;
         } else if (var3.indexOf("6.2") != -1) {
            var7 = 9;
         } else if (var3.indexOf("6.3") != -1) {
            var7 = 10;
         } else if (var3.indexOf("10.0") != -1) {
            var7 = 11;
         }
      } else if (2 == var1) {
         if (var3.indexOf("10.4") != -1) {
            var7 = 20;
         } else if (var3.indexOf("10.5") != -1) {
            var7 = 21;
         } else if (var3.indexOf("10.6") != -1) {
            var7 = 22;
         } else if (var3.indexOf("10.7") != -1) {
            var7 = 23;
         } else if (var3.indexOf("10.8") != -1) {
            var7 = 24;
         } else if (var3.indexOf("10.9") != -1) {
            var7 = 25;
         } else if (var3.indexOf("10.10") != -1) {
            var7 = 26;
         } else if (var3.indexOf("10.11") != -1) {
            var7 = 27;
         } else if (var3.indexOf("10.12") != -1) {
            var7 = 28;
         } else if (var3.indexOf("10.13") != -1) {
            var7 = 29;
         }
      }

      byte var8;
      if (var4.toLowerCase().indexOf("sun") != -1) {
         var8 = 1;
      } else if (var4.toLowerCase().indexOf("microsoft") != -1) {
         var8 = 2;
      } else if (var4.toLowerCase().indexOf("apple") != -1) {
         var8 = 3;
      } else if (var4.toLowerCase().indexOf("oracle") != -1) {
         var8 = 5;
      } else {
         var8 = 4;
      }

      this.an(var5, (short)2283);
      boolean var9 = false;
      int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      int var11;
      if (this.ac * -1029607193 > 3) {
         var11 = Runtime.getRuntime().availableProcessors();
      } else {
         var11 = 0;
      }

      byte var12 = 0;
      String var13 = "";
      String var14 = "";
      String var15 = "";
      String var16 = "";
      String var17 = "";
      String var18 = "";
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      boolean var22 = false;
      int[] var23 = new int[3];
      boolean var24 = false;
      String var25 = "";
      String var26 = "";
      boolean var27 = false;
      return new rv(var1, var6, var7, var8, this.ac * -1029607193, -999716567 * this.au, 335741455 * this.ab, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "", "");
   }

   void aa(String var1) {
      if (var1.startsWith("1.")) {
         this.aw(var1, -1902209454);
      } else {
         this.ac(var1, 1878519518);
      }

   }

   void ay(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.ac = Integer.parseInt(var2[0]) * 1615373015;
         this.au = Integer.parseInt(var2[1]) * -1249303783;
         this.ab = Integer.parseInt(var2[2]) * -633230097;
      } catch (Exception var4) {
      }

   }

   void ao(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.ac = Integer.parseInt(var2[0]) * 1615373015;
         this.au = Integer.parseInt(var2[1]) * -1249303783;
         this.ab = Integer.parseInt(var2[2]) * -633230097;
      } catch (Exception var4) {
      }

   }
}
