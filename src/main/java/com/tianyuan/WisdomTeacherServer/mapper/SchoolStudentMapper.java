package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolStudent;

import java.util.List;

public interface SchoolStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolStudent record);

    int insertSelective(SchoolStudent record);

    SchoolStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolStudent record);

    int updateByPrimaryKey(SchoolStudent record);

    List<SchoolStudent> findAll();

    Integer countItem();
}