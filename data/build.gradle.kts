plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt.plugin)
}

android {
    namespace = "com.gillhad.data"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures{
        buildConfig = true
    }

}
kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation(project(":domain"))
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.google.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)

    implementation(libs.okhttp.logging)
    implementation(libs.retrofit)
    implementation(libs.retrofit.serialization)
    implementation(libs.serialization.json)
    implementation(libs.bundles.hilt)
    ksp(libs.hilt.compiler)
}