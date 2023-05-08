package runestar.generated;

import accessors.generate.base.Accessor;
import java.lang.String;

/**
 * public class
 */
public interface XClientScript extends Accessor, XDualNode {
	/**
	 *  field
	 */
	int getIntArgumentCount();

	/**
	 *  field
	 */
	void setIntArgumentCount(int value);

	/**
	 *  field
	 */
	int[] getIntOperands();

	/**
	 *  field
	 */
	void setIntOperands(int[] value);

	/**
	 *  field
	 */
	int getLocalIntCount();

	/**
	 *  field
	 */
	void setLocalIntCount(int value);

	/**
	 *  field
	 */
	int getLocalStringCount();

	/**
	 *  field
	 */
	void setLocalStringCount(int value);

	/**
	 *  field
	 */
	int[] getOpcodes();

	/**
	 *  field
	 */
	void setOpcodes(int[] value);

	/**
	 *  field
	 */
	int getStringArgumentCount();

	/**
	 *  field
	 */
	void setStringArgumentCount(int value);

	/**
	 *  field
	 */
	String[] getStringOperands();

	/**
	 *  field
	 */
	void setStringOperands(String[] value);

	/**
	 *  field
	 */
	XIterableNodeHashTable[] getSwitches();

	/**
	 *  field
	 */
	void setSwitches(XIterableNodeHashTable[] value);
}
