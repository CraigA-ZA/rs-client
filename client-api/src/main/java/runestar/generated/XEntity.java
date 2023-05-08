package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public abstract class
 */
public interface XEntity extends Accessor, XDualNode {
	/**
	 * @see XEntity#draw(int, int, int, int, int, int, int, int, long)
	 */
	@NotNull
	MethodExecution<XEntity, Void> draw = new MethodExecution.Implementation();

	/**
	 * @see XEntity#getModel()
	 */
	@NotNull
	MethodExecution<XEntity, XModel> getModel = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	int getHeight();

	/**
	 * public field
	 */
	void setHeight(int value);

	/**
	 *  method
	 */
	void draw(int yaw, int cameraPitchSine, int cameraPitchCosine, int cameraYawSine,
			int cameraYawCosine, int x, int y, int z, long tag);

	/**
	 * protected method
	 */
	XModel getModel();
}
