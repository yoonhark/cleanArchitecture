package com.harkhark

import com.android.build.gradle.LibraryExtension
import com.harkhark.configure.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {

            with(pluginManager) {
                apply("tmapauto.android.library")
                apply("tmapauto.android.hilt")
                apply("androidx.navigation.safeargs.kotlin")
            }

            extensions.configure<LibraryExtension> {
                buildFeatures {
                    dataBinding = true
                }
            }

            dependencies {
                add("implementation", project(":core:ui"))
                add("implementation", project(":core:common"))
                add("implementation", project(":core:domain"))
                add("implementation", project(":core:designsystem"))

                add("testImplementation", libs.findLibrary("junit").get())
            }
        }
    }
}