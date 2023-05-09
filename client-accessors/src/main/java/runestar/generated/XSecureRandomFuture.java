package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Void;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XSecureRandomFuture extends Accessor {
	/**
	 * @see XSecureRandomFuture#get()
	 */
	@NotNull
	MethodExecution<XSecureRandomFuture, SecureRandom> get = new MethodExecution.Implementation();

	/**
	 * @see XSecureRandomFuture#isDone()
	 */
	@NotNull
	MethodExecution<XSecureRandomFuture, Boolean> isDone = new MethodExecution.Implementation();

	/**
	 * @see XSecureRandomFuture#shutdown()
	 */
	@NotNull
	MethodExecution<XSecureRandomFuture, Void> shutdown = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	ExecutorService getExecutor();

	/**
	 *  field
	 */
	void setExecutor(ExecutorService value);

	/**
	 *  field
	 */
	Future getFuture();

	/**
	 *  field
	 */
	void setFuture(Future value);

	/**
	 *  method
	 */
	SecureRandom get();

	/**
	 *  method
	 */
	boolean isDone();

	/**
	 *  method
	 */
	void shutdown();
}
