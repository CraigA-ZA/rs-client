package runestar.generated;

import accessors.generate.base.Accessor;

/**
 * public abstract interface
 */
public interface XWorldMapSection extends Accessor {
	/**
	 * public abstract method
	 */
	boolean containsCoord(int plane, int x, int y);

	/**
	 * public abstract method
	 */
	boolean containsPosition(int x, int y);

	/**
	 * public abstract method
	 */
	XCoord coord(int x, int y);

	/**
	 * public abstract method
	 */
	void expandBounds(XWorldMapArea area);

	/**
	 * public abstract method
	 */
	int[] position(int plane, int x, int y);

	/**
	 * public abstract method
	 */
	void read(XPacket packet);
}
