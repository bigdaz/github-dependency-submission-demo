buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        constraints {
            classpath("com.squareup.okio:okio:3.4.0")
        }
    }
}
plugins {
    alias(libs.plugins.versions)
}
