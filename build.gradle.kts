plugins {
    kotlin("multiplatform") version "1.5.10"
    id("org.jetbrains.compose") version "0.5.0-build222"
}

group = "com.ikanoshiokara"
version = "1.0.0"

repositories {
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
        val jsMain by getting {
            dependencies {
                implementation(compose.web.core)
                implementation(compose.runtime)
            }
        }
        commonMain {
            dependencies {
                val klockVersion = "2.0.7"
                implementation("com.soywiz.korlibs.klock:klock:$klockVersion")
            }
        }
    }
}