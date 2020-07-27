package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.CourseNum;

public interface CourseNumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseNum record);

    int insertSelective(CourseNum record);

    CourseNum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseNum record);

    int updateByPrimaryKey(CourseNum record);
}