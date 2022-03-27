plugins {
    kotlin("jvm")
    id("org.jetbrains.kotlin.kapt")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation(libs.dagger2.di)
    annotationProcessor(libs.dagger2.compiler)
    kapt(libs.dagger2.compiler)
}
