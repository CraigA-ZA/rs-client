package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XTextureProvider extends Accessor {
	/**
	 * @see XTextureProvider#animate(int)
	 */
	@NotNull
	MethodExecution<XTextureProvider, Void> animate = new MethodExecution.Implementation();

	/**
	 * @see XTextureProvider#clear()
	 */
	@NotNull
	MethodExecution<XTextureProvider, Void> clear = new MethodExecution.Implementation();

	/**
	 * @see XTextureProvider#setBrightness(double)
	 */
	@NotNull
	MethodExecution<XTextureProvider, Void> setBrightness = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XAbstractArchive getArchive();

	/**
	 *  field
	 */
	void setArchive(XAbstractArchive value);

	/**
	 *  field
	 */
	double getBrightness0();

	/**
	 *  field
	 */
	void setBrightness0(double value);

	/**
	 *  field
	 */
	int getCapacity();

	/**
	 *  field
	 */
	void setCapacity(int value);

	/**
	 *  field
	 */
	XNodeDeque getDeque();

	/**
	 *  field
	 */
	void setDeque(XNodeDeque value);

	/**
	 *  field
	 */
	int getRemaining();

	/**
	 *  field
	 */
	void setRemaining(int value);

	/**
	 *  field
	 */
	int getTextureSize();

	/**
	 *  field
	 */
	void setTextureSize(int value);

	/**
	 *  field
	 */
	XTexture[] getTextures();

	/**
	 *  field
	 */
	void setTextures(XTexture[] value);

	/**
	 * public method
	 */
	void animate(int n);

	/**
	 * public method
	 */
	void clear();

	/**
	 * public method
	 */
	void setBrightness(double brightness);
}
