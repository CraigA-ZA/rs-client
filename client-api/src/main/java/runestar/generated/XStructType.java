package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XStructType extends Accessor, XDualNode {
	/**
	 * @see XStructType#postDecode()
	 */
	@NotNull
	MethodExecution<XStructType, Void> postDecode = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XIterableNodeHashTable getParams();

	/**
	 *  field
	 */
	void setParams(XIterableNodeHashTable value);

	/**
	 *  method
	 */
	void postDecode();
}
