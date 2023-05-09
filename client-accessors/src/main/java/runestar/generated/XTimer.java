package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XTimer extends Accessor {
	/**
	 * @see XTimer#write(XPacket)
	 */
	@NotNull
	MethodExecution<XTimer, Void> write = new MethodExecution.Implementation();

	/**
	 * public method
	 */
	void write(XPacket packet);
}
