package com.eac.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.eac")
@ComponentScan(basePackages = {"com.eac.proxy","com.eac.service", "com.eac.repository"})
public class ProjectConfig {



}
