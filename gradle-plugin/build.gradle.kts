plugins {
    id("org.jetbrains.kotlin.jvm")
    id("dev.adamko.dokkatoo-html")
    id("java-gradle-plugin")
}

gradlePlugin {
    plugins.create("included.plugin") {
        id = "included.plugin"
        description = "foobar"
        implementationClass = "included.MyPlugin"
    }
}

dependencies {
    api(project(":annotations"))
}
