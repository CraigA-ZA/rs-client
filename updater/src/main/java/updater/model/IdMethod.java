package updater.model;

import lombok.Getter;
import lombok.Setter;
import lombok.val;

import java.util.List;

@Getter
@Setter
public class IdMethod {
    public String method;
    public String owner;
    public String name;
    public int access;
    public List<String> parameters;
    public String descriptor;
}