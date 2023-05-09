package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XMusicPatch extends Accessor, XNode {
	/**
	 * @see XMusicPatch#clear()
	 */
	@NotNull
	MethodExecution<XMusicPatch, Void> clear = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XRawSound[] getRawSounds();

	/**
	 *  field
	 */
	void setRawSounds(XRawSound[] value);

	/**
	 *  method
	 */
	void clear();
}
