package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XSprite extends Accessor, XRasterizer2D {
	/**
	 * @see XSprite#normalize()
	 */
	@NotNull
	MethodExecution<XSprite, Void> normalize = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	int getHeight();

	/**
	 * public field
	 */
	void setHeight(int value);

	/**
	 * public field
	 */
	int[] getPixels();

	/**
	 * public field
	 */
	void setPixels(int[] value);

	/**
	 * public field
	 */
	int getSubHeight();

	/**
	 * public field
	 */
	void setSubHeight(int value);

	/**
	 * public field
	 */
	int getSubWidth();

	/**
	 * public field
	 */
	void setSubWidth(int value);

	/**
	 * public field
	 */
	int getWidth();

	/**
	 * public field
	 */
	void setWidth(int value);

	/**
	 *  field
	 */
	int getXOffset();

	/**
	 *  field
	 */
	void setXOffset(int value);

	/**
	 * public field
	 */
	int getYOffset();

	/**
	 * public field
	 */
	void setYOffset(int value);

	/**
	 * public method
	 */
	void normalize();
}
