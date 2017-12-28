package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.SysUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    long countByExample(SysUser example);

    int deleteByExample(SysUser example);

    int deleteByPrimaryKey(Integer sysUserId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUser example);

    SysUser selectByPrimaryKey(Integer sysUserId);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUser example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUser example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}