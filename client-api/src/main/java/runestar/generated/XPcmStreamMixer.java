package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XPcmStreamMixer extends Accessor, XPcmStream {
	/**
	 * @see XPcmStreamMixer#addSubStream(XPcmStream)
	 */
	@NotNull
	MethodExecution<XPcmStreamMixer, Void> addSubStream = new MethodExecution.Implementation();

	/**
	 * @see XPcmStreamMixer#firstSubStream()
	 */
	@NotNull
	MethodExecution<XPcmStreamMixer, XPcmStream> firstSubStream = new MethodExecution.Implementation();

	/**
	 * @see XPcmStreamMixer#nextSubStream()
	 */
	@NotNull
	MethodExecution<XPcmStreamMixer, XPcmStream> nextSubStream = new MethodExecution.Implementation();

	/**
	 * @see XPcmStreamMixer#removeSubStream(XPcmStream)
	 */
	@NotNull
	MethodExecution<XPcmStreamMixer, Void> removeSubStream = new MethodExecution.Implementation();

	/**
	 * @see XPcmStreamMixer#skipSubStreams(int)
	 */
	@NotNull
	MethodExecution<XPcmStreamMixer, Void> skipSubStreams = new MethodExecution.Implementation();

	/**
	 * @see XPcmStreamMixer#updateSubStreams(int[], int, int)
	 */
	@NotNull
	MethodExecution<XPcmStreamMixer, Void> updateSubStreams = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XNodeDeque getSubStreams();

	/**
	 *  field
	 */
	void setSubStreams(XNodeDeque value);

	/**
	 * public final synchronized method
	 */
	void addSubStream(XPcmStream subStream);

	/**
	 * protected method
	 */
	XPcmStream firstSubStream();

	/**
	 * protected method
	 */
	XPcmStream nextSubStream();

	/**
	 * public final synchronized method
	 */
	void removeSubStream(XPcmStream subStream);

	/**
	 *  method
	 */
	void skipSubStreams(int length);

	/**
	 *  method
	 */
	void updateSubStreams(int[] buffer, int start, int end);
}
