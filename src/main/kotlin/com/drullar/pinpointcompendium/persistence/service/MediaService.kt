package com.drullar.pinpointcompendium.persistence.service

import com.drullar.pinpointcompendium.persistence.model.Media
import com.drullar.pinpointcompendium.persistence.repository.MediaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.io.File

@Service
class MediaService(
    val mediaRepository: MediaRepository
) {

    @Autowired
    lateinit var absoluteStorage: File

    fun saveMedia(media: Media) {
        mediaRepository.save(media)
    }

    private fun storeMediaToFileSystem(media: Media) {
        val mediaFile = "${absoluteStorage.absolutePath}\\${media.album!!.name}\\${media.displayName}"
    }
}