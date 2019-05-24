package com.fh.project.config;

import com.fh.project.imports.EnableMyImportSelector;
import com.fh.project.imports.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.fh.project")
@EnableMyImportSelector
//@Import(MyImportSelector.class)
//@EnableAspectJAutoProxy
public class AppConfig {

}
