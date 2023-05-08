package runestar.generated;

import accessors.generate.base.Accessor;
import java.net.Socket;

/**
 * public class
 */
public interface XBufferedNetSocket extends Accessor, XAbstractSocket {
	/**
	 *  field
	 */
	XBufferedSink getSink();

	/**
	 *  field
	 */
	void setSink(XBufferedSink value);

	/**
	 *  field
	 */
	Socket getSocket();

	/**
	 *  field
	 */
	void setSocket(Socket value);

	/**
	 *  field
	 */
	XBufferedSource getSource();

	/**
	 *  field
	 */
	void setSource(XBufferedSource value);
}
