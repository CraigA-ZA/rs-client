package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XDynamicObject extends Accessor, XEntity {
	/**
	 * @see XDynamicObject#getModel()
	 */
	@NotNull
	MethodExecution<XDynamicObject, XModel> getModel = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getCycleStart();

	/**
	 *  field
	 */
	void setCycleStart(int value);

	/**
	 *  field
	 */
	int getFrame();

	/**
	 *  field
	 */
	void setFrame(int value);

	/**
	 *  field
	 */
	int getId();

	/**
	 *  field
	 */
	void setId(int value);

	/**
	 *  field
	 */
	int getOrientation();

	/**
	 *  field
	 */
	void setOrientation(int value);

	/**
	 *  field
	 */
	int getPlane();

	/**
	 *  field
	 */
	void setPlane(int value);

	/**
	 *  field
	 */
	XSeqType getSeqType();

	/**
	 *  field
	 */
	void setSeqType(XSeqType value);

	/**
	 *  field
	 */
	int getType();

	/**
	 *  field
	 */
	void setType(int value);

	/**
	 *  field
	 */
	int getX();

	/**
	 *  field
	 */
	void setX(int value);

	/**
	 *  field
	 */
	int getY();

	/**
	 *  field
	 */
	void setY(int value);

	/**
	 * protected final method
	 */
	XModel getModel();
}
