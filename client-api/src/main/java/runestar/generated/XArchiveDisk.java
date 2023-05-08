package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XArchiveDisk extends Accessor {
	/**
	 * @see XArchiveDisk#read(int)
	 */
	@NotNull
	MethodExecution<XArchiveDisk, byte[]> read = new MethodExecution.Implementation();

	/**
	 * @see XArchiveDisk#write()
	 */
	@NotNull
	MethodExecution<XArchiveDisk, Boolean> write = new MethodExecution.Implementation();

	/**
	 * @see XArchiveDisk#write0()
	 */
	@NotNull
	MethodExecution<XArchiveDisk, Boolean> write0 = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getArchive();

	/**
	 *  field
	 */
	void setArchive(int value);

	/**
	 *  field
	 */
	XBufferedFile getDatFile();

	/**
	 *  field
	 */
	void setDatFile(XBufferedFile value);

	/**
	 *  field
	 */
	XBufferedFile getIdxFile();

	/**
	 *  field
	 */
	void setIdxFile(XBufferedFile value);

	/**
	 *  field
	 */
	int getMaxEntrySize();

	/**
	 *  field
	 */
	void setMaxEntrySize(int value);

	/**
	 * public method
	 */
	byte[] read(int entry);

	/**
	 * public method
	 */
	boolean write();

	/**
	 *  method
	 */
	boolean write0();
}
