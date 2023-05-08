package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XIndexedSprite extends Accessor, XRasterizer2D {
	/**
	 * @see XIndexedSprite#normalize()
	 */
	@NotNull
	MethodExecution<XIndexedSprite, Void> normalize = new MethodExecution.Implementation();

	/**
	 * @see XIndexedSprite#shiftColors(int, int, int)
	 */
	@NotNull
	MethodExecution<XIndexedSprite, Void> shiftColors = new MethodExecution.Implementation();

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
	int[] getPalette();

	/**
	 * public field
	 */
	void setPalette(int[] value);

	/**
	 * public field
	 */
	byte[] getPixels();

	/**
	 * public field
	 */
	void setPixels(byte[] value);

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
	 * public field
	 */
	int getXOffset();

	/**
	 * public field
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

	/**
	 * public method
	 */
	void shiftColors(int r, int g, int b);
}
