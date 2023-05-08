package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XClanMate extends Accessor, XBuddy {
	/**
	 * @see XClanMate#isFriend()
	 */
	@NotNull
	MethodExecution<XClanMate, Boolean> isFriend = new MethodExecution.Implementation();

	/**
	 * @see XClanMate#isIgnored()
	 */
	@NotNull
	MethodExecution<XClanMate, Boolean> isIgnored = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XTriBool getIsFriend0();

	/**
	 *  field
	 */
	void setIsFriend0(XTriBool value);

	/**
	 *  field
	 */
	XTriBool getIsIgnored0();

	/**
	 *  field
	 */
	void setIsIgnored0(XTriBool value);

	/**
	 * public final method
	 */
	boolean isFriend();

	/**
	 * public final method
	 */
	boolean isIgnored();
}
