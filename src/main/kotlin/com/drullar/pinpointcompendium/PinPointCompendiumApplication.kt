package com.drullar.pinpointcompendium

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class PinPointCompendiumApplication

fun main(args: Array<String>) {
    runApplication<PinPointCompendiumApplication>(*args)
}
