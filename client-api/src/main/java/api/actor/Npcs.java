package api.actor;

import accessors.RSClient;
import accessors.RSNpc;
import com.google.inject.Inject;
import lombok.AllArgsConstructor;

import java.util.*;

@AllArgsConstructor
public class Npcs {
    private final RSClient client;

    public List<Npc> toList() {
        int[] npcIndices = client.getNpcIndices();
        return Arrays.stream(npcIndices)
                .mapToObj(this::get)
                .filter(Objects::nonNull)
                .toList();
    }

    public int size() {
        return client.getNpcCount();
    }

    public Npc get(int index) {
        RSNpc npc = client.getNpcs()[index];
        return npc != null ? new Npc(npc, index, client.getPlane(), client) : null;
    }
}