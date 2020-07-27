package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolCourseHits;

public interface SchoolCourseHitsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolCourseHits record);

    int insertSelective(SchoolCourseHits record);

    SchoolCourseHits selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolCourseHits record);

    int updateByPrimaryKey(SchoolCourseHits record);
}