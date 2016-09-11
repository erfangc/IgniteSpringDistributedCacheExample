package com.example;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by erfangchen on 9/11/16.
 */
@Service
public class TestService {
    @Cacheable("testCache")
    public String get(String name) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new IllegalStateException();
        }
        return "Hello " + name;
    }
}
