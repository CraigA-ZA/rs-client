package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XGrandExchangeOffer extends Accessor {
	/**
	 * @see XGrandExchangeOffer#status()
	 */
	@NotNull
	MethodExecution<XGrandExchangeOffer, Integer> status = new MethodExecution.Implementation();

	/**
	 * @see XGrandExchangeOffer#type()
	 */
	@NotNull
	MethodExecution<XGrandExchangeOffer, Integer> type = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	int getCurrentPrice();

	/**
	 * public field
	 */
	void setCurrentPrice(int value);

	/**
	 * public field
	 */
	int getCurrentQuantity();

	/**
	 * public field
	 */
	void setCurrentQuantity(int value);

	/**
	 * public field
	 */
	int getId();

	/**
	 * public field
	 */
	void setId(int value);

	/**
	 *  field
	 */
	byte getState();

	/**
	 *  field
	 */
	void setState(byte value);

	/**
	 * public field
	 */
	int getTotalQuantity();

	/**
	 * public field
	 */
	void setTotalQuantity(int value);

	/**
	 * public field
	 */
	int getUnitPrice();

	/**
	 * public field
	 */
	void setUnitPrice(int value);

	/**
	 * public method
	 */
	int status();

	/**
	 * public method
	 */
	int type();
}
