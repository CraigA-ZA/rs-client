package injector.callbacks;

import callbacks.Callbacks;
import org.objectweb.asm.Type;
import shared.Constants;
import shared.model.IdClass;
import shared.model.IdField;

import static injector.Injector.identifiedClasses;

public abstract class AbstractCallbackInjector {
    String callbacksType = Type.getObjectType(Constants.CALLBACKS_PACKAGE + "/" + Callbacks.class.getSimpleName()).getDescriptor();

    public abstract void run();

    public IdClass findClassMapping(String className) {
        return identifiedClasses.stream().filter(idClass -> idClass.className.equals(className)).findFirst().orElseThrow(() -> new RuntimeException(className + " class not found"));
    }

    public String findOriginalMethodNameFromMapping(IdClass idClass, String methodName) {
        return idClass.methods.stream().filter(idMethod -> idMethod.method.equals(methodName)).findFirst().orElseThrow(() -> new RuntimeException(methodName + " method not found")).name;
    }

    public IdField findOriginalFieldNameFromMapping(IdClass idClass, String fieldName) {
        return idClass.fields.stream().filter(idMethod -> idMethod.field.equals(fieldName)).findFirst().orElseThrow(() -> new RuntimeException(fieldName + " field not found"));
    }
}
