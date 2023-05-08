package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Void;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XWorldMapManager extends Accessor {
	/**
	 * @see XWorldMapManager#buildIcons()
	 */
	@NotNull
	MethodExecution<XWorldMapManager, HashMap> buildIcons = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapManager#buildIcons0()
	 */
	@NotNull
	MethodExecution<XWorldMapManager, Void> buildIcons0 = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapManager#clearIcons()
	 */
	@NotNull
	MethodExecution<XWorldMapManager, Void> clearIcons = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapManager#isLoaded()
	 */
	@NotNull
	MethodExecution<XWorldMapManager, Boolean> isLoaded = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapManager#load(XAbstractArchive, String, boolean)
	 */
	@NotNull
	MethodExecution<XWorldMapManager, Void> load = new MethodExecution.Implementation();

	/**
	 * final field
	 */
	HashMap getFonts();

	/**
	 *  field
	 */
	HashMap getIcons();

	/**
	 *  field
	 */
	void setIcons(HashMap value);

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
	boolean getLoadStarted();

	/**
	 *  field
	 */
	void setLoadStarted(boolean value);

	/**
	 *  field
	 */
	XWorldMapAreaData getMapAreaData();

	/**
	 *  field
	 */
	void setMapAreaData(XWorldMapAreaData value);

	/**
	 *  field
	 */
	XIndexedSprite[] getMapSceneSprites();

	/**
	 *  field
	 */
	void setMapSceneSprites(XIndexedSprite[] value);

	/**
	 *  field
	 */
	XSprite getOverviewSprite();

	/**
	 *  field
	 */
	void setOverviewSprite(XSprite value);

	/**
	 *  field
	 */
	XWorldMapRegion[][] getRegions();

	/**
	 *  field
	 */
	void setRegions(XWorldMapRegion[][] value);

	/**
	 * public method
	 */
	HashMap buildIcons();

	/**
	 *  method
	 */
	void buildIcons0();

	/**
	 * public final method
	 */
	void clearIcons();

	/**
	 * public method
	 */
	boolean isLoaded();

	/**
	 * public method
	 */
	void load(XAbstractArchive indexCache, String cacheName, boolean isMembersWorld);
}
