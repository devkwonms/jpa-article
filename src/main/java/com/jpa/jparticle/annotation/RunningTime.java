package com.jpa.jparticle.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD}) // 어노테이션 적용대상 지정하기
@Retention(RetentionPolicy.RUNTIME) // 어노테이션 유지 기간
public @interface RunningTime {
}
