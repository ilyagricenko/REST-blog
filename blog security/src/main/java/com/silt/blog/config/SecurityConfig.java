package com.silt.blog.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

public interface SecurityConfig {
    void configure(AuthenticationManagerBuilder auth) throws Exception;
}
