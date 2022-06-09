buildscript {
    val compose_version by extra { "1.2.0-beta03" }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("com.android.application") version "7.2.0" apply false
    id ("com.android.library") version "7.2.0" apply false
    id ("org.jetbrains.kotlin.android") version "1.6.21" apply false
}

tasks.register(name = "clean", type = Delete::class) {
    delete(rootProject.buildDir)
}