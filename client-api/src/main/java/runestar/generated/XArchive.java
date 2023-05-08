package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XArchive extends Accessor, XAbstractArchive {
	/**
	 * @see XArchive#loadAllLocal()
	 */
	@NotNull
	MethodExecution<XArchive, Void> loadAllLocal = new MethodExecution.Implementation();

	/**
	 * @see XArchive#write()
	 */
	@NotNull
	MethodExecution<XArchive, Void> write = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XArchiveDisk getArchiveDisk();

	/**
	 *  field
	 */
	void setArchiveDisk(XArchiveDisk value);

	/**
	 *  field
	 */
	int getIndex();

	/**
	 *  field
	 */
	void setIndex(int value);

	/**
	 *  field
	 */
	int getIndexCrc();

	/**
	 *  field
	 */
	void setIndexCrc(int value);

	/**
	 *  field
	 */
	int getIndexVersion();

	/**
	 *  field
	 */
	void setIndexVersion(int value);

	/**
	 *  field
	 */
	XArchiveDisk getMasterDisk();

	/**
	 *  field
	 */
	void setMasterDisk(XArchiveDisk value);

	/**
	 * volatile field
	 */
	boolean[] getValidGroups();

	/**
	 * volatile field
	 */
	void setValidGroups(boolean[] value);

	/**
	 *  method
	 */
	void loadAllLocal();

	/**
	 *  method
	 */
	void write();
}
