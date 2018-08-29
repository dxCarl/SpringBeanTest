package com.weimob.dx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dx
 * @date 2018/8/29
 */
public class AcPersonServiceTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("开始初始化容器");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("xml加载完毕");
        Person person1 = (Person) ac.getBean("person1");
        System.out.println(person1);
        System.out.println("关闭容器");
        ((ClassPathXmlApplicationContext)ac).close();

    }
}
