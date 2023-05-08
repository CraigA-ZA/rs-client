package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XNpc extends Accessor, XActor {
	/**
	 * @see XNpc#getModel()
	 */
	@NotNull
	MethodExecution<XNpc, XModel> getModel = new MethodExecution.Implementation();

	/**
	 * @see XNpc#isVisible()
	 */
	@NotNull
	MethodExecution<XNpc, Boolean> isVisible = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XNPCType getType();

	/**
	 *  field
	 */
	void setType(XNPCType value);

	/**
	 * protected final method
	 */
	XModel getModel();

	/**
	 * final method
	 */
	boolean isVisible();
}
