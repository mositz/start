package com.dubbo.consumer.demo;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.demo.DemoService;

/**
 * Created by zhangxingxing on 2016/12/5.
 */
public class TestAction {

    private DemoService demoService;


    public void say(){
        demoService.say();
    }

    public DemoService getDemoService() {
        return demoService;
    }

    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }
}
