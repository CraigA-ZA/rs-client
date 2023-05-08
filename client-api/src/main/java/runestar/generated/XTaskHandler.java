package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Thread;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XTaskHandler extends Accessor {
	/**
	 * @see XTaskHandler#close()
	 */
	@NotNull
	MethodExecution<XTaskHandler, Void> close = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XTask getCurrent();

	/**
	 *  field
	 */
	void setCurrent(XTask value);

	/**
	 *  field
	 */
	boolean getIsClosed();

	/**
	 *  field
	 */
	void setIsClosed(boolean value);

	/**
	 *  field
	 */
	XTask getTask0();

	/**
	 *  field
	 */
	void setTask0(XTask value);

	/**
	 *  field
	 */
	Thread getThread();

	/**
	 *  field
	 */
	void setThread(Thread value);

	/**
	 * public final method
	 */
	void close();
}
