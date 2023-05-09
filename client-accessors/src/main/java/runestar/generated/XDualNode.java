package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XDualNode extends Accessor, XNode {
	/**
	 * @see XDualNode#removeDual()
	 */
	@NotNull
	MethodExecution<XDualNode, Void> removeDual = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	long getKeyDual();

	/**
	 * public field
	 */
	void setKeyDual(long value);

	/**
	 * public field
	 */
	XDualNode getNextDual();

	/**
	 * public field
	 */
	void setNextDual(XDualNode value);

	/**
	 * public field
	 */
	XDualNode getPreviousDual();

	/**
	 * public field
	 */
	void setPreviousDual(XDualNode value);

	/**
	 * public method
	 */
	void removeDual();
}
