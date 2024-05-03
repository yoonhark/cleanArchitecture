package com.harkhark.cleanarchitecture.config

import com.harkhark.cleanarchitecture.BuildConfig
import com.harkhark.core.common.config.AppConfigProvider
import com.harkhark.core.common.config.ApplicationConfig
import javax.inject.Inject

class ApplicationConfigProvider @Inject constructor(): AppConfigProvider {
    override fun get(): ApplicationConfig = ApplicationConfig(
        buildType = BuildConfig.BUILD_TYPE,
        versionCode = BuildConfig.VERSION_CODE,
        versionName = BuildConfig.VERSION_NAME,
    )
}