package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.lang.Void;
import java.util.LinkedList;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XWorldMapArea extends Accessor {
	/**
	 * @see XWorldMapArea#archiveName()
	 */
	@NotNull
	MethodExecution<XWorldMapArea, String> archiveName = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#containsCoord(int, int, int)
	 */
	@NotNull
	MethodExecution<XWorldMapArea, Boolean> containsCoord = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#containsPosition(int, int)
	 */
	@NotNull
	MethodExecution<XWorldMapArea, Boolean> containsPosition = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#coord(int, int)
	 */
	@NotNull
	MethodExecution<XWorldMapArea, XCoord> coord = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#id()
	 */
	@NotNull
	MethodExecution<XWorldMapArea, Integer> id = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#isMain()
	 */
	@NotNull
	MethodExecution<XWorldMapArea, Boolean> isMain = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#maxX()
	 */
	@NotNull
	MethodExecution<XWorldMapArea, Integer> maxX = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#maxY()
	 */
	@NotNull
	MethodExecution<XWorldMapArea, Integer> maxY = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#minX()
	 */
	@NotNull
	MethodExecution<XWorldMapArea, Integer> minX = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#minY()
	 */
	@NotNull
	MethodExecution<XWorldMapArea, Integer> minY = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#name()
	 */
	@NotNull
	MethodExecution<XWorldMapArea, String> name = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#origin()
	 */
	@NotNull
	MethodExecution<XWorldMapArea, XCoord> origin = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#originPlane()
	 */
	@NotNull
	MethodExecution<XWorldMapArea, Integer> originPlane = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#originX()
	 */
	@NotNull
	MethodExecution<XWorldMapArea, Integer> originX = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#originY()
	 */
	@NotNull
	MethodExecution<XWorldMapArea, Integer> originY = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#position(int, int, int)
	 */
	@NotNull
	MethodExecution<XWorldMapArea, int[]> position = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#setBounds()
	 */
	@NotNull
	MethodExecution<XWorldMapArea, Void> setBounds = new MethodExecution.Implementation();

	/**
	 * @see XWorldMapArea#zoom()
	 */
	@NotNull
	MethodExecution<XWorldMapArea, Integer> zoom = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	String getArchiveName0();

	/**
	 *  field
	 */
	void setArchiveName0(String value);

	/**
	 *  field
	 */
	int getId0();

	/**
	 *  field
	 */
	void setId0(int value);

	/**
	 *  field
	 */
	boolean getIsMain0();

	/**
	 *  field
	 */
	void setIsMain0(boolean value);

	/**
	 *  field
	 */
	int getMaxX0();

	/**
	 *  field
	 */
	void setMaxX0(int value);

	/**
	 *  field
	 */
	int getMaxY0();

	/**
	 *  field
	 */
	void setMaxY0(int value);

	/**
	 *  field
	 */
	int getMinX0();

	/**
	 *  field
	 */
	void setMinX0(int value);

	/**
	 *  field
	 */
	int getMinY0();

	/**
	 *  field
	 */
	void setMinY0(int value);

	/**
	 *  field
	 */
	String getName0();

	/**
	 *  field
	 */
	void setName0(String value);

	/**
	 *  field
	 */
	XCoord getOrigin0();

	/**
	 *  field
	 */
	void setOrigin0(XCoord value);

	/**
	 *  field
	 */
	LinkedList getSections();

	/**
	 *  field
	 */
	void setSections(LinkedList value);

	/**
	 *  field
	 */
	int getZoom0();

	/**
	 *  field
	 */
	void setZoom0(int value);

	/**
	 * public method
	 */
	String archiveName();

	/**
	 * public method
	 */
	boolean containsCoord(int plane, int x, int y);

	/**
	 * public method
	 */
	boolean containsPosition(int x, int y);

	/**
	 * public method
	 */
	XCoord coord(int x, int y);

	/**
	 * public method
	 */
	int id();

	/**
	 * public method
	 */
	boolean isMain();

	/**
	 * public method
	 */
	int maxX();

	/**
	 * public method
	 */
	int maxY();

	/**
	 * public method
	 */
	int minX();

	/**
	 * public method
	 */
	int minY();

	/**
	 * public method
	 */
	String name();

	/**
	 * public method
	 */
	XCoord origin();

	/**
	 * public method
	 */
	int originPlane();

	/**
	 * public method
	 */
	int originX();

	/**
	 * public method
	 */
	int originY();

	/**
	 * public method
	 */
	int[] position(int plane, int x, int y);

	/**
	 *  method
	 */
	void setBounds();

	/**
	 * public method
	 */
	int zoom();
}
