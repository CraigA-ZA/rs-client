package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XScene extends Accessor {
	/**
	 * @see XScene#clear()
	 */
	@NotNull
	MethodExecution<XScene, Void> clear = new MethodExecution.Implementation();

	/**
	 * @see XScene#clearTempScenery()
	 */
	@NotNull
	MethodExecution<XScene, Void> clearTempScenery = new MethodExecution.Implementation();

	/**
	 * @see XScene#draw(int, int, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XScene, Void> draw = new MethodExecution.Implementation();

	/**
	 * @see XScene#drawTile(XTile, boolean)
	 */
	@NotNull
	MethodExecution<XScene, Void> drawTile = new MethodExecution.Implementation();

	/**
	 * @see XScene#drawTileMinimap(int[], int, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XScene, Void> drawTileMinimap = new MethodExecution.Implementation();

	/**
	 * @see XScene#getFloorDecoration(int, int, int)
	 */
	@NotNull
	MethodExecution<XScene, XFloorDecoration> getFloorDecoration = new MethodExecution.Implementation();

	/**
	 * @see XScene#getFloorDecorationTag(int, int, int)
	 */
	@NotNull
	MethodExecution<XScene, Long> getFloorDecorationTag = new MethodExecution.Implementation();

	/**
	 * @see XScene#getObjectFlags(int, int, int, long)
	 */
	@NotNull
	MethodExecution<XScene, Integer> getObjectFlags = new MethodExecution.Implementation();

	/**
	 * @see XScene#getWall(int, int, int)
	 */
	@NotNull
	MethodExecution<XScene, XWall> getWall = new MethodExecution.Implementation();

	/**
	 * @see XScene#getWallDecoration(int, int, int)
	 */
	@NotNull
	MethodExecution<XScene, XWallDecoration> getWallDecoration = new MethodExecution.Implementation();

	/**
	 * @see XScene#init(int)
	 */
	@NotNull
	MethodExecution<XScene, Void> init = new MethodExecution.Implementation();

	/**
	 * @see XScene#menuOpen(int, int, int, boolean)
	 */
	@NotNull
	MethodExecution<XScene, Void> menuOpen = new MethodExecution.Implementation();

	/**
	 * @see XScene#newFloorDecoration(int, int, int, int, XEntity, long, int)
	 */
	@NotNull
	MethodExecution<XScene, Void> newFloorDecoration = new MethodExecution.Implementation();

	/**
	 * @see XScene#newObjStack(int, int, int, int, XEntity, long, XEntity, XEntity)
	 */
	@NotNull
	MethodExecution<XScene, Void> newObjStack = new MethodExecution.Implementation();

	/**
	 * @see XScene#newScenery(int, int, int, int, int, int, int, int, XEntity, int, boolean, long, int)
	 */
	@NotNull
	MethodExecution<XScene, Boolean> newScenery = new MethodExecution.Implementation();

	/**
	 * @see XScene#newWall(int, int, int, int, XEntity, XEntity, int, int, long, int)
	 */
	@NotNull
	MethodExecution<XScene, Void> newWall = new MethodExecution.Implementation();

	/**
	 * @see XScene#newWallDecoration(int, int, int, int, XEntity, XEntity, int, int, int, int, long, int)
	 */
	@NotNull
	MethodExecution<XScene, Void> newWallDecoration = new MethodExecution.Implementation();

	/**
	 * @see XScene#removeFloorDecoration(int, int, int)
	 */
	@NotNull
	MethodExecution<XScene, Void> removeFloorDecoration = new MethodExecution.Implementation();

	/**
	 * @see XScene#removeObjStack(int, int, int)
	 */
	@NotNull
	MethodExecution<XScene, Void> removeObjStack = new MethodExecution.Implementation();

	/**
	 * @see XScene#removeScenery(XScenery)
	 */
	@NotNull
	MethodExecution<XScene, Void> removeScenery = new MethodExecution.Implementation();

	/**
	 * @see XScene#removeWall(int, int, int)
	 */
	@NotNull
	MethodExecution<XScene, Void> removeWall = new MethodExecution.Implementation();

	/**
	 * @see XScene#removeWallDecoration(int, int, int)
	 */
	@NotNull
	MethodExecution<XScene, Void> removeWallDecoration = new MethodExecution.Implementation();

	/**
	 * @see XScene#setLinkBelow(int, int)
	 */
	@NotNull
	MethodExecution<XScene, Void> setLinkBelow = new MethodExecution.Implementation();

	/**
	 * @see XScene#setTileMinPlane(int, int, int, int)
	 */
	@NotNull
	MethodExecution<XScene, Void> setTileMinPlane = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getMinPlane();

	/**
	 *  field
	 */
	void setMinPlane(int value);

	/**
	 *  field
	 */
	int getPlanes();

	/**
	 *  field
	 */
	void setPlanes(int value);

	/**
	 *  field
	 */
	XScenery[] getTempScenery();

	/**
	 *  field
	 */
	void setTempScenery(XScenery[] value);

	/**
	 *  field
	 */
	int getTempSceneryCount();

	/**
	 *  field
	 */
	void setTempSceneryCount(int value);

	/**
	 *  field
	 */
	int[][][] getTileHeights();

	/**
	 *  field
	 */
	void setTileHeights(int[][][] value);

	/**
	 *  field
	 */
	XTile[][][] getTiles();

	/**
	 *  field
	 */
	void setTiles(XTile[][][] value);

	/**
	 *  field
	 */
	int getXSize();

	/**
	 *  field
	 */
	void setXSize(int value);

	/**
	 *  field
	 */
	int getYSize();

	/**
	 *  field
	 */
	void setYSize(int value);

	/**
	 * public method
	 */
	void clear();

	/**
	 * public method
	 */
	void clearTempScenery();

	/**
	 * public method
	 */
	void draw(int x, int y, int z, int pitch, int yaw, int plane);

	/**
	 *  method
	 */
	void drawTile(XTile tile, boolean b);

	/**
	 * public method
	 */
	void drawTileMinimap(int[] pixels, int index, int width, int plane, int x, int y);

	/**
	 * public method
	 */
	XFloorDecoration getFloorDecoration(int plane, int x, int y);

	/**
	 * public method
	 */
	long getFloorDecorationTag(int plane, int x, int y);

	/**
	 * public method
	 */
	int getObjectFlags(int plane, int x, int y, long id);

	/**
	 * public method
	 */
	XWall getWall(int plane, int x, int y);

	/**
	 * public method
	 */
	XWallDecoration getWallDecoration(int plane, int x, int y);

	/**
	 * public method
	 */
	void init(int minPlane);

	/**
	 * public method
	 */
	void menuOpen(int plane, int screenX, int screenY, boolean b);

	/**
	 * public method
	 */
	void newFloorDecoration(int plane, int x, int y, int tileHeight, XEntity entity, long tag,
			int flags);

	/**
	 * public method
	 */
	void newObjStack(int plane, int x, int y, int tileHeight, XEntity first, long tag, XEntity second,
			XEntity third);

	/**
	 *  method
	 */
	boolean newScenery(int plane, int startX, int startY, int sizeX, int sizeY, int centerX,
			int centerY, int height, XEntity entity, int orientation, boolean isTemp, long tag, int flags);

	/**
	 * public method
	 */
	void newWall(int plane, int x, int y, int tileHeight, XEntity entity1, XEntity entity2,
			int orientationA, int orientationB, long tag, int flags);

	/**
	 * public method
	 */
	void newWallDecoration(int plane, int x, int y, int tileHeight, XEntity entity1, XEntity entity2,
			int orientation, int int7, int xOffset, int yOffset, long tag, int flags);

	/**
	 * public method
	 */
	void removeFloorDecoration(int plane, int x, int y);

	/**
	 * public method
	 */
	void removeObjStack(int plane, int x, int y);

	/**
	 *  method
	 */
	void removeScenery(XScenery scenery);

	/**
	 * public method
	 */
	void removeWall(int plane, int x, int y);

	/**
	 * public method
	 */
	void removeWallDecoration(int plane, int x, int y);

	/**
	 * public method
	 */
	void setLinkBelow(int x, int y);

	/**
	 * public method
	 */
	void setTileMinPlane(int plane, int x, int y, int minPlane);
}
