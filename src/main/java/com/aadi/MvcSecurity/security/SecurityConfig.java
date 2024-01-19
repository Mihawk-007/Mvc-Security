package com.aadi.MvcSecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    /**
     * The function define the User and their Roles which will be part of Application run time.
     *
     * @return
     */
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        final UserDetails john = User.builder()
                .username("john")
                .password("{noop}test1")
                .roles("EMPLOYEE")
                .build();

        final UserDetails mary = User.builder()
                .username("mary")
                .password("{noop}test12")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        final UserDetails susan = User.builder()
                .username("susan")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(john, mary, susan);
    }

}
