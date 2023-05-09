package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.String;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XHitmarkType extends Accessor, XDualNode {
	/**
	 * @see XHitmarkType#getFont()
	 */
	@NotNull
	MethodExecution<XHitmarkType, XFont> getFont = new MethodExecution.Implementation();

	/**
	 * @see XHitmarkType#getString(int)
	 */
	@NotNull
	MethodExecution<XHitmarkType, String> getString = new MethodExecution.Implementation();

	/**
	 * @see XHitmarkType#transform()
	 */
	@NotNull
	MethodExecution<XHitmarkType, XHitmarkType> transform = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getFontId();

	/**
	 *  field
	 */
	void setFontId(int value);

	/**
	 *  field
	 */
	String getFormat();

	/**
	 *  field
	 */
	void setFormat(String value);

	/**
	 *  field
	 */
	int getTransformVarbit();

	/**
	 *  field
	 */
	void setTransformVarbit(int value);

	/**
	 *  field
	 */
	int getTransformVarp();

	/**
	 *  field
	 */
	void setTransformVarp(int value);

	/**
	 * public field
	 */
	int[] getTransforms();

	/**
	 * public field
	 */
	void setTransforms(int[] value);

	/**
	 * public method
	 */
	XFont getFont();

	/**
	 * public method
	 */
	String getString(int n);

	/**
	 * public final method
	 */
	XHitmarkType transform();
}
