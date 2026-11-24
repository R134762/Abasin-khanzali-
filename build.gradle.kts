plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.abasin.marketradar"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.abasin.marketradar"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }
}
