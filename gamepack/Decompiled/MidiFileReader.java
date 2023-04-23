public class MidiFileReader {
   static final byte[] aa = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   int division;
   int aq;
   int[] ab;
   int[] trackPositions;
   int[] trackLengths;
   int[] trackStarts;
   long at;
   Packet packet = new Packet((byte[])null);

   MidiFileReader() {
   }

   MidiFileReader(byte[] var1) {
      this.parse(var1);
   }

   void parse(byte[] var1) {
      this.packet.array = var1;
      this.packet.index = 2016309714;
      int var2 = this.packet.cl();
      this.division = this.packet.cl();
      this.aq = 500000;
      this.trackStarts = new int[var2];

      Packet var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.index += var5 * -1516355947) {
         int var4 = this.packet.g4s();
         var5 = this.packet.g4s();
         if (var4 == 1297379947) {
            this.trackStarts[var3] = this.packet.index * -1633313603;
            ++var3;
         }

         var10000 = this.packet;
      }

      this.at = 0L;
      this.trackPositions = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.trackPositions[var3] = this.trackStarts[var3];
      }

      this.trackLengths = new int[var2];
      this.ab = new int[var2];
   }

   void clear() {
      this.packet.array = null;
      this.trackStarts = null;
      this.trackPositions = null;
      this.trackLengths = null;
      this.ab = null;
   }

   boolean isReady() {
      return this.packet.array != null;
   }

   int trackCount() {
      return this.trackPositions.length;
   }

   void gotoTrack(int var1) {
      this.packet.index = this.trackPositions[var1] * -1516355947;
   }

   void markTrackPosition(int var1) {
      this.trackPositions[var1] = this.packet.index * -1633313603;
   }

   void aq() {
      this.packet.index = 1516355947;
   }

   void readTrackLength(int var1) {
      int var2 = this.packet.di();
      int[] var10000 = this.trackLengths;
      var10000[var1] += var2;
   }

   int readMessage(int var1) {
      int var2 = this.readMessage0(var1);
      return var2;
   }

   int readMessage0(int var1) {
      int var2 = this.packet.array[this.packet.index * -1633313603];
      Packet var10000;
      if (var2 < 0) {
         var2 &= 255;
         this.ab[var1] = var2;
         var10000 = this.packet;
         var10000.index += -1516355947;
      } else {
         var2 = this.ab[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.ay(var1, var2);
      } else {
         int var3 = this.packet.di();
         if (var2 == 247 && var3 > 0) {
            int var4 = this.packet.array[this.packet.index * -1633313603] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               var10000 = this.packet;
               var10000.index += -1516355947;
               this.ab[var1] = var4;
               return this.ay(var1, var4);
            }
         }

         var10000 = this.packet;
         var10000.index += var3 * -1516355947;
         return 0;
      }
   }

   int ay(int var1, int var2) {
      int var3;
      int var4;
      if (var2 == 255) {
         var3 = this.packet.g1();
         var4 = this.packet.di();
         Packet var10000;
         if (var3 == 47) {
            var10000 = this.packet;
            var10000.index += var4 * -1516355947;
            return 1;
         } else if (var3 == 81) {
            int var5 = this.packet.cr();
            var4 -= 3;
            int var6 = this.trackLengths[var1];
            this.at += (long)var6 * (long)(this.aq - var5);
            this.aq = var5;
            var10000 = this.packet;
            var10000.index += var4 * -1516355947;
            return 2;
         } else {
            var10000 = this.packet;
            var10000.index += var4 * -1516355947;
            return 3;
         }
      } else {
         var3 = aa[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.packet.g1() << 8;
         }

         if (var3 >= 2) {
            var4 |= this.packet.g1() << 16;
         }

         return var4;
      }
   }

   long ao(int var1) {
      return this.at + (long)var1 * (long)this.aq;
   }

   int getPrioritizedTrack() {
      int var1 = this.trackPositions.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.trackPositions[var4] >= 0 && this.trackLengths[var4] < var3) {
            var2 = var4;
            var3 = this.trackLengths[var4];
         }
      }

      return var2;
   }

   boolean isDone() {
      int var1 = this.trackPositions.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.trackPositions[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   void reset(long var1) {
      this.at = var1;
      int var3 = this.trackPositions.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.trackLengths[var4] = 0;
         this.ab[var4] = 0;
         this.packet.index = this.trackStarts[var4] * -1516355947;
         this.readTrackLength(var4);
         this.trackPositions[var4] = this.packet.index * -1633313603;
      }

   }
}
