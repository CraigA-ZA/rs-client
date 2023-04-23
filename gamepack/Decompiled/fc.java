import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class fc extends fb {
   static IndexedSprite[] ao;
   String af;
   // $FF: synthetic field
   final fa this$0;

   public static Clock al_renamed() {
      try {
         return new NanoClock();
      } catch (Throwable var2) {
         return new MilliClock();
      }
   }

   public static EnumType getEnumType(int var0) {
      EnumType var2 = (EnumType)EnumType.EnumType_cached.get((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = EnumType.EnumType_archive.takeFile(8, var0);
         var2 = new EnumType();
         if (var3 != null) {
            var2.decode(new Packet(var3));
         }

         EnumType.EnumType_cached.put(var2, (long)var0);
         return var2;
      }
   }

   public static final PcmPlayer newPcmPlayer(TaskHandler var0, int var1, int var2) {
      if (PcmPlayer.au * -1359271235 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            PcmPlayer var4 = PcmPlayer.pcmPlayerProvider.player();
            var4.ai = new int[256 * (PcmPlayer.ab ? 2 : 1)];
            var4.am = var2 * 918717953;
            var4.init();
            var4.ar = -1783299003 * ((var2 & -1024) + 1024);
            if (var4.ar * -896831859 > 16384) {
               var4.ar = 1091649536;
            }

            var4.open(var4.ar * -896831859);
            if (UrlRequest.at * -808987209 > 0 && nf.soundSystem == null) {
               nf.soundSystem = new SoundSystem();
               SoundSystem.soundSystemExecutor = Executors.newScheduledThreadPool(1);
               SoundSystem.soundSystemExecutor.scheduleAtFixedRate(nf.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (null != nf.soundSystem) {
               if (null != nf.soundSystem.players[var1]) {
                  throw new IllegalArgumentException();
               }

               nf.soundSystem.players[var1] = var4;
            }

            return var4;
         } catch (Throwable var5) {
            return new PcmPlayer();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   fc(fa var1) {
      this.this$0 = var1;
   }

   void write(Packet var1) {
      this.af = var1.cw();
      var1.g4s();
   }

   void an(fj var1) {
      var1.ab = this.af;
   }

   static final void ml_renamed() {
      PacketBitNode var1 = mi.an_renamed(ClientProt.cn, Client.packetWriter.au);
      Client.packetWriter.aw(var1);
      Interpreter.az = true;

      for(InterfaceParent var2 = (InterfaceParent)Client.interfaceParents.first(); var2 != null; var2 = (InterfaceParent)Client.interfaceParents.next()) {
         if (0 == -1702664641 * var2.an || var2.an * -1702664641 == 3) {
            nv.closeInterface(var2, true);
         }
      }

      if (Client.pg != null) {
         fw.ma_renamed(Client.pg);
         Client.pg = null;
      }

      Interpreter.az = false;
   }
}
