package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.awt.event.MouseEvent;
import java.lang.Integer;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XMouseHandler extends Accessor {
	/**
	 * @see XMouseHandler#getButton(MouseEvent)
	 */
	@NotNull
	MethodExecution<XMouseHandler, Integer> getButton = new MethodExecution.Implementation();

	/**
	 * @see XMouseHandler#mouseClicked(MouseEvent)
	 */
	@NotNull
	MethodExecution<XMouseHandler, Void> mouseClicked = new MethodExecution.Implementation();

	/**
	 * @see XMouseHandler#mouseDragged(MouseEvent)
	 */
	@NotNull
	MethodExecution<XMouseHandler, Void> mouseDragged = new MethodExecution.Implementation();

	/**
	 * @see XMouseHandler#mouseEntered(MouseEvent)
	 */
	@NotNull
	MethodExecution<XMouseHandler, Void> mouseEntered = new MethodExecution.Implementation();

	/**
	 * @see XMouseHandler#mouseExited(MouseEvent)
	 */
	@NotNull
	MethodExecution<XMouseHandler, Void> mouseExited = new MethodExecution.Implementation();

	/**
	 * @see XMouseHandler#mouseMoved(MouseEvent)
	 */
	@NotNull
	MethodExecution<XMouseHandler, Void> mouseMoved = new MethodExecution.Implementation();

	/**
	 * @see XMouseHandler#mousePressed(MouseEvent)
	 */
	@NotNull
	MethodExecution<XMouseHandler, Void> mousePressed = new MethodExecution.Implementation();

	/**
	 * @see XMouseHandler#mouseReleased(MouseEvent)
	 */
	@NotNull
	MethodExecution<XMouseHandler, Void> mouseReleased = new MethodExecution.Implementation();

	/**
	 * final method
	 */
	int getButton(MouseEvent mouseEvent);

	/**
	 * public final method
	 */
	void mouseClicked(MouseEvent mouseEvent);

	/**
	 * public final synchronized method
	 */
	void mouseDragged(MouseEvent mouseEvent);

	/**
	 * public final synchronized method
	 */
	void mouseEntered(MouseEvent mouseEvent);

	/**
	 * public final synchronized method
	 */
	void mouseExited(MouseEvent mouseEvent);

	/**
	 * public final synchronized method
	 */
	void mouseMoved(MouseEvent mouseEvent);

	/**
	 * public final synchronized method
	 */
	void mousePressed(MouseEvent mouseEvent);

	/**
	 * public final synchronized method
	 */
	void mouseReleased(MouseEvent mouseEvent);
}
