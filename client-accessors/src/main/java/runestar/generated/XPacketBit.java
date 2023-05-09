package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XPacketBit extends Accessor, XPacket {
	/**
	 * @see XPacketBit#bitsRemaining(int)
	 */
	@NotNull
	MethodExecution<XPacketBit, Integer> bitsRemaining = new MethodExecution.Implementation();

	/**
	 * @see XPacketBit#exportIndex()
	 */
	@NotNull
	MethodExecution<XPacketBit, Void> exportIndex = new MethodExecution.Implementation();

	/**
	 * @see XPacketBit#gBit(int)
	 */
	@NotNull
	MethodExecution<XPacketBit, Integer> gBit = new MethodExecution.Implementation();

	/**
	 * @see XPacketBit#gIsaac1()
	 */
	@NotNull
	MethodExecution<XPacketBit, Integer> gIsaac1 = new MethodExecution.Implementation();

	/**
	 * @see XPacketBit#gIsaacSmart1or2()
	 */
	@NotNull
	MethodExecution<XPacketBit, Integer> gIsaacSmart1or2 = new MethodExecution.Implementation();

	/**
	 * @see XPacketBit#importIndex()
	 */
	@NotNull
	MethodExecution<XPacketBit, Void> importIndex = new MethodExecution.Implementation();

	/**
	 * @see XPacketBit#newIsaac(int[])
	 */
	@NotNull
	MethodExecution<XPacketBit, Void> newIsaac = new MethodExecution.Implementation();

	/**
	 * @see XPacketBit#pIsaac1(int)
	 */
	@NotNull
	MethodExecution<XPacketBit, Void> pIsaac1 = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getBitIndex();

	/**
	 *  field
	 */
	void setBitIndex(int value);

	/**
	 *  field
	 */
	XIsaac getIsaac0();

	/**
	 *  field
	 */
	void setIsaac0(XIsaac value);

	/**
	 * public method
	 */
	int bitsRemaining(int index);

	/**
	 * public method
	 */
	void exportIndex();

	/**
	 * public method
	 */
	int gBit(int bits);

	/**
	 * public method
	 */
	int gIsaac1();

	/**
	 * public method
	 */
	int gIsaacSmart1or2();

	/**
	 * public method
	 */
	void importIndex();

	/**
	 * public method
	 */
	void newIsaac(int[] array);

	/**
	 * public method
	 */
	void pIsaac1(int b);
}
