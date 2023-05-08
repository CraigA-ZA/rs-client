package runestar.generated;

import accessors.generate.base.Accessor;

/**
 * public final class
 */
public interface XTile extends Accessor, XNode {
	/**
	 *  field
	 */
	boolean getDrawPrimary();

	/**
	 *  field
	 */
	void setDrawPrimary(boolean value);

	/**
	 *  field
	 */
	boolean getDrawScenery();

	/**
	 *  field
	 */
	void setDrawScenery(boolean value);

	/**
	 *  field
	 */
	int getDrawSceneryEdges();

	/**
	 *  field
	 */
	void setDrawSceneryEdges(int value);

	/**
	 *  field
	 */
	boolean getDrawSecondary();

	/**
	 *  field
	 */
	void setDrawSecondary(boolean value);

	/**
	 *  field
	 */
	XFloorDecoration getFloorDecoration();

	/**
	 *  field
	 */
	void setFloorDecoration(XFloorDecoration value);

	/**
	 *  field
	 */
	XTile getLinkedBelowTile();

	/**
	 *  field
	 */
	void setLinkedBelowTile(XTile value);

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
	XTileModel getModel();

	/**
	 *  field
	 */
	void setModel(XTileModel value);

	/**
	 *  field
	 */
	XObjStack getObjStack();

	/**
	 *  field
	 */
	void setObjStack(XObjStack value);

	/**
	 *  field
	 */
	int getOriginalPlane();

	/**
	 *  field
	 */
	void setOriginalPlane(int value);

	/**
	 *  field
	 */
	XTilePaint getPaint();

	/**
	 *  field
	 */
	void setPaint(XTilePaint value);

	/**
	 *  field
	 */
	int getPlane();

	/**
	 *  field
	 */
	void setPlane(int value);

	/**
	 *  field
	 */
	XScenery[] getScenery();

	/**
	 *  field
	 */
	void setScenery(XScenery[] value);

	/**
	 *  field
	 */
	int getSceneryCount();

	/**
	 *  field
	 */
	void setSceneryCount(int value);

	/**
	 *  field
	 */
	int[] getSceneryEdgeMasks();

	/**
	 *  field
	 */
	void setSceneryEdgeMasks(int[] value);

	/**
	 *  field
	 */
	XWall getWall();

	/**
	 *  field
	 */
	void setWall(XWall value);

	/**
	 *  field
	 */
	XWallDecoration getWallDecoration();

	/**
	 *  field
	 */
	void setWallDecoration(XWallDecoration value);

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
}
