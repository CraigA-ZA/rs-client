package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XWorldMapArchiveLoader extends Accessor {
	/**
	 * @see XWorldMapArchiveLoader#isLoaded()
	 */
	@NotNull
	MethodExecution<XWorldMapArchiveLoader, Boolean> isLoaded = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArchiveLoader#load()
	 */
	@NotNull
	MethodExecution<XWorldMapArchiveLoader, Integer> load = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArchiveLoader#percentLoaded()
	 */
	@NotNull
	MethodExecution<XWorldMapArchiveLoader, Integer> percentLoaded = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArchiveLoader#reset(String)
	 */
	@NotNull
	MethodExecution<XWorldMapArchiveLoader, Void> reset = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XAbstractArchive getArchive();

	/**
	 *  field
	 */
	void setArchive(XAbstractArchive value);

	/**
	 *  field
	 */
	String getCacheName();

	/**
	 *  field
	 */
	void setCacheName(String value);

	/**
	 *  field
	 */
	boolean getIsLoaded0();

	/**
	 *  field
	 */
	void setIsLoaded0(boolean value);

	/**
	 *  field
	 */
	int getPercentLoaded0();

	/**
	 *  field
	 */
	void setPercentLoaded0(int value);

	/**
	 *  method
	 */
	boolean isLoaded();

	/**
	 *  method
	 */
	int load();

	/**
	 *  method
	 */
	int percentLoaded();

	/**
	 *  method
	 */
	void reset(String cacheName);
}
