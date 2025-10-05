package com.hypermind.implantcard.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**") // Apply CORS to all endpoints
            .allowedOrigins(
                "http://localhost:3000", // React dev server
                "http://localhost:8080",
                "https://implantweb.vercel.app", //Production frontend,
                "https://implant.hyperminds.tech",
                "http://3.110.193.13:3000",       // EC2 backend URL (if needed)
                "http://13.234.19.42:3000",
                "http://13.234.19.42:8080"
            )
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed HTTP methods
            .allowedHeaders("*") // Allow all headers
            .allowCredentials(true) // Allow cookies/auth headers
    }
}
