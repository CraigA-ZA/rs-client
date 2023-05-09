package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.awt.event.KeyEvent;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XKeyHandler extends Accessor {
	/**
	 * @see XKeyHandler#keyPressed(KeyEvent)
	 */
	@NotNull
	MethodExecution<XKeyHandler, Void> keyPressed = new MethodExecution.Implementation();

	/**
	 * @see XKeyHandler#keyReleased(KeyEvent)
	 */
	@NotNull
	MethodExecution<XKeyHandler, Void> keyReleased = new MethodExecution.Implementation();

	/**
	 * @see XKeyHandler#keyTyped(KeyEvent)
	 */
	@NotNull
	MethodExecution<XKeyHandler, Void> keyTyped = new MethodExecution.Implementation();

	/**
	 * public final synchronized method
	 */
	void keyPressed(KeyEvent keyEvent);

	/**
	 * public final synchronized method
	 */
	void keyReleased(KeyEvent keyEvent);

	/**
	 * public final synchronized method
	 */
	void keyTyped(KeyEvent keyEvent);
}
