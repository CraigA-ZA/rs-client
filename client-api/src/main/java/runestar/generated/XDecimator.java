package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XDecimator extends Accessor {
	/**
	 * @see XDecimator#scalePosition(int)
	 */
	@NotNull
	MethodExecution<XDecimator, Integer> scalePosition = new MethodExecution.Implementation();

	/**
	 * @see XDecimator#scaleRate(int)
	 */
	@NotNull
	MethodExecution<XDecimator, Integer> scaleRate = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getInputRate();

	/**
	 *  field
	 */
	void setInputRate(int value);

	/**
	 *  field
	 */
	int getOutputRate();

	/**
	 *  field
	 */
	void setOutputRate(int value);

	/**
	 *  field
	 */
	int[][] getTable();

	/**
	 *  field
	 */
	void setTable(int[][] value);

	/**
	 *  method
	 */
	int scalePosition(int position);

	/**
	 *  method
	 */
	int scaleRate(int rate);
}
