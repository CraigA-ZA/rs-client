package mapper.identifiers.classes

import mapper.abstractclasses.IdentityMapper
import mapper.annotations.DependsOn
import mapper.predicateutilities.predicateOf
import mapper.wrappers.Class2
import mapper.wrappers.Method2

@DependsOn(AbstractFont::class)
class Font : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<AbstractFont>() }

    @DependsOn(AbstractFont.drawGlyph::class)
    class drawGlyph : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.mark == method<AbstractFont.drawGlyph>().mark }
    }

    @DependsOn(AbstractFont.drawGlyphAlpha::class)
    class drawGlyphAlpha : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.mark == method<AbstractFont.drawGlyphAlpha>().mark }
    }
}