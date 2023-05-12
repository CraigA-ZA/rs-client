package api.utility;

import api.Scene;

public final class LocalValue {
    final int value;

    public LocalValue(int value) {
        this.value = value;
    }

    public LocalValue(int scene, int sub) {
        this((scene << 7) | sub);
    }

    public int getScene() {
        return value >>> 7;
    }

    public int getSub() {
        return value & MAX_SUB;
    }

    public int getValue() {
        return value;
    }

//    public LocalValue plus(LocalValue other) {
//        return new LocalValue(value + other.value);
//    }

    @Override
    public String toString() {
        return "LocalValue(scene=" + getScene() + ", sub=" + getSub() + ")";
    }

    public static final int MAX_SUB = 0x7F;
    public static final int MID_SUB = 64;
    public static final LocalValue MAX = new LocalValue(Scene.SIZE - 1, MAX_SUB);
}
