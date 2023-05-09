package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Object;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XDemotingHashTable extends Accessor {
	/**
	 * @see XDemotingHashTable#demote(int)
	 */
	@NotNull
	MethodExecution<XDemotingHashTable, Void> demote = new MethodExecution.Implementation();

	/**
	 * @see XDemotingHashTable#get(long)
	 */
	@NotNull
	MethodExecution<XDemotingHashTable, Object> get = new MethodExecution.Implementation();

	/**
	 * @see XDemotingHashTable#put(Object, long, int)
	 */
	@NotNull
	MethodExecution<XDemotingHashTable, Void> put = new MethodExecution.Implementation();

	/**
	 * @see XDemotingHashTable#put1(Object, long)
	 */
	@NotNull
	MethodExecution<XDemotingHashTable, Void> put1 = new MethodExecution.Implementation();

	/**
	 * @see XDemotingHashTable#remove(long)
	 */
	@NotNull
	MethodExecution<XDemotingHashTable, Void> remove = new MethodExecution.Implementation();

	/**
	 * @see XDemotingHashTable#removeWrapper(XWrapper)
	 */
	@NotNull
	MethodExecution<XDemotingHashTable, Void> removeWrapper = new MethodExecution.Implementation();

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
	XIterableNodeHashTable getHashTable();

	/**
	 *  field
	 */
	void setHashTable(XIterableNodeHashTable value);

	/**
	 *  field
	 */
	XIterableDualNodeQueue getQueue();

	/**
	 *  field
	 */
	void setQueue(XIterableDualNodeQueue value);

	/**
	 *  field
	 */
	int getRemaining();

	/**
	 *  field
	 */
	void setRemaining(int value);

	/**
	 * public method
	 */
	void demote(int softeningLevel);

	/**
	 * public method
	 */
	Object get(long key);

	/**
	 * public method
	 */
	void put(Object value, long key, int size);

	/**
	 * public method
	 */
	void put1(Object value, long key);

	/**
	 *  method
	 */
	void remove(long key);

	/**
	 *  method
	 */
	void removeWrapper(XWrapper wrapper);
}
