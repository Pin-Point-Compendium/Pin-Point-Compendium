package com.drullar.pinpointcompendium.persistence.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.sql.Timestamp

/**
 * [id] - Primary key of the table
 * [displayName] - Display Name of the media
 * [mediaType] - Type of the media, which can be one of the properties from [MediaType]
 * [path] - Path of the media. For [MediaType.LINK] is a URL string, for the rest it's the file system path to the media
 * [description] - (Optional): Description for the given media entry
 * [visibility] - [Visibility] restriction.
 * [date] - upload timestamp
 */
@Entity
class Media(
    @Id
    @Column(name = "media_id", nullable = false)
    val id: Long? = null,

    @Column(nullable = false, name = "name")
    val displayName: String? = null,

    @Column(name = "type", nullable = false)
    val mediaType: MediaType? = null,

    @Column(nullable = false, name = "system_path")
    val path: String? = null,

    @Column(nullable = true)
    val description: String? = null,

    @Column(nullable = false)
    val visibility: Visibility = Visibility.PUBLIC,

    @Column(nullable = true)
    val date: Timestamp? = null,

    @Column(name = "uploader", nullable = false)
    val uploadedBy: String? = null, //TODO Change to User once that Entity is completed

    @ManyToOne
    val album: Album? = null
)