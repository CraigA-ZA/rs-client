package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XLocSound extends Accessor, XNode {
	/**
	 * @see XLocSound#set()
	 */
	@NotNull
	MethodExecution<XLocSound, Void> set = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XLocType getObj();

	/**
	 *  field
	 */
	void setObj(XLocType value);

	/**
	 *  field
	 */
	int getSoundEffectId();

	/**
	 *  field
	 */
	void setSoundEffectId(int value);

	/**
	 *  field
	 */
	int[] getSoundEffectIds();

	/**
	 *  field
	 */
	void setSoundEffectIds(int[] value);

	/**
	 *  field
	 */
	XRawPcmStream getStream1();

	/**
	 *  field
	 */
	void setStream1(XRawPcmStream value);

	/**
	 *  field
	 */
	XRawPcmStream getStream2();

	/**
	 *  field
	 */
	void setStream2(XRawPcmStream value);

	/**
	 *  method
	 */
	void set();
}
