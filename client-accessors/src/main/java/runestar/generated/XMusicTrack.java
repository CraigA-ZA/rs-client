package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XMusicTrack extends Accessor, XNode {
	/**
	 * @see XMusicTrack#clear()
	 */
	@NotNull
	MethodExecution<XMusicTrack, Void> clear = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	byte[] getMidi();

	/**
	 *  field
	 */
	void setMidi(byte[] value);

	/**
	 *  field
	 */
	XNodeHashTable getTable();

	/**
	 *  field
	 */
	void setTable(XNodeHashTable value);

	/**
	 *  method
	 */
	void clear();
}
