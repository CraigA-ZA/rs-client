import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

class ai extends DefaultTlsClient {
   static int gk;
   static IndexedSprite dg;
   // $FF: synthetic field
   final ax this$1;

   static void au_renamed(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var7 = (var0 + var1) / 2;
         int var8 = var0;
         World var9 = bx.worlds[var7];
         bx.worlds[var7] = bx.worlds[var1];
         bx.worlds[var1] = var9;

         for(int var10 = var0; var10 < var1; ++var10) {
            World var12 = bx.worlds[var10];
            int var13 = ly.compareWorlds(var12, var9, var2, var3);
            int var11;
            if (0 != var13) {
               if (var3) {
                  var11 = -var13;
               } else {
                  var11 = var13;
               }
            } else if (var4 == -1) {
               var11 = 0;
            } else {
               int var14 = ly.compareWorlds(var12, var9, var4, var5);
               if (var5) {
                  var11 = -var14;
               } else {
                  var11 = var14;
               }
            }

            if (var11 <= 0) {
               World var18 = bx.worlds[var10];
               bx.worlds[var10] = bx.worlds[var8];
               bx.worlds[var8++] = var18;
            }
         }

         bx.worlds[var1] = bx.worlds[var8];
         bx.worlds[var8] = var9;
         au_renamed(var0, var8 - 1, var2, var3, var4, var5);
         au_renamed(var8 + 1, var1, var2, var3, var4, var5);
      }

   }

   ai(ax var1) {
      this.this$1 = var1;
   }

   public Hashtable getClientExtensions() throws IOException {
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

   public TlsAuthentication getAuthentication() throws IOException {
      return new ao(this);
   }

   public TlsAuthentication aq() throws IOException {
      return new ao(this);
   }

   static final byte[] decompressBytes(byte[] var0) {
      Packet var2 = new Packet(var0);
      int var3 = var2.g1();
      int var4 = var2.g4s();
      if (var4 >= 0 && (0 == AbstractArchive.bz * 401859175 || var4 <= AbstractArchive.bz * 401859175)) {
         if (var3 == 0) {
            byte[] var12 = new byte[var4];
            var2.ct(var12, 0, var4);
            return var12;
         } else {
            int var5 = var2.g4s();
            if (var5 < 0 || 0 != AbstractArchive.bz * 401859175 && var5 > AbstractArchive.bz * 401859175) {
               throw new RuntimeException();
            } else {
               byte[] var6 = new byte[var5];
               if (var3 == 1) {
                  Bzip2Decompressor.Bzip2Decompressor_decompress(var6, var5, var0, var4, 9);
               } else {
                  AbstractArchive.gzipDecompressor.decompress(var2, var6);
               }

               return var6;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   static int am_renamed(int var0, ClientScript var1, boolean var2) {
      Component var4;
      if (1927 != var0 && var0 != 2927) {
         int var11;
         if (1928 == var0) {
            var4 = var2 ? SoundSystem.ag : an.ai;
            var11 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            if (var11 >= 1 && var11 <= 10) {
               dd var12 = new dd(var11, 1713081171 * var4.id, var4.childIndex * 55577617, var4.itemId * -2006098851);
               Interpreter.ad.add(var12);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 2928) {
            Interpreter.Interpreter_intStackSize -= 1281407919;
            int var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            var11 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            int var6 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
            if (var6 >= 1 && var6 <= 10) {
               dd var7 = new dd(var6, var10, var11, gh.getInterfaceComponent(var10).itemId * -2006098851);
               Interpreter.ad.add(var7);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } else if (1484376709 * Interpreter.ae >= 10) {
         throw new RuntimeException();
      } else {
         if (var0 >= 2000) {
            var4 = gh.getInterfaceComponent(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
         } else {
            var4 = var2 ? SoundSystem.ag : an.ai;
         }

         if (var4.gh == null) {
            return 0;
         } else {
            ClientScriptEvent var5 = new ClientScriptEvent();
            var5.component = var4;
            var5.args0 = var4.gh;
            var5.ay = -1685365847 + Interpreter.ae * 815462605;
            Client.clientScriptEvents.addFirst(var5);
            return 1;
         }
      }
   }

   static boolean jj_renamed(Player var0) {
      if (0 == -1387790283 * Client.mk) {
         return false;
      } else {
         boolean var2;
         if (var0 != MusicPatchNode.localPlayer) {
            var2 = (-1387790283 * Client.mk & 4) != 0;
            boolean var3 = var2;
            boolean var4;
            if (!var2) {
               var4 = 0 != (Client.mk * -1387790283 & 1);
               var3 = var4 && var0.aw();
            }

            var4 = var3;
            if (!var3) {
               boolean var5 = 0 != (Client.mk * -1387790283 & 2);
               var4 = var5 && var0.aa();
            }

            return var4;
         } else {
            var2 = 0 != (-1387790283 * Client.mk & 8);
            return var2;
         }
      }
   }

   static final void drawInterface0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (SoundSystem.loadInterface(var0)) {
         WorldMapSection3.qk = null;
         ao.drawInterface(hn.interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if (null != WorldMapSection3.qk) {
            ao.drawInterface(WorldMapSection3.qk, -1412584499, var1, var2, var3, var4, 1983519339 * id.qp, dy.qw * -2041029009, var7);
            WorldMapSection3.qk = null;
         }

      } else {
         if (-1 != var7) {
            Client.rf[var7] = true;
         } else {
            for(int var9 = 0; var9 < 100; ++var9) {
               Client.rf[var9] = true;
            }
         }

      }
   }

   static boolean lr_renamed() {
      return Client.ol;
   }
}
