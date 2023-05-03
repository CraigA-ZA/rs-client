package loader.util;

import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class IconUtil {
    public static ImageIcon getIcon(String svgPath) {
        try {
            URL svgUrl = IconUtil.class.getResource("/icons/" + svgPath + ".svg");
            InputStream svgStream = svgUrl.openStream();

            PNGTranscoder transcoder = new PNGTranscoder();
            transcoder.addTranscodingHint(PNGTranscoder.KEY_WIDTH, (float) 16);
            transcoder.addTranscodingHint(PNGTranscoder.KEY_HEIGHT, (float) 16);

            TranscoderInput input = new TranscoderInput(svgStream);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            TranscoderOutput output = new TranscoderOutput(outputStream);

            transcoder.transcode(input, output);

            InputStream pngStream = new ByteArrayInputStream(outputStream.toByteArray());
            BufferedImage bufferedImage = ImageIO.read(pngStream);

            return new ImageIcon(bufferedImage);
        } catch (IOException | TranscoderException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
