package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XTexture extends Accessor, XNode {
	/**
	 * @see XTexture#animate(int)
	 */
	@NotNull
	MethodExecution<XTexture, Void> animate = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getAnimationDirection();

	/**
	 *  field
	 */
	void setAnimationDirection(int value);

	/**
	 *  field
	 */
	int getAnimationSpeed();

	/**
	 *  field
	 */
	void setAnimationSpeed(int value);

	/**
	 *  field
	 */
	int[] getFiles();

	/**
	 *  field
	 */
	void setFiles(int[] value);

	/**
	 *  field
	 */
	int getInt1();

	/**
	 *  field
	 */
	void setInt1(int value);

	/**
	 *  field
	 */
	boolean getIsLoaded();

	/**
	 *  field
	 */
	void setIsLoaded(boolean value);

	/**
	 *  field
	 */
	int[] getPixels();

	/**
	 *  field
	 */
	void setPixels(int[] value);

	/**
	 *  method
	 */
	void animate(int n);
}
