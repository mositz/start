package com.dubbo.consumer.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.ReflectionUtils;
import scala.collection.Seq;

import java.io.IOException;
import java.util.stream.Stream;

/**
 * Created by zhangxingxing on 2016/12/6.
 */
public class ConsumerTest {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]
                {"classpath*:dubbo-demo-consumer.xml"});
        context.start();

        TestAction testAction = (TestAction) context.getBean("testAction");

        Listener listener =(Listener) context.getBean("context");

        listener.befor();

        testAction.say();

        listener.after();

        System.in.read();
    }
}
