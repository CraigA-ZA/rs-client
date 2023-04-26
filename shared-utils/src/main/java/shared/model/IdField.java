package shared.model;

import lombok.Getter;
import lombok.Setter;
import lombok.val;

@Getter
@Setter
public class IdField {
    public String field;
    public String owner;
    public String name;
    public int access;
    public String descriptor;
}