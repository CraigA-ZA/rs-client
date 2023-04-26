package shared.model;

import lombok.Getter;
import lombok.Setter;
import lombok.val;

import java.util.List;

@Getter
@Setter
public class IdClass {
    public String className;
    public String superName;
    public String name;
    public int access;
    public List<String> interfaces;
    public List<IdField> fields;
    public List<IdMethod> methods;
}
