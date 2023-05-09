package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public abstract class
 */
public interface XPcmStream extends Accessor, XNode {
	/**
	 * @see XPcmStream#update(int[], int, int)
	 */
	@NotNull
	MethodExecution<XPcmStream, Void> update = new MethodExecution.Implementation();

	/**
	 * volatile field
	 */
	boolean getActive();

	/**
	 * volatile field
	 */
	void setActive(boolean value);

	/**
	 *  field
	 */
	XPcmStream getAfter();

	/**
	 *  field
	 */
	void setAfter(XPcmStream value);

	/**
	 *  field
	 */
	XAbstractSound getSound();

	/**
	 *  field
	 */
	void setSound(XAbstractSound value);

	/**
	 * protected abstract method
	 */
	void fill(int[] buffer, int start, int end);

	/**
	 * protected abstract method
	 */
	void skip(int length);

	/**
	 * final method
	 */
	void update(int[] buffer, int start, int end);
}
