package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XPacketWriter extends Accessor {
	/**
	 * @see XPacketWriter#getSocket()
	 */
	@NotNull
	MethodExecution<XPacketWriter, XAbstractSocket> getSocket = new MethodExecution.Implementation();

	/**
	 * @see XPacketWriter#setSocket(XAbstractSocket)
	 */
	@NotNull
	MethodExecution<XPacketWriter, Void> setSocket = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XPacketBit getBit();

	/**
	 *  field
	 */
	void setBit(XPacketBit value);

	/**
	 *  field
	 */
	XIterableNodeDeque getBitNodes();

	/**
	 *  field
	 */
	void setBitNodes(XIterableNodeDeque value);

	/**
	 *  field
	 */
	XPacket getPacket();

	/**
	 *  field
	 */
	void setPacket(XPacket value);

	/**
	 *  field
	 */
	XServerProt getServerPacket0();

	/**
	 *  field
	 */
	void setServerPacket0(XServerProt value);

	/**
	 *  field
	 */
	int getServerPacket0Length();

	/**
	 *  field
	 */
	void setServerPacket0Length(int value);

	/**
	 *  field
	 */
	XAbstractSocket getSocket0();

	/**
	 *  field
	 */
	void setSocket0(XAbstractSocket value);

	/**
	 *  method
	 */
	XAbstractSocket getSocket();

	/**
	 *  method
	 */
	void setSocket(XAbstractSocket socket);
}
