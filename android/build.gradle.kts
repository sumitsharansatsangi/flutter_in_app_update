group = "de.ffuf.in_app_update"
version = "1.0-SNAPSHOT"

plugins {
    id("com.android.library")
}

repositories {
    google()
    mavenCentral()
}

android {
    namespace = "de.ffuf.in_app_update"

    compileSdk = 37

    defaultConfig {
        minSdk = 24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    kotlin {
        jvmToolchain(21)
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
        }
        getByName("test") {
            java.srcDir("src/test/kotlin")
        }
    }

    lint {
        disable += "InvalidPackage"
    }
}

dependencies {
    implementation("com.google.android.play:app-update-ktx:2.1.0")
}