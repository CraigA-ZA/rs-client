package deobfuscator.models;

import lombok.Getter;

@Getter
public class FoundMethod {
    public final String className;
    public final String name;
    public final String desc;
    public FoundMethod(String className, String name, String desc) {
        this.className = className;
        this.name = name;
        this.desc = desc;
    }
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