package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XFloorOverlayType extends Accessor, XDualNode {
	/**
	 * @see XFloorOverlayType#postDecode()
	 */
	@NotNull
	MethodExecution<XFloorOverlayType, Void> postDecode = new MethodExecution.Implementation();

	/**
	 * @see XFloorOverlayType#setHsl(int)
	 */
	@NotNull
	MethodExecution<XFloorOverlayType, Void> setHsl = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	int getHue();

	/**
	 * public field
	 */
	void setHue(int value);

	/**
	 * public field
	 */
	int getLightness();

	/**
	 * public field
	 */
	void setLightness(int value);

	/**
	 * public field
	 */
	int getRgb();

	/**
	 * public field
	 */
	void setRgb(int value);

	/**
	 * public field
	 */
	int getRgb2();

	/**
	 * public field
	 */
	void setRgb2(int value);

	/**
	 * public field
	 */
	int getSaturation();

	/**
	 * public field
	 */
	void setSaturation(int value);

	/**
	 * public field
	 */
	int getTexture();

	/**
	 * public field
	 */
	void setTexture(int value);

	/**
	 * public method
	 */
	void postDecode();

	/**
	 *  method
	 */
	void setHsl(int rgb);
}
