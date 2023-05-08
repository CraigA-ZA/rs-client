package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Integer;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public abstract class
 */
public interface XAbstractFont extends Accessor, XRasterizer2D {
	/**
	 * @see XAbstractFont#breakLines(String, int[], String[])
	 */
	@NotNull
	MethodExecution<XAbstractFont, Integer> breakLines = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#calculateLineJustification(String, int)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Void> calculateLineJustification = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#charWidth(char)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Integer> charWidth = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#decodeTag(String)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Void> decodeTag = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#draw(String, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Void> draw = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#draw0(String, int, int)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Void> draw0 = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#drawAlpha(String, int, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Void> drawAlpha = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#drawCentered(String, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Void> drawCentered = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#drawCenteredShake(String, int, int, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Void> drawCenteredShake = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#drawCenteredWave(String, int, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Void> drawCenteredWave = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#drawCenteredWave2(String, int, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Void> drawCenteredWave2 = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#drawLines(String, int, int, int, int, int, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Integer> drawLines = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#drawRandomAlphaAndSpacing(String, int, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Void> drawRandomAlphaAndSpacing = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#drawRightAligned(String, int, int, int, int)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Void> drawRightAligned = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#drawWithOffsets0(String, int, int, int[], int[])
	 */
	@NotNull
	MethodExecution<XAbstractFont, Void> drawWithOffsets0 = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#lineCount(String, int)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Integer> lineCount = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#lineWidth(String, int)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Integer> lineWidth = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#readMetrics(byte[])
	 */
	@NotNull
	MethodExecution<XAbstractFont, Void> readMetrics = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#reset(int, int)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Void> reset = new MethodExecution.Implementation();

	/**
	 * @see XAbstractFont#stringWidth(String)
	 */
	@NotNull
	MethodExecution<XAbstractFont, Integer> stringWidth = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	int[] getAdvances();

	/**
	 *  field
	 */
	void setAdvances(int[] value);

	/**
	 * public field
	 */
	int getAscent();

	/**
	 * public field
	 */
	void setAscent(int value);

	/**
	 *  field
	 */
	int[] getHeights();

	/**
	 *  field
	 */
	void setHeights(int[] value);

	/**
	 *  field
	 */
	byte[] getKerning();

	/**
	 *  field
	 */
	void setKerning(byte[] value);

	/**
	 *  field
	 */
	int[] getLeftBearings();

	/**
	 *  field
	 */
	void setLeftBearings(int[] value);

	/**
	 * public field
	 */
	int getMaxAscent();

	/**
	 * public field
	 */
	void setMaxAscent(int value);

	/**
	 * public field
	 */
	int getMaxDescent();

	/**
	 * public field
	 */
	void setMaxDescent(int value);

	/**
	 *  field
	 */
	byte[][] getPixels();

	/**
	 *  field
	 */
	void setPixels(byte[][] value);

	/**
	 *  field
	 */
	int[] getTopBearings();

	/**
	 *  field
	 */
	void setTopBearings(int[] value);

	/**
	 *  field
	 */
	int[] getWidths();

	/**
	 *  field
	 */
	void setWidths(int[] value);

	/**
	 * public method
	 */
	int breakLines(String s, int[] lineWidths, String[] linesDst);

	/**
	 *  method
	 */
	void calculateLineJustification(String s, int lineWidth);

	/**
	 * public method
	 */
	int charWidth(char c);

	/**
	 *  method
	 */
	void decodeTag(String s);

	/**
	 * public method
	 */
	void draw(String s, int x, int y, int color, int shadow);

	/**
	 *  method
	 */
	void draw0(String s, int x, int y);

	/**
	 * public method
	 */
	void drawAlpha(String s, int x, int y, int color, int shadow, int alpha);

	/**
	 * public method
	 */
	void drawCentered(String s, int x, int y, int color, int shadow);

	/**
	 * public method
	 */
	void drawCenteredShake(String s, int x, int y, int color, int shadow, int seed, int seed2);

	/**
	 * public method
	 */
	void drawCenteredWave(String s, int x, int y, int color, int shadow, int seed);

	/**
	 * public method
	 */
	void drawCenteredWave2(String s, int x, int y, int color, int shadow, int seed);

	/**
	 * abstract method
	 */
	void drawGlyph(byte[] pixels, int x, int y, int width, int height, int color);

	/**
	 * abstract method
	 */
	void drawGlyphAlpha(byte[] pixels, int x, int y, int width, int height, int color, int alpha);

	/**
	 * public method
	 */
	int drawLines(String s, int x, int y, int width, int height, int color, int shadow, int xAlignment,
			int yAlignment, int lineHeight);

	/**
	 * public method
	 */
	void drawRandomAlphaAndSpacing(String s, int x, int y, int color, int shadow, int seed);

	/**
	 * public method
	 */
	void drawRightAligned(String s, int x, int y, int color, int shadow);

	/**
	 *  method
	 */
	void drawWithOffsets0(String s, int x, int y, int[] xs, int[] ys);

	/**
	 * public method
	 */
	int lineCount(String s, int lineWidth);

	/**
	 * public method
	 */
	int lineWidth(String s, int lineWidth);

	/**
	 *  method
	 */
	void readMetrics(byte[] bytes);

	/**
	 *  method
	 */
	void reset(int color, int shadow);

	/**
	 * public method
	 */
	int stringWidth(String s);
}
