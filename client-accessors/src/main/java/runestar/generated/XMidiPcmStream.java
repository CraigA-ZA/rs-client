package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XMidiPcmStream extends Accessor, XPcmStream {
	/**
	 * @see XMidiPcmStream#clearAll()
	 */
	@NotNull
	MethodExecution<XMidiPcmStream, Void> clearAll = new MethodExecution.Implementation();

	/**
	 * @see XMidiPcmStream#isReady()
	 */
	@NotNull
	MethodExecution<XMidiPcmStream, Boolean> isReady = new MethodExecution.Implementation();

	/**
	 * @see XMidiPcmStream#loadMusicTrack(XMusicTrack, XAbstractArchive, XSoundCache, int)
	 */
	@NotNull
	MethodExecution<XMidiPcmStream, Boolean> loadMusicTrack = new MethodExecution.Implementation();

	/**
	 * @see XMidiPcmStream#removeAll()
	 */
	@NotNull
	MethodExecution<XMidiPcmStream, Void> removeAll = new MethodExecution.Implementation();

	/**
	 * @see XMidiPcmStream#setMusicTrack(XMusicTrack, boolean)
	 */
	@NotNull
	MethodExecution<XMidiPcmStream, Void> setMusicTrack = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XMidiFileReader getMidiFile();

	/**
	 *  field
	 */
	void setMidiFile(XMidiFileReader value);

	/**
	 *  field
	 */
	XNodeHashTable getMusicPatches();

	/**
	 *  field
	 */
	void setMusicPatches(XNodeHashTable value);

	/**
	 *  field
	 */
	XMusicPatchPcmStream getPatchStream();

	/**
	 *  field
	 */
	void setPatchStream(XMusicPatchPcmStream value);

	/**
	 *  field
	 */
	int getTrack();

	/**
	 *  field
	 */
	void setTrack(int value);

	/**
	 *  field
	 */
	int getTrackLength();

	/**
	 *  field
	 */
	void setTrackLength(int value);

	/**
	 * public synchronized method
	 */
	void clearAll();

	/**
	 * public synchronized method
	 */
	boolean isReady();

	/**
	 * public synchronized method
	 */
	boolean loadMusicTrack(XMusicTrack musicTrack, XAbstractArchive i, XSoundCache s, int frequency);

	/**
	 * public synchronized method
	 */
	void removeAll();

	/**
	 * public synchronized method
	 */
	void setMusicTrack(XMusicTrack musicTrack, boolean b);
}
