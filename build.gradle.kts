import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    id("org.openjfx.javafxplugin") version "0.0.9"
}
group = "com.github.doertscho"
version = "1.0-SNAPSHOT"

javafx {
    modules("javafx.controls", "javafx.graphics")
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://plugins.gradle.org/m2/")
    }
}

dependencies {
    testImplementation(kotlin("test-junit"))
    implementation("no.tornado", "tornadofx", "1.7.20")
    runtimeOnly("org.openjfx", "javafx-plugin", "0.0.9")
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}