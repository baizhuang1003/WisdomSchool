package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.TeacherNexus;

public interface TeacherNexusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacherNexus record);

    int insertSelective(TeacherNexus record);

    TeacherNexus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeacherNexus record);

    int updateByPrimaryKey(TeacherNexus record);
}