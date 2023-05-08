package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.net.URL;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XUrlRequest extends Accessor {
	/**
	 * @see XUrlRequest#getResponse()
	 */
	@NotNull
	MethodExecution<XUrlRequest, byte[]> getResponse = new MethodExecution.Implementation();

	/**
	 * @see XUrlRequest#isDone()
	 */
	@NotNull
	MethodExecution<XUrlRequest, Boolean> isDone = new MethodExecution.Implementation();

	/**
	 * volatile field
	 */
	byte[] getResponse0();

	/**
	 * volatile field
	 */
	void setResponse0(byte[] value);

	/**
	 * final field
	 */
	URL getUrl();

	/**
	 * public method
	 */
	byte[] getResponse();

	/**
	 * public method
	 */
	boolean isDone();
}
