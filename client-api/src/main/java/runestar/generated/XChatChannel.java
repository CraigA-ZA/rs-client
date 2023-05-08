package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import java.lang.String;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XChatChannel extends Accessor {
	/**
	 * @see XChatChannel#addMessage(int, String, String, String)
	 */
	@NotNull
	MethodExecution<XChatChannel, XMessage> addMessage = new MethodExecution.Implementation();

	/**
	 * @see XChatChannel#getMessage(int)
	 */
	@NotNull
	MethodExecution<XChatChannel, XMessage> getMessage = new MethodExecution.Implementation();

	/**
	 * @see XChatChannel#size()
	 */
	@NotNull
	MethodExecution<XChatChannel, Integer> size = new MethodExecution.Implementation();

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
	XMessage[] getMessages();

	/**
	 *  field
	 */
	void setMessages(XMessage[] value);

	/**
	 *  method
	 */
	XMessage addMessage(int type, String sender, String text, String prefix);

	/**
	 *  method
	 */
	XMessage getMessage(int index);

	/**
	 *  method
	 */
	int size();
}
