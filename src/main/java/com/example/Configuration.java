package com.example;

import org.apache.ignite.cache.spring.SpringCacheManager;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;

/**
 * Created by erfangchen on 9/11/16.
 */
@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public CacheManager cacheManager() {
        SpringCacheManager cacheManager = new SpringCacheManager();
        cacheManager.setConfigurationPath("example-cache.xml");
        return cacheManager;
    }
}
