package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public abstract class
 */
public interface XActor extends Accessor, XEntity {
	/**
	 * @see XActor#addHeadbar(int, int, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XActor, Void> addHeadbar = new MethodExecution.Implementation();

	/**
	 * @see XActor#addHitmark(int, int, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XActor, Void> addHitmark = new MethodExecution.Implementation();

	/**
	 * @see XActor#isVisible()
	 */
	@NotNull
	MethodExecution<XActor, Boolean> isVisible = new MethodExecution.Implementation();

	/**
	 * @see XActor#removeHeadbar(int)
	 */
	@NotNull
	MethodExecution<XActor, Void> removeHeadbar = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	boolean getFalse0();

	/**
	 *  field
	 */
	void setFalse0(boolean value);

	/**
	 *  field
	 */
	XIterableNodeDeque getHeadbars();

	/**
	 *  field
	 */
	void setHeadbars(XIterableNodeDeque value);

	/**
	 *  field
	 */
	byte getHitmarkCount();

	/**
	 *  field
	 */
	void setHitmarkCount(byte value);

	/**
	 *  field
	 */
	int[] getHitmarkCycles();

	/**
	 *  field
	 */
	void setHitmarkCycles(int[] value);

	/**
	 *  field
	 */
	int[] getHitmarkTypes();

	/**
	 *  field
	 */
	void setHitmarkTypes(int[] value);

	/**
	 *  field
	 */
	int[] getHitmarkTypes2();

	/**
	 *  field
	 */
	void setHitmarkTypes2(int[] value);

	/**
	 *  field
	 */
	int[] getHitmarkValues();

	/**
	 *  field
	 */
	void setHitmarkValues(int[] value);

	/**
	 *  field
	 */
	int[] getHitmarkValues2();

	/**
	 *  field
	 */
	void setHitmarkValues2(int[] value);

	/**
	 *  field
	 */
	int getMovementFrame();

	/**
	 *  field
	 */
	void setMovementFrame(int value);

	/**
	 *  field
	 */
	int getMovementFrameCycle();

	/**
	 *  field
	 */
	void setMovementFrameCycle(int value);

	/**
	 *  field
	 */
	int getMovementSequence();

	/**
	 *  field
	 */
	void setMovementSequence(int value);

	/**
	 *  field
	 */
	int getNpcCycle();

	/**
	 *  field
	 */
	void setNpcCycle(int value);

	/**
	 *  field
	 */
	String getOverheadText();

	/**
	 *  field
	 */
	void setOverheadText(String value);

	/**
	 *  field
	 */
	int getOverheadTextCyclesRemaining();

	/**
	 *  field
	 */
	void setOverheadTextCyclesRemaining(int value);

	/**
	 *  field
	 */
	int getPathLength();

	/**
	 *  field
	 */
	void setPathLength(int value);

	/**
	 *  field
	 */
	XMoveSpeed[] getPathTraversed();

	/**
	 *  field
	 */
	void setPathTraversed(XMoveSpeed[] value);

	/**
	 *  field
	 */
	int[] getPathX();

	/**
	 *  field
	 */
	void setPathX(int[] value);

	/**
	 *  field
	 */
	int[] getPathY();

	/**
	 *  field
	 */
	void setPathY(int[] value);

	/**
	 *  field
	 */
	int getReadySequence();

	/**
	 *  field
	 */
	void setReadySequence(int value);

	/**
	 *  field
	 */
	int getRunSequence();

	/**
	 *  field
	 */
	void setRunSequence(int value);

	/**
	 *  field
	 */
	int getSequence();

	/**
	 *  field
	 */
	void setSequence(int value);

	/**
	 *  field
	 */
	int getSequenceDelay();

	/**
	 *  field
	 */
	void setSequenceDelay(int value);

	/**
	 *  field
	 */
	int getSequenceFrame();

	/**
	 *  field
	 */
	void setSequenceFrame(int value);

	/**
	 *  field
	 */
	int getSequenceFrameCycle();

	/**
	 *  field
	 */
	void setSequenceFrameCycle(int value);

	/**
	 *  field
	 */
	int getSize();

	/**
	 *  field
	 */
	void setSize(int value);

	/**
	 *  field
	 */
	int getSpotAnimation();

	/**
	 *  field
	 */
	void setSpotAnimation(int value);

	/**
	 *  field
	 */
	int getSpotAnimationFrame();

	/**
	 *  field
	 */
	void setSpotAnimationFrame(int value);

	/**
	 *  field
	 */
	int getSpotAnimationFrameCycle();

	/**
	 *  field
	 */
	void setSpotAnimationFrameCycle(int value);

	/**
	 *  field
	 */
	int getTargetIndex();

	/**
	 *  field
	 */
	void setTargetIndex(int value);

	/**
	 *  field
	 */
	int getTurnLeftSequence();

	/**
	 *  field
	 */
	void setTurnLeftSequence(int value);

	/**
	 *  field
	 */
	int getTurnRightSequence();

	/**
	 *  field
	 */
	void setTurnRightSequence(int value);

	/**
	 *  field
	 */
	int getWalkBackSequence();

	/**
	 *  field
	 */
	void setWalkBackSequence(int value);

	/**
	 *  field
	 */
	int getWalkLeftSequence();

	/**
	 *  field
	 */
	void setWalkLeftSequence(int value);

	/**
	 *  field
	 */
	int getWalkRightSequence();

	/**
	 *  field
	 */
	void setWalkRightSequence(int value);

	/**
	 *  field
	 */
	int getWalkSequence();

	/**
	 *  field
	 */
	void setWalkSequence(int value);

	/**
	 * final method
	 */
	void addHeadbar(int headbarType, int cycle, int n0, int n1, int n2, int n3);

	/**
	 * final method
	 */
	void addHitmark(int type, int value, int type2, int value2, int cycle, int cycle2);

	/**
	 *  method
	 */
	boolean isVisible();

	/**
	 * final method
	 */
	void removeHeadbar(int headbarType);
}
