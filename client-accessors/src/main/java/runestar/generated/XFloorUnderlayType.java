package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XFloorUnderlayType extends Accessor, XDualNode {
	/**
	 * @see XFloorUnderlayType#postDecode()
	 */
	@NotNull
	MethodExecution<XFloorUnderlayType, Void> postDecode = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getRgb();

	/**
	 *  field
	 */
	void setRgb(int value);

	/**
	 * public method
	 */
	void postDecode();
}
