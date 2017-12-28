package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.SysRolePermission;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolePermissionMapper {
    long countByExample(SysRolePermission example);

    int deleteByExample(SysRolePermission example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    List<SysRolePermission> selectByExample(SysRolePermission example);

    SysRolePermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRolePermission record, @Param("example") SysRolePermission example);

    int updateByExample(@Param("record") SysRolePermission record, @Param("example") SysRolePermission example);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);
}