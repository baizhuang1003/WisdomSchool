package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolCourse;

public interface SchoolCourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolCourse record);

    int insertSelective(SchoolCourse record);

    SchoolCourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolCourse record);

    int updateByPrimaryKey(SchoolCourse record);
}