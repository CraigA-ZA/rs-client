package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XIgnoreList extends Accessor, XUserList {
	/**
	 * @see XIgnoreList#read(XPacket, int)
	 */
	@NotNull
	MethodExecution<XIgnoreList, Void> read = new MethodExecution.Implementation();

	/**
	 * final field
	 */
	XLoginType getLoginType();

	/**
	 * public method
	 */
	void read(XPacket packet, int n);
}
