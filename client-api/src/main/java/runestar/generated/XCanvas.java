package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.awt.Component;
import java.awt.Graphics;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public final class extends {@link java.awt.Canvas}
 */
public interface XCanvas extends Accessor {
	/**
	 * @see XCanvas#paint(Graphics)
	 */
	@NotNull
	MethodExecution<XCanvas, Void> paint = new MethodExecution.Implementation();

	/**
	 * @see XCanvas#update(Graphics)
	 */
	@NotNull
	MethodExecution<XCanvas, Void> update = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	Component getComponent();

	/**
	 *  field
	 */
	void setComponent(Component value);

	/**
	 * public final method
	 */
	void paint(Graphics g);

	/**
	 * public final method
	 */
	void update(Graphics g);
}
