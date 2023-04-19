package org.runestar.client.updater.mapper

import com.fasterxml.jackson.annotation.PropertyAccessor
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.runestar.client.updater.mapper.abstractclasses.Mapper
import org.runestar.client.updater.mapper.identifiers.classes.Client
import java.nio.file.Path
import java.nio.file.Paths

private val jsonMapper = jacksonObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL)
        .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
        .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)

val DEOB_OUTPUT_JAR_PATH = Paths.get(System.getProperty("user.dir"), "gamepack", "deob_gamepack.jar")
private val namesJson: Path get() = Paths.get(System.getProperty("user.dir"), "gamepack", "names.json")
fun main(args: Array<String>) {
    val ctx = Mapper.Context()
    val clientClass = Client::class.java
    JarMapper(clientClass.`package`.name, clientClass.classLoader).map(DEOB_OUTPUT_JAR_PATH, ctx)
//        val idClasses = if (project.properties.getProperty("runestar.placeholderhooks") == "true") {
//            ctx.buildIdHierarchyAll()
//        } else {
    val idClasses = ctx.buildIdHierarchy()
//        }
    jsonMapper.writeValue(namesJson.toFile(), idClasses)
}