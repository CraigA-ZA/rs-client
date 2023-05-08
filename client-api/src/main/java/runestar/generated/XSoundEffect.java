package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XSoundEffect extends Accessor {
	/**
	 * @see XSoundEffect#mix()
	 */
	@NotNull
	MethodExecution<XSoundEffect, byte[]> mix = new MethodExecution.Implementation();

	/**
	 * @see XSoundEffect#toRawSound()
	 */
	@NotNull
	MethodExecution<XSoundEffect, XRawSound> toRawSound = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getEnd();

	/**
	 *  field
	 */
	void setEnd(int value);

	/**
	 *  field
	 */
	XInstrument[] getInstruments();

	/**
	 *  field
	 */
	void setInstruments(XInstrument[] value);

	/**
	 *  field
	 */
	int getStart();

	/**
	 *  field
	 */
	void setStart(int value);

	/**
	 * final method
	 */
	byte[] mix();

	/**
	 * public method
	 */
	XRawSound toRawSound();
}
