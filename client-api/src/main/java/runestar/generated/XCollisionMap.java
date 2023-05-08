package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XCollisionMap extends Accessor {
	/**
	 * @see XCollisionMap#clear()
	 */
	@NotNull
	MethodExecution<XCollisionMap, Void> clear = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	int[][] getFlags();

	/**
	 * public field
	 */
	void setFlags(int[][] value);

	/**
	 *  field
	 */
	int getXInset();

	/**
	 *  field
	 */
	void setXInset(int value);

	/**
	 *  field
	 */
	int getXSize();

	/**
	 *  field
	 */
	void setXSize(int value);

	/**
	 *  field
	 */
	int getYInset();

	/**
	 *  field
	 */
	void setYInset(int value);

	/**
	 *  field
	 */
	int getYSize();

	/**
	 *  field
	 */
	void setYSize(int value);

	/**
	 * public method
	 */
	void clear();
}
