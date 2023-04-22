import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class DevicePcmPlayer extends PcmPlayer {
   int capacity2;
   AudioFormat format;
   SourceDataLine line;
   byte[] byteSamples;

   DevicePcmPlayer() {
   }

   protected void init() {
      this.format = new AudioFormat((float)(au * -1359271235), 16, ab ? 2 : 1, true, false);
      this.byteSamples = new byte[256 << (ab ? 2 : 1)];
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

         this.byteSamples[var2 * 2] = (byte)(var3 >> 8);
         this.byteSamples[2 * var2 + 1] = (byte)(var3 >> 16);
      }

      this.line.write(this.byteSamples, 0, var1 << 1);
   }

   protected void discard() {
      this.line.flush();
   }

   protected void open(int var1) throws LineUnavailableException {
      try {
         DataLine.Info var3 = new DataLine.Info(SourceDataLine.class, this.format, var1 << (ab ? 2 : 1));
         this.line = (SourceDataLine)AudioSystem.getLine(var3);
         this.line.open();
         this.line.start();
         this.capacity2 = var1 * -1465543817;
      } catch (LineUnavailableException var4) {
         if (am.aw_renamed(var1) != 1) {
            this.open(co.ab_renamed(var1));
         } else {
            this.line = null;
            throw var4;
         }
      }
   }

   protected void close() {
      if (this.line != null) {
         this.line.close();
         this.line = null;
      }

   }

   protected int position() {
      return this.capacity2 * -552651193 - (this.line.available() >> (ab ? 2 : 1));
   }
}
