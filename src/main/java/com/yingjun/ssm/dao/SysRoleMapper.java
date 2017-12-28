package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.SysRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper {
    long countByExample(SysRole example);

    int deleteByExample(SysRole example);

    int deleteByPrimaryKey(Integer sysRoleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRole example);

    SysRole selectByPrimaryKey(Integer sysRoleId);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRole example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRole example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}