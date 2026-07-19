// Подключение плагинов для Android и Kotlin
plugins {
    id("com.android.application")
    id("kotlin-android")
}

// Настройки для Android-модуля
android {
    // Уникальное имя пакета (должно совпадать с AndroidManifest.xml)
    namespace = "com.example.myapp"

    // Версия Android SDK, по которой компилируеться 
    compileSdk = 34

    defaultConfig {
        // Идентификатор приложения (то же, что и namespace)
        applicationId = "com.example.myapp"
        // Минимальная версия Android (Android 7.0+)
        minSdk = 24
        // Целевая версия Android (Android 14)
        targetSdk = 34
        // Внутренний номер версии (увеличивай при обновлении)
        versionCode = 1
        // Версия для пользователя (например, "1.0")
        versionName = "1.0"
    }

    
    buildFeatures {
        // Включает детерминированную сборку 
      //  deterministicBuild = true
    }

    // Типы сборки (debug и release)
    buildTypes {
        
        release {
            // Отключаем обфускацию и сжатие ресурсов 
            isMinifyEnabled = false
            isShrinkResources = false

        }
    }
}


dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
}