package com.bilibili.g_annotation.ioc;

import com.bilibili.g_annotation.ioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */

//测试注解写法
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:bilibili/g_annotation/ioc/ApplicationContext.xml")
public class TestIoc {
//    private UserServiceImpl uerServiceImpl;
//
//    @Autowired
//    @Qualifier("userService_ioc")
//    public void setUerServiceImpl(UserServiceImpl uerServiceImpl) {
//        this.uerServiceImpl = uerServiceImpl;
//    }

    public static void main(String[] args) {
        String xmlPath = "com/bilibili/g_annotation/ioc/ApplicationContext.xml";
//        方式一
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
//        方式二
////        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
        UserService userService = applicationContext.getBean("userService_ioc",UserService.class);
        userService.addUser();
//        TestIoc testIoc = new TestIoc();
//        testIoc.uerServiceImpl.addUser();
    }

//    @Test
//    public void demo() {
//        uerServiceImpl.addUser();
//    }
}
