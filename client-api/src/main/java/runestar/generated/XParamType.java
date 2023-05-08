package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XParamType extends Accessor, XDualNode {
	/**
	 * @see XParamType#postDecode()
	 */
	@NotNull
	MethodExecution<XParamType, Void> postDecode = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	boolean getAutodisable();

	/**
	 *  field
	 */
	void setAutodisable(boolean value);

	/**
	 * public field
	 */
	int getDefaultint();

	/**
	 * public field
	 */
	void setDefaultint(int value);

	/**
	 * public field
	 */
	String getDefaultstr();

	/**
	 * public field
	 */
	void setDefaultstr(String value);

	/**
	 *  field
	 */
	char getType();

	/**
	 *  field
	 */
	void setType(char value);

	/**
	 *  method
	 */
	void postDecode();
}
