package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XIgnored extends Accessor, XUser {
	/**
	 * @see XIgnored#compareTo00(XIgnored)
	 */
	@NotNull
	MethodExecution<XIgnored, Integer> compareTo00 = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getId();

	/**
	 *  field
	 */
	void setId(int value);

	/**
	 *  method
	 */
	int compareTo00(XIgnored other);
}
