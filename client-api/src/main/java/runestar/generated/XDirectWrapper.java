package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Object;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XDirectWrapper extends Accessor, XWrapper {
	/**
	 * @see XDirectWrapper#get()
	 */
	@NotNull
	MethodExecution<XDirectWrapper, Object> get = new MethodExecution.Implementation();

	/**
	 * @see XDirectWrapper#isSoft()
	 */
	@NotNull
	MethodExecution<XDirectWrapper, Boolean> isSoft = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	Object getObj();

	/**
	 *  field
	 */
	void setObj(Object value);

	/**
	 *  method
	 */
	Object get();

	/**
	 *  method
	 */
	boolean isSoft();
}
