package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.String;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XClientPreferences extends Accessor {
	/**
	 * @see XClientPreferences#toBuffer()
	 */
	@NotNull
	MethodExecution<XClientPreferences, XPacket> toBuffer = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	boolean getHideUsername();

	/**
	 *  field
	 */
	void setHideUsername(boolean value);

	/**
	 * final field
	 */
	Map getParameters();

	/**
	 *  field
	 */
	String getRememberedUsername();

	/**
	 *  field
	 */
	void setRememberedUsername(String value);

	/**
	 *  field
	 */
	boolean getRoofsHidden();

	/**
	 *  field
	 */
	void setRoofsHidden(boolean value);

	/**
	 *  field
	 */
	boolean getTitleMusicDisabled();

	/**
	 *  field
	 */
	void setTitleMusicDisabled(boolean value);

	/**
	 *  field
	 */
	int getWindowMode();

	/**
	 *  field
	 */
	void setWindowMode(int value);

	/**
	 *  method
	 */
	XPacket toBuffer();
}
