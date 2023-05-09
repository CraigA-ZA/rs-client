package wrappers.actor;

import accessors.RSClient;
import accessors.RSPlayer;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

@AllArgsConstructor
public class Players {
    private final RSClient client;

    public PlayerWrapper get(int index) {
        RSPlayer player = client.getPlayers()[index];
        return player != null ? new PlayerWrapper(player) : null;
    }

    public PlayerWrapper getLocal() {
        RSPlayer player = client.getLocalPlayer();
        return player != null ? new PlayerWrapper(player) : null;
    }

    public List<PlayerWrapper> toList() {
        System.out.println(size());
        return IntStream.range(0, size())
                .mapToObj(this::get)
                .filter(Objects::nonNull)
                .toList();
    }

    public int size() {
        return client.getPlayers_count();
    }
}