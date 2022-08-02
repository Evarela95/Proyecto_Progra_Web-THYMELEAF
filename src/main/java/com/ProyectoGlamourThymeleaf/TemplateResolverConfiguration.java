package com.ProyectoGlamourThymeleaf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
public class TemplateResolverConfiguration {

    @Bean
    public SpringResourceTemplateResolver TemplateResolver_0() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setPrefix("classpath:/templates");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCharacterEncoding("UTF-8");
        templateResolver.setOrder(0);
        templateResolver.setCheckExistence(true);

        return templateResolver;
    }

    @Bean
    public SpringResourceTemplateResolver TemplateResolver_1() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setPrefix("templates/Inicio");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCharacterEncoding("UTF-8");
        templateResolver.setOrder(1);
        templateResolver.setCheckExistence(true);

        return templateResolver;
    }

    @Bean
    public SpringResourceTemplateResolver TemplateResolver_2() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setPrefix("templates/Inicio");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCharacterEncoding("UTF-8");
        templateResolver.setOrder(2);
        templateResolver.setCheckExistence(true);

        return templateResolver;
    }

    @Bean
    public SpringResourceTemplateResolver TemplateResolver_3() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setPrefix("templates/Registrarse");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCharacterEncoding("UTF-8");
        templateResolver.setOrder(3);
        templateResolver.setCheckExistence(true);

        return templateResolver;
    }

}
