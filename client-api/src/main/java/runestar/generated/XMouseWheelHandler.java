package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.lang.Integer;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XMouseWheelHandler extends Accessor {
	/**
	 * @see XMouseWheelHandler#addTo(Component)
	 */
	@NotNull
	MethodExecution<XMouseWheelHandler, Void> addTo = new MethodExecution.Implementation();

	/**
	 * @see XMouseWheelHandler#mouseWheelMoved(MouseWheelEvent)
	 */
	@NotNull
	MethodExecution<XMouseWheelHandler, Void> mouseWheelMoved = new MethodExecution.Implementation();

	/**
	 * @see XMouseWheelHandler#removeFrom(Component)
	 */
	@NotNull
	MethodExecution<XMouseWheelHandler, Void> removeFrom = new MethodExecution.Implementation();

	/**
	 * @see XMouseWheelHandler#useRotation()
	 */
	@NotNull
	MethodExecution<XMouseWheelHandler, Integer> useRotation = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int getRotation();

	/**
	 *  field
	 */
	void setRotation(int value);

	/**
	 *  method
	 */
	void addTo(Component component);

	/**
	 * public synchronized method
	 */
	void mouseWheelMoved(MouseWheelEvent mouseWheelEvent);

	/**
	 *  method
	 */
	void removeFrom(Component component);

	/**
	 * public synchronized method
	 */
	int useRotation();
}
