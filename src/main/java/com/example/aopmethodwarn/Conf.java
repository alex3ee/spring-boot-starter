package com.example.aopmethodwarn;

import com.example.aopmethodwarn.aop.DeprecatedLog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Conf {

    @Bean
    public DeprecatedLog deprecatedLog() {
        return new DeprecatedLog();
    }

}
