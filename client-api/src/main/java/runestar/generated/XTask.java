package runestar.generated;

import accessors.generate.base.Accessor;
import java.lang.Object;

/**
 * public class
 */
public interface XTask extends Accessor {
	/**
	 * public field
	 */
	int getIntArgument();

	/**
	 * public field
	 */
	void setIntArgument(int value);

	/**
	 *  field
	 */
	XTask getNext();

	/**
	 *  field
	 */
	void setNext(XTask value);

	/**
	 *  field
	 */
	Object getObjectArgument();

	/**
	 *  field
	 */
	void setObjectArgument(Object value);

	/**
	 * public volatile field
	 */
	Object getResult();

	/**
	 * public volatile field
	 */
	void setResult(Object value);

	/**
	 * public volatile field
	 */
	int getStatus();

	/**
	 * public volatile field
	 */
	void setStatus(int value);

	/**
	 *  field
	 */
	int getType();

	/**
	 *  field
	 */
	void setType(int value);
}
