package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.SysPermission;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPermissionMapper {
    long countByExample(SysPermission example);

    int deleteByExample(SysPermission example);

    int deleteByPrimaryKey(Integer sysPermissionId);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    List<SysPermission> selectByExample(SysPermission example);

    SysPermission selectByPrimaryKey(Integer sysPermissionId);

    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermission example);

    int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermission example);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
}