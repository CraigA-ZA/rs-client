package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XClientScriptEvent extends Accessor, XNode {
	/**
	 * @see XClientScriptEvent#setArgs(Object[])
	 */
	@NotNull
	MethodExecution<XClientScriptEvent, Void> setArgs = new MethodExecution.Implementation();

	/**
	 * @see XClientScriptEvent#setType(int)
	 */
	@NotNull
	MethodExecution<XClientScriptEvent, Void> setType = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	Object[] getArgs0();

	/**
	 *  field
	 */
	void setArgs0(Object[] value);

	/**
	 *  field
	 */
	boolean getBoolean1();

	/**
	 *  field
	 */
	void setBoolean1(boolean value);

	/**
	 *  field
	 */
	XComponent getComponent();

	/**
	 *  field
	 */
	void setComponent(XComponent value);

	/**
	 *  field
	 */
	XComponent getDragTarget();

	/**
	 *  field
	 */
	void setDragTarget(XComponent value);

	/**
	 *  field
	 */
	int getKeyPressed();

	/**
	 *  field
	 */
	void setKeyPressed(int value);

	/**
	 *  field
	 */
	int getKeyTyped();

	/**
	 *  field
	 */
	void setKeyTyped(int value);

	/**
	 *  field
	 */
	int getMouseX();

	/**
	 *  field
	 */
	void setMouseX(int value);

	/**
	 *  field
	 */
	int getMouseY();

	/**
	 *  field
	 */
	void setMouseY(int value);

	/**
	 *  field
	 */
	int getOpIndex();

	/**
	 *  field
	 */
	void setOpIndex(int value);

	/**
	 *  field
	 */
	String getOpbase();

	/**
	 *  field
	 */
	void setOpbase(String value);

	/**
	 *  field
	 */
	int getType0();

	/**
	 *  field
	 */
	void setType0(int value);

	/**
	 * public method
	 */
	void setArgs(Object[] args);

	/**
	 * public method
	 */
	void setType(int type);
}
