package com.drullar.pinpointcompendium.persistence.model

import jakarta.persistence.*
import java.sql.Timestamp


/**
 * [name] - Primary Key for the table and display name of the album
 * [media] - References to the media inside the album
 */
@Entity(name = "album")
class Album(
    @Id
    @Column(nullable = false)
    val name: String? = null,

    @Column(nullable = false)
    val visibility: Visibility = Visibility.PUBLIC,

    @OneToMany
    val media: MutableList<Media> = mutableListOf(),
)