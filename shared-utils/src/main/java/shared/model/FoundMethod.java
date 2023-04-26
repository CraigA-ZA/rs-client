package shared.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FoundMethod {
    public final String className;
    public final String name;
    public final String desc;
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FoundMethod) {
            FoundMethod info = (FoundMethod) obj;
            return className.equals(info.className) && name.equals(info.name) && desc.equals(info.desc);
        }
        return false;
    }
    @Override
    public String toString() {
        return className.replace("/", ".") + "." + name + desc;
    }
}