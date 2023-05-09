package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Integer;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XBuddy extends Accessor, XUser {
	/**
	 * @see XBuddy#hasWorld()
	 */
	@NotNull
	MethodExecution<XBuddy, Boolean> hasWorld = new MethodExecution.Implementation();

	/**
	 * @see XBuddy#world()
	 */
	@NotNull
	MethodExecution<XBuddy, Integer> world = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	int getInt2();

	/**
	 * public field
	 */
	void setInt2(int value);

	/**
	 * public field
	 */
	int getRank();

	/**
	 * public field
	 */
	void setRank(int value);

	/**
	 * public field
	 */
	int getWorld0();

	/**
	 * public field
	 */
	void setWorld0(int value);

	/**
	 * public method
	 */
	boolean hasWorld();

	/**
	 * public method
	 */
	int world();
}
