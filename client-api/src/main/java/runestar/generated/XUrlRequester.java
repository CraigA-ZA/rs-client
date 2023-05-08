package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Thread;
import java.net.URL;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;

/**
 * public abstract class
 */
public interface XUrlRequester extends Accessor {
	/**
	 * @see XUrlRequester#request(URL)
	 */
	@NotNull
	MethodExecution<XUrlRequester, XUrlRequest> request = new MethodExecution.Implementation();

	/**
	 * volatile field
	 */
	boolean getIsClosed();

	/**
	 * volatile field
	 */
	void setIsClosed(boolean value);

	/**
	 *  field
	 */
	Queue getRequests();

	/**
	 *  field
	 */
	void setRequests(Queue value);

	/**
	 * final field
	 */
	Thread getThread();

	/**
	 * public method
	 */
	XUrlRequest request(URL url);
}
