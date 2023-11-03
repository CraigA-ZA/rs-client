package api.enums;

public final class ComponentId {
    private final int packed;

    public ComponentId(int packed) {
        this.packed = packed;
    }

    public ComponentId(int itf, int component) {
        this.packed = (itf << 16) | component;
    }

    public int getItf() {
        return packed >> 16;
    }
    public  int getComponent() {
        return packed & 0xFFFF;
    }

    public static int getItf(int packed) {
        return packed >> 16;
    }

    public static int getComponent(int packed) {
        return packed & 0xFFFF;
    }

    public static final ComponentId CASTLE_WARS_SARADOMIN_TIME_LEFT = new ComponentId(InterfaceId.CASTLE_WARS_SARADOMIN, 25);
    public static final ComponentId CASTLE_WARS_ZAMORAK_TIME_LEFT = new ComponentId(InterfaceId.CASTLE_WARS_ZAMORAK, 25);
    public static final ComponentId TOPLEVEL_MAIN_MODAL = new ComponentId(InterfaceId.TOPLEVEL_RESIZABLE_OLD_SCHOOL_BOX, 14);
    public static final ComponentId CHAT_BOX = new ComponentId(InterfaceId.CHAT, 0);
    public static final ComponentId CHAT_REPORT_TEXT = new ComponentId(InterfaceId.CHAT, 36);
    public static final ComponentId INVENTORY_ITEMS = new ComponentId(InterfaceId.INVENTORY, 0);
    public static final ComponentId MINIMAP_ORBS_HP_CIRCLE = new ComponentId(InterfaceId.MINIMAP_ORBS, 6);
    public static final ComponentId MINIMAP_ORBS_SPEC_CIRCLE = new ComponentId(InterfaceId.MINIMAP_ORBS, 31);
    public static final ComponentId COMBAT_OPTIONS_STYLE_1 = new ComponentId(InterfaceId.COMBAT_OPTIONS, 4);
    public static final ComponentId COMBAT_OPTIONS_STYLE_2 = new ComponentId(InterfaceId.COMBAT_OPTIONS, 8);
    public static final ComponentId COMBAT_OPTIONS_STYLE_3 = new ComponentId(InterfaceId.COMBAT_OPTIONS, 12);
    public static final ComponentId COMBAT_OPTIONS_STYLE_4 = new ComponentId(InterfaceId.COMBAT_OPTIONS, 16);
    public static final ComponentId COMBAT_OPTIONS_STYLE_DEFENSIVE_SPELL = new ComponentId(InterfaceId.COMBAT_OPTIONS, 21);
    public static final ComponentId COMBAT_OPTIONS_STYLE_DEFENSIVE_SPELL_2 = new ComponentId(InterfaceId.COMBAT_OPTIONS, 22);
    public static final ComponentId COMBAT_OPTIONS_STYLE_SPELL = new ComponentId(InterfaceId.COMBAT_OPTIONS, 26);
    public static final ComponentId COMBAT_OPTIONS_STYLE_SPELL_2 = new ComponentId(InterfaceId.COMBAT_OPTIONS, 27);
}
