package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XHeadbarType extends Accessor, XDualNode {
	/**
	 * @see XHeadbarType#getBackSprite()
	 */
	@NotNull
	MethodExecution<XHeadbarType, XSprite> getBackSprite = new MethodExecution.Implementation();

	/**
	 * @see XHeadbarType#getFrontSprite()
	 */
	@NotNull
	MethodExecution<XHeadbarType, XSprite> getFrontSprite = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	int getInt1();

	/**
	 * public field
	 */
	void setInt1(int value);

	/**
	 * public field
	 */
	int getInt2();

	/**
	 * public field
	 */
	void setInt2(int value);

	/**
	 * public field
	 */
	int getInt3();

	/**
	 * public field
	 */
	void setInt3(int value);

	/**
	 * public field
	 */
	int getInt4();

	/**
	 * public field
	 */
	void setInt4(int value);

	/**
	 * public field
	 */
	int getInt5();

	/**
	 * public field
	 */
	void setInt5(int value);

	/**
	 *  field
	 */
	int getSpriteback();

	/**
	 *  field
	 */
	void setSpriteback(int value);

	/**
	 *  field
	 */
	int getSpritefront();

	/**
	 *  field
	 */
	void setSpritefront(int value);

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
	int getWidthPadding();

	/**
	 * public field
	 */
	void setWidthPadding(int value);

	/**
	 * public method
	 */
	XSprite getBackSprite();

	/**
	 * public method
	 */
	XSprite getFrontSprite();
}
