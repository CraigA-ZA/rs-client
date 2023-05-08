package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XGraphicsObject extends Accessor, XEntity {
	/**
	 * @see XGraphicsObject#advance(int)
	 */
	@NotNull
	MethodExecution<XGraphicsObject, Void> advance = new MethodExecution.Implementation();

	/**
	 * @see XGraphicsObject#getModel()
	 */
	@NotNull
	MethodExecution<XGraphicsObject, XModel> getModel = new MethodExecution.Implementation();

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
	int getFrameCycle();

	/**
	 *  field
	 */
	void setFrameCycle(int value);

	/**
	 *  field
	 */
	int getHeight();

	/**
	 *  field
	 */
	void setHeight(int value);

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
	boolean getIsFinished();

	/**
	 *  field
	 */
	void setIsFinished(boolean value);

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
	 * final method
	 */
	void advance(int cycles);

	/**
	 * protected final method
	 */
	XModel getModel();
}
