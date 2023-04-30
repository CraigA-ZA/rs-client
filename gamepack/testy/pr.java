import accessors.RSFriend;

public class pr extends pb implements RSFriend {
   public static final int ah = 0;
   boolean an;
   boolean af;

   public int ac(Object var1) {
      return this.af((pr)var1, (byte)40);
   }

   public int ab(Object var1) {
      return this.af((pr)var1, (byte)27);
   }

   public int compareTo(Object var1) {
      try {
         return this.af((pr)var1, (byte)78);
      } catch (RuntimeException var2) {
         throw db.an(var2, "pr.compareTo(" + ')');
      }
   }

   int af(pr var1, byte var2) {
      try {
         if (this.au * 177258591 == -453810525 * client.bw) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            if (client.bw * -453810525 != 177258591 * var1.au) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               return -1;
            }
         }

         if (-453810525 * client.bw == 177258591 * var1.au) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            if (client.bw * -453810525 != 177258591 * this.au) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               return 1;
            }
         }

         if (177258591 * this.au != 0) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            if (0 == var1.au * 177258591) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               return -1;
            }
         }

         if (var1.au * 177258591 != 0) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            if (0 == 177258591 * this.au) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               return 1;
            }
         }

         if (this.af) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            if (!var1.af) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               return -1;
            }
         }

         if (!this.af) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            if (var1.af) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               return 1;
            }
         }

         if (this.an) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            if (!var1.an) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               return -1;
            }
         }

         if (!this.an) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            if (var1.an) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               return 1;
            }
         }

         return 0 != this.au * 177258591 ? 1907692493 * this.ab - var1.ab * 1907692493 : 1907692493 * var1.ab - 1907692493 * this.ab;
      } catch (RuntimeException var3) {
         throw db.an(var3, "pr.af(" + ')');
      }
   }

   pr() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "pr.<init>(" + ')');
      }
   }

   public int au(Object var1) {
      return this.af((pr)var1, (byte)99);
   }

   public int al(pw var1) {
      return this.af((pr)var1, (byte)83);
   }

   int aw(pr var1) {
      if (this.au * 177258591 == -453810525 * client.bw && client.bw * -453810525 != 177258591 * var1.au) {
         return -1;
      } else if (-453810525 * client.bw == 177258591 * var1.au && client.bw * -453810525 != 177258591 * this.au) {
         return 1;
      } else if (177258591 * this.au != 0 && 0 == var1.au * 177258591) {
         return -1;
      } else if (var1.au * 177258591 != 0 && 0 == 177258591 * this.au) {
         return 1;
      } else if (this.af && !var1.af) {
         return -1;
      } else if (!this.af && var1.af) {
         return 1;
      } else if (this.an && !var1.an) {
         return -1;
      } else if (!this.an && var1.an) {
         return 1;
      } else {
         return 0 != this.au * 177258591 ? 1907692493 * this.ab - var1.ab * 1907692493 : 1907692493 * var1.ab - 1907692493 * this.ab;
      }
   }

   public int aq(pw var1) {
      return this.af((pr)var1, (byte)110);
   }

   public int an(pw var1, int var2) {
      try {
         return this.af((pr)var1, (byte)8);
      } catch (RuntimeException var3) {
         throw db.an(var3, "pr.an(" + ')');
      }
   }

   static void aw(int var0) {
      try {
         jr.au.aq();
      } catch (RuntimeException var1) {
         throw db.an(var1, "pr.aw(" + ')');
      }
   }

   static String lg(int var0, short var1) {
      try {
         if (var0 < 0) {
            if (var1 == 6526) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else if (client.ok[var0].length() > 0) {
            if (var1 == 6526) {
               throw new IllegalStateException();
            } else {
               return client.og[var0] + mk.gk + client.ok[var0];
            }
         } else {
            return client.og[var0];
         }
      } catch (RuntimeException var2) {
         throw db.an(var2, "pr.lg(" + ')');
      }
   }

   static final void jn(int var0) {
      try {
         client.ma = 0;
         int var1 = jm.ib * -1232093375 + (1144428983 * lq.mi.bx >> 7);
         int var2 = jj.jc * 827352769 + (-411750205 * lq.mi.bo >> 7);
         if (var1 >= 3053) {
            if (var0 != -1530842203) {
               throw new IllegalStateException();
            }

            if (var1 <= 3156) {
               if (var0 != -1530842203) {
                  throw new IllegalStateException();
               }

               if (var2 >= 3056) {
                  if (var0 != -1530842203) {
                     throw new IllegalStateException();
                  }

                  if (var2 <= 3136) {
                     if (var0 != -1530842203) {
                        throw new IllegalStateException();
                     }

                     client.ma = -1041569925;
                  }
               }
            }
         }

         if (var1 >= 3072) {
            if (var0 != -1530842203) {
               throw new IllegalStateException();
            }

            if (var1 <= 3118) {
               if (var0 != -1530842203) {
                  throw new IllegalStateException();
               }

               if (var2 >= 9492 && var2 <= 9535) {
                  if (var0 != -1530842203) {
                     return;
                  }

                  client.ma = -1041569925;
               }
            }
         }

         if (1 == client.ma * 43311027 && var1 >= 3139) {
            if (var0 != -1530842203) {
               throw new IllegalStateException();
            }

            if (var1 <= 3199 && var2 >= 3008) {
               if (var0 != -1530842203) {
                  throw new IllegalStateException();
               }

               if (var2 <= 3062) {
                  if (var0 != -1530842203) {
                     throw new IllegalStateException();
                  }

                  client.ma = 0;
               }
            }
         }

      } catch (RuntimeException var3) {
         throw db.an(var3, "pr.jn(" + ')');
      }
   }
}
