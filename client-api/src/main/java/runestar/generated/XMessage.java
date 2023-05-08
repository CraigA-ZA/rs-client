package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XMessage extends Accessor, XDualNode {
	/**
	 * @see XMessage#fillSenderUsername()
	 */
	@NotNull
	MethodExecution<XMessage, Void> fillSenderUsername = new MethodExecution.Implementation();

	/**
	 * @see XMessage#isFromFriend()
	 */
	@NotNull
	MethodExecution<XMessage, Boolean> isFromFriend = new MethodExecution.Implementation();

	/**
	 * @see XMessage#isFromIgnored()
	 */
	@NotNull
	MethodExecution<XMessage, Boolean> isFromIgnored = new MethodExecution.Implementation();

	/**
	 * @see XMessage#set(int, String, String, String)
	 */
	@NotNull
	MethodExecution<XMessage, Void> set = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getCount();

	/**
	 *  field
	 */
	void setCount(int value);

	/**
	 *  field
	 */
	int getCycle();

	/**
	 *  field
	 */
	void setCycle(int value);

	/**
	 *  field
	 */
	XTriBool getIsFromFriend0();

	/**
	 *  field
	 */
	void setIsFromFriend0(XTriBool value);

	/**
	 *  field
	 */
	XTriBool getIsFromIgnored0();

	/**
	 *  field
	 */
	void setIsFromIgnored0(XTriBool value);

	/**
	 *  field
	 */
	String getPrefix();

	/**
	 *  field
	 */
	void setPrefix(String value);

	/**
	 *  field
	 */
	String getSender();

	/**
	 *  field
	 */
	void setSender(String value);

	/**
	 *  field
	 */
	XUsername getSenderUsername();

	/**
	 *  field
	 */
	void setSenderUsername(XUsername value);

	/**
	 *  field
	 */
	String getText();

	/**
	 *  field
	 */
	void setText(String value);

	/**
	 *  field
	 */
	int getType();

	/**
	 *  field
	 */
	void setType(int value);

	/**
	 * final method
	 */
	void fillSenderUsername();

	/**
	 * final method
	 */
	boolean isFromFriend();

	/**
	 * final method
	 */
	boolean isFromIgnored();

	/**
	 *  method
	 */
	void set(int type, String sender, String prefix, String text);
}
