package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.datatransfer.Clipboard;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public abstract class extends {@link java.applet.Applet}
 */
public interface XGameShell extends Accessor {
	/**
	 * @see XGameShell#addCanvas()
	 */
	@NotNull
	MethodExecution<XGameShell, Void> addCanvas = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#checkHost()
	 */
	@NotNull
	MethodExecution<XGameShell, Boolean> checkHost = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#checkResize()
	 */
	@NotNull
	MethodExecution<XGameShell, Void> checkResize = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#clearBackground()
	 */
	@NotNull
	MethodExecution<XGameShell, Void> clearBackground = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#clipboardSetString(String)
	 */
	@NotNull
	MethodExecution<XGameShell, Void> clipboardSetString = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#container()
	 */
	@NotNull
	MethodExecution<XGameShell, Container> container = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#error(String)
	 */
	@NotNull
	MethodExecution<XGameShell, Void> error = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#getFrameContentBounds()
	 */
	@NotNull
	MethodExecution<XGameShell, XBounds> getFrameContentBounds = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#hasFrame()
	 */
	@NotNull
	MethodExecution<XGameShell, Boolean> hasFrame = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#kill()
	 */
	@NotNull
	MethodExecution<XGameShell, Void> kill = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#mouseWheel()
	 */
	@NotNull
	MethodExecution<XGameShell, XMouseWheel> mouseWheel = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#onResize()
	 */
	@NotNull
	MethodExecution<XGameShell, Void> onResize = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#paint(Graphics)
	 */
	@NotNull
	MethodExecution<XGameShell, Void> paint = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#replaceCanvas()
	 */
	@NotNull
	MethodExecution<XGameShell, Void> replaceCanvas = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#setMaxCanvasSize(int, int)
	 */
	@NotNull
	MethodExecution<XGameShell, Void> setMaxCanvasSize = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#setUpClipboard()
	 */
	@NotNull
	MethodExecution<XGameShell, Void> setUpClipboard = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#setUpKeyboard()
	 */
	@NotNull
	MethodExecution<XGameShell, Void> setUpKeyboard = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#setUpMouse()
	 */
	@NotNull
	MethodExecution<XGameShell, Void> setUpMouse = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#startThread(int, int, int)
	 */
	@NotNull
	MethodExecution<XGameShell, Void> startThread = new MethodExecution.Implementation();

	/**
	 * @see XGameShell#update(Graphics)
	 */
	@NotNull
	MethodExecution<XGameShell, Void> update = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	Canvas getCanvas();

	/**
	 *  field
	 */
	void setCanvas(Canvas value);

	/**
	 * volatile field
	 */
	long getCanvasSetTimeMs();

	/**
	 * volatile field
	 */
	void setCanvasSetTimeMs(long value);

	/**
	 *  field
	 */
	int getCanvasX();

	/**
	 *  field
	 */
	void setCanvasX(int value);

	/**
	 *  field
	 */
	int getCanvasY();

	/**
	 *  field
	 */
	void setCanvasY(int value);

	/**
	 *  field
	 */
	Clipboard getClipboard();

	/**
	 *  field
	 */
	void setClipboard(Clipboard value);

	/**
	 * protected field
	 */
	int getContentHeight();

	/**
	 * protected field
	 */
	void setContentHeight(int value);

	/**
	 *  field
	 */
	int getContentHeight0();

	/**
	 *  field
	 */
	void setContentHeight0(int value);

	/**
	 * protected field
	 */
	int getContentWidth();

	/**
	 * protected field
	 */
	void setContentWidth(int value);

	/**
	 *  field
	 */
	int getContentWidth0();

	/**
	 *  field
	 */
	void setContentWidth0(int value);

	/**
	 * final field
	 */
	EventQueue getEventQueue();

	/**
	 *  field
	 */
	Frame getFrame();

	/**
	 *  field
	 */
	void setFrame(Frame value);

	/**
	 *  field
	 */
	boolean getHasErrored();

	/**
	 *  field
	 */
	void setHasErrored(boolean value);

	/**
	 * volatile field
	 */
	boolean getIsCanvasInvalid();

	/**
	 * volatile field
	 */
	void setIsCanvasInvalid(boolean value);

	/**
	 *  field
	 */
	int getMaxCanvasHeight();

	/**
	 *  field
	 */
	void setMaxCanvasHeight(int value);

	/**
	 *  field
	 */
	int getMaxCanvasWidth();

	/**
	 *  field
	 */
	void setMaxCanvasWidth(int value);

	/**
	 *  field
	 */
	XMouseWheelHandler getMouseWheelHandler();

	/**
	 *  field
	 */
	void setMouseWheelHandler(XMouseWheelHandler value);

	/**
	 * static field
	 */
	long getStopTimeMs();

	/**
	 * static field
	 */
	void setStopTimeMs(long value);

	/**
	 * final synchronized method
	 */
	void addCanvas();

	/**
	 * protected final method
	 */
	boolean checkHost();

	/**
	 * final method
	 */
	void checkResize();

	/**
	 *  method
	 */
	void clearBackground();

	/**
	 * protected method
	 */
	void clipboardSetString(String s);

	/**
	 *  method
	 */
	Container container();

	/**
	 * protected method
	 */
	void error(String type);

	/**
	 *  method
	 */
	XBounds getFrameContentBounds();

	/**
	 * protected final method
	 */
	boolean hasFrame();

	/**
	 * final synchronized method
	 */
	void kill();

	/**
	 * protected abstract method
	 */
	void kill0();

	/**
	 * protected method
	 */
	XMouseWheel mouseWheel();

	/**
	 * final method
	 */
	void onResize();

	/**
	 * public final synchronized method
	 */
	void paint(Graphics g);

	/**
	 * final method
	 */
	void replaceCanvas();

	/**
	 * protected final method
	 */
	void setMaxCanvasSize(int width, int height);

	/**
	 * protected abstract method
	 */
	void setUp();

	/**
	 * protected method
	 */
	void setUpClipboard();

	/**
	 * protected final method
	 */
	void setUpKeyboard();

	/**
	 * protected final method
	 */
	void setUpMouse();

	/**
	 * protected final method
	 */
	void startThread(int width, int height, int revision);

	/**
	 * public final method
	 */
	void update(Graphics g);
}
