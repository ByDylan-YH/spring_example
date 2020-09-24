package com.bilibili.k_aspect.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:切面类确定通知,需要实现接口规范,一般采用环绕通知
 */
@Component
@Aspect
class MyAspect {
    //    私有化注解
//    @Before("execution(* bilibili.k_aspect.annotation.UserServiceImpl.*(..))")
    void myBefore(JoinPoint joinPoint) {
        System.out.println("before: " + joinPoint.getSignature().getName());
    }

    //    可以声明公共的切入点
    @Pointcut("execution(* com.bilibili.k_aspect.annotation.service.impl.UserServiceImpl.*(..))")
    private void myPointcut() {
    }

    //    @AfterReturning(value = "myPointcut()", returning = "ret")
    void myAafterReturning(JoinPoint joinPoint, Object ret) {
        System.out.println("after: " + joinPoint.getSignature().getName() + " : " + ret);
    }

    //    1个参数value可以省略,1个值大括号可以省略
//    @Around("myPointcut()")
    Object myAround(ProceedingJoinPoint joinPoint) {
        System.out.println("around before: ");
        Object proceed = null;
        try {
            // 手动执行目标方法
            proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around after: ");
        return proceed;
    }

    //    @AfterThrowing(value = "myPointcut()", throwing = "e")
    void MyAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("Exception: " + e.getMessage());
    }

    @After("myPointcut()")
    void myAfter(JoinPoint joinPoint) {
        System.out.println("最终通知");
    }
}
