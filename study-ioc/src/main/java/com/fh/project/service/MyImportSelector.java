package com.fh.project.service;

import com.fh.project.dao.UserDao3;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{UserDao3.class.getName()};
	}
}
