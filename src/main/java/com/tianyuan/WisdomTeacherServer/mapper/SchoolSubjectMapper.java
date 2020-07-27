package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolSubject;

public interface SchoolSubjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolSubject record);

    int insertSelective(SchoolSubject record);

    SchoolSubject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolSubject record);

    int updateByPrimaryKey(SchoolSubject record);
}