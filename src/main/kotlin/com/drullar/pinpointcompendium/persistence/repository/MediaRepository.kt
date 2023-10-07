package com.drullar.pinpointcompendium.persistence.repository

import com.drullar.pinpointcompendium.persistence.model.Media
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MediaRepository : CrudRepository<Media, Long>