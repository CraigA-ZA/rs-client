package wrappers.actor;

import accessors.RSClient;
import accessors.RSNpc;
import lombok.AllArgsConstructor;
import runestar.generated.XNpc;

import java.util.*;

@AllArgsConstructor
public class Npcs {

    private final RSClient client;

    public List<NpcWrapper> toList() {
        int[] npcIndices = client.getNpcIndices();
        return Arrays.stream(npcIndices)
                .mapToObj(this::get)
                .filter(Objects::nonNull)
                .toList();
    }

    public int size() {
        return client.getNpcCount();
    }

    public NpcWrapper get(int index) {
        RSNpc npc = client.getNpcs()[index];
        return npc != null ? new NpcWrapper(npc, index, client.getPlane()) : null;
    }
}