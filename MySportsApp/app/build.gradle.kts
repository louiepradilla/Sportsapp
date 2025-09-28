plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.mysportsapp"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.mysportsapp"
        minSdk = 24
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
implementation(libs.androidx.navigation.fragment)
    implementation(libs.androidx.mediarouter)
    // build.gradle.kts (app)

    dependencies {
        // These must be present and correctly spelled:
        implementation(platform("androidx.navigation:navigation-bom:2.7.5"))
        implementation("androidx.navigation:navigation-fragment-ktx")
        implementation("androidx.navigation:navigation-ui-ktx")

        // You also need Material for the BottomNavigationView
        implementation("com.google.android.material:material:1.11.0")

        // ... rest of your dependencies
    }
}