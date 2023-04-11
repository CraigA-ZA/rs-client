package utility;

import identifiers.AbstractIdentifier;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DependsOn {
    Class<? extends AbstractIdentifier>[] value();
}