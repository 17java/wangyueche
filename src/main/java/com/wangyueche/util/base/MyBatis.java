package com.wangyueche.util.base;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
 * MyBatis注解类，方便 {@link org.mybatis.spring.mapper.MapperScannerConfigurer}的扫描
 * 
 * @author wujing
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MyBatis {
}
