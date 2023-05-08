package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XNodeHashTable extends Accessor {
	/**
	 * @see XNodeHashTable#first()
	 */
	@NotNull
	MethodExecution<XNodeHashTable, XNode> first = new MethodExecution.Implementation();

	/**
	 * @see XNodeHashTable#get(long)
	 */
	@NotNull
	MethodExecution<XNodeHashTable, XNode> get = new MethodExecution.Implementation();

	/**
	 * @see XNodeHashTable#next()
	 */
	@NotNull
	MethodExecution<XNodeHashTable, XNode> next = new MethodExecution.Implementation();

	/**
	 * @see XNodeHashTable#put(XNode, long)
	 */
	@NotNull
	MethodExecution<XNodeHashTable, Void> put = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XNode[] getBuckets();

	/**
	 *  field
	 */
	void setBuckets(XNode[] value);

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
	XNode getCurrentGet();

	/**
	 *  field
	 */
	void setCurrentGet(XNode value);

	/**
	 *  field
	 */
	int getIndex();

	/**
	 *  field
	 */
	void setIndex(int value);

	/**
	 *  field
	 */
	int getSize();

	/**
	 *  field
	 */
	void setSize(int value);

	/**
	 * public method
	 */
	XNode first();

	/**
	 * public method
	 */
	XNode get(long key);

	/**
	 * public method
	 */
	XNode next();

	/**
	 * public method
	 */
	void put(XNode node, long key);
}
