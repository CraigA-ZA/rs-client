package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public class
 */
public interface XComponent extends Accessor, XNode {
	/**
	 * @see XComponent#decode(XPacket)
	 */
	@NotNull
	MethodExecution<XComponent, Void> decode = new MethodExecution.Implementation();

	/**
	 * @see XComponent#decodeLegacy(XPacket)
	 */
	@NotNull
	MethodExecution<XComponent, Void> decodeLegacy = new MethodExecution.Implementation();

	/**
	 * @see XComponent#getFont()
	 */
	@NotNull
	MethodExecution<XComponent, XFont> getFont = new MethodExecution.Implementation();

	/**
	 * @see XComponent#getModel(XSeqType, int, boolean, XPlayerAppearance)
	 */
	@NotNull
	MethodExecution<XComponent, XModel> getModel = new MethodExecution.Implementation();

	/**
	 * @see XComponent#getSpriteMask(boolean)
	 */
	@NotNull
	MethodExecution<XComponent, XSpriteMask> getSpriteMask = new MethodExecution.Implementation();

	/**
	 * @see XComponent#readListener(XPacket)
	 */
	@NotNull
	MethodExecution<XComponent, Object[]> readListener = new MethodExecution.Implementation();

	/**
	 * @see XComponent#readListenerTriggers(XPacket)
	 */
	@NotNull
	MethodExecution<XComponent, int[]> readListenerTriggers = new MethodExecution.Implementation();

	/**
	 * @see XComponent#setAction(int, String)
	 */
	@NotNull
	MethodExecution<XComponent, Void> setAction = new MethodExecution.Implementation();

	/**
	 * @see XComponent#swapItems(int, int)
	 */
	@NotNull
	MethodExecution<XComponent, Void> swapItems = new MethodExecution.Implementation();

	/**
	 * public field
	 */
	String[] getActions();

	/**
	 * public field
	 */
	void setActions(String[] value);

	/**
	 * public field
	 */
	String getButtonText();

	/**
	 * public field
	 */
	void setButtonText(String value);

	/**
	 * public field
	 */
	int getButtonType();

	/**
	 * public field
	 */
	void setButtonType(int value);

	/**
	 * public field
	 */
	int getChildIndex();

	/**
	 * public field
	 */
	void setChildIndex(int value);

	/**
	 * public field
	 */
	XComponent[] getChildren();

	/**
	 * public field
	 */
	void setChildren(XComponent[] value);

	/**
	 * public field
	 */
	int getClickMask();

	/**
	 * public field
	 */
	void setClickMask(int value);

	/**
	 * public field
	 */
	int getClientCode();

	/**
	 * public field
	 */
	void setClientCode(int value);

	/**
	 * public field
	 */
	int getColor();

	/**
	 * public field
	 */
	void setColor(int value);

	/**
	 * public field
	 */
	int getColor2();

	/**
	 * public field
	 */
	void setColor2(int value);

	/**
	 * public field
	 */
	int[] getCs1ComparisonValues();

	/**
	 * public field
	 */
	void setCs1ComparisonValues(int[] value);

	/**
	 * public field
	 */
	int[] getCs1Comparisons();

	/**
	 * public field
	 */
	void setCs1Comparisons(int[] value);

	/**
	 * public field
	 */
	int[][] getCs1Instructions();

	/**
	 * public field
	 */
	void setCs1Instructions(int[][] value);

	/**
	 * public field
	 */
	int getCycle();

	/**
	 * public field
	 */
	void setCycle(int value);

	/**
	 * public field
	 */
	int getDragDeadTime();

	/**
	 * public field
	 */
	void setDragDeadTime(int value);

	/**
	 * public field
	 */
	int getDragDeadZone();

	/**
	 * public field
	 */
	void setDragDeadZone(int value);

	/**
	 * public field
	 */
	boolean getFill();

	/**
	 * public field
	 */
	void setFill(boolean value);

	/**
	 * public field
	 */
	boolean getHasListener();

	/**
	 * public field
	 */
	void setHasListener(boolean value);

	/**
	 * public field
	 */
	int getHeight();

	/**
	 * public field
	 */
	void setHeight(int value);

	/**
	 * public field
	 */
	int getHeightAlignment();

	/**
	 * public field
	 */
	void setHeightAlignment(int value);

	/**
	 * public field
	 */
	int getId();

	/**
	 * public field
	 */
	void setId(int value);

	/**
	 * public field
	 */
	int[] getInvTransmitTriggers();

	/**
	 * public field
	 */
	void setInvTransmitTriggers(int[] value);

	/**
	 * public field
	 */
	boolean getIsDraggable();

	/**
	 * public field
	 */
	void setIsDraggable(boolean value);

	/**
	 * public field
	 */
	boolean getIsHidden();

	/**
	 * public field
	 */
	void setIsHidden(boolean value);

	/**
	 * public field
	 */
	boolean getIsIf3();

	/**
	 * public field
	 */
	void setIsIf3(boolean value);

	/**
	 * public field
	 */
	int getItemId();

	/**
	 * public field
	 */
	void setItemId(int value);

	/**
	 * public field
	 */
	int getItemQuantity();

	/**
	 * public field
	 */
	void setItemQuantity(int value);

	/**
	 * public field
	 */
	int getLineWid();

	/**
	 * public field
	 */
	void setLineWid(int value);

	/**
	 * public field
	 */
	int getModelAngleX();

	/**
	 * public field
	 */
	void setModelAngleX(int value);

	/**
	 * public field
	 */
	int getModelAngleY();

	/**
	 * public field
	 */
	void setModelAngleY(int value);

	/**
	 * public field
	 */
	int getModelAngleZ();

	/**
	 * public field
	 */
	void setModelAngleZ(int value);

	/**
	 * public field
	 */
	int getModelFrame();

	/**
	 * public field
	 */
	void setModelFrame(int value);

	/**
	 * public field
	 */
	int getModelFrameCycle();

	/**
	 * public field
	 */
	void setModelFrameCycle(int value);

	/**
	 * public field
	 */
	int getModelId();

	/**
	 * public field
	 */
	void setModelId(int value);

	/**
	 *  field
	 */
	int getModelId2();

	/**
	 *  field
	 */
	void setModelId2(int value);

	/**
	 * public field
	 */
	int getModelOffsetX();

	/**
	 * public field
	 */
	void setModelOffsetX(int value);

	/**
	 * public field
	 */
	int getModelOffsetY();

	/**
	 * public field
	 */
	void setModelOffsetY(int value);

	/**
	 * public field
	 */
	boolean getModelOrthog();

	/**
	 * public field
	 */
	void setModelOrthog(boolean value);

	/**
	 * public field
	 */
	boolean getModelTransparency();

	/**
	 * public field
	 */
	void setModelTransparency(boolean value);

	/**
	 * public field
	 */
	int getModelType();

	/**
	 * public field
	 */
	void setModelType(int value);

	/**
	 *  field
	 */
	int getModelType2();

	/**
	 *  field
	 */
	void setModelType2(int value);

	/**
	 * public field
	 */
	int getModelZoom();

	/**
	 * public field
	 */
	void setModelZoom(int value);

	/**
	 * public field
	 */
	int getMouseOverColor();

	/**
	 * public field
	 */
	void setMouseOverColor(int value);

	/**
	 * public field
	 */
	int getMouseOverColor2();

	/**
	 * public field
	 */
	void setMouseOverColor2(int value);

	/**
	 * public field
	 */
	int getMouseOverRedirect();

	/**
	 * public field
	 */
	void setMouseOverRedirect(int value);

	/**
	 * public field
	 */
	boolean getNoClickThrough();

	/**
	 * public field
	 */
	void setNoClickThrough(boolean value);

	/**
	 * public field
	 */
	Object[] getOnChatTransmit();

	/**
	 * public field
	 */
	void setOnChatTransmit(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnClanTransmit();

	/**
	 * public field
	 */
	void setOnClanTransmit(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnClick();

	/**
	 * public field
	 */
	void setOnClick(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnClickRepeat();

	/**
	 * public field
	 */
	void setOnClickRepeat(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnDialogAbort();

	/**
	 * public field
	 */
	void setOnDialogAbort(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnDrag();

	/**
	 * public field
	 */
	void setOnDrag(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnDragComplete();

	/**
	 * public field
	 */
	void setOnDragComplete(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnFriendTransmit();

	/**
	 * public field
	 */
	void setOnFriendTransmit(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnHold();

	/**
	 * public field
	 */
	void setOnHold(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnInvTransmit();

	/**
	 * public field
	 */
	void setOnInvTransmit(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnKey();

	/**
	 * public field
	 */
	void setOnKey(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnLoad();

	/**
	 * public field
	 */
	void setOnLoad(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnMiscTransmit();

	/**
	 * public field
	 */
	void setOnMiscTransmit(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnMouseLeave();

	/**
	 * public field
	 */
	void setOnMouseLeave(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnMouseOver();

	/**
	 * public field
	 */
	void setOnMouseOver(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnMouseRepeat();

	/**
	 * public field
	 */
	void setOnMouseRepeat(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnOp();

	/**
	 * public field
	 */
	void setOnOp(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnRelease();

	/**
	 * public field
	 */
	void setOnRelease(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnScrollWheel();

	/**
	 * public field
	 */
	void setOnScrollWheel(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnStatTransmit();

	/**
	 * public field
	 */
	void setOnStatTransmit(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnStockTransmit();

	/**
	 * public field
	 */
	void setOnStockTransmit(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnSubChange();

	/**
	 * public field
	 */
	void setOnSubChange(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnTargetEnter();

	/**
	 * public field
	 */
	void setOnTargetEnter(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnTargetLeave();

	/**
	 * public field
	 */
	void setOnTargetLeave(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnTimer();

	/**
	 * public field
	 */
	void setOnTimer(Object[] value);

	/**
	 * public field
	 */
	Object[] getOnVarTransmit();

	/**
	 * public field
	 */
	void setOnVarTransmit(Object[] value);

	/**
	 * public field
	 */
	String getOpbase();

	/**
	 * public field
	 */
	void setOpbase(String value);

	/**
	 * public field
	 */
	int getOutline();

	/**
	 * public field
	 */
	void setOutline(int value);

	/**
	 * public field
	 */
	int getPaddingX();

	/**
	 * public field
	 */
	void setPaddingX(int value);

	/**
	 *  field
	 */
	int getPaddingY();

	/**
	 *  field
	 */
	void setPaddingY(int value);

	/**
	 * public field
	 */
	XComponent getParent();

	/**
	 * public field
	 */
	void setParent(XComponent value);

	/**
	 * public field
	 */
	int getParentId();

	/**
	 * public field
	 */
	void setParentId(int value);

	/**
	 * public field
	 */
	int getRawHeight();

	/**
	 * public field
	 */
	void setRawHeight(int value);

	/**
	 * public field
	 */
	int getRawWidth();

	/**
	 * public field
	 */
	void setRawWidth(int value);

	/**
	 * public field
	 */
	int getRawX();

	/**
	 * public field
	 */
	void setRawX(int value);

	/**
	 * public field
	 */
	int getRawY();

	/**
	 * public field
	 */
	void setRawY(int value);

	/**
	 * public field
	 */
	int getRootIndex();

	/**
	 * public field
	 */
	void setRootIndex(int value);

	/**
	 * public field
	 */
	int getScrollHeight();

	/**
	 * public field
	 */
	void setScrollHeight(int value);

	/**
	 * public field
	 */
	int getScrollWidth();

	/**
	 * public field
	 */
	void setScrollWidth(int value);

	/**
	 * public field
	 */
	int getScrollX();

	/**
	 * public field
	 */
	void setScrollX(int value);

	/**
	 * public field
	 */
	int getScrollY();

	/**
	 * public field
	 */
	void setScrollY(int value);

	/**
	 * public field
	 */
	int getSequenceId();

	/**
	 * public field
	 */
	void setSequenceId(int value);

	/**
	 * public field
	 */
	int getSequenceId2();

	/**
	 * public field
	 */
	void setSequenceId2(int value);

	/**
	 * public field
	 */
	String getSpellName();

	/**
	 * public field
	 */
	void setSpellName(String value);

	/**
	 * public field
	 */
	int getSpriteAngle();

	/**
	 * public field
	 */
	void setSpriteAngle(int value);

	/**
	 * public field
	 */
	int getSpriteId();

	/**
	 * public field
	 */
	void setSpriteId(int value);

	/**
	 * public field
	 */
	int getSpriteId2();

	/**
	 * public field
	 */
	void setSpriteId2(int value);

	/**
	 * public field
	 */
	int getSpriteShadow();

	/**
	 * public field
	 */
	void setSpriteShadow(int value);

	/**
	 * public field
	 */
	boolean getSpriteTiling();

	/**
	 * public field
	 */
	void setSpriteTiling(boolean value);

	/**
	 * public field
	 */
	int[] getStatTransmitTriggers();

	/**
	 * public field
	 */
	void setStatTransmitTriggers(int[] value);

	/**
	 * public field
	 */
	String getTargetVerb();

	/**
	 * public field
	 */
	void setTargetVerb(String value);

	/**
	 * public field
	 */
	String getText();

	/**
	 * public field
	 */
	void setText(String value);

	/**
	 * public field
	 */
	String getText2();

	/**
	 * public field
	 */
	void setText2(String value);

	/**
	 * public field
	 */
	int getTextLineHeight();

	/**
	 * public field
	 */
	void setTextLineHeight(int value);

	/**
	 * public field
	 */
	boolean getTextShadowed();

	/**
	 * public field
	 */
	void setTextShadowed(boolean value);

	/**
	 * public field
	 */
	int getTextXAlignment();

	/**
	 * public field
	 */
	void setTextXAlignment(int value);

	/**
	 * public field
	 */
	int getTextYAlignment();

	/**
	 * public field
	 */
	void setTextYAlignment(int value);

	/**
	 * public field
	 */
	int getTransparency();

	/**
	 * public field
	 */
	void setTransparency(int value);

	/**
	 * public field
	 */
	int getType();

	/**
	 * public field
	 */
	void setType(int value);

	/**
	 * public field
	 */
	int[] getVarTransmitTriggers();

	/**
	 * public field
	 */
	void setVarTransmitTriggers(int[] value);

	/**
	 * public field
	 */
	int getWidth();

	/**
	 * public field
	 */
	void setWidth(int value);

	/**
	 * public field
	 */
	int getWidthAlignment();

	/**
	 * public field
	 */
	void setWidthAlignment(int value);

	/**
	 * public field
	 */
	int getX();

	/**
	 * public field
	 */
	void setX(int value);

	/**
	 * public field
	 */
	int getXAlignment();

	/**
	 * public field
	 */
	void setXAlignment(int value);

	/**
	 * public field
	 */
	int getY();

	/**
	 * public field
	 */
	void setY(int value);

	/**
	 * public field
	 */
	int getYAlignment();

	/**
	 * public field
	 */
	void setYAlignment(int value);

	/**
	 *  method
	 */
	void decode(XPacket packet);

	/**
	 *  method
	 */
	void decodeLegacy(XPacket packet);

	/**
	 * public method
	 */
	XFont getFont();

	/**
	 * public method
	 */
	XModel getModel(XSeqType sequence, int frame, boolean b, XPlayerAppearance appearance);

	/**
	 * public method
	 */
	XSpriteMask getSpriteMask(boolean b);

	/**
	 *  method
	 */
	Object[] readListener(XPacket packet);

	/**
	 *  method
	 */
	int[] readListenerTriggers(XPacket packet);

	/**
	 * public method
	 */
	void setAction(int index, String s);

	/**
	 * public method
	 */
	void swapItems(int indexA, int indexB);
}
