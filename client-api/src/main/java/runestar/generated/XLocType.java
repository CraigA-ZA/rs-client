package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XLocType extends Accessor, XDualNode {
	/**
	 * @see XLocType#getUnlitModel(int, int)
	 */
	@NotNull
	MethodExecution<XLocType, XUnlitModel> getUnlitModel = new MethodExecution.Implementation();

	/**
	 * @see XLocType#multiLoc()
	 */
	@NotNull
	MethodExecution<XLocType, XLocType> multiLoc = new MethodExecution.Implementation();

	/**
	 * @see XLocType#postDecode()
	 */
	@NotNull
	MethodExecution<XLocType, Void> postDecode = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getAmbient();

	/**
	 *  field
	 */
	void setAmbient(int value);

	/**
	 * public field
	 */
	int getAmbientSoundId();

	/**
	 * public field
	 */
	void setAmbientSoundId(int value);

	/**
	 * public field
	 */
	int getAnimationId();

	/**
	 * public field
	 */
	void setAnimationId(int value);

	/**
	 * public field
	 */
	boolean getBoolean1();

	/**
	 * public field
	 */
	void setBoolean1(boolean value);

	/**
	 * public field
	 */
	boolean getClipped();

	/**
	 * public field
	 */
	void setClipped(boolean value);

	/**
	 *  field
	 */
	int getContrast();

	/**
	 *  field
	 */
	void setContrast(int value);

	/**
	 *  field
	 */
	int getHillChange();

	/**
	 *  field
	 */
	void setHillChange(int value);

	/**
	 * public field
	 */
	int getId();

	/**
	 * public field
	 */
	void setId(int value);

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
	 * public field
	 */
	int getInt6();

	/**
	 * public field
	 */
	void setInt6(int value);

	/**
	 * public field
	 */
	int getInteractType();

	/**
	 * public field
	 */
	void setInteractType(int value);

	/**
	 * public field
	 */
	int getInteractable();

	/**
	 * public field
	 */
	void setInteractable(int value);

	/**
	 *  field
	 */
	boolean getIsRotated();

	/**
	 *  field
	 */
	void setIsRotated(boolean value);

	/**
	 *  field
	 */
	boolean getIsSolid();

	/**
	 *  field
	 */
	void setIsSolid(boolean value);

	/**
	 * public field
	 */
	int getLength();

	/**
	 * public field
	 */
	void setLength(int value);

	/**
	 * public field
	 */
	boolean getLowDetailVisible();

	/**
	 * public field
	 */
	void setLowDetailVisible(boolean value);

	/**
	 * public field
	 */
	int getMapIconId();

	/**
	 * public field
	 */
	void setMapIconId(int value);

	/**
	 * public field
	 */
	int getMapSceneId();

	/**
	 * public field
	 */
	void setMapSceneId(int value);

	/**
	 *  field
	 */
	int[] getModelTypes();

	/**
	 *  field
	 */
	void setModelTypes(int[] value);

	/**
	 *  field
	 */
	int[] getModels();

	/**
	 *  field
	 */
	void setModels(int[] value);

	/**
	 * public field
	 */
	int[] getMulti();

	/**
	 * public field
	 */
	void setMulti(int[] value);

	/**
	 *  field
	 */
	int getMultiVar();

	/**
	 *  field
	 */
	void setMultiVar(int value);

	/**
	 *  field
	 */
	int getMultiVarbit();

	/**
	 *  field
	 */
	void setMultiVarbit(int value);

	/**
	 * public field
	 */
	String getName();

	/**
	 * public field
	 */
	void setName(String value);

	/**
	 * public field
	 */
	boolean getOcclude();

	/**
	 * public field
	 */
	void setOcclude(boolean value);

	/**
	 *  field
	 */
	int getOffsetX();

	/**
	 *  field
	 */
	void setOffsetX(int value);

	/**
	 *  field
	 */
	int getOffsetY();

	/**
	 *  field
	 */
	void setOffsetY(int value);

	/**
	 *  field
	 */
	int getOffsetZ();

	/**
	 *  field
	 */
	void setOffsetZ(int value);

	/**
	 * public field
	 */
	String[] getOp();

	/**
	 * public field
	 */
	void setOp(String[] value);

	/**
	 *  field
	 */
	XIterableNodeHashTable getParams();

	/**
	 *  field
	 */
	void setParams(XIterableNodeHashTable value);

	/**
	 *  field
	 */
	short[] getRecol_d();

	/**
	 *  field
	 */
	void setRecol_d(short[] value);

	/**
	 *  field
	 */
	short[] getRecol_s();

	/**
	 *  field
	 */
	void setRecol_s(short[] value);

	/**
	 *  field
	 */
	int getResizeX();

	/**
	 *  field
	 */
	void setResizeX(int value);

	/**
	 *  field
	 */
	int getResizeY();

	/**
	 *  field
	 */
	void setResizeY(int value);

	/**
	 *  field
	 */
	int getResizeZ();

	/**
	 *  field
	 */
	void setResizeZ(int value);

	/**
	 *  field
	 */
	short[] getRetex_d();

	/**
	 *  field
	 */
	void setRetex_d(short[] value);

	/**
	 *  field
	 */
	short[] getRetex_s();

	/**
	 *  field
	 */
	void setRetex_s(short[] value);

	/**
	 *  field
	 */
	boolean getSharelight();

	/**
	 *  field
	 */
	void setSharelight(boolean value);

	/**
	 * public field
	 */
	int getWidth();

	/**
	 * public field
	 */
	void setWidth(int value);

	/**
	 * final method
	 */
	XUnlitModel getUnlitModel(int n, int m);

	/**
	 * public final method
	 */
	XLocType multiLoc();

	/**
	 *  method
	 */
	void postDecode();
}
