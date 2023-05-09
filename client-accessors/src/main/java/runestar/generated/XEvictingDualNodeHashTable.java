package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XEvictingDualNodeHashTable extends Accessor {
	/**
	 * @see XEvictingDualNodeHashTable#clear()
	 */
	@NotNull
	MethodExecution<XEvictingDualNodeHashTable, Void> clear = new MethodExecution.Implementation();

	/**
	 * @see XEvictingDualNodeHashTable#get(long)
	 */
	@NotNull
	MethodExecution<XEvictingDualNodeHashTable, XDualNode> get = new MethodExecution.Implementation();

	/**
	 * @see XEvictingDualNodeHashTable#put(XDualNode, long)
	 */
	@NotNull
	MethodExecution<XEvictingDualNodeHashTable, Void> put = new MethodExecution.Implementation();

	/**
	 * @see XEvictingDualNodeHashTable#remove(long)
	 */
	@NotNull
	MethodExecution<XEvictingDualNodeHashTable, Void> remove = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getCapacity();

	/**
	 *  field
	 */
	void setCapacity(int value);

	/**
	 *  field
	 */
	XIterableDualNodeQueue getDeque();

	/**
	 *  field
	 */
	void setDeque(XIterableDualNodeQueue value);

	/**
	 *  field
	 */
	XIterableNodeHashTable getHashTable();

	/**
	 *  field
	 */
	void setHashTable(XIterableNodeHashTable value);

	/**
	 *  field
	 */
	int getRemainingCapacity();

	/**
	 *  field
	 */
	void setRemainingCapacity(int value);

	/**
	 * public method
	 */
	void clear();

	/**
	 * public method
	 */
	XDualNode get(long key);

	/**
	 * public method
	 */
	void put(XDualNode value, long key);

	/**
	 * public method
	 */
	void remove(long key);
}
