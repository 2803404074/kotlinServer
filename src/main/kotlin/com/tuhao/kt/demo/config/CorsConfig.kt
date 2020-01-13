package com.tuhao.kt.demo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import org.springframework.web.filter.CorsFilter

@Configuration
class CorsConfig {

    @Bean
    fun conrsFilter():CorsFilter{
        val source = UrlBasedCorsConfigurationSource()
        source.registerCorsConfiguration("/**", buildConfig())
        return CorsFilter(source)
    }

    private fun buildConfig(): CorsConfiguration {
        val corsConfiguration = CorsConfiguration()
        // 1允许任何域名使用
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.allowCredentials = true

        // 2允许任何头
        corsConfiguration.addAllowedHeader("*");
        // 3允许任何方法（post、get等）
        corsConfiguration.addAllowedMethod("*");

        return corsConfiguration
    }
}