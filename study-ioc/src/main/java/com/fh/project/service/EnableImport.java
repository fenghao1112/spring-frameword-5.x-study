package com.fh.project.service;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Import(MyImportSelector.class)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableImport {
}
