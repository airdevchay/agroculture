
package dependencies

object Libraries
{
    object Kotlin {
        const val reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin_version}"
        const val coroutines =  "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine_version}"


        object Ktx {
            const val core = "androidx.core:core-ktx:${Versions.ktx_core}"
            const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
        }

    }

    object AndroidSDK {

        const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat_version}"

        const val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_version}"

        const val annotation = "androidx.annotation:annotation:${Versions.appcompat_version}"

        const val legecy = "androidx.legacy:legacy-support-v4:${Versions.legecy_version}"

        const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"

        const val navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}"

        const val navigation_ui_ktx =  "androidx.navigation:navigation-ui-ktx:${Versions.nav_version}"

        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment_version}"



    }

    object Google {
        const val material ="com.google.android.material:material:${Versions.material}"
    }

    object Testing {
        const val  junit_test = "junit:junit:4.+"
        const val  android_junit_test = "androidx.test.ext:junit:1.1.2"
        const val  espresso = "androidx.test.espresso:espresso-core:3.3.0"
        // Testing Navigation
        const val navigation_testing = "androidx.navigation:navigation-testing:${Versions.nav_version}"
        const val fragment_testing =  "androidx.fragment:fragment-testing:${Versions.fragment_version}"


    }

    object ClassPaths
    {
        const val  navigagtion_classpath = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.nav_version}"
        const val  android_tool_gradle_classpath = "com.android.tools.build:gradle:${Versions.atg_cpath_version}"
        const val  kotlin_gradle_classpath = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_version}"
        const val  google_services_classpath = "com.google.gms:google-services:${Versions.google_services}"

    }

 }

object Versions
{
    const val kotlin_version = "1.4.32"
    const val coroutine_version = "1.4.3"
    const val ktx_core = "1.3.2"
    const val appcompat_version = "1.2.0"
    const val constraint_version = "1.1.3"
    const val legecy_version = "1.0.0"
    const val lifecycle = "2.3.1"
    const val nav_version = "2.3.5"
    const val atg_cpath_version = "4.1.3"
    const val material = "1.3.0"
    const val fragment_version = "1.3.2"
    const val google_services = "4.3.5"


}