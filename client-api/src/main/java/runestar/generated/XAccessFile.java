package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.io.RandomAccessFile;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XAccessFile extends Accessor {
	/**
	 * @see XAccessFile#close()
	 */
	@NotNull
	MethodExecution<XAccessFile, Void> close = new MethodExecution.Implementation();

	/**
	 * @see XAccessFile#closeSync(boolean)
	 */
	@NotNull
	MethodExecution<XAccessFile, Void> closeSync = new MethodExecution.Implementation();

	/**
	 * @see XAccessFile#length()
	 */
	@NotNull
	MethodExecution<XAccessFile, Long> length = new MethodExecution.Implementation();

	/**
	 * @see XAccessFile#read(byte[], int, int)
	 */
	@NotNull
	MethodExecution<XAccessFile, Integer> read = new MethodExecution.Implementation();

	/**
	 * @see XAccessFile#seek(long)
	 */
	@NotNull
	MethodExecution<XAccessFile, Void> seek = new MethodExecution.Implementation();

	/**
	 * @see XAccessFile#write(byte[], int, int)
	 */
	@NotNull
	MethodExecution<XAccessFile, Void> write = new MethodExecution.Implementation();

	/**
	 * final field
	 */
	long getCapacity();

	/**
	 *  field
	 */
	RandomAccessFile getFile();

	/**
	 *  field
	 */
	void setFile(RandomAccessFile value);

	/**
	 *  field
	 */
	long getIndex();

	/**
	 *  field
	 */
	void setIndex(long value);

	/**
	 * public final method
	 */
	void close();

	/**
	 * public final method
	 */
	void closeSync(boolean sync);

	/**
	 * public final method
	 */
	long length();

	/**
	 * public final method
	 */
	int read(byte[] dst, int dstIndex, int length);

	/**
	 * final method
	 */
	void seek(long index);

	/**
	 * public final method
	 */
	void write(byte[] src, int srcIndex, int length);
}
