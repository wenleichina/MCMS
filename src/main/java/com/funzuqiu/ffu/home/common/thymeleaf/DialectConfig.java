package com.funzuqiu.ffu.home.common.thymeleaf;

import com.funzuqiu.ffu.home.common.thymeleaf.pager.PagerDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DialectConfig {

    @Bean
    public PagerDialect pagerDialect() {
        return new PagerDialect();
    }

}
