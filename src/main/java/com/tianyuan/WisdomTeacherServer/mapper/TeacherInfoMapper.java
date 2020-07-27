package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.TeacherInfo;

public interface TeacherInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacherInfo record);

    int insertSelective(TeacherInfo record);

    TeacherInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeacherInfo record);

    int updateByPrimaryKey(TeacherInfo record);
}