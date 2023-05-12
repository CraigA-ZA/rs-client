package api.actor;

import accessors.RSClient;
import accessors.RSNpc;

public class Npc extends Actor {
    private final RSNpc rsNpc;
    private final int index;
    private final int plane;
    private final RSClient client;

    public Npc(RSNpc rsNpc, int index, int plane, RSClient client) {
        super(rsNpc, client);
        this.rsNpc = rsNpc;
        this.index = index;
        this.plane = plane;
        this.client = client;
    }

    @Override
    public int getPlane() {
        return plane;
    }

//    public NpcDefinition getType() {
//        return rsNpc.getType() != null ? new NpcDefinition(rsNpc.getType()) : null;
//    }
//
//    public int getIndex() {
//        return index;
//    }
}