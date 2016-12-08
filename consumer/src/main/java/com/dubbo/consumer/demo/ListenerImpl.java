package com.dubbo.consumer.demo;

/**
 * Created by zhangxingxing on 2016/12/6.
 */
public class ListenerImpl implements Listener{
    @Override
    public void befor() {
        System.err.println("start");
    }

    @Override
    public void after() {
        System.err.println("after");
    }
}
