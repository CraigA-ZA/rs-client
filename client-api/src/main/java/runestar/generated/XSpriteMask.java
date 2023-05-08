package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XSpriteMask extends Accessor, XDualNode {
	/**
	 * @see XSpriteMask#contains(int, int)
	 */
	@NotNull
	MethodExecution<XSpriteMask, Boolean> contains = new MethodExecution.Implementation();

	/**
	 * public final field
	 */
	int getHeight();

	/**
	 * public final field
	 */
	int getWidth();

	/**
	 * public final field
	 */
	int[] getXStarts();

	/**
	 * public final field
	 */
	int[] getXWidths();

	/**
	 * public method
	 */
	boolean contains(int x, int y);
}
