package runestar.generated;

import accessors.generate.base.Accessor;

/**
 * public abstract class
 */
public interface XClock extends Accessor {
	/**
	 * public abstract method
	 */
	void mark();

	/**
	 * public abstract method
	 */
	int wait(int cycleMs, int minSleepMs);
}
