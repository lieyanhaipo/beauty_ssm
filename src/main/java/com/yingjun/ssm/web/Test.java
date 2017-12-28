package com.yingjun.ssm.web;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @author libing
 * @desc
 * @date 2017/12/15 11:43
 */
public class Test {
    //MD5加密
    public static void main(String[] args) {
        String hashAlgorithmName = "MD5";
        String credentials = "123456";
        int hashIterations = 1024;
        Object obj = new SimpleHash(hashAlgorithmName, credentials, null, hashIterations);
        System.out.println("123456 md5 加密1024次："+obj);
    }
}
