package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XFriendSystem extends Accessor {
	/**
	 * @see XFriendSystem#clear()
	 */
	@NotNull
	MethodExecution<XFriendSystem, Void> clear = new MethodExecution.Implementation();

	/**
	 * @see XFriendSystem#removeFriend(String)
	 */
	@NotNull
	MethodExecution<XFriendSystem, Void> removeFriend = new MethodExecution.Implementation();

	/**
	 * @see XFriendSystem#removeIgnore(String)
	 */
	@NotNull
	MethodExecution<XFriendSystem, Void> removeIgnore = new MethodExecution.Implementation();

	/**
	 * public final field
	 */
	XFriendsList getFriendsList();

	/**
	 * public final field
	 */
	XIgnoreList getIgnoreList();

	/**
	 * final field
	 */
	XLoginType getLoginType();

	/**
	 * final method
	 */
	void clear();

	/**
	 * final method
	 */
	void removeFriend(String name);

	/**
	 * public final method
	 */
	void removeIgnore(String name);
}
