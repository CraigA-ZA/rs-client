package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XWorldMapRegion extends Accessor {
	/**
	 * @see XWorldMapRegion#icons()
	 */
	@NotNull
	MethodExecution<XWorldMapRegion, List> icons = new MethodExecution.Implementation();

	/**
	 * final field
	 */
	HashMap getFonts();

	/**
	 *  field
	 */
	List getIconsList();

	/**
	 *  field
	 */
	void setIconsList(List value);

	/**
	 *  field
	 */
	HashMap getIconsMap();

	/**
	 *  field
	 */
	void setIconsMap(HashMap value);

	/**
	 *  field
	 */
	int getX();

	/**
	 *  field
	 */
	void setX(int value);

	/**
	 *  field
	 */
	int getY();

	/**
	 *  field
	 */
	void setY(int value);

	/**
	 *  method
	 */
	List icons();
}
