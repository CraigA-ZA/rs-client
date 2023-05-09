package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XGraphicsDefaults extends Accessor {
	/**
	 * @see XGraphicsDefaults#decode(XAbstractArchive)
	 */
	@NotNull
	MethodExecution<XGraphicsDefaults, Void> decode = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	int getCompass();

	/**
	 * public field
	 */
	void setCompass(int value);

	/**
	 * public field
	 */
	int getCross();

	/**
	 * public field
	 */
	void setCross(int value);

	/**
	 * public field
	 */
	int getHeadiconshint();

	/**
	 * public field
	 */
	void setHeadiconshint(int value);

	/**
	 * public field
	 */
	int getHeadiconspk();

	/**
	 * public field
	 */
	void setHeadiconspk(int value);

	/**
	 * public field
	 */
	int getHeadiconsprayer();

	/**
	 * public field
	 */
	void setHeadiconsprayer(int value);

	/**
	 * public field
	 */
	int getMapdots();

	/**
	 * public field
	 */
	void setMapdots(int value);

	/**
	 * public field
	 */
	int getMapedge();

	/**
	 * public field
	 */
	void setMapedge(int value);

	/**
	 * public field
	 */
	int getMapmarker();

	/**
	 * public field
	 */
	void setMapmarker(int value);

	/**
	 * public field
	 */
	int getMapscene();

	/**
	 * public field
	 */
	void setMapscene(int value);

	/**
	 * public field
	 */
	int getModicons();

	/**
	 * public field
	 */
	void setModicons(int value);

	/**
	 * public field
	 */
	int getScrollbar();

	/**
	 * public field
	 */
	void setScrollbar(int value);

	/**
	 * public method
	 */
	void decode(XAbstractArchive archive);
}
