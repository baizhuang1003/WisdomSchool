package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.RoleLimits;

public interface RoleLimitsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleLimits record);

    int insertSelective(RoleLimits record);

    RoleLimits selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleLimits record);

    int updateByPrimaryKey(RoleLimits record);
}