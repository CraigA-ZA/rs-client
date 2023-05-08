package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XClanChat extends Accessor, XUserList {
	/**
	 * @see XClanChat#readUpdate(XPacket)
	 */
	@NotNull
	MethodExecution<XClanChat, Void> readUpdate = new MethodExecution.Implementation();

	/**
	 * final field
	 */
	XUsernamed getLocalUser();

	/**
	 * final field
	 */
	XLoginType getLoginType();

	/**
	 * public field
	 */
	byte getMinKick();

	/**
	 * public field
	 */
	void setMinKick(byte value);

	/**
	 * public field
	 */
	String getName();

	/**
	 * public field
	 */
	void setName(String value);

	/**
	 * public field
	 */
	String getOwner();

	/**
	 * public field
	 */
	void setOwner(String value);

	/**
	 * public field
	 */
	int getRank();

	/**
	 * public field
	 */
	void setRank(int value);

	/**
	 * public final method
	 */
	void readUpdate(XPacket packet);
}
