package com.bilibili.g_annotation.component_scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

//排除 Service 注解的bean
@ComponentScan(value = "bilibili.g_annotation.component_scan", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class})
})
//只包含 Service 注解的bean
//@ComponentScan(value = "bilibili.g_annotation.component_scan", includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class})
//}, useDefaultFilters = false)
public class ScanBean2 {
}




