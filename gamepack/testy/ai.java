import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

class ai extends DefaultTlsClient {
   static final int cb = 5;
   static final int av = 14;
   public static final int bw = 67;
   static tc dg;
   static int gk;
   // $FF: synthetic field
   final ax this$1;
   static final int ak = 24;
   static final int af = 200000000;

   static final void lk(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      try {
         if (!bq.ac(var0, 1376777516)) {
            if (var8 >= 0) {
               throw new IllegalStateException();
            } else {
               if (-1 != var7) {
                  if (var8 >= 0) {
                     throw new IllegalStateException();
                  }

                  client.rf[var7] = true;
               } else {
                  for(int var9 = 0; var9 < 100; ++var9) {
                     if (var8 >= 0) {
                        throw new IllegalStateException();
                     }

                     client.rf[var9] = true;
                  }
               }

            }
         } else {
            jw.qk = null;
            ao.lh(hn.ap[var0], -1, var1, var2, var3, var4, var5, var6, var7, -465475629);
            if (null != jw.qk) {
               ao.lh(jw.qk, -1412584499, var1, var2, var3, var4, 1983519339 * id.qp, dy.qw * -2041029009, var7, -465475629);
               jw.qk = null;
            }

         }
      } catch (RuntimeException var10) {
         throw db.an(var10, "ai.lk(" + ')');
      }
   }

   public Hashtable getClientExtensions() throws IOException {
      try {
         Hashtable var1 = super.getClientExtensions();
         if (null == var1) {
            var1 = new Hashtable();
         }

         byte[] var2 = this.this$1.val$host.getBytes();
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();
         DataOutputStream var4 = new DataOutputStream(var3);
         var4.writeShort(var2.length + 3);
         var4.writeByte(0);
         var4.writeShort(var2.length);
         var4.write(var2);
         var4.close();
         var1.put(0, var3.toByteArray());
         return var1;
      } catch (RuntimeException var5) {
         throw db.an(var5, "ai.getClientExtensions(" + ')');
      }
   }

   public TlsAuthentication getAuthentication() throws IOException {
      try {
         return new ao(this);
      } catch (RuntimeException var1) {
         throw db.an(var1, "ai.getAuthentication(" + ')');
      }
   }

   public Hashtable af() throws IOException {
      Hashtable var1 = super.getClientExtensions();
      if (null == var1) {
         var1 = new Hashtable();
      }

      byte[] var2 = this.this$1.val$host.getBytes();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);
      var4.writeShort(var2.length + 3);
      var4.writeByte(0);
      var4.writeShort(var2.length);
      var4.write(var2);
      var4.close();
      var1.put(0, var3.toByteArray());
      return var1;
   }

   public TlsAuthentication aq() throws IOException {
      return new ao(this);
   }

   public Hashtable aw() throws IOException {
      Hashtable var1 = super.getClientExtensions();
      if (null == var1) {
         var1 = new Hashtable();
      }

      byte[] var2 = this.this$1.val$host.getBytes();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);
      var4.writeShort(var2.length + 3);
      var4.writeByte(0);
      var4.writeShort(var2.length);
      var4.write(var2);
      var4.close();
      var1.put(0, var3.toByteArray());
      return var1;
   }

   public Hashtable ac() throws IOException {
      Hashtable var1 = super.getClientExtensions();
      if (null == var1) {
         var1 = new Hashtable();
      }

      byte[] var2 = this.this$1.val$host.getBytes();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);
      var4.writeShort(var2.length + 3);
      var4.writeByte(0);
      var4.writeShort(var2.length);
      var4.write(var2);
      var4.close();
      var1.put(0, var3.toByteArray());
      return var1;
   }

   public Hashtable au() throws IOException {
      Hashtable var1 = super.getClientExtensions();
      if (null == var1) {
         var1 = new Hashtable();
      }

      byte[] var2 = this.this$1.val$host.getBytes();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);
      var4.writeShort(var2.length + 3);
      var4.writeByte(0);
      var4.writeShort(var2.length);
      var4.write(var2);
      var4.close();
      var1.put(0, var3.toByteArray());
      return var1;
   }

   public Hashtable ab() throws IOException {
      Hashtable var1 = super.getClientExtensions();
      if (null == var1) {
         var1 = new Hashtable();
      }

      byte[] var2 = this.this$1.val$host.getBytes();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);
      var4.writeShort(var2.length + 3);
      var4.writeByte(0);
      var4.writeShort(var2.length);
      var4.write(var2);
      var4.close();
      var1.put(0, var3.toByteArray());
      return var1;
   }

   ai(ax var1) {
      this.this$1 = var1;
   }

   static boolean jj(dv var0, int var1) {
      try {
         if (0 == -1387790283 * client.mk) {
            if (var1 <= -409959323) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            boolean var10000;
            boolean var2;
            if (var0 == lq.mi) {
               if (0 != (-1387790283 * client.mk & 8)) {
                  if (var1 <= -409959323) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               var2 = var10000;
               return var2;
            } else if (var1 <= -409959323) {
               throw new IllegalStateException();
            } else {
               if ((-1387790283 * client.mk & 4) != 0) {
                  if (var1 <= -409959323) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               var2 = var10000;
               boolean var3 = var2;
               boolean var4;
               if (!var2) {
                  if (var1 <= -409959323) {
                     throw new IllegalStateException();
                  }

                  if (0 != (client.mk * -1387790283 & 1)) {
                     if (var1 <= -409959323) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  label97: {
                     var4 = var10000;
                     if (var4) {
                        if (var1 <= -409959323) {
                           throw new IllegalStateException();
                        }

                        if (var0.aw(-1545521422)) {
                           if (var1 <= -409959323) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                           break label97;
                        }
                     }

                     var10000 = false;
                  }

                  var3 = var10000;
               }

               var4 = var3;
               if (!var3) {
                  if (var1 <= -409959323) {
                     throw new IllegalStateException();
                  }

                  if (0 != (client.mk * -1387790283 & 2)) {
                     if (var1 <= -409959323) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var5 = var10000;
                  if (var5 && var0.aa((byte)-33)) {
                     if (var1 <= -409959323) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  var4 = var10000;
               }

               return var4;
            }
         }
      } catch (RuntimeException var6) {
         throw db.an(var6, "ai.jj(" + ')');
      }
   }

   static void au(int var0, int var1, int var2, boolean var3, int var4, boolean var5, int var6) {
      try {
         if (var0 < var1) {
            if (var6 <= 177258591) {
               throw new IllegalStateException();
            }

            int var7 = (var0 + var1) / 2;
            int var8 = var0;
            cl var9 = bx.au[var7];
            bx.au[var7] = bx.au[var1];
            bx.au[var1] = var9;

            for(int var10 = var0; var10 < var1; ++var10) {
               cl var12 = bx.au[var10];
               int var13 = ly.ab(var12, var9, var2, var3, (byte)52);
               int var11;
               if (0 != var13) {
                  if (var6 <= 177258591) {
                     throw new IllegalStateException();
                  }

                  if (var3) {
                     if (var6 <= 177258591) {
                        throw new IllegalStateException();
                     }

                     var11 = -var13;
                  } else {
                     var11 = var13;
                  }
               } else if (var4 == -1) {
                  if (var6 <= 177258591) {
                     throw new IllegalStateException();
                  }

                  var11 = 0;
               } else {
                  int var14 = ly.ab(var12, var9, var4, var5, (byte)115);
                  if (var5) {
                     if (var6 <= 177258591) {
                        return;
                     }

                     var11 = -var14;
                  } else {
                     var11 = var14;
                  }
               }

               if (var11 <= 0) {
                  if (var6 <= 177258591) {
                     throw new IllegalStateException();
                  }

                  cl var16 = bx.au[var10];
                  bx.au[var10] = bx.au[var8];
                  bx.au[var8++] = var16;
               }
            }

            bx.au[var1] = bx.au[var8];
            bx.au[var8] = var9;
            au(var0, var8 - 1, var2, var3, var4, var5, 1620808109);
            au(var8 + 1, var1, var2, var3, var4, var5, 1610801400);
         }

      } catch (RuntimeException var15) {
         throw db.an(var15, "ai.au(" + ')');
      }
   }

   public Hashtable an() throws IOException {
      Hashtable var1 = super.getClientExtensions();
      if (null == var1) {
         var1 = new Hashtable();
      }

      byte[] var2 = this.this$1.val$host.getBytes();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);
      var4.writeShort(var2.length + 3);
      var4.writeByte(0);
      var4.writeShort(var2.length);
      var4.write(var2);
      var4.close();
      var1.put(0, var3.toByteArray());
      return var1;
   }

   static int am(int var0, ch var1, boolean var2, short var3) {
      try {
         mq var4;
         if (1927 != var0) {
            if (var3 != 511) {
               throw new IllegalStateException();
            }

            if (var0 != 2927) {
               int var10;
               if (1928 == var0) {
                  if (var3 != 511) {
                     throw new IllegalStateException();
                  }

                  mq var10000;
                  if (var2) {
                     if (var3 != 511) {
                        throw new IllegalStateException();
                     }

                     var10000 = bq.ag;
                  } else {
                     var10000 = an.ai;
                  }

                  var4 = var10000;
                  var10 = cy.al[(cy.at -= 427135973) * -964267539];
                  if (var10 >= 1) {
                     if (var3 != 511) {
                        throw new IllegalStateException();
                     }

                     if (var10 <= 10) {
                        dd var11 = new dd(var10, 1713081171 * var4.bs, var4.br * 55577617, var4.gn * -2006098851);
                        cy.ad.add(var11);
                        return 1;
                     }

                     if (var3 != 511) {
                        throw new IllegalStateException();
                     }
                  }

                  throw new RuntimeException();
               }

               if (var0 == 2928) {
                  if (var3 != 511) {
                     throw new IllegalStateException();
                  }

                  cy.at -= 1281407919;
                  int var9 = cy.al[cy.at * -964267539];
                  var10 = cy.al[-964267539 * cy.at + 1];
                  int var6 = cy.al[2 + cy.at * -964267539];
                  if (var6 >= 1) {
                     if (var6 <= 10) {
                        dd var7 = new dd(var6, var9, var10, gh.an(var9, (byte)5).gn * -2006098851);
                        cy.ad.add(var7);
                        return 1;
                     }

                     if (var3 != 511) {
                        throw new IllegalStateException();
                     }
                  }

                  throw new RuntimeException();
               }

               return 2;
            }

            if (var3 != 511) {
               throw new IllegalStateException();
            }
         }

         if (1484376709 * cy.ae >= 10) {
            if (var3 != 511) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            if (var0 >= 2000) {
               if (var3 != 511) {
                  throw new IllegalStateException();
               }

               var4 = gh.an(cy.al[(cy.at -= 427135973) * -964267539], (byte)5);
            } else {
               var4 = var2 ? bq.ag : an.ai;
            }

            if (var4.gh == null) {
               if (var3 != 511) {
                  throw new IllegalStateException();
               } else {
                  return 0;
               }
            } else {
               dr var5 = new dr();
               var5.aw = var4;
               var5.af = var4.gh;
               var5.ay = -1685365847 + cy.ae * 815462605;
               client.rq.an(var5);
               return 1;
            }
         }
      } catch (RuntimeException var8) {
         throw db.an(var8, "ai.am(" + ')');
      }
   }

   static final byte[] ch(byte[] var0, int var1) {
      try {
         sg var2 = new sg(var0);
         int var3 = var2.cm((byte)7);
         int var4 = var2.cx(-1098863405);
         if (var4 >= 0) {
            if (var1 != -1117233973) {
               throw new IllegalStateException();
            } else {
               if (0 != nm.bz * 401859175) {
                  if (var1 != -1117233973) {
                     throw new IllegalStateException();
                  }

                  if (var4 > nm.bz * 401859175) {
                     throw new RuntimeException();
                  }
               }

               if (var3 == 0) {
                  if (var1 != -1117233973) {
                     throw new IllegalStateException();
                  } else {
                     byte[] var8 = new byte[var4];
                     var2.ct(var8, 0, var4, -1570744551);
                     return var8;
                  }
               } else {
                  int var5 = var2.cx(-2004302841);
                  if (var5 >= 0) {
                     if (var1 != -1117233973) {
                        throw new IllegalStateException();
                     } else {
                        if (0 != nm.bz * 401859175) {
                           if (var1 != -1117233973) {
                              throw new IllegalStateException();
                           }

                           if (var5 > nm.bz * 401859175) {
                              if (var1 != -1117233973) {
                                 throw new IllegalStateException();
                              }

                              throw new RuntimeException();
                           }
                        }

                        byte[] var6 = new byte[var5];
                        if (var3 == 1) {
                           if (var1 != -1117233973) {
                              throw new IllegalStateException();
                           }

                           sv.af(var6, var5, var0, var4, 9);
                        } else {
                           nm.be.af(var2, var6, 1293232912);
                        }

                        return var6;
                     }
                  } else {
                     throw new RuntimeException();
                  }
               }
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var7) {
         throw db.an(var7, "ai.ch(" + ')');
      }
   }

   static boolean lr(int var0) {
      try {
         return client.ol;
      } catch (RuntimeException var1) {
         throw db.an(var1, "ai.lr(" + ')');
      }
   }
}
