package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import java.lang.String;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XEnumType extends Accessor, XDualNode {
	/**
	 * @see XEnumType#size()
	 */
	@NotNull
	MethodExecution<XEnumType, Integer> size = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	String getDefaultstr();

	/**
	 * public field
	 */
	void setDefaultstr(String value);

	/**
	 * public field
	 */
	char getInputtype();

	/**
	 * public field
	 */
	void setInputtype(char value);

	/**
	 * public field
	 */
	int[] getIntvals();

	/**
	 * public field
	 */
	void setIntvals(int[] value);

	/**
	 * public field
	 */
	int[] getKeys();

	/**
	 * public field
	 */
	void setKeys(int[] value);

	/**
	 * public field
	 */
	int getOutputcount();

	/**
	 * public field
	 */
	void setOutputcount(int value);

	/**
	 * public field
	 */
	char getOutputtype();

	/**
	 * public field
	 */
	void setOutputtype(char value);

	/**
	 * public field
	 */
	String[] getStrvals();

	/**
	 * public field
	 */
	void setStrvals(String[] value);

	/**
	 * public method
	 */
	int size();
}
