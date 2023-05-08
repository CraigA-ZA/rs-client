package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XUsername extends Accessor {
	/**
	 * @see XUsername#cleanName()
	 */
	@NotNull
	MethodExecution<XUsername, String> cleanName = new MethodExecution.Implementation();

	/**
	 * @see XUsername#compareTo0(XUsername)
	 */
	@NotNull
	MethodExecution<XUsername, Integer> compareTo0 = new MethodExecution.Implementation();

	/**
	 * @see XUsername#hasCleanName()
	 */
	@NotNull
	MethodExecution<XUsername, Boolean> hasCleanName = new MethodExecution.Implementation();

	/**
	 * @see XUsername#name()
	 */
	@NotNull
	MethodExecution<XUsername, String> name = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	String getCleanName0();

	/**
	 *  field
	 */
	void setCleanName0(String value);

	/**
	 *  field
	 */
	String getName0();

	/**
	 *  field
	 */
	void setName0(String value);

	/**
	 * public method
	 */
	String cleanName();

	/**
	 * public method
	 */
	int compareTo0(XUsername other);

	/**
	 * public method
	 */
	boolean hasCleanName();

	/**
	 * public method
	 */
	String name();
}
