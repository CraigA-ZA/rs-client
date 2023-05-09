package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XHeadbar extends Accessor, XNode {
	/**
	 * @see XHeadbar#get(int)
	 */
	@NotNull
	MethodExecution<XHeadbar, XHeadbarUpdate> get = new MethodExecution.Implementation();

	/**
	 * @see XHeadbar#isEmpty()
	 */
	@NotNull
	MethodExecution<XHeadbar, Boolean> isEmpty = new MethodExecution.Implementation();

	/**
	 * @see XHeadbar#put()
	 */
	@NotNull
	MethodExecution<XHeadbar, Void> put = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XHeadbarType getType();

	/**
	 *  field
	 */
	void setType(XHeadbarType value);

	/**
	 *  field
	 */
	XIterableNodeDeque getUpdates();

	/**
	 *  field
	 */
	void setUpdates(XIterableNodeDeque value);

	/**
	 *  method
	 */
	XHeadbarUpdate get(int cycle);

	/**
	 *  method
	 */
	boolean isEmpty();

	/**
	 *  method
	 */
	void put();
}
