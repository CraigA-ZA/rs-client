package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import org.jetbrains.annotations.NotNull;

/**
 * public abstract class
 */
public interface XAbstractArchive extends Accessor {
	/**
	 * @see XAbstractArchive#buildFiles(int, int[])
	 */
	@NotNull
	MethodExecution<XAbstractArchive, Boolean> buildFiles = new MethodExecution.Implementation();

	/**
	 * @see XAbstractArchive#getFile(int, int)
	 */
	@NotNull
	MethodExecution<XAbstractArchive, byte[]> getFile = new MethodExecution.Implementation();

	/**
	 * @see XAbstractArchive#getFileFlat(int)
	 */
	@NotNull
	MethodExecution<XAbstractArchive, byte[]> getFileFlat = new MethodExecution.Implementation();

	/**
	 * @see XAbstractArchive#getFileId(int, String)
	 */
	@NotNull
	MethodExecution<XAbstractArchive, Integer> getFileId = new MethodExecution.Implementation();

	/**
	 * @see XAbstractArchive#getGroupId(String)
	 */
	@NotNull
	MethodExecution<XAbstractArchive, Integer> getGroupId = new MethodExecution.Implementation();

	/**
	 * @see XAbstractArchive#groupLoadPercentByName(String)
	 */
	@NotNull
	MethodExecution<XAbstractArchive, Integer> groupLoadPercentByName = new MethodExecution.Implementation();

	/**
	 * @see XAbstractArchive#takeFile(int, int)
	 */
	@NotNull
	MethodExecution<XAbstractArchive, byte[]> takeFile = new MethodExecution.Implementation();

	/**
	 * @see XAbstractArchive#takeFileByNames(String, String)
	 */
	@NotNull
	MethodExecution<XAbstractArchive, byte[]> takeFileByNames = new MethodExecution.Implementation();

	/**
	 * @see XAbstractArchive#takeFileEncrypted(int, int, int[])
	 */
	@NotNull
	MethodExecution<XAbstractArchive, byte[]> takeFileEncrypted = new MethodExecution.Implementation();

	/**
	 * @see XAbstractArchive#takeFileFlat(int)
	 */
	@NotNull
	MethodExecution<XAbstractArchive, byte[]> takeFileFlat = new MethodExecution.Implementation();

	/**
	 * @see XAbstractArchive#tryLoadFile(int, int)
	 */
	@NotNull
	MethodExecution<XAbstractArchive, Boolean> tryLoadFile = new MethodExecution.Implementation();

	/**
	 * @see XAbstractArchive#tryLoadFileByNames(String, String)
	 */
	@NotNull
	MethodExecution<XAbstractArchive, Boolean> tryLoadFileByNames = new MethodExecution.Implementation();

	/**
	 * @see XAbstractArchive#tryLoadGroup(int)
	 */
	@NotNull
	MethodExecution<XAbstractArchive, Boolean> tryLoadGroup = new MethodExecution.Implementation();

	/**
	 * @see XAbstractArchive#tryLoadGroupByName(String)
	 */
	@NotNull
	MethodExecution<XAbstractArchive, Boolean> tryLoadGroupByName = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int[] getFileCounts();

	/**
	 *  field
	 */
	void setFileCounts(int[] value);

	/**
	 *  field
	 */
	int[][] getFileIds();

	/**
	 *  field
	 */
	void setFileIds(int[][] value);

	/**
	 *  field
	 */
	XIntHashTable[] getFileNameHashTables();

	/**
	 *  field
	 */
	void setFileNameHashTables(XIntHashTable[] value);

	/**
	 *  field
	 */
	int[][] getFileNameHashes();

	/**
	 *  field
	 */
	void setFileNameHashes(int[][] value);

	/**
	 *  field
	 */
	Object[][] getFiles();

	/**
	 *  field
	 */
	void setFiles(Object[][] value);

	/**
	 *  field
	 */
	int getGroupCount();

	/**
	 *  field
	 */
	void setGroupCount(int value);

	/**
	 *  field
	 */
	int[] getGroupCrcs();

	/**
	 *  field
	 */
	void setGroupCrcs(int[] value);

	/**
	 *  field
	 */
	int[] getGroupIds();

	/**
	 *  field
	 */
	void setGroupIds(int[] value);

	/**
	 *  field
	 */
	XIntHashTable getGroupNameHashTable();

	/**
	 *  field
	 */
	void setGroupNameHashTable(XIntHashTable value);

	/**
	 *  field
	 */
	int[] getGroupNameHashes();

	/**
	 *  field
	 */
	void setGroupNameHashes(int[] value);

	/**
	 *  field
	 */
	int[] getGroupVersions();

	/**
	 *  field
	 */
	void setGroupVersions(int[] value);

	/**
	 *  field
	 */
	Object[] getGroups();

	/**
	 *  field
	 */
	void setGroups(Object[] value);

	/**
	 * public field
	 */
	int getHash();

	/**
	 * public field
	 */
	void setHash(int value);

	/**
	 *  field
	 */
	boolean getReleaseGroups();

	/**
	 *  field
	 */
	void setReleaseGroups(boolean value);

	/**
	 *  field
	 */
	boolean getShallowFiles();

	/**
	 *  field
	 */
	void setShallowFiles(boolean value);

	/**
	 *  method
	 */
	boolean buildFiles(int group, int[] xteaKey);

	/**
	 * public method
	 */
	byte[] getFile(int group, int file);

	/**
	 * public method
	 */
	byte[] getFileFlat(int groupOrFile);

	/**
	 * public method
	 */
	int getFileId(int group, String fileName);

	/**
	 * public method
	 */
	int getGroupId(String groupName);

	/**
	 * public method
	 */
	int groupLoadPercentByName(String groupName);

	/**
	 * public method
	 */
	byte[] takeFile(int group, int file);

	/**
	 * public method
	 */
	byte[] takeFileByNames(String groupName, String fileName);

	/**
	 * public method
	 */
	byte[] takeFileEncrypted(int group, int file, int[] xteaKey);

	/**
	 * public method
	 */
	byte[] takeFileFlat(int groupOrFile);

	/**
	 * public method
	 */
	boolean tryLoadFile(int group, int file);

	/**
	 * public method
	 */
	boolean tryLoadFileByNames(String groupName, String fileName);

	/**
	 * public method
	 */
	boolean tryLoadGroup(int group);

	/**
	 * public method
	 */
	boolean tryLoadGroupByName(String groupName);
}
