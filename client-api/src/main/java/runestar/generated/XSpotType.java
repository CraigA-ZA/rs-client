package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XSpotType extends Accessor, XDualNode {
	/**
	 * @see XSpotType#decode(XPacket)
	 */
	@NotNull
	MethodExecution<XSpotType, Void> decode = new MethodExecution.Implementation();

	/**
	 * @see XSpotType#decode0(XPacket, int)
	 */
	@NotNull
	MethodExecution<XSpotType, Void> decode0 = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getAmbient();

	/**
	 *  field
	 */
	void setAmbient(int value);

	/**
	 *  field
	 */
	int getContrast();

	/**
	 *  field
	 */
	void setContrast(int value);

	/**
	 *  field
	 */
	int getId();

	/**
	 *  field
	 */
	void setId(int value);

	/**
	 *  field
	 */
	int getModel();

	/**
	 *  field
	 */
	void setModel(int value);

	/**
	 *  field
	 */
	int getOrientation();

	/**
	 *  field
	 */
	void setOrientation(int value);

	/**
	 * public field
	 */
	int getSequence();

	/**
	 * public field
	 */
	void setSequence(int value);

	/**
	 *  method
	 */
	void decode(XPacket packet);

	/**
	 *  method
	 */
	void decode0(XPacket packet, int n);
}
