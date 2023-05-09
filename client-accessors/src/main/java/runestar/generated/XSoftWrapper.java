package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.ref.SoftReference;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XSoftWrapper extends Accessor, XWrapper {
	/**
	 * @see XSoftWrapper#get()
	 */
	@NotNull
	MethodExecution<XSoftWrapper, Object> get = new MethodExecution.Implementation();

	/**
	 * @see XSoftWrapper#isSoft()
	 */
	@NotNull
	MethodExecution<XSoftWrapper, Boolean> isSoft = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	SoftReference getRef();

	/**
	 *  field
	 */
	void setRef(SoftReference value);

	/**
	 *  method
	 */
	Object get();

	/**
	 *  method
	 */
	boolean isSoft();
}
