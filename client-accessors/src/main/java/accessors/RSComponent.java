package accessors;

public interface RSComponent extends RSNode {
    public String[] getActions();

    public String getButtonText();

    public int getButtonType();

    public int getChildIndex();

    public RSComponent[] getChildren();

    public int getClickMask();

    public int getClientCode();

    public int getColor();

    public int getColor2();

    public int[] getCs1ComparisonValues();

    public int[] getCs1Comparisons();

    public int[][] getCs1Instructions();

    public int getCycle();

    public int getDragDeadTime();

    public int getDragDeadZone();

    public boolean getFill();

    public boolean getHasListener();

    public int getHeight();

    public int getHeightAlignment();

    public int getId();

    public int[] getInvTransmitTriggers();

    public boolean getIsDraggable();

    public boolean getIsHidden();

    public boolean getIsIf3();

    public int getItemId();

    public int getItemQuantity();

    public int getLineWid();

    public int getModelAngleX();

    public int getModelAngleY();

    public int getModelAngleZ();

    public int getModelFrame();

    public int getModelFrameCycle();

    public int getModelId();

    public int getModelId2();

    public int getModelOffsetX();

    public int getModelOffsetY();

    public boolean getModelOrthog();

    public boolean getModelTransparency();

    public int getModelType();

    public int getModelType2();

    public int getModelZoom();

    public int getMouseOverColor();

    public int getMouseOverColor2();

    public int getMouseOverRedirect();

    public boolean getNoClickThrough();

    public Object[] getOnChatTransmit();

    public Object[] getOnClanTransmit();

    public Object[] getOnClick();

    public Object[] getOnClickRepeat();

    public Object[] getOnDialogAbort();

    public Object[] getOnDrag();

    public Object[] getOnDragComplete();

    public Object[] getOnFriendTransmit();

    public Object[] getOnHold();

    public Object[] getOnInvTransmit();

    public Object[] getOnKey();

    public Object[] getOnLoad();

    public Object[] getOnMiscTransmit();

    public Object[] getOnMouseLeave();

    public Object[] getOnMouseOver();

    public Object[] getOnMouseRepeat();

    public Object[] getOnOp();

    public Object[] getOnRelease();

    public Object[] getOnScrollWheel();

    public Object[] getOnStatTransmit();

    public Object[] getOnStockTransmit();

    public Object[] getOnSubChange();

    public Object[] getOnTargetEnter();

    public Object[] getOnTargetLeave();

    public Object[] getOnTimer();

    public Object[] getOnVarTransmit();

    public String getOpbase();

    public int getOutline();

    public int getPaddingX();

    public int getPaddingY();

    public RSComponent getParent();

    public int getParentId();

    public int getRawHeight();

    public int getRawWidth();

    public int getRawX();

    public int getRawY();

    public int getRootIndex();

    public int getScrollHeight();

    public int getScrollWidth();

    public int getScrollX();

    public int getScrollY();

    public int getSequenceId();

    public int getSequenceId2();

    public String getSpellName();

    public int getSpriteAngle();

    public int getSpriteId();

    public int getSpriteId2();

    public int getSpriteShadow();

    public boolean getSpriteTiling();

    public int[] getStatTransmitTriggers();

    public String getTargetVerb();

    public String getText();

    public String getText2();

    public int getTextLineHeight();

    public boolean getTextShadowed();

    public int getTextXAlignment();

    public int getTextYAlignment();

    public int getTransparency();

    public int getType();

    public int[] getVarTransmitTriggers();

    public int getWidth();

    public int getWidthAlignment();

    public int getX();

    public int getXAlignment();

    public int getY();

    public int getYAlignment();
}
