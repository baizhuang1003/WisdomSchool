package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolRole;

public interface SchoolRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolRole record);

    int insertSelective(SchoolRole record);

    SchoolRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolRole record);

    int updateByPrimaryKey(SchoolRole record);
}