package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import java.lang.Void;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.SourceDataLine;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XDevicePcmPlayer extends Accessor, XPcmPlayer {
	/**
	 * @see XDevicePcmPlayer#close()
	 */
	@NotNull
	MethodExecution<XDevicePcmPlayer, Void> close = new MethodExecution.Implementation();

	/**
	 * @see XDevicePcmPlayer#discard()
	 */
	@NotNull
	MethodExecution<XDevicePcmPlayer, Void> discard = new MethodExecution.Implementation();

	/**
	 * @see XDevicePcmPlayer#init()
	 */
	@NotNull
	MethodExecution<XDevicePcmPlayer, Void> init = new MethodExecution.Implementation();

	/**
	 * @see XDevicePcmPlayer#open(int)
	 */
	@NotNull
	MethodExecution<XDevicePcmPlayer, Void> open = new MethodExecution.Implementation();

	/**
	 * @see XDevicePcmPlayer#position()
	 */
	@NotNull
	MethodExecution<XDevicePcmPlayer, Integer> position = new MethodExecution.Implementation();

	/**
	 * @see XDevicePcmPlayer#write()
	 */
	@NotNull
	MethodExecution<XDevicePcmPlayer, Void> write = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	byte[] getByteSamples();

	/**
	 *  field
	 */
	void setByteSamples(byte[] value);

	/**
	 *  field
	 */
	int getCapacity2();

	/**
	 *  field
	 */
	void setCapacity2(int value);

	/**
	 *  field
	 */
	AudioFormat getFormat();

	/**
	 *  field
	 */
	void setFormat(AudioFormat value);

	/**
	 *  field
	 */
	SourceDataLine getLine();

	/**
	 *  field
	 */
	void setLine(SourceDataLine value);

	/**
	 * protected method
	 */
	void close();

	/**
	 * protected method
	 */
	void discard();

	/**
	 * protected method
	 */
	void init();

	/**
	 * protected method
	 */
	void open(int bufferSize);

	/**
	 * protected method
	 */
	int position();

	/**
	 * protected method
	 */
	void write();
}
