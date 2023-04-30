import accessors.RSDevicePcmPlayer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class ae extends bu implements RSDevicePcmPlayer {
   int aw;
   AudioFormat an;
   SourceDataLine af;
   byte[] ac;

   ae() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw db.an(var1, "ae.<init>(" + ')');
      }
   }

   protected void af(byte var1) {
      try {
         AudioFormat var10001 = new AudioFormat;
         float var10003 = (float)(au * -1359271235);
         byte var10005;
         if (ab) {
            if (var1 == 12) {
               throw new IllegalStateException();
            }

            var10005 = 2;
         } else {
            var10005 = 1;
         }

         var10001.<init>(var10003, 16, var10005, true, false);
         this.an = var10001;
         byte var10002;
         if (ab) {
            if (var1 == 12) {
               return;
            }

            var10002 = 2;
         } else {
            var10002 = 1;
         }

         this.ac = new byte[256 << var10002];
      } catch (RuntimeException var2) {
         throw db.an(var2, "ae.af(" + ')');
      }
   }

   protected void ac() {
      int var1 = 256;
      if (ab) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.ai[var2];
         if (0 != (var3 + 8388608 & -16777216)) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.ac[var2 * 2] = (byte)(var3 >> 8);
         this.ac[2 * var2 + 1] = (byte)(var3 >> 16);
      }

      this.af.write(this.ac, 0, var1 << 1);
   }

   protected void ab(byte var1) {
      try {
         this.af.flush();
      } catch (RuntimeException var2) {
         throw db.an(var2, "ae.ab(" + ')');
      }
   }

   protected void an(int var1, int var2) throws LineUnavailableException {
      try {
         try {
            DataLine.Info var10000 = new DataLine.Info;
            AudioFormat var10003 = this.an;
            byte var10005;
            if (ab) {
               if (var2 == 1689901440) {
                  throw new IllegalStateException();
               }

               var10005 = 2;
            } else {
               var10005 = 1;
            }

            var10000.<init>(SourceDataLine.class, var10003, var1 << var10005);
            DataLine.Info var3 = var10000;
            this.af = (SourceDataLine)AudioSystem.getLine(var3);
            this.af.open();
            this.af.start();
            this.aw = var1 * -1465543817;
         } catch (LineUnavailableException var4) {
            if (am.aw(var1, -440671694) != 1) {
               if (var2 != 1689901440) {
                  this.an(co.ab(var1, 698228402), -811878074);
               }
            } else {
               this.af = null;
               throw var4;
            }
         }
      } catch (RuntimeException var5) {
         throw db.an(var5, "ae.an(" + ')');
      }
   }

   protected void au(int var1) {
      try {
         if (this.af != null) {
            if (var1 != -1466449702) {
               return;
            }

            this.af.close();
            this.af = null;
         }

      } catch (RuntimeException var2) {
         throw db.an(var2, "ae.au(" + ')');
      }
   }

   protected void aq() {
      this.an = new AudioFormat((float)(au * -1359271235), 16, ab ? 2 : 1, true, false);
      this.ac = new byte[-495269443 << (ab ? 2 : 1)];
   }

   protected int aw(int var1) {
      try {
         int var10000 = this.aw * -552651193;
         int var10001 = this.af.available();
         byte var10002;
         if (ab) {
            if (var1 != -654786411) {
               throw new IllegalStateException();
            }

            var10002 = 2;
         } else {
            var10002 = 1;
         }

         return var10000 - (var10001 >> var10002);
      } catch (RuntimeException var2) {
         throw db.an(var2, "ae.aw(" + ')');
      }
   }

   protected void al() {
      this.an = new AudioFormat((float)(au * -1359271235), 16, ab ? 2 : 1, true, false);
      this.ac = new byte[256 << (ab ? 2 : 1)];
   }

   protected void at(int var1) throws LineUnavailableException {
      try {
         DataLine.Info var2 = new DataLine.Info(SourceDataLine.class, this.an, var1 << (ab ? 2 : 1));
         this.af = (SourceDataLine)AudioSystem.getLine(var2);
         this.af.open();
         this.af.start();
         this.aw = var1 * -1465543817;
      } catch (LineUnavailableException var3) {
         if (am.aw(var1, 515447241) != 1) {
            this.an(co.ab(var1, -385172354), -2094670509);
         } else {
            this.af = null;
            throw var3;
         }
      }
   }

   protected void aa(int var1) throws LineUnavailableException {
      try {
         DataLine.Info var2 = new DataLine.Info(SourceDataLine.class, this.an, var1 << (ab ? 2 : 1));
         this.af = (SourceDataLine)AudioSystem.getLine(var2);
         this.af.open();
         this.af.start();
         this.aw = var1 * -1465543817;
      } catch (LineUnavailableException var3) {
         if (am.aw(var1, 1170708507) != 1) {
            this.an(co.ab(var1, 113838603), -511149841);
         } else {
            this.af = null;
            throw var3;
         }
      }
   }

   protected int ay() {
      return this.aw * -552651193 - (this.af.available() >> (ab ? 2 : 1));
   }

   protected int ao() {
      return this.aw * -552651193 - (this.af.available() >> (ab ? 2 : 1));
   }

   protected void ax() {
      int var1 = 256;
      if (ab) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.ai[var2];
         if (0 != (var3 + 8388608 & -16777216)) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.ac[var2 * 2] = (byte)(var3 >> 8);
         this.ac[2 * var2 + 1] = (byte)(var3 >> 16);
      }

      this.af.write(this.ac, 0, var1 << 1);
   }

   protected void ai() {
      if (this.af != null) {
         this.af.close();
         this.af = null;
      }

   }

   protected void ag() {
      if (this.af != null) {
         this.af.close();
         this.af = null;
      }

   }

   protected void ah() {
      if (this.af != null) {
         this.af.close();
         this.af = null;
      }

   }

   protected void av() {
      this.af.flush();
   }

   protected void ar() {
      this.af.flush();
   }

   protected void am() {
      this.af.flush();
   }
}
