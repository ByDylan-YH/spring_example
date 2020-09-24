package com.bilibili.k_aspect.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:切面类确定通知,需要实现接口规范,一般采用环绕通知
 */
class MyAspect {
    void myBefore(JoinPoint joinPoint) {
        System.out.println("before: " + joinPoint.getSignature().getName());
    }

    void myAafterReturning(JoinPoint joinPoint, Object ret) {
        System.out.println("after: " + joinPoint.getSignature().getName() + " : " + ret);
    }

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

    void MyAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("Exception: " + e.getMessage());
    }

    void myAfter(JoinPoint joinPoint){
        System.out.println("最终通知");
    }
}
