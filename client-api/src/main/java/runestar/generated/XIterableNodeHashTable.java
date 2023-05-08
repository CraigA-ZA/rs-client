package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XIterableNodeHashTable extends Accessor {
	/**
	 * @see XIterableNodeHashTable#clear()
	 */
	@NotNull
	MethodExecution<XIterableNodeHashTable, Void> clear = new MethodExecution.Implementation();

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
	void clear();
}
