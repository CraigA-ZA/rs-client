package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Void;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XWorldMap extends Accessor {
	/**
	 * @see XWorldMap#currentMapAreaId()
	 */
	@NotNull
	MethodExecution<XWorldMap, Integer> currentMapAreaId = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#draw(int, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XWorldMap, Void> draw = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#getCurrentMapArea()
	 */
	@NotNull
	MethodExecution<XWorldMap, XWorldMapArea> getCurrentMapArea = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#getElementsEnabled()
	 */
	@NotNull
	MethodExecution<XWorldMap, Boolean> getElementsEnabled = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#getMapArea(int)
	 */
	@NotNull
	MethodExecution<XWorldMap, XWorldMapArea> getMapArea = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#getZoomLevel()
	 */
	@NotNull
	MethodExecution<XWorldMap, Integer> getZoomLevel = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#initializeWorldMapManager(XWorldMapArea)
	 */
	@NotNull
	MethodExecution<XWorldMap, Void> initializeWorldMapManager = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#isCacheLoaded()
	 */
	@NotNull
	MethodExecution<XWorldMap, Boolean> isCacheLoaded = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#jump(int, int, int)
	 */
	@NotNull
	MethodExecution<XWorldMap, Void> jump = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#loadCache()
	 */
	@NotNull
	MethodExecution<XWorldMap, Void> loadCache = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#mapAreaAtCoord(int, int, int)
	 */
	@NotNull
	MethodExecution<XWorldMap, XWorldMapArea> mapAreaAtCoord = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#menuAction(int, int, XCoord, XCoord)
	 */
	@NotNull
	MethodExecution<XWorldMap, Void> menuAction = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#onCycle(int, int, boolean, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XWorldMap, Void> onCycle = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#setCurrentMapArea(XWorldMapArea)
	 */
	@NotNull
	MethodExecution<XWorldMap, Void> setCurrentMapArea = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#setCurrentMapAreaId(int)
	 */
	@NotNull
	MethodExecution<XWorldMap, Void> setCurrentMapAreaId = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#setZoomLevel(int)
	 */
	@NotNull
	MethodExecution<XWorldMap, Void> setZoomLevel = new MethodExecution.Implementation();

	/**
	 * @see XWorldMap#smoothZoom()
	 */
	@NotNull
	MethodExecution<XWorldMap, Void> smoothZoom = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XWorldMapArchiveLoader getCacheLoader();

	/**
	 *  field
	 */
	void setCacheLoader(XWorldMapArchiveLoader value);

	/**
	 *  field
	 */
	XWorldMapArea getCurrentMapArea0();

	/**
	 *  field
	 */
	void setCurrentMapArea0(XWorldMapArea value);

	/**
	 *  field
	 */
	boolean getElementsDisabled();

	/**
	 *  field
	 */
	void setElementsDisabled(boolean value);

	/**
	 *  field
	 */
	HashSet getEnabledCategories();

	/**
	 *  field
	 */
	void setEnabledCategories(HashSet value);

	/**
	 *  field
	 */
	HashSet getEnabledElements();

	/**
	 *  field
	 */
	void setEnabledElements(HashSet value);

	/**
	 *  field
	 */
	HashSet getFlashingElements();

	/**
	 *  field
	 */
	void setFlashingElements(HashSet value);

	/**
	 *  field
	 */
	XFont getFont();

	/**
	 *  field
	 */
	void setFont(XFont value);

	/**
	 *  field
	 */
	HashMap getFonts();

	/**
	 *  field
	 */
	void setFonts(HashMap value);

	/**
	 *  field
	 */
	Iterator getIconIterator();

	/**
	 *  field
	 */
	void setIconIterator(Iterator value);

	/**
	 *  field
	 */
	XWorldMapArea getMainMapArea();

	/**
	 *  field
	 */
	void setMainMapArea(XWorldMapArea value);

	/**
	 *  field
	 */
	HashMap getMapAreas();

	/**
	 *  field
	 */
	void setMapAreas(HashMap value);

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
	XCoord getMouseCoord();

	/**
	 *  field
	 */
	void setMouseCoord(XCoord value);

	/**
	 *  field
	 */
	boolean getPerpetualFlash0();

	/**
	 *  field
	 */
	void setPerpetualFlash0(boolean value);

	/**
	 *  field
	 */
	XSprite getSprite();

	/**
	 *  field
	 */
	void setSprite(XSprite value);

	/**
	 *  field
	 */
	XWorldMapManager getWorldMapManager();

	/**
	 *  field
	 */
	void setWorldMapManager(XWorldMapManager value);

	/**
	 *  field
	 */
	float getZoom();

	/**
	 *  field
	 */
	void setZoom(float value);

	/**
	 *  field
	 */
	float getZoomTarget();

	/**
	 *  field
	 */
	void setZoomTarget(float value);

	/**
	 * public method
	 */
	int currentMapAreaId();

	/**
	 * public method
	 */
	void draw(int x, int y, int width, int height, int cycle);

	/**
	 * public method
	 */
	XWorldMapArea getCurrentMapArea();

	/**
	 * public method
	 */
	boolean getElementsEnabled();

	/**
	 * public method
	 */
	XWorldMapArea getMapArea(int id);

	/**
	 * public method
	 */
	int getZoomLevel();

	/**
	 *  method
	 */
	void initializeWorldMapManager(XWorldMapArea mapArea);

	/**
	 * public method
	 */
	boolean isCacheLoaded();

	/**
	 *  method
	 */
	void jump(int plane, int x, int y);

	/**
	 * public method
	 */
	void loadCache();

	/**
	 * public method
	 */
	XWorldMapArea mapAreaAtCoord(int plane, int x, int y);

	/**
	 * public method
	 */
	void menuAction(int a, int b, XCoord c, XCoord d);

	/**
	 * public method
	 */
	void onCycle(int a, int b, boolean c, int d, int e, int f, int g);

	/**
	 *  method
	 */
	void setCurrentMapArea(XWorldMapArea mapArea);

	/**
	 * public method
	 */
	void setCurrentMapAreaId(int id);

	/**
	 * public method
	 */
	void setZoomLevel(int zoom);

	/**
	 *  method
	 */
	void smoothZoom();
}
