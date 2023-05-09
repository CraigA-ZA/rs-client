package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XAnimFrameset extends Accessor, XDualNode {
	/**
	 * @see XAnimFrameset#hasAlphaTransform(int)
	 */
	@NotNull
	MethodExecution<XAnimFrameset, Boolean> hasAlphaTransform = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XAnimFrame[] getFrames();

	/**
	 *  field
	 */
	void setFrames(XAnimFrame[] value);

	/**
	 * public method
	 */
	boolean hasAlphaTransform(int frame);
}
