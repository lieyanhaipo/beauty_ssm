package com.yingjun.ssm.service.impl;

import com.yingjun.ssm.dao.SysUserMapper;
import com.yingjun.ssm.entity.SysUser;
import com.yingjun.ssm.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author libing
 * @desc
 * @date 2017/12/19 12:23
 */
@Transactional
@Service("SysUserService")
public class SysUserServiceImpl implements SysUserService {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SysUserMapper sysUserMapper;

    public void saveUser(SysUser sysUser) {
        sysUserMapper.insert(sysUser);
    }
}
