package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.SysUserRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserRoleMapper {
    long countByExample(SysUserRole example);

    int deleteByExample(SysUserRole example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    List<SysUserRole> selectByExample(SysUserRole example);

    SysUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysUserRole record, @Param("example") SysUserRole example);

    int updateByExample(@Param("record") SysUserRole record, @Param("example") SysUserRole example);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}