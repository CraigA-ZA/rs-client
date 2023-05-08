package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XMapElementType extends Accessor, XDualNode {
	/**
	 * @see XMapElementType#decode(XPacket)
	 */
	@NotNull
	MethodExecution<XMapElementType, Void> decode = new MethodExecution.Implementation();

	/**
	 * @see XMapElementType#decode0(XPacket, int)
	 */
	@NotNull
	MethodExecution<XMapElementType, Void> decode0 = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	int getCategory();

	/**
	 * public field
	 */
	void setCategory(int value);

	/**
	 * public field
	 */
	String[] getIop();

	/**
	 * public field
	 */
	void setIop(String[] value);

	/**
	 * public field
	 */
	int getLabelsize();

	/**
	 * public field
	 */
	void setLabelsize(int value);

	/**
	 * public field
	 */
	int getSprite1();

	/**
	 * public field
	 */
	void setSprite1(int value);

	/**
	 *  field
	 */
	int getSprite2();

	/**
	 *  field
	 */
	void setSprite2(int value);

	/**
	 *  method
	 */
	void decode(XPacket packet);

	/**
	 *  method
	 */
	void decode0(XPacket packet, int opcode);
}
