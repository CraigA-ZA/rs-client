package api;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.awt.*;

@AllArgsConstructor
@Getter
public class ComponentItem {
    Item item;
    Rectangle area;
}
