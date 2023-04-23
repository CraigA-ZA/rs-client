import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class DevicePcmPlayer extends PcmPlayer {
   byte[] ac;
   int aw;
   AudioFormat an;
   SourceDataLine af;

   DevicePcmPlayer() {
   }

   protected void init() {
      this.an = new AudioFormat((float)(au * -1359271235), 16, ab ? 2 : 1, true, false);
      this.ac = new byte[256 << (ab ? 2 : 1)];
   }

   protected void open(int var1) throws LineUnavailableException {
      try {
         DataLine.Info var3 = new DataLine.Info(SourceDataLine.class, this.an, var1 << (ab ? 2 : 1));
         this.af = (SourceDataLine)AudioSystem.getLine(var3);
         this.af.open();
         this.af.start();
         this.aw = var1 * -1465543817;
      } catch (LineUnavailableException var4) {
         if (am.aw_renamed(var1) != 1) {
            this.open(co.ab_renamed(var1));
         } else {
            this.af = null;
            throw var4;
         }
      }
   }

   protected int position() {
      return this.aw * -552651193 - (this.af.available() >> (ab ? 2 : 1));
   }

   protected void write() {
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

   protected void close() {
      if (this.af != null) {
         this.af.close();
         this.af = null;
      }

   }

   protected void discard() {
      this.af.flush();
   }
}
