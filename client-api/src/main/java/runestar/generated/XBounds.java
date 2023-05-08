package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XBounds extends Accessor {
	/**
	 * @see XBounds#setLocation(int, int)
	 */
	@NotNull
	MethodExecution<XBounds, Void> setLocation = new MethodExecution.Implementation();

	/**
	 * @see XBounds#setSize(int, int)
	 */
	@NotNull
	MethodExecution<XBounds, Void> setSize = new MethodExecution.Implementation();

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
	int getWidth();

	/**
	 * public field
	 */
	void setWidth(int value);

	/**
	 * public field
	 */
	int getX();

	/**
	 * public field
	 */
	void setX(int value);

	/**
	 * public field
	 */
	int getY();

	/**
	 * public field
	 */
	void setY(int value);

	/**
	 * public method
	 */
	void setLocation(int x, int y);

	/**
	 * public method
	 */
	void setSize(int width, int height);
}
