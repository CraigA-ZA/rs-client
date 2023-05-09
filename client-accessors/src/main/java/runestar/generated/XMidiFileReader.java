package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XMidiFileReader extends Accessor {
	/**
	 * @see XMidiFileReader#clear()
	 */
	@NotNull
	MethodExecution<XMidiFileReader, Void> clear = new MethodExecution.Implementation();

	/**
	 * @see XMidiFileReader#getPrioritizedTrack()
	 */
	@NotNull
	MethodExecution<XMidiFileReader, Integer> getPrioritizedTrack = new MethodExecution.Implementation();

	/**
	 * @see XMidiFileReader#gotoTrack(int)
	 */
	@NotNull
	MethodExecution<XMidiFileReader, Void> gotoTrack = new MethodExecution.Implementation();

	/**
	 * @see XMidiFileReader#isDone()
	 */
	@NotNull
	MethodExecution<XMidiFileReader, Boolean> isDone = new MethodExecution.Implementation();

	/**
	 * @see XMidiFileReader#isReady()
	 */
	@NotNull
	MethodExecution<XMidiFileReader, Boolean> isReady = new MethodExecution.Implementation();

	/**
	 * @see XMidiFileReader#markTrackPosition(int)
	 */
	@NotNull
	MethodExecution<XMidiFileReader, Void> markTrackPosition = new MethodExecution.Implementation();

	/**
	 * @see XMidiFileReader#parse(byte[])
	 */
	@NotNull
	MethodExecution<XMidiFileReader, Void> parse = new MethodExecution.Implementation();

	/**
	 * @see XMidiFileReader#readMessage(int)
	 */
	@NotNull
	MethodExecution<XMidiFileReader, Integer> readMessage = new MethodExecution.Implementation();

	/**
	 * @see XMidiFileReader#readMessage0(int)
	 */
	@NotNull
	MethodExecution<XMidiFileReader, Integer> readMessage0 = new MethodExecution.Implementation();

	/**
	 * @see XMidiFileReader#readTrackLength(int)
	 */
	@NotNull
	MethodExecution<XMidiFileReader, Void> readTrackLength = new MethodExecution.Implementation();

	/**
	 * @see XMidiFileReader#trackCount()
	 */
	@NotNull
	MethodExecution<XMidiFileReader, Integer> trackCount = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getDivision();

	/**
	 *  field
	 */
	void setDivision(int value);

	/**
	 *  field
	 */
	XPacket getPacket();

	/**
	 *  field
	 */
	void setPacket(XPacket value);

	/**
	 *  field
	 */
	int[] getTrackLengths();

	/**
	 *  field
	 */
	void setTrackLengths(int[] value);

	/**
	 *  field
	 */
	int[] getTrackPositions();

	/**
	 *  field
	 */
	void setTrackPositions(int[] value);

	/**
	 *  field
	 */
	int[] getTrackStarts();

	/**
	 *  field
	 */
	void setTrackStarts(int[] value);

	/**
	 *  method
	 */
	void clear();

	/**
	 *  method
	 */
	int getPrioritizedTrack();

	/**
	 *  method
	 */
	void gotoTrack(int trackId);

	/**
	 *  method
	 */
	boolean isDone();

	/**
	 *  method
	 */
	boolean isReady();

	/**
	 *  method
	 */
	void markTrackPosition(int trackId);

	/**
	 *  method
	 */
	void parse(byte[] midi);

	/**
	 *  method
	 */
	int readMessage(int trackId);

	/**
	 *  method
	 */
	int readMessage0(int trackId);

	/**
	 *  method
	 */
	void readTrackLength(int trackId);

	/**
	 *  method
	 */
	int trackCount();
}
