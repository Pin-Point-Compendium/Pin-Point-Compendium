package com.drullar.pinpointcompendium.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/system")
class SystemController {

    @GetMapping
    fun getSystemPage() = "system"
}