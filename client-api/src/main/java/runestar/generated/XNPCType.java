package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XNPCType extends Accessor, XDualNode {
	/**
	 * @see XNPCType#getModel(XSeqType, int, XSeqType, int)
	 */
	@NotNull
	MethodExecution<XNPCType, XModel> getModel = new MethodExecution.Implementation();

	/**
	 * @see XNPCType#postDecode()
	 */
	@NotNull
	MethodExecution<XNPCType, Void> postDecode = new MethodExecution.Implementation();

	/**
	 * @see XNPCType#transform()
	 */
	@NotNull
	MethodExecution<XNPCType, XNPCType> transform = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	int getAmbient();

	/**
	 * public field
	 */
	void setAmbient(int value);

	/**
	 * public field
	 */
	boolean getClickable();

	/**
	 * public field
	 */
	void setClickable(boolean value);

	/**
	 * public field
	 */
	int getCombatLevel();

	/**
	 * public field
	 */
	void setCombatLevel(int value);

	/**
	 * public field
	 */
	int getContrast();

	/**
	 * public field
	 */
	void setContrast(int value);

	/**
	 * public field
	 */
	boolean getDrawMapDot();

	/**
	 * public field
	 */
	void setDrawMapDot(boolean value);

	/**
	 *  field
	 */
	int[] getHeadIconPrayer();

	/**
	 *  field
	 */
	void setHeadIconPrayer(int[] value);

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
	boolean getInteractable();

	/**
	 * public field
	 */
	void setInteractable(boolean value);

	/**
	 * public field
	 */
	boolean getIsFollower();

	/**
	 * public field
	 */
	void setIsFollower(boolean value);

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
	String getName();

	/**
	 * public field
	 */
	void setName(String value);

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
	int getResizeh();

	/**
	 *  field
	 */
	void setResizeh(int value);

	/**
	 *  field
	 */
	int getResizev();

	/**
	 *  field
	 */
	void setResizev(int value);

	/**
	 * public field
	 */
	int getSize();

	/**
	 * public field
	 */
	void setSize(int value);

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
	 * public field
	 */
	boolean getVisible();

	/**
	 * public field
	 */
	void setVisible(boolean value);

	/**
	 * public final method
	 */
	XModel getModel(XSeqType s1, int n1, XSeqType s2, int n2);

	/**
	 *  method
	 */
	void postDecode();

	/**
	 * public final method
	 */
	XNPCType transform();
}
