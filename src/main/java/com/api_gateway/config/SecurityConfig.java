//
//
//package com.api_gateway.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
//        return http
//                .csrf(csrf -> csrf.disable()) // Desactiva CSRF
//                .authorizeExchange(exchanges -> exchanges
//                        .anyExchange().permitAll() // Permite todas las solicitudes
//           
