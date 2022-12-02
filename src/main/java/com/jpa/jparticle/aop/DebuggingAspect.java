package com.jpa.jparticle.aop;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // AOP 클래스 선언(부가 기능을 주입하는 클래스)
@Component  // Ioc 컨테이너가 해당 객체를 생성 및 관리
@Slf4j
public class DebuggingAspect {

    // 대상 메소드 선택: CommentService.create()
    @Pointcut("execution(* com.jpa.jparticle.service.CommentService.create(..))")
    private void cut(){}

    // 실행 시점 설정 cut()의 대상이 수행되기 이전에 실행됨
    @Before("cut()")
    public void loggingArgs(JoinPoint joinPoint) {
        // 입력값 가져오기
        Object[] args = joinPoint.getArgs();
        // 클래스명
        String className = joinPoint.getTarget()
                .getClass()
                .getSimpleName();
        // 메소드명
        String methodName = joinPoint.getSignature()
                .getName();
        // 입력값 로깅하기
        for (Object obj : args) {   //  foreach(향상된for문)
            log.info("{}#{}의 입력값 => {}", className, methodName, obj);
        }
    }
}