package com.Demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ABCD ABCD()
    {
        return new ABCD();
    }

    @Bean
    public XYZ XYZ()
    {
        return new XYZ();
    }
}
