android {
    

    buildFeatures {
        // Включает детерминированную сборку (AGP 7.0+)
        // Тогда порядок файлов и метаданные будут фиксированными
    }

    // Чтобы сборка была предсказуемой
    android.buildFeatures.deterministicBuild = true

    
    signingConfigs {
        create("release") {
            
        }
    }

    // Отключаем сжатие ресурсов
    isMinifyEnabled = false
    isShrinkResources = false
}