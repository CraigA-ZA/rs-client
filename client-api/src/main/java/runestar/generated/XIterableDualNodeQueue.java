package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XIterableDualNodeQueue extends Accessor {
	/**
	 * @see XIterableDualNodeQueue#clear()
	 */
	@NotNull
	MethodExecution<XIterableDualNodeQueue, Void> clear = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XDualNode getHead();

	/**
	 *  field
	 */
	void setHead(XDualNode value);

	/**
	 * public field
	 */
	XDualNode getSentinel();

	/**
	 * public field
	 */
	void setSentinel(XDualNode value);

	/**
	 * public method
	 */
	void clear();
}
