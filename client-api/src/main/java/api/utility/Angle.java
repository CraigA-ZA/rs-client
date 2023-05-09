package wrappers.utility;

import accessors.RSClient;
import lombok.AllArgsConstructor;

public final class Angle {
    private final int value;
    RSClient client;
//
//    private static final double DEGREES_INTERVAL = 360.0 / 2048;
//    private static final double RADIANS_INTERVAL = Math.toRadians(DEGREES_INTERVAL);
    public static final int MAX_VALUE = 2048;
//
//
    private Angle(int value, RSClient client) {
        this.value = value;
        this.client = client;
    }
//
//    public int getValue() {
//        return value;
//    }
//
//    public double getDegrees() {
//        return value * DEGREES_INTERVAL;
//    }
//
//    public double getRadians() {
//        return value * RADIANS_INTERVAL;
//    }
//
//    public Angle plus(Angle other, RSClient client) {
//        return of(value + other.value, client);
//    }
//
//    public Angle minus(Angle other, RSClient client) {
//        return of(value - other.value, client);
//    }
//
//    public double sin() {
//        return Math.sin(getRadians());
//    }
//
//    public double cos() {
//        return Math.cos(getRadians());
//    }
//
    public int sinInternal() {
        return client.getRasterizer3D_sine()[value];
    }

    public int cosInternal() {
        return client.getRasterizer3D_cosine()[value];
    }
//
    public static Angle of(int value, RSClient client) {
        return new Angle(value % MAX_VALUE, client);
    }

//    public static final Angle ZERO = of(0, client);
}
