package com.fh.project.imports;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportSelector.class)
public @interface EnableMyImportSelector {
}
