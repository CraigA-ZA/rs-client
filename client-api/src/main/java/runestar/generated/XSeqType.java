package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XSeqType extends Accessor, XDualNode {
	/**
	 * @see XSeqType#animateComponent(XModel, int)
	 */
	@NotNull
	MethodExecution<XSeqType, XModel> animateComponent = new MethodExecution.Implementation();

	/**
	 * @see XSeqType#animateObject(XModel, int, int)
	 */
	@NotNull
	MethodExecution<XSeqType, XModel> animateObject = new MethodExecution.Implementation();

	/**
	 * @see XSeqType#animateSequence(XModel, int)
	 */
	@NotNull
	MethodExecution<XSeqType, XModel> animateSequence = new MethodExecution.Implementation();

	/**
	 * @see XSeqType#animateSequence2(XModel, int, XSeqType, int)
	 */
	@NotNull
	MethodExecution<XSeqType, XModel> animateSequence2 = new MethodExecution.Implementation();

	/**
	 * @see XSeqType#animateSpotAnimation(XModel, int)
	 */
	@NotNull
	MethodExecution<XSeqType, XModel> animateSpotAnimation = new MethodExecution.Implementation();

	/**
	 * @see XSeqType#postDecode()
	 */
	@NotNull
	MethodExecution<XSeqType, Void> postDecode = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	int getFrameCount();

	/**
	 * public field
	 */
	void setFrameCount(int value);

	/**
	 * public field
	 */
	int[] getFrameIds();

	/**
	 * public field
	 */
	void setFrameIds(int[] value);

	/**
	 *  field
	 */
	int[] getFrameIds2();

	/**
	 *  field
	 */
	void setFrameIds2(int[] value);

	/**
	 * public field
	 */
	int[] getFrameLengths();

	/**
	 * public field
	 */
	void setFrameLengths(int[] value);

	/**
	 *  field
	 */
	int getLefthand();

	/**
	 *  field
	 */
	void setLefthand(int value);

	/**
	 * public field
	 */
	int getRighthand();

	/**
	 * public field
	 */
	void setRighthand(int value);

	/**
	 * public method
	 */
	XModel animateComponent(XModel model, int frame);

	/**
	 *  method
	 */
	XModel animateObject(XModel model, int frame, int orientation);

	/**
	 * public method
	 */
	XModel animateSequence(XModel model, int frame);

	/**
	 *  method
	 */
	XModel animateSequence2(XModel model, int frame, XSeqType sequence, int sequenceFrame);

	/**
	 *  method
	 */
	XModel animateSpotAnimation(XModel model, int frame);

	/**
	 *  method
	 */
	void postDecode();
}
