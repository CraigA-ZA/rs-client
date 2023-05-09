package runestar.generated;

import accessors.generate.base.Accessor;
import java.lang.String;
import java.lang.Throwable;

/**
 * public class extends {@link java.lang.RuntimeException}
 */
public interface XClientError extends Accessor {
	/**
	 *  field
	 */
	Throwable getCause();

	/**
	 *  field
	 */
	void setCause(Throwable value);

	/**
	 *  field
	 */
	String getMessage();

	/**
	 *  field
	 */
	void setMessage(String value);
}
