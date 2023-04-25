package mapper.wrappers

interface ElementMatcher<out T> {
    fun match(jar: JarWrapper): T

    interface Class : ElementMatcher<ClassWrapper>
    interface Field : ElementMatcher<FieldWrapper>
    interface Method : ElementMatcher<MethodWrapper>
}