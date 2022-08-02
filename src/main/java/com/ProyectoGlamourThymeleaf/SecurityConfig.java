package com.ProyectoGlamourThymeleaf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //Método para hacer autenticación de usuario
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}123")
                .roles("ADMIN", "CLIENTE")
                .and()
                .withUser("cliente")
                .password("{noop}123")
                .roles("CLIENTE");
    }

    //El siguiente método funciona para realizar la autorización de accesos    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/servicioNuevo", "/servicioGuardar",
                        "/servicioModificar/**", "/servicioEliminar/**")
                .hasRole("ADMIN")
                .antMatchers("/Servicios")
                .hasAnyRole("ADMIN", "CLIENTE")
                .antMatchers("/")
                .hasAnyRole("ADMIN", "CLIENTE")
                .and()
                .formLogin()
                .loginPage("/login")
                .and()
                .exceptionHandling().accessDeniedPage("/errores/403");
    }
}
