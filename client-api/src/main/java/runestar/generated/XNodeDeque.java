package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XNodeDeque extends Accessor {
	/**
	 * @see XNodeDeque#addFirst(XNode)
	 */
	@NotNull
	MethodExecution<XNodeDeque, Void> addFirst = new MethodExecution.Implementation();

	/**
	 * @see XNodeDeque#addLast(XNode)
	 */
	@NotNull
	MethodExecution<XNodeDeque, Void> addLast = new MethodExecution.Implementation();

	/**
	 * @see XNodeDeque#first()
	 */
	@NotNull
	MethodExecution<XNodeDeque, XNode> first = new MethodExecution.Implementation();

	/**
	 * @see XNodeDeque#last()
	 */
	@NotNull
	MethodExecution<XNodeDeque, XNode> last = new MethodExecution.Implementation();

	/**
	 * @see XNodeDeque#next()
	 */
	@NotNull
	MethodExecution<XNodeDeque, XNode> next = new MethodExecution.Implementation();

	/**
	 * @see XNodeDeque#previous()
	 */
	@NotNull
	MethodExecution<XNodeDeque, XNode> previous = new MethodExecution.Implementation();

	/**
	 * @see XNodeDeque#removeFirst()
	 */
	@NotNull
	MethodExecution<XNodeDeque, XNode> removeFirst = new MethodExecution.Implementation();

	/**
	 * @see XNodeDeque#removeLast()
	 */
	@NotNull
	MethodExecution<XNodeDeque, XNode> removeLast = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XNode getCurrent();

	/**
	 *  field
	 */
	void setCurrent(XNode value);

	/**
	 * public field
	 */
	XNode getSentinel();

	/**
	 * public field
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
	XNode first();

	/**
	 * public method
	 */
	XNode last();

	/**
	 * public method
	 */
	XNode next();

	/**
	 * public method
	 */
	XNode previous();

	/**
	 * public method
	 */
	XNode removeFirst();

	/**
	 * public method
	 */
	XNode removeLast();
}
