package com.example.demo.Auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AuthConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(authorizationManagerRequestMatcherRegistry -> {
            authorizationManagerRequestMatcherRegistry.requestMatchers("/auth/registration").permitAll();
            authorizationManagerRequestMatcherRegistry.anyRequest().authenticated();
        });

        httpSecurity.httpBasic(Customizer.withDefaults());

        return httpSecurity
                .csrf().disable().build();
    }

}
