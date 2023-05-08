package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XModel extends Accessor, XEntity {
	/**
	 * @see XModel#animate(XAnimFrameset, int)
	 */
	@NotNull
	MethodExecution<XModel, Void> animate = new MethodExecution.Implementation();

	/**
	 * @see XModel#calculateBoundingBox(int)
	 */
	@NotNull
	MethodExecution<XModel, Void> calculateBoundingBox = new MethodExecution.Implementation();

	/**
	 * @see XModel#calculateBoundsCylinder()
	 */
	@NotNull
	MethodExecution<XModel, Void> calculateBoundsCylinder = new MethodExecution.Implementation();

	/**
	 * @see XModel#draw(int, int, int, int, int, int, int, int, long)
	 */
	@NotNull
	MethodExecution<XModel, Void> draw = new MethodExecution.Implementation();

	/**
	 * @see XModel#offset(int, int, int)
	 */
	@NotNull
	MethodExecution<XModel, Void> offset = new MethodExecution.Implementation();

	/**
	 * @see XModel#resetBounds()
	 */
	@NotNull
	MethodExecution<XModel, Void> resetBounds = new MethodExecution.Implementation();

	/**
	 * @see XModel#resize(int, int, int)
	 */
	@NotNull
	MethodExecution<XModel, Void> resize = new MethodExecution.Implementation();

	/**
	 * @see XModel#rotateY180()
	 */
	@NotNull
	MethodExecution<XModel, Void> rotateY180 = new MethodExecution.Implementation();

	/**
	 * @see XModel#rotateY270Ccw()
	 */
	@NotNull
	MethodExecution<XModel, Void> rotateY270Ccw = new MethodExecution.Implementation();

	/**
	 * @see XModel#rotateY90Ccw()
	 */
	@NotNull
	MethodExecution<XModel, Void> rotateY90Ccw = new MethodExecution.Implementation();

	/**
	 * @see XModel#rotateZ(int)
	 */
	@NotNull
	MethodExecution<XModel, Void> rotateZ = new MethodExecution.Implementation();

	/**
	 * @see XModel#toSharedSequenceModel(boolean)
	 */
	@NotNull
	MethodExecution<XModel, XModel> toSharedSequenceModel = new MethodExecution.Implementation();

	/**
	 * @see XModel#toSharedSpotAnimationModel(boolean)
	 */
	@NotNull
	MethodExecution<XModel, XModel> toSharedSpotAnimationModel = new MethodExecution.Implementation();

	/**
	 * @see XModel#transform(int, int[], int, int, int)
	 */
	@NotNull
	MethodExecution<XModel, Void> transform = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getBottomY();

	/**
	 *  field
	 */
	void setBottomY(int value);

	/**
	 *  field
	 */
	int getBoundsType();

	/**
	 *  field
	 */
	void setBoundsType(int value);

	/**
	 *  field
	 */
	int getDiameter();

	/**
	 *  field
	 */
	void setDiameter(int value);

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
	int[] getFaceColors1();

	/**
	 *  field
	 */
	void setFaceColors1(int[] value);

	/**
	 *  field
	 */
	int[] getFaceColors2();

	/**
	 *  field
	 */
	void setFaceColors2(int[] value);

	/**
	 *  field
	 */
	int[] getFaceColors3();

	/**
	 *  field
	 */
	void setFaceColors3(int[] value);

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
	 * public field
	 */
	int getIndicesCount();

	/**
	 * public field
	 */
	void setIndicesCount(int value);

	/**
	 * public field
	 */
	boolean getIsSingleTile();

	/**
	 * public field
	 */
	void setIsSingleTile(boolean value);

	/**
	 *  field
	 */
	int getRadius();

	/**
	 *  field
	 */
	void setRadius(int value);

	/**
	 *  field
	 */
	int[][] getVertexLabels();

	/**
	 *  field
	 */
	void setVertexLabels(int[][] value);

	/**
	 * public field
	 */
	int getVerticesCount();

	/**
	 * public field
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
	 *  field
	 */
	int getXzRadius();

	/**
	 *  field
	 */
	void setXzRadius(int value);

	/**
	 * public method
	 */
	void animate(XAnimFrameset frames, int frame);

	/**
	 *  method
	 */
	void calculateBoundingBox(int yaw);

	/**
	 * public method
	 */
	void calculateBoundsCylinder();

	/**
	 *  method
	 */
	void draw(int yaw, int cameraPitchSine, int cameraPitchCosine, int cameraYawSine,
			int cameraYawCosine, int x, int y, int z, long tag);

	/**
	 * public method
	 */
	void offset(int x, int y, int z);

	/**
	 * public method
	 */
	void resetBounds();

	/**
	 * public method
	 */
	void resize(int x, int y, int z);

	/**
	 * public method
	 */
	void rotateY180();

	/**
	 * public method
	 */
	void rotateY270Ccw();

	/**
	 * public method
	 */
	void rotateY90Ccw();

	/**
	 * public method
	 */
	void rotateZ(int pitch);

	/**
	 * public method
	 */
	XModel toSharedSequenceModel(boolean b);

	/**
	 * public method
	 */
	XModel toSharedSpotAnimationModel(boolean b);

	/**
	 *  method
	 */
	void transform(int type, int[] labels, int tx, int ty, int tz);
}
