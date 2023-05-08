package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XRawSound extends Accessor, XAbstractSound {
	/**
	 * @see XRawSound#resample(XDecimator)
	 */
	@NotNull
	MethodExecution<XRawSound, XRawSound> resample = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getEnd();

	/**
	 *  field
	 */
	void setEnd(int value);

	/**
	 * public field
	 */
	int getSampleRate();

	/**
	 * public field
	 */
	void setSampleRate(int value);

	/**
	 * public field
	 */
	byte[] getSamples();

	/**
	 * public field
	 */
	void setSamples(byte[] value);

	/**
	 * public field
	 */
	int getStart();

	/**
	 * public field
	 */
	void setStart(int value);

	/**
	 * public method
	 */
	XRawSound resample(XDecimator decimator);
}
