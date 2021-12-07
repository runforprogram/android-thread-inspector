package wtf.s1.buildsrc

object Versions{
    const val applicationId = "wtf.s1.aaa"
    const val kotlin = "1.3.71"
    const val ktx = "1.0.0"
    const val coroutines = "1.3.2"
    const val gradlePlugin ="4.1.3"
    const val lifecycle = "2.2.0"
    const val compileSdkVersion = 29
    const val minSdkVersion = 21
    const val targetSdkVersion = 28
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Plugins{
    const val androidLib = "com.android.library"
}

object Deps{
    const val remoteThreadCore = "wtf.s1.pudge:thread-inspector-core:0.2.0"
    const val remoteThreadFlipper = "wtf.s1.pudge:thread-inspector-flipper:0.2.0"

    object Kotlin {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        const val coroutines =
                "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        const val coroutinesAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.1.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
        const val recyclerview = "androidx.recyclerview:recyclerview:1.1.0"
        const val extension = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        const val livedata = "androidx.lifecycle:lifecycle-livedata:${Versions.lifecycle}"
        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
        const val annotationx = "androidx.annotation:annotation:1.3.0"
        object Core {
            const val utils = "androidx.legacy:legacy-support-core-utils:1.0.0"
        }
    }

    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:2.0"

    const val flipper = "com.facebook.flipper:flipper:0.123.0"
    const val flipperNoOp = "com.facebook.flipper:flipper-noop:0.123.0"

    const val soloader = "com.facebook.soloader:soloader:0.9.0"

    const val epic = "com.github.tiann:epic:0.11.2"
    const val bhook = "com.bytedance:bytehook:1.0.3"
}

object ClassPaths {
    const val gradlePlugin = "com.android.tools.build:gradle:${Versions.gradlePlugin}"
    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val jfrogBintray = "com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4"
    const val dcendentsMavenPlugin = "com.github.dcendents:android-maven-gradle-plugin:2.1"
}