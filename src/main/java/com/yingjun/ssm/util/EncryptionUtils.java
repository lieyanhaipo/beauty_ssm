package com.yingjun.ssm.util;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @author libing
 * @desc shiro加密算法
 * @date 2017/12/19 14:54
 */
public class EncryptionUtils {
    public static final String encrypt(String credentials){
        String hashAlgorithmName = "MD5";  //加密方式
        int hashIterations = 1024;  //加密次数
        Object obj = new SimpleHash(hashAlgorithmName, credentials, null, hashIterations);
        return obj.toString();
    }
}
