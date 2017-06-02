package com.dylan.micro.web.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liufengquan on 2017/6/2.
 */
@RestController
@RequestMapping("/test")
public class TestResource {

    @Value("${com.dylan.test}")
    private String testString;

    @RequestMapping("test_inject")
    public String testInject() {
        return testString;
    }
}
