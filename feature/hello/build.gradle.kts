plugins {
    alias(libs.plugins.harkhark.android.feature)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.harkhark.feature.hello"
}

dependencies {
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
}