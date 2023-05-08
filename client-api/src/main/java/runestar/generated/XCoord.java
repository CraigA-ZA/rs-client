package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.String;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XCoord extends Accessor {
	/**
	 * @see XCoord#equals0(XCoord)
	 */
	@NotNull
	MethodExecution<XCoord, Boolean> equals0 = new MethodExecution.Implementation();

	/**
	 * @see XCoord#toString0(String)
	 */
	@NotNull
	MethodExecution<XCoord, String> toString0 = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	int getX();

	/**
	 * public field
	 */
	void setX(int value);

	/**
	 * public field
	 */
	int getY();

	/**
	 * public field
	 */
	void setY(int value);

	/**
	 * public field
	 */
	int getZ();

	/**
	 * public field
	 */
	void setZ(int value);

	/**
	 *  method
	 */
	boolean equals0(XCoord other);

	/**
	 *  method
	 */
	String toString0(String separator);
}
