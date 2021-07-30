package com.zj.study.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/6/30 11:09
 * @Description:
 */
@RestController
public class HelloController {


    @ApiOperation("hello方法")
    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
    }


}
