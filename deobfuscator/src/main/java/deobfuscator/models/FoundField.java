package deobfuscator.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FoundField {
    String className;
    String name;

    @Override
    public String toString() {
        return className + "." + name;
    }
}
