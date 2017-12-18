package com.yingjun.ssm.cxf.impl;

import com.yingjun.ssm.cxf.HelloWorld;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * @author libing
 * @desc
 * @date 2017/12/18 17:43
 */
@Component("helloWorld")
@WebService
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String say(String str) {
        return "Hello "+str;
    }
}
