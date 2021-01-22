package app.imeexp.buildsrc

object Versions {
    const val ktlint = "0.39.0"
}

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.0-alpha04"
    const val junit = "junit:junit:4.13.1"
    const val timber = "com.jakewharton.timber:timber:4.7.1"
    const val threeTenBp = "org.threeten:threetenbp:1.5.0"
    const val toasty = "com.github.GrenderG:Toasty:1.5.0"
    const val circleImageView = "com.mikhaellopez:circularimageview:4.2.0"
    const val numberKeypad = "com.github.davidmigloz:number-keyboard:3.0.0"
    const val numericKeypad = "com.konaire.numeric-keyboard:numeric-keyboard:1.1.0"
    const val badgeImageView = "com.nex3z:notification-badge:1.0.4"
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:2.6"


    object EitherNet {
        private const val version = "0.2.0"
        const val eitherNet = "com.slack.eithernet:eithernet:$version"
    }

    object Assent {
        private const val version = "3.0.0-RC4"
        const val core = "com.afollestad.assent:core:$version"
        const val coroutines = "com.afollestad.assent:coroutines:$version"
    }

    object Firebase {
        private const val version = "26.3.0"
        const val bom = "com.google.firebase:firebase-bom:$version"
        const val analytics = "com.google.firebase:firebase-analytics-ktx"
        const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx"

        object Gradle {
            const val googleServices = "com.google.gms:google-services:4.3.4"
            const val crashlytics = "com.google.firebase:firebase-crashlytics-gradle:2.4.1"
        }
    }

    object Scarlet {
        private const val version = "0.1.11"
        const val scarlet = "com.tinder.scarlet:scarlet:$version"
        const val websocketOkttp = "com.tinder.scarlet:websocket-okhttp:$version"
        const val messageAdapterMoshi = "com.tinder.scarlet:message-adapter-moshi:$version"
        const val streamAdapterCoroutines = "com.tinder.scarlet:stream-adapter-coroutines:$version"
        const val lifecycleAndroid = "com.tinder.scarlet:lifecycle-android:$version"
    }

    object Kotlin {
        private const val version = "1.4.21"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object Coroutines {
        private const val version = "1.4.1"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object Lottie {
        private const val version = "3.5.0"
        const val library = "com.airbnb.android:lottie:$version"

        object Compose {
            private const val version = "1.0.0-alpha03"
            const val lottieCompose = "com.airbnb.android:lottie-compose:$version"
        }
    }

    object ExoPlayer {
        private const val version = "2.12.2"
        const val core = "com.google.android.exoplayer:exoplayer-core:$version"
        const val dash = "com.google.android.exoplayer:exoplayer-dash:$version"
        const val ui = "com.google.android.exoplayer:exoplayer-ui:$version"
        const val hls = "com.google.android.exoplayer:exoplayer-hls:$version"
        const val smoothStreaming =
            "com.google.android.exoplayer:exoplayer-smoothstreaming:$version"
    }

    object Media2 {
        private const val version = "1.1.0"

        // Interacting with MediaSessions
        const val session = "androidx.media2:media2-session:$version"

        // optional - UI widgets for VideoView and MediaControlView
        const val widget = "androidx.media2:media2-widget:$version"

        // optional - Implementation of a SessionPlayer
        const val sessionPlayer = "androidx.media2:media2-player:$version"

    }

    object Store4 {
        private const val version = "4.0.0"
        const val library = "com.dropbox.mobile.store:store4:$version"
    }

    object Mdc {
        const val material = "com.google.android.material:material:1.1.0-alpha06"
        const val composeThemeAdapter =
            "com.google.android.material:compose-theme-adapter:1.0.0-alpha09"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.3.0-alpha02"
        const val browser = "androidx.browser:browser:1.0.0"
        const val collection = "androidx.collection:collection-ktx:1.1.0"
        const val palette = "androidx.palette:palette:1.0.0"
        const val recyclerview = "androidx.recyclerview:recyclerview:1.2.0-beta01"
        const val emoji = "androidx.emoji:emoji:1.1.0"
        const val swiperefresh = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"

        object Navigation {
            private const val version = "2.3.2"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
            const val ui = "androidx.navigation:navigation-ui-ktx:$version"
            const val safeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:$version"
        }

        object Fragment {
            private const val version = "1.3.0-alpha07"
            const val fragment = "androidx.fragment:fragment:$version"
            const val fragmentKtx = "androidx.fragment:fragment-ktx:$version"
        }

        object Test {
            private const val version = "1.3.0"
            const val core = "androidx.test:core:$version"
            const val rules = "androidx.test:rules:$version"
            const val runner = "androidx.test:runner:$version"

            object Ext {
                private const val version = "1.1.2"
                const val junit = "androidx.test.ext:junit-ktx:$version"
            }

            const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
        }

        const val archCoreTesting = "androidx.arch.core:core-testing:2.1.0"

        object DataStore {
            private const val version = "1.0.0-alpha05"
            const val preferences = "androidx.datastore:datastore-preferences:$version"
            const val core = "androidx.datastore:datastore-core:$version"
        }

        object Paging {
            private const val version = "3.0.0-alpha12"
            const val common = "androidx.paging:paging-common-ktx:$version"
            const val runtime = "androidx.paging:paging-runtime-ktx:$version"
        }

        const val preference = "androidx.preference:preference:1.1.1"

        const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.2"

        const val coreKtx = "androidx.core:core-ktx:1.5.0-alpha04"

        object Lifecycle {
            private const val version = "2.3.0-beta01"
            const val extensions = "androidx.lifecycle:lifecycle-extensions:$version"
            const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val process = "androidx.lifecycle:lifecycle-process:$version"
        }

        object Room {
            private const val version = "2.3.0-alpha03"
            const val common = "androidx.room:room-common:$version"
            const val runtime = "androidx.room:room-runtime:$version"
            const val compiler = "androidx.room:room-compiler:$version"
            const val ktx = "androidx.room:room-ktx:$version"
            const val testing = "androidx.room:room-testing:$version"
        }

        object Work {
            private const val version = "2.5.0-beta02"
            const val runtimeKtx = "androidx.work:work-runtime-ktx:$version"
        }

        object Compose {
            const val snapshot = "7094152"
            const val version = "1.0.0-SNAPSHOT"

            @get:JvmStatic
            val snapshotUrl: String
                get() = "https://androidx.dev/snapshots/builds/$snapshot/artifacts/repository/"

            const val compiler = "androidx.compose.compiler:compiler:$version"

            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val livedata = "androidx.compose.runtime:runtime-livedata:$version"

            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"

            const val material = "androidx.compose.material:material:$version"

            const val animation = "androidx.compose.animation:animation:$version"

            object Ui {
                const val ui = "androidx.compose.ui:ui:$version"
                const val tooling = "androidx.compose.ui:ui-tooling:$version"
                const val util = "androidx.compose.ui:ui-util:$version"
                const val test = "androidx.compose.ui:ui-test-junit4:${version}"
            }

            object Navigation {
                private const val version = "1.0.0-alpha04"
                const val navCompose = "androidx.navigation:navigation-compose:$version"
            }

            object Paging {
                private const val version = "1.0.0-alpha04"
                const val composePaging = "androidx.paging:paging-compose:$version"
            }
        }

        object Hilt {
            private const val version = "1.0.0-alpha02"
            const val work = "androidx.hilt:hilt-work:$version"
            const val common = "androidx.hilt:hilt-common:$version"
            const val viewmodel = "androidx.hilt:hilt-lifecycle-viewmodel:$version"
            const val compiler = "androidx.hilt:hilt-compiler:$version"
        }
    }

    object Hilt {
        private const val version = "2.29.1-alpha"
        const val android = "com.google.dagger:hilt-android:$version"
        const val core = "com.google.dagger:hilt-core:$version"
        const val compiler = "com.google.dagger:hilt-compiler:$version"
        const val testing = "com.google.dagger:hilt-android-testing:$version"
        const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
    }

    object Retrofit {
        private const val version = "2.9.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:$version"
        const val converterMoshi = "com.squareup.retrofit2:converter-moshi:$version"
    }

    object OkHttp {
        private const val version = "4.9.0"
        const val okhttp = "com.squareup.okhttp3:okhttp:$version"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    object Coil {
        private const val version = "1.0.0"
        const val coil = "io.coil-kt:coil:$version"
    }

    object Accompanist {
        private const val version = "0.4.3.compose-7094152-SNAPSHOT"
        const val coil = "dev.chrisbanes.accompanist:accompanist-coil:$version"
        const val glide = "dev.chrisbanes.accompanist:accompanist-glide:$version"
        const val insets = "dev.chrisbanes.accompanist:accompanist-insets:$version"
    }

    object Koin {
        private const val version = "2.2.1"
        val core = "org.koin:koin-core:$version"
        val test = "org.koin:koin-test:$version"
        val gradlePlugin = "org.koin:koin-gradle-plugin:$version"

        object Android {
            val koinAndroid = "org.koin:koin-android:$version"
            val viewModel = "org.koin:koin-androidx-viewmodel:$version"
            val compose = "org.koin:koin-androidx-compose:$version"
            val fragment = "org.koin:koin-androidx-fragment:$version"
            val ext = "org.koin:koin-androidx-ext:$version"
            val workmanager = "org.koin:koin-androidx-workmanager:$version"
        }
    }

    object DataStore {
        private const val version = "1.0.0-alpha04"
        const val preferences = "androidx.datastore:datastore-preferences:$version"
        const val preferencesCore = "androidx.datastore:datastore-preferences-core:$version"
        const val datastore = "androidx.datastore:datastore:$version"
        const val datastoreCore = "androidx.datastore:datastore-core:$version"
    }

    object ProtoBuf {
        private const val version = "3.10.0"
        const val javalite = "com.google.protobuf:protobuf-javalite:$version"
        const val artifact = "com.google.protobuf:protoc:$version"
    }

    object Insetter {
        private const val version = "0.4.0"
        const val insetter = "dev.chrisbanes.insetter:insetter:$version"
        const val insetterDbx = "dev.chrisbanes.insetter:insetter-dbx:$version"
        const val insetterWidgets = "dev.chrisbanes.insetter:insetter-widgets:$version"
    }

    object Moshi {
        private const val version = "1.11.0"
        const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:$version"
    }
}