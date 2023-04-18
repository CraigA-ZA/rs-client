package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Method2

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