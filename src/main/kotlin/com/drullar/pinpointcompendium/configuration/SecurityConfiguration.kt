package com.drullar.pinpointcompendium.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder


@Configuration
@EnableWebSecurity
class SecurityConfiguration {

    @Bean
    fun userDetailsService(){
        val admin: UserDetails = User.withUsername("admin")
            .password(passwordEncoder().encode("adminPass"))
            .roles("ADMIN")
            .build()
    }

    @Bean
    fun passwordEncoder() = BCryptPasswordEncoder()
}

enum class DEFAULT_ROLES(name: String) {
    READ_ONLY("RO"),
    ADMIN("ADMIN"),
    READ_WRITE("RW"),
    GUEST("GUEST")
}