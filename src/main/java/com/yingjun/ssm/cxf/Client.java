package com.yingjun.ssm.cxf;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @author libing
 * @desc webservice客户端
 * @date 2017/12/19 9:47
 */
public class Client {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(HelloWorld.class);
        factoryBean.setAddress("http://localhost:8080/beauty_ssm/webservice/helloWorld?wsdl");

        HelloWorld helloWorld = (HelloWorld) factoryBean.create();
        String result = helloWorld.say("libing");
        System.out.println(result);
    }
}
