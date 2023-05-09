package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XNanoClock extends Accessor, XClock {
	/**
	 * @see XNanoClock#mark()
	 */
	@NotNull
	MethodExecution<XNanoClock, Void> mark = new MethodExecution.Implementation();

	/**
	 * @see XNanoClock#wait(int, int)
	 */
	@NotNull
	MethodExecution<XNanoClock, Integer> wait = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	long getLastTimeNano();

	/**
	 *  field
	 */
	void setLastTimeNano(long value);

	/**
	 * public method
	 */
	void mark();

	/**
	 * public method
	 */
	int wait(int cycleMs, int minSleepMs);
}
