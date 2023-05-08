package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XSoundEnvelope extends Accessor {
	/**
	 * @see XSoundEnvelope#decode(XPacket)
	 */
	@NotNull
	MethodExecution<XSoundEnvelope, Void> decode = new MethodExecution.Implementation();

	/**
	 * @see XSoundEnvelope#decodeSegments(XPacket)
	 */
	@NotNull
	MethodExecution<XSoundEnvelope, Void> decodeSegments = new MethodExecution.Implementation();

	/**
	 * @see XSoundEnvelope#doStep(int)
	 */
	@NotNull
	MethodExecution<XSoundEnvelope, Integer> doStep = new MethodExecution.Implementation();

	/**
	 * @see XSoundEnvelope#reset()
	 */
	@NotNull
	MethodExecution<XSoundEnvelope, Void> reset = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getAmplitude();

	/**
	 *  field
	 */
	void setAmplitude(int value);

	/**
	 *  field
	 */
	int[] getDurations();

	/**
	 *  field
	 */
	void setDurations(int[] value);

	/**
	 *  field
	 */
	int getEnd();

	/**
	 *  field
	 */
	void setEnd(int value);

	/**
	 *  field
	 */
	int getForm();

	/**
	 *  field
	 */
	void setForm(int value);

	/**
	 *  field
	 */
	int getMax();

	/**
	 *  field
	 */
	void setMax(int value);

	/**
	 *  field
	 */
	int getPhaseIndex();

	/**
	 *  field
	 */
	void setPhaseIndex(int value);

	/**
	 *  field
	 */
	int[] getPhases();

	/**
	 *  field
	 */
	void setPhases(int[] value);

	/**
	 *  field
	 */
	int getSegments();

	/**
	 *  field
	 */
	void setSegments(int value);

	/**
	 *  field
	 */
	int getStart();

	/**
	 *  field
	 */
	void setStart(int value);

	/**
	 *  field
	 */
	int getStep();

	/**
	 *  field
	 */
	void setStep(int value);

	/**
	 *  field
	 */
	int getTicks();

	/**
	 *  field
	 */
	void setTicks(int value);

	/**
	 * final method
	 */
	void decode(XPacket packet);

	/**
	 * final method
	 */
	void decodeSegments(XPacket packet);

	/**
	 * final method
	 */
	int doStep(int n);

	/**
	 * final method
	 */
	void reset();
}
