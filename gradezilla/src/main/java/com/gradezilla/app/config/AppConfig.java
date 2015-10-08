package com.gradezilla.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@PropertySource(value = {"classpath:application.properties"})
@ComponentScan("com.gradezilla")
@Import({ SecurityConfig.class, PersistenceConfig.class })
public class AppConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private Environment env;

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}