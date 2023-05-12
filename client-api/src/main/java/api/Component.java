package api;

import accessors.RSClient;
import accessors.RSComponent;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Component {
    private final RSComponent component;
    private final RSClient client;
}
