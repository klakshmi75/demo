package com.example.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.TestPropertySource;

@Configuration
@TestPropertySource(locations="classpath:test.properties")
public class TestConfig {

}
