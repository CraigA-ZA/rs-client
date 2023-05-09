package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public abstract class
 */
public interface XAbstractRasterProvider extends Accessor {
	/**
	 * @see XAbstractRasterProvider#apply()
	 */
	@NotNull
	MethodExecution<XAbstractRasterProvider, Void> apply = new MethodExecution.Implementation();

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
	int getWidth();

	/**
	 * public field
	 */
	void setWidth(int value);

	/**
	 * public final method
	 */
	void apply();

	/**
	 * public abstract method
	 */
	void draw(int x, int y, int width, int height);

	/**
	 * public abstract method
	 */
	void drawFull(int x, int y);
}
