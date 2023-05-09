package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XObjType extends Accessor, XDualNode {
	/**
	 * @see XObjType#genBought(XObjType, XObjType)
	 */
	@NotNull
	MethodExecution<XObjType, Void> genBought = new MethodExecution.Implementation();

	/**
	 * @see XObjType#genCert(XObjType, XObjType)
	 */
	@NotNull
	MethodExecution<XObjType, Void> genCert = new MethodExecution.Implementation();

	/**
	 * @see XObjType#genPlaceholder(XObjType, XObjType)
	 */
	@NotNull
	MethodExecution<XObjType, Void> genPlaceholder = new MethodExecution.Implementation();

	/**
	 * @see XObjType#getCountObj(int)
	 */
	@NotNull
	MethodExecution<XObjType, XObjType> getCountObj = new MethodExecution.Implementation();

	/**
	 * @see XObjType#getModel(int)
	 */
	@NotNull
	MethodExecution<XObjType, XModel> getModel = new MethodExecution.Implementation();

	/**
	 * @see XObjType#getShiftClickIndex()
	 */
	@NotNull
	MethodExecution<XObjType, Integer> getShiftClickIndex = new MethodExecution.Implementation();

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
	int getBoughtlink();

	/**
	 * public field
	 */
	void setBoughtlink(int value);

	/**
	 * public field
	 */
	int getBoughttemplate();

	/**
	 * public field
	 */
	void setBoughttemplate(int value);

	/**
	 *  field
	 */
	int getCertlink();

	/**
	 *  field
	 */
	void setCertlink(int value);

	/**
	 *  field
	 */
	int getCerttemplate();

	/**
	 *  field
	 */
	void setCerttemplate(int value);

	/**
	 *  field
	 */
	int getContrast();

	/**
	 *  field
	 */
	void setContrast(int value);

	/**
	 * public field
	 */
	int getCost();

	/**
	 * public field
	 */
	void setCost(int value);

	/**
	 *  field
	 */
	int[] getCountco();

	/**
	 *  field
	 */
	void setCountco(int[] value);

	/**
	 *  field
	 */
	int[] getCountobj();

	/**
	 *  field
	 */
	void setCountobj(int[] value);

	/**
	 *  field
	 */
	int getId();

	/**
	 *  field
	 */
	void setId(int value);

	/**
	 * public field
	 */
	String[] getIop();

	/**
	 * public field
	 */
	void setIop(String[] value);

	/**
	 *  field
	 */
	int getManhead();

	/**
	 *  field
	 */
	void setManhead(int value);

	/**
	 *  field
	 */
	int getManhead2();

	/**
	 *  field
	 */
	void setManhead2(int value);

	/**
	 * public field
	 */
	int getManwear();

	/**
	 * public field
	 */
	void setManwear(int value);

	/**
	 * public field
	 */
	int getManwear2();

	/**
	 * public field
	 */
	void setManwear2(int value);

	/**
	 *  field
	 */
	int getManwear3();

	/**
	 *  field
	 */
	void setManwear3(int value);

	/**
	 *  field
	 */
	int getManwearyoff();

	/**
	 *  field
	 */
	void setManwearyoff(int value);

	/**
	 * public field
	 */
	boolean getMembers();

	/**
	 * public field
	 */
	void setMembers(boolean value);

	/**
	 *  field
	 */
	int getModel();

	/**
	 *  field
	 */
	void setModel(int value);

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
	 * public field
	 */
	int getPlaceholderlink();

	/**
	 * public field
	 */
	void setPlaceholderlink(int value);

	/**
	 * public field
	 */
	int getPlaceholdertemplate();

	/**
	 * public field
	 */
	void setPlaceholdertemplate(int value);

	/**
	 * public field
	 */
	short[] getRecol_d();

	/**
	 * public field
	 */
	void setRecol_d(short[] value);

	/**
	 * public field
	 */
	short[] getRecol_s();

	/**
	 * public field
	 */
	void setRecol_s(short[] value);

	/**
	 *  field
	 */
	int getResizex();

	/**
	 *  field
	 */
	void setResizex(int value);

	/**
	 * public field
	 */
	int getResizey();

	/**
	 * public field
	 */
	void setResizey(int value);

	/**
	 * public field
	 */
	int getResizez();

	/**
	 * public field
	 */
	void setResizez(int value);

	/**
	 * public field
	 */
	short[] getRetex_d();

	/**
	 * public field
	 */
	void setRetex_d(short[] value);

	/**
	 * public field
	 */
	short[] getRetex_s();

	/**
	 * public field
	 */
	void setRetex_s(short[] value);

	/**
	 * public field
	 */
	int getShiftclickindex();

	/**
	 * public field
	 */
	void setShiftclickindex(int value);

	/**
	 * public field
	 */
	int getStackable();

	/**
	 * public field
	 */
	void setStackable(int value);

	/**
	 * public field
	 */
	boolean getStockmarket();

	/**
	 * public field
	 */
	void setStockmarket(boolean value);

	/**
	 *  field
	 */
	int getTeam();

	/**
	 *  field
	 */
	void setTeam(int value);

	/**
	 *  field
	 */
	int getWomanhead();

	/**
	 *  field
	 */
	void setWomanhead(int value);

	/**
	 *  field
	 */
	int getWomanhead2();

	/**
	 *  field
	 */
	void setWomanhead2(int value);

	/**
	 *  field
	 */
	int getWomanwear();

	/**
	 *  field
	 */
	void setWomanwear(int value);

	/**
	 *  field
	 */
	int getWomanwear2();

	/**
	 *  field
	 */
	void setWomanwear2(int value);

	/**
	 *  field
	 */
	int getWomanwear3();

	/**
	 *  field
	 */
	void setWomanwear3(int value);

	/**
	 *  field
	 */
	int getWomanwearyoff();

	/**
	 *  field
	 */
	void setWomanwearyoff(int value);

	/**
	 * public field
	 */
	int getXan2d();

	/**
	 * public field
	 */
	void setXan2d(int value);

	/**
	 * public field
	 */
	int getXof2d();

	/**
	 * public field
	 */
	void setXof2d(int value);

	/**
	 * public field
	 */
	int getYan2d();

	/**
	 * public field
	 */
	void setYan2d(int value);

	/**
	 * public field
	 */
	int getYof2d();

	/**
	 * public field
	 */
	void setYof2d(int value);

	/**
	 * public field
	 */
	int getZan2d();

	/**
	 * public field
	 */
	void setZan2d(int value);

	/**
	 * public field
	 */
	int getZoom2d();

	/**
	 * public field
	 */
	void setZoom2d(int value);

	/**
	 *  method
	 */
	void genBought(XObjType template, XObjType link);

	/**
	 *  method
	 */
	void genCert(XObjType template, XObjType link);

	/**
	 *  method
	 */
	void genPlaceholder(XObjType template, XObjType link);

	/**
	 * public method
	 */
	XObjType getCountObj(int quantity);

	/**
	 * public final method
	 */
	XModel getModel(int quantity);

	/**
	 * public method
	 */
	int getShiftClickIndex();
}
