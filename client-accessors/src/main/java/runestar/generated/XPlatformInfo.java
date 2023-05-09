package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XPlatformInfo extends Accessor, XNode {
	/**
	 * @see XPlatformInfo#size()
	 */
	@NotNull
	MethodExecution<XPlatformInfo, Integer> size = new MethodExecution.Implementation();

	/**
	 * @see XPlatformInfo#write(XPacket)
	 */
	@NotNull
	MethodExecution<XPlatformInfo, Void> write = new MethodExecution.Implementation();

	/**
	 * public method
	 */
	int size();

	/**
	 * public method
	 */
	void write(XPacket packet);
}
