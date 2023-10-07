package com.drullar.pinpointcompendium.persistence.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.io.File

@Configuration
class MediaPersistenceConfiguration {
    @Bean
    fun mediaStoragePath(@Value("\${ppc.filesystem.default.path}") pathAsString: String): File =
        File(pathAsString)

}