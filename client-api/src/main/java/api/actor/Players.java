package api.actor;

import accessors.RSClient;
import accessors.RSPlayer;
import lombok.AllArgsConstructor;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

@AllArgsConstructor
public class Players {
    private RSClient client;

    public Player get(int index) {
        RSPlayer player = client.getPlayers()[index];
        return player != null ? new Player(player, client) : null;
    }

    public Player getLocal() {
        RSPlayer player = client.getLocalPlayer();
        return player != null ? new Player(player, client) : null;
    }

    public List<Player> toList() {
        int[] playerIndices = client.getPlayers_indices();
        return Arrays.stream(playerIndices)
                .mapToObj(this::get)
                .filter(Objects::nonNull)
                .toList();
    }

    public int size() {
        return client.getPlayers_count();
    }
}