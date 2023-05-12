package api;

import accessors.RSClient;
import api.utility.Angle;
import api.utility.LocalValue;

public class Camera {
    RSClient client;

    public Camera(RSClient client) {
        this.client = client;
    }

    public int getLocalX() {
        return Math.max(Math.min(client.getCameraX(), LocalValue.MAX.getValue()), 0);
    }

    public int getLocalY() {
        return Math.max(Math.min(client.getCameraZ(), LocalValue.MAX.getValue()), 0);
    }

    public int getAbsoluteHeight() {
        return client.getCameraY();
    }

    public int getHeight() {
        return Scene.getTileHeight(getLocalX(), getLocalY(), getPlane(), this.client) - getAbsoluteHeight();
    }

    public int getPlane() {
        return client.getPlane();
    }

    public Angle getPitch() {
        return Angle.of(client.getCameraPitch(), client);
    }

    public Angle getYaw() {
        return Angle.of(client.getCameraYaw(), client);
    }

    public Position getPosition() {
        return new Position(getLocalX(), getLocalY(), getHeight(), getPlane(), client);
    }

    @Override
    public String toString() {
        return "Camera(position=" + getPosition() + ", pitch=" + getPitch() + ", yaw=" + getYaw() + ")";
    }
}