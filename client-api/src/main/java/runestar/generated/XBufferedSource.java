package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Thread;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XBufferedSource extends Accessor {
	/**
	 * @see XBufferedSource#available()
	 */
	@NotNull
	MethodExecution<XBufferedSource, Integer> available = new MethodExecution.Implementation();

	/**
	 * @see XBufferedSource#close()
	 */
	@NotNull
	MethodExecution<XBufferedSource, Void> close = new MethodExecution.Implementation();

	/**
	 * @see XBufferedSource#isAvailable(int)
	 */
	@NotNull
	MethodExecution<XBufferedSource, Boolean> isAvailable = new MethodExecution.Implementation();

	/**
	 * @see XBufferedSource#read(byte[], int, int)
	 */
	@NotNull
	MethodExecution<XBufferedSource, Integer> read = new MethodExecution.Implementation();

	/**
	 * @see XBufferedSource#readUnsignedByte()
	 */
	@NotNull
	MethodExecution<XBufferedSource, Integer> readUnsignedByte = new MethodExecution.Implementation();

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
	InputStream getInputStream();

	/**
	 *  field
	 */
	void setInputStream(InputStream value);

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
	int available();

	/**
	 *  method
	 */
	void close();

	/**
	 *  method
	 */
	boolean isAvailable(int length);

	/**
	 *  method
	 */
	int read(byte[] dst, int dstIndex, int length);

	/**
	 *  method
	 */
	int readUnsignedByte();
}
