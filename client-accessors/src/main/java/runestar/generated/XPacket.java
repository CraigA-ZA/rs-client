package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XPacket extends Accessor, XNode {
	/**
	 * @see XPacket#g1()
	 */
	@NotNull
	MethodExecution<XPacket, Integer> g1 = new MethodExecution.Implementation();

	/**
	 * @see XPacket#g1n()
	 */
	@NotNull
	MethodExecution<XPacket, Integer> g1n = new MethodExecution.Implementation();

	/**
	 * @see XPacket#g1s()
	 */
	@NotNull
	MethodExecution<XPacket, Byte> g1s = new MethodExecution.Implementation();

	/**
	 * @see XPacket#g4s()
	 */
	@NotNull
	MethodExecution<XPacket, Integer> g4s = new MethodExecution.Implementation();

	/**
	 * @see XPacket#g8s()
	 */
	@NotNull
	MethodExecution<XPacket, Long> g8s = new MethodExecution.Implementation();

	/**
	 * @see XPacket#gbool()
	 */
	@NotNull
	MethodExecution<XPacket, Boolean> gbool = new MethodExecution.Implementation();

	/**
	 * @see XPacket#gjstr()
	 */
	@NotNull
	MethodExecution<XPacket, String> gjstr = new MethodExecution.Implementation();

	/**
	 * @see XPacket#p2(int)
	 */
	@NotNull
	MethodExecution<XPacket, Void> p2 = new MethodExecution.Implementation();

	/**
	 * @see XPacket#p2LE(int)
	 */
	@NotNull
	MethodExecution<XPacket, Void> p2LE = new MethodExecution.Implementation();

	/**
	 * @see XPacket#p4LE16(int)
	 */
	@NotNull
	MethodExecution<XPacket, Void> p4LE16 = new MethodExecution.Implementation();

	/**
	 * @see XPacket#p4ME(int)
	 */
	@NotNull
	MethodExecution<XPacket, Void> p4ME = new MethodExecution.Implementation();

	/**
	 * @see XPacket#p6(long)
	 */
	@NotNull
	MethodExecution<XPacket, Void> p6 = new MethodExecution.Implementation();

	/**
	 * @see XPacket#p8s(long)
	 */
	@NotNull
	MethodExecution<XPacket, Void> p8s = new MethodExecution.Implementation();

	/**
	 * @see XPacket#pSmart1or2(int)
	 */
	@NotNull
	MethodExecution<XPacket, Void> pSmart1or2 = new MethodExecution.Implementation();

	/**
	 * @see XPacket#pbool(boolean)
	 */
	@NotNull
	MethodExecution<XPacket, Void> pbool = new MethodExecution.Implementation();

	/**
	 * @see XPacket#pjstr(String)
	 */
	@NotNull
	MethodExecution<XPacket, Void> pjstr = new MethodExecution.Implementation();

	/**
	 * @see XPacket#tinyKeyDecrypt(int[], int, int)
	 */
	@NotNull
	MethodExecution<XPacket, Void> tinyKeyDecrypt = new MethodExecution.Implementation();

	/**
	 * @see XPacket#tinyKeyDecryptAll(int[])
	 */
	@NotNull
	MethodExecution<XPacket, Void> tinyKeyDecryptAll = new MethodExecution.Implementation();

	/**
	 * @see XPacket#tinyKeyEncrypt(int[], int, int)
	 */
	@NotNull
	MethodExecution<XPacket, Void> tinyKeyEncrypt = new MethodExecution.Implementation();

	/**
	 * @see XPacket#tinyKeyEncryptAll(int[])
	 */
	@NotNull
	MethodExecution<XPacket, Void> tinyKeyEncryptAll = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	byte[] getArray();

	/**
	 * public field
	 */
	void setArray(byte[] value);

	/**
	 * public field
	 */
	int getIndex();

	/**
	 * public field
	 */
	void setIndex(int value);

	/**
	 * public method
	 */
	int g1();

	/**
	 * public method
	 */
	int g1n();

	/**
	 * public method
	 */
	byte g1s();

	/**
	 * public method
	 */
	int g4s();

	/**
	 * public method
	 */
	long g8s();

	/**
	 * public method
	 */
	boolean gbool();

	/**
	 * public method
	 */
	String gjstr();

	/**
	 * public method
	 */
	void p2(int value);

	/**
	 * public method
	 */
	void p2LE(int value);

	/**
	 * public method
	 */
	void p4LE16(int value);

	/**
	 * public method
	 */
	void p4ME(int value);

	/**
	 * public method
	 */
	void p6(long n);

	/**
	 * public method
	 */
	void p8s(long n);

	/**
	 * public method
	 */
	void pSmart1or2(int value);

	/**
	 * public method
	 */
	void pbool(boolean value);

	/**
	 * public method
	 */
	void pjstr(String string);

	/**
	 * public method
	 */
	void tinyKeyDecrypt(int[] key, int start, int end);

	/**
	 * public method
	 */
	void tinyKeyDecryptAll(int[] key);

	/**
	 * public method
	 */
	void tinyKeyEncrypt(int[] key, int start, int end);

	/**
	 * public method
	 */
	void tinyKeyEncryptAll(int[] key);
}
