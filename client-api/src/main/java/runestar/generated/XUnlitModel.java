package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XUnlitModel extends Accessor, XEntity {
	/**
	 * @see XUnlitModel#invalidate()
	 */
	@NotNull
	MethodExecution<XUnlitModel, Void> invalidate = new MethodExecution.Implementation();

	/**
	 * @see XUnlitModel#light(int, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XUnlitModel, XModel> light = new MethodExecution.Implementation();

	/**
	 * @see XUnlitModel#recolor(short, short)
	 */
	@NotNull
	MethodExecution<XUnlitModel, Void> recolor = new MethodExecution.Implementation();

	/**
	 * @see XUnlitModel#retexture(short, short)
	 */
	@NotNull
	MethodExecution<XUnlitModel, Void> retexture = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	byte[] getFaceAlphas();

	/**
	 *  field
	 */
	void setFaceAlphas(byte[] value);

	/**
	 *  field
	 */
	short[] getFaceColors();

	/**
	 *  field
	 */
	void setFaceColors(short[] value);

	/**
	 *  field
	 */
	int getFaceCount();

	/**
	 *  field
	 */
	void setFaceCount(int value);

	/**
	 *  field
	 */
	int[][] getFaceLabelsAlpha();

	/**
	 *  field
	 */
	void setFaceLabelsAlpha(int[][] value);

	/**
	 *  field
	 */
	XFaceNormal[] getFaceNormals();

	/**
	 *  field
	 */
	void setFaceNormals(XFaceNormal[] value);

	/**
	 *  field
	 */
	short[] getFaceTextures();

	/**
	 *  field
	 */
	void setFaceTextures(short[] value);

	/**
	 *  field
	 */
	int[] getIndices1();

	/**
	 *  field
	 */
	void setIndices1(int[] value);

	/**
	 *  field
	 */
	int[] getIndices2();

	/**
	 *  field
	 */
	void setIndices2(int[] value);

	/**
	 *  field
	 */
	int[] getIndices3();

	/**
	 *  field
	 */
	void setIndices3(int[] value);

	/**
	 *  field
	 */
	boolean getIsBoundsCalculated();

	/**
	 *  field
	 */
	void setIsBoundsCalculated(boolean value);

	/**
	 *  field
	 */
	int[][] getVertexLabels();

	/**
	 *  field
	 */
	void setVertexLabels(int[][] value);

	/**
	 *  field
	 */
	int getVerticesCount();

	/**
	 *  field
	 */
	void setVerticesCount(int value);

	/**
	 *  field
	 */
	int[] getVerticesX();

	/**
	 *  field
	 */
	void setVerticesX(int[] value);

	/**
	 *  field
	 */
	int[] getVerticesY();

	/**
	 *  field
	 */
	void setVerticesY(int[] value);

	/**
	 *  field
	 */
	int[] getVerticesZ();

	/**
	 *  field
	 */
	void setVerticesZ(int[] value);

	/**
	 *  method
	 */
	void invalidate();

	/**
	 * public final method
	 */
	XModel light(int a, int b, int c, int d, int e);

	/**
	 * public method
	 */
	void recolor(short from, short to);

	/**
	 * public method
	 */
	void retexture(short from, short to);
}
