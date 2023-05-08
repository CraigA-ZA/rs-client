package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XAttackOption extends Accessor {
	/**
	 * @see XAttackOption#ordinal()
	 */
	@NotNull
	MethodExecution<XAttackOption, Integer> ordinal = new MethodExecution.Implementation();

	/**
	 * final field
	 */
	int getId();

	/**
	 * public method
	 */
	int ordinal();
}
