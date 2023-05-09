package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XRasterProvider extends Accessor, XAbstractRasterProvider {
	/**
	 * @see XRasterProvider#draw(int, int, int, int)
	 */
	@NotNull
	MethodExecution<XRasterProvider, Void> draw = new MethodExecution.Implementation();

	/**
	 * @see XRasterProvider#draw0(Graphics, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XRasterProvider, Void> draw0 = new MethodExecution.Implementation();

	/**
	 * @see XRasterProvider#drawFull(int, int)
	 */
	@NotNull
	MethodExecution<XRasterProvider, Void> drawFull = new MethodExecution.Implementation();

	/**
	 * @see XRasterProvider#drawFull0(Graphics, int, int)
	 */
	@NotNull
	MethodExecution<XRasterProvider, Void> drawFull0 = new MethodExecution.Implementation();

	/**
	 * @see XRasterProvider#setComponent(Component)
	 */
	@NotNull
	MethodExecution<XRasterProvider, Void> setComponent = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	Component getComponent0();

	/**
	 *  field
	 */
	void setComponent0(Component value);

	/**
	 *  field
	 */
	Image getImage();

	/**
	 *  field
	 */
	void setImage(Image value);

	/**
	 * public final method
	 */
	void draw(int x, int y, int width, int height);

	/**
	 * final method
	 */
	void draw0(Graphics graphics, int x, int y, int width, int height);

	/**
	 * public final method
	 */
	void drawFull(int x, int y);

	/**
	 * final method
	 */
	void drawFull0(Graphics graphics, int x, int y);

	/**
	 * final method
	 */
	void setComponent(Component c);
}
