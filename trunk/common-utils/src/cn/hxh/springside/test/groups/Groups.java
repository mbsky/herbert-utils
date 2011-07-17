/**
 * Copyright (c) 2005-2011 springside.org.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * 
 * $Id: Groups.java 1547 2011-05-05 14:43:07Z calvinxiu $
 */
package cn.hxh.springside.test.groups;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 模拟TestNG Groups分组执行用例功能的annotation.
 * 
 * @author freeman
 * @author calvin
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE })
@Documented
public @interface Groups {
	/**
	 * 执行所有组别的测试.
	 */
	String ALL = "all";

	/**
	 * 组别定义,默认为ALL.
	 */
	String value() default ALL;
}
