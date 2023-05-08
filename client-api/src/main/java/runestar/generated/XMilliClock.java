package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XMilliClock extends Accessor, XClock {
	/**
	 * @see XMilliClock#mark()
	 */
	@NotNull
	MethodExecution<XMilliClock, Void> mark = new MethodExecution.Implementation();

	/**
	 * @see XMilliClock#wait(int, int)
	 */
	@NotNull
	MethodExecution<XMilliClock, Integer> wait = new MethodExecution.Implementation();

	/**
	 * public method
	 */
	void mark();

	/**
	 * public method
	 */
	int wait(int cycleMs, int minSleepMs);
}
