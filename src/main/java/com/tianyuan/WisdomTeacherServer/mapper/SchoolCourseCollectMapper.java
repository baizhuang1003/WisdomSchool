package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolCourseCollect;

public interface SchoolCourseCollectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolCourseCollect record);

    int insertSelective(SchoolCourseCollect record);

    SchoolCourseCollect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolCourseCollect record);

    int updateByPrimaryKey(SchoolCourseCollect record);
}