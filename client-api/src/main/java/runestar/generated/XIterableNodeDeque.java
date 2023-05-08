package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XIterableNodeDeque extends Accessor {
	/**
	 * @see XIterableNodeDeque#addFirst(XNode)
	 */
	@NotNull
	MethodExecution<XIterableNodeDeque, Void> addFirst = new MethodExecution.Implementation();

	/**
	 * @see XIterableNodeDeque#addLast(XNode)
	 */
	@NotNull
	MethodExecution<XIterableNodeDeque, Void> addLast = new MethodExecution.Implementation();

	/**
	 * @see XIterableNodeDeque#clear0()
	 */
	@NotNull
	MethodExecution<XIterableNodeDeque, Void> clear0 = new MethodExecution.Implementation();

	/**
	 * @see XIterableNodeDeque#last()
	 */
	@NotNull
	MethodExecution<XIterableNodeDeque, XNode> last = new MethodExecution.Implementation();

	/**
	 * @see XIterableNodeDeque#previous()
	 */
	@NotNull
	MethodExecution<XIterableNodeDeque, XNode> previous = new MethodExecution.Implementation();

	/**
	 * @see XIterableNodeDeque#previousOrLast(XNode)
	 */
	@NotNull
	MethodExecution<XIterableNodeDeque, XNode> previousOrLast = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XNode getCurrent();

	/**
	 *  field
	 */
	void setCurrent(XNode value);

	/**
	 *  field
	 */
	XNode getSentinel();

	/**
	 *  field
	 */
	void setSentinel(XNode value);

	/**
	 * public method
	 */
	void addFirst(XNode node);

	/**
	 * public method
	 */
	void addLast(XNode node);

	/**
	 * public method
	 */
	void clear0();

	/**
	 * public method
	 */
	XNode last();

	/**
	 * public method
	 */
	XNode previous();

	/**
	 *  method
	 */
	XNode previousOrLast(XNode node);
}
