plugins {
    kotlin("multiplatform") version "1.5.10"
    id("org.jetbrains.compose") version "0.5.0-build222"
}

group = "com.ikanoshiokara"
version = "1.0.0"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    maven("https://dl.bintray.com/korlibs/korlibs")
}


kotlin {
    js(IR) {
        browser {
            webpackTask {
                outputFileName = "main.js"
                cssSupport.enabled = true
            }
            runTask {
                outputFileName = "main.js"
                cssSupport.enabled = true
            }
        }
        binaries.executable()
    }

    sourceSets {
        val decomposeVersion = "0.2.6"

        named("jsMain") {
            dependencies {
                implementation(compose.web.core)
                implementation(compose.runtime)


            }
        }

        commonMain{
            dependencies{
                //Decompose
                implementation("com.arkivanov.decompose:decompose:${decomposeVersion}")
                //implementation("com.arkivanov.decompose:extensions-compose-jetbrains:${decomposeVersion}")
            }
        }
    }
}