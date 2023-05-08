package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XDirectByteArrayCopier extends Accessor, XAbstractByteArrayCopier {
	/**
	 * @see XDirectByteArrayCopier#get()
	 */
	@NotNull
	MethodExecution<XDirectByteArrayCopier, byte[]> get = new MethodExecution.Implementation();

	/**
	 * @see XDirectByteArrayCopier#set(byte[])
	 */
	@NotNull
	MethodExecution<XDirectByteArrayCopier, Void> set = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	ByteBuffer getDirectBuffer();

	/**
	 *  field
	 */
	void setDirectBuffer(ByteBuffer value);

	/**
	 *  method
	 */
	byte[] get();

	/**
	 *  method
	 */
	void set(byte[] array);
}
