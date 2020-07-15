package com.funzuqiu.ffu.home.common.config;

import com.funzuqiu.ffu.home.common.persistence.Pager;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyProperties.class)
public class MyConfig {

    public MyConfig(MyProperties properties) {
        Pager.DEFAULT_PAGE_SIZE = properties.getPageSize();
    }

}
