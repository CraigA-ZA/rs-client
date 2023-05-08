package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XUser extends Accessor {
	/**
	 * @see XUser#compareTo0(XUser)
	 */
	@NotNull
	MethodExecution<XUser, Integer> compareTo0 = new MethodExecution.Implementation();

	/**
	 * @see XUser#name()
	 */
	@NotNull
	MethodExecution<XUser, String> name = new MethodExecution.Implementation();

	/**
	 * @see XUser#previousName()
	 */
	@NotNull
	MethodExecution<XUser, String> previousName = new MethodExecution.Implementation();

	/**
	 * @see XUser#set(XUsername, XUsername)
	 */
	@NotNull
	MethodExecution<XUser, Void> set = new MethodExecution.Implementation();

	/**
	 * @see XUser#username()
	 */
	@NotNull
	MethodExecution<XUser, XUsername> username = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XUsername getPreviousUsername();

	/**
	 *  field
	 */
	void setPreviousUsername(XUsername value);

	/**
	 *  field
	 */
	XUsername getUsername0();

	/**
	 *  field
	 */
	void setUsername0(XUsername value);

	/**
	 * public method
	 */
	int compareTo0(XUser other);

	/**
	 * public method
	 */
	String name();

	/**
	 * public method
	 */
	String previousName();

	/**
	 *  method
	 */
	void set(XUsername username, XUsername previousUsername);

	/**
	 * public method
	 */
	XUsername username();
}
