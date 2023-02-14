package com.atguigu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.service.HelloService;


/**
 * @author: 杨鑫
 * @date: 2023/2/5
 * @desc:
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
