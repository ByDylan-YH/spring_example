package com.bilibili.g_annotation.component_scan;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author:BYDylan
 * Date:2020/5/8
 * Description:
 */
public class ComponentScanTest {
    @Test
    public void demo1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanBean1.class);
        for (String beanNmae : context.getBeanDefinitionNames()) {
            System.out.println(beanNmae + " -> " + context.getBean(beanNmae));
        }
    }

    @Test
    public void demo2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanBean2.class);
        for (String beanNmae : context.getBeanDefinitionNames()) {
            System.out.println(beanNmae + " -> " + context.getBean(beanNmae));
        }
    }
}
