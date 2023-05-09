package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XInstrument extends Accessor {
	/**
	 * @see XInstrument#decode(XPacket)
	 */
	@NotNull
	MethodExecution<XInstrument, Void> decode = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getDelayDecay();

	/**
	 *  field
	 */
	void setDelayDecay(int value);

	/**
	 *  field
	 */
	int getDelayTime();

	/**
	 *  field
	 */
	void setDelayTime(int value);

	/**
	 *  field
	 */
	int getDuration();

	/**
	 *  field
	 */
	void setDuration(int value);

	/**
	 *  field
	 */
	XAudioFilter getFilter();

	/**
	 *  field
	 */
	void setFilter(XAudioFilter value);

	/**
	 *  field
	 */
	int getOffset();

	/**
	 *  field
	 */
	void setOffset(int value);

	/**
	 *  field
	 */
	int[] getOscillatorDelays();

	/**
	 *  field
	 */
	void setOscillatorDelays(int[] value);

	/**
	 *  field
	 */
	int[] getOscillatorPitch();

	/**
	 *  field
	 */
	void setOscillatorPitch(int[] value);

	/**
	 *  field
	 */
	int[] getOscillatorVolume();

	/**
	 *  field
	 */
	void setOscillatorVolume(int[] value);

	/**
	 * final method
	 */
	void decode(XPacket packet);
}
