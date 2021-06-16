rootProject.name = "compose-web-practice"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://dl.bintray.com/korlibs/korlibs")
    }
}
enableFeaturePreview("GRADLE_METADATA")