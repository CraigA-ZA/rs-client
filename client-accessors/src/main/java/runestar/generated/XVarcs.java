package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.lang.Void;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XVarcs extends Accessor {
	/**
	 * @see XVarcs#clearTransient()
	 */
	@NotNull
	MethodExecution<XVarcs, Void> clearTransient = new MethodExecution.Implementation();

	/**
	 * @see XVarcs#getInt(int)
	 */
	@NotNull
	MethodExecution<XVarcs, Integer> getInt = new MethodExecution.Implementation();

	/**
	 * @see XVarcs#getString(int)
	 */
	@NotNull
	MethodExecution<XVarcs, String> getString = new MethodExecution.Implementation();

	/**
	 * @see XVarcs#getStringOld(int)
	 */
	@NotNull
	MethodExecution<XVarcs, String> getStringOld = new MethodExecution.Implementation();

	/**
	 * @see XVarcs#hasUnwrittenChanges()
	 */
	@NotNull
	MethodExecution<XVarcs, Boolean> hasUnwrittenChanges = new MethodExecution.Implementation();

	/**
	 * @see XVarcs#setInt(int, int)
	 */
	@NotNull
	MethodExecution<XVarcs, Void> setInt = new MethodExecution.Implementation();

	/**
	 * @see XVarcs#setString(int, String)
	 */
	@NotNull
	MethodExecution<XVarcs, Void> setString = new MethodExecution.Implementation();

	/**
	 * @see XVarcs#setStringOld(int, String)
	 */
	@NotNull
	MethodExecution<XVarcs, Void> setStringOld = new MethodExecution.Implementation();

	/**
	 * @see XVarcs#tryWrite()
	 */
	@NotNull
	MethodExecution<XVarcs, Void> tryWrite = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	boolean[] getIntsPersistence();

	/**
	 *  field
	 */
	void setIntsPersistence(boolean[] value);

	/**
	 *  field
	 */
	long getLastWriteTimeMs();

	/**
	 *  field
	 */
	void setLastWriteTimeMs(long value);

	/**
	 *  field
	 */
	Map getMap();

	/**
	 *  field
	 */
	void setMap(Map value);

	/**
	 *  field
	 */
	String[] getStrings();

	/**
	 *  field
	 */
	void setStrings(String[] value);

	/**
	 *  field
	 */
	boolean getUnwrittenChanges();

	/**
	 *  field
	 */
	void setUnwrittenChanges(boolean value);

	/**
	 *  method
	 */
	void clearTransient();

	/**
	 *  method
	 */
	int getInt(int index);

	/**
	 *  method
	 */
	String getString(int index);

	/**
	 *  method
	 */
	String getStringOld(int index);

	/**
	 *  method
	 */
	boolean hasUnwrittenChanges();

	/**
	 *  method
	 */
	void setInt(int index, int n);

	/**
	 *  method
	 */
	void setString(int index, String s);

	/**
	 *  method
	 */
	void setStringOld(int index, String s);

	/**
	 *  method
	 */
	void tryWrite();
}
