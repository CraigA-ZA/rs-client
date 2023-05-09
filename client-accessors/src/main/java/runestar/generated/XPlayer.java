package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XPlayer extends Accessor, XActor {
	/**
	 * @see XPlayer#getModel()
	 */
	@NotNull
	MethodExecution<XPlayer, XModel> getModel = new MethodExecution.Implementation();

	/**
	 * @see XPlayer#isVisible()
	 */
	@NotNull
	MethodExecution<XPlayer, Boolean> isVisible = new MethodExecution.Implementation();

	/**
	 * @see XPlayer#read(XPacket)
	 */
	@NotNull
	MethodExecution<XPlayer, Void> read = new MethodExecution.Implementation();

	/**
	 * @see XPlayer#resetPath(int, int)
	 */
	@NotNull
	MethodExecution<XPlayer, Void> resetPath = new MethodExecution.Implementation();

	/**
	 * @see XPlayer#transformedSize()
	 */
	@NotNull
	MethodExecution<XPlayer, Integer> transformedSize = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	String[] getActions();

	/**
	 *  field
	 */
	void setActions(String[] value);

	/**
	 *  field
	 */
	int getAnimationCycleEnd();

	/**
	 *  field
	 */
	void setAnimationCycleEnd(int value);

	/**
	 *  field
	 */
	int getAnimationCycleStart();

	/**
	 *  field
	 */
	void setAnimationCycleStart(int value);

	/**
	 *  field
	 */
	XPlayerAppearance getAppearance();

	/**
	 *  field
	 */
	void setAppearance(XPlayerAppearance value);

	/**
	 *  field
	 */
	int getCombatLevel();

	/**
	 *  field
	 */
	void setCombatLevel(int value);

	/**
	 *  field
	 */
	int getHeadIconPk();

	/**
	 *  field
	 */
	void setHeadIconPk(int value);

	/**
	 *  field
	 */
	int getHeadIconPrayer();

	/**
	 *  field
	 */
	void setHeadIconPrayer(int value);

	/**
	 *  field
	 */
	int getIndex();

	/**
	 *  field
	 */
	void setIndex(int value);

	/**
	 *  field
	 */
	boolean getIsHidden();

	/**
	 *  field
	 */
	void setIsHidden(boolean value);

	/**
	 *  field
	 */
	boolean getIsUnanimated();

	/**
	 *  field
	 */
	void setIsUnanimated(boolean value);

	/**
	 *  field
	 */
	XModel getModel0();

	/**
	 *  field
	 */
	void setModel0(XModel value);

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
	int getSkillLevel();

	/**
	 *  field
	 */
	void setSkillLevel(int value);

	/**
	 *  field
	 */
	int getTeam();

	/**
	 *  field
	 */
	void setTeam(int value);

	/**
	 *  field
	 */
	int getTileHeight();

	/**
	 *  field
	 */
	void setTileHeight(int value);

	/**
	 *  field
	 */
	int getTileHeight2();

	/**
	 *  field
	 */
	void setTileHeight2(int value);

	/**
	 *  field
	 */
	int getTileX();

	/**
	 *  field
	 */
	void setTileX(int value);

	/**
	 *  field
	 */
	int getTileY();

	/**
	 *  field
	 */
	void setTileY(int value);

	/**
	 *  field
	 */
	XUsername getUsername();

	/**
	 *  field
	 */
	void setUsername(XUsername value);

	/**
	 * protected final method
	 */
	XModel getModel();

	/**
	 * final method
	 */
	boolean isVisible();

	/**
	 * final method
	 */
	void read(XPacket packet);

	/**
	 *  method
	 */
	void resetPath(int x, int y);

	/**
	 *  method
	 */
	int transformedSize();
}
