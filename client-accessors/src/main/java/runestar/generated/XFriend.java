package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XFriend extends Accessor, XBuddy {
	/**
	 * @see XFriend#compareTo00(XFriend)
	 */
	@NotNull
	MethodExecution<XFriend, Integer> compareTo00 = new MethodExecution.Implementation();

	/**
	 *  method
	 */
	int compareTo00(XFriend other);
}
