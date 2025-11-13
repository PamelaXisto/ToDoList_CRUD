package com.instituto.travessia.todolist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // desabilita o CSRF
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll()) // rotas totais são liberadas
                .headers(headers -> headers.frameOptions(frame -> frame.disable()));

        return http.build();
    }
}
