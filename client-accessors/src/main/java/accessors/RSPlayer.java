package accessors;

public interface RSPlayer extends RSActor {
    public String[] getActions();

    public int getAnimationCycleEnd();

    public int getAnimationCycleStart();

    public RSPlayerAppearance getAppearance();

    public int getCombatLevel();
    public int getHeadIconPk();

    public int getHeadIconPrayer();

    public int getIndex();

    public boolean getIsHidden();

    public boolean getIsUnanimated();

    public RSModel getModel0();

    public int getPlane();

    public int getSkillLevel();

    public int getTeam();

    public int getTileHeight();

    public int getTileHeight2();

    public int getTileX();

    public int getTileY();

    public RSUsername getUsername();
}
