package com.atguigu.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: 杨鑫
 * @date: 2023/2/5
 * @desc:
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @Reference
    private HelloService helloService;
    @GetMapping("/sayHello")
    public String sayHello(@RequestParam("name") String name){
        return helloService.sayHello(name);
    }
}
