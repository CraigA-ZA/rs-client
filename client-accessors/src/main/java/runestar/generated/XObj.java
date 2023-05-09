package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XObj extends Accessor, XEntity {
	/**
	 * @see XObj#getModel()
	 */
	@NotNull
	MethodExecution<XObj, XModel> getModel = new MethodExecution.Implementation();

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
	int getQuantity();

	/**
	 *  field
	 */
	void setQuantity(int value);

	/**
	 * protected final method
	 */
	XModel getModel();
}
