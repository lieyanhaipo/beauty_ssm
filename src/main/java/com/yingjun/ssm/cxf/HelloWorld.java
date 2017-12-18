package com.yingjun.ssm.cxf;

import javax.jws.WebService;

/**
 * @author libing
 * @desc
 * @date 2017/12/18 17:41
 */
@WebService
public interface HelloWorld {
    String say(String str);
}
