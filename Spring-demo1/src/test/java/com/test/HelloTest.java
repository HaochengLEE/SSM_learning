package com.test;

import com.demo.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lihaocheng
 * @create 2018-11-05 下午10:04
 **/

public class HelloTest {
    @Test
    public void hellotest() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        HelloSpring helloSpring=(HelloSpring) context.getBean("helloSpring");

        helloSpring.print();

    }


}
