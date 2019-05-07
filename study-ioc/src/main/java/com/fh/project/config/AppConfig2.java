package com.fh.project.config;

import com.fh.project.service.EnableImport;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fh.project")
@EnableImport
public class AppConfig2 {

}
