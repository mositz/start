package com.dubbo.provider.demo;


import com.dubbo.api.demo.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by zhangxingxing on 2016/12/5.
 */
@Service
public class TestActionImpl implements DemoService{

    @Override
    public void say() {
        System.err.println("aaaaaa");
    }
}
