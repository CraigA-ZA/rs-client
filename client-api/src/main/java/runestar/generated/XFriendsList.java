package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XFriendsList extends Accessor, XUserList {
	/**
	 * @see XFriendsList#read(XPacket, int)
	 */
	@NotNull
	MethodExecution<XFriendsList, Void> read = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	XLinkDeque getFriendLoginUpdates();

	/**
	 * public field
	 */
	void setFriendLoginUpdates(XLinkDeque value);

	/**
	 * final field
	 */
	XLoginType getLoginType();

	/**
	 * public method
	 */
	void read(XPacket packet, int n);
}
