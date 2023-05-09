package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.Boolean;
import java.lang.Thread;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XBufferedSink extends Accessor {
	/**
	 * @see XBufferedSink#close()
	 */
	@NotNull
	MethodExecution<XBufferedSink, Void> close = new MethodExecution.Implementation();

	/**
	 * @see XBufferedSink#isClosed()
	 */
	@NotNull
	MethodExecution<XBufferedSink, Boolean> isClosed = new MethodExecution.Implementation();

	/**
	 * @see XBufferedSink#write(byte[], int, int)
	 */
	@NotNull
	MethodExecution<XBufferedSink, Void> write = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	byte[] getBuffer();

	/**
	 *  field
	 */
	void setBuffer(byte[] value);

	/**
	 *  field
	 */
	int getCapacity();

	/**
	 *  field
	 */
	void setCapacity(int value);

	/**
	 *  field
	 */
	IOException getException();

	/**
	 *  field
	 */
	void setException(IOException value);

	/**
	 *  field
	 */
	boolean getIsClosed0();

	/**
	 *  field
	 */
	void setIsClosed0(boolean value);

	/**
	 *  field
	 */
	int getLimit();

	/**
	 *  field
	 */
	void setLimit(int value);

	/**
	 *  field
	 */
	OutputStream getOutputStream();

	/**
	 *  field
	 */
	void setOutputStream(OutputStream value);

	/**
	 *  field
	 */
	int getPosition();

	/**
	 *  field
	 */
	void setPosition(int value);

	/**
	 *  field
	 */
	Thread getThread();

	/**
	 *  field
	 */
	void setThread(Thread value);

	/**
	 *  method
	 */
	void close();

	/**
	 *  method
	 */
	boolean isClosed();

	/**
	 *  method
	 */
	void write(byte[] src, int srcIndex, int length);
}
