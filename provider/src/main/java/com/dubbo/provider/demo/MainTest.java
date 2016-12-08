package com.dubbo.provider.demo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;

/**
 * Created by zhangxingxing on 2016/12/5.
 */
public class MainTest {

    public static void main(String[] args) throws IOException {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]
                            {"classpath*:dubbo-demo-annotation.xml"});
            context.start();
            System.in.read();
    }
}
