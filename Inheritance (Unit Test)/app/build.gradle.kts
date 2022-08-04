/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.5/userguide/building_java_projects.html
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.6.21"

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:31.0.1-jre")

    // add Junit 5 (jupiter).
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")


}

application {
    // Define the main class for the application.
    mainClass.set("inheritance.unit.test.AppKt")
}

// Membuat tasks, dimana menjalankan test dan meng-exclude @Tag("integration-test")
tasks.named<Test>("test"){
    useJUnitPlatform(){
        // tags-nya boleh lebih dari satu cukup dipisahkan dengan tanda koma.
        excludeTags("integration-test")
    }
}

// Membuat tasks, dimana menjalankan test yang hanya dengan @Tag("integration-test")
tasks.register<Test>("integration-test", Test::class){
    useJUnitPlatform(){
        // tags-nya boleh lebih dari satu cukup dipisahkan dengan tanda koma.
        includeTags("integration-test")
    }
}
