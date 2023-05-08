package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XPlayerAppearance extends Accessor {
	/**
	 * @see XPlayerAppearance#encode(XPacket)
	 */
	@NotNull
	MethodExecution<XPlayerAppearance, Void> encode = new MethodExecution.Implementation();

	/**
	 * @see XPlayerAppearance#getChatHeadId()
	 */
	@NotNull
	MethodExecution<XPlayerAppearance, Integer> getChatHeadId = new MethodExecution.Implementation();

	/**
	 * @see XPlayerAppearance#getChatHeadModel()
	 */
	@NotNull
	MethodExecution<XPlayerAppearance, XUnlitModel> getChatHeadModel = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int[] getEquipment();

	/**
	 *  field
	 */
	void setEquipment(int[] value);

	/**
	 *  field
	 */
	boolean getIsFemale();

	/**
	 *  field
	 */
	void setIsFemale(boolean value);

	/**
	 * public method
	 */
	void encode(XPacket packet);

	/**
	 * public method
	 */
	int getChatHeadId();

	/**
	 *  method
	 */
	XUnlitModel getChatHeadModel();
}
