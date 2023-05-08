package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XNode extends Accessor {
	/**
	 * @see XNode#hasNext()
	 */
	@NotNull
	MethodExecution<XNode, Boolean> hasNext = new MethodExecution.Implementation();

	/**
	 * @see XNode#remove()
	 */
	@NotNull
	MethodExecution<XNode, Void> remove = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	long getKey();

	/**
	 * public field
	 */
	void setKey(long value);

	/**
	 * public field
	 */
	XNode getNext();

	/**
	 * public field
	 */
	void setNext(XNode value);

	/**
	 * public field
	 */
	XNode getPrevious();

	/**
	 * public field
	 */
	void setPrevious(XNode value);

	/**
	 * public method
	 */
	boolean hasNext();

	/**
	 * public method
	 */
	void remove();
}
