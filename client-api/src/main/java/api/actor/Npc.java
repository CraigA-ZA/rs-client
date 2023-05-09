package api.actor;

import accessors.RSNPCType;
import accessors.RSNpc;
import runestar.generated.XNpc;

public class NpcWrapper extends ActorWrapper {
    private final RSNpc rsNpc;
    private final int index;
    private final int plane;

    public NpcWrapper(RSNpc rsNpc, int index, int plane) {
        super(rsNpc);
        this.rsNpc = rsNpc;
        this.index = index;
        this.plane = plane;
    }

    public NpcDefinition getType() {
        return rsNpc.getType() != null ? new NpcDefinition(rsNpc.getType()) : null;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public int getPlane() {
        return plane;
    }
}