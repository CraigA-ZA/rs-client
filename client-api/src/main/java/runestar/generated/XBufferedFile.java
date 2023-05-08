package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Long;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XBufferedFile extends Accessor {
	/**
	 * @see XBufferedFile#close()
	 */
	@NotNull
	MethodExecution<XBufferedFile, Void> close = new MethodExecution.Implementation();

	/**
	 * @see XBufferedFile#flush()
	 */
	@NotNull
	MethodExecution<XBufferedFile, Void> flush = new MethodExecution.Implementation();

	/**
	 * @see XBufferedFile#length()
	 */
	@NotNull
	MethodExecution<XBufferedFile, Long> length = new MethodExecution.Implementation();

	/**
	 * @see XBufferedFile#load()
	 */
	@NotNull
	MethodExecution<XBufferedFile, Void> load = new MethodExecution.Implementation();

	/**
	 * @see XBufferedFile#read(byte[], int, int)
	 */
	@NotNull
	MethodExecution<XBufferedFile, Void> read = new MethodExecution.Implementation();

	/**
	 * @see XBufferedFile#readFill(byte[])
	 */
	@NotNull
	MethodExecution<XBufferedFile, Void> readFill = new MethodExecution.Implementation();

	/**
	 * @see XBufferedFile#seek(long)
	 */
	@NotNull
	MethodExecution<XBufferedFile, Void> seek = new MethodExecution.Implementation();

	/**
	 * @see XBufferedFile#write(byte[], int, int)
	 */
	@NotNull
	MethodExecution<XBufferedFile, Void> write = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XAccessFile getAccessFile();

	/**
	 *  field
	 */
	void setAccessFile(XAccessFile value);

	/**
	 *  field
	 */
	long getCapacity();

	/**
	 *  field
	 */
	void setCapacity(long value);

	/**
	 *  field
	 */
	byte[] getReadBuffer();

	/**
	 *  field
	 */
	void setReadBuffer(byte[] value);

	/**
	 *  field
	 */
	byte[] getWriteBuffer();

	/**
	 *  field
	 */
	void setWriteBuffer(byte[] value);

	/**
	 * public method
	 */
	void close();

	/**
	 *  method
	 */
	void flush();

	/**
	 * public method
	 */
	long length();

	/**
	 *  method
	 */
	void load();

	/**
	 * public method
	 */
	void read(byte[] dst, int dstIndex, int length);

	/**
	 * public method
	 */
	void readFill(byte[] dst);

	/**
	 * public method
	 */
	void seek(long index);

	/**
	 * public method
	 */
	void write(byte[] src, int srcIndex, int length);
}
