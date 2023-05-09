package runestar.generated;

import accessors.generate.base.Accessor;

/**
 * public class
 */
public interface XMusicPatchPcmStream extends Accessor, XPcmStream {
	/**
	 *  field
	 */
	XPcmStreamMixer getMixer();

	/**
	 *  field
	 */
	void setMixer(XPcmStreamMixer value);

	/**
	 *  field
	 */
	XNodeDeque getQueue();

	/**
	 *  field
	 */
	void setQueue(XNodeDeque value);

	/**
	 *  field
	 */
	XMidiPcmStream getSuperStream();

	/**
	 *  field
	 */
	void setSuperStream(XMidiPcmStream value);
}
