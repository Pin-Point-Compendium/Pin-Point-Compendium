package com.drullar.pinpointcompendium.persistence.model

import jakarta.persistence.*

@Entity(name = "trip")
class Trip(
    @Id
    @Column(name = "trip_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
    // TODO Finish
    
)