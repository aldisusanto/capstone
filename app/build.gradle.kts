plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.next.up.code.capstone"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.next.up.code.capstone"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        viewBinding = true
    }
    dynamicFeatures += setOf(":favorite")
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation(project(mapOf("path" to ":core")))

    /* Scable */
    implementation("com.intuit.sdp:sdp-android:1.1.0")
    implementation("com.intuit.ssp:ssp-android:1.1.0")

    /* rx java */
    implementation("com.jakewharton.rxbinding2:rxbinding:2.0.0")

    /* Web implementation */
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.1")

    /* Koin */
    implementation("io.insert-koin:koin-android-compat:3.4.3")

    /* Lifecycle */
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")

    /* Retrofit + rxJava */
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.9.0")

    /* Helper */
    implementation("com.github.TistoW:MyHelper:1.1.26")
// Picasso
    implementation("com.squareup.picasso:picasso:2.71828")

    /* Room */
    implementation("androidx.room:room-runtime:2.5.2")
    implementation("androidx.room:room-ktx:2.5.2")
    kapt("androidx.room:room-compiler:2.5.2")

    implementation("com.google.android.gms:play-services-maps:18.1.0")

    /* Fused Location Provider */
    implementation("com.google.android.gms:play-services-location:21.0.1")

    /* Android YouTube Player */
    implementation("com.pierfrancescosoffritti.androidyoutubeplayer:core:12.1.0")

}